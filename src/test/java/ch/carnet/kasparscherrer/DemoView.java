package ch.carnet.kasparscherrer;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {
    private TextField textField1, textField2, textField3, textField4;

    public DemoView(){
        addLayout();
    }

    private void addLayout() {
        initializeTextFields();

        FormLayout formLayout = new FormLayout();
        formLayout.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 2));
        formLayout.setWidth("500px");
        formLayout.getStyle().set("border", "1px solid black");
        formLayout.add(
                textField1,                 textField2,
                textField3,                 new EmptyFormLayoutItem(),
                new EmptyFormLayoutItem(),  new EmptyFormLayoutItem(),
                new EmptyFormLayoutItem(),  textField4
        );

        add(formLayout);
    }

    private void initializeTextFields() {
        textField1 = new TextField("foo");
        textField1.setPlaceholder("bar");
        textField1.setWidth("100%");
        textField2 = new TextField("foo");
        textField2.setPlaceholder("bar");
        textField2.setWidth("100%");
        textField3 = new TextField("foo");
        textField3.setPlaceholder("bar");
        textField3.setWidth("100%");
        textField4 = new TextField("foo");
        textField4.setPlaceholder("bar");
        textField4.setWidth("100%");
    }
}
