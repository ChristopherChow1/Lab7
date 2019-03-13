import org.junit.Assert;
import org.junit.Test;


public class AnimalTest {

	@Test
	public void test() {
		Animal Ani = new Animal("terrier", 6);
		Animal Ani2 = new Animal("husky", 4);
		Assert.assertEquals("wrong breed", "terrier", Ani.getBreed());
		Assert.assertEquals("wrong age", 6, Ani.getAge());
		Assert.assertEquals("toString incorrect", "A 6-year old terrier.", Ani.toString());
		Assert.assertEquals("compareTo incorrect", -2, Ani.compareTo(Ani2));
	}

}
