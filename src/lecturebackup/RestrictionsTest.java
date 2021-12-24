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


public class RestrictionsTest {
    public static void main(String...ar) 
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();//used to open table
        Transaction tx = session.beginTransaction();
       
        Criteria crit = session.createCriteria(OperatorTable.class);
        //crit.add(Restrictions.eq("opName","Achint"));
        //crit.add(Restrictions.or(Restrictions.eq("opName","Achint"),Restrictions.eq("opMailId","achint.rawal@gmail.com")));
        crit.add(Restrictions.and(Restrictions.eq("opName","Achint"),Restrictions.eq("opMailId","achint.rawal@gmail.com")));
        List<OperatorTable> data = crit.list();
        
        if(data.isEmpty())
        {
            out.println("Record Not Found!!");
        }
        else
        {
            for(OperatorTable ot:data)
            {
                out.println(ot.getOpId()+" "+ot.getOpMailId()+" "+ot.getOpName()+" "+ot.getOpPassword()+" "+ot.getOpContactNo());
            }
        }
    }
}