package CC.Util.List.Ad;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap.*;

import java.util.List;

public interface Add<Typ>
{
//	Clas_Rap Class=Ad_Reg_Task(Add.class);

	void Add(Typ Add);

	void Ad_StRt_Nd(List List,int StRt,int Nd);
	void Ad_From_StRt(List List,int StRt);
	void Ad_Nd(List List,int Nd);
	void Ad_Al(List List);
}