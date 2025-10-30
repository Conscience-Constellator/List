package CC.List;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import java.util.Iterator;

public class Itr_Havr<Typ> implements Iterator<Typ>
{
//	public static final Clas_Rap Class=Init_StRt(Itr_Havr.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	Iterator<Typ> Itr;
		@Override public boolean hasNext(){return Itr.hasNext();}
		@Override public Typ next(){return Itr.next();}

	public Itr_Havr(Iterator Itr)
	{this.Itr=Itr;}

//	static{Init_Nd(Itr_Havr.class);}
}
