package connectionpool;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankDao implements Dao<Bank> {

    private final ConnectionPool connectionPool;

    public BankDao(ConnectionPool connectionPool) {
        this.connectionPool = Optional.ofNullable(connectionPool).orElseThrow(
                () -> new RuntimeException("Ja, bankDao ne primam null connection pool object!!"));
    }

    /* private final String name;
    private final String surname;
    private final Integer balance;
    private final String address;
    private final String gender;
    private final Date birthday;
     */
    @Override
    public void save(Bank entity) throws SQLException {

        String sqlInsertStatement = "INSERT INTO accountservice ( `name`, `surname`, `balance`, `address`,`gender`, `birthday`)\n"
                + "VALUES(?,?,?,?,?,?)";

        PreparedStatement statement = connectionPool.getConnection().prepareStatement(sqlInsertStatement);

        statement.setString(1, entity.getName());
        statement.setString(2, entity.getSurname());
        statement.setDouble(3, entity.getBalance());
        statement.setString(4, entity.getAddress());
        statement.setString(5, entity.getGender());
        statement.setString(6, entity.getBirthday());

        statement.executeUpdate();

    }

    @Override
    public List<Bank> getAll() throws SQLException {
        try {
            String sqlGetAllStatement = "SELECT * FROM banksystemdata.accountservice";
            List<Bank> bankList = new ArrayList<>();
            PreparedStatement ps = connectionPool.getConnection().prepareStatement(sqlGetAllStatement);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bank bank = new Bank(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getDouble("balance"), rs.getString("address"),
                        rs.getString("gender"), rs.getString("birthday"));
                bankList.add(bank);
            }
            return bankList;

        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());

        }
    }

    @Override
    public Bank get(int primaryKey) throws SQLException {
        String sqlQuery = "SELECT *FROM accountservice WHERE id=?";
        PreparedStatement preparedStatement = connectionPool.getConnection().prepareStatement(sqlQuery);
        preparedStatement.setInt(1, primaryKey);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            return (Bank) (List<Bank>) new Bank(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6));
        } else {
            return null;
        }

    }

    @Override
    public void update(Bank entity) throws SQLException {
        try {

            String sqlStatement = "UPDATE accountservice SET  `name`=?, `surname`=?,`balance`=?,`address`=?, `gender`=?, `birthday`=? WHERE id=?";
            PreparedStatement ps = connectionPool.getConnection().prepareStatement(sqlStatement);
            //ResultSet rs = ps.executeUpdate(sqlStatement);
            //  ps.setInt(0, entity.getId());
            ps.setString(1, entity.getName());
            ps.setString(2, entity.getSurname());
            ps.setDouble(3, entity.getBalance());
            ps.setString(4, entity.getAddress());
            ps.setString(5, entity.getGender());
            ps.setString(6, entity.getBirthday());
            ps.setInt(7, entity.getId());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
    
    

    @Override
    public void delete(Bank entity) throws SQLException {
        try {

            String sqlStatement = "delete from accountservice WHERE id=? ";
            PreparedStatement ps = connectionPool.getConnection().prepareStatement(sqlStatement);
            ps.setInt(1, entity.getId());

            ps.executeUpdate();

            /*    int updated_rows = 0;
            if (updated_rows > 0) {
                System.out.println("DELETED SUCCESSFULLY");
            } else {
                System.out.println("YOU FAILED!");
            }
             */
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
