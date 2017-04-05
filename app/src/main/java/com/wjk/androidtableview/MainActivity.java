package com.wjk.androidtableview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;

import com.wjk.tableview.TableView;
import com.wjk.tableview.common.TableCellData;
import com.wjk.tableview.common.TableHeaderColumnModel;
import com.wjk.tableview.toolkits.SimpleTableDataAdapter;
import com.wjk.tableview.toolkits.SimpleTableHeaderAdapter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TableView tableView;
    private Map<Integer, Pair<String,Integer>> columns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableView = (TableView)findViewById(R.id.tableview);

        initData();

        SimpleTableDataAdapter dataAdapter = new SimpleTableDataAdapter(this,getTableData(), 6);
        dataAdapter.setTextSize(18);

        TableHeaderColumnModel columnModel = new TableHeaderColumnModel(columns);
        SimpleTableHeaderAdapter headerAdapter = new SimpleTableHeaderAdapter(this,columnModel);
        headerAdapter.setTextSize(20);

        tableView.setTableAdapter(headerAdapter,dataAdapter);

        tableView.setHeaderElevation(20);
    }

    private void initData(){
        columns = new LinkedHashMap<>();
        columns.put(0,new Pair<>("今年的收成不错",2));
        columns.put(1,new Pair<>("明年的收成肯定会更好",2));
        columns.put(2,new Pair<>("为人民服务",2));
    }

    private List<TableCellData> getTableData() {
        List<TableCellData> cellDatas = new ArrayList<>();
        cellDatas.add(new TableCellData("1", 0, 0, 2, 2));
        cellDatas.add(new TableCellData("2", 0, 2, 1, 2));
        cellDatas.add(new TableCellData("21", 0, 4, 1, 2));

        cellDatas.add(new TableCellData("33", 1, 2));
        cellDatas.add(new TableCellData("4", 1, 3));
        /*cellDatas.add(new TableCellData("5", 1, 4));
        cellDatas.add(new TableCellData("6", 1, 5));*/

        cellDatas.add(new TableCellData("7", 2, 0));
        cellDatas.add(new TableCellData("8", 2, 1));
        cellDatas.add(new TableCellData("9", 2, 2));
        cellDatas.add(new TableCellData("10", 2, 3));
        /*cellDatas.add(new TableCellData("11", 2, 4, 1, 2));*/
        cellDatas.add(new TableCellData("11", 1, 4, 2, 2));

        cellDatas.add(new TableCellData("12", 3, 0));
        cellDatas.add(new TableCellData("13", 3, 1));
        cellDatas.add(new TableCellData("14", 3, 2, 1, 2));
        cellDatas.add(new TableCellData("15", 3, 4));
        cellDatas.add(new TableCellData("16", 3, 5));

        for (int i = 4; i < 20; ++i) {
            cellDatas.add(new TableCellData(String.valueOf(i * 5 - 3), i, 0));
            cellDatas.add(new TableCellData(String.valueOf(i * 5 - 2), i, 1));
            cellDatas.add(new TableCellData(String.valueOf(i * 5 - 1), i, 2, 1, 2));
            cellDatas.add(new TableCellData(String.valueOf(i * 5 + 0), i, 4));
            cellDatas.add(new TableCellData(String.valueOf(i * 5 + 1), i, 5));
        }

        return cellDatas;
    }

}
