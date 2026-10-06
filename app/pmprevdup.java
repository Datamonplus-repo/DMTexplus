package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmprevdup extends GXProcedure
{
   public pmprevdup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmprevdup.class ), "" );
   }

   public pmprevdup( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pmprevdup.this.aP2 = new String[] {""};
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
      pmprevdup.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmprevdup.this.AV10PmCodIn = aP1[0];
      this.aP1 = aP1;
      pmprevdup.this.AV9Maqcod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV8PMCodOut ;
      GXv_int2[0] = GXt_int1 ;
      new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MNTPRE", ""), GXv_int2) ;
      pmprevdup.this.GXt_int1 = GXv_int2[0] ;
      AV8PMCodOut = GXt_int1 ;
      /* Using cursor P05692 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10PmCodIn)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9478PMEst = P05692_A9478PMEst[0] ;
         n9478PMEst = P05692_n9478PMEst[0] ;
         A9476PMMaqCod = P05692_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P05692_n9476PMMaqCod[0] ;
         A9429PMCod = P05692_A9429PMCod[0] ;
         A14274PMTieMto = P05692_A14274PMTieMto[0] ;
         n14274PMTieMto = P05692_n14274PMTieMto[0] ;
         A14271PMTipoID = P05692_A14271PMTipoID[0] ;
         A14275PMDiasPavi = P05692_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P05692_n14275PMDiasPavi[0] ;
         A13013PMUsoMts = P05692_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P05692_n13013PMUsoMts[0] ;
         A11456PMPla = P05692_A11456PMPla[0] ;
         A11455PMTie = P05692_A11455PMTie[0] ;
         A11454PMUso = P05692_A11454PMUso[0] ;
         n11454PMUso = P05692_n11454PMUso[0] ;
         A9488PMOrd = P05692_A9488PMOrd[0] ;
         n9488PMOrd = P05692_n9488PMOrd[0] ;
         A9487PMDias = P05692_A9487PMDias[0] ;
         n9487PMDias = P05692_n9487PMDias[0] ;
         A9486PMUlt = P05692_A9486PMUlt[0] ;
         n9486PMUlt = P05692_n9486PMUlt[0] ;
         A9485PMFin = P05692_A9485PMFin[0] ;
         n9485PMFin = P05692_n9485PMFin[0] ;
         A9484PMIni = P05692_A9484PMIni[0] ;
         n9484PMIni = P05692_n9484PMIni[0] ;
         A9483PMTxt = P05692_A9483PMTxt[0] ;
         n9483PMTxt = P05692_n9483PMTxt[0] ;
         A9475PMUsuCre = P05692_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P05692_n9475PMUsuCre[0] ;
         A9474PMFchCre = P05692_A9474PMFchCre[0] ;
         n9474PMFchCre = P05692_n9474PMFchCre[0] ;
         A9473PMDsc = P05692_A9473PMDsc[0] ;
         n9473PMDsc = P05692_n9473PMDsc[0] ;
         W396EmprCod = A396EmprCod ;
         W9429PMCod = A9429PMCod ;
         /*
            INSERT RECORD ON TABLE TXPMPREVE

         */
         W396EmprCod = A396EmprCod ;
         W9429PMCod = A9429PMCod ;
         W9478PMEst = A9478PMEst ;
         n9478PMEst = false ;
         W9476PMMaqCod = A9476PMMaqCod ;
         n9476PMMaqCod = false ;
         A9429PMCod = AV8PMCodOut ;
         A9478PMEst = httpContext.getMessage( "A", "") ;
         n9478PMEst = false ;
         A9476PMMaqCod = AV9Maqcod ;
         n9476PMMaqCod = false ;
         /* Using cursor P05693 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod), Boolean.valueOf(n9473PMDsc), A9473PMDsc, Boolean.valueOf(n9474PMFchCre), A9474PMFchCre, Boolean.valueOf(n9475PMUsuCre), A9475PMUsuCre, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod, Boolean.valueOf(n9478PMEst), A9478PMEst, Boolean.valueOf(n9483PMTxt), A9483PMTxt, Boolean.valueOf(n9484PMIni), A9484PMIni, Boolean.valueOf(n9485PMFin), A9485PMFin, Boolean.valueOf(n9486PMUlt), A9486PMUlt, Boolean.valueOf(n9487PMDias), Short.valueOf(A9487PMDias), Boolean.valueOf(n9488PMOrd), Integer.valueOf(A9488PMOrd), Boolean.valueOf(n11454PMUso), A11454PMUso, A11455PMTie, A11456PMPla, Boolean.valueOf(n13013PMUsoMts), A13013PMUsoMts, Boolean.valueOf(n14275PMDiasPavi), Short.valueOf(A14275PMDiasPavi), Short.valueOf(A14271PMTipoID), Boolean.valueOf(n14274PMTieMto), A14274PMTieMto});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
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
         A9429PMCod = W9429PMCod ;
         A9478PMEst = W9478PMEst ;
         n9478PMEst = false ;
         A9476PMMaqCod = W9476PMMaqCod ;
         n9476PMMaqCod = false ;
         /* End Insert */
         /* Using cursor P05694 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9491PMRRCnt = P05694_A9491PMRRCnt[0] ;
            A9489PMRepCod = P05694_A9489PMRepCod[0] ;
            W396EmprCod = A396EmprCod ;
            W9429PMCod = A9429PMCod ;
            /*
               INSERT RECORD ON TABLE TXPMPreRe

            */
            W396EmprCod = A396EmprCod ;
            W9429PMCod = A9429PMCod ;
            W9489PMRepCod = A9489PMRepCod ;
            A9429PMCod = AV8PMCodOut ;
            /* Using cursor P05695 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod), Integer.valueOf(A9489PMRepCod), A9491PMRRCnt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPreRe");
            if ( (pr_default.getStatus(3) == 1) )
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
            A9429PMCod = W9429PMCod ;
            A9489PMRepCod = W9489PMRepCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A9429PMCod = W9429PMCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P05696 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A11452PMMPieCod = P05696_A11452PMMPieCod[0] ;
            A11451PMMSEqCod = P05696_A11451PMMSEqCod[0] ;
            A11450PMMEquCod = P05696_A11450PMMEquCod[0] ;
            W396EmprCod = A396EmprCod ;
            W9429PMCod = A9429PMCod ;
            /*
               INSERT RECORD ON TABLE TXPMPrev2

            */
            W396EmprCod = A396EmprCod ;
            W9429PMCod = A9429PMCod ;
            W11450PMMEquCod = A11450PMMEquCod ;
            W11451PMMSEqCod = A11451PMMSEqCod ;
            W11452PMMPieCod = A11452PMMPieCod ;
            A9429PMCod = AV8PMCodOut ;
            /* Using cursor P05697 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod), A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev2");
            if ( (pr_default.getStatus(5) == 1) )
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
            A9429PMCod = W9429PMCod ;
            A11450PMMEquCod = W11450PMMEquCod ;
            A11451PMMSEqCod = W11451PMMSEqCod ;
            A11452PMMPieCod = W11452PMMPieCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A9429PMCod = W9429PMCod ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P05698 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A9479PMTCod = P05698_A9479PMTCod[0] ;
            W396EmprCod = A396EmprCod ;
            W9429PMCod = A9429PMCod ;
            /*
               INSERT RECORD ON TABLE TXPMPrev3

            */
            W396EmprCod = A396EmprCod ;
            W9429PMCod = A9429PMCod ;
            W9479PMTCod = A9479PMTCod ;
            A9429PMCod = AV8PMCodOut ;
            /* Using cursor P05699 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev3");
            if ( (pr_default.getStatus(7) == 1) )
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
            A9429PMCod = W9429PMCod ;
            A9479PMTCod = W9479PMTCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A9429PMCod = W9429PMCod ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Using cursor P056910 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A11457PMOpeTie = P056910_A11457PMOpeTie[0] ;
            A9481PMOpeRes = P056910_A9481PMOpeRes[0] ;
            W396EmprCod = A396EmprCod ;
            W9429PMCod = A9429PMCod ;
            /*
               INSERT RECORD ON TABLE TXPMPrev1

            */
            W396EmprCod = A396EmprCod ;
            W9429PMCod = A9429PMCod ;
            W9481PMOpeRes = A9481PMOpeRes ;
            A9429PMCod = AV8PMCodOut ;
            /* Using cursor P056911 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod), Integer.valueOf(A9481PMOpeRes), A11457PMOpeTie});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev1");
            if ( (pr_default.getStatus(9) == 1) )
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
            A9429PMCod = W9429PMCod ;
            A9481PMOpeRes = W9481PMOpeRes ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A9429PMCod = W9429PMCod ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         A396EmprCod = W396EmprCod ;
         A9429PMCod = W9429PMCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmprevdup.this.A396EmprCod;
      this.aP1[0] = pmprevdup.this.AV10PmCodIn;
      this.aP2[0] = pmprevdup.this.AV9Maqcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmprevdup");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      scmdbuf = "" ;
      P05692_A396EmprCod = new String[] {""} ;
      P05692_A9478PMEst = new String[] {""} ;
      P05692_n9478PMEst = new boolean[] {false} ;
      P05692_A9476PMMaqCod = new String[] {""} ;
      P05692_n9476PMMaqCod = new boolean[] {false} ;
      P05692_A9429PMCod = new int[1] ;
      P05692_A14274PMTieMto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05692_n14274PMTieMto = new boolean[] {false} ;
      P05692_A14271PMTipoID = new short[1] ;
      P05692_A14275PMDiasPavi = new short[1] ;
      P05692_n14275PMDiasPavi = new boolean[] {false} ;
      P05692_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05692_n13013PMUsoMts = new boolean[] {false} ;
      P05692_A11456PMPla = new String[] {""} ;
      P05692_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05692_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05692_n11454PMUso = new boolean[] {false} ;
      P05692_A9488PMOrd = new int[1] ;
      P05692_n9488PMOrd = new boolean[] {false} ;
      P05692_A9487PMDias = new short[1] ;
      P05692_n9487PMDias = new boolean[] {false} ;
      P05692_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P05692_n9486PMUlt = new boolean[] {false} ;
      P05692_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P05692_n9485PMFin = new boolean[] {false} ;
      P05692_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P05692_n9484PMIni = new boolean[] {false} ;
      P05692_A9483PMTxt = new String[] {""} ;
      P05692_n9483PMTxt = new boolean[] {false} ;
      P05692_A9475PMUsuCre = new String[] {""} ;
      P05692_n9475PMUsuCre = new boolean[] {false} ;
      P05692_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P05692_n9474PMFchCre = new boolean[] {false} ;
      P05692_A9473PMDsc = new String[] {""} ;
      P05692_n9473PMDsc = new boolean[] {false} ;
      A9478PMEst = "" ;
      A9476PMMaqCod = "" ;
      A14274PMTieMto = DecimalUtil.ZERO ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      A11456PMPla = "" ;
      A11455PMTie = DecimalUtil.ZERO ;
      A11454PMUso = DecimalUtil.ZERO ;
      A9486PMUlt = GXutil.nullDate() ;
      A9485PMFin = GXutil.nullDate() ;
      A9484PMIni = GXutil.nullDate() ;
      A9483PMTxt = "" ;
      A9475PMUsuCre = "" ;
      A9474PMFchCre = GXutil.nullDate() ;
      A9473PMDsc = "" ;
      W396EmprCod = "" ;
      W9478PMEst = "" ;
      W9476PMMaqCod = "" ;
      Gx_emsg = "" ;
      P05694_A396EmprCod = new String[] {""} ;
      P05694_A9429PMCod = new int[1] ;
      P05694_A9491PMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05694_A9489PMRepCod = new int[1] ;
      A9491PMRRCnt = DecimalUtil.ZERO ;
      P05696_A396EmprCod = new String[] {""} ;
      P05696_A9429PMCod = new int[1] ;
      P05696_A11452PMMPieCod = new String[] {""} ;
      P05696_A11451PMMSEqCod = new String[] {""} ;
      P05696_A11450PMMEquCod = new String[] {""} ;
      A11452PMMPieCod = "" ;
      A11451PMMSEqCod = "" ;
      A11450PMMEquCod = "" ;
      W11450PMMEquCod = "" ;
      W11451PMMSEqCod = "" ;
      W11452PMMPieCod = "" ;
      P05698_A396EmprCod = new String[] {""} ;
      P05698_A9429PMCod = new int[1] ;
      P05698_A9479PMTCod = new int[1] ;
      P056910_A396EmprCod = new String[] {""} ;
      P056910_A9429PMCod = new int[1] ;
      P056910_A11457PMOpeTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056910_A9481PMOpeRes = new int[1] ;
      A11457PMOpeTie = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmprevdup__default(),
         new Object[] {
             new Object[] {
            P05692_A396EmprCod, P05692_A9478PMEst, P05692_n9478PMEst, P05692_A9476PMMaqCod, P05692_n9476PMMaqCod, P05692_A9429PMCod, P05692_A14274PMTieMto, P05692_n14274PMTieMto, P05692_A14271PMTipoID, P05692_A14275PMDiasPavi,
            P05692_n14275PMDiasPavi, P05692_A13013PMUsoMts, P05692_n13013PMUsoMts, P05692_A11456PMPla, P05692_A11455PMTie, P05692_A11454PMUso, P05692_n11454PMUso, P05692_A9488PMOrd, P05692_n9488PMOrd, P05692_A9487PMDias,
            P05692_n9487PMDias, P05692_A9486PMUlt, P05692_n9486PMUlt, P05692_A9485PMFin, P05692_n9485PMFin, P05692_A9484PMIni, P05692_n9484PMIni, P05692_A9483PMTxt, P05692_n9483PMTxt, P05692_A9475PMUsuCre,
            P05692_n9475PMUsuCre, P05692_A9474PMFchCre, P05692_n9474PMFchCre, P05692_A9473PMDsc, P05692_n9473PMDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P05694_A396EmprCod, P05694_A9429PMCod, P05694_A9491PMRRCnt, P05694_A9489PMRepCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05696_A396EmprCod, P05696_A9429PMCod, P05696_A11452PMMPieCod, P05696_A11451PMMSEqCod, P05696_A11450PMMEquCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05698_A396EmprCod, P05698_A9429PMCod, P05698_A9479PMTCod
            }
            , new Object[] {
            }
            , new Object[] {
            P056910_A396EmprCod, P056910_A9429PMCod, P056910_A11457PMOpeTie, P056910_A9481PMOpeRes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A14271PMTipoID ;
   private short A14275PMDiasPavi ;
   private short A9487PMDias ;
   private short Gx_err ;
   private int AV10PmCodIn ;
   private int AV8PMCodOut ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int A9429PMCod ;
   private int A9488PMOrd ;
   private int W9429PMCod ;
   private int GX_INS1236 ;
   private int A9489PMRepCod ;
   private int GX_INS1237 ;
   private int W9489PMRepCod ;
   private int GX_INS1532 ;
   private int A9479PMTCod ;
   private int GX_INS1533 ;
   private int W9479PMTCod ;
   private int A9481PMOpeRes ;
   private int GX_INS1523 ;
   private int W9481PMOpeRes ;
   private java.math.BigDecimal A14274PMTieMto ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal A11455PMTie ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal A9491PMRRCnt ;
   private java.math.BigDecimal A11457PMOpeTie ;
   private String A396EmprCod ;
   private String AV9Maqcod ;
   private String scmdbuf ;
   private String A9478PMEst ;
   private String A9476PMMaqCod ;
   private String A11456PMPla ;
   private String A9475PMUsuCre ;
   private String A9473PMDsc ;
   private String W396EmprCod ;
   private String W9478PMEst ;
   private String W9476PMMaqCod ;
   private String Gx_emsg ;
   private String A11452PMMPieCod ;
   private String A11451PMMSEqCod ;
   private String A11450PMMEquCod ;
   private String W11450PMMEquCod ;
   private String W11451PMMSEqCod ;
   private String W11452PMMPieCod ;
   private java.util.Date A9486PMUlt ;
   private java.util.Date A9485PMFin ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9474PMFchCre ;
   private boolean n9478PMEst ;
   private boolean n9476PMMaqCod ;
   private boolean n14274PMTieMto ;
   private boolean n14275PMDiasPavi ;
   private boolean n13013PMUsoMts ;
   private boolean n11454PMUso ;
   private boolean n9488PMOrd ;
   private boolean n9487PMDias ;
   private boolean n9486PMUlt ;
   private boolean n9485PMFin ;
   private boolean n9484PMIni ;
   private boolean n9483PMTxt ;
   private boolean n9475PMUsuCre ;
   private boolean n9474PMFchCre ;
   private boolean n9473PMDsc ;
   private String A9483PMTxt ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05692_A396EmprCod ;
   private String[] P05692_A9478PMEst ;
   private boolean[] P05692_n9478PMEst ;
   private String[] P05692_A9476PMMaqCod ;
   private boolean[] P05692_n9476PMMaqCod ;
   private int[] P05692_A9429PMCod ;
   private java.math.BigDecimal[] P05692_A14274PMTieMto ;
   private boolean[] P05692_n14274PMTieMto ;
   private short[] P05692_A14271PMTipoID ;
   private short[] P05692_A14275PMDiasPavi ;
   private boolean[] P05692_n14275PMDiasPavi ;
   private java.math.BigDecimal[] P05692_A13013PMUsoMts ;
   private boolean[] P05692_n13013PMUsoMts ;
   private String[] P05692_A11456PMPla ;
   private java.math.BigDecimal[] P05692_A11455PMTie ;
   private java.math.BigDecimal[] P05692_A11454PMUso ;
   private boolean[] P05692_n11454PMUso ;
   private int[] P05692_A9488PMOrd ;
   private boolean[] P05692_n9488PMOrd ;
   private short[] P05692_A9487PMDias ;
   private boolean[] P05692_n9487PMDias ;
   private java.util.Date[] P05692_A9486PMUlt ;
   private boolean[] P05692_n9486PMUlt ;
   private java.util.Date[] P05692_A9485PMFin ;
   private boolean[] P05692_n9485PMFin ;
   private java.util.Date[] P05692_A9484PMIni ;
   private boolean[] P05692_n9484PMIni ;
   private String[] P05692_A9483PMTxt ;
   private boolean[] P05692_n9483PMTxt ;
   private String[] P05692_A9475PMUsuCre ;
   private boolean[] P05692_n9475PMUsuCre ;
   private java.util.Date[] P05692_A9474PMFchCre ;
   private boolean[] P05692_n9474PMFchCre ;
   private String[] P05692_A9473PMDsc ;
   private boolean[] P05692_n9473PMDsc ;
   private String[] P05694_A396EmprCod ;
   private int[] P05694_A9429PMCod ;
   private java.math.BigDecimal[] P05694_A9491PMRRCnt ;
   private int[] P05694_A9489PMRepCod ;
   private String[] P05696_A396EmprCod ;
   private int[] P05696_A9429PMCod ;
   private String[] P05696_A11452PMMPieCod ;
   private String[] P05696_A11451PMMSEqCod ;
   private String[] P05696_A11450PMMEquCod ;
   private String[] P05698_A396EmprCod ;
   private int[] P05698_A9429PMCod ;
   private int[] P05698_A9479PMTCod ;
   private String[] P056910_A396EmprCod ;
   private int[] P056910_A9429PMCod ;
   private java.math.BigDecimal[] P056910_A11457PMOpeTie ;
   private int[] P056910_A9481PMOpeRes ;
}

final  class pmprevdup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05692", "SELECT EmprCod, PMEst, PMMaqCod, PMCod, PMTieMto, PMTipoID, PMDiasPavi, PMUsoMts, PMPla, PMTie, PMUso, PMOrd, PMDias, PMUlt, PMFin, PMIni, PMTxt, PMUsuCre, PMFchCre, PMDsc FROM TXPMPREVE WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05693", "INSERT INTO TXPMPREVE(EmprCod, PMCod, PMDsc, PMFchCre, PMUsuCre, PMMaqCod, PMEst, PMTxt, PMIni, PMFin, PMUlt, PMDias, PMOrd, PMUso, PMTie, PMPla, PMUsoMts, PMDiasPavi, PMTipoID, PMTieMto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPREVE")
         ,new ForEachCursor("P05694", "SELECT EmprCod, PMCod, PMRRCnt, PMRepCod FROM TXPMPreRe WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMRepCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05695", "INSERT INTO TXPMPreRe(EmprCod, PMCod, PMRepCod, PMRRCnt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPreRe")
         ,new ForEachCursor("P05696", "SELECT EmprCod, PMCod, PMMPieCod, PMMSEqCod, PMMEquCod FROM TXPMPrev2 WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMMEquCod, PMMSEqCod, PMMPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05697", "INSERT INTO TXPMPrev2(EmprCod, PMCod, PMMEquCod, PMMSEqCod, PMMPieCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPrev2")
         ,new ForEachCursor("P05698", "SELECT EmprCod, PMCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05699", "INSERT INTO TXPMPrev3(EmprCod, PMCod, PMTCod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPrev3")
         ,new ForEachCursor("P056910", "SELECT EmprCod, PMCod, PMOpeTie, PMOpeRes FROM TXPMPrev1 WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMOpeRes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P056911", "INSERT INTO TXPMPrev1(EmprCod, PMCod, PMOpeRes, PMOpeTie) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPrev1")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 2000);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[25], 2);
               }
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[26], 2);
               stmt.setString(16, (String)parms[27], 1);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[31]).shortValue());
               }
               stmt.setShort(19, ((Number) parms[32]).shortValue());
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[34], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
      }
   }

}

