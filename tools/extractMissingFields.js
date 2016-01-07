//extract missing fileds & classes from the log, for example:
//cscript /Nologo extractMissingFields.js /log:"/r/proj/fs/aster/master/agi/agi-agent/log/agi.log"
function GetFileStream(sPath) {
	var oFso = new ActiveXObject("Scripting.FileSystemObject");
	return oFso.OpenTextFile(sPath, 1, false, -2);
}

function echo(s) {
	WScript.Echo(s);
}

function reportMissing(mapClassField) {
	for (var sClass in mapClassField) {
		echo("//"+sClass);
		for (var sField in mapClassField[sClass]) {
			if (!(/^(event)$/i).test(sField)) {
				echo("    private String    "+sField+";");
			}
		}
	}
}

function fillMissingEventClass(mapClassEvent, sClass, sBody) {
	mapClassEvent[sClass] = mapClassEvent[sClass]||{};
	var rgField = sBody.split(",");
	for (var ix in rgField) {
		var rg = rgField[ix].split("=");
		if (rg&&rg.length==2) {
			mapClassEvent[sClass][rg[0].replace(/(^\s+)|(\s+$)/, "")] = true;
		}
	}
}

function main(sLogPath) {
	var
			flLog = GetFileStream(sLogPath)
		, reField = (/Unable to set property '(\w+)' to '.*' on org.asteriskjava.manager.event.(\w+)/i)
		, reEvent = (/No event class registered for event type '(\w+)', attributes: {([^}]+)}/i)
		, mapClassField = {}
		, mapClassEvent = {}
	;//
	while(!flLog.AtEndOfStream) {
		var s = flLog.ReadLine();
		var rg = s&&s.match(reField);
		if (rg) {
			mapClassField[rg[2]] = mapClassField[rg[2]]||{};
			mapClassField[rg[2]][rg[1]] = true;
		} else {
			var rg = s&&s.match(reEvent);
			rg&&fillMissingEventClass(mapClassEvent, rg[1], rg[2]);
		}
	}
	reportMissing(mapClassField);
	reportMissing(mapClassEvent);
}

main(WScript.Arguments.Named.Item("log"));