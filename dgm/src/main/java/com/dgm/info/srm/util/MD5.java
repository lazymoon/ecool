/**
 * 
 */
package com.dgm.info.srm.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhengss
 * 2014-12-11下午10:37:47
 */
public class MD5 {
	private static final Logger logger = LoggerFactory.getLogger(MD5.class);
	private static final String MD5VALUE = "Lazy_blog";
	public static String md5(String value) throws NoSuchAlgorithmException { 
		
		MessageDigest md = MessageDigest.getInstance("MD5"); 
		md.update(value.getBytes()); 
		byte b[] = md.digest(); 
		int i; 
		StringBuffer buf = new StringBuffer(); 
		for (int offset = 0; offset < b.length; offset++) { 
			i = b[offset]; 
			if(i<0) i+= 256; 
			if(i<16) buf.append("0"); 
			buf.append(Integer.toHexString(i));
		} 
		return buf.toString();
	} 
}
