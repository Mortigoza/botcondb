package org.adaitw.botcondb.dao;

import org.adaitw.botcondb.model.Conexion;
import org.adaitw.botcondb.model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Conexion con;
    private Connection connection;

    public UsuarioDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
        System.out.println(jdbcURL);
        con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
    }

    // insertar usuario
    public boolean insertar(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (id, nombres, apellidos, nombre_usuario, contraseña, mail, celular) VALUES (?, ?, ?,?,?,?,?)";
        System.out.println(usuario.getNombre_usuario());
        con.conectar();
        connection = con.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, null);
        statement.setString(2, usuario.getNombres());
        statement.setString(3, usuario.getApellidos());
        statement.setString(4, usuario.getNombre_usuario());
        statement.setDouble(5, usuario.getContraseña());
        statement.setString(6, usuario.getMail());
        statement.setDouble(7, usuario.getCelular());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        con.desconectar();
        return rowInserted;
    }

    // listar todos los usuarios
    public List<Usuario> listarUsuario() throws SQLException {

        List<Usuario> listaUsuario = new ArrayList<Usuario>();
        String sql = "SELECT * FROM usuario";
        con.conectar();
        connection = con.getJdbcConnection();
        Statement statement = connection.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);

        while (resulSet.next()) {
            int id = resulSet.getInt("id");
            String nombres = resulSet.getString("nombres");
            String apellidos = resulSet.getString("apellidos");
            String nombre_usuario = resulSet.getString("nombre_usuario");
            Double contraseña = resulSet.getDouble("contraseña");
            String mail = resulSet.getString("mail");
            Double celular = resulSet.getDouble("celular");
            Usuario usuario = new Usuario(id, nombres, apellidos, nombre_usuario, contraseña, mail, celular);
            listaUsuario.add(usuario);
        }
        con.desconectar();
        return listaUsuario;
    }

    // obtener por id
    public Usuario obtenerPorId(int id) throws SQLException {
        Usuario usuario = null;

        String sql = "SELECT * FROM usuario WHERE id= ? ";
        con.conectar();
        connection = con.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet res = statement.executeQuery();
        if (res.next()) {
            usuario = new Usuario(res.getInt("id"), res.getString("nombres"), res.getString("apellidos"),
                    res.getString("nombre_usuario"), res.getDouble("contraseña"), res.getString("mail"), res.getDouble("celular"));
        }
        res.close();
        con.desconectar();

        return usuario;
    }

    // actualizar
    public boolean actualizar(Usuario usuario) throws SQLException {
        boolean rowActualizar = false;
        String sql = "UPDATE usuario SET nombres=?,apellidos=?,nombre_usuario=?,contraseña=?, mail=?, celular=? WHERE id=?";
        con.conectar();
        connection = con.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getNombres());
        statement.setString(2, usuario.getApellidos());
        statement.setString(3, usuario.getNombre_usuario());
        statement.setDouble(4, usuario.getContraseña());
        System.out.println(usuario.getNombre_usuario());
        statement.setString(5, usuario.getMail());
        statement.setDouble(6, usuario.getCelular());
        statement.setInt(7, usuario.getId());

        rowActualizar = statement.executeUpdate() > 0;
        statement.close();
        con.desconectar();
        return rowActualizar;
    }

    //eliminar
    public boolean eliminar(Usuario usuario) throws SQLException {
        boolean rowEliminar = false;
        String sql = "DELETE FROM usuario WHERE ID=?";
        con.conectar();
        connection = con.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, usuario.getId());

        rowEliminar = statement.executeUpdate() > 0;
        statement.close();
        con.desconectar();

        return rowEliminar;
    }
}

