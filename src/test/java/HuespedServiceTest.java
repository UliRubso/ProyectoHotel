package com.proyectohotel;

import com.proyectohotel.model.Huesped;
import com.proyectohotel.repository.HuespedRepository;
import com.proyectohotel.service.HuespedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class HuespedServiceTest {

    private HuespedRepository repository;
    private HuespedService service;

    @BeforeEach
    void setUp() {
        repository = mock(HuespedRepository.class);
        service = new HuespedService(repository);
    }

    @Test
    void noDebeGuardarSiFechaSalidaEsAnterior() {
        Huesped h = new Huesped(
                "Ulises Rubio",
                101,
                LocalDate.of(2026, 4, 10),
                LocalDate.of(2026, 4, 8)
        );

        assertThrows(IllegalArgumentException.class, () -> service.guardar(h));
    }
}