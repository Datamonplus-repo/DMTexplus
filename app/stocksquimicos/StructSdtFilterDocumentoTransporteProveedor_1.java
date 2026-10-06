package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtFilterDocumentoTransporteProveedor_1 implements Cloneable, java.io.Serializable
{
   public StructSdtFilterDocumentoTransporteProveedor_1( )
   {
      this( -1, new ModelContext( StructSdtFilterDocumentoTransporteProveedor_1.class ));
   }

   public StructSdtFilterDocumentoTransporteProveedor_1( int remoteHandle ,
                                                         ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado = "" ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom = cal.getTime() ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto = cal.getTime() ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N = (byte)(1) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N = (byte)(1) ;
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

   public int getAlbproid( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid ;
   }

   public void setAlbproid( int value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid = value ;
   }

   public String getAlbproanulado( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado ;
   }

   public void setAlbproanulado( String value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado = value ;
   }

   public int getAlbproprvid( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid ;
   }

   public void setAlbproprvid( int value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid = value ;
   }

   public java.util.Date getAlbprodatefrom( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom ;
   }

   public void setAlbprodatefrom( java.util.Date value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom = value ;
   }

   public java.util.Date getAlbprodateto( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto ;
   }

   public void setAlbprodateto( java.util.Date value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto = value ;
   }

   protected byte gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N ;
   protected byte gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N ;
   protected byte gxTv_SdtFilterDocumentoTransporteProveedor_1_N ;
   protected int gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid ;
   protected int gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid ;
   protected String gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado ;
   protected java.util.Date gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom ;
   protected java.util.Date gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto ;
}

