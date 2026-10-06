package app.documentotransporteproduccion ;
import com.genexus.*;

public final  class StructSdtFilterDocumentodeTransporteProduccion_1 implements Cloneable, java.io.Serializable
{
   public StructSdtFilterDocumentodeTransporteProduccion_1( )
   {
      this( -1, new ModelContext( StructSdtFilterDocumentodeTransporteProduccion_1.class ));
   }

   public StructSdtFilterDocumentodeTransporteProduccion_1( int remoteHandle ,
                                                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca = "" ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom = cal.getTime() ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto = cal.getTime() ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad = "" ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N = (byte)(1) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N = (byte)(1) ;
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

   public long getAlbprocod( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod ;
   }

   public void setAlbprocod( long value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod = value ;
   }

   public String getAlbmarca( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca ;
   }

   public void setAlbmarca( String value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod = value ;
   }

   public java.util.Date getAlbprofchfrom( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom ;
   }

   public void setAlbprofchfrom( java.util.Date value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom = value ;
   }

   public java.util.Date getAlbprofchto( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto ;
   }

   public void setAlbprofchto( java.util.Date value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto = value ;
   }

   public String getPrioridad( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad ;
   }

   public void setPrioridad( String value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad = value ;
   }

   protected byte gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N ;
   protected byte gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N ;
   protected byte gxTv_SdtFilterDocumentodeTransporteProduccion_1_N ;
   protected int gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod ;
   protected long gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod ;
   protected String gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca ;
   protected String gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad ;
   protected java.util.Date gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom ;
   protected java.util.Date gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto ;
}

