package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\Downloads\\chromedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");


        // Locate the file input element
        WebElement fileInput = driver.findElement(By.id("file-upload"));


        // Provide the path of the file to be uploaded
        String filePath = "C:\\Users\\navee\\Downloads\\gitbase sample.txt";
        fileInput.sendKeys(filePath);


        // Click the 'Upload' button
        driver.findElement(By.id("file-submit")).click();


        driver.quit();
    }
}