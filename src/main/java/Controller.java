import Animals.Animal;
import Animals.Gender;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

@SuppressWarnings({"unchecked", "SpellCheckingInspection", "unused"})
public class Controller implements Initializable {

    public TextField badHabitsField;
    public TextField reservorNameField;
    public Button addButton;
    public Button reserveButton;
    public RadioButton maleButton;
    public RadioButton femaleButton;
    public ListView animalsBox;
    public ComboBox speciesBox;
    public TextField nameField;
    public TextField productNameField;
    public TextField productPriceField;
    public Button addProductButton;
    public ListView productBox;
    public TextField depositField;
    public Button depositButton;
    public Label moneyLabel;
    public Button purchaseButton;

    private Reservation reservation = Reservation.getInstance();
    private WebShop webShop = WebShop.getInstance();
    private static double money;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private void refreshControls() {
        animalsBox.setItems(null);
        animalsBox.setItems(FXCollections.observableArrayList(reservation.getAnimals()));
        productBox.setItems(null);
        productBox.setItems(FXCollections.observableArrayList(webShop.getProducts()));
        reserveButton.setDisable(animalsBox.getSelectionModel().getSelectedItem() != null);
        moneyLabel.setText(String.format("You have € %.2f on your account.", money));
    }

    public void addButton_Click(ActionEvent actionEvent) {
        Gender gender = maleButton.isSelected() ? Gender.Male : Gender.Female;

        if (speciesBox.getValue().equals("Cat")) {
            reservation.newCat(nameField.getText(), gender, badHabitsField.getText());
        }
        else {
            reservation.newDog(nameField.getText(), gender);
        }
        refreshControls();
    }

    public void reserveButton_Click(ActionEvent actionEvent) {
        Animal animal = (Animal)animalsBox.getSelectionModel().getSelectedItem();
        if (animal != null) {
            animal.Reserve(reservorNameField.getText());
            refreshControls();
        }
    }

    public void speciesBox_Change(ActionEvent actionEvent) {
        badHabitsField.setDisable(!speciesBox.getSelectionModel().getSelectedItem().equals("Cat"));
    }

    public void animalsBox_Click(MouseEvent mouseEvent) {
        reserveButton.setDisable(animalsBox.getSelectionModel().getSelectedItem() == null);
    }

    public void addProductButton_Click(ActionEvent actionEvent) {
        try {
            webShop.newProduct(new Product(productNameField.getText(), Double.parseDouble(productPriceField.getText())));
            refreshControls();
        }
        catch (NumberFormatException e) {
            productPriceField.setText("Cannot contain letters");
        }

    }

    public void depositButton_Click(ActionEvent actionEvent) {
        try {
            money += Double.parseDouble(depositField.getText());
        }
        catch (NumberFormatException e) {
            depositField.setText("Cannot contain letters");
        }
        refreshControls();
    }

    public void purchaseButton_Click(ActionEvent actionEvent) {
        Product product = (Product)productBox.getSelectionModel().getSelectedItem();
        if (product.getPrice() <= money) {
            money -= product.getPrice();
            webShop.removeProduct(product);
        }
        refreshControls();
    }
}