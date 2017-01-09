package com.mibaldi.mosbyviewstate.data.repositories;

import com.mibaldi.mosbyviewstate.domain.callbacks.CallbackListener;
import com.mibaldi.mosbyviewstate.domain.callbacks.ErrorConstants;
import com.mibaldi.mosbyviewstate.domain.callbacks.MyError;

import java.io.Serializable;

import javax.inject.Singleton;

@Singleton
public class UserDataRepository implements Serializable {

    public void getUser(CallbackListener<String> listener) {
            if (false){
                listener.onSuccess("nombre");
            }else {
                MyError myError = new MyError();
                myError.setError(ErrorConstants.ERROR_400);
                myError.setDescription("nombre ERROR");
                listener.onError(myError);
            }
    }
}
