/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.inheritance.sampleClasses;


public class Class2 extends Class1 {
    /**
     * If you modify method1 in this class with @Override annotation,
     * you can still call the JDialog implementation 
     * with <code>super.method1();</code>
     */
    @Override
    public void method1() {
        System.out.println("Override method1 with this: ");
        System.out.println("You called Class2.method1();");
    }
    
    public void method2() {
        // This calls Class1.method1();
        super.method1();
    }
}
