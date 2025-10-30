package CC.List;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.UI.ConsOl;
import CC.Util.Rapr_Abs;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface Map_Rap_Abs<KE,ValU> extends Map_Plus<KE,ValU>,Rapr_Abs<Map<KE,ValU>>
{
//	Clas_Rap Class=Init_StRt(Map_Rap_Abs.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	@Override
	default int size()
	{return Get_Rapd().size();}
	@Override
	default ValU get(Object KE)
	{return Get_Rapd().get(KE);}
	@Override
	default ValU put(KE KE,ValU ValU)
	{return Get_Rapd().put(KE,ValU);}
	@Override
	default void putAll(Map<? extends KE,? extends ValU> Map)
	{Get_Rapd().putAll(Map);}
	@Override
	default ValU remove(Object KE)
	{return Get_Rapd().remove(KE);}
	@Override
	default void clear()
	{Get_Rapd().clear();}
	@Override
	default boolean containsKey(Object KE)
	{return ConsOl.Print_IndX_LIn(3,"containsKey(",KE,")->",Get_Rapd().containsKey(KE));}
	@Override
	default boolean containsValue(Object ValU)
	{return Get_Rapd().containsValue(ValU);}
	@Override
	default Set<KE> keySet()
	{return Get_Rapd().keySet();}
	@Override
	default Collection<ValU> values()
	{return Get_Rapd().values();}
	@Override
	default Set<Entry<KE,ValU>> entrySet()
	{return Get_Rapd().entrySet();}

	class Map_Rap<KE,ValU> extends Rapr<Map<KE,ValU>>
		implements Map_Rap_Abs<KE,ValU>
	{
//		public static final Clas_Rap Class=Init_StRt(Map_Rap.class
//			,Clas_Rap.class
//		);/*Dep ?done*/

		public Map_Rap(Map<KE,ValU> Map)
		{super(Map);}
		public Map_Rap()
		{}

//		static{Init_Nd(Map_Rap.class);}
	}
}