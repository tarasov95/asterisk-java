package org.asteriskjava.manager.event;

/**
 * Created by plhk on 1/15/15.
 */
public class NewConnectedLineEvent extends ManagerEvent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String channel;
	private String uniqueId;
	private String language;
	private String linkedid;

	public NewConnectedLineEvent(Object source)
	{
		super(source);
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public String getChannel()
	{
		return channel;
	}

	public void setChannel(String channel)
	{
		this.channel = channel;
	}

	public String getUniqueId()
	{
		return uniqueId;
	}

	public void setUniqueId(String uniqueId)
	{
		this.uniqueId = uniqueId;
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
