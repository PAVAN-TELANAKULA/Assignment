package com.uks.core.day9to11;

public class Main1 {
	public static void main (String args[]) throws Exception {

		ThreadGroup threadGroup = new ThreadGroup("Thread Group constructor");
		new UserInteration("UserLoginInfo", threadGroup);
		new UserInteration("UserInfo", threadGroup);

	}
}
