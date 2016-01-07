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
package org.asteriskjava.manager.event;

/**
 * Abstract base class providing common properties channel related events.
 * 
 * @author srt
 * @version $Id$
 */
public abstract class AbstractChannelEvent extends ManagerEvent
{
    /**
     * Serializable version identifier.
     */
    static final long serialVersionUID = 5906599407896179295L;

    /**
     * The name of the channel.
     */
    private String channel;

    /**
     * The unique id of the channel.
     */
    private String uniqueId;
		private String linkedid;

    protected AbstractChannelEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the name of the channel.
     * 
     * @return the name of the channel.
     */
    public final String getChannel()
    {
        return channel;
    }

    public final void setChannel(String channel)
    {
        this.channel = channel;
    }

    /**
     * Returns the unique id of the channel.
     * 
     * @return the unique id of the channel.
     */
    public final String getUniqueId()
    {
        return uniqueId;
    }

    public final void setUniqueId(String uniqueId)
    {
        this.uniqueId = uniqueId;
    }

    /**
     * Returns the Caller*ID of the channel if set or <code>null</code> if none
     * has been set.
     *
     * @return the Caller*ID
     * @deprecated
     * @see #getCallerIdNum()
     */
    @Deprecated
    public final String getCallerId()
    {
        return getCallerIdNum();
    }

    /**
     * Sets the Caller*ID of the channel.
     * 
     * @param callerId the Caller*ID of the channel.
     * @deprecated
     */
    @Deprecated
    public final void setCallerId(String callerId)
    {
        setCallerIdNum(callerId);
    }

	/**
	 * @return the linkedid
	 */
	public String getLinkedid() {
		return linkedid;
	}

	/**
	 * @param linkedid the linkedid to set
	 */
	public void setLinkedid(String linkedid) {
		this.linkedid = linkedid;
	}

}
