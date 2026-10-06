package app.facturacion ;
import com.genexus.*;

public final  class StructSdtFilterMantenimientoFactura_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtFilterMantenimientoFactura_SDT( )
   {
      this( -1, new ModelContext( StructSdtFilterMantenimientoFactura_SDT.class ));
   }

   public StructSdtFilterMantenimientoFactura_SDT( int remoteHandle ,
                                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom = cal.getTime() ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto = cal.getTime() ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facpri = "" ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N = (byte)(1) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N = (byte)(1) ;
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
      return gxTv_SdtFilterMantenimientoFactura_SDT_Faccod ;
   }

   public void setFaccod( int value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Faccod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Clicod = value ;
   }

   public java.util.Date getFacfchfrom( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom ;
   }

   public void setFacfchfrom( java.util.Date value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom = value ;
   }

   public java.util.Date getFacfchto( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto ;
   }

   public void setFacfchto( java.util.Date value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto = value ;
   }

   public String getFacpri( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Facpri ;
   }

   public void setFacpri( String value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facpri = value ;
   }

   protected byte gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N ;
   protected byte gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N ;
   protected byte gxTv_SdtFilterMantenimientoFactura_SDT_N ;
   protected int gxTv_SdtFilterMantenimientoFactura_SDT_Faccod ;
   protected int gxTv_SdtFilterMantenimientoFactura_SDT_Clicod ;
   protected String gxTv_SdtFilterMantenimientoFactura_SDT_Facpri ;
   protected java.util.Date gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom ;
   protected java.util.Date gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto ;
}

