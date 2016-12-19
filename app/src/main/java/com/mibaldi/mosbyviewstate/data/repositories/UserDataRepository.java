package com.mibaldi.mosbyviewstate.data.repositories;

import com.mibaldi.mosbyviewstate.domain.callbacks.CallbackListener;
import com.mibaldi.mosbyviewstate.domain.callbacks.ErrorConstants;
import com.mibaldi.mosbyviewstate.domain.callbacks.MyError;

import javax.inject.Singleton;

@Singleton
public class UserDataRepository {

    public void getUser(CallbackListener<String> listener) {
            if (true){
                listener.onSuccess("nombre");
            }else {
                MyError myError = new MyError();
                myError.setError(ErrorConstants.ERROR_400);
                listener.onError(myError);
            }
    }
}
