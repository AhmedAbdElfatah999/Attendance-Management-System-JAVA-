/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sec_4_relations_interface_polymorphism;

/**
 *
 * @author Tamer
 */
public interface IEmployee {
    public void setSalary(double salary);
    public double getSalary();
    public Order makeOrder(int OrderNumber , double cash, Customer OrderOwner);
}
