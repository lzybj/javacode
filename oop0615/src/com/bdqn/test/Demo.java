package com.bdqn.test;

import java.util.Scanner;

import com.bdqn.domain.Product;
import com.bdqn.service.ShopService;

public class Demo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1.获得用户买的产品以及产品种类数（产品的名称，产品的价格，数量）,以及积分
		 * 2.根据用户输入，计算出总价格
		 * 3.显示所有用户买的产品信息，以及总价格
		 * 4.根据会员积分，得到会员的等级(0-1000:C;1000-2000:B;2000+:A)
		 * 5.根据会员等级则算出折扣（A:7.5折；B：8折；C:9折）
		 * 6.输出用户购买产品小单（明细，共计多少件产品,原总价，会员积分，会员级别，会员折扣以及实付价格）
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请确认输入产品的种类数量：");
		int count = input.nextInt();
		Product[] products = new Product[count];
//		String[] productNames = new String[count];
//		float[] unitPrices = new float[count];
//		int[] productNums = new int[count];
//		float[] productTotals = new float[count];
		float sum = 0.00f;//产品总价格
		float sumVip = 0.00f;//产品折扣实付价格
		int productCount = 0;//产品总件数
		int jf = 0;//会员积分
		char vip;//会员等级
		float vipZK = 0.00f;//会员折扣
		for (int i = 0; i < count; i++) {
			products[i] = new Product();
			System.out.println("请输入产品名称：");
			products[i].setProductName(input.next());
			System.out.println("请输入产品单价:");
			products[i].setUnitPrice(input.nextFloat());
			System.out.println("请输入产品数量：");
			products[i].setProductNum(input.nextInt());
		}
		
		System.out.println("请输入您的会员积分：");
		jf = input.nextInt();
		
		//调用业务类ShopService
		
		ShopService ss = new ShopService();
		vip = ss.getLevel(jf);
		vipZK = ss.getZK(vip);
		//计算原价格,同时计算小计,再计算产品件数
		
		for (int i = 0; i < count; i++) {
			Product myProduct = products[i];
			//productTotals[i] = unitPrices[i] * productNums[i];
			sum = sum + myProduct.getProductTotal();
			productCount = productCount + myProduct.getProductNum();
		}
		
		//计算实付价格
		
		sumVip = sum * vipZK;
		
		//输出显示
		System.out.println("打印购物小清单");
		System.out.println("您共计购买了" + productCount + "件产品");
		System.out.println("明细如下：");
		for (int i = 0; i < count; i++) {
			Product myProduct = products[i];
			System.out.println(myProduct.getProductName() + "   " + myProduct.getUnitPrice() + "    " + myProduct.getProductNum() + "      " + myProduct.getProductTotal());
		}
		System.out.println("原价格共计：" + sum);
		System.out.println("会员积分：" + jf);
		System.out.println("会员等级：" + vip);
		System.out.println("享受折扣：" + vipZK*10 + "折");
		System.out.println("实付价格：" + sumVip);
		
		
		
	}

}
