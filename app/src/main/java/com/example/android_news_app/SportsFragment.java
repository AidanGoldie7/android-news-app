package com.example.android_news_app;

//must use same import statement for all fragments or error will occur
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SportsFragment extends Fragment {

    String api ="avd_QiErAGMcEjSocycXS-3DqQl8XVVOmzffj6POpAE";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String country = "in";
    private RecyclerView recyclerViewofsports;
    private String category = "sports";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //attach fragment
        View v=inflater.inflate(R.layout.sportsfragment, null);


        recyclerViewofsports =v.findViewById(R.id.recyclerviewofsports);
        modelClassArrayList = new ArrayList<>();
        recyclerViewofsports.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(), modelClassArrayList);
        recyclerViewofsports.setAdapter(adapter);

        findNews();


        return v;
    }

    //fetching data from API
    private void findNews() {

        ApiUtilities.getApiInterface().getCategoryNews(country, category,100,api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });

    }
}
