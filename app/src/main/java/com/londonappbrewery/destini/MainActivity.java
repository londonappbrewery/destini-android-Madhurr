package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView  mStorytext;
    Button Ans1;
    Button Ans2;
    private int mindex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
     final TextView mStorytext = (TextView)findViewById(R.id.storyTextView);
     final Button Ans1 = (Button)findViewById(R.id.buttonTop);
     final Button Ans2 =(Button)findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
      Ans1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (mindex == 1 || mindex ==2) {
                  mStorytext.setText(R.string.T3_Ans1);
                  Ans1.setText(R.string.T3_Ans1);
                  Ans2.setText(R.string.T3_Ans2);
                  mindex =3;
              }
              else if(mindex == 3){
                  mStorytext.setText(R.string.T6_End);
                  Ans1.setVisibility(view.GONE);
                  Ans2.setVisibility(View.GONE);

              }

          }

      });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

     Ans2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if(mindex ==1) {
                 mStorytext.setText(R.string.T2_Story);
                 Ans1.setText(R.string.T2_Ans1);
                 Ans2.setText(R.string.T2_Ans2);
                 mindex = 2;
             }
             else if(mindex == 2){
                 mStorytext.setText(R.string.T4_End);
                 Ans1.setVisibility(view.GONE);
                 Ans2.setVisibility(view.GONE);
             }
             else if(mindex == 3){
                 mStorytext.setText(R.string.T5_End);
                 Ans1.setText(R.string.T2_Ans1);
                 Ans2.setText(R.string.T2_Ans2);
             }
         }

     });
    }



}
