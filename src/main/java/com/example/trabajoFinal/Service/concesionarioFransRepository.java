package com.example.trabajoFinal.Service;

import com.example.trabajoFinal.Bean.concesionarioFransBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface concesionarioFransRepository extends CrudRepository<concesionarioFransBean, Integer> {
}
