/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sec_4_relations_interface_polymorphism;

/**
 *
 * @author Tamer
 */
public class Customer extends Person implements ICustomer{
    private int visaNumber;

    public Customer(){
    }
    public Customer(String name, int age, int visaNumber){
        super(name, age);
        this.visaNumber = visaNumber;
    }

    public void setVisaNumber(int visaNumber) {
        this.visaNumber = visaNumber;
    }

    public int getVisaNumber() {
       return this.visaNumber;
    }

}
