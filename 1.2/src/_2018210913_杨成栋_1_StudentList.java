public class _2018210913_杨成栋_1_StudentList {
    private _2018210913_杨成栋_1_Student[] list;
    private int total=0;
    public _2018210913_杨成栋_1_StudentList(int length){
        list=new _2018210913_杨成栋_1_Student[length];
    }
    public boolean add(_2018210913_杨成栋_1_Student stu){
        try{
            list[total]=stu;
            total++;
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
    public boolean remove(int no){
        if(no>total){
            System.out.println("No such student");
            return false;
        }
        for(int i=no-1;i<total;i++){
            if ((i+1)==total)
                list[i]=null;
            else
                list[i]=list[i+1];
        }
        total--;
        System.out.println("Remove successfully");
        showStudentList();
        return true;
    }
    public boolean remove(String number){
        boolean flag=false;
        int no=-1;
        for(int i=0;i<total;i++)
            if(list[i].getNumber()==number){
                flag=true;
                no=i+1;
            }
        if(flag)
            return remove(no);
        else{
            System.out.println("No such student");
            return false;
        }

    }
    public boolean isEmpty(){
        if(total>0)
            return false;
        else
            return true;
    }
    public _2018210913_杨成栋_1_Student getItem(int no){
        if(no>total)
            return null;
        return list[no-1];
    }
    public _2018210913_杨成栋_1_Student getItem(String number){
        boolean flag=false;
        int no=-1;
        for(int i=0;i<total;i++)
            if(list[i].getNumber()==number){
                flag=true;
                no=i+1;
            }
        if(flag)
            return list[no-1];
        else
            return null;
    }
    public int getTotal(){
        return total;
    }
    public void showStudentList(){
        if(total>0)
        {
            _2018210913_杨成栋_1_Student student;
            System.out.println(total+" "+"Students at the moment as described below:");
            for(int j=0;j<total;j++){
                student=list[j];
                System.out.print(student);
                System.out.printf("%.2f%n",student.calculateAverage());
            }
        }
    }
}
