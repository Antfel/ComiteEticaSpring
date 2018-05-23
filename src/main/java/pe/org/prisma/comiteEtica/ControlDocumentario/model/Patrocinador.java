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
@Table(name = "Patrocinador",
        schema = "dbo",
        catalog = "ComiteEtica"
)
public class Patrocinador {

    @Id
    @Column(name = "IdPatrocinador")
    private String idPatrocinador;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "RazonSocial")
    private String razonSocial;
    @Column(name = "Ruc")
    private String ruc;
    @Column(name = "Direccion")
    private String direccion;
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

    public Patrocinador() {
    }

    public Patrocinador(String idPatrocinador, String nombre, String razonSocial, String ruc, String direccion, String usuarioIngresa, Date fechaIngreso, String usuarioModifica, Date fechaModificacion) {
        this.idPatrocinador = idPatrocinador;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.direccion = direccion;
        this.usuarioIngresa = usuarioIngresa;
        this.fechaIngreso = fechaIngreso;
        this.usuarioModifica = usuarioModifica;
        this.fechaModificacion = fechaModificacion;
    }

    public String getIdPatrocinador() {
        return idPatrocinador;
    }

    public void setIdPatrocinador(String idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        return "Patrocinador{" + "idPatrocinador=" + idPatrocinador + ", nombre=" + nombre + ", razonSocial=" + razonSocial + ", ruc=" + ruc + ", direccion=" + direccion + ", usuarioIngresa=" + usuarioIngresa + ", fechaIngreso=" + fechaIngreso + ", usuarioModifica=" + usuarioModifica + ", fechaModificacion=" + fechaModificacion + '}';
    }

}
