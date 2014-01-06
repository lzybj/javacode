package com.bdqn.service;

import com.bdqn.cfg.ProductDataBase;
import com.bdqn.domain.Product;

public class ProductService {
	public Product findByProductName(String productName){
		for (Product myProduct : ProductDataBase.DB_PRODUCT) {
			if(productName.equals(myProduct.getProductName())){
				Product selProduct = new Product();
				selProduct.setProductID(myProduct.getProductID());
				selProduct.setProductName(myProduct.getProductName());
				selProduct.setJhPrice(myProduct.getJhPrice());
				selProduct.setUnitPrice(myProduct.getUnitPrice());
				return selProduct;
			}
		}
		return null;
	}
	public boolean sellProduct(Product product,int sellNum){
		product.setProductNum(sellNum);//销售产品对象完成
		//从库存中减去相应销售数量
		for (Product mypro : ProductDataBase.DB_PRODUCT) {
			if(product.getProductName().equals(mypro.getProductName())){
				if(mypro.getProductNum() < sellNum){
					return false;
				}
				mypro.setProductNum(mypro.getProductNum() - sellNum);
				break;
			}
		}
		//将产品放入销售集合
		boolean isLive = false;
		for(Product myPro2 : ProductDataBase.SELL_PRODUCT){
			if(product.getProductName().equals(myPro2.getProductName())){
				myPro2.setProductNum(myPro2.getProductNum() + sellNum);
				isLive = true;
				break;
			}
		}
		if(!isLive){
			ProductDataBase.SELL_PRODUCT.add(product);
		}
		return true;
	}
	
}
