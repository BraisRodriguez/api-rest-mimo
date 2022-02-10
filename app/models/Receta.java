package models;

import Validators.NoVacio;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.Length;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Receta extends Model {

    @Id
    public Long idReceta;

    @Size(min = 1, max = 150, message = "recepe name can´t cant have more than 150 characters")
    @NotNull(message = "recepe name can´t be null")
    private String nombreReceta;


    @NotNull(message = "recepe description  can´t be null")
    private String descripcionReceta;

    @JsonIgnore
    @Version
    Long version;
    @JsonIgnore
    @WhenCreated
    Timestamp whenCreated;
    @JsonIgnore
    @WhenModified
    Timestamp whenModified;

    @ManyToMany(cascade= CascadeType.ALL)
    @JsonManagedReference
    public List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    @ManyToOne
    @JsonBackReference
    public Usuario usuario;



    private static final Finder<Long,Receta> finder = new Finder<>(Receta.class);


    public Receta() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Long idReceta) {
        this.idReceta = idReceta;
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Timestamp getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(Timestamp whenCreated) {
        this.whenCreated = whenCreated;
    }

    public Timestamp getWhenModified() {
        return whenModified;
    }

    public void setWhenModified(Timestamp whenModified) {
        this.whenModified = whenModified;
    }

    public void addIngrediente(Ingrediente i)
    {
        this.ingredientes.add(i);
        i.addReceta(this);
    }


    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receta receta = (Receta) o;
        return idReceta.equals(receta.idReceta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReceta);
    }

    @Override
    public String toString() {
        return "Receta{" +
                "idReceta=" + idReceta +
                ", nombreReceta='" + nombreReceta + '\'' +
                ", descripcionReceta='" + descripcionReceta + '\'' +
                '}';
    }

    public static Receta findRecetaByName(String nombre)
    {
        return finder.query()
                .where()
                .like("nombreReceta", nombre).findOne();
    }

    public static Receta findRecetaById(String id)
    {
        return finder.byId(Long.valueOf(id));
    }


    public static List<Receta> allRecetas(){
        return finder.all();
    }

    public static List<Receta> allRecetasPages(String page){

        int pagina = Integer.valueOf(page);

        int rows = 10*(pagina-1);

        return finder.query()
                .where()
                .isNotNull("idReceta")
                .orderBy("nombreReceta")
                .setMaxRows(10)
                .setFirstRow(rows)
                .findList();
    }

    public static List<Receta> findListaRecetasByNombre(String nombre)
    {
        return finder.query()
                .where()
                .like("nombreReceta", "%"+nombre+"%").findList();
    }



}
