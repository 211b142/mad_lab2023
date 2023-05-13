class rhd  extends duck implements flyable,quackable{

    public void fly()
    {
        System.out.println("I can fly");
    }
    public static void quack()
    {
    System.out.println("I can quack");
    super.swim();
}
}