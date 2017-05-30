/*
public can be accessed by anyone.
class=wht type of file we are creating
Hello= defines class name


*/
public class Hello{
/*
private= can be accessed by this class only
static=?
String= type of object that we are creating
textToBeDisplayed=property
"My Text To Be Displayed"= property value 
*/

	private static String textToBeDisplayed = "My Text to be displayed";
/*
public=can be accessed outside
static=?
void=returntype
main=functionname
(String[] arg)=parameters
{....}=behaviour

*/
	public static void main (String[] arg){
		System.out.println(textToBeDisplayed);
	}
}
 
