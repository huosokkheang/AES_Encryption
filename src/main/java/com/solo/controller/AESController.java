package com.solo.controller;

import com.solo.util.BCryption;

public class AESController {
	
	public static void main(String[] args) throws Exception {
		String input = "I Love Cambodia";
		String encrypt = BCryption.Encrypt(input);
		String decrypt = BCryption.decrypt(encrypt);
		System.out.println("Data Input = " + input);
		System.out.println("Encryption = " + encrypt);
		System.out.println("Decryption = " + decrypt);
	}

}
