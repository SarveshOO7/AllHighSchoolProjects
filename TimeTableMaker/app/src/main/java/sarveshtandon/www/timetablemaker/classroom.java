package sarveshtandon.www.timetablemaker;

import java.util.ArrayList;

public class classroom {

    String subjects[][]= new String[5][10], name;
    String timeTable[][] =new String[5][10];
    public int row =0,col =0, periods;

    public String[][] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[][] subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[][] getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(String[][] timeTable) {
        this.timeTable = timeTable;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getPeriods() {
        return periods;
    }

    public void setPeriods(int periods) {
        this.periods = periods;
    }

    classroom(){
        this.row=0;
        this.col=0;
        name="";

    }
}
