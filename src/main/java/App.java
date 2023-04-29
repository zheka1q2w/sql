import java.sql.*;

public class App {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/my_db", "local_user", "hC3>w$La")) {
            Statement stmt = connection.createStatement();

//            String sqlCommand = "CREATE TABLE students " +
//                    "(id INTEGER not NULL, " +
//                    "name VARCHAR(225), " +
//                    "gender VARCHAR(255)," +
//                    "age INTEGER, " +
//                    "email VARCHAR(255), " +
//                    "PRIMARY KEY ( id ))";
//            stmt.execute(sqlCommand);

//            String strInsert =  "INSERT INTO students(id, name, gender, age, email) VALUES" +
//                    "(1, 'Denorris', 'male', 19, 'denorris_forehands@analyze.lc')," +
//                    "(2, 'Terina', 'female', 20, 'terina_remingtong@quantitative.kq')," +
//                    "(3, 'Malika', 'female', 18, 'zeinab_leisvtxx@excluding.df')," +
//                    "(4, 'Kathlena', 'female', 18, 'kathlena_bencomol0@pilot.gv')," +
//                    "(5, 'Kain', 'male', 20, 'chelcie_riehlv@disputes.nx')," +
//                    "(6, 'Otha', 'female', 21, 'otha_sherwindli2@commonwealth.sxi')," +
//                    "(7, 'Sharron', 'male', 19, 'sharron_mcdougallv@jane.iyn')," +
//                    "(8, 'Yosef', 'male', 18, 'yosef_morissettexf@side.xg')," +
//                    "(9, 'loose', 'male', 21, 'rosita_stabilej@gate.wev')," +
//                    "(10, 'Keiko', 'female', 20, 'keiko_barnumps@cement.sc');";
//            stmt.execute(strInsert);

            String selectCommand = "SELECT * FROM students";
            ResultSet resultSet = stmt.executeQuery(selectCommand);
            int num = 1;
            while (resultSet.next()) {
                System.out.print(resultSet.getString(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.print(resultSet.getString(3) + " ");
                System.out.print(resultSet.getString(4) + " ");
                System.out.print(resultSet.getString(5) + " ");
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
