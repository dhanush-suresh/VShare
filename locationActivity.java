package a.b.vshare;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.widget.Toast;



public class locationActivity extends AppCompatActivity {

    Spinner pick;
    Spinner drop;
    Button pool;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
//create a list of items for the spinner.
        String[] items = new String[]{"Bennett University", "Pari Chowk", "Botanical Garden","Delhi Airport"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);

        //get the spinner from the xml.
        Spinner drop= findViewById(R.id.spinner2);
//create a list of items for the spinner.
        String[] item= new String[]{"Bennett University", "Pari Chowk", "Botanical Garden","Delhi Airport"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapt= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, item);
//set the spinners adapter to the previously created one.
        drop.setAdapter(adapt);


    }
    public void showmsg(View view){

        Toast.makeText(this, "Sending data from app....", Toast.LENGTH_LONG).show();




    }
}
