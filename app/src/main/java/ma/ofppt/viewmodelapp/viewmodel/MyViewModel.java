package ma.ofppt.viewmodelapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    public MutableLiveData<Integer> number = new MutableLiveData<>(0);

    public void addOne(){
        number.setValue(number.getValue() + 1);
    }
}
