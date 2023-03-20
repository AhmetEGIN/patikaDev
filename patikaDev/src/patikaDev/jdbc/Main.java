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
		String updateSql = "UPDATE students SET name='Ka�an' WHERE id=1";
		String updatePsSql = "UPDATE students SET name= ? WHERE id = ?";
		String deleteSql = "DELETE FROM students WHERE id=2";
		String deletePSSql = "DELETE FROM students WHERE id=?";

		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("Ba�land�");
//			ResultSet interface�de sorgu sonucunda gelen kay�tlara eri�im i�in belli ba�l� fonksiyonlar bulunur.
//			�next� fonksiyonu: bu fonksiyon �a�r�ld���nda bir sonraki sat�ra ilerler. B�ylece o sat�r �zerinde okuma yapabilmeyi sa�lar. Okunacak kay�t kalmad���nda �false� d�ner.
//			�first� fonksiyonu: bu fonksiyon �a�r�ld���nda sorgu sonucu k�mesindeki ilk elemana eri�im sa�lar.
//
//			�last� fonksiyonu: bu fonksiyon �a�r�ld���nda sorgu sonucu k�mesindeki son elemana eri�im sa�lar.
//
//			�absolute� fonksiyonu: bu fonksiyon ile sorgu sonu� k�mesindeki direkt olarak istenilen eleman i�aret edilir.

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
