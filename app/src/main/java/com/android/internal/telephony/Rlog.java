package com.android.internal.telephony;

import android.util.Log;

/**
 * Stub for com.android.internal.telephony.Rlog.
 * Delegates to android.util.Log so the Gradle build succeeds
 * without a full AOSP android.jar. At runtime on a real device,
 * the actual Rlog from the platform is used instead of this stub.
 */
public final class Rlog {
    public static void d(String tag, String msg) { Log.d(tag, msg); }
    public static void d(String tag, String msg, Throwable tr) { Log.d(tag, msg, tr); }
    public static void e(String tag, String msg) { Log.e(tag, msg); }
    public static void e(String tag, String msg, Throwable tr) { Log.e(tag, msg, tr); }
    public static void w(String tag, String msg) { Log.w(tag, msg); }
    public static void w(String tag, String msg, Throwable tr) { Log.w(tag, msg, tr); }
    public static void i(String tag, String msg) { Log.i(tag, msg); }
    public static void i(String tag, String msg, Throwable tr) { Log.i(tag, msg, tr); }
    public static void v(String tag, String msg) { Log.v(tag, msg); }
    public static void v(String tag, String msg, Throwable tr) { Log.v(tag, msg, tr); }
    private Rlog() {}
}
