package com.merp.perfi.sys.task.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.merp.perfi.sys.task.R;
import com.merp.perfi.sys.task.adapter.HistoryAdapter;
import com.merp.perfi.sys.task.model.ExpenseHistory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SpilitifyExpenseActivity extends AppCompatActivity {

    private final List<ExpenseHistory> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spilitify_expense);

        RecyclerView rcvHistory = findViewById(R.id.rcvHistory);
        list.add(new ExpenseHistory("Onions", "45", "Mike", "29-04-2023 08:43"));
        list.add(new ExpenseHistory("Eggs", "42", "John", "09-04-2023 18:43"));
        list.add(new ExpenseHistory("Sugar", "100", "Mike", "19-06-2023 08:43"));
        list.add(new ExpenseHistory("Oil", "220", "Mike", "21-07-2023 08:43"));
        list.add(new ExpenseHistory("Onions", "45", "John", "25-09-2023 08:43"));
        list.add(new ExpenseHistory("Breads", "50", "Mike", "29-09-2023 08:43"));

        rcvHistory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        HistoryAdapter adapter = new HistoryAdapter(list);
        rcvHistory.setAdapter(adapter);
    }

}