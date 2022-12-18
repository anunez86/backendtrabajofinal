package com.example.trabajoFinal.Controller;

import com.example.trabajoFinal.Bean.modeloNoemiBean;
import com.example.trabajoFinal.Service.modeloNoemiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/modelo")
@CrossOrigin(origins = "https://frontendtrabajofinal.azurewebsites.net/")
public class modeloNoemiController {


    @Autowired
    private modeloNoemiRepository modRepo;

    @GetMapping("/obtener")
    public List<modeloNoemiBean> obtenerModelo (){
        List<modeloNoemiBean> listaModelo= new ArrayList<>();
        listaModelo = (List<modeloNoemiBean>) modRepo.findAll();
        return listaModelo;
    }

    @PostMapping("/insertar")
    public void insertarModelo (@RequestBody modeloNoemiBean modBean) { modRepo.save(modBean);
    }

    @PutMapping("/modificar")
    public void modificarModelo (@RequestBody modeloNoemiBean modBean){
        modRepo.save(modBean);
    }


    @DeleteMapping (value = "/{idRecibido}")
    public void eliminarModelo (@PathVariable ("idRecibido") Integer id){
        modRepo.deleteById(id);
    }




    /*CONEXION CON ANGULAR*/


    @PutMapping("/modificar/{idmodelo}")
    public void modificarModeloID (@PathVariable("idmodelo") Integer idmodelo, @RequestBody modeloNoemiBean modBean) {
        modBean.setIdmodelonoemi(idmodelo);
        modRepo.save(modBean);
    }

    @GetMapping("/obtener/{idmodelo}")
    public ResponseEntity<modeloNoemiBean> obtenerModeloUnico(@PathVariable ("idmodelo") Integer idmodelo){

        modeloNoemiBean listModeloEncontrado =  modRepo.findById(idmodelo).orElseThrow();

        return ResponseEntity.ok(listModeloEncontrado);
    }

    @DeleteMapping("/eliminar/{idmodelo}")
    public void eliminar (@PathVariable ("idmodelo") Integer idmodelo){
        modRepo.deleteById(idmodelo);
    }




}
