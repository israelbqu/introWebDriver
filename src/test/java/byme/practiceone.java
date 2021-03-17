package byme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceone {
    static WebDriver driver;

    public static void main(String[] args) {
//Abrir el navegador
        driver = new ChromeDriver();
        //Navegar a la página
        //Se tiene la URL
        driver.get("http:vamonos-finance.herokuapp.com");
        //Verificar que muestra la pantalla de login
        //Está link de registro?
        WebElement linkregistro = driver.findElement(By.cssSelector("[href='/register']"));

        if(linkregistro.isDisplayed()){
            System.out.println("Link de registro visible");
        }

        //Registrar al usuario
        //Click al botón de Registro.
        linkregistro.click();
        WebElement campoUsuario = driver.findElement(By.cssSelector("[name='username'")),
        campoPassword = driver.findElement(By.cssSelector("[name='password']")),
        campoRepeat = driver.findElement(By.cssSelector("[name='repeat_password']")),
        button = driver.findElement(By.cssSelector(".btn"));

        campoUsuario.sendKeys("Israel.Bibiano" + 2);
        campoPassword.sendKeys("prueba123");
        campoRepeat.sendKeys("prueba1234");


        if(campoPassword == campoRepeat){
        button.click();
            System.out.println("El registro se creó exitosamente");
        }
        else{
            System.out.println("Prueba completada sin contraseñas iguales");
            driver.quit();
        }






    }
}
