package UI;

import javax.swing.*;

public class AddRecipe {
    private JTable table1;
    private JButton addIngredientLineButton;
    private JButton validateAddNewRecipeButton;
    private JScrollPane newRecipeIngredientsPanel;
    private JPanel addNewRecipeIngredientPanel;
    private JPanel validationPanel;
    private JPanel addNewRecipeContent;
    private JTable newRecipeIngredientsList;
    private JTextField enterNewRecipeName;
    private JTextField enterNewRecipeURL;
    private JPanel newRecipeNamePanel;
    private JPanel newRecipeURLPanel;
    private JLabel newRecipeName;
    private JLabel newRecipeURL;

    public static void main() {
        JFrame frame = new JFrame("AddRecipe");
        frame.setContentPane(new AddRecipe().addNewRecipeContent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
