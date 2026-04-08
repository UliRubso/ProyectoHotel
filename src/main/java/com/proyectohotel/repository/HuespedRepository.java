package com.proyectohotel.repository;

import com.proyectohotel.model.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HuespedRepository extends JpaRepository<Huesped, Long> {
    List<Huesped> findByNombreContainingIgnoreCase(String nombre);
    List<Huesped> findByNumeroHabitacion(Integer numeroHabitacion);
}