package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import modelo.Cliente;

import util.Connector;

public class GestorClientes {
	public List<Cliente> getAllClientes(){
        Connector connector = Connector.Instance();
        List<Cliente> clientesList = new Vector<Cliente>();
                
        try {
           Statement statement = connector.getConnection().createStatement();
           
           ResultSet result= statement.executeQuery("select idCliente,nombre from Clientes");
           
           while (result.next()) {
               Cliente cliente = new Cliente();
               cliente.setIdCliente(new Integer(result.getString(1)).intValue());
               cliente.setNombre(result.getString(2));               
               
               clientesList.add(cliente);
           }      
        } catch (Exception e) {
           e.printStackTrace();
        }
                
        try {
            connector.getConnection().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return clientesList;
    }
    
     public Cliente obtenerCliente(int idCliente){         
        Connector conector = Connector.Instance();
        Cliente cliente = new Cliente();
        
        try {
           Statement statement = conector.getConnection().createStatement();
           String qry = "select * from Clientes where idCliente = '"+new Integer(idCliente).toString()+"'";
           ResultSet result= statement.executeQuery(qry);
           
           result.next();
           cliente.setIdCliente(new Integer(result.getString(1)).intValue());
           cliente.setNombre(result.getString(2));
               
                 
        } catch (Exception e) {
           e.printStackTrace();
        }
                
        try {
            conector.getConnection().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         
         return cliente;
     }
}
