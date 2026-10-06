package app.documentotransportecomercial ;
import com.genexus.*;

public final  class StructSdtFilterdocumentotransportecomercial_cabeceraww implements Cloneable, java.io.Serializable
{
   public StructSdtFilterdocumentotransportecomercial_cabeceraww( )
   {
      this( -1, new ModelContext( StructSdtFilterdocumentotransportecomercial_cabeceraww.class ));
   }

   public StructSdtFilterdocumentotransportecomercial_cabeceraww( int remoteHandle ,
                                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst = "" ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom = cal.getTime() ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto = cal.getTime() ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad = "" ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N = (byte)(1) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N = (byte)(1) ;
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

   public int getAlbcomcod( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod ;
   }

   public void setAlbcomcod( int value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod = value ;
   }

   public String getAlbcomst( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst ;
   }

   public void setAlbcomst( String value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod = value ;
   }

   public java.util.Date getAlbcomfchfrom( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom ;
   }

   public void setAlbcomfchfrom( java.util.Date value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom = value ;
   }

   public java.util.Date getAlbcomfchto( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto ;
   }

   public void setAlbcomfchto( java.util.Date value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto = value ;
   }

   public String getPrioridad( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad ;
   }

   public void setPrioridad( String value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad = value ;
   }

   protected byte gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N ;
   protected byte gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N ;
   protected byte gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N ;
   protected int gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod ;
   protected int gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod ;
   protected String gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst ;
   protected String gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad ;
   protected java.util.Date gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom ;
   protected java.util.Date gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto ;
}

