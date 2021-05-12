/*
 * Copyright www.focalscope.com
 */
package org.asteriskjava.manager.event;

public class ParkedCallResponseEvent extends ResponseEvent {

  private final ParkedCallEvent event;

  public ParkedCallResponseEvent(Object source) {
    super(source);
    if(source instanceof ParkedCallEvent) {
      event = (ParkedCallEvent)source;
    } else {
      event = null;
    }
  }
  
  public ParkedCallResponseEvent(ParkedCallEvent event) {
    super(event.getSource());
    this.setActionId(event.getActionId());
    this.setInternalActionId(event.getInternalActionId());
    this.event = event;
  }

  public String getParkingLot() {
    return event.getParkingLot();
  }

  public void setParkingLot(String parkingLot) {
    event.setParkingLot(parkingLot);
  }

  public String getUniqueId() {
    return event.getUniqueId();
  }

  public void setUniqueId(String uniqueId) {
    event.setUniqueId(uniqueId);
  }

  public String getParkeeChannel() {
    return event.getParkeeChannel();
  }

  public void setParkeeChannel(String parkeeChannel) {
    event.setParkeeChannel(parkeeChannel);
  }

  public Integer getParkeeChannelState() {
    return event.getParkeeChannelState();
  }

  public void setParkeeChannelState(Integer parkeeChannelState) {
    event.setParkeeChannelState(parkeeChannelState);
  }

  public String getParkeeChannelStateDesc() {
    return event.getParkeeChannelStateDesc();
  }

  public void setParkeeChannelStateDesc(String parkeeChannelStateDesc) {
    event.setParkeeChannelStateDesc(parkeeChannelStateDesc);
  }

  public String getParkeeCallerIDNum() {
    return event.getParkeeCallerIDNum();
  }

  public void setParkeeCallerIDNum(String parkeeCallerIDNum) {
    event.setParkeeCallerIDNum(parkeeCallerIDNum);
  }

  public String getParkeeCallerIDName() {
    return event.getParkeeCallerIDName();
  }

  public void setParkeeCallerIDName(String parkeeCallerIDName) {
    event.setParkeeCallerIDName(parkeeCallerIDName);
  }

  public Integer getParkeeConnectedLineNum() {
    final String z = event.getParkeeConnectedLineNum();
    return z==null?null:Integer.parseInt(z);
  }

  public void setParkeeConnectedLineNum(Integer parkeeConnectedLineNum) {
    event.setParkeeConnectedLineNum(parkeeConnectedLineNum==null?null:parkeeConnectedLineNum.toString());
  }

  public String getParkeeConnectedLineName() {
    return event.getParkeeConnectedLineName();
  }

  public void setParkeeConnectedLineName(String parkeeConnectedLineName) {
    event.setParkeeConnectedLineName(parkeeConnectedLineName);
  }

  public String getParkeeLanguage() {
    return event.getParkeeLanguage();
  }

  public void setParkeeLanguage(String parkeeLanguage) {
    event.setParkeeLanguage(parkeeLanguage);
  }

  public String getParkeeAccountCode() {
    return event.getParkeeAccountCode();
  }

  public void setParkeeAccountCode(String parkeeAccountCode) {
    event.setParkeeAccountCode(parkeeAccountCode);
  }

  public String getParkeeContext() {
    return event.getParkeeContext();
  }

  public void setParkeeContext(String parkeeContext) {
    event.setParkeeContext(parkeeContext);
  }

  public String getParkeeExten() {
    return event.getParkeeExten();
  }

  public void setParkeeExten(String parkeeExten) {
    event.setParkeeExten(parkeeExten);
  }

  public Integer getParkeePriority() {
    return event.getParkeePriority();
  }

  public void setParkeePriority(Integer parkeePriority) {
    event.setParkeePriority(parkeePriority);
  }

  public String getParkeeUniqueid() {
    return event.getParkeeUniqueid();
  }

  public void setParkeeUniqueid(String parkeeUniqueid) {
    event.setParkeeUniqueid(parkeeUniqueid);
  }

  public String getParkerDialString() {
    return event.getParkerDialString();
  }

  public void setParkerDialString(String parkerDialString) {
    event.setParkerDialString(parkerDialString);
  }

  public String getParkinglot() {
    return event.getParkingLot();
  }

  public void setParkinglot(String parkinglot) {
    event.setParkingLot(parkinglot);
  }

  public String getParkingSpace() {
    return event.getParkingSpace();
  }

  public void setParkingSpace(String parkingSpace) {
    event.setParkingSpace(parkingSpace);
  }

  public Long getParkingTimeout() {
    return event.getParkingTimeout();
  }

  public void setParkingTimeout(Long parkingTimeout) {
    event.setParkingTimeout(parkingTimeout);
  }

  public Long getParkingDuration() {
    return event.getParkingDuration();
  }

  public void setParkingDuration(Long parkingDuration) {
    event.setParkingDuration(parkingDuration);
  }

}
