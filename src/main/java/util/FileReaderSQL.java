package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSQL {
    public String getQuery(String file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String sql = "", line;
            while ((line = bufferedReader.readLine()) != null) sql += (line + "\n");
        return sql;
    }

}
