package baac.kanitaka.baacrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //explicit
    private UserTABLE objUserTABLE;
    private FoodTABLE objFoodTABLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create and Connected DB
        createAndConnected();

        //Tester Add new value
        testerAdd();

    } //Main Method

    private void testerAdd() {

        objUserTABLE.addNewUser("testUser", "testPassword", "testNameทดสอบ");
        objFoodTABLE.addNewFood("Tumyamfish","testSource","260บาท");
    }



    private void createAndConnected() {
        objUserTABLE = new UserTABLE(this);
        objFoodTABLE = new FoodTABLE(this);
    }
} //Main Class
