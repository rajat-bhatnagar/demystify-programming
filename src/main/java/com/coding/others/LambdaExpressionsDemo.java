package com.coding.others;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Demonstration of an inner class using JButton
 */
public class LambdaExpressionsDemo {
    public static void main(String[] args) {

        //The old way
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1");
            }
        };

        runnable1.run();
        //The Lambda expression way
        Runnable lambdaRunnable =
                () -> System.out.println("Runnable via lambda expression");

        lambdaRunnable.run();

        // The old way
        JButton button = new JButton("Pressing a button - The Old way before Java 8");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click Detected");
            }
        });

        // The Lambda Expression way
        JButton myLambdaButton = new JButton("Lambda Button");
        myLambdaButton.addActionListener(
                e -> System.out.println("Action Performed")
        );
    }
}
