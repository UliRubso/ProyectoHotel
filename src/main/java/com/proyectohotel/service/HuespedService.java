package com.proyectohotel.service;

import com.proyectohotel.model.Huesped;
import com.proyectohotel.repository.HuespedRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HuespedService {

    private final HuespedRepository huespedRepository;

    public HuespedService(HuespedRepository huespedRepository) {
        this.huespedRepository = huespedRepository;
    }

    public List<Huesped> obtenerTodos() {
        return huespedRepository.findAll();
    }

    public Optional<Huesped> obtenerPorId(Long id) {
        return huespedRepository.findById(id);
    }

    public Huesped guardar(Huesped huesped) {
        if (huesped.getFechaSalida().isBefore(huesped.getFechaEntrada())) {
            throw new IllegalArgumentException("La fecha de salida no puede ser anterior a la fecha de entrada.");
        }
        return huespedRepository.save(huesped);
    }

    public void eliminar(Long id) {
        huespedRepository.deleteById(id);
    }

    public List<Huesped> buscarPorNombre(String nombre) {
        return huespedRepository.findByNombreContainingIgnoreCase(nombre);
    }
}