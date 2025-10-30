package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Nom_Imp_Par;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public interface List_Nod_Abs
{
	Clas_Rap Class=Init_StRt(List_Nod_Abs.class
		,Clas_Rap.class
	);/*Dep ?done*/

	Object Item();

	class List_Nod<Item> implements List_Nod_Abs
	{
		public static final Clas_Rap Class=Init_StRt(List_Nod.class,List_Nod_Abs.Class.Depg);

		public List_Nod(Item Item){this.Item=Item;}

		public Item Item;
			@Override public Item Item(){return Item;}

		static{Init_Nd(List_Nod.class);}
	}

	Nom_Imp_Par Nom_Imp=Init_Nd(new Nom_Imp_Par(List_Nod.class,"List_Nod"),List_Nod_Abs.class);
}