package com.example.harishma.FrancaisBase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Harishma on 25-02-2017.
 */

public class DaysActivity extends AppCompatActivity{
 @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.word_list);

    // Create a list of words
    ArrayList<Word> words = new ArrayList<Word>();
    words.add(new Word("Sunday", "lundi"));
    words.add(new Word("Monday", "mardi"));
    words.add(new Word("Tuesday", "mercredi"));
    words.add(new Word("Wednesday", "jeudi"));
    words.add(new Word("Thursday", "vendredi"));
    words.add(new Word("Friday", "samedi"));
    words.add(new Word("Saturday", "dimanche"));


    // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
    // adapter knows how to create list items for each item in the list.
    WordAdapter adapter = new WordAdapter(this, words, R.color.category_days);

    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
    // There should be a {@link ListView} with the view ID called list, which is declared in the
    // word_list.xml layout file.
    ListView listView = (ListView) findViewById(R.id.list);

    // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
    // {@link ListView} will display list items for each {@link Word} in the list.
    listView.setAdapter(adapter);
}
}

