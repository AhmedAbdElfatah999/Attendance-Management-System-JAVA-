/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sec_4_relations_interface_polymorphism;

/**
 *
 * @author Tamer
 */
public class Person implements IPerson {

    protected String name;
    protected int age;
    

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

//      setName(name);
//      setAge(age);

    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


}
