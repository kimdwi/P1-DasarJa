import javax.swing.*;

public class S_InputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name ?");
        System.out.println("My name is " + name);
        System.exit(0);
    }
}
