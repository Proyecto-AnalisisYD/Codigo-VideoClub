/*
Video Club
Analisis y diseño de sistemas
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilse1_000
 */
public class ConexionBd {
    
    //Variable de conexion
    Connection oConnection;
    //variable para los Query´s
    Statement sqlStmt;
    PreparedStatement ps;
    //variable para los resultados
    ResultSet setResult;
     int       intResult;
    
    boolean FnBoolConnectionOpen(String strConector, String strHost,String strUser,String strPassword)
    {
         
        try
        {
            Class.forName(strConector);
            //intenta la conecxion
            oConnection=DriverManager.getConnection(strHost, strUser, strPassword);
            //retorna verdadero
            return true;
        }
        catch(Exception e)
        {
            //ocurrio una excepcio lo cual imprime
            JOptionPane.showMessageDialog(null, e.toString());
            //Retorna falso
            return false;
        }
                    
    }
    
    
    
    void subConnectionClose()
    {
        try
        {
            //cierra la conexion
            oConnection.close();
        }//si hay un error despliega una informacion
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    void subQueryExecute(String strQuery)
    {
        
        try
        {
            //crea el objeto para el query
           sqlStmt= oConnection.createStatement();
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e.toString());
        }
         try
        {
            //ejecuta el query y  obtiene resultados
           setResult=sqlStmt.executeQuery(strQuery);
        }
         catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }
  boolean FnBoolQueryExecuteUpdate(String strQuery)
    {
        // Captura el Error
        try 
        {
            // Crea el Objeto para el Query
            sqlStmt = oConnection.createStatement();            
        } 
        catch (Exception e) 
        {
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error SubQueryExecuteUpdate:createStatement:"+e.getMessage());
            
            //Debuger
            e.printStackTrace();            
            
            // retorna false
            return false;
        }
        try 
        {
            // ejecuta el Update
            intResult =sqlStmt.executeUpdate(strQuery);            
            
            // Retorna que pudo ejecutar
            return true;
            
        } 
        catch (Exception e) 
        {
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error SubQueryExecuteUpdate:executeQuery:"+e.getMessage());               
            
            // Degugger
            e.printStackTrace();            
            
            // Retorna false
            return false;
        }
    }
  int fnIntSistemaPregunta(String strMensaje)
    {
        
        // Añade el Usuario al Mensaje
        return JOptionPane.showConfirmDialog(null, strMensaje);
        
        
    }
   void SubSistemaMensaje(String strMensaje)
    {
        
        // Añade el Usuario al Mensaje
        //JOptionPane.showMessageDialog(null,strMensaje);
        JOptionPane.showMessageDialog(null, strMensaje, "Mensaje",JOptionPane.INFORMATION_MESSAGE);
        
        
    }
}