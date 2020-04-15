package com.codeout.lrnprogpro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class articles extends AppCompatActivity {
    private static final String TAG = "Firelog";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recyclerView;
    private List<PDFModel> list;
    private PDFAdapter pdfAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        list = new ArrayList<>();
        pdfAdapter = new PDFAdapter(list, new PDFAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent =new Intent();
                intent.setData(Uri.parse(list.get(position).getURL()));
                startActivity(intent);
            }

        });
        recyclerView = (RecyclerView) findViewById(R.id.mylist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(pdfAdapter);
        db.collection("proarticle").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if (e != null) {
                    Log.d(TAG, "Error:" + e.getMessage());
                } else {
                    for (DocumentChange doc : queryDocumentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            PDFModel pdfModel = doc.getDocument().toObject(PDFModel.class);
                            list.add(pdfModel);
                            pdfAdapter.notifyDataSetChanged();
                        } else if (doc.getType() == DocumentChange.Type.MODIFIED) {
                            String docID = doc.getDocument().getId();
                            PDFModel changedModel = doc.getDocument().toObject(PDFModel.class);
                            if (doc.getOldIndex() == doc.getNewIndex()) {
                                // Item changed but remained in same position
                                list.set(doc.getOldIndex(), changedModel);
                                pdfAdapter.notifyItemChanged(doc.getOldIndex());
                            } else {
                                // Item changed and changed position
                                list.remove(doc.getOldIndex());
                                list.add(doc.getNewIndex(), changedModel);
                                pdfAdapter.notifyItemMoved(doc.getOldIndex(), doc.getNewIndex());
                            }

                            pdfAdapter.notifyDataSetChanged();
                        } else if (doc.getType() == DocumentChange.Type.REMOVED) {

                            // remove
                            list.remove(doc.getOldIndex());
                            pdfAdapter.notifyItemRemoved(doc.getOldIndex());
                        }
                    }
                }
            }
        });

    }

}
