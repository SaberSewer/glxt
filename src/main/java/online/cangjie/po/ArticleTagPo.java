package online.cangjie.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article_tag")
public class ArticleTagPo implements Serializable {
	@Id
	@Column(name = "article_id")
	private Integer id;
	@Column(name = "article_name")
	private String name;
	@Column(name = "article_preson")
	private String preson;
	@Column(name = "article_date", columnDefinition = "date")
	private Date date;
	@Column(name = "article_state")
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
