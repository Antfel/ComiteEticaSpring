/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.prisma.comiteEtica.ControlDocumentario.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "Sede",
        schema = "dbo",
        catalog = "ComiteEtica"
)
public class Sede {

    @Id
    @Column(name = "IdSede")
    private String idSede;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "IdDepartamento")
    private String idDepartamento;
    @Column(name = "IdProvincia")
    private String idProvincia;
    @Column(name = "IdDistrito")
    private String idDistrito;
    @Column(name = "UsuarioIngresa")
    private String usuarioIngresa;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaIngreso")
    private Date fechaIngreso;
    @Column(name = "UsuarioModifica")
    private String usuarioModifica;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaModificacion")
    private Date fechaModificacion;

    public Sede() {
    }

    public Sede(String idSede, String nombre, String direccion, String idDepartamento, String idProvincia, String idDistrito, String usuarioIngresa, Date fechaIngreso, String usuarioModifica, Date fechaModificacion) {
        this.idSede = idSede;
        this.nombre = nombre;
        this.direccion = direccion;
        this.idDepartamento = idDepartamento;
        this.idProvincia = idProvincia;
        this.idDistrito = idDistrito;
        this.usuarioIngresa = usuarioIngresa;
        this.fechaIngreso = fechaIngreso;
        this.usuarioModifica = usuarioModifica;
        this.fechaModificacion = fechaModificacion;
    }

    public String getIdSede() {
        return idSede;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(String idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getUsuarioIngresa() {
        return usuarioIngresa;
    }

    public void setUsuarioIngresa(String usuarioIngresa) {
        this.usuarioIngresa = usuarioIngresa;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Sede{" + "idSede=" + idSede + ", nombre=" + nombre + ", direccion=" + direccion + ", idDepartamento=" + idDepartamento + ", idProvincia=" + idProvincia + ", idDistrito=" + idDistrito + ", usuarioIngresa=" + usuarioIngresa + ", fechaIngreso=" + fechaIngreso + ", usuarioModifica=" + usuarioModifica + ", fechaModificacion=" + fechaModificacion + '}';
    }

}
