//open Asterisk event documentation page, e.g. https://wiki.asterisk.org/wiki/display/AST/Asterisk+13+ManagerEvent_AttendedTransfer
//run the snipped in the web browser console
(function($) {
	var camelCase = function(sFieldName) {
		return sFieldName.charAt(0).toLowerCase()+sFieldName.substr(1);
	};
	var
			sFiledList = $(".panelContent pre").text()
		, rgFieldList = sFiledList&&sFiledList.split("\n")
		, reSkip = (/^(event)|(result)$/i)
		, rgRes = []
	;//var
	for (var ix in rgFieldList) {
		var sFieldName = rgFieldList[ix].split(":")[0];
		if (sFieldName&&(!reSkip.test(sFieldName))) {
			rgRes.push("    private String    "+camelCase(sFieldName)+";");
		}
	}
	console.log(rgRes.join("\r\n"));
})(window.jQuery);