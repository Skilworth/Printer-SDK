package com.skilworth.bpprinter;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.vanstone.appsdk.client.ISdkStatue;
import com.vanstone.appsdk.client.SdkApi;
import com.vanstone.trans.api.SystemApi;
import com.vanstone.trans.api.constants.GlobalConstants;
import com.vanstone.utils.CommonConvert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class PrinterSDK {


    public static void init(Context context,InitCallBack callBack) {
        new AsyncTask<Void, Void, String>() {
            protected String doInBackground(Void... params) {
                ActivityManager mActivityManager = (ActivityManager) context.getSystemService(context.ACTIVITY_SERVICE);
                List<ActivityManager.RunningAppProcessInfo> run = mActivityManager.getRunningAppProcesses();
                for (ActivityManager.RunningAppProcessInfo pro : run) {
                    if (pro.processName.equals("com.vanstone.insurance")) {
                        Intent intent = new Intent();
                        intent.setAction("com.vanstone.insurance.action");
                        intent.putExtra("name", "xiazdong");
                        context.sendBroadcast(intent);
                        break;}}
                if (SdkApi.getInstance().getMagHandler() == null ||
                        SdkApi.getInstance().getPiccHandler() == null ||
                        SdkApi.getInstance().getIcHandler() == null) {
                }
                SystemApi.SystemInit_Api(0, CommonConvert.StringToBytes(GlobalConstants.CurAppDir + "/" + "\0"), context, new ISdkStatue() {
                    @Override
                    public void sdkInitSuccessed() {
                        Log.d("PrinterSDK", "sdkInitSuccessed");
                        callBack.onSuccess();
                    }
                    @Override
                    public void sdkInitFailed() {
                        Log.d("PrinterSDK", "sdkInitFailed");
                        callBack.onFailure();
                    }
                });
                return null;
            }
        }.execute();
    }

    public static void samplePrint(Context context) {
        BPPrinter.PrnClrBuff_Api();
        BPPrinter.printSetAlign_Api(1);
        BPPrinter.PrnSetFont_Api(1, 1);
        BPPrinter.printSetAlign_Api(1);
        BPPrinter.PrnFontSet_Api(23, 23, 0);
        BPPrinter.printSetAlign_Api(1);
        BPPrinter.PrnStr_Api("Bijlipay");
        BPPrinter.PrnFontSet_Api(18, 18, 0);
        BPPrinter.printSetAlign_Api(1);
        BPPrinter.PrnStr_Api("DATE:" + getCurrentDate() + "                 TIME:" + getCurrentTime());
        BPPrinter.PrnStr_Api("\n");
        BPPrinter.PrnStr_Api("  *****TEST PRINT*****  ");
        BPPrinter.PrnStr_Api("\n\n\n");
        BPPrinter.PrnStr_Api("\n");
        int returnValue = BPPrinter.PrnStart_Api();
        if (returnValue == 2) {
            Toast.makeText(context, "Paper is not enough", Toast.LENGTH_SHORT).show();
        } else if (returnValue == 3) {
            Toast.makeText(context, "Too hot", Toast.LENGTH_SHORT).show();
        } else if (returnValue == 4) {
            Toast.makeText(context, "Please put it back\nPress any key to reprint", Toast.LENGTH_SHORT).show();
        }
    }

    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return sdf.format(new Date());
    }

    public static String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa", Locale.getDefault());
        return sdf.format(new Date());
    }

}