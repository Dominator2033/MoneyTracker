 package com.xmillerx.moneytracker;

 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.text.Editable;
 import android.text.TextUtils;
 import android.text.TextWatcher;
 import android.widget.Button;
 import android.widget.EditText;

 public class AddItemActivity extends AppCompatActivity {
     private static final String TAG = "AddItemActivity";

     private EditText name;
     private EditText price;
     private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);

        name = findViewById(R.id.name);
        price = findViewById(R.id.price);
        addBtn = findViewById(R.id.add_btn);

       // setTitle(R.string.add_item_title);

        if(name.getEditableText().toString().isEmpty() && price.getEditableText().toString().isEmpty()){
            TextWatcher tw = new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    addBtn.setEnabled(!TextUtils.isEmpty(editable));
                    //price.setText("P");
                    //price.addTextChangedListener();
                }
            };
            name.addTextChangedListener(tw);
            price.addTextChangedListener(tw);

        }



    }
}
