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

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://generator.email//";
        driver.get(baseUrl);
        WebElement drop = driver.findElement(By.cssSelector(".e7m.dropselect.waves-effect.waves-light.waves-raised"));
        drop.click();
        WebElement copy = driver.findElement(By.id("copbtn"));
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
            drop.click();
        }
        System.out.println(ids);
        //WebDriver's get() method is used to launch a new browser session and directs it to the URL that you specify as its parameter.

        // TODO code application logic here
    }
}
