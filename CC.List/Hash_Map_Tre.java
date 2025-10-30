package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public class Hash_Map_Tre<Typ>
{
	public static final Clas_Rap Class=Init_StRt(Hash_Map_Tre.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Hash_Map_Tre(HashMap<?,?> Stm,java.lang.Class<?>... Ke_Clas_List)
	{
		this.Stm=Stm;
		this.Ke_Clas_List=Ke_Clas_List;
	}
	public Hash_Map_Tre(){}

	public HashMap<?,?> Stm;
		public java.lang.Class<?>[] Ke_Clas_List;
		public static <Typ>Typ Get(HashMap<?,?> Stm,Object... Ke_List)
		{
			Object Nod=Stm;
			for(Object Ke:Ke_List)
			{
				if(((HashMap<?,?>)Nod).containsKey(Ke)){Nod=((HashMap<?,?>)Nod).get(Ke);}
				else{return null;}
			}
			return (Typ)Nod;
		}
			public <Typ>Typ Get(Object... Ke_List){return Get(Stm,Ke_List);}
		public static <Typ>void Add(HashMap<?,?> Stm,Typ Item,Object... Ke_List)
		{
			HashMap Nod=Stm;
			for(Object Ke:Ke_List)
			{
				if(Nod.containsKey(Ke)){Nod=(HashMap<?,?>)Nod.get(Ke);}
				else
				{
					HashMap<?,?> Map=new HashMap<>();
					Nod.put(Ke,Map);
					Nod=Map;
				}
			}
		}
			public void Add(Object... Ke_List){Add(Stm,Ke_List);}

	static{Init_Nd(Hash_Map_Tre.class);}
}