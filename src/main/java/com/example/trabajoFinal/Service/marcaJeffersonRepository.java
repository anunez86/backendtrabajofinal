package com.example.trabajoFinal.Service;

import com.example.trabajoFinal.Bean.marcaJeffersonBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface marcaJeffersonRepository extends CrudRepository<marcaJeffersonBean, Integer> {
}
