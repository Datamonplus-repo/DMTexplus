package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcccnoe extends GXProcedure
{
   public pcccnoe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcccnoe.class ), "" );
   }

   public pcccnoe( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int[] executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            short[] aP2 )
   {
      AV20Tab_cli = new int[1000] ;
      execute_int(aP0, aP1, aP2, AV20Tab_cli);
      return AV20Tab_cli;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        int[] AV20Tab_cli )
   {
      execute_int(aP0, aP1, aP2, AV20Tab_cli);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] AV20Tab_cli )
   {
      pcccnoe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcccnoe.this.AV14CliCod = aP1[0];
      this.aP1 = aP1;
      pcccnoe.this.AV18Tb1_cod = aP2[0];
      this.aP2 = aP2;
      pcccnoe.this.AV20Tab_cli = AV20Tab_cli;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21i = (short)(1) ;
      while ( AV21i <= 1000 )
      {
         if ( AV20Tab_cli[AV21i-1] == 0 )
         {
            if (true) break;
         }
         AV15CliCodd = AV20Tab_cli[AV21i-1] ;
         if ( AV14CliCod != AV20Tab_cli[AV21i-1] )
         {
            Gx_msg = httpContext.getMessage( "Procesando.. ", "") + GXutil.str( AV15CliCodd, 6, 0) + " " + GXutil.str( AV18Tb1_cod, 4, 0) ;
            System.out.println( Gx_msg );
            /* Execute user subroutine: 'CC' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV21i = (short)(AV21i+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CC' Routine */
      returnInSub = false ;
      AV19Tabla4 = (byte)(0) ;
      /* Using cursor P04TQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCodd), Short.valueOf(AV18Tb1_cod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9713Tb1_Cod = P04TQ2_A9713Tb1_Cod[0] ;
         A252CliCod = P04TQ2_A252CliCod[0] ;
         AV19Tabla4 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV19Tabla4 == 1 )
      {
         /* Using cursor P04TQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9713Tb1_Cod = P04TQ3_A9713Tb1_Cod[0] ;
            A252CliCod = P04TQ3_A252CliCod[0] ;
            A11736CCArtCod = P04TQ3_A11736CCArtCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
            /*
               INSERT RECORD ON TABLE TXPCCCnoE

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
            W11736CCArtCod = A11736CCArtCod ;
            A252CliCod = AV15CliCodd ;
            A9713Tb1_Cod = AV18Tb1_cod ;
            /* Using cursor P04TQ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCnoE");
            if ( (pr_default.getStatus(2) == 1) )
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
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A9713Tb1_Cod = W9713Tb1_Cod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P04TQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A9713Tb1_Cod = P04TQ5_A9713Tb1_Cod[0] ;
            A252CliCod = P04TQ5_A252CliCod[0] ;
            A11748TipArtiId = P04TQ5_A11748TipArtiId[0] ;
            A11736CCArtCod = P04TQ5_A11736CCArtCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
            /*
               INSERT RECORD ON TABLE TXPCCCno1

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
            W11736CCArtCod = A11736CCArtCod ;
            W11748TipArtiId = A11748TipArtiId ;
            A252CliCod = AV15CliCodd ;
            A9713Tb1_Cod = AV18Tb1_cod ;
            /* Using cursor P04TQ6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno1");
            if ( (pr_default.getStatus(4) == 1) )
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
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A9713Tb1_Cod = W9713Tb1_Cod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P04TQ7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A9713Tb1_Cod = P04TQ7_A9713Tb1_Cod[0] ;
            A252CliCod = P04TQ7_A252CliCod[0] ;
            A11749CCCTc = P04TQ7_A11749CCCTc[0] ;
            A11738CCColNum = P04TQ7_A11738CCColNum[0] ;
            A11737CCColNom = P04TQ7_A11737CCColNom[0] ;
            A11748TipArtiId = P04TQ7_A11748TipArtiId[0] ;
            A11736CCArtCod = P04TQ7_A11736CCArtCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
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
            A252CliCod = AV15CliCodd ;
            A9713Tb1_Cod = AV18Tb1_cod ;
            /* Using cursor P04TQ8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno3");
            if ( (pr_default.getStatus(6) == 1) )
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
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A9713Tb1_Cod = W9713Tb1_Cod ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Using cursor P04TQ9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A9713Tb1_Cod = P04TQ9_A9713Tb1_Cod[0] ;
            A252CliCod = P04TQ9_A252CliCod[0] ;
            A11750IntId = P04TQ9_A11750IntId[0] ;
            A11749CCCTc = P04TQ9_A11749CCCTc[0] ;
            A11738CCColNum = P04TQ9_A11738CCColNum[0] ;
            A11737CCColNom = P04TQ9_A11737CCColNom[0] ;
            A11748TipArtiId = P04TQ9_A11748TipArtiId[0] ;
            A11736CCArtCod = P04TQ9_A11736CCArtCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
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
            A252CliCod = AV15CliCodd ;
            A9713Tb1_Cod = AV18Tb1_cod ;
            /* Using cursor P04TQ10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno4");
            if ( (pr_default.getStatus(8) == 1) )
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
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A9713Tb1_Cod = W9713Tb1_Cod ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Using cursor P04TQ11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A9713Tb1_Cod = P04TQ11_A9713Tb1_Cod[0] ;
            A252CliCod = P04TQ11_A252CliCod[0] ;
            A4031CCTCod = P04TQ11_A4031CCTCod[0] ;
            A11750IntId = P04TQ11_A11750IntId[0] ;
            A11749CCCTc = P04TQ11_A11749CCCTc[0] ;
            A11738CCColNum = P04TQ11_A11738CCColNum[0] ;
            A11737CCColNom = P04TQ11_A11737CCColNom[0] ;
            A11748TipArtiId = P04TQ11_A11748TipArtiId[0] ;
            A11736CCArtCod = P04TQ11_A11736CCArtCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
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
            A252CliCod = AV15CliCodd ;
            A9713Tb1_Cod = AV18Tb1_cod ;
            /* Using cursor P04TQ12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno5");
            if ( (pr_default.getStatus(10) == 1) )
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
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A9713Tb1_Cod = W9713Tb1_Cod ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Using cursor P04TQ13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A9713Tb1_Cod = P04TQ13_A9713Tb1_Cod[0] ;
            A252CliCod = P04TQ13_A252CliCod[0] ;
            A11756CCSCObs2 = P04TQ13_A11756CCSCObs2[0] ;
            n11756CCSCObs2 = P04TQ13_n11756CCSCObs2[0] ;
            A11755CCSCCEns = P04TQ13_A11755CCSCCEns[0] ;
            n11755CCSCCEns = P04TQ13_n11755CCSCCEns[0] ;
            A11754CCSCPmm = P04TQ13_A11754CCSCPmm[0] ;
            n11754CCSCPmm = P04TQ13_n11754CCSCPmm[0] ;
            A11752CCSCObs = P04TQ13_A11752CCSCObs[0] ;
            n11752CCSCObs = P04TQ13_n11752CCSCObs[0] ;
            A11751CCSCNorma = P04TQ13_A11751CCSCNorma[0] ;
            n11751CCSCNorma = P04TQ13_n11751CCSCNorma[0] ;
            A11744CCSCTol = P04TQ13_A11744CCSCTol[0] ;
            n11744CCSCTol = P04TQ13_n11744CCSCTol[0] ;
            A11743CCSCVar = P04TQ13_A11743CCSCVar[0] ;
            n11743CCSCVar = P04TQ13_n11743CCSCVar[0] ;
            A11742CCSCAut = P04TQ13_A11742CCSCAut[0] ;
            n11742CCSCAut = P04TQ13_n11742CCSCAut[0] ;
            A11741CCSCMx = P04TQ13_A11741CCSCMx[0] ;
            n11741CCSCMx = P04TQ13_n11741CCSCMx[0] ;
            A11740CCSCMn = P04TQ13_A11740CCSCMn[0] ;
            n11740CCSCMn = P04TQ13_n11740CCSCMn[0] ;
            A11739CCSCVal = P04TQ13_A11739CCSCVal[0] ;
            n11739CCSCVal = P04TQ13_n11739CCSCVal[0] ;
            A4034CCTLin = P04TQ13_A4034CCTLin[0] ;
            A4031CCTCod = P04TQ13_A4031CCTCod[0] ;
            A11750IntId = P04TQ13_A11750IntId[0] ;
            A11749CCCTc = P04TQ13_A11749CCCTc[0] ;
            A11738CCColNum = P04TQ13_A11738CCColNum[0] ;
            A11737CCColNom = P04TQ13_A11737CCColNom[0] ;
            A11748TipArtiId = P04TQ13_A11748TipArtiId[0] ;
            A11736CCArtCod = P04TQ13_A11736CCArtCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W9713Tb1_Cod = A9713Tb1_Cod ;
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
            A252CliCod = AV15CliCodd ;
            A9713Tb1_Cod = AV18Tb1_cod ;
            /* Using cursor P04TQ14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Boolean.valueOf(n11739CCSCVal), A11739CCSCVal, Boolean.valueOf(n11740CCSCMn), A11740CCSCMn, Boolean.valueOf(n11741CCSCMx), A11741CCSCMx, Boolean.valueOf(n11742CCSCAut), Byte.valueOf(A11742CCSCAut), Boolean.valueOf(n11743CCSCVar), A11743CCSCVar, Boolean.valueOf(n11744CCSCTol), A11744CCSCTol, Boolean.valueOf(n11751CCSCNorma), A11751CCSCNorma, Boolean.valueOf(n11752CCSCObs), A11752CCSCObs, Boolean.valueOf(n11754CCSCPmm), A11754CCSCPmm, Boolean.valueOf(n11755CCSCCEns), A11755CCSCCEns, Boolean.valueOf(n11756CCSCObs2), A11756CCSCObs2});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCNOS");
            if ( (pr_default.getStatus(12) == 1) )
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
            pr_default.readNext(11);
         }
         pr_default.close(11);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcccnoe.this.A396EmprCod;
      this.aP1[0] = pcccnoe.this.AV14CliCod;
      this.aP2[0] = pcccnoe.this.AV18Tb1_cod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcccnoe");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P04TQ2_A396EmprCod = new String[] {""} ;
      P04TQ2_A9713Tb1_Cod = new short[1] ;
      P04TQ2_A252CliCod = new int[1] ;
      P04TQ3_A396EmprCod = new String[] {""} ;
      P04TQ3_A9713Tb1_Cod = new short[1] ;
      P04TQ3_A252CliCod = new int[1] ;
      P04TQ3_A11736CCArtCod = new String[] {""} ;
      A11736CCArtCod = "" ;
      W396EmprCod = "" ;
      W11736CCArtCod = "" ;
      Gx_emsg = "" ;
      P04TQ5_A396EmprCod = new String[] {""} ;
      P04TQ5_A9713Tb1_Cod = new short[1] ;
      P04TQ5_A252CliCod = new int[1] ;
      P04TQ5_A11748TipArtiId = new short[1] ;
      P04TQ5_A11736CCArtCod = new String[] {""} ;
      P04TQ7_A396EmprCod = new String[] {""} ;
      P04TQ7_A9713Tb1_Cod = new short[1] ;
      P04TQ7_A252CliCod = new int[1] ;
      P04TQ7_A11749CCCTc = new byte[1] ;
      P04TQ7_A11738CCColNum = new int[1] ;
      P04TQ7_A11737CCColNom = new String[] {""} ;
      P04TQ7_A11748TipArtiId = new short[1] ;
      P04TQ7_A11736CCArtCod = new String[] {""} ;
      A11737CCColNom = "" ;
      W11737CCColNom = "" ;
      P04TQ9_A396EmprCod = new String[] {""} ;
      P04TQ9_A9713Tb1_Cod = new short[1] ;
      P04TQ9_A252CliCod = new int[1] ;
      P04TQ9_A11750IntId = new short[1] ;
      P04TQ9_A11749CCCTc = new byte[1] ;
      P04TQ9_A11738CCColNum = new int[1] ;
      P04TQ9_A11737CCColNom = new String[] {""} ;
      P04TQ9_A11748TipArtiId = new short[1] ;
      P04TQ9_A11736CCArtCod = new String[] {""} ;
      P04TQ11_A396EmprCod = new String[] {""} ;
      P04TQ11_A9713Tb1_Cod = new short[1] ;
      P04TQ11_A252CliCod = new int[1] ;
      P04TQ11_A4031CCTCod = new int[1] ;
      P04TQ11_A11750IntId = new short[1] ;
      P04TQ11_A11749CCCTc = new byte[1] ;
      P04TQ11_A11738CCColNum = new int[1] ;
      P04TQ11_A11737CCColNom = new String[] {""} ;
      P04TQ11_A11748TipArtiId = new short[1] ;
      P04TQ11_A11736CCArtCod = new String[] {""} ;
      P04TQ13_A396EmprCod = new String[] {""} ;
      P04TQ13_A9713Tb1_Cod = new short[1] ;
      P04TQ13_A252CliCod = new int[1] ;
      P04TQ13_A11756CCSCObs2 = new String[] {""} ;
      P04TQ13_n11756CCSCObs2 = new boolean[] {false} ;
      P04TQ13_A11755CCSCCEns = new String[] {""} ;
      P04TQ13_n11755CCSCCEns = new boolean[] {false} ;
      P04TQ13_A11754CCSCPmm = new String[] {""} ;
      P04TQ13_n11754CCSCPmm = new boolean[] {false} ;
      P04TQ13_A11752CCSCObs = new String[] {""} ;
      P04TQ13_n11752CCSCObs = new boolean[] {false} ;
      P04TQ13_A11751CCSCNorma = new String[] {""} ;
      P04TQ13_n11751CCSCNorma = new boolean[] {false} ;
      P04TQ13_A11744CCSCTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04TQ13_n11744CCSCTol = new boolean[] {false} ;
      P04TQ13_A11743CCSCVar = new String[] {""} ;
      P04TQ13_n11743CCSCVar = new boolean[] {false} ;
      P04TQ13_A11742CCSCAut = new byte[1] ;
      P04TQ13_n11742CCSCAut = new boolean[] {false} ;
      P04TQ13_A11741CCSCMx = new String[] {""} ;
      P04TQ13_n11741CCSCMx = new boolean[] {false} ;
      P04TQ13_A11740CCSCMn = new String[] {""} ;
      P04TQ13_n11740CCSCMn = new boolean[] {false} ;
      P04TQ13_A11739CCSCVal = new String[] {""} ;
      P04TQ13_n11739CCSCVal = new boolean[] {false} ;
      P04TQ13_A4034CCTLin = new short[1] ;
      P04TQ13_A4031CCTCod = new int[1] ;
      P04TQ13_A11750IntId = new short[1] ;
      P04TQ13_A11749CCCTc = new byte[1] ;
      P04TQ13_A11738CCColNum = new int[1] ;
      P04TQ13_A11737CCColNom = new String[] {""} ;
      P04TQ13_A11748TipArtiId = new short[1] ;
      P04TQ13_A11736CCArtCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcccnoe__default(),
         new Object[] {
             new Object[] {
            P04TQ2_A396EmprCod, P04TQ2_A9713Tb1_Cod, P04TQ2_A252CliCod
            }
            , new Object[] {
            P04TQ3_A396EmprCod, P04TQ3_A9713Tb1_Cod, P04TQ3_A252CliCod, P04TQ3_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04TQ5_A396EmprCod, P04TQ5_A9713Tb1_Cod, P04TQ5_A252CliCod, P04TQ5_A11748TipArtiId, P04TQ5_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04TQ7_A396EmprCod, P04TQ7_A9713Tb1_Cod, P04TQ7_A252CliCod, P04TQ7_A11749CCCTc, P04TQ7_A11738CCColNum, P04TQ7_A11737CCColNom, P04TQ7_A11748TipArtiId, P04TQ7_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04TQ9_A396EmprCod, P04TQ9_A9713Tb1_Cod, P04TQ9_A252CliCod, P04TQ9_A11750IntId, P04TQ9_A11749CCCTc, P04TQ9_A11738CCColNum, P04TQ9_A11737CCColNom, P04TQ9_A11748TipArtiId, P04TQ9_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04TQ11_A396EmprCod, P04TQ11_A9713Tb1_Cod, P04TQ11_A252CliCod, P04TQ11_A4031CCTCod, P04TQ11_A11750IntId, P04TQ11_A11749CCCTc, P04TQ11_A11738CCColNum, P04TQ11_A11737CCColNom, P04TQ11_A11748TipArtiId, P04TQ11_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04TQ13_A396EmprCod, P04TQ13_A9713Tb1_Cod, P04TQ13_A252CliCod, P04TQ13_A11756CCSCObs2, P04TQ13_n11756CCSCObs2, P04TQ13_A11755CCSCCEns, P04TQ13_n11755CCSCCEns, P04TQ13_A11754CCSCPmm, P04TQ13_n11754CCSCPmm, P04TQ13_A11752CCSCObs,
            P04TQ13_n11752CCSCObs, P04TQ13_A11751CCSCNorma, P04TQ13_n11751CCSCNorma, P04TQ13_A11744CCSCTol, P04TQ13_n11744CCSCTol, P04TQ13_A11743CCSCVar, P04TQ13_n11743CCSCVar, P04TQ13_A11742CCSCAut, P04TQ13_n11742CCSCAut, P04TQ13_A11741CCSCMx,
            P04TQ13_n11741CCSCMx, P04TQ13_A11740CCSCMn, P04TQ13_n11740CCSCMn, P04TQ13_A11739CCSCVal, P04TQ13_n11739CCSCVal, P04TQ13_A4034CCTLin, P04TQ13_A4031CCTCod, P04TQ13_A11750IntId, P04TQ13_A11749CCCTc, P04TQ13_A11738CCColNum,
            P04TQ13_A11737CCColNom, P04TQ13_A11748TipArtiId, P04TQ13_A11736CCArtCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Tabla4 ;
   private byte A11749CCCTc ;
   private byte W11749CCCTc ;
   private byte A11742CCSCAut ;
   private short AV18Tb1_cod ;
   private short AV21i ;
   private short A9713Tb1_Cod ;
   private short W9713Tb1_Cod ;
   private short Gx_err ;
   private short A11748TipArtiId ;
   private short W11748TipArtiId ;
   private short A11750IntId ;
   private short W11750IntId ;
   private short A4034CCTLin ;
   private short W4034CCTLin ;
   private int AV14CliCod ;
   private int AV15CliCodd ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS1642 ;
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
   private String Gx_msg ;
   private String scmdbuf ;
   private String A11736CCArtCod ;
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
   private boolean returnInSub ;
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
   private int[] AV20Tab_cli ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04TQ2_A396EmprCod ;
   private short[] P04TQ2_A9713Tb1_Cod ;
   private int[] P04TQ2_A252CliCod ;
   private String[] P04TQ3_A396EmprCod ;
   private short[] P04TQ3_A9713Tb1_Cod ;
   private int[] P04TQ3_A252CliCod ;
   private String[] P04TQ3_A11736CCArtCod ;
   private String[] P04TQ5_A396EmprCod ;
   private short[] P04TQ5_A9713Tb1_Cod ;
   private int[] P04TQ5_A252CliCod ;
   private short[] P04TQ5_A11748TipArtiId ;
   private String[] P04TQ5_A11736CCArtCod ;
   private String[] P04TQ7_A396EmprCod ;
   private short[] P04TQ7_A9713Tb1_Cod ;
   private int[] P04TQ7_A252CliCod ;
   private byte[] P04TQ7_A11749CCCTc ;
   private int[] P04TQ7_A11738CCColNum ;
   private String[] P04TQ7_A11737CCColNom ;
   private short[] P04TQ7_A11748TipArtiId ;
   private String[] P04TQ7_A11736CCArtCod ;
   private String[] P04TQ9_A396EmprCod ;
   private short[] P04TQ9_A9713Tb1_Cod ;
   private int[] P04TQ9_A252CliCod ;
   private short[] P04TQ9_A11750IntId ;
   private byte[] P04TQ9_A11749CCCTc ;
   private int[] P04TQ9_A11738CCColNum ;
   private String[] P04TQ9_A11737CCColNom ;
   private short[] P04TQ9_A11748TipArtiId ;
   private String[] P04TQ9_A11736CCArtCod ;
   private String[] P04TQ11_A396EmprCod ;
   private short[] P04TQ11_A9713Tb1_Cod ;
   private int[] P04TQ11_A252CliCod ;
   private int[] P04TQ11_A4031CCTCod ;
   private short[] P04TQ11_A11750IntId ;
   private byte[] P04TQ11_A11749CCCTc ;
   private int[] P04TQ11_A11738CCColNum ;
   private String[] P04TQ11_A11737CCColNom ;
   private short[] P04TQ11_A11748TipArtiId ;
   private String[] P04TQ11_A11736CCArtCod ;
   private String[] P04TQ13_A396EmprCod ;
   private short[] P04TQ13_A9713Tb1_Cod ;
   private int[] P04TQ13_A252CliCod ;
   private String[] P04TQ13_A11756CCSCObs2 ;
   private boolean[] P04TQ13_n11756CCSCObs2 ;
   private String[] P04TQ13_A11755CCSCCEns ;
   private boolean[] P04TQ13_n11755CCSCCEns ;
   private String[] P04TQ13_A11754CCSCPmm ;
   private boolean[] P04TQ13_n11754CCSCPmm ;
   private String[] P04TQ13_A11752CCSCObs ;
   private boolean[] P04TQ13_n11752CCSCObs ;
   private String[] P04TQ13_A11751CCSCNorma ;
   private boolean[] P04TQ13_n11751CCSCNorma ;
   private java.math.BigDecimal[] P04TQ13_A11744CCSCTol ;
   private boolean[] P04TQ13_n11744CCSCTol ;
   private String[] P04TQ13_A11743CCSCVar ;
   private boolean[] P04TQ13_n11743CCSCVar ;
   private byte[] P04TQ13_A11742CCSCAut ;
   private boolean[] P04TQ13_n11742CCSCAut ;
   private String[] P04TQ13_A11741CCSCMx ;
   private boolean[] P04TQ13_n11741CCSCMx ;
   private String[] P04TQ13_A11740CCSCMn ;
   private boolean[] P04TQ13_n11740CCSCMn ;
   private String[] P04TQ13_A11739CCSCVal ;
   private boolean[] P04TQ13_n11739CCSCVal ;
   private short[] P04TQ13_A4034CCTLin ;
   private int[] P04TQ13_A4031CCTCod ;
   private short[] P04TQ13_A11750IntId ;
   private byte[] P04TQ13_A11749CCCTc ;
   private int[] P04TQ13_A11738CCColNum ;
   private String[] P04TQ13_A11737CCColNom ;
   private short[] P04TQ13_A11748TipArtiId ;
   private String[] P04TQ13_A11736CCArtCod ;
}

final  class pcccnoe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TQ2", "SELECT EmprCod, Tb1_Cod, CliCod FROM TXPTABLA4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04TQ3", "SELECT EmprCod, Tb1_Cod, CliCod, CCArtCod FROM TXPCCCnoE WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TQ4", "INSERT INTO TXPCCCnoE(EmprCod, CliCod, Tb1_Cod, CCArtCod) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCnoE")
         ,new ForEachCursor("P04TQ5", "SELECT EmprCod, Tb1_Cod, CliCod, TipArtiId, CCArtCod FROM TXPCCCno1 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TQ6", "INSERT INTO TXPCCCno1(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno1")
         ,new ForEachCursor("P04TQ7", "SELECT EmprCod, Tb1_Cod, CliCod, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCno3 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TQ8", "INSERT INTO TXPCCCno3(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno3")
         ,new ForEachCursor("P04TQ9", "SELECT EmprCod, Tb1_Cod, CliCod, IntId, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCno4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TQ10", "INSERT INTO TXPCCCno4(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno4")
         ,new ForEachCursor("P04TQ11", "SELECT EmprCod, Tb1_Cod, CliCod, CCTCod, IntId, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCno5 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TQ12", "INSERT INTO TXPCCCno5(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno5")
         ,new ForEachCursor("P04TQ13", "SELECT EmprCod, Tb1_Cod, CliCod, CCSCObs2, CCSCCEns, CCSCPmm, CCSCObs, CCSCNorma, CCSCTol, CCSCVar, CCSCAut, CCSCMx, CCSCMn, CCSCVal, CCTLin, CCTCod, IntId, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCNOS WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TQ14", "INSERT INTO TXPCCCNOS(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin, CCSCVal, CCSCMn, CCSCMx, CCSCAut, CCSCVar, CCSCTol, CCSCNorma, CCSCObs, CCSCPmm, CCSCCEns, CCSCObs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCNOS")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((int[]) buf[26])[0] = rslt.getInt(16);
               ((short[]) buf[27])[0] = rslt.getShort(17);
               ((byte[]) buf[28])[0] = rslt.getByte(18);
               ((int[]) buf[29])[0] = rslt.getInt(19);
               ((String[]) buf[30])[0] = rslt.getString(20, 13);
               ((short[]) buf[31])[0] = rslt.getShort(21);
               ((String[]) buf[32])[0] = rslt.getString(22, 16);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
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
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
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

