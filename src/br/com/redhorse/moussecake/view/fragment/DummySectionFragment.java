/**
 * 
 */
package br.com.redhorse.moussecake.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author andreluizvannucci
 *
 * A dummy fragment representing a section of the app, but that simply
 * displays dummy text.
 */
public class DummySectionFragment extends Fragment {
	
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";
	private MenuFragment menuFragment;
	private View menuView;
	private PedidosFragment pedidosFragment;
	private View pedidosView;
	
	public DummySectionFragment() {
		menuFragment = new MenuFragment();
		pedidosFragment = new PedidosFragment();
		
		menuView = null;
		pedidosView = null;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = null;
		int selectedTab = getArguments().getInt(ARG_SECTION_NUMBER);
		if(selectedTab == 1)
		{
			if(menuView == null)
				menuView = menuFragment.onCreateView(inflater, container, savedInstanceState);
			rootView = menuView;
		}
		else if(selectedTab == 2)
		{
			if(pedidosView == null)
				pedidosView = pedidosFragment.onCreateView(inflater, container, savedInstanceState);
			rootView = menuView;
		}
		else if(selectedTab == 3){
			if(menuView == null)
				menuView = menuFragment.onCreateView(inflater, container, savedInstanceState);
			rootView = menuView;
		}
		return rootView;
	}
}