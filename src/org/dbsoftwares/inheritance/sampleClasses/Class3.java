/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.inheritance.sampleClasses;


/**
 *
 * @author Tóth Péter György
 */
public class Class3 extends Class2 {
    /**
     * If you modify method1 in this class with @Override annotation,
     * you can still call the the Class2 implementation 
     * with <code>super.method1();</code>
     */
    @Override
    public void method1() {
        System.out.println("Override method1 from class2 with this:");
        System.out.println("You called Class3.method1();");
    }
    
    public void method2() {
        //This calls Class2.method1();
        super.method1();
    }
}
