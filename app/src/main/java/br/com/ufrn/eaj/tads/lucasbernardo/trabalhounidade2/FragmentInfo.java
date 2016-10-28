package br.com.ufrn.eaj.tads.lucasbernardo.trabalhounidade2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lber on 27/10/2016.
 */

public class FragmentInfo extends Fragment {
    TextView info;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b) {
        View v = inflater.inflate(R.layout.fragmentinfo, container, false);
        info = (TextView) v.findViewById(R.id.descricaoinfo);
        return v;
    }

    public void setImagemAndDescricao(String info){
        this.info.setText(info);
    }
}
