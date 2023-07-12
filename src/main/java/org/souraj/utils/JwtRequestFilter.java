package org.souraj.utils;

import io.smallrye.jwt.auth.principal.JWTParser;
import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.ext.Provider;
import org.souraj.exceptions.CustomExceptions;

import java.io.IOException;
import java.text.ParseException;

@Provider
@PreMatching
public class JwtRequestFilter implements ContainerRequestFilter {


    @Inject
    JWTParser parser;

    public JwtRequestFilter(){

    }
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        if (containerRequestContext.getUriInfo().getAbsolutePath().toString().equals("http://localhost:8848/api/token")) {
            String userName = containerRequestContext.getHeaderString("userName");
            String password = containerRequestContext.getHeaderString("password");
            if (userName == null || password == null)
                throw new CustomExceptions("Please provide username and password");
            if (!(userName.contentEquals("syntech11@gmail.com") && password.contentEquals("Synergy@123")))
                throw new CustomExceptions("Username or password does not matched");
            return;
        }

        try {
            decryptToken(containerRequestContext);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private void decryptToken(ContainerRequestContext containerRequestContext) throws ParseException {
        String bearerToken = containerRequestContext.getHeaderString("Authorization");
        if (bearerToken == null)
            throw new CustomExceptions("Please provide authorization token");


    }

}
