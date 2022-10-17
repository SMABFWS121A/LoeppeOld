package com.example.application.views.main;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

import javax.swing.text.html.ListView;

public class LoeppeLayout extends AppLayout {

    public LoeppeLayout() {
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H1 logo = new H1("Loeppe");
        logo.addClassNames("text-1", "m-m");

        HorizontalLayout header = new HorizontalLayout(
                new DrawerToggle(),
                logo
        );

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidth("100%");
        header.addClassNames("header-1", "px-m");

        addToNavbar(header);
    }

    private void createDrawer() {
        RouterLink startLink = new RouterLink("Startseite", MainView.class);

        addToDrawer(new VerticalLayout(
                startLink,
                new RouterLink("Kunden", CustomerView.class)));
    }

}
