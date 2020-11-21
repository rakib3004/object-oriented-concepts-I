package src.RetailSystem;

import javax.swing.JOptionPane;
public class ShoppingSystem {

    public static void main(String[] args) {
        Manager manager = new Manager("M1001", 35000, "Noushaw Nuhash", 20000);

        JOptionPane.showMessageDialog(null,"Manager Name :"+ manager.getName());
        JOptionPane.showMessageDialog(null,"Manager Basic Salary :"+ manager.getBasic_salary());
        JOptionPane.showMessageDialog(null, "Manager Payment :"+manager.getPay());

        int side = 55;

        int side2=45;

        double volume = Math.sqrt(Math.pow(side,2))- Math.sqrt(Math.pow(side2,2));
    JOptionPane.showMessageDialog(null,"The volume of the office: "+volume);

    }
}

