package br.com.redhorse.moussecake.view.fragment;

import java.util.List;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import br.com.redhorse.moussecake.R;
import br.com.redhorse.moussecake.entities.Pedido;

public class ContaFragment extends Fragment{
	
	private List<Pedido> pedidos;
	private View view;
	private CheckBox gorjeta;
	private EditText pessoas;
	private TextView valorTotal;
	private TextView valorPorPessoa;
	private Button fecharConta;
	
	private int qtdPessoas;
	private double total;
	private double totalPorPessoa;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_conta,container, false);
		pessoas = (EditText) view.findViewById(R.id.editTextDividirPor);
		gorjeta = (CheckBox) view.findViewById(R.id.checkBoxGarcom);
		valorTotal = (TextView) view.findViewById(R.id.textViewValorTotal);
		valorPorPessoa = (TextView) view.findViewById(R.id.textViewValorTotalDividido);
		fecharConta = (Button) view.findViewById(R.id.buttonFecharConta);
		fecharConta.setOnClickListener(fechar);	
		return view;
	}
	
	private OnClickListener fechar = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			refresh(pedidos);
		}
	};
	
	public void refresh(List<Pedido> pedidos)
	{
		this.pedidos = pedidos;
				
		if(view != null && this.pedidos != null && gorjeta != null && pessoas != null && valorTotal != null && valorPorPessoa != null)
		{
			total = 0;
			
			for(Pedido p : pedidos)
			{
				total += p.getItem().getPreco();
			}
			
			if(gorjeta.isChecked())
			{
				total *= 1.1;
			}
			
			try {
				qtdPessoas = Integer.parseInt(pessoas.getText().toString());
			} catch (Exception e) {
				pessoas.setText("1");
				qtdPessoas = 1;
			}
			
			totalPorPessoa = total/qtdPessoas;	
			valorTotal.setText(String.format("R$ %.2f", total));
			valorPorPessoa.setText(String.format("R$ %.2f", totalPorPessoa));
		}
	}

}
