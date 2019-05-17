package com.simplesearch;

import junit.framework.TestCase;

public class ProperTestTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testSimpleSearch() {
        // Given I open "http://google.com"
        actionwords.iOpenP1("http://google.com");
        // When I search for "HipTest"
        actionwords.iSearchForP1("HipTest");
        // Then a link to "HipTest" is shown in the results
        actionwords.aLinkToP1IsShownInTheResults("HipTest");
    }
}