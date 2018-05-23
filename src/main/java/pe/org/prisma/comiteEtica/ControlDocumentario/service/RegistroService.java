/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.prisma.comiteEtica.ControlDocumentario.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.org.prisma.comiteEtica.ControlDocumentario.payloads.RegistroPayloadList;
import pe.org.prisma.comiteEtica.ControlDocumentario.repository.RegistroRepository;

/**
 *
 * @author felix
 */
@Service
public class RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    public List<RegistroPayloadList> getAllRegistroList() {
        List<RegistroPayloadList> l = new ArrayList();
        List<Object[]> obj = registroRepository.getAllRegistrosList();
        obj.stream().forEach((objecto)
                -> {
            RegistroPayloadList payloadList = new RegistroPayloadList();
            payloadList.setIdRegistro((String) objecto[0]);
            payloadList.setFechaAprobacion((String) objecto[1]);
            payloadList.setFase((String) objecto[2]);
            payloadList.setProtocolo((String) objecto[3]);
            payloadList.setTitulo((String) objecto[4]);
            payloadList.setNombreSede((String) objecto[5]);
            payloadList.setNombreInvestigador((String) objecto[6]);
            payloadList.setParamEstado((String) objecto[7]);
            payloadList.setParamEstadoRegistro((String) objecto[8]);
            payloadList.setObservacion((String) objecto[9]);
            payloadList.setFarmacoExperimental((String) objecto[10]);
            payloadList.setPlaceblo((String) objecto[11]);
            payloadList.setPacienteEas((String) objecto[12]);
            payloadList.setEasLocal((String) objecto[13]);
            payloadList.setParamNotificacion((String) objecto[14]);
            payloadList.setFechaEas((String) objecto[15]);
            payloadList.setVisitaInspeccion((String) objecto[16]);
            payloadList.setEstudiosNinos((String) objecto[17]);
            payloadList.setVisitaInspeccionIns((String) objecto[18]);
            payloadList.setEquivalenciaCorrelativo((String) objecto[19]);
            payloadList.setParamTipoInvestigacion((String) objecto[20]);
            payloadList.setParamEspecialidad((String) objecto[21]);
            payloadList.setDatosBitacora((String) objecto[22]);
            l.add(payloadList);
        });
        return l;
    }

}
