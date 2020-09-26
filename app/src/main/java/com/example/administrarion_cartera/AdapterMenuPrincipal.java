package com.example.administrarion_cartera;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterMenuPrincipal extends BaseAdapter {

    private Context context;
    private ArrayList<MenuPrincipal.ItemMenu> arrayList;

    public AdapterMenuPrincipal(Context context, ArrayList<MenuPrincipal.ItemMenu> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public MenuPrincipal.ItemMenu getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_grid_menu_principal, null);
        }

        TextView titulo = (TextView) convertView.findViewById(R.id.itemTitulo);
        titulo.setText(arrayList.get(position).titulo);

        ImageView icono = convertView.findViewById(R.id.itemIcono);
        icono.setImageDrawable(arrayList.get(position).icono);

        return convertView;

    }
}
