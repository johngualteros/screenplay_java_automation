package com.john.automatitation.openQA.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com")
public class DemoQaPage extends PageObject {
    public static final Target INITIAL_IMAGE = Target.the("image tools qa")
            .located(By.xpath("//*[@id='app']/header/a/img"));
    public static final Target CARD_ALERT_FRAME = Target.the("card alert frame")
            .located(By.xpath("//*[@id='app']/div/div/div[2]/div/div[3]"));

    public static final ScrollTo SCROLL_TO_CARD_ALERT_FRAME = new ScrollTo() {
        @Override
        public <T extends Actor> void performAs(T t) {

        }
    }.andAlignToBottom();
}
