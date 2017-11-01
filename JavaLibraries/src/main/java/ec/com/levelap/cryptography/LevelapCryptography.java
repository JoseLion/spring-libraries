package ec.com.levelap.cryptography;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Service;

@Service
public class LevelapCryptography {
	private static final String ALGORITHM = "AES";
	
	public File generateKeyFile() throws NoSuchAlgorithmException, IOException {
		KeyGenerator keygen = KeyGenerator.getInstance(ALGORITHM);
		keygen.init(new SecureRandom());
		SecretKey secretKey = keygen.generateKey();
		
		File file = File.createTempFile("levelapKey", ".tmp");
		FileOutputStream outputStream = new FileOutputStream(file);
		outputStream.write(secretKey.getEncoded());
		outputStream.close();
		
		return file;
	}
	
	public byte[] encrypt(String value, File key) throws GeneralSecurityException, IOException {
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, getKeyFromFile(key));
		return cipher.doFinal(value.getBytes());
	}
	
	public String decrypt(byte[] value, File key) throws GeneralSecurityException, IOException {
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		cipher.init(Cipher.DECRYPT_MODE, getKeyFromFile(key));
		return new String(cipher.doFinal(value));
	}
	
	public SecretKeySpec getKeyFromFile(File key) throws IOException {
		FileInputStream inputStream = new FileInputStream(key);
		byte[] bytes = new byte[(int)key.length()];
		inputStream.read(bytes);
		
		SecretKeySpec specKey = new SecretKeySpec(bytes, ALGORITHM);
		inputStream.close();
		
		return specKey;
	}
}
