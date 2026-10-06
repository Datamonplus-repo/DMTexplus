package app ;
import com.genexus.*;

public final  class StructSdtSDTClienteResumenEntradas_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClienteResumenEntradas_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtSDTClienteResumenEntradas_Level1Item.class ));
   }

   public StructSdtSDTClienteResumenEntradas_Level1Item( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk = new java.math.BigDecimal(0) ;
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

   public java.math.BigDecimal getUndent( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent ;
   }

   public void setUndent( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent = value ;
   }

   public int getPzsent( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent ;
   }

   public void setPzsent( int value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent = value ;
   }

   public java.math.BigDecimal getUnduti( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti ;
   }

   public void setUnduti( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti = value ;
   }

   public int getPzsuti( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti ;
   }

   public void setPzsuti( int value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti = value ;
   }

   public java.math.BigDecimal getUndstk( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk ;
   }

   public void setUndstk( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk = value ;
   }

   public int getPzsstk( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk ;
   }

   public void setPzsstk( int value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk = value ;
   }

   protected byte gxTv_SdtSDTClienteResumenEntradas_Level1Item_N ;
   protected int gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent ;
   protected int gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti ;
   protected int gxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti ;
   protected java.math.BigDecimal gxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk ;
}

