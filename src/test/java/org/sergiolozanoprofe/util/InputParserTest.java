package org.sergiolozanoprofe.util;

import org.junit.jupiter.api.Test;
import org.sergiolozanoprofe.model.OperationType;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {


    @Test
    void parseInt() {
        assertEquals(2,InputParser.parseInt("2"));
    }

    @Test
    void parseIntNumeroComplejo() {
            assertEquals(807,InputParser.parseInt("807"));
    }

    @Test
    void parseIntNegativo() {
            assertEquals(-2,InputParser.parseInt("-2"));

    }

    @Test
    void parseIntLetra() {

        try{
            assertEquals(2,InputParser.parseInt("a"));
            fail("Ha introducido una letra");
        }
        catch (NumberFormatException ex){
            System.out.println("ERROR");
        }
    }

    @Test
    void parseOperationAdd() {
        try {
            assertEquals(OperationType.ADD, InputParser.parseOperation("suma"));
        }catch (IllegalArgumentException e){
            System.out.println("ERROR");
        }
        }

    @Test
    void parseOperationDivide() {
        try {
            assertEquals(OperationType.DIVIDE, InputParser.parseOperation("/"));
        }catch (IllegalArgumentException e){
            System.out.println("ERROR");
        }
    }

    @Test
    void parseOperationLetra() {
        try {
            assertEquals(OperationType.DIVIDE, InputParser.parseOperation("o"));
        }catch (IllegalArgumentException e){
            System.out.println("ERROR");
        }
    }
}