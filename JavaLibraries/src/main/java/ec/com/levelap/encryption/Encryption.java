package ec.com.levelap.encryption;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Encryption {

	private static Map<String, String> encryptionTable;
	private static Map<String, String> decryptionTable;

	static {
		encryptionTable = new HashMap<>();
		encryptionTable.put("0", "C");
		encryptionTable.put("1", "K");
		encryptionTable.put("2", "Q");
		encryptionTable.put("3", "E");
		encryptionTable.put("4", "M");
		encryptionTable.put("5", "S");
		encryptionTable.put("6", "G");
		encryptionTable.put("7", "O");
		encryptionTable.put("8", "U");
		encryptionTable.put("9", "I");

		decryptionTable = new HashMap<>();
		decryptionTable.put("C", "0");
		decryptionTable.put("K", "1");
		decryptionTable.put("Q", "2");
		decryptionTable.put("E", "3");
		decryptionTable.put("M", "4");
		decryptionTable.put("S", "5");
		decryptionTable.put("G", "6");
		decryptionTable.put("O", "7");
		decryptionTable.put("U", "8");
		decryptionTable.put("I", "9");
	}

	private String randomDigit() {
		Random random = new Random();
		String cadenaAleatoria = String.valueOf(random.nextInt(9));
		return cadenaAleatoria;
	}

	public String encryptCode(Long code, Integer quantity) {
		StringBuilder encryptCode = new StringBuilder();
		String encrypt = String.valueOf(code);
		for (int i = 0; i < quantity - encrypt.length(); i++) {
			encryptCode.append(randomDigit());
		}
		for (int i = 0; i < encrypt.length(); i++) {
			encryptCode.append(encryptionTable.get(String.valueOf(encrypt.charAt(i))));
		}
		encryptCode.append(randomDigit());
		return encryptCode.toString();
	}

	public Long decryptCode(String code) {
		StringBuilder decryptCode = new StringBuilder();
		for (int i = 0; i < code.length(); i++) {
			if (decryptionTable.containsKey(String.valueOf(code.charAt(i)))) {
				decryptCode.append(decryptionTable.get(String.valueOf(code.charAt(i))));
			}
		}
		return Long.valueOf(decryptCode.toString());
	}

}
