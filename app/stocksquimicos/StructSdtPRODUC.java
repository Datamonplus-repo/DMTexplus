package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtPRODUC implements Cloneable, java.io.Serializable
{
   public StructSdtPRODUC( )
   {
      this( -1, new ModelContext( StructSdtPRODUC.class ));
   }

   public StructSdtPRODUC( int remoteHandle ,
                           ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtPRODUC_Emprcod = "" ;
      gxTv_SdtPRODUC_Emprnom = "" ;
      gxTv_SdtPRODUC_Prdnum = "" ;
      gxTv_SdtPRODUC_Prdnom = "" ;
      gxTv_SdtPRODUC_Prvnom = "" ;
      gxTv_SdtPRODUC_Prdrefprv = "" ;
      gxTv_SdtPRODUC_Prddsctec = "" ;
      gxTv_SdtPRODUC_Prducpdsc = "" ;
      gxTv_SdtPRODUC_Prducodsc = "" ;
      gxTv_SdtPRODUC_Prdfaccon = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Valdsc = "" ;
      gxTv_SdtPRODUC_Prdrec = "" ;
      gxTv_SdtPRODUC_Prdcalnec = "" ;
      gxTv_SdtPRODUC_Prddetpar = "" ;
      gxTv_SdtPRODUC_Prdrotrea = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Tipdtodto = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdpreact = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdfecpre = cal.getTime() ;
      gxTv_SdtPRODUC_Prdpreant = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdpremed = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdcondia = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdstkminu = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Metdsc = "" ;
      gxTv_SdtPRODUC_Prdnumuco = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdexialm = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdexicc = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdcanres = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdcanpen = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdfulent = cal.getTime() ;
      gxTv_SdtPRODUC_Prdfulped = cal.getTime() ;
      gxTv_SdtPRODUC_Prdfulcc = cal.getTime() ;
      gxTv_SdtPRODUC_Prdexiccp = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdultecc = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdultdcc = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prddifcc = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdvalstk = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Difvalstk = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdfecent = cal.getTime() ;
      gxTv_SdtPRODUC_Prdtip = "" ;
      gxTv_SdtPRODUC_Prdrev = "" ;
      gxTv_SdtPRODUC_Prdnom2 = "" ;
      gxTv_SdtPRODUC_Prdnum2 = "" ;
      gxTv_SdtPRODUC_Prdobs = "" ;
      gxTv_SdtPRODUC_Prdpreac2 = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prddenss = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdconcs = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdsalm = "" ;
      gxTv_SdtPRODUC_Prdsolub = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Tipprddsc = "" ;
      gxTv_SdtPRODUC_Prdnumcentra = "" ;
      gxTv_SdtPRODUC_Prdnumct1 = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdnumct2 = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdexialmc = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdpesterm = "" ;
      gxTv_SdtPRODUC_Prdsal = "" ;
      gxTv_SdtPRODUC_Subfamdsc = "" ;
      gxTv_SdtPRODUC_Prdinc = "" ;
      gxTv_SdtPRODUC_Prdcomp = "" ;
      gxTv_SdtPRODUC_Prdaox = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdncas = "" ;
      gxTv_SdtPRODUC_Prdft = "" ;
      gxTv_SdtPRODUC_Prdfft = cal.getTime() ;
      gxTv_SdtPRODUC_Prdhs = "" ;
      gxTv_SdtPRODUC_Prdfhs = cal.getTime() ;
      gxTv_SdtPRODUC_Prdcolidx = "" ;
      gxTv_SdtPRODUC_Prdokotex = "" ;
      gxTv_SdtPRODUC_Prdreach = "" ;
      gxTv_SdtPRODUC_Prdlote = "" ;
      gxTv_SdtPRODUC_Prdrtm = "" ;
      gxTv_SdtPRODUC_Prdctw1 = "" ;
      gxTv_SdtPRODUC_Prdctw2 = "" ;
      gxTv_SdtPRODUC_Prdctw3 = "" ;
      gxTv_SdtPRODUC_Prdctw4 = "" ;
      gxTv_SdtPRODUC_Prdnrocas = "" ;
      gxTv_SdtPRODUC_Prdgots = "" ;
      gxTv_SdtPRODUC_Prdhm = "" ;
      gxTv_SdtPRODUC_Prdeinecs = "" ;
      gxTv_SdtPRODUC_Prdfuncion = "" ;
      gxTv_SdtPRODUC_Prdnmqu = "" ;
      gxTv_SdtPRODUC_Prdlist = "" ;
      gxTv_SdtPRODUC_Prdfabnm = "" ;
      gxTv_SdtPRODUC_Prdloteob = "" ;
      gxTv_SdtPRODUC_Prdzdhc = "" ;
      gxTv_SdtPRODUC_Prdthelist = "" ;
      gxTv_SdtPRODUC_Prdubicacion = "" ;
      gxTv_SdtPRODUC_Prdeqlp = "" ;
      gxTv_SdtPRODUC_Prdmatseca = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdlotefch = cal.getTime() ;
      gxTv_SdtPRODUC_Prdftdoc = "" ;
      gxTv_SdtPRODUC_Prdfsdoc = "" ;
      gxTv_SdtPRODUC_Prdgrs = "" ;
      gxTv_SdtPRODUC_Prdcdsc = "" ;
      gxTv_SdtPRODUC_Prddisponible = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdfecultmov = cal.getTime() ;
      gxTv_SdtPRODUC_Prdtipmovult = "" ;
      gxTv_SdtPRODUC_Prdlastfechcc = cal.getTime() ;
      gxTv_SdtPRODUC_Prdlasttipmovcc = "" ;
      gxTv_SdtPRODUC_Mode = "" ;
      gxTv_SdtPRODUC_Emprcod_Z = "" ;
      gxTv_SdtPRODUC_Emprnom_Z = "" ;
      gxTv_SdtPRODUC_Prdnum_Z = "" ;
      gxTv_SdtPRODUC_Prdnom_Z = "" ;
      gxTv_SdtPRODUC_Prvnom_Z = "" ;
      gxTv_SdtPRODUC_Prdrefprv_Z = "" ;
      gxTv_SdtPRODUC_Prddsctec_Z = "" ;
      gxTv_SdtPRODUC_Prducpdsc_Z = "" ;
      gxTv_SdtPRODUC_Prducodsc_Z = "" ;
      gxTv_SdtPRODUC_Prdfaccon_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Valdsc_Z = "" ;
      gxTv_SdtPRODUC_Prdrec_Z = "" ;
      gxTv_SdtPRODUC_Prdcalnec_Z = "" ;
      gxTv_SdtPRODUC_Prddetpar_Z = "" ;
      gxTv_SdtPRODUC_Prdrotrea_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Tipdtodto_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdpreact_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdfecpre_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdpreant_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdpremed_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdcondia_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdstkminu_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Metdsc_Z = "" ;
      gxTv_SdtPRODUC_Prdnumuco_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdexialm_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdexicc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdcanres_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdcanpen_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdfulent_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdfulped_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdfulcc_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdexiccp_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdultecc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdultdcc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prddifcc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdvalstk_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Difvalstk_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdfecent_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdtip_Z = "" ;
      gxTv_SdtPRODUC_Prdrev_Z = "" ;
      gxTv_SdtPRODUC_Prdnom2_Z = "" ;
      gxTv_SdtPRODUC_Prdnum2_Z = "" ;
      gxTv_SdtPRODUC_Prdobs_Z = "" ;
      gxTv_SdtPRODUC_Prdpreac2_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prddenss_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdconcs_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdsalm_Z = "" ;
      gxTv_SdtPRODUC_Prdsolub_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Tipprddsc_Z = "" ;
      gxTv_SdtPRODUC_Prdnumcentra_Z = "" ;
      gxTv_SdtPRODUC_Prdnumct1_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdnumct2_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdexialmc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdpesterm_Z = "" ;
      gxTv_SdtPRODUC_Prdsal_Z = "" ;
      gxTv_SdtPRODUC_Subfamdsc_Z = "" ;
      gxTv_SdtPRODUC_Prdinc_Z = "" ;
      gxTv_SdtPRODUC_Prdcomp_Z = "" ;
      gxTv_SdtPRODUC_Prdaox_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdncas_Z = "" ;
      gxTv_SdtPRODUC_Prdft_Z = "" ;
      gxTv_SdtPRODUC_Prdfft_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdhs_Z = "" ;
      gxTv_SdtPRODUC_Prdfhs_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdcolidx_Z = "" ;
      gxTv_SdtPRODUC_Prdokotex_Z = "" ;
      gxTv_SdtPRODUC_Prdreach_Z = "" ;
      gxTv_SdtPRODUC_Prdlote_Z = "" ;
      gxTv_SdtPRODUC_Prdrtm_Z = "" ;
      gxTv_SdtPRODUC_Prdctw1_Z = "" ;
      gxTv_SdtPRODUC_Prdctw2_Z = "" ;
      gxTv_SdtPRODUC_Prdctw3_Z = "" ;
      gxTv_SdtPRODUC_Prdctw4_Z = "" ;
      gxTv_SdtPRODUC_Prdnrocas_Z = "" ;
      gxTv_SdtPRODUC_Prdgots_Z = "" ;
      gxTv_SdtPRODUC_Prdhm_Z = "" ;
      gxTv_SdtPRODUC_Prdeinecs_Z = "" ;
      gxTv_SdtPRODUC_Prdfuncion_Z = "" ;
      gxTv_SdtPRODUC_Prdnmqu_Z = "" ;
      gxTv_SdtPRODUC_Prdlist_Z = "" ;
      gxTv_SdtPRODUC_Prdfabnm_Z = "" ;
      gxTv_SdtPRODUC_Prdloteob_Z = "" ;
      gxTv_SdtPRODUC_Prdzdhc_Z = "" ;
      gxTv_SdtPRODUC_Prdthelist_Z = "" ;
      gxTv_SdtPRODUC_Prdubicacion_Z = "" ;
      gxTv_SdtPRODUC_Prdeqlp_Z = "" ;
      gxTv_SdtPRODUC_Prdmatseca_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdlotefch_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdftdoc_Z = "" ;
      gxTv_SdtPRODUC_Prdfsdoc_Z = "" ;
      gxTv_SdtPRODUC_Prdgrs_Z = "" ;
      gxTv_SdtPRODUC_Prdcdsc_Z = "" ;
      gxTv_SdtPRODUC_Prddisponible_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPRODUC_Prdfecultmov_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdtipmovult_Z = "" ;
      gxTv_SdtPRODUC_Prdlastfechcc_Z = cal.getTime() ;
      gxTv_SdtPRODUC_Prdlasttipmovcc_Z = "" ;
      gxTv_SdtPRODUC_Emprnom_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prvnom_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prducpdsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prducodsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Valdsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Tipdtocod_N = (byte)(1) ;
      gxTv_SdtPRODUC_Tipdtodto_N = (byte)(1) ;
      gxTv_SdtPRODUC_Metcod_N = (byte)(1) ;
      gxTv_SdtPRODUC_Metdsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Tipprdcod_N = (byte)(1) ;
      gxTv_SdtPRODUC_Tipprddsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Subfamcod_N = (byte)(1) ;
      gxTv_SdtPRODUC_Subfamdsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdfabid_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdfabnm_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdthelist_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdcantatm_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdgrufamid_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdmatseca_N = (byte)(1) ;
      gxTv_SdtPRODUC_Almprdid_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdlotefch_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdftdoc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdfsdoc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdgrs_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdlastlineacc_N = (byte)(1) ;
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
      return gxTv_SdtPRODUC_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtPRODUC_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtPRODUC_Emprnom_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Emprnom = value ;
   }

   public String getPrdnum( )
   {
      return gxTv_SdtPRODUC_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtPRODUC_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnom = value ;
   }

   public int getPrvnum( )
   {
      return gxTv_SdtPRODUC_Prvnum ;
   }

   public void setPrvnum( int value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prvnum = value ;
   }

   public String getPrvnom( )
   {
      return gxTv_SdtPRODUC_Prvnom ;
   }

   public void setPrvnom( String value )
   {
      gxTv_SdtPRODUC_Prvnom_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prvnom = value ;
   }

   public String getPrdrefprv( )
   {
      return gxTv_SdtPRODUC_Prdrefprv ;
   }

   public void setPrdrefprv( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrefprv = value ;
   }

   public String getPrddsctec( )
   {
      return gxTv_SdtPRODUC_Prddsctec ;
   }

   public void setPrddsctec( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddsctec = value ;
   }

   public byte getPrdunicom( )
   {
      return gxTv_SdtPRODUC_Prdunicom ;
   }

   public void setPrdunicom( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdunicom = value ;
   }

   public String getPrducpdsc( )
   {
      return gxTv_SdtPRODUC_Prducpdsc ;
   }

   public void setPrducpdsc( String value )
   {
      gxTv_SdtPRODUC_Prducpdsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prducpdsc = value ;
   }

   public byte getPrdunicon( )
   {
      return gxTv_SdtPRODUC_Prdunicon ;
   }

   public void setPrdunicon( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdunicon = value ;
   }

   public String getPrducodsc( )
   {
      return gxTv_SdtPRODUC_Prducodsc ;
   }

   public void setPrducodsc( String value )
   {
      gxTv_SdtPRODUC_Prducodsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prducodsc = value ;
   }

   public java.math.BigDecimal getPrdfaccon( )
   {
      return gxTv_SdtPRODUC_Prdfaccon ;
   }

   public void setPrdfaccon( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfaccon = value ;
   }

   public byte getValcod( )
   {
      return gxTv_SdtPRODUC_Valcod ;
   }

   public void setValcod( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Valcod = value ;
   }

   public String getValdsc( )
   {
      return gxTv_SdtPRODUC_Valdsc ;
   }

   public void setValdsc( String value )
   {
      gxTv_SdtPRODUC_Valdsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Valdsc = value ;
   }

   public String getPrdrec( )
   {
      return gxTv_SdtPRODUC_Prdrec ;
   }

   public void setPrdrec( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrec = value ;
   }

   public String getPrdcalnec( )
   {
      return gxTv_SdtPRODUC_Prdcalnec ;
   }

   public void setPrdcalnec( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcalnec = value ;
   }

   public String getPrddetpar( )
   {
      return gxTv_SdtPRODUC_Prddetpar ;
   }

   public void setPrddetpar( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddetpar = value ;
   }

   public byte getPrdsit( )
   {
      return gxTv_SdtPRODUC_Prdsit ;
   }

   public void setPrdsit( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdsit = value ;
   }

   public java.math.BigDecimal getPrdrotrea( )
   {
      return gxTv_SdtPRODUC_Prdrotrea ;
   }

   public void setPrdrotrea( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrotrea = value ;
   }

   public byte getTipdtocod( )
   {
      return gxTv_SdtPRODUC_Tipdtocod ;
   }

   public void setTipdtocod( byte value )
   {
      gxTv_SdtPRODUC_Tipdtocod_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipdtocod = value ;
   }

   public java.math.BigDecimal getTipdtodto( )
   {
      return gxTv_SdtPRODUC_Tipdtodto ;
   }

   public void setTipdtodto( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_Tipdtodto_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipdtodto = value ;
   }

   public java.math.BigDecimal getPrdpreact( )
   {
      return gxTv_SdtPRODUC_Prdpreact ;
   }

   public void setPrdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpreact = value ;
   }

   public java.util.Date getPrdfecpre( )
   {
      return gxTv_SdtPRODUC_Prdfecpre ;
   }

   public void setPrdfecpre( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfecpre = value ;
   }

   public java.math.BigDecimal getPrdpreant( )
   {
      return gxTv_SdtPRODUC_Prdpreant ;
   }

   public void setPrdpreant( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpreant = value ;
   }

   public java.math.BigDecimal getPrdpremed( )
   {
      return gxTv_SdtPRODUC_Prdpremed ;
   }

   public void setPrdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpremed = value ;
   }

   public java.math.BigDecimal getPrdcondia( )
   {
      return gxTv_SdtPRODUC_Prdcondia ;
   }

   public void setPrdcondia( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcondia = value ;
   }

   public short getPrdstkmind( )
   {
      return gxTv_SdtPRODUC_Prdstkmind ;
   }

   public void setPrdstkmind( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdstkmind = value ;
   }

   public java.math.BigDecimal getPrdstkminu( )
   {
      return gxTv_SdtPRODUC_Prdstkminu ;
   }

   public void setPrdstkminu( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdstkminu = value ;
   }

   public short getPrddiarot( )
   {
      return gxTv_SdtPRODUC_Prddiarot ;
   }

   public void setPrddiarot( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddiarot = value ;
   }

   public short getPrdplaent( )
   {
      return gxTv_SdtPRODUC_Prdplaent ;
   }

   public void setPrdplaent( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdplaent = value ;
   }

   public byte getMetcod( )
   {
      return gxTv_SdtPRODUC_Metcod ;
   }

   public void setMetcod( byte value )
   {
      gxTv_SdtPRODUC_Metcod_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Metcod = value ;
   }

   public String getMetdsc( )
   {
      return gxTv_SdtPRODUC_Metdsc ;
   }

   public void setMetdsc( String value )
   {
      gxTv_SdtPRODUC_Metdsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Metdsc = value ;
   }

   public short getPrdlotmin( )
   {
      return gxTv_SdtPRODUC_Prdlotmin ;
   }

   public void setPrdlotmin( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlotmin = value ;
   }

   public java.math.BigDecimal getPrdnumuco( )
   {
      return gxTv_SdtPRODUC_Prdnumuco ;
   }

   public void setPrdnumuco( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnumuco = value ;
   }

   public java.math.BigDecimal getPrdexialm( )
   {
      return gxTv_SdtPRODUC_Prdexialm ;
   }

   public void setPrdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdexialm = value ;
   }

   public java.math.BigDecimal getPrdexicc( )
   {
      return gxTv_SdtPRODUC_Prdexicc ;
   }

   public void setPrdexicc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdexicc = value ;
   }

   public java.math.BigDecimal getPrdcanres( )
   {
      return gxTv_SdtPRODUC_Prdcanres ;
   }

   public void setPrdcanres( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcanres = value ;
   }

   public java.math.BigDecimal getPrdcanpen( )
   {
      return gxTv_SdtPRODUC_Prdcanpen ;
   }

   public void setPrdcanpen( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcanpen = value ;
   }

   public java.util.Date getPrdfulent( )
   {
      return gxTv_SdtPRODUC_Prdfulent ;
   }

   public void setPrdfulent( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfulent = value ;
   }

   public java.util.Date getPrdfulped( )
   {
      return gxTv_SdtPRODUC_Prdfulped ;
   }

   public void setPrdfulped( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfulped = value ;
   }

   public java.util.Date getPrdfulcc( )
   {
      return gxTv_SdtPRODUC_Prdfulcc ;
   }

   public void setPrdfulcc( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfulcc = value ;
   }

   public java.math.BigDecimal getPrdexiccp( )
   {
      return gxTv_SdtPRODUC_Prdexiccp ;
   }

   public void setPrdexiccp( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdexiccp = value ;
   }

   public java.math.BigDecimal getPrdultecc( )
   {
      return gxTv_SdtPRODUC_Prdultecc ;
   }

   public void setPrdultecc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdultecc = value ;
   }

   public short getPrdultccc( )
   {
      return gxTv_SdtPRODUC_Prdultccc ;
   }

   public void setPrdultccc( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdultccc = value ;
   }

   public java.math.BigDecimal getPrdultdcc( )
   {
      return gxTv_SdtPRODUC_Prdultdcc ;
   }

   public void setPrdultdcc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdultdcc = value ;
   }

   public java.math.BigDecimal getPrddifcc( )
   {
      return gxTv_SdtPRODUC_Prddifcc ;
   }

   public void setPrddifcc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddifcc = value ;
   }

   public short getPrdconcc( )
   {
      return gxTv_SdtPRODUC_Prdconcc ;
   }

   public void setPrdconcc( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdconcc = value ;
   }

   public java.math.BigDecimal getPrdvalstk( )
   {
      return gxTv_SdtPRODUC_Prdvalstk ;
   }

   public void setPrdvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdvalstk = value ;
   }

   public java.math.BigDecimal getDifvalstk( )
   {
      return gxTv_SdtPRODUC_Difvalstk ;
   }

   public void setDifvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Difvalstk = value ;
   }

   public java.util.Date getPrdfecent( )
   {
      return gxTv_SdtPRODUC_Prdfecent ;
   }

   public void setPrdfecent( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfecent = value ;
   }

   public short getPrdposx( )
   {
      return gxTv_SdtPRODUC_Prdposx ;
   }

   public void setPrdposx( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdposx = value ;
   }

   public byte getPrdposy( )
   {
      return gxTv_SdtPRODUC_Prdposy ;
   }

   public void setPrdposy( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdposy = value ;
   }

   public String getPrdtip( )
   {
      return gxTv_SdtPRODUC_Prdtip ;
   }

   public void setPrdtip( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdtip = value ;
   }

   public short getPrddqo( )
   {
      return gxTv_SdtPRODUC_Prddqo ;
   }

   public void setPrddqo( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddqo = value ;
   }

   public String getPrdrev( )
   {
      return gxTv_SdtPRODUC_Prdrev ;
   }

   public void setPrdrev( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrev = value ;
   }

   public byte getPrdtnq( )
   {
      return gxTv_SdtPRODUC_Prdtnq ;
   }

   public void setPrdtnq( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdtnq = value ;
   }

   public String getPrdnom2( )
   {
      return gxTv_SdtPRODUC_Prdnom2 ;
   }

   public void setPrdnom2( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnom2 = value ;
   }

   public String getPrdnum2( )
   {
      return gxTv_SdtPRODUC_Prdnum2 ;
   }

   public void setPrdnum2( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnum2 = value ;
   }

   public String getPrdobs( )
   {
      return gxTv_SdtPRODUC_Prdobs ;
   }

   public void setPrdobs( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdobs = value ;
   }

   public byte getPrdumefo( )
   {
      return gxTv_SdtPRODUC_Prdumefo ;
   }

   public void setPrdumefo( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdumefo = value ;
   }

   public java.math.BigDecimal getPrdpreac2( )
   {
      return gxTv_SdtPRODUC_Prdpreac2 ;
   }

   public void setPrdpreac2( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpreac2 = value ;
   }

   public java.math.BigDecimal getPrddenss( )
   {
      return gxTv_SdtPRODUC_Prddenss ;
   }

   public void setPrddenss( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddenss = value ;
   }

   public java.math.BigDecimal getPrdconcs( )
   {
      return gxTv_SdtPRODUC_Prdconcs ;
   }

   public void setPrdconcs( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdconcs = value ;
   }

   public String getPrdsalm( )
   {
      return gxTv_SdtPRODUC_Prdsalm ;
   }

   public void setPrdsalm( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdsalm = value ;
   }

   public java.math.BigDecimal getPrdsolub( )
   {
      return gxTv_SdtPRODUC_Prdsolub ;
   }

   public void setPrdsolub( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdsolub = value ;
   }

   public short getTipprdcod( )
   {
      return gxTv_SdtPRODUC_Tipprdcod ;
   }

   public void setTipprdcod( short value )
   {
      gxTv_SdtPRODUC_Tipprdcod_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipprdcod = value ;
   }

   public String getTipprddsc( )
   {
      return gxTv_SdtPRODUC_Tipprddsc ;
   }

   public void setTipprddsc( String value )
   {
      gxTv_SdtPRODUC_Tipprddsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipprddsc = value ;
   }

   public String getPrdnumcentra( )
   {
      return gxTv_SdtPRODUC_Prdnumcentra ;
   }

   public void setPrdnumcentra( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnumcentra = value ;
   }

   public java.math.BigDecimal getPrdnumct1( )
   {
      return gxTv_SdtPRODUC_Prdnumct1 ;
   }

   public void setPrdnumct1( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnumct1 = value ;
   }

   public java.math.BigDecimal getPrdnumct2( )
   {
      return gxTv_SdtPRODUC_Prdnumct2 ;
   }

   public void setPrdnumct2( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnumct2 = value ;
   }

   public byte getPrdhormad( )
   {
      return gxTv_SdtPRODUC_Prdhormad ;
   }

   public void setPrdhormad( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdhormad = value ;
   }

   public java.math.BigDecimal getPrdexialmc( )
   {
      return gxTv_SdtPRODUC_Prdexialmc ;
   }

   public void setPrdexialmc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdexialmc = value ;
   }

   public String getPrdpesterm( )
   {
      return gxTv_SdtPRODUC_Prdpesterm ;
   }

   public void setPrdpesterm( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpesterm = value ;
   }

   public String getPrdsal( )
   {
      return gxTv_SdtPRODUC_Prdsal ;
   }

   public void setPrdsal( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdsal = value ;
   }

   public byte getSubfamcod( )
   {
      return gxTv_SdtPRODUC_Subfamcod ;
   }

   public void setSubfamcod( byte value )
   {
      gxTv_SdtPRODUC_Subfamcod_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Subfamcod = value ;
   }

   public String getSubfamdsc( )
   {
      return gxTv_SdtPRODUC_Subfamdsc ;
   }

   public void setSubfamdsc( String value )
   {
      gxTv_SdtPRODUC_Subfamdsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Subfamdsc = value ;
   }

   public String getPrdinc( )
   {
      return gxTv_SdtPRODUC_Prdinc ;
   }

   public void setPrdinc( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdinc = value ;
   }

   public String getPrdcomp( )
   {
      return gxTv_SdtPRODUC_Prdcomp ;
   }

   public void setPrdcomp( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcomp = value ;
   }

   public java.math.BigDecimal getPrdaox( )
   {
      return gxTv_SdtPRODUC_Prdaox ;
   }

   public void setPrdaox( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdaox = value ;
   }

   public String getPrdncas( )
   {
      return gxTv_SdtPRODUC_Prdncas ;
   }

   public void setPrdncas( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdncas = value ;
   }

   public String getPrdft( )
   {
      return gxTv_SdtPRODUC_Prdft ;
   }

   public void setPrdft( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdft = value ;
   }

   public java.util.Date getPrdfft( )
   {
      return gxTv_SdtPRODUC_Prdfft ;
   }

   public void setPrdfft( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfft = value ;
   }

   public String getPrdhs( )
   {
      return gxTv_SdtPRODUC_Prdhs ;
   }

   public void setPrdhs( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdhs = value ;
   }

   public java.util.Date getPrdfhs( )
   {
      return gxTv_SdtPRODUC_Prdfhs ;
   }

   public void setPrdfhs( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfhs = value ;
   }

   public String getPrdcolidx( )
   {
      return gxTv_SdtPRODUC_Prdcolidx ;
   }

   public void setPrdcolidx( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcolidx = value ;
   }

   public String getPrdokotex( )
   {
      return gxTv_SdtPRODUC_Prdokotex ;
   }

   public void setPrdokotex( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdokotex = value ;
   }

   public String getPrdreach( )
   {
      return gxTv_SdtPRODUC_Prdreach ;
   }

   public void setPrdreach( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdreach = value ;
   }

   public String getPrdlote( )
   {
      return gxTv_SdtPRODUC_Prdlote ;
   }

   public void setPrdlote( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlote = value ;
   }

   public String getPrdrtm( )
   {
      return gxTv_SdtPRODUC_Prdrtm ;
   }

   public void setPrdrtm( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrtm = value ;
   }

   public String getPrdctw1( )
   {
      return gxTv_SdtPRODUC_Prdctw1 ;
   }

   public void setPrdctw1( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdctw1 = value ;
   }

   public String getPrdctw2( )
   {
      return gxTv_SdtPRODUC_Prdctw2 ;
   }

   public void setPrdctw2( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdctw2 = value ;
   }

   public String getPrdctw3( )
   {
      return gxTv_SdtPRODUC_Prdctw3 ;
   }

   public void setPrdctw3( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdctw3 = value ;
   }

   public String getPrdctw4( )
   {
      return gxTv_SdtPRODUC_Prdctw4 ;
   }

   public void setPrdctw4( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdctw4 = value ;
   }

   public String getPrdnrocas( )
   {
      return gxTv_SdtPRODUC_Prdnrocas ;
   }

   public void setPrdnrocas( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnrocas = value ;
   }

   public String getPrdgots( )
   {
      return gxTv_SdtPRODUC_Prdgots ;
   }

   public void setPrdgots( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdgots = value ;
   }

   public String getPrdhm( )
   {
      return gxTv_SdtPRODUC_Prdhm ;
   }

   public void setPrdhm( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdhm = value ;
   }

   public short getPrdconct( )
   {
      return gxTv_SdtPRODUC_Prdconct ;
   }

   public void setPrdconct( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdconct = value ;
   }

   public String getPrdeinecs( )
   {
      return gxTv_SdtPRODUC_Prdeinecs ;
   }

   public void setPrdeinecs( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdeinecs = value ;
   }

   public String getPrdfuncion( )
   {
      return gxTv_SdtPRODUC_Prdfuncion ;
   }

   public void setPrdfuncion( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfuncion = value ;
   }

   public String getPrdnmqu( )
   {
      return gxTv_SdtPRODUC_Prdnmqu ;
   }

   public void setPrdnmqu( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnmqu = value ;
   }

   public String getPrdlist( )
   {
      return gxTv_SdtPRODUC_Prdlist ;
   }

   public void setPrdlist( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlist = value ;
   }

   public int getPrdfabid( )
   {
      return gxTv_SdtPRODUC_Prdfabid ;
   }

   public void setPrdfabid( int value )
   {
      gxTv_SdtPRODUC_Prdfabid_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfabid = value ;
   }

   public String getPrdfabnm( )
   {
      return gxTv_SdtPRODUC_Prdfabnm ;
   }

   public void setPrdfabnm( String value )
   {
      gxTv_SdtPRODUC_Prdfabnm_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfabnm = value ;
   }

   public String getPrdloteob( )
   {
      return gxTv_SdtPRODUC_Prdloteob ;
   }

   public void setPrdloteob( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdloteob = value ;
   }

   public long getPrdrgb( )
   {
      return gxTv_SdtPRODUC_Prdrgb ;
   }

   public void setPrdrgb( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrgb = value ;
   }

   public String getPrdzdhc( )
   {
      return gxTv_SdtPRODUC_Prdzdhc ;
   }

   public void setPrdzdhc( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdzdhc = value ;
   }

   public String getPrdthelist( )
   {
      return gxTv_SdtPRODUC_Prdthelist ;
   }

   public void setPrdthelist( String value )
   {
      gxTv_SdtPRODUC_Prdthelist_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdthelist = value ;
   }

   public String getPrdubicacion( )
   {
      return gxTv_SdtPRODUC_Prdubicacion ;
   }

   public void setPrdubicacion( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdubicacion = value ;
   }

   public String getPrdeqlp( )
   {
      return gxTv_SdtPRODUC_Prdeqlp ;
   }

   public void setPrdeqlp( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdeqlp = value ;
   }

   public byte getPrdpescon( )
   {
      return gxTv_SdtPRODUC_Prdpescon ;
   }

   public void setPrdpescon( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpescon = value ;
   }

   public short getPrdcantatm( )
   {
      return gxTv_SdtPRODUC_Prdcantatm ;
   }

   public void setPrdcantatm( short value )
   {
      gxTv_SdtPRODUC_Prdcantatm_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcantatm = value ;
   }

   public byte getPrdgrufamid( )
   {
      return gxTv_SdtPRODUC_Prdgrufamid ;
   }

   public void setPrdgrufamid( byte value )
   {
      gxTv_SdtPRODUC_Prdgrufamid_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdgrufamid = value ;
   }

   public java.math.BigDecimal getPrdmatseca( )
   {
      return gxTv_SdtPRODUC_Prdmatseca ;
   }

   public void setPrdmatseca( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_Prdmatseca_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdmatseca = value ;
   }

   public short getAlmprdid( )
   {
      return gxTv_SdtPRODUC_Almprdid ;
   }

   public void setAlmprdid( short value )
   {
      gxTv_SdtPRODUC_Almprdid_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Almprdid = value ;
   }

   public java.util.Date getPrdlotefch( )
   {
      return gxTv_SdtPRODUC_Prdlotefch ;
   }

   public void setPrdlotefch( java.util.Date value )
   {
      gxTv_SdtPRODUC_Prdlotefch_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlotefch = value ;
   }

   public String getPrdftdoc( )
   {
      return gxTv_SdtPRODUC_Prdftdoc ;
   }

   public void setPrdftdoc( String value )
   {
      gxTv_SdtPRODUC_Prdftdoc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdftdoc = value ;
   }

   public String getPrdfsdoc( )
   {
      return gxTv_SdtPRODUC_Prdfsdoc ;
   }

   public void setPrdfsdoc( String value )
   {
      gxTv_SdtPRODUC_Prdfsdoc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfsdoc = value ;
   }

   public String getPrdgrs( )
   {
      return gxTv_SdtPRODUC_Prdgrs ;
   }

   public void setPrdgrs( String value )
   {
      gxTv_SdtPRODUC_Prdgrs_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdgrs = value ;
   }

   public String getPrdcdsc( )
   {
      return gxTv_SdtPRODUC_Prdcdsc ;
   }

   public void setPrdcdsc( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcdsc = value ;
   }

   public java.math.BigDecimal getPrddisponible( )
   {
      return gxTv_SdtPRODUC_Prddisponible ;
   }

   public void setPrddisponible( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddisponible = value ;
   }

   public short getPrddiasinactivo( )
   {
      return gxTv_SdtPRODUC_Prddiasinactivo ;
   }

   public void setPrddiasinactivo( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddiasinactivo = value ;
   }

   public long getPrdultmovcc( )
   {
      return gxTv_SdtPRODUC_Prdultmovcc ;
   }

   public void setPrdultmovcc( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdultmovcc = value ;
   }

   public java.util.Date getPrdfecultmov( )
   {
      return gxTv_SdtPRODUC_Prdfecultmov ;
   }

   public void setPrdfecultmov( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfecultmov = value ;
   }

   public String getPrdtipmovult( )
   {
      return gxTv_SdtPRODUC_Prdtipmovult ;
   }

   public void setPrdtipmovult( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdtipmovult = value ;
   }

   public long getPrdlastlineacc( )
   {
      return gxTv_SdtPRODUC_Prdlastlineacc ;
   }

   public void setPrdlastlineacc( long value )
   {
      gxTv_SdtPRODUC_Prdlastlineacc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlastlineacc = value ;
   }

   public java.util.Date getPrdlastfechcc( )
   {
      return gxTv_SdtPRODUC_Prdlastfechcc ;
   }

   public void setPrdlastfechcc( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlastfechcc = value ;
   }

   public String getPrdlasttipmovcc( )
   {
      return gxTv_SdtPRODUC_Prdlasttipmovcc ;
   }

   public void setPrdlasttipmovcc( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlasttipmovcc = value ;
   }

   public boolean getPrdescompuesto( )
   {
      return gxTv_SdtPRODUC_Prdescompuesto ;
   }

   public void setPrdescompuesto( boolean value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdescompuesto = value ;
   }

   public short getPrddiasinmov( )
   {
      return gxTv_SdtPRODUC_Prddiasinmov ;
   }

   public void setPrddiasinmov( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddiasinmov = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtPRODUC_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtPRODUC_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtPRODUC_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtPRODUC_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Emprnom_Z = value ;
   }

   public String getPrdnum_Z( )
   {
      return gxTv_SdtPRODUC_Prdnum_Z ;
   }

   public void setPrdnum_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnum_Z = value ;
   }

   public String getPrdnom_Z( )
   {
      return gxTv_SdtPRODUC_Prdnom_Z ;
   }

   public void setPrdnom_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnom_Z = value ;
   }

   public int getPrvnum_Z( )
   {
      return gxTv_SdtPRODUC_Prvnum_Z ;
   }

   public void setPrvnum_Z( int value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prvnum_Z = value ;
   }

   public String getPrvnom_Z( )
   {
      return gxTv_SdtPRODUC_Prvnom_Z ;
   }

   public void setPrvnom_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prvnom_Z = value ;
   }

   public String getPrdrefprv_Z( )
   {
      return gxTv_SdtPRODUC_Prdrefprv_Z ;
   }

   public void setPrdrefprv_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrefprv_Z = value ;
   }

   public String getPrddsctec_Z( )
   {
      return gxTv_SdtPRODUC_Prddsctec_Z ;
   }

   public void setPrddsctec_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddsctec_Z = value ;
   }

   public byte getPrdunicom_Z( )
   {
      return gxTv_SdtPRODUC_Prdunicom_Z ;
   }

   public void setPrdunicom_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdunicom_Z = value ;
   }

   public String getPrducpdsc_Z( )
   {
      return gxTv_SdtPRODUC_Prducpdsc_Z ;
   }

   public void setPrducpdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prducpdsc_Z = value ;
   }

   public byte getPrdunicon_Z( )
   {
      return gxTv_SdtPRODUC_Prdunicon_Z ;
   }

   public void setPrdunicon_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdunicon_Z = value ;
   }

   public String getPrducodsc_Z( )
   {
      return gxTv_SdtPRODUC_Prducodsc_Z ;
   }

   public void setPrducodsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prducodsc_Z = value ;
   }

   public java.math.BigDecimal getPrdfaccon_Z( )
   {
      return gxTv_SdtPRODUC_Prdfaccon_Z ;
   }

   public void setPrdfaccon_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfaccon_Z = value ;
   }

   public byte getValcod_Z( )
   {
      return gxTv_SdtPRODUC_Valcod_Z ;
   }

   public void setValcod_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Valcod_Z = value ;
   }

   public String getValdsc_Z( )
   {
      return gxTv_SdtPRODUC_Valdsc_Z ;
   }

   public void setValdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Valdsc_Z = value ;
   }

   public String getPrdrec_Z( )
   {
      return gxTv_SdtPRODUC_Prdrec_Z ;
   }

   public void setPrdrec_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrec_Z = value ;
   }

   public String getPrdcalnec_Z( )
   {
      return gxTv_SdtPRODUC_Prdcalnec_Z ;
   }

   public void setPrdcalnec_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcalnec_Z = value ;
   }

   public String getPrddetpar_Z( )
   {
      return gxTv_SdtPRODUC_Prddetpar_Z ;
   }

   public void setPrddetpar_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddetpar_Z = value ;
   }

   public byte getPrdsit_Z( )
   {
      return gxTv_SdtPRODUC_Prdsit_Z ;
   }

   public void setPrdsit_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdsit_Z = value ;
   }

   public java.math.BigDecimal getPrdrotrea_Z( )
   {
      return gxTv_SdtPRODUC_Prdrotrea_Z ;
   }

   public void setPrdrotrea_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrotrea_Z = value ;
   }

   public byte getTipdtocod_Z( )
   {
      return gxTv_SdtPRODUC_Tipdtocod_Z ;
   }

   public void setTipdtocod_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipdtocod_Z = value ;
   }

   public java.math.BigDecimal getTipdtodto_Z( )
   {
      return gxTv_SdtPRODUC_Tipdtodto_Z ;
   }

   public void setTipdtodto_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipdtodto_Z = value ;
   }

   public java.math.BigDecimal getPrdpreact_Z( )
   {
      return gxTv_SdtPRODUC_Prdpreact_Z ;
   }

   public void setPrdpreact_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpreact_Z = value ;
   }

   public java.util.Date getPrdfecpre_Z( )
   {
      return gxTv_SdtPRODUC_Prdfecpre_Z ;
   }

   public void setPrdfecpre_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfecpre_Z = value ;
   }

   public java.math.BigDecimal getPrdpreant_Z( )
   {
      return gxTv_SdtPRODUC_Prdpreant_Z ;
   }

   public void setPrdpreant_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpreant_Z = value ;
   }

   public java.math.BigDecimal getPrdpremed_Z( )
   {
      return gxTv_SdtPRODUC_Prdpremed_Z ;
   }

   public void setPrdpremed_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpremed_Z = value ;
   }

   public java.math.BigDecimal getPrdcondia_Z( )
   {
      return gxTv_SdtPRODUC_Prdcondia_Z ;
   }

   public void setPrdcondia_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcondia_Z = value ;
   }

   public short getPrdstkmind_Z( )
   {
      return gxTv_SdtPRODUC_Prdstkmind_Z ;
   }

   public void setPrdstkmind_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdstkmind_Z = value ;
   }

   public java.math.BigDecimal getPrdstkminu_Z( )
   {
      return gxTv_SdtPRODUC_Prdstkminu_Z ;
   }

   public void setPrdstkminu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdstkminu_Z = value ;
   }

   public short getPrddiarot_Z( )
   {
      return gxTv_SdtPRODUC_Prddiarot_Z ;
   }

   public void setPrddiarot_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddiarot_Z = value ;
   }

   public short getPrdplaent_Z( )
   {
      return gxTv_SdtPRODUC_Prdplaent_Z ;
   }

   public void setPrdplaent_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdplaent_Z = value ;
   }

   public byte getMetcod_Z( )
   {
      return gxTv_SdtPRODUC_Metcod_Z ;
   }

   public void setMetcod_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Metcod_Z = value ;
   }

   public String getMetdsc_Z( )
   {
      return gxTv_SdtPRODUC_Metdsc_Z ;
   }

   public void setMetdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Metdsc_Z = value ;
   }

   public short getPrdlotmin_Z( )
   {
      return gxTv_SdtPRODUC_Prdlotmin_Z ;
   }

   public void setPrdlotmin_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlotmin_Z = value ;
   }

   public java.math.BigDecimal getPrdnumuco_Z( )
   {
      return gxTv_SdtPRODUC_Prdnumuco_Z ;
   }

   public void setPrdnumuco_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnumuco_Z = value ;
   }

   public java.math.BigDecimal getPrdexialm_Z( )
   {
      return gxTv_SdtPRODUC_Prdexialm_Z ;
   }

   public void setPrdexialm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdexialm_Z = value ;
   }

   public java.math.BigDecimal getPrdexicc_Z( )
   {
      return gxTv_SdtPRODUC_Prdexicc_Z ;
   }

   public void setPrdexicc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdexicc_Z = value ;
   }

   public java.math.BigDecimal getPrdcanres_Z( )
   {
      return gxTv_SdtPRODUC_Prdcanres_Z ;
   }

   public void setPrdcanres_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcanres_Z = value ;
   }

   public java.math.BigDecimal getPrdcanpen_Z( )
   {
      return gxTv_SdtPRODUC_Prdcanpen_Z ;
   }

   public void setPrdcanpen_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcanpen_Z = value ;
   }

   public java.util.Date getPrdfulent_Z( )
   {
      return gxTv_SdtPRODUC_Prdfulent_Z ;
   }

   public void setPrdfulent_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfulent_Z = value ;
   }

   public java.util.Date getPrdfulped_Z( )
   {
      return gxTv_SdtPRODUC_Prdfulped_Z ;
   }

   public void setPrdfulped_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfulped_Z = value ;
   }

   public java.util.Date getPrdfulcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdfulcc_Z ;
   }

   public void setPrdfulcc_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfulcc_Z = value ;
   }

   public java.math.BigDecimal getPrdexiccp_Z( )
   {
      return gxTv_SdtPRODUC_Prdexiccp_Z ;
   }

   public void setPrdexiccp_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdexiccp_Z = value ;
   }

   public java.math.BigDecimal getPrdultecc_Z( )
   {
      return gxTv_SdtPRODUC_Prdultecc_Z ;
   }

   public void setPrdultecc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdultecc_Z = value ;
   }

   public short getPrdultccc_Z( )
   {
      return gxTv_SdtPRODUC_Prdultccc_Z ;
   }

   public void setPrdultccc_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdultccc_Z = value ;
   }

   public java.math.BigDecimal getPrdultdcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdultdcc_Z ;
   }

   public void setPrdultdcc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdultdcc_Z = value ;
   }

   public java.math.BigDecimal getPrddifcc_Z( )
   {
      return gxTv_SdtPRODUC_Prddifcc_Z ;
   }

   public void setPrddifcc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddifcc_Z = value ;
   }

   public short getPrdconcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdconcc_Z ;
   }

   public void setPrdconcc_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdconcc_Z = value ;
   }

   public java.math.BigDecimal getPrdvalstk_Z( )
   {
      return gxTv_SdtPRODUC_Prdvalstk_Z ;
   }

   public void setPrdvalstk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdvalstk_Z = value ;
   }

   public java.math.BigDecimal getDifvalstk_Z( )
   {
      return gxTv_SdtPRODUC_Difvalstk_Z ;
   }

   public void setDifvalstk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Difvalstk_Z = value ;
   }

   public java.util.Date getPrdfecent_Z( )
   {
      return gxTv_SdtPRODUC_Prdfecent_Z ;
   }

   public void setPrdfecent_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfecent_Z = value ;
   }

   public short getPrdposx_Z( )
   {
      return gxTv_SdtPRODUC_Prdposx_Z ;
   }

   public void setPrdposx_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdposx_Z = value ;
   }

   public byte getPrdposy_Z( )
   {
      return gxTv_SdtPRODUC_Prdposy_Z ;
   }

   public void setPrdposy_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdposy_Z = value ;
   }

   public String getPrdtip_Z( )
   {
      return gxTv_SdtPRODUC_Prdtip_Z ;
   }

   public void setPrdtip_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdtip_Z = value ;
   }

   public short getPrddqo_Z( )
   {
      return gxTv_SdtPRODUC_Prddqo_Z ;
   }

   public void setPrddqo_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddqo_Z = value ;
   }

   public String getPrdrev_Z( )
   {
      return gxTv_SdtPRODUC_Prdrev_Z ;
   }

   public void setPrdrev_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrev_Z = value ;
   }

   public byte getPrdtnq_Z( )
   {
      return gxTv_SdtPRODUC_Prdtnq_Z ;
   }

   public void setPrdtnq_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdtnq_Z = value ;
   }

   public String getPrdnom2_Z( )
   {
      return gxTv_SdtPRODUC_Prdnom2_Z ;
   }

   public void setPrdnom2_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnom2_Z = value ;
   }

   public String getPrdnum2_Z( )
   {
      return gxTv_SdtPRODUC_Prdnum2_Z ;
   }

   public void setPrdnum2_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnum2_Z = value ;
   }

   public String getPrdobs_Z( )
   {
      return gxTv_SdtPRODUC_Prdobs_Z ;
   }

   public void setPrdobs_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdobs_Z = value ;
   }

   public byte getPrdumefo_Z( )
   {
      return gxTv_SdtPRODUC_Prdumefo_Z ;
   }

   public void setPrdumefo_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdumefo_Z = value ;
   }

   public java.math.BigDecimal getPrdpreac2_Z( )
   {
      return gxTv_SdtPRODUC_Prdpreac2_Z ;
   }

   public void setPrdpreac2_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpreac2_Z = value ;
   }

   public java.math.BigDecimal getPrddenss_Z( )
   {
      return gxTv_SdtPRODUC_Prddenss_Z ;
   }

   public void setPrddenss_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddenss_Z = value ;
   }

   public java.math.BigDecimal getPrdconcs_Z( )
   {
      return gxTv_SdtPRODUC_Prdconcs_Z ;
   }

   public void setPrdconcs_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdconcs_Z = value ;
   }

   public String getPrdsalm_Z( )
   {
      return gxTv_SdtPRODUC_Prdsalm_Z ;
   }

   public void setPrdsalm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdsalm_Z = value ;
   }

   public java.math.BigDecimal getPrdsolub_Z( )
   {
      return gxTv_SdtPRODUC_Prdsolub_Z ;
   }

   public void setPrdsolub_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdsolub_Z = value ;
   }

   public short getTipprdcod_Z( )
   {
      return gxTv_SdtPRODUC_Tipprdcod_Z ;
   }

   public void setTipprdcod_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipprdcod_Z = value ;
   }

   public String getTipprddsc_Z( )
   {
      return gxTv_SdtPRODUC_Tipprddsc_Z ;
   }

   public void setTipprddsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipprddsc_Z = value ;
   }

   public String getPrdnumcentra_Z( )
   {
      return gxTv_SdtPRODUC_Prdnumcentra_Z ;
   }

   public void setPrdnumcentra_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnumcentra_Z = value ;
   }

   public java.math.BigDecimal getPrdnumct1_Z( )
   {
      return gxTv_SdtPRODUC_Prdnumct1_Z ;
   }

   public void setPrdnumct1_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnumct1_Z = value ;
   }

   public java.math.BigDecimal getPrdnumct2_Z( )
   {
      return gxTv_SdtPRODUC_Prdnumct2_Z ;
   }

   public void setPrdnumct2_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnumct2_Z = value ;
   }

   public byte getPrdhormad_Z( )
   {
      return gxTv_SdtPRODUC_Prdhormad_Z ;
   }

   public void setPrdhormad_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdhormad_Z = value ;
   }

   public java.math.BigDecimal getPrdexialmc_Z( )
   {
      return gxTv_SdtPRODUC_Prdexialmc_Z ;
   }

   public void setPrdexialmc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdexialmc_Z = value ;
   }

   public String getPrdpesterm_Z( )
   {
      return gxTv_SdtPRODUC_Prdpesterm_Z ;
   }

   public void setPrdpesterm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpesterm_Z = value ;
   }

   public String getPrdsal_Z( )
   {
      return gxTv_SdtPRODUC_Prdsal_Z ;
   }

   public void setPrdsal_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdsal_Z = value ;
   }

   public byte getSubfamcod_Z( )
   {
      return gxTv_SdtPRODUC_Subfamcod_Z ;
   }

   public void setSubfamcod_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Subfamcod_Z = value ;
   }

   public String getSubfamdsc_Z( )
   {
      return gxTv_SdtPRODUC_Subfamdsc_Z ;
   }

   public void setSubfamdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Subfamdsc_Z = value ;
   }

   public String getPrdinc_Z( )
   {
      return gxTv_SdtPRODUC_Prdinc_Z ;
   }

   public void setPrdinc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdinc_Z = value ;
   }

   public String getPrdcomp_Z( )
   {
      return gxTv_SdtPRODUC_Prdcomp_Z ;
   }

   public void setPrdcomp_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcomp_Z = value ;
   }

   public java.math.BigDecimal getPrdaox_Z( )
   {
      return gxTv_SdtPRODUC_Prdaox_Z ;
   }

   public void setPrdaox_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdaox_Z = value ;
   }

   public String getPrdncas_Z( )
   {
      return gxTv_SdtPRODUC_Prdncas_Z ;
   }

   public void setPrdncas_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdncas_Z = value ;
   }

   public String getPrdft_Z( )
   {
      return gxTv_SdtPRODUC_Prdft_Z ;
   }

   public void setPrdft_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdft_Z = value ;
   }

   public java.util.Date getPrdfft_Z( )
   {
      return gxTv_SdtPRODUC_Prdfft_Z ;
   }

   public void setPrdfft_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfft_Z = value ;
   }

   public String getPrdhs_Z( )
   {
      return gxTv_SdtPRODUC_Prdhs_Z ;
   }

   public void setPrdhs_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdhs_Z = value ;
   }

   public java.util.Date getPrdfhs_Z( )
   {
      return gxTv_SdtPRODUC_Prdfhs_Z ;
   }

   public void setPrdfhs_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfhs_Z = value ;
   }

   public String getPrdcolidx_Z( )
   {
      return gxTv_SdtPRODUC_Prdcolidx_Z ;
   }

   public void setPrdcolidx_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcolidx_Z = value ;
   }

   public String getPrdokotex_Z( )
   {
      return gxTv_SdtPRODUC_Prdokotex_Z ;
   }

   public void setPrdokotex_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdokotex_Z = value ;
   }

   public String getPrdreach_Z( )
   {
      return gxTv_SdtPRODUC_Prdreach_Z ;
   }

   public void setPrdreach_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdreach_Z = value ;
   }

   public String getPrdlote_Z( )
   {
      return gxTv_SdtPRODUC_Prdlote_Z ;
   }

   public void setPrdlote_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlote_Z = value ;
   }

   public String getPrdrtm_Z( )
   {
      return gxTv_SdtPRODUC_Prdrtm_Z ;
   }

   public void setPrdrtm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrtm_Z = value ;
   }

   public String getPrdctw1_Z( )
   {
      return gxTv_SdtPRODUC_Prdctw1_Z ;
   }

   public void setPrdctw1_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdctw1_Z = value ;
   }

   public String getPrdctw2_Z( )
   {
      return gxTv_SdtPRODUC_Prdctw2_Z ;
   }

   public void setPrdctw2_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdctw2_Z = value ;
   }

   public String getPrdctw3_Z( )
   {
      return gxTv_SdtPRODUC_Prdctw3_Z ;
   }

   public void setPrdctw3_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdctw3_Z = value ;
   }

   public String getPrdctw4_Z( )
   {
      return gxTv_SdtPRODUC_Prdctw4_Z ;
   }

   public void setPrdctw4_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdctw4_Z = value ;
   }

   public String getPrdnrocas_Z( )
   {
      return gxTv_SdtPRODUC_Prdnrocas_Z ;
   }

   public void setPrdnrocas_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnrocas_Z = value ;
   }

   public String getPrdgots_Z( )
   {
      return gxTv_SdtPRODUC_Prdgots_Z ;
   }

   public void setPrdgots_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdgots_Z = value ;
   }

   public String getPrdhm_Z( )
   {
      return gxTv_SdtPRODUC_Prdhm_Z ;
   }

   public void setPrdhm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdhm_Z = value ;
   }

   public short getPrdconct_Z( )
   {
      return gxTv_SdtPRODUC_Prdconct_Z ;
   }

   public void setPrdconct_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdconct_Z = value ;
   }

   public String getPrdeinecs_Z( )
   {
      return gxTv_SdtPRODUC_Prdeinecs_Z ;
   }

   public void setPrdeinecs_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdeinecs_Z = value ;
   }

   public String getPrdfuncion_Z( )
   {
      return gxTv_SdtPRODUC_Prdfuncion_Z ;
   }

   public void setPrdfuncion_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfuncion_Z = value ;
   }

   public String getPrdnmqu_Z( )
   {
      return gxTv_SdtPRODUC_Prdnmqu_Z ;
   }

   public void setPrdnmqu_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnmqu_Z = value ;
   }

   public String getPrdlist_Z( )
   {
      return gxTv_SdtPRODUC_Prdlist_Z ;
   }

   public void setPrdlist_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlist_Z = value ;
   }

   public int getPrdfabid_Z( )
   {
      return gxTv_SdtPRODUC_Prdfabid_Z ;
   }

   public void setPrdfabid_Z( int value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfabid_Z = value ;
   }

   public String getPrdfabnm_Z( )
   {
      return gxTv_SdtPRODUC_Prdfabnm_Z ;
   }

   public void setPrdfabnm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfabnm_Z = value ;
   }

   public String getPrdloteob_Z( )
   {
      return gxTv_SdtPRODUC_Prdloteob_Z ;
   }

   public void setPrdloteob_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdloteob_Z = value ;
   }

   public long getPrdrgb_Z( )
   {
      return gxTv_SdtPRODUC_Prdrgb_Z ;
   }

   public void setPrdrgb_Z( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdrgb_Z = value ;
   }

   public String getPrdzdhc_Z( )
   {
      return gxTv_SdtPRODUC_Prdzdhc_Z ;
   }

   public void setPrdzdhc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdzdhc_Z = value ;
   }

   public String getPrdthelist_Z( )
   {
      return gxTv_SdtPRODUC_Prdthelist_Z ;
   }

   public void setPrdthelist_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdthelist_Z = value ;
   }

   public String getPrdubicacion_Z( )
   {
      return gxTv_SdtPRODUC_Prdubicacion_Z ;
   }

   public void setPrdubicacion_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdubicacion_Z = value ;
   }

   public String getPrdeqlp_Z( )
   {
      return gxTv_SdtPRODUC_Prdeqlp_Z ;
   }

   public void setPrdeqlp_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdeqlp_Z = value ;
   }

   public byte getPrdpescon_Z( )
   {
      return gxTv_SdtPRODUC_Prdpescon_Z ;
   }

   public void setPrdpescon_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdpescon_Z = value ;
   }

   public short getPrdcantatm_Z( )
   {
      return gxTv_SdtPRODUC_Prdcantatm_Z ;
   }

   public void setPrdcantatm_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcantatm_Z = value ;
   }

   public byte getPrdgrufamid_Z( )
   {
      return gxTv_SdtPRODUC_Prdgrufamid_Z ;
   }

   public void setPrdgrufamid_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdgrufamid_Z = value ;
   }

   public java.math.BigDecimal getPrdmatseca_Z( )
   {
      return gxTv_SdtPRODUC_Prdmatseca_Z ;
   }

   public void setPrdmatseca_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdmatseca_Z = value ;
   }

   public short getAlmprdid_Z( )
   {
      return gxTv_SdtPRODUC_Almprdid_Z ;
   }

   public void setAlmprdid_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Almprdid_Z = value ;
   }

   public java.util.Date getPrdlotefch_Z( )
   {
      return gxTv_SdtPRODUC_Prdlotefch_Z ;
   }

   public void setPrdlotefch_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlotefch_Z = value ;
   }

   public String getPrdftdoc_Z( )
   {
      return gxTv_SdtPRODUC_Prdftdoc_Z ;
   }

   public void setPrdftdoc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdftdoc_Z = value ;
   }

   public String getPrdfsdoc_Z( )
   {
      return gxTv_SdtPRODUC_Prdfsdoc_Z ;
   }

   public void setPrdfsdoc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfsdoc_Z = value ;
   }

   public String getPrdgrs_Z( )
   {
      return gxTv_SdtPRODUC_Prdgrs_Z ;
   }

   public void setPrdgrs_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdgrs_Z = value ;
   }

   public String getPrdcdsc_Z( )
   {
      return gxTv_SdtPRODUC_Prdcdsc_Z ;
   }

   public void setPrdcdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcdsc_Z = value ;
   }

   public java.math.BigDecimal getPrddisponible_Z( )
   {
      return gxTv_SdtPRODUC_Prddisponible_Z ;
   }

   public void setPrddisponible_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddisponible_Z = value ;
   }

   public short getPrddiasinactivo_Z( )
   {
      return gxTv_SdtPRODUC_Prddiasinactivo_Z ;
   }

   public void setPrddiasinactivo_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddiasinactivo_Z = value ;
   }

   public long getPrdultmovcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdultmovcc_Z ;
   }

   public void setPrdultmovcc_Z( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdultmovcc_Z = value ;
   }

   public java.util.Date getPrdfecultmov_Z( )
   {
      return gxTv_SdtPRODUC_Prdfecultmov_Z ;
   }

   public void setPrdfecultmov_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfecultmov_Z = value ;
   }

   public String getPrdtipmovult_Z( )
   {
      return gxTv_SdtPRODUC_Prdtipmovult_Z ;
   }

   public void setPrdtipmovult_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdtipmovult_Z = value ;
   }

   public long getPrdlastlineacc_Z( )
   {
      return gxTv_SdtPRODUC_Prdlastlineacc_Z ;
   }

   public void setPrdlastlineacc_Z( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlastlineacc_Z = value ;
   }

   public java.util.Date getPrdlastfechcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdlastfechcc_Z ;
   }

   public void setPrdlastfechcc_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlastfechcc_Z = value ;
   }

   public String getPrdlasttipmovcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdlasttipmovcc_Z ;
   }

   public void setPrdlasttipmovcc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlasttipmovcc_Z = value ;
   }

   public boolean getPrdescompuesto_Z( )
   {
      return gxTv_SdtPRODUC_Prdescompuesto_Z ;
   }

   public void setPrdescompuesto_Z( boolean value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdescompuesto_Z = value ;
   }

   public short getPrddiasinmov_Z( )
   {
      return gxTv_SdtPRODUC_Prddiasinmov_Z ;
   }

   public void setPrddiasinmov_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prddiasinmov_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtPRODUC_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Emprnom_N = value ;
   }

   public byte getPrdnum_N( )
   {
      return gxTv_SdtPRODUC_Prdnum_N ;
   }

   public void setPrdnum_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdnum_N = value ;
   }

   public byte getPrvnom_N( )
   {
      return gxTv_SdtPRODUC_Prvnom_N ;
   }

   public void setPrvnom_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prvnom_N = value ;
   }

   public byte getPrducpdsc_N( )
   {
      return gxTv_SdtPRODUC_Prducpdsc_N ;
   }

   public void setPrducpdsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prducpdsc_N = value ;
   }

   public byte getPrducodsc_N( )
   {
      return gxTv_SdtPRODUC_Prducodsc_N ;
   }

   public void setPrducodsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prducodsc_N = value ;
   }

   public byte getValdsc_N( )
   {
      return gxTv_SdtPRODUC_Valdsc_N ;
   }

   public void setValdsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Valdsc_N = value ;
   }

   public byte getTipdtocod_N( )
   {
      return gxTv_SdtPRODUC_Tipdtocod_N ;
   }

   public void setTipdtocod_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipdtocod_N = value ;
   }

   public byte getTipdtodto_N( )
   {
      return gxTv_SdtPRODUC_Tipdtodto_N ;
   }

   public void setTipdtodto_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipdtodto_N = value ;
   }

   public byte getMetcod_N( )
   {
      return gxTv_SdtPRODUC_Metcod_N ;
   }

   public void setMetcod_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Metcod_N = value ;
   }

   public byte getMetdsc_N( )
   {
      return gxTv_SdtPRODUC_Metdsc_N ;
   }

   public void setMetdsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Metdsc_N = value ;
   }

   public byte getTipprdcod_N( )
   {
      return gxTv_SdtPRODUC_Tipprdcod_N ;
   }

   public void setTipprdcod_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipprdcod_N = value ;
   }

   public byte getTipprddsc_N( )
   {
      return gxTv_SdtPRODUC_Tipprddsc_N ;
   }

   public void setTipprddsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Tipprddsc_N = value ;
   }

   public byte getSubfamcod_N( )
   {
      return gxTv_SdtPRODUC_Subfamcod_N ;
   }

   public void setSubfamcod_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Subfamcod_N = value ;
   }

   public byte getSubfamdsc_N( )
   {
      return gxTv_SdtPRODUC_Subfamdsc_N ;
   }

   public void setSubfamdsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Subfamdsc_N = value ;
   }

   public byte getPrdfabid_N( )
   {
      return gxTv_SdtPRODUC_Prdfabid_N ;
   }

   public void setPrdfabid_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfabid_N = value ;
   }

   public byte getPrdfabnm_N( )
   {
      return gxTv_SdtPRODUC_Prdfabnm_N ;
   }

   public void setPrdfabnm_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfabnm_N = value ;
   }

   public byte getPrdthelist_N( )
   {
      return gxTv_SdtPRODUC_Prdthelist_N ;
   }

   public void setPrdthelist_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdthelist_N = value ;
   }

   public byte getPrdcantatm_N( )
   {
      return gxTv_SdtPRODUC_Prdcantatm_N ;
   }

   public void setPrdcantatm_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdcantatm_N = value ;
   }

   public byte getPrdgrufamid_N( )
   {
      return gxTv_SdtPRODUC_Prdgrufamid_N ;
   }

   public void setPrdgrufamid_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdgrufamid_N = value ;
   }

   public byte getPrdmatseca_N( )
   {
      return gxTv_SdtPRODUC_Prdmatseca_N ;
   }

   public void setPrdmatseca_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdmatseca_N = value ;
   }

   public byte getAlmprdid_N( )
   {
      return gxTv_SdtPRODUC_Almprdid_N ;
   }

   public void setAlmprdid_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Almprdid_N = value ;
   }

   public byte getPrdlotefch_N( )
   {
      return gxTv_SdtPRODUC_Prdlotefch_N ;
   }

   public void setPrdlotefch_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlotefch_N = value ;
   }

   public byte getPrdftdoc_N( )
   {
      return gxTv_SdtPRODUC_Prdftdoc_N ;
   }

   public void setPrdftdoc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdftdoc_N = value ;
   }

   public byte getPrdfsdoc_N( )
   {
      return gxTv_SdtPRODUC_Prdfsdoc_N ;
   }

   public void setPrdfsdoc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdfsdoc_N = value ;
   }

   public byte getPrdgrs_N( )
   {
      return gxTv_SdtPRODUC_Prdgrs_N ;
   }

   public void setPrdgrs_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdgrs_N = value ;
   }

   public byte getPrdlastlineacc_N( )
   {
      return gxTv_SdtPRODUC_Prdlastlineacc_N ;
   }

   public void setPrdlastlineacc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      gxTv_SdtPRODUC_Prdlastlineacc_N = value ;
   }

   protected byte gxTv_SdtPRODUC_Prdunicom ;
   protected byte gxTv_SdtPRODUC_Prdunicon ;
   protected byte gxTv_SdtPRODUC_Valcod ;
   protected byte gxTv_SdtPRODUC_Prdsit ;
   protected byte gxTv_SdtPRODUC_Tipdtocod ;
   protected byte gxTv_SdtPRODUC_Metcod ;
   protected byte gxTv_SdtPRODUC_Prdposy ;
   protected byte gxTv_SdtPRODUC_Prdtnq ;
   protected byte gxTv_SdtPRODUC_Prdumefo ;
   protected byte gxTv_SdtPRODUC_Prdhormad ;
   protected byte gxTv_SdtPRODUC_Subfamcod ;
   protected byte gxTv_SdtPRODUC_Prdpescon ;
   protected byte gxTv_SdtPRODUC_Prdgrufamid ;
   protected byte gxTv_SdtPRODUC_Prdunicom_Z ;
   protected byte gxTv_SdtPRODUC_Prdunicon_Z ;
   protected byte gxTv_SdtPRODUC_Valcod_Z ;
   protected byte gxTv_SdtPRODUC_Prdsit_Z ;
   protected byte gxTv_SdtPRODUC_Tipdtocod_Z ;
   protected byte gxTv_SdtPRODUC_Metcod_Z ;
   protected byte gxTv_SdtPRODUC_Prdposy_Z ;
   protected byte gxTv_SdtPRODUC_Prdtnq_Z ;
   protected byte gxTv_SdtPRODUC_Prdumefo_Z ;
   protected byte gxTv_SdtPRODUC_Prdhormad_Z ;
   protected byte gxTv_SdtPRODUC_Subfamcod_Z ;
   protected byte gxTv_SdtPRODUC_Prdpescon_Z ;
   protected byte gxTv_SdtPRODUC_Prdgrufamid_Z ;
   protected byte gxTv_SdtPRODUC_Emprnom_N ;
   protected byte gxTv_SdtPRODUC_Prdnum_N ;
   protected byte gxTv_SdtPRODUC_Prvnom_N ;
   protected byte gxTv_SdtPRODUC_Prducpdsc_N ;
   protected byte gxTv_SdtPRODUC_Prducodsc_N ;
   protected byte gxTv_SdtPRODUC_Valdsc_N ;
   protected byte gxTv_SdtPRODUC_Tipdtocod_N ;
   protected byte gxTv_SdtPRODUC_Tipdtodto_N ;
   protected byte gxTv_SdtPRODUC_Metcod_N ;
   protected byte gxTv_SdtPRODUC_Metdsc_N ;
   protected byte gxTv_SdtPRODUC_Tipprdcod_N ;
   protected byte gxTv_SdtPRODUC_Tipprddsc_N ;
   protected byte gxTv_SdtPRODUC_Subfamcod_N ;
   protected byte gxTv_SdtPRODUC_Subfamdsc_N ;
   protected byte gxTv_SdtPRODUC_Prdfabid_N ;
   protected byte gxTv_SdtPRODUC_Prdfabnm_N ;
   protected byte gxTv_SdtPRODUC_Prdthelist_N ;
   protected byte gxTv_SdtPRODUC_Prdcantatm_N ;
   protected byte gxTv_SdtPRODUC_Prdgrufamid_N ;
   protected byte gxTv_SdtPRODUC_Prdmatseca_N ;
   protected byte gxTv_SdtPRODUC_Almprdid_N ;
   protected byte gxTv_SdtPRODUC_Prdlotefch_N ;
   protected byte gxTv_SdtPRODUC_Prdftdoc_N ;
   protected byte gxTv_SdtPRODUC_Prdfsdoc_N ;
   protected byte gxTv_SdtPRODUC_Prdgrs_N ;
   protected byte gxTv_SdtPRODUC_Prdlastlineacc_N ;
   private byte gxTv_SdtPRODUC_N ;
   protected short gxTv_SdtPRODUC_Prdstkmind ;
   protected short gxTv_SdtPRODUC_Prddiarot ;
   protected short gxTv_SdtPRODUC_Prdplaent ;
   protected short gxTv_SdtPRODUC_Prdlotmin ;
   protected short gxTv_SdtPRODUC_Prdultccc ;
   protected short gxTv_SdtPRODUC_Prdconcc ;
   protected short gxTv_SdtPRODUC_Prdposx ;
   protected short gxTv_SdtPRODUC_Prddqo ;
   protected short gxTv_SdtPRODUC_Tipprdcod ;
   protected short gxTv_SdtPRODUC_Prdconct ;
   protected short gxTv_SdtPRODUC_Prdcantatm ;
   protected short gxTv_SdtPRODUC_Almprdid ;
   protected short gxTv_SdtPRODUC_Prddiasinactivo ;
   protected short gxTv_SdtPRODUC_Prddiasinmov ;
   protected short gxTv_SdtPRODUC_Initialized ;
   protected short gxTv_SdtPRODUC_Prdstkmind_Z ;
   protected short gxTv_SdtPRODUC_Prddiarot_Z ;
   protected short gxTv_SdtPRODUC_Prdplaent_Z ;
   protected short gxTv_SdtPRODUC_Prdlotmin_Z ;
   protected short gxTv_SdtPRODUC_Prdultccc_Z ;
   protected short gxTv_SdtPRODUC_Prdconcc_Z ;
   protected short gxTv_SdtPRODUC_Prdposx_Z ;
   protected short gxTv_SdtPRODUC_Prddqo_Z ;
   protected short gxTv_SdtPRODUC_Tipprdcod_Z ;
   protected short gxTv_SdtPRODUC_Prdconct_Z ;
   protected short gxTv_SdtPRODUC_Prdcantatm_Z ;
   protected short gxTv_SdtPRODUC_Almprdid_Z ;
   protected short gxTv_SdtPRODUC_Prddiasinactivo_Z ;
   protected short gxTv_SdtPRODUC_Prddiasinmov_Z ;
   protected int gxTv_SdtPRODUC_Prvnum ;
   protected int gxTv_SdtPRODUC_Prdfabid ;
   protected int gxTv_SdtPRODUC_Prvnum_Z ;
   protected int gxTv_SdtPRODUC_Prdfabid_Z ;
   protected long gxTv_SdtPRODUC_Prdrgb ;
   protected long gxTv_SdtPRODUC_Prdultmovcc ;
   protected long gxTv_SdtPRODUC_Prdlastlineacc ;
   protected long gxTv_SdtPRODUC_Prdrgb_Z ;
   protected long gxTv_SdtPRODUC_Prdultmovcc_Z ;
   protected long gxTv_SdtPRODUC_Prdlastlineacc_Z ;
   protected String gxTv_SdtPRODUC_Emprcod ;
   protected String gxTv_SdtPRODUC_Emprnom ;
   protected String gxTv_SdtPRODUC_Prdnum ;
   protected String gxTv_SdtPRODUC_Prdnom ;
   protected String gxTv_SdtPRODUC_Prvnom ;
   protected String gxTv_SdtPRODUC_Prdrefprv ;
   protected String gxTv_SdtPRODUC_Prddsctec ;
   protected String gxTv_SdtPRODUC_Prducpdsc ;
   protected String gxTv_SdtPRODUC_Prducodsc ;
   protected String gxTv_SdtPRODUC_Valdsc ;
   protected String gxTv_SdtPRODUC_Prdrec ;
   protected String gxTv_SdtPRODUC_Prdcalnec ;
   protected String gxTv_SdtPRODUC_Prddetpar ;
   protected String gxTv_SdtPRODUC_Metdsc ;
   protected String gxTv_SdtPRODUC_Prdtip ;
   protected String gxTv_SdtPRODUC_Prdrev ;
   protected String gxTv_SdtPRODUC_Prdnom2 ;
   protected String gxTv_SdtPRODUC_Prdnum2 ;
   protected String gxTv_SdtPRODUC_Prdsalm ;
   protected String gxTv_SdtPRODUC_Tipprddsc ;
   protected String gxTv_SdtPRODUC_Prdnumcentra ;
   protected String gxTv_SdtPRODUC_Prdpesterm ;
   protected String gxTv_SdtPRODUC_Prdsal ;
   protected String gxTv_SdtPRODUC_Subfamdsc ;
   protected String gxTv_SdtPRODUC_Prdinc ;
   protected String gxTv_SdtPRODUC_Prdcomp ;
   protected String gxTv_SdtPRODUC_Prdncas ;
   protected String gxTv_SdtPRODUC_Prdft ;
   protected String gxTv_SdtPRODUC_Prdhs ;
   protected String gxTv_SdtPRODUC_Prdcolidx ;
   protected String gxTv_SdtPRODUC_Prdokotex ;
   protected String gxTv_SdtPRODUC_Prdreach ;
   protected String gxTv_SdtPRODUC_Prdlote ;
   protected String gxTv_SdtPRODUC_Prdrtm ;
   protected String gxTv_SdtPRODUC_Prdctw1 ;
   protected String gxTv_SdtPRODUC_Prdctw2 ;
   protected String gxTv_SdtPRODUC_Prdctw3 ;
   protected String gxTv_SdtPRODUC_Prdctw4 ;
   protected String gxTv_SdtPRODUC_Prdnrocas ;
   protected String gxTv_SdtPRODUC_Prdgots ;
   protected String gxTv_SdtPRODUC_Prdhm ;
   protected String gxTv_SdtPRODUC_Prdeinecs ;
   protected String gxTv_SdtPRODUC_Prdfuncion ;
   protected String gxTv_SdtPRODUC_Prdlist ;
   protected String gxTv_SdtPRODUC_Prdfabnm ;
   protected String gxTv_SdtPRODUC_Prdloteob ;
   protected String gxTv_SdtPRODUC_Prdzdhc ;
   protected String gxTv_SdtPRODUC_Prdthelist ;
   protected String gxTv_SdtPRODUC_Prdubicacion ;
   protected String gxTv_SdtPRODUC_Prdeqlp ;
   protected String gxTv_SdtPRODUC_Prdgrs ;
   protected String gxTv_SdtPRODUC_Prdtipmovult ;
   protected String gxTv_SdtPRODUC_Prdlasttipmovcc ;
   protected String gxTv_SdtPRODUC_Mode ;
   protected String gxTv_SdtPRODUC_Emprcod_Z ;
   protected String gxTv_SdtPRODUC_Emprnom_Z ;
   protected String gxTv_SdtPRODUC_Prdnum_Z ;
   protected String gxTv_SdtPRODUC_Prdnom_Z ;
   protected String gxTv_SdtPRODUC_Prvnom_Z ;
   protected String gxTv_SdtPRODUC_Prdrefprv_Z ;
   protected String gxTv_SdtPRODUC_Prddsctec_Z ;
   protected String gxTv_SdtPRODUC_Prducpdsc_Z ;
   protected String gxTv_SdtPRODUC_Prducodsc_Z ;
   protected String gxTv_SdtPRODUC_Valdsc_Z ;
   protected String gxTv_SdtPRODUC_Prdrec_Z ;
   protected String gxTv_SdtPRODUC_Prdcalnec_Z ;
   protected String gxTv_SdtPRODUC_Prddetpar_Z ;
   protected String gxTv_SdtPRODUC_Metdsc_Z ;
   protected String gxTv_SdtPRODUC_Prdtip_Z ;
   protected String gxTv_SdtPRODUC_Prdrev_Z ;
   protected String gxTv_SdtPRODUC_Prdnom2_Z ;
   protected String gxTv_SdtPRODUC_Prdnum2_Z ;
   protected String gxTv_SdtPRODUC_Prdsalm_Z ;
   protected String gxTv_SdtPRODUC_Tipprddsc_Z ;
   protected String gxTv_SdtPRODUC_Prdnumcentra_Z ;
   protected String gxTv_SdtPRODUC_Prdpesterm_Z ;
   protected String gxTv_SdtPRODUC_Prdsal_Z ;
   protected String gxTv_SdtPRODUC_Subfamdsc_Z ;
   protected String gxTv_SdtPRODUC_Prdinc_Z ;
   protected String gxTv_SdtPRODUC_Prdcomp_Z ;
   protected String gxTv_SdtPRODUC_Prdncas_Z ;
   protected String gxTv_SdtPRODUC_Prdft_Z ;
   protected String gxTv_SdtPRODUC_Prdhs_Z ;
   protected String gxTv_SdtPRODUC_Prdcolidx_Z ;
   protected String gxTv_SdtPRODUC_Prdokotex_Z ;
   protected String gxTv_SdtPRODUC_Prdreach_Z ;
   protected String gxTv_SdtPRODUC_Prdlote_Z ;
   protected String gxTv_SdtPRODUC_Prdrtm_Z ;
   protected String gxTv_SdtPRODUC_Prdctw1_Z ;
   protected String gxTv_SdtPRODUC_Prdctw2_Z ;
   protected String gxTv_SdtPRODUC_Prdctw3_Z ;
   protected String gxTv_SdtPRODUC_Prdctw4_Z ;
   protected String gxTv_SdtPRODUC_Prdnrocas_Z ;
   protected String gxTv_SdtPRODUC_Prdgots_Z ;
   protected String gxTv_SdtPRODUC_Prdhm_Z ;
   protected String gxTv_SdtPRODUC_Prdeinecs_Z ;
   protected String gxTv_SdtPRODUC_Prdfuncion_Z ;
   protected String gxTv_SdtPRODUC_Prdlist_Z ;
   protected String gxTv_SdtPRODUC_Prdfabnm_Z ;
   protected String gxTv_SdtPRODUC_Prdloteob_Z ;
   protected String gxTv_SdtPRODUC_Prdzdhc_Z ;
   protected String gxTv_SdtPRODUC_Prdthelist_Z ;
   protected String gxTv_SdtPRODUC_Prdubicacion_Z ;
   protected String gxTv_SdtPRODUC_Prdeqlp_Z ;
   protected String gxTv_SdtPRODUC_Prdgrs_Z ;
   protected String gxTv_SdtPRODUC_Prdtipmovult_Z ;
   protected String gxTv_SdtPRODUC_Prdlasttipmovcc_Z ;
   protected boolean gxTv_SdtPRODUC_Prdescompuesto ;
   protected boolean gxTv_SdtPRODUC_Prdescompuesto_Z ;
   protected String gxTv_SdtPRODUC_Prdobs ;
   protected String gxTv_SdtPRODUC_Prdnmqu ;
   protected String gxTv_SdtPRODUC_Prdftdoc ;
   protected String gxTv_SdtPRODUC_Prdfsdoc ;
   protected String gxTv_SdtPRODUC_Prdcdsc ;
   protected String gxTv_SdtPRODUC_Prdobs_Z ;
   protected String gxTv_SdtPRODUC_Prdnmqu_Z ;
   protected String gxTv_SdtPRODUC_Prdftdoc_Z ;
   protected String gxTv_SdtPRODUC_Prdfsdoc_Z ;
   protected String gxTv_SdtPRODUC_Prdcdsc_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdfaccon ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdrotrea ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Tipdtodto ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdpreact ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfecpre ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdpreant ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdpremed ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdcondia ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdstkminu ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdnumuco ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdexicc ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdcanres ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdcanpen ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfulent ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfulped ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfulcc ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdexiccp ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdultecc ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdultdcc ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prddifcc ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdvalstk ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Difvalstk ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfecent ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdpreac2 ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prddenss ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdconcs ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdsolub ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdnumct1 ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdnumct2 ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdexialmc ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdaox ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfft ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfhs ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdmatseca ;
   protected java.util.Date gxTv_SdtPRODUC_Prdlotefch ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prddisponible ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfecultmov ;
   protected java.util.Date gxTv_SdtPRODUC_Prdlastfechcc ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdfaccon_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdrotrea_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Tipdtodto_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdpreact_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfecpre_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdpreant_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdpremed_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdcondia_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdstkminu_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdnumuco_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdexialm_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdexicc_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdcanres_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdcanpen_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfulent_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfulped_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfulcc_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdexiccp_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdultecc_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdultdcc_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prddifcc_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdvalstk_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Difvalstk_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfecent_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdpreac2_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prddenss_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdconcs_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdsolub_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdnumct1_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdnumct2_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdexialmc_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdaox_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfft_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfhs_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prdmatseca_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdlotefch_Z ;
   protected java.math.BigDecimal gxTv_SdtPRODUC_Prddisponible_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdfecultmov_Z ;
   protected java.util.Date gxTv_SdtPRODUC_Prdlastfechcc_Z ;
}

