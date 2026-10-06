package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partbrs extends GXProcedure
{
   public partbrs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partbrs.class ), "" );
   }

   public partbrs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      partbrs.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      partbrs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partbrs.this.AV9Clicod = aP1[0];
      this.aP1 = aP1;
      partbrs.this.AV10ARtCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl3 = (byte)(0) ;
      /* Using cursor P04BI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Clicod), AV10ARtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10978Bros_Art = P04BI2_A10978Bros_Art[0] ;
         A252CliCod = P04BI2_A252CliCod[0] ;
         AV13GXLvl3 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV13GXLvl3 == 0 )
      {
         /* Execute user subroutine: 'CREOTABLA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CREOTABLA' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPARTBRS

      */
      A252CliCod = AV9Clicod ;
      A10978Bros_Art = AV10ARtCod ;
      A10979Bros_Mcot = httpContext.getMessage( "N", "") ;
      n10979Bros_Mcot = false ;
      A10980Bros_Pd = httpContext.getMessage( "N", "") ;
      n10980Bros_Pd = false ;
      A10981Bros_Pp = httpContext.getMessage( "N", "") ;
      n10981Bros_Pp = false ;
      A10982Bros_Ag = httpContext.getMessage( "N", "") ;
      n10982Bros_Ag = false ;
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      A10983Bros_c1 = " " ;
      n10983Bros_c1 = false ;
      A10984Bros_c2 = " " ;
      n10984Bros_c2 = false ;
      A10985Bros_bo = httpContext.getMessage( "N", "") ;
      n10985Bros_bo = false ;
      A10986Bros_bob = httpContext.getMessage( "N", "") ;
      n10986Bros_bob = false ;
      A10987Bros_boe = httpContext.getMessage( "N", "") ;
      n10987Bros_boe = false ;
      A10988BrosBov = httpContext.getMessage( "N", "") ;
      n10988BrosBov = false ;
      A10989Bros_c3 = " " ;
      n10989Bros_c3 = false ;
      A10990Bros_tns = httpContext.getMessage( "N", "") ;
      n10990Bros_tns = false ;
      A10991Bros_tnc = httpContext.getMessage( "N", "") ;
      n10991Bros_tnc = false ;
      A10992Bros_c4 = " " ;
      n10992Bros_c4 = false ;
      A10993Bros_ct = httpContext.getMessage( "N", "") ;
      n10993Bros_ct = false ;
      A10994Bros_c5 = " " ;
      n10994Bros_c5 = false ;
      A10995Bros_scs = httpContext.getMessage( "N", "") ;
      n10995Bros_scs = false ;
      A10996Bros_scc = httpContext.getMessage( "N", "") ;
      n10996Bros_scc = false ;
      A10997Bros_c6 = " " ;
      n10997Bros_c6 = false ;
      A10998Bros_cctse = httpContext.getMessage( "N", "") ;
      n10998Bros_cctse = false ;
      A10999Bros_ccttp = httpContext.getMessage( "N", "") ;
      n10999Bros_ccttp = false ;
      A11000Bros_cctet = httpContext.getMessage( "N", "") ;
      n11000Bros_cctet = false ;
      A11001Bros_ccp = (byte)(0) ;
      n11001Bros_ccp = false ;
      A11002Bros_cct = (byte)(0) ;
      n11002Bros_cct = false ;
      A11003Bros_ccpc = httpContext.getMessage( "N", "") ;
      n11003Bros_ccpc = false ;
      A11004Bros_cctq = httpContext.getMessage( "N", "") ;
      n11004Bros_cctq = false ;
      A11005Bros_cccc = httpContext.getMessage( "N", "") ;
      n11005Bros_cccc = false ;
      A11006Bros_ccec = httpContext.getMessage( "N", "") ;
      n11006Bros_ccec = false ;
      A11008Bros_ccmc1 = httpContext.getMessage( "N", "") ;
      n11008Bros_ccmc1 = false ;
      A11009Bros_ccmc2 = httpContext.getMessage( "N", "") ;
      n11009Bros_ccmc2 = false ;
      A11010Bros_ccmc3 = httpContext.getMessage( "N", "") ;
      n11010Bros_ccmc3 = false ;
      A11011Bros_ccmc4 = httpContext.getMessage( "N", "") ;
      n11011Bros_ccmc4 = false ;
      A11012Bros_ccmc5 = httpContext.getMessage( "N", "") ;
      n11012Bros_ccmc5 = false ;
      A11013Bros_ccmc6 = httpContext.getMessage( "N", "") ;
      n11013Bros_ccmc6 = false ;
      A11014Bros_c7 = " " ;
      n11014Bros_c7 = false ;
      A11015Bros_rb = httpContext.getMessage( "N", "") ;
      n11015Bros_rb = false ;
      A11016Bros_rbi = httpContext.getMessage( "N", "") ;
      n11016Bros_rbi = false ;
      A11017Bros_rbe = httpContext.getMessage( "N", "") ;
      n11017Bros_rbe = false ;
      A11018Bros_rbp = httpContext.getMessage( "N", "") ;
      n11018Bros_rbp = false ;
      A11019Bros_rboc = (short)(0) ;
      n11019Bros_rboc = false ;
      A11020Bros_rb1 = httpContext.getMessage( "N", "") ;
      n11020Bros_rb1 = false ;
      A11021Bros_rb3 = httpContext.getMessage( "N", "") ;
      n11021Bros_rb3 = false ;
      A11022Bros_c8 = " " ;
      n11022Bros_c8 = false ;
      A11023Bros_ep1 = httpContext.getMessage( "N", "") ;
      n11023Bros_ep1 = false ;
      A11024Bros_ep2 = httpContext.getMessage( "N", "") ;
      n11024Bros_ep2 = false ;
      A11025Bros_ep3 = httpContext.getMessage( "N", "") ;
      n11025Bros_ep3 = false ;
      A11026Bros_ep4 = httpContext.getMessage( "N", "") ;
      n11026Bros_ep4 = false ;
      A11027Bros_ep5 = httpContext.getMessage( "N", "") ;
      n11027Bros_ep5 = false ;
      A11028Bros_ep6 = httpContext.getMessage( "N", "") ;
      n11028Bros_ep6 = false ;
      A11029Bros_ep7 = httpContext.getMessage( "N", "") ;
      n11029Bros_ep7 = false ;
      A11030Bros_ep8 = httpContext.getMessage( "N", "") ;
      n11030Bros_ep8 = false ;
      A11031Bros_ep9 = httpContext.getMessage( "N", "") ;
      n11031Bros_ep9 = false ;
      A11032Bros_ep10 = httpContext.getMessage( "N", "") ;
      n11032Bros_ep10 = false ;
      A11033Bros_c9 = " " ;
      n11033Bros_c9 = false ;
      A11034Bros_sa1 = httpContext.getMessage( "N", "") ;
      n11034Bros_sa1 = false ;
      A11035Bros_sa2 = httpContext.getMessage( "N", "") ;
      n11035Bros_sa2 = false ;
      A11036Bros_sa3 = httpContext.getMessage( "N", "") ;
      n11036Bros_sa3 = false ;
      A11037Bros_sa4 = httpContext.getMessage( "N", "") ;
      n11037Bros_sa4 = false ;
      A11038Bros_sa5 = httpContext.getMessage( "N", "") ;
      n11038Bros_sa5 = false ;
      A11039Bros_sa6 = httpContext.getMessage( "N", "") ;
      n11039Bros_sa6 = false ;
      A11040Bros_c10 = " " ;
      n11040Bros_c10 = false ;
      A11069Bros_c11 = " " ;
      n11069Bros_c11 = false ;
      A11070Bros_c12 = " " ;
      n11070Bros_c12 = false ;
      A11066Bros_stk = httpContext.getMessage( "N", "") ;
      n11066Bros_stk = false ;
      A11067Bros_Lbta = " " ;
      n11067Bros_Lbta = false ;
      A11068Bros_Lbtp = (short)(0) ;
      n11068Bros_Lbtp = false ;
      A11381Bros_lavad = " " ;
      n11381Bros_lavad = false ;
      A11382Bros_luz = " " ;
      n11382Bros_luz = false ;
      A11383Bros_sudor = " " ;
      n11383Bros_sudor = false ;
      A11384Bros_cloro = " " ;
      n11384Bros_cloro = false ;
      A11385Bros_aguam = " " ;
      n11385Bros_aguam = false ;
      A11386Bros_termo = " " ;
      n11386Bros_termo = false ;
      A11380Bros_oekot = httpContext.getMessage( "N", "") ;
      n11380Bros_oekot = false ;
      A11369Bros_imp1 = httpContext.getMessage( "S", "") ;
      n11369Bros_imp1 = false ;
      A11370Bros_imp2 = httpContext.getMessage( "S", "") ;
      n11370Bros_imp2 = false ;
      A11371Bros_imp3 = httpContext.getMessage( "S", "") ;
      n11371Bros_imp3 = false ;
      A11372Bros_imp4 = httpContext.getMessage( "S", "") ;
      n11372Bros_imp4 = false ;
      A11373Bros_imp5 = httpContext.getMessage( "S", "") ;
      n11373Bros_imp5 = false ;
      A11374Bros_imp6 = httpContext.getMessage( "S", "") ;
      n11374Bros_imp6 = false ;
      A11375Bros_imp7 = httpContext.getMessage( "S", "") ;
      n11375Bros_imp7 = false ;
      A11376Bros_imp8 = httpContext.getMessage( "S", "") ;
      n11376Bros_imp8 = false ;
      A11377Bros_imp9 = httpContext.getMessage( "S", "") ;
      n11377Bros_imp9 = false ;
      A11378Bros_imp10 = httpContext.getMessage( "S", "") ;
      n11378Bros_imp10 = false ;
      A11379Bros_imp11 = httpContext.getMessage( "S", "") ;
      n11379Bros_imp11 = false ;
      A11407Bros_obs1 = httpContext.getMessage( "S", "") ;
      n11407Bros_obs1 = false ;
      A11408Bros_obs2 = httpContext.getMessage( "S", "") ;
      n11408Bros_obs2 = false ;
      A11409Bros_obs3 = httpContext.getMessage( "S", "") ;
      n11409Bros_obs3 = false ;
      A11410Bros_obs4 = httpContext.getMessage( "S", "") ;
      n11410Bros_obs4 = false ;
      A11411Bros_obs5 = httpContext.getMessage( "S", "") ;
      n11411Bros_obs5 = false ;
      A11412Bros_obs6 = httpContext.getMessage( "S", "") ;
      n11412Bros_obs6 = false ;
      A11413Bros_obs7 = httpContext.getMessage( "S", "") ;
      n11413Bros_obs7 = false ;
      A11414Bros_obs8 = httpContext.getMessage( "S", "") ;
      n11414Bros_obs8 = false ;
      A11415Bros_obs9 = httpContext.getMessage( "S", "") ;
      n11415Bros_obs9 = false ;
      A11416Bros_obs10 = httpContext.getMessage( "S", "") ;
      n11416Bros_obs10 = false ;
      A11417Bros_obs11 = httpContext.getMessage( "S", "") ;
      n11417Bros_obs11 = false ;
      /* Using cursor P04BI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10978Bros_Art, Boolean.valueOf(n10979Bros_Mcot), A10979Bros_Mcot, Boolean.valueOf(n10980Bros_Pd), A10980Bros_Pd, Boolean.valueOf(n10981Bros_Pp), A10981Bros_Pp, Boolean.valueOf(n10982Bros_Ag), A10982Bros_Ag, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n10983Bros_c1), A10983Bros_c1, Boolean.valueOf(n10984Bros_c2), A10984Bros_c2, Boolean.valueOf(n10985Bros_bo), A10985Bros_bo, Boolean.valueOf(n10986Bros_bob), A10986Bros_bob, Boolean.valueOf(n10987Bros_boe), A10987Bros_boe, Boolean.valueOf(n10988BrosBov), A10988BrosBov, Boolean.valueOf(n10989Bros_c3), A10989Bros_c3, Boolean.valueOf(n10990Bros_tns), A10990Bros_tns, Boolean.valueOf(n10991Bros_tnc), A10991Bros_tnc, Boolean.valueOf(n10992Bros_c4), A10992Bros_c4, Boolean.valueOf(n10993Bros_ct), A10993Bros_ct, Boolean.valueOf(n10994Bros_c5), A10994Bros_c5, Boolean.valueOf(n10995Bros_scs), A10995Bros_scs, Boolean.valueOf(n10996Bros_scc), A10996Bros_scc, Boolean.valueOf(n10997Bros_c6), A10997Bros_c6, Boolean.valueOf(n10998Bros_cctse), A10998Bros_cctse, Boolean.valueOf(n10999Bros_ccttp), A10999Bros_ccttp, Boolean.valueOf(n11000Bros_cctet), A11000Bros_cctet, Boolean.valueOf(n11001Bros_ccp), Byte.valueOf(A11001Bros_ccp), Boolean.valueOf(n11002Bros_cct), Byte.valueOf(A11002Bros_cct), Boolean.valueOf(n11003Bros_ccpc), A11003Bros_ccpc, Boolean.valueOf(n11004Bros_cctq), A11004Bros_cctq, Boolean.valueOf(n11005Bros_cccc), A11005Bros_cccc, Boolean.valueOf(n11006Bros_ccec), A11006Bros_ccec, Boolean.valueOf(n11008Bros_ccmc1), A11008Bros_ccmc1, Boolean.valueOf(n11009Bros_ccmc2), A11009Bros_ccmc2, Boolean.valueOf(n11010Bros_ccmc3), A11010Bros_ccmc3, Boolean.valueOf(n11011Bros_ccmc4), A11011Bros_ccmc4, Boolean.valueOf(n11012Bros_ccmc5), A11012Bros_ccmc5, Boolean.valueOf(n11013Bros_ccmc6), A11013Bros_ccmc6, Boolean.valueOf(n11014Bros_c7), A11014Bros_c7, Boolean.valueOf(n11015Bros_rb), A11015Bros_rb, Boolean.valueOf(n11016Bros_rbi), A11016Bros_rbi, Boolean.valueOf(n11017Bros_rbe), A11017Bros_rbe, Boolean.valueOf(n11018Bros_rbp), A11018Bros_rbp, Boolean.valueOf(n11019Bros_rboc), Short.valueOf(A11019Bros_rboc), Boolean.valueOf(n11020Bros_rb1), A11020Bros_rb1, Boolean.valueOf(n11021Bros_rb3), A11021Bros_rb3, Boolean.valueOf(n11022Bros_c8), A11022Bros_c8, Boolean.valueOf(n11023Bros_ep1), A11023Bros_ep1, Boolean.valueOf(n11024Bros_ep2), A11024Bros_ep2, Boolean.valueOf(n11025Bros_ep3), A11025Bros_ep3, Boolean.valueOf(n11026Bros_ep4), A11026Bros_ep4, Boolean.valueOf(n11027Bros_ep5), A11027Bros_ep5, Boolean.valueOf(n11028Bros_ep6), A11028Bros_ep6, Boolean.valueOf(n11029Bros_ep7), A11029Bros_ep7, Boolean.valueOf(n11030Bros_ep8), A11030Bros_ep8, Boolean.valueOf(n11031Bros_ep9), A11031Bros_ep9, Boolean.valueOf(n11032Bros_ep10), A11032Bros_ep10, Boolean.valueOf(n11033Bros_c9), A11033Bros_c9, Boolean.valueOf(n11034Bros_sa1), A11034Bros_sa1, Boolean.valueOf(n11035Bros_sa2), A11035Bros_sa2, Boolean.valueOf(n11036Bros_sa3), A11036Bros_sa3, Boolean.valueOf(n11037Bros_sa4), A11037Bros_sa4, Boolean.valueOf(n11038Bros_sa5),
      A11038Bros_sa5, Boolean.valueOf(n11039Bros_sa6), A11039Bros_sa6, Boolean.valueOf(n11040Bros_c10), A11040Bros_c10, Boolean.valueOf(n11066Bros_stk), A11066Bros_stk, Boolean.valueOf(n11067Bros_Lbta), A11067Bros_Lbta, Boolean.valueOf(n11068Bros_Lbtp), Short.valueOf(A11068Bros_Lbtp), Boolean.valueOf(n11069Bros_c11), A11069Bros_c11, Boolean.valueOf(n11070Bros_c12), A11070Bros_c12, Boolean.valueOf(n11369Bros_imp1), A11369Bros_imp1, Boolean.valueOf(n11370Bros_imp2), A11370Bros_imp2, Boolean.valueOf(n11371Bros_imp3), A11371Bros_imp3, Boolean.valueOf(n11372Bros_imp4), A11372Bros_imp4, Boolean.valueOf(n11373Bros_imp5), A11373Bros_imp5, Boolean.valueOf(n11374Bros_imp6), A11374Bros_imp6, Boolean.valueOf(n11375Bros_imp7), A11375Bros_imp7, Boolean.valueOf(n11376Bros_imp8), A11376Bros_imp8, Boolean.valueOf(n11377Bros_imp9), A11377Bros_imp9, Boolean.valueOf(n11378Bros_imp10), A11378Bros_imp10, Boolean.valueOf(n11379Bros_imp11), A11379Bros_imp11, Boolean.valueOf(n11380Bros_oekot), A11380Bros_oekot, Boolean.valueOf(n11381Bros_lavad), A11381Bros_lavad, Boolean.valueOf(n11382Bros_luz), A11382Bros_luz, Boolean.valueOf(n11383Bros_sudor), A11383Bros_sudor, Boolean.valueOf(n11384Bros_cloro), A11384Bros_cloro, Boolean.valueOf(n11385Bros_aguam), A11385Bros_aguam, Boolean.valueOf(n11386Bros_termo), A11386Bros_termo, Boolean.valueOf(n11407Bros_obs1), A11407Bros_obs1, Boolean.valueOf(n11408Bros_obs2), A11408Bros_obs2, Boolean.valueOf(n11409Bros_obs3), A11409Bros_obs3, Boolean.valueOf(n11410Bros_obs4), A11410Bros_obs4, Boolean.valueOf(n11411Bros_obs5), A11411Bros_obs5, Boolean.valueOf(n11412Bros_obs6), A11412Bros_obs6, Boolean.valueOf(n11413Bros_obs7), A11413Bros_obs7, Boolean.valueOf(n11414Bros_obs8), A11414Bros_obs8, Boolean.valueOf(n11415Bros_obs9), A11415Bros_obs9, Boolean.valueOf(n11416Bros_obs10), A11416Bros_obs10, Boolean.valueOf(n11417Bros_obs11), A11417Bros_obs11});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTBRS");
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
      /* End Insert */
   }

   protected void cleanup( )
   {
      this.aP0[0] = partbrs.this.A396EmprCod;
      this.aP1[0] = partbrs.this.AV9Clicod;
      this.aP2[0] = partbrs.this.AV10ARtCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "partbrs");
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
      P04BI2_A396EmprCod = new String[] {""} ;
      P04BI2_A10978Bros_Art = new String[] {""} ;
      P04BI2_A252CliCod = new int[1] ;
      A10978Bros_Art = "" ;
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
      A11381Bros_lavad = "" ;
      A11382Bros_luz = "" ;
      A11383Bros_sudor = "" ;
      A11384Bros_cloro = "" ;
      A11385Bros_aguam = "" ;
      A11386Bros_termo = "" ;
      A11380Bros_oekot = "" ;
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
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partbrs__default(),
         new Object[] {
             new Object[] {
            P04BI2_A396EmprCod, P04BI2_A10978Bros_Art, P04BI2_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13GXLvl3 ;
   private byte A11001Bros_ccp ;
   private byte A11002Bros_cct ;
   private short A840TrnCod ;
   private short A11019Bros_rboc ;
   private short A11068Bros_Lbtp ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int A252CliCod ;
   private int GX_INS1467 ;
   private String A396EmprCod ;
   private String AV10ARtCod ;
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
   private String A11381Bros_lavad ;
   private String A11382Bros_luz ;
   private String A11383Bros_sudor ;
   private String A11384Bros_cloro ;
   private String A11385Bros_aguam ;
   private String A11386Bros_termo ;
   private String A11380Bros_oekot ;
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
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n10979Bros_Mcot ;
   private boolean n10980Bros_Pd ;
   private boolean n10981Bros_Pp ;
   private boolean n10982Bros_Ag ;
   private boolean n840TrnCod ;
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
   private boolean n11381Bros_lavad ;
   private boolean n11382Bros_luz ;
   private boolean n11383Bros_sudor ;
   private boolean n11384Bros_cloro ;
   private boolean n11385Bros_aguam ;
   private boolean n11386Bros_termo ;
   private boolean n11380Bros_oekot ;
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
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04BI2_A396EmprCod ;
   private String[] P04BI2_A10978Bros_Art ;
   private int[] P04BI2_A252CliCod ;
}

final  class partbrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04BI2", "SELECT EmprCod, Bros_Art, CliCod FROM TXPARTBRS WHERE EmprCod = ? and CliCod = ? and Bros_Art = ? ORDER BY EmprCod, CliCod, Bros_Art ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04BI3", "INSERT INTO TXPARTBRS(EmprCod, CliCod, Bros_Art, Bros_Mcot, Bros_Pd, Bros_Pp, Bros_Ag, TrnCod, Bros_c1, Bros_c2, Bros_bo, Bros_bob, Bros_boe, BrosBov, Bros_c3, Bros_tns, Bros_tnc, Bros_c4, Bros_ct, Bros_c5, Bros_scs, Bros_scc, Bros_c6, Bros_cctse, Bros_ccttp, Bros_cctet, Bros_ccp, Bros_cct, Bros_ccpc, Bros_cctq, Bros_cccc, Bros_ccec, Bros_ccmc1, Bros_ccmc2, Bros_ccmc3, Bros_ccmc4, Bros_ccmc5, Bros_ccmc6, Bros_c7, Bros_rb, Bros_rbi, Bros_rbe, Bros_rbp, Bros_rboc, Bros_rb1, Bros_rb3, Bros_c8, Bros_ep1, Bros_ep2, Bros_ep3, Bros_ep4, Bros_ep5, Bros_ep6, Bros_ep7, Bros_ep8, Bros_ep9, Bros_ep10, Bros_c9, Bros_sa1, Bros_sa2, Bros_sa3, Bros_sa4, Bros_sa5, Bros_sa6, Bros_c10, Bros_stk, Bros_Lbta, Bros_Lbtp, Bros_c11, Bros_c12, Bros_imp1, Bros_imp2, Bros_imp3, Bros_imp4, Bros_imp5, Bros_imp6, Bros_imp7, Bros_imp8, Bros_imp9, Bros_imp10, Bros_imp11, Bros_oekot, Bros_lavad, Bros_luz, Bros_sudor, Bros_cloro, Bros_aguam, Bros_termo, Bros_obs1, Bros_obs2, Bros_obs3, Bros_obs4, Bros_obs5, Bros_obs6, Bros_obs7, Bros_obs8, Bros_obs9, Bros_obs10, Bros_obs11, Bros_humed, Bros_nc, Bros_enc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTBRS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 200);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 200);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 200);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 200);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 200);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[42], 200);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[46], 1);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[48], 1);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[50]).byteValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[52]).byteValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[54], 1);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[58], 1);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[60], 1);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[62], 1);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[66], 1);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[68], 1);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[70], 1);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[72], 1);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[74], 200);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[76], 1);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[78], 1);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[80], 1);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[82], 1);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[84]).shortValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[86], 1);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[88], 1);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[90], 200);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[92], 1);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[94], 1);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[96], 1);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[98], 1);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[100], 1);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[102], 1);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[104], 1);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[106], 1);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[108], 1);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[110], 1);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(58, (String)parms[112], 200);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[114], 1);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[116], 1);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[118], 1);
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[120], 1);
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[122], 1);
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[124], 1);
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(65, (String)parms[126], 200);
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(66, (String)parms[128], 1);
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[130], 40);
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(68, ((Number) parms[132]).shortValue());
               }
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(69, (String)parms[134], 200);
               }
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(70, (String)parms[136], 200);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[138], 1);
               }
               if ( ((Boolean) parms[139]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[140], 1);
               }
               if ( ((Boolean) parms[141]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[142], 1);
               }
               if ( ((Boolean) parms[143]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[144], 1);
               }
               if ( ((Boolean) parms[145]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[146], 1);
               }
               if ( ((Boolean) parms[147]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[148], 1);
               }
               if ( ((Boolean) parms[149]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[150], 1);
               }
               if ( ((Boolean) parms[151]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[152], 1);
               }
               if ( ((Boolean) parms[153]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[154], 1);
               }
               if ( ((Boolean) parms[155]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[156], 1);
               }
               if ( ((Boolean) parms[157]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[158], 1);
               }
               if ( ((Boolean) parms[159]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[160], 1);
               }
               if ( ((Boolean) parms[161]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[162], 10);
               }
               if ( ((Boolean) parms[163]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(84, (String)parms[164], 10);
               }
               if ( ((Boolean) parms[165]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[166], 10);
               }
               if ( ((Boolean) parms[167]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[168], 10);
               }
               if ( ((Boolean) parms[169]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[170], 10);
               }
               if ( ((Boolean) parms[171]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[172], 10);
               }
               if ( ((Boolean) parms[173]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[174], 1);
               }
               if ( ((Boolean) parms[175]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[176], 1);
               }
               if ( ((Boolean) parms[177]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[178], 1);
               }
               if ( ((Boolean) parms[179]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[180], 1);
               }
               if ( ((Boolean) parms[181]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[182], 1);
               }
               if ( ((Boolean) parms[183]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[184], 1);
               }
               if ( ((Boolean) parms[185]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[186], 1);
               }
               if ( ((Boolean) parms[187]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[188], 1);
               }
               if ( ((Boolean) parms[189]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[190], 1);
               }
               if ( ((Boolean) parms[191]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[192], 1);
               }
               if ( ((Boolean) parms[193]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(99, (String)parms[194], 1);
               }
               return;
      }
   }

}

