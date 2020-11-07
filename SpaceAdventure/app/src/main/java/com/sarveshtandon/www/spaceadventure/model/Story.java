package com.sarveshtandon.www.spaceadventure.model;

import com.sarveshtandon.www.spaceadventure.model.Choice;
import com.android.internal.util.*;
import com.sarveshtandon.www.spaceadventure.model.Page;
import

public class Story {

    private Page[] pages;

    public Story() {
        pages = new Page[7];

        pages[0] = new Page(res.layout.drawable.page0,
                res.layout.strings.page0,
                new Choice(res.layout.strings.page0_choice1, 1),
                new Choice(res.layout.strings.page0_choice2, 2));

        pages[1] = new Page(res.layout.drawable.page1,
                res.layout.strings.page1,
                new Choice(res.layout.strings.page1_choice1, 3),
                new Choice(res.layout.strings.page1_choice2, 4));

        pages[2] = new Page(res.layout.drawable.page2,
                res.layout.strings.page2,
                new Choice(res.layout.strings.page2_choice1, 4),
                new Choice(res.layout.strings.page2_choice2, 6));

        pages[3] = new Page(res.layout.drawable.page3,
                res.layout.strings.page3,
                new Choice(res.layout.strings.page3_choice1, 4),
                new Choice(res.layout.strings.page3_choice2, 5));

        pages[4] = new Page(res.layout.drawable.page4,
                res.layout.strings.page4,
                new Choice(res.layout.strings.page4_choice1, 5),
                new Choice(res.layout.strings.page4_choice2, 6));

        pages[5] = new Page(res.layout.drawable.page5, res.layout.strings.page5);

        pages[6] = new Page(res.layout.drawable.page6, res.layout.strings.page6);
    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length) {
            pageNumber = 0;
        }
        return pages[pageNumber];
    }
}








