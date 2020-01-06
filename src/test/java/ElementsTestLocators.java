import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ElementsTestLocators {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void TestsElements() throws InterruptedException {
        driver.get("https://htmlacademy.ru/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='newyear-main__link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='page-header__logo']")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='page-footer__item page-footer__item--intensives']//a[@class='page-footer__header']")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='button button--green button--split-effect']")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//body//div[1]//div[1]//div[2]//section[1]//a[2]//h2[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//body/section[@class='train train--theory']/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();//(всплыв. окно подписка)
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='homework__content text-container']//a[@class='button']")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("//nav[@class='breadcrumbs']//li[1]//a[1]")).click();
       Thread.sleep(2000);

        driver.findElement(By.cssSelector("a.newyear-main__link")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.page-header__logo")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.page-footer__item.page-footer__item--intensives:nth-child(2) > a.page-footer__header")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.button.button--green.button--split-effect:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.module-group:nth-child(1) div.module-group__inner div.module-group__right section.module:nth-child(1) a.module__title-link")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("section.chapter.chapter--homework:nth-child(3) div.chapter__container div.chapter__wagon.chapter__wagon--homework.chapter__wagon--left.chapter__display div.chapter__content-wrap div.chapter__content div.chapter__part.chapter__part--theory > a.chapter__continue.button.button--transparent")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.button-group:nth-child(5) > a.button:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("li.breadcrumbs__item:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);








    }
    @AfterMethod
    public void tearDown(){
        driver.close();


    }

    

}

