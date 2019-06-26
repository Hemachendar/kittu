package gropofbrowsers;

import java.util.Date;

public class Dateandtime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d= new Date();
		//d.getTime();
		//System.out.println(d);
		String dt = d.toString().replace(':', '_').replace(' ', '_');
		System.out.println(dt);
	}

}
