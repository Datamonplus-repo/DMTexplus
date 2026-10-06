package app ;
import com.genexus.*;

public final  class StructSdtCuentaCorrienteProductos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtCuentaCorrienteProductos_SDT( )
   {
      this( -1, new ModelContext( StructSdtCuentaCorrienteProductos_SDT.class ));
   }

   public StructSdtCuentaCorrienteProductos_SDT( int remoteHandle ,
                                                 ModelContext context )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Comprast = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Consumost = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(1) ;
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

   public java.math.BigDecimal getComprast( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Comprast ;
   }

   public void setComprast( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Comprast = value ;
   }

   public java.math.BigDecimal getConsumost( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Consumost ;
   }

   public void setConsumost( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Consumost = value ;
   }

   public java.math.BigDecimal getDevolucionest( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest ;
   }

   public void setDevolucionest( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest = value ;
   }

   public app.StructSdtCuentaCorrienteProductos_SDT_Level1 getLevel1( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1 ;
   }

   public void setLevel1( app.StructSdtCuentaCorrienteProductos_SDT_Level1 value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1 = value;
   }

   protected byte gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N ;
   protected byte gxTv_SdtCuentaCorrienteProductos_SDT_N ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Comprast ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Consumost ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest ;
   protected app.StructSdtCuentaCorrienteProductos_SDT_Level1 gxTv_SdtCuentaCorrienteProductos_SDT_Level1=null ;
}

