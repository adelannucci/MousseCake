/**
 * 
 */
package br.com.redhorse.moussecake.view.fragment;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import android.app.Dialog;
import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import br.com.redhorse.moussecake.R;
import br.com.redhorse.moussecake.database.ItensDataBase;
import br.com.redhorse.moussecake.entities.Categorias;
import br.com.redhorse.moussecake.entities.Item;
import br.com.redhorse.moussecake.entities.Pedido;
import br.com.redhorse.moussecake.view.adapter.AdapterItem;

/**
 * @author andreluizvannucci
 *
 */
public class MenuFragment extends Fragment{

	private Spinner mCategorias;
	private ListView mListMenu;
	private ImageView img;
	private Item item;
	private List<Pedido> pedidos;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_menu,container, false);
		
		mListMenu = (ListView) view.findViewById(R.id.listMenu);
		mListMenu.setAdapter(new AdapterItem(view.getContext(), ItensDataBase.aves()));
		mListMenu.setOnItemClickListener(menuItens);

		mCategorias = (Spinner) view.findViewById(R.id.spiCategoria);
		mCategorias.setAdapter( new ArrayAdapter<Categorias>(view.getContext(), android.R.layout.simple_list_item_1, ItensDataBase.categorias()));
		mCategorias.setOnItemSelectedListener(categorias);


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

	AdapterView.OnItemSelectedListener categorias = new AdapterView.OnItemSelectedListener()
	{
		public void onItemSelected(AdapterView<?> arg0, View v, int position, long id)
		{
			if(v != null)
			{
				Categorias c = (Categorias) arg0.getAdapter().getItem(position);
				mListMenu.setAdapter(new AdapterItem(v.getContext(), c.getItens()));
				v.refreshDrawableState();
			}
		}

		public void onNothingSelected(AdapterView<?> arg0)
		{

		}
	};

	AdapterView.OnItemClickListener menuItens = new AdapterView.OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
			if(v != null)
			{
				item = (Item) arg0.getAdapter().getItem(position);
				item = new Item(item.getNome(), item.getDescricao(), item.getPreco());

				//final Dialog dialog = new Dialog(v.getContext(), R.style.MousseCakeThemeLight);
				final Dialog dialog = new Dialog(v.getContext());
				dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
				dialog.setCancelable(true);
				
				dialog.setContentView(R.layout.dialog_item_confirmar);
				//dialog.setTitle(item.getNome());
				
				TextView nome = (TextView) dialog.findViewById(R.id.textViewItemDialog);
				nome.setText(item.getNome());
				TextView preco = (TextView) dialog.findViewById(R.id.textViewPrecoDialog);
				preco.setText(String.format("R$ %.2f", item.getPreco()));

				Button btnCancelar = (Button) dialog.findViewById(R.id.buttonCancelar);
				btnCancelar.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						dialog.dismiss();
					}
				});
				Button btnConfirmar = (Button) dialog.findViewById(R.id.buttonConfirmar);
				btnConfirmar.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						pedidos.add(new Pedido(item, false));
						dialog.dismiss();	
					}
				});
				
				dialog.show();
			}
		}
	};

	/**
	 * @return the pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * @param pedidos the pedidos to set
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	

}
