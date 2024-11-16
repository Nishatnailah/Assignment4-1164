
package com.example.assignment4;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ExpandableListActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_expandable);

        ExpandableListView expandableListView=findViewById(R.id.expandableListView);
        String[] title = {
                "Chocolate cake", "Butter cake",
                "Vanilla cake", "Sponge Cakes",
                "GFruit-Based Cakes", "red velvet cake",
                "Black Forest Cake", "carrot cake", "Lemon Cake",
                "Strawberry Shortcake"
        };

        String[][] subtitles = {
                {"Chocolate cake is a rich and moist dessert made with cocoa, loved for its deep, indulgent flavor"}, {"Made with butter or other fats as a primary ingredient"}, {"Vanilla cake is a classic dessert known for its light, fluffy texture and rich flavor"}, {"Light and airy, made with eggs as the primary leavening agent."},
                {"Incorporate fresh or dried fruits for flavor and texture"}, {"A soft, red-colored cake with a hint of cocoa, paired with cream cheese frosting"}, {"Chocolate sponge layers with whipped cream and cherries"}, {"Moist cake made with grated carrots and spiced with cinnamon, often topped with cream cheese icing"},
                {"Light cake infused with zesty lemon flavor"}, {"Layers of sponge cake with strawberries and whipped cream"}
        };
        Integer[] image = {
                R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3,
                R.drawable.img_4, R.drawable.img_5, R.drawable.img_6, R.drawable.img_7,
                R.drawable.img_8, R.drawable.img_9
        };
        ExpandableAdapter adapter=new ExpandableAdapter(this,title,subtitles,image) ;
        expandableListView.setAdapter(adapter);


    }
}
