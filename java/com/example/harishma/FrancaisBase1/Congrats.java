package com.example.harishma.FrancaisBase1;



        import android.app.Activity;
        import android.content.Intent;
        import android.os.Handler;
        import android.os.Bundle;


public class Congrats extends Activity {
            private final int SPLASH_DISPLAY_LENGTH = 5000;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_congrats);
                //Thread mythread=new Thread(){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent mainIntent = new Intent(Congrats.this, MainActivity.class);
                        Congrats.this.startActivity(mainIntent);
                        Congrats.this.finish();
                    }
                }, SPLASH_DISPLAY_LENGTH);
            }
        }
        // button=(Button)findViewById(R.id.button);
        //  textView2=(TextView) findViewById(R.id.textView2);
        // button.setOnClickListener(new View.OnClickListener() {
        //   @Override
        // public void onClick(View view) {
        //   editText.setText(""+mScore);
        //}
        //});
        //    textView2.setText(getIntent().getExtras().getShort("score"));


