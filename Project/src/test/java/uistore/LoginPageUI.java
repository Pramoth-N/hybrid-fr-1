package uistore;

import org.openqa.selenium.By;

public class LoginPageUI {
    public static By signInBtn = By.className("login-button");
    public static By image = By.xpath("//*[@id='slick-slide00']/div/div[3]/a[1]/img");
    public static By verifyAnchor = By.className("verified-dealer-title");
    public static By contactSeller = By.className("contact-with-dealer-button");
    public static By blog = By.xpath("//*[@id=\"container\"]/div[3]/div/div[1]/div[1]/div[2]/div[2]/span[5]/a");
    public static By dropDown = By.cssSelector(".projects-menu > .project-curr");
    public static By constructionBlog = By.cssSelector(".project-list__wrap > ul > li:nth-child(2) > a");
    public static By searchIcon = By.cssSelector(".search_submit.trx_addons_icon-search");
    public static By searchBox = By.className("search_field");
    public static By spareParts = By.cssSelector("div[data-id='spares']");
}
