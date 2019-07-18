package ch.carnet.kasparscherrer;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        FormLayout formLayout = new FormLayout();
        formLayout.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 2));
        formLayout.setWidth("100%");

        TextField testField = new TextField("foo");
        testField.setPlaceholder("bar");
        EmptyFormLayoutItem emptyItem = new EmptyFormLayoutItem();

        formLayout.add(
                testField,      testField,
                emptyItem,      testField,
                emptyItem,      emptyItem,
                testField,      emptyItem
        );

        add(formLayout);
    }
}
