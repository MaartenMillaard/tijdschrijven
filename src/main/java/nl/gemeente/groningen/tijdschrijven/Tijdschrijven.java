package nl.gemeente.groningen.tijdschrijven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Tijdschrijven {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.getCurrentSession();

//		try {
//
//			// All the action with DB via Hibernate
//			// must be located in one transaction.
//			// Start Transaction.            
//			session.getTransaction().begin();
//
//
//
//			// Create an HQL statement, query the object.
//			// Equivalent to the SQL statement:
//			// Select e.* from EMPLOYEE e order by e.EMP_NAME, e.EMP_NO
//			String sql = "Select e from " + Afdeling.class.getName() + " e ";
//
//
//			// Create Query object.
//			Query<Afdeling> query = session.createQuery(sql);
//
//
//			// Execute query.
//			List<Afdeling> afdelingen = query.getResultList();
//
//			for (Afdeling afd : afdelingen) {
//				System.out.println("Afd: " + afd.getCode() + " : "
//						+ afd.getNaam());
//			}
//
//			// Commit data.
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			// Rollback in case of an error occurred.
//			session.getTransaction().rollback();
//		}
	}
}
