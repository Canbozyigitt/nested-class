package nested;

public class Out
{
    public void run()
    {
        System.out.println("Dıştaki sınıfın metodu çalıştı.");
        Inner inner = new Inner();
        inner.run();
    }

    public class Inner
    {
        public void run()
        {
            System.out.println("İçteki sınıfın metodu çalıştı.");
        }
    }
}
/*
 private  yapma
class Outer
{
	private int number = 10;

    public void run()
	{
		System.out.println(number);

		Inner inner = new Inner();
		inner.run();

		System.out.println(number);
	}

    static class Inner
	{
		public void run()
		{
			number++; // Bu satır hataya neden olur
		}
	}
}
 */