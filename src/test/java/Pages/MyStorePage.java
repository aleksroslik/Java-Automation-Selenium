package Pages;

import org.openqa.selenium.WebElement;

import java.util.List;

public class MyStorePage {
    public String pageAddress = "http://automationpractice.com/index.php";
    public String priceLocatorFeatured = "ul#homefeatured .right-block span.price.product-price";
    public List<WebElement> actualNumberOfSelectors;
}
