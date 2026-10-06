package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtChartSDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtChartSDT_Item( )
   {
      this( -1, new ModelContext( StructSdtChartSDT_Item.class ));
   }

   public StructSdtChartSDT_Item( int remoteHandle ,
                                  ModelContext context )
   {
      gxTv_SdtChartSDT_Item_Dato = "" ;
      gxTv_SdtChartSDT_Item_Valor = new java.math.BigDecimal(0) ;
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

   public String getDato( )
   {
      return gxTv_SdtChartSDT_Item_Dato ;
   }

   public void setDato( String value )
   {
      gxTv_SdtChartSDT_Item_N = (byte)(0) ;
      gxTv_SdtChartSDT_Item_Dato = value ;
   }

   public java.math.BigDecimal getValor( )
   {
      return gxTv_SdtChartSDT_Item_Valor ;
   }

   public void setValor( java.math.BigDecimal value )
   {
      gxTv_SdtChartSDT_Item_N = (byte)(0) ;
      gxTv_SdtChartSDT_Item_Valor = value ;
   }

   protected byte gxTv_SdtChartSDT_Item_N ;
   protected String gxTv_SdtChartSDT_Item_Dato ;
   protected java.math.BigDecimal gxTv_SdtChartSDT_Item_Valor ;
}

