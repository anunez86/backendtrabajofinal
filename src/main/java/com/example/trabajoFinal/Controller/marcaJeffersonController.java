package com.example.trabajoFinal.Controller;

import com.example.trabajoFinal.Bean.articuloAnthonyBean;
import com.example.trabajoFinal.Bean.marcaJeffersonBean;
import com.example.trabajoFinal.Service.marcaJeffersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/marca")
@CrossOrigin(origins = "https://frontendtrabajofinal.azurewebsites.net/")
public class marcaJeffersonController {

    @Autowired
    private marcaJeffersonRepository marRepo;

    @GetMapping("/obtener")
    public List<marcaJeffersonBean> obtenerMarca (){
        List<marcaJeffersonBean> listaMarca= new ArrayList<>();
        listaMarca = (List<marcaJeffersonBean>) marRepo.findAll();
        return listaMarca;
    }

    @PostMapping("/insertar")
    public void insertarMarca (@RequestBody marcaJeffersonBean marBean) { marRepo.save(marBean);
    }

    @PutMapping("/modificar")
    public void modificarMarca (@RequestBody marcaJeffersonBean marBean) { marRepo.save(marBean);
    }


    @DeleteMapping (value = "/{idRecibido}")
    public void eliminarMarca (@PathVariable ("idRecibido") Integer id){
        marRepo.deleteById(id);
    }



    /*CONEXION CON ANGULAR*/


    @PutMapping("/modificar/{idmarca}")
    public void modificarMarcaID (@PathVariable("idmarca") Integer idmarca, @RequestBody marcaJeffersonBean marBean) {
        marBean.setIdmarca(idmarca);
        marRepo.save(marBean);
    }

    @GetMapping("/obtener/{idmarca}")
    public ResponseEntity<marcaJeffersonBean> obtenerMarcaUnico(@PathVariable ("idmarca") Integer idmarca){

        marcaJeffersonBean listMarcaEncontrado =  marRepo.findById(idmarca).orElseThrow();

        return ResponseEntity.ok(listMarcaEncontrado);
    }

    @DeleteMapping("/eliminar/{idmarca}")
    public void eliminar (@PathVariable ("idmarca") Integer idmarca){
        marRepo.deleteById(idmarca);
    }


}
