package br.com.ufrn.eaj.tads.lucasbernardo.trabalhounidade2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lber on 27/10/2016.
 * ViewHolder é uma classe conjunto de Views que foram uma parte da tela.
 * responsável por setar objeto a uma view.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    TextView bairro;
    TextView info;
    ImageView img;

    public ViewHolder(View v) {
        super(v);

        bairro = (TextView) v.findViewById(R.id.bairro);
        info = (TextView) v.findViewById(R.id.infobairroescolhido);
        img = (ImageView) v.findViewById(R.id.fotobairro);
    }
}
