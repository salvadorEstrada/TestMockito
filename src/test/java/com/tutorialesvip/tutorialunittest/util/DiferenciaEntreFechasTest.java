package com.tutorialesvip.tutorialunittest.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;



class DiferenciaEntreFechasTest {

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependency() {
        diferenciaEntreFechas = new DiferenciaEntreFechas();
        LocalDate today = LocalDate.now();
        String fechaIndependencia ="16/08/1810";

        Period period = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia);

        assertEquals(period.getMonths(),11);
        assertEquals(period.getDays(),25);
        assertEquals(period.getYears(),213);
    }
}