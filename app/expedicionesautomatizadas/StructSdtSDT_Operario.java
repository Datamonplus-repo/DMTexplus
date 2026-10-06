package app.expedicionesautomatizadas ;
import com.genexus.*;

public final  class StructSdtSDT_Operario implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_Operario( )
   {
      this( -1, new ModelContext( StructSdtSDT_Operario.class ));
   }

   public StructSdtSDT_Operario( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtSDT_Operario_Emprcod = "" ;
      gxTv_SdtSDT_Operario_Openom = "" ;
      gxTv_SdtSDT_Operario_Openom2 = "" ;
      gxTv_SdtSDT_Operario_Emprnom = "" ;
      gxTv_SdtSDT_Operario_Opeprehor = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Operario_Opesecc = "" ;
      gxTv_SdtSDT_Operario_Opeact = "" ;
      gxTv_SdtSDT_Operario_Opepass = "" ;
      gxTv_SdtSDT_Operario_Opemsol = "" ;
      gxTv_SdtSDT_Operario_Opemusu = "" ;
      gxTv_SdtSDT_Operario_Opecnom = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtSDT_Operario_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Emprcod = value ;
   }

   public int getOpecod( )
   {
      return gxTv_SdtSDT_Operario_Opecod ;
   }

   public void setOpecod( int value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opecod = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtSDT_Operario_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Openom = value ;
   }

   public String getOpenom2( )
   {
      return gxTv_SdtSDT_Operario_Openom2 ;
   }

   public void setOpenom2( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Openom2 = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtSDT_Operario_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Emprnom = value ;
   }

   public java.math.BigDecimal getOpeprehor( )
   {
      return gxTv_SdtSDT_Operario_Opeprehor ;
   }

   public void setOpeprehor( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opeprehor = value ;
   }

   public byte getOpeturno( )
   {
      return gxTv_SdtSDT_Operario_Opeturno ;
   }

   public void setOpeturno( byte value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opeturno = value ;
   }

   public long getOpecedula( )
   {
      return gxTv_SdtSDT_Operario_Opecedula ;
   }

   public void setOpecedula( long value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opecedula = value ;
   }

   public String getOpesecc( )
   {
      return gxTv_SdtSDT_Operario_Opesecc ;
   }

   public void setOpesecc( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opesecc = value ;
   }

   public String getOpeact( )
   {
      return gxTv_SdtSDT_Operario_Opeact ;
   }

   public void setOpeact( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opeact = value ;
   }

   public String getOpepass( )
   {
      return gxTv_SdtSDT_Operario_Opepass ;
   }

   public void setOpepass( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opepass = value ;
   }

   public String getOpemsol( )
   {
      return gxTv_SdtSDT_Operario_Opemsol ;
   }

   public void setOpemsol( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opemsol = value ;
   }

   public String getOpemusu( )
   {
      return gxTv_SdtSDT_Operario_Opemusu ;
   }

   public void setOpemusu( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opemusu = value ;
   }

   public String getOpecnom( )
   {
      return gxTv_SdtSDT_Operario_Opecnom ;
   }

   public void setOpecnom( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opecnom = value ;
   }

   protected byte gxTv_SdtSDT_Operario_Opeturno ;
   protected byte gxTv_SdtSDT_Operario_N ;
   protected int gxTv_SdtSDT_Operario_Opecod ;
   protected long gxTv_SdtSDT_Operario_Opecedula ;
   protected String gxTv_SdtSDT_Operario_Emprcod ;
   protected String gxTv_SdtSDT_Operario_Openom ;
   protected String gxTv_SdtSDT_Operario_Openom2 ;
   protected String gxTv_SdtSDT_Operario_Emprnom ;
   protected String gxTv_SdtSDT_Operario_Opesecc ;
   protected String gxTv_SdtSDT_Operario_Opeact ;
   protected String gxTv_SdtSDT_Operario_Opepass ;
   protected String gxTv_SdtSDT_Operario_Opemsol ;
   protected String gxTv_SdtSDT_Operario_Opemusu ;
   protected String gxTv_SdtSDT_Operario_Opecnom ;
   protected java.math.BigDecimal gxTv_SdtSDT_Operario_Opeprehor ;
}

