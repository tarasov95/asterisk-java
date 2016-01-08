package org.asteriskjava.manager.event;

/**
 * Created by Alexander Polakov <apolyakov@beget.ru> on 1/26/15.
 */
public class DtmfBeginEvent extends DtmfEvent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//DtmfBeginEvent
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

	
	public DtmfBeginEvent(Object source)
	{
		super(source);
		setBegin(true);
		setEnd(false);
	}
}
