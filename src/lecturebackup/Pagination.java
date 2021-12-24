package lecturebackup;

import hib.dto.OperatorTable;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import static java.lang.System.out;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class Pagination {
    public static void main(String...ar) 
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();//used to open table
        Transaction tx = session.beginTransaction();
       
        Criteria crit = session.createCriteria(OperatorTable.class);
        crit.setFirstResult(0);
        crit.setMaxResults(5);
        List<OperatorTable> data = crit.list();
       for(OperatorTable ot:data)
            {
                out.println(ot.getOpId()+" "+ot.getOpMailId()+" "+ot.getOpName()+" "+ot.getOpPassword()+" "+ot.getOpContactNo());
            }
    }
}