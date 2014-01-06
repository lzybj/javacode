package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bdqn.cfg.ProductDataBase;
import com.bdqn.domain.Product;
import com.bdqn.service.ChaoShiSystem;
import com.bdqn.service.ProductService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ProductService ps = new ProductService();
//		Product tt = ps.findByProductName("牙膏");
//		System.out.println(tt.getProductNum());
//		System.out.println(ProductDataBase.DB_PRODUCT.get(0).getProductNum());
		System.out.println("欢迎进入超市系统：");
		ChaoShiSystem css = new ChaoShiSystem();
		while(true){
			System.out.println("请选择功能：");
			System.out.println("1.销售系统");
			System.out.println("2.库存盘点系统");
			System.out.println("3.销售盘点系统");
			System.out.println("4.进货系统");
			System.out.println("5.退出");
			Scanner input = new Scanner(System.in);
			int sel = input.nextInt();
			switch (sel) {
			case 1:
				css.sellModel();
				break;
			case 2:
				css.dbPanDian();
				break;
			case 3:
				css.sellPanDian();
				break;
			case 4:
				css.jinHuo();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("对不起，无此功能！");
				break;
			}			
		}
	}

}
