package org.souraj.configurations;


import io.smallrye.jwt.build.Jwt;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;

public class JwtTokenGenerate {

    public String generateToken(){

        return Jwt.issuer("https://example.com/issuer")
                .upn("khadkasouraj17@gmail.com")
                .groups(new HashSet<>(Arrays.asList("User", "Admin")))
                .issuedAt(Instant.now())
                .expiresAt(Instant.now().plusSeconds(8844))
                .subject("token to access api")
                .sign();
    }
}
