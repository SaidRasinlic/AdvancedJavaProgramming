package connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaAdvancedProgramming {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "Saidolehan";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/mydb";
    //jdbc:mysql://localhost:3306/?user=root

    public static void main(String[] args) {

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Success!");
            Statement stmt = (Statement) conn.createStatement();
            String FName = "Said";
            String LName = "Rasinlic";
        
            String city = "Sarajevo";
            String createTable = "CREATE TABLE `mydb`.`user` (`id` INT NOT NULL AUTO_INCREMENT,`FName` VARCHAR(45) NULL,`LName` VARCHAR(45) NULL,`City` VARCHAR(45) NULL,PRIMARY KEY (`id`))";
            String insert = "INSERT INTO `mydb`.`user`(`id`, `FName`, `LName`, `City`) VALUES ('2', 'Lamija', 'Rasinlic', 'Sarajevo')";

     //   String createTable = "CREATE TABLE `mydb`.`user`(`id` int primary key auto_increment,`FName` varchar(45),`LName` varchar(45),`city` varchar(45) VALUES ('1','Said','Rasinlic','Sarajevo') ";
     //   String insert = "INSERT INTO `mydb`.`user` (`id`, `Fname`, `Lname`, `city`) VALUES ('3', 'Senad', 'Rasinlic', 'Sarajevo')";
      //INSERT INTO `mydb`.`user` (`id`, `FName`, `LName`, `City`) VALUES ('1', 'Said', 'Rasinlic', 'Sarajevo');
  
            stmt.executeUpdate(insert);

        } catch (SQLException ex) {
            System.err.println(ex);

        }

    }
}

//Cannot establish a connection to jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull using com.mysql.jdbc.Driver (Unable to load authentication plugin 'caching_sha2_password'.)
//vertToNull using com.mysql.jdbc.Driver (Communications link failure  The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.)
//jdbc:mysql://localhost:3306/?user=root

/*
String createTable = "CREATE TABLE `mydb`.`user` (`id` INT NOT NULL AUTO_INCREMENT,`FName` VARCHAR(45) NULL,`LName` VARCHAR(45) NULL,`City` VARCHAR(45) NULL,PRIMARY KEY (`idnew_table`))";

*/