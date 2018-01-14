package com.example.android.reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mateusz on 14.01.2018.
 */

public class PadawanAdapter extends ArrayAdapter<Padawan> {

    public PadawanAdapter(Activity context, ArrayList<Padawan> padawans) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, padawans);
    }
//    ;


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Padawan currentPadawan = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentPadawan.getPadawanName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView raceTextView = (TextView) listItemView.findViewById(R.id.race_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        raceTextView.setText(currentPadawan.getPadawanRace());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView historyTextView = (TextView) listItemView.findViewById(R.id.history_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        historyTextView.setText(currentPadawan.getJediHistoryGrade());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView forceTextView = (TextView) listItemView.findViewById(R.id.force_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        forceTextView.setText(currentPadawan.getJediForceGrade());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView peTextView = (TextView) listItemView.findViewById(R.id.pe_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        peTextView.setText(currentPadawan.getPhysicalEducation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView sumTextView = (TextView) listItemView.findViewById(R.id.sum_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        sumTextView.setText(currentPadawan.toString());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        return listItemView;
    }
}
