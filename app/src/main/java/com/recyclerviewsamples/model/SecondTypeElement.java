package com.recyclerviewsamples.model;

/**
 * @author Szymon Grochowiak
 */
public class SecondTypeElement implements RecyclerElement {

    private String mName;

    public SecondTypeElement(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}
