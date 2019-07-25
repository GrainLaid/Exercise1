import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Your name?");
        JOptionPane.showMessageDialog(null, "Hello!,\n"+name+"!");
    }
}
