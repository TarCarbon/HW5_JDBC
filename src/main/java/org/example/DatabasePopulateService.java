package org.example;

import util.FileReaderSQL;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    private static final String DB_QUERY_FILE = "sql/populate_db.sql";

    public static void main(String[] args) throws SQLException, IOException {
        Statement statement = Database.getInstance().getConnection().createStatement();
        statement.executeUpdate(new FileReaderSQL().getQuery(DB_QUERY_FILE));
    }

}
