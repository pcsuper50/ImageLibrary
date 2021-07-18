package com.example.putatoetechnology;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;

import org.jetbrains.annotations.NotNull;

public class Myadapter extends FragmentStateAdapter {

    public Myadapter(FragmentManager supportFragmentManager, Lifecycle lifecycle) {
        super(supportFragmentManager,lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        return null;
    }



    @Override
    public int getItemCount() {
        return 0;
    }
}