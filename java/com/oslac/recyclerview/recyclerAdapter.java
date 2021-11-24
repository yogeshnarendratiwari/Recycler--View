package com.oslac.recyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.viewHolder>{
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> mobile_number = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();
    Context context;

    public recyclerAdapter(ArrayList<String> name, ArrayList<String> mobile_number, ArrayList<Integer> image, Context context) {
        this.name = name;
        this.mobile_number = mobile_number;
        this.image = image;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout,viewGroup,false);
        viewHolder viewHolder = new viewHolder(view);
         return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
       holder.photu.setImageResource(image.get(position));
       holder.Name.setText(name.get(position));
       holder.Number.setText(mobile_number.get(position));
    }

    @Override
    public int getItemCount() {

       return name.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder{

        CircleImageView photu;
        TextView Name;
         TextView Number;
         LinearLayout parent;

         public viewHolder(@NonNull View itemView) {
             super(itemView);
             Name = itemView.findViewById(R.id.Name);
             Number = itemView.findViewById(R.id.Mobile_Number);
             photu = itemView.findViewById(R.id.iamge);
             parent = itemView.findViewById(R.id.parent);
         }
     }
}
