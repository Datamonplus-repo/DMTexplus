package app ;
import com.genexus.*;

public final  class StructSdtSDTDistribuciondeUnidades_HdrsItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDistribuciondeUnidades_HdrsItem( )
   {
      this( -1, new ModelContext( StructSdtSDTDistribuciondeUnidades_HdrsItem.class ));
   }

   public StructSdtSDTDistribuciondeUnidades_HdrsItem( int remoteHandle ,
                                                       ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr = cal.getTime() ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N = (byte)(1) ;
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

   public String getHdr( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr ;
   }

   public void setHdr( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr = value ;
   }

   public java.util.Date getFechahdr( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr ;
   }

   public void setFechahdr( java.util.Date value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr = value ;
   }

   public String getArticulo( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo ;
   }

   public void setArticulo( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion = value ;
   }

   public String getColor( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color ;
   }

   public void setColor( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color = value ;
   }

   public int getNumero( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero ;
   }

   public void setNumero( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero = value ;
   }

   public String getColorcliente( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente ;
   }

   public void setColorcliente( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente = value ;
   }

   public int getNumerocliente( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente ;
   }

   public void setNumerocliente( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente = value ;
   }

   public java.math.BigDecimal getKiloshdr( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr ;
   }

   public void setKiloshdr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr = value ;
   }

   public java.math.BigDecimal getMetroshdr( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr ;
   }

   public void setMetroshdr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr = value ;
   }

   public java.util.Vector<app.StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> getAlbaranes( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes ;
   }

   public void setAlbaranes( java.util.Vector<app.StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes = value ;
   }

   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente ;
   protected java.util.Date gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr ;
   protected java.util.Vector<app.StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes=null ;
}

