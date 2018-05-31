package self.android.com.databindingsample;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import self.android.com.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();

        user.setName("Shashank Mohan");
        user.setEmail("shashankunnithan03@gmail.com");
        activityMainBinding.setUser(user);*/

//This is my test code for databinding
    }
}
