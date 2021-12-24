package lecturebackup;

import hib.dto.OperatorTable;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import static java.lang.System.out;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class SearchTable {
    public static void main(String...ar) 
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();//used to open table
        Transaction tx = session.beginTransaction();
        
        Scanner sc = new Scanner(System.in);
        out.println("Enter operator ID : "); 
        String id = sc.next();
        OperatorTable ot = (OperatorTable)session.get(OperatorTable.class, id);
        
        if(ot == null)
        {
            out.println("Record Not Found!!");
        }
        else
        {
            out.println(ot.getOpName()+" "+ot.getOpId()+" "+ot.getOpMailId()+" "+ot.getOpPassword());
        }
    }
}