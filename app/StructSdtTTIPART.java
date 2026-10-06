package app ;
import com.genexus.*;

public final  class StructSdtTTIPART implements Cloneable, java.io.Serializable
{
   public StructSdtTTIPART( )
   {
      this( -1, new ModelContext( StructSdtTTIPART.class ));
   }

   public StructSdtTTIPART( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtTTIPART_Emprcod = "" ;
      gxTv_SdtTTIPART_Tipartdsc = "" ;
      gxTv_SdtTTIPART_Tipartdsc2 = "" ;
      gxTv_SdtTTIPART_Tipartclas = "" ;
      gxTv_SdtTTIPART_Tipartprod = new java.math.BigDecimal(0) ;
      gxTv_SdtTTIPART_Tipartest = "" ;
      gxTv_SdtTTIPART_Tipartact = "" ;
      gxTv_SdtTTIPART_Tipartcoddsc = "" ;
      gxTv_SdtTTIPART_Id_tipartdsc = "" ;
      gxTv_SdtTTIPART_Mode = "" ;
      gxTv_SdtTTIPART_Emprcod_Z = "" ;
      gxTv_SdtTTIPART_Tipartdsc_Z = "" ;
      gxTv_SdtTTIPART_Tipartdsc2_Z = "" ;
      gxTv_SdtTTIPART_Tipartclas_Z = "" ;
      gxTv_SdtTTIPART_Tipartprod_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTTIPART_Tipartest_Z = "" ;
      gxTv_SdtTTIPART_Tipartact_Z = "" ;
      gxTv_SdtTTIPART_Tipartcoddsc_Z = "" ;
      gxTv_SdtTTIPART_Id_tipartdsc_Z = "" ;
      gxTv_SdtTTIPART_Tipartdsc_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartdsc2_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartclas_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartctb_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartprod_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartdias_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartest_N = (byte)(1) ;
      gxTv_SdtTTIPART_Tipartord_N = (byte)(1) ;
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
      return gxTv_SdtTTIPART_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Emprcod = value ;
   }

   public short getTipartcod( )
   {
      return gxTv_SdtTTIPART_Tipartcod ;
   }

   public void setTipartcod( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartcod = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtTTIPART_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtTTIPART_Tipartdsc_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdsc = value ;
   }

   public String getTipartdsc2( )
   {
      return gxTv_SdtTTIPART_Tipartdsc2 ;
   }

   public void setTipartdsc2( String value )
   {
      gxTv_SdtTTIPART_Tipartdsc2_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdsc2 = value ;
   }

   public String getTipartclas( )
   {
      return gxTv_SdtTTIPART_Tipartclas ;
   }

   public void setTipartclas( String value )
   {
      gxTv_SdtTTIPART_Tipartclas_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartclas = value ;
   }

   public byte getTipartctb( )
   {
      return gxTv_SdtTTIPART_Tipartctb ;
   }

   public void setTipartctb( byte value )
   {
      gxTv_SdtTTIPART_Tipartctb_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartctb = value ;
   }

   public java.math.BigDecimal getTipartprod( )
   {
      return gxTv_SdtTTIPART_Tipartprod ;
   }

   public void setTipartprod( java.math.BigDecimal value )
   {
      gxTv_SdtTTIPART_Tipartprod_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartprod = value ;
   }

   public short getTipartdias( )
   {
      return gxTv_SdtTTIPART_Tipartdias ;
   }

   public void setTipartdias( short value )
   {
      gxTv_SdtTTIPART_Tipartdias_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdias = value ;
   }

   public String getTipartest( )
   {
      return gxTv_SdtTTIPART_Tipartest ;
   }

   public void setTipartest( String value )
   {
      gxTv_SdtTTIPART_Tipartest_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartest = value ;
   }

   public short getTipartord( )
   {
      return gxTv_SdtTTIPART_Tipartord ;
   }

   public void setTipartord( short value )
   {
      gxTv_SdtTTIPART_Tipartord_N = (byte)(0) ;
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartord = value ;
   }

   public String getTipartact( )
   {
      return gxTv_SdtTTIPART_Tipartact ;
   }

   public void setTipartact( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartact = value ;
   }

   public String getTipartcoddsc( )
   {
      return gxTv_SdtTTIPART_Tipartcoddsc ;
   }

   public void setTipartcoddsc( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartcoddsc = value ;
   }

   public String getId_tipartdsc( )
   {
      return gxTv_SdtTTIPART_Id_tipartdsc ;
   }

   public void setId_tipartdsc( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Id_tipartdsc = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTTIPART_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTTIPART_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTTIPART_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Emprcod_Z = value ;
   }

   public short getTipartcod_Z( )
   {
      return gxTv_SdtTTIPART_Tipartcod_Z ;
   }

   public void setTipartcod_Z( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartcod_Z = value ;
   }

   public String getTipartdsc_Z( )
   {
      return gxTv_SdtTTIPART_Tipartdsc_Z ;
   }

   public void setTipartdsc_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdsc_Z = value ;
   }

   public String getTipartdsc2_Z( )
   {
      return gxTv_SdtTTIPART_Tipartdsc2_Z ;
   }

   public void setTipartdsc2_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdsc2_Z = value ;
   }

   public String getTipartclas_Z( )
   {
      return gxTv_SdtTTIPART_Tipartclas_Z ;
   }

   public void setTipartclas_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartclas_Z = value ;
   }

   public byte getTipartctb_Z( )
   {
      return gxTv_SdtTTIPART_Tipartctb_Z ;
   }

   public void setTipartctb_Z( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartctb_Z = value ;
   }

   public java.math.BigDecimal getTipartprod_Z( )
   {
      return gxTv_SdtTTIPART_Tipartprod_Z ;
   }

   public void setTipartprod_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartprod_Z = value ;
   }

   public short getTipartdias_Z( )
   {
      return gxTv_SdtTTIPART_Tipartdias_Z ;
   }

   public void setTipartdias_Z( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdias_Z = value ;
   }

   public String getTipartest_Z( )
   {
      return gxTv_SdtTTIPART_Tipartest_Z ;
   }

   public void setTipartest_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartest_Z = value ;
   }

   public short getTipartord_Z( )
   {
      return gxTv_SdtTTIPART_Tipartord_Z ;
   }

   public void setTipartord_Z( short value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartord_Z = value ;
   }

   public String getTipartact_Z( )
   {
      return gxTv_SdtTTIPART_Tipartact_Z ;
   }

   public void setTipartact_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartact_Z = value ;
   }

   public String getTipartcoddsc_Z( )
   {
      return gxTv_SdtTTIPART_Tipartcoddsc_Z ;
   }

   public void setTipartcoddsc_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartcoddsc_Z = value ;
   }

   public String getId_tipartdsc_Z( )
   {
      return gxTv_SdtTTIPART_Id_tipartdsc_Z ;
   }

   public void setId_tipartdsc_Z( String value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Id_tipartdsc_Z = value ;
   }

   public byte getTipartcod_N( )
   {
      return gxTv_SdtTTIPART_Tipartcod_N ;
   }

   public void setTipartcod_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartcod_N = value ;
   }

   public byte getTipartdsc_N( )
   {
      return gxTv_SdtTTIPART_Tipartdsc_N ;
   }

   public void setTipartdsc_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdsc_N = value ;
   }

   public byte getTipartdsc2_N( )
   {
      return gxTv_SdtTTIPART_Tipartdsc2_N ;
   }

   public void setTipartdsc2_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdsc2_N = value ;
   }

   public byte getTipartclas_N( )
   {
      return gxTv_SdtTTIPART_Tipartclas_N ;
   }

   public void setTipartclas_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartclas_N = value ;
   }

   public byte getTipartctb_N( )
   {
      return gxTv_SdtTTIPART_Tipartctb_N ;
   }

   public void setTipartctb_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartctb_N = value ;
   }

   public byte getTipartprod_N( )
   {
      return gxTv_SdtTTIPART_Tipartprod_N ;
   }

   public void setTipartprod_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartprod_N = value ;
   }

   public byte getTipartdias_N( )
   {
      return gxTv_SdtTTIPART_Tipartdias_N ;
   }

   public void setTipartdias_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartdias_N = value ;
   }

   public byte getTipartest_N( )
   {
      return gxTv_SdtTTIPART_Tipartest_N ;
   }

   public void setTipartest_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartest_N = value ;
   }

   public byte getTipartord_N( )
   {
      return gxTv_SdtTTIPART_Tipartord_N ;
   }

   public void setTipartord_N( byte value )
   {
      gxTv_SdtTTIPART_N = (byte)(0) ;
      gxTv_SdtTTIPART_Tipartord_N = value ;
   }

   protected byte gxTv_SdtTTIPART_Tipartctb ;
   protected byte gxTv_SdtTTIPART_Tipartctb_Z ;
   protected byte gxTv_SdtTTIPART_Tipartcod_N ;
   protected byte gxTv_SdtTTIPART_Tipartdsc_N ;
   protected byte gxTv_SdtTTIPART_Tipartdsc2_N ;
   protected byte gxTv_SdtTTIPART_Tipartclas_N ;
   protected byte gxTv_SdtTTIPART_Tipartctb_N ;
   protected byte gxTv_SdtTTIPART_Tipartprod_N ;
   protected byte gxTv_SdtTTIPART_Tipartdias_N ;
   protected byte gxTv_SdtTTIPART_Tipartest_N ;
   protected byte gxTv_SdtTTIPART_Tipartord_N ;
   private byte gxTv_SdtTTIPART_N ;
   protected short gxTv_SdtTTIPART_Tipartcod ;
   protected short gxTv_SdtTTIPART_Tipartdias ;
   protected short gxTv_SdtTTIPART_Tipartord ;
   protected short gxTv_SdtTTIPART_Initialized ;
   protected short gxTv_SdtTTIPART_Tipartcod_Z ;
   protected short gxTv_SdtTTIPART_Tipartdias_Z ;
   protected short gxTv_SdtTTIPART_Tipartord_Z ;
   protected String gxTv_SdtTTIPART_Emprcod ;
   protected String gxTv_SdtTTIPART_Tipartdsc ;
   protected String gxTv_SdtTTIPART_Tipartdsc2 ;
   protected String gxTv_SdtTTIPART_Tipartclas ;
   protected String gxTv_SdtTTIPART_Tipartest ;
   protected String gxTv_SdtTTIPART_Tipartact ;
   protected String gxTv_SdtTTIPART_Id_tipartdsc ;
   protected String gxTv_SdtTTIPART_Mode ;
   protected String gxTv_SdtTTIPART_Emprcod_Z ;
   protected String gxTv_SdtTTIPART_Tipartdsc_Z ;
   protected String gxTv_SdtTTIPART_Tipartdsc2_Z ;
   protected String gxTv_SdtTTIPART_Tipartclas_Z ;
   protected String gxTv_SdtTTIPART_Tipartest_Z ;
   protected String gxTv_SdtTTIPART_Tipartact_Z ;
   protected String gxTv_SdtTTIPART_Id_tipartdsc_Z ;
   protected String gxTv_SdtTTIPART_Tipartcoddsc ;
   protected String gxTv_SdtTTIPART_Tipartcoddsc_Z ;
   protected java.math.BigDecimal gxTv_SdtTTIPART_Tipartprod ;
   protected java.math.BigDecimal gxTv_SdtTTIPART_Tipartprod_Z ;
}

