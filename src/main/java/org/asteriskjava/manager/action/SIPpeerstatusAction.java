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

import org.asteriskjava.manager.event.SIPpeerstatusCompleteEvent;
import org.asteriskjava.manager.ExpectedResponse;
import org.asteriskjava.manager.event.PeerlistCompleteEvent;
import org.asteriskjava.manager.event.ResponseEvent;
import org.asteriskjava.manager.response.SipShowPeerResponse;

/**
 * Retrieves a the details about a given SIP peer.<p>
 * The result is returned in the response received in reply to this action.<p>
 * Use {@link org.asteriskjava.manager.response.ManagerResponse#getAttribute(String)}
 * to retrieve the properties. Consider using {@link org.asteriskjava.manager.action.SipPeersAction}
 * instead.<p>
 * Available since Asterisk 1.2
 * 
 * @author srt
 * @version $Id$
 * @since 0.2
 * @see org.asteriskjava.manager.action.SipPeersAction
 * @see org.asteriskjava.manager.response.SipShowPeerResponse
 */
@ExpectedResponse(SipShowPeerResponse.class)
public class SIPpeerstatusAction extends AbstractManagerAction implements EventGeneratingAction
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 1L;
    private String peer;

    /**
     * Creates a new empty SipShowPeerAction.
     */
    public SIPpeerstatusAction()
    {
      this(null);
    }


    public SIPpeerstatusAction(String peer)
    {
        this.peer = peer;
    }

    @Override
   public String getAction()
    {
        return "SIPpeerstatus";
    }

    /**
     * Returns the name of the peer to retrieve.<p>
     * This parameter is optional.
     * 
     * @return the name of the peer to retrieve without the channel type prefix.
     */
    public String getPeer()
    {
        return peer;
    }

    /**
     * Sets the name of the peer to retrieve.
     * <p>
     * This is just the peer name without the channel type prefix. For example
     * if your channel is called "SIP/john", the peer name is just "john".
     * <p>
     * This parameter is optional.
     * 
     * @param peer the name of the peer to retrieve without the channel type prefix.
     */
    public void setPeer(String peer)
    {
        this.peer = peer;
    }

  @Override
  public Class<? extends ResponseEvent> getActionCompleteEventClass() {
    return SIPpeerstatusCompleteEvent.class;
  }
}
