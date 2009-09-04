

import java.util.List;
import java.util.Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.model.TestClass;

import modelo.Cliente;


import controlador.ClienteControl;

public class ClienteControlTest{

		
	@BeforeClass  
    public static void setUpClass() throws Exception {  
    //Inicialización general de variables, escritura del log...  
    }  
      
    @AfterClass  
    public static void tearDownClass() throws Exception {  
    //Liberación de recursos, escritura en el log...  
    }  
      
    @Before  
    public void setUp() {  
    //Inicialización de variables antes de cada Test  
    }  
      
    @After  
    public void tearDown() {  
    //Tareas a realizar después de cada test  
    }  
      
    @Test  
    public void comprobarAccion() {  
    	ClienteControl clienteControl = new ClienteControl();
		List<Cliente> listado = new Vector<Cliente>();
		listado = clienteControl.getAllClientes(); 
    }


}
