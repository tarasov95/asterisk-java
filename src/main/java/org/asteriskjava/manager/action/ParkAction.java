/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.action;

/**
 * The ParkAction parks a channel using Asterisk's park feature.
 * <p>
 * Defined in <code>res/res_features.c</code><p>
 * Available since Asterisk 1.4.
 * 
 * @author srt
 * @version $Id$
 */
public class ParkAction extends AbstractManagerAction
{
    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = -2930397629192323391L;

    private String channel;
    private String timeoutChannel;
    private Integer timeout;
    private String announceChannel;
    private String parkinglot;

    /**
     * Creates a new empty ParkAction.
     */
    public ParkAction()
    {
        super();
    }

    /**
     * Creates a new ParkAction.
     * 
     * @param channel name of the channel to park.
     * @param timeoutChannel name of the channel to announce park info to and return
     *            to on timeout.
     */
    public ParkAction(String channel, String timeoutChannel)
    {
        super();
        this.channel = channel;
        this.timeoutChannel = timeoutChannel;
    }

    /**
     * Creates a new ParkAction with a timeout.
     * 
     * @param channel the name of the channel to park.
     * @param timeoutChannel the name of the channel to announce park info to and
     *            return to on timeout.
     * @param timeout the timeout in seconds before callback.
     */
    public ParkAction(String channel, String timeoutChannel, Integer timeout)
    {
        super();
        this.channel = channel;
        this.timeoutChannel = timeoutChannel;
        this.timeout = timeout;
    }

    /**
     * Returns the name of this action, i.e. "Park".
     */
    @Override
   public String getAction()
    {
        return "Park";
    }

    /**
     * Returns the name of the channel to park.
     * 
     * @return the name of the channel to park.
     */
    public String getChannel()
    {
        return channel;
    }

    /**
     * Sets the name of the channel to park.<p>
     * This property is mandatory.
     * 
     * @param channel the name of the channel to park.
     */
    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    /**
     * Returns the name of the channel to announce park info to and return to on
     * timeout.
     * 
     * @return the name of the channel to announce park info to and return to on
     *         timeout.
     */
    public String getTimeoutChannel()
    {
        return timeoutChannel;
    }

    /**
     * Sets the name of the channel to announce park info to and return to on
     * timeout.<p>
     * This property is mandatory.
     * 
     * @param timeoutChannel the name of the channel to announce park info to and
     *            return to on timeout.
     */
    public void setTimeoutChannel(String timeoutChannel)
    {
        this.timeoutChannel = timeoutChannel;
    }

    /**
     * Returns the timeout in seconds before callback.
     * 
     * @return the timeout in seconds before callback.
     */
    public Integer getTimeout()
    {
        return timeout;
    }

    /**
     * Sets the timeout in seconds before callback.
     * 
     * @param timeout the timeout in seconds before callback.
     */
    public void setTimeout(Integer timeout)
    {
        this.timeout = timeout;
    }

  /**
   * @return the announceChannel
   */
  public String getAnnounceChannel() {
    return announceChannel;
  }

  /**
   * @param announceChannel the announceChannel to set
   */
  public void setAnnounceChannel(String announceChannel) {
    this.announceChannel = announceChannel;
  }

  /**
   * @return the parkinglot
   */
  public String getParkinglot() {
    return parkinglot;
  }

  /**
   * @param parkinglot the parkinglot to set
   */
  public void setParkinglot(String parkinglot) {
    this.parkinglot = parkinglot;
  }
}
