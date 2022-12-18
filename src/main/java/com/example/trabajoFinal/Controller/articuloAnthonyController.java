package com.example.trabajoFinal.Controller;

import com.example.trabajoFinal.Bean.articuloAnthonyBean;
import com.example.trabajoFinal.Service.articuloAnthonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/articulo")
@CrossOrigin(origins = "https://frontendtrabajofinal.azurewebsites.net/")
public class articuloAnthonyController {


    @Autowired
    private articuloAnthonyBean artiBean;

    @Autowired
    private articuloAnthonyRepository artiRepo;

    @GetMapping("/obtener")
    public List<articuloAnthonyBean> obtenerArticulo (){
        List<articuloAnthonyBean> listaArticulo= new ArrayList<>();
        listaArticulo = (List<articuloAnthonyBean>) artiRepo.findAll();
        return listaArticulo;
    }

    @PostMapping("/insertar")
    public void insertarArticulo (@RequestBody articuloAnthonyBean artiBean) { artiRepo.save(artiBean);
    }

    @PutMapping("/modificar")
    public void modificarArticulo (@RequestBody articuloAnthonyBean artiBean){
        artiRepo.save(artiBean);
    }

    @DeleteMapping (value = "/{idRecibido}")
    public void eliminarArticulo (@PathVariable ("idRecibido") Integer id){
        artiRepo.deleteById(id);
    }



/*CONEXION CON ANGULAR*/


    @PutMapping("/modificar/{idarticulo}")
    public void modificarArticuloID (@PathVariable("idarticulo") Integer idestudiante, @RequestBody articuloAnthonyBean artiBean) {
        artiBean.setIdarticuloanthony(idestudiante);
        artiRepo.save(artiBean);
    }

    @GetMapping("/obtener/{idarticulo}")
    public ResponseEntity<articuloAnthonyBean> obtenerArticuloUnico(@PathVariable ("idarticulo") Integer idarticulo){

        articuloAnthonyBean listArticuloEncontrado =  artiRepo.findById(idarticulo).orElseThrow();

        return ResponseEntity.ok(listArticuloEncontrado);
    }

    @DeleteMapping("/eliminar/{idarticulo}")
    public void eliminar (@PathVariable ("idarticulo") Integer idarticulo){
        artiRepo.deleteById(idarticulo);
    }







}
