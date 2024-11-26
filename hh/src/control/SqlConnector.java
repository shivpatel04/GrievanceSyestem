package control;

public class SqlConnector {
      public java.sql.Connection connection;
    public SqlConnector() {
        String dbUrl = "jdbc:mysql://localhost:3306/fxck";
        try {
            this.connection = java.sql.DriverManager.getConnection(dbUrl, "root", "dabeli");
        } catch (java.sql.SQLException e) {
            System.out.println(e);
        }
    }
}
