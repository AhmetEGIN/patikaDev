package patikaDev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	private static final String DB_URL = "jdbc:postgresql://localhost/university";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "12345";

	public static void main(String[] args) {

		Connection connection = null;
		Statement st = null;
		String sql = "SELECT * FROM  students";
		String insertSql = "INSERT INTO students (name,class) VALUES ('Damla', 4)";
		String psSql = "INSERT INTO students (name,class) VALUES (?,?)";
		String updateSql = "UPDATE students SET name='Kaðan' WHERE id=1";
		String updatePsSql = "UPDATE students SET name= ? WHERE id = ?";
		String deleteSql = "DELETE FROM students WHERE id=2";
		String deletePSSql = "DELETE FROM students WHERE id=?";

		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("Baðlandý");
//			ResultSet interface’de sorgu sonucunda gelen kayýtlara eriþim için belli baþlý fonksiyonlar bulunur.
//			“next” fonksiyonu: bu fonksiyon çaðrýldýðýnda bir sonraki satýra ilerler. Böylece o satýr üzerinde okuma yapabilmeyi saðlar. Okunacak kayýt kalmadýðýnda “false” döner.
//			“first” fonksiyonu: bu fonksiyon çaðrýldýðýnda sorgu sonucu kümesindeki ilk elemana eriþim saðlar.
//
//			“last” fonksiyonu: bu fonksiyon çaðrýldýðýnda sorgu sonucu kümesindeki son elemana eriþim saðlar.
//
//			“absolute” fonksiyonu: bu fonksiyon ile sorgu sonuç kümesindeki direkt olarak istenilen eleman iþaret edilir.

			st = connection.createStatement();
//			ResultSet data =  st.executeQuery(sql);
//			while (data.next()) {
//				System.out.println("ID: " + data.getInt("id"));
//				System.out.println("Name: " + data.getString("name"));
//				System.out.println("Class: " + data.getInt("class"));
//				System.out.println("-------");
//			}
//			System.out.println(st.executeUpdate(insertSql));

//			PreparedStatement ps = connection.prepareStatement(psSql);
//			ps.setString(1, "Mustafa");
//			ps.setInt(2, 4);
//			ps.executeUpdate();
//			

//			ps.close();
////			st.executeUpdate(updateSql);
////			PreparedStatement pr = connection.prepareStatement(updatePsSql);
////			pr.setString(1, "Mustfa");
////			pr.setInt(2, 2);
////			pr.executeUpdate();
//			pr.close();

			st.executeUpdate(deleteSql);
			PreparedStatement pr = connection.prepareStatement(deletePSSql);
			pr.setInt(1, 3);
			pr.executeUpdate();

			pr.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
