package controlador;

import java.util.List;
import java.util.Vector;

import modelo.Cliente;

import persistencia.Servicios;



public class ClienteControl {
	public List<Cliente> getAllClientes(){
        Servicios servicios = new Servicios();
        List<Cliente> listaClientes = new Vector<Cliente>();
        listaClientes = servicios.getAllClientes();
        return listaClientes;
    }
}
