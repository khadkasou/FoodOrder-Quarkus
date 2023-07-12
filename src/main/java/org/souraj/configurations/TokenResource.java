package org.souraj.configurations;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/token")
public class TokenResource {
    JwtTokenGenerate generateJwtToken = new JwtTokenGenerate();

    @GET
    public Response getToken() {
        return Response.ok(generateJwtToken.generateToken()).status(200).build();
    }
}