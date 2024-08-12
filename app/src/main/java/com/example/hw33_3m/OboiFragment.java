package com.example.hw33_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw33_3m.databinding.FragmentOboiBinding;

import java.util.ArrayList;


public class OboiFragment extends Fragment {
    FragmentOboiBinding binding;
    private ArrayList<Oboi> oboiList = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOboiBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();
        OboiAdaptor pizzaAdapter = new OboiAdaptor(oboiList);
        binding.rvOboi.setAdapter(pizzaAdapter);
        binding.rvOboi.setLayoutManager(
                new StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL));
    }

    private void initAdapter() {
        oboiList.add(new Oboi("https://www.iphones.ru/wp-content/uploads/2016/06/macOS-Sierra-Wallpaper-iPhone-Plus-Wallpaper-427x760.jpg"));
        oboiList.add(new Oboi("https://images.wallpapershq.com/wallpapers/8083/thumbnail_350x757.jpg"));
        oboiList.add(new Oboi("https://www.iphones.ru/wp-content/uploads/2024/02/IMG_8682-2-580x580.jpeg"));
        oboiList.add(new Oboi("https://storage.yandexcloud.net/mobiltelefon/september22/08/oboi_iphone_14_i_iphone_14_pro_uzhe_dostupny_vsem_zhelauschim_skachat_picture2_1.jpg"));
        oboiList.add(new Oboi("https://images.wallpapershq.com/wallpapers/8083/thumbnail_350x757.jpg"));
        oboiList.add(new Oboi("https://www.iphones.ru/wp-content/uploads/2024/02/IMG_8682-2-580x580.jpeg"));
        oboiList.add(new Oboi("https://storage.yandexcloud.net/mobiltelefon/september22/08/oboi_iphone_14_i_iphone_14_pro_uzhe_dostupny_vsem_zhelauschim_skachat_picture2_1.jpg"));
        oboiList.add(new Oboi("https://i.pinimg.com/736x/90/f7/4a/90f74ac83871f31e5d9592a0cddb485b.jpg"));
    }

}