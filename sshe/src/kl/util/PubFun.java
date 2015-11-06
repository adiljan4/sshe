package kl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PubFun {


	public static String getCurrentDate() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Date today = new Date();
		String tString = df.format(today);
		return tString;
	}

	public static String getCurrentDate2() {
		String pattern = "yyyyMMdd";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Date today = new Date();
		String tString = df.format(today);
		return tString;
	}

	public static String getCurrentTime() {
		String pattern = "HH:mm:ss";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Date today = new Date();
		String tString = df.format(today);
		return tString;
	}

	public static String getCurrentTime2() {
		String pattern = "HHmmss";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Date today = new Date();
		String tString = df.format(today);
		return tString;
	}
	
	public static String getCurrentTime4() {
		String pattern = "mmss";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Date today = new Date();
		String tString = df.format(today);
		return tString;
	}
	
	public static Date getDate() {
		Date tDate = null ;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd") ;
		 try {
			 tDate = df.parse(getCurrentDate());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return tDate;
	}

}
