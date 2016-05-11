package com.nature.quickstep.pageobjects.homepage.nclimate;

import com.nature.quickstep.pageobjects.homepage.AipHomepage;

public class NclimateHomepage extends AipHomepage {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nclimate/index.html"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

}
