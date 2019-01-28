package nl.gemeente.groningen.tijdschrijven;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.hibernate.dialect.DB2390Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AfdelingController {

	@Autowired
	private DataSource dataSource;

	private Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	@GetMapping("/afdelingen")
	public ArrayList<Afdeling> getAlleAfdelingen() throws SQLException {
		ArrayList<Afdeling> afdelingen = new ArrayList<>();

		try (PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM afdelingen")) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					Afdeling a = new Afdeling(rs.getInt("afdelingId"), rs.getString("code"), rs.getString("naam"));

					afdelingen.add(a);
				}
			}
			return afdelingen;
		}
	}

	@GetMapping("/afdeling/{afdelingId}")
	public Afdeling getAfdelingById(@RequestParam(name = "afdelingId") int afdelingId) throws SQLException {
		try (PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM afdelingen WHERE afdelingId = ?")) {
			stmt.setInt(1, afdelingId);
			try (ResultSet rs = stmt.executeQuery()){
				rs.next();
				return new Afdeling(rs.getInt("afdelingId"), rs.getString("code"), rs.getString("naam"));
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;    	
		}
	}

	@GetMapping("/afdeling/{code}")
	public Afdeling getAfdelingByCode(@RequestParam(name = "code") String code) throws SQLException {
		try (PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM afdelingen WHERE code = ?")) {
			stmt.setString(1, code);
			try (ResultSet rs = stmt.executeQuery()){
				rs.next();
				return new Afdeling(rs.getString("code"), rs.getString("naam"));
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;    	
		}
	}

		@GetMapping("/afdeling/{naam}")
		public Afdeling getAfdelingByNaam(@RequestParam(name = "naam") String naam) throws SQLException {
			try (PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM afdelingen WHERE naam like %?%")) {
				stmt.setString(1, naam);
				try (ResultSet afdeling = stmt.executeQuery()){
					afdeling.next();
					return new Afdeling(afdeling.getString("code"), afdeling.getString("naam"));
				}
			} catch (SQLException e) {
				System.out.println(e);
				return null;    	
			}
		}

		@PostMapping("/afdeling/{code}")
		public Afdeling createAfdeling(@RequestParam(name = "code") String code, @RequestParam(name = "naam") String naam) throws SQLException {
			try (PreparedStatement stmt = getConnection().prepareStatement("INSERT INTO afdelingen(code, naam) VALUES (?, ?)",
					Statement.RETURN_GENERATED_KEYS)) {
				stmt.setString(1, code);
				stmt.setString(2, naam);
				stmt.executeUpdate();
				try (ResultSet afdeling = stmt.getGeneratedKeys()) {
					afdeling.next();
					return getAfdelingById(afdeling.getInt(1));
				}
			} catch (SQLException e) {
				System.out.println(e);
				return null;    	
			}
		}

		@PutMapping("/afdeling/{code}")
		public Afdeling updateAfdeling(@RequestParam(name="code") String code, @RequestParam(name="naam") String naam) throws SQLException {
			try (PreparedStatement stmt = getConnection().prepareStatement("UPDATE afdelingen SET code = ?, naam = ? WHERE code = ?")) {
				stmt.setString(1, code);
				stmt.setString(2, naam);
				stmt.setString(2, code);
				stmt.executeUpdate();
				return getAfdelingByCode(code);
			} catch (SQLException e) {
				System.out.println(e);
				return null;    	
			}
		}

	@DeleteMapping("/afdeling/{code}")
	public int deleteAfdeling(@RequestParam(name="code") String code) {
		try (PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM afdelingen WHERE code = ?")) {
			stmt.setString(1, code);
			return stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
			return -1;    	
		}

	}


}
