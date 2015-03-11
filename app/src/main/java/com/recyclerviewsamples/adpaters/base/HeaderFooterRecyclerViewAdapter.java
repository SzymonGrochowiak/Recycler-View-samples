package com.recyclerviewsamples.adpaters.base;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * @author Szymon Grochowiak
 */
public abstract class HeaderFooterRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public abstract RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    @Override
    public abstract void onBindViewHolder(RecyclerView.ViewHolder holder, int position);

    @Override
    public int getItemCount() {
        return 0;
    }
}
