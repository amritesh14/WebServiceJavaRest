package org.amritesh.singh.webapptest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	
	@GET
	public String test(){
		return "new sub resource";
	}
	
	@GET
	@Path("{commentId}")
	public String getcommentId(@PathParam("messageId") long messageId,@PathParam("commentId") long id){
		return "Method to return comment id : "+id + " message id is :"+messageId;
	}

}
