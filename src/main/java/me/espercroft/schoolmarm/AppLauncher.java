package me.espercroft.schoolmarm;

import me.espercroft.util.HandlerAlreadyBoundException;

public class AppLauncher {
	public static Schoolmarm marm;
	
	public static void main(String args[]) throws HandlerAlreadyBoundException {
		marm = new Schoolmarm();
	}
}
