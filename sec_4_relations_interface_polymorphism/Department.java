/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sec_4_relations_interface_polymorphism;

/**
 *
 * @author Tamer
 */
public class Department implements IDepartment{
    private String DeptName;

    public Department(String name){
        this.DeptName = name;
    }
    public void setDname(String name) {
        this.DeptName = name;
    }

    public String getDname() {
       return this.DeptName;
    }

}
