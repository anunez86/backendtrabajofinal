package com.example.trabajoFinal.Service;

import com.example.trabajoFinal.Bean.articuloAnthonyBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface articuloAnthonyRepository extends CrudRepository<articuloAnthonyBean, Integer> {
}
