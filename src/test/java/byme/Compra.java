package byme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compra {
    static WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("http:vamonos-finance.herokuapp.com");
        WebElement linkregistro = driver.findElement(By.cssSelector("[href='/register']"));
        if(linkregistro.isDisplayed()){
            System.out.println("Link de registro visible");
        }
        //campoUsername://css="[name="username"]"
        //campoPassword://css="[name="password"]"
        //buttonLogin://css=".btn"
        //tablaCompras://css=".table"
        //
        //ligaQuote; // css = [href="/quote"]
        //ligaBuy;// css = [href="/buy"]
        //ligaSell;// css = [href="/sell"]
        //ligaHistory;// css = [href="/history"]
        //ligaLogOut;// css = [href="/logout"]

        WebElement CampoUsername = driver.findElement(By.cssSelector("[name='username']")),
                campoPassword = driver.findElement(By.cssSelector("[name='password']")),
                buttonLogin = driver.findElement(By.cssSelector(".btn"));
        CampoUsername.sendKeys("Juanito.Banana");
        campoPassword.sendKeys("Testing1234");
        buttonLogin.click();

//        ligaBuy;// css = [href="/buy"]
//        campoSymbol; //name="symbol"
//        campoQuantity; //name="qty"
//        botonBuy;//css=".btn"
//        tablaCompras://css=".table"

        WebElement LigaBuy = driver.findElement(By.cssSelector("[href='/buy']"));
        LigaBuy.click();

        WebElement campoSymbol = driver.findElement(By.name("symbol")),
                campoQuatity = driver.findElement(By.name("qty")),
                botonBuy = driver.findElement(By.cssSelector(".btn"));
        campoSymbol.sendKeys("MSFT");
        campoQuatity.sendKeys("1");
        botonBuy.click();

        WebElement tablaCompas = driver.findElement(By.cssSelector(".table"));
        if(tablaCompas.isDisplayed()){
            System.out.println("La prueba fue exitosa.");
        }
        else{
            System.out.println("La prueba no fue exitosa");
        }

    }
}
