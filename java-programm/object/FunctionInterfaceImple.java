class FuncrionInterfaceImple
{
    public static void main(String[] args)
    {
        //In this function frist argument is input type and seconf argument is output type
        // Ex : 1
        // Function<Integer,Integer> f = i>i*i;
        // System.out.println(f.apply(5));
        // System.out.println(f.apply(7));

        // Ex :2

        // Function<String,Integer> f = s->s.length();
        // System.out.println(f.apply("Radhika"));

        // Ex : 3
        // Function<Strign ,String> f = s->s.toUpperCase();
        // System.out.println("RAdhika");

        // Ex : 4
        Function<Student,String> f =  s-> {
            int marks = s.marks;
            String grade = "";
            if(marks>=80)
            {
                 grade = "A[Dictinction]";
            }else if(marks>=60)
            {
                grade = "B[First Class]";
            }
            else if(marks>=50)
            {
                grade = "C[Second Class]";
            }
            else if(marks>=35)
            {
                grade = "C[Pass Class]";
            }else{
                grade = "D[Failed]";
            }
        };

        Student[] s = {
            new Student("Radhika", 100),
            new Student("Amyra", 79),
            new Student("Aarjoo", 56),
            new Student("Anamika", 35),
            new Student("Earti", 23),
        }; 
        Predicate<Integer> p = i->i>=60;

        for(Student s1 : s)
        {
           
            if(p.test(s1.marks))
            {
                System.out.println("Student Name " + s1.name);
                System.out.println("Student marks " + s1.marks);
                System.out.println("Student grade " + f.apply(s1));
            }
        }
    }
}

class Student
{
    String name;
    int marks;

    public Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}