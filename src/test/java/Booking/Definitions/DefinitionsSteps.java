package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.AmazonRegistroPagina;
import Booking.Steps.Conexion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	//Paso 2 Hacemos el llamado del paquete y la clase donde vamos a acceder a los metodos
    private AmazonRegistroPagina amazonRegistroPagina = new AmazonRegistroPagina (driver);
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
 //Paso 1 Luego de terminar paso 6 en Paquete paginas, archivo "AmazonRegistroPagina.java"
	//Genera error y se debe importar libreria cucumber.api.java.en (trae .Given y .When)
	@When("^haga clic en el boton Crear$")
	public void diligenciarFormulario() {
		//Paso 3 instanciar clase con el driver del  metodo
		this.amazonRegistroPagina = new AmazonRegistroPagina (driver);
		//Paso 4 llamado al metodo a utilizar //**LUEGO IR A CREAR UN NUEVO FEATURE: src/test/resources/features y 
		//crear nuevo feature tipo file name ejemplo: RegistroAmazon.feature**
		this.amazonRegistroPagina.registroAmazon();
	}
	
}