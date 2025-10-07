
package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.dto.TableinfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class TableinfoController implements Initializable {

    ObservableList<TableinfoDTO> roomInfoDTOS = FXCollections.observableArrayList(
            new TableinfoDTO("R001", "Single", "A cozy room for one", 75.0),
            new TableinfoDTO("R002", "Double", "A comfortable room for two", 120.0),
            new TableinfoDTO("R003", "Suite", "A luxurious suite with a view", 250.0)
    );

    @FXML
    private TableColumn<TableinfoDTO, String> colRoomID;

    @FXML
    private TableColumn<TableinfoDTO, String> colType;

    @FXML
    private TableColumn<TableinfoDTO, String> colDescription;

    @FXML
    private TableColumn<TableinfoDTO, Double> colPrice;

    @FXML
    private TableView<TableinfoDTO> tableView;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        colRoomID.setCellValueFactory(new PropertyValueFactory<>("room"));
        colType.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableView.setItems(roomInfoDTOS);
        System.out.println(roomInfoDTOS);
    }

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDelet;

    @FXML
    private Button btnUpDate;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtRoomID;

    @FXML
    private TextField txtTypr;


    public void addAction(ActionEvent actionEvent) {
    }

    public void updateAction(ActionEvent actionEvent) {

    }

    public void deletAction(ActionEvent actionEvent) {

    }

    public void clearAction(ActionEvent actionEvent) {

    }

    public Button getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(Button btnAdd) {
        this.btnAdd = btnAdd;
    }

    public Button getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(Button btnClear) {
        this.btnClear = btnClear;
    }

    public Button getBtnDelet() {
        return btnDelet;
    }

    public void setBtnDelet(Button btnDelet) {
        this.btnDelet = btnDelet;
    }

    public Button getBtnUpDate() {
        return btnUpDate;
    }

    public void setBtnUpDate(Button btnUpDate) {
        this.btnUpDate = btnUpDate;
    }

    public TextField getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(TextField txtDescription) {
        this.txtDescription = txtDescription;
    }

    public TextField getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(TextField txtPrice) {
        this.txtPrice = txtPrice;
    }

    public TextField getTxtRoomID() {
        return txtRoomID;
    }

    public void setTxtRoomID(TextField txtRoomID) {
        this.txtRoomID = txtRoomID;
    }

    public TextField getTxtTypr() {
        return txtTypr;
    }

    public void setTxtTypr(TextField txtTypr) {
        this.txtTypr = txtTypr;
    }
}