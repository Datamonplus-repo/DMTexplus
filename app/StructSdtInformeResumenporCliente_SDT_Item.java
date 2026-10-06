package app ;
import com.genexus.*;

public final  class StructSdtInformeResumenporCliente_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtInformeResumenporCliente_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtInformeResumenporCliente_SDT_Item.class ));
   }

   public StructSdtInformeResumenporCliente_SDT_Item( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom = "" ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc = new java.math.BigDecimal(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc = new java.math.BigDecimal(0) ;
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

   public int getClicod( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom = value ;
   }

   public java.math.BigDecimal getTotkilc( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc ;
   }

   public void setTotkilc( java.math.BigDecimal value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc = value ;
   }

   public java.math.BigDecimal getTotmetc( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc ;
   }

   public void setTotmetc( java.math.BigDecimal value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc = value ;
   }

   public long getTotpiec( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec ;
   }

   public void setTotpiec( long value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec = value ;
   }

   protected byte gxTv_SdtInformeResumenporCliente_SDT_Item_N ;
   protected int gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod ;
   protected long gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec ;
   protected String gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom ;
   protected java.math.BigDecimal gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc ;
   protected java.math.BigDecimal gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc ;
}

