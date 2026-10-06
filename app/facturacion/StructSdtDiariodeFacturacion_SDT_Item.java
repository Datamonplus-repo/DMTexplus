package app.facturacion ;
import com.genexus.*;

public final  class StructSdtDiariodeFacturacion_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtDiariodeFacturacion_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtDiariodeFacturacion_SDT_Item.class ));
   }

   public StructSdtDiariodeFacturacion_SDT_Item( int remoteHandle ,
                                                 ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch = cal.getTime() ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom = "" ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Factot = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N = (byte)(1) ;
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

   public java.util.Date getFacfch( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch ;
   }

   public void setFacfch( java.util.Date value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch = value ;
   }

   public int getFaccod( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod ;
   }

   public void setFaccod( int value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom = value ;
   }

   public java.math.BigDecimal getFacimptot( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot ;
   }

   public void setFacimptot( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot = value ;
   }

   public java.math.BigDecimal getFacimpgen( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen ;
   }

   public void setFacimpgen( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen = value ;
   }

   public java.math.BigDecimal getFacimppp( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp ;
   }

   public void setFacimppp( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp = value ;
   }

   public java.math.BigDecimal getFacbasimp( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp ;
   }

   public void setFacbasimp( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp = value ;
   }

   public java.math.BigDecimal getFacivaimp( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp ;
   }

   public void setFacivaimp( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp = value ;
   }

   public java.math.BigDecimal getFactot( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Factot ;
   }

   public void setFactot( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Factot = value ;
   }

   protected byte gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtDiariodeFacturacion_SDT_Item_N ;
   protected int gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod ;
   protected int gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod ;
   protected String gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom ;
   protected java.util.Date gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Factot ;
}

