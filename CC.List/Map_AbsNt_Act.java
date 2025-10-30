package CC.List;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Util.Fun.Run_A;

public interface Map_AbsNt_Act<KE,Valu>
	extends Map_Rap_Abs<KE,Valu>
{
//	Clas_Rap Class=Init_StRt(Map_AbsNt_Act.class
//		,Class.class
//	);/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void AbsNt_Act(KE KE);
		default void AbsNt_Act_List(KE... List)
		{
			for(KE KE:List)
			{AbsNt_Act(KE);}
		}
		default void If_AbsNt_Act(KE KE)
		{
			if(!containsKey(KE))
			{
//				out.println("Act on absent KE:"+KE);
				AbsNt_Act(KE);
			}
		}
			default void If_AbsNt_Act_List(KE... List)
			{
				for(KE KE:List)
				{If_AbsNt_Act(KE);}
			}

	class Map_AbsNt_Act_Rap<KE,ValU>
		extends Map_Rap<KE,ValU>
		implements Map_AbsNt_Act<KE,ValU>
	{
//		public static final Clas_Rap Class=Init_StRt(Map_AbsNt_Act_Rap.class
//			,Class.class
//		);/*Dep ?done*/

		public Run_A<Object,KE> Act;
			@Override public void AbsNt_Act(KE KE)
			{Act.Run_Rtrn(KE);}

		public Map_AbsNt_Act_Rap(Run_A<Object,KE> Act)
		{this.Act=Act;}
		public Map_AbsNt_Act_Rap()
		{}

//		static{Init_Nd(Map_AbsNt_Act_Rap.class);}
	}
}