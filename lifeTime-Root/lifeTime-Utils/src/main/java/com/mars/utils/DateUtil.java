package com.mars.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mars
 *
 */
public class DateUtil {
	
	/**
	 * 
	 */
	public static final String DateFormatter = "yyyy-MM-dd HH:mm:ss";

	
	/**
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String formatDate(Date date,String format){
		String dateStr = new SimpleDateFormat(format).format(date);
		return dateStr;
	}
	
}
