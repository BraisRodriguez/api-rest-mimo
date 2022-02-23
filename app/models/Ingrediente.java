package models;

import Validators.NoVacio;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Ingrediente extends Model {

    private static final Finder<Long,Ingrediente> finder = new Finder<>(Ingrediente.class);

    @Id
    public Long idIngrediente;
    @Constraints.MaxLength(value = 50, message = "error_max_length_ingredientes")
    @Constraints.ValidateWith(NoVacio.class)
    @NotNull(message = "error_not_null_ingredientes")
    private String nombreIngrediente;


    @JsonIgnore
    @Version
    Long version;
    @JsonIgnore
    @WhenCreated
    Timestamp whenCreated;
    @JsonIgnore
    @WhenModified
    Timestamp whenModified;

    @ManyToMany(mappedBy = "ingredientes")
    @JsonBackReference
    public List<Receta> recetas = new ArrayList<>();


    public Ingrediente() {
    }


    public Long getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Long idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
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

    public void addReceta(Receta r){
        this.recetas.add(r);

    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingrediente that = (Ingrediente) o;
        return idIngrediente.equals(that.idIngrediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIngrediente);
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "idIngrediente=" + idIngrediente +
                ", nombreIngrediente='" + nombreIngrediente + '\'' +
                '}';
    }

    public static Ingrediente findIngredienteById(Long id)
    {
        return finder.byId(id);
    }

    public static List<Ingrediente> findListaIngredientesByNombrePage(String nombre, String page)
    {
        int pagina = Integer.valueOf(page);

        int rows = 10*(pagina-1);


        return finder.query()

                .where()
                .isNotNull("idIngrediente")
                .orderBy("nombreIngrediente")
                .setMaxRows(10)
                .setFirstRow(rows)
                .like("nombreIngrediente", "%"+nombre+"%").findList();
    }

    public static List<Ingrediente> findListaIngredientesByNombre(String nombre)
    {



        return finder.query()
                .where()
                .like("nombreIngrediente", "%"+nombre+"%").findList();
    }


    public static Ingrediente findIngredienteByName(String nombre)
    {
        return finder.query()
                .where()
                .like("nombreIngrediente", nombre).findOne();
    }
    public static List<Ingrediente> allIngredientes()
    {
        return finder.all();
    }

    public static List<Ingrediente> allIngredientesPages(String page){

        int pagina = Integer.valueOf(page);

        int rows = 10*(pagina-1);

        return finder.query()
                .where()
                .isNotNull("idIngrediente")
                .orderBy("nombreIngrediente")
                .setMaxRows(10)
                .setFirstRow(rows)
                .findList();
    }
}
