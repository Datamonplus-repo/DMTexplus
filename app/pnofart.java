package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnofart extends GXProcedure
{
   public pnofart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnofart.class ), "" );
   }

   public pnofart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      pnofart.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      pnofart.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnofart.this.AV16Clicod = aP1[0];
      this.aP1 = aP1;
      pnofart.this.AV17ARtCod = aP2[0];
      this.aP2 = aP2;
      pnofart.this.AV18Barcod = aP3[0];
      this.aP3 = aP3;
      pnofart.this.AV19Barcodreo = aP4[0];
      this.aP4 = aP4;
      pnofart.this.AV20Barcodpar = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23GXLvl3 = (byte)(0) ;
      /* Using cursor P04CJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16Clicod), AV17ARtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10978Bros_Art = P04CJ2_A10978Bros_Art[0] ;
         A252CliCod = P04CJ2_A252CliCod[0] ;
         A11387Bros_humed = P04CJ2_A11387Bros_humed[0] ;
         n11387Bros_humed = P04CJ2_n11387Bros_humed[0] ;
         A11704Bros_enc = P04CJ2_A11704Bros_enc[0] ;
         n11704Bros_enc = P04CJ2_n11704Bros_enc[0] ;
         A11703Bros_nc = P04CJ2_A11703Bros_nc[0] ;
         n11703Bros_nc = P04CJ2_n11703Bros_nc[0] ;
         A10979Bros_Mcot = P04CJ2_A10979Bros_Mcot[0] ;
         n10979Bros_Mcot = P04CJ2_n10979Bros_Mcot[0] ;
         A10980Bros_Pd = P04CJ2_A10980Bros_Pd[0] ;
         n10980Bros_Pd = P04CJ2_n10980Bros_Pd[0] ;
         A10981Bros_Pp = P04CJ2_A10981Bros_Pp[0] ;
         n10981Bros_Pp = P04CJ2_n10981Bros_Pp[0] ;
         A10982Bros_Ag = P04CJ2_A10982Bros_Ag[0] ;
         n10982Bros_Ag = P04CJ2_n10982Bros_Ag[0] ;
         A10983Bros_c1 = P04CJ2_A10983Bros_c1[0] ;
         n10983Bros_c1 = P04CJ2_n10983Bros_c1[0] ;
         A10984Bros_c2 = P04CJ2_A10984Bros_c2[0] ;
         n10984Bros_c2 = P04CJ2_n10984Bros_c2[0] ;
         A10985Bros_bo = P04CJ2_A10985Bros_bo[0] ;
         n10985Bros_bo = P04CJ2_n10985Bros_bo[0] ;
         A10986Bros_bob = P04CJ2_A10986Bros_bob[0] ;
         n10986Bros_bob = P04CJ2_n10986Bros_bob[0] ;
         A10987Bros_boe = P04CJ2_A10987Bros_boe[0] ;
         n10987Bros_boe = P04CJ2_n10987Bros_boe[0] ;
         A10988BrosBov = P04CJ2_A10988BrosBov[0] ;
         n10988BrosBov = P04CJ2_n10988BrosBov[0] ;
         A10989Bros_c3 = P04CJ2_A10989Bros_c3[0] ;
         n10989Bros_c3 = P04CJ2_n10989Bros_c3[0] ;
         A10990Bros_tns = P04CJ2_A10990Bros_tns[0] ;
         n10990Bros_tns = P04CJ2_n10990Bros_tns[0] ;
         A10991Bros_tnc = P04CJ2_A10991Bros_tnc[0] ;
         n10991Bros_tnc = P04CJ2_n10991Bros_tnc[0] ;
         A10992Bros_c4 = P04CJ2_A10992Bros_c4[0] ;
         n10992Bros_c4 = P04CJ2_n10992Bros_c4[0] ;
         A10993Bros_ct = P04CJ2_A10993Bros_ct[0] ;
         n10993Bros_ct = P04CJ2_n10993Bros_ct[0] ;
         A10994Bros_c5 = P04CJ2_A10994Bros_c5[0] ;
         n10994Bros_c5 = P04CJ2_n10994Bros_c5[0] ;
         A10995Bros_scs = P04CJ2_A10995Bros_scs[0] ;
         n10995Bros_scs = P04CJ2_n10995Bros_scs[0] ;
         A10996Bros_scc = P04CJ2_A10996Bros_scc[0] ;
         n10996Bros_scc = P04CJ2_n10996Bros_scc[0] ;
         A10997Bros_c6 = P04CJ2_A10997Bros_c6[0] ;
         n10997Bros_c6 = P04CJ2_n10997Bros_c6[0] ;
         A10998Bros_cctse = P04CJ2_A10998Bros_cctse[0] ;
         n10998Bros_cctse = P04CJ2_n10998Bros_cctse[0] ;
         A10999Bros_ccttp = P04CJ2_A10999Bros_ccttp[0] ;
         n10999Bros_ccttp = P04CJ2_n10999Bros_ccttp[0] ;
         A11000Bros_cctet = P04CJ2_A11000Bros_cctet[0] ;
         n11000Bros_cctet = P04CJ2_n11000Bros_cctet[0] ;
         A11001Bros_ccp = P04CJ2_A11001Bros_ccp[0] ;
         n11001Bros_ccp = P04CJ2_n11001Bros_ccp[0] ;
         A11002Bros_cct = P04CJ2_A11002Bros_cct[0] ;
         n11002Bros_cct = P04CJ2_n11002Bros_cct[0] ;
         A11003Bros_ccpc = P04CJ2_A11003Bros_ccpc[0] ;
         n11003Bros_ccpc = P04CJ2_n11003Bros_ccpc[0] ;
         A11004Bros_cctq = P04CJ2_A11004Bros_cctq[0] ;
         n11004Bros_cctq = P04CJ2_n11004Bros_cctq[0] ;
         A11005Bros_cccc = P04CJ2_A11005Bros_cccc[0] ;
         n11005Bros_cccc = P04CJ2_n11005Bros_cccc[0] ;
         A11006Bros_ccec = P04CJ2_A11006Bros_ccec[0] ;
         n11006Bros_ccec = P04CJ2_n11006Bros_ccec[0] ;
         A11008Bros_ccmc1 = P04CJ2_A11008Bros_ccmc1[0] ;
         n11008Bros_ccmc1 = P04CJ2_n11008Bros_ccmc1[0] ;
         A11009Bros_ccmc2 = P04CJ2_A11009Bros_ccmc2[0] ;
         n11009Bros_ccmc2 = P04CJ2_n11009Bros_ccmc2[0] ;
         A11010Bros_ccmc3 = P04CJ2_A11010Bros_ccmc3[0] ;
         n11010Bros_ccmc3 = P04CJ2_n11010Bros_ccmc3[0] ;
         A11011Bros_ccmc4 = P04CJ2_A11011Bros_ccmc4[0] ;
         n11011Bros_ccmc4 = P04CJ2_n11011Bros_ccmc4[0] ;
         A11012Bros_ccmc5 = P04CJ2_A11012Bros_ccmc5[0] ;
         n11012Bros_ccmc5 = P04CJ2_n11012Bros_ccmc5[0] ;
         A11013Bros_ccmc6 = P04CJ2_A11013Bros_ccmc6[0] ;
         n11013Bros_ccmc6 = P04CJ2_n11013Bros_ccmc6[0] ;
         A11014Bros_c7 = P04CJ2_A11014Bros_c7[0] ;
         n11014Bros_c7 = P04CJ2_n11014Bros_c7[0] ;
         A11015Bros_rb = P04CJ2_A11015Bros_rb[0] ;
         n11015Bros_rb = P04CJ2_n11015Bros_rb[0] ;
         A11016Bros_rbi = P04CJ2_A11016Bros_rbi[0] ;
         n11016Bros_rbi = P04CJ2_n11016Bros_rbi[0] ;
         A11017Bros_rbe = P04CJ2_A11017Bros_rbe[0] ;
         n11017Bros_rbe = P04CJ2_n11017Bros_rbe[0] ;
         A11018Bros_rbp = P04CJ2_A11018Bros_rbp[0] ;
         n11018Bros_rbp = P04CJ2_n11018Bros_rbp[0] ;
         A11019Bros_rboc = P04CJ2_A11019Bros_rboc[0] ;
         n11019Bros_rboc = P04CJ2_n11019Bros_rboc[0] ;
         A11020Bros_rb1 = P04CJ2_A11020Bros_rb1[0] ;
         n11020Bros_rb1 = P04CJ2_n11020Bros_rb1[0] ;
         A11021Bros_rb3 = P04CJ2_A11021Bros_rb3[0] ;
         n11021Bros_rb3 = P04CJ2_n11021Bros_rb3[0] ;
         A11022Bros_c8 = P04CJ2_A11022Bros_c8[0] ;
         n11022Bros_c8 = P04CJ2_n11022Bros_c8[0] ;
         A11023Bros_ep1 = P04CJ2_A11023Bros_ep1[0] ;
         n11023Bros_ep1 = P04CJ2_n11023Bros_ep1[0] ;
         A11024Bros_ep2 = P04CJ2_A11024Bros_ep2[0] ;
         n11024Bros_ep2 = P04CJ2_n11024Bros_ep2[0] ;
         A11025Bros_ep3 = P04CJ2_A11025Bros_ep3[0] ;
         n11025Bros_ep3 = P04CJ2_n11025Bros_ep3[0] ;
         A11026Bros_ep4 = P04CJ2_A11026Bros_ep4[0] ;
         n11026Bros_ep4 = P04CJ2_n11026Bros_ep4[0] ;
         A11027Bros_ep5 = P04CJ2_A11027Bros_ep5[0] ;
         n11027Bros_ep5 = P04CJ2_n11027Bros_ep5[0] ;
         A11028Bros_ep6 = P04CJ2_A11028Bros_ep6[0] ;
         n11028Bros_ep6 = P04CJ2_n11028Bros_ep6[0] ;
         A11029Bros_ep7 = P04CJ2_A11029Bros_ep7[0] ;
         n11029Bros_ep7 = P04CJ2_n11029Bros_ep7[0] ;
         A11030Bros_ep8 = P04CJ2_A11030Bros_ep8[0] ;
         n11030Bros_ep8 = P04CJ2_n11030Bros_ep8[0] ;
         A11031Bros_ep9 = P04CJ2_A11031Bros_ep9[0] ;
         n11031Bros_ep9 = P04CJ2_n11031Bros_ep9[0] ;
         A11032Bros_ep10 = P04CJ2_A11032Bros_ep10[0] ;
         n11032Bros_ep10 = P04CJ2_n11032Bros_ep10[0] ;
         A11033Bros_c9 = P04CJ2_A11033Bros_c9[0] ;
         n11033Bros_c9 = P04CJ2_n11033Bros_c9[0] ;
         A11034Bros_sa1 = P04CJ2_A11034Bros_sa1[0] ;
         n11034Bros_sa1 = P04CJ2_n11034Bros_sa1[0] ;
         A11035Bros_sa2 = P04CJ2_A11035Bros_sa2[0] ;
         n11035Bros_sa2 = P04CJ2_n11035Bros_sa2[0] ;
         A11036Bros_sa3 = P04CJ2_A11036Bros_sa3[0] ;
         n11036Bros_sa3 = P04CJ2_n11036Bros_sa3[0] ;
         A11037Bros_sa4 = P04CJ2_A11037Bros_sa4[0] ;
         n11037Bros_sa4 = P04CJ2_n11037Bros_sa4[0] ;
         A11038Bros_sa5 = P04CJ2_A11038Bros_sa5[0] ;
         n11038Bros_sa5 = P04CJ2_n11038Bros_sa5[0] ;
         A11039Bros_sa6 = P04CJ2_A11039Bros_sa6[0] ;
         n11039Bros_sa6 = P04CJ2_n11039Bros_sa6[0] ;
         A11040Bros_c10 = P04CJ2_A11040Bros_c10[0] ;
         n11040Bros_c10 = P04CJ2_n11040Bros_c10[0] ;
         A11069Bros_c11 = P04CJ2_A11069Bros_c11[0] ;
         n11069Bros_c11 = P04CJ2_n11069Bros_c11[0] ;
         A11070Bros_c12 = P04CJ2_A11070Bros_c12[0] ;
         n11070Bros_c12 = P04CJ2_n11070Bros_c12[0] ;
         A11066Bros_stk = P04CJ2_A11066Bros_stk[0] ;
         n11066Bros_stk = P04CJ2_n11066Bros_stk[0] ;
         A11067Bros_Lbta = P04CJ2_A11067Bros_Lbta[0] ;
         n11067Bros_Lbta = P04CJ2_n11067Bros_Lbta[0] ;
         A11068Bros_Lbtp = P04CJ2_A11068Bros_Lbtp[0] ;
         n11068Bros_Lbtp = P04CJ2_n11068Bros_Lbtp[0] ;
         A11369Bros_imp1 = P04CJ2_A11369Bros_imp1[0] ;
         n11369Bros_imp1 = P04CJ2_n11369Bros_imp1[0] ;
         A11370Bros_imp2 = P04CJ2_A11370Bros_imp2[0] ;
         n11370Bros_imp2 = P04CJ2_n11370Bros_imp2[0] ;
         A11371Bros_imp3 = P04CJ2_A11371Bros_imp3[0] ;
         n11371Bros_imp3 = P04CJ2_n11371Bros_imp3[0] ;
         A11372Bros_imp4 = P04CJ2_A11372Bros_imp4[0] ;
         n11372Bros_imp4 = P04CJ2_n11372Bros_imp4[0] ;
         A11373Bros_imp5 = P04CJ2_A11373Bros_imp5[0] ;
         n11373Bros_imp5 = P04CJ2_n11373Bros_imp5[0] ;
         A11374Bros_imp6 = P04CJ2_A11374Bros_imp6[0] ;
         n11374Bros_imp6 = P04CJ2_n11374Bros_imp6[0] ;
         A11375Bros_imp7 = P04CJ2_A11375Bros_imp7[0] ;
         n11375Bros_imp7 = P04CJ2_n11375Bros_imp7[0] ;
         A11376Bros_imp8 = P04CJ2_A11376Bros_imp8[0] ;
         n11376Bros_imp8 = P04CJ2_n11376Bros_imp8[0] ;
         A11377Bros_imp9 = P04CJ2_A11377Bros_imp9[0] ;
         n11377Bros_imp9 = P04CJ2_n11377Bros_imp9[0] ;
         A11378Bros_imp10 = P04CJ2_A11378Bros_imp10[0] ;
         n11378Bros_imp10 = P04CJ2_n11378Bros_imp10[0] ;
         A11379Bros_imp11 = P04CJ2_A11379Bros_imp11[0] ;
         n11379Bros_imp11 = P04CJ2_n11379Bros_imp11[0] ;
         A11381Bros_lavad = P04CJ2_A11381Bros_lavad[0] ;
         n11381Bros_lavad = P04CJ2_n11381Bros_lavad[0] ;
         A11382Bros_luz = P04CJ2_A11382Bros_luz[0] ;
         n11382Bros_luz = P04CJ2_n11382Bros_luz[0] ;
         A11383Bros_sudor = P04CJ2_A11383Bros_sudor[0] ;
         n11383Bros_sudor = P04CJ2_n11383Bros_sudor[0] ;
         A11384Bros_cloro = P04CJ2_A11384Bros_cloro[0] ;
         n11384Bros_cloro = P04CJ2_n11384Bros_cloro[0] ;
         A11385Bros_aguam = P04CJ2_A11385Bros_aguam[0] ;
         n11385Bros_aguam = P04CJ2_n11385Bros_aguam[0] ;
         A11386Bros_termo = P04CJ2_A11386Bros_termo[0] ;
         n11386Bros_termo = P04CJ2_n11386Bros_termo[0] ;
         A11380Bros_oekot = P04CJ2_A11380Bros_oekot[0] ;
         n11380Bros_oekot = P04CJ2_n11380Bros_oekot[0] ;
         A11407Bros_obs1 = P04CJ2_A11407Bros_obs1[0] ;
         n11407Bros_obs1 = P04CJ2_n11407Bros_obs1[0] ;
         A11408Bros_obs2 = P04CJ2_A11408Bros_obs2[0] ;
         n11408Bros_obs2 = P04CJ2_n11408Bros_obs2[0] ;
         A11409Bros_obs3 = P04CJ2_A11409Bros_obs3[0] ;
         n11409Bros_obs3 = P04CJ2_n11409Bros_obs3[0] ;
         A11410Bros_obs4 = P04CJ2_A11410Bros_obs4[0] ;
         n11410Bros_obs4 = P04CJ2_n11410Bros_obs4[0] ;
         A11411Bros_obs5 = P04CJ2_A11411Bros_obs5[0] ;
         n11411Bros_obs5 = P04CJ2_n11411Bros_obs5[0] ;
         A11412Bros_obs6 = P04CJ2_A11412Bros_obs6[0] ;
         n11412Bros_obs6 = P04CJ2_n11412Bros_obs6[0] ;
         A11413Bros_obs7 = P04CJ2_A11413Bros_obs7[0] ;
         n11413Bros_obs7 = P04CJ2_n11413Bros_obs7[0] ;
         A11414Bros_obs8 = P04CJ2_A11414Bros_obs8[0] ;
         n11414Bros_obs8 = P04CJ2_n11414Bros_obs8[0] ;
         A11415Bros_obs9 = P04CJ2_A11415Bros_obs9[0] ;
         n11415Bros_obs9 = P04CJ2_n11415Bros_obs9[0] ;
         A11416Bros_obs10 = P04CJ2_A11416Bros_obs10[0] ;
         n11416Bros_obs10 = P04CJ2_n11416Bros_obs10[0] ;
         A11417Bros_obs11 = P04CJ2_A11417Bros_obs11[0] ;
         n11417Bros_obs11 = P04CJ2_n11417Bros_obs11[0] ;
         A840TrnCod = P04CJ2_A840TrnCod[0] ;
         n840TrnCod = P04CJ2_n840TrnCod[0] ;
         W396EmprCod = A396EmprCod ;
         AV23GXLvl3 = (byte)(1) ;
         /*
            INSERT RECORD ON TABLE TXPNOFART

         */
         W396EmprCod = A396EmprCod ;
         W840TrnCod = A840TrnCod ;
         n840TrnCod = false ;
         A11103Nof_Hdr = AV18Barcod ;
         A11104Nof_r = AV19Barcodreo ;
         A11105Nof_p = AV20Barcodpar ;
         A11405Nof_humeda = DecimalUtil.doubleToDec(A11387Bros_humed) ;
         n11405Nof_humeda = false ;
         A11710Nof_enc = A11704Bros_enc ;
         n11710Nof_enc = false ;
         A11709Nof_nc = A11703Bros_nc ;
         n11709Nof_nc = false ;
         A11107Nof_Mcot = A10979Bros_Mcot ;
         n11107Nof_Mcot = false ;
         A11106Nof_Pd = A10980Bros_Pd ;
         n11106Nof_Pd = false ;
         A11108Nof_Pp = A10981Bros_Pp ;
         n11108Nof_Pp = false ;
         A11109Nof_Ag = A10982Bros_Ag ;
         n11109Nof_Ag = false ;
         n840TrnCod = false ;
         A11110Nof_c1 = A10983Bros_c1 ;
         n11110Nof_c1 = false ;
         A11111Nof_c2 = A10984Bros_c2 ;
         n11111Nof_c2 = false ;
         A11112Nof_bo = A10985Bros_bo ;
         n11112Nof_bo = false ;
         A11113Nof_bob = A10986Bros_bob ;
         n11113Nof_bob = false ;
         A11114Nof_boe = A10987Bros_boe ;
         n11114Nof_boe = false ;
         A11115Nof_Bov = A10988BrosBov ;
         n11115Nof_Bov = false ;
         A11116Nof_c3 = A10989Bros_c3 ;
         n11116Nof_c3 = false ;
         A11117Nof_tns = A10990Bros_tns ;
         n11117Nof_tns = false ;
         A11118Nof_tnc = A10991Bros_tnc ;
         n11118Nof_tnc = false ;
         A11119Nof_c4 = A10992Bros_c4 ;
         n11119Nof_c4 = false ;
         A11120Nof_ct = A10993Bros_ct ;
         n11120Nof_ct = false ;
         A11121Nof_c5 = A10994Bros_c5 ;
         n11121Nof_c5 = false ;
         A11122Nof_scs = A10995Bros_scs ;
         n11122Nof_scs = false ;
         A11123Nof_scc = A10996Bros_scc ;
         n11123Nof_scc = false ;
         A11124Nof_c6 = A10997Bros_c6 ;
         n11124Nof_c6 = false ;
         A11125Nof_cctse = A10998Bros_cctse ;
         n11125Nof_cctse = false ;
         A11126Nof_ccttp = A10999Bros_ccttp ;
         n11126Nof_ccttp = false ;
         A11127Nof_cctet = A11000Bros_cctet ;
         n11127Nof_cctet = false ;
         A11128Nof_ccp = A11001Bros_ccp ;
         n11128Nof_ccp = false ;
         A11129Nof_cct = A11002Bros_cct ;
         n11129Nof_cct = false ;
         A11130Nof_ccpc = A11003Bros_ccpc ;
         n11130Nof_ccpc = false ;
         A11131Nof_cctq = A11004Bros_cctq ;
         n11131Nof_cctq = false ;
         A11132Nof_cccc = A11005Bros_cccc ;
         n11132Nof_cccc = false ;
         A11133Nof_ccec = A11006Bros_ccec ;
         n11133Nof_ccec = false ;
         A11134Nof_ccmc1 = A11008Bros_ccmc1 ;
         n11134Nof_ccmc1 = false ;
         A11135Nof_ccmc2 = A11009Bros_ccmc2 ;
         n11135Nof_ccmc2 = false ;
         A11136Nof_ccmc3 = A11010Bros_ccmc3 ;
         n11136Nof_ccmc3 = false ;
         A11137Nof_ccmc4 = A11011Bros_ccmc4 ;
         n11137Nof_ccmc4 = false ;
         A11138Nof_ccmc5 = A11012Bros_ccmc5 ;
         n11138Nof_ccmc5 = false ;
         A11139Nof_ccmc6 = A11013Bros_ccmc6 ;
         n11139Nof_ccmc6 = false ;
         A11140Nof_c7 = A11014Bros_c7 ;
         n11140Nof_c7 = false ;
         A11141Nof_rb = A11015Bros_rb ;
         n11141Nof_rb = false ;
         A11142Nof_rbi = A11016Bros_rbi ;
         n11142Nof_rbi = false ;
         A11143Nof_rbe = A11017Bros_rbe ;
         n11143Nof_rbe = false ;
         A11144Nof_rbp = A11018Bros_rbp ;
         n11144Nof_rbp = false ;
         A11145Nof_rboc = A11019Bros_rboc ;
         n11145Nof_rboc = false ;
         A11146Nof_rb1 = A11020Bros_rb1 ;
         n11146Nof_rb1 = false ;
         A11147Nof_rb3 = A11021Bros_rb3 ;
         n11147Nof_rb3 = false ;
         A11148Nof_c8 = A11022Bros_c8 ;
         n11148Nof_c8 = false ;
         A11149Nof_ep1 = A11023Bros_ep1 ;
         n11149Nof_ep1 = false ;
         A11150Nof_ep2 = A11024Bros_ep2 ;
         n11150Nof_ep2 = false ;
         A11151Nof_ep3 = A11025Bros_ep3 ;
         n11151Nof_ep3 = false ;
         A11152Nof_ep4 = A11026Bros_ep4 ;
         n11152Nof_ep4 = false ;
         A11153Nof_ep5 = A11027Bros_ep5 ;
         n11153Nof_ep5 = false ;
         A11154Nof_ep6 = A11028Bros_ep6 ;
         n11154Nof_ep6 = false ;
         A11155Nof_ep7 = A11029Bros_ep7 ;
         n11155Nof_ep7 = false ;
         A11156Nof_ep8 = A11030Bros_ep8 ;
         n11156Nof_ep8 = false ;
         A11157Nof_ep9 = A11031Bros_ep9 ;
         n11157Nof_ep9 = false ;
         A11158Nof_ep10 = A11032Bros_ep10 ;
         n11158Nof_ep10 = false ;
         A11159Nof_c9 = A11033Bros_c9 ;
         n11159Nof_c9 = false ;
         A11160Nof_sa1 = A11034Bros_sa1 ;
         n11160Nof_sa1 = false ;
         A11161Nof_sa2 = A11035Bros_sa2 ;
         n11161Nof_sa2 = false ;
         A11162Nof_sa3 = A11036Bros_sa3 ;
         n11162Nof_sa3 = false ;
         A11163Nof_sa4 = A11037Bros_sa4 ;
         n11163Nof_sa4 = false ;
         A11164Nof_sa5 = A11038Bros_sa5 ;
         n11164Nof_sa5 = false ;
         A11165Nof_sa6 = A11039Bros_sa6 ;
         n11165Nof_sa6 = false ;
         A11166Nof_c10 = A11040Bros_c10 ;
         n11166Nof_c10 = false ;
         A11170Nof_c11 = A11069Bros_c11 ;
         n11170Nof_c11 = false ;
         A11171Nof_c12 = A11070Bros_c12 ;
         n11171Nof_c12 = false ;
         A11167Nof_stk = A11066Bros_stk ;
         n11167Nof_stk = false ;
         A11168Nof_Lbta = A11067Bros_Lbta ;
         n11168Nof_Lbta = false ;
         A11169Nof_Lbtp = A11068Bros_Lbtp ;
         n11169Nof_Lbtp = false ;
         A11388Nof_imp1 = A11369Bros_imp1 ;
         n11388Nof_imp1 = false ;
         A11389Nof_imp2 = A11370Bros_imp2 ;
         n11389Nof_imp2 = false ;
         A11390Nof_imp3 = A11371Bros_imp3 ;
         n11390Nof_imp3 = false ;
         A11391Nof_imp4 = A11372Bros_imp4 ;
         n11391Nof_imp4 = false ;
         A11392Nof_imp5 = A11373Bros_imp5 ;
         n11392Nof_imp5 = false ;
         A11393Nof_imp6 = A11374Bros_imp6 ;
         n11393Nof_imp6 = false ;
         A11394Nof_imp7 = A11375Bros_imp7 ;
         n11394Nof_imp7 = false ;
         A11395Nof_imp8 = A11376Bros_imp8 ;
         n11395Nof_imp8 = false ;
         A11396Nof_imp9 = A11377Bros_imp9 ;
         n11396Nof_imp9 = false ;
         A11397Nof_imp10 = A11378Bros_imp10 ;
         n11397Nof_imp10 = false ;
         A11398Nof_imp11 = A11379Bros_imp11 ;
         n11398Nof_imp11 = false ;
         A11399Nof_lavado = A11381Bros_lavad ;
         n11399Nof_lavado = false ;
         A11400Nof_luz = A11382Bros_luz ;
         n11400Nof_luz = false ;
         A11401Nof_sudor = A11383Bros_sudor ;
         n11401Nof_sudor = false ;
         A11402Nof_cloro = A11384Bros_cloro ;
         n11402Nof_cloro = false ;
         A11403Nof_aguam = A11385Bros_aguam ;
         n11403Nof_aguam = false ;
         A11404Nof_termom = A11386Bros_termo ;
         n11404Nof_termom = false ;
         A11406Nof_oekote = A11380Bros_oekot ;
         n11406Nof_oekote = false ;
         A11418Nof_obs1 = A11407Bros_obs1 ;
         n11418Nof_obs1 = false ;
         A11419Nof_obs2 = A11408Bros_obs2 ;
         n11419Nof_obs2 = false ;
         A11420Nof_obs3 = A11409Bros_obs3 ;
         n11420Nof_obs3 = false ;
         A11421Nof_obs4 = A11410Bros_obs4 ;
         n11421Nof_obs4 = false ;
         A11422Nof_obs5 = A11411Bros_obs5 ;
         n11422Nof_obs5 = false ;
         A11423Nof_obs6 = A11412Bros_obs6 ;
         n11423Nof_obs6 = false ;
         A11424Nof_obs7 = A11413Bros_obs7 ;
         n11424Nof_obs7 = false ;
         A11425Nof_obs8 = A11414Bros_obs8 ;
         n11425Nof_obs8 = false ;
         A11426Nof_obs9 = A11415Bros_obs9 ;
         n11426Nof_obs9 = false ;
         A11427Nof_obs10 = A11416Bros_obs10 ;
         n11427Nof_obs10 = false ;
         A11428Nof_obs11 = A11417Bros_obs11 ;
         n11428Nof_obs11 = false ;
         /* Using cursor P04CJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p, Boolean.valueOf(n11106Nof_Pd), A11106Nof_Pd, Boolean.valueOf(n11107Nof_Mcot), A11107Nof_Mcot, Boolean.valueOf(n11108Nof_Pp), A11108Nof_Pp, Boolean.valueOf(n11109Nof_Ag), A11109Nof_Ag, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n11110Nof_c1), A11110Nof_c1, Boolean.valueOf(n11111Nof_c2), A11111Nof_c2, Boolean.valueOf(n11112Nof_bo), A11112Nof_bo, Boolean.valueOf(n11113Nof_bob), A11113Nof_bob, Boolean.valueOf(n11114Nof_boe), A11114Nof_boe, Boolean.valueOf(n11115Nof_Bov), A11115Nof_Bov, Boolean.valueOf(n11116Nof_c3), A11116Nof_c3, Boolean.valueOf(n11117Nof_tns), A11117Nof_tns, Boolean.valueOf(n11118Nof_tnc), A11118Nof_tnc, Boolean.valueOf(n11119Nof_c4), A11119Nof_c4, Boolean.valueOf(n11120Nof_ct), A11120Nof_ct, Boolean.valueOf(n11121Nof_c5), A11121Nof_c5, Boolean.valueOf(n11122Nof_scs), A11122Nof_scs, Boolean.valueOf(n11123Nof_scc), A11123Nof_scc, Boolean.valueOf(n11124Nof_c6), A11124Nof_c6, Boolean.valueOf(n11125Nof_cctse), A11125Nof_cctse, Boolean.valueOf(n11126Nof_ccttp), A11126Nof_ccttp, Boolean.valueOf(n11127Nof_cctet), A11127Nof_cctet, Boolean.valueOf(n11128Nof_ccp), Byte.valueOf(A11128Nof_ccp), Boolean.valueOf(n11129Nof_cct), Byte.valueOf(A11129Nof_cct), Boolean.valueOf(n11130Nof_ccpc), A11130Nof_ccpc, Boolean.valueOf(n11131Nof_cctq), A11131Nof_cctq, Boolean.valueOf(n11132Nof_cccc), A11132Nof_cccc, Boolean.valueOf(n11133Nof_ccec), A11133Nof_ccec, Boolean.valueOf(n11134Nof_ccmc1), A11134Nof_ccmc1, Boolean.valueOf(n11135Nof_ccmc2), A11135Nof_ccmc2, Boolean.valueOf(n11136Nof_ccmc3), A11136Nof_ccmc3, Boolean.valueOf(n11137Nof_ccmc4), A11137Nof_ccmc4, Boolean.valueOf(n11138Nof_ccmc5), A11138Nof_ccmc5, Boolean.valueOf(n11139Nof_ccmc6), A11139Nof_ccmc6, Boolean.valueOf(n11140Nof_c7), A11140Nof_c7, Boolean.valueOf(n11141Nof_rb), A11141Nof_rb, Boolean.valueOf(n11142Nof_rbi), A11142Nof_rbi, Boolean.valueOf(n11143Nof_rbe), A11143Nof_rbe, Boolean.valueOf(n11144Nof_rbp), A11144Nof_rbp, Boolean.valueOf(n11145Nof_rboc), Short.valueOf(A11145Nof_rboc), Boolean.valueOf(n11146Nof_rb1), A11146Nof_rb1, Boolean.valueOf(n11147Nof_rb3), A11147Nof_rb3, Boolean.valueOf(n11148Nof_c8), A11148Nof_c8, Boolean.valueOf(n11149Nof_ep1), A11149Nof_ep1, Boolean.valueOf(n11150Nof_ep2), A11150Nof_ep2, Boolean.valueOf(n11151Nof_ep3), A11151Nof_ep3, Boolean.valueOf(n11152Nof_ep4), A11152Nof_ep4, Boolean.valueOf(n11153Nof_ep5), A11153Nof_ep5, Boolean.valueOf(n11154Nof_ep6), A11154Nof_ep6, Boolean.valueOf(n11155Nof_ep7), A11155Nof_ep7, Boolean.valueOf(n11156Nof_ep8), A11156Nof_ep8, Boolean.valueOf(n11157Nof_ep9), A11157Nof_ep9, Boolean.valueOf(n11158Nof_ep10), A11158Nof_ep10, Boolean.valueOf(n11159Nof_c9), A11159Nof_c9, Boolean.valueOf(n11160Nof_sa1), A11160Nof_sa1, Boolean.valueOf(n11161Nof_sa2), A11161Nof_sa2, Boolean.valueOf(n11162Nof_sa3), A11162Nof_sa3, Boolean.valueOf(n11163Nof_sa4), A11163Nof_sa4,
         Boolean.valueOf(n11164Nof_sa5), A11164Nof_sa5, Boolean.valueOf(n11165Nof_sa6), A11165Nof_sa6, Boolean.valueOf(n11166Nof_c10), A11166Nof_c10, Boolean.valueOf(n11167Nof_stk), A11167Nof_stk, Boolean.valueOf(n11168Nof_Lbta), A11168Nof_Lbta, Boolean.valueOf(n11169Nof_Lbtp), Short.valueOf(A11169Nof_Lbtp), Boolean.valueOf(n11170Nof_c11), A11170Nof_c11, Boolean.valueOf(n11171Nof_c12), A11171Nof_c12, Boolean.valueOf(n11388Nof_imp1), A11388Nof_imp1, Boolean.valueOf(n11389Nof_imp2), A11389Nof_imp2, Boolean.valueOf(n11390Nof_imp3), A11390Nof_imp3, Boolean.valueOf(n11391Nof_imp4), A11391Nof_imp4, Boolean.valueOf(n11392Nof_imp5), A11392Nof_imp5, Boolean.valueOf(n11393Nof_imp6), A11393Nof_imp6, Boolean.valueOf(n11394Nof_imp7), A11394Nof_imp7, Boolean.valueOf(n11395Nof_imp8), A11395Nof_imp8, Boolean.valueOf(n11396Nof_imp9), A11396Nof_imp9, Boolean.valueOf(n11397Nof_imp10), A11397Nof_imp10, Boolean.valueOf(n11398Nof_imp11), A11398Nof_imp11, Boolean.valueOf(n11399Nof_lavado), A11399Nof_lavado, Boolean.valueOf(n11400Nof_luz), A11400Nof_luz, Boolean.valueOf(n11401Nof_sudor), A11401Nof_sudor, Boolean.valueOf(n11402Nof_cloro), A11402Nof_cloro, Boolean.valueOf(n11403Nof_aguam), A11403Nof_aguam, Boolean.valueOf(n11404Nof_termom), A11404Nof_termom, Boolean.valueOf(n11405Nof_humeda), A11405Nof_humeda, Boolean.valueOf(n11406Nof_oekote), A11406Nof_oekote, Boolean.valueOf(n11418Nof_obs1), A11418Nof_obs1, Boolean.valueOf(n11419Nof_obs2), A11419Nof_obs2, Boolean.valueOf(n11420Nof_obs3), A11420Nof_obs3, Boolean.valueOf(n11421Nof_obs4), A11421Nof_obs4, Boolean.valueOf(n11422Nof_obs5), A11422Nof_obs5, Boolean.valueOf(n11423Nof_obs6), A11423Nof_obs6, Boolean.valueOf(n11424Nof_obs7), A11424Nof_obs7, Boolean.valueOf(n11425Nof_obs8), A11425Nof_obs8, Boolean.valueOf(n11426Nof_obs9), A11426Nof_obs9, Boolean.valueOf(n11427Nof_obs10), A11427Nof_obs10, Boolean.valueOf(n11428Nof_obs11), A11428Nof_obs11, Boolean.valueOf(n11709Nof_nc), Byte.valueOf(A11709Nof_nc), Boolean.valueOf(n11710Nof_enc), A11710Nof_enc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOFART");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A840TrnCod = W840TrnCod ;
         n840TrnCod = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV23GXLvl3 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. NO hay Informacion Ficha Articulo¡¡¡", "") ;
         System.out.println( Gx_msg );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnofart.this.A396EmprCod;
      this.aP1[0] = pnofart.this.AV16Clicod;
      this.aP2[0] = pnofart.this.AV17ARtCod;
      this.aP3[0] = pnofart.this.AV18Barcod;
      this.aP4[0] = pnofart.this.AV19Barcodreo;
      this.aP5[0] = pnofart.this.AV20Barcodpar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnofart");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04CJ2_A10978Bros_Art = new String[] {""} ;
      P04CJ2_A252CliCod = new int[1] ;
      P04CJ2_A396EmprCod = new String[] {""} ;
      P04CJ2_A11387Bros_humed = new byte[1] ;
      P04CJ2_n11387Bros_humed = new boolean[] {false} ;
      P04CJ2_A11704Bros_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04CJ2_n11704Bros_enc = new boolean[] {false} ;
      P04CJ2_A11703Bros_nc = new byte[1] ;
      P04CJ2_n11703Bros_nc = new boolean[] {false} ;
      P04CJ2_A10979Bros_Mcot = new String[] {""} ;
      P04CJ2_n10979Bros_Mcot = new boolean[] {false} ;
      P04CJ2_A10980Bros_Pd = new String[] {""} ;
      P04CJ2_n10980Bros_Pd = new boolean[] {false} ;
      P04CJ2_A10981Bros_Pp = new String[] {""} ;
      P04CJ2_n10981Bros_Pp = new boolean[] {false} ;
      P04CJ2_A10982Bros_Ag = new String[] {""} ;
      P04CJ2_n10982Bros_Ag = new boolean[] {false} ;
      P04CJ2_A10983Bros_c1 = new String[] {""} ;
      P04CJ2_n10983Bros_c1 = new boolean[] {false} ;
      P04CJ2_A10984Bros_c2 = new String[] {""} ;
      P04CJ2_n10984Bros_c2 = new boolean[] {false} ;
      P04CJ2_A10985Bros_bo = new String[] {""} ;
      P04CJ2_n10985Bros_bo = new boolean[] {false} ;
      P04CJ2_A10986Bros_bob = new String[] {""} ;
      P04CJ2_n10986Bros_bob = new boolean[] {false} ;
      P04CJ2_A10987Bros_boe = new String[] {""} ;
      P04CJ2_n10987Bros_boe = new boolean[] {false} ;
      P04CJ2_A10988BrosBov = new String[] {""} ;
      P04CJ2_n10988BrosBov = new boolean[] {false} ;
      P04CJ2_A10989Bros_c3 = new String[] {""} ;
      P04CJ2_n10989Bros_c3 = new boolean[] {false} ;
      P04CJ2_A10990Bros_tns = new String[] {""} ;
      P04CJ2_n10990Bros_tns = new boolean[] {false} ;
      P04CJ2_A10991Bros_tnc = new String[] {""} ;
      P04CJ2_n10991Bros_tnc = new boolean[] {false} ;
      P04CJ2_A10992Bros_c4 = new String[] {""} ;
      P04CJ2_n10992Bros_c4 = new boolean[] {false} ;
      P04CJ2_A10993Bros_ct = new String[] {""} ;
      P04CJ2_n10993Bros_ct = new boolean[] {false} ;
      P04CJ2_A10994Bros_c5 = new String[] {""} ;
      P04CJ2_n10994Bros_c5 = new boolean[] {false} ;
      P04CJ2_A10995Bros_scs = new String[] {""} ;
      P04CJ2_n10995Bros_scs = new boolean[] {false} ;
      P04CJ2_A10996Bros_scc = new String[] {""} ;
      P04CJ2_n10996Bros_scc = new boolean[] {false} ;
      P04CJ2_A10997Bros_c6 = new String[] {""} ;
      P04CJ2_n10997Bros_c6 = new boolean[] {false} ;
      P04CJ2_A10998Bros_cctse = new String[] {""} ;
      P04CJ2_n10998Bros_cctse = new boolean[] {false} ;
      P04CJ2_A10999Bros_ccttp = new String[] {""} ;
      P04CJ2_n10999Bros_ccttp = new boolean[] {false} ;
      P04CJ2_A11000Bros_cctet = new String[] {""} ;
      P04CJ2_n11000Bros_cctet = new boolean[] {false} ;
      P04CJ2_A11001Bros_ccp = new byte[1] ;
      P04CJ2_n11001Bros_ccp = new boolean[] {false} ;
      P04CJ2_A11002Bros_cct = new byte[1] ;
      P04CJ2_n11002Bros_cct = new boolean[] {false} ;
      P04CJ2_A11003Bros_ccpc = new String[] {""} ;
      P04CJ2_n11003Bros_ccpc = new boolean[] {false} ;
      P04CJ2_A11004Bros_cctq = new String[] {""} ;
      P04CJ2_n11004Bros_cctq = new boolean[] {false} ;
      P04CJ2_A11005Bros_cccc = new String[] {""} ;
      P04CJ2_n11005Bros_cccc = new boolean[] {false} ;
      P04CJ2_A11006Bros_ccec = new String[] {""} ;
      P04CJ2_n11006Bros_ccec = new boolean[] {false} ;
      P04CJ2_A11008Bros_ccmc1 = new String[] {""} ;
      P04CJ2_n11008Bros_ccmc1 = new boolean[] {false} ;
      P04CJ2_A11009Bros_ccmc2 = new String[] {""} ;
      P04CJ2_n11009Bros_ccmc2 = new boolean[] {false} ;
      P04CJ2_A11010Bros_ccmc3 = new String[] {""} ;
      P04CJ2_n11010Bros_ccmc3 = new boolean[] {false} ;
      P04CJ2_A11011Bros_ccmc4 = new String[] {""} ;
      P04CJ2_n11011Bros_ccmc4 = new boolean[] {false} ;
      P04CJ2_A11012Bros_ccmc5 = new String[] {""} ;
      P04CJ2_n11012Bros_ccmc5 = new boolean[] {false} ;
      P04CJ2_A11013Bros_ccmc6 = new String[] {""} ;
      P04CJ2_n11013Bros_ccmc6 = new boolean[] {false} ;
      P04CJ2_A11014Bros_c7 = new String[] {""} ;
      P04CJ2_n11014Bros_c7 = new boolean[] {false} ;
      P04CJ2_A11015Bros_rb = new String[] {""} ;
      P04CJ2_n11015Bros_rb = new boolean[] {false} ;
      P04CJ2_A11016Bros_rbi = new String[] {""} ;
      P04CJ2_n11016Bros_rbi = new boolean[] {false} ;
      P04CJ2_A11017Bros_rbe = new String[] {""} ;
      P04CJ2_n11017Bros_rbe = new boolean[] {false} ;
      P04CJ2_A11018Bros_rbp = new String[] {""} ;
      P04CJ2_n11018Bros_rbp = new boolean[] {false} ;
      P04CJ2_A11019Bros_rboc = new short[1] ;
      P04CJ2_n11019Bros_rboc = new boolean[] {false} ;
      P04CJ2_A11020Bros_rb1 = new String[] {""} ;
      P04CJ2_n11020Bros_rb1 = new boolean[] {false} ;
      P04CJ2_A11021Bros_rb3 = new String[] {""} ;
      P04CJ2_n11021Bros_rb3 = new boolean[] {false} ;
      P04CJ2_A11022Bros_c8 = new String[] {""} ;
      P04CJ2_n11022Bros_c8 = new boolean[] {false} ;
      P04CJ2_A11023Bros_ep1 = new String[] {""} ;
      P04CJ2_n11023Bros_ep1 = new boolean[] {false} ;
      P04CJ2_A11024Bros_ep2 = new String[] {""} ;
      P04CJ2_n11024Bros_ep2 = new boolean[] {false} ;
      P04CJ2_A11025Bros_ep3 = new String[] {""} ;
      P04CJ2_n11025Bros_ep3 = new boolean[] {false} ;
      P04CJ2_A11026Bros_ep4 = new String[] {""} ;
      P04CJ2_n11026Bros_ep4 = new boolean[] {false} ;
      P04CJ2_A11027Bros_ep5 = new String[] {""} ;
      P04CJ2_n11027Bros_ep5 = new boolean[] {false} ;
      P04CJ2_A11028Bros_ep6 = new String[] {""} ;
      P04CJ2_n11028Bros_ep6 = new boolean[] {false} ;
      P04CJ2_A11029Bros_ep7 = new String[] {""} ;
      P04CJ2_n11029Bros_ep7 = new boolean[] {false} ;
      P04CJ2_A11030Bros_ep8 = new String[] {""} ;
      P04CJ2_n11030Bros_ep8 = new boolean[] {false} ;
      P04CJ2_A11031Bros_ep9 = new String[] {""} ;
      P04CJ2_n11031Bros_ep9 = new boolean[] {false} ;
      P04CJ2_A11032Bros_ep10 = new String[] {""} ;
      P04CJ2_n11032Bros_ep10 = new boolean[] {false} ;
      P04CJ2_A11033Bros_c9 = new String[] {""} ;
      P04CJ2_n11033Bros_c9 = new boolean[] {false} ;
      P04CJ2_A11034Bros_sa1 = new String[] {""} ;
      P04CJ2_n11034Bros_sa1 = new boolean[] {false} ;
      P04CJ2_A11035Bros_sa2 = new String[] {""} ;
      P04CJ2_n11035Bros_sa2 = new boolean[] {false} ;
      P04CJ2_A11036Bros_sa3 = new String[] {""} ;
      P04CJ2_n11036Bros_sa3 = new boolean[] {false} ;
      P04CJ2_A11037Bros_sa4 = new String[] {""} ;
      P04CJ2_n11037Bros_sa4 = new boolean[] {false} ;
      P04CJ2_A11038Bros_sa5 = new String[] {""} ;
      P04CJ2_n11038Bros_sa5 = new boolean[] {false} ;
      P04CJ2_A11039Bros_sa6 = new String[] {""} ;
      P04CJ2_n11039Bros_sa6 = new boolean[] {false} ;
      P04CJ2_A11040Bros_c10 = new String[] {""} ;
      P04CJ2_n11040Bros_c10 = new boolean[] {false} ;
      P04CJ2_A11069Bros_c11 = new String[] {""} ;
      P04CJ2_n11069Bros_c11 = new boolean[] {false} ;
      P04CJ2_A11070Bros_c12 = new String[] {""} ;
      P04CJ2_n11070Bros_c12 = new boolean[] {false} ;
      P04CJ2_A11066Bros_stk = new String[] {""} ;
      P04CJ2_n11066Bros_stk = new boolean[] {false} ;
      P04CJ2_A11067Bros_Lbta = new String[] {""} ;
      P04CJ2_n11067Bros_Lbta = new boolean[] {false} ;
      P04CJ2_A11068Bros_Lbtp = new short[1] ;
      P04CJ2_n11068Bros_Lbtp = new boolean[] {false} ;
      P04CJ2_A11369Bros_imp1 = new String[] {""} ;
      P04CJ2_n11369Bros_imp1 = new boolean[] {false} ;
      P04CJ2_A11370Bros_imp2 = new String[] {""} ;
      P04CJ2_n11370Bros_imp2 = new boolean[] {false} ;
      P04CJ2_A11371Bros_imp3 = new String[] {""} ;
      P04CJ2_n11371Bros_imp3 = new boolean[] {false} ;
      P04CJ2_A11372Bros_imp4 = new String[] {""} ;
      P04CJ2_n11372Bros_imp4 = new boolean[] {false} ;
      P04CJ2_A11373Bros_imp5 = new String[] {""} ;
      P04CJ2_n11373Bros_imp5 = new boolean[] {false} ;
      P04CJ2_A11374Bros_imp6 = new String[] {""} ;
      P04CJ2_n11374Bros_imp6 = new boolean[] {false} ;
      P04CJ2_A11375Bros_imp7 = new String[] {""} ;
      P04CJ2_n11375Bros_imp7 = new boolean[] {false} ;
      P04CJ2_A11376Bros_imp8 = new String[] {""} ;
      P04CJ2_n11376Bros_imp8 = new boolean[] {false} ;
      P04CJ2_A11377Bros_imp9 = new String[] {""} ;
      P04CJ2_n11377Bros_imp9 = new boolean[] {false} ;
      P04CJ2_A11378Bros_imp10 = new String[] {""} ;
      P04CJ2_n11378Bros_imp10 = new boolean[] {false} ;
      P04CJ2_A11379Bros_imp11 = new String[] {""} ;
      P04CJ2_n11379Bros_imp11 = new boolean[] {false} ;
      P04CJ2_A11381Bros_lavad = new String[] {""} ;
      P04CJ2_n11381Bros_lavad = new boolean[] {false} ;
      P04CJ2_A11382Bros_luz = new String[] {""} ;
      P04CJ2_n11382Bros_luz = new boolean[] {false} ;
      P04CJ2_A11383Bros_sudor = new String[] {""} ;
      P04CJ2_n11383Bros_sudor = new boolean[] {false} ;
      P04CJ2_A11384Bros_cloro = new String[] {""} ;
      P04CJ2_n11384Bros_cloro = new boolean[] {false} ;
      P04CJ2_A11385Bros_aguam = new String[] {""} ;
      P04CJ2_n11385Bros_aguam = new boolean[] {false} ;
      P04CJ2_A11386Bros_termo = new String[] {""} ;
      P04CJ2_n11386Bros_termo = new boolean[] {false} ;
      P04CJ2_A11380Bros_oekot = new String[] {""} ;
      P04CJ2_n11380Bros_oekot = new boolean[] {false} ;
      P04CJ2_A11407Bros_obs1 = new String[] {""} ;
      P04CJ2_n11407Bros_obs1 = new boolean[] {false} ;
      P04CJ2_A11408Bros_obs2 = new String[] {""} ;
      P04CJ2_n11408Bros_obs2 = new boolean[] {false} ;
      P04CJ2_A11409Bros_obs3 = new String[] {""} ;
      P04CJ2_n11409Bros_obs3 = new boolean[] {false} ;
      P04CJ2_A11410Bros_obs4 = new String[] {""} ;
      P04CJ2_n11410Bros_obs4 = new boolean[] {false} ;
      P04CJ2_A11411Bros_obs5 = new String[] {""} ;
      P04CJ2_n11411Bros_obs5 = new boolean[] {false} ;
      P04CJ2_A11412Bros_obs6 = new String[] {""} ;
      P04CJ2_n11412Bros_obs6 = new boolean[] {false} ;
      P04CJ2_A11413Bros_obs7 = new String[] {""} ;
      P04CJ2_n11413Bros_obs7 = new boolean[] {false} ;
      P04CJ2_A11414Bros_obs8 = new String[] {""} ;
      P04CJ2_n11414Bros_obs8 = new boolean[] {false} ;
      P04CJ2_A11415Bros_obs9 = new String[] {""} ;
      P04CJ2_n11415Bros_obs9 = new boolean[] {false} ;
      P04CJ2_A11416Bros_obs10 = new String[] {""} ;
      P04CJ2_n11416Bros_obs10 = new boolean[] {false} ;
      P04CJ2_A11417Bros_obs11 = new String[] {""} ;
      P04CJ2_n11417Bros_obs11 = new boolean[] {false} ;
      P04CJ2_A840TrnCod = new short[1] ;
      P04CJ2_n840TrnCod = new boolean[] {false} ;
      A10978Bros_Art = "" ;
      A11704Bros_enc = DecimalUtil.ZERO ;
      A10979Bros_Mcot = "" ;
      A10980Bros_Pd = "" ;
      A10981Bros_Pp = "" ;
      A10982Bros_Ag = "" ;
      A10983Bros_c1 = "" ;
      A10984Bros_c2 = "" ;
      A10985Bros_bo = "" ;
      A10986Bros_bob = "" ;
      A10987Bros_boe = "" ;
      A10988BrosBov = "" ;
      A10989Bros_c3 = "" ;
      A10990Bros_tns = "" ;
      A10991Bros_tnc = "" ;
      A10992Bros_c4 = "" ;
      A10993Bros_ct = "" ;
      A10994Bros_c5 = "" ;
      A10995Bros_scs = "" ;
      A10996Bros_scc = "" ;
      A10997Bros_c6 = "" ;
      A10998Bros_cctse = "" ;
      A10999Bros_ccttp = "" ;
      A11000Bros_cctet = "" ;
      A11003Bros_ccpc = "" ;
      A11004Bros_cctq = "" ;
      A11005Bros_cccc = "" ;
      A11006Bros_ccec = "" ;
      A11008Bros_ccmc1 = "" ;
      A11009Bros_ccmc2 = "" ;
      A11010Bros_ccmc3 = "" ;
      A11011Bros_ccmc4 = "" ;
      A11012Bros_ccmc5 = "" ;
      A11013Bros_ccmc6 = "" ;
      A11014Bros_c7 = "" ;
      A11015Bros_rb = "" ;
      A11016Bros_rbi = "" ;
      A11017Bros_rbe = "" ;
      A11018Bros_rbp = "" ;
      A11020Bros_rb1 = "" ;
      A11021Bros_rb3 = "" ;
      A11022Bros_c8 = "" ;
      A11023Bros_ep1 = "" ;
      A11024Bros_ep2 = "" ;
      A11025Bros_ep3 = "" ;
      A11026Bros_ep4 = "" ;
      A11027Bros_ep5 = "" ;
      A11028Bros_ep6 = "" ;
      A11029Bros_ep7 = "" ;
      A11030Bros_ep8 = "" ;
      A11031Bros_ep9 = "" ;
      A11032Bros_ep10 = "" ;
      A11033Bros_c9 = "" ;
      A11034Bros_sa1 = "" ;
      A11035Bros_sa2 = "" ;
      A11036Bros_sa3 = "" ;
      A11037Bros_sa4 = "" ;
      A11038Bros_sa5 = "" ;
      A11039Bros_sa6 = "" ;
      A11040Bros_c10 = "" ;
      A11069Bros_c11 = "" ;
      A11070Bros_c12 = "" ;
      A11066Bros_stk = "" ;
      A11067Bros_Lbta = "" ;
      A11369Bros_imp1 = "" ;
      A11370Bros_imp2 = "" ;
      A11371Bros_imp3 = "" ;
      A11372Bros_imp4 = "" ;
      A11373Bros_imp5 = "" ;
      A11374Bros_imp6 = "" ;
      A11375Bros_imp7 = "" ;
      A11376Bros_imp8 = "" ;
      A11377Bros_imp9 = "" ;
      A11378Bros_imp10 = "" ;
      A11379Bros_imp11 = "" ;
      A11381Bros_lavad = "" ;
      A11382Bros_luz = "" ;
      A11383Bros_sudor = "" ;
      A11384Bros_cloro = "" ;
      A11385Bros_aguam = "" ;
      A11386Bros_termo = "" ;
      A11380Bros_oekot = "" ;
      A11407Bros_obs1 = "" ;
      A11408Bros_obs2 = "" ;
      A11409Bros_obs3 = "" ;
      A11410Bros_obs4 = "" ;
      A11411Bros_obs5 = "" ;
      A11412Bros_obs6 = "" ;
      A11413Bros_obs7 = "" ;
      A11414Bros_obs8 = "" ;
      A11415Bros_obs9 = "" ;
      A11416Bros_obs10 = "" ;
      A11417Bros_obs11 = "" ;
      W396EmprCod = "" ;
      A11105Nof_p = "" ;
      A11405Nof_humeda = DecimalUtil.ZERO ;
      A11710Nof_enc = DecimalUtil.ZERO ;
      A11107Nof_Mcot = "" ;
      A11106Nof_Pd = "" ;
      A11108Nof_Pp = "" ;
      A11109Nof_Ag = "" ;
      A11110Nof_c1 = "" ;
      A11111Nof_c2 = "" ;
      A11112Nof_bo = "" ;
      A11113Nof_bob = "" ;
      A11114Nof_boe = "" ;
      A11115Nof_Bov = "" ;
      A11116Nof_c3 = "" ;
      A11117Nof_tns = "" ;
      A11118Nof_tnc = "" ;
      A11119Nof_c4 = "" ;
      A11120Nof_ct = "" ;
      A11121Nof_c5 = "" ;
      A11122Nof_scs = "" ;
      A11123Nof_scc = "" ;
      A11124Nof_c6 = "" ;
      A11125Nof_cctse = "" ;
      A11126Nof_ccttp = "" ;
      A11127Nof_cctet = "" ;
      A11130Nof_ccpc = "" ;
      A11131Nof_cctq = "" ;
      A11132Nof_cccc = "" ;
      A11133Nof_ccec = "" ;
      A11134Nof_ccmc1 = "" ;
      A11135Nof_ccmc2 = "" ;
      A11136Nof_ccmc3 = "" ;
      A11137Nof_ccmc4 = "" ;
      A11138Nof_ccmc5 = "" ;
      A11139Nof_ccmc6 = "" ;
      A11140Nof_c7 = "" ;
      A11141Nof_rb = "" ;
      A11142Nof_rbi = "" ;
      A11143Nof_rbe = "" ;
      A11144Nof_rbp = "" ;
      A11146Nof_rb1 = "" ;
      A11147Nof_rb3 = "" ;
      A11148Nof_c8 = "" ;
      A11149Nof_ep1 = "" ;
      A11150Nof_ep2 = "" ;
      A11151Nof_ep3 = "" ;
      A11152Nof_ep4 = "" ;
      A11153Nof_ep5 = "" ;
      A11154Nof_ep6 = "" ;
      A11155Nof_ep7 = "" ;
      A11156Nof_ep8 = "" ;
      A11157Nof_ep9 = "" ;
      A11158Nof_ep10 = "" ;
      A11159Nof_c9 = "" ;
      A11160Nof_sa1 = "" ;
      A11161Nof_sa2 = "" ;
      A11162Nof_sa3 = "" ;
      A11163Nof_sa4 = "" ;
      A11164Nof_sa5 = "" ;
      A11165Nof_sa6 = "" ;
      A11166Nof_c10 = "" ;
      A11170Nof_c11 = "" ;
      A11171Nof_c12 = "" ;
      A11167Nof_stk = "" ;
      A11168Nof_Lbta = "" ;
      A11388Nof_imp1 = "" ;
      A11389Nof_imp2 = "" ;
      A11390Nof_imp3 = "" ;
      A11391Nof_imp4 = "" ;
      A11392Nof_imp5 = "" ;
      A11393Nof_imp6 = "" ;
      A11394Nof_imp7 = "" ;
      A11395Nof_imp8 = "" ;
      A11396Nof_imp9 = "" ;
      A11397Nof_imp10 = "" ;
      A11398Nof_imp11 = "" ;
      A11399Nof_lavado = "" ;
      A11400Nof_luz = "" ;
      A11401Nof_sudor = "" ;
      A11402Nof_cloro = "" ;
      A11403Nof_aguam = "" ;
      A11404Nof_termom = "" ;
      A11406Nof_oekote = "" ;
      A11418Nof_obs1 = "" ;
      A11419Nof_obs2 = "" ;
      A11420Nof_obs3 = "" ;
      A11421Nof_obs4 = "" ;
      A11422Nof_obs5 = "" ;
      A11423Nof_obs6 = "" ;
      A11424Nof_obs7 = "" ;
      A11425Nof_obs8 = "" ;
      A11426Nof_obs9 = "" ;
      A11427Nof_obs10 = "" ;
      A11428Nof_obs11 = "" ;
      Gx_emsg = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnofart__default(),
         new Object[] {
             new Object[] {
            P04CJ2_A10978Bros_Art, P04CJ2_A252CliCod, P04CJ2_A396EmprCod, P04CJ2_A11387Bros_humed, P04CJ2_n11387Bros_humed, P04CJ2_A11704Bros_enc, P04CJ2_n11704Bros_enc, P04CJ2_A11703Bros_nc, P04CJ2_n11703Bros_nc, P04CJ2_A10979Bros_Mcot,
            P04CJ2_n10979Bros_Mcot, P04CJ2_A10980Bros_Pd, P04CJ2_n10980Bros_Pd, P04CJ2_A10981Bros_Pp, P04CJ2_n10981Bros_Pp, P04CJ2_A10982Bros_Ag, P04CJ2_n10982Bros_Ag, P04CJ2_A10983Bros_c1, P04CJ2_n10983Bros_c1, P04CJ2_A10984Bros_c2,
            P04CJ2_n10984Bros_c2, P04CJ2_A10985Bros_bo, P04CJ2_n10985Bros_bo, P04CJ2_A10986Bros_bob, P04CJ2_n10986Bros_bob, P04CJ2_A10987Bros_boe, P04CJ2_n10987Bros_boe, P04CJ2_A10988BrosBov, P04CJ2_n10988BrosBov, P04CJ2_A10989Bros_c3,
            P04CJ2_n10989Bros_c3, P04CJ2_A10990Bros_tns, P04CJ2_n10990Bros_tns, P04CJ2_A10991Bros_tnc, P04CJ2_n10991Bros_tnc, P04CJ2_A10992Bros_c4, P04CJ2_n10992Bros_c4, P04CJ2_A10993Bros_ct, P04CJ2_n10993Bros_ct, P04CJ2_A10994Bros_c5,
            P04CJ2_n10994Bros_c5, P04CJ2_A10995Bros_scs, P04CJ2_n10995Bros_scs, P04CJ2_A10996Bros_scc, P04CJ2_n10996Bros_scc, P04CJ2_A10997Bros_c6, P04CJ2_n10997Bros_c6, P04CJ2_A10998Bros_cctse, P04CJ2_n10998Bros_cctse, P04CJ2_A10999Bros_ccttp,
            P04CJ2_n10999Bros_ccttp, P04CJ2_A11000Bros_cctet, P04CJ2_n11000Bros_cctet, P04CJ2_A11001Bros_ccp, P04CJ2_n11001Bros_ccp, P04CJ2_A11002Bros_cct, P04CJ2_n11002Bros_cct, P04CJ2_A11003Bros_ccpc, P04CJ2_n11003Bros_ccpc, P04CJ2_A11004Bros_cctq,
            P04CJ2_n11004Bros_cctq, P04CJ2_A11005Bros_cccc, P04CJ2_n11005Bros_cccc, P04CJ2_A11006Bros_ccec, P04CJ2_n11006Bros_ccec, P04CJ2_A11008Bros_ccmc1, P04CJ2_n11008Bros_ccmc1, P04CJ2_A11009Bros_ccmc2, P04CJ2_n11009Bros_ccmc2, P04CJ2_A11010Bros_ccmc3,
            P04CJ2_n11010Bros_ccmc3, P04CJ2_A11011Bros_ccmc4, P04CJ2_n11011Bros_ccmc4, P04CJ2_A11012Bros_ccmc5, P04CJ2_n11012Bros_ccmc5, P04CJ2_A11013Bros_ccmc6, P04CJ2_n11013Bros_ccmc6, P04CJ2_A11014Bros_c7, P04CJ2_n11014Bros_c7, P04CJ2_A11015Bros_rb,
            P04CJ2_n11015Bros_rb, P04CJ2_A11016Bros_rbi, P04CJ2_n11016Bros_rbi, P04CJ2_A11017Bros_rbe, P04CJ2_n11017Bros_rbe, P04CJ2_A11018Bros_rbp, P04CJ2_n11018Bros_rbp, P04CJ2_A11019Bros_rboc, P04CJ2_n11019Bros_rboc, P04CJ2_A11020Bros_rb1,
            P04CJ2_n11020Bros_rb1, P04CJ2_A11021Bros_rb3, P04CJ2_n11021Bros_rb3, P04CJ2_A11022Bros_c8, P04CJ2_n11022Bros_c8, P04CJ2_A11023Bros_ep1, P04CJ2_n11023Bros_ep1, P04CJ2_A11024Bros_ep2, P04CJ2_n11024Bros_ep2, P04CJ2_A11025Bros_ep3,
            P04CJ2_n11025Bros_ep3, P04CJ2_A11026Bros_ep4, P04CJ2_n11026Bros_ep4, P04CJ2_A11027Bros_ep5, P04CJ2_n11027Bros_ep5, P04CJ2_A11028Bros_ep6, P04CJ2_n11028Bros_ep6, P04CJ2_A11029Bros_ep7, P04CJ2_n11029Bros_ep7, P04CJ2_A11030Bros_ep8,
            P04CJ2_n11030Bros_ep8, P04CJ2_A11031Bros_ep9, P04CJ2_n11031Bros_ep9, P04CJ2_A11032Bros_ep10, P04CJ2_n11032Bros_ep10, P04CJ2_A11033Bros_c9, P04CJ2_n11033Bros_c9, P04CJ2_A11034Bros_sa1, P04CJ2_n11034Bros_sa1, P04CJ2_A11035Bros_sa2,
            P04CJ2_n11035Bros_sa2, P04CJ2_A11036Bros_sa3, P04CJ2_n11036Bros_sa3, P04CJ2_A11037Bros_sa4, P04CJ2_n11037Bros_sa4, P04CJ2_A11038Bros_sa5, P04CJ2_n11038Bros_sa5, P04CJ2_A11039Bros_sa6, P04CJ2_n11039Bros_sa6, P04CJ2_A11040Bros_c10,
            P04CJ2_n11040Bros_c10, P04CJ2_A11069Bros_c11, P04CJ2_n11069Bros_c11, P04CJ2_A11070Bros_c12, P04CJ2_n11070Bros_c12, P04CJ2_A11066Bros_stk, P04CJ2_n11066Bros_stk, P04CJ2_A11067Bros_Lbta, P04CJ2_n11067Bros_Lbta, P04CJ2_A11068Bros_Lbtp,
            P04CJ2_n11068Bros_Lbtp, P04CJ2_A11369Bros_imp1, P04CJ2_n11369Bros_imp1, P04CJ2_A11370Bros_imp2, P04CJ2_n11370Bros_imp2, P04CJ2_A11371Bros_imp3, P04CJ2_n11371Bros_imp3, P04CJ2_A11372Bros_imp4, P04CJ2_n11372Bros_imp4, P04CJ2_A11373Bros_imp5,
            P04CJ2_n11373Bros_imp5, P04CJ2_A11374Bros_imp6, P04CJ2_n11374Bros_imp6, P04CJ2_A11375Bros_imp7, P04CJ2_n11375Bros_imp7, P04CJ2_A11376Bros_imp8, P04CJ2_n11376Bros_imp8, P04CJ2_A11377Bros_imp9, P04CJ2_n11377Bros_imp9, P04CJ2_A11378Bros_imp10,
            P04CJ2_n11378Bros_imp10, P04CJ2_A11379Bros_imp11, P04CJ2_n11379Bros_imp11, P04CJ2_A11381Bros_lavad, P04CJ2_n11381Bros_lavad, P04CJ2_A11382Bros_luz, P04CJ2_n11382Bros_luz, P04CJ2_A11383Bros_sudor, P04CJ2_n11383Bros_sudor, P04CJ2_A11384Bros_cloro,
            P04CJ2_n11384Bros_cloro, P04CJ2_A11385Bros_aguam, P04CJ2_n11385Bros_aguam, P04CJ2_A11386Bros_termo, P04CJ2_n11386Bros_termo, P04CJ2_A11380Bros_oekot, P04CJ2_n11380Bros_oekot, P04CJ2_A11407Bros_obs1, P04CJ2_n11407Bros_obs1, P04CJ2_A11408Bros_obs2,
            P04CJ2_n11408Bros_obs2, P04CJ2_A11409Bros_obs3, P04CJ2_n11409Bros_obs3, P04CJ2_A11410Bros_obs4, P04CJ2_n11410Bros_obs4, P04CJ2_A11411Bros_obs5, P04CJ2_n11411Bros_obs5, P04CJ2_A11412Bros_obs6, P04CJ2_n11412Bros_obs6, P04CJ2_A11413Bros_obs7,
            P04CJ2_n11413Bros_obs7, P04CJ2_A11414Bros_obs8, P04CJ2_n11414Bros_obs8, P04CJ2_A11415Bros_obs9, P04CJ2_n11415Bros_obs9, P04CJ2_A11416Bros_obs10, P04CJ2_n11416Bros_obs10, P04CJ2_A11417Bros_obs11, P04CJ2_n11417Bros_obs11, P04CJ2_A840TrnCod,
            P04CJ2_n840TrnCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Barcodreo ;
   private byte AV23GXLvl3 ;
   private byte A11387Bros_humed ;
   private byte A11703Bros_nc ;
   private byte A11001Bros_ccp ;
   private byte A11002Bros_cct ;
   private byte A11104Nof_r ;
   private byte A11709Nof_nc ;
   private byte A11128Nof_ccp ;
   private byte A11129Nof_cct ;
   private short A11019Bros_rboc ;
   private short A11068Bros_Lbtp ;
   private short A840TrnCod ;
   private short W840TrnCod ;
   private short A11145Nof_rboc ;
   private short A11169Nof_Lbtp ;
   private short Gx_err ;
   private int AV16Clicod ;
   private int AV18Barcod ;
   private int A252CliCod ;
   private int GX_INS1483 ;
   private int A11103Nof_Hdr ;
   private java.math.BigDecimal A11704Bros_enc ;
   private java.math.BigDecimal A11405Nof_humeda ;
   private java.math.BigDecimal A11710Nof_enc ;
   private String A396EmprCod ;
   private String AV17ARtCod ;
   private String AV20Barcodpar ;
   private String scmdbuf ;
   private String A10978Bros_Art ;
   private String A10979Bros_Mcot ;
   private String A10980Bros_Pd ;
   private String A10981Bros_Pp ;
   private String A10982Bros_Ag ;
   private String A10985Bros_bo ;
   private String A10986Bros_bob ;
   private String A10987Bros_boe ;
   private String A10988BrosBov ;
   private String A10990Bros_tns ;
   private String A10991Bros_tnc ;
   private String A10993Bros_ct ;
   private String A10995Bros_scs ;
   private String A10996Bros_scc ;
   private String A10998Bros_cctse ;
   private String A10999Bros_ccttp ;
   private String A11000Bros_cctet ;
   private String A11003Bros_ccpc ;
   private String A11004Bros_cctq ;
   private String A11005Bros_cccc ;
   private String A11006Bros_ccec ;
   private String A11008Bros_ccmc1 ;
   private String A11009Bros_ccmc2 ;
   private String A11010Bros_ccmc3 ;
   private String A11011Bros_ccmc4 ;
   private String A11012Bros_ccmc5 ;
   private String A11013Bros_ccmc6 ;
   private String A11015Bros_rb ;
   private String A11016Bros_rbi ;
   private String A11017Bros_rbe ;
   private String A11018Bros_rbp ;
   private String A11020Bros_rb1 ;
   private String A11021Bros_rb3 ;
   private String A11023Bros_ep1 ;
   private String A11024Bros_ep2 ;
   private String A11025Bros_ep3 ;
   private String A11026Bros_ep4 ;
   private String A11027Bros_ep5 ;
   private String A11028Bros_ep6 ;
   private String A11029Bros_ep7 ;
   private String A11030Bros_ep8 ;
   private String A11031Bros_ep9 ;
   private String A11032Bros_ep10 ;
   private String A11034Bros_sa1 ;
   private String A11035Bros_sa2 ;
   private String A11036Bros_sa3 ;
   private String A11037Bros_sa4 ;
   private String A11038Bros_sa5 ;
   private String A11039Bros_sa6 ;
   private String A11066Bros_stk ;
   private String A11067Bros_Lbta ;
   private String A11369Bros_imp1 ;
   private String A11370Bros_imp2 ;
   private String A11371Bros_imp3 ;
   private String A11372Bros_imp4 ;
   private String A11373Bros_imp5 ;
   private String A11374Bros_imp6 ;
   private String A11375Bros_imp7 ;
   private String A11376Bros_imp8 ;
   private String A11377Bros_imp9 ;
   private String A11378Bros_imp10 ;
   private String A11379Bros_imp11 ;
   private String A11381Bros_lavad ;
   private String A11382Bros_luz ;
   private String A11383Bros_sudor ;
   private String A11384Bros_cloro ;
   private String A11385Bros_aguam ;
   private String A11386Bros_termo ;
   private String A11380Bros_oekot ;
   private String A11407Bros_obs1 ;
   private String A11408Bros_obs2 ;
   private String A11409Bros_obs3 ;
   private String A11410Bros_obs4 ;
   private String A11411Bros_obs5 ;
   private String A11412Bros_obs6 ;
   private String A11413Bros_obs7 ;
   private String A11414Bros_obs8 ;
   private String A11415Bros_obs9 ;
   private String A11416Bros_obs10 ;
   private String A11417Bros_obs11 ;
   private String W396EmprCod ;
   private String A11105Nof_p ;
   private String A11107Nof_Mcot ;
   private String A11106Nof_Pd ;
   private String A11108Nof_Pp ;
   private String A11109Nof_Ag ;
   private String A11112Nof_bo ;
   private String A11113Nof_bob ;
   private String A11114Nof_boe ;
   private String A11115Nof_Bov ;
   private String A11117Nof_tns ;
   private String A11118Nof_tnc ;
   private String A11120Nof_ct ;
   private String A11122Nof_scs ;
   private String A11123Nof_scc ;
   private String A11125Nof_cctse ;
   private String A11126Nof_ccttp ;
   private String A11127Nof_cctet ;
   private String A11130Nof_ccpc ;
   private String A11131Nof_cctq ;
   private String A11132Nof_cccc ;
   private String A11133Nof_ccec ;
   private String A11134Nof_ccmc1 ;
   private String A11135Nof_ccmc2 ;
   private String A11136Nof_ccmc3 ;
   private String A11137Nof_ccmc4 ;
   private String A11138Nof_ccmc5 ;
   private String A11139Nof_ccmc6 ;
   private String A11141Nof_rb ;
   private String A11142Nof_rbi ;
   private String A11143Nof_rbe ;
   private String A11144Nof_rbp ;
   private String A11146Nof_rb1 ;
   private String A11147Nof_rb3 ;
   private String A11149Nof_ep1 ;
   private String A11150Nof_ep2 ;
   private String A11151Nof_ep3 ;
   private String A11152Nof_ep4 ;
   private String A11153Nof_ep5 ;
   private String A11154Nof_ep6 ;
   private String A11155Nof_ep7 ;
   private String A11156Nof_ep8 ;
   private String A11157Nof_ep9 ;
   private String A11158Nof_ep10 ;
   private String A11160Nof_sa1 ;
   private String A11161Nof_sa2 ;
   private String A11162Nof_sa3 ;
   private String A11163Nof_sa4 ;
   private String A11164Nof_sa5 ;
   private String A11165Nof_sa6 ;
   private String A11167Nof_stk ;
   private String A11168Nof_Lbta ;
   private String A11388Nof_imp1 ;
   private String A11389Nof_imp2 ;
   private String A11390Nof_imp3 ;
   private String A11391Nof_imp4 ;
   private String A11392Nof_imp5 ;
   private String A11393Nof_imp6 ;
   private String A11394Nof_imp7 ;
   private String A11395Nof_imp8 ;
   private String A11396Nof_imp9 ;
   private String A11397Nof_imp10 ;
   private String A11398Nof_imp11 ;
   private String A11399Nof_lavado ;
   private String A11400Nof_luz ;
   private String A11401Nof_sudor ;
   private String A11402Nof_cloro ;
   private String A11403Nof_aguam ;
   private String A11404Nof_termom ;
   private String A11406Nof_oekote ;
   private String A11418Nof_obs1 ;
   private String A11419Nof_obs2 ;
   private String A11420Nof_obs3 ;
   private String A11421Nof_obs4 ;
   private String A11422Nof_obs5 ;
   private String A11423Nof_obs6 ;
   private String A11424Nof_obs7 ;
   private String A11425Nof_obs8 ;
   private String A11426Nof_obs9 ;
   private String A11427Nof_obs10 ;
   private String A11428Nof_obs11 ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private boolean n11387Bros_humed ;
   private boolean n11704Bros_enc ;
   private boolean n11703Bros_nc ;
   private boolean n10979Bros_Mcot ;
   private boolean n10980Bros_Pd ;
   private boolean n10981Bros_Pp ;
   private boolean n10982Bros_Ag ;
   private boolean n10983Bros_c1 ;
   private boolean n10984Bros_c2 ;
   private boolean n10985Bros_bo ;
   private boolean n10986Bros_bob ;
   private boolean n10987Bros_boe ;
   private boolean n10988BrosBov ;
   private boolean n10989Bros_c3 ;
   private boolean n10990Bros_tns ;
   private boolean n10991Bros_tnc ;
   private boolean n10992Bros_c4 ;
   private boolean n10993Bros_ct ;
   private boolean n10994Bros_c5 ;
   private boolean n10995Bros_scs ;
   private boolean n10996Bros_scc ;
   private boolean n10997Bros_c6 ;
   private boolean n10998Bros_cctse ;
   private boolean n10999Bros_ccttp ;
   private boolean n11000Bros_cctet ;
   private boolean n11001Bros_ccp ;
   private boolean n11002Bros_cct ;
   private boolean n11003Bros_ccpc ;
   private boolean n11004Bros_cctq ;
   private boolean n11005Bros_cccc ;
   private boolean n11006Bros_ccec ;
   private boolean n11008Bros_ccmc1 ;
   private boolean n11009Bros_ccmc2 ;
   private boolean n11010Bros_ccmc3 ;
   private boolean n11011Bros_ccmc4 ;
   private boolean n11012Bros_ccmc5 ;
   private boolean n11013Bros_ccmc6 ;
   private boolean n11014Bros_c7 ;
   private boolean n11015Bros_rb ;
   private boolean n11016Bros_rbi ;
   private boolean n11017Bros_rbe ;
   private boolean n11018Bros_rbp ;
   private boolean n11019Bros_rboc ;
   private boolean n11020Bros_rb1 ;
   private boolean n11021Bros_rb3 ;
   private boolean n11022Bros_c8 ;
   private boolean n11023Bros_ep1 ;
   private boolean n11024Bros_ep2 ;
   private boolean n11025Bros_ep3 ;
   private boolean n11026Bros_ep4 ;
   private boolean n11027Bros_ep5 ;
   private boolean n11028Bros_ep6 ;
   private boolean n11029Bros_ep7 ;
   private boolean n11030Bros_ep8 ;
   private boolean n11031Bros_ep9 ;
   private boolean n11032Bros_ep10 ;
   private boolean n11033Bros_c9 ;
   private boolean n11034Bros_sa1 ;
   private boolean n11035Bros_sa2 ;
   private boolean n11036Bros_sa3 ;
   private boolean n11037Bros_sa4 ;
   private boolean n11038Bros_sa5 ;
   private boolean n11039Bros_sa6 ;
   private boolean n11040Bros_c10 ;
   private boolean n11069Bros_c11 ;
   private boolean n11070Bros_c12 ;
   private boolean n11066Bros_stk ;
   private boolean n11067Bros_Lbta ;
   private boolean n11068Bros_Lbtp ;
   private boolean n11369Bros_imp1 ;
   private boolean n11370Bros_imp2 ;
   private boolean n11371Bros_imp3 ;
   private boolean n11372Bros_imp4 ;
   private boolean n11373Bros_imp5 ;
   private boolean n11374Bros_imp6 ;
   private boolean n11375Bros_imp7 ;
   private boolean n11376Bros_imp8 ;
   private boolean n11377Bros_imp9 ;
   private boolean n11378Bros_imp10 ;
   private boolean n11379Bros_imp11 ;
   private boolean n11381Bros_lavad ;
   private boolean n11382Bros_luz ;
   private boolean n11383Bros_sudor ;
   private boolean n11384Bros_cloro ;
   private boolean n11385Bros_aguam ;
   private boolean n11386Bros_termo ;
   private boolean n11380Bros_oekot ;
   private boolean n11407Bros_obs1 ;
   private boolean n11408Bros_obs2 ;
   private boolean n11409Bros_obs3 ;
   private boolean n11410Bros_obs4 ;
   private boolean n11411Bros_obs5 ;
   private boolean n11412Bros_obs6 ;
   private boolean n11413Bros_obs7 ;
   private boolean n11414Bros_obs8 ;
   private boolean n11415Bros_obs9 ;
   private boolean n11416Bros_obs10 ;
   private boolean n11417Bros_obs11 ;
   private boolean n840TrnCod ;
   private boolean n11405Nof_humeda ;
   private boolean n11710Nof_enc ;
   private boolean n11709Nof_nc ;
   private boolean n11107Nof_Mcot ;
   private boolean n11106Nof_Pd ;
   private boolean n11108Nof_Pp ;
   private boolean n11109Nof_Ag ;
   private boolean n11110Nof_c1 ;
   private boolean n11111Nof_c2 ;
   private boolean n11112Nof_bo ;
   private boolean n11113Nof_bob ;
   private boolean n11114Nof_boe ;
   private boolean n11115Nof_Bov ;
   private boolean n11116Nof_c3 ;
   private boolean n11117Nof_tns ;
   private boolean n11118Nof_tnc ;
   private boolean n11119Nof_c4 ;
   private boolean n11120Nof_ct ;
   private boolean n11121Nof_c5 ;
   private boolean n11122Nof_scs ;
   private boolean n11123Nof_scc ;
   private boolean n11124Nof_c6 ;
   private boolean n11125Nof_cctse ;
   private boolean n11126Nof_ccttp ;
   private boolean n11127Nof_cctet ;
   private boolean n11128Nof_ccp ;
   private boolean n11129Nof_cct ;
   private boolean n11130Nof_ccpc ;
   private boolean n11131Nof_cctq ;
   private boolean n11132Nof_cccc ;
   private boolean n11133Nof_ccec ;
   private boolean n11134Nof_ccmc1 ;
   private boolean n11135Nof_ccmc2 ;
   private boolean n11136Nof_ccmc3 ;
   private boolean n11137Nof_ccmc4 ;
   private boolean n11138Nof_ccmc5 ;
   private boolean n11139Nof_ccmc6 ;
   private boolean n11140Nof_c7 ;
   private boolean n11141Nof_rb ;
   private boolean n11142Nof_rbi ;
   private boolean n11143Nof_rbe ;
   private boolean n11144Nof_rbp ;
   private boolean n11145Nof_rboc ;
   private boolean n11146Nof_rb1 ;
   private boolean n11147Nof_rb3 ;
   private boolean n11148Nof_c8 ;
   private boolean n11149Nof_ep1 ;
   private boolean n11150Nof_ep2 ;
   private boolean n11151Nof_ep3 ;
   private boolean n11152Nof_ep4 ;
   private boolean n11153Nof_ep5 ;
   private boolean n11154Nof_ep6 ;
   private boolean n11155Nof_ep7 ;
   private boolean n11156Nof_ep8 ;
   private boolean n11157Nof_ep9 ;
   private boolean n11158Nof_ep10 ;
   private boolean n11159Nof_c9 ;
   private boolean n11160Nof_sa1 ;
   private boolean n11161Nof_sa2 ;
   private boolean n11162Nof_sa3 ;
   private boolean n11163Nof_sa4 ;
   private boolean n11164Nof_sa5 ;
   private boolean n11165Nof_sa6 ;
   private boolean n11166Nof_c10 ;
   private boolean n11170Nof_c11 ;
   private boolean n11171Nof_c12 ;
   private boolean n11167Nof_stk ;
   private boolean n11168Nof_Lbta ;
   private boolean n11169Nof_Lbtp ;
   private boolean n11388Nof_imp1 ;
   private boolean n11389Nof_imp2 ;
   private boolean n11390Nof_imp3 ;
   private boolean n11391Nof_imp4 ;
   private boolean n11392Nof_imp5 ;
   private boolean n11393Nof_imp6 ;
   private boolean n11394Nof_imp7 ;
   private boolean n11395Nof_imp8 ;
   private boolean n11396Nof_imp9 ;
   private boolean n11397Nof_imp10 ;
   private boolean n11398Nof_imp11 ;
   private boolean n11399Nof_lavado ;
   private boolean n11400Nof_luz ;
   private boolean n11401Nof_sudor ;
   private boolean n11402Nof_cloro ;
   private boolean n11403Nof_aguam ;
   private boolean n11404Nof_termom ;
   private boolean n11406Nof_oekote ;
   private boolean n11418Nof_obs1 ;
   private boolean n11419Nof_obs2 ;
   private boolean n11420Nof_obs3 ;
   private boolean n11421Nof_obs4 ;
   private boolean n11422Nof_obs5 ;
   private boolean n11423Nof_obs6 ;
   private boolean n11424Nof_obs7 ;
   private boolean n11425Nof_obs8 ;
   private boolean n11426Nof_obs9 ;
   private boolean n11427Nof_obs10 ;
   private boolean n11428Nof_obs11 ;
   private String A10983Bros_c1 ;
   private String A10984Bros_c2 ;
   private String A10989Bros_c3 ;
   private String A10992Bros_c4 ;
   private String A10994Bros_c5 ;
   private String A10997Bros_c6 ;
   private String A11014Bros_c7 ;
   private String A11022Bros_c8 ;
   private String A11033Bros_c9 ;
   private String A11040Bros_c10 ;
   private String A11069Bros_c11 ;
   private String A11070Bros_c12 ;
   private String A11110Nof_c1 ;
   private String A11111Nof_c2 ;
   private String A11116Nof_c3 ;
   private String A11119Nof_c4 ;
   private String A11121Nof_c5 ;
   private String A11124Nof_c6 ;
   private String A11140Nof_c7 ;
   private String A11148Nof_c8 ;
   private String A11159Nof_c9 ;
   private String A11166Nof_c10 ;
   private String A11170Nof_c11 ;
   private String A11171Nof_c12 ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04CJ2_A10978Bros_Art ;
   private int[] P04CJ2_A252CliCod ;
   private String[] P04CJ2_A396EmprCod ;
   private byte[] P04CJ2_A11387Bros_humed ;
   private boolean[] P04CJ2_n11387Bros_humed ;
   private java.math.BigDecimal[] P04CJ2_A11704Bros_enc ;
   private boolean[] P04CJ2_n11704Bros_enc ;
   private byte[] P04CJ2_A11703Bros_nc ;
   private boolean[] P04CJ2_n11703Bros_nc ;
   private String[] P04CJ2_A10979Bros_Mcot ;
   private boolean[] P04CJ2_n10979Bros_Mcot ;
   private String[] P04CJ2_A10980Bros_Pd ;
   private boolean[] P04CJ2_n10980Bros_Pd ;
   private String[] P04CJ2_A10981Bros_Pp ;
   private boolean[] P04CJ2_n10981Bros_Pp ;
   private String[] P04CJ2_A10982Bros_Ag ;
   private boolean[] P04CJ2_n10982Bros_Ag ;
   private String[] P04CJ2_A10983Bros_c1 ;
   private boolean[] P04CJ2_n10983Bros_c1 ;
   private String[] P04CJ2_A10984Bros_c2 ;
   private boolean[] P04CJ2_n10984Bros_c2 ;
   private String[] P04CJ2_A10985Bros_bo ;
   private boolean[] P04CJ2_n10985Bros_bo ;
   private String[] P04CJ2_A10986Bros_bob ;
   private boolean[] P04CJ2_n10986Bros_bob ;
   private String[] P04CJ2_A10987Bros_boe ;
   private boolean[] P04CJ2_n10987Bros_boe ;
   private String[] P04CJ2_A10988BrosBov ;
   private boolean[] P04CJ2_n10988BrosBov ;
   private String[] P04CJ2_A10989Bros_c3 ;
   private boolean[] P04CJ2_n10989Bros_c3 ;
   private String[] P04CJ2_A10990Bros_tns ;
   private boolean[] P04CJ2_n10990Bros_tns ;
   private String[] P04CJ2_A10991Bros_tnc ;
   private boolean[] P04CJ2_n10991Bros_tnc ;
   private String[] P04CJ2_A10992Bros_c4 ;
   private boolean[] P04CJ2_n10992Bros_c4 ;
   private String[] P04CJ2_A10993Bros_ct ;
   private boolean[] P04CJ2_n10993Bros_ct ;
   private String[] P04CJ2_A10994Bros_c5 ;
   private boolean[] P04CJ2_n10994Bros_c5 ;
   private String[] P04CJ2_A10995Bros_scs ;
   private boolean[] P04CJ2_n10995Bros_scs ;
   private String[] P04CJ2_A10996Bros_scc ;
   private boolean[] P04CJ2_n10996Bros_scc ;
   private String[] P04CJ2_A10997Bros_c6 ;
   private boolean[] P04CJ2_n10997Bros_c6 ;
   private String[] P04CJ2_A10998Bros_cctse ;
   private boolean[] P04CJ2_n10998Bros_cctse ;
   private String[] P04CJ2_A10999Bros_ccttp ;
   private boolean[] P04CJ2_n10999Bros_ccttp ;
   private String[] P04CJ2_A11000Bros_cctet ;
   private boolean[] P04CJ2_n11000Bros_cctet ;
   private byte[] P04CJ2_A11001Bros_ccp ;
   private boolean[] P04CJ2_n11001Bros_ccp ;
   private byte[] P04CJ2_A11002Bros_cct ;
   private boolean[] P04CJ2_n11002Bros_cct ;
   private String[] P04CJ2_A11003Bros_ccpc ;
   private boolean[] P04CJ2_n11003Bros_ccpc ;
   private String[] P04CJ2_A11004Bros_cctq ;
   private boolean[] P04CJ2_n11004Bros_cctq ;
   private String[] P04CJ2_A11005Bros_cccc ;
   private boolean[] P04CJ2_n11005Bros_cccc ;
   private String[] P04CJ2_A11006Bros_ccec ;
   private boolean[] P04CJ2_n11006Bros_ccec ;
   private String[] P04CJ2_A11008Bros_ccmc1 ;
   private boolean[] P04CJ2_n11008Bros_ccmc1 ;
   private String[] P04CJ2_A11009Bros_ccmc2 ;
   private boolean[] P04CJ2_n11009Bros_ccmc2 ;
   private String[] P04CJ2_A11010Bros_ccmc3 ;
   private boolean[] P04CJ2_n11010Bros_ccmc3 ;
   private String[] P04CJ2_A11011Bros_ccmc4 ;
   private boolean[] P04CJ2_n11011Bros_ccmc4 ;
   private String[] P04CJ2_A11012Bros_ccmc5 ;
   private boolean[] P04CJ2_n11012Bros_ccmc5 ;
   private String[] P04CJ2_A11013Bros_ccmc6 ;
   private boolean[] P04CJ2_n11013Bros_ccmc6 ;
   private String[] P04CJ2_A11014Bros_c7 ;
   private boolean[] P04CJ2_n11014Bros_c7 ;
   private String[] P04CJ2_A11015Bros_rb ;
   private boolean[] P04CJ2_n11015Bros_rb ;
   private String[] P04CJ2_A11016Bros_rbi ;
   private boolean[] P04CJ2_n11016Bros_rbi ;
   private String[] P04CJ2_A11017Bros_rbe ;
   private boolean[] P04CJ2_n11017Bros_rbe ;
   private String[] P04CJ2_A11018Bros_rbp ;
   private boolean[] P04CJ2_n11018Bros_rbp ;
   private short[] P04CJ2_A11019Bros_rboc ;
   private boolean[] P04CJ2_n11019Bros_rboc ;
   private String[] P04CJ2_A11020Bros_rb1 ;
   private boolean[] P04CJ2_n11020Bros_rb1 ;
   private String[] P04CJ2_A11021Bros_rb3 ;
   private boolean[] P04CJ2_n11021Bros_rb3 ;
   private String[] P04CJ2_A11022Bros_c8 ;
   private boolean[] P04CJ2_n11022Bros_c8 ;
   private String[] P04CJ2_A11023Bros_ep1 ;
   private boolean[] P04CJ2_n11023Bros_ep1 ;
   private String[] P04CJ2_A11024Bros_ep2 ;
   private boolean[] P04CJ2_n11024Bros_ep2 ;
   private String[] P04CJ2_A11025Bros_ep3 ;
   private boolean[] P04CJ2_n11025Bros_ep3 ;
   private String[] P04CJ2_A11026Bros_ep4 ;
   private boolean[] P04CJ2_n11026Bros_ep4 ;
   private String[] P04CJ2_A11027Bros_ep5 ;
   private boolean[] P04CJ2_n11027Bros_ep5 ;
   private String[] P04CJ2_A11028Bros_ep6 ;
   private boolean[] P04CJ2_n11028Bros_ep6 ;
   private String[] P04CJ2_A11029Bros_ep7 ;
   private boolean[] P04CJ2_n11029Bros_ep7 ;
   private String[] P04CJ2_A11030Bros_ep8 ;
   private boolean[] P04CJ2_n11030Bros_ep8 ;
   private String[] P04CJ2_A11031Bros_ep9 ;
   private boolean[] P04CJ2_n11031Bros_ep9 ;
   private String[] P04CJ2_A11032Bros_ep10 ;
   private boolean[] P04CJ2_n11032Bros_ep10 ;
   private String[] P04CJ2_A11033Bros_c9 ;
   private boolean[] P04CJ2_n11033Bros_c9 ;
   private String[] P04CJ2_A11034Bros_sa1 ;
   private boolean[] P04CJ2_n11034Bros_sa1 ;
   private String[] P04CJ2_A11035Bros_sa2 ;
   private boolean[] P04CJ2_n11035Bros_sa2 ;
   private String[] P04CJ2_A11036Bros_sa3 ;
   private boolean[] P04CJ2_n11036Bros_sa3 ;
   private String[] P04CJ2_A11037Bros_sa4 ;
   private boolean[] P04CJ2_n11037Bros_sa4 ;
   private String[] P04CJ2_A11038Bros_sa5 ;
   private boolean[] P04CJ2_n11038Bros_sa5 ;
   private String[] P04CJ2_A11039Bros_sa6 ;
   private boolean[] P04CJ2_n11039Bros_sa6 ;
   private String[] P04CJ2_A11040Bros_c10 ;
   private boolean[] P04CJ2_n11040Bros_c10 ;
   private String[] P04CJ2_A11069Bros_c11 ;
   private boolean[] P04CJ2_n11069Bros_c11 ;
   private String[] P04CJ2_A11070Bros_c12 ;
   private boolean[] P04CJ2_n11070Bros_c12 ;
   private String[] P04CJ2_A11066Bros_stk ;
   private boolean[] P04CJ2_n11066Bros_stk ;
   private String[] P04CJ2_A11067Bros_Lbta ;
   private boolean[] P04CJ2_n11067Bros_Lbta ;
   private short[] P04CJ2_A11068Bros_Lbtp ;
   private boolean[] P04CJ2_n11068Bros_Lbtp ;
   private String[] P04CJ2_A11369Bros_imp1 ;
   private boolean[] P04CJ2_n11369Bros_imp1 ;
   private String[] P04CJ2_A11370Bros_imp2 ;
   private boolean[] P04CJ2_n11370Bros_imp2 ;
   private String[] P04CJ2_A11371Bros_imp3 ;
   private boolean[] P04CJ2_n11371Bros_imp3 ;
   private String[] P04CJ2_A11372Bros_imp4 ;
   private boolean[] P04CJ2_n11372Bros_imp4 ;
   private String[] P04CJ2_A11373Bros_imp5 ;
   private boolean[] P04CJ2_n11373Bros_imp5 ;
   private String[] P04CJ2_A11374Bros_imp6 ;
   private boolean[] P04CJ2_n11374Bros_imp6 ;
   private String[] P04CJ2_A11375Bros_imp7 ;
   private boolean[] P04CJ2_n11375Bros_imp7 ;
   private String[] P04CJ2_A11376Bros_imp8 ;
   private boolean[] P04CJ2_n11376Bros_imp8 ;
   private String[] P04CJ2_A11377Bros_imp9 ;
   private boolean[] P04CJ2_n11377Bros_imp9 ;
   private String[] P04CJ2_A11378Bros_imp10 ;
   private boolean[] P04CJ2_n11378Bros_imp10 ;
   private String[] P04CJ2_A11379Bros_imp11 ;
   private boolean[] P04CJ2_n11379Bros_imp11 ;
   private String[] P04CJ2_A11381Bros_lavad ;
   private boolean[] P04CJ2_n11381Bros_lavad ;
   private String[] P04CJ2_A11382Bros_luz ;
   private boolean[] P04CJ2_n11382Bros_luz ;
   private String[] P04CJ2_A11383Bros_sudor ;
   private boolean[] P04CJ2_n11383Bros_sudor ;
   private String[] P04CJ2_A11384Bros_cloro ;
   private boolean[] P04CJ2_n11384Bros_cloro ;
   private String[] P04CJ2_A11385Bros_aguam ;
   private boolean[] P04CJ2_n11385Bros_aguam ;
   private String[] P04CJ2_A11386Bros_termo ;
   private boolean[] P04CJ2_n11386Bros_termo ;
   private String[] P04CJ2_A11380Bros_oekot ;
   private boolean[] P04CJ2_n11380Bros_oekot ;
   private String[] P04CJ2_A11407Bros_obs1 ;
   private boolean[] P04CJ2_n11407Bros_obs1 ;
   private String[] P04CJ2_A11408Bros_obs2 ;
   private boolean[] P04CJ2_n11408Bros_obs2 ;
   private String[] P04CJ2_A11409Bros_obs3 ;
   private boolean[] P04CJ2_n11409Bros_obs3 ;
   private String[] P04CJ2_A11410Bros_obs4 ;
   private boolean[] P04CJ2_n11410Bros_obs4 ;
   private String[] P04CJ2_A11411Bros_obs5 ;
   private boolean[] P04CJ2_n11411Bros_obs5 ;
   private String[] P04CJ2_A11412Bros_obs6 ;
   private boolean[] P04CJ2_n11412Bros_obs6 ;
   private String[] P04CJ2_A11413Bros_obs7 ;
   private boolean[] P04CJ2_n11413Bros_obs7 ;
   private String[] P04CJ2_A11414Bros_obs8 ;
   private boolean[] P04CJ2_n11414Bros_obs8 ;
   private String[] P04CJ2_A11415Bros_obs9 ;
   private boolean[] P04CJ2_n11415Bros_obs9 ;
   private String[] P04CJ2_A11416Bros_obs10 ;
   private boolean[] P04CJ2_n11416Bros_obs10 ;
   private String[] P04CJ2_A11417Bros_obs11 ;
   private boolean[] P04CJ2_n11417Bros_obs11 ;
   private short[] P04CJ2_A840TrnCod ;
   private boolean[] P04CJ2_n840TrnCod ;
}

final  class pnofart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04CJ2", "SELECT Bros_Art, CliCod, EmprCod, Bros_humed, Bros_enc, Bros_nc, Bros_Mcot, Bros_Pd, Bros_Pp, Bros_Ag, Bros_c1, Bros_c2, Bros_bo, Bros_bob, Bros_boe, BrosBov, Bros_c3, Bros_tns, Bros_tnc, Bros_c4, Bros_ct, Bros_c5, Bros_scs, Bros_scc, Bros_c6, Bros_cctse, Bros_ccttp, Bros_cctet, Bros_ccp, Bros_cct, Bros_ccpc, Bros_cctq, Bros_cccc, Bros_ccec, Bros_ccmc1, Bros_ccmc2, Bros_ccmc3, Bros_ccmc4, Bros_ccmc5, Bros_ccmc6, Bros_c7, Bros_rb, Bros_rbi, Bros_rbe, Bros_rbp, Bros_rboc, Bros_rb1, Bros_rb3, Bros_c8, Bros_ep1, Bros_ep2, Bros_ep3, Bros_ep4, Bros_ep5, Bros_ep6, Bros_ep7, Bros_ep8, Bros_ep9, Bros_ep10, Bros_c9, Bros_sa1, Bros_sa2, Bros_sa3, Bros_sa4, Bros_sa5, Bros_sa6, Bros_c10, Bros_c11, Bros_c12, Bros_stk, Bros_Lbta, Bros_Lbtp, Bros_imp1, Bros_imp2, Bros_imp3, Bros_imp4, Bros_imp5, Bros_imp6, Bros_imp7, Bros_imp8, Bros_imp9, Bros_imp10, Bros_imp11, Bros_lavad, Bros_luz, Bros_sudor, Bros_cloro, Bros_aguam, Bros_termo, Bros_oekot, Bros_obs1, Bros_obs2, Bros_obs3, Bros_obs4, Bros_obs5, Bros_obs6, Bros_obs7, Bros_obs8, Bros_obs9, Bros_obs10, Bros_obs11, TrnCod FROM TXPARTBRS WHERE EmprCod = ? and CliCod = ? and Bros_Art = ? ORDER BY EmprCod, CliCod, Bros_Art ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04CJ3", "INSERT INTO TXPNOFART(EmprCod, Nof_Hdr, Nof_r, Nof_p, Nof_Pd, Nof_Mcot, Nof_Pp, Nof_Ag, TrnCod, Nof_c1, Nof_c2, Nof_bo, Nof_bob, Nof_boe, Nof_Bov, Nof_c3, Nof_tns, Nof_tnc, Nof_c4, Nof_ct, Nof_c5, Nof_scs, Nof_scc, Nof_c6, Nof_cctse, Nof_ccttp, Nof_cctet, Nof_ccp, Nof_cct, Nof_ccpc, Nof_cctq, Nof_cccc, Nof_ccec, Nof_ccmc1, Nof_ccmc2, Nof_ccmc3, Nof_ccmc4, Nof_ccmc5, Nof_ccmc6, Nof_c7, Nof_rb, Nof_rbi, Nof_rbe, Nof_rbp, Nof_rboc, Nof_rb1, Nof_rb3, Nof_c8, Nof_ep1, Nof_ep2, Nof_ep3, Nof_ep4, Nof_ep5, Nof_ep6, Nof_ep7, Nof_ep8, Nof_ep9, Nof_ep10, Nof_c9, Nof_sa1, Nof_sa2, Nof_sa3, Nof_sa4, Nof_sa5, Nof_sa6, Nof_c10, Nof_stk, Nof_Lbta, Nof_Lbtp, Nof_c11, Nof_c12, Nof_imp1, Nof_imp2, Nof_imp3, Nof_imp4, Nof_imp5, Nof_imp6, Nof_imp7, Nof_imp8, Nof_imp9, Nof_imp10, Nof_imp11, Nof_lavado, Nof_luz, Nof_sudor, Nof_cloro, Nof_aguam, Nof_termom, Nof_humeda, Nof_oekote, Nof_obs1, Nof_obs2, Nof_obs3, Nof_obs4, Nof_obs5, Nof_obs6, Nof_obs7, Nof_obs8, Nof_obs9, Nof_obs10, Nof_obs11, Nof_nc, Nof_enc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOFART")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(46);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(50, 1);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(59, 1);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((String[]) buf[123])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((String[]) buf[125])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((String[]) buf[127])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((String[]) buf[129])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((String[]) buf[131])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((String[]) buf[133])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((String[]) buf[135])[0] = rslt.getString(70, 1);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((String[]) buf[137])[0] = rslt.getString(71, 40);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((short[]) buf[139])[0] = rslt.getShort(72);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((String[]) buf[141])[0] = rslt.getString(73, 1);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((String[]) buf[143])[0] = rslt.getString(74, 1);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((String[]) buf[145])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((String[]) buf[147])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((String[]) buf[149])[0] = rslt.getString(77, 1);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((String[]) buf[151])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((String[]) buf[153])[0] = rslt.getString(79, 1);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((String[]) buf[155])[0] = rslt.getString(80, 1);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((String[]) buf[157])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((String[]) buf[159])[0] = rslt.getString(82, 1);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((String[]) buf[161])[0] = rslt.getString(83, 1);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((String[]) buf[163])[0] = rslt.getString(84, 10);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((String[]) buf[165])[0] = rslt.getString(85, 10);
               ((boolean[]) buf[166])[0] = rslt.wasNull();
               ((String[]) buf[167])[0] = rslt.getString(86, 10);
               ((boolean[]) buf[168])[0] = rslt.wasNull();
               ((String[]) buf[169])[0] = rslt.getString(87, 10);
               ((boolean[]) buf[170])[0] = rslt.wasNull();
               ((String[]) buf[171])[0] = rslt.getString(88, 10);
               ((boolean[]) buf[172])[0] = rslt.wasNull();
               ((String[]) buf[173])[0] = rslt.getString(89, 10);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((String[]) buf[175])[0] = rslt.getString(90, 1);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((String[]) buf[177])[0] = rslt.getString(91, 1);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((String[]) buf[179])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((String[]) buf[183])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(95, 1);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((String[]) buf[187])[0] = rslt.getString(96, 1);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((String[]) buf[189])[0] = rslt.getString(97, 1);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(98, 1);
               ((boolean[]) buf[192])[0] = rslt.wasNull();
               ((String[]) buf[193])[0] = rslt.getString(99, 1);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((String[]) buf[195])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((String[]) buf[197])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((short[]) buf[199])[0] = rslt.getShort(102);
               ((boolean[]) buf[200])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 200);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 200);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 200);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[33], 200);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[37], 200);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[43], 200);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[51]).byteValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[69], 1);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[73], 1);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[75], 200);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[77], 1);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[79], 1);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[81], 1);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[87], 1);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[89], 1);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[91], 200);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[93], 1);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[95], 1);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[97], 1);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[99], 1);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[101], 1);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[103], 1);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[105], 1);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[107], 1);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[109], 1);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[111], 1);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[113], 200);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[115], 1);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[117], 1);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[119], 1);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[121], 1);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[123], 1);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(65, (String)parms[125], 1);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[127], 200);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[129], 1);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[131], 40);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[133]).shortValue());
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(70, (String)parms[135], 200);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(71, (String)parms[137], 200);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[139], 1);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[141], 1);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[143], 1);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[145], 1);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[147], 1);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[149], 1);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[151], 1);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[153], 1);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[155], 1);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[157], 1);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[159], 1);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[161], 10);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(84, (String)parms[163], 10);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[165], 10);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[167], 10);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[169], 10);
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[171], 10);
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(89, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[175], 1);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[177], 1);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[179], 1);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[181], 1);
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[183], 1);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[185], 1);
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[187], 1);
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[189], 1);
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[191], 1);
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(99, (String)parms[193], 1);
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(100, (String)parms[195], 1);
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(101, (String)parms[197], 1);
               }
               if ( ((Boolean) parms[198]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(102, ((Number) parms[199]).byteValue());
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(103, (java.math.BigDecimal)parms[201], 2);
               }
               return;
      }
   }

}

