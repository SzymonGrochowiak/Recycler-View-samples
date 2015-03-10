package com.recyclerviewsamples.adpaters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.recyclerviewsamples.R;
import com.recyclerviewsamples.model.FirstTypeElement;
import com.recyclerviewsamples.model.RecyclerElement;
import com.recyclerviewsamples.model.SecondTypeElement;
import com.recyclerviewsamples.model.ThirdTypeElement;

import java.util.List;

/**
 * @author Szymon Grochowiak
 */
public class MultipleViewTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int ITEM_TYPE_FIRST = 100;
    private static final int ITEM_TYPE_SECOND = 200;
    private static final int ITEM_TYPE_THIRD = 300;


    private final List<RecyclerElement> mRecyclerElementList;
    private final Context mContext;
    private final LayoutInflater mLayoutInflater;


    public static class FirstTypeViewHolder extends RecyclerView.ViewHolder {

        public FirstTypeViewHolder(View itemView) {
            super(itemView);
        }
    }

    public static class SecondTypeViewHolder extends RecyclerView.ViewHolder {

        public SecondTypeViewHolder(View itemView) {
            super(itemView);
        }
    }

    public static class ThirdTypeViewHolder extends RecyclerView.ViewHolder {

        public ThirdTypeViewHolder(View itemView) {
            super(itemView);
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
            
        } else if (viewHolder instanceof SecondTypeViewHolder) {
            SecondTypeViewHolder secondTypeViewHolder = (SecondTypeViewHolder) viewHolder;
        } else if (viewHolder instanceof ThirdTypeViewHolder) {
            ThirdTypeViewHolder thirdTypeViewHolder = (ThirdTypeViewHolder) viewHolder;
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
