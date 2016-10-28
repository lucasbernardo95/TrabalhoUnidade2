package br.com.ufrn.eaj.tads.lucasbernardo.trabalhounidade2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by lber on 27/10/2016.
 */

public class FragmentBairro extends Fragment {

    private List<Bairro> bairros;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bairros = Bairro.getBairros();//recebe a lista com os bairros
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentbairros, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recylerbairro);

        recyclerView.addOnItemTouchListener(
                new ItemClickListener(getActivity(), recyclerView, new ItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        //Passsa o bairro selecionado para atualizar o conteúdo do FragmentInfo e FragmentImg
                        ((MainActivity)getActivity()).updateFragments(bairros.get(position));
                        TabLayout tabLayout = ((MainActivity)getActivity()).retornaTabLayout();
                        Toast.makeText(getContext(), "O ponto " + bairros.get(position).getNome() + " foi selecionado!", Toast.LENGTH_SHORT).show();

                        /**
                         * Após o usuário selecionar um bairro os icones do FragmentImg e FragmentBairro
                         * irão mudar de stat_notify_error para stat_notify_sync indicando que há um
                         * novo conteúdo nos fragments
                         */
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.stat_notify_sync);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.stat_notify_sync);
                    }

                    @Override
                    public void onItemLongClick(View view, int position) {
                    }
                }));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        BairroAdapter bairroAdapter = new BairroAdapter(bairros, getActivity());
        recyclerView.setAdapter(bairroAdapter);

        return v;
    }
}


