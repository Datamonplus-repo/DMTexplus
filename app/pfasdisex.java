package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasdisex extends GXProcedure
{
   public pfasdisex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasdisex.class ), "" );
   }

   public pfasdisex( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pfasdisex.this.aP2 = new String[] {""};
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
      pfasdisex.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasdisex.this.AV15DisCod = aP1[0];
      this.aP1 = aP1;
      pfasdisex.this.AV22ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02622 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02622_A361DisCod[0] ;
         A252CliCod = P02622_A252CliCod[0] ;
         A335DisArtCod = P02622_A335DisArtCod[0] ;
         A2009DisTipDis = P02622_A2009DisTipDis[0] ;
         n2009DisTipDis = P02622_n2009DisTipDis[0] ;
         AV17CliCod = A252CliCod ;
         AV18DisartCod = A335DisArtCod ;
         AV25DisTipDis = A2009DisTipDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02623 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV22ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A774ProNumLin = P02623_A774ProNumLin[0] ;
         A7744FasPreObl = P02623_A7744FasPreObl[0] ;
         n7744FasPreObl = P02623_n7744FasPreObl[0] ;
         A758ProCod = P02623_A758ProCod[0] ;
         A457FasCod = P02623_A457FasCod[0] ;
         n457FasCod = P02623_n457FasCod[0] ;
         A7744FasPreObl = P02623_A7744FasPreObl[0] ;
         n7744FasPreObl = P02623_n7744FasPreObl[0] ;
         W758ProCod = A758ProCod ;
         AV16FasCod = A457FasCod ;
         AV19ProNumLin = A774ProNumLin ;
         /*
            INSERT RECORD ON TABLE TXPDISFAS

         */
         W758ProCod = A758ProCod ;
         W457FasCod = A457FasCod ;
         n457FasCod = false ;
         A361DisCod = AV15DisCod ;
         A758ProCod = AV22ProCod ;
         A368DisFasLin = A774ProNumLin ;
         A457FasCod = AV16FasCod ;
         n457FasCod = false ;
         A3697FasApr = httpContext.getMessage( "N", "") ;
         A5304DisPreSal = (short)(0) ;
         n5304DisPreSal = false ;
         A5305DisPrePie = (short)(0) ;
         n5305DisPrePie = false ;
         A5306DisVelPro = DecimalUtil.doubleToDec(0) ;
         n5306DisVelPro = false ;
         A5307DisNumPas = (short)(0) ;
         n5307DisNumPas = false ;
         A5376DisQuiUl = (short)(0) ;
         /* Using cursor P02624 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Boolean.valueOf(n457FasCod), A457FasCod, A3697FasApr, Short.valueOf(A5376DisQuiUl), Boolean.valueOf(n5304DisPreSal), Short.valueOf(A5304DisPreSal), Boolean.valueOf(n5305DisPrePie), Short.valueOf(A5305DisPrePie), Boolean.valueOf(n5306DisVelPro), A5306DisVelPro, Boolean.valueOf(n5307DisNumPas), Short.valueOf(A5307DisNumPas), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
         A758ProCod = W758ProCod ;
         A457FasCod = W457FasCod ;
         n457FasCod = false ;
         /* End Insert */
         /* Using cursor P02625 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV17CliCod), AV18DisartCod, A758ProCod, Boolean.valueOf(n457FasCod), A457FasCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1668ParFasVal = P02625_A1668ParFasVal[0] ;
            A1673ParFasObs = P02625_A1673ParFasObs[0] ;
            A1664ParFasCod = P02625_A1664ParFasCod[0] ;
            A65ArtCod = P02625_A65ArtCod[0] ;
            A252CliCod = P02625_A252CliCod[0] ;
            /*
               INSERT RECORD ON TABLE TXPDISPAR

            */
            A361DisCod = AV15DisCod ;
            A368DisFasLin = A774ProNumLin ;
            A3685DisParVal = A1668ParFasVal ;
            A3686DisParObs = A1673ParFasObs ;
            /* Using cursor P02626 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
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
            /* End Insert */
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A758ProCod = W758ProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV21UltimaLin = AV19ProNumLin ;
      AV23Sumo_p = (byte)(0) ;
      /* Using cursor P02627 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV17CliCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A7744FasPreObl = P02627_A7744FasPreObl[0] ;
         n7744FasPreObl = P02627_n7744FasPreObl[0] ;
         A252CliCod = P02627_A252CliCod[0] ;
         A457FasCod = P02627_A457FasCod[0] ;
         n457FasCod = P02627_n457FasCod[0] ;
         A6011FasTip = P02627_A6011FasTip[0] ;
         n6011FasTip = P02627_n6011FasTip[0] ;
         A6016FasExpLin = P02627_A6016FasExpLin[0] ;
         A7744FasPreObl = P02627_A7744FasPreObl[0] ;
         n7744FasPreObl = P02627_n7744FasPreObl[0] ;
         A6011FasTip = P02627_A6011FasTip[0] ;
         n6011FasTip = P02627_n6011FasTip[0] ;
         AV24FasCodc = A457FasCod ;
         if ( AV23Sumo_p == 0 )
         {
            AV21UltimaLin = (short)(AV19ProNumLin+100) ;
            AV23Sumo_p = (byte)(1) ;
         }
         if ( GXutil.strcmp(AV25DisTipDis, A6011FasTip) == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPDISFAS

            */
            W457FasCod = A457FasCod ;
            n457FasCod = false ;
            A361DisCod = AV15DisCod ;
            A758ProCod = AV22ProCod ;
            A368DisFasLin = AV21UltimaLin ;
            A457FasCod = AV24FasCodc ;
            n457FasCod = false ;
            A5304DisPreSal = (short)(0) ;
            n5304DisPreSal = false ;
            A5305DisPrePie = (short)(0) ;
            n5305DisPrePie = false ;
            A5306DisVelPro = DecimalUtil.doubleToDec(0) ;
            n5306DisVelPro = false ;
            A5307DisNumPas = (short)(0) ;
            n5307DisNumPas = false ;
            A3697FasApr = "X" ;
            /* Using cursor P02628 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Boolean.valueOf(n457FasCod), A457FasCod, A3697FasApr, Boolean.valueOf(n5304DisPreSal), Short.valueOf(A5304DisPreSal), Boolean.valueOf(n5305DisPrePie), Short.valueOf(A5305DisPrePie), Boolean.valueOf(n5306DisVelPro), A5306DisVelPro, Boolean.valueOf(n5307DisNumPas), Short.valueOf(A5307DisNumPas), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
            A457FasCod = W457FasCod ;
            n457FasCod = false ;
            /* End Insert */
            AV21UltimaLin = (short)(AV21UltimaLin+100) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor P02629 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV15DisCod), AV22ProCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A758ProCod = P02629_A758ProCod[0] ;
         A361DisCod = P02629_A361DisCod[0] ;
         A846UltFasLin = P02629_A846UltFasLin[0] ;
         if ( AV23Sumo_p == 0 )
         {
            A846UltFasLin = AV21UltimaLin ;
         }
         else
         {
            A846UltFasLin = (short)(AV21UltimaLin-100) ;
         }
         /* Using cursor P026210 */
         pr_default.execute(8, new Object[] {Short.valueOf(A846UltFasLin), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasdisex.this.A396EmprCod;
      this.aP1[0] = pfasdisex.this.AV15DisCod;
      this.aP2[0] = pfasdisex.this.AV22ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfasdisex");
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
      P02622_A396EmprCod = new String[] {""} ;
      P02622_A361DisCod = new int[1] ;
      P02622_A252CliCod = new int[1] ;
      P02622_A335DisArtCod = new String[] {""} ;
      P02622_A2009DisTipDis = new String[] {""} ;
      P02622_n2009DisTipDis = new boolean[] {false} ;
      A335DisArtCod = "" ;
      A2009DisTipDis = "" ;
      AV18DisartCod = "" ;
      AV25DisTipDis = "" ;
      P02623_A396EmprCod = new String[] {""} ;
      P02623_A774ProNumLin = new short[1] ;
      P02623_A7744FasPreObl = new byte[1] ;
      P02623_n7744FasPreObl = new boolean[] {false} ;
      P02623_A758ProCod = new String[] {""} ;
      P02623_A457FasCod = new String[] {""} ;
      P02623_n457FasCod = new boolean[] {false} ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      W758ProCod = "" ;
      AV16FasCod = "" ;
      W457FasCod = "" ;
      A3697FasApr = "" ;
      A5306DisVelPro = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P02625_A396EmprCod = new String[] {""} ;
      P02625_A758ProCod = new String[] {""} ;
      P02625_A457FasCod = new String[] {""} ;
      P02625_n457FasCod = new boolean[] {false} ;
      P02625_A1668ParFasVal = new String[] {""} ;
      P02625_A1673ParFasObs = new String[] {""} ;
      P02625_A1664ParFasCod = new short[1] ;
      P02625_A65ArtCod = new String[] {""} ;
      P02625_A252CliCod = new int[1] ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A65ArtCod = "" ;
      A3685DisParVal = "" ;
      A3686DisParObs = "" ;
      P02627_A396EmprCod = new String[] {""} ;
      P02627_A7744FasPreObl = new byte[1] ;
      P02627_n7744FasPreObl = new boolean[] {false} ;
      P02627_A252CliCod = new int[1] ;
      P02627_A457FasCod = new String[] {""} ;
      P02627_n457FasCod = new boolean[] {false} ;
      P02627_A6011FasTip = new String[] {""} ;
      P02627_n6011FasTip = new boolean[] {false} ;
      P02627_A6016FasExpLin = new short[1] ;
      A6011FasTip = "" ;
      AV24FasCodc = "" ;
      P02629_A396EmprCod = new String[] {""} ;
      P02629_A758ProCod = new String[] {""} ;
      P02629_A361DisCod = new int[1] ;
      P02629_A846UltFasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasdisex__default(),
         new Object[] {
             new Object[] {
            P02622_A396EmprCod, P02622_A361DisCod, P02622_A252CliCod, P02622_A335DisArtCod, P02622_A2009DisTipDis, P02622_n2009DisTipDis
            }
            , new Object[] {
            P02623_A396EmprCod, P02623_A774ProNumLin, P02623_A7744FasPreObl, P02623_n7744FasPreObl, P02623_A758ProCod, P02623_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02625_A396EmprCod, P02625_A758ProCod, P02625_A457FasCod, P02625_A1668ParFasVal, P02625_A1673ParFasObs, P02625_A1664ParFasCod, P02625_A65ArtCod, P02625_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02627_A396EmprCod, P02627_A7744FasPreObl, P02627_n7744FasPreObl, P02627_A252CliCod, P02627_A457FasCod, P02627_n457FasCod, P02627_A6011FasTip, P02627_n6011FasTip, P02627_A6016FasExpLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02629_A396EmprCod, P02629_A758ProCod, P02629_A361DisCod, P02629_A846UltFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7744FasPreObl ;
   private byte AV23Sumo_p ;
   private short A774ProNumLin ;
   private short AV19ProNumLin ;
   private short A368DisFasLin ;
   private short A5304DisPreSal ;
   private short A5305DisPrePie ;
   private short A5307DisNumPas ;
   private short A5376DisQuiUl ;
   private short Gx_err ;
   private short A1664ParFasCod ;
   private short AV21UltimaLin ;
   private short A6016FasExpLin ;
   private short A846UltFasLin ;
   private int AV15DisCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV17CliCod ;
   private int GX_INS39 ;
   private int GX_INS517 ;
   private java.math.BigDecimal A5306DisVelPro ;
   private String A396EmprCod ;
   private String AV22ProCod ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A2009DisTipDis ;
   private String AV18DisartCod ;
   private String AV25DisTipDis ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String W758ProCod ;
   private String AV16FasCod ;
   private String W457FasCod ;
   private String A3697FasApr ;
   private String Gx_emsg ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A65ArtCod ;
   private String A3685DisParVal ;
   private String A3686DisParObs ;
   private String A6011FasTip ;
   private String AV24FasCodc ;
   private boolean n2009DisTipDis ;
   private boolean n7744FasPreObl ;
   private boolean n457FasCod ;
   private boolean n5304DisPreSal ;
   private boolean n5305DisPrePie ;
   private boolean n5306DisVelPro ;
   private boolean n5307DisNumPas ;
   private boolean n6011FasTip ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02622_A396EmprCod ;
   private int[] P02622_A361DisCod ;
   private int[] P02622_A252CliCod ;
   private String[] P02622_A335DisArtCod ;
   private String[] P02622_A2009DisTipDis ;
   private boolean[] P02622_n2009DisTipDis ;
   private String[] P02623_A396EmprCod ;
   private short[] P02623_A774ProNumLin ;
   private byte[] P02623_A7744FasPreObl ;
   private boolean[] P02623_n7744FasPreObl ;
   private String[] P02623_A758ProCod ;
   private String[] P02623_A457FasCod ;
   private boolean[] P02623_n457FasCod ;
   private String[] P02625_A396EmprCod ;
   private String[] P02625_A758ProCod ;
   private String[] P02625_A457FasCod ;
   private boolean[] P02625_n457FasCod ;
   private String[] P02625_A1668ParFasVal ;
   private String[] P02625_A1673ParFasObs ;
   private short[] P02625_A1664ParFasCod ;
   private String[] P02625_A65ArtCod ;
   private int[] P02625_A252CliCod ;
   private String[] P02627_A396EmprCod ;
   private byte[] P02627_A7744FasPreObl ;
   private boolean[] P02627_n7744FasPreObl ;
   private int[] P02627_A252CliCod ;
   private String[] P02627_A457FasCod ;
   private boolean[] P02627_n457FasCod ;
   private String[] P02627_A6011FasTip ;
   private boolean[] P02627_n6011FasTip ;
   private short[] P02627_A6016FasExpLin ;
   private String[] P02629_A396EmprCod ;
   private String[] P02629_A758ProCod ;
   private int[] P02629_A361DisCod ;
   private short[] P02629_A846UltFasLin ;
}

final  class pfasdisex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02622", "SELECT EmprCod, DisCod, CliCod, DisArtCod, DisTipDis FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02623", "SELECT T1.EmprCod, T1.ProNumLin, T2.FasPreObl, T1.ProCod, T1.FasCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02624", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasApr, DisQuiUl, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl, DisMaqPru, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P02625", "SELECT EmprCod, ProCod, FasCod, ParFasVal, ParFasObs, ParFasCod, ArtCod, CliCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02626", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParTxt, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new ForEachCursor("P02627", "SELECT T1.EmprCod, T2.FasPreObl, T1.CliCod, T1.FasCod, T2.FasTip, T1.FasExpLin FROM (TXPFASCLI T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.FasExpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02628", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasApr, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P02629", "SELECT EmprCod, ProCod, DisCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P026210", "UPDATE TXPDISLIN SET UltFasLin=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[17]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setString(6, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[16]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

