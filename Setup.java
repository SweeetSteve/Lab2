import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "SweetSteve", "660143661216");

	    /* Set an assignment title */
	    bridges.setTitle("Stephen Shea");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    for(int i = 0; i < arr.getSize(); i++)
	    {
	    	int num = i * i;
	    	arr.getElement(i).setValue (0);
	    	arr.getElement(i).setValue(num);
	    	arr.getElement(i).setLabel(String.valueOf(num));
	    }
	    
	    /* set the value as a Label */
	    //arr.getElement(0).setLabel(String.valueOf(0));
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
