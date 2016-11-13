package test;

public class test {
        public static void main(String args[])
        {
            try
            {
                throw new Exc1(); /* Line 9 */
            }

            catch (ExcO e0) /* Line 11 */
            {
                System.out.println("Ex0 caught");
            }

            catch (Exception e)
            {
                System.out.println("exception caught");
            }
        }
}
