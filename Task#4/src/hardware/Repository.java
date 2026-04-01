/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hardware;

/**
 *
 * @author redelyn
 */
public class Repository {
    import java.sql.*;
import java.util.ArrayList;

class HardwareRepository {
    private final String url = "jdbc:mysql://127.0.0.2:3306/hardware"; // Change DB name
    private final String user = "root"; // Change username
    private final String password = "Red123lyn45"; // Change password

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public ArrayList<Hardware> getAllHardware() {
        ArrayList<Hardware> list = new ArrayList<>();
        String sql = "SELECT * FROM hardware";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                String type = rs.getString("type");
                int spec = rs.getInt("spec");

                if (type.equalsIgnoreCase("Laptop")) {
                    list.add(new Laptop(id, brand, spec));
                } else if (type.equalsIgnoreCase("Phone")) {
                    list.add(new Phone(id, brand, spec));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public void addHardware(Hardware h) {
        String sql = "INSERT INTO hardware (brand, type, spec) VALUES (?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, h.getBrand());
            pstmt.setString(2, h.getType());
            pstmt.setInt(3, h.getSpec());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}
