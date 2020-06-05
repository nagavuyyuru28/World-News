package com.example.worldnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of News articles
        News currentNews = getItem(position);

        // Find the TextView with view ID title text view
        TextView titleView = (TextView) listItemView.findViewById(R.id.title_text_view);

        // Display the title of the current news in that TextView
        titleView.setText(currentNews.getmTitle());

        // Find the TextView with view ID category text view
        TextView categoryView = (TextView) listItemView.findViewById(R.id.category_text_view);

        // Display the category of the current news in that TextView
        categoryView.setText(currentNews.getmSection());

        // Find the TextView with view ID date text view
        TextView dateView = (TextView) listItemView.findViewById(R.id.date_text_view);

        // Display the date of the current news in that TextView
        dateView.setText(currentNews.getmDate());

        // Find the TextView with view ID author text view
        TextView authorView = (TextView) listItemView.findViewById(R.id.author_text_view);

        // Display the authtor of the current news in that TextView
        authorView.setText(currentNews.getmAuthor());

        return listItemView;
    }
}

