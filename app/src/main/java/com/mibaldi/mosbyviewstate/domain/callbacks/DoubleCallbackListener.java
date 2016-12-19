package com.mibaldi.mosbyviewstate.domain.callbacks;

public interface DoubleCallbackListener<T, K> {
        void onSuccess(T result, K result2);
        void onError(MyError myError);
}
