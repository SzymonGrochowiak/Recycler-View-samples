package com.recyclerviewsamples.model;

/**
 * @author Szymon Grochowiak
 */
public class ThirdTypeElement implements RecyclerElement {

    private int mSeekBarValue;
    private int mSeekBarMaxValue;

    public ThirdTypeElement(int seekBarValue, int seekBarMaxValue) {
        mSeekBarValue = seekBarValue;
        mSeekBarMaxValue = seekBarMaxValue;
    }

    public int getSeekBarValue() {
        return mSeekBarValue;
    }

    public int getSeekBarMaxValue() {
        return mSeekBarMaxValue;
    }
}
