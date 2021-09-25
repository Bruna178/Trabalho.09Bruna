public class opcaoExpresso {

    opcaoExpresso = (Switch) findViewById(R.id.opcaoExpresso);
        opcaoExpresso.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                // opção selecionada
            } else {
                // opção não selecionada
            }
        }


    });
}
