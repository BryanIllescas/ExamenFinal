/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Controlador;
import java.util.List;
import Seguridad.Modelo.daoUsuario;
/**
 *
 * @author visitante
 */
public class clsUsuario {
    private int ID_USUARIO;
    private String PASSWORD;
    private String USUARIO_NOMBRE;

    public clsUsuario() {
    }

    public clsUsuario(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public clsUsuario(int ID_USUARIO, String USUARIO_NOMBRE) {
        this.ID_USUARIO = ID_USUARIO;
        this.USUARIO_NOMBRE = USUARIO_NOMBRE;
    }

    public clsUsuario(int ID_USUARIO, String USUARIO_NOMBRE, String PASSWORD) {
        this.ID_USUARIO = ID_USUARIO;
        this.USUARIO_NOMBRE = USUARIO_NOMBRE;
        this.PASSWORD = PASSWORD;
    }
    

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getUSUARIO_NOMBRE() {
        return USUARIO_NOMBRE;
    }

    public void setUSUARIO_NOMBRE(String USUARIO_NOMBRE) {
        this.USUARIO_NOMBRE = USUARIO_NOMBRE;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    
    @Override
    public String toString() {
        return "clsUsuario{" + "ID_USUARIO=" + ID_USUARIO + ", USUARIO_NOMBRE=" + USUARIO_NOMBRE + ", PASSWORD=" + PASSWORD + '}';
    }
    //Metodos de acceso a la capa controlador
    public clsUsuario getBuscarInformacionUsuarioPorNombre(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.consultaUsuariosPorNombre(usuario);
    }
    public clsUsuario getBuscarInformacionUsuarioPorId(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.consultaUsuariosPorId(usuario);
    }    
    public List<clsUsuario> getListadoUsuarios()
    {
        daoUsuario daousuario = new daoUsuario();
        List<clsUsuario> listadoUsuarios = daousuario.consultaUsuarios();
        return listadoUsuarios;
    }
    public int setBorrarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.borrarUsuarios(usuario);
    }          
    public int setIngresarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.ingresaUsuarios(usuario);
    }              
    public int setModificarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.actualizaUsuarios(usuario);
    }              
}
