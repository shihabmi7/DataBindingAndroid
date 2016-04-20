package com.shihab.databindingandroid.activity;

import android.databinding.DataBindingUtil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.shihab.databindingandroid.R;
import com.shihab.databindingandroid.databinding.ActivityMainBinding;
import com.shihab.databindingandroid.model.User;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
/*

// How to use better knife with Jake Warton :)

*/
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.textview_test)
    TextView textView;

    @BindString(R.string.app_name)
    String mes;

    @OnClick(R.id.button_clickMe) void Click(){

        Toast.makeText(getApplicationContext(),mes +" with better knife" ,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("First Name: Shihab", "Last Name: Uddin");
        binding.setUser(user);

        ButterKnife.bind(this);
        textView.setText("This is initialized by better Knife...");

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();

    }
}
