package com.example.trabalho09;

import android.widget.CompoundButton;
import android.widget.Switch;

public class achocolatado {

    achocolatado =(Switch) findViewById(R.id.opcaoExpresso);
        achocolatado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton Object buttonView;
        buttonView, boolean isChecked) {
            if (isChecked) {
                // opção selecionada
            } else {
                // opção não selecionada
            }
        }
    }
}
