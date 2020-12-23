package com.tusdwi.virsidas.adapter.jadwal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tusdwi.virsidas.R;
import com.tusdwi.virsidas.model.jadwalModel;

import java.util.List;

public class adapterSenin extends RecyclerView.Adapter<adapterSenin.HolderData>{

    private List<jadwalModel> mList;
    private Context context;

    public adapterSenin(Context context, List<jadwalModel> mList)
    {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public adapterSenin.HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jadwal_fix, parent, false);
        adapterSenin.HolderData holder = new adapterSenin.HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapterSenin.HolderData holder, int position) {
        jadwalModel mj = mList.get(position);
        holder.hari.setText(mj.getNama_hari());
        holder.mulai.setText(mj.getMulai());
        holder.selesai.setText(mj.getSelesai());
        holder.pelajaran.setText(mj.getNama_mapel());
        holder.kelas.setText(mj.getNama_kelas());
       // holder.datajadwal = datajadwal;

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class HolderData extends RecyclerView.ViewHolder {
        TextView hari, mulai, selesai, pelajaran, kelas;
        jadwalModel datajadwal;

        public HolderData(@NonNull View itemView) {
            super(itemView);
            hari = (TextView) itemView.findViewById(R.id.hari);
            mulai = (TextView) itemView.findViewById(R.id.mulai);
            selesai = (TextView) itemView.findViewById(R.id.selesai);
            pelajaran = (TextView) itemView.findViewById(R.id.NamaPelajaran);
            kelas = (TextView) itemView.findViewById(R.id.kelas);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });
        }
    }
}
