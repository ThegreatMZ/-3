package ʵ��3;
/**
*@author LM
*@file:Road.java
*@package:ʵ��3
*@project:ʵ��3
*@date time:2017��11��11������10:27:36
*@location: https://github.com/ThegreatMZ/-3.git
 */
public class GraduateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graduate zhangsan = new Graduate("zhangsan", "��", 24);
		zhangsan.setFee(16200);
		zhangsan.setPay(3000 * 12);
		if (zhangsan.needLoan()) {
			System.out.print(zhangsan.getName() + ", need provide a loan!");
		} else
			System.out.print(zhangsan.getName() + ", needn't provide a loan!");
	}

}