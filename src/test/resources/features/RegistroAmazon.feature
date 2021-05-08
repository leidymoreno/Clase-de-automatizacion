#Leidy Moreno
#08-05-2021
#VIENE LUEGO DEL PASO 4 DE DEFINITION STEPS
#El Given y el When viene de DefinitionsSteps
#Se agrega tag Registro antes de 'Scenario' y se agrega el comando ', tags = {"@Regresion"}' en archivo 'RunnersFeature.java' en linea: @CucumberOptions(features = { "src/test/resources/features" }, glue = { "Booking.Definitions" }, tags = {"@Registro"})
Feature: Se debe validar que se permita el registro
Background:
Given abrir el navegador 
@Registro
Scenario: registro exitoso

When haga clic en el boton Crear

@Registro  
Scenario Outline: registro exitoso con nombre

When haga clic en el boton Crear
Then diligenciar campo nombre <nombres>

Examples:
|nombres|
|Leidy|