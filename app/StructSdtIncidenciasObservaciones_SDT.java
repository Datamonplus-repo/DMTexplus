package app ;
import com.genexus.*;

public final  class StructSdtIncidenciasObservaciones_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtIncidenciasObservaciones_SDT( )
   {
      this( -1, new ModelContext( StructSdtIncidenciasObservaciones_SDT.class ));
   }

   public StructSdtIncidenciasObservaciones_SDT( int remoteHandle ,
                                                 ModelContext context )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs = "" ;
      gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar = "" ;
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

   public String getInc_obs( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs ;
   }

   public void setInc_obs( String value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs = value ;
   }

   public int getFornumcol( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol ;
   }

   public void setFornumcol( int value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar = value ;
   }

   protected byte gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo ;
   protected byte gxTv_SdtIncidenciasObservaciones_SDT_N ;
   protected int gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol ;
   protected int gxTv_SdtIncidenciasObservaciones_SDT_Barcod ;
   protected String gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar ;
   protected String gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs ;
}

