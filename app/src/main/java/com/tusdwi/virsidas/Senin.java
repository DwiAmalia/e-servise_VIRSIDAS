package com.tusdwi.virsidas;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.tusdwi.virsidas.model.Jadwal;

public class Senin extends Fragment {
    private DatabaseReference databaseReference;
    private FirebaseRecyclerAdapter<Jadwal, JadwalViewHolder> adapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager Lmanager;


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_senin, container, false);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        recyclerView = view.findViewById(R.id.recycler_View);
        recyclerView.setHasFixedSize(true);
        Lmanager = new LinearLayoutManager(getActivity());
        Lmanager.setReverseLayout(true);
        Lmanager.setStackFromEnd(true);
        recyclerView.setLayoutManager(Lmanager);

        Query query = getQuery(databaseReference);

        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Jadwal>()
                .setQuery(query, Jadwal.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<Jadwal, JadwalViewHolder>(options) {
            @Override
            public JadwalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                LayoutInflater inflater = LayoutInflater.from(parent.getContext());
                return new JadwalViewHolder(inflater.inflate(R.layout.item_jadwal_kelas1, parent, false));
            }

            @Override
            protected void onBindViewHolder(@NonNull JadwalViewHolder holder, int i, @NonNull final Jadwal jadwal) {
                holder.BindJadwal(jadwal, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(jadwal.link));
                        startActivity(intent);
                    }
                });

            }
        };



        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);

        return view;
    }


    private Query getQuery(DatabaseReference databaseReference) {
        Query query = databaseReference.child("Jadwal").child("Senin").child("Kelas1A");
        return query;
    }
}