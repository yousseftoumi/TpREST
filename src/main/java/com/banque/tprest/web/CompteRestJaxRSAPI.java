package com.banque.tprest.web;

import com.banque.tprest.entities.Compte;
import com.banque.tprest.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("banque")
public class CompteRestJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> CompteList(){
        return compteRepository.findAll();
    }

    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte getCompte(@PathParam(value = "id") Long id){
        return compteRepository.findById(id).get();
    }
    @Path("/comptes/save")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Compte save(Compte Compte){
        return compteRepository.save(Compte);
    }

    @Path("/comptes/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte Compte,@PathParam(value="id")Long id){
        Compte.setId(id);
        return compteRepository.save(Compte);
    }


    @Path("/delete/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam(value = "id") Long id){
        compteRepository.deleteById(id);
    }
}