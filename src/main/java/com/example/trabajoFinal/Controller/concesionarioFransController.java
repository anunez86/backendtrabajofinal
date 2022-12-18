package com.example.trabajoFinal.Controller;

import com.example.trabajoFinal.Bean.articuloAnthonyBean;
import com.example.trabajoFinal.Bean.concesionarioFransBean;
import com.example.trabajoFinal.Service.concesionarioFransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/concesionario")
@CrossOrigin(origins = "https://frontendtrabajofinal.azurewebsites.net/")
public class concesionarioFransController {

    @Autowired
    private concesionarioFransRepository comRepo;

    @GetMapping("/obtener")
    public List<concesionarioFransBean> obtenerConcesionario(){
        List<concesionarioFransBean> listaConcesionario= new ArrayList<>();
        listaConcesionario = (List<concesionarioFransBean>) comRepo.findAll();
        return listaConcesionario;
    }

    @PostMapping("/insertar")
    public void insertarConcesionario (@RequestBody concesionarioFransBean comBean) { comRepo.save(comBean);}

    @PutMapping("/modificar")
    public void modificarConcesionario (@RequestBody concesionarioFransBean comBean) { comRepo.save(comBean);}


    @DeleteMapping (value = "/{idRecibido}")
    public void eliminarConcesionario (@PathVariable ("idRecibido") Integer id){
        comRepo.deleteById(id);
    }




    /*CONEXION CON ANGULAR*/


    @PutMapping("/modificar/{idconcesionario}")
    public void modificarConcesionarioID (@PathVariable("idconcesionario") Integer idconcesionario, @RequestBody concesionarioFransBean comBean) {
        comBean.setIdconcesionariofrans(idconcesionario);
        comRepo.save(comBean);
    }

    @GetMapping("/obtener/{idconcesionario}")
    public ResponseEntity<concesionarioFransBean> obtenerConcesionarioUnico(@PathVariable ("idconcesionario") Integer idconcesionario){

        concesionarioFransBean listConcesionarioEncontrado =  comRepo.findById(idconcesionario).orElseThrow();

        return ResponseEntity.ok(listConcesionarioEncontrado);
    }

    @DeleteMapping("/eliminar/{idconcesionario}")
    public void eliminar (@PathVariable ("idconcesionario") Integer idconcesionario){
        comRepo.deleteById(idconcesionario);
    }









}
