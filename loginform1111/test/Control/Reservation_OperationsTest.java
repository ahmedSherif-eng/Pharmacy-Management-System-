/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* test test*/
package Control;

import Modeling.Reservation_Model;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahmed
 */
public class Reservation_OperationsTest {

    public Reservation_OperationsTest() {
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
     * Test of insert_reservation method, of class Reservation_Operations.
     */
    @Test
    public void testInsert_reservation() {
        System.out.println("insert_reservation");
        int PH_ID = 25;
        int CU_ID = 10;
        String Product_Name = "Panadol";
        int Quantity = 1;
        Reservation_Operations.insert_reservation(PH_ID, CU_ID, Product_Name, Quantity);
        boolean isInserted = verifyReservationData(PH_ID, CU_ID, Product_Name, Quantity);
        System.out.println(isInserted);
        assertEquals(true,isInserted);

    }

    private boolean verifyReservationData(int PH_ID, int CU_ID, String Product_Name, int Quantity) {
        ArrayList<Reservation_Model> reservations = Reservation_Operations.get_ReservationData();
        for (Reservation_Model reserv : reservations) {
            if (reserv.getPH_ID()==PH_ID
                    && reserv.getCU_ID() == CU_ID
                    && reserv.getProduct_Name().equals(Product_Name)
                    && reserv.getQuantity() == Quantity) {
                return true;
            }
        }
       
        return false;
    }
    

    /**
     * Test of get_ReservationData method, of class Reservation_Operations.
     */
    @Test
    public void testGet_ReservationData() {
        System.out.println("get_ReservationData");
        ArrayList<Reservation_Model> expResult = null;
        ArrayList<Reservation_Model> result = Reservation_Operations.get_ReservationData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Search_Reservation method, of class Reservation_Operations.
     */
    @Test
    public void testSearch_Reservation() {
        System.out.println("Search_Reservation");
        int PH_ID = 0;
       ArrayList<Reservation_Model> expResult = null;
       ArrayList<Reservation_Model> result = Reservation_Operations.Search_Reservation(PH_ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   /**
     * Test of Delete_Reservation method, of class Reservation_Operations.
     */
    @Test
    public void testDelete_Reservation() {
        System.out.println("Delete_Reservation");
        int PH_ID = 0;
        int CU_ID = 0;
        String productName = "";
        Reservation_Operations.Delete_Reservation(PH_ID, CU_ID, productName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Edit_Reservation method, of class Reservation_Operations.
     */
    @Test
    public void testEdit_Reservation() {
       System.out.println("Edit_Reservation");
       int PH_ID = 0;
        int CU_ID = 0;
        String productName = "";
       int quantity = 0;
       Reservation_Operations.Edit_Reservation(PH_ID, CU_ID, productName, quantity);
      // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
