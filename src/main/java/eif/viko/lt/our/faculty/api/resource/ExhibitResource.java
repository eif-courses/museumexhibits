package eif.viko.lt.our.faculty.api.resource;

import eif.viko.lt.our.faculty.api.model.Exhibit;
import eif.viko.lt.our.faculty.api.service.ExhibitService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class ExhibitResource {

  @Inject
  ExhibitService service;

  @GET
  @Path("/")
  public Response displayAllExhibits(){
    return Response.ok(service.displayAllItems()).build();
  }

  @POST
  @Path("/")
  @Transactional
  public Response insertNewItem(Exhibit exhibit){
    service.create(exhibit);
    return Response.ok(exhibit).status(Response.Status.CREATED).build();
  }




}
