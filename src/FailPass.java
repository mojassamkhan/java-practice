class FailPass {
    public static void main(String[] args) {
        System.out.println("Hello" + " " + args[0]);
        // "34"
        int marks = Integer.parseInt(args[1]);

        if (marks < 34) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
        // for(int i = 0; i < args.length; i++){
        //   System.out.println("Hello" + " " + args[i]);
        // }

    }
}
