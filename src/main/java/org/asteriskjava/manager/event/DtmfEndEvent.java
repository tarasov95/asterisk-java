package org.asteriskjava.manager.event;

/**
 * Created by Alexander Polakov <apolyakov@beget.ru> on 1/26/15.
 */
public class DtmfEndEvent extends DtmfEvent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//DtmfEndEvent
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

	private Integer durationMs;

	public DtmfEndEvent(Object source)
	{
		super(source);
		setBegin(false);
		setEnd(true);
	}

	public Integer getDurationMs()
	{
		return durationMs;
	}

	public void setDurationMs(Integer durationMs)
	{
		this.durationMs = durationMs;
	}
}
