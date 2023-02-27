package com.solo.util;

import com.core.util.AES.SCrypto;

public class BCryption {
	
	private static String secretKey = "ilovecambodiayouilovecambodiayou";
	
	public static String Encrypt(String dataInput) throws Exception {
		return SCrypto.KencryptCode(dataInput, secretKey);
	}
	
	public static String decrypt(String encryptionString) throws Exception {
		return SCrypto.KdecryptCode(encryptionString, secretKey);
	}
}
