package app ;
import com.genexus.*;

public final  class StructSdtTARTICU implements Cloneable, java.io.Serializable
{
   public StructSdtTARTICU( )
   {
      this( -1, new ModelContext( StructSdtTARTICU.class ));
   }

   public StructSdtTARTICU( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTARTICU_Emprcod = "" ;
      gxTv_SdtTARTICU_Artcod = "" ;
      gxTv_SdtTARTICU_Artdsc = "" ;
      gxTv_SdtTARTICU_Clinom = "" ;
      gxTv_SdtTARTICU_Artcodext = "" ;
      gxTv_SdtTARTICU_Emprnom = "" ;
      gxTv_SdtTARTICU_Artmat = "" ;
      gxTv_SdtTARTICU_Tipartdsc = "" ;
      gxTv_SdtTARTICU_Artren = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Arttipple = "" ;
      gxTv_SdtTARTICU_Arttiplar = "" ;
      gxTv_SdtTARTICU_Artcorori = "" ;
      gxTv_SdtTARTICU_Artencori = "" ;
      gxTv_SdtTARTICU_Artsua = "" ;
      gxTv_SdtTARTICU_Artacaqui = "" ;
      gxTv_SdtTARTICU_Arteti = "" ;
      gxTv_SdtTARTICU_Clieti = "" ;
      gxTv_SdtTARTICU_Artmer = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Arttra1 = "" ;
      gxTv_SdtTARTICU_Arttra2 = "" ;
      gxTv_SdtTARTICU_Arttra3 = "" ;
      gxTv_SdtTARTICU_Arturd1 = "" ;
      gxTv_SdtTARTICU_Arturd2 = "" ;
      gxTv_SdtTARTICU_Arturd3 = "" ;
      gxTv_SdtTARTICU_Artrdoa = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdon = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artfacabs = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artple2 = "" ;
      gxTv_SdtTARTICU_Artpmppza = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artfeccre = cal.getTime() ;
      gxTv_SdtTARTICU_Artusrcod = "" ;
      gxTv_SdtTARTICU_Artfecmod = cal.getTime() ;
      gxTv_SdtTARTICU_Clasdsc = "" ;
      gxTv_SdtTARTICU_Artcomer = "" ;
      gxTv_SdtTARTICU_Clatubdsc = "" ;
      gxTv_SdtTARTICU_Claboldsc = "" ;
      gxTv_SdtTARTICU_Artrdocru1 = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdocru2 = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artnmtr = "" ;
      gxTv_SdtTARTICU_Artlu = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdtsc = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artund = "" ;
      gxTv_SdtTARTICU_Artblo = "" ;
      gxTv_SdtTARTICU_Tipartdsc2 = "" ;
      gxTv_SdtTARTICU_Artfabsh = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artfabst = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artobsgrm = "" ;
      gxTv_SdtTARTICU_Artobsanc = "" ;
      gxTv_SdtTARTICU_Artcdb = "" ;
      gxTv_SdtTARTICU_Artgalga = "" ;
      gxTv_SdtTARTICU_Artplatina = "" ;
      gxTv_SdtTARTICU_Artpgd = "" ;
      gxTv_SdtTARTICU_Artthn = "" ;
      gxTv_SdtTARTICU_Art_dc = "" ;
      gxTv_SdtTARTICU_Artrdoc = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artanu = "" ;
      gxTv_SdtTARTICU_Artfacuti = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artkgmn = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artacamar = "" ;
      gxTv_SdtTARTICU_Artacabak = "" ;
      gxTv_SdtTARTICU_Artelganc = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artelglar = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdocru = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artenclarg = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artencanc = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdto4 = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artdsc2 = "" ;
      gxTv_SdtTARTICU_Artgrcomp = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artkgspp = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artprepp = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artcdsc = "" ;
      gxTv_SdtTARTICU_Artobslon = "" ;
      gxTv_SdtTARTICU_Artobsfac = "" ;
      gxTv_SdtTARTICU_Artobsotras = "" ;
      gxTv_SdtTARTICU_Artactivo = "" ;
      gxTv_SdtTARTICU_Mode = "" ;
      gxTv_SdtTARTICU_Emprcod_Z = "" ;
      gxTv_SdtTARTICU_Artcod_Z = "" ;
      gxTv_SdtTARTICU_Artdsc_Z = "" ;
      gxTv_SdtTARTICU_Clinom_Z = "" ;
      gxTv_SdtTARTICU_Artcodext_Z = "" ;
      gxTv_SdtTARTICU_Emprnom_Z = "" ;
      gxTv_SdtTARTICU_Artmat_Z = "" ;
      gxTv_SdtTARTICU_Tipartdsc_Z = "" ;
      gxTv_SdtTARTICU_Artren_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Arttipple_Z = "" ;
      gxTv_SdtTARTICU_Arttiplar_Z = "" ;
      gxTv_SdtTARTICU_Artcorori_Z = "" ;
      gxTv_SdtTARTICU_Artencori_Z = "" ;
      gxTv_SdtTARTICU_Artsua_Z = "" ;
      gxTv_SdtTARTICU_Artacaqui_Z = "" ;
      gxTv_SdtTARTICU_Arteti_Z = "" ;
      gxTv_SdtTARTICU_Clieti_Z = "" ;
      gxTv_SdtTARTICU_Artmer_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Arttra1_Z = "" ;
      gxTv_SdtTARTICU_Arttra2_Z = "" ;
      gxTv_SdtTARTICU_Arttra3_Z = "" ;
      gxTv_SdtTARTICU_Arturd1_Z = "" ;
      gxTv_SdtTARTICU_Arturd2_Z = "" ;
      gxTv_SdtTARTICU_Arturd3_Z = "" ;
      gxTv_SdtTARTICU_Artrdoa_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdon_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artfacabs_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artple2_Z = "" ;
      gxTv_SdtTARTICU_Artpmppza_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artfeccre_Z = cal.getTime() ;
      gxTv_SdtTARTICU_Artusrcod_Z = "" ;
      gxTv_SdtTARTICU_Artfecmod_Z = cal.getTime() ;
      gxTv_SdtTARTICU_Clasdsc_Z = "" ;
      gxTv_SdtTARTICU_Artcomer_Z = "" ;
      gxTv_SdtTARTICU_Clatubdsc_Z = "" ;
      gxTv_SdtTARTICU_Claboldsc_Z = "" ;
      gxTv_SdtTARTICU_Artrdocru1_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdocru2_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artnmtr_Z = "" ;
      gxTv_SdtTARTICU_Artlu_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdtsc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artund_Z = "" ;
      gxTv_SdtTARTICU_Artblo_Z = "" ;
      gxTv_SdtTARTICU_Tipartdsc2_Z = "" ;
      gxTv_SdtTARTICU_Artfabsh_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artfabst_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artobsgrm_Z = "" ;
      gxTv_SdtTARTICU_Artobsanc_Z = "" ;
      gxTv_SdtTARTICU_Artcdb_Z = "" ;
      gxTv_SdtTARTICU_Artgalga_Z = "" ;
      gxTv_SdtTARTICU_Artplatina_Z = "" ;
      gxTv_SdtTARTICU_Artpgd_Z = "" ;
      gxTv_SdtTARTICU_Artthn_Z = "" ;
      gxTv_SdtTARTICU_Art_dc_Z = "" ;
      gxTv_SdtTARTICU_Artrdoc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artanu_Z = "" ;
      gxTv_SdtTARTICU_Artfacuti_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artkgmn_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artacamar_Z = "" ;
      gxTv_SdtTARTICU_Artacabak_Z = "" ;
      gxTv_SdtTARTICU_Artelganc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artelglar_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdocru_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artenclarg_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artencanc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artrdto4_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artdsc2_Z = "" ;
      gxTv_SdtTARTICU_Artgrcomp_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artkgspp_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artprepp_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTARTICU_Artcdsc_Z = "" ;
      gxTv_SdtTARTICU_Artobsfac_Z = "" ;
      gxTv_SdtTARTICU_Artobsotras_Z = "" ;
      gxTv_SdtTARTICU_Artactivo_Z = "" ;
      gxTv_SdtTARTICU_Artdsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcodext_N = (byte)(1) ;
      gxTv_SdtTARTICU_Emprnom_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artmat_N = (byte)(1) ;
      gxTv_SdtTARTICU_Tipartdsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpml_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgracru_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcrumin_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcrumax_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacamin_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacamax_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artren_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttipple_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttiplar_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcorori_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artencori_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artsua_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacaqui_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arteti_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturg_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artmer_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttra1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttra2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttra3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttrap1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttrap2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttrap3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturd1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturd2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturd3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturdp1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturdp2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturdp3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artenccom_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artencanh_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgraaca_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdoa_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdon_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfacabs_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artple2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artnumcor_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancsal1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancsal2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancsal3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgraaca2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgracru2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clascod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpmppza_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfeccre_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artusrcod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfecmod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clasdsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcomer_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clatubcod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clatubdsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clabolcod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Claboldsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdocru1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdocru2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artnmtr_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artlu_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrb_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpelanh_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgrm2sc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpmlsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpmlcru_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdtsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artund_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artblo_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcla_N = (byte)(1) ;
      gxTv_SdtTARTICU_Tipartdsc2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfabsh_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfabst_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artnprog_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artvbd_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artvbn_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artab_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobsgrm_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobsanc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcdb_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgalga_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artplatina_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpgd_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artth_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artthn_N = (byte)(1) ;
      gxTv_SdtTARTICU_Art_cd_N = (byte)(1) ;
      gxTv_SdtTARTICU_Art_dc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arthilos_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpasad_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgrm2c_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdoc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacafor_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artanu_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfacuti_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artnumtip_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artmt_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttrabs_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artkgmn_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacamar_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacabak_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artelganc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artelglar_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdocru_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artenclarg_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artencanc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdto4_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artdsc2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgrcomp_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artkgspp_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artprepp_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobslon_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobsfac_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobsotras_N = (byte)(1) ;
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
      return gxTv_SdtTARTICU_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Emprcod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtTARTICU_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clicod = value ;
   }

   public String getArtcod( )
   {
      return gxTv_SdtTARTICU_Artcod ;
   }

   public void setArtcod( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcod = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtTARTICU_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtTARTICU_Artdsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artdsc = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtTARTICU_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clinom = value ;
   }

   public String getArtcodext( )
   {
      return gxTv_SdtTARTICU_Artcodext ;
   }

   public void setArtcodext( String value )
   {
      gxTv_SdtTARTICU_Artcodext_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcodext = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTARTICU_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTARTICU_Emprnom_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Emprnom = value ;
   }

   public String getArtmat( )
   {
      return gxTv_SdtTARTICU_Artmat ;
   }

   public void setArtmat( String value )
   {
      gxTv_SdtTARTICU_Artmat_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmat = value ;
   }

   public short getTipartcod( )
   {
      return gxTv_SdtTARTICU_Tipartcod ;
   }

   public void setTipartcod( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Tipartcod = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtTARTICU_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtTARTICU_Tipartdsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Tipartdsc = value ;
   }

   public short getArtpml( )
   {
      return gxTv_SdtTARTICU_Artpml ;
   }

   public void setArtpml( short value )
   {
      gxTv_SdtTARTICU_Artpml_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpml = value ;
   }

   public short getArtgracru( )
   {
      return gxTv_SdtTARTICU_Artgracru ;
   }

   public void setArtgracru( short value )
   {
      gxTv_SdtTARTICU_Artgracru_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgracru = value ;
   }

   public short getArtcrumin( )
   {
      return gxTv_SdtTARTICU_Artcrumin ;
   }

   public void setArtcrumin( short value )
   {
      gxTv_SdtTARTICU_Artcrumin_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcrumin = value ;
   }

   public short getArtcrumax( )
   {
      return gxTv_SdtTARTICU_Artcrumax ;
   }

   public void setArtcrumax( short value )
   {
      gxTv_SdtTARTICU_Artcrumax_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcrumax = value ;
   }

   public short getArtacamin( )
   {
      return gxTv_SdtTARTICU_Artacamin ;
   }

   public void setArtacamin( short value )
   {
      gxTv_SdtTARTICU_Artacamin_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamin = value ;
   }

   public short getArtacamax( )
   {
      return gxTv_SdtTARTICU_Artacamax ;
   }

   public void setArtacamax( short value )
   {
      gxTv_SdtTARTICU_Artacamax_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamax = value ;
   }

   public java.math.BigDecimal getArtren( )
   {
      return gxTv_SdtTARTICU_Artren ;
   }

   public void setArtren( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artren_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artren = value ;
   }

   public String getArttipple( )
   {
      return gxTv_SdtTARTICU_Arttipple ;
   }

   public void setArttipple( String value )
   {
      gxTv_SdtTARTICU_Arttipple_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttipple = value ;
   }

   public String getArttiplar( )
   {
      return gxTv_SdtTARTICU_Arttiplar ;
   }

   public void setArttiplar( String value )
   {
      gxTv_SdtTARTICU_Arttiplar_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttiplar = value ;
   }

   public String getArtcorori( )
   {
      return gxTv_SdtTARTICU_Artcorori ;
   }

   public void setArtcorori( String value )
   {
      gxTv_SdtTARTICU_Artcorori_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcorori = value ;
   }

   public String getArtencori( )
   {
      return gxTv_SdtTARTICU_Artencori ;
   }

   public void setArtencori( String value )
   {
      gxTv_SdtTARTICU_Artencori_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencori = value ;
   }

   public String getArtsua( )
   {
      return gxTv_SdtTARTICU_Artsua ;
   }

   public void setArtsua( String value )
   {
      gxTv_SdtTARTICU_Artsua_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artsua = value ;
   }

   public String getArtacaqui( )
   {
      return gxTv_SdtTARTICU_Artacaqui ;
   }

   public void setArtacaqui( String value )
   {
      gxTv_SdtTARTICU_Artacaqui_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacaqui = value ;
   }

   public String getArteti( )
   {
      return gxTv_SdtTARTICU_Arteti ;
   }

   public void setArteti( String value )
   {
      gxTv_SdtTARTICU_Arteti_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arteti = value ;
   }

   public String getClieti( )
   {
      return gxTv_SdtTARTICU_Clieti ;
   }

   public void setClieti( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clieti = value ;
   }

   public byte getCliurg( )
   {
      return gxTv_SdtTARTICU_Cliurg ;
   }

   public void setCliurg( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Cliurg = value ;
   }

   public byte getArturg( )
   {
      return gxTv_SdtTARTICU_Arturg ;
   }

   public void setArturg( byte value )
   {
      gxTv_SdtTARTICU_Arturg_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturg = value ;
   }

   public java.math.BigDecimal getArtmer( )
   {
      return gxTv_SdtTARTICU_Artmer ;
   }

   public void setArtmer( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artmer_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmer = value ;
   }

   public String getArttra1( )
   {
      return gxTv_SdtTARTICU_Arttra1 ;
   }

   public void setArttra1( String value )
   {
      gxTv_SdtTARTICU_Arttra1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra1 = value ;
   }

   public String getArttra2( )
   {
      return gxTv_SdtTARTICU_Arttra2 ;
   }

   public void setArttra2( String value )
   {
      gxTv_SdtTARTICU_Arttra2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra2 = value ;
   }

   public String getArttra3( )
   {
      return gxTv_SdtTARTICU_Arttra3 ;
   }

   public void setArttra3( String value )
   {
      gxTv_SdtTARTICU_Arttra3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra3 = value ;
   }

   public short getArttrap1( )
   {
      return gxTv_SdtTARTICU_Arttrap1 ;
   }

   public void setArttrap1( short value )
   {
      gxTv_SdtTARTICU_Arttrap1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap1 = value ;
   }

   public short getArttrap2( )
   {
      return gxTv_SdtTARTICU_Arttrap2 ;
   }

   public void setArttrap2( short value )
   {
      gxTv_SdtTARTICU_Arttrap2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap2 = value ;
   }

   public short getArttrap3( )
   {
      return gxTv_SdtTARTICU_Arttrap3 ;
   }

   public void setArttrap3( short value )
   {
      gxTv_SdtTARTICU_Arttrap3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap3 = value ;
   }

   public String getArturd1( )
   {
      return gxTv_SdtTARTICU_Arturd1 ;
   }

   public void setArturd1( String value )
   {
      gxTv_SdtTARTICU_Arturd1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd1 = value ;
   }

   public String getArturd2( )
   {
      return gxTv_SdtTARTICU_Arturd2 ;
   }

   public void setArturd2( String value )
   {
      gxTv_SdtTARTICU_Arturd2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd2 = value ;
   }

   public String getArturd3( )
   {
      return gxTv_SdtTARTICU_Arturd3 ;
   }

   public void setArturd3( String value )
   {
      gxTv_SdtTARTICU_Arturd3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd3 = value ;
   }

   public short getArturdp1( )
   {
      return gxTv_SdtTARTICU_Arturdp1 ;
   }

   public void setArturdp1( short value )
   {
      gxTv_SdtTARTICU_Arturdp1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp1 = value ;
   }

   public short getArturdp2( )
   {
      return gxTv_SdtTARTICU_Arturdp2 ;
   }

   public void setArturdp2( short value )
   {
      gxTv_SdtTARTICU_Arturdp2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp2 = value ;
   }

   public short getArturdp3( )
   {
      return gxTv_SdtTARTICU_Arturdp3 ;
   }

   public void setArturdp3( short value )
   {
      gxTv_SdtTARTICU_Arturdp3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp3 = value ;
   }

   public short getArtenccom( )
   {
      return gxTv_SdtTARTICU_Artenccom ;
   }

   public void setArtenccom( short value )
   {
      gxTv_SdtTARTICU_Artenccom_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artenccom = value ;
   }

   public short getArtencanh( )
   {
      return gxTv_SdtTARTICU_Artencanh ;
   }

   public void setArtencanh( short value )
   {
      gxTv_SdtTARTICU_Artencanh_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencanh = value ;
   }

   public short getArtgraaca( )
   {
      return gxTv_SdtTARTICU_Artgraaca ;
   }

   public void setArtgraaca( short value )
   {
      gxTv_SdtTARTICU_Artgraaca_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgraaca = value ;
   }

   public java.math.BigDecimal getArtrdoa( )
   {
      return gxTv_SdtTARTICU_Artrdoa ;
   }

   public void setArtrdoa( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdoa_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdoa = value ;
   }

   public java.math.BigDecimal getArtrdon( )
   {
      return gxTv_SdtTARTICU_Artrdon ;
   }

   public void setArtrdon( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdon_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdon = value ;
   }

   public java.math.BigDecimal getArtfacabs( )
   {
      return gxTv_SdtTARTICU_Artfacabs ;
   }

   public void setArtfacabs( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artfacabs_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfacabs = value ;
   }

   public String getArtple2( )
   {
      return gxTv_SdtTARTICU_Artple2 ;
   }

   public void setArtple2( String value )
   {
      gxTv_SdtTARTICU_Artple2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artple2 = value ;
   }

   public short getArtnumcor( )
   {
      return gxTv_SdtTARTICU_Artnumcor ;
   }

   public void setArtnumcor( short value )
   {
      gxTv_SdtTARTICU_Artnumcor_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnumcor = value ;
   }

   public short getArtancsal1( )
   {
      return gxTv_SdtTARTICU_Artancsal1 ;
   }

   public void setArtancsal1( short value )
   {
      gxTv_SdtTARTICU_Artancsal1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal1 = value ;
   }

   public short getArtancsal2( )
   {
      return gxTv_SdtTARTICU_Artancsal2 ;
   }

   public void setArtancsal2( short value )
   {
      gxTv_SdtTARTICU_Artancsal2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal2 = value ;
   }

   public short getArtancsal3( )
   {
      return gxTv_SdtTARTICU_Artancsal3 ;
   }

   public void setArtancsal3( short value )
   {
      gxTv_SdtTARTICU_Artancsal3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal3 = value ;
   }

   public short getArtgraaca2( )
   {
      return gxTv_SdtTARTICU_Artgraaca2 ;
   }

   public void setArtgraaca2( short value )
   {
      gxTv_SdtTARTICU_Artgraaca2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgraaca2 = value ;
   }

   public short getArtgracru2( )
   {
      return gxTv_SdtTARTICU_Artgracru2 ;
   }

   public void setArtgracru2( short value )
   {
      gxTv_SdtTARTICU_Artgracru2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgracru2 = value ;
   }

   public short getClascod( )
   {
      return gxTv_SdtTARTICU_Clascod ;
   }

   public void setClascod( short value )
   {
      gxTv_SdtTARTICU_Clascod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clascod = value ;
   }

   public java.math.BigDecimal getArtpmppza( )
   {
      return gxTv_SdtTARTICU_Artpmppza ;
   }

   public void setArtpmppza( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artpmppza_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmppza = value ;
   }

   public java.util.Date getArtfeccre( )
   {
      return gxTv_SdtTARTICU_Artfeccre ;
   }

   public void setArtfeccre( java.util.Date value )
   {
      gxTv_SdtTARTICU_Artfeccre_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfeccre = value ;
   }

   public String getArtusrcod( )
   {
      return gxTv_SdtTARTICU_Artusrcod ;
   }

   public void setArtusrcod( String value )
   {
      gxTv_SdtTARTICU_Artusrcod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artusrcod = value ;
   }

   public java.util.Date getArtfecmod( )
   {
      return gxTv_SdtTARTICU_Artfecmod ;
   }

   public void setArtfecmod( java.util.Date value )
   {
      gxTv_SdtTARTICU_Artfecmod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfecmod = value ;
   }

   public String getClasdsc( )
   {
      return gxTv_SdtTARTICU_Clasdsc ;
   }

   public void setClasdsc( String value )
   {
      gxTv_SdtTARTICU_Clasdsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clasdsc = value ;
   }

   public String getArtcomer( )
   {
      return gxTv_SdtTARTICU_Artcomer ;
   }

   public void setArtcomer( String value )
   {
      gxTv_SdtTARTICU_Artcomer_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcomer = value ;
   }

   public short getClatubcod( )
   {
      return gxTv_SdtTARTICU_Clatubcod ;
   }

   public void setClatubcod( short value )
   {
      gxTv_SdtTARTICU_Clatubcod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clatubcod = value ;
   }

   public String getClatubdsc( )
   {
      return gxTv_SdtTARTICU_Clatubdsc ;
   }

   public void setClatubdsc( String value )
   {
      gxTv_SdtTARTICU_Clatubdsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clatubdsc = value ;
   }

   public short getClabolcod( )
   {
      return gxTv_SdtTARTICU_Clabolcod ;
   }

   public void setClabolcod( short value )
   {
      gxTv_SdtTARTICU_Clabolcod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clabolcod = value ;
   }

   public String getClaboldsc( )
   {
      return gxTv_SdtTARTICU_Claboldsc ;
   }

   public void setClaboldsc( String value )
   {
      gxTv_SdtTARTICU_Claboldsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Claboldsc = value ;
   }

   public java.math.BigDecimal getArtrdocru1( )
   {
      return gxTv_SdtTARTICU_Artrdocru1 ;
   }

   public void setArtrdocru1( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdocru1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru1 = value ;
   }

   public java.math.BigDecimal getArtrdocru2( )
   {
      return gxTv_SdtTARTICU_Artrdocru2 ;
   }

   public void setArtrdocru2( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdocru2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru2 = value ;
   }

   public String getArtnmtr( )
   {
      return gxTv_SdtTARTICU_Artnmtr ;
   }

   public void setArtnmtr( String value )
   {
      gxTv_SdtTARTICU_Artnmtr_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnmtr = value ;
   }

   public java.math.BigDecimal getArtlu( )
   {
      return gxTv_SdtTARTICU_Artlu ;
   }

   public void setArtlu( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artlu_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artlu = value ;
   }

   public short getArtrb( )
   {
      return gxTv_SdtTARTICU_Artrb ;
   }

   public void setArtrb( short value )
   {
      gxTv_SdtTARTICU_Artrb_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrb = value ;
   }

   public short getArtpelanh( )
   {
      return gxTv_SdtTARTICU_Artpelanh ;
   }

   public void setArtpelanh( short value )
   {
      gxTv_SdtTARTICU_Artpelanh_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpelanh = value ;
   }

   public short getArtgrm2sc( )
   {
      return gxTv_SdtTARTICU_Artgrm2sc ;
   }

   public void setArtgrm2sc( short value )
   {
      gxTv_SdtTARTICU_Artgrm2sc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrm2sc = value ;
   }

   public short getArtpmlsc( )
   {
      return gxTv_SdtTARTICU_Artpmlsc ;
   }

   public void setArtpmlsc( short value )
   {
      gxTv_SdtTARTICU_Artpmlsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmlsc = value ;
   }

   public short getArtancsc( )
   {
      return gxTv_SdtTARTICU_Artancsc ;
   }

   public void setArtancsc( short value )
   {
      gxTv_SdtTARTICU_Artancsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsc = value ;
   }

   public short getArtpmlcru( )
   {
      return gxTv_SdtTARTICU_Artpmlcru ;
   }

   public void setArtpmlcru( short value )
   {
      gxTv_SdtTARTICU_Artpmlcru_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmlcru = value ;
   }

   public java.math.BigDecimal getArtrdtsc( )
   {
      return gxTv_SdtTARTICU_Artrdtsc ;
   }

   public void setArtrdtsc( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdtsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdtsc = value ;
   }

   public String getArtund( )
   {
      return gxTv_SdtTARTICU_Artund ;
   }

   public void setArtund( String value )
   {
      gxTv_SdtTARTICU_Artund_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artund = value ;
   }

   public String getArtblo( )
   {
      return gxTv_SdtTARTICU_Artblo ;
   }

   public void setArtblo( String value )
   {
      gxTv_SdtTARTICU_Artblo_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artblo = value ;
   }

   public byte getArtcla( )
   {
      return gxTv_SdtTARTICU_Artcla ;
   }

   public void setArtcla( byte value )
   {
      gxTv_SdtTARTICU_Artcla_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcla = value ;
   }

   public String getTipartdsc2( )
   {
      return gxTv_SdtTARTICU_Tipartdsc2 ;
   }

   public void setTipartdsc2( String value )
   {
      gxTv_SdtTARTICU_Tipartdsc2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Tipartdsc2 = value ;
   }

   public java.math.BigDecimal getArtfabsh( )
   {
      return gxTv_SdtTARTICU_Artfabsh ;
   }

   public void setArtfabsh( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artfabsh_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfabsh = value ;
   }

   public java.math.BigDecimal getArtfabst( )
   {
      return gxTv_SdtTARTICU_Artfabst ;
   }

   public void setArtfabst( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artfabst_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfabst = value ;
   }

   public byte getArtnprog( )
   {
      return gxTv_SdtTARTICU_Artnprog ;
   }

   public void setArtnprog( byte value )
   {
      gxTv_SdtTARTICU_Artnprog_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnprog = value ;
   }

   public short getArtvbd( )
   {
      return gxTv_SdtTARTICU_Artvbd ;
   }

   public void setArtvbd( short value )
   {
      gxTv_SdtTARTICU_Artvbd_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artvbd = value ;
   }

   public short getArtvbn( )
   {
      return gxTv_SdtTARTICU_Artvbn ;
   }

   public void setArtvbn( short value )
   {
      gxTv_SdtTARTICU_Artvbn_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artvbn = value ;
   }

   public short getArtab( )
   {
      return gxTv_SdtTARTICU_Artab ;
   }

   public void setArtab( short value )
   {
      gxTv_SdtTARTICU_Artab_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artab = value ;
   }

   public String getArtobsgrm( )
   {
      return gxTv_SdtTARTICU_Artobsgrm ;
   }

   public void setArtobsgrm( String value )
   {
      gxTv_SdtTARTICU_Artobsgrm_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsgrm = value ;
   }

   public String getArtobsanc( )
   {
      return gxTv_SdtTARTICU_Artobsanc ;
   }

   public void setArtobsanc( String value )
   {
      gxTv_SdtTARTICU_Artobsanc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsanc = value ;
   }

   public String getArtcdb( )
   {
      return gxTv_SdtTARTICU_Artcdb ;
   }

   public void setArtcdb( String value )
   {
      gxTv_SdtTARTICU_Artcdb_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcdb = value ;
   }

   public String getArtgalga( )
   {
      return gxTv_SdtTARTICU_Artgalga ;
   }

   public void setArtgalga( String value )
   {
      gxTv_SdtTARTICU_Artgalga_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgalga = value ;
   }

   public String getArtplatina( )
   {
      return gxTv_SdtTARTICU_Artplatina ;
   }

   public void setArtplatina( String value )
   {
      gxTv_SdtTARTICU_Artplatina_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artplatina = value ;
   }

   public String getArtpgd( )
   {
      return gxTv_SdtTARTICU_Artpgd ;
   }

   public void setArtpgd( String value )
   {
      gxTv_SdtTARTICU_Artpgd_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpgd = value ;
   }

   public short getArtth( )
   {
      return gxTv_SdtTARTICU_Artth ;
   }

   public void setArtth( short value )
   {
      gxTv_SdtTARTICU_Artth_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artth = value ;
   }

   public String getArtthn( )
   {
      return gxTv_SdtTARTICU_Artthn ;
   }

   public void setArtthn( String value )
   {
      gxTv_SdtTARTICU_Artthn_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artthn = value ;
   }

   public short getArt_cd( )
   {
      return gxTv_SdtTARTICU_Art_cd ;
   }

   public void setArt_cd( short value )
   {
      gxTv_SdtTARTICU_Art_cd_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Art_cd = value ;
   }

   public String getArt_dc( )
   {
      return gxTv_SdtTARTICU_Art_dc ;
   }

   public void setArt_dc( String value )
   {
      gxTv_SdtTARTICU_Art_dc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Art_dc = value ;
   }

   public short getArthilos( )
   {
      return gxTv_SdtTARTICU_Arthilos ;
   }

   public void setArthilos( short value )
   {
      gxTv_SdtTARTICU_Arthilos_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arthilos = value ;
   }

   public short getArtpasad( )
   {
      return gxTv_SdtTARTICU_Artpasad ;
   }

   public void setArtpasad( short value )
   {
      gxTv_SdtTARTICU_Artpasad_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpasad = value ;
   }

   public short getArtancc( )
   {
      return gxTv_SdtTARTICU_Artancc ;
   }

   public void setArtancc( short value )
   {
      gxTv_SdtTARTICU_Artancc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancc = value ;
   }

   public short getArtgrm2c( )
   {
      return gxTv_SdtTARTICU_Artgrm2c ;
   }

   public void setArtgrm2c( short value )
   {
      gxTv_SdtTARTICU_Artgrm2c_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrm2c = value ;
   }

   public java.math.BigDecimal getArtrdoc( )
   {
      return gxTv_SdtTARTICU_Artrdoc ;
   }

   public void setArtrdoc( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdoc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdoc = value ;
   }

   public int getArtacafor( )
   {
      return gxTv_SdtTARTICU_Artacafor ;
   }

   public void setArtacafor( int value )
   {
      gxTv_SdtTARTICU_Artacafor_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacafor = value ;
   }

   public String getArtanu( )
   {
      return gxTv_SdtTARTICU_Artanu ;
   }

   public void setArtanu( String value )
   {
      gxTv_SdtTARTICU_Artanu_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artanu = value ;
   }

   public java.math.BigDecimal getArtfacuti( )
   {
      return gxTv_SdtTARTICU_Artfacuti ;
   }

   public void setArtfacuti( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artfacuti_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfacuti = value ;
   }

   public int getArtnumtip( )
   {
      return gxTv_SdtTARTICU_Artnumtip ;
   }

   public void setArtnumtip( int value )
   {
      gxTv_SdtTARTICU_Artnumtip_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnumtip = value ;
   }

   public byte getArtmt( )
   {
      return gxTv_SdtTARTICU_Artmt ;
   }

   public void setArtmt( byte value )
   {
      gxTv_SdtTARTICU_Artmt_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmt = value ;
   }

   public byte getArttrabs( )
   {
      return gxTv_SdtTARTICU_Arttrabs ;
   }

   public void setArttrabs( byte value )
   {
      gxTv_SdtTARTICU_Arttrabs_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrabs = value ;
   }

   public java.math.BigDecimal getArtkgmn( )
   {
      return gxTv_SdtTARTICU_Artkgmn ;
   }

   public void setArtkgmn( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artkgmn_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artkgmn = value ;
   }

   public String getArtacamar( )
   {
      return gxTv_SdtTARTICU_Artacamar ;
   }

   public void setArtacamar( String value )
   {
      gxTv_SdtTARTICU_Artacamar_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamar = value ;
   }

   public String getArtacabak( )
   {
      return gxTv_SdtTARTICU_Artacabak ;
   }

   public void setArtacabak( String value )
   {
      gxTv_SdtTARTICU_Artacabak_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacabak = value ;
   }

   public java.math.BigDecimal getArtelganc( )
   {
      return gxTv_SdtTARTICU_Artelganc ;
   }

   public void setArtelganc( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artelganc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artelganc = value ;
   }

   public java.math.BigDecimal getArtelglar( )
   {
      return gxTv_SdtTARTICU_Artelglar ;
   }

   public void setArtelglar( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artelglar_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artelglar = value ;
   }

   public java.math.BigDecimal getArtrdocru( )
   {
      return gxTv_SdtTARTICU_Artrdocru ;
   }

   public void setArtrdocru( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdocru_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru = value ;
   }

   public java.math.BigDecimal getArtenclarg( )
   {
      return gxTv_SdtTARTICU_Artenclarg ;
   }

   public void setArtenclarg( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artenclarg_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artenclarg = value ;
   }

   public java.math.BigDecimal getArtencanc( )
   {
      return gxTv_SdtTARTICU_Artencanc ;
   }

   public void setArtencanc( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artencanc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencanc = value ;
   }

   public java.math.BigDecimal getArtrdto4( )
   {
      return gxTv_SdtTARTICU_Artrdto4 ;
   }

   public void setArtrdto4( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdto4_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdto4 = value ;
   }

   public String getArtdsc2( )
   {
      return gxTv_SdtTARTICU_Artdsc2 ;
   }

   public void setArtdsc2( String value )
   {
      gxTv_SdtTARTICU_Artdsc2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artdsc2 = value ;
   }

   public java.math.BigDecimal getArtgrcomp( )
   {
      return gxTv_SdtTARTICU_Artgrcomp ;
   }

   public void setArtgrcomp( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artgrcomp_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrcomp = value ;
   }

   public java.math.BigDecimal getArtkgspp( )
   {
      return gxTv_SdtTARTICU_Artkgspp ;
   }

   public void setArtkgspp( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artkgspp_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artkgspp = value ;
   }

   public java.math.BigDecimal getArtprepp( )
   {
      return gxTv_SdtTARTICU_Artprepp ;
   }

   public void setArtprepp( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artprepp_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artprepp = value ;
   }

   public String getArtcdsc( )
   {
      return gxTv_SdtTARTICU_Artcdsc ;
   }

   public void setArtcdsc( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcdsc = value ;
   }

   public String getArtobslon( )
   {
      return gxTv_SdtTARTICU_Artobslon ;
   }

   public void setArtobslon( String value )
   {
      gxTv_SdtTARTICU_Artobslon_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobslon = value ;
   }

   public String getArtobsfac( )
   {
      return gxTv_SdtTARTICU_Artobsfac ;
   }

   public void setArtobsfac( String value )
   {
      gxTv_SdtTARTICU_Artobsfac_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsfac = value ;
   }

   public String getArtobsotras( )
   {
      return gxTv_SdtTARTICU_Artobsotras ;
   }

   public void setArtobsotras( String value )
   {
      gxTv_SdtTARTICU_Artobsotras_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsotras = value ;
   }

   public String getArtactivo( )
   {
      return gxTv_SdtTARTICU_Artactivo ;
   }

   public void setArtactivo( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artactivo = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTARTICU_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTARTICU_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTARTICU_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Emprcod_Z = value ;
   }

   public int getClicod_Z( )
   {
      return gxTv_SdtTARTICU_Clicod_Z ;
   }

   public void setClicod_Z( int value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clicod_Z = value ;
   }

   public String getArtcod_Z( )
   {
      return gxTv_SdtTARTICU_Artcod_Z ;
   }

   public void setArtcod_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcod_Z = value ;
   }

   public String getArtdsc_Z( )
   {
      return gxTv_SdtTARTICU_Artdsc_Z ;
   }

   public void setArtdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artdsc_Z = value ;
   }

   public String getClinom_Z( )
   {
      return gxTv_SdtTARTICU_Clinom_Z ;
   }

   public void setClinom_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clinom_Z = value ;
   }

   public String getArtcodext_Z( )
   {
      return gxTv_SdtTARTICU_Artcodext_Z ;
   }

   public void setArtcodext_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcodext_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTARTICU_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Emprnom_Z = value ;
   }

   public String getArtmat_Z( )
   {
      return gxTv_SdtTARTICU_Artmat_Z ;
   }

   public void setArtmat_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmat_Z = value ;
   }

   public short getTipartcod_Z( )
   {
      return gxTv_SdtTARTICU_Tipartcod_Z ;
   }

   public void setTipartcod_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Tipartcod_Z = value ;
   }

   public String getTipartdsc_Z( )
   {
      return gxTv_SdtTARTICU_Tipartdsc_Z ;
   }

   public void setTipartdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Tipartdsc_Z = value ;
   }

   public short getArtpml_Z( )
   {
      return gxTv_SdtTARTICU_Artpml_Z ;
   }

   public void setArtpml_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpml_Z = value ;
   }

   public short getArtgracru_Z( )
   {
      return gxTv_SdtTARTICU_Artgracru_Z ;
   }

   public void setArtgracru_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgracru_Z = value ;
   }

   public short getArtcrumin_Z( )
   {
      return gxTv_SdtTARTICU_Artcrumin_Z ;
   }

   public void setArtcrumin_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcrumin_Z = value ;
   }

   public short getArtcrumax_Z( )
   {
      return gxTv_SdtTARTICU_Artcrumax_Z ;
   }

   public void setArtcrumax_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcrumax_Z = value ;
   }

   public short getArtacamin_Z( )
   {
      return gxTv_SdtTARTICU_Artacamin_Z ;
   }

   public void setArtacamin_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamin_Z = value ;
   }

   public short getArtacamax_Z( )
   {
      return gxTv_SdtTARTICU_Artacamax_Z ;
   }

   public void setArtacamax_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamax_Z = value ;
   }

   public java.math.BigDecimal getArtren_Z( )
   {
      return gxTv_SdtTARTICU_Artren_Z ;
   }

   public void setArtren_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artren_Z = value ;
   }

   public String getArttipple_Z( )
   {
      return gxTv_SdtTARTICU_Arttipple_Z ;
   }

   public void setArttipple_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttipple_Z = value ;
   }

   public String getArttiplar_Z( )
   {
      return gxTv_SdtTARTICU_Arttiplar_Z ;
   }

   public void setArttiplar_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttiplar_Z = value ;
   }

   public String getArtcorori_Z( )
   {
      return gxTv_SdtTARTICU_Artcorori_Z ;
   }

   public void setArtcorori_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcorori_Z = value ;
   }

   public String getArtencori_Z( )
   {
      return gxTv_SdtTARTICU_Artencori_Z ;
   }

   public void setArtencori_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencori_Z = value ;
   }

   public String getArtsua_Z( )
   {
      return gxTv_SdtTARTICU_Artsua_Z ;
   }

   public void setArtsua_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artsua_Z = value ;
   }

   public String getArtacaqui_Z( )
   {
      return gxTv_SdtTARTICU_Artacaqui_Z ;
   }

   public void setArtacaqui_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacaqui_Z = value ;
   }

   public String getArteti_Z( )
   {
      return gxTv_SdtTARTICU_Arteti_Z ;
   }

   public void setArteti_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arteti_Z = value ;
   }

   public String getClieti_Z( )
   {
      return gxTv_SdtTARTICU_Clieti_Z ;
   }

   public void setClieti_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clieti_Z = value ;
   }

   public byte getCliurg_Z( )
   {
      return gxTv_SdtTARTICU_Cliurg_Z ;
   }

   public void setCliurg_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Cliurg_Z = value ;
   }

   public byte getArturg_Z( )
   {
      return gxTv_SdtTARTICU_Arturg_Z ;
   }

   public void setArturg_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturg_Z = value ;
   }

   public java.math.BigDecimal getArtmer_Z( )
   {
      return gxTv_SdtTARTICU_Artmer_Z ;
   }

   public void setArtmer_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmer_Z = value ;
   }

   public String getArttra1_Z( )
   {
      return gxTv_SdtTARTICU_Arttra1_Z ;
   }

   public void setArttra1_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra1_Z = value ;
   }

   public String getArttra2_Z( )
   {
      return gxTv_SdtTARTICU_Arttra2_Z ;
   }

   public void setArttra2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra2_Z = value ;
   }

   public String getArttra3_Z( )
   {
      return gxTv_SdtTARTICU_Arttra3_Z ;
   }

   public void setArttra3_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra3_Z = value ;
   }

   public short getArttrap1_Z( )
   {
      return gxTv_SdtTARTICU_Arttrap1_Z ;
   }

   public void setArttrap1_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap1_Z = value ;
   }

   public short getArttrap2_Z( )
   {
      return gxTv_SdtTARTICU_Arttrap2_Z ;
   }

   public void setArttrap2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap2_Z = value ;
   }

   public short getArttrap3_Z( )
   {
      return gxTv_SdtTARTICU_Arttrap3_Z ;
   }

   public void setArttrap3_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap3_Z = value ;
   }

   public String getArturd1_Z( )
   {
      return gxTv_SdtTARTICU_Arturd1_Z ;
   }

   public void setArturd1_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd1_Z = value ;
   }

   public String getArturd2_Z( )
   {
      return gxTv_SdtTARTICU_Arturd2_Z ;
   }

   public void setArturd2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd2_Z = value ;
   }

   public String getArturd3_Z( )
   {
      return gxTv_SdtTARTICU_Arturd3_Z ;
   }

   public void setArturd3_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd3_Z = value ;
   }

   public short getArturdp1_Z( )
   {
      return gxTv_SdtTARTICU_Arturdp1_Z ;
   }

   public void setArturdp1_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp1_Z = value ;
   }

   public short getArturdp2_Z( )
   {
      return gxTv_SdtTARTICU_Arturdp2_Z ;
   }

   public void setArturdp2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp2_Z = value ;
   }

   public short getArturdp3_Z( )
   {
      return gxTv_SdtTARTICU_Arturdp3_Z ;
   }

   public void setArturdp3_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp3_Z = value ;
   }

   public short getArtenccom_Z( )
   {
      return gxTv_SdtTARTICU_Artenccom_Z ;
   }

   public void setArtenccom_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artenccom_Z = value ;
   }

   public short getArtencanh_Z( )
   {
      return gxTv_SdtTARTICU_Artencanh_Z ;
   }

   public void setArtencanh_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencanh_Z = value ;
   }

   public short getArtgraaca_Z( )
   {
      return gxTv_SdtTARTICU_Artgraaca_Z ;
   }

   public void setArtgraaca_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgraaca_Z = value ;
   }

   public java.math.BigDecimal getArtrdoa_Z( )
   {
      return gxTv_SdtTARTICU_Artrdoa_Z ;
   }

   public void setArtrdoa_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdoa_Z = value ;
   }

   public java.math.BigDecimal getArtrdon_Z( )
   {
      return gxTv_SdtTARTICU_Artrdon_Z ;
   }

   public void setArtrdon_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdon_Z = value ;
   }

   public java.math.BigDecimal getArtfacabs_Z( )
   {
      return gxTv_SdtTARTICU_Artfacabs_Z ;
   }

   public void setArtfacabs_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfacabs_Z = value ;
   }

   public String getArtple2_Z( )
   {
      return gxTv_SdtTARTICU_Artple2_Z ;
   }

   public void setArtple2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artple2_Z = value ;
   }

   public short getArtnumcor_Z( )
   {
      return gxTv_SdtTARTICU_Artnumcor_Z ;
   }

   public void setArtnumcor_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnumcor_Z = value ;
   }

   public short getArtancsal1_Z( )
   {
      return gxTv_SdtTARTICU_Artancsal1_Z ;
   }

   public void setArtancsal1_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal1_Z = value ;
   }

   public short getArtancsal2_Z( )
   {
      return gxTv_SdtTARTICU_Artancsal2_Z ;
   }

   public void setArtancsal2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal2_Z = value ;
   }

   public short getArtancsal3_Z( )
   {
      return gxTv_SdtTARTICU_Artancsal3_Z ;
   }

   public void setArtancsal3_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal3_Z = value ;
   }

   public short getArtgraaca2_Z( )
   {
      return gxTv_SdtTARTICU_Artgraaca2_Z ;
   }

   public void setArtgraaca2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgraaca2_Z = value ;
   }

   public short getArtgracru2_Z( )
   {
      return gxTv_SdtTARTICU_Artgracru2_Z ;
   }

   public void setArtgracru2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgracru2_Z = value ;
   }

   public short getClascod_Z( )
   {
      return gxTv_SdtTARTICU_Clascod_Z ;
   }

   public void setClascod_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clascod_Z = value ;
   }

   public java.math.BigDecimal getArtpmppza_Z( )
   {
      return gxTv_SdtTARTICU_Artpmppza_Z ;
   }

   public void setArtpmppza_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmppza_Z = value ;
   }

   public java.util.Date getArtfeccre_Z( )
   {
      return gxTv_SdtTARTICU_Artfeccre_Z ;
   }

   public void setArtfeccre_Z( java.util.Date value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfeccre_Z = value ;
   }

   public String getArtusrcod_Z( )
   {
      return gxTv_SdtTARTICU_Artusrcod_Z ;
   }

   public void setArtusrcod_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artusrcod_Z = value ;
   }

   public java.util.Date getArtfecmod_Z( )
   {
      return gxTv_SdtTARTICU_Artfecmod_Z ;
   }

   public void setArtfecmod_Z( java.util.Date value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfecmod_Z = value ;
   }

   public String getClasdsc_Z( )
   {
      return gxTv_SdtTARTICU_Clasdsc_Z ;
   }

   public void setClasdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clasdsc_Z = value ;
   }

   public String getArtcomer_Z( )
   {
      return gxTv_SdtTARTICU_Artcomer_Z ;
   }

   public void setArtcomer_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcomer_Z = value ;
   }

   public short getClatubcod_Z( )
   {
      return gxTv_SdtTARTICU_Clatubcod_Z ;
   }

   public void setClatubcod_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clatubcod_Z = value ;
   }

   public String getClatubdsc_Z( )
   {
      return gxTv_SdtTARTICU_Clatubdsc_Z ;
   }

   public void setClatubdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clatubdsc_Z = value ;
   }

   public short getClabolcod_Z( )
   {
      return gxTv_SdtTARTICU_Clabolcod_Z ;
   }

   public void setClabolcod_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clabolcod_Z = value ;
   }

   public String getClaboldsc_Z( )
   {
      return gxTv_SdtTARTICU_Claboldsc_Z ;
   }

   public void setClaboldsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Claboldsc_Z = value ;
   }

   public java.math.BigDecimal getArtrdocru1_Z( )
   {
      return gxTv_SdtTARTICU_Artrdocru1_Z ;
   }

   public void setArtrdocru1_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru1_Z = value ;
   }

   public java.math.BigDecimal getArtrdocru2_Z( )
   {
      return gxTv_SdtTARTICU_Artrdocru2_Z ;
   }

   public void setArtrdocru2_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru2_Z = value ;
   }

   public String getArtnmtr_Z( )
   {
      return gxTv_SdtTARTICU_Artnmtr_Z ;
   }

   public void setArtnmtr_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnmtr_Z = value ;
   }

   public java.math.BigDecimal getArtlu_Z( )
   {
      return gxTv_SdtTARTICU_Artlu_Z ;
   }

   public void setArtlu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artlu_Z = value ;
   }

   public short getArtrb_Z( )
   {
      return gxTv_SdtTARTICU_Artrb_Z ;
   }

   public void setArtrb_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrb_Z = value ;
   }

   public short getArtpelanh_Z( )
   {
      return gxTv_SdtTARTICU_Artpelanh_Z ;
   }

   public void setArtpelanh_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpelanh_Z = value ;
   }

   public short getArtgrm2sc_Z( )
   {
      return gxTv_SdtTARTICU_Artgrm2sc_Z ;
   }

   public void setArtgrm2sc_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrm2sc_Z = value ;
   }

   public short getArtpmlsc_Z( )
   {
      return gxTv_SdtTARTICU_Artpmlsc_Z ;
   }

   public void setArtpmlsc_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmlsc_Z = value ;
   }

   public short getArtancsc_Z( )
   {
      return gxTv_SdtTARTICU_Artancsc_Z ;
   }

   public void setArtancsc_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsc_Z = value ;
   }

   public short getArtpmlcru_Z( )
   {
      return gxTv_SdtTARTICU_Artpmlcru_Z ;
   }

   public void setArtpmlcru_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmlcru_Z = value ;
   }

   public java.math.BigDecimal getArtrdtsc_Z( )
   {
      return gxTv_SdtTARTICU_Artrdtsc_Z ;
   }

   public void setArtrdtsc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdtsc_Z = value ;
   }

   public String getArtund_Z( )
   {
      return gxTv_SdtTARTICU_Artund_Z ;
   }

   public void setArtund_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artund_Z = value ;
   }

   public String getArtblo_Z( )
   {
      return gxTv_SdtTARTICU_Artblo_Z ;
   }

   public void setArtblo_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artblo_Z = value ;
   }

   public byte getArtcla_Z( )
   {
      return gxTv_SdtTARTICU_Artcla_Z ;
   }

   public void setArtcla_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcla_Z = value ;
   }

   public String getTipartdsc2_Z( )
   {
      return gxTv_SdtTARTICU_Tipartdsc2_Z ;
   }

   public void setTipartdsc2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Tipartdsc2_Z = value ;
   }

   public java.math.BigDecimal getArtfabsh_Z( )
   {
      return gxTv_SdtTARTICU_Artfabsh_Z ;
   }

   public void setArtfabsh_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfabsh_Z = value ;
   }

   public java.math.BigDecimal getArtfabst_Z( )
   {
      return gxTv_SdtTARTICU_Artfabst_Z ;
   }

   public void setArtfabst_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfabst_Z = value ;
   }

   public byte getArtnprog_Z( )
   {
      return gxTv_SdtTARTICU_Artnprog_Z ;
   }

   public void setArtnprog_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnprog_Z = value ;
   }

   public short getArtvbd_Z( )
   {
      return gxTv_SdtTARTICU_Artvbd_Z ;
   }

   public void setArtvbd_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artvbd_Z = value ;
   }

   public short getArtvbn_Z( )
   {
      return gxTv_SdtTARTICU_Artvbn_Z ;
   }

   public void setArtvbn_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artvbn_Z = value ;
   }

   public short getArtab_Z( )
   {
      return gxTv_SdtTARTICU_Artab_Z ;
   }

   public void setArtab_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artab_Z = value ;
   }

   public String getArtobsgrm_Z( )
   {
      return gxTv_SdtTARTICU_Artobsgrm_Z ;
   }

   public void setArtobsgrm_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsgrm_Z = value ;
   }

   public String getArtobsanc_Z( )
   {
      return gxTv_SdtTARTICU_Artobsanc_Z ;
   }

   public void setArtobsanc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsanc_Z = value ;
   }

   public String getArtcdb_Z( )
   {
      return gxTv_SdtTARTICU_Artcdb_Z ;
   }

   public void setArtcdb_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcdb_Z = value ;
   }

   public String getArtgalga_Z( )
   {
      return gxTv_SdtTARTICU_Artgalga_Z ;
   }

   public void setArtgalga_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgalga_Z = value ;
   }

   public String getArtplatina_Z( )
   {
      return gxTv_SdtTARTICU_Artplatina_Z ;
   }

   public void setArtplatina_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artplatina_Z = value ;
   }

   public String getArtpgd_Z( )
   {
      return gxTv_SdtTARTICU_Artpgd_Z ;
   }

   public void setArtpgd_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpgd_Z = value ;
   }

   public short getArtth_Z( )
   {
      return gxTv_SdtTARTICU_Artth_Z ;
   }

   public void setArtth_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artth_Z = value ;
   }

   public String getArtthn_Z( )
   {
      return gxTv_SdtTARTICU_Artthn_Z ;
   }

   public void setArtthn_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artthn_Z = value ;
   }

   public short getArt_cd_Z( )
   {
      return gxTv_SdtTARTICU_Art_cd_Z ;
   }

   public void setArt_cd_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Art_cd_Z = value ;
   }

   public String getArt_dc_Z( )
   {
      return gxTv_SdtTARTICU_Art_dc_Z ;
   }

   public void setArt_dc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Art_dc_Z = value ;
   }

   public short getArthilos_Z( )
   {
      return gxTv_SdtTARTICU_Arthilos_Z ;
   }

   public void setArthilos_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arthilos_Z = value ;
   }

   public short getArtpasad_Z( )
   {
      return gxTv_SdtTARTICU_Artpasad_Z ;
   }

   public void setArtpasad_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpasad_Z = value ;
   }

   public short getArtancc_Z( )
   {
      return gxTv_SdtTARTICU_Artancc_Z ;
   }

   public void setArtancc_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancc_Z = value ;
   }

   public short getArtgrm2c_Z( )
   {
      return gxTv_SdtTARTICU_Artgrm2c_Z ;
   }

   public void setArtgrm2c_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrm2c_Z = value ;
   }

   public java.math.BigDecimal getArtrdoc_Z( )
   {
      return gxTv_SdtTARTICU_Artrdoc_Z ;
   }

   public void setArtrdoc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdoc_Z = value ;
   }

   public int getArtacafor_Z( )
   {
      return gxTv_SdtTARTICU_Artacafor_Z ;
   }

   public void setArtacafor_Z( int value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacafor_Z = value ;
   }

   public String getArtanu_Z( )
   {
      return gxTv_SdtTARTICU_Artanu_Z ;
   }

   public void setArtanu_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artanu_Z = value ;
   }

   public java.math.BigDecimal getArtfacuti_Z( )
   {
      return gxTv_SdtTARTICU_Artfacuti_Z ;
   }

   public void setArtfacuti_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfacuti_Z = value ;
   }

   public int getArtnumtip_Z( )
   {
      return gxTv_SdtTARTICU_Artnumtip_Z ;
   }

   public void setArtnumtip_Z( int value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnumtip_Z = value ;
   }

   public byte getArtmt_Z( )
   {
      return gxTv_SdtTARTICU_Artmt_Z ;
   }

   public void setArtmt_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmt_Z = value ;
   }

   public byte getArttrabs_Z( )
   {
      return gxTv_SdtTARTICU_Arttrabs_Z ;
   }

   public void setArttrabs_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrabs_Z = value ;
   }

   public java.math.BigDecimal getArtkgmn_Z( )
   {
      return gxTv_SdtTARTICU_Artkgmn_Z ;
   }

   public void setArtkgmn_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artkgmn_Z = value ;
   }

   public String getArtacamar_Z( )
   {
      return gxTv_SdtTARTICU_Artacamar_Z ;
   }

   public void setArtacamar_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamar_Z = value ;
   }

   public String getArtacabak_Z( )
   {
      return gxTv_SdtTARTICU_Artacabak_Z ;
   }

   public void setArtacabak_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacabak_Z = value ;
   }

   public java.math.BigDecimal getArtelganc_Z( )
   {
      return gxTv_SdtTARTICU_Artelganc_Z ;
   }

   public void setArtelganc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artelganc_Z = value ;
   }

   public java.math.BigDecimal getArtelglar_Z( )
   {
      return gxTv_SdtTARTICU_Artelglar_Z ;
   }

   public void setArtelglar_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artelglar_Z = value ;
   }

   public java.math.BigDecimal getArtrdocru_Z( )
   {
      return gxTv_SdtTARTICU_Artrdocru_Z ;
   }

   public void setArtrdocru_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru_Z = value ;
   }

   public java.math.BigDecimal getArtenclarg_Z( )
   {
      return gxTv_SdtTARTICU_Artenclarg_Z ;
   }

   public void setArtenclarg_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artenclarg_Z = value ;
   }

   public java.math.BigDecimal getArtencanc_Z( )
   {
      return gxTv_SdtTARTICU_Artencanc_Z ;
   }

   public void setArtencanc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencanc_Z = value ;
   }

   public java.math.BigDecimal getArtrdto4_Z( )
   {
      return gxTv_SdtTARTICU_Artrdto4_Z ;
   }

   public void setArtrdto4_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdto4_Z = value ;
   }

   public String getArtdsc2_Z( )
   {
      return gxTv_SdtTARTICU_Artdsc2_Z ;
   }

   public void setArtdsc2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artdsc2_Z = value ;
   }

   public java.math.BigDecimal getArtgrcomp_Z( )
   {
      return gxTv_SdtTARTICU_Artgrcomp_Z ;
   }

   public void setArtgrcomp_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrcomp_Z = value ;
   }

   public java.math.BigDecimal getArtkgspp_Z( )
   {
      return gxTv_SdtTARTICU_Artkgspp_Z ;
   }

   public void setArtkgspp_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artkgspp_Z = value ;
   }

   public java.math.BigDecimal getArtprepp_Z( )
   {
      return gxTv_SdtTARTICU_Artprepp_Z ;
   }

   public void setArtprepp_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artprepp_Z = value ;
   }

   public String getArtcdsc_Z( )
   {
      return gxTv_SdtTARTICU_Artcdsc_Z ;
   }

   public void setArtcdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcdsc_Z = value ;
   }

   public String getArtobsfac_Z( )
   {
      return gxTv_SdtTARTICU_Artobsfac_Z ;
   }

   public void setArtobsfac_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsfac_Z = value ;
   }

   public String getArtobsotras_Z( )
   {
      return gxTv_SdtTARTICU_Artobsotras_Z ;
   }

   public void setArtobsotras_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsotras_Z = value ;
   }

   public String getArtactivo_Z( )
   {
      return gxTv_SdtTARTICU_Artactivo_Z ;
   }

   public void setArtactivo_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artactivo_Z = value ;
   }

   public byte getClicod_N( )
   {
      return gxTv_SdtTARTICU_Clicod_N ;
   }

   public void setClicod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clicod_N = value ;
   }

   public byte getArtcod_N( )
   {
      return gxTv_SdtTARTICU_Artcod_N ;
   }

   public void setArtcod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcod_N = value ;
   }

   public byte getArtdsc_N( )
   {
      return gxTv_SdtTARTICU_Artdsc_N ;
   }

   public void setArtdsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artdsc_N = value ;
   }

   public byte getArtcodext_N( )
   {
      return gxTv_SdtTARTICU_Artcodext_N ;
   }

   public void setArtcodext_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcodext_N = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTARTICU_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Emprnom_N = value ;
   }

   public byte getArtmat_N( )
   {
      return gxTv_SdtTARTICU_Artmat_N ;
   }

   public void setArtmat_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmat_N = value ;
   }

   public byte getTipartdsc_N( )
   {
      return gxTv_SdtTARTICU_Tipartdsc_N ;
   }

   public void setTipartdsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Tipartdsc_N = value ;
   }

   public byte getArtpml_N( )
   {
      return gxTv_SdtTARTICU_Artpml_N ;
   }

   public void setArtpml_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpml_N = value ;
   }

   public byte getArtgracru_N( )
   {
      return gxTv_SdtTARTICU_Artgracru_N ;
   }

   public void setArtgracru_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgracru_N = value ;
   }

   public byte getArtcrumin_N( )
   {
      return gxTv_SdtTARTICU_Artcrumin_N ;
   }

   public void setArtcrumin_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcrumin_N = value ;
   }

   public byte getArtcrumax_N( )
   {
      return gxTv_SdtTARTICU_Artcrumax_N ;
   }

   public void setArtcrumax_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcrumax_N = value ;
   }

   public byte getArtacamin_N( )
   {
      return gxTv_SdtTARTICU_Artacamin_N ;
   }

   public void setArtacamin_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamin_N = value ;
   }

   public byte getArtacamax_N( )
   {
      return gxTv_SdtTARTICU_Artacamax_N ;
   }

   public void setArtacamax_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamax_N = value ;
   }

   public byte getArtren_N( )
   {
      return gxTv_SdtTARTICU_Artren_N ;
   }

   public void setArtren_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artren_N = value ;
   }

   public byte getArttipple_N( )
   {
      return gxTv_SdtTARTICU_Arttipple_N ;
   }

   public void setArttipple_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttipple_N = value ;
   }

   public byte getArttiplar_N( )
   {
      return gxTv_SdtTARTICU_Arttiplar_N ;
   }

   public void setArttiplar_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttiplar_N = value ;
   }

   public byte getArtcorori_N( )
   {
      return gxTv_SdtTARTICU_Artcorori_N ;
   }

   public void setArtcorori_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcorori_N = value ;
   }

   public byte getArtencori_N( )
   {
      return gxTv_SdtTARTICU_Artencori_N ;
   }

   public void setArtencori_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencori_N = value ;
   }

   public byte getArtsua_N( )
   {
      return gxTv_SdtTARTICU_Artsua_N ;
   }

   public void setArtsua_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artsua_N = value ;
   }

   public byte getArtacaqui_N( )
   {
      return gxTv_SdtTARTICU_Artacaqui_N ;
   }

   public void setArtacaqui_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacaqui_N = value ;
   }

   public byte getArteti_N( )
   {
      return gxTv_SdtTARTICU_Arteti_N ;
   }

   public void setArteti_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arteti_N = value ;
   }

   public byte getArturg_N( )
   {
      return gxTv_SdtTARTICU_Arturg_N ;
   }

   public void setArturg_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturg_N = value ;
   }

   public byte getArtmer_N( )
   {
      return gxTv_SdtTARTICU_Artmer_N ;
   }

   public void setArtmer_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmer_N = value ;
   }

   public byte getArttra1_N( )
   {
      return gxTv_SdtTARTICU_Arttra1_N ;
   }

   public void setArttra1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra1_N = value ;
   }

   public byte getArttra2_N( )
   {
      return gxTv_SdtTARTICU_Arttra2_N ;
   }

   public void setArttra2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra2_N = value ;
   }

   public byte getArttra3_N( )
   {
      return gxTv_SdtTARTICU_Arttra3_N ;
   }

   public void setArttra3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttra3_N = value ;
   }

   public byte getArttrap1_N( )
   {
      return gxTv_SdtTARTICU_Arttrap1_N ;
   }

   public void setArttrap1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap1_N = value ;
   }

   public byte getArttrap2_N( )
   {
      return gxTv_SdtTARTICU_Arttrap2_N ;
   }

   public void setArttrap2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap2_N = value ;
   }

   public byte getArttrap3_N( )
   {
      return gxTv_SdtTARTICU_Arttrap3_N ;
   }

   public void setArttrap3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrap3_N = value ;
   }

   public byte getArturd1_N( )
   {
      return gxTv_SdtTARTICU_Arturd1_N ;
   }

   public void setArturd1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd1_N = value ;
   }

   public byte getArturd2_N( )
   {
      return gxTv_SdtTARTICU_Arturd2_N ;
   }

   public void setArturd2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd2_N = value ;
   }

   public byte getArturd3_N( )
   {
      return gxTv_SdtTARTICU_Arturd3_N ;
   }

   public void setArturd3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturd3_N = value ;
   }

   public byte getArturdp1_N( )
   {
      return gxTv_SdtTARTICU_Arturdp1_N ;
   }

   public void setArturdp1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp1_N = value ;
   }

   public byte getArturdp2_N( )
   {
      return gxTv_SdtTARTICU_Arturdp2_N ;
   }

   public void setArturdp2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp2_N = value ;
   }

   public byte getArturdp3_N( )
   {
      return gxTv_SdtTARTICU_Arturdp3_N ;
   }

   public void setArturdp3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arturdp3_N = value ;
   }

   public byte getArtenccom_N( )
   {
      return gxTv_SdtTARTICU_Artenccom_N ;
   }

   public void setArtenccom_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artenccom_N = value ;
   }

   public byte getArtencanh_N( )
   {
      return gxTv_SdtTARTICU_Artencanh_N ;
   }

   public void setArtencanh_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencanh_N = value ;
   }

   public byte getArtgraaca_N( )
   {
      return gxTv_SdtTARTICU_Artgraaca_N ;
   }

   public void setArtgraaca_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgraaca_N = value ;
   }

   public byte getArtrdoa_N( )
   {
      return gxTv_SdtTARTICU_Artrdoa_N ;
   }

   public void setArtrdoa_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdoa_N = value ;
   }

   public byte getArtrdon_N( )
   {
      return gxTv_SdtTARTICU_Artrdon_N ;
   }

   public void setArtrdon_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdon_N = value ;
   }

   public byte getArtfacabs_N( )
   {
      return gxTv_SdtTARTICU_Artfacabs_N ;
   }

   public void setArtfacabs_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfacabs_N = value ;
   }

   public byte getArtple2_N( )
   {
      return gxTv_SdtTARTICU_Artple2_N ;
   }

   public void setArtple2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artple2_N = value ;
   }

   public byte getArtnumcor_N( )
   {
      return gxTv_SdtTARTICU_Artnumcor_N ;
   }

   public void setArtnumcor_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnumcor_N = value ;
   }

   public byte getArtancsal1_N( )
   {
      return gxTv_SdtTARTICU_Artancsal1_N ;
   }

   public void setArtancsal1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal1_N = value ;
   }

   public byte getArtancsal2_N( )
   {
      return gxTv_SdtTARTICU_Artancsal2_N ;
   }

   public void setArtancsal2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal2_N = value ;
   }

   public byte getArtancsal3_N( )
   {
      return gxTv_SdtTARTICU_Artancsal3_N ;
   }

   public void setArtancsal3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsal3_N = value ;
   }

   public byte getArtgraaca2_N( )
   {
      return gxTv_SdtTARTICU_Artgraaca2_N ;
   }

   public void setArtgraaca2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgraaca2_N = value ;
   }

   public byte getArtgracru2_N( )
   {
      return gxTv_SdtTARTICU_Artgracru2_N ;
   }

   public void setArtgracru2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgracru2_N = value ;
   }

   public byte getClascod_N( )
   {
      return gxTv_SdtTARTICU_Clascod_N ;
   }

   public void setClascod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clascod_N = value ;
   }

   public byte getArtpmppza_N( )
   {
      return gxTv_SdtTARTICU_Artpmppza_N ;
   }

   public void setArtpmppza_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmppza_N = value ;
   }

   public byte getArtfeccre_N( )
   {
      return gxTv_SdtTARTICU_Artfeccre_N ;
   }

   public void setArtfeccre_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfeccre_N = value ;
   }

   public byte getArtusrcod_N( )
   {
      return gxTv_SdtTARTICU_Artusrcod_N ;
   }

   public void setArtusrcod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artusrcod_N = value ;
   }

   public byte getArtfecmod_N( )
   {
      return gxTv_SdtTARTICU_Artfecmod_N ;
   }

   public void setArtfecmod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfecmod_N = value ;
   }

   public byte getClasdsc_N( )
   {
      return gxTv_SdtTARTICU_Clasdsc_N ;
   }

   public void setClasdsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clasdsc_N = value ;
   }

   public byte getArtcomer_N( )
   {
      return gxTv_SdtTARTICU_Artcomer_N ;
   }

   public void setArtcomer_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcomer_N = value ;
   }

   public byte getClatubcod_N( )
   {
      return gxTv_SdtTARTICU_Clatubcod_N ;
   }

   public void setClatubcod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clatubcod_N = value ;
   }

   public byte getClatubdsc_N( )
   {
      return gxTv_SdtTARTICU_Clatubdsc_N ;
   }

   public void setClatubdsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clatubdsc_N = value ;
   }

   public byte getClabolcod_N( )
   {
      return gxTv_SdtTARTICU_Clabolcod_N ;
   }

   public void setClabolcod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Clabolcod_N = value ;
   }

   public byte getClaboldsc_N( )
   {
      return gxTv_SdtTARTICU_Claboldsc_N ;
   }

   public void setClaboldsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Claboldsc_N = value ;
   }

   public byte getArtrdocru1_N( )
   {
      return gxTv_SdtTARTICU_Artrdocru1_N ;
   }

   public void setArtrdocru1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru1_N = value ;
   }

   public byte getArtrdocru2_N( )
   {
      return gxTv_SdtTARTICU_Artrdocru2_N ;
   }

   public void setArtrdocru2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru2_N = value ;
   }

   public byte getArtnmtr_N( )
   {
      return gxTv_SdtTARTICU_Artnmtr_N ;
   }

   public void setArtnmtr_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnmtr_N = value ;
   }

   public byte getArtlu_N( )
   {
      return gxTv_SdtTARTICU_Artlu_N ;
   }

   public void setArtlu_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artlu_N = value ;
   }

   public byte getArtrb_N( )
   {
      return gxTv_SdtTARTICU_Artrb_N ;
   }

   public void setArtrb_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrb_N = value ;
   }

   public byte getArtpelanh_N( )
   {
      return gxTv_SdtTARTICU_Artpelanh_N ;
   }

   public void setArtpelanh_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpelanh_N = value ;
   }

   public byte getArtgrm2sc_N( )
   {
      return gxTv_SdtTARTICU_Artgrm2sc_N ;
   }

   public void setArtgrm2sc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrm2sc_N = value ;
   }

   public byte getArtpmlsc_N( )
   {
      return gxTv_SdtTARTICU_Artpmlsc_N ;
   }

   public void setArtpmlsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmlsc_N = value ;
   }

   public byte getArtancsc_N( )
   {
      return gxTv_SdtTARTICU_Artancsc_N ;
   }

   public void setArtancsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancsc_N = value ;
   }

   public byte getArtpmlcru_N( )
   {
      return gxTv_SdtTARTICU_Artpmlcru_N ;
   }

   public void setArtpmlcru_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpmlcru_N = value ;
   }

   public byte getArtrdtsc_N( )
   {
      return gxTv_SdtTARTICU_Artrdtsc_N ;
   }

   public void setArtrdtsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdtsc_N = value ;
   }

   public byte getArtund_N( )
   {
      return gxTv_SdtTARTICU_Artund_N ;
   }

   public void setArtund_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artund_N = value ;
   }

   public byte getArtblo_N( )
   {
      return gxTv_SdtTARTICU_Artblo_N ;
   }

   public void setArtblo_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artblo_N = value ;
   }

   public byte getArtcla_N( )
   {
      return gxTv_SdtTARTICU_Artcla_N ;
   }

   public void setArtcla_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcla_N = value ;
   }

   public byte getTipartdsc2_N( )
   {
      return gxTv_SdtTARTICU_Tipartdsc2_N ;
   }

   public void setTipartdsc2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Tipartdsc2_N = value ;
   }

   public byte getArtfabsh_N( )
   {
      return gxTv_SdtTARTICU_Artfabsh_N ;
   }

   public void setArtfabsh_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfabsh_N = value ;
   }

   public byte getArtfabst_N( )
   {
      return gxTv_SdtTARTICU_Artfabst_N ;
   }

   public void setArtfabst_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfabst_N = value ;
   }

   public byte getArtnprog_N( )
   {
      return gxTv_SdtTARTICU_Artnprog_N ;
   }

   public void setArtnprog_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnprog_N = value ;
   }

   public byte getArtvbd_N( )
   {
      return gxTv_SdtTARTICU_Artvbd_N ;
   }

   public void setArtvbd_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artvbd_N = value ;
   }

   public byte getArtvbn_N( )
   {
      return gxTv_SdtTARTICU_Artvbn_N ;
   }

   public void setArtvbn_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artvbn_N = value ;
   }

   public byte getArtab_N( )
   {
      return gxTv_SdtTARTICU_Artab_N ;
   }

   public void setArtab_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artab_N = value ;
   }

   public byte getArtobsgrm_N( )
   {
      return gxTv_SdtTARTICU_Artobsgrm_N ;
   }

   public void setArtobsgrm_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsgrm_N = value ;
   }

   public byte getArtobsanc_N( )
   {
      return gxTv_SdtTARTICU_Artobsanc_N ;
   }

   public void setArtobsanc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsanc_N = value ;
   }

   public byte getArtcdb_N( )
   {
      return gxTv_SdtTARTICU_Artcdb_N ;
   }

   public void setArtcdb_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artcdb_N = value ;
   }

   public byte getArtgalga_N( )
   {
      return gxTv_SdtTARTICU_Artgalga_N ;
   }

   public void setArtgalga_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgalga_N = value ;
   }

   public byte getArtplatina_N( )
   {
      return gxTv_SdtTARTICU_Artplatina_N ;
   }

   public void setArtplatina_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artplatina_N = value ;
   }

   public byte getArtpgd_N( )
   {
      return gxTv_SdtTARTICU_Artpgd_N ;
   }

   public void setArtpgd_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpgd_N = value ;
   }

   public byte getArtth_N( )
   {
      return gxTv_SdtTARTICU_Artth_N ;
   }

   public void setArtth_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artth_N = value ;
   }

   public byte getArtthn_N( )
   {
      return gxTv_SdtTARTICU_Artthn_N ;
   }

   public void setArtthn_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artthn_N = value ;
   }

   public byte getArt_cd_N( )
   {
      return gxTv_SdtTARTICU_Art_cd_N ;
   }

   public void setArt_cd_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Art_cd_N = value ;
   }

   public byte getArt_dc_N( )
   {
      return gxTv_SdtTARTICU_Art_dc_N ;
   }

   public void setArt_dc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Art_dc_N = value ;
   }

   public byte getArthilos_N( )
   {
      return gxTv_SdtTARTICU_Arthilos_N ;
   }

   public void setArthilos_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arthilos_N = value ;
   }

   public byte getArtpasad_N( )
   {
      return gxTv_SdtTARTICU_Artpasad_N ;
   }

   public void setArtpasad_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artpasad_N = value ;
   }

   public byte getArtancc_N( )
   {
      return gxTv_SdtTARTICU_Artancc_N ;
   }

   public void setArtancc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artancc_N = value ;
   }

   public byte getArtgrm2c_N( )
   {
      return gxTv_SdtTARTICU_Artgrm2c_N ;
   }

   public void setArtgrm2c_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrm2c_N = value ;
   }

   public byte getArtrdoc_N( )
   {
      return gxTv_SdtTARTICU_Artrdoc_N ;
   }

   public void setArtrdoc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdoc_N = value ;
   }

   public byte getArtacafor_N( )
   {
      return gxTv_SdtTARTICU_Artacafor_N ;
   }

   public void setArtacafor_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacafor_N = value ;
   }

   public byte getArtanu_N( )
   {
      return gxTv_SdtTARTICU_Artanu_N ;
   }

   public void setArtanu_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artanu_N = value ;
   }

   public byte getArtfacuti_N( )
   {
      return gxTv_SdtTARTICU_Artfacuti_N ;
   }

   public void setArtfacuti_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artfacuti_N = value ;
   }

   public byte getArtnumtip_N( )
   {
      return gxTv_SdtTARTICU_Artnumtip_N ;
   }

   public void setArtnumtip_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artnumtip_N = value ;
   }

   public byte getArtmt_N( )
   {
      return gxTv_SdtTARTICU_Artmt_N ;
   }

   public void setArtmt_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artmt_N = value ;
   }

   public byte getArttrabs_N( )
   {
      return gxTv_SdtTARTICU_Arttrabs_N ;
   }

   public void setArttrabs_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Arttrabs_N = value ;
   }

   public byte getArtkgmn_N( )
   {
      return gxTv_SdtTARTICU_Artkgmn_N ;
   }

   public void setArtkgmn_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artkgmn_N = value ;
   }

   public byte getArtacamar_N( )
   {
      return gxTv_SdtTARTICU_Artacamar_N ;
   }

   public void setArtacamar_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacamar_N = value ;
   }

   public byte getArtacabak_N( )
   {
      return gxTv_SdtTARTICU_Artacabak_N ;
   }

   public void setArtacabak_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artacabak_N = value ;
   }

   public byte getArtelganc_N( )
   {
      return gxTv_SdtTARTICU_Artelganc_N ;
   }

   public void setArtelganc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artelganc_N = value ;
   }

   public byte getArtelglar_N( )
   {
      return gxTv_SdtTARTICU_Artelglar_N ;
   }

   public void setArtelglar_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artelglar_N = value ;
   }

   public byte getArtrdocru_N( )
   {
      return gxTv_SdtTARTICU_Artrdocru_N ;
   }

   public void setArtrdocru_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdocru_N = value ;
   }

   public byte getArtenclarg_N( )
   {
      return gxTv_SdtTARTICU_Artenclarg_N ;
   }

   public void setArtenclarg_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artenclarg_N = value ;
   }

   public byte getArtencanc_N( )
   {
      return gxTv_SdtTARTICU_Artencanc_N ;
   }

   public void setArtencanc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artencanc_N = value ;
   }

   public byte getArtrdto4_N( )
   {
      return gxTv_SdtTARTICU_Artrdto4_N ;
   }

   public void setArtrdto4_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artrdto4_N = value ;
   }

   public byte getArtdsc2_N( )
   {
      return gxTv_SdtTARTICU_Artdsc2_N ;
   }

   public void setArtdsc2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artdsc2_N = value ;
   }

   public byte getArtgrcomp_N( )
   {
      return gxTv_SdtTARTICU_Artgrcomp_N ;
   }

   public void setArtgrcomp_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artgrcomp_N = value ;
   }

   public byte getArtkgspp_N( )
   {
      return gxTv_SdtTARTICU_Artkgspp_N ;
   }

   public void setArtkgspp_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artkgspp_N = value ;
   }

   public byte getArtprepp_N( )
   {
      return gxTv_SdtTARTICU_Artprepp_N ;
   }

   public void setArtprepp_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artprepp_N = value ;
   }

   public byte getArtobslon_N( )
   {
      return gxTv_SdtTARTICU_Artobslon_N ;
   }

   public void setArtobslon_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobslon_N = value ;
   }

   public byte getArtobsfac_N( )
   {
      return gxTv_SdtTARTICU_Artobsfac_N ;
   }

   public void setArtobsfac_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsfac_N = value ;
   }

   public byte getArtobsotras_N( )
   {
      return gxTv_SdtTARTICU_Artobsotras_N ;
   }

   public void setArtobsotras_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      gxTv_SdtTARTICU_Artobsotras_N = value ;
   }

   protected byte gxTv_SdtTARTICU_Cliurg ;
   protected byte gxTv_SdtTARTICU_Arturg ;
   protected byte gxTv_SdtTARTICU_Artcla ;
   protected byte gxTv_SdtTARTICU_Artnprog ;
   protected byte gxTv_SdtTARTICU_Artmt ;
   protected byte gxTv_SdtTARTICU_Arttrabs ;
   protected byte gxTv_SdtTARTICU_Cliurg_Z ;
   protected byte gxTv_SdtTARTICU_Arturg_Z ;
   protected byte gxTv_SdtTARTICU_Artcla_Z ;
   protected byte gxTv_SdtTARTICU_Artnprog_Z ;
   protected byte gxTv_SdtTARTICU_Artmt_Z ;
   protected byte gxTv_SdtTARTICU_Arttrabs_Z ;
   protected byte gxTv_SdtTARTICU_Clicod_N ;
   protected byte gxTv_SdtTARTICU_Artcod_N ;
   protected byte gxTv_SdtTARTICU_Artdsc_N ;
   protected byte gxTv_SdtTARTICU_Artcodext_N ;
   protected byte gxTv_SdtTARTICU_Emprnom_N ;
   protected byte gxTv_SdtTARTICU_Artmat_N ;
   protected byte gxTv_SdtTARTICU_Tipartdsc_N ;
   protected byte gxTv_SdtTARTICU_Artpml_N ;
   protected byte gxTv_SdtTARTICU_Artgracru_N ;
   protected byte gxTv_SdtTARTICU_Artcrumin_N ;
   protected byte gxTv_SdtTARTICU_Artcrumax_N ;
   protected byte gxTv_SdtTARTICU_Artacamin_N ;
   protected byte gxTv_SdtTARTICU_Artacamax_N ;
   protected byte gxTv_SdtTARTICU_Artren_N ;
   protected byte gxTv_SdtTARTICU_Arttipple_N ;
   protected byte gxTv_SdtTARTICU_Arttiplar_N ;
   protected byte gxTv_SdtTARTICU_Artcorori_N ;
   protected byte gxTv_SdtTARTICU_Artencori_N ;
   protected byte gxTv_SdtTARTICU_Artsua_N ;
   protected byte gxTv_SdtTARTICU_Artacaqui_N ;
   protected byte gxTv_SdtTARTICU_Arteti_N ;
   protected byte gxTv_SdtTARTICU_Arturg_N ;
   protected byte gxTv_SdtTARTICU_Artmer_N ;
   protected byte gxTv_SdtTARTICU_Arttra1_N ;
   protected byte gxTv_SdtTARTICU_Arttra2_N ;
   protected byte gxTv_SdtTARTICU_Arttra3_N ;
   protected byte gxTv_SdtTARTICU_Arttrap1_N ;
   protected byte gxTv_SdtTARTICU_Arttrap2_N ;
   protected byte gxTv_SdtTARTICU_Arttrap3_N ;
   protected byte gxTv_SdtTARTICU_Arturd1_N ;
   protected byte gxTv_SdtTARTICU_Arturd2_N ;
   protected byte gxTv_SdtTARTICU_Arturd3_N ;
   protected byte gxTv_SdtTARTICU_Arturdp1_N ;
   protected byte gxTv_SdtTARTICU_Arturdp2_N ;
   protected byte gxTv_SdtTARTICU_Arturdp3_N ;
   protected byte gxTv_SdtTARTICU_Artenccom_N ;
   protected byte gxTv_SdtTARTICU_Artencanh_N ;
   protected byte gxTv_SdtTARTICU_Artgraaca_N ;
   protected byte gxTv_SdtTARTICU_Artrdoa_N ;
   protected byte gxTv_SdtTARTICU_Artrdon_N ;
   protected byte gxTv_SdtTARTICU_Artfacabs_N ;
   protected byte gxTv_SdtTARTICU_Artple2_N ;
   protected byte gxTv_SdtTARTICU_Artnumcor_N ;
   protected byte gxTv_SdtTARTICU_Artancsal1_N ;
   protected byte gxTv_SdtTARTICU_Artancsal2_N ;
   protected byte gxTv_SdtTARTICU_Artancsal3_N ;
   protected byte gxTv_SdtTARTICU_Artgraaca2_N ;
   protected byte gxTv_SdtTARTICU_Artgracru2_N ;
   protected byte gxTv_SdtTARTICU_Clascod_N ;
   protected byte gxTv_SdtTARTICU_Artpmppza_N ;
   protected byte gxTv_SdtTARTICU_Artfeccre_N ;
   protected byte gxTv_SdtTARTICU_Artusrcod_N ;
   protected byte gxTv_SdtTARTICU_Artfecmod_N ;
   protected byte gxTv_SdtTARTICU_Clasdsc_N ;
   protected byte gxTv_SdtTARTICU_Artcomer_N ;
   protected byte gxTv_SdtTARTICU_Clatubcod_N ;
   protected byte gxTv_SdtTARTICU_Clatubdsc_N ;
   protected byte gxTv_SdtTARTICU_Clabolcod_N ;
   protected byte gxTv_SdtTARTICU_Claboldsc_N ;
   protected byte gxTv_SdtTARTICU_Artrdocru1_N ;
   protected byte gxTv_SdtTARTICU_Artrdocru2_N ;
   protected byte gxTv_SdtTARTICU_Artnmtr_N ;
   protected byte gxTv_SdtTARTICU_Artlu_N ;
   protected byte gxTv_SdtTARTICU_Artrb_N ;
   protected byte gxTv_SdtTARTICU_Artpelanh_N ;
   protected byte gxTv_SdtTARTICU_Artgrm2sc_N ;
   protected byte gxTv_SdtTARTICU_Artpmlsc_N ;
   protected byte gxTv_SdtTARTICU_Artancsc_N ;
   protected byte gxTv_SdtTARTICU_Artpmlcru_N ;
   protected byte gxTv_SdtTARTICU_Artrdtsc_N ;
   protected byte gxTv_SdtTARTICU_Artund_N ;
   protected byte gxTv_SdtTARTICU_Artblo_N ;
   protected byte gxTv_SdtTARTICU_Artcla_N ;
   protected byte gxTv_SdtTARTICU_Tipartdsc2_N ;
   protected byte gxTv_SdtTARTICU_Artfabsh_N ;
   protected byte gxTv_SdtTARTICU_Artfabst_N ;
   protected byte gxTv_SdtTARTICU_Artnprog_N ;
   protected byte gxTv_SdtTARTICU_Artvbd_N ;
   protected byte gxTv_SdtTARTICU_Artvbn_N ;
   protected byte gxTv_SdtTARTICU_Artab_N ;
   protected byte gxTv_SdtTARTICU_Artobsgrm_N ;
   protected byte gxTv_SdtTARTICU_Artobsanc_N ;
   protected byte gxTv_SdtTARTICU_Artcdb_N ;
   protected byte gxTv_SdtTARTICU_Artgalga_N ;
   protected byte gxTv_SdtTARTICU_Artplatina_N ;
   protected byte gxTv_SdtTARTICU_Artpgd_N ;
   protected byte gxTv_SdtTARTICU_Artth_N ;
   protected byte gxTv_SdtTARTICU_Artthn_N ;
   protected byte gxTv_SdtTARTICU_Art_cd_N ;
   protected byte gxTv_SdtTARTICU_Art_dc_N ;
   protected byte gxTv_SdtTARTICU_Arthilos_N ;
   protected byte gxTv_SdtTARTICU_Artpasad_N ;
   protected byte gxTv_SdtTARTICU_Artancc_N ;
   protected byte gxTv_SdtTARTICU_Artgrm2c_N ;
   protected byte gxTv_SdtTARTICU_Artrdoc_N ;
   protected byte gxTv_SdtTARTICU_Artacafor_N ;
   protected byte gxTv_SdtTARTICU_Artanu_N ;
   protected byte gxTv_SdtTARTICU_Artfacuti_N ;
   protected byte gxTv_SdtTARTICU_Artnumtip_N ;
   protected byte gxTv_SdtTARTICU_Artmt_N ;
   protected byte gxTv_SdtTARTICU_Arttrabs_N ;
   protected byte gxTv_SdtTARTICU_Artkgmn_N ;
   protected byte gxTv_SdtTARTICU_Artacamar_N ;
   protected byte gxTv_SdtTARTICU_Artacabak_N ;
   protected byte gxTv_SdtTARTICU_Artelganc_N ;
   protected byte gxTv_SdtTARTICU_Artelglar_N ;
   protected byte gxTv_SdtTARTICU_Artrdocru_N ;
   protected byte gxTv_SdtTARTICU_Artenclarg_N ;
   protected byte gxTv_SdtTARTICU_Artencanc_N ;
   protected byte gxTv_SdtTARTICU_Artrdto4_N ;
   protected byte gxTv_SdtTARTICU_Artdsc2_N ;
   protected byte gxTv_SdtTARTICU_Artgrcomp_N ;
   protected byte gxTv_SdtTARTICU_Artkgspp_N ;
   protected byte gxTv_SdtTARTICU_Artprepp_N ;
   protected byte gxTv_SdtTARTICU_Artobslon_N ;
   protected byte gxTv_SdtTARTICU_Artobsfac_N ;
   protected byte gxTv_SdtTARTICU_Artobsotras_N ;
   private byte gxTv_SdtTARTICU_N ;
   protected short gxTv_SdtTARTICU_Tipartcod ;
   protected short gxTv_SdtTARTICU_Artpml ;
   protected short gxTv_SdtTARTICU_Artgracru ;
   protected short gxTv_SdtTARTICU_Artcrumin ;
   protected short gxTv_SdtTARTICU_Artcrumax ;
   protected short gxTv_SdtTARTICU_Artacamin ;
   protected short gxTv_SdtTARTICU_Artacamax ;
   protected short gxTv_SdtTARTICU_Arttrap1 ;
   protected short gxTv_SdtTARTICU_Arttrap2 ;
   protected short gxTv_SdtTARTICU_Arttrap3 ;
   protected short gxTv_SdtTARTICU_Arturdp1 ;
   protected short gxTv_SdtTARTICU_Arturdp2 ;
   protected short gxTv_SdtTARTICU_Arturdp3 ;
   protected short gxTv_SdtTARTICU_Artenccom ;
   protected short gxTv_SdtTARTICU_Artencanh ;
   protected short gxTv_SdtTARTICU_Artgraaca ;
   protected short gxTv_SdtTARTICU_Artnumcor ;
   protected short gxTv_SdtTARTICU_Artancsal1 ;
   protected short gxTv_SdtTARTICU_Artancsal2 ;
   protected short gxTv_SdtTARTICU_Artancsal3 ;
   protected short gxTv_SdtTARTICU_Artgraaca2 ;
   protected short gxTv_SdtTARTICU_Artgracru2 ;
   protected short gxTv_SdtTARTICU_Clascod ;
   protected short gxTv_SdtTARTICU_Clatubcod ;
   protected short gxTv_SdtTARTICU_Clabolcod ;
   protected short gxTv_SdtTARTICU_Artrb ;
   protected short gxTv_SdtTARTICU_Artpelanh ;
   protected short gxTv_SdtTARTICU_Artgrm2sc ;
   protected short gxTv_SdtTARTICU_Artpmlsc ;
   protected short gxTv_SdtTARTICU_Artancsc ;
   protected short gxTv_SdtTARTICU_Artpmlcru ;
   protected short gxTv_SdtTARTICU_Artvbd ;
   protected short gxTv_SdtTARTICU_Artvbn ;
   protected short gxTv_SdtTARTICU_Artab ;
   protected short gxTv_SdtTARTICU_Artth ;
   protected short gxTv_SdtTARTICU_Art_cd ;
   protected short gxTv_SdtTARTICU_Arthilos ;
   protected short gxTv_SdtTARTICU_Artpasad ;
   protected short gxTv_SdtTARTICU_Artancc ;
   protected short gxTv_SdtTARTICU_Artgrm2c ;
   protected short gxTv_SdtTARTICU_Initialized ;
   protected short gxTv_SdtTARTICU_Tipartcod_Z ;
   protected short gxTv_SdtTARTICU_Artpml_Z ;
   protected short gxTv_SdtTARTICU_Artgracru_Z ;
   protected short gxTv_SdtTARTICU_Artcrumin_Z ;
   protected short gxTv_SdtTARTICU_Artcrumax_Z ;
   protected short gxTv_SdtTARTICU_Artacamin_Z ;
   protected short gxTv_SdtTARTICU_Artacamax_Z ;
   protected short gxTv_SdtTARTICU_Arttrap1_Z ;
   protected short gxTv_SdtTARTICU_Arttrap2_Z ;
   protected short gxTv_SdtTARTICU_Arttrap3_Z ;
   protected short gxTv_SdtTARTICU_Arturdp1_Z ;
   protected short gxTv_SdtTARTICU_Arturdp2_Z ;
   protected short gxTv_SdtTARTICU_Arturdp3_Z ;
   protected short gxTv_SdtTARTICU_Artenccom_Z ;
   protected short gxTv_SdtTARTICU_Artencanh_Z ;
   protected short gxTv_SdtTARTICU_Artgraaca_Z ;
   protected short gxTv_SdtTARTICU_Artnumcor_Z ;
   protected short gxTv_SdtTARTICU_Artancsal1_Z ;
   protected short gxTv_SdtTARTICU_Artancsal2_Z ;
   protected short gxTv_SdtTARTICU_Artancsal3_Z ;
   protected short gxTv_SdtTARTICU_Artgraaca2_Z ;
   protected short gxTv_SdtTARTICU_Artgracru2_Z ;
   protected short gxTv_SdtTARTICU_Clascod_Z ;
   protected short gxTv_SdtTARTICU_Clatubcod_Z ;
   protected short gxTv_SdtTARTICU_Clabolcod_Z ;
   protected short gxTv_SdtTARTICU_Artrb_Z ;
   protected short gxTv_SdtTARTICU_Artpelanh_Z ;
   protected short gxTv_SdtTARTICU_Artgrm2sc_Z ;
   protected short gxTv_SdtTARTICU_Artpmlsc_Z ;
   protected short gxTv_SdtTARTICU_Artancsc_Z ;
   protected short gxTv_SdtTARTICU_Artpmlcru_Z ;
   protected short gxTv_SdtTARTICU_Artvbd_Z ;
   protected short gxTv_SdtTARTICU_Artvbn_Z ;
   protected short gxTv_SdtTARTICU_Artab_Z ;
   protected short gxTv_SdtTARTICU_Artth_Z ;
   protected short gxTv_SdtTARTICU_Art_cd_Z ;
   protected short gxTv_SdtTARTICU_Arthilos_Z ;
   protected short gxTv_SdtTARTICU_Artpasad_Z ;
   protected short gxTv_SdtTARTICU_Artancc_Z ;
   protected short gxTv_SdtTARTICU_Artgrm2c_Z ;
   protected int gxTv_SdtTARTICU_Clicod ;
   protected int gxTv_SdtTARTICU_Artacafor ;
   protected int gxTv_SdtTARTICU_Artnumtip ;
   protected int gxTv_SdtTARTICU_Clicod_Z ;
   protected int gxTv_SdtTARTICU_Artacafor_Z ;
   protected int gxTv_SdtTARTICU_Artnumtip_Z ;
   protected String gxTv_SdtTARTICU_Emprcod ;
   protected String gxTv_SdtTARTICU_Artcod ;
   protected String gxTv_SdtTARTICU_Artdsc ;
   protected String gxTv_SdtTARTICU_Clinom ;
   protected String gxTv_SdtTARTICU_Artcodext ;
   protected String gxTv_SdtTARTICU_Emprnom ;
   protected String gxTv_SdtTARTICU_Artmat ;
   protected String gxTv_SdtTARTICU_Tipartdsc ;
   protected String gxTv_SdtTARTICU_Arttipple ;
   protected String gxTv_SdtTARTICU_Arttiplar ;
   protected String gxTv_SdtTARTICU_Artcorori ;
   protected String gxTv_SdtTARTICU_Artencori ;
   protected String gxTv_SdtTARTICU_Artsua ;
   protected String gxTv_SdtTARTICU_Artacaqui ;
   protected String gxTv_SdtTARTICU_Arteti ;
   protected String gxTv_SdtTARTICU_Clieti ;
   protected String gxTv_SdtTARTICU_Arttra1 ;
   protected String gxTv_SdtTARTICU_Arttra2 ;
   protected String gxTv_SdtTARTICU_Arttra3 ;
   protected String gxTv_SdtTARTICU_Arturd1 ;
   protected String gxTv_SdtTARTICU_Arturd2 ;
   protected String gxTv_SdtTARTICU_Arturd3 ;
   protected String gxTv_SdtTARTICU_Artple2 ;
   protected String gxTv_SdtTARTICU_Artusrcod ;
   protected String gxTv_SdtTARTICU_Clasdsc ;
   protected String gxTv_SdtTARTICU_Artcomer ;
   protected String gxTv_SdtTARTICU_Clatubdsc ;
   protected String gxTv_SdtTARTICU_Claboldsc ;
   protected String gxTv_SdtTARTICU_Artnmtr ;
   protected String gxTv_SdtTARTICU_Artund ;
   protected String gxTv_SdtTARTICU_Artblo ;
   protected String gxTv_SdtTARTICU_Tipartdsc2 ;
   protected String gxTv_SdtTARTICU_Artobsgrm ;
   protected String gxTv_SdtTARTICU_Artobsanc ;
   protected String gxTv_SdtTARTICU_Artcdb ;
   protected String gxTv_SdtTARTICU_Artgalga ;
   protected String gxTv_SdtTARTICU_Artplatina ;
   protected String gxTv_SdtTARTICU_Artpgd ;
   protected String gxTv_SdtTARTICU_Artthn ;
   protected String gxTv_SdtTARTICU_Art_dc ;
   protected String gxTv_SdtTARTICU_Artanu ;
   protected String gxTv_SdtTARTICU_Artacamar ;
   protected String gxTv_SdtTARTICU_Artacabak ;
   protected String gxTv_SdtTARTICU_Artobsfac ;
   protected String gxTv_SdtTARTICU_Artactivo ;
   protected String gxTv_SdtTARTICU_Mode ;
   protected String gxTv_SdtTARTICU_Emprcod_Z ;
   protected String gxTv_SdtTARTICU_Artcod_Z ;
   protected String gxTv_SdtTARTICU_Artdsc_Z ;
   protected String gxTv_SdtTARTICU_Clinom_Z ;
   protected String gxTv_SdtTARTICU_Artcodext_Z ;
   protected String gxTv_SdtTARTICU_Emprnom_Z ;
   protected String gxTv_SdtTARTICU_Artmat_Z ;
   protected String gxTv_SdtTARTICU_Tipartdsc_Z ;
   protected String gxTv_SdtTARTICU_Arttipple_Z ;
   protected String gxTv_SdtTARTICU_Arttiplar_Z ;
   protected String gxTv_SdtTARTICU_Artcorori_Z ;
   protected String gxTv_SdtTARTICU_Artencori_Z ;
   protected String gxTv_SdtTARTICU_Artsua_Z ;
   protected String gxTv_SdtTARTICU_Artacaqui_Z ;
   protected String gxTv_SdtTARTICU_Arteti_Z ;
   protected String gxTv_SdtTARTICU_Clieti_Z ;
   protected String gxTv_SdtTARTICU_Arttra1_Z ;
   protected String gxTv_SdtTARTICU_Arttra2_Z ;
   protected String gxTv_SdtTARTICU_Arttra3_Z ;
   protected String gxTv_SdtTARTICU_Arturd1_Z ;
   protected String gxTv_SdtTARTICU_Arturd2_Z ;
   protected String gxTv_SdtTARTICU_Arturd3_Z ;
   protected String gxTv_SdtTARTICU_Artple2_Z ;
   protected String gxTv_SdtTARTICU_Artusrcod_Z ;
   protected String gxTv_SdtTARTICU_Clasdsc_Z ;
   protected String gxTv_SdtTARTICU_Artcomer_Z ;
   protected String gxTv_SdtTARTICU_Clatubdsc_Z ;
   protected String gxTv_SdtTARTICU_Claboldsc_Z ;
   protected String gxTv_SdtTARTICU_Artnmtr_Z ;
   protected String gxTv_SdtTARTICU_Artund_Z ;
   protected String gxTv_SdtTARTICU_Artblo_Z ;
   protected String gxTv_SdtTARTICU_Tipartdsc2_Z ;
   protected String gxTv_SdtTARTICU_Artobsgrm_Z ;
   protected String gxTv_SdtTARTICU_Artobsanc_Z ;
   protected String gxTv_SdtTARTICU_Artcdb_Z ;
   protected String gxTv_SdtTARTICU_Artgalga_Z ;
   protected String gxTv_SdtTARTICU_Artplatina_Z ;
   protected String gxTv_SdtTARTICU_Artpgd_Z ;
   protected String gxTv_SdtTARTICU_Artthn_Z ;
   protected String gxTv_SdtTARTICU_Art_dc_Z ;
   protected String gxTv_SdtTARTICU_Artanu_Z ;
   protected String gxTv_SdtTARTICU_Artacamar_Z ;
   protected String gxTv_SdtTARTICU_Artacabak_Z ;
   protected String gxTv_SdtTARTICU_Artobsfac_Z ;
   protected String gxTv_SdtTARTICU_Artactivo_Z ;
   protected String gxTv_SdtTARTICU_Artobslon ;
   protected String gxTv_SdtTARTICU_Artdsc2 ;
   protected String gxTv_SdtTARTICU_Artcdsc ;
   protected String gxTv_SdtTARTICU_Artobsotras ;
   protected String gxTv_SdtTARTICU_Artdsc2_Z ;
   protected String gxTv_SdtTARTICU_Artcdsc_Z ;
   protected String gxTv_SdtTARTICU_Artobsotras_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artren ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artmer ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdoa ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdon ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artfacabs ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artpmppza ;
   protected java.util.Date gxTv_SdtTARTICU_Artfeccre ;
   protected java.util.Date gxTv_SdtTARTICU_Artfecmod ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru1 ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru2 ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artlu ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdtsc ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artfabsh ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artfabst ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdoc ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artfacuti ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artkgmn ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artelganc ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artelglar ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artenclarg ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artencanc ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdto4 ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artgrcomp ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artkgspp ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artprepp ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artren_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artmer_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdoa_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdon_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artfacabs_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artpmppza_Z ;
   protected java.util.Date gxTv_SdtTARTICU_Artfeccre_Z ;
   protected java.util.Date gxTv_SdtTARTICU_Artfecmod_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru1_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru2_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artlu_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdtsc_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artfabsh_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artfabst_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdoc_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artfacuti_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artkgmn_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artelganc_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artelglar_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artenclarg_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artencanc_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artrdto4_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artgrcomp_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artkgspp_Z ;
   protected java.math.BigDecimal gxTv_SdtTARTICU_Artprepp_Z ;
}

