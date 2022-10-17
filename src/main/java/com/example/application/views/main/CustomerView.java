package com.example.application.views.main;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Customer")
@Route(value = "customer", layout = LoeppeLayout.class)
public class CustomerView extends VerticalLayout {

    private final TextField custId;
    private final TextField custLastName;
    private final TextField custFirstName;
    private final TextField custPhone;

    public CustomerView() {
        custId = new TextField();
        custLastName = new TextField();
        custFirstName = new TextField();
        custPhone = new TextField();

        add(createCustSearch());

    }

    public FormLayout createCustSearch() {
        FormLayout custSearch = new FormLayout();
        custSearch.addFormItem(custId, "Kunden-ID");
        custSearch.addFormItem(custLastName, "Nachname");
        custSearch.addFormItem(custFirstName, "Vorname");
        custSearch.addFormItem(custPhone, "Festnetz");
        return custSearch;
    }

}
