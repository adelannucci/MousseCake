package br.com.redhorse.moussecake.view.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import br.com.redhorse.moussecake.R;
import br.com.redhorse.moussecake.entities.Item;

public class AdapterItem extends BaseAdapter {

	private LayoutInflater mInflater;
	private List<Item> mItens;

	/**
	 * @param mInflater
	 * @param mItens
	 */
	public AdapterItem(Context context, List<Item> mItens) {
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
		AuxItem itemHolder;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.item_menu, null);
			itemHolder = new AuxItem(convertView);
			convertView.setTag(itemHolder);
		} else {
			itemHolder = (AuxItem) convertView.getTag();
		}
		Item item = mItens.get(position);
		itemHolder.nome.setText(item.getNome());
		itemHolder.preco.setText("$ " + item.getPreco());
		itemHolder.descricao.setText(item.getDescricao());

		//retorna a view com as informa????es
		return convertView;
	}

	private class AuxItem
	{
		public TextView nome;
		public TextView preco;
		public TextView descricao;


		public AuxItem(View view)
		{
			nome = (TextView) view.findViewById(R.id.textViewNomeItem);
			preco = (TextView) view.findViewById(R.id.textViewPrecoItem);
			descricao = (TextView) view.findViewById(R.id.textViewDescricaoItem);
		}
	}
	
	public static List<Item> teste()
	{
		List<Item> list = new ArrayList<Item>();
		list.add(new Item("Suco de Laranja", "Suco natural", 4.5));
		list.add(new Item("Suco de Morango", "Suco natural com água", 4.5));
		list.add(new Item("Suco de Abacaxi com Hortelâ", "Suco natural com água", 4.5));
		list.add(new Item("Coca Cola", "Refri", 4));
		list.add(new Item("Fanta Uva", "Refri", 2));
		list.add(new Item("Sprite", "Refri", 2));
		list.add(new Item("Itubaina", "Refri", 1.5));
		list.add(new Item("Água", "Bebida Natural da fonte da sanasa", 0.5));
		
		
		return list;
	}
}