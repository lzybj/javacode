package com.bdqn.cfg;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Pan;
import com.bdqn.domain.Product;

public class ProductDataBase {
	public static List<Product> DB_PRODUCT = new ArrayList<Product>();
	//销售集合
	public static List<Product> SELL_PRODUCT = new ArrayList<Product>();
	//盘点记录集合
	public static List<Pan> PAN_LOGS = new ArrayList<Pan>();
	static{
		DB_PRODUCT.add(new Product(1,"牙膏",500,10.5f,12.5f));
		DB_PRODUCT.add(new Product(2,"牙刷",300,4.5f,6.5f));
		DB_PRODUCT.add(new Product(3,"洗发水",800,20.5f,23.5f));
		DB_PRODUCT.add(new Product(4,"香皂",1100,2.5f,4.5f));
		DB_PRODUCT.add(new Product(5,"洗面奶",700,16.5f,21.5f));		
	}
}
