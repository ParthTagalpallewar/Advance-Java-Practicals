package Practical_15.src;

import java.sql.*;

public class App {

    private Statement stmt;

    public static void main(String[] args) throws Exception {

        App app = new App();
        app.connectDatabase();
        app.deleteAllDataFromDb();

        app.insertInDatabase(3, "3name", "3department", "3city");
        app.insertInDatabase(4, "4name", "4department", "4city");

        app.printData();

        app.updateStudentById(3, "name changed");

        app.printData();

        app.deletedStudentById(4);

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

    public void deleteAllDataFromDb(){
        try {
            if (this.stmt == null)
                return;
            String a = "Delete from student";

            this.stmt.executeUpdate(a);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertInDatabase(int id, String name, String department, String city) {

        try {
            if (this.stmt == null)
                return;

            System.out.println("Inserting Student " + name);

            String a = "insert into student (id, name, department, city) values( " + id + ", '" + name + "', '"
                    + department + "', '" + city + "' )";

            this.stmt.executeUpdate(a);

            System.out.println("Data Inserted Successfully");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
   
    public void updateStudentById(int id, String name) {

        try {
            if (this.stmt == null)
                return;
            System.out.println("Updating Data :- ... ");

            String a = "update student set name = '"+name+"' where id="+id;

            this.stmt.executeUpdate(a);

            System.out.println("Data Updated Successfully");
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deletedStudentById(int id){
        try {
            if (this.stmt == null)
                return;
            System.out.println("Deleting data .. ");

            String a = "Delete from student where id="+id;

            this.stmt.executeUpdate(a);

            System.out.println("Data Deleted Successfully");
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printData() {
        try {
            ResultSet rs = stmt.executeQuery("select * from student order by id DESC;");

            System.out.println("Printing data ..");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "  " +
                                rs.getString(2) + "  " +
                                rs.getString(3) + "  " +
                                rs.getString(4));
            }

            System.out.println("Data Displayed Successfully");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
