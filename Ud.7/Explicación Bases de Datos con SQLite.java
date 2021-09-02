package com.company;

import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main(String[] args)
    {
        String connString ="jdbc:sqlite:C:\\Users\\Rodrigo\\IdeaProjects\\Ud.7\\Recursos Ficheros para la Base de Datos de Películas-20200317\\cine.db";
        Connection conn;        //Crear conexion
        try
        {
            conn = DriverManager.getConnection(connString);       //Creando conexion en Java
            Statement st = conn.createStatement();

            //COMANDO QUE TE DEVUELVE INFORMACION (SELECT)
            String sql2="SELECT * FROM actores;";
            ResultSet rs = st.executeQuery(sql2);

            while (rs.next()) //lee un nuevo dato
            {
                //int id = rs.getInt(0);
                int id = rs.getInt("id");
                String nombre = rs.getString("Nombre");
                LocalDate fecha = LocalDate.parse(rs.getString("fechaNacimiento"));
                System.out.println("id = " + id + ", nombre = " + nombre + ", FDN = " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }

            //COMANDO QUE NO TE DEVUELVE INFORMACION

            //String sql = "INSERT INTO actores (nombre, fechaNacimiento) VALUES ('Arnold Schawarzenegger','1947-07-30');";
            //st.execute(sql);       //Aqui ponemos la consulta que querramos hacer
            //El execute lo podemos usar para lo que queramos excepto para SELECT

            conn.close();       //Terminar conexion
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}

