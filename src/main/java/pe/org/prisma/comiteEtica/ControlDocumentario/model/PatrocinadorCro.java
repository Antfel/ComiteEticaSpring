/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.prisma.comiteEtica.ControlDocumentario.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
@Table(name = "PatrocinadorCro",
        schema = "dbo",
        catalog = "ComiteEtica"
)
public class PatrocinadorCro {

    @EmbeddedId
    private PatrocinadorCroId id;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Observacion")
    private String observacion;
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

    public PatrocinadorCro() {
    }

    public PatrocinadorCro(PatrocinadorCroId id, String descripcion, String observacion, String usuarioIngresa, Date fechaIngreso, String usuarioModifica, Date fechaModificacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.observacion = observacion;
        this.usuarioIngresa = usuarioIngresa;
        this.fechaIngreso = fechaIngreso;
        this.usuarioModifica = usuarioModifica;
        this.fechaModificacion = fechaModificacion;
    }

    public PatrocinadorCroId getId() {
        return id;
    }

    public void setId(PatrocinadorCroId id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
        return "PatrocinadorCro{" + "id=" + id + ", descripcion=" + descripcion + ", observacion=" + observacion + ", usuarioIngresa=" + usuarioIngresa + ", fechaIngreso=" + fechaIngreso + ", usuarioModifica=" + usuarioModifica + ", fechaModificacion=" + fechaModificacion + '}';
    }

}
