import org.openqa.selenium.WebElement;

import java.util.List;

public class MyStorePage {
    String pageAddress = "http://automationpractice.com/index.php";
    String priceLocatorFeatured = "ul#homefeatured>li>.product-container>.right-block>.content_price>span.price.product-price";
    List<WebElement> actualNumberOfSelectors;
}
