/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsPackage;

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class TestCalculadora {
    
    // declaramos un objeto calculadora como atributo de la clase 
    private Calculadora object = new Calculadora();
    
    
    
    public TestCalculadora() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Comienzan las pruebas");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Se han ejecutado todas las pruebas");
    }
    
    @Before
    public void setUp() {
        System.out.println("Comienza el Test....");
    }
    
    
    @After
    public void tearDown() {
    System.out.println("Finaliza el Test");
    }
    

    
       @Test
    public void testSuma(){
        
        object.setNumero1(20);
        object.setNumero2(1500);
        double resExp = 1520;
        assertEquals(resExp, object.suma(), 0.0);
       
    }
       
     @Test
    public void testResta(){
        
        object.setNumero1(20);
        object.setNumero2(10);
        double resExp = 10;
        assertEquals(resExp, object.resta(), 0.0);
        
      //fail (" Test sin diseñar ");
    }
    
    /*
     @Test
    public void testDivision(){
        object.setNumero1(20);
        object.setNumero2(3);
        double resExp = 6.666 ;
        assertEquals(resExp, object.division(), 0.0007);
      
        
    // fail (" Test sin diseñar ");
    }
    
    @Test
    public void testMultiplicacion(){
        object.setNumero1(20);
        object.setNumero2(40);
        double resExp = 200;
        assertEquals(resExp, object.multiplicacion(), 0.0);   
     
    //fail (" Test sin diseñar ");
    }
     */  
    @Test
    public void testGetNombre(){
       object.setNombre("Casio"); 
       String resExp = "Casio";
       
      assertEquals(resExp, object.getNombre());
       
    }
    
    
}
