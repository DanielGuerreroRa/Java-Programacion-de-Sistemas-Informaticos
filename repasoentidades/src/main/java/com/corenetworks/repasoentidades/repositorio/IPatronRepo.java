package com.corenetworks.repasoentidades.repositorio;

import com.corenetworks.repasoentidades.modelo.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatronRepo extends JpaRepository<Patron,String> {
}
