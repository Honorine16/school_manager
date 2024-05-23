package org.example.schoolmanager.models;

import org.example.schoolmanager.db.JDBConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Students {




    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String nom) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname= lastname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String email) {
        this.dateOfBirthday= dateOfBirthday;
    }

    public String getPlaceOfBirthday() {
        return placeOfBirthday;
    }

    public void setPlaceOfBirthday(String placeOfBirthday) {
        this.placeOfBirthday= placeOfBirthday;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private String firstname;
    private String lastname;
    private String dateOfBirthday;
    private String placeOfBirthday;
    private int state;
    private Connection connection;


    public void create(Students students) throws SQLException {


        connection = JDBConfig.getConnection();

        if (connection != null) {
            System.out.println("Database connected !");

            String req = "INSERT INTO Students (firstname, lastname, dateOfBirthday, placeOfBirthday, state) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepareStatement = this.connection.prepareStatement(req);
            prepareStatement.setString(1, students.getFirstname());
            prepareStatement.setString(2, students.getLastname());
            prepareStatement.setString(3, students.getDateOfBirthday());
            prepareStatement.setString(4, students.getPlaceOfBirthday());


            prepareStatement.executeUpdate();
            prepareStatement.close();
            this.connection.close();

            System.out.println("Elève ajouté avec succès !");
        }
    }





}
