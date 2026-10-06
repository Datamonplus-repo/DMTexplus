package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionMaquinasFases implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionMaquinasFases( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionMaquinasFases.class ));
   }

   public StructSdtSDTProduccionMaquinasFases( int remoteHandle ,
                                               ModelContext context )
   {
      gxTv_SdtSDTProduccionMaquinasFases_Maqdsc = "" ;
      gxTv_SdtSDTProduccionMaquinasFases_Fases_N = (byte)(1) ;
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

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTProduccionMaquinasFases_FasesItem> getFases( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_Fases ;
   }

   public void setFases( java.util.Vector<app.StructSdtSDTProduccionMaquinasFases_FasesItem> value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_Fases_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_Fases = value ;
   }

   protected byte gxTv_SdtSDTProduccionMaquinasFases_Fases_N ;
   protected byte gxTv_SdtSDTProduccionMaquinasFases_N ;
   protected String gxTv_SdtSDTProduccionMaquinasFases_Maqdsc ;
   protected java.util.Vector<app.StructSdtSDTProduccionMaquinasFases_FasesItem> gxTv_SdtSDTProduccionMaquinasFases_Fases=null ;
}

