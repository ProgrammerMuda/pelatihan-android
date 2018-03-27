package smk_raga.adab;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int progressStatus = 0;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = (TextView) findViewById(R.id.tv);
        final ProgressBar pb = (ProgressBar) findViewById(R.id.pb);

        progressStatus = 0;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 1;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            pb.setProgress(progressStatus);
                            // Show the progress on TextView
                            tv.setText(progressStatus + "%");
                            // If progressStatuss to 100 then
                            System.out.println("Hasil Progress Status: " + progressStatus + "%");
                            int hasil = progressStatus;
                            if (hasil == 100) {
                                Intent i = new Intent(MainActivity.this, menu.class);
                                startActivity(i);
                            }
                        }
                    });
                }
            }
        }).start();
    }
}

