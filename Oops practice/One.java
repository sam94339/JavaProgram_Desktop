class One{

    String name;
    String age;

    One(String name, String age){
    
    this.name = name;
    this.age = age;
  }

  public String getName(){

    return name;
  }

  public String getAge(){

    return age;
  }

  public static void main(String args[]){

    One o = new One("Soumya", "29");
    One o1 = new One("Deep", "28");

    System.out.println(o.getName()+","+ o.getAge());
    System.out.println(o1.getName()+","+ o1.getAge());

  }
  
 
}