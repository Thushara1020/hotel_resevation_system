package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.dto.CustomerDTO;

public class CostomerFomeFXML {
    ObservableList<CustomerDTO> customerDTOS = FXCollections.observableArrayList(
            new CustomerDTO("C001", "John Doe", "30", "123-456-7890"),
            new CustomerDTO("C002", "Jane Smith", "25", "987-654-3210"),
            new CustomerDTO("C003", "Alice Johnson", "28", "555-123-4567")
    );

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colContact;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableView<?> tblCustomer;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtCustomerId;

    @FXML
    private TextField txtCustomerName;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
