package joandev.com.pagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PagerAdapter extends FragmentPagerAdapter {


    private String tabTitles[] = new String[] { "Memory", "Ranking" };
    private Fragment tab = null;

    //creadora
    PagerAdapter(FragmentManager fm) {
        super(fm);
    }


    //crea las tabas, siempre tiene que retornar con el numero de tabs que queremos mostrar
    @Override
    public int getCount() {
        return tabTitles.length;
    }

    //Lanza el fragment asociado con el número de tab
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                tab = new Memory();
                break;
            case 1:
                tab = new Ranking();
                break;
        }
        return tab;
    }

    //pone el nombre en cada tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Genera le título en función de la posición
        return tabTitles[position];
    }
}
