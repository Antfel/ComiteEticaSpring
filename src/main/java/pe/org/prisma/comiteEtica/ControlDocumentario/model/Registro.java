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
@Table(name = "Registro",
        schema = "dbo",
        catalog = "ComiteEtica"
)
public class Registro {

    @Id
    @Column(name = "IdRegistro")
    private String idRegistro;
    @Column(name = "ParamEstadoRegistro")
    private String paramEstadoRegistro;
    @ManyToOne
    @JoinColumn(name = "IdInvestigacion")
    private Investigacion investigacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaAprobacion")
    private Date fechaAprobacion;
    @ManyToOne
    @JoinColumn(name = "IdSede")
    private Sede sede;
    @Column(name = "NombreSede")
    private String nombreSede;
    @ManyToOne
    @JoinColumn(name = "IdInvestigador")
    private Investigador investigador;
    @Column(name = "ParamEstado")
    private String paramEstado;
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "FarmacoExperimental")
    private String farmacoExperimental;
    @Column(name = "Placebo")
    private Boolean placebo;
    @Column(name = "PacienteEas")
    private String pacienteEas;
    @Column(name = "EasLocal")
    private String easLocal;
    @Column(name = "ParamNotificacion")
    private String paramNotificacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaEas")
    private Date fechaEas;
    @Column(name = "VisitaInspeccion")
    private String visitaInspeccion;
    @Column(name = "EstudioNinos")
    private Boolean estudioNinos;
    @Column(name = "VisitaInspeccionIns")
    private String visitaInspeccionIns;
    @Column(name = "EquivalenciaCorrelativo")
    private String equivalenciaCorrelativo;
    @Column(name = "DatosBitacora")
    private String datosBitacora;
    @Column(name = "UsuarioIngresa")
    private String usuarioIngresa;
    @Column(name = "FechaIngreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "UsuarioModifica")
    private String usuarioModifica;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaModificacion")
    private Date fechaModificacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaTrabajo")
    private Date fechaTrabajo;

    public Registro() {
    }

    public Registro(String idRegistro, String paramEstadoRegistro, Investigacion investigacion, Date fechaAprobacion, Sede sede, String nombreSede, Investigador investigador, String paramEstado, String observacion, String farmacoExperimental, Boolean placebo, String pacienteEas, String easLocal, String paramNotificacion, Date fechaEas, String visitaInspeccion, Boolean estudioNinos, String visitaInspeccionIns, String equivalenciaCorrelativo, String datosBitacora, String usuarioIngresa, Date fechaIngreso, String usuarioModifica, Date fechaModificacion, Date fechaTrabajo) {
        this.idRegistro = idRegistro;
        this.paramEstadoRegistro = paramEstadoRegistro;
        this.investigacion = investigacion;
        this.fechaAprobacion = fechaAprobacion;
        this.sede = sede;
        this.nombreSede = nombreSede;
        this.investigador = investigador;
        this.paramEstado = paramEstado;
        this.observacion = observacion;
        this.farmacoExperimental = farmacoExperimental;
        this.placebo = placebo;
        this.pacienteEas = pacienteEas;
        this.easLocal = easLocal;
        this.paramNotificacion = paramNotificacion;
        this.fechaEas = fechaEas;
        this.visitaInspeccion = visitaInspeccion;
        this.estudioNinos = estudioNinos;
        this.visitaInspeccionIns = visitaInspeccionIns;
        this.equivalenciaCorrelativo = equivalenciaCorrelativo;
        this.datosBitacora = datosBitacora;
        this.usuarioIngresa = usuarioIngresa;
        this.fechaIngreso = fechaIngreso;
        this.usuarioModifica = usuarioModifica;
        this.fechaModificacion = fechaModificacion;
        this.fechaTrabajo = fechaTrabajo;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getParamEstadoRegistro() {
        return paramEstadoRegistro;
    }

    public void setParamEstadoRegistro(String paramEstadoRegistro) {
        this.paramEstadoRegistro = paramEstadoRegistro;
    }

    public Investigacion getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(Investigacion investigacion) {
        this.investigacion = investigacion;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    public String getParamEstado() {
        return paramEstado;
    }

    public void setParamEstado(String paramEstado) {
        this.paramEstado = paramEstado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFarmacoExperimental() {
        return farmacoExperimental;
    }

    public void setFarmacoExperimental(String farmacoExperimental) {
        this.farmacoExperimental = farmacoExperimental;
    }

    public Boolean getPlacebo() {
        return placebo;
    }

    public void setPlacebo(Boolean placebo) {
        this.placebo = placebo;
    }

    public String getPacienteEas() {
        return pacienteEas;
    }

    public void setPacienteEas(String pacienteEas) {
        this.pacienteEas = pacienteEas;
    }

    public String getEasLocal() {
        return easLocal;
    }

    public void setEasLocal(String easLocal) {
        this.easLocal = easLocal;
    }

    public String getParamNotificacion() {
        return paramNotificacion;
    }

    public void setParamNotificacion(String paramNotificacion) {
        this.paramNotificacion = paramNotificacion;
    }

    public Date getFechaEas() {
        return fechaEas;
    }

    public void setFechaEas(Date fechaEas) {
        this.fechaEas = fechaEas;
    }

    public String getVisitaInspeccion() {
        return visitaInspeccion;
    }

    public void setVisitaInspeccion(String visitaInspeccion) {
        this.visitaInspeccion = visitaInspeccion;
    }

    public Boolean getEstudioNinos() {
        return estudioNinos;
    }

    public void setEstudioNinos(Boolean estudioNinos) {
        this.estudioNinos = estudioNinos;
    }

    public String getVisitaInspeccionIns() {
        return visitaInspeccionIns;
    }

    public void setVisitaInspeccionIns(String visitaInspeccionIns) {
        this.visitaInspeccionIns = visitaInspeccionIns;
    }

    public String getEquivalenciaCorrelativo() {
        return equivalenciaCorrelativo;
    }

    public void setEquivalenciaCorrelativo(String equivalenciaCorrelativo) {
        this.equivalenciaCorrelativo = equivalenciaCorrelativo;
    }

    public String getDatosBitacora() {
        return datosBitacora;
    }

    public void setDatosBitacora(String datosBitacora) {
        this.datosBitacora = datosBitacora;
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

    public Date getFechaTrabajo() {
        return fechaTrabajo;
    }

    public void setFechaTrabajo(Date fechaTrabajo) {
        this.fechaTrabajo = fechaTrabajo;
    }

    @Override
    public String toString() {
        return "Registro{" + "idRegistro=" + idRegistro + ", paramEstadoRegistro=" + paramEstadoRegistro + ", investigacion=" + investigacion + ", fechaAprobacion=" + fechaAprobacion + ", sede=" + sede + ", nombreSede=" + nombreSede + ", investigador=" + investigador + ", paramEstado=" + paramEstado + ", observacion=" + observacion + ", farmacoExperimental=" + farmacoExperimental + ", placebo=" + placebo + ", pacienteEas=" + pacienteEas + ", easLocal=" + easLocal + ", paramNotificacion=" + paramNotificacion + ", fechaEas=" + fechaEas + ", visitaInspeccion=" + visitaInspeccion + ", estudioNinos=" + estudioNinos + ", visitaInspeccionIns=" + visitaInspeccionIns + ", equivalenciaCorrelativo=" + equivalenciaCorrelativo + ", datosBitacora=" + datosBitacora + ", usuarioIngresa=" + usuarioIngresa + ", fechaIngreso=" + fechaIngreso + ", usuarioModifica=" + usuarioModifica + ", fechaModificacion=" + fechaModificacion + ", fechaTrabajo=" + fechaTrabajo + '}';
    }

}
