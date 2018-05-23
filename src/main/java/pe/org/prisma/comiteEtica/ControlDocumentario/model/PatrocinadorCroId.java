/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.prisma.comiteEtica.ControlDocumentario.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author felix
 */
@Embeddable
public class PatrocinadorCroId implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "idCro")
    private Cro cro;
    @ManyToOne
    @JoinColumn(name = "idPatrocinador")
    private Patrocinador patrocinador;

    public PatrocinadorCroId() {
    }

    public PatrocinadorCroId(Cro cro, Patrocinador patrocinador) {
        this.cro = cro;
        this.patrocinador = patrocinador;
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

}
