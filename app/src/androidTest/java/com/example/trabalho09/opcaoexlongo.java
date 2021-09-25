package com.example.trabalho09;

import android.widget.CompoundButton;
import android.widget.Switch;

public class opcaoexlongo {

    opcaoexlongo = (Switch) findViewById(R.id.opcaoExpresso);
        opcaoexlongo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton Object buttonView;
        buttonView, boolean isChecked) {
            if (isChecked) {
                // opção selecionada
            } else {
                // opção não selecionada
            }
        }
    });
}
