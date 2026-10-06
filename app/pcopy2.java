package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopy2 extends GXProcedure
{
   public pcopy2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopy2.class ), "" );
   }

   public pcopy2( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short[] executeUdp( String[] aP0 ,
                              int[] aP1 ,
                              short[] aP2 ,
                              String[] aP3 ,
                              short[] aP4 )
   {
      AV11Tab_tart = new short[1000] ;
      execute_int(aP0, aP1, aP2, aP3, aP4, AV11Tab_tart);
      return AV11Tab_tart;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        short[] AV11Tab_tart )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, AV11Tab_tart);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             short[] AV11Tab_tart )
   {
      pcopy2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopy2.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcopy2.this.A9713Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pcopy2.this.A11736CCArtCod = aP3[0];
      this.aP3 = aP3;
      pcopy2.this.AV10TipArtiId = aP4[0];
      this.aP4 = aP4;
      pcopy2.this.AV11Tab_tart = AV11Tab_tart;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12i = (short)(1) ;
      while ( AV12i <= 1000 )
      {
         if ( AV11Tab_tart[AV12i-1] == 0 )
         {
            if (true) break;
         }
         AV13TipARtcod = AV11Tab_tart[AV12i-1] ;
         /* Using cursor P04U52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(AV10TipArtiId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A11748TipArtiId = P04U52_A11748TipArtiId[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
            W11736CCArtCod = A11736CCArtCod ;
            W11748TipArtiId = A11748TipArtiId ;
            /*
               INSERT RECORD ON TABLE TXPCCCno1

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
            W11736CCArtCod = A11736CCArtCod ;
            W11748TipArtiId = A11748TipArtiId ;
            A11748TipArtiId = AV13TipARtcod ;
            /* Using cursor P04U53 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno1");
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
            A252CliCod = W252CliCod ;
            A9713Tb1_Cod = W9713Tb1_Cod ;
            A11736CCArtCod = W11736CCArtCod ;
            A11748TipArtiId = W11748TipArtiId ;
            /* End Insert */
            /* Using cursor P04U54 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A11749CCCTc = P04U54_A11749CCCTc[0] ;
               A11738CCColNum = P04U54_A11738CCColNum[0] ;
               A11737CCColNom = P04U54_A11737CCColNom[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W9713Tb1_Cod = A9713Tb1_Cod ;
               W11736CCArtCod = A11736CCArtCod ;
               W11748TipArtiId = A11748TipArtiId ;
               /*
                  INSERT RECORD ON TABLE TXPCCCno3

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W9713Tb1_Cod = A9713Tb1_Cod ;
               W11736CCArtCod = A11736CCArtCod ;
               W11748TipArtiId = A11748TipArtiId ;
               W11737CCColNom = A11737CCColNom ;
               W11738CCColNum = A11738CCColNum ;
               W11749CCCTc = A11749CCCTc ;
               A11748TipArtiId = AV13TipARtcod ;
               /* Using cursor P04U55 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno3");
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
               A252CliCod = W252CliCod ;
               A9713Tb1_Cod = W9713Tb1_Cod ;
               A11736CCArtCod = W11736CCArtCod ;
               A11748TipArtiId = W11748TipArtiId ;
               A11737CCColNom = W11737CCColNom ;
               A11738CCColNum = W11738CCColNum ;
               A11749CCCTc = W11749CCCTc ;
               /* End Insert */
               /* Using cursor P04U56 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A11750IntId = P04U56_A11750IntId[0] ;
                  W396EmprCod = A396EmprCod ;
                  W252CliCod = A252CliCod ;
                  W9713Tb1_Cod = A9713Tb1_Cod ;
                  W11736CCArtCod = A11736CCArtCod ;
                  W11748TipArtiId = A11748TipArtiId ;
                  W11737CCColNom = A11737CCColNom ;
                  W11738CCColNum = A11738CCColNum ;
                  W11749CCCTc = A11749CCCTc ;
                  /*
                     INSERT RECORD ON TABLE TXPCCCno4

                  */
                  W396EmprCod = A396EmprCod ;
                  W252CliCod = A252CliCod ;
                  W9713Tb1_Cod = A9713Tb1_Cod ;
                  W11736CCArtCod = A11736CCArtCod ;
                  W11748TipArtiId = A11748TipArtiId ;
                  W11737CCColNom = A11737CCColNom ;
                  W11738CCColNum = A11738CCColNum ;
                  W11749CCCTc = A11749CCCTc ;
                  W11750IntId = A11750IntId ;
                  A11748TipArtiId = AV13TipARtcod ;
                  /* Using cursor P04U57 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno4");
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
                  A252CliCod = W252CliCod ;
                  A9713Tb1_Cod = W9713Tb1_Cod ;
                  A11736CCArtCod = W11736CCArtCod ;
                  A11748TipArtiId = W11748TipArtiId ;
                  A11737CCColNom = W11737CCColNom ;
                  A11738CCColNum = W11738CCColNum ;
                  A11749CCCTc = W11749CCCTc ;
                  A11750IntId = W11750IntId ;
                  /* End Insert */
                  /* Using cursor P04U58 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A4031CCTCod = P04U58_A4031CCTCod[0] ;
                     W396EmprCod = A396EmprCod ;
                     W252CliCod = A252CliCod ;
                     W9713Tb1_Cod = A9713Tb1_Cod ;
                     W11736CCArtCod = A11736CCArtCod ;
                     W11748TipArtiId = A11748TipArtiId ;
                     W11737CCColNom = A11737CCColNom ;
                     W11738CCColNum = A11738CCColNum ;
                     W11749CCCTc = A11749CCCTc ;
                     W11750IntId = A11750IntId ;
                     /*
                        INSERT RECORD ON TABLE TXPCCCno5

                     */
                     W396EmprCod = A396EmprCod ;
                     W252CliCod = A252CliCod ;
                     W9713Tb1_Cod = A9713Tb1_Cod ;
                     W11736CCArtCod = A11736CCArtCod ;
                     W11748TipArtiId = A11748TipArtiId ;
                     W11737CCColNom = A11737CCColNom ;
                     W11738CCColNum = A11738CCColNum ;
                     W11749CCCTc = A11749CCCTc ;
                     W11750IntId = A11750IntId ;
                     W4031CCTCod = A4031CCTCod ;
                     A11748TipArtiId = AV13TipARtcod ;
                     /* Using cursor P04U59 */
                     pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno5");
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
                     A252CliCod = W252CliCod ;
                     A9713Tb1_Cod = W9713Tb1_Cod ;
                     A11736CCArtCod = W11736CCArtCod ;
                     A11748TipArtiId = W11748TipArtiId ;
                     A11737CCColNom = W11737CCColNom ;
                     A11738CCColNum = W11738CCColNum ;
                     A11749CCCTc = W11749CCCTc ;
                     A11750IntId = W11750IntId ;
                     A4031CCTCod = W4031CCTCod ;
                     /* End Insert */
                     /* Using cursor P04U510 */
                     pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
                     while ( (pr_default.getStatus(8) != 101) )
                     {
                        A11756CCSCObs2 = P04U510_A11756CCSCObs2[0] ;
                        n11756CCSCObs2 = P04U510_n11756CCSCObs2[0] ;
                        A11755CCSCCEns = P04U510_A11755CCSCCEns[0] ;
                        n11755CCSCCEns = P04U510_n11755CCSCCEns[0] ;
                        A11754CCSCPmm = P04U510_A11754CCSCPmm[0] ;
                        n11754CCSCPmm = P04U510_n11754CCSCPmm[0] ;
                        A11752CCSCObs = P04U510_A11752CCSCObs[0] ;
                        n11752CCSCObs = P04U510_n11752CCSCObs[0] ;
                        A11751CCSCNorma = P04U510_A11751CCSCNorma[0] ;
                        n11751CCSCNorma = P04U510_n11751CCSCNorma[0] ;
                        A11744CCSCTol = P04U510_A11744CCSCTol[0] ;
                        n11744CCSCTol = P04U510_n11744CCSCTol[0] ;
                        A11743CCSCVar = P04U510_A11743CCSCVar[0] ;
                        n11743CCSCVar = P04U510_n11743CCSCVar[0] ;
                        A11742CCSCAut = P04U510_A11742CCSCAut[0] ;
                        n11742CCSCAut = P04U510_n11742CCSCAut[0] ;
                        A11741CCSCMx = P04U510_A11741CCSCMx[0] ;
                        n11741CCSCMx = P04U510_n11741CCSCMx[0] ;
                        A11740CCSCMn = P04U510_A11740CCSCMn[0] ;
                        n11740CCSCMn = P04U510_n11740CCSCMn[0] ;
                        A11739CCSCVal = P04U510_A11739CCSCVal[0] ;
                        n11739CCSCVal = P04U510_n11739CCSCVal[0] ;
                        A4034CCTLin = P04U510_A4034CCTLin[0] ;
                        W396EmprCod = A396EmprCod ;
                        W252CliCod = A252CliCod ;
                        W9713Tb1_Cod = A9713Tb1_Cod ;
                        W11736CCArtCod = A11736CCArtCod ;
                        W11748TipArtiId = A11748TipArtiId ;
                        W11737CCColNom = A11737CCColNom ;
                        W11738CCColNum = A11738CCColNum ;
                        W11749CCCTc = A11749CCCTc ;
                        W11750IntId = A11750IntId ;
                        W4031CCTCod = A4031CCTCod ;
                        /*
                           INSERT RECORD ON TABLE TXPCCCNOS

                        */
                        W396EmprCod = A396EmprCod ;
                        W252CliCod = A252CliCod ;
                        W9713Tb1_Cod = A9713Tb1_Cod ;
                        W11736CCArtCod = A11736CCArtCod ;
                        W11748TipArtiId = A11748TipArtiId ;
                        W11737CCColNom = A11737CCColNom ;
                        W11738CCColNum = A11738CCColNum ;
                        W11749CCCTc = A11749CCCTc ;
                        W11750IntId = A11750IntId ;
                        W4031CCTCod = A4031CCTCod ;
                        W4034CCTLin = A4034CCTLin ;
                        A11748TipArtiId = AV13TipARtcod ;
                        /* Using cursor P04U511 */
                        pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Boolean.valueOf(n11739CCSCVal), A11739CCSCVal, Boolean.valueOf(n11740CCSCMn), A11740CCSCMn, Boolean.valueOf(n11741CCSCMx), A11741CCSCMx, Boolean.valueOf(n11742CCSCAut), Byte.valueOf(A11742CCSCAut), Boolean.valueOf(n11743CCSCVar), A11743CCSCVar, Boolean.valueOf(n11744CCSCTol), A11744CCSCTol, Boolean.valueOf(n11751CCSCNorma), A11751CCSCNorma, Boolean.valueOf(n11752CCSCObs), A11752CCSCObs, Boolean.valueOf(n11754CCSCPmm), A11754CCSCPmm, Boolean.valueOf(n11755CCSCCEns), A11755CCSCCEns, Boolean.valueOf(n11756CCSCObs2), A11756CCSCObs2});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCNOS");
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
                        A252CliCod = W252CliCod ;
                        A9713Tb1_Cod = W9713Tb1_Cod ;
                        A11736CCArtCod = W11736CCArtCod ;
                        A11748TipArtiId = W11748TipArtiId ;
                        A11737CCColNom = W11737CCColNom ;
                        A11738CCColNum = W11738CCColNum ;
                        A11749CCCTc = W11749CCCTc ;
                        A11750IntId = W11750IntId ;
                        A4031CCTCod = W4031CCTCod ;
                        A4034CCTLin = W4034CCTLin ;
                        /* End Insert */
                        A396EmprCod = W396EmprCod ;
                        A252CliCod = W252CliCod ;
                        A9713Tb1_Cod = W9713Tb1_Cod ;
                        A11736CCArtCod = W11736CCArtCod ;
                        A11748TipArtiId = W11748TipArtiId ;
                        A11737CCColNom = W11737CCColNom ;
                        A11738CCColNum = W11738CCColNum ;
                        A11749CCCTc = W11749CCCTc ;
                        A11750IntId = W11750IntId ;
                        A4031CCTCod = W4031CCTCod ;
                        pr_default.readNext(8);
                     }
                     pr_default.close(8);
                     A396EmprCod = W396EmprCod ;
                     A252CliCod = W252CliCod ;
                     A9713Tb1_Cod = W9713Tb1_Cod ;
                     A11736CCArtCod = W11736CCArtCod ;
                     A11748TipArtiId = W11748TipArtiId ;
                     A11737CCColNom = W11737CCColNom ;
                     A11738CCColNum = W11738CCColNum ;
                     A11749CCCTc = W11749CCCTc ;
                     A11750IntId = W11750IntId ;
                     pr_default.readNext(6);
                  }
                  pr_default.close(6);
                  A396EmprCod = W396EmprCod ;
                  A252CliCod = W252CliCod ;
                  A9713Tb1_Cod = W9713Tb1_Cod ;
                  A11736CCArtCod = W11736CCArtCod ;
                  A11748TipArtiId = W11748TipArtiId ;
                  A11737CCColNom = W11737CCColNom ;
                  A11738CCColNum = W11738CCColNum ;
                  A11749CCCTc = W11749CCCTc ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A9713Tb1_Cod = W9713Tb1_Cod ;
               A11736CCArtCod = W11736CCArtCod ;
               A11748TipArtiId = W11748TipArtiId ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A9713Tb1_Cod = W9713Tb1_Cod ;
            A11736CCArtCod = W11736CCArtCod ;
            A11748TipArtiId = W11748TipArtiId ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV12i = (short)(AV12i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopy2.this.A396EmprCod;
      this.aP1[0] = pcopy2.this.A252CliCod;
      this.aP2[0] = pcopy2.this.A9713Tb1_Cod;
      this.aP3[0] = pcopy2.this.A11736CCArtCod;
      this.aP4[0] = pcopy2.this.AV10TipArtiId;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopy2");
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
      P04U52_A396EmprCod = new String[] {""} ;
      P04U52_A252CliCod = new int[1] ;
      P04U52_A9713Tb1_Cod = new short[1] ;
      P04U52_A11736CCArtCod = new String[] {""} ;
      P04U52_A11748TipArtiId = new short[1] ;
      W396EmprCod = "" ;
      W11736CCArtCod = "" ;
      Gx_emsg = "" ;
      P04U54_A396EmprCod = new String[] {""} ;
      P04U54_A252CliCod = new int[1] ;
      P04U54_A9713Tb1_Cod = new short[1] ;
      P04U54_A11736CCArtCod = new String[] {""} ;
      P04U54_A11748TipArtiId = new short[1] ;
      P04U54_A11749CCCTc = new byte[1] ;
      P04U54_A11738CCColNum = new int[1] ;
      P04U54_A11737CCColNom = new String[] {""} ;
      A11737CCColNom = "" ;
      W11737CCColNom = "" ;
      P04U56_A396EmprCod = new String[] {""} ;
      P04U56_A252CliCod = new int[1] ;
      P04U56_A9713Tb1_Cod = new short[1] ;
      P04U56_A11736CCArtCod = new String[] {""} ;
      P04U56_A11748TipArtiId = new short[1] ;
      P04U56_A11737CCColNom = new String[] {""} ;
      P04U56_A11738CCColNum = new int[1] ;
      P04U56_A11749CCCTc = new byte[1] ;
      P04U56_A11750IntId = new short[1] ;
      P04U58_A396EmprCod = new String[] {""} ;
      P04U58_A252CliCod = new int[1] ;
      P04U58_A9713Tb1_Cod = new short[1] ;
      P04U58_A11736CCArtCod = new String[] {""} ;
      P04U58_A11748TipArtiId = new short[1] ;
      P04U58_A11737CCColNom = new String[] {""} ;
      P04U58_A11738CCColNum = new int[1] ;
      P04U58_A11749CCCTc = new byte[1] ;
      P04U58_A11750IntId = new short[1] ;
      P04U58_A4031CCTCod = new int[1] ;
      P04U510_A396EmprCod = new String[] {""} ;
      P04U510_A252CliCod = new int[1] ;
      P04U510_A9713Tb1_Cod = new short[1] ;
      P04U510_A11736CCArtCod = new String[] {""} ;
      P04U510_A11748TipArtiId = new short[1] ;
      P04U510_A11737CCColNom = new String[] {""} ;
      P04U510_A11738CCColNum = new int[1] ;
      P04U510_A11749CCCTc = new byte[1] ;
      P04U510_A11750IntId = new short[1] ;
      P04U510_A4031CCTCod = new int[1] ;
      P04U510_A11756CCSCObs2 = new String[] {""} ;
      P04U510_n11756CCSCObs2 = new boolean[] {false} ;
      P04U510_A11755CCSCCEns = new String[] {""} ;
      P04U510_n11755CCSCCEns = new boolean[] {false} ;
      P04U510_A11754CCSCPmm = new String[] {""} ;
      P04U510_n11754CCSCPmm = new boolean[] {false} ;
      P04U510_A11752CCSCObs = new String[] {""} ;
      P04U510_n11752CCSCObs = new boolean[] {false} ;
      P04U510_A11751CCSCNorma = new String[] {""} ;
      P04U510_n11751CCSCNorma = new boolean[] {false} ;
      P04U510_A11744CCSCTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04U510_n11744CCSCTol = new boolean[] {false} ;
      P04U510_A11743CCSCVar = new String[] {""} ;
      P04U510_n11743CCSCVar = new boolean[] {false} ;
      P04U510_A11742CCSCAut = new byte[1] ;
      P04U510_n11742CCSCAut = new boolean[] {false} ;
      P04U510_A11741CCSCMx = new String[] {""} ;
      P04U510_n11741CCSCMx = new boolean[] {false} ;
      P04U510_A11740CCSCMn = new String[] {""} ;
      P04U510_n11740CCSCMn = new boolean[] {false} ;
      P04U510_A11739CCSCVal = new String[] {""} ;
      P04U510_n11739CCSCVal = new boolean[] {false} ;
      P04U510_A4034CCTLin = new short[1] ;
      A11756CCSCObs2 = "" ;
      A11755CCSCCEns = "" ;
      A11754CCSCPmm = "" ;
      A11752CCSCObs = "" ;
      A11751CCSCNorma = "" ;
      A11744CCSCTol = DecimalUtil.ZERO ;
      A11743CCSCVar = "" ;
      A11741CCSCMx = "" ;
      A11740CCSCMn = "" ;
      A11739CCSCVal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopy2__default(),
         new Object[] {
             new Object[] {
            P04U52_A396EmprCod, P04U52_A252CliCod, P04U52_A9713Tb1_Cod, P04U52_A11736CCArtCod, P04U52_A11748TipArtiId
            }
            , new Object[] {
            }
            , new Object[] {
            P04U54_A396EmprCod, P04U54_A252CliCod, P04U54_A9713Tb1_Cod, P04U54_A11736CCArtCod, P04U54_A11748TipArtiId, P04U54_A11749CCCTc, P04U54_A11738CCColNum, P04U54_A11737CCColNom
            }
            , new Object[] {
            }
            , new Object[] {
            P04U56_A396EmprCod, P04U56_A252CliCod, P04U56_A9713Tb1_Cod, P04U56_A11736CCArtCod, P04U56_A11748TipArtiId, P04U56_A11737CCColNom, P04U56_A11738CCColNum, P04U56_A11749CCCTc, P04U56_A11750IntId
            }
            , new Object[] {
            }
            , new Object[] {
            P04U58_A396EmprCod, P04U58_A252CliCod, P04U58_A9713Tb1_Cod, P04U58_A11736CCArtCod, P04U58_A11748TipArtiId, P04U58_A11737CCColNom, P04U58_A11738CCColNum, P04U58_A11749CCCTc, P04U58_A11750IntId, P04U58_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04U510_A396EmprCod, P04U510_A252CliCod, P04U510_A9713Tb1_Cod, P04U510_A11736CCArtCod, P04U510_A11748TipArtiId, P04U510_A11737CCColNom, P04U510_A11738CCColNum, P04U510_A11749CCCTc, P04U510_A11750IntId, P04U510_A4031CCTCod,
            P04U510_A11756CCSCObs2, P04U510_n11756CCSCObs2, P04U510_A11755CCSCCEns, P04U510_n11755CCSCCEns, P04U510_A11754CCSCPmm, P04U510_n11754CCSCPmm, P04U510_A11752CCSCObs, P04U510_n11752CCSCObs, P04U510_A11751CCSCNorma, P04U510_n11751CCSCNorma,
            P04U510_A11744CCSCTol, P04U510_n11744CCSCTol, P04U510_A11743CCSCVar, P04U510_n11743CCSCVar, P04U510_A11742CCSCAut, P04U510_n11742CCSCAut, P04U510_A11741CCSCMx, P04U510_n11741CCSCMx, P04U510_A11740CCSCMn, P04U510_n11740CCSCMn,
            P04U510_A11739CCSCVal, P04U510_n11739CCSCVal, P04U510_A4034CCTLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11749CCCTc ;
   private byte W11749CCCTc ;
   private byte A11742CCSCAut ;
   private short A9713Tb1_Cod ;
   private short AV10TipArtiId ;
   private short AV12i ;
   private short AV13TipARtcod ;
   private short A11748TipArtiId ;
   private short W9713Tb1_Cod ;
   private short W11748TipArtiId ;
   private short Gx_err ;
   private short A11750IntId ;
   private short W11750IntId ;
   private short A4034CCTLin ;
   private short W4034CCTLin ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS1648 ;
   private int A11738CCColNum ;
   private int GX_INS1649 ;
   private int W11738CCColNum ;
   private int GX_INS1650 ;
   private int A4031CCTCod ;
   private int GX_INS1651 ;
   private int W4031CCTCod ;
   private int GX_INS1652 ;
   private java.math.BigDecimal A11744CCSCTol ;
   private String A396EmprCod ;
   private String A11736CCArtCod ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String W11736CCArtCod ;
   private String Gx_emsg ;
   private String A11737CCColNom ;
   private String W11737CCColNom ;
   private String A11756CCSCObs2 ;
   private String A11755CCSCCEns ;
   private String A11754CCSCPmm ;
   private String A11751CCSCNorma ;
   private String A11743CCSCVar ;
   private String A11741CCSCMx ;
   private String A11740CCSCMn ;
   private String A11739CCSCVal ;
   private boolean n11756CCSCObs2 ;
   private boolean n11755CCSCCEns ;
   private boolean n11754CCSCPmm ;
   private boolean n11752CCSCObs ;
   private boolean n11751CCSCNorma ;
   private boolean n11744CCSCTol ;
   private boolean n11743CCSCVar ;
   private boolean n11742CCSCAut ;
   private boolean n11741CCSCMx ;
   private boolean n11740CCSCMn ;
   private boolean n11739CCSCVal ;
   private String A11752CCSCObs ;
   private short[] AV11Tab_tart ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04U52_A396EmprCod ;
   private int[] P04U52_A252CliCod ;
   private short[] P04U52_A9713Tb1_Cod ;
   private String[] P04U52_A11736CCArtCod ;
   private short[] P04U52_A11748TipArtiId ;
   private String[] P04U54_A396EmprCod ;
   private int[] P04U54_A252CliCod ;
   private short[] P04U54_A9713Tb1_Cod ;
   private String[] P04U54_A11736CCArtCod ;
   private short[] P04U54_A11748TipArtiId ;
   private byte[] P04U54_A11749CCCTc ;
   private int[] P04U54_A11738CCColNum ;
   private String[] P04U54_A11737CCColNom ;
   private String[] P04U56_A396EmprCod ;
   private int[] P04U56_A252CliCod ;
   private short[] P04U56_A9713Tb1_Cod ;
   private String[] P04U56_A11736CCArtCod ;
   private short[] P04U56_A11748TipArtiId ;
   private String[] P04U56_A11737CCColNom ;
   private int[] P04U56_A11738CCColNum ;
   private byte[] P04U56_A11749CCCTc ;
   private short[] P04U56_A11750IntId ;
   private String[] P04U58_A396EmprCod ;
   private int[] P04U58_A252CliCod ;
   private short[] P04U58_A9713Tb1_Cod ;
   private String[] P04U58_A11736CCArtCod ;
   private short[] P04U58_A11748TipArtiId ;
   private String[] P04U58_A11737CCColNom ;
   private int[] P04U58_A11738CCColNum ;
   private byte[] P04U58_A11749CCCTc ;
   private short[] P04U58_A11750IntId ;
   private int[] P04U58_A4031CCTCod ;
   private String[] P04U510_A396EmprCod ;
   private int[] P04U510_A252CliCod ;
   private short[] P04U510_A9713Tb1_Cod ;
   private String[] P04U510_A11736CCArtCod ;
   private short[] P04U510_A11748TipArtiId ;
   private String[] P04U510_A11737CCColNom ;
   private int[] P04U510_A11738CCColNum ;
   private byte[] P04U510_A11749CCCTc ;
   private short[] P04U510_A11750IntId ;
   private int[] P04U510_A4031CCTCod ;
   private String[] P04U510_A11756CCSCObs2 ;
   private boolean[] P04U510_n11756CCSCObs2 ;
   private String[] P04U510_A11755CCSCCEns ;
   private boolean[] P04U510_n11755CCSCCEns ;
   private String[] P04U510_A11754CCSCPmm ;
   private boolean[] P04U510_n11754CCSCPmm ;
   private String[] P04U510_A11752CCSCObs ;
   private boolean[] P04U510_n11752CCSCObs ;
   private String[] P04U510_A11751CCSCNorma ;
   private boolean[] P04U510_n11751CCSCNorma ;
   private java.math.BigDecimal[] P04U510_A11744CCSCTol ;
   private boolean[] P04U510_n11744CCSCTol ;
   private String[] P04U510_A11743CCSCVar ;
   private boolean[] P04U510_n11743CCSCVar ;
   private byte[] P04U510_A11742CCSCAut ;
   private boolean[] P04U510_n11742CCSCAut ;
   private String[] P04U510_A11741CCSCMx ;
   private boolean[] P04U510_n11741CCSCMx ;
   private String[] P04U510_A11740CCSCMn ;
   private boolean[] P04U510_n11740CCSCMn ;
   private String[] P04U510_A11739CCSCVal ;
   private boolean[] P04U510_n11739CCSCVal ;
   private short[] P04U510_A4034CCTLin ;
}

final  class pcopy2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04U52", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId FROM TXPCCCno1 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04U53", "INSERT INTO TXPCCCno1(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno1")
         ,new ForEachCursor("P04U54", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCCTc, CCColNum, CCColNom FROM TXPCCCno3 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04U55", "INSERT INTO TXPCCCno3(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno3")
         ,new ForEachCursor("P04U56", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId FROM TXPCCCno4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04U57", "INSERT INTO TXPCCCno4(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno4")
         ,new ForEachCursor("P04U58", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? and IntId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04U59", "INSERT INTO TXPCCCno5(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno5")
         ,new ForEachCursor("P04U510", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCSCObs2, CCSCCEns, CCSCPmm, CCSCObs, CCSCNorma, CCSCTol, CCSCVar, CCSCAut, CCSCMx, CCSCMn, CCSCVal, CCTLin FROM TXPCCCNOS WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? and IntId = ? and CCTCod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04U511", "INSERT INTO TXPCCCNOS(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin, CCSCVal, CCSCMn, CCSCMx, CCSCAut, CCSCVar, CCSCTol, CCSCNorma, CCSCObs, CCSCPmm, CCSCCEns, CCSCObs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCNOS")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 40);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(20, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(21, 40);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(22);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[26], 600);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[28], 20);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[30], 100);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[32], 60);
               }
               return;
      }
   }

}

