/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.asteriskjava.manager.event;

/**
 *
 * @author tarasov
 */
public class LocalOptimizationBeginEvent extends ManagerEvent {

    private String    localonecontext;
    private String    localoneconnectedlinenum;
    private String    sourceuniqueid;
    private String    sourceconnectedlinenum;
    private String    localoneconnectedlinename;
    private String    destuniqueid;
    private String    sourcepriority;
    private String    localtwocalleridname;
    private String    localtwoconnectedlinenum;
    private String    localonechannelstatedesc;
    private String    id;
    private String    localonelinkedid;
    private String    localtwochannel;
    private String    localonechannelstate;
    private String    sourcecalleridnum;
    private String    sourcechannelstate;
    private String    sourcecontext;
    private String    localtwoconnectedlinename;
    private String    localtwouniqueid;
    private String    localtwolinkedid;
    private String    localonecalleridnum;
    private String    localonelanguage;
    private String    localonecalleridname;
    private String    sourceconnectedlinename;
    private String    localonepriority;
    private String    sourcechannelstatedesc;
    private String    localonechannel;
    private String    sourcecalleridname;
    private String    localtwocontext;
    private String    sourcelinkedid;
    private String    sourcelanguage;
    private String    localtwoexten;
    private String    localtwochannelstatedesc;
    private String    sourcechannel;
    private String    localtwopriority;
    private String    privilege;
    private String    localtwolanguage;
    private String    localtwocalleridnum;
    private String    localoneuniqueid;
    private String    localtwochannelstate;
    private String    sourceexten;

	
	public LocalOptimizationBeginEvent(Object source) {
		super(source);
	}

	/**
	 * @return the localonecontext
	 */
	public String getLocalonecontext() {
		return localonecontext;
	}

	/**
	 * @param localonecontext the localonecontext to set
	 */
	public void setLocalonecontext(String localonecontext) {
		this.localonecontext = localonecontext;
	}

	/**
	 * @return the localoneconnectedlinenum
	 */
	public String getLocaloneconnectedlinenum() {
		return localoneconnectedlinenum;
	}

	/**
	 * @param localoneconnectedlinenum the localoneconnectedlinenum to set
	 */
	public void setLocaloneconnectedlinenum(String localoneconnectedlinenum) {
		this.localoneconnectedlinenum = localoneconnectedlinenum;
	}

	/**
	 * @return the sourceuniqueid
	 */
	public String getSourceuniqueid() {
		return sourceuniqueid;
	}

	/**
	 * @param sourceuniqueid the sourceuniqueid to set
	 */
	public void setSourceuniqueid(String sourceuniqueid) {
		this.sourceuniqueid = sourceuniqueid;
	}

	/**
	 * @return the sourceconnectedlinenum
	 */
	public String getSourceconnectedlinenum() {
		return sourceconnectedlinenum;
	}

	/**
	 * @param sourceconnectedlinenum the sourceconnectedlinenum to set
	 */
	public void setSourceconnectedlinenum(String sourceconnectedlinenum) {
		this.sourceconnectedlinenum = sourceconnectedlinenum;
	}

	/**
	 * @return the localoneconnectedlinename
	 */
	public String getLocaloneconnectedlinename() {
		return localoneconnectedlinename;
	}

	/**
	 * @param localoneconnectedlinename the localoneconnectedlinename to set
	 */
	public void setLocaloneconnectedlinename(String localoneconnectedlinename) {
		this.localoneconnectedlinename = localoneconnectedlinename;
	}

	/**
	 * @return the destuniqueid
	 */
	public String getDestuniqueid() {
		return destuniqueid;
	}

	/**
	 * @param destuniqueid the destuniqueid to set
	 */
	public void setDestuniqueid(String destuniqueid) {
		this.destuniqueid = destuniqueid;
	}

	/**
	 * @return the sourcepriority
	 */
	public String getSourcepriority() {
		return sourcepriority;
	}

	/**
	 * @param sourcepriority the sourcepriority to set
	 */
	public void setSourcepriority(String sourcepriority) {
		this.sourcepriority = sourcepriority;
	}

	/**
	 * @return the localtwocalleridname
	 */
	public String getLocaltwocalleridname() {
		return localtwocalleridname;
	}

	/**
	 * @param localtwocalleridname the localtwocalleridname to set
	 */
	public void setLocaltwocalleridname(String localtwocalleridname) {
		this.localtwocalleridname = localtwocalleridname;
	}

	/**
	 * @return the localtwoconnectedlinenum
	 */
	public String getLocaltwoconnectedlinenum() {
		return localtwoconnectedlinenum;
	}

	/**
	 * @param localtwoconnectedlinenum the localtwoconnectedlinenum to set
	 */
	public void setLocaltwoconnectedlinenum(String localtwoconnectedlinenum) {
		this.localtwoconnectedlinenum = localtwoconnectedlinenum;
	}

	/**
	 * @return the localonechannelstatedesc
	 */
	public String getLocalonechannelstatedesc() {
		return localonechannelstatedesc;
	}

	/**
	 * @param localonechannelstatedesc the localonechannelstatedesc to set
	 */
	public void setLocalonechannelstatedesc(String localonechannelstatedesc) {
		this.localonechannelstatedesc = localonechannelstatedesc;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the localonelinkedid
	 */
	public String getLocalonelinkedid() {
		return localonelinkedid;
	}

	/**
	 * @param localonelinkedid the localonelinkedid to set
	 */
	public void setLocalonelinkedid(String localonelinkedid) {
		this.localonelinkedid = localonelinkedid;
	}

	/**
	 * @return the localtwochannel
	 */
	public String getLocaltwochannel() {
		return localtwochannel;
	}

	/**
	 * @param localtwochannel the localtwochannel to set
	 */
	public void setLocaltwochannel(String localtwochannel) {
		this.localtwochannel = localtwochannel;
	}

	/**
	 * @return the localonechannelstate
	 */
	public String getLocalonechannelstate() {
		return localonechannelstate;
	}

	/**
	 * @param localonechannelstate the localonechannelstate to set
	 */
	public void setLocalonechannelstate(String localonechannelstate) {
		this.localonechannelstate = localonechannelstate;
	}

	/**
	 * @return the sourcecalleridnum
	 */
	public String getSourcecalleridnum() {
		return sourcecalleridnum;
	}

	/**
	 * @param sourcecalleridnum the sourcecalleridnum to set
	 */
	public void setSourcecalleridnum(String sourcecalleridnum) {
		this.sourcecalleridnum = sourcecalleridnum;
	}

	/**
	 * @return the sourcechannelstate
	 */
	public String getSourcechannelstate() {
		return sourcechannelstate;
	}

	/**
	 * @param sourcechannelstate the sourcechannelstate to set
	 */
	public void setSourcechannelstate(String sourcechannelstate) {
		this.sourcechannelstate = sourcechannelstate;
	}

	/**
	 * @return the sourcecontext
	 */
	public String getSourcecontext() {
		return sourcecontext;
	}

	/**
	 * @param sourcecontext the sourcecontext to set
	 */
	public void setSourcecontext(String sourcecontext) {
		this.sourcecontext = sourcecontext;
	}

	/**
	 * @return the localtwoconnectedlinename
	 */
	public String getLocaltwoconnectedlinename() {
		return localtwoconnectedlinename;
	}

	/**
	 * @param localtwoconnectedlinename the localtwoconnectedlinename to set
	 */
	public void setLocaltwoconnectedlinename(String localtwoconnectedlinename) {
		this.localtwoconnectedlinename = localtwoconnectedlinename;
	}

	/**
	 * @return the localtwouniqueid
	 */
	public String getLocaltwouniqueid() {
		return localtwouniqueid;
	}

	/**
	 * @param localtwouniqueid the localtwouniqueid to set
	 */
	public void setLocaltwouniqueid(String localtwouniqueid) {
		this.localtwouniqueid = localtwouniqueid;
	}

	/**
	 * @return the localtwolinkedid
	 */
	public String getLocaltwolinkedid() {
		return localtwolinkedid;
	}

	/**
	 * @param localtwolinkedid the localtwolinkedid to set
	 */
	public void setLocaltwolinkedid(String localtwolinkedid) {
		this.localtwolinkedid = localtwolinkedid;
	}

	/**
	 * @return the localonecalleridnum
	 */
	public String getLocalonecalleridnum() {
		return localonecalleridnum;
	}

	/**
	 * @param localonecalleridnum the localonecalleridnum to set
	 */
	public void setLocalonecalleridnum(String localonecalleridnum) {
		this.localonecalleridnum = localonecalleridnum;
	}

	/**
	 * @return the localonelanguage
	 */
	public String getLocalonelanguage() {
		return localonelanguage;
	}

	/**
	 * @param localonelanguage the localonelanguage to set
	 */
	public void setLocalonelanguage(String localonelanguage) {
		this.localonelanguage = localonelanguage;
	}

	/**
	 * @return the localonecalleridname
	 */
	public String getLocalonecalleridname() {
		return localonecalleridname;
	}

	/**
	 * @param localonecalleridname the localonecalleridname to set
	 */
	public void setLocalonecalleridname(String localonecalleridname) {
		this.localonecalleridname = localonecalleridname;
	}

	/**
	 * @return the sourceconnectedlinename
	 */
	public String getSourceconnectedlinename() {
		return sourceconnectedlinename;
	}

	/**
	 * @param sourceconnectedlinename the sourceconnectedlinename to set
	 */
	public void setSourceconnectedlinename(String sourceconnectedlinename) {
		this.sourceconnectedlinename = sourceconnectedlinename;
	}

	/**
	 * @return the localonepriority
	 */
	public String getLocalonepriority() {
		return localonepriority;
	}

	/**
	 * @param localonepriority the localonepriority to set
	 */
	public void setLocalonepriority(String localonepriority) {
		this.localonepriority = localonepriority;
	}

	/**
	 * @return the sourcechannelstatedesc
	 */
	public String getSourcechannelstatedesc() {
		return sourcechannelstatedesc;
	}

	/**
	 * @param sourcechannelstatedesc the sourcechannelstatedesc to set
	 */
	public void setSourcechannelstatedesc(String sourcechannelstatedesc) {
		this.sourcechannelstatedesc = sourcechannelstatedesc;
	}

	/**
	 * @return the localonechannel
	 */
	public String getLocalonechannel() {
		return localonechannel;
	}

	/**
	 * @param localonechannel the localonechannel to set
	 */
	public void setLocalonechannel(String localonechannel) {
		this.localonechannel = localonechannel;
	}

	/**
	 * @return the sourcecalleridname
	 */
	public String getSourcecalleridname() {
		return sourcecalleridname;
	}

	/**
	 * @param sourcecalleridname the sourcecalleridname to set
	 */
	public void setSourcecalleridname(String sourcecalleridname) {
		this.sourcecalleridname = sourcecalleridname;
	}

	/**
	 * @return the localtwocontext
	 */
	public String getLocaltwocontext() {
		return localtwocontext;
	}

	/**
	 * @param localtwocontext the localtwocontext to set
	 */
	public void setLocaltwocontext(String localtwocontext) {
		this.localtwocontext = localtwocontext;
	}

	/**
	 * @return the sourcelinkedid
	 */
	public String getSourcelinkedid() {
		return sourcelinkedid;
	}

	/**
	 * @param sourcelinkedid the sourcelinkedid to set
	 */
	public void setSourcelinkedid(String sourcelinkedid) {
		this.sourcelinkedid = sourcelinkedid;
	}

	/**
	 * @return the sourcelanguage
	 */
	public String getSourcelanguage() {
		return sourcelanguage;
	}

	/**
	 * @param sourcelanguage the sourcelanguage to set
	 */
	public void setSourcelanguage(String sourcelanguage) {
		this.sourcelanguage = sourcelanguage;
	}

	/**
	 * @return the localtwoexten
	 */
	public String getLocaltwoexten() {
		return localtwoexten;
	}

	/**
	 * @param localtwoexten the localtwoexten to set
	 */
	public void setLocaltwoexten(String localtwoexten) {
		this.localtwoexten = localtwoexten;
	}

	/**
	 * @return the localtwochannelstatedesc
	 */
	public String getLocaltwochannelstatedesc() {
		return localtwochannelstatedesc;
	}

	/**
	 * @param localtwochannelstatedesc the localtwochannelstatedesc to set
	 */
	public void setLocaltwochannelstatedesc(String localtwochannelstatedesc) {
		this.localtwochannelstatedesc = localtwochannelstatedesc;
	}

	/**
	 * @return the sourcechannel
	 */
	public String getSourcechannel() {
		return sourcechannel;
	}

	/**
	 * @param sourcechannel the sourcechannel to set
	 */
	public void setSourcechannel(String sourcechannel) {
		this.sourcechannel = sourcechannel;
	}

	/**
	 * @return the localtwopriority
	 */
	public String getLocaltwopriority() {
		return localtwopriority;
	}

	/**
	 * @param localtwopriority the localtwopriority to set
	 */
	public void setLocaltwopriority(String localtwopriority) {
		this.localtwopriority = localtwopriority;
	}

	/**
	 * @return the privilege
	 */
	public String getPrivilege() {
		return privilege;
	}

	/**
	 * @param privilege the privilege to set
	 */
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	/**
	 * @return the localtwolanguage
	 */
	public String getLocaltwolanguage() {
		return localtwolanguage;
	}

	/**
	 * @param localtwolanguage the localtwolanguage to set
	 */
	public void setLocaltwolanguage(String localtwolanguage) {
		this.localtwolanguage = localtwolanguage;
	}

	/**
	 * @return the localtwocalleridnum
	 */
	public String getLocaltwocalleridnum() {
		return localtwocalleridnum;
	}

	/**
	 * @param localtwocalleridnum the localtwocalleridnum to set
	 */
	public void setLocaltwocalleridnum(String localtwocalleridnum) {
		this.localtwocalleridnum = localtwocalleridnum;
	}

	/**
	 * @return the localoneuniqueid
	 */
	public String getLocaloneuniqueid() {
		return localoneuniqueid;
	}

	/**
	 * @param localoneuniqueid the localoneuniqueid to set
	 */
	public void setLocaloneuniqueid(String localoneuniqueid) {
		this.localoneuniqueid = localoneuniqueid;
	}

	/**
	 * @return the localtwochannelstate
	 */
	public String getLocaltwochannelstate() {
		return localtwochannelstate;
	}

	/**
	 * @param localtwochannelstate the localtwochannelstate to set
	 */
	public void setLocaltwochannelstate(String localtwochannelstate) {
		this.localtwochannelstate = localtwochannelstate;
	}

	/**
	 * @return the sourceexten
	 */
	public String getSourceexten() {
		return sourceexten;
	}

	/**
	 * @param sourceexten the sourceexten to set
	 */
	public void setSourceexten(String sourceexten) {
		this.sourceexten = sourceexten;
	}
	
}
