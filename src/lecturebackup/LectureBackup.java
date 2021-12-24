package lecturebackup;

import hib.dto.QueryTable;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import static java.lang.System.out;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LectureBackup {
    public static void main(String...ar) 
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();//used to open table
        Transaction tx = session.beginTransaction();
        //QueryTable ot = new QueryTable("achint", "achint0610", "ACHINT", "0987653748", "achint.rawal@gmail.com","kauhf");
        //session.save(ot);
        tx.commit();
        session.close();
        out.println("Record Inserted!!!");
    }
}