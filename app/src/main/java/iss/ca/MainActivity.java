package iss.ca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout clRoot;
    RecyclerView rvImagePicker;
    TextView tvLoadingStatus;
    EditText etLink;
    Button btnFetch;
    ProgressBar pbUploading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clRoot = findViewById(R.id.clRoot);
        rvImagePicker = findViewById(R.id.rvImagePicker);
        tvLoadingStatus = findViewById(R.id.tvLoadingStatus);
        btnFetch = findViewById(R.id.btnFetch);
        etLink = findViewById(R.id.etLink);
        pbUploading = findViewById(R.id.pbUploading);


    }
}