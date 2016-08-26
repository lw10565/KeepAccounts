package com.lw.keepaccounts;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by lw on 2016/8/26.
 * 基础
 */
public class BaseActivity extends Activity {
    /**
     * 提示信息
      * @param string
     */
    protected void tip(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    /**
     * 提示信息
     * @param strId
     */
    protected void tip(int strId){
        Toast.makeText(this, getString(strId), Toast.LENGTH_SHORT).show();
    }

}

