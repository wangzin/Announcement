package net.bhu.pvt.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class jobdetails
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto  increment in table
	private int id;
	
	private String name;
	@Temporal (TemporalType.DATE)
	private Date postdate;
	
	@Column(name="shortDescription")
	private String shdiscrip;
	private String image_url;
	private boolean is_active;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public String getShdiscrip() {
		return shdiscrip;
	}
	public void setShdiscrip(String shdiscrip) {
		this.shdiscrip = shdiscrip;
	}
	public String getImage_url() {
		return image_url;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	@Override
	public String toString() {
		return "jobdetails [id=" + id + ", name=" + name + ", postdate=" + postdate + ", shdiscrip=" + shdiscrip
				+ ", image_url=" + image_url + ", is_active=" + is_active + "]";
	}
	
}
