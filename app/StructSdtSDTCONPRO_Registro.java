package app ;
import com.genexus.*;

public final  class StructSdtSDTCONPRO_Registro implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCONPRO_Registro( )
   {
      this( -1, new ModelContext( StructSdtSDTCONPRO_Registro.class ));
   }

   public StructSdtSDTCONPRO_Registro( int remoteHandle ,
                                       ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCONPRO_Registro_Cp_emprcod = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_clinom = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr = cal.getTime() ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barplf = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen = cal.getTime() ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli = cal.getTime() ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal = cal.getTime() ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barser = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcolo = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bargirar = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_desc_b = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baragrest = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_disdes = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barproper = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barrencc = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baralbk = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baralbm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barenccli = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_disusrc = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N = (byte)(1) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N = (byte)(1) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N = (byte)(1) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N = (byte)(1) ;
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
      return gxTv_SdtSDTCONPRO_Registro_Cp_id ;
   }

   public void setCp_id( long value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_id = value ;
   }

   public String getCp_emprcod( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_emprcod ;
   }

   public void setCp_emprcod( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_emprcod = value ;
   }

   public int getCp_clicod( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_clicod ;
   }

   public void setCp_clicod( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_clicod = value ;
   }

   public String getCp_clinom( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_clinom ;
   }

   public void setCp_clinom( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_clinom = value ;
   }

   public int getCp_barcod( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcod ;
   }

   public void setCp_barcod( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcod = value ;
   }

   public byte getCp_barcodreo( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo ;
   }

   public void setCp_barcodreo( byte value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo = value ;
   }

   public String getCp_barcodpar( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar ;
   }

   public void setCp_barcodpar( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar = value ;
   }

   public java.util.Date getCp_barfecfpr( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr ;
   }

   public void setCp_barfecfpr( java.util.Date value )
   {
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr = value ;
   }

   public int getCp_barnumcli( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli ;
   }

   public void setCp_barnumcli( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli = value ;
   }

   public String getCp_barplf( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barplf ;
   }

   public void setCp_barplf( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barplf = value ;
   }

   public byte getCp_barsit( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barsit ;
   }

   public void setCp_barsit( byte value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barsit = value ;
   }

   public java.util.Date getCp_barfecgen( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen ;
   }

   public void setCp_barfecgen( java.util.Date value )
   {
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen = value ;
   }

   public java.util.Date getCp_barfeccli( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli ;
   }

   public void setCp_barfeccli( java.util.Date value )
   {
      gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli = value ;
   }

   public java.util.Date getCp_barfecsal( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal ;
   }

   public void setCp_barfecsal( java.util.Date value )
   {
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal = value ;
   }

   public String getCp_barser( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barser ;
   }

   public void setCp_barser( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barser = value ;
   }

   public String getCp_barserdsc( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc ;
   }

   public void setCp_barserdsc( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc = value ;
   }

   public String getCp_barcolo( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcolo ;
   }

   public void setCp_barcolo( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcolo = value ;
   }

   public int getCp_barcolu( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcolu ;
   }

   public void setCp_barcolu( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcolu = value ;
   }

   public String getCp_barnomcli( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli ;
   }

   public void setCp_barnomcli( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli = value ;
   }

   public short getCp_bartipart( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_bartipart ;
   }

   public void setCp_bartipart( short value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bartipart = value ;
   }

   public String getCp_tartdsc( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc ;
   }

   public void setCp_tartdsc( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc = value ;
   }

   public String getCp_bargirar( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_bargirar ;
   }

   public void setCp_bargirar( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bargirar = value ;
   }

   public short getCp_baracaanh( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh ;
   }

   public void setCp_baracaanh( short value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh = value ;
   }

   public String getCp_desc_b( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_desc_b ;
   }

   public void setCp_desc_b( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_desc_b = value ;
   }

   public String getCp_baragrest( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_baragrest ;
   }

   public void setCp_baragrest( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baragrest = value ;
   }

   public byte getCp_barext( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barext ;
   }

   public void setCp_barext( byte value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barext = value ;
   }

   public String getCp_disdes( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_disdes ;
   }

   public void setCp_disdes( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_disdes = value ;
   }

   public int getCp_discod( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_discod ;
   }

   public void setCp_discod( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_discod = value ;
   }

   public String getCp_barproper( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barproper ;
   }

   public void setCp_barproper( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barproper = value ;
   }

   public String getCp_dsc_bar( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar ;
   }

   public void setCp_dsc_bar( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar = value ;
   }

   public String getCp_bardisnum( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum ;
   }

   public void setCp_bardisnum( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum = value ;
   }

   public String getCp_barrencc( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barrencc ;
   }

   public void setCp_barrencc( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barrencc = value ;
   }

   public java.math.BigDecimal getCp_barkgm( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barkgm ;
   }

   public void setCp_barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barkgm = value ;
   }

   public java.math.BigDecimal getCp_barmtr( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barmtr ;
   }

   public void setCp_barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barmtr = value ;
   }

   public int getCp_barpie( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barpie ;
   }

   public void setCp_barpie( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barpie = value ;
   }

   public java.math.BigDecimal getCp_baralbk( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_baralbk ;
   }

   public void setCp_baralbk( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baralbk = value ;
   }

   public java.math.BigDecimal getCp_baralbm( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_baralbm ;
   }

   public void setCp_baralbm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baralbm = value ;
   }

   public String getCp_barenccli( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barenccli ;
   }

   public void setCp_barenccli( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barenccli = value ;
   }

   public String getCp_bartipdis( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis ;
   }

   public void setCp_bartipdis( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis = value ;
   }

   public String getCp_disusrc( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_disusrc ;
   }

   public void setCp_disusrc( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_disusrc = value ;
   }

   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barsit ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barext ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_N ;
   protected short gxTv_SdtSDTCONPRO_Registro_Cp_bartipart ;
   protected short gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_clicod ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_barcod ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_barcolu ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_discod ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_barpie ;
   protected long gxTv_SdtSDTCONPRO_Registro_Cp_id ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_emprcod ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barplf ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barser ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barcolo ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_baragrest ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_disdes ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barproper ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barrencc ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barenccli ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_disusrc ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_clinom ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_bargirar ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_desc_b ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar ;
   protected java.util.Date gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr ;
   protected java.util.Date gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen ;
   protected java.util.Date gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli ;
   protected java.util.Date gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal ;
   protected java.math.BigDecimal gxTv_SdtSDTCONPRO_Registro_Cp_barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTCONPRO_Registro_Cp_barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDTCONPRO_Registro_Cp_baralbk ;
   protected java.math.BigDecimal gxTv_SdtSDTCONPRO_Registro_Cp_baralbm ;
}

