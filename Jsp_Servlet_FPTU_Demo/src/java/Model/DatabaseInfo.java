package Model;

public interface DatabaseInfo {

    public static String DRIVERNAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String DBURL = "jdbc:sqlserver://localhost:1433;" + "databaseName=Login;" + "encrypt=false";
    public static String USERDB = "sa";
    public static String PASSDB = "1233456789";

}
