package com.durber.urber.timestomper.Activities.Main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.durber.urber.timestomper.R;

import java.util.ArrayList;

/**
 * Created by rober on 2017-01-08.
 */

class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.ViewHolder> {
    private ArrayList<String> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(View v)
        {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.recylerview_row_text);

            //mTextView = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecylerViewAdapter() {

        mDataset = new ArrayList<String>();
        for(int i = 1; i <101; i++)
        {
            mDataset.add("Test"+i);
        }


    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecylerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_recyclerview_row, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset.get(position));

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}