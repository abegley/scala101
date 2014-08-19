package scratch

/**
 * Created by abegley on 19/08/2014.
 * Scala Cookbook: Recipes for Object-Oriented and Functional Programming, chp01 Strings - Understanding how map works
 */
object Adler32Checksum extends App {

  val MOD_ADLER = 65521

  val sum = alder32sum("Wikipedia")
  printf("checksum (int) = %d\n", sum)
  printf("checksum (hex) = %s\n", sum.toHexString)

  def alder32sum(s: String) : Int = {
    var a = 1
    var b = 0
    s.getBytes.foreach{char =>
        a = (char + a) % MOD_ADLER
        b = (b + a) % MOD_ADLER
    }
    //note:  Int is 32 bits, which this requires
    b * 65536 + a //or (b << 16) + a
  }

}

/* Notes
The getBytes method returns a sequential collection of bytes from a String as follows:

scala > "hello". getBytes
res0: Array[ Byte] = Array( 104, 101, 108, 108, 111)

Adding the foreach method call after getBytes lets you operate on each Byte value:

scala > "hello". getBytes.foreach( println) 104 101 108 108 111

You use foreach in this example instead of map, because the goal is to loop over each Byte
in the String, and do something with each Byte, but you don’t want to return anything from the loop.

 */
