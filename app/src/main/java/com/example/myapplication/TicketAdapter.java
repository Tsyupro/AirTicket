package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TicketAdapter extends BaseAdapter {
    private Context context;
    private List<Ticket> tickets;

    public TicketAdapter(Context context, List<Ticket> tickets) {
        this.context = context;
        this.tickets = tickets;
    }

    @Override
    public int getCount() {
        return tickets.size();
    }

    @Override
    public Object getItem(int position) {
        return tickets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.ticket_item, parent, false);
        }

        Ticket ticket = tickets.get(position);

        TextView destinationTextView = convertView.findViewById(R.id.destinationTextView);
        TextView departureTimeTextView = convertView.findViewById(R.id.departureTimeTextView);
        TextView priceTextView = convertView.findViewById(R.id.priceTextView);

        destinationTextView.setText(ticket.getDestination());
        departureTimeTextView.setText(ticket.getDepartureTime());
        priceTextView.setText(String.valueOf(ticket.getPrice()));

        return convertView;
    }
}
