package com.societegenerale.hackaton.mycareer.ui.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.societegenerale.hackaton.mycareer.R;

public class CustomGridViewAdapter extends BaseAdapter {
	private List<Item> items = new ArrayList<Item>();
	private LayoutInflater inflater;

	public CustomGridViewAdapter(Context context) {
		inflater = LayoutInflater.from(context);

		items.add(new Item("Mon Cursus",      R.drawable.cv));
		items.add(new Item("Mes Comp�tences",      R.drawable.skills));
		items.add(new Item("Mon Emploi",     R.drawable.job));
		items.add(new Item("Mon Parcours",      R.drawable.rooute));
		items.add(new Item("Mon d�veloppement", R.drawable.dev));
		items.add(new Item("Mon March�",   R.drawable.market));
		items.add(new Item("Ma Mobilit�",       R.drawable.mobility));		
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int i) {
		return items.get(i);
	}

	@Override
	public long getItemId(int i) {
		return items.get(i).drawableId;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		View v = view;
		ImageView picture;
		TextView name;

		if(v == null) {
			v = inflater.inflate(R.layout.row_grid, viewGroup, false);
			v.setTag(R.id.picture, v.findViewById(R.id.picture));
			v.setTag(R.id.text, v.findViewById(R.id.text));
		}

		picture = (ImageView)v.getTag(R.id.picture);
		name = (TextView)v.getTag(R.id.text);

		Item item = (Item)getItem(i);

		picture.setImageResource(item.drawableId);
		name.setText(item.name);
		//name.setBackgroundColor(Color.argb(0, 255, 0, 0));

		return v;
	}

	private class Item {
		final String name;
		final int drawableId;

		Item(String name, int drawableId) {
			this.name = name;
			this.drawableId = drawableId;
		}
	}
}