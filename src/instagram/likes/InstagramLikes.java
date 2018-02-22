/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instagram.likes;

import java.util.List;
import java.util.*;
import static org.apache.http.client.methods.RequestBuilder.options;
import static org.apache.http.client.methods.RequestBuilder.options;
import static org.apache.http.client.methods.RequestBuilder.options;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Mateus Oliveira
 */
public class InstagramLikes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String expectedTitle = "https://www.instagram.com/accounts/registered/?hl=pt-br";
        String actualTitle = "";
        String baseUrl = "https://generator.email/";
        driver.get(baseUrl);
        WebElement drop = driver.findElement(By.cssSelector(".e7m.dropselect.waves-effect.waves-light.waves-raised"));
        drop.click();
        WebElement copy = driver.findElement(By.id("copbtn"));
        WebElement refresh = driver.findElement(By.cssSelector(".e7m.btn.btn-success.waves-effect.waves-light.waves-raised"));
        while (true) {
            List<String> ids = new ArrayList<>();
            List<WebElement> nomes = driver.findElements(By.xpath("//p[contains(@id, '.gq')]"));
            List<WebElement> nomes2 = driver.findElements(By.xpath("//p[contains(@id, '.ga')]"));
            List<WebElement> nomes3 = driver.findElements(By.xpath("//p[contains(@id, '.tk')]"));
            List<WebElement> nomes4 = driver.findElements(By.xpath("//p[contains(@id, '.info')]"));
            List<WebElement> nomes5 = driver.findElements(By.xpath("//p[contains(@id, '.ml')]"));
            List<WebElement> nomes6 = driver.findElements(By.xpath("//p[contains(@id, '.co')]"));

            for (WebElement email : nomes) {
                ids.add(email.getAttribute("id"));
            }
            for (WebElement email : nomes2) {
                ids.add(email.getAttribute("id"));
            }
            for (WebElement email : nomes3) {
                ids.add(email.getAttribute("id"));
            }
            for (WebElement email : nomes4) {
                ids.add(email.getAttribute("id"));
            }
            for (WebElement email : nomes5) {
                ids.add(email.getAttribute("id"));
            }
            for (WebElement email : nomes6) {
                ids.add(email.getAttribute("id"));
            }
            System.out.println(ids);
            for (String s : ids) {
                WebElement email = driver.findElement(By.id(s));
                email.click();
                copy.click();
                WebDriver second_driver = new ChromeDriver();
                second_driver.get("https://www.instagram.com/");
                WebElement login_email = second_driver.findElement(By.name("emailOrPhone"));
                login_email.sendKeys(Keys.CONTROL + "v");
                Thread.sleep(1000);
                WebElement login_fullname = second_driver.findElement(By.name("fullName"));
                login_fullname.sendKeys("Joao Kleber");
                Thread.sleep(1000);
                //WebElement login_name = second_driver.findElement(By.name("username"));
                // login_name.sendKeys(s);
                WebElement senha = second_driver.findElement(By.name("password"));
                senha.sendKeys("ABCDE12345");
                Thread.sleep(1000);
                WebElement cadastrar = second_driver.findElement(By.xpath("//*[contains(text(), 'Cadastre-se')]"));
                try {
                    cadastrar.submit();
                    Thread.sleep(100);
                    cadastrar.submit();
                    Thread.sleep(100);
                    cadastrar.submit();
                    Thread.sleep(100);
                    cadastrar.submit();
                    Thread.sleep(100);
                    cadastrar.submit();
                    Thread.sleep(100);
                    cadastrar.submit();
                    Thread.sleep(100);
                    cadastrar.submit();
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                second_driver.get("https://www.instagram.com/accounts/registered/?hl=pt-br");
                //actualTitle = second_driver.getTitle();
                //if (actualTitle.contentEquals(expectedTitle)) {
                try {
                    second_driver.get("https://www.instagram.com/p/BaUlUzNF2xj/?hl=pt-br&taken-by=willer007/");
                    Thread.sleep(1000);
                    WebElement like = second_driver.findElement(By.xpath("//*[contains(text(), 'Curtir')]"));
                    like.click();
                    Thread.sleep(500);
                    second_driver.close();
                    /* WebElement perfil = second_driver.findElement(By.xpath("//*[contains(text(), 'Perfil')]"));
                    perfil.click();
                    WebElement config = second_driver.findElement(By..xpath("//*[contains(text(), 'Perfil')]"));
                    config.click();
                    WebElement sair = second_driver.findElement(By.xpath("//*[contains(text(), 'Sair')]"));
                    sair.click();
                     */
                    Thread.sleep(3000);
                } catch (Exception e) {
                }
                drop.click();
            }
            refresh.click();
            drop.click();
            //WebDriver's get() method is used to launch a new browser session and directs it to the URL that you specify as its parameter.
            // TODO code application logic here
        }
    }
}
