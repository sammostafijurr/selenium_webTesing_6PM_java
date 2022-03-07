package Model;

import org.openqa.selenium.By;

public class Locators {

    public static String homePageUrl = "https://www.6pm.com/";
    //Sign_in
    public static By Hover = By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div[3]/div[1]/a");
    public static By Logout = By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div[3]/div[1]/ul/li[2]/a");
    public static By Login = By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div[3]/div[1]/ul/li[1]/a");
    public static By Email = By.id("ap_email");
    public static By Password = By.id("ap_password");
    public static By SignIn = By.id("signInSubmit");
    public static By Amazon = By.id("auth-lwa-button"); //auth-lwa-button
    public static By CreateAccount = By.id("createAccountSubmit");

    //My Account
    public static By MyAccount = By.xpath("//header/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]");
    public static By EGift =By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[2]/ul/li[5]/a");



    //Amazon Sign
    public static By AmaEmail = By.id("ap_email");
    public static By AmaPass = By.id("ap_password");
    public static By AmaSign = By.id("signInSubmit");

    //Create Account
    public static By CustomerName = By.id("ap_customer_name");
    public static By CustomerEmail = By.id("ap_email");
    public static By CustomerPass = By.id("ap_password");
    public static By RepassWord = By.id("ap_password_check");
    public static By CustomerDone =By.id("continue");

    //Top Bar
    public static By Shoes = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[1]/a");
    public static By clothing = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[2]/a");
    public static By Bags = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[3]/a");
    public static By Aesories = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[4]/a");
    public static By women = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[5]/a");
    public static By Men = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[6]/a");
    public static By kid = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[7]/a");
    public static By Clearance = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[8]/a");
    public static By Brand = By.xpath("//*[@id=\"root\"]/div[1]/header/div[2]/ul/li[9]/a");

   //Searchbar

    public static By searh = By.id("searchAll");
    public static By searhBtn = By.xpath("//*[@id=\"searchForm\"]/button");

    //HomeButton
    public static By HomeBtn =By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/a/picture/img");


    //Middle part
    public static By ShopSteve = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/a[1]/section/section/div/p");
    public static By ShopBebe = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/a[2]/section/section/div/p");
    public static By ShopKolaBura = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/a[3]/section/section/div/p");
    public static By ShopRoss = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/a[4]/section/section/div/p");
    public static By ShopSandle = By.xpath("//*[@id=\"main\"]/div/div/div[4]/div/a[1]/section/section/div/p");
    public static By ShopSneaker = By.xpath("//*[@id=\"main\"]/div/div/div[4]/div/a[2]/section/section/div/p");
    public static By ShopNow = By.xpath("//*[@id=\"main\"]/div/div/div[4]/div/a[3]/section/section/div/p");


    //Customer Service
    public static By Forgetpassword = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[1]/ul/li[1]/a");
    public static By ShippingRate = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[1]/ul/li[2]/a");
    public static By ReturnPolisy = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[1]/ul/li[3]/a");
    public static By AboutProposition = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[1]/ul/li[4]/a");
    public static By FaQ = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[1]/ul/li[5]/a");
    public static By ContactInfo = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[1]/ul/li[6]/a");

    //Information
    public static By About = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[4]/ul[1]/li[1]/a");
    public static By SiteMap = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[4]/ul[1]/li[2]/a");
    public static By Coupons = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[4]/ul[1]/li[3]/a");

    //FindUsOn
    public static By Instagram = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[4]/ul[2]/li[1]/a");
    public static By FaceBook = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[4]/ul[2]/li[2]/a");
    public static By Twitter = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[4]/ul[2]/li[3]/a");
    public static By Pinterst = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[4]/ul[2]/li[4]/a");
    public static By Youtube = By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div[4]/ul[2]/li[5]/a");



}
