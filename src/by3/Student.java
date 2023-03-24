package by3;

public class Student {
    private int id;
    private String name;
    private  String surname;
    private  int data;
    private String facultet;
    private  int curs;
    private  String gruppa;

    public  Student(){

    }
    public  Student(int id,String name, String surname,int data,String facultet,int curs,String gruppa){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.data=data;
        this.facultet=facultet;
        this.curs=curs;
        this.gruppa=gruppa;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public  String getSurname(){
        return surname;
    }
    public void  setSurname(String surname){
        this.surname=surname;
    }
    public  int getdata(){
        return data;
    }
    public void  setData(int data){
        this.data=data;
    }
    public  String getFacultet(){
        return facultet;
    }
    public void  setFacultet(String facultet){
        this.facultet=facultet;
    }
    public  int getCurs(){
        return curs;
    }
    public void  setCurs(int curs){
        this.curs=curs;
    }
    public  String getGruppa(){
        return gruppa;
    }
    public void  setGruppa(String gruppa){
        this.gruppa=gruppa;
    }

    public String information (){
        return "id: "+id+", имя: "+name+", фамилия: "+surname+", дата"+data+
                ", facultet: "+facultet+", curs: "+curs+", gruppa: "+
                gruppa;
    }


}
