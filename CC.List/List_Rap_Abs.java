package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Util.Rapr_Abs;
import java.util.List;

public interface List_Rap_Abs<Item> extends List_Plus<Item>,Rapr_Abs<List<Item>>
{
	Clas_Rap Class=Init_StRt(List_Rap_Abs.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Override default int size(){return Get_Rapd().size();}
	@Override default boolean add(Item Item){return Get_Rapd().add(Item);}
	@Override default boolean remove(Object Item){return Get_Rapd().remove(Item);}
	@Override default Item get(int Indx){return Get_Rapd().get(Indx);}
	@Override default Item set(int Indx,Item Item){return Get_Rapd().set(Indx,Item);}
	@Override default void add(int Indx,Item Item){Get_Rapd().add(Indx,Item);}
	@Override default Item remove(int Indx){return Get_Rapd().remove(Indx);}
	@Override default int indexOf(Object Item){return Get_Rapd().indexOf(Item);}
	@Override default int lastIndexOf(Object Item){return Get_Rapd().lastIndexOf(Item);}

	class List_Rap<Item> extends Rapr_Abs.Rapr<List<Item>> implements List_Rap_Abs<Item>
	{
		public static final Clas_Rap Class=Init_StRt(List_Rap.class
			,Clas_Rap.class
		);/*Dep ?done*/

		public List_Rap(List<Item> Rapd){super(Rapd);}
		public List_Rap(){}

		static{Init_Nd(List_Rap.class);}
	}
}