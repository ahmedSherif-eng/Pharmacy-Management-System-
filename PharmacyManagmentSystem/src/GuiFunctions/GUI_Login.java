/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiFunctions;

import Control.Pharmacist_operations;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import loginform.login;
import static loginform.login.Manager;
import loginform.phar_rond;
import loginform.rond;


/**
 *
 * @author ASUS
 */
public class GUI_Login
{
    
    public int check_info(String Email,String Password)
    {
    
        int flag=0;
        int error_status= Pharmacist_operations.check_Pharmacist_Acc(Email, Password);
         
        if(Email.equals("admin@gmail.com") && Password.equals("admin")) // manager
        { 
            flag=1;
            rond obj=new rond();
            obj.setVisible(true);
            Manager=true;
        }
        else if(error_status == 0) // pharmacist
        {
            flag=2;
            
            phar_rond obj=new phar_rond();
            obj.setVisible(true);
            Manager=false;
        }
        else
        {
            flag=0;
          JOptionPane.showMessageDialog(null, "Wrong Email or Password!","Message", JOptionPane.ERROR_MESSAGE);

        
        }
        return flag;
    }         
    
    // -------------------------------------------------------------------------------------------------------------- //
     public boolean validateFields(String Email,String Password)
    {
        boolean  isvalid = false;
        
        login log2=new login();
        String email=Email;
        String password=Password;
        if(!email.equals("")&&!password.equals(""))
        {
            isvalid = true;
            log2.setEnabled(true);
        }
        else
        {
            log2.setEnabled(false);
        }    
        return isvalid;
    }
     
  
 // -----------------------------------------------------------  salary checking ------------------------------------- //
//      ArrayList<Integer> recieve = new ArrayList();
//          recieve = Pharmacist_operations.sumSalaries();
//                   int totalSalary = 0;
//                for (int i = 0; i <  recieve.size(); i++) 
//                {
//                    int salary =  recieve.get(i);
//                    totalSalary += salary;
//                 }
    
    
                
                
    public  int calculateTotalSalary() 
    {
        ArrayList<Integer> recieve = new ArrayList();
        recieve = Pharmacist_operations.sumSalaries();

    int totalSalary = 0;
    for (int i = 0; i < recieve.size(); i++) {
        int salary = recieve.get(i);
        totalSalary += salary;
    }
    return totalSalary;
} 
                
                
                
                
                
                
                
                
                
                
                
    }
    
    
    

