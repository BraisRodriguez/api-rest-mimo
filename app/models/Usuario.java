package models;

import Validators.NoVacio;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Usuario extends Model {

    private static final Finder<Long,Usuario> finder = new Finder<>(Usuario.class);


    @Id
    private Long idUsuario;
    @Constraints.MaxLength(value = 100, message = "user name must have less than 100 characters")
    @Constraints.ValidateWith(NoVacio.class)
    @NotNull(message = "user name can´t be null")
    private String nombreUsuario;
    @Constraints.Email(message = "the email must have the correct format")
    @Constraints.ValidateWith(NoVacio.class)
    @NotNull(message = "email  can´t be null")
    private String correoUsuario;


    @JsonIgnore
    @Version
    Long version;
    @JsonIgnore
    @WhenCreated
    Timestamp whenCreated;
    @JsonIgnore
    @WhenModified
    Timestamp whenModified;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    @JsonManagedReference
    public List<Receta>recetas = new ArrayList<Receta>();


    public Usuario() {
    }


    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public Long getIdUsuario() {
        return idUsuario;
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

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario.equals(usuario.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", correoUsuario='" + correoUsuario + '\'' +
                '}';
    }

    public static List<Usuario> allUsuarios(){
        return finder.all();
    }

    public static List<Usuario> allUsuariosPages(String page){

        int pagina = Integer.valueOf(page);

        int rows = 10*(pagina-1);

        return finder.query()
                .where()
                .isNotNull("idUsuario")
                .orderBy("nombreUsuario")
                .setMaxRows(10)
                .setFirstRow(rows)
                .findList();
    }



    public static Usuario findUsuarioById(String id)
    {
        return finder.byId(Long.valueOf(id));
    }
}
