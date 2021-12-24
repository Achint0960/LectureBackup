
import hib.dto.FacultyTable;
import hib.dto.OperatorTable;
import hib.dto.StudentTable;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Achint Rawal
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    CardLayout cl;
    static String id;
    public SignIn() {
        initComponents();
        cl = (CardLayout)BG.getLayout();
        Home.setBackground(new Color(85,65,118));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Footer = new javax.swing.JPanel();
        contactD = new javax.swing.JLabel();
        contactD1 = new javax.swing.JLabel();
        LeftSide = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        SignIn = new javax.swing.JPanel();
        signInLabel = new javax.swing.JLabel();
        BG = new javax.swing.JPanel();
        HomeC = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SignInC = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        Student = new javax.swing.JPanel();
        StudentT = new javax.swing.JLabel();
        LoginIcon = new javax.swing.JLabel();
        SignInStu = new javax.swing.JPanel();
        SignInBtnTxt = new javax.swing.JLabel();
        Faculty = new javax.swing.JPanel();
        facultyT = new javax.swing.JLabel();
        Login_Icon = new javax.swing.JLabel();
        FacultySignInBtn = new javax.swing.JPanel();
        FaSignInBtnTxt = new javax.swing.JLabel();
        SignInOprator = new javax.swing.JPanel();
        Operator = new javax.swing.JPanel();
        FacultyT2 = new javax.swing.JLabel();
        SignInOp = new javax.swing.JPanel();
        SignInBtnTxt3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        OpId = new javax.swing.JTextField();
        FaP1 = new javax.swing.JPasswordField();
        InvalidID2 = new javax.swing.JLabel();
        InvalidPWD2 = new javax.swing.JLabel();
        SigniInStudent = new javax.swing.JPanel();
        BackNewQuery1 = new javax.swing.JLabel();
        Student2 = new javax.swing.JPanel();
        StudentT2 = new javax.swing.JLabel();
        SignInStu2 = new javax.swing.JPanel();
        SignInBtnTxt2 = new javax.swing.JLabel();
        StuID = new javax.swing.JLabel();
        StuPW = new javax.swing.JLabel();
        StuIDT = new javax.swing.JTextField();
        StuIDP = new javax.swing.JPasswordField();
        InvalidUID = new javax.swing.JLabel();
        InvalidPWD = new javax.swing.JLabel();
        SignInFaculty = new javax.swing.JPanel();
        BackNewQuery = new javax.swing.JLabel();
        Faculty1 = new javax.swing.JPanel();
        FacultyT1 = new javax.swing.JLabel();
        SignInFa1 = new javax.swing.JPanel();
        SignInBtnTxt1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FaIDT = new javax.swing.JTextField();
        FaP = new javax.swing.JPasswordField();
        InvalidPWD1 = new javax.swing.JLabel();
        InvalidUID1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Footer.setBackground(new java.awt.Color(122, 79, 222));
        Footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contactD.setBackground(new java.awt.Color(255, 255, 255));
        contactD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contactD.setForeground(new java.awt.Color(255, 255, 255));
        contactD.setText("Contact Number : +91 1234567890");
        Footer.add(contactD, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 290, 30));

        contactD1.setBackground(new java.awt.Color(255, 255, 255));
        contactD1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contactD1.setForeground(new java.awt.Color(255, 255, 255));
        contactD1.setText("Email Id : lecturebackup@collegename.in");
        Footer.add(contactD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 330, 30));

        getContentPane().add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1210, 50));

        LeftSide.setBackground(new java.awt.Color(53, 33, 89));
        LeftSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setBackground(new java.awt.Color(255, 255, 255));
        LOGO.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1.png"))); // NOI18N
        LOGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOMouseClicked(evt);
            }
        });
        LeftSide.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 180, 100));

        Home.setBackground(new java.awt.Color(64, 43, 100));
        Home.setPreferredSize(new java.awt.Dimension(500, 300));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeLabel.setBackground(new java.awt.Color(255, 255, 255));
        homeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText(" Home");
        Home.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        LeftSide.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 310, 50));

        SignIn.setBackground(new java.awt.Color(64, 43, 100));
        SignIn.setPreferredSize(new java.awt.Dimension(500, 300));
        SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInMouseClicked(evt);
            }
        });
        SignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signInLabel.setBackground(new java.awt.Color(255, 255, 255));
        signInLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 255, 255));
        signInLabel.setText("Sign In");
        SignIn.add(signInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        LeftSide.add(SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 310, 50));

        getContentPane().add(LeftSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 640));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new java.awt.CardLayout());

        HomeC.setBackground(new java.awt.Color(255, 255, 255));
        HomeC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("About Us :");
        HomeC.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\nAcropolis Institute of Technology and Research (AITR) was established \nin  the year 2005 by Teach for India Education & Research Samiti. The  \ninstitute is located in Indore, Madhya Pradesh and ranked as one of the  \nTop Engineering College in Indore. \n\nLecture Backup is a software through which students of the college  \nstudents can login and get in touch with their faculty members and put  \nup their give them the timing at which they can attend their extra classes. \nqueries about the lectures they have missed and the faculties can Also,\nthis software has a news section for the latest college updates.");
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        HomeC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 820, 420));

        BG.add(HomeC, "card1");

        SignInC.setBackground(new java.awt.Color(255, 255, 255));
        SignInC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(122, 79, 222));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome.setBackground(new java.awt.Color(255, 255, 255));
        Welcome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText(" Sign In As :");
        Header.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 30));

        SignInC.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 90));

        Student.setBackground(new java.awt.Color(255, 255, 255));
        Student.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentT.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        StudentT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentT.setText("Student");
        StudentT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Student.add(StudentT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 60));

        LoginIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login.png"))); // NOI18N
        LoginIcon.setToolTipText("");
        Student.add(LoginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 320, 60));

        SignInStu.setBackground(new java.awt.Color(64, 43, 100));
        SignInStu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInStuMouseClicked(evt);
            }
        });
        SignInStu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignInBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        SignInBtnTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SignInBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInBtnTxt.setText("Sign In");
        SignInStu.add(SignInBtnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2, 180, 40));

        Student.add(SignInStu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 280, 40));

        SignInC.add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 320, 400));

        Faculty.setBackground(new java.awt.Color(255, 255, 255));
        Faculty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Faculty.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facultyT.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        facultyT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facultyT.setText("Faculty");
        facultyT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Faculty.add(facultyT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 60));

        Login_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login.png"))); // NOI18N
        Login_Icon.setToolTipText("");
        Faculty.add(Login_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 320, 70));

        FacultySignInBtn.setBackground(new java.awt.Color(64, 43, 100));
        FacultySignInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacultySignInBtnMouseClicked(evt);
            }
        });
        FacultySignInBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FaSignInBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        FaSignInBtnTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FaSignInBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        FaSignInBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FaSignInBtnTxt.setText("Sign In");
        FacultySignInBtn.add(FaSignInBtnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2, 180, 40));

        Faculty.add(FacultySignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 280, 40));

        SignInC.add(Faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 320, 400));

        BG.add(SignInC, "card2");

        SignInOprator.setBackground(new java.awt.Color(255, 255, 255));
        SignInOprator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Operator.setBackground(new java.awt.Color(255, 255, 255));
        Operator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Operator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FacultyT2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        FacultyT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FacultyT2.setText("Sign In Operator");
        FacultyT2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Operator.add(FacultyT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        SignInOp.setBackground(new java.awt.Color(64, 43, 100));
        SignInOp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInOpMouseClicked(evt);
            }
        });
        SignInOp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignInBtnTxt3.setBackground(new java.awt.Color(255, 255, 255));
        SignInBtnTxt3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SignInBtnTxt3.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtnTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInBtnTxt3.setText("Sign In");
        SignInOp.add(SignInBtnTxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 40));

        Operator.add(SignInOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 280, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        Operator.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText(" Operator ID");
        Operator.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 40));

        OpId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        OpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpIdActionPerformed(evt);
            }
        });
        Operator.add(OpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 220, 30));
        Operator.add(FaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 220, 30));
        Operator.add(InvalidID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, 20));
        Operator.add(InvalidPWD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 220, 20));

        SignInOprator.add(Operator, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 400, 420));

        BG.add(SignInOprator, "card6");

        SigniInStudent.setBackground(new java.awt.Color(255, 255, 255));
        SigniInStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackNewQuery1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        BackNewQuery1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackNewQuery1MouseClicked(evt);
            }
        });
        SigniInStudent.add(BackNewQuery1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Student2.setBackground(new java.awt.Color(255, 255, 255));
        Student2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Student2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentT2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        StudentT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentT2.setText("Sign In Student");
        StudentT2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Student2.add(StudentT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        SignInStu2.setBackground(new java.awt.Color(64, 43, 100));
        SignInStu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInStu2MouseClicked(evt);
            }
        });
        SignInStu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignInBtnTxt2.setBackground(new java.awt.Color(255, 255, 255));
        SignInBtnTxt2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SignInBtnTxt2.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtnTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInBtnTxt2.setText("Sign In");
        SignInStu2.add(SignInBtnTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 40));

        Student2.add(SignInStu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 280, 40));

        StuID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        StuID.setText("Password");
        Student2.add(StuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 40));

        StuPW.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        StuPW.setText("Student ID");
        Student2.add(StuPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 40));

        StuIDT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        StuIDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuIDTActionPerformed(evt);
            }
        });
        Student2.add(StuIDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 220, 30));
        Student2.add(StuIDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 220, 30));
        Student2.add(InvalidUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 220, 20));
        Student2.add(InvalidPWD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, 20));

        SigniInStudent.add(Student2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 400, 420));

        BG.add(SigniInStudent, "card3");

        SignInFaculty.setBackground(new java.awt.Color(255, 255, 255));
        SignInFaculty.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackNewQuery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        BackNewQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackNewQueryMouseClicked(evt);
            }
        });
        SignInFaculty.add(BackNewQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Faculty1.setBackground(new java.awt.Color(255, 255, 255));
        Faculty1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Faculty1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FacultyT1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        FacultyT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FacultyT1.setText("Sign In Faculty");
        FacultyT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Faculty1.add(FacultyT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        SignInFa1.setBackground(new java.awt.Color(64, 43, 100));
        SignInFa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInFa1MouseClicked(evt);
            }
        });
        SignInFa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignInBtnTxt1.setBackground(new java.awt.Color(255, 255, 255));
        SignInBtnTxt1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SignInBtnTxt1.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtnTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInBtnTxt1.setText("Sign In");
        SignInFa1.add(SignInBtnTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 40));

        Faculty1.add(SignInFa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 280, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Password");
        Faculty1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText(" Faculty ID");
        Faculty1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 40));

        FaIDT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FaIDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaIDTActionPerformed(evt);
            }
        });
        Faculty1.add(FaIDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 220, 30));
        Faculty1.add(FaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 220, 30));
        Faculty1.add(InvalidPWD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, 20));
        Faculty1.add(InvalidUID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 220, 20));

        SignInFaculty.add(Faculty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 400, 420));

        BG.add(SignInFaculty, "card4");

        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 900, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignInStuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInStuMouseClicked
        cl.show(BG, "card3");
    }//GEN-LAST:event_SignInStuMouseClicked

    private void FacultySignInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultySignInBtnMouseClicked
        cl.show(BG, "card4");
    }//GEN-LAST:event_FacultySignInBtnMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        cl.show(BG, "card1");
        Home.setBackground(new Color(85,65,118));
        SignIn.setBackground(new Color(64,43,100));
    }//GEN-LAST:event_HomeMouseClicked

    private void SignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInMouseClicked
        cl.show(BG, "card2");
        Home.setBackground(new Color(64, 43, 100));
        SignIn.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_SignInMouseClicked

    private void BackNewQueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackNewQueryMouseClicked
        cl.show(BG, "card2");
    }//GEN-LAST:event_BackNewQueryMouseClicked

    private void BackNewQuery1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackNewQuery1MouseClicked
        cl.show(BG, "card2");
    }//GEN-LAST:event_BackNewQuery1MouseClicked

    private void SignInFa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInFa1MouseClicked
        id = new String(FaIDT.getText());
        char ch[] = FaP.getPassword();
        String password = new String(ch);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();//used to open table
        Transaction tx = session.beginTransaction();
        
        Criteria crit = session.createCriteria(FacultyTable.class);
        crit.add(Restrictions.and(Restrictions.eq("faID",id),Restrictions.eq("faPassword",password)));
        List <FacultyTable> result = crit.list();
        
        if(result.isEmpty())
        {
            InvalidUID1.setForeground(Color.red);
            InvalidPWD1.setForeground(Color.red);
            InvalidPWD1.setText("*Invalid User Id");
            InvalidUID1.setText("*Invalid Password");
            FaP.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Welcome");
            new HomePageFaculty().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_SignInFa1MouseClicked

    private void FaIDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaIDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FaIDTActionPerformed
        
    private void SignInStu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInStu2MouseClicked
        id = new String(StuIDT.getText());
        char ch[] = StuIDP.getPassword();
        String password = new String(ch);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();//used to open table
        Transaction tx = session.beginTransaction();
        
        Criteria crit = session.createCriteria(StudentTable.class);
        crit.add(Restrictions.and(Restrictions.eq("stuID",id),Restrictions.eq("stuPassword",password)));
        List<StudentTable> result = crit.list();
        
        if(result.isEmpty())
        {
            InvalidUID.setForeground(Color.red);
            InvalidPWD.setForeground(Color.red);
            InvalidPWD.setText("*Invalid User Id");
            InvalidUID.setText("*Invalid Password");
            StuIDP.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Welcome");
            new HomePageStudents().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_SignInStu2MouseClicked

    private void StuIDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuIDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StuIDTActionPerformed

    private void SignInOpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInOpMouseClicked
        id = new String(OpId.getText());
        char ch[] = FaP1.getPassword();
        String password = new String(ch);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();//used to open table
        Transaction tx = session.beginTransaction();
        
        Criteria crit = session.createCriteria(OperatorTable.class);
        crit.add(Restrictions.and(Restrictions.eq("opId",id),Restrictions.eq("opPassword",password)));
        List<OperatorTable> result = crit.list();
        
        if(result.isEmpty())
        {
            InvalidID2.setForeground(Color.red);
            InvalidPWD2.setForeground(Color.red);
            InvalidPWD2.setText("*Invalid User Id");
            InvalidID2.setText("*Invalid Password");
            StuIDP.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Welcome");
            new HomePageOperator().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_SignInOpMouseClicked

    private void OpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpIdActionPerformed

    private void LOGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOMouseClicked
        cl.show(BG, "card6");
    }//GEN-LAST:event_LOGOMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String...args) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel BackNewQuery;
    private javax.swing.JLabel BackNewQuery1;
    private javax.swing.JTextField FaIDT;
    private javax.swing.JPasswordField FaP;
    private javax.swing.JPasswordField FaP1;
    private javax.swing.JLabel FaSignInBtnTxt;
    private javax.swing.JPanel Faculty;
    private javax.swing.JPanel Faculty1;
    private javax.swing.JPanel FacultySignInBtn;
    private javax.swing.JLabel FacultyT1;
    private javax.swing.JLabel FacultyT2;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel HomeC;
    private javax.swing.JLabel InvalidID2;
    private javax.swing.JLabel InvalidPWD;
    private javax.swing.JLabel InvalidPWD1;
    private javax.swing.JLabel InvalidPWD2;
    private javax.swing.JLabel InvalidUID;
    private javax.swing.JLabel InvalidUID1;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel LeftSide;
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JLabel Login_Icon;
    private javax.swing.JTextField OpId;
    private javax.swing.JPanel Operator;
    private javax.swing.JPanel SignIn;
    private javax.swing.JLabel SignInBtnTxt;
    private javax.swing.JLabel SignInBtnTxt1;
    private javax.swing.JLabel SignInBtnTxt2;
    private javax.swing.JLabel SignInBtnTxt3;
    private javax.swing.JPanel SignInC;
    private javax.swing.JPanel SignInFa1;
    private javax.swing.JPanel SignInFaculty;
    private javax.swing.JPanel SignInOp;
    private javax.swing.JPanel SignInOprator;
    private javax.swing.JPanel SignInStu;
    private javax.swing.JPanel SignInStu2;
    private javax.swing.JPanel SigniInStudent;
    private javax.swing.JLabel StuID;
    private javax.swing.JPasswordField StuIDP;
    private javax.swing.JTextField StuIDT;
    private javax.swing.JLabel StuPW;
    private javax.swing.JPanel Student;
    private javax.swing.JPanel Student2;
    private javax.swing.JLabel StudentT;
    private javax.swing.JLabel StudentT2;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel contactD;
    private javax.swing.JLabel contactD1;
    private javax.swing.JLabel facultyT;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel signInLabel;
    // End of variables declaration//GEN-END:variables
}