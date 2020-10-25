package ta;
public class GeomProgression<P extends Number> extends Progression<P> {
	private P base;
	

	public GeomProgression(P fir,P base){
		
		super(fir);
		this.base=base;
	}
	private P multiply(P a,P b){
		if(a instanceof Integer){
			Integer erasedValue = a.intValue()*b.intValue();	
			return(P)erasedValue;

		}
		else if(a instanceof Long){
			Long erasedValue = a.longValue()*b.longValue();
			return(P)erasedValue;
		} 	
		else if(a instanceof Float){
			Float erasedValue = a.floatValue()*b.floatValue();
			return(P)erasedValue;
		} 	
		else if(a instanceof Double){
			Double erasedValue = a.doubleValue()*b.doubleValue();
			return(P)erasedValue;
		} 
		else{
			return null;
		}		
	}
	public P nextValue(){
		cur=multiply(cur,base);
		return cur;
	}
}