package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

//Paso 1 Class automatica: Esta clase se crea de forma automatica al crear clase
public class AmazonRegistroPagina {

	//Paso 2 Crear Web Driver - AQUI aparece error y se debe importar libreria org.openqa.selenium.WebDriver;
	private WebDriver driver;
	
	//Paso 4 Este es el elemento que se encuentra en la pagina html
	@FindBy(how = How.ID, using = "createAccountSubmit")
	//Paso 5 esta es la variable que se va a utilizar dentro de los metodos (boton crear)
	private WebElement btnCrear;
	
	//Paso 7 Luego de ya abrir la pagina de registro comenzamos a buscar los campos. Se crea la captura del boton  para el primer campo
	@FindBy(how = How.XPATH, using = "//input[@name = 'customerName']")
	private WebElement textoNombre;
	
	
	//Paso 3 Esto es el constructor
	public AmazonRegistroPagina (WebDriver driver) {
		//4 Esto es un llamado  a libreria de PageFactory donde vamos utilizar la sentencia de localizadores (this)
		PageFactory.initElements(driver, this);
	}
	//Paso 6 Esto es el metodo para identificar los pasos que vamos a crear
	  //LUEGO DE ESTE PASO 6 --> VAMOS AL PAQUETE Definitions, archivo "DefinitionsSteps.java" y creamos paso 1
	//git hub
	@Step
	public void registroAmazon () {
	   btnCrear.click();
	}
	 //8 Se crea metodo para captura del primer campo
	@Step
	public void diligenciarCampo (String nombres) {
		   textoNombre.sendKeys(nombres);
		}
}
