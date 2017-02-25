package com.tincio.twitterproject.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tincio.twitterproject.R;
import com.tincio.twitterproject.bean.Contact;

import java.util.List;

/**
 * Created by GMD on 18/02/2017.
 */

public class ContactosAdapter extends RecyclerView.Adapter<ContactosAdapter.ContactViewHolder> {

    List<Contact> list;
    Context context;

    public ContactosAdapter(List<Contact> list){
        this.list = list;
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_row, parent, false);
        context = parent.getContext();
        ContactViewHolder holder = new ContactViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
       // holder.txtNombre.setText(list.get(position).getNombre());
        //holder.imgEquipo.setImageDrawable(context.getDrawable(R.mipmap.imagen));
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        ImageView imgEquipo;
        CardView cardView;
        public ContactViewHolder(View itemView) {
            super(itemView);
            imgEquipo = (ImageView) itemView.findViewById(R.id.img_equipo);
            cardView = (CardView)itemView.findViewById(R.id.cardview_equipo);
            changeDesign(itemView);
        }
    }

    void changeDesign(final View view){
        Bitmap barcelona = BitmapFactory.decodeResource(context.getResources(),
                R.mipmap.imagen);
        Palette.from(barcelona).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {

                CardView cardView = (CardView)view.findViewById(R.id.cardview_equipo);
                cardView.setBackgroundColor(palette.getLightMutedColor(Color.BLUE));
            }
        });
    }
}
