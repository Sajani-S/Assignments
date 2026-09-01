package com;
import java.sql.*;
public class LibraryManagementSystem {

    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/library";

            String username = "root";

            String password = "sajaninirmala@2143@";

            Connection con = DriverManager.getConnection(url, username, password);

            String sql = " create table books (id int primary key , title varchar (30) , author varchar (30), price int )";

            PreparedStatement st = con.prepareStatement(sql);

                st.executeUpdate();

             System.out.println("TABLE CREATED ");

            String sql1 = "insert into books values (?,?,?,?),(?,?,?,?),(?,?,?,?)";

            PreparedStatement st1 = con.prepareStatement(sql1);

            st1.setInt(1,1);
            st1.setString(2,"physics");
            st1.setString(3,"ram");
            st1.setInt(4,300);

            st1.setInt(5,2);
            st1.setString(6,"chemistry");
            st1.setString(7,"ravi");
            st1.setInt(8,500);


            st1.setInt(9,3);
            st1.setString(10,"biology");
            st1.setString(11,"rahul");
            st1.setInt(12,700);


            int val =  st1.executeUpdate();
            System.out.println(val + " "+ "row inserted");
            System.out.println();


            String sql2 = "select * from books";

            PreparedStatement st2 = con.prepareStatement(sql2);


            ResultSet rs = st2.executeQuery();

            while (rs.next()){

                System.out.println(rs.getInt(1) + " "

                        + rs.getString(2) + " "
                        + rs.getString(3) + " "
                        + rs.getInt(4));

            }

            System.out.println();

            String sql3 = "update books set price = ? where id =  ? ";

            PreparedStatement st3 = con.prepareStatement(sql3);

            st3.setInt(1,200);
            st3.setInt(2,1);

            int val1 = st3.executeUpdate();

            System.out.println(val1 + " "+"row  updated");

            String sql4= "delete from  books where id =? ";

            PreparedStatement st4 = con.prepareStatement(sql4);

            st4.setInt(1,2);

            int val2 = st4.executeUpdate();

            System.out.println(val2 + " "+ "row  deleated");

            System.out.println();
            System.out.println("SEARCHING BY ID :   ");

            String sql5 = "select * from books where id = ?";

            PreparedStatement st5 = con.prepareStatement(sql5);

              st5.setInt(1,3);


            ResultSet rs1 = st5.executeQuery();

            while (rs1.next()){

                System.out.println(rs1.getInt(1) + " "

                        + rs1.getString(2) + " "
                        + rs1.getString(3) + ' '
                        + rs1.getInt(4));

            }

            con.close();

        }
        catch (Exception e) {

            e.printStackTrace();

        }




















































    }













    }
