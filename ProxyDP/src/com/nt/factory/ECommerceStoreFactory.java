package com.nt.factory;

import com.nt.component.AmazonStore;
import com.nt.component.ECommerceStore;
import com.nt.proxy.ECommerceStoreDiscountProxy;

public class ECommerceStoreFactory {

	public static ECommerceStore getInstance(float discount)
	{
		if(discount<= 0)
		{
			return new AmazonStore();
		}
		else if(discount == 20) {
			return new ECommerceStoreDiscountProxy(20);
		}
		else if(discount == 10) {
			return new ECommerceStoreDiscountProxy(10);
		}
		else if(discount == 30) {
			return new ECommerceStoreDiscountProxy(30);
		}
		else if(discount == 50) {
			return new ECommerceStoreDiscountProxy(50);
		}
		else
		{
			return new ECommerceStoreDiscountProxy(5);
		}
		
		}
	}
	

