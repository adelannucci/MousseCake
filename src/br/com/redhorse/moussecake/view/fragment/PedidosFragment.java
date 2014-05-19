/**
 * 
 */
package br.com.redhorse.moussecake.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import br.com.redhorse.moussecake.R;
import br.com.redhorse.moussecake.view.adapter.AdapterPedidos;

/**
 * @author andreluizvannucci
 *
 */
public class PedidosFragment extends Fragment{
	
	private ListView mListPedidos;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_pedidos,container, false);
		mListPedidos = (ListView) view.findViewById(R.id.listPedidos);
		mListPedidos.setAdapter(new AdapterPedidos(view.getContext(), AdapterPedidos.teste()));
		return view;
	}
}
