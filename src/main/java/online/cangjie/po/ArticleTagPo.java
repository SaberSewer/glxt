package online.cangjie.po;

import java.io.Serializable;
import java.util.Date;

public class ArticleTagPo implements Serializable {

	private Integer id;
	private String name;
	private String preson;
	private Date date;
	private Integer state;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "ArticleTagPo [id=" + id + ", name=" + name + ", preson=" + preson + ", date=" + date + ", state="
				+ state + "]";
	}

}
