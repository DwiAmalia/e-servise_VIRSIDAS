package com.tusdwi.virsidas;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tusdwi.virsidas.model.Jadwal;


public class JadwalViewHolder extends RecyclerView.ViewHolder {
    public TextView TVpelajaran, TVpengajar, TVjam, TVlink;
    ImageButton Video;

    public JadwalViewHolder(@NonNull View itemView) {
        super(itemView);
        TVpelajaran = itemView.findViewById(R.id.Pelajaran);
        TVpengajar = itemView.findViewById(R.id.Pengajar);
        TVjam =  itemView.findViewById(R.id.JamPelajaran);
        TVlink = itemView.findViewById(R.id.link);
        Video = itemView.findViewById(R.id.Gmeet);
    }

    public void BindJadwal(Jadwal jadwal, View.OnClickListener onClickListener){
        TVpelajaran.setText(jadwal.pelajaran);
        TVpengajar.setText(jadwal.pengajar);
        TVjam.setText(jadwal.jam);
        TVlink.setText(jadwal.link);
        Video.setOnClickListener(onClickListener);
    }
}
