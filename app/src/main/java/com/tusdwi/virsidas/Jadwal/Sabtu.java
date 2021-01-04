package com.tusdwi.virsidas.Jadwal;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tusdwi.virsidas.R;
import com.tusdwi.virsidas.adapter.jadwal.adapterSenin;
import com.tusdwi.virsidas.api.ApiServer;
import com.tusdwi.virsidas.api.ApiInterface;
import com.tusdwi.virsidas.model.ResponJadwal;
import com.tusdwi.virsidas.model.jadwalModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sabtu extends Fragment {
    private RecyclerView mRecycler;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mManager;
    private List<jadwalModel> mItems = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sabtu, container, false);

        mRecycler = (RecyclerView) view.findViewById(R.id.recview);
        mManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecycler.setLayoutManager(mManager);

        ApiInterface api = ApiServer.getClient().create(ApiInterface.class);
        Call<ResponJadwal> getdata = api.getJadwal();
        getdata.enqueue(new Callback<ResponJadwal>() {

            @Override
            public void onResponse(Call<ResponJadwal> call, Response<ResponJadwal> response) {

                Log.d("RETRO", "RESPONSE : " + response.body().getKode());
                mItems = response.body().getResult();

                mAdapter = new adapterSenin(getActivity(), mItems);
                mRecycler.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ResponJadwal> call, Throwable t) {
                Log.d("RETRO", "FAILED : respon gagal");
            }

        });
        return view;

    }
}