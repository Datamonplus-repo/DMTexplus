package app.produccion ;
import com.genexus.*;

public final  class StructSdtCONPRODUC implements Cloneable, java.io.Serializable
{
   public StructSdtCONPRODUC( )
   {
      this( -1, new ModelContext( StructSdtCONPRODUC.class ));
   }

   public StructSdtCONPRODUC( int remoteHandle ,
                              ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtCONPRODUC_Cp_emprcod = "" ;
      gxTv_SdtCONPRODUC_Cp_clinom = "" ;
      gxTv_SdtCONPRODUC_Cp_barcodpar = "" ;
      gxTv_SdtCONPRODUC_Cp_barfecfpr = cal.getTime() ;
      gxTv_SdtCONPRODUC_Cp_barplf = "" ;
      gxTv_SdtCONPRODUC_Cp_barfeccli = cal.getTime() ;
      gxTv_SdtCONPRODUC_Cp_barfecsal = cal.getTime() ;
      gxTv_SdtCONPRODUC_Cp_barfecgen = cal.getTime() ;
      gxTv_SdtCONPRODUC_Cp_barser = "" ;
      gxTv_SdtCONPRODUC_Cp_barserdsc = "" ;
      gxTv_SdtCONPRODUC_Cp_barcolo = "" ;
      gxTv_SdtCONPRODUC_Cp_barnomcli = "" ;
      gxTv_SdtCONPRODUC_Cp_tartdsc = "" ;
      gxTv_SdtCONPRODUC_Cp_bargirar = "" ;
      gxTv_SdtCONPRODUC_Cp_baragrest = "" ;
      gxTv_SdtCONPRODUC_Cp_disdes = "" ;
      gxTv_SdtCONPRODUC_Cp_barproper = "" ;
      gxTv_SdtCONPRODUC_Cp_dsc_bar = "" ;
      gxTv_SdtCONPRODUC_Cp_bardisnum = "" ;
      gxTv_SdtCONPRODUC_Cp_barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtCONPRODUC_Cp_barmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtCONPRODUC_Cp_baralbk = new java.math.BigDecimal(0) ;
      gxTv_SdtCONPRODUC_Cp_baralbm = new java.math.BigDecimal(0) ;
      gxTv_SdtCONPRODUC_Cp_barenccli = "" ;
      gxTv_SdtCONPRODUC_Cp_disusrc = "" ;
      gxTv_SdtCONPRODUC_Cp_barmaqcd = "" ;
      gxTv_SdtCONPRODUC_Mode = "" ;
      gxTv_SdtCONPRODUC_Cp_emprcod_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_clinom_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barcodpar_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barfecfpr_Z = cal.getTime() ;
      gxTv_SdtCONPRODUC_Cp_barplf_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barfeccli_Z = cal.getTime() ;
      gxTv_SdtCONPRODUC_Cp_barfecsal_Z = cal.getTime() ;
      gxTv_SdtCONPRODUC_Cp_barfecgen_Z = cal.getTime() ;
      gxTv_SdtCONPRODUC_Cp_barser_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barserdsc_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barcolo_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barnomcli_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_tartdsc_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_bargirar_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_baragrest_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_disdes_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barproper_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_dsc_bar_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_bardisnum_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barkgm_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtCONPRODUC_Cp_barmtr_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtCONPRODUC_Cp_baralbk_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtCONPRODUC_Cp_baralbm_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtCONPRODUC_Cp_barenccli_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_disusrc_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barmaqcd_Z = "" ;
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

   public long getCp_id( )
   {
      return gxTv_SdtCONPRODUC_Cp_id ;
   }

   public void setCp_id( long value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_id = value ;
   }

   public String getCp_emprcod( )
   {
      return gxTv_SdtCONPRODUC_Cp_emprcod ;
   }

   public void setCp_emprcod( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_emprcod = value ;
   }

   public int getCp_clicod( )
   {
      return gxTv_SdtCONPRODUC_Cp_clicod ;
   }

   public void setCp_clicod( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_clicod = value ;
   }

   public String getCp_clinom( )
   {
      return gxTv_SdtCONPRODUC_Cp_clinom ;
   }

   public void setCp_clinom( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_clinom = value ;
   }

   public int getCp_barcod( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcod ;
   }

   public void setCp_barcod( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcod = value ;
   }

   public byte getCp_barcodreo( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcodreo ;
   }

   public void setCp_barcodreo( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcodreo = value ;
   }

   public String getCp_barcodpar( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcodpar ;
   }

   public void setCp_barcodpar( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcodpar = value ;
   }

   public java.util.Date getCp_barfecfpr( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecfpr ;
   }

   public void setCp_barfecfpr( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barfecfpr = value ;
   }

   public int getCp_barnumcli( )
   {
      return gxTv_SdtCONPRODUC_Cp_barnumcli ;
   }

   public void setCp_barnumcli( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barnumcli = value ;
   }

   public String getCp_barplf( )
   {
      return gxTv_SdtCONPRODUC_Cp_barplf ;
   }

   public void setCp_barplf( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barplf = value ;
   }

   public byte getCp_barsit( )
   {
      return gxTv_SdtCONPRODUC_Cp_barsit ;
   }

   public void setCp_barsit( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barsit = value ;
   }

   public java.util.Date getCp_barfeccli( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfeccli ;
   }

   public void setCp_barfeccli( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barfeccli = value ;
   }

   public java.util.Date getCp_barfecsal( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecsal ;
   }

   public void setCp_barfecsal( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barfecsal = value ;
   }

   public java.util.Date getCp_barfecgen( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecgen ;
   }

   public void setCp_barfecgen( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barfecgen = value ;
   }

   public String getCp_barser( )
   {
      return gxTv_SdtCONPRODUC_Cp_barser ;
   }

   public void setCp_barser( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barser = value ;
   }

   public String getCp_barserdsc( )
   {
      return gxTv_SdtCONPRODUC_Cp_barserdsc ;
   }

   public void setCp_barserdsc( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barserdsc = value ;
   }

   public String getCp_barcolo( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcolo ;
   }

   public void setCp_barcolo( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcolo = value ;
   }

   public int getCp_barcolu( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcolu ;
   }

   public void setCp_barcolu( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcolu = value ;
   }

   public String getCp_barnomcli( )
   {
      return gxTv_SdtCONPRODUC_Cp_barnomcli ;
   }

   public void setCp_barnomcli( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barnomcli = value ;
   }

   public short getCp_bartipart( )
   {
      return gxTv_SdtCONPRODUC_Cp_bartipart ;
   }

   public void setCp_bartipart( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_bartipart = value ;
   }

   public String getCp_tartdsc( )
   {
      return gxTv_SdtCONPRODUC_Cp_tartdsc ;
   }

   public void setCp_tartdsc( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_tartdsc = value ;
   }

   public String getCp_bargirar( )
   {
      return gxTv_SdtCONPRODUC_Cp_bargirar ;
   }

   public void setCp_bargirar( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_bargirar = value ;
   }

   public short getCp_baracaanh( )
   {
      return gxTv_SdtCONPRODUC_Cp_baracaanh ;
   }

   public void setCp_baracaanh( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_baracaanh = value ;
   }

   public String getCp_baragrest( )
   {
      return gxTv_SdtCONPRODUC_Cp_baragrest ;
   }

   public void setCp_baragrest( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_baragrest = value ;
   }

   public byte getCp_barext( )
   {
      return gxTv_SdtCONPRODUC_Cp_barext ;
   }

   public void setCp_barext( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barext = value ;
   }

   public String getCp_disdes( )
   {
      return gxTv_SdtCONPRODUC_Cp_disdes ;
   }

   public void setCp_disdes( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_disdes = value ;
   }

   public int getCp_discod( )
   {
      return gxTv_SdtCONPRODUC_Cp_discod ;
   }

   public void setCp_discod( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_discod = value ;
   }

   public String getCp_barproper( )
   {
      return gxTv_SdtCONPRODUC_Cp_barproper ;
   }

   public void setCp_barproper( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barproper = value ;
   }

   public String getCp_dsc_bar( )
   {
      return gxTv_SdtCONPRODUC_Cp_dsc_bar ;
   }

   public void setCp_dsc_bar( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_dsc_bar = value ;
   }

   public String getCp_bardisnum( )
   {
      return gxTv_SdtCONPRODUC_Cp_bardisnum ;
   }

   public void setCp_bardisnum( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_bardisnum = value ;
   }

   public java.math.BigDecimal getCp_barkgm( )
   {
      return gxTv_SdtCONPRODUC_Cp_barkgm ;
   }

   public void setCp_barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barkgm = value ;
   }

   public java.math.BigDecimal getCp_barmtr( )
   {
      return gxTv_SdtCONPRODUC_Cp_barmtr ;
   }

   public void setCp_barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barmtr = value ;
   }

   public int getCp_barpie( )
   {
      return gxTv_SdtCONPRODUC_Cp_barpie ;
   }

   public void setCp_barpie( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barpie = value ;
   }

   public java.math.BigDecimal getCp_baralbk( )
   {
      return gxTv_SdtCONPRODUC_Cp_baralbk ;
   }

   public void setCp_baralbk( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_baralbk = value ;
   }

   public java.math.BigDecimal getCp_baralbm( )
   {
      return gxTv_SdtCONPRODUC_Cp_baralbm ;
   }

   public void setCp_baralbm( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_baralbm = value ;
   }

   public String getCp_barenccli( )
   {
      return gxTv_SdtCONPRODUC_Cp_barenccli ;
   }

   public void setCp_barenccli( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barenccli = value ;
   }

   public String getCp_disusrc( )
   {
      return gxTv_SdtCONPRODUC_Cp_disusrc ;
   }

   public void setCp_disusrc( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_disusrc = value ;
   }

   public String getCp_barmaqcd( )
   {
      return gxTv_SdtCONPRODUC_Cp_barmaqcd ;
   }

   public void setCp_barmaqcd( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barmaqcd = value ;
   }

   public byte getCp_barestr( )
   {
      return gxTv_SdtCONPRODUC_Cp_barestr ;
   }

   public void setCp_barestr( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barestr = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtCONPRODUC_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtCONPRODUC_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Initialized = value ;
   }

   public long getCp_id_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_id_Z ;
   }

   public void setCp_id_Z( long value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_id_Z = value ;
   }

   public String getCp_emprcod_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_emprcod_Z ;
   }

   public void setCp_emprcod_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_emprcod_Z = value ;
   }

   public int getCp_clicod_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_clicod_Z ;
   }

   public void setCp_clicod_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_clicod_Z = value ;
   }

   public String getCp_clinom_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_clinom_Z ;
   }

   public void setCp_clinom_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_clinom_Z = value ;
   }

   public int getCp_barcod_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcod_Z ;
   }

   public void setCp_barcod_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcod_Z = value ;
   }

   public byte getCp_barcodreo_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcodreo_Z ;
   }

   public void setCp_barcodreo_Z( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcodreo_Z = value ;
   }

   public String getCp_barcodpar_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcodpar_Z ;
   }

   public void setCp_barcodpar_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcodpar_Z = value ;
   }

   public java.util.Date getCp_barfecfpr_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecfpr_Z ;
   }

   public void setCp_barfecfpr_Z( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barfecfpr_Z = value ;
   }

   public int getCp_barnumcli_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barnumcli_Z ;
   }

   public void setCp_barnumcli_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barnumcli_Z = value ;
   }

   public String getCp_barplf_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barplf_Z ;
   }

   public void setCp_barplf_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barplf_Z = value ;
   }

   public byte getCp_barsit_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barsit_Z ;
   }

   public void setCp_barsit_Z( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barsit_Z = value ;
   }

   public java.util.Date getCp_barfeccli_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfeccli_Z ;
   }

   public void setCp_barfeccli_Z( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barfeccli_Z = value ;
   }

   public java.util.Date getCp_barfecsal_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecsal_Z ;
   }

   public void setCp_barfecsal_Z( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barfecsal_Z = value ;
   }

   public java.util.Date getCp_barfecgen_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecgen_Z ;
   }

   public void setCp_barfecgen_Z( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barfecgen_Z = value ;
   }

   public String getCp_barser_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barser_Z ;
   }

   public void setCp_barser_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barser_Z = value ;
   }

   public String getCp_barserdsc_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barserdsc_Z ;
   }

   public void setCp_barserdsc_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barserdsc_Z = value ;
   }

   public String getCp_barcolo_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcolo_Z ;
   }

   public void setCp_barcolo_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcolo_Z = value ;
   }

   public int getCp_barcolu_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcolu_Z ;
   }

   public void setCp_barcolu_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barcolu_Z = value ;
   }

   public String getCp_barnomcli_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barnomcli_Z ;
   }

   public void setCp_barnomcli_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barnomcli_Z = value ;
   }

   public short getCp_bartipart_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_bartipart_Z ;
   }

   public void setCp_bartipart_Z( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_bartipart_Z = value ;
   }

   public String getCp_tartdsc_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_tartdsc_Z ;
   }

   public void setCp_tartdsc_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_tartdsc_Z = value ;
   }

   public String getCp_bargirar_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_bargirar_Z ;
   }

   public void setCp_bargirar_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_bargirar_Z = value ;
   }

   public short getCp_baracaanh_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_baracaanh_Z ;
   }

   public void setCp_baracaanh_Z( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_baracaanh_Z = value ;
   }

   public String getCp_baragrest_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_baragrest_Z ;
   }

   public void setCp_baragrest_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_baragrest_Z = value ;
   }

   public byte getCp_barext_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barext_Z ;
   }

   public void setCp_barext_Z( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barext_Z = value ;
   }

   public String getCp_disdes_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_disdes_Z ;
   }

   public void setCp_disdes_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_disdes_Z = value ;
   }

   public int getCp_discod_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_discod_Z ;
   }

   public void setCp_discod_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_discod_Z = value ;
   }

   public String getCp_barproper_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barproper_Z ;
   }

   public void setCp_barproper_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barproper_Z = value ;
   }

   public String getCp_dsc_bar_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_dsc_bar_Z ;
   }

   public void setCp_dsc_bar_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_dsc_bar_Z = value ;
   }

   public String getCp_bardisnum_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_bardisnum_Z ;
   }

   public void setCp_bardisnum_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_bardisnum_Z = value ;
   }

   public java.math.BigDecimal getCp_barkgm_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barkgm_Z ;
   }

   public void setCp_barkgm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barkgm_Z = value ;
   }

   public java.math.BigDecimal getCp_barmtr_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barmtr_Z ;
   }

   public void setCp_barmtr_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barmtr_Z = value ;
   }

   public int getCp_barpie_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barpie_Z ;
   }

   public void setCp_barpie_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barpie_Z = value ;
   }

   public java.math.BigDecimal getCp_baralbk_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_baralbk_Z ;
   }

   public void setCp_baralbk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_baralbk_Z = value ;
   }

   public java.math.BigDecimal getCp_baralbm_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_baralbm_Z ;
   }

   public void setCp_baralbm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_baralbm_Z = value ;
   }

   public String getCp_barenccli_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barenccli_Z ;
   }

   public void setCp_barenccli_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barenccli_Z = value ;
   }

   public String getCp_disusrc_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_disusrc_Z ;
   }

   public void setCp_disusrc_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_disusrc_Z = value ;
   }

   public String getCp_barmaqcd_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barmaqcd_Z ;
   }

   public void setCp_barmaqcd_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barmaqcd_Z = value ;
   }

   public byte getCp_barestr_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barestr_Z ;
   }

   public void setCp_barestr_Z( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      gxTv_SdtCONPRODUC_Cp_barestr_Z = value ;
   }

   protected byte gxTv_SdtCONPRODUC_Cp_barcodreo ;
   protected byte gxTv_SdtCONPRODUC_Cp_barsit ;
   protected byte gxTv_SdtCONPRODUC_Cp_barext ;
   protected byte gxTv_SdtCONPRODUC_Cp_barestr ;
   protected byte gxTv_SdtCONPRODUC_Cp_barcodreo_Z ;
   protected byte gxTv_SdtCONPRODUC_Cp_barsit_Z ;
   protected byte gxTv_SdtCONPRODUC_Cp_barext_Z ;
   protected byte gxTv_SdtCONPRODUC_Cp_barestr_Z ;
   private byte gxTv_SdtCONPRODUC_N ;
   protected short gxTv_SdtCONPRODUC_Cp_bartipart ;
   protected short gxTv_SdtCONPRODUC_Cp_baracaanh ;
   protected short gxTv_SdtCONPRODUC_Initialized ;
   protected short gxTv_SdtCONPRODUC_Cp_bartipart_Z ;
   protected short gxTv_SdtCONPRODUC_Cp_baracaanh_Z ;
   protected int gxTv_SdtCONPRODUC_Cp_clicod ;
   protected int gxTv_SdtCONPRODUC_Cp_barcod ;
   protected int gxTv_SdtCONPRODUC_Cp_barnumcli ;
   protected int gxTv_SdtCONPRODUC_Cp_barcolu ;
   protected int gxTv_SdtCONPRODUC_Cp_discod ;
   protected int gxTv_SdtCONPRODUC_Cp_barpie ;
   protected int gxTv_SdtCONPRODUC_Cp_clicod_Z ;
   protected int gxTv_SdtCONPRODUC_Cp_barcod_Z ;
   protected int gxTv_SdtCONPRODUC_Cp_barnumcli_Z ;
   protected int gxTv_SdtCONPRODUC_Cp_barcolu_Z ;
   protected int gxTv_SdtCONPRODUC_Cp_discod_Z ;
   protected int gxTv_SdtCONPRODUC_Cp_barpie_Z ;
   protected long gxTv_SdtCONPRODUC_Cp_id ;
   protected long gxTv_SdtCONPRODUC_Cp_id_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_emprcod ;
   protected String gxTv_SdtCONPRODUC_Cp_barcodpar ;
   protected String gxTv_SdtCONPRODUC_Cp_barplf ;
   protected String gxTv_SdtCONPRODUC_Cp_barser ;
   protected String gxTv_SdtCONPRODUC_Cp_barcolo ;
   protected String gxTv_SdtCONPRODUC_Cp_baragrest ;
   protected String gxTv_SdtCONPRODUC_Cp_disdes ;
   protected String gxTv_SdtCONPRODUC_Cp_barproper ;
   protected String gxTv_SdtCONPRODUC_Cp_bardisnum ;
   protected String gxTv_SdtCONPRODUC_Cp_barenccli ;
   protected String gxTv_SdtCONPRODUC_Cp_disusrc ;
   protected String gxTv_SdtCONPRODUC_Cp_barmaqcd ;
   protected String gxTv_SdtCONPRODUC_Mode ;
   protected String gxTv_SdtCONPRODUC_Cp_emprcod_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barcodpar_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barplf_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barser_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barcolo_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_baragrest_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_disdes_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barproper_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_bardisnum_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barenccli_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_disusrc_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barmaqcd_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_clinom ;
   protected String gxTv_SdtCONPRODUC_Cp_barserdsc ;
   protected String gxTv_SdtCONPRODUC_Cp_barnomcli ;
   protected String gxTv_SdtCONPRODUC_Cp_tartdsc ;
   protected String gxTv_SdtCONPRODUC_Cp_bargirar ;
   protected String gxTv_SdtCONPRODUC_Cp_dsc_bar ;
   protected String gxTv_SdtCONPRODUC_Cp_clinom_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barserdsc_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_barnomcli_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_tartdsc_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_bargirar_Z ;
   protected String gxTv_SdtCONPRODUC_Cp_dsc_bar_Z ;
   protected java.util.Date gxTv_SdtCONPRODUC_Cp_barfecfpr ;
   protected java.util.Date gxTv_SdtCONPRODUC_Cp_barfeccli ;
   protected java.util.Date gxTv_SdtCONPRODUC_Cp_barfecsal ;
   protected java.util.Date gxTv_SdtCONPRODUC_Cp_barfecgen ;
   protected java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_barkgm ;
   protected java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_barmtr ;
   protected java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_baralbk ;
   protected java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_baralbm ;
   protected java.util.Date gxTv_SdtCONPRODUC_Cp_barfecfpr_Z ;
   protected java.util.Date gxTv_SdtCONPRODUC_Cp_barfeccli_Z ;
   protected java.util.Date gxTv_SdtCONPRODUC_Cp_barfecsal_Z ;
   protected java.util.Date gxTv_SdtCONPRODUC_Cp_barfecgen_Z ;
   protected java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_barkgm_Z ;
   protected java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_barmtr_Z ;
   protected java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_baralbk_Z ;
   protected java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_baralbm_Z ;
}

