package br.com.felipe.gde.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	public String getBCrypt(String password) {
		if (password==null) {
			return password;
		}
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.encode(password);		
	}
	
	public boolean validPassword(String password, String passwordEncoded) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.matches(password, passwordEncoded);
	}
	
}
