package com.marriageonmind.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
