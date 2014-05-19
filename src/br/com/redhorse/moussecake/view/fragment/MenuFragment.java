/**
 * 
 */
package br.com.redhorse.moussecake.view.fragment;

import java.io.IOException;
import java.io.InputStream;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import br.com.redhorse.moussecake.R;
import br.com.redhorse.moussecake.view.adapter.AdapterItem;

/**
 * @author andreluizvannucci
 *
 */
public class MenuFragment extends Fragment{
	
	private ListView mListMenu;
	private ImageView img;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_menu,container, false);
		
		mListMenu = (ListView) view.findViewById(R.id.listMenu);
		mListMenu.setAdapter(new AdapterItem(view.getContext(), AdapterItem.teste()));
		
		img = (ImageView)view.findViewById(R.id.imgPrato);

		try 
		{
		    // get input stream
		    InputStream ims = view.getContext().getAssets().open("cupcake.jpg");
		    // load image as Drawable
		    Drawable d = Drawable.createFromStream(ims, null);
		    // set image to ImageView
		    img.setImageDrawable(d);
		}
		catch(IOException ex) 
		{
			return view;
		}
		
		return view;
	}

}
