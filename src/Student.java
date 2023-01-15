
    class Student {
        String name ;
        int rollNum;

        public Student (){
            name ="Unknown";
            rollNum = 0;
        }

        public Student (String name, int rollNum){
            this.name =name ;
            this.rollNum = rollNum;
        }


        public String getName(){
            return name;
        }

        public static void main(String[] args){
            Student st = new Student();
            Student st2 = new Student("Monu", 11);
            String s = st.getName();
            System.out.println(s);
            System.out.println(st2.getName());

        }

    }
