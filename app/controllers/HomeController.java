package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Ingrediente;
import models.Receta;
import models.RecetaData;
import models.Usuario;
import play.cache.SyncCacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.Messages;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.mvc.*;
import play.twirl.api.Content;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Inject
    FormFactory formFactory;

    @Inject
    MessagesApi messagesApi;

    @Inject
    private SyncCacheApi cache;




    public Result getAllRecepes(Http.Request request) {

        String page = request.queryString("page").orElse("1");
        if(Integer.valueOf(page)<=0)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_numero_pagina_menor_0");
            result.put("resultMessage", error);
            return Results.badRequest(result);

        }

        List<Receta>allRecetas = Receta.allRecetas();

        List<Receta> allRecetasPages = Receta.allRecetasPages(page);


        if (request.accepts("application/xml")) {
            Content content = views.xml.recetas.render(allRecetasPages);
            return ok(content)
                    .withHeader("allRecepesListSize", allRecetas.size() + "")
                    .withHeader("pageSize", allRecetasPages.size() + "")
                    .withHeader("page", page)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode result = Json.toJson(allRecetasPages);

            return ok(result)
                    .withHeader("allRecepesListSize", allRecetas.size() + "")
                    .withHeader("pageSize", allRecetasPages.size() + "")
                    .withHeader("page", page)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }

    }

    public Result getAllIngredients(Http.Request request) {

        String page = request.queryString("page").orElse("1");
        if(Integer.valueOf(page)<=0)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_numero_pagina_menor_0");
            result.put("resultMessage", error);
            return Results.badRequest(result);

        }

        List<Ingrediente>allIngredients = Ingrediente.allIngredientes();

        List<Ingrediente> allIngredientesPages = Ingrediente.allIngredientesPages(page);

        if (request.accepts("application/xml")) {
            Content content = views.xml.ingredientes.render(allIngredientesPages);
            return ok(content)
                    .withHeader("allIngredientsListSize", allIngredients.size() + "")
                    .withHeader("pageSize", allIngredientesPages.size() + "")
                    .withHeader("page", page)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode result = Json.toJson(allIngredientesPages);

            return ok(result)
                    .withHeader("allIngredientsListSize", allIngredients.size() + "")
                    .withHeader("pageSize", allIngredientesPages.size() + "")
                    .withHeader("page", page)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            result.put("resultMessage", "error_formato_no_soportado");
            return Results.status(406, result);
        }





    }

    public Result getAllUsers(Http.Request request) {

        String page = request.queryString("page").orElse("1");
        if(Integer.valueOf(page)<=0)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_numero_pagina_menor_0");
            result.put("resultMessage", error);
            return Results.badRequest(result);

        }

        List<Usuario>allUsuarios = Usuario.allUsuarios();

        List<Usuario> allUsuariosPages = Usuario.allUsuariosPages(page);

        if (request.accepts("application/xml")) {
            Content content = views.xml.usuarios.render(allUsuariosPages);
            return ok(content)
                    .withHeader("allUsersListSize", allUsuarios.size() + "")
                    .withHeader("pageSize", allUsuariosPages.size() + "")
                    .withHeader("page", page)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode result = Json.toJson(allUsuariosPages);

            return ok(result)
                    .withHeader("allUsersListSize", allUsuarios.size() + "")
                    .withHeader("pageSize", allUsuariosPages.size() + "")
                    .withHeader("page", page)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }





    }


    public Result getOneRecepe(Http.Request request, String recepeId) {

        Receta receta;
        Optional<Receta> recetaCache  = cache.get("recepeId:"+recepeId);

        Receta recetafromCache = recetaCache.orElse(null);
        if(recetafromCache == null)
        {
            receta = Receta.findRecetaById(recepeId);
            cache.set("recepeId:"+recepeId, receta);
        }

        else
        {
            receta = recetafromCache;
        }

            if ( receta != null) {


                if (request.accepts("application/xml")) {
                    Content content = views.xml.receta.render(receta);
                    return ok(content)
                            .as("application/xml");
                } else if (request.accepts("application/json")) {

                    JsonNode node = Json.toJson(receta);

                    return ok(node)
                            .as("application/json");

                } else {
                    ObjectNode result = Json.newObject();
                    Messages messages = messagesApi.preferred(request);
                    String error = messages.at("error_formato_no_soportado");
                    result.put("resultMessage", error);
                    return Results.status(406, result);
                }
        }


        ObjectNode result = Json.newObject();
        Messages messages = messagesApi.preferred(request);
        String error = messages.at("error_receta_no_encontrada");
        result.put("resultMessage", error);
        return Results.notFound(result);
    }

    public Result getOneIngredient(Http.Request request, String ingredientId) {


        Ingrediente ingredieteFound;
        Optional<Ingrediente> ingredienteCache  = cache.get("ingredientId:"+ingredientId);

        Ingrediente ingredienteFromCache = ingredienteCache.orElse(null);
        if(ingredienteFromCache == null)
        {
            ingredieteFound = Ingrediente.findIngredienteById(Long.valueOf(ingredientId));
            cache.set("ingredientId:"+ingredientId, ingredieteFound);
        }

        else
        {
            ingredieteFound = ingredienteFromCache;
        }


        if(ingredieteFound==null)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_ingrediente_no_encontrado");
            result.put("resultMessage", error);
            return Results.notFound(result);
        }else
        {
            if (request.accepts("application/xml")) {
                Content content = views.xml.ingrediente.render(ingredieteFound);
                return ok(content)
                        .as("application/xml");
            } else if (request.accepts("application/json")) {

                JsonNode node = Json.toJson(ingredieteFound);

                return ok(node)
                        .as("application/json");

            } else {
                ObjectNode result = Json.newObject();
                Messages messages = messagesApi.preferred(request);
                String error = messages.at("error_formato_no_soportado");
                result.put("resultMessage", error);
                return Results.status(406, result);
            }
        }




    }

    public Result getOneUser(Http.Request request, String userId) {

        Usuario usuario;
        Optional<Usuario> usuarioCache  = cache.get("userId:"+userId);

        Usuario usuarioFromCache = usuarioCache.orElse(null);
        if(usuarioFromCache == null)
        {
            usuario = Usuario.findUsuarioById(userId);
            cache.set("userId:"+userId, userId);
        }

        else
        {
            usuario = usuarioFromCache;
        }




        if ( usuario != null) {


            if (request.accepts("application/xml")) {
                Content content = views.xml.usuario.render(usuario);
                return ok(content)
                        .as("application/xml");
            } else if (request.accepts("application/json")) {

                JsonNode node = Json.toJson(usuario);

                return ok(node)
                        .as("application/json");

            } else {
                ObjectNode result = Json.newObject();
                Messages messages = messagesApi.preferred(request);
                String error = messages.at("error_formato_no_soportado");
                result.put("resultMessage", error);
                return Results.status(406, result);
            }
        }

        ObjectNode result = Json.newObject();
        Messages messages = messagesApi.preferred(request);
        String error = messages.at("error_usuario_no_encontrado");
        result.put("resultMessage", error);
        return Results.notFound(result);
    }


    public Result crearRecepe(Http.Request request) {

        Receta recetaIntermedia =  new Receta();
        Receta recetaFD =  new Receta();
        List<Ingrediente>ingredientesExisten = new ArrayList<Ingrediente>();
        List<Ingrediente>ingredientesNoExisten = new ArrayList<Ingrediente>();
        JsonNode inputJson = request.body().asJson();

        if (inputJson == null) {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_null_body");
            result.put("resultMessage", error);
            return Results.status(400, result);

        }


//        String idReceta = request.queryString("idReceta").orElse("SIN VALOR");
//        String nombreReceta = request.queryString("nombreReceta").orElse("SIN VALOR");
//        String descripcionReceta = request.queryString("descripcionReceta").orElse("SIN VALOR");

//        String idReceta = inputJson.get("idReceta").asText();
//        String nombreReceta = inputJson.get("nombreReceta").asText();
//        String descripcionReceta = inputJson.get("descripcionReceta").asText();


//        Receta newReceta = new Receta();
//        newReceta.setIdReceta(idReceta);
//        newReceta.setNombreReceta(nombreReceta);
//        newReceta.setDescripcionReceta(descripcionReceta);

        Form<RecetaData> recetaForm = formFactory.form(RecetaData.class).bindFromRequest(request);

        if (recetaForm.hasErrors()) {
            JsonNode errors = recetaForm.errorsAsJson();
            return Results.notAcceptable(errors);
        }


        RecetaData recetaF = recetaForm.get();
        if(recetaF.getNombreReceta() == null || recetaF.getNombreReceta() == "")
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_nombre_receta_notnull_or_empty");
            result.put("resultMessage", error);
            return Results.notAcceptable(result);
        }
        if(recetaF.getNombreReceta().length()>150)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_nombre_receta_menor_150_chars");
            result.put("resultMessage", error);
            return Results.notAcceptable(result);
        }

        if(recetaF.getDescripcionReceta() == null || recetaF.getDescripcionReceta() == "")
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_descripcion_receta_notnul_or_empty");
            result.put("resultMessage", error);
            return Results.notAcceptable(result);
        }

        recetaFD.setNombreReceta(recetaF.getNombreReceta());
        recetaFD.setDescripcionReceta(recetaF.getDescripcionReceta());
        recetaFD.setIngredientes(recetaF.getIngredientes());
        Usuario creador = Usuario.findUsuarioById(recetaF.getIdUsuario()) ;

        if (creador == null || recetaF.getIdUsuario() == "") {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_userId_propiedad_receta");
            result.put("resultMessage", error);
            return Results.status(400, result);

        }




        if(Receta.findRecetaByName(recetaFD.getNombreReceta())==null)
        {

            for(Ingrediente i: recetaFD.getIngredientes())
            {
                Ingrediente ingre = Ingrediente.findIngredienteByName(i.getNombreIngrediente());
                if(ingre==null)
                {
                    ingredientesNoExisten.add(i);
                }
                else{
                    ingredientesExisten.add(ingre);
                }
            }



            recetaIntermedia.setNombreReceta(recetaFD.getNombreReceta());
            recetaIntermedia.setDescripcionReceta(recetaFD.getDescripcionReceta());
            recetaIntermedia.setIngredientes(ingredientesNoExisten);

            recetaIntermedia.save();

            recetaIntermedia.ingredientes.addAll(ingredientesExisten);
            recetaIntermedia.setUsuario(creador);

            recetaIntermedia.update();



        }else
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_receta_ya_existe");
            result.put("resultMessage", error);
            return Results.badRequest(result);
        }


        if (request.accepts("application/xml")) {
            Content content = views.xml.receta.render(recetaIntermedia);
            return ok(content)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode result = Json.toJson(recetaIntermedia);

            return ok(result)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }


    }

    public Result crearIngredient(Http.Request request) {

        JsonNode inputJson = request.body().asJson();

        if (inputJson == null) {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_null_body");
            result.put("resultMessage", error);
            return Results.status(400, result);

        }


//        String idIngrediente = request.queryString("idIngrediente").orElse("SIN VALOR");
//        String nombreIngrediente = request.queryString("nombreIngrediente").orElse("SIN VALOR");
//
//
//        Ingrediente newIngrediente = new Ingrediente();
//        newIngrediente.setIdIngrediente(idIngrediente);
//        newIngrediente.setNombre(nombreIngrediente);


        Form<Ingrediente> ingredienteForm = formFactory.form(Ingrediente.class).bindFromRequest(request);


        if (ingredienteForm.hasErrors()) {
            JsonNode errors = ingredienteForm.errorsAsJson();
            return Results.notAcceptable(errors);
        }

        Ingrediente ingredienteF = ingredienteForm.get();

        if(Ingrediente.findIngredienteByName(ingredienteF.getNombreIngrediente())==null){
            ingredienteF.save();
        }
        else
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_ingrediente_ya_existe");
            result.put("resultMessage", error);
            return Results.status(400, result);
        }

        if (request.accepts("application/xml")) {
            Content content = views.xml.ingrediente.render(ingredienteF);
            return ok(content)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode node = Json.toJson(ingredienteF);

            return Results.created(node)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }




    }

    public Result crearUser(Http.Request request) {

        JsonNode inputJson = request.body().asJson();

        if (inputJson == null) {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_null_body");
            result.put("resultMessage", error);
            return Results.status(400, result);

        }

//        String idUsuario = request.queryString("idUsuario").orElse("SIN VALOR");
//        String nombreUsuario = request.queryString("nombreUsuario").orElse("SIN VALOR");
//        String correoUsuario = request.queryString("correoUsuario").orElse("SIN VALOR");
//
//
//        Usuario newUsuario = new Usuario();
//        newUsuario.setIdUsuario(idUsuario);
//        newUsuario.setNombreUsuario(nombreUsuario);
//        newUsuario.setCorreoUsuario(correoUsuario);

        Form<Usuario> usuarioForm = formFactory.form(Usuario.class).bindFromRequest(request);


        if (usuarioForm.hasErrors()) {
            JsonNode errors = usuarioForm.errorsAsJson();
            return Results.notAcceptable(errors);
        }

        Usuario usuarioF = usuarioForm.get();

        if(Ingrediente.findIngredienteByName(usuarioF.getNombreUsuario())==null){
            usuarioF.save();
        }
        else
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_usuario_ya_existe");
            result.put("resultMessage", error);
            return Results.status(400, result);
        }

        if (request.accepts("application/xml")) {
            Content content = views.xml.usuario.render(usuarioF);
            return ok(content)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode node = Json.toJson(usuarioF);

            return Results.created(node)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }





    }


    public Result deleteRecepe(Http.Request request, String recepeId) {

        Receta receta = Receta.findRecetaById(recepeId);

        if(receta != null)
        {
            receta.delete();
            return Results.ok();
        }else
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_receta_no_encontrada");
            result.put("resultMessage", error);
            return Results.notFound(result);
        }

    }

    public Result deleteIngredient(Http.Request request, String ingredienteId) {
        Ingrediente ingrediente = Ingrediente.findIngredienteById(Long.valueOf(ingredienteId));

        if(ingrediente != null)
        {
            ingrediente.delete();
            return Results.ok();
        }else
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_ingrediente_no_encontrado");
            result.put("resultMessage", error);
            return Results.notFound(result);
        }
    }

    public Result deleteUser(Http.Request request, String userId) {

        Usuario usuario = Usuario.findUsuarioById(userId);

        if(usuario != null)
        {
            usuario.delete();
            return Results.ok();
        }else
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_usuario_no_encontrado");
            result.put("resultMessage", error);
            return Results.notFound(result);
        }
    }


    public Result getListIngredientesByNameSelected(Http.Request request, String ingredientName) {

        String page = request.queryString("page").orElse("1");
        if(Integer.valueOf(page)<=0)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_numero_pagina_menor_0");
            result.put("resultMessage", error);
            return Results.badRequest(result);

        }

        List<Ingrediente> listaIngredientestotal = Ingrediente.findListaIngredientesByNombre(ingredientName);
        List<Ingrediente> listaIngredientesPages = Ingrediente.findListaIngredientesByNombrePage(ingredientName, page);

        if(listaIngredientesPages.size()==0)
        {
            ObjectNode result = Json.newObject();
            result.put("resultMessage", "error_no_se_encientran_ingredientes_con_ese_nombre");
            return Results.notFound(result);
        }

        if (request.accepts("application/xml")) {
            Content content = views.xml.ingredientes.render(listaIngredientesPages);
            return ok(content)
                    .withHeader("allIngredientsListSize", listaIngredientestotal.size() + "")
                    .withHeader("pageSize", listaIngredientesPages.size() + "")
                    .withHeader("page", page)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode node = Json.toJson(listaIngredientesPages);

            return ok(node)
                    .withHeader("allIngredientsListSize", listaIngredientestotal.size() + "")
                    .withHeader("pageSize", listaIngredientesPages.size() + "")
                    .withHeader("page", page)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            result.put("resultMessage", "error_formato_no_soportado");
            return Results.status(406, result);
        }



    }

    public Result getIngredienteByNameLiteral(Http.Request request, String ingredientName) {


        Ingrediente ingrediente = Ingrediente.findIngredienteByName(ingredientName);

        if(ingrediente == null)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_no_se_encuentra_ingrediente_con_ese_nombre_literal");
            result.put("resultMessage", error);
            return Results.notFound(result);
        }

        if (request.accepts("application/xml")) {
            Content content = views.xml.ingrediente.render(ingrediente);
            return ok(content)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode node = Json.toJson(ingrediente);

            return ok(node)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }

    }

    public Result getListRecetasByNameSelected(Http.Request request, String recepeName){

        String page = request.queryString("page").orElse("1");
        if(Integer.valueOf(page)<=0)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_numero_pagina_menor_0");
            result.put("resultMessage", error);
            return Results.badRequest(result);

        }
        List<Receta> listaRecetastotal = Receta.findListaRecetasByNombre(recepeName);

        List<Receta> listaRecetasPages = Receta.findListaRecetasByNombrePage(recepeName, page);

        if(listaRecetasPages.size()==0)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_no_se_encientran_ingredientes_con_ese_nombre");
            result.put("resultMessage", error);
            return Results.notFound(result);
        }

        if (request.accepts("application/xml")) {
            Content content = views.xml.recetas.render(listaRecetasPages);
            return ok(content)
                    .withHeader("allRecepesListSize", listaRecetastotal.size() + "")
                    .withHeader("pageSize", listaRecetasPages.size() + "")
                    .withHeader("page", page)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode node = Json.toJson(listaRecetasPages);

            return ok(node)
                    .withHeader("allRecepesListSize", listaRecetastotal.size() + "")
                    .withHeader("pageSize", listaRecetasPages.size() + "")
                    .withHeader("page", page)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }
    }

    public Result getListRecetaByNameLiteral(Http.Request request, String recepeName) {

        Receta receta = Receta.findRecetaByName(recepeName);

        if(receta == null)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_no_se_encuentra_receta_con_ese_nombre_literal");
            result.put("resultMessage", error);
            return Results.notFound(result);
        }

        if (request.accepts("application/xml")) {
            Content content = views.xml.receta.render(receta);
            return ok(content)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode node = Json.toJson(receta);

            return ok(node)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }

    }

    //lista recetas por usuario (por id)

    public Result getListaRecetasUsuario(Http.Request request, String userId){


        List<Receta> recetas = new ArrayList<Receta>();



           Usuario usuario = Usuario.findUsuarioById(userId);


        if(usuario==null)
        {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_usuario_no_encontrado");
            result.put("resultMessage", error);
            return Results.notFound(result);
        }

//        recetas = usuario.getRecetas();
//
//        paginas  = (recetas.size()/10)+1;
//
//
//        recetasPagina = recetas.subList(0, 9);
//
//        if( Integer.valueOf(page) > paginas)
//        {
//            ObjectNode result = Json.newObject();
//            Messages messages = messagesApi.preferred(request);
//            String error = messages.at("error_pagina_no_existe");
//            result.put("resultMessage", error);
//            return Results.badRequest(result);
//        }
//
//
//
//        if (request.accepts("application/xml")) {
//            Content content = views.xml.recetas.render(recetasPagina);
//            return ok(content)
//                    .withHeader("allRecepesListSize", recetas.size() + "")
//                    .withHeader("pageSize", recetasPagina.size() + "")
//                    .withHeader("page", page)
//                    .as("application/xml");
//        } else if (request.accepts("application/json")) {
//
//            JsonNode node = Json.toJson(recetasPagina);
//
//            return ok(node)
//                    .withHeader("allRecepesListSize", recetas.size() + "")
//                    .withHeader("pageSize", recetasPagina.size() + "")
//                    .withHeader("page", page)
//                    .as("application/json");
//
//        } else {
//            ObjectNode result = Json.newObject();
//            Messages messages = messagesApi.preferred(request);
//            String error = messages.at("error_formato_no_soportado");
//            result.put("resultMessage", error);
//            return Results.status(406, result);
//        }

        recetas = usuario.getRecetas();




        if (request.accepts("application/xml")) {
            Content content = views.xml.recetas.render(recetas);
            return ok(content)
                    .as("application/xml");
        } else if (request.accepts("application/json")) {

            JsonNode node = Json.toJson(recetas);

            return ok(node)
                    .as("application/json");

        } else {
            ObjectNode result = Json.newObject();
            Messages messages = messagesApi.preferred(request);
            String error = messages.at("error_formato_no_soportado");
            result.put("resultMessage", error);
            return Results.status(406, result);
        }



    }




}
