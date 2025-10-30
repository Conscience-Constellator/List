package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.Sekr;

import java.util.List;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public class Sek_Map<Ke,Valu> extends Map_Auto_Fil<Ke,Valu> implements Sekr<Ke,Valu>
{
	/*
	Clas_Rap Class=Init_StRt(Sek_Map.class,
		Clas_Rap.class);/*Dep ?done*/

//	@Override default Valu Auto(Ke Ke){return Try_Get_Sook(Ke,Auto(Ke));}

	@Override
	public boolean Get_For(Ke Srchbl,List<Valu> List){
		return false;
	}

	@Override
	public void Get_Sook_List(Ke Srchbl,List<Valu> List){

	}
}