package cn.smartlab.listen;

import java.util.ArrayList;
import java.util.List;

public class Db {

	private static List list = new ArrayList();
	static {

		list.add(new CarBeans("1号", "1"));
		list.add(new CarBeans("2号", "0"));
		list.add(new CarBeans("3号", "1"));
		list.add(new CarBeans("4号", "0"));
		list.add(new CarBeans("5号", "1"));
		list.add(new CarBeans("6号", "1"));

	}

	public static List getAll() {

		return list;

	}
	
}
