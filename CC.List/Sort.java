package CC.List;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import java.util.List;
import java.util.ArrayList;

public interface Sort
{
	/*Clas_Rap Class=Init_StRt(Sort.class,
		Clas_Rap.class);/*Dep ?done*/

	void Sort(List List);

	Sort Typ=List->
	{
		SeqNcl_Map<java.lang.Class,ArrayList> Map=new SeqNcl_Map<>();
		java.lang.Class Typ;
		for(Object Item:List)
		{
			Typ=Item.getClass();
			if(!Map.containsKey(Item.getClass())){Map.put(Typ,new ArrayList<>());}
			Map.get(Typ).add(Item);
		}
		int Indx=0;
		for(java.lang.Class Typ_List:Map.Seqnc)
		{
			for(Object Item:Map.get(Typ_List))
			{
				List.set(Indx,Item);
				Indx+=1;
			}
		}
	};
}