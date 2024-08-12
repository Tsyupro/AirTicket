package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView ticketListView;
    private TicketAdapter ticketAdapter;
    private List<Ticket> ticketList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ticketListView = findViewById(R.id.ticketListView);

        // Створюємо список білетів
        ticketList = new ArrayList<>();
        ticketList.add(new Ticket("New York", "12:00 PM", 299.99));
        ticketList.add(new Ticket("London", "03:30 PM", 499.99));
        ticketList.add(new Ticket("Paris", "08:45 AM", 399.99));

        ticketAdapter = new TicketAdapter(this, ticketList);
        ticketListView.setAdapter(ticketAdapter);

        // Обробка події при виборі білета
        ticketListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ticket selectedTicket = (Ticket) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Ви вибрали білет до " + selectedTicket.getDestination(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
