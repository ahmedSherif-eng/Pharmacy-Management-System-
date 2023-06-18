/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* test test*/
package Control;

import static Control.Reservation_Operations.Search_Reservation;
import static Control.Reservation_Operations.get_ReservationData;
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
        int Quantity = 25;
        Reservation_Operations.insert_reservation(PH_ID, CU_ID, Product_Name, Quantity);
        boolean isInserted = verifyReservationData(PH_ID, CU_ID, Product_Name, Quantity);
        System.out.println(isInserted);
        assertEquals(true,isInserted);

    }
    private boolean verifyReservationData(int PH_ID, int CU_ID, String Product_Name, int Quantity) {
        ArrayList<Reservation_Model> reservations = Reservation_Operations.get_ReservationData();
        for (Reservation_Model reserv : reservations) {
            if (reserv.getPH_ID() == PH_ID
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
//    @Test
//    public void testGet_ReservationData() {
//        ArrayList<Reservation_Model> expectedList = new ArrayList<>();
//        Reservation_Model reservation1 = new Reservation_Model(25, 10, 1, "Panadol", "2023-06-18");
//        Reservation_Model reservation2 = new Reservation_Model(50, 10, 1, "Panadol", "2023-06-18");
//        expectedList.add(reservation2);
//        expectedList.add(reservation1);
//
//        ArrayList<Reservation_Model> actualList = get_ReservationData();
//
//        assertEquals(expectedList.size(), actualList.size());
//
//        for (int i = 0; i < expectedList.size(); i++) {
//            Reservation_Model expectedModel = expectedList.get(i);
//            Reservation_Model actualModel = actualList.get(i);
//
//            // Compare the attributes of the expected and actual Reservation_Model objects
//            assertEquals(expectedModel.getPH_ID(), actualModel.getPH_ID());
//            assertEquals(expectedModel.getCU_ID(), actualModel.getCU_ID());
//            assertEquals(expectedModel.getQuantity(), actualModel.getQuantity());
//            assertEquals(expectedModel.getProduct_Name(), actualModel.getProduct_Name());
//            assertEquals(expectedModel.getDate(), actualModel.getDate());
//        }
//    }

    /**
     * Test of Search_Reservation method, of class Reservation_Operations.
     */
    @Test
    public void testSearch1_Reservation() {
        System.out.println("Search_Reservation");
        int PH_ID = 0;
        ArrayList<Reservation_Model> expResult = null;
        ArrayList<Reservation_Model> result = Reservation_Operations.Search_Reservation(PH_ID);
        assertEquals(expResult, result);
    }

    @Test
    public void testSearch2_Reservation() {
        System.out.println("Search_Reservation");
        int PH_ID = 25;
        ArrayList<Reservation_Model> expResult = new ArrayList<Reservation_Model>();
        Reservation_Model reservation = new Reservation_Model(25, 10, 1, "Panadol", "2023-06-18");
        expResult.add(reservation);
        ArrayList<Reservation_Model> result = Reservation_Operations.Search_Reservation(PH_ID);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of Delete_Reservation method, of class Reservation_Operations.
//     */
//    @Test
//    public void testDelete_Reservation() {
//        System.out.println("Delete_Reservation");
//        int PH_ID = 25;
//        int CU_ID = 10;
//        String productName = "Panadol";
//        Reservation_Operations.Delete_Reservation(PH_ID, CU_ID, productName);
//        // TODO review the generated test code and remove the default call to fail.
//        assertEquals(null, Search_Reservation(25));
//    }

    /**
     * Test of Edit_Reservation method, of class Reservation_Operations.
     */
//    @Test
//    public void testEdit_Reservation() {
//       System.out.println("Edit_Reservation");
//       int PH_ID = 0;
//        int CU_ID = 0;
//        String productName = "";
//       int quantity = 0;
//       Reservation_Operations.Edit_Reservation(PH_ID, CU_ID, productName, quantity);
//      // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
