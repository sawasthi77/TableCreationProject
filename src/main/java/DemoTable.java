import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;

import java.util.List;

public class DemoTable {
    public static void main(String args[]){
        List<String> rowValues = Lists.newArrayList("Mumbai");
        List<String> columnValues = Lists.newArrayList("Chemical", "IT", "electrical");
        Table<String, String, Integer> courseTable = ArrayTable.create(rowValues, columnValues);
        Table<String, String, Object> courseTable1 = HashBasedTable.create();
        courseTable1.put("mom", "dad", 5);
        courseTable1.put("uncle", "aunt", 10);
        System.out.println(courseTable1);
        System.out.println(courseTable);
    }
}
