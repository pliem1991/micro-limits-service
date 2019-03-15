package com.liempt.microservices.limitsservice.bean;

/**
 * @author Liem.pt - 2019/03/15 14:37:37
 *
 */
public class LimitConfiguration {

	int maximum;

	int minimum;

	protected LimitConfiguration() {

	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

}
