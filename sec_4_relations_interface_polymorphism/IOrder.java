/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sec_4_relations_interface_polymorphism;

/**
 *
 * @author Tamer
 */
public interface IOrder {
    public void setOrderNumber(int orderNumber);
    public int getOrderNumber();
    
    public void setTotalCash(double cash);
    public double getTotalCash();
}
