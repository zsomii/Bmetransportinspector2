package temalabor.bmetransportinspector;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TicketActivationResultActivity extends AppCompatActivity{

    private Context context;
    private boolean activationSuccess;
    private Button closeButton;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getIntent().getBooleanExtra("result",activationSuccess);

        if (activationSuccess) {
            setContentView(R.layout.activation_success);
        } else setContentView(R.layout.activation_failed);

        closeButton = (Button) findViewById(R.id.dismissButton);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }




}
