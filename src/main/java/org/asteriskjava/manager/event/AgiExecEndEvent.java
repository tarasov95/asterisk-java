package org.asteriskjava.manager.event;

/**
 * Created by plhk on 1/15/15.
 */
public class AgiExecEndEvent extends AgiExecEvent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//AgiExecEndEvent
    private String linkedid;
    private String language;

    public void setLinkedid(String linkedid) {
        this.linkedid=linkedid;
    }

    public String getLinkedid() {
        return this.linkedid;
    }

    public void setLanguage(String language) {
        this.language=language;
    }

    public String getLanguage() {
        return this.language;
    }
	
	public AgiExecEndEvent(Object source)
	{
		super(source);
		setSubEvent(SUB_EVENT_END);
	}
}
