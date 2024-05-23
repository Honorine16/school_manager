package org.example.schoolmanager.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.schoolmanager.models.Students;

import java.time.LocalDate;

public class studentsController {

    @FXML
    private TextField classe;
    @FXML
    private TextField stateField;
    @FXML
    private DatePicker dateNaissance;

    @FXML
    private TextField lieuNaissance;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;
    @FXML
    private Label state;


    @FXML
    private Button soumettre;

    @FXML
    void onSubmit(ActionEvent event) {

            System.out.println("OK");
            String firstname = nom.getText().trim();
            String lastname = prenom.getText().trim();
            LocalDate dateOfBirthText = dateNaissance.getValue();
            String placeOfBirth = lieuNaissance.getText().trim();
            int state = Integer.parseInt(stateField.getText().trim());

//        if (!firstname.isEmpty() && !lastname.isEmpty() &&
//                    !dateOfBirthtext.isEmpty() && !placeOfBirth.isEmpty()) {


//            }
            try {
                LocalDate dateOfBirth = dateOfBirthText;

                Students students = new Students();
                students.setFirstname(firstname);
                students.setLastname(lastname);

                students.setDateOfBirthday(String.valueOf(dateOfBirth));
                students.setPlaceOfBirthday(placeOfBirth);
                students.setState(state);

                    students.create(students);


            } catch (Exception e) {
                System.out.println(e);
            }
        }





}
