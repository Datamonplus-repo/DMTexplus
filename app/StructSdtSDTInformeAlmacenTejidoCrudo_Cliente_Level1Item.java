package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item.class ));
   }

   public StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( int remoteHandle ,
                                                                    ModelContext context )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres = new java.math.BigDecimal(0) ;
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

   public java.math.BigDecimal getUnidadesentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas ;
   }

   public void setUnidadesentradas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas = value ;
   }

   public java.math.BigDecimal getUnidadesutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas ;
   }

   public void setUnidadesutilizadas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas = value ;
   }

   public java.math.BigDecimal getUnidadeslibres( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres ;
   }

   public void setUnidadeslibres( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres = value ;
   }

   public int getPiezasentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas ;
   }

   public void setPiezasentradas( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas = value ;
   }

   public int getPiezasutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas ;
   }

   public void setPiezasutilizadas( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas = value ;
   }

   public int getPiezasdisponibles( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles ;
   }

   public void setPiezasdisponibles( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles = value ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres ;
}

