package org.souraj.configurations;


import io.smallrye.jwt.build.Jwt;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;

public class JwtTokenGenerate {

    public String generateToken(){

        return Jwt.issuer("https://example.com/issuer")
                .upn("syntech11@gmail.com")
                .groups(new HashSet<>(Arrays.asList("Admin", "User")))
                .issuedAt(Instant.now())
                .expiresAt(Instant.now().plusSeconds(5000))
                .subject("token to access api")
                .sign();
    }
}
