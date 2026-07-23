package Task2;

public class Department {
  public String dpn;
  public Student[] st = new Student[5];
  public int count;

  public Department (String nm){
    dpn = nm;
  }

  public void addStudent(Student s){
    for(int i=0; i<count;i++){
      if(st[i].getId()==s.getId()){
        System.out.println("Student with the same ID already exists, Please try with another ID");
        return;
      }
    }
    st[count++] = s;
    System.out.println("Welcome to " + dpn + " department, " + s.name);
  }

  public void addStudent(Student s1,Student s2,Student s3){
    addStudent(s1);
    addStudent(s2);
    addStudent(s3);
  }

  public void details(){
    System.out.println("Department Name: "+dpn);
    System.out.println("Number of student:"+count);
    System.out.println("Details of the students: ");
    for(int i=0; i<count;i++){
      System.out.println("Student name: "+st[i].name+", ID: "+st[i].getId()+", cgpa: "+st[i].cg);
    }
  }

  public void findStudent(int id){
    for(int i=0; i<count;i++){
      if(st[i].getId()==id){
      System.out.println("Student info: \n"+"Student Name: "+st[i].name+"\nID: "+st[i].getId()+"\nCGPA:  "+st[i].cg);
      return;
      }
    }
    System.out.println("Student with this ID doesn't exist, Please give a valid ID");
  }

}
