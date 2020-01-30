/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sec_4_relations_interface_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tamer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Department Dept = new Department("Markting");
        ArrayList<Order> Orders = new ArrayList<Order>();

        Employee Emp []= {new Employee("Ahmed Ali", 22, 3200.0, Dept), new Employee("Eslam Hassen", 25, 4200.0, Dept)};
        Customer Cust[] = {new Customer("Tamer Yassen", 23, 12345), new Customer("Wael Eid", 22, 67899)};

         Order e = Emp[0].makeOrder(97, 2500, Cust[1]) ;
         Orders.add(e);

         e = Emp[1].makeOrder(98, 3600, Cust[1]) ;
         Orders.add(e);

          e = Emp[0].makeOrder(99, 6560, Cust[0]) ;
         Orders.add(e);
         System.out.println(" All Employee Data : \n________________________");
         for(Employee x : Emp){
            System.out.println( "\n Employee Name : " + x.getName()
                    +"\n Dept : " + x.myDept.getDname()
                    +"\n Salary : " + x.getSalary()
                    +"\n Age : " + x.getAge());
         }

         System.out.println("\n All Custmer Orders : \n________________________");
         for(Order x : Orders){
            System.out.println( "Order # "+ x.getOrderNumber()
                    +"\n Custmor Name : " + x.OrderOwner.getName()
                    +"\n Visa Code : " + x.OrderOwner.getVisaNumber()
                    +"\nTotal cash : " + x.getTotalCash());
         }


    }
}
