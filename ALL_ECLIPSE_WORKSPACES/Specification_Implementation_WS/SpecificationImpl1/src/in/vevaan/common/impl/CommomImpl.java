package in.vevaan.common.impl;

import com.specification.common.CommonTasks;

public class CommomImpl implements CommonTasks{

	@Override
	public void add(int arg0, int arg1) {
		System.out.println("The sum of these numbers is " + (arg0 + arg1));
	}
}
