package com.john.automatitation.openQA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.john.automatitation.openQA.userInterfaces.DemoQaPage.INITIAL_IMAGE;

@Subject("the home page is visible ")
public class StartPage implements Question<Boolean> {

    @Override
    public  Boolean answeredBy(Actor actor) {
        return INITIAL_IMAGE.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> isVisible() {
        return new StartPage();
    }
}
