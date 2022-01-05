package iss.ca;

import static java.lang.Math.min;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

// A ViewHolder is an object which provides access to all the views in one Recycler view element so in this scenario, one memory card.

public class MemoryBoardAdapter extends RecyclerView.Adapter<MemoryBoardAdapter.ViewHolder> {

    public static final int MARGIN_SIZE = 10;
    public static final String TAG = "MemoryBoardAdapter";

    private Context context;
    private int numPieces;

    public MemoryBoardAdapter(Context context, int numPieces) {
        this.context = context;
        this.numPieces = numPieces;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int cardWidth = parent.getWidth() / 3 - (2 * MARGIN_SIZE);
        int cardHeight = parent.getHeight() / 4 - (2 * MARGIN_SIZE);
        int cardSideLength = min(cardWidth, cardHeight);

        View view = LayoutInflater.from(context).inflate(R.layout.memory_card, parent, false);
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) view.findViewById(R.id.cardView).getLayoutParams();
        layoutParams.width = cardSideLength;
        layoutParams.height = cardSideLength;
        layoutParams.setMargins(MARGIN_SIZE, MARGIN_SIZE, MARGIN_SIZE, MARGIN_SIZE);
        MemoryBoardAdapter.ViewHolder viewHolder = new MemoryBoardAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return numPieces;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(position);
    }
    
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageButton imageButton = itemView.findViewById(R.id.imageButton);

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(int position) {
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i(TAG, "Clicked on position " + position);
                }
            });
        }
    }
}
