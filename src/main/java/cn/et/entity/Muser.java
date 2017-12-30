package cn.et.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//该注解表示此类为实体类
@Entity
public class Muser {
	//匹配数据库的主键
	@Id
	//主键生成类型
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	//匹配数据库对应的列
	@Column(nullable=false)
	private String uname;
	@Column
	private int age;
	@Column
	private int sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
}
