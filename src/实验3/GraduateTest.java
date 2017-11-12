package 实验3;
/**
*@author LM
*@file:Road.java
*@package:实验3
*@project:实验3
*@date time:2017年11月11日下午10:27:36
*@location: https://github.com/ThegreatMZ/-3.git
 */
public class GraduateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graduate zhangsan = new Graduate("zhangsan", "男", 24);
		zhangsan.setFee(16200);
		zhangsan.setPay(3000 * 12);
		if (zhangsan.needLoan()) {
			System.out.print(zhangsan.getName() + ", need provide a loan!");
		} else
			System.out.print(zhangsan.getName() + ", needn't provide a loan!");
	}

}