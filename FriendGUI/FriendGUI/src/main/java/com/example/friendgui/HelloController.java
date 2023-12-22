package com.example.friendgui;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class HelloController {
    public Label lblAge;
    public Label lblPhone;
    public Label lblName;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public TextField textGetAge;
    public TextField textGetPhoneNumber;
    public TextField textGetName;

    public ListView<Friend> friendList = new ListView<>();

    public void addFriend(ActionEvent actionEvent){
        Friend temp = new Friend(textGetAge.getText(), textGetPhoneNumber.getText(), textGetName.getText());
        friendList.getItems().add(temp);
        textGetAge.clear();
        textGetPhoneNumber.clear();
        textGetName.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) throws IOException {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblAge.setText(temp.getAge());
        lblPhone.setText(temp.getPhoneNum());
        lblName.setText(temp.getName());
    }

    public void createFriend(ActionEvent actionEvent){
        friendList.getItems().add(new Friend(textGetAge.getText(), textGetPhoneNumber.getText(), textGetName.getText()));
        textGetAge.clear();
        textGetPhoneNumber.clear();
        textGetName.clear();
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = friendList.getItems();
        for(Friend f : myList){
            try {
                f.writeToFile();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        friendList.getItems().clear();
    }

    public void loadFriend(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList friends = CreateFriend.createAllFriends("friends.txt");
        for (Object f : friends) {
            friendList.getItems().add((Friend) f);
        }
        System.out.println(friendList.getItems().toString());
    }
    public void clearFriend(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
    }
}