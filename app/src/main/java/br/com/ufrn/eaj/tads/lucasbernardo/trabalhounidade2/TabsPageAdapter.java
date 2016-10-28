package br.com.ufrn.eaj.tads.lucasbernardo.trabalhounidade2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lber on 27/10/2016.
 */

public class TabsPageAdapter extends FragmentPagerAdapter {

    public TabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    //Instancea o fragment selecionado
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return  new FragmentBairro();
            case 1:
                return  new FragmentImg();
            case 2:
                return  new FragmentInfo();
        }
        return null;
    }

    //retorna o título do fragment selecionado
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Bairros";
            case 1:
                return "Imagem";
            case 2:
                return "Descrição";
        }
        return null;
    }

    //Retorna a quantidade de fragments que a aplicação irá ter
    @Override
    public int getCount() {
        return 3;
    }
}
