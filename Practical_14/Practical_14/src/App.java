package Practical_14.Practical_14.src;

import java.sql.*;

public class App {

    private Statement stmt;

    
    public static void main(String[] args) throws Exception {

        App app = new App();
        app.connectDatabase();

        app.insertInDatabase(2, "2name", "2depart", "2city");
        app.printData();

        
    }

    
    private void connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3300/college", "root", "mysql");

            this.stmt = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insertInDatabase(int id, String name, String department, String city){

        try {
            if (this.stmt == null)
                return;

            String a = "insert into student (id, name, department, city) values( " + id + ", '"+ name + "', '" + department + "', '" + city + "' )";

            this.stmt.executeUpdate(a);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      

    }

    public void printData(){
        try {
            ResultSet rs = stmt.executeQuery("select * from student order by id DESC;");
            
            while (rs.next()){
                System.out.println(
                    rs.getInt(1) + "  " +
                    rs.getString(2) + "  " +
                    rs.getString(3) + "  "+ 
                    rs.getString(4)
                );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
    }
}
