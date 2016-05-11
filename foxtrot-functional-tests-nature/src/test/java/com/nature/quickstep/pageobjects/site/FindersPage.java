package com.nature.quickstep.pageobjects.site;

import static org.junit.Assert.assertEquals;

import com.nature.quickstep.pageobjects.PageObject;

public class FindersPage extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {

    }

    public void navigateToFinder(String finder, String doi) throws Exception {
        browser().get(context().getURL("nature.com/" + finder + "/" + doi));
    }

    public void verifyArticlePage(String article) throws Exception {
        assertEquals(context().getURL("nature.com/" + article), browser().getCurrentUrl());
    }

}
