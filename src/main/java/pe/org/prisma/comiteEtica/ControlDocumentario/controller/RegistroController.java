/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.prisma.comiteEtica.ControlDocumentario.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.org.prisma.comiteEtica.ControlDocumentario.payloads.RegistroPayloadList;
import pe.org.prisma.comiteEtica.ControlDocumentario.service.RegistroService;

/**
 *
 * @author felix
 */
@RestController
@CrossOrigin
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private final RegistroService service;

    public RegistroController(RegistroService departmentService) {
        this.service = departmentService;
    }

    @GetMapping(path = "/RegistroListFindAll")
    public ResponseEntity<Object> listFindAllRegistro() {
        try {

            List<RegistroPayloadList> obj = service.getAllRegistroList();

            return new ResponseEntity(obj, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
