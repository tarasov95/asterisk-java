package org.asteriskjava.manager.event;

/**
 * Created by plhk on 1/15/15.
 */
public class AgiExecStartEvent extends AgiExecEvent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//AgiExecStartEvent
    private String language;
    private String linkedid;

    public void setLanguage(String language) {
        this.language=language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLinkedid(String linkedid) {
        this.linkedid=linkedid;
    }

    public String getLinkedid() {
        return this.linkedid;
    }
		
	public AgiExecStartEvent(Object source)
	{
		super(source);
		setSubEvent(SUB_EVENT_START);
	}
}
