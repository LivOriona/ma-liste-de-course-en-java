package Models;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class IngredientTableModel implements TableModel {

    // attributs
    // faire un tableau d'Ingrédients ? Pour avoir une quantité. Le nombre d'ingrédients détermine le nombre de lignes du tableau
    // private Models.Ingredient monIngredient = new Models.Ingredient("poivron", "u", 1.0, 3.99/3);
    private ArrayList<Models.Ingredient> ingredients = new ArrayList<>();
    /*public void test() {
        Models.Ingredient poivron = new Models.Ingredient("Poivron", "u", 1.0, 2.0);
        Models.Ingredient courgette = new Models.Ingredient("Courgette", "u", 1.0, 1.0);
        Models.Ingredient mozzarella = new Models.Ingredient("Mozzarella", "gr", 100.0, 0.80);
        Models.Ingredient feta = new Models.Ingredient("Fêta", "gr", 200.0, 2.25);
        ingredients.add(poivron);
        ingredients.add(courgette);
        ingredients.add(mozzarella);
        ingredients.add(feta);
    }*/
    public void addIngredientLine() {
        ingredients.add(new Ingredient("", "", 0.0, 0.0));
    }
    @Override
    public int getRowCount() {
        // return 4; // utiliser les attributs et fonctions des listes (length)
        return ingredients.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Nom";
        } else if (columnIndex == 1) {
            return "Unité";
        } else if (columnIndex == 2) {
            return "Quantité";
        } else {
            return "Prix";
        }
    }

    @Override // ignorer
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex < 2)
            return String.class;
        else
            return Double.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // sélectionner chaque colonne (de 0 à 3), avec un if ou un switch par ex
        switch (columnIndex) {
            case 0:
                return ingredients.get(rowIndex).name;
            case 1:
                return ingredients.get(rowIndex).unit;
            case 2:
                return ingredients.get(rowIndex).quantity;
            default:
                return ingredients.get(rowIndex).cost;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                ingredients.get(rowIndex).name = (String) aValue;
            case 1:
                ingredients.get(rowIndex).unit = (String) aValue;
            case 2:
                ingredients.get(rowIndex).quantity = (Double) aValue;
            default:
                ingredients.get(rowIndex).cost = (Double) aValue;
        }
    }

    @Override // ignorer
    public void addTableModelListener(TableModelListener l) {

    }

    @Override // ignorer
    public void removeTableModelListener(TableModelListener l) {

    }
}
