package com.proyectohotel.controller;

import com.proyectohotel.model.Huesped;
import com.proyectohotel.service.HuespedService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/huespedes")
public class HuespedController {

    private final HuespedService huespedService;

    public HuespedController(HuespedService huespedService) {
        this.huespedService = huespedService;
    }

    @GetMapping
    public String listarHuespedes(Model model) {
        model.addAttribute("huespedes", huespedService.obtenerTodos());
        return "huespedes";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("huesped", new Huesped());
        return "nuevo-huesped";
    }

    @PostMapping("/guardar")
    public String guardarHuesped(@ModelAttribute Huesped huesped, Model model) {
        try {
            huespedService.guardar(huesped);
            return "redirect:/huespedes";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("huesped", huesped);
            return "nuevo-huesped";
        }
    }

    @GetMapping("/editar/{id}")
    public String editarHuesped(@PathVariable Long id, Model model) {
        Huesped huesped = huespedService.obtenerPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Huésped no encontrado"));
        model.addAttribute("huesped", huesped);
        return "editar-huesped";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarHuesped(@PathVariable Long id, @ModelAttribute Huesped huesped, Model model) {
        try {
            Huesped existente = huespedService.obtenerPorId(id)
                    .orElseThrow(() -> new IllegalArgumentException("Huésped no encontrado"));

            existente.setNombre(huesped.getNombre());
            existente.setNumeroHabitacion(huesped.getNumeroHabitacion());
            existente.setFechaEntrada(huesped.getFechaEntrada());
            existente.setFechaSalida(huesped.getFechaSalida());

            huespedService.guardar(existente);
            return "redirect:/huespedes";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("huesped", huesped);
            return "editar-huesped";
        }
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarHuesped(@PathVariable Long id) {
        huespedService.eliminar(id);
        return "redirect:/huespedes";
    }
}