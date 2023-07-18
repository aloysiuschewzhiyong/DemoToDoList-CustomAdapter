package sg.edu.rp.c346.id22001095.demotodolistcustomadapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.Calendar;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list;
        ArrayList<ToDoItem> alToDo;
        CustomAdapter ca;

        list= findViewById(R.id.lv);
        alToDo = new ArrayList<>();

        Calendar taskDate1 = Calendar.getInstance();
        taskDate1.set(2020, 7, 1);

        Calendar taskDate2 = Calendar.getInstance();
        taskDate2.set(2020, 7, 2);


        alToDo.add(new ToDoItem("Go for movie",taskDate1));
        alToDo.add(new ToDoItem("Go for haircut",taskDate2));



        ca = new CustomAdapter(this, R.layout.row, alToDo);

        list.setAdapter(ca);
    }
}