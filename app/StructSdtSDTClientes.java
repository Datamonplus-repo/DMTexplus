package app ;
import com.genexus.*;

public final  class StructSdtSDTClientes implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClientes( )
   {
      this( -1, new ModelContext( StructSdtSDTClientes.class ));
   }

   public StructSdtSDTClientes( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtSDTClientes_Clinom = "" ;
      gxTv_SdtSDTClientes_Kilosreoperados = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTClientes_Metrosreoperados = new java.math.BigDecimal(0) ;
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

   public String getClinom( )
   {
      return gxTv_SdtSDTClientes_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTClientes_N = (byte)(0) ;
      gxTv_SdtSDTClientes_Clinom = value ;
   }

   public java.math.BigDecimal getKilosreoperados( )
   {
      return gxTv_SdtSDTClientes_Kilosreoperados ;
   }

   public void setKilosreoperados( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientes_N = (byte)(0) ;
      gxTv_SdtSDTClientes_Kilosreoperados = value ;
   }

   public java.math.BigDecimal getMetrosreoperados( )
   {
      return gxTv_SdtSDTClientes_Metrosreoperados ;
   }

   public void setMetrosreoperados( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientes_N = (byte)(0) ;
      gxTv_SdtSDTClientes_Metrosreoperados = value ;
   }

   protected byte gxTv_SdtSDTClientes_N ;
   protected String gxTv_SdtSDTClientes_Clinom ;
   protected java.math.BigDecimal gxTv_SdtSDTClientes_Kilosreoperados ;
   protected java.math.BigDecimal gxTv_SdtSDTClientes_Metrosreoperados ;
}

