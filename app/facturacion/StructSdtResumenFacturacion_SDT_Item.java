package app.facturacion ;
import com.genexus.*;

public final  class StructSdtResumenFacturacion_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtResumenFacturacion_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtResumenFacturacion_SDT_Item.class ));
   }

   public StructSdtResumenFacturacion_SDT_Item( int remoteHandle ,
                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtResumenFacturacion_SDT_Item_Facfch = cal.getTime() ;
      gxTv_SdtResumenFacturacion_SDT_Item_Clinom = "" ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimptot = new java.math.BigDecimal(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimppp = new java.math.BigDecimal(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp = new java.math.BigDecimal(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen = new java.math.BigDecimal(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Factot = new java.math.BigDecimal(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra = new java.math.BigDecimal(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros = new java.math.BigDecimal(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio = new java.math.BigDecimal(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N = (byte)(1) ;
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

   public int getFaccod( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Faccod ;
   }

   public void setFaccod( int value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Faccod = value ;
   }

   public java.util.Date getFacfch( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facfch ;
   }

   public void setFacfch( java.util.Date value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facfch = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Clinom = value ;
   }

   public java.math.BigDecimal getFacimptot( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facimptot ;
   }

   public void setFacimptot( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimptot = value ;
   }

   public java.math.BigDecimal getFacimppp( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facimppp ;
   }

   public void setFacimppp( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimppp = value ;
   }

   public java.math.BigDecimal getFacivaimp( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp ;
   }

   public void setFacivaimp( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp = value ;
   }

   public java.math.BigDecimal getFacimpgen( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen ;
   }

   public void setFacimpgen( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen = value ;
   }

   public java.math.BigDecimal getFactot( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Factot ;
   }

   public void setFactot( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Factot = value ;
   }

   public java.math.BigDecimal getKgs_fra( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra ;
   }

   public void setKgs_fra( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra = value ;
   }

   public java.math.BigDecimal getKgs_otros( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros ;
   }

   public void setKgs_otros( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros = value ;
   }

   public java.math.BigDecimal getPre_medio( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio ;
   }

   public void setPre_medio( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio = value ;
   }

   public int getPzs_fra( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra ;
   }

   public void setPzs_fra( int value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra = value ;
   }

   protected byte gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtResumenFacturacion_SDT_Item_N ;
   protected int gxTv_SdtResumenFacturacion_SDT_Item_Faccod ;
   protected int gxTv_SdtResumenFacturacion_SDT_Item_Clicod ;
   protected int gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra ;
   protected String gxTv_SdtResumenFacturacion_SDT_Item_Clinom ;
   protected java.util.Date gxTv_SdtResumenFacturacion_SDT_Item_Facfch ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Facimptot ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Facimppp ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Factot ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio ;
}

