package Tests;

import Base.BaseTests;
import Model.CommonMethods;
import Model.Timout;
import Module.*;
import org.testng.annotations.Test;

public class MiddlePartTest extends BaseTests {
    @Test(priority = 1)
    public void ShopSteveBar(){
        MiddlePart shopsteve = new MiddlePart(driver);
        HomePage homebutton = new HomePage(driver);
        try {

            shopsteve.OnSteveShop();
            Timout.timeslow();
           homebutton.ClickOnHome();
            Timout.timeout();

        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 2)
    public void ShopBabeBar(){
        MiddlePart shopsteve = new MiddlePart(driver);
        HomePage homebutton = new HomePage(driver);
        try {
            shopsteve.OnShopBabe();
            Timout.timeout();
            homebutton.ClickOnHome();
            Timout.timeout();

        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 3)
    public void ShopKolaburaBar(){
        MiddlePart shopsteve = new MiddlePart(driver);
        HomePage homebutton = new HomePage(driver);
        try {
            shopsteve.OnShopKolaburra();
            Timout.timeout();
            homebutton.ClickOnHome();
            Timout.timeout();

        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 4)
    public void ShopRoss(){
        MiddlePart shopsteve = new MiddlePart(driver);
        HomePage homebutton = new HomePage(driver);
        try {
            shopsteve.OnShopRoss();
            Timout.timeout();
            homebutton.ClickOnHome();
            Timout.timeout();

        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 5)
    public void ShopSandlebar(){
        MiddlePart shopsteve = new MiddlePart(driver);
       HomePage homebutton = new HomePage(driver);
        try {
            shopsteve.OnshopSandle();
            Timout.timeout();
           homebutton.ClickOnHome();
           Timout.timeout();

        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 6)
    public void ShopSneker(){
        MiddlePart shopsteve = new MiddlePart(driver);
        HomePage homebutton = new HomePage(driver);
        try {
            shopsteve.OnshopSneaker();
            Timout.timeout();
            homebutton.ClickOnHome();
            Timout.timeout();

        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
    @Test(priority = 7)
    public void Shopnow(){
        MiddlePart shopsteve = new MiddlePart(driver);
        HomePage homebutton = new HomePage(driver);
        try {
            shopsteve.OnshopNow();
            Timout.timeout();
            homebutton.ClickOnHome();
            Timout.timeout();

        }catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }

    }
}
