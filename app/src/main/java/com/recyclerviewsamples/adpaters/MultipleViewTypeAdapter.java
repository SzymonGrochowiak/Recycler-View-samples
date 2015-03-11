package com.recyclerviewsamples.adpaters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.recyclerviewsamples.R;
import com.recyclerviewsamples.model.FirstTypeElement;
import com.recyclerviewsamples.model.RecyclerElement;
import com.recyclerviewsamples.model.SecondTypeElement;
import com.recyclerviewsamples.model.ThirdTypeElement;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * @author Szymon Grochowiak
 */
public class MultipleViewTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int ITEM_TYPE_FIRST = 1;
    private static final int ITEM_TYPE_SECOND = 2;
    private static final int ITEM_TYPE_THIRD = 3;


    private final List<? extends RecyclerElement> mRecyclerElementList;
    private final Context mContext;
    private final LayoutInflater mLayoutInflater;


    public static class FirstTypeViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;

        public FirstTypeViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }

    public static class SecondTypeViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public SecondTypeViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }

    public static class ThirdTypeViewHolder extends RecyclerView.ViewHolder {

        public SeekBar seekBar;

        public ThirdTypeViewHolder(View itemView) {
            super(itemView);
            seekBar = (SeekBar) itemView.findViewById(R.id.seekBar);
        }
    }

    public MultipleViewTypeAdapter(List<RecyclerElement> recyclerElementList, Context context) {
        mRecyclerElementList = recyclerElementList;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view;
        RecyclerView.ViewHolder viewHolder = null;
        switch (viewType) {
            case ITEM_TYPE_FIRST:
                view = mLayoutInflater.inflate(R.layout.recyclerview_item_first_type, viewGroup, false);
                viewHolder = new FirstTypeViewHolder(view);
                break;
            case ITEM_TYPE_SECOND:
                view = mLayoutInflater.inflate(R.layout.recyclerview_item_second_type, viewGroup, false);
                viewHolder = new SecondTypeViewHolder(view);
                break;
            case ITEM_TYPE_THIRD:
                view = mLayoutInflater.inflate(R.layout.recyclerview_item_third_type, viewGroup, false);
                viewHolder = new ThirdTypeViewHolder(view);
                break;
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        if (viewHolder instanceof FirstTypeViewHolder) {
            FirstTypeViewHolder firstTypeViewHolder = (FirstTypeViewHolder) viewHolder;
            FirstTypeElement firstTypeElement = (FirstTypeElement) mRecyclerElementList.get(position);
            Picasso.with(mContext).load(firstTypeElement.getPictureUrl()).into(firstTypeViewHolder.imageView);
            firstTypeViewHolder.textView.setText(firstTypeElement.getName());
        } else if (viewHolder instanceof SecondTypeViewHolder) {
            SecondTypeViewHolder secondTypeViewHolder = (SecondTypeViewHolder) viewHolder;
            SecondTypeElement secondTypeElement = (SecondTypeElement) mRecyclerElementList.get(position);
            secondTypeViewHolder.textView.setText(secondTypeElement.getName());
        } else if (viewHolder instanceof ThirdTypeViewHolder) {
            ThirdTypeViewHolder thirdTypeViewHolder = (ThirdTypeViewHolder) viewHolder;
            ThirdTypeElement thirdTypeElement = (ThirdTypeElement) mRecyclerElementList.get(position);
            thirdTypeViewHolder.seekBar.setMax(thirdTypeElement.getSeekBarMaxValue());
            thirdTypeViewHolder.seekBar.setProgress(thirdTypeElement.getSeekBarValue());
        }
    }

    @Override
    public int getItemCount() {
        return mRecyclerElementList.size();
    }

    @Override
    public int getItemViewType(int position) {
        RecyclerElement recyclerElement = mRecyclerElementList.get(position);
        if (recyclerElement instanceof FirstTypeElement) {
            return ITEM_TYPE_FIRST;
        }
        if (recyclerElement instanceof SecondTypeElement) {
            return ITEM_TYPE_SECOND;
        }
        if (recyclerElement instanceof ThirdTypeElement) {
            return ITEM_TYPE_THIRD;
        }
        return 0;
    }
}
