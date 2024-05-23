package org.example.schoolmanager.Interfaces;

import java.sql.SQLException;
import java.util.List;

public interface Students {
    void create(Students students) throws SQLException;
    void read(int id);
    void update(Students students);
    void delete(int id);
    List<Students> list() throws SQLException;

}
