package com.nature.quickstep.pageobjects.homepage.nclimate;

import com.nature.quickstep.pageobjects.homepage.nclimate.NclimateHomepage;

public class TrendingArticlePage extends NclimateHomepage {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nclimate/trending-articles.html"));
    }
}