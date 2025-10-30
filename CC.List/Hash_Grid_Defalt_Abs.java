package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public abstract class Hash_Grid_Defalt_Abs<KeA,KeB,Valu> extends Hash_Grid_Auto_Fil<KeA,KeB,Valu>
{
	/*
	public static final Clas_Rap Class=Init_StRt(Hash_Grid_Defalt_Abs.class,
		Class.class);/*Dep ?done*/

	public Hash_Grid_Defalt_Abs(){}

	@Override public void Fil(KeA A,KeB B){Put(A,B,Dfalt());}
	@Override public void Fil_A(KeA A)
	{
		HashMap<KeA,Valu> A_List;
		for(KeB KeB:DB)
		{
			A_List=get(KeB);
			if(!A_List.containsKey(A)){A_List.put(A,Dfalt());}
		}
	}
	@Override public void Fil_B(KeB B,HashMap<KeA,Valu> A_List){for(KeA A:DA){A_List.put(A,Dfalt());}}

	public abstract Valu Dfalt();

	public static class Hash_Grid_Defalt<KeA,KeB,Valu> extends Hash_Grid_Defalt_Abs<KeA,KeB,Valu>
	{
		public static final Clas_Rap Class=Init_StRt(Hash_Grid_Defalt.class
			,Class.class
		);/*Dep ?done*/

		public Hash_Grid_Defalt(Valu Defalt){this.Defalt=Defalt;}
		public Hash_Grid_Defalt(){}

		public Valu Defalt;
			@Override public Valu Dfalt(){return Defalt;}

		static{Init_Nd(Hash_Grid_Defalt.class);}
	}

	static{Init_Nd(Hash_Grid_Defalt_Abs.class);}
}