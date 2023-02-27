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

	public static void main(String[] args) throws Exception {
		String input = "I Love Cambodia";
		String encrypt = Encrypt(input);
		String decrypt = decrypt(encrypt);
		System.out.println("Data Input = " + input);
		System.out.println("Encryption = " + encrypt);
		System.out.println("Decryption = " + decrypt);
	}
}
