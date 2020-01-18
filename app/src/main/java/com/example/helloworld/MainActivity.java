package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int [] setOfNumbers = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9, 10};
        int length = setOfNumbers.length;
        int getElement = setOfNumbers[setOfNumbers.length - 1];
        for(int i=0; i<length; i++) Log.i("myTAG", setOfNumbers[i] + "");
        Log.i("myTAG", setOfNumbers+"");

        //Since no data type is specified... myFavouriteAnimals array list can be initialized with any data type
        ArrayList myFavouriteAnimals = new ArrayList();
        myFavouriteAnimals.add("Goat");
        myFavouriteAnimals.add("Lion");
        myFavouriteAnimals.add("Dog");

        for (int i = 0; i < myFavouriteAnimals.size(); i++) Log.i("myTAG", myFavouriteAnimals.get(i) + "");

        myFavouriteAnimals.add("Bird");
        myFavouriteAnimals.remove("Lion");
        myFavouriteAnimals.add(1);
        myFavouriteAnimals.add(13);
        myFavouriteAnimals.add(11);
        myFavouriteAnimals.add(100);
        myFavouriteAnimals.add(10.84);
        myFavouriteAnimals.add(1.4500);
        myFavouriteAnimals.add(100.90);
        myFavouriteAnimals.add('A');
        myFavouriteAnimals.add('y');

        for (int i = 0; i < myFavouriteAnimals.size(); i++) Log.i("myTAG", myFavouriteAnimals.get(i) + "");

        Log.i("myTAG", myFavouriteAnimals.toString());

        //Here with specified a String data type for the array list..Therefore, it will accept only String value
        ArrayList<String> myFavouriteFood = new ArrayList<>();
        myFavouriteFood.add("Rice");
        myFavouriteFood.add("Beans");
        Log.i("myTAG", myFavouriteFood.toString());

        //Hashmap works like associative array in php.. i.e it specifies keys and their corresponding values
        HashMap myStuffs = new HashMap();
        myStuffs.put(4, "This is a Bro Code");
        myStuffs.put("phone", "My phone name is infinix Zero 5");
        myStuffs.put("pc", "HP Omen BTO 15");
        Log.i("myTAG", myStuffs.toString());
        Log.i("myTAG", myStuffs.get(4)+"");
        Log.i("myTAG", myStuffs.get("phone")+"");

        //To specify the size of an array
        String[] sportNames = new String[5];
        sportNames[0] = "Boxing";
        sportNames[1] = "Soccer";
        sportNames[2] = "Judo";
        sportNames[3] = "Swimming";
        sportNames[4] = "Javelin";

        //Enhanced for loop
        String linearPrint = "";
        //Linear Print
        for (String arrayOutput : sportNames) linearPrint += arrayOutput+", ";  Log.i("myTAG", "Array Output: "+linearPrint);
        //Line Print
        for (String arrayOutput : sportNames) Log.i("myTAG", "Array Output: "+arrayOutput);

        for (int i=0; i<sportNames.length; i++) Log.i("myTAG", sportNames[i]+"");  //Ascending Order
        for (int i=sportNames.length-1; i>=0; i--) Log.i("myTAG", sportNames[i]+"");  //Descending Order

        String text = "Hello World"; //task: to reverse the string print
        String res = "";
        char [] charArr = text.toCharArray();
        for (int i = charArr.length-1; i >= 0; i--) res += charArr[i]; Log.i("myTAG", res);

    }

    public void btnAction(View view){
        TextView tvTitle = findViewById(R.id.tvTitle);
        EditText etInput = findViewById(R.id.etInput);
        ImageView ivSample = findViewById(R.id.ivSample);

        ivSample.setImageResource(R.drawable.winter);

        TextView tvResult = findViewById(R.id.tvResult);
        int tempInt = Integer.parseInt(etInput.getText().toString());
//        int currentYear = Calendar.getInstance().get(Calendar.YEAR);  //gets the current year
//        int age = currentYear - tempInt;
//        tvResult.setText(age + "");
        //System.out.println(age);

        String res="";

        for (int i=1; i<=10; i++){
            res += i + "x" + tempInt + "=" + i*tempInt + "\n";
        }
        tvResult.setText(res);


        Toast.makeText(MainActivity.this, "Title Update: "+ tvTitle.getText().toString() + "\n"
                        + "Input text: " + etInput.getText().toString(), Toast.LENGTH_SHORT).show();


    }
}
