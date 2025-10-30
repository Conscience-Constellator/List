package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public class Bilat_Hash_Map<A,B> extends Multilist
{
	public static final Clas_Rap Class=Init_StRt(Bilat_Hash_Map.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Bilat_Hash_Map(HashMap<A,B> Ke_To_Val,HashMap<B,A> Val_To_Ke)
	{
		this.Ke_To_Val=Ke_To_Val;
		this.Val_To_Ke=Val_To_Ke;
	}
	public Bilat_Hash_Map(){this(new HashMap<>(),new HashMap<>());}

	private HashMap<A,B> Ke_To_Val;
	private HashMap<B,A> Val_To_Ke;
		public void put(A Key,B Val)
		{
			Ke_To_Val.put(Key,Val);
			Val_To_Ke.put(Val,Key);
		}
		public B B(A Key){return Ke_To_Val.get(Key);}
		public A A(B Val){return Val_To_Ke.get(Val);}

	static{Init_Nd(Bilat_Hash_Map.class);}
}