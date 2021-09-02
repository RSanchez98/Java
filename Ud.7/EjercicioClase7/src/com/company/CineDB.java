package com.company;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CineDB
{
    //ATRIBUTOS*********************************************************************************************************
    Connection conn;

    //CONSTRUCORES******************************************************************************************************
    public CineDB(String nombreFichero)
    {
        String connString = "jdbc:sqlite:C:\\Users\\Rodrigo\\IdeaProjects\\Ud.7\\Recursos Ficheros para la Base de Datos de Películas-20200317\\cine.db";
        try
        {
            conn = DriverManager.getConnection(connString);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //PORPIEDADES*******************************************************************************************************
    //METODOS***********************************************************************************************************
    public int insertarPelicula(String titulo, int anno, boolean tieneOscar, double valoracion)
    {
        int id = 0;
        try
        {
            Statement st = conn.createStatement();
            int oscar;
            if (tieneOscar)
            {
                oscar = 1;
            }
            else
            {
                oscar = 0;
            }
            String sql="INSERT INTO peliculas (titulo, anno, tieneOscar, valoracion) VALUES ('"+titulo+"', "+anno+", "+oscar+", "+valoracion+");";
            //System.out.println(sql);
            st.execute(sql);

            String sql2="SELECT last_insert_rowid();";
            ResultSet rs = st.executeQuery(sql2);
            rs.next();
            id = rs.getInt(1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return id;
    }

    public int insertaActor(String actor, LocalDate fechaNacimiento)
    {
        int id = 0;
        try
        {
            Statement st = conn.createStatement();
            String fechaTexto=fechaNacimiento.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            String sql = "INSERT INTO actores(nombre, fechaNacimiento) VALUES('"+actor+"', '"+fechaTexto+"');";
            //System.out.println(sql);
            st.execute(sql);

            String sql2="SELECT last_insert_rowid();";
            ResultSet rs = st.executeQuery(sql2);
            rs.next();
            id = rs.getInt(1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return id;
    }

    public void asociaActorPelicula(int idActor, int idPelicula, boolean principal)
    {
        try
        {
            int prota;
            if (principal)
            {
                prota = 1;
            }
            else
            {
                prota = 0;
            }
            Statement st = conn.createStatement();
            String sql = "INSERT INTO actoresPeliculas (idActor, idPelicula, principal) VALUES ("+idActor+", "+idPelicula+", "+prota+");";
            //System.out.println(sql);
            st.execute(sql);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public int buscaActor(String actor)
    {
        int id = -1;
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT id FROM actores WHERE nombre = '"+actor+"';";
            //System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
                id=rs.getInt(1);
            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return id;
    }

    public int buscaPelicula(String titulo)
    {
        int id = -1;
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT id FROM peliculas WHERE titulo = '"+titulo+"';";
            //System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
                id=rs.getInt(1);
            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return id;
    }

    public Pelicula datosPelicula(int idPelicula)
    {
        Pelicula p = null;
        try
        {
            Statement st = conn.createStatement();
            String sql ="SELECT titulo, anno, tieneOscar, valoracion FROM peliculas WHERE id = "+idPelicula+";";
            //System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            if (rs.next())
            {
                String titulo = rs.getString("titulo");
                int anno = rs.getInt("anno");
                boolean tieneOscar = rs.getBoolean("tieneOscar");
                double valoracion = rs.getDouble("valoracion");

                p = new Pelicula(idPelicula, titulo, anno, tieneOscar, valoracion);
            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return p;
    }

    public Actor datosActor(int idActor)
    {
        Actor a = null;
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT nombre, fechaNacimiento FROM actores WHERE id = "+idActor+";";
            //System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
                String nombre = rs.getString("nombre");
                LocalDate fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));
                //String fechaNacimiento="";
                //LocalDate fechaTexto = LocalDate.parse(fechaNacimiento);
                //LocalDate fechaNacimineto = rs.getDate("fechaNacimiento").toLocalDate();
                a = new Actor(idActor, nombre, fechaNacimiento);
            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return a;
    }

    public List<Pelicula> listadoPelicualas()
    {
        List<Pelicula> listadoPelicualas = new ArrayList<>();
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM peliculas;";
            //System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            listadoPelicualas.clear();
            while (rs.next())
            {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                int anno = rs.getInt("anno");
                boolean tieneOscar = rs.getBoolean("tieneOscar");
                double valoracion = rs.getDouble("valoracion");
                Pelicula p = new Pelicula(id, titulo, anno, tieneOscar, valoracion);
                listadoPelicualas.add(p);

            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return listadoPelicualas;
    }

    public List<Actor> listadoActores()
    {
        List<Actor> listadoActores = new ArrayList<>();
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM actores;";
            //System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            listadoActores.clear();
            while (rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                LocalDate fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));

                Actor a = new Actor(id, nombre, fechaNacimiento);
                listadoActores.add(a);

            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return listadoActores;
    }

    public List<Pelicula> listadoPeliculasPorActor(int idActor)
    {
        List<Pelicula> listaPeliculasPorActor = new ArrayList<>();
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT id, titulo, anno, tieneOscar, valoracion FROM peliculas " +
                        "JOIN actoresPeliculas ON peliculas.id = actoresPeliculas.idPelicula WHERE idActor = "+idActor+";";
            //System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            listaPeliculasPorActor.clear();
            while (rs.next())
            {
                int idPelicla = rs.getInt("id");
                String titulo = rs.getString("titulo");
                int anno = rs.getInt("anno");
                boolean tieneOscar = rs.getBoolean("tieneOscar");
                double valoracion = rs.getDouble("valoracion");

                Pelicula p = new Pelicula(idPelicla, titulo, anno, tieneOscar, valoracion);
                listaPeliculasPorActor.add(p);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return listaPeliculasPorActor;
    }

    public List<ActorPelicula> listadoActoresPorPelicula(int idPelicula)
    {
        List<ActorPelicula> listadoActoresPorPelicula = new ArrayList<>();
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT actores.id, actores.nombre, actores.fechaNacimiento, actoresPeliculas.principal FROM actores, actoresPeliculas WHERE actoresPeliculas.idPelicula = "+idPelicula+" AND actoresPeliculas.idActor = actores.id;";
            //System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            listadoActoresPorPelicula.clear();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                LocalDate fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));

                boolean principal = rs.getBoolean("principal");

                ActorPelicula ap = new ActorPelicula(id, nombre, fechaNacimiento, principal);
                listadoActoresPorPelicula.add(ap);
            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return listadoActoresPorPelicula;
    }
}
