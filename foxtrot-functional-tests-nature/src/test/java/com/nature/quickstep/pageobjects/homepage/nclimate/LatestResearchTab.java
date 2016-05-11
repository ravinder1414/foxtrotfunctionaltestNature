package com.nature.quickstep.pageobjects.homepage.nclimate;

import com.nature.quickstep.pageobjects.PageObject;

public class LatestResearchTab extends PageObject {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nclimate/index.html#latest-research"));

    }

    @Override
    public boolean isPresent() {
        return false;
    }

}
