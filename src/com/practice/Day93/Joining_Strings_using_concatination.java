package com.practice.Day93;

import java.util.ArrayList;
import java.util.List;

public class Joining_Strings_using_concatination {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Pro");
		list.add("gram");
		list.add("ming");
		System.out.println("List: " + list);
		String str = " ";
		for (String str1 : list) {
			str +=str1;
		}
		System.out.println("String :: " + str);
	}
}
