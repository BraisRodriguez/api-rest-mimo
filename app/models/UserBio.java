package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import java.sql.Timestamp;

@Entity
public class UserBio extends Model {

    private static final Finder<Long,UserBio> finder = new Finder<>(UserBio.class);

    @Id
    private Long idUserBio;

    @Constraints.Required(message = "error_pais")
    private String pais;
    @Constraints.Required(message = "error_anoNacimento")
    @Constraints.Min(value = 1900, message = "error_rango_anoNacimiento")
    private Integer anoNacimiento;

    @OneToOne(mappedBy="userBio")
    @JsonBackReference
    private Usuario usuarioPadre;


    public UserBio() {
    }



    @JsonIgnore
    @Version
    Long version;
    @JsonIgnore
    @WhenCreated
    Timestamp whenCreated;
    @JsonIgnore
    @WhenModified
    Timestamp whenModified;


    public Long getIdUserBio() {
        return idUserBio;
    }

    public void setIdUserBio(Long idUserBio) {
        this.idUserBio = idUserBio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getAñoNacimiento() {
        return anoNacimiento;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.anoNacimiento = añoNacimiento;
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


    public Usuario getUsuarioPadre() {
        return usuarioPadre;
    }

    public void setUsuarioPadre(Usuario usuarioPadre) {
        this.usuarioPadre = usuarioPadre;
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
}
