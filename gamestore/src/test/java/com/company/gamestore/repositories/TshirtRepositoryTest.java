package com.company.gamestore.repositories;

import com.company.gamestore.models.Tshirt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TshirtRepositoryTest {

    @Autowired
    TshirtRepository tshirtRepository;


    @BeforeEach
    public void setUp() throws Exception {
        tshirtRepository.deleteAll();
    }

//    @Test
//    public void shouldGetAllTshirts(){
//
//        // ARRANGE
//        Tshirt tshirt = new Tshirt();
//        tshirt.setColor("Red");
//        tshirt.setDescription("Big red tshirt.");
//        tshirt.setSize("Large");
//        tshirt.setQuantity(5);
//        tshirt.setPrice(new BigDecimal("5.99"));
//
//        tshirt = tshirtRepository.save(tshirt);
//
//        Tshirt tshirt2 = new Tshirt();
//        tshirt2.setColor("White");
//        tshirt2.setDescription("Medium white tshirt.");
//        tshirt2.setSize("Medium");
//        tshirt2.setQuantity(5);
//        tshirt2.setPrice(new BigDecimal("3.99"));
//
//        tshirt2 = tshirtRepository.save(tshirt2);
//
//        // ASSERT
//        List<Tshirt> tshirtList = tshirtRepository.findAll();
//
//        assertEquals(2, tshirtList.size());
//
//    }
//
//    @Test
//    public void shouldGetTshirtById(){
//
//        // ARRANGE
//        Tshirt tshirt = new Tshirt();
//        tshirt.setColor("Red");
//        tshirt.setDescription("Big red tshirt.");
//        tshirt.setSize("Large");
//        tshirt.setQuantity(5);
//        tshirt.setPrice(new BigDecimal("5.99"));
//
//        tshirt = tshirtRepository.save(tshirt);
//
//        // ACT
//        Tshirt retrievedTshirt = tshirtRepository.findById(tshirt.getId()).orElse(null);
//
//        // ASSERT
//        assertNotNull(retrievedTshirt);
//        assertEquals("Red", retrievedTshirt.getColor());
//        assertEquals("Big red tshirt.", retrievedTshirt.getDescription());
//        assertEquals("Large", retrievedTshirt.getSize());
//        assertEquals(5, retrievedTshirt.getQuantity());
//        assertEquals(new BigDecimal("5.99"), retrievedTshirt.getPrice());
//    }

//    @Test
//    public void shouldGetTshirtByColor(){
//
//        // ARRANGE
//        Tshirt tshirt = new Tshirt();
//        tshirt.setColor("Red");
//        tshirt.setDescription("Big red tshirt.");
//        tshirt.setSize("Large");
//        tshirt.setQuantity(5);
//        tshirt.setPrice(new BigDecimal("5.99"));
//
//        tshirt = tshirtRepository.save(tshirt);
//
//        Tshirt tshirt2 = new Tshirt();
//        tshirt2.setColor("White");
//        tshirt2.setDescription("Medium white tshirt.");
//        tshirt2.setSize("Medium");
//        tshirt2.setQuantity(5);
//        tshirt2.setPrice(new BigDecimal("3.99"));
//
//        tshirt2 = tshirtRepository.save(tshirt2);
//
//        // ACT
//        List<Tshirt> retrievedTshirts = tshirtRepository.findByColor("Red");
//
//        // ASSERT
//        assertEquals(1, retrievedTshirts.size());
//
//
//
//    }

//    @Test
//    public void shouldGetTshirtBySize(){
//
//    }
//
//    @Test
//    public void shouldAddTshirt(){
//
//    }
//
//    @Test
//    public void shouldUpdateTshirt(){
//
//    }
//
//    @Test
//    public void shouldDeleteTshirt(){
//
//    }

}