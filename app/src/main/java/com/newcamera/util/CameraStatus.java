package com.newcamera.util;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CameraStatus {
    private static final int STATE_PREVIEW = 0;
    private static final int STATE_WAITING_LOCK = 1;
    private static final int STATE_WAITING_PRECAPTURE = 2;
    private static final int STATE_WAITING_NON_PRECAPTURE = 3;
    private static final int STATE_PICTURE_TAKEN = 4;

    private int mState;

    public CameraStatus(){
        mState = STATE_PREVIEW;
    }

    @IntDef({STATE_PREVIEW,STATE_WAITING_LOCK,STATE_WAITING_PRECAPTURE,STATE_WAITING_NON_PRECAPTURE,STATE_PICTURE_TAKEN})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Status{
    }

    public int getState() {
        return mState;
    }

    public void setState(int status) {
        this.mState = mState;
    }
}


