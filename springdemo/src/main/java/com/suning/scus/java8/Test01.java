package com.suning.scus.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xianchunhui
 */
public class Test01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("12");
		list.add("12");
		list.add("12");
		list.add("12");
		list.add("12");
		list.add("12");


		list.forEach(System.out::println);

		list.forEach(System.out::println);

	}
}

