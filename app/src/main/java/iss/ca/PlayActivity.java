package iss.ca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    LinearLayout llGameInfo;
    TextView tvNumPairs, tvNumMoves, tvTimer;
    RecyclerView rvBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);

        llGameInfo = findViewById(R.id.llGameInfo);
        tvNumPairs = findViewById(R.id.tvNumPairs);
        tvNumMoves = findViewById(R.id.tvNumMoves);
        tvTimer = findViewById(R.id.tvTimer);
        rvBoard = findViewById(R.id.rvBoard);

        // Adapter provides a binding for the data set to the views of the RecyclerView
        rvBoard.setAdapter(new MemoryBoardAdapter(this, 12));

        // To optimise for performance. Size of RecyclerView is not affected by its contents hence the size won't change regardless of the number of cards in the view.
        rvBoard.setHasFixedSize(true);

        // Layout Manager measures and positions item views
        rvBoard.setLayoutManager( new GridLayoutManager(this, 3));
    }


}