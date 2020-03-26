package com.example.visualone.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" \n The black icons here \n are a possible Toolbar Layout");
    }

    public LiveData<String> getText() {
        return mText;
    }
}