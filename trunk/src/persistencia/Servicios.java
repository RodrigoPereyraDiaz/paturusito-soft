package persistencia;

import java.util.List;

import modelo.Cliente;


public class Servicios {
	private GestorClientes gClientes = new GestorClientes();

	
	
	//Gestor Clientes
    public List<Cliente> getAllClientes(){
        return gClientes.getAllClientes();
    }     
    
    public Cliente obtenerCliente(int idCliente){
        return gClientes.obtenerCliente(idCliente);
    }
}
