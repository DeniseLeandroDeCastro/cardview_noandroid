package br.edu.ifrn.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifrn.cardview.R;
import br.edu.ifrn.cardview.adapter.PostagemAdapter;
import br.edu.ifrn.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }
    //Configurar postagens
    public void prepararPostagens() {

        Postagem p = new Postagem("Parque Aristófanes Fernandes", "Parnamirim / RN", R.drawable.parque);
        this.postagens.add(p);

        p = new Postagem("Praia de Ponta Negra", "Natal / RN", R.drawable.praia);
        this.postagens.add(p);

        p = new Postagem("Ponte Newton Navarro", "Natal / RN", R.drawable.ponte);
        this.postagens.add(p);

        p = new Postagem("Cajueiro de Pirangi", "O maior cajueiro do mundo é aqui no RN!", R.drawable.cajueiro);
        this.postagens.add(p);
    }
}