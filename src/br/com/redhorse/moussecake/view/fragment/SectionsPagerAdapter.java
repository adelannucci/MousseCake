/**
 * 
 */
package br.com.redhorse.moussecake.view.fragment;

import java.util.Locale;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import br.com.redhorse.moussecake.R;

/**
 * @author andreluizvannucci
 *
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
	private Context context;
	private Fragment fragment;
	
	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		this.context = context;
		this.fragment = new DummySectionFragment();
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a DummySectionFragment (defined as a static inner class
		// below) with the page number as its lone argument.
		//Fragment fragment = new DummySectionFragment();
		
		Bundle args = new Bundle();
		args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return context.getString(R.string.action_menu).toUpperCase(l);
		case 1:
			return context.getString(R.string.action_pedidos).toUpperCase(l);
		case 2:
			return context.getString(R.string.action_conta).toUpperCase(l);
		}
		return null;
	}
}