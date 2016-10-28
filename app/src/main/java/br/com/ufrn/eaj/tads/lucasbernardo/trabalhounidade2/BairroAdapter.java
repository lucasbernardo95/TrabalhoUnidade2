package br.com.ufrn.eaj.tads.lucasbernardo.trabalhounidade2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by lber on 27/10/2016.
 * Classe responsável por adaptar o conteúdo da lista de bairros
 * à view
 */

public class BairroAdapter   extends RecyclerView.Adapter {

    private List<Bairro> bairros;
    private Context context;

    public BairroAdapter ( List<Bairro> bairros, Context context){
        this.context = context;
        this.bairros = bairros;
    }

    //Cria o ViewHolder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bairroadapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //onBindViewHolder: Recebe o ViewHolder para setar os atributos da view.
    // holder vai receber o nome do bairro posição que será passada
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).bairro.setText(bairros.get(position).getNome());//seta o nome do bairro que foi escolhido
    }

    // Número total de itens na lista
    @Override
    public int getItemCount() {
        return bairros.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
