package com.example.a533.cours13reccyleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ToDoRecyclerAdapter extends RecyclerView.Adapter<ToDoRecyclerAdapter.MyViewHolder> {
    List<Todo> todoList;

    public ToDoRecyclerAdapter(List<Todo> todoList){
        this.todoList = todoList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titre;
        TextView description;
        TextView date;
        public MyViewHolder(View itemView){
            super(itemView);
            titre = itemView.findViewById(R.id.textView_Title);
            description = itemView.findViewById(R.id.textView2);
            date = itemView.findViewById(R.id.textView_date);
        }
    }

    @NonNull
    @Override
    public ToDoRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_card,parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoRecyclerAdapter.MyViewHolder holder, int position) {
        Todo todoToDisplay = todoList.get(position);
        holder.titre.setText(todoToDisplay.getTitle());
        holder.description.setText(todoToDisplay.getDescription());
        holder.date.setText(todoToDisplay.getDateAdded().toString());
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }
}