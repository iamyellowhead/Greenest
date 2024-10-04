import javax.swing.*;

public class Main {

        private IBotanic igge = new Cactus("Igge", "Mineral water", 0.2); //polymorfism
        private IBotanic olof = new Palm("Olof", "Tap water",1);
        private IBotanic laura = new Palm("Laura","Tap water", 5);
        private IBotanic meatloaf = new CarnivorousPlant("Meatloaf","Protein drink",0.7);


    public Main() {
        while(true) {
            String input = JOptionPane.showInputDialog(null, "Which plant should receive liquid? \n\n\n ALTERNATIV:\n\n Igge \n Laura \n Meatloaf \n Olof ");


            if (input == null || input.trim().isEmpty()) {
                System.out.println("Program ended");
                break;
            }

            input = input.toLowerCase();


            switch (input) {
                case "olof" -> JOptionPane.showMessageDialog(null, olof.getName() + ": " + olof);
                case "laura" -> JOptionPane.showMessageDialog(null, laura.getName() + ": " + laura);
                case "meatloaf" ->JOptionPane.showMessageDialog(null, meatloaf.getName() + ": " + meatloaf);
                case "igge" -> JOptionPane.showMessageDialog(null, igge.getName() + ": " + igge);
                default -> JOptionPane.showMessageDialog(null, "Invalid input");
            }
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
    }

}