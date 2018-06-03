package self.android.com.databindingsample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import self.android.com.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;
    MyClickHandlers handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.setName("Shashank Mohan");
        user.setEmail("shashank@gmail.com");

        binding.setUser(user);

        handlers = new MyClickHandlers(this);
        binding.content.setHandlers(handlers);
    }


    public class MyClickHandlers {

        Context context;

        public MyClickHandlers(Context context) {
            this.context = context;
        }

        public void onFabClicked(View view) {
            Toast.makeText(context, "Fab Clicked", Toast.LENGTH_SHORT).show();
        }

        public void onButtonClickedWithParams(View view, User user) {
            Toast.makeText(context, "Clicked " + user.getName(), Toast.LENGTH_SHORT).show();
        }
    }
}
