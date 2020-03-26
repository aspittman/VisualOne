package com.example.visualone.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("\t View being used is an \n\t example layout of a Navigation Drawer");
    }

    public LiveData<String> getText() {
        return mText;
    }
}