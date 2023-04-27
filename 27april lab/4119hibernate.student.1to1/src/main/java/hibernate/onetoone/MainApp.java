package hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class MainApp {
public static void main(String[] args) {
Student s1 = new Student("Deepak");
ID id = new ID(12345678);
s1.setID(id);
Transaction txn;
try(Session session=HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(s1);
txn.commit();
}
}
}