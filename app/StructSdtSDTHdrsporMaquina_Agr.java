package app ;
import com.genexus.*;

public final  class StructSdtSDTHdrsporMaquina_Agr implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHdrsporMaquina_Agr( )
   {
      this( -1, new ModelContext( StructSdtSDTHdrsporMaquina_Agr.class ));
   }

   public StructSdtSDTHdrsporMaquina_Agr( int remoteHandle ,
                                          ModelContext context )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr = "" ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc = "" ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu = "" ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr = new java.math.BigDecimal(0) ;
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

   public String getBaragrhdr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr ;
   }

   public void setBaragrhdr( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr = value ;
   }

   public String getBaragrdsc( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc ;
   }

   public void setBaragrdsc( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc = value ;
   }

   public String getBaragrdnu( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu ;
   }

   public void setBaragrdnu( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu = value ;
   }

   public java.math.BigDecimal getKgmagr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr ;
   }

   public void setKgmagr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr = value ;
   }

   protected byte gxTv_SdtSDTHdrsporMaquina_Agr_N ;
   protected String gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr ;
   protected String gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc ;
   protected String gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr ;
}

