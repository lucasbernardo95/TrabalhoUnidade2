package br.com.ufrn.eaj.tads.lucasbernardo.trabalhounidade2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lber on 27/10/2016.
 * Fragment que contém o nome e a imagem do bairro selecionado
 */

public class FragmentImg extends Fragment {
    ImageView img;
    TextView bairro;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //recebe o layout inflater do parâmetro e indica que o fragmentimg será inflado
        View v = inflater.inflate(R.layout.fragmentimg, container, false);
        img = (ImageView) v.findViewById(R.id.imgbairroescolhido);
        bairro = (TextView) v.findViewById(R.id.bairroescolhido);
        return v;
    }

    /**
     * Método para setar o nome e imagem deacordo com o bairro ue for selecionado
     * @param bairro nome do bairro que foi selecionado o fragment1 que contém a lista dos bairros
     * @param img imagem referente ao bairro selecionado
     */
    public void setImagemAndNome(String bairro, Integer img){
        this.img.setImageResource(img);
        this.bairro.setText(bairro);
    }
}
