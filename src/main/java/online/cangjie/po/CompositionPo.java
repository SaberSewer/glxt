package online.cangjie.po;

import java.util.Date;

public class CompositionPo {
	private Integer id;
	private String title;
	private Integer tagId;
	private String preson;
	private Date date;
	private Integer state;

	public CompositionPo() {
		super();
	}

	public CompositionPo(Integer id, String title, Integer tagId, String preson, Date date, Integer state) {
		super();
		this.id = id;
		this.title = title;
		this.tagId = tagId;
		this.preson = preson;
		this.date = date;
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getPreson() {
		return preson;
	}

	public void setPreson(String preson) {
		this.preson = preson;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CompositionPo [id=" + id + ", title=" + title + ", tagId=" + tagId + ", preson=" + preson + ", date="
				+ date + ", state=" + state + "]";
	}

}
