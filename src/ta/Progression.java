package ta;
public abstract class Progression<P> {
	
	protected P fir;
	protected P cur;
	
	public Progression(P f){
	 this.fir = f;
	 this.cur = f;
	}
	
	protected P firstValue(){ 
	 cur = fir;
	 return cur;
	}
	
	public abstract P nextValue();
	
	public void printProgression(int n){  
		String result =toString().valueOf(firstValue());
		
		for(int i=0;i <n-1;i++){
			result +=" " + String.valueOf(nextValue());
		}
		 System.out.println(result);
	}
	
}