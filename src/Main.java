import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Encapsulation newObj = new Encapsulation();
        newObj.setId(111);
        newObj.setName("My");
        System.out.println("This is id: "+ newObj.getId());
        System.out.println("This is id: "+ newObj.getName());

        Inherit student = new Inherit("Nga", 21,1.6f, "HTC");
        student.getInfo();

        ChildrenClass2 newClass = new ChildrenClass2("Lan", 15,1.5f);
        newClass.getInfo();

//        B ob = new B();
//        ob.sub(20,3);
//        ob.sum(2,30);
//        ob.mul(2,30);

//        ArrayList mylist = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int i =0; i<t; i++){
//            String s = sc.nextLine();
//            if(s.equals("Student")) mylist.add(new Student());
//            if(s.equals("Rockstar")) mylist.add(new Rockstar());
//            if(s.equals("Hacker")) mylist.add(new Hacker());
//        }
//        System.out.println("My List: "+ Instanceof.count(mylist));

        ArrayList myList = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        for(int i =0; i<n; i++){
            myList.add(scan.nextInt());
        }

        myList.add("###");

        for(int i =0; i<m; i++){
            myList.add(scan.next());
        }
        System.out.println("myList: "+ myList);

        Iterator it = func(myList);
        while (it.hasNext()){
            Object element = it.next();
            System.out.println("String: "+(String)element);
        }

        try{
            File file = new File("./configs/config.txt");
            InputStream is =  new FileInputStream(file);
            byte[] buffer = new byte[2048];
            is.read(buffer);

        } catch(FileNotFoundException e){
            System.out.println("k tìm thấy file");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("Lỗi trong quá trình đọc file");
            e.printStackTrace();
        }
        finally {
            System.out.println("I'm in Final Block");
        }


    }

   public static class B extends Abstract{
        public void  sub(int a, int b){
            System.out.println(a-b);
        }

        public void mul(int a, int b){
            System.out.println(a*b);
        }

       public void algo() {
//           System.out.println("Implementation of algo() in class B");
       }
    }

    public  class InheritanceNewInterface implements NewInterface{

        public void getData(){
            System.out.println("Get data");
        }
    }

    public class InTest extends TestAbstract{
        public void sum1(int a, int b){
            System.out.println();
        }
    }


    InTest test = new InTest();

    static Iterator func (ArrayList myList){
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object element1 = it.next();
            if( element1 instanceof String){
                break;
            }
        }

        return it;
    }
}

