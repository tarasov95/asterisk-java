/*
 * Copyright www.focalscope.com
 */
package org.asteriskjava.manager.event;

/**
 *
 * @author tarasov
 */
public interface IResponseEvent {
  public ResponseEvent toResponseEvent(ManagerEvent ev);
  public String getActionId();
  public void setActionId(String actionId);
  public String getInternalActionId();
  public void setInternalActionId(String internalActionId);
}
