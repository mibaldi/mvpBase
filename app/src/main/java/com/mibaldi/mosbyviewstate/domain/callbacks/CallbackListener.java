package com.mibaldi.mosbyviewstate.domain.callbacks;

public interface CallbackListener<T> {
    void onSuccess(T result);
    void onError(MyError myError);
}
