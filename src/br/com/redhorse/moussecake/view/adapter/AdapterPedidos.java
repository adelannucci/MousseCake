/**
 * 
 */
package br.com.redhorse.moussecake.view.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.redhorse.moussecake.R;
import br.com.redhorse.moussecake.entities.Item;
import br.com.redhorse.moussecake.entities.Pedido;

/**
 * @author andreluizvannucci
 *
 */
public class AdapterPedidos extends BaseAdapter {

	private LayoutInflater mInflater;
	private List<Pedido> mItens;

	/**
	 * @param mInflater
	 * @param mItens
	 */
	public AdapterPedidos(Context context, List<Pedido> mItens) {
		super();
		this.mInflater = LayoutInflater.from(context);
		this.mItens = mItens;
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mItens.size();
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public Object getItem(int position) {
		return mItens.get(position);
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int position) {
		return position;
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		AuxPedido itemHolder;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.item_pedido, null);
			itemHolder = new AuxPedido(convertView);

			//define os itens na view;
			convertView.setTag(itemHolder);
		} else {
			itemHolder = (AuxPedido) convertView.getTag();
		}
		
		Pedido item = mItens.get(position);
		itemHolder.item.setText(item.getItem().getNome());
		itemHolder.preco.setText("$ "+item.getItem().getPreco());

		Drawable d;
		Resources res;
		res = convertView.getResources();

		if(item.isStatus())
		{
			d = res.getDrawable(R.drawable.ic_action_accept);	
		}
		else
		{
			d = res.getDrawable(R.drawable.ic_action_time);
		}

		itemHolder.icon.setImageDrawable(d);
		
		//retorna a view com as informa????es
		return convertView;
	}

	private class AuxPedido
	{
		public TextView item;
		public TextView preco;
		public ImageView icon;

		public AuxPedido(View view)
		{
			icon = (ImageView) view.findViewById(R.id.imgStatus);
			item = (TextView) view.findViewById(R.id.textViewItem);
			preco = (TextView) view.findViewById(R.id.textViewItemValor);
		}
	}
	
	public static List<Pedido> teste()
	{
		List<Pedido> list = new ArrayList<Pedido>();
		list.add(new Pedido(new Item("Fanta Uva", "Refri", 2), false));
		list.add(new Pedido(new Item("Itubaina", "Refri", 1.5), false));
		list.add(new Pedido(new Item("Água", "Bebida Natural da fonte da sanasa", 0.5), true));
		
		return list;
	}

}
