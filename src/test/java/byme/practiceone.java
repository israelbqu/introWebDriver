package byme;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceone {
    static WebDriver driver;


    public static void main(String[] args) {
        String password = "prueba123";
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



        campoUsuario.sendKeys("Israel.Bibiano" + 3);
        campoPassword.sendKeys(password);
        campoRepeat.sendKeys(password);
        button.click();

        WebElement LogIn = driver.findElement(By.cssSelector(".container"));

        if(LogIn.isDisplayed()){
            System.out.println("El usuario ya está registrado.");
        }
    }
}
