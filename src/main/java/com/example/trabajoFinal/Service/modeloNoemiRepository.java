package com.example.trabajoFinal.Service;

import com.example.trabajoFinal.Bean.modeloNoemiBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface modeloNoemiRepository extends CrudRepository<modeloNoemiBean, Integer> {
}
