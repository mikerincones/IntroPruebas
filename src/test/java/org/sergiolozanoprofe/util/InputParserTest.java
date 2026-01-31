package org.sergiolozanoprofe.util;

import org.junit.jupiter.api.Test;
import org.sergiolozanoprofe.model.OperationType;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {


    @Test
    void parseInt() {

        try{
            assertEquals(2,InputParser.parseInt("2"));
        }
        catch (NumberFormatException ex){
            System.out.println("ERROR");
        }
    }

    @Test
    void parseIntNumeroComplejo() {

        try{
            assertEquals(807,InputParser.parseInt("807"));
        }
        catch (NumberFormatException ex){
            System.out.println("ERROR");
        }
    }

    @Test
    void parseIntNegativo() {

        try{
            assertEquals(-2,InputParser.parseInt("-2"));
        }
        catch (NumberFormatException ex){
            System.out.println("ERROR");
        }
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
    void parseOperation() {
        try {
            assertEquals(OperationType.ADD, InputParser.parseOperation("suma"));
        }catch (IllegalArgumentException e){
            System.out.println("ERROR");
        }
        }
}