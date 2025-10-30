package CC.List;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.List.Col_Util;
import java.util.HashSet;
import java.util.Set;
import static CC.Util.Bool.Point2_Bool.ID;
import static CC.List.ArA_Util.*;

public interface Ara_Map_Abs<Ke,Valu>
		 extends	 Map_Plus<Ke,Valu>
{
	/*
	Clas_Rap Class=Init_StRt(Ara_Map_Abs.class,
		Class.class);/*Dep ?done*/

	Ke[] Ke_List();
	void Set_Ke_List(Ke[] List);
	Valu[] Valu_List();
	void Set_Valu_List(Valu[] List);
		default void Set_Lists(Ke[] Ke_List,Valu[] Valu_List)
		{
			Set_Ke_List(Ke_List);
			Set_Valu_List(Valu_List);
		}
		default void Set(int Indx,Ke Ke,Valu Valu)
		{
			Ke_List()[Indx]=Ke;
			Valu_List()[Indx]=Valu;
		}
		@Override default int size(){return Ke_List().length;}
		default boolean Eql(Ke A,Ke B){return A==B;}
		default int Sek_Ke(Ke Ke){return ID.Sek(Ke_List(),Ke);}
		default int Sek_Valu(Valu Valu){return ID.Sek(Valu_List(),Valu);}
		@Override default boolean containsKey(Object Ke){return Sek_Ke((Ke)Ke)!=-1;}
		@Override default boolean containsValue(Object Valu){return Sek_Valu((Valu)Valu)!=-1;}
		@Override default Set<Ke> keySet(){return Col_Util.Ad_List(new HashSet<>(),Ke_List());}
		@Override default Set<Valu> values(){return Col_Util.Ad_List(new HashSet<>(),Valu_List());}
		@Override default Set<Entry<Ke,Valu>> entrySet(){return Col_Util.Ad_List(new HashSet<>(),Map_Plus.Ntry_Set(Ke_List(),Valu_List()));}
	@Override default Valu put(Ke Ke,Valu Valu)
	{
		int Indx=Sek_Ke(Ke);
		if(Indx!=-1)
		{
			Valu Prev=Valu_List()[Indx];
			Set(Indx,Ke,Valu);

			return Prev;
		}
		else
		{
			Set_Lists(Insrt(Ke_List(),Ke,0),Insrt(Valu_List(),Valu,0));

			return null;
		}
	}
	@Override default Valu remove(Object Ke)
	{
		int Indx=Sek_Ke((Ke)Ke);
		if(Indx!=-1)
		{
			Valu Valu=Valu_List()[Indx];
			Set_Lists(Rem(Ke_List(),Indx),Rem(Valu_List(),Indx));

			return Valu;
		}
		return null;
	}
		@Override default void clear(){Set_Lists(MpT(Ke_List()),MpT(Valu_List()));}

	@Override default Valu get(Object Ke)
	{
		Ke[] Ke_List=Ke_List();
		Valu[] Valu_List=Valu_List();

		for(int Indx=0;Indx<Ke_List.length;Indx+=1){if(Eql((Ke)Ke,Ke_List[Indx])){return Valu_List[Indx];}}
		return null;
	}

	class Ara_Map<Ke,Valu> implements Ara_Map_Abs<Ke,Valu>
	{
		public static final Clas_Rap Class=Init_StRt(Ara_Map.class
			,Class.class
		);/*Dep ?done*/

		public Ara_Map(Ke[] Ke_List,Valu[] Valu_List,Object... List)
		{
			Set_Ke_List(Ke_List);
			Set_Valu_List(Valu_List);
			Put_List(List);
		}
			public Ara_Map(Class<Ke> Ke_Typ,Class<Valu> Valu,Object... List){this(MpT(Ke_Typ),MpT(Valu),List);}
		public Ara_Map(){}

		public Ke[] Ke_List;

		@Override public Ke[] Ke_List(){return Ke_List;}
			@Override public void Set_Ke_List(Ke[] List){Ke_List=List;}
		public Valu[] Valu_List;
			@Override public Valu[] Valu_List(){return Valu_List;}
			@Override public void Set_Valu_List(Valu[] List){Valu_List=List;}

		static{Init_Nd(Ara_Map.class);}
	}
}