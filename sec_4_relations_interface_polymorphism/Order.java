/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sec_4_relations_interface_polymorphism;

/**
 *
 * @author Tamer
 */
public class Order implements IOrder{
    private int OrderNumber;
    private double totalCash;
    Customer OrderOwner;
    
    public Order(){
    }
     public Order(int OrderNumber , double cash, Customer OrderOwner){
         this.OrderNumber = OrderNumber;
         this.totalCash = cash;
         this.OrderOwner = OrderOwner;
         
    }
    public void setOrderNumber(int orderNumber) {
        this.OrderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return this.OrderNumber;
    }

    public void setTotalCash(double cash) {
        this.totalCash  = cash;
    }

    public double getTotalCash() {
       return this.totalCash;
    }
}
