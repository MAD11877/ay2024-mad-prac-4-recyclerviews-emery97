package sg.edu.np.mad.madpractical4;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView txt;
    public UserViewHolder(View itemView) {
        super(itemView);
        txt = itemView.findViewById(android.R.id.text1);
    }
}