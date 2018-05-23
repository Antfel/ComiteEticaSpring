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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "Investigacion",
        schema = "dbo",
        catalog = "ComiteEtica"
)
public class Investigacion {
    
    @Id
    @Column(name = "IdInvestigacion")
    private String idInvestigacion;
    @ManyToOne
    @JoinColumn(name = "idCro")
    private Cro cro;
    @ManyToOne
    @JoinColumn(name = "idPatrocinador")
    private Patrocinador patrocinador;
    @Column(name = "Patrocinador")
    private String protocolo;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "ParamEspecialidad")
    private String paramEspecialidad;
    @Column(name = "ParamFase")
    private String paramFase;
    @Column(name = "ParamTipoInvestigacion")
    private String paramTipoInvestigacion;
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

    public Investigacion(String idInvestigacion, Cro cro, Patrocinador patrocinador, String protocolo, String titulo, String paramEspecialidad, String paramFase, String paramTipoInvestigacion, String usuarioIngresa, Date fechaIngreso, String usuarioModifica, Date fechaModificacion) {
        this.idInvestigacion = idInvestigacion;
        this.cro = cro;
        this.patrocinador = patrocinador;
        this.protocolo = protocolo;
        this.titulo = titulo;
        this.paramEspecialidad = paramEspecialidad;
        this.paramFase = paramFase;
        this.paramTipoInvestigacion = paramTipoInvestigacion;
        this.usuarioIngresa = usuarioIngresa;
        this.fechaIngreso = fechaIngreso;
        this.usuarioModifica = usuarioModifica;
        this.fechaModificacion = fechaModificacion;
    }

    public Investigacion() {
    }

    public String getIdInvestigacion() {
        return idInvestigacion;
    }

    public void setIdInvestigacion(String idInvestigacion) {
        this.idInvestigacion = idInvestigacion;
    }

    public Cro getCro() {
        return cro;
    }

    public void setCro(Cro cro) {
        this.cro = cro;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getParamEspecialidad() {
        return paramEspecialidad;
    }

    public void setParamEspecialidad(String paramEspecialidad) {
        this.paramEspecialidad = paramEspecialidad;
    }

    public String getParamFase() {
        return paramFase;
    }

    public void setParamFase(String paramFase) {
        this.paramFase = paramFase;
    }

    public String getParamTipoInvestigacion() {
        return paramTipoInvestigacion;
    }

    public void setParamTipoInvestigacion(String paramTipoInvestigacion) {
        this.paramTipoInvestigacion = paramTipoInvestigacion;
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
        return "Investigacion{" + "idInvestigacion=" + idInvestigacion + ", cro=" + cro + ", patrocinador=" + patrocinador + ", protocolo=" + protocolo + ", titulo=" + titulo + ", paramEspecialidad=" + paramEspecialidad + ", paramFase=" + paramFase + ", paramTipoInvestigacion=" + paramTipoInvestigacion + ", usuarioIngresa=" + usuarioIngresa + ", fechaIngreso=" + fechaIngreso + ", usuarioModifica=" + usuarioModifica + ", fechaModificacion=" + fechaModificacion + '}';
    }

}
