/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.inheritance.main;
import org.dbsoftwares.inheritance.sampleClasses.*;

/**
 *
 * @author Tóth Péter György
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Class1 cl01 = new Class1();
     Class2 cl02 = new Class2();
     Class3 cl03 = new Class3();
     
     // Calling the functions in order
     
     cl01.method1(); // AKA Class1.method1()
     cl02.method1(); // AKA Class2.method1()
     cl02.method2(); // AKA Class1.method1() - inheritance from Class1
     cl03.method1(); // AKA Class3.method1()
     cl03.method2(); // AKA Class2.method1() - inheritance from Class2
     
     /* Here comes the important thing
      * If you do not touch the function of the base class,
      * all of its child class will get it as it was.
      */
     cl01.methodName();
     cl02.methodName();
     cl03.methodName();
     
    }
}
