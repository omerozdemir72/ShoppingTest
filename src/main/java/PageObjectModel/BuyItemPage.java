package PageObjectModel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class BuyItemPage extends AbstractClass {

    @FindBy(css = "input[placeholder='Search']")
    private WebElement searchBox;

    @FindBy(css = " button[name='submit_search']")
    private WebElement searchButton;

    @FindAll({
            @FindBy(xpath = "//img[@class='replace-2x img-responsive']")
    })
    private List<WebElement> dressesList;
    @FindBy(xpath = "//i[@class='icon-th-list']")
    private WebElement listIcon;

    @FindBy(xpath = "//span[text()=\'Add to cart\']")
    private WebElement addToCartButton;

    @FindBy(css = "a[title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
    private WebElement proceedToCheckOutButtonOgSignInPart;
    @FindBy(css = "button[name='processAddress']")
    private WebElement proceedToCheckOutAdreesPart;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkBoxOfTermService;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement proceedCheckOutLastPart;
    @FindBy(css = "a[title='Pay by bank wire']")
    private WebElement paymentType;
    @FindBy(xpath = "//span[text()='I confirm my order']")
    private WebElement confirmButton;

    @FindBy(xpath = "//strong[text()='Your order on My Store is complete.']")
    private WebElement orderCompleteSentence;

    public void typeTheSearchBox(String item) {

        sendKeysFunction(searchBox, item);
    }

    public void clickOnSearchButton() {

        clickOnFunctionalities(searchButton);
    }

    public void clickOnAnyItem() {
        randomMethod(dressesList);
    }

    public void clickOnListView() {
        clickOnFunctionalities(listIcon);
    }

    public void clickOnAddToCartButton() {
        clickOnFunctionalities(addToCartButton);
    }

    public void clickOnProceedToChechout() {
        clickOnFunctionalities(proceedToCheckoutButton);
    }

    public void clickOnProceedToChechoutSignIn() {
        clickOnFunctionalities(proceedToCheckOutButtonOgSignInPart);
    }

    public void clickOnProceedToCheckOutAdressPart() {
        clickOnFunctionalities(proceedToCheckOutAdreesPart);

    }

    public void clickOnCheckbox() {
        waitUntilInVisibility(proceedToCheckOutAdreesPart);
        clickOnFunctionalities(checkBoxOfTermService);
    }

    public void clickOnProceedToChckOutLast() {
        clickOnFunctionalities(proceedCheckOutLastPart);
    }

    public void clickOnPaymentType() {
        clickOnFunctionalities(paymentType);
    }

    public void clickOnConfirmButton() {
        clickOnFunctionalities(confirmButton);
    }

    public void verifyingMyOrder() {
        String myExpected = "Your order on My Store is complete.";
        verifyOrder(orderCompleteSentence, myExpected);

    }


}
