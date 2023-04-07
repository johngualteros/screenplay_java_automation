package com.john.automatitation.openQA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.ScrollToBy;

import static com.john.automatitation.openQA.userInterfaces.DemoQaPage.CARD_ALERT_FRAME;
import static com.john.automatitation.openQA.userInterfaces.DemoQaPage.SCROLL_TO_CARD_ALERT_FRAME;

public class DemoQaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SCROLL_TO_CARD_ALERT_FRAME,
                Click.on(CARD_ALERT_FRAME)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}
