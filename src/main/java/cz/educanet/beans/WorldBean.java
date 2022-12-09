package cz.educanet.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class WorldBean {
    public List<World> getWorlds() {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world?user=root&password=");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM world")
        ) {
            ArrayList<World> articles = new ArrayList<>();

            while (resultSet.next()) {
                articles.add(new World(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getLong(3),
                        resultSet.getLong(4),
                        resultSet.getLong(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8)
                ));
            }

            return articles;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
