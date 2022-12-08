package main.finalProject;


import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class TableOperate {

    //���ݿ��ѯ����ģ��
    public TableOperate() {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL������");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ⣡");

            String sql = "select * from user";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            System.out.println("���" + "\t" + "����" + "\t" + "����");
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.println();
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //�Ƿ���ڸ��û�,�˴�������Ĺ���Ա��֤Ϊ���߹�ϵ
    public static boolean isExist_user(String user, String password) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-isExist_Customer");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-isExist_Customer");

            String sql = "select * from user";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            System.out.println("�û���" + "\t" + "\t" + "\t" + "����");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.println();
                if (rs.getString(1).equals(user) && rs.getString(2).equals(password)) {
                    rs.close();
                    stmt.close();
                    conn.close();
                    return true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isExist_Customer(String user) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-isExist_Customer");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-isExist_Customer");

            String sql = "select * from user";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            System.out.println("�û���" + "\t" + "\t" + "\t" + "����");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.println();
                if (rs.getString(1).equals(user)) {
                    rs.close();
                    stmt.close();
                    conn.close();
                    return true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;


    }

    //�Ƿ���ڸù���Ա
    public static boolean isExist_Manager(String user, String password) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-isExist_Manager");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-isExist_Manager");

            String sql = "select * from Manager";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            System.out.println("�û���" + "\t" + "\t" + "\t" + "����");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.println();
                if (rs.getString(1).equals(user) && rs.getString(2).equals(password)) {
                    rs.close();
                    stmt.close();
                    conn.close();
                    return true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isExist_Manager(String user) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-isExist_Customer");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-isExist_Customer");

            String sql = "select * from Manager";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            System.out.println("�û���" + "\t" + "\t" + "\t" + "����");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.println();
                if (rs.getString(1).equals(user)) {
                    rs.close();
                    stmt.close();
                    conn.close();
                    return true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;


    }

    //ע�����û�������ע���߼�Ϊ�û�������ΪΨһ�ģ�����û����Ѿ�������ע��ʧ�ܣ�����û�����Ҫ���Ϲ淶���淶�������Լ���һ�£�
    // ��������ļ����ж�����һ��PwdCheck�࣬������һ�������������ж��˺������Ƿ���Ϲ淶����������Ϲ淶��ע��ʧ��
    public static void register_User(String user, String password) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-register_Customer");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-register_Customer");

            String sql = "insert into lib.user values('" + user + "','" + password + "','0');";

            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.execute();

            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ע���¹���Ա����ԭ������ͬ
    public static void register_Manager(String user, String password) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-register_Manager");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-register_Manager");

            String sql = "insert into Manager values('" + user + "','" + password + "');";    //Ҫִ�е�SQL

            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.executeUpdate();

            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //�ı��û������룬�˴�Ҳ��Ҫ���Ϲ淶
    public static void changePassword_User(String user, String password, String newPassword) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-changePassword");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-changePassword");

            String sql = "update user set user.password = '" + newPassword + "' where user.userName = '" + user + "';";    //Ҫִ�е�SQL

            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.executeUpdate();

            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changePassword_User(String user, String newPassword) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-changePassword");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-changePassword");

            String sql = "update user set user.password = '" + newPassword + "' where user.userName = '" + user + "';";    //Ҫִ�е�SQL

            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.executeUpdate();

            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //�ı����Ա�����룬ԭ��ͬ��
    public static void changePassword_Manager(String user, String password, String newPassword) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-changePassword");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-changePassword");

            String sql = "update Manager set manager.Password = '" + newPassword + "' where manager.Name = '" + user + "';";    //Ҫִ�е�SQL

            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.executeUpdate();

            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changePassword_Manager(String user, String newPassword) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-changePassword");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-changePassword");

            String sql = "update Manager set manager.Password = '" + newPassword + "' where manager.Name = '" + user + "';";    //Ҫִ�е�SQL

            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.executeUpdate();

            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //�Ƿ���ڸ��û�������������򷵻�true�����򷵻�false
    public static boolean isExist_Customer_user(String user, String password) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-isExist_Customer");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-isExist_Customer");

            String sql = "select * from user";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            System.out.println("�û���" + "\t" + "\t" + "\t" + "����");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.println();
                if (rs.getString(1).equals(user)) {
                    rs.close();
                    stmt.close();
                    conn.close();
                    return true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //�Ƿ���ڸù���Ա���ƣ�ԭ��ͬ��
    public static boolean isExist_Manager_user(String user, String password) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-isExist_Manager");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-isExist_Manager");

            String sql = "select * from Manager";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            System.out.println("�û���" + "\t" + "\t" + "\t" + "����");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.println();
                if (rs.getString(1).equals(user)) {
                    rs.close();
                    stmt.close();
                    conn.close();
                    return true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //��������
    public static void insertBook(String id, String bookName,
                                  String author, String brief, String state, String type) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-insertBook");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-insertBook");

            String sql = "insert into " + "book" + " values('" + id + "','" + bookName +
                    "','" + author + "','" + brief + "','" + state + "','" + type + "','null','000-00-00 00:00:00','0');";   //Ҫִ�е�SQL

            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.execute();

            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //ɾ���鼮��Ϣ
    public static void deleteBook(String id) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-deleteBook");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-deleteBook");

            String sql = "delete from " + "book" + " where id = '" + id + "';";  //Ҫִ�е�SQL

            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.executeUpdate();

            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //��ѯĳ��ͼ����Ϣ
    public static void search_certainTypeBook(String type) {
        Information.bookArray.clear();
        try {

            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_classname");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_classname");

            String sql = "select * from " + "lib.book" + " where id = '" + type + "';"; //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            while (rs.next()) {
                Book book = new Book();
                book.id = rs.getString(1);
                book.bookName = rs.getString(2);
                book.author = rs.getString(3);
                book.brief = rs.getString(4);
                book.state = rs.getString(5);
                book.type = rs.getString(6);
                book.browser = rs.getString(7);
                book.dateOn = rs.getString(8);
                Information.bookArray.add(book);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //����ע�䵽�û���Ϣ
    public static void borrowBook_Insert(String ID, String userName, java.sql.Date date) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-borrowBook_Insert");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-borrowBook_Insert");

            String sql = "insert into " + "record values('" + userName + "','" + ID + "','" + date + "');";
            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.execute();
            stmts.close();

            sql = "insert into " + "history values('" + userName + "','" + ID + "','" + date + "');";
            PreparedStatement stmts_history = conn.prepareStatement(sql);
            stmts_history.execute();
            stmts_history.close();

            sql = "update " + "book" + " set state = '1' where id = '" + ID + "';";
            PreparedStatement stmts_state = conn.prepareStatement(sql);
            stmts_state.execute();
            stmts_state.close();

            sql = "update " + "book" + " set dateOn = '" + date + "' where id = '" + ID + "';";
            PreparedStatement stmts_date = conn.prepareStatement(sql);
            stmts_date.execute();
            stmts_date.close();

            sql = "update " + "book" + " set browser = '" + userName + "' where id = '" + ID + "';";
            PreparedStatement stmts_browser = conn.prepareStatement(sql);
            stmts_browser.execute();
            stmts_browser.close();

            sql = "update " + "user" + " set BookNums +=1" + " where userName = '" + userName + "';";
            PreparedStatement stmts_personalBook = conn.prepareStatement(sql);
            stmts_personalBook.execute();
            stmts_personalBook.close();


            stmts.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //��������鼮���ݿ���Ϣ
    public static void returnBook_Update(String ID, String userName) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-returnBook_Update");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-returnBook_Update");

            String sql = "DELETE from " + "record where userName = '" + userName + "' and ID = '" + ID + "';";
            PreparedStatement stmts = conn.prepareStatement(sql);
            stmts.executeUpdate();
            stmts.close();

            sql = "update " + "book" + " set state = '0' where id = '" + ID + "';";
            PreparedStatement stmts_state = conn.prepareStatement(sql);
            stmts_state.executeUpdate();
            stmts_state.close();

            sql = "update " + "book" + " set dateOn = '" + null + "' where id = '" + ID + "';";
            PreparedStatement stmts_date = conn.prepareStatement(sql);
            stmts_date.executeUpdate();
            stmts_date.close();

            sql = "update " + "book" + " set browser = '" + null + "' where id = '" + ID + "';";
            PreparedStatement stmts_browser = conn.prepareStatement(sql);
            stmts_browser.executeUpdate();
            stmts_browser.close();

            sql = "update " + "user" + " set personalBook -=1" + " where userName = '" + userName + "';";
            PreparedStatement stmts_personalBook = conn.prepareStatement(sql);
            stmts_personalBook.executeUpdate();
            stmts_personalBook.close();

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //��ѯ����ͼ����Ϣ
    public static void search_personal(String userName) {
        Information.bookArray.clear();
        try {

            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_personal");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_personal");

            String sql = "select * from record where userName='" + userName + "';";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            while (rs.next()) {
                System.out.println(rs.getString("ID"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //��������
    public static String search_bookNameWithID(String id) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_bookName");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_bookName");

            String sql = "select * from lib.book where id like ='" + id + "';";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            while (rs.next()) {
                return rs.getString(3);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }

    public static String search_bookNameWithAuthor(String author) {
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_bookName");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_bookName");

            String sql = "select * from lib.book where author='" + author + "';";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            while (rs.next()) {
                return rs.getString(3);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }

    //��ѯ�������ݴ����ݿ���
    public static ArrayList search_bookWithBookName(String bookName) {
        Information.bookArray.clear();
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_book");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_book");

            String sql = "select * from lib.book where bookName like ='" + bookName + "';";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            while (rs.next()) {
                Information.bookArray.add(new Book(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getInt(9)));
            }
            //�ȵ�ֵ��1
            String sql2 = "update lib.book set hot=hot+1 where bookName like ='" + bookName + "';";    //Ҫִ�е�SQL
            stmt.executeUpdate(sql2);
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return Information.bookArray;
    }

    public static ArrayList search_bookWithAuthor(String author) {
        Information.bookArray.clear();
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_book");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_book");

            String sql = "select * from lib.book where author like ='" + author + "';";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            while (rs.next()) {
                Information.bookArray.add(new Book(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getInt(9)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return Information.bookArray;
    }

    public static ArrayList search_bookWithType(String type) {
        Information.bookArray.clear();
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_book");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_book");

            String sql = "select * from lib.book where type='" + type + "';";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            while (rs.next()) {
                Information.bookArray.add(new Book(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getInt(9)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Information.bookArray.sort((o1, o2) -> o2.getHot() - o1.getHot());
        return Information.bookArray;
    }

    //�����û�������Ϣ
    public static LinkedList outputUserData() {
        Information.userlist.clear();
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_book");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_book");

            String sql = "select  *from lib.user ;";   //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            while (rs.next()) {
                Information.userlist.add(new User(rs.getString(1), rs.getString(2),
                        rs.getInt(3)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return Information.userlist;
    }

    public static Map<Book, User> record() throws Exception {
        Map<Book, User> map = new HashMap<>();
        try {
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�ɹ�����MySQL����-search_book");

            String url = Information.JDBC_URL;    //JDBC��URL
            Connection conn;

            conn = DriverManager.getConnection(url, Information.username, Information.password);
            Statement stmt = conn.createStatement(); //����Statement����
            System.out.println("�ɹ����ӵ����ݿ�-search_book");

            String sql = "select  *from lib.record ;";   //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���
            PreparedStatement stmts_record = conn.prepareStatement(sql);
            stmts_record.execute();

            while (rs.next()) {
                String userName = rs.getString(1);
                String bookID = rs.getString(2);

                String sql1 = "select * from lib.user where username='" + userName + "';";
                ResultSet rs1 = stmt.executeQuery(sql1);//�������ݶ���
                PreparedStatement stmts_user = conn.prepareStatement(sql1);
                stmts_user.execute();
                String sql2;

                //����һ�����鴢���û�����Ϣ
                User[] user = new User[100];
                int i = 0;
                while (rs1.next()) {
                    user[i] = new User(rs1.getString(1), rs1.getString(2), rs1.getInt(3));
                    i++;
                }
                sql2 = "select * from lib.book where ID='" + bookID + "';";
                ResultSet rs2 = stmt.executeQuery(sql2);//�������ݶ���
                PreparedStatement stmts_book = conn.prepareStatement(sql2);
                stmts_book.execute();
                while (rs2.next()) {
                    int j = 0;
                    Book book = new Book(rs2.getString(1), rs2.getString(2),
                            rs2.getString(3), rs2.getString(4),
                            rs2.getString(5), rs2.getString(6), rs2.getString(7),
                            rs2.getString(8), rs2.getInt(9));
                    map.put(book, user[j]);
                }

            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
