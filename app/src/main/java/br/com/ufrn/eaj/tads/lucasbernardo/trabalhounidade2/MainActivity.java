package br.com.ufrn.eaj.tads.lucasbernardo.trabalhounidade2;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TableLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Bairro> bairros;
    RecyclerView recyclerView;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        PagerAdapter pagerAdapter = new TabsPageAdapter(getSupportFragmentManager());
        //Obtém o conteúdo do viewPager através do adapter
        viewPager.setAdapter(pagerAdapter);
        //seta o núero máximo de páginas
        viewPager.setOffscreenPageLimit(3);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

        /**
         * Seta os icones dos tabs.
         * O FragmentBairro fica setado como online e os demais setados com icones de alerta, como forma de
         * indicar para o usuário que nada foi selecionado.
         */
        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_online);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.stat_notify_error);
        tabLayout.getTabAt(2).setIcon(android.R.drawable.stat_notify_error);

        viewPager.addOnPageChangeListener(mudarIcone);

    }

    public TabLayout retornaTabLayout(){
        return tabLayout;
    }

    private ViewPager.OnPageChangeListener mudarIcone = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        /**
         * Quando o tab do fragmentBairro estiver selecionado seu icone será setado como online
         * caso contrário seta como offline
         */

        @Override
        public void onPageSelected(int position) {
            switch (position){
                case 0:
                    tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_online);
                    break;
                case 1:
                    tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                    break;
                case 2:
                    tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                    break;
                default:
                    return;
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    /**
     * Método para recuperar o fragment pela tag e retornar ao método que o chamou.
     *
     * viewPagerId: refere-se ao viewPager do mainactivity
     * index: refere-se ao índice do fragment que deseja-se recuperar
     *
     * Dica de Elidiel Dantas.
     * Fonte: http://pt.androids.help/q6324
     */

    private static String getFragmentTag(int viewPagerId, int index) {
        return "android:switcher:" + viewPagerId + ":" + index;
    }

    /**
     * Quando um bairro for selecionado no fragmentBairro, o bairro selecionado será passado para
     * esse método e os demais fragments terão seu conteúdo alterado com as informações do bairro
     * passado no parâmetro.
     * @param b o bairro contendo as informações a serem setadas nos fragment fragmentinfo e fragmentimg.
     */
    public void updateFragments(Bairro b){
        //FragmentManager: Classe que gerencia os fragments pela API
        FragmentManager fm = getSupportFragmentManager();
        //recupera o fragmentImg pela tag
        Fragment f1 = fm.findFragmentByTag(getFragmentTag(viewPager.getId(), 1));
        //seta o nome e a imagem do bairro selecionado no fragmentImg
        ((FragmentImg)f1).setImagemAndNome(b.getNome(), b.getFoto());
        //atualiza o conteúdo do FragmentInfo
        Fragment f2 = fm.findFragmentByTag(getFragmentTag(viewPager.getId(), 2));
        ((FragmentInfo)f2).setImagemAndDescricao(b.getDescricao());

    }
}
