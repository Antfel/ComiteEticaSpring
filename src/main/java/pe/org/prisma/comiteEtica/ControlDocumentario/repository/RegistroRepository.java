/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.prisma.comiteEtica.ControlDocumentario.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.org.prisma.comiteEtica.ControlDocumentario.model.Registro;
import pe.org.prisma.comiteEtica.ControlDocumentario.payloads.RegistroPayloadList;

/**
 *
 * @author felix
 */
public interface RegistroRepository extends CrudRepository<Registro, String> {

    @Query(value = "select		r.idRegistro,\n"
            + "            coalesce(CONVERt(varchar(10),r.fechaAprobacion,103),'')fechaAprobacion,\n"
            + "             coalesce(fas.Descripcion,'') fase,\n"
            + "            coalesce(Protocolo,'')protocolo,\n"
            + "            coalesce(Titulo,'') titulo,\n"
            + "            coalesce(r.nombreSede,'')nombreSede,\n"
            + "            rtrim(ltrim(coalesce(iv.ApePaterno,'')+' '+coalesce(iv.ApeMaterno,'')+' '+coalesce(iv.Nombres,''))) nombreInvestigador,\n"
            + "            pe.Descripcion paramEstado,\n"
            + "            per.Descripcion paramEstadoRegistro,\n"
            + "            r.observacion,\n"
            + "            r.farmacoExperimental,\n"
            + "            (case when r.placebo=0 then 'NO' when r.placebo=1 then 'SI' end)placebo,\n"
            + "            r.pacienteEas,\n"
            + "            r.easLocal,\n"
            + "            noti.Descripcion paramNotificacion,\n"
            + "            CONVERt(varchar(10),r.fechaEas,103)fechaEas,\n"
            + "            r.visitaInspeccion,\n"
            + "            (case when r.estudioNinos=0 then 'NO' when r.estudioNinos=1 then 'SI' end)estudioNinos,\n"
            + "            r.visitaInspeccionIns,\n"
            + "            r.equivalenciaCorrelativo,\n"
            + "			coalesce(ti.Descripcion,'')paramTipoInvestigacion,\n"
            + "			coalesce(e.Descripcion,'')paramEspecialidad,\n"
            + "             r.datosBitacora \n"
            + "from		Registro r\n"
            + "left join	Investigacion i on r.IdInvestigacion=i.IdInvestigacion\n"
            + "left join	Sede s on s.IdSede=r.IdSede\n"
            + "left join	Investigador iv on iv.IdInvestigador=r.IdInvestigador\n"
            + "left join	ParametroDetalle pe on pe.IdParametro='P006' and pe.IdParametroDetalle=r.paramEstado\n"
            + "left join	ParametroDetalle per on per.IdParametro='P012' and per.IdParametroDetalle=r.paramEstadoRegistro\n"
            + "left join	ParametroDetalle noti on noti.IdParametro='P007' and noti.IdParametroDetalle=r.paramNotificacion\n"
            + "left join	ParametroDetalle ti on ti.IdParametro='P004' and ti.IdParametroDetalle=i.paramTipoInvestigacion\n"
            + "left join	ParametroDetalle e on e.IdParametro='P003' and e.IdParametroDetalle=i.ParamEspecialidad\n"
            + "left join	ParametroDetalle fas on fas.IdParametro='P005' and fas.IdParametroDetalle=i.ParamFase\n"
            + "order by	idRegistro desc", nativeQuery = true)
    List<Object[]> getAllRegistrosList();

}
