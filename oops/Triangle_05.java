

 class Triangle_05 {
    int  s1, s2, s3;
    Triangle_05(int s1,int s2,int s3){
         this.s1=s1;
         this.s2=s2;
         this.s3=s3;
        }

        public  int calculate_area(){
            return s1*s2*s3;
        }
        
        public  int calculate_perimeter(){
            return s1+s2+s3;
        }
    public static void main(String[] args) {
        Triangle_05 t1= new Triangle_05(3, 4, 5);
        System.out.println(t1.calculate_area());
        System.out.println(t1.calculate_perimeter());
    }
}
