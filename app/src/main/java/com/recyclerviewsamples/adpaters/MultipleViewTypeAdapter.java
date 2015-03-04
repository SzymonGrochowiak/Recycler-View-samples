package com.recyclerviewsamples.adpaters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Szymon Grochowiak
 */
public class MultipleViewTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


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

    public MultipleViewTypeAdapter() {

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
