package models;

import Validators.NoVacio;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RecetaData {



    @Constraints.Required(message = "mdmdmd")
    private String nombreReceta;

    private String descripcionReceta;

    public List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    public String idUsuario;

    public RecetaData() {
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getDescripcionReceta() {
        return descripcionReceta;
    }

    public void setDescripcionReceta(String descripcionReceta) {
        this.descripcionReceta = descripcionReceta;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "RecetaData{" +
                "nombreReceta='" + nombreReceta + '\'' +
                ", descripcionReceta='" + descripcionReceta + '\'' +
                ", ingredientes=" + ingredientes +
                ", idUsuario='" + idUsuario + '\'' +
                '}';
    }
}
