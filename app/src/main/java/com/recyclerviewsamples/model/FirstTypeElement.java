package com.recyclerviewsamples.model;

/**
 * @author Szymon Grochowiak
 */
public class FirstTypeElement implements RecyclerElement {

    private String mName;
    private String mPictureUrl;

    public FirstTypeElement(String name, String pictureUrl) {
        mName = name;
        mPictureUrl = pictureUrl;
    }

    public String getName() {
        return mName;
    }

    public String getPictureUrl() {
        return mPictureUrl;
    }
}
