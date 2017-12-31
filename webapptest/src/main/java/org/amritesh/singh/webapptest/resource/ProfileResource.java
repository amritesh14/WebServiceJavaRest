package org.amritesh.singh.webapptest.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.amritesh.singh.webapptest.model.Profile;
import org.amritesh.singh.webapptest.service.ProfileService;

@Path("/profiles")
public class ProfileResource {
	
	private ProfileService profileService = new ProfileService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getProfile(){
		
		return profileService.getAllProfile();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile addMessage(Profile profile){
		return profileService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile updateProfile(@PathParam("profileName") String name ,Profile profile){
		profile.setFirstname(name);
		return profileService.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{profileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteProfile(@PathParam("profileName") String name){
		profileService.removeProfile(name);
		return "successfully deleted at index = "+name;
		
	}
	
	@GET
	@Path("/{profileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfile(@PathParam("profileName") String name){
		return profileService.getProfile(name);
	}

}
