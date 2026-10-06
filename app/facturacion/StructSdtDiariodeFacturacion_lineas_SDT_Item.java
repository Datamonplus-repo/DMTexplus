package app.facturacion ;
import com.genexus.*;

public final  class StructSdtDiariodeFacturacion_lineas_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtDiariodeFacturacion_lineas_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtDiariodeFacturacion_lineas_SDT_Item.class ));
   }

   public StructSdtDiariodeFacturacion_lineas_SDT_Item( int remoteHandle ,
                                                        ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch = cal.getTime() ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom = "" ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch = cal.getTime() ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser = "" ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color = "" ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp = new java.math.BigDecimal(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr = "" ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N = (byte)(1) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N = (byte)(1) ;
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
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch ;
   }

   public void setFacfch( java.util.Date value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch = value ;
   }

   public int getFaccod( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod ;
   }

   public void setFaccod( int value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom = value ;
   }

   public long getFacalbcod( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod ;
   }

   public void setFacalbcod( long value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod = value ;
   }

   public java.util.Date getAlbprofch( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch ;
   }

   public void setAlbprofch( java.util.Date value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch = value ;
   }

   public String getFacser( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser ;
   }

   public void setFacser( String value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser = value ;
   }

   public String getColor( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color ;
   }

   public void setColor( String value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color = value ;
   }

   public java.math.BigDecimal getFackgs( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs ;
   }

   public void setFackgs( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs = value ;
   }

   public java.math.BigDecimal getFacprekgs( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs ;
   }

   public void setFacprekgs( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs = value ;
   }

   public java.math.BigDecimal getFacmts( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts ;
   }

   public void setFacmts( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts = value ;
   }

   public java.math.BigDecimal getFacpremts( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts ;
   }

   public void setFacpremts( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts = value ;
   }

   public int getBaralbpie( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie ;
   }

   public void setBaralbpie( int value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie = value ;
   }

   public java.math.BigDecimal getFacimp( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp ;
   }

   public void setFacimp( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr = value ;
   }

   protected byte gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N ;
   protected byte gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N ;
   protected int gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod ;
   protected int gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod ;
   protected int gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie ;
   protected long gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod ;
   protected String gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom ;
   protected String gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser ;
   protected String gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color ;
   protected String gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr ;
   protected java.util.Date gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch ;
   protected java.util.Date gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp ;
}

