/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stadistic;

import DataLogic.Impresion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class TriangularTest {
    
    public TriangularTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generar method, of class Triangular.
     */
    @Test
    public void testGenerar() {
        System.out.println("generar");
        Impresion i = new Impresion(1,15,7) {
            @Override
            public void recalcularValores() {
            }
        };
        Triangular instance = new Triangular(i);
        
        System.out.println(instance.generar());
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
