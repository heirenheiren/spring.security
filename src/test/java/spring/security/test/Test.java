package spring.security.test;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

//import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;

import com.spring3.security.encode.Md5PE;

public class Test
{

	public static void main(String[] args)
	{
		//老版本
		PasswordEncoder pe = new Md5PE();
		String peString = pe.encodePassword("rawPass", "salt");
		System.out.println(peString);
		System.out.println(pe.isPasswordValid("d36da5a4c347fe5dae18d5244e77ee2d", "rawPass", "salt"));
		
		//新版本
		/*PasswordEncoder pe = new BCryptPasswordEncoder();
		System.out.println(pe.encode("rawPassword"));
		System.out.println(pe.matches("rawPassword", "$2a$10$sBfYfkilV8GxeEHPvI/Hy.bUIt4uju.xLU6TJn0pmAvUj4Di3gVgW"));*/
	}

}
