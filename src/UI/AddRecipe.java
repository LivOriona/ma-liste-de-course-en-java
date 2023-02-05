package UI;

import Models.IngredientTableModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public AddRecipe() {
        addIngredientLineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addIngredient();
            }
        });
    }

    public void addIngredient() {
        IngredientTableModel tableModel = (IngredientTableModel) newRecipeIngredientsList.getModel();
        tableModel.addIngredientLine();
        newRecipeIngredientsList.updateUI();
    }

    public static void main() {
        JFrame frame = new JFrame("AddRecipe");
        frame.setContentPane(new AddRecipe().addNewRecipeContent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        newRecipeIngredientsList = new JTable(new Models.IngredientTableModel());
       //  ((IngredientTableModel) newRecipeIngredientsList.getModel()).test();
        // Integer 1 = Integer(1)
    }
}
