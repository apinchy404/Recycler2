package com.example.recycler2;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    String contactList[];
    int imgList[];

    public Adapter(Context context,String contactList[], int imgList[])
    {
        this.context=context;
        this.contactList=contactList;
        this.imgList=imgList;
    }


    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder vh= new MyViewHolder(view);
        return  vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, final int position) {
        holder.contactName.setText(contactList[position]);
        holder.imgContact.setImageResource(imgList[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, contactList[position], Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactList.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgContact;
        TextView contactName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgContact=itemView.findViewById(R.id.img_contact);
            contactName=itemView.findViewById(R.id.txt_contactname);
        }
    }
}
