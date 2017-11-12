package 实验3;
/**
*@author LM
*@file:Road.java
*@package:实验3
*@project:实验3
*@date time:2017年11月11日下午10:27:36
*@location: https://github.com/ThegreatMZ/-3.git
 */
interface StudentInterface {
	public abstract void setFee(double fee);// 设置学生学费

	public abstract double getFee();// 取得学生学费
}

interface TeacherInterface {
	public abstract void setPay(double pay);// 设置教师工资

	public abstract double getPay();// 取得教师工资
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


