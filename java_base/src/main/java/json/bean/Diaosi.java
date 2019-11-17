package json.bean;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;
/**
 * 建议所有的javabean都要有默认的初始化toString方法
 * @author Administrator
 *
 */
public class Diaosi {
//	@SerializedName("NAME")//告诉json用大写的NAME
	@SerializedName("name")
	public String name;
	public String school;
	public boolean has_girlfriend;
	public double age;
	public Object car;
	public Object house;
	public String[] major;
	public String comment;
	public String birthday;
	
	public transient String ignore;
	
	@Override
	public String toString() {
		return "Diaosi [name=" + name + ", school=" + school + ", has_girlfriend=" + has_girlfriend + ", age=" + age
				+ ", car=" + car + ", house=" + house + ", major=" + Arrays.toString(major) + ", comment=" + comment
				+ ", birthday=" + birthday + "]";
	}
	public String getIgnore() {
		return ignore;
	}
	public void setIgnore(String ignore) {
		this.ignore = ignore;
	}
	public String[] getMajor() {
		return major;
	}
	public void setMajor(String[] major) {
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public boolean isHas_girlfriend() {
		return has_girlfriend;
	}
	public void setHas_girlfriend(boolean has_girlfriend) {
		this.has_girlfriend = has_girlfriend;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public Object getCar() {
		return car;
	}
	public void setCar(Object car) {
		this.car = car;
	}
	public Object getHouse() {
		return house;
	}
	public void setHouse(Object house) {
		this.house = house;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
