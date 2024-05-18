package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class FahrradControllerTest {

    private FahrradController controller;

    @BeforeEach
    public void setUp() {
        controller = new FahrradController();
    }

    @Test
    public void testSearchFahrradByYear() {
        List<Fahrrad> results = controller.searchFahrradByYear(2020);
        assertEquals(3, results.size());
    }

    @Test
    public void testSearchFahrradByYearNoMatch() {
        List<Fahrrad> results = controller.searchFahrradByYear(1999);
        assertEquals(0, results.size());
    }
}
