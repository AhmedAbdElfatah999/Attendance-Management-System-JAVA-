/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sec_4_relations_interface_polymorphism;

/**
 *
 * @author Tamer
 */
public class Employee extends Person implements IEmployee {
    private double salary;
    Department myDept;

    public Employee(){
    }

     public Employee(String name, int age, double salary, Department dept){
         super(name, age);
         this.salary  = salary;
         this.myDept = dept;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public Order makeOrder(int OrderNumber, double cash, Customer OrderOwner) {
        return new Order(OrderNumber, cash, OrderOwner);
    }

}
