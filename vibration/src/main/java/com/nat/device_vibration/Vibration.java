package com.nat.device_vibration;

import com.alibaba.weex.plugin.annotation.WeexModule;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

/**
 * Created by Acathur on 17/2/17.
 * Copyright (c) 2017 Instapp. All rights reserved.
 */
@WeexModule(name = "vibration")
public class Vibration extends WXModule{

    @JSMethod
    public void vibrate(int time, final JSCallback jsCallback){
        VibrationModule.getInstance(mWXSDKInstance.getContext()).vibrate(time, new ModuleResultListener() {
            @Override
            public void onResult(Object o) {
                jsCallback.invoke(o);
            }
        });
    }
}
