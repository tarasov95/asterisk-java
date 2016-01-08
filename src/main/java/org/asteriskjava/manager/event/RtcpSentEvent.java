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

import java.net.InetAddress;

/**
 * An RtcpSentEvent is triggered when Asterisk sends an RTCP message.<p>
 * Available since Asterisk 1.6<p>
 * It is implemented in <code>main/rtp.c</code>
 *
 * @author srt
 * @version $Id$
 * @since 1.0.0
 */
public class RtcpSentEvent extends AbstractRtcpEvent
{
    private static final long serialVersionUID = 1L;

//RtcpSentEvent
    private String ssrc;
    private String report0lsr;
    private String report0cumulativelost;
    private String reportcount;
    private String language;
    private String report0highestsequence;
    private String report0dlsr;
    private String report0fractionlost;
    private String report0sequencenumbercycles;
    private String from;
    private String report0sourcessrc;
    private String linkedid;
    private String uniqueid;
    private String pt;
    private String channel;
    private String report0iajitter;

    public void setSsrc(String ssrc) {
        this.ssrc=ssrc;
    }

    public String getSsrc() {
        return this.ssrc;
    }

    public void setReport0lsr(String report0lsr) {
        this.report0lsr=report0lsr;
    }

    public String getReport0lsr() {
        return this.report0lsr;
    }

    public void setReport0cumulativelost(String report0cumulativelost) {
        this.report0cumulativelost=report0cumulativelost;
    }

    public String getReport0cumulativelost() {
        return this.report0cumulativelost;
    }

    public void setReportcount(String reportcount) {
        this.reportcount=reportcount;
    }

    public String getReportcount() {
        return this.reportcount;
    }

    public void setLanguage(String language) {
        this.language=language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setReport0highestsequence(String report0highestsequence) {
        this.report0highestsequence=report0highestsequence;
    }

    public String getReport0highestsequence() {
        return this.report0highestsequence;
    }

    public void setReport0dlsr(String report0dlsr) {
        this.report0dlsr=report0dlsr;
    }

    public String getReport0dlsr() {
        return this.report0dlsr;
    }

    public void setReport0fractionlost(String report0fractionlost) {
        this.report0fractionlost=report0fractionlost;
    }

    public String getReport0fractionlost() {
        return this.report0fractionlost;
    }

    public void setReport0sequencenumbercycles(String report0sequencenumbercycles) {
        this.report0sequencenumbercycles=report0sequencenumbercycles;
    }

    public String getReport0sequencenumbercycles() {
        return this.report0sequencenumbercycles;
    }

    public void setFrom(String from) {
        this.from=from;
    }

    public String getFrom() {
        return this.from;
    }

    public void setReport0sourcessrc(String report0sourcessrc) {
        this.report0sourcessrc=report0sourcessrc;
    }

    public String getReport0sourcessrc() {
        return this.report0sourcessrc;
    }

    public void setLinkedid(String linkedid) {
        this.linkedid=linkedid;
    }

    public String getLinkedid() {
        return this.linkedid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid=uniqueid;
    }

    public String getUniqueid() {
        return this.uniqueid;
    }

    public void setPt(String pt) {
        this.pt=pt;
    }

    public String getPt() {
        return this.pt;
    }

    public void setChannel(String channel) {
        this.channel=channel;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setReport0iajitter(String report0iajitter) {
        this.report0iajitter=report0iajitter;
    }

    public String getReport0iajitter() {
        return this.report0iajitter;
    }
		
    private InetAddress toAddress;
    private Integer toPort;
    private Long ourSsrc;
    private Double sentNtp;
    private Long sentRtp;
    private Long sentPackets;
    private Long sentOctets;
    private Long cumulativeLoss;
    private Long theirLastSr;

    public RtcpSentEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the IP address the RTCP message has been sent to.
     *
     * @return the IP address the RTCP message has been sent to.
     */
    public InetAddress getToAddress()
    {
        return toAddress;
    }

    /**
     * Returns the port the RTCP message has been sent to.
     *
     * @return the port the RTCP message has been sent to.
     */
    public Integer getToPort()
    {
        return toPort;
    }

    public void setTo(String to)
    {
        // Format is "%s:%d"
        this.toAddress = stringToAddress(to);
        this.toPort = stringToPort(to);
    }

    /**
     * Returns our synchronization source identifier that uniquely identifies the source of a stream.
     * @return our synchronization source identifier.
     */
    public Long getOurSsrc()
    {
        return ourSsrc;
    }

    public void setOurSsrc(Long ourSsrc)
    {
        this.ourSsrc = ourSsrc;
    }

    public Double getSentNtp()
    {
        return sentNtp;
    }

    public void setSentNtp(Double sentNtp)
    {
        this.sentNtp = sentNtp;
    }

    public Long getSentRtp()
    {
        return sentRtp;
    }

    public void setSentRtp(Long sentRtp)
    {
        this.sentRtp = sentRtp;
    }

    /**
     * Returns the number of packets sent.
     *
     * @return the number of packets sent.
     */
    public Long getSentPackets()
    {
        return sentPackets;
    }

    public void setSentPackets(Long sentPackets)
    {
        this.sentPackets = sentPackets;
    }

    /**
     * Returns the number of octets (bytes) sent.
     *
     * @return the number of octets (bytes) sent.
     */
    public Long getSentOctets()
    {
        return sentOctets;
    }

    public void setSentOctets(Long sentOctets)
    {
        this.sentOctets = sentOctets;
    }

    public Long getCumulativeLoss()
    {
        return cumulativeLoss;
    }

    public void setCumulativeLoss(Long cumulativeLoss)
    {
        this.cumulativeLoss = cumulativeLoss;
    }

    public Long getTheirLastSr()
    {
        return theirLastSr;
    }

    public void setTheirLastSr(Long theirLastSr)
    {
        this.theirLastSr = theirLastSr;
    }
}