package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtSalidasManualesProductos_Cabecera implements Cloneable, java.io.Serializable
{
   public StructSdtSalidasManualesProductos_Cabecera( )
   {
      this( -1, new ModelContext( StructSdtSalidasManualesProductos_Cabecera.class ));
   }

   public StructSdtSalidasManualesProductos_Cabecera( int remoteHandle ,
                                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec = cal.getTime() ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Mode = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z = cal.getTime() ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = (byte)(1) ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod = value ;
   }

   public int getCumcodcont( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont ;
   }

   public void setCumcodcont( int value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom = value ;
   }

   public java.util.Date getCumconfec( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec ;
   }

   public void setCumconfec( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec = value ;
   }

   public short getCcocod( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod ;
   }

   public void setCcocod( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod = value ;
   }

   public short getCumccos( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos ;
   }

   public void setCumccos( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos = value ;
   }

   public String getCumccosd( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd ;
   }

   public void setCumccosd( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd = value ;
   }

   public byte getCumcontipo( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo ;
   }

   public void setCumcontipo( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo = value ;
   }

   public byte getCc_almcd( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd ;
   }

   public void setCc_almcd( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd = value ;
   }

   public String getCc_almdc( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc ;
   }

   public void setCc_almdc( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z = value ;
   }

   public int getCumcodcont_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z ;
   }

   public void setCumcodcont_Z( int value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z = value ;
   }

   public java.util.Date getCumconfec_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z ;
   }

   public void setCumconfec_Z( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z = value ;
   }

   public short getCcocod_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z ;
   }

   public void setCcocod_Z( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z = value ;
   }

   public short getCumccos_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z ;
   }

   public void setCumccos_Z( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z = value ;
   }

   public String getCumccosd_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z ;
   }

   public void setCumccosd_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z = value ;
   }

   public byte getCumcontipo_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z ;
   }

   public void setCumcontipo_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z = value ;
   }

   public byte getCc_almcd_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z ;
   }

   public void setCc_almcd_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z = value ;
   }

   public String getCc_almdc_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z ;
   }

   public void setCc_almdc_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z = value ;
   }

   public int getBarcod_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z ;
   }

   public void setBarcod_Z( int value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z = value ;
   }

   public byte getBarcodreo_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z ;
   }

   public void setBarcodreo_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z = value ;
   }

   public String getBarcodpar_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z ;
   }

   public void setBarcodpar_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = value ;
   }

   public byte getCcocod_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N ;
   }

   public void setCcocod_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = value ;
   }

   public byte getCc_almcd_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N ;
   }

   public void setCc_almcd_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = value ;
   }

   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo ;
   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd ;
   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo ;
   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z ;
   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z ;
   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z ;
   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N ;
   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N ;
   protected byte gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_N ;
   protected short gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod ;
   protected short gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos ;
   protected short gxTv_SdtSalidasManualesProductos_Cabecera_Initialized ;
   protected short gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z ;
   protected short gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z ;
   protected int gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont ;
   protected int gxTv_SdtSalidasManualesProductos_Cabecera_Barcod ;
   protected int gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z ;
   protected int gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Mode ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z ;
   protected java.util.Date gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec ;
   protected java.util.Date gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z ;
}

