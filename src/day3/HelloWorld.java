package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Cows go Moo!");
	String name = JOptionPane.showInputDialog("Enter your name.");
	JOptionPane.showMessageDialog(null, "Hi "+name+"!You are cool!");
}
}
