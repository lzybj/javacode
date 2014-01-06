package com.bdqn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bdqn.cfg.ProductDataBase;
import com.bdqn.domain.Pan;
import com.bdqn.domain.Product;

public class ChaoShiSystem {
	public void sellModel(){
		Scanner input = new Scanner(System.in);
		ProductService ps = new ProductService();
		List<Product> cproduct = new ArrayList<Product>();
		while(true){
			System.out.println("请输入产品名称：");
			String pname = input.next();
			Product pro = ps.findByProductName(pname);
			if(pro == null){
				System.out.println("对不起，产品不存在！");
				continue;
			}
			System.out.println("请输入产品的购买数量:");
			int pnum = input.nextInt();
			boolean isOK = ps.sellProduct(pro, pnum);
			if(!isOK){
				System.out.println("对不起，购买此商品失败！");
				continue;
			}
			cproduct.add(pro);
			System.out.println("是否继续购买(Y/N)");
			String yesOrNo = input.next();
			if(yesOrNo.equals("N")){
				break;
			}
		}
		System.out.println("您购买的清单如下：");
		float sum = 0f;
		for (Product product : cproduct) {
			System.out.println("产品名称:" + product.getProductName() + "   产品数量:" + product.getProductNum() + "  小计" + product.getProductNum()*product.getUnitPrice()+"元");
			sum = sum + product.getProductNum() * product.getUnitPrice();
		}
		System.out.println("共计：" + sum + "元");
	}
	public void dbPanDian(){
		int sum = 0;
		for (Product product : ProductDataBase.DB_PRODUCT) {
			sum = sum + product.getProductNum();
		}
		Pan p = new Pan(sum);
		ProductDataBase.PAN_LOGS.add(p);
		if(ProductDataBase.PAN_LOGS.size() <=1){
			Pan pp = ProductDataBase.PAN_LOGS.get(0);
			System.out.println("本次盘点：" + pp.getProductNum() + "  时间：" + pp.getPtime());
		}else{
			int count = ProductDataBase.PAN_LOGS.size();
			Pan ppOld = ProductDataBase.PAN_LOGS.get(count - 2);
			System.out.println("上次盘点：" + ppOld.getProductNum() + "  时间:" + ppOld.getPtime());
			Pan ppNow = ProductDataBase.PAN_LOGS.get(count -1);
			System.out.println("本次盘点：" + ppNow.getProductNum() + "   时间：" + ppNow.getPtime());
		}
		
	}
	
	public void sellPanDian(){
		for (Product product : ProductDataBase.SELL_PRODUCT) {
			System.out.println(product.getProductName() + ":" + product.getProductNum());
		}
	}
	
	public void jinHuo(){
		
	}
}
