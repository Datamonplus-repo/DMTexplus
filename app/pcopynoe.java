package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopynoe extends GXProcedure
{
   public pcopynoe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopynoe.class ), "" );
   }

   public pcopynoe( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int[] executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            short[] aP2 )
   {
      AV21tab_cli = new int[1000] ;
      execute_int(aP0, aP1, aP2, AV21tab_cli);
      return AV21tab_cli;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        int[] AV21tab_cli )
   {
      execute_int(aP0, aP1, aP2, AV21tab_cli);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] AV21tab_cli )
   {
      pcopynoe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopynoe.this.AV14CliCod = aP1[0];
      this.aP1 = aP1;
      pcopynoe.this.AV18Tb1_cod = aP2[0];
      this.aP2 = aP2;
      pcopynoe.this.AV21tab_cli = AV21tab_cli;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20i = (short)(1) ;
      while ( AV20i <= 1000 )
      {
         if ( AV21tab_cli[AV20i-1] == 0 )
         {
            if (true) break;
         }
         AV15CliCodd = AV21tab_cli[AV20i-1] ;
         if ( AV14CliCod != AV21tab_cli[AV20i-1] )
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
         AV20i = (short)(AV20i+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CC' Routine */
      returnInSub = false ;
      AV19Tabla4 = (byte)(0) ;
      /* Using cursor P04UG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCodd), Short.valueOf(AV18Tb1_cod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9713Tb1_Cod = P04UG2_A9713Tb1_Cod[0] ;
         A252CliCod = P04UG2_A252CliCod[0] ;
         AV19Tabla4 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV19Tabla4 == 1 )
      {
         /* Using cursor P04UG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9713Tb1_Cod = P04UG3_A9713Tb1_Cod[0] ;
            A252CliCod = P04UG3_A252CliCod[0] ;
            A11736CCArtCod = P04UG3_A11736CCArtCod[0] ;
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
            /* Using cursor P04UG4 */
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
         /* Using cursor P04UG5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A9713Tb1_Cod = P04UG5_A9713Tb1_Cod[0] ;
            A252CliCod = P04UG5_A252CliCod[0] ;
            A11748TipArtiId = P04UG5_A11748TipArtiId[0] ;
            A11736CCArtCod = P04UG5_A11736CCArtCod[0] ;
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
            /* Using cursor P04UG6 */
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
         /* Using cursor P04UG7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A9713Tb1_Cod = P04UG7_A9713Tb1_Cod[0] ;
            A252CliCod = P04UG7_A252CliCod[0] ;
            A11749CCCTc = P04UG7_A11749CCCTc[0] ;
            A11738CCColNum = P04UG7_A11738CCColNum[0] ;
            A11737CCColNom = P04UG7_A11737CCColNom[0] ;
            A11748TipArtiId = P04UG7_A11748TipArtiId[0] ;
            A11736CCArtCod = P04UG7_A11736CCArtCod[0] ;
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
            /* Using cursor P04UG8 */
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
         /* Using cursor P04UG9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A9713Tb1_Cod = P04UG9_A9713Tb1_Cod[0] ;
            A252CliCod = P04UG9_A252CliCod[0] ;
            A11750IntId = P04UG9_A11750IntId[0] ;
            A11749CCCTc = P04UG9_A11749CCCTc[0] ;
            A11738CCColNum = P04UG9_A11738CCColNum[0] ;
            A11737CCColNom = P04UG9_A11737CCColNom[0] ;
            A11748TipArtiId = P04UG9_A11748TipArtiId[0] ;
            A11736CCArtCod = P04UG9_A11736CCArtCod[0] ;
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
            /* Using cursor P04UG10 */
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
         /* Using cursor P04UG11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV18Tb1_cod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A9713Tb1_Cod = P04UG11_A9713Tb1_Cod[0] ;
            A252CliCod = P04UG11_A252CliCod[0] ;
            A4031CCTCod = P04UG11_A4031CCTCod[0] ;
            A11750IntId = P04UG11_A11750IntId[0] ;
            A11749CCCTc = P04UG11_A11749CCCTc[0] ;
            A11738CCColNum = P04UG11_A11738CCColNum[0] ;
            A11737CCColNom = P04UG11_A11737CCColNom[0] ;
            A11748TipArtiId = P04UG11_A11748TipArtiId[0] ;
            A11736CCArtCod = P04UG11_A11736CCArtCod[0] ;
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
            /* Using cursor P04UG12 */
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
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopynoe.this.A396EmprCod;
      this.aP1[0] = pcopynoe.this.AV14CliCod;
      this.aP2[0] = pcopynoe.this.AV18Tb1_cod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopynoe");
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
      P04UG2_A396EmprCod = new String[] {""} ;
      P04UG2_A9713Tb1_Cod = new short[1] ;
      P04UG2_A252CliCod = new int[1] ;
      P04UG3_A396EmprCod = new String[] {""} ;
      P04UG3_A9713Tb1_Cod = new short[1] ;
      P04UG3_A252CliCod = new int[1] ;
      P04UG3_A11736CCArtCod = new String[] {""} ;
      A11736CCArtCod = "" ;
      W396EmprCod = "" ;
      W11736CCArtCod = "" ;
      Gx_emsg = "" ;
      P04UG5_A396EmprCod = new String[] {""} ;
      P04UG5_A9713Tb1_Cod = new short[1] ;
      P04UG5_A252CliCod = new int[1] ;
      P04UG5_A11748TipArtiId = new short[1] ;
      P04UG5_A11736CCArtCod = new String[] {""} ;
      P04UG7_A396EmprCod = new String[] {""} ;
      P04UG7_A9713Tb1_Cod = new short[1] ;
      P04UG7_A252CliCod = new int[1] ;
      P04UG7_A11749CCCTc = new byte[1] ;
      P04UG7_A11738CCColNum = new int[1] ;
      P04UG7_A11737CCColNom = new String[] {""} ;
      P04UG7_A11748TipArtiId = new short[1] ;
      P04UG7_A11736CCArtCod = new String[] {""} ;
      A11737CCColNom = "" ;
      W11737CCColNom = "" ;
      P04UG9_A396EmprCod = new String[] {""} ;
      P04UG9_A9713Tb1_Cod = new short[1] ;
      P04UG9_A252CliCod = new int[1] ;
      P04UG9_A11750IntId = new short[1] ;
      P04UG9_A11749CCCTc = new byte[1] ;
      P04UG9_A11738CCColNum = new int[1] ;
      P04UG9_A11737CCColNom = new String[] {""} ;
      P04UG9_A11748TipArtiId = new short[1] ;
      P04UG9_A11736CCArtCod = new String[] {""} ;
      P04UG11_A396EmprCod = new String[] {""} ;
      P04UG11_A9713Tb1_Cod = new short[1] ;
      P04UG11_A252CliCod = new int[1] ;
      P04UG11_A4031CCTCod = new int[1] ;
      P04UG11_A11750IntId = new short[1] ;
      P04UG11_A11749CCCTc = new byte[1] ;
      P04UG11_A11738CCColNum = new int[1] ;
      P04UG11_A11737CCColNom = new String[] {""} ;
      P04UG11_A11748TipArtiId = new short[1] ;
      P04UG11_A11736CCArtCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopynoe__default(),
         new Object[] {
             new Object[] {
            P04UG2_A396EmprCod, P04UG2_A9713Tb1_Cod, P04UG2_A252CliCod
            }
            , new Object[] {
            P04UG3_A396EmprCod, P04UG3_A9713Tb1_Cod, P04UG3_A252CliCod, P04UG3_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04UG5_A396EmprCod, P04UG5_A9713Tb1_Cod, P04UG5_A252CliCod, P04UG5_A11748TipArtiId, P04UG5_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04UG7_A396EmprCod, P04UG7_A9713Tb1_Cod, P04UG7_A252CliCod, P04UG7_A11749CCCTc, P04UG7_A11738CCColNum, P04UG7_A11737CCColNom, P04UG7_A11748TipArtiId, P04UG7_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04UG9_A396EmprCod, P04UG9_A9713Tb1_Cod, P04UG9_A252CliCod, P04UG9_A11750IntId, P04UG9_A11749CCCTc, P04UG9_A11738CCColNum, P04UG9_A11737CCColNom, P04UG9_A11748TipArtiId, P04UG9_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04UG11_A396EmprCod, P04UG11_A9713Tb1_Cod, P04UG11_A252CliCod, P04UG11_A4031CCTCod, P04UG11_A11750IntId, P04UG11_A11749CCCTc, P04UG11_A11738CCColNum, P04UG11_A11737CCColNom, P04UG11_A11748TipArtiId, P04UG11_A11736CCArtCod
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
   private short AV18Tb1_cod ;
   private short AV20i ;
   private short A9713Tb1_Cod ;
   private short W9713Tb1_Cod ;
   private short Gx_err ;
   private short A11748TipArtiId ;
   private short W11748TipArtiId ;
   private short A11750IntId ;
   private short W11750IntId ;
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
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A11736CCArtCod ;
   private String W396EmprCod ;
   private String W11736CCArtCod ;
   private String Gx_emsg ;
   private String A11737CCColNom ;
   private String W11737CCColNom ;
   private boolean returnInSub ;
   private int[] AV21tab_cli ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04UG2_A396EmprCod ;
   private short[] P04UG2_A9713Tb1_Cod ;
   private int[] P04UG2_A252CliCod ;
   private String[] P04UG3_A396EmprCod ;
   private short[] P04UG3_A9713Tb1_Cod ;
   private int[] P04UG3_A252CliCod ;
   private String[] P04UG3_A11736CCArtCod ;
   private String[] P04UG5_A396EmprCod ;
   private short[] P04UG5_A9713Tb1_Cod ;
   private int[] P04UG5_A252CliCod ;
   private short[] P04UG5_A11748TipArtiId ;
   private String[] P04UG5_A11736CCArtCod ;
   private String[] P04UG7_A396EmprCod ;
   private short[] P04UG7_A9713Tb1_Cod ;
   private int[] P04UG7_A252CliCod ;
   private byte[] P04UG7_A11749CCCTc ;
   private int[] P04UG7_A11738CCColNum ;
   private String[] P04UG7_A11737CCColNom ;
   private short[] P04UG7_A11748TipArtiId ;
   private String[] P04UG7_A11736CCArtCod ;
   private String[] P04UG9_A396EmprCod ;
   private short[] P04UG9_A9713Tb1_Cod ;
   private int[] P04UG9_A252CliCod ;
   private short[] P04UG9_A11750IntId ;
   private byte[] P04UG9_A11749CCCTc ;
   private int[] P04UG9_A11738CCColNum ;
   private String[] P04UG9_A11737CCColNom ;
   private short[] P04UG9_A11748TipArtiId ;
   private String[] P04UG9_A11736CCArtCod ;
   private String[] P04UG11_A396EmprCod ;
   private short[] P04UG11_A9713Tb1_Cod ;
   private int[] P04UG11_A252CliCod ;
   private int[] P04UG11_A4031CCTCod ;
   private short[] P04UG11_A11750IntId ;
   private byte[] P04UG11_A11749CCCTc ;
   private int[] P04UG11_A11738CCColNum ;
   private String[] P04UG11_A11737CCColNom ;
   private short[] P04UG11_A11748TipArtiId ;
   private String[] P04UG11_A11736CCArtCod ;
}

final  class pcopynoe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04UG2", "SELECT EmprCod, Tb1_Cod, CliCod FROM TXPTABLA4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04UG3", "SELECT EmprCod, Tb1_Cod, CliCod, CCArtCod FROM TXPCCCnoE WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UG4", "INSERT INTO TXPCCCnoE(EmprCod, CliCod, Tb1_Cod, CCArtCod) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCnoE")
         ,new ForEachCursor("P04UG5", "SELECT EmprCod, Tb1_Cod, CliCod, TipArtiId, CCArtCod FROM TXPCCCno1 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UG6", "INSERT INTO TXPCCCno1(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno1")
         ,new ForEachCursor("P04UG7", "SELECT EmprCod, Tb1_Cod, CliCod, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCno3 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UG8", "INSERT INTO TXPCCCno3(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno3")
         ,new ForEachCursor("P04UG9", "SELECT EmprCod, Tb1_Cod, CliCod, IntId, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCno4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UG10", "INSERT INTO TXPCCCno4(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno4")
         ,new ForEachCursor("P04UG11", "SELECT EmprCod, Tb1_Cod, CliCod, CCTCod, IntId, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCno5 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04UG12", "INSERT INTO TXPCCCno5(EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCno5")
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
      }
   }

}

