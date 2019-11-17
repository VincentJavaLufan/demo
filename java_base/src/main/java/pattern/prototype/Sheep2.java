package pattern.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * �����������
 * @author Administrator
 *
 */
public class Sheep2 implements Cloneable,Serializable{
	private String sname;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();//ֱ�ӵ���object�����clone����
		
		//������´���ʵ����ƣ�deep Clone��
		Sheep2 s = (Sheep2) obj;
		s.birthday = (Date) this.birthday.clone();//������Ҳ���п�¡
		
		return obj;
	}
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Sheep2(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	public Sheep2(){};
}

