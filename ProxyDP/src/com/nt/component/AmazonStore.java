//concrete component class
package com.nt.component;

import java.util.stream.DoubleStream;

public class AmazonStore implements ECommerceStore {

	/**
	 * @Override public double shopping(String[] items, double[] prices) {
	 * 
	 *           double total=0.0; for(double p:prices) { total=total+p; } return
	 *           total;
	 * 
	 *           }
	 */
	public double shopping(String[] items, double[] prices) {
		double billAmt = 0.0f;
		billAmt = DoubleStream.of(prices).sum();
		return billAmt;
	}

}
