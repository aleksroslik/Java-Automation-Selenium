package Tests;

import Pages.MyStorePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyStorePriceTest extends BaseTest {

    MyStorePage myStorePage = new MyStorePage();

    @Test
    @DisplayName("Check the number of price tags for Popular Products on Featured Page")
    @Tag("priceTag")
    public void findAllPriceSelectors() {
        driver.get(myStorePage.pageAddress);
        myStorePage.actualNumberOfSelectors = driver.findElements(By.cssSelector(myStorePage.priceLocatorFeatured));
        int expectedNumberOfSelectors = 7;
        assertThat((long) myStorePage.actualNumberOfSelectors.size()).isEqualTo(expectedNumberOfSelectors);
    }
}
