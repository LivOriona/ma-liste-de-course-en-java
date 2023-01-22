package UI;

import javax.swing.*;

public class RecipesList {
    private JPanel panel1;
    private JSplitPane recipesListSplitContent;
    private JList recipesList;
    private JTable recipeIngredientList;
    private JButton accessRecipeURLButton;
    private JButton addNewRecipeButton;
    private JPanel recipesListContent;
    private JPanel chooseRecipeContent;
    private JLabel recipesListHeader;
    private JScrollPane recipesListScroll;
    private JLabel recipeIngredientsHeader;
    private JScrollPane recipeIngredientsListScroll;
    private JLabel recipeTotalCost;
    private JPanel addNewRecipeContent;
    private JLabel dose;
    private JPanel recipeDoseContent;
    private JSpinner enterDose;
    private JPanel ingredientsContent;

    public static void main() {
        JFrame frame = new JFrame("RecipesList");
        frame.setContentPane(new RecipesList().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
