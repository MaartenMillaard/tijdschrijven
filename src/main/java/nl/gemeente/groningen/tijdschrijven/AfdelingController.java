package nl.gemeente.groningen.tijdschrijven;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AfdelingController {

	@Autowired
	private DataSource dataSource;

	private Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	@GetMapping("/afdeling")
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

//	@GetMapping("/afdeling")
//	public Afdeling getAfdelingByNaam(@RequestParam(name = "naam") String naam) throws SQLException {
//		try (PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM afdelingen WHERE naam like %?%")) {
//			stmt.setString(1, naam);
//			try (ResultSet afdeling = stmt.executeQuery()){
//				afdeling.next();
//				return new Afdeling(afdeling.getString("code"), afdeling.getString("naam"));
//			}
//		} catch (SQLException e) {
//			System.out.println(e);
//			return null;    	
//		}
//	}

//	@PostMapping("/afdeling")
//	public Afdeling createAfdeling(@RequestParam(name = "code") String code, @RequestParam(name = "naam") String naam) throws SQLException {
//		try (PreparedStatement stmt = getConnection().prepareStatement("INSERT INTO afdelingen VALUES (?, ?)",
//				Statement.RETURN_GENERATED_KEYS)) {
//			stmt.setString(1, code);
//			stmt.setString(2, naam);
//			stmt.executeUpdate();
//			try (ResultSet afdeling = stmt.getGeneratedKeys()) {
//				afdeling.next();
//				return getAfdelingByCode(code);
//			}
//		} catch (SQLException e) {
//			System.out.println(e);
//			return null;    	
//		}
//	}

//	@PutMapping("/afdeling")
//	public Afdeling updateAfdeling(@RequestParam(name="code") String code, @RequestParam(name="naam") String naam) throws SQLException {
//		try (PreparedStatement stmt = getConnection().prepareStatement("UPDATE afdelingen SET code = ?, naam = ? WHERE code = ?")) {
//			stmt.setString(1, code);
//			stmt.setString(2, naam);
//			stmt.setString(2, code);
//			stmt.executeUpdate();
//			return getAfdelingByCode(code);
//		} catch (SQLException e) {
//			System.out.println(e);
//			return null;    	
//		}
//	}

	@DeleteMapping("/afdeling")
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
