# AES_Encryption
Doc: https://huosokkheang.github.io/Solo-Framework

public static void main(String[] args) throws Exception {
  String input = "I Love Cambodia";
  String encrypt = Encrypt(input);
  String decrypt = decrypt(encrypt);
  System.out.println("Data Input = " + input);
  System.out.println("Encryption = " + encrypt);
  System.out.println("Decryption = " + decrypt);
}
