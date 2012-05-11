
public class intArray {
	protected int[] array;
	public intArray(int[] a){
		array=a;
	}
	public void addi(int n){
		System.out.println("Adding: "+n+" to each value");
		for(int i=0; i<array.length; i++){
			array[i]+=n;
		}
		System.out.println();
	}
	public void print(){
		System.out.println("Integer Array of size: "+array.length);
		int sum=0;
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
			sum+=array[i];
		}
		System.out.println("Sum equals: "+sum);
		System.out.println();
	}
}
