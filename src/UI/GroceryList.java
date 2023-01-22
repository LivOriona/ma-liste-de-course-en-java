package UI;

import javax.swing.*;

public class GroceryList {
    private JPanel panel1;
    private JTable groceryList;
    private JTable selectedRecipesList;
    private JSplitPane groceryListSplitContent;
    private JScrollPane scrollGroceryList;
    private JScrollPane scrollSelectedRecipes;
    private JPanel displayCostContent;
    private JLabel totalCost;

    public static void main() {
        JFrame frame = new JFrame("RecipesUI");
        frame.setContentPane(new GroceryList().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
