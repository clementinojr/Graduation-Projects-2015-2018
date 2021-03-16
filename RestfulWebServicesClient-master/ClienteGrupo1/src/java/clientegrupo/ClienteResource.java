/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientegrupo;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import cliente.DAO.ClienteDAO;
import cliente.classes.Cliente;


/**
 * REST Web Service
 *
 * @author DELL-Fabio
 */
@Path("cliente")
public class ClienteResource {

    private Gson gson = new Gson();    

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AlunoResource
     */
    public ClienteResource() {
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("consultar/{idcliente}")    
    public String getCliente(@PathParam("idcliente") int idcliente) {
        //TODO return proper representation object
        Cliente a = new Cliente();
        ClienteDAO dao = new ClienteDAO();
        try{
            a = dao.retornaCliente(idcliente);
            System.out.println(a.getCidade());
            return gson.toJson(a);
        }catch (Exception e) {
            return "nao deu";
        }
    }
        
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listaCliente")    
    public String getAluno() {
        //TODO return proper representation object
        List<Cliente> lista = new ArrayList();
        ClienteDAO dao = new ClienteDAO();
        try{
            lista = dao.listaCliente();
            return gson.toJson(lista);
        }catch (Exception e) {
            return "não deu bom";
        }
    }

    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON) 
    public String alterar(String dados) {
        String erro = "ok";
        ClienteDAO dao = new ClienteDAO();
        try {
            Cliente a = gson.fromJson(dados, Cliente.class );
            erro = dao.alterar(a);
            
        } catch (Exception e) {
           erro = e.getMessage();
        }
        finally
        {
            return erro;
        }
    }
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("inserir")
    public String inserir(String dados) {
        String erro = "ok";
        ClienteDAO dao = new ClienteDAO();
        try {
            Cliente a = gson.fromJson(dados, Cliente.class );
            erro = dao.inserir(a);
            
        } catch (Exception e) {
           erro = e.getMessage();
        }
        finally
        {
            return erro;
        }
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Path("remove/{idcliente}")
    public String deletar(@PathParam("idcliente") int idcliente) {
        //TODO return proper representation object
        
        ClienteDAO dao = new ClienteDAO();
        String retorno = "não deu bom";
        try{
            int res = dao.delete(idcliente);  
            if (res == 1)
            {
                retorno = "deu bom";
            }
        }catch (Exception e) {
           e.getMessage();
        } 
        return retorno;
    }    
    
}
