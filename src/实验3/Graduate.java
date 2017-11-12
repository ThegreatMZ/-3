package ʵ��3;
/**
*@author LM
*@file:Road.java
*@package:ʵ��3
*@project:ʵ��3
*@date time:2017��11��11������10:27:36
*@location: https://github.com/ThegreatMZ/-3.git
 */
interface StudentInterface {
	public abstract void setFee(double fee);// ����ѧ��ѧ��

	public abstract double getFee();// ȡ��ѧ��ѧ��
}

interface TeacherInterface {
	public abstract void setPay(double pay);// ���ý�ʦ����

	public abstract double getPay();// ȡ�ý�ʦ����
}

class Graduate implements StudentInterface, TeacherInterface {
	private String name;
	private String sex;
	private int age;
	private double fee;
	private double pay;

	public Graduate(String name, String sex, int age) {
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
	}

	@Override
	public void setPay(double pay) {
		// TODO Auto-generated method stub
		this.pay = pay;
	}

	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return pay;
	}

	@Override
	public void setFee(double fee) {
		// TODO Auto-generated method stub
		this.fee = fee;
	}

	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return fee;
	}

	public boolean needLoan() {
		if (this.getFee() - this.getPay() < 2000) {
			return true;
		} else
			return false;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}


