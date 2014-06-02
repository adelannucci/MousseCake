/**
 * 
 */
package br.com.redhorse.moussecake.view.fragment;

import java.util.List;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import br.com.redhorse.moussecake.R;
import br.com.redhorse.moussecake.entities.Pedido;
import br.com.redhorse.moussecake.view.adapter.AdapterPedidos;

/**
 * @author andreluizvannucci
 *
 */
public class PedidosFragment extends Fragment{
	
	private ListView mListPedidos;
	private List<Pedido> pedidos;
	private TextView valor;
	private View view;
	private double subTotal;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_pedidos,container, false);
		mListPedidos = (ListView) view.findViewById(R.id.listPedidos);
		mListPedidos.setAdapter(new AdapterPedidos(view.getContext(), pedidos));
		subTotal = 0;
		valor = (TextView) view.findViewById(R.id.textViewSubTotalValor);
		valor.setText(String.format("R$ %.2f", subTotal));
		
		
		return view;
	}

	/**
	 * @return the pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * @param pedidos the pedidos to set
	 */
	public void refresh(List<Pedido> pedidos) {
		
		this.pedidos = pedidos;
		
		if(mListPedidos != null && view != null)
		{
			mListPedidos = (ListView) view.findViewById(R.id.listPedidos);
			mListPedidos.setAdapter(new AdapterPedidos(view.getContext(), pedidos));
			
			subTotal = 0;
			
			for(Pedido p : pedidos)
			{
				subTotal += p.getItem().getPreco();
			}
			
			valor.setText(String.format("R$ %.2f", subTotal));
			view.refreshDrawableState();
		}
	}
	
	

}
