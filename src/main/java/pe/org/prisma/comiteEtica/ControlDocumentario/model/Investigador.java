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
@Table(name = "Investigador",
        schema = "dbo",
        catalog = "ComiteEtica"
)
public class Investigador {
    
    @Id
    @Column(name = "IdInvestigador")
    private String idInvestigador;
    @Column(name = "ApePaterno")
    private String apePaterno;
    @Column(name = "ApeMaterno")
    private String apeMaterno;
    @Column(name = "Nombres")
    private String nombres;
    @Column(name = "ParamEspecialidadInvestigador")
    private String paramEspecialidadInvestigador;
    @Column(name = "Correo")
    private String correo;
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

    public Investigador() {
    }

    public Investigador(String idInvestigador, String apePaterno, String apeMaterno, String nombres, String paramEspecialidadInvestigador, String correo, String usuarioIngresa, Date fechaIngreso, String usuarioModifica, Date fechaModificacion) {
        this.idInvestigador = idInvestigador;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.nombres = nombres;
        this.paramEspecialidadInvestigador = paramEspecialidadInvestigador;
        this.correo = correo;
        this.usuarioIngresa = usuarioIngresa;
        this.fechaIngreso = fechaIngreso;
        this.usuarioModifica = usuarioModifica;
        this.fechaModificacion = fechaModificacion;
    }

    public String getIdInvestigador() {
        return idInvestigador;
    }

    public void setIdInvestigador(String idInvestigador) {
        this.idInvestigador = idInvestigador;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getParamEspecialidadInvestigador() {
        return paramEspecialidadInvestigador;
    }

    public void setParamEspecialidadInvestigador(String paramEspecialidadInvestigador) {
        this.paramEspecialidadInvestigador = paramEspecialidadInvestigador;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        return "Investigador{" + "idInvestigador=" + idInvestigador + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + ", nombres=" + nombres + ", paramEspecialidadInvestigador=" + paramEspecialidadInvestigador + ", correo=" + correo + ", usuarioIngresa=" + usuarioIngresa + ", fechaIngreso=" + fechaIngreso + ", usuarioModifica=" + usuarioModifica + ", fechaModificacion=" + fechaModificacion + '}';
    }
    
    
}
