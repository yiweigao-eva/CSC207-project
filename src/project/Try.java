package project;

import java.util.ArrayList;
import java.util.List;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		category c1 = new category("c1", "c1", 01);
		product p1 = new product("p1", 2.0, "p1", "image", 10.0,c1);
		
		List<linkedItem> list = new ArrayList<linkedItem>();
		linkedItem l = new linkedItem(p1, 1.0);
		list.add(l);
		System.out.println(list.indexOf(p1));
		System.out.println(l.equals(p1));
		int i = 1;
		category c2 = new category("c2", "c2", i);
		i = 2;
		System.out.println("code" + c2.code);
	}

}
