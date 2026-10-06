package app ;
import com.genexus.*;

public final  class StructSdtSDTEntregasResumenCliente_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtSDTEntregasResumenCliente_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtSDTEntregasResumenCliente_Level1Item.class ));
   }

   public StructSdtSDTEntregasResumenCliente_Level1Item( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts = new java.math.BigDecimal(0) ;
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

   public java.math.BigDecimal getTotkgs( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs ;
   }

   public void setTotkgs( java.math.BigDecimal value )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs = value ;
   }

   public java.math.BigDecimal getTotmts( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts ;
   }

   public void setTotmts( java.math.BigDecimal value )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts = value ;
   }

   public int getTotpzs( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs ;
   }

   public void setTotpzs( int value )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs = value ;
   }

   protected byte gxTv_SdtSDTEntregasResumenCliente_Level1Item_N ;
   protected int gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs ;
   protected java.math.BigDecimal gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs ;
   protected java.math.BigDecimal gxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts ;
}

