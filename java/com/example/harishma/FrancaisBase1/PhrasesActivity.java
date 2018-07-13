/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.harishma.FrancaisBase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "ou allez-vous?"));
        words.add(new Word("What is your name?", "comment vous applez-vous?"));
        words.add(new Word("My name is...", "mon nom est..."));
        words.add(new Word("How are you feeling?", "comment allez-vous?"));
        words.add(new Word("I’m feeling good.", "je me sens bien"));
        words.add(new Word("Are you coming?", "viens-tu?"));
        words.add(new Word("Yes, I’m coming.", "oui j'arrive"));
        words.add(new Word("I’m coming.", "j'arrive"));
        words.add(new Word("Let’s go.", "allons-y"));
        words.add(new Word("Come here.", "venez ici"));
        words.add(new Word("Thanks.", "merci"));
        words.add(new Word("All is well.", "tout est bien"));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
