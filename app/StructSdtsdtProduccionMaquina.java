package app ;
import com.genexus.*;

public final  class StructSdtsdtProduccionMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtsdtProduccionMaquina( )
   {
      this( -1, new ModelContext( StructSdtsdtProduccionMaquina.class ));
   }

   public StructSdtsdtProduccionMaquina( int remoteHandle ,
                                         ModelContext context )
   {
      gxTv_SdtsdtProduccionMaquina_Maqcod = "" ;
      gxTv_SdtsdtProduccionMaquina_Maqdsc = "" ;
      gxTv_SdtsdtProduccionMaquina_Kilos = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtProduccionMaquina_Metros = new java.math.BigDecimal(0) ;
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

   public String getMaqcod( )
   {
      return gxTv_SdtsdtProduccionMaquina_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtsdtProduccionMaquina_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquina_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtsdtProduccionMaquina_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtsdtProduccionMaquina_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquina_Maqdsc = value ;
   }

   public java.math.BigDecimal getKilos( )
   {
      return gxTv_SdtsdtProduccionMaquina_Kilos ;
   }

   public void setKilos( java.math.BigDecimal value )
   {
      gxTv_SdtsdtProduccionMaquina_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquina_Kilos = value ;
   }

   public java.math.BigDecimal getMetros( )
   {
      return gxTv_SdtsdtProduccionMaquina_Metros ;
   }

   public void setMetros( java.math.BigDecimal value )
   {
      gxTv_SdtsdtProduccionMaquina_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquina_Metros = value ;
   }

   protected byte gxTv_SdtsdtProduccionMaquina_N ;
   protected String gxTv_SdtsdtProduccionMaquina_Maqcod ;
   protected String gxTv_SdtsdtProduccionMaquina_Maqdsc ;
   protected java.math.BigDecimal gxTv_SdtsdtProduccionMaquina_Kilos ;
   protected java.math.BigDecimal gxTv_SdtsdtProduccionMaquina_Metros ;
}

