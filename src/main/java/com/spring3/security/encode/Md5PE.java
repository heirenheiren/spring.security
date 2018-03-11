package com.spring3.security.encode;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Component;

@Component("passwordEncoder")
public final class Md5PE extends Md5PasswordEncoder
{

}
