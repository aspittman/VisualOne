package com.example.visualone.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Floating action button for adding rows");
    }

    public LiveData<String> getText() {
        return mText;
    }
}