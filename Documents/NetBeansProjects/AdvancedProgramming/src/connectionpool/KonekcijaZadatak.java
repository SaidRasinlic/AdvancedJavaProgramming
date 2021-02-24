package connectionpool;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class KonekcijaZadatak {

    public static void main(String[] args) {

        try {
            //ALTER TABLE clientdata CHANGE `name` `username` varchar(45);

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystemdata", "root", "Threethree");

            //  System.out.println("Connected successfully");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String schema = "CREATE SCHEMA najnovijaschema";
            String table = "CREATE table blah(id int not null primary key auto_increment,name varchar(45) not null,surname varchar(45) not null),score int";
            String insert = "INSERT INTO hiscores(name,surname) VALUES ('Esad','Rasinlic')";
            String rename = "ALTER TABLE najnovijaschema.novitable RENAME to najnovijaschema.hiscores";
            String addColumn = "ALTER TABLE najnovijaschema.hiscores ADD column score int after surname";
            String update = "UPDATE hiscores SET score = 50000 where id = 3";
            String auto_increment = "ALTER TABLE hiscores AUTO_INCREMENT =1";
            //stmt.execute(table);
            /*  stmt.execute("insert into hiscores(name,surname) values('Jack','King')",Statement.RETURN_GENERATED_KEYS);
       long last_id=-1;
       ResultSet generated_keys = stmt.getGeneratedKeys();
       if(generated_keys.next()){
           last_id =generated_keys.getLong(1);
       }
            System.out.println("LAST GENERATED KEY: " + last_id);*/
            //   stmt.executeUpdate(insert);
            ResultSet result_set = stmt.executeQuery("SELECT * from accountservice");
//result_set.absolute(1);
//result_set.updateString(3, "Rasynl");
// result_set.updateRow();
            System.out.println("ID\tName\tSurname\t\tBalance\t\tAddress\t\tGender\t\tBirthday");
            while (result_set.next()) {
                // if koristimo za jedan kod 
                //    System.out.println("ID\tName\tSurname\tBalance\tAddress\tGender\t\t\t\t\tBirthday");
                System.out.println(result_set.getString("ID") + "\t" + result_set.getString("Name") + "\t" + result_set.getString("Surname") + " " + "\t" + result_set.getString("balance")
                        + "    " + "\t" + result_set.getString("Address") + "      " + "\t" + result_set.getString("Gender") + "       " + "\t" + result_set.getString("Birthday"));

                System.out.println("---------------------------------------------------------------------------------------------");
                //  System.out.println(result.getString("name") + "\t" + result.getInt(1));                
            }
/*
            DatabaseMetaData dbase = conn.getMetaData();
            ResultSet res = dbase.getCatalogs();
            while (res.next()) {
                 System.out.println("DATABSES " + res.getString(1));
            
            }

            System.out.println("INFO O TRENUTNOM STANJU");
            ResultSetMetaData meta = result_set.getMetaData();
            System.out.println("SCHEMA: " + meta.getCatalogName(1));

            System.out.println("TABLE: " + meta.getTableName(1));

            PreparedStatement prep_st = conn.prepareStatement("delete from hiscores where id>3");
            // prep_st.setInt(1,4);
            /* int updated_rows = prep_st.executeUpdate();
            if (updated_rows > 0) {
                System.out.println("ADDED SUCCESSFULLY");
            } else {
                System.out.println("BRO U FAILED!");
            }  */

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

}
