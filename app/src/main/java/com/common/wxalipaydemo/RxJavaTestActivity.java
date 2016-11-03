package com.common.wxalipaydemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

/**
 * User: fee(1176610771@qq.com)
 * Date: 2016-10-20
 * Time: 18:13
 * DESC:
 */
public class RxJavaTestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Observable.just(1,2,3,4).subscribe(new Observer<Integer>() {
            @Override
            public void onCompleted() {
                Log.i("info", "---> onCompleted()  ");

            }

            @Override
            public void onError(Throwable e) {
                Log.i("info", "---> onError() e= " + e);

            }

            @Override
            public void onNext(Integer integer) {
                Log.i("info", "---> onNext() integer= " + integer);
            }
        });

        Observable.create(new Observable.OnSubscribe<String>(){
            @Override
            public void call(Subscriber<? super String> subscriber) {
            }
        });
    }
}
