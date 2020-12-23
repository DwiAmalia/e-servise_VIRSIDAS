package com.tusdwi.virsidas.adapter.jadwal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.tusdwi.virsidas.R;
import com.tusdwi.virsidas.model.model_jadwal;

public class JumatAdapter extends FirebaseRecyclerAdapter<model_jadwal, JumatAdapter.myviewholder>
{

    public JumatAdapter(@NonNull FirebaseRecyclerOptions<model_jadwal> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull final model_jadwal model) {
        holder.pelajaran.setText(model.getPelajaran());
        holder.pengajar.setText(model.getPengajar());
        holder.jam.setText(model.getJam());
        holder.link.setText(model.getLink());
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jadwal_jumat,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        TextView pelajaran, pengajar, jam, link;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            pelajaran=itemView.findViewById(R.id.NamaPelajaran);
            pengajar=itemView.findViewById(R.id.Pengajar);
            jam=itemView.findViewById(R.id.hari);
            link=itemView.findViewById(R.id.link);
        }
    }

}
