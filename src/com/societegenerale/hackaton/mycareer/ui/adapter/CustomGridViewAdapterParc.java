package com.societegenerale.hackaton.mycareer.ui.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.societegenerale.hackaton.mycareer.R;

	public class CustomGridViewAdapterParc extends BaseAdapter {
		private List<Item> items = new ArrayList<Item>();
		private LayoutInflater inflater;

		public CustomGridViewAdapterParc(Context context) {
			inflater = LayoutInflater.from(context);

			items.add(new Item("", R.drawable.constrat));
			items.add(new Item("", R.drawable.blanc));
			items.add(new Item("", R.drawable.moa));
			items.add(new Item("", R.drawable.blanc));
			items.add(new Item("", R.drawable.expert));
			items.add(new Item("", R.drawable.blanc));
			items.add(new Item("", R.drawable.evo));
			items.add(new Item("", R.drawable.blanc));
			items.add(new Item("", R.drawable.archibis));
			
			
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
			v.setLayoutParams(new GridView.LayoutParams(240,240));
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