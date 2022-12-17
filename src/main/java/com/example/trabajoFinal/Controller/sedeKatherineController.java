package com.example.trabajoFinal.Controller;

import com.example.trabajoFinal.Bean.sedeKatherineBean;
import com.example.trabajoFinal.Service.sedeKatherineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sede")
@CrossOrigin(origins = "http://localhost:4200/")
public class sedeKatherineController {


    @Autowired
    private sedeKatherineBean sedeBean;

    @Autowired
    private sedeKatherineRepository sedeRepo;

    @GetMapping("/obtener")
    public List<sedeKatherineBean> obtenerSede (){
        List<sedeKatherineBean> listaSede= new ArrayList<>();
        listaSede = (List<sedeKatherineBean>) sedeRepo.findAll();
        return listaSede;
    }

    @PostMapping("/insertar")
    public void insertarSede (@RequestBody sedeKatherineBean sedeBean) { sedeRepo.save(sedeBean);
    }

    @PutMapping("/modificar")
    public void modificarSede (@RequestBody sedeKatherineBean sedeBean){
        sedeRepo.save(sedeBean);
    }

    @DeleteMapping (value = "/{idRecibido}")
    public void eliminarSede (@PathVariable ("idRecibido") Integer id){
        sedeRepo.deleteById(id);
    }



    /*CONEXION CON ANGULAR*/


    @PutMapping("/modificar/{idsede}")
    public void modificarSedeID (@PathVariable("idsede") Integer idsede, @RequestBody sedeKatherineBean sedeBean) {
        sedeBean.setIdsedekatherine(idsede);
        sedeRepo.save(sedeBean);
    }

    @GetMapping("/obtener/{idsede}")
    public ResponseEntity<sedeKatherineBean> obtenerSedeUnico(@PathVariable ("idsede") Integer idsede){

        sedeKatherineBean listSedeEncontrado =  sedeRepo.findById(idsede).orElseThrow();

        return ResponseEntity.ok(listSedeEncontrado);
    }

    @DeleteMapping("/eliminar/{idsede}")
    public void eliminar (@PathVariable ("idsede") Integer idsede){
        sedeRepo.deleteById(idsede);
    }









}
