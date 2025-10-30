package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import static java.lang.System.out;
import static CC.List.Nod_Abs.Nod;

public interface Linkd_List_Abs
{
	Clas_Rap Class=Init_StRt_Nd(Linkd_List_Abs.class
		,Clas_Rap.class
	);/*Dep !done*/

	Nod_Abs StRt();
	Nod_Abs Nd();
	void Add();
	void XtNd(int Xtnsin);

	class Linkd_List<Item> implements Linkd_List_Abs
	{
		public static Clas_Rap Class=Init_StRt(Linkd_List.class
			,Clas_Rap.class
		);//Dep !done

		public Linkd_List(Nod<Item> Strt,Nod<Item> Nd){Set_Nds(Strt,Nd);}
			public Linkd_List(Item Strt,Item Nd){Set_Nds(Strt,Nd);}
				public Linkd_List(){this(new Nod<>(),new Nod<>());}
					public Linkd_List(int Lngth)
					{
						this();
						XtNd(Lngth);
					}

		public Nod<Item> Strt,Nd;
			@Override public Nod<Item> StRt(){return Strt;}
			@Override public Nod<Item> Nd(){return Nd;}
			public void Set_Nds(Nod<Item> Strt,Nod<Item> Nd)
			{
				this.Strt=Strt;
				this.Nd=Nd;
				Strt.Con_Cyc(Nd);
			}
			public void Set_Nds(Item Strt,Item Nd){Set_Nds(new Nod(Strt),new Nod(Nd));}
			public int Lngth=0;
				public void Set_Lngth(int Len)
				{
					out.println("Len="+Len);
					this.Lngth=Len;
				}
				public void Chang_Lngth(int Vectr){Set_Lngth(Lngth()+Vectr);}
				public int Lngth(){return Lngth;}
				public int Lngth_Chek()
				{
					out.println("Lngth_Chek|"+(StRt().Aftr()==Nd()));
					Nod<Item> Nod=StRt().Aftr(),Nd=Nd();
					for(int Count=0;;Count+=1,Nod=Nod.Aftr()){if(Nod==Nd){return Count;}}
				}
					public String Lngth_Compar(){return Lngth()+","+Lngth_Chek();}
						public void Print_Compar(){out.println(Lngth_Compar());}
			public Nod<Item> Get(int Indx){for(Nod<Item> Nod=StRt();;Indx-=1,Nod=Nod.Aftr()){if(Indx==0){return Nod;}}}
			public void Insrt(Nod<Item> Bfor,Nod<Item> Insrt,Nod<Item> Aftr)
			{
				Nod.Insrt(Bfor,Insrt,Aftr);
				Chang_Lngth(1);
			}
				public void Insrt_Bfor(Nod<Item> Insrt,Nod<Item> Aftr)
				{
					//out.println("Linked_List.Insert_Bef()");
					Insrt(Aftr.Bfor(),Insrt,Aftr);
				}
					public void Insrt_Bfor(Nod<Item> Insrt,int Aft){Insrt_Bfor(Insrt,Get(Aft));}
				public void Insrt_Aftr(Nod<Item> Insrt,Nod<Item> Bfor){Insrt(Bfor,Insrt,Bfor.Aftr());}
					public void Insrt_Aftr(Nod<Item> Insrt,int Bfor){Insrt_Aftr(Insrt,Get(Bfor));}
			public void Insrt(Nod<Item> A_Strt,Nod<Item> A_Nd,Nod<Item> B_Strt,Nod<Item> B_Nd,int Incres)
			{
				Nod.Insrt(A_Strt,A_Nd,B_Strt,B_Nd);
				Set_Lngth(Lngth()+Incres);
			}
				public void Insrt(Linkd_List<Item> Insrt)
				{
					int Lngth=Insrt.Lngth();
					if(Lngth>0)
					{
						Nod<Item> Insrt_Nd=Insrt.Nd().Bfor();
						Insrt(StRt(),Nd(),Insrt.Mpt(),Insrt_Nd,Lngth);
					}
				}
				public void Add(Nod<Item> Nod)
				{
					Nod<Item> Nd=Nd();
					Insrt_Bfor(Nod,Nd);
				}
					public void Add(){Add(new Nod<>());}
					public void XtNd(int Xtnsin){for(int Update=Lngth+Xtnsin;this.Lngth<Update;Add());}
			public void Rem(Nod<Item> Nod)
			{
				Nod.Rem();
				Chang_Lngth(-1);
			}
				public void Rem(int Indx){Rem(Get(Indx));}
			public Nod<Item> Trim(int Trim)
			{
				int Lngth=Lngth();
				if(Lngth>0){}

				return null;
			}
			public Nod<Item> Mpt()
			{
				Nod<Item> Frst=StRt().Aftr();
				StRt().Con_Aftr(Nd());
				Set_Lngth(0);

				return Frst;
			}

		@Override public String toString()
		{
			StringBuilder Bildr=new StringBuilder();
			Bildr.append("Linked_List:");
			Bildr.append(Lngth());
			Bildr.append('|');
			if(false)
			{
				for(Nod<Item> Nod=StRt().Aftr();Nod!=Nd();Nod=Nod.Aftr())
				{
					Bildr.append(Nod);
					Bildr.append(',');
				}
			}

			return Bildr.toString();
		}

		static{Init_Nd(Linkd_List.class);}
	}
}