package com.example.skypan.textview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

import com.example.skypan.textview.gridview.GridViewActivity;
import com.example.skypan.textview.listview.ListViewActivity;
import com.example.skypan.textview.recyclerview.RecyclerViewActivity;
import com.example.skypan.textview.widget.CustomDialog;

public class UIActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnRecyclerView;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;
    private Button mBtnCustom;
    private Button mBtnPop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnButton =(Button) findViewById(R.id.btn_button);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        mBtnImageView = (Button) findViewById(R.id.btn_imageview);
        mBtnListView = (Button) findViewById(R.id.btn_listview);
        mBtnGridView = (Button) findViewById(R.id.btn_gridview);
        mBtnRecyclerView = findViewById(R.id.btn_recyclerview);
        mBtnWebView = findViewById(R.id.btn_webview);
        mBtnToast = findViewById(R.id.btn_toast);
        mBtnDialog = findViewById(R.id.btn_dialog);
        mBtnProgress = findViewById(R.id.btn_progress);
        mBtnCustom = findViewById(R.id.btn_custom);
        mBtnPop = findViewById(R.id.btn_pop);
        setListeners();
    }
    public void setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnRecyclerView.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnCustom.setOnClickListener(onClick);
        mBtnPop.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    //跳转到TextView界面
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_button:
                    //跳转到Button界面
                    intent = new Intent(UIActivity.this,ButtonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_edittext:
                    //跳转到EditText界面
                    intent = new Intent(UIActivity.this,EditTextActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到RadioButton界面
                    intent = new Intent(UIActivity.this,RadioButtonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_checkbox:
                    //跳转到CheckBox界面
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_imageview:
                    //跳转到ImageView界面
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_listview:
                    //跳转到ListView界面
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_gridview:
                    //跳转到GridView界面
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_recyclerview:
                    //跳转到RecyclerView界面
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_webview:
                    //跳转到WebView界面
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_toast:
                    //跳转到Toast界面
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_dialog:
                    //跳转到Dialog界面
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_progress:
                    //跳转到Progress界面
                    intent = new Intent(UIActivity.this, ProgressActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_custom:
                    //跳转到Custom界面
                    intent = new Intent(UIActivity.this,CustomDialogActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_pop:
                    //跳转到PopupWindow界面
                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }
}
