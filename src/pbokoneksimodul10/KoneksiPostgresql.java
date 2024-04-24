//package pbokoneksimodul10;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class KoneksiPostgresql {
//
//    private Connection connect;
//    private String driverName = "org.postgresql.Driver";
//    private String jdbc = "jdbc:postgresql:  //";
//    private String host = "localhost";
//    private String port = "5432";
//    private String database = "crud2220702359";
//    private String url = jdbc + host + ":"+ port + "/" + database;
//    private String username = "nicholas";
//    private String password = "password";
//
//    public Connection getKoneksi() throws SQLException {
//        if (connect == null) {
//            try {
//                Class.forName(driverName);
//                System.out.println("Class Driver Ditemukan");
//
//                try {
//                    connect = DriverManager.getConnection(url, username, password);
//                    System.out.println("Koneksi Database Sukses");
//                } catch (SQLException se) {
//                    System.out.println("Koneksi Database Gagal" + se);
//                    System.exit(0);
//                }
//            } catch (ClassNotFoundException cnfe) {
//                System.out.println("Class Driver tidak ditemukan, terjadi kesalahan pada : " + cnfe);
//            }
//
//        }
//        return connect;
//    }
//}
