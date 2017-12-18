/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;

import db.DbConnection;
import domen.IndexSlider;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_utilites.PageUtilites;

/**
 * private
 *
 * @author qa
 */
public class Eho_Test {

    /**
     * @param args the command line arguments ExpectedConditions
     */
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ecotest.school.cubes.rs/admin_session/login\n");
        WebDriverWait wait = new WebDriverWait(driver, 10);
//ide u login klasu u metodu login
        WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
        user.sendKeys("admin");
        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        password.sendKeys("cubesqa");
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-success")));
        login.click();

        WebElement indexSideBar = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Index Slider")));
        //   WebElement index_sideBar = driver.findElement(By.xpath("//*[@id='side-menu']/li[2]/a"));
        indexSideBar.click();

//        WebElement add_index = driver.findElement(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div/div[1]/div/a"));
        WebElement addIndex = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add index Slide")));
        addIndex.click();

        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("hsdashdl");
        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("ekkfkhfdsdfs");

        WebElement linkType = wait.until(ExpectedConditions.elementToBeClickable(By.id("link_type")));
        linkType.click();
        Select linkTypes = new Select(linkType);
        linkTypes.selectByIndex(2);

        WebElement linkLabel = wait.until(ExpectedConditions.elementToBeClickable(By.id("link_label")));
        linkLabel.sendKeys("http:/kamfksfsldfsdf.com");

        WebElement internalLinkUrl = wait.until(ExpectedConditions.elementToBeClickable(By.id("internal_link_url")));
        internalLinkUrl.sendKeys("http://prozivoljantext.com");
//
        WebElement addPhoto = wait.until(ExpectedConditions.elementToBeClickable(By.id("index_slide_photo")));
        addPhoto.sendKeys("/Users/qa/Desktop/desk.jpg");
////        
        WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.id("new_indexSlide_submit")));
        save.click();
        
//        ovden iden rad sa bazomm
//        IndexSlider ix = DbConnection.getSlider(query);
        
        
        
        

        WebElement sider = driver.findElement(By.linkText("Index Slider"));
        sider.click();

        WebElement table = wait.until(ExpectedConditions.elementToBeClickable(By.id("rows-table")));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        WebElement lastRow = rows.get(rows.size() - 1);
        WebElement delete = lastRow.findElement(By.className("glyphicon-trash"));
        //wait.until(ExpectedConditions.elementToBeClickable(By.className("glyphicon-trash")));
        delete.click();
        WebElement conf = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-danger")));
        conf.click();

        WebElement photoGAlleries = wait.until(ExpectedConditions.elementToBeClickable(By.className("fa-photo")));
        photoGAlleries.click();
        WebElement addPhotoGallery = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div/div[1]/div/a")));
        addPhotoGallery.click();

        driver.findElement(By.id("title")).sendKeys(PageUtilites.getRandomText());
        driver.findElement(By.id("description")).sendKeys(PageUtilites.getRandomText());
        driver.findElement(By.id("photo_gallery_leading_photo")).sendKeys("/Users/qa/Desktop/desk.jpg");
        driver.findElement(By.id("new_photoGallery_submit")).click();
        
        
        
        
        

        

    }

}
