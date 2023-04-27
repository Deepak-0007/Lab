package hibernate.theater;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class mainApp {
	public static void main(String[] args) {
	Theater t1 = new Theater(101," Pathaan");
	Theater t2 = new Theater(102,"Sita Ramam");
	Theater t3 = new Theater(103,"Bahubali");
	Transaction txn;
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
	txn = session.beginTransaction();
	session.save(t1);
	session.save(t2);
	session.save(t3);
	txn.commit();
	}
	}
	}