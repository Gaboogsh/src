import javax.swing.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String validAgent = JOptionPane.showInputDialog("Enter the number of Agents:");
        if (validAgent == null || validAgent.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid. Please Enter a Valid Number to Proceed.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        int arr1 = Integer.parseInt(validAgent);


        Agent[] agentArr = new Agent[arr1];

        for (int i = 0; i < arr1; i++) {
            String name =  JOptionPane.showInputDialog("Enter Agent#" + i +" name");
            if (name == null || name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid. Please Enter a Valid Name to Proceed.","Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            String validAge = JOptionPane.showInputDialog("Enter Agent#" + i +" age");
            if (validAge == null || validAge.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid. Please Enter a Valid Age to Proceed..", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            int age = Integer.parseInt(validAge);

            String validSales = JOptionPane.showInputDialog("Enter Agent#" + i +" sales");
            if (validSales == null || validSales.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid. This line cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            double sales = Double.parseDouble(validSales);
            agentArr[i] = new Agent(name, age, sales);

        }
        double averageAgent = Agent.averageAgent(agentArr);
        Agent mostSaleAgent = Agent.highestAgent(agentArr);

        JOptionPane.showMessageDialog(null, "Average sales per Agents: " + averageAgent);

        if (mostSaleAgent != null) {
            String mostSaleAgent1 = "Agent with the highest sales is: "
                    + "\nName:" + mostSaleAgent.getName()
                    + "\nAge:" + mostSaleAgent.getAge()
                    + "\nSales:" + mostSaleAgent.getSales();
            JOptionPane.showMessageDialog(null, mostSaleAgent1, "Highest Sales agent", JOptionPane.INFORMATION_MESSAGE);
        }



    }
}