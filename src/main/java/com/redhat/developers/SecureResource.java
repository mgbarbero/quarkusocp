package com.redhat.developers;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.Claims;

@Path("/secure")
public class SecureResource {

    @Claim(standard = Claims.preferred_username)
    String username;

    @RolesAllowed("Not-Subscriber")
    @GET
    @Path("/claim")
    public String getClaim() {
        return username;
    }

}
