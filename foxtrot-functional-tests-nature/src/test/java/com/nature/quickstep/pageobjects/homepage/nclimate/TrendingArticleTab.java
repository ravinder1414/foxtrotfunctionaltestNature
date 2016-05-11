package com.nature.quickstep.pageobjects.homepage.nclimate;

import com.nature.quickstep.pageobjects.homepage.nclimate.NclimateHomepage;

public class TrendingArticleTab extends NclimateHomepage {
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nclimate/index.html#trending"));
    }
}
