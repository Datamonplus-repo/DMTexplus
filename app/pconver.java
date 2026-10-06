package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconver extends GXProcedure
{
   public pconver( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconver.class ), "" );
   }

   public pconver( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pconver.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pconver.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pconver.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pconver.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pconver.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pconver.this.AV18ALbRecCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV17FlagHisp ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int1) ;
      pconver.this.AV17FlagHisp = GXv_int1[0] ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV24Sedamil)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SEDAMI", ""), GXv_int1) ;
      pconver.this.AV24Sedamil = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      if ( AV17FlagHisp == 1 )
      {
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A129BarCod ;
         GXv_int1[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.paux001(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4) ;
         pconver.this.A396EmprCod = GXv_char2[0] ;
         pconver.this.A129BarCod = GXv_int3[0] ;
         pconver.this.A132BarCodReo = GXv_int1[0] ;
         pconver.this.A130BarCodPar = GXv_char4[0] ;
      }
      if ( AV17FlagHisp == 1 )
      {
         /* Using cursor P009V2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A44AlbRecCod = P009V2_A44AlbRecCod[0] ;
            A200BarPieCod = P009V2_A200BarPieCod[0] ;
            AV18ALbRecCod = A44AlbRecCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P009V4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A212BarSer = P009V4_A212BarSer[0] ;
            A361DisCod = P009V4_A361DisCod[0] ;
            A166BarKgm = P009V4_A166BarKgm[0] ;
            A184BarMtr = P009V4_A184BarMtr[0] ;
            A199BarPie1 = P009V4_A199BarPie1[0] ;
            A365DisDes = P009V4_A365DisDes[0] ;
            A898BarPieNDes = P009V4_A898BarPieNDes[0] ;
            A166BarKgm = P009V4_A166BarKgm[0] ;
            A184BarMtr = P009V4_A184BarMtr[0] ;
            A199BarPie1 = P009V4_A199BarPie1[0] ;
            A898BarPieNDes = P009V4_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV19DisCod = A361DisCod ;
            AV20DisDes = A365DisDes ;
            AV21Kilos = A166BarKgm ;
            AV22Metros = A184BarMtr ;
            AV23Piezas = A198BarPie ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P009V5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18ALbRecCod), Integer.valueOf(AV19DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2160HisEmpAlbD = P009V5_A2160HisEmpAlbD[0] ;
            n2160HisEmpAlbD = P009V5_n2160HisEmpAlbD[0] ;
            A2166HisEmpLTip = P009V5_A2166HisEmpLTip[0] ;
            n2166HisEmpLTip = P009V5_n2166HisEmpLTip[0] ;
            A44AlbRecCod = P009V5_A44AlbRecCod[0] ;
            A2164HisEmpKu = P009V5_A2164HisEmpKu[0] ;
            n2164HisEmpKu = P009V5_n2164HisEmpKu[0] ;
            A2169HisEmpMu = P009V5_A2169HisEmpMu[0] ;
            n2169HisEmpMu = P009V5_n2169HisEmpMu[0] ;
            A2172HisEmpPu = P009V5_A2172HisEmpPu[0] ;
            n2172HisEmpPu = P009V5_n2172HisEmpPu[0] ;
            A2165HisEmpLin = P009V5_A2165HisEmpLin[0] ;
            if ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "B", "")) == 0 )
            {
               A2164HisEmpKu = A2164HisEmpKu.subtract(AV21Kilos) ;
               n2164HisEmpKu = false ;
               A2169HisEmpMu = A2169HisEmpMu.subtract(AV22Metros) ;
               n2169HisEmpMu = false ;
               A2172HisEmpPu = (short)(A2172HisEmpPu-AV23Piezas) ;
               n2172HisEmpPu = false ;
               /* Using cursor P009V6 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n2164HisEmpKu), A2164HisEmpKu, Boolean.valueOf(n2169HisEmpMu), A2169HisEmpMu, Boolean.valueOf(n2172HisEmpPu), Short.valueOf(A2172HisEmpPu), A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      /* Using cursor P009V7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P009V7_A361DisCod[0] ;
         A392DisUniMed = P009V7_A392DisUniMed[0] ;
         A213BarSit = P009V7_A213BarSit[0] ;
         A392DisUniMed = P009V7_A392DisUniMed[0] ;
         /* Using cursor P009V8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A44AlbRecCod = P009V8_A44AlbRecCod[0] ;
            A203BarPieKil = P009V8_A203BarPieKil[0] ;
            A205BarPieMet = P009V8_A205BarPieMet[0] ;
            A1501BarPiePie = P009V8_A1501BarPiePie[0] ;
            A200BarPieCod = P009V8_A200BarPieCod[0] ;
            /* Using cursor P009V9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            A60AlbRUniUti = P009V9_A60AlbRUniUti[0] ;
            A54AlbRPieUti = P009V9_A54AlbRPieUti[0] ;
            A47AlbREst = P009V9_A47AlbREst[0] ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A60AlbRUniUti = A60AlbRUniUti.subtract(A203BarPieKil) ;
            }
            else
            {
               A60AlbRUniUti = A60AlbRUniUti.subtract(A205BarPieMet) ;
            }
            A54AlbRPieUti = (int)(A54AlbRPieUti-A1501BarPiePie) ;
            A47AlbREst = (byte)(0) ;
            /* Using cursor P009V10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* Using cursor P009V11 */
            pr_default.execute(8, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            pr_default.readNext(5);
         }
         pr_default.close(5);
         pr_default.close(6);
         /* Optimized DELETE. */
         /* Using cursor P009V12 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), AV24Sedamil});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* End optimized DELETE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pconver.this.A396EmprCod;
      this.aP1[0] = pconver.this.A129BarCod;
      this.aP2[0] = pconver.this.A132BarCodReo;
      this.aP3[0] = pconver.this.A130BarCodPar;
      this.aP4[0] = pconver.this.AV18ALbRecCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pconver");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24Sedamil = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P009V2_A396EmprCod = new String[] {""} ;
      P009V2_A129BarCod = new int[1] ;
      P009V2_A132BarCodReo = new byte[1] ;
      P009V2_A130BarCodPar = new String[] {""} ;
      P009V2_A44AlbRecCod = new int[1] ;
      P009V2_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      P009V4_A396EmprCod = new String[] {""} ;
      P009V4_A129BarCod = new int[1] ;
      P009V4_A132BarCodReo = new byte[1] ;
      P009V4_A130BarCodPar = new String[] {""} ;
      P009V4_A212BarSer = new String[] {""} ;
      P009V4_A361DisCod = new int[1] ;
      P009V4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009V4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009V4_A199BarPie1 = new short[1] ;
      P009V4_A365DisDes = new String[] {""} ;
      P009V4_A898BarPieNDes = new int[1] ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV20DisDes = "" ;
      AV21Kilos = DecimalUtil.ZERO ;
      AV22Metros = DecimalUtil.ZERO ;
      P009V5_A396EmprCod = new String[] {""} ;
      P009V5_A2160HisEmpAlbD = new long[1] ;
      P009V5_n2160HisEmpAlbD = new boolean[] {false} ;
      P009V5_A2166HisEmpLTip = new String[] {""} ;
      P009V5_n2166HisEmpLTip = new boolean[] {false} ;
      P009V5_A44AlbRecCod = new int[1] ;
      P009V5_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009V5_n2164HisEmpKu = new boolean[] {false} ;
      P009V5_A2169HisEmpMu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009V5_n2169HisEmpMu = new boolean[] {false} ;
      P009V5_A2172HisEmpPu = new short[1] ;
      P009V5_n2172HisEmpPu = new boolean[] {false} ;
      P009V5_A2165HisEmpLin = new short[1] ;
      A2166HisEmpLTip = "" ;
      A2164HisEmpKu = DecimalUtil.ZERO ;
      A2169HisEmpMu = DecimalUtil.ZERO ;
      P009V7_A396EmprCod = new String[] {""} ;
      P009V7_A129BarCod = new int[1] ;
      P009V7_A132BarCodReo = new byte[1] ;
      P009V7_A130BarCodPar = new String[] {""} ;
      P009V7_A361DisCod = new int[1] ;
      P009V7_A392DisUniMed = new String[] {""} ;
      P009V7_A213BarSit = new byte[1] ;
      A392DisUniMed = "" ;
      P009V8_A44AlbRecCod = new int[1] ;
      P009V8_A396EmprCod = new String[] {""} ;
      P009V8_A129BarCod = new int[1] ;
      P009V8_A132BarCodReo = new byte[1] ;
      P009V8_A130BarCodPar = new String[] {""} ;
      P009V8_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009V8_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009V8_A1501BarPiePie = new int[1] ;
      P009V8_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      P009V9_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009V9_A54AlbRPieUti = new int[1] ;
      P009V9_A47AlbREst = new byte[1] ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pconver__default(),
         new Object[] {
             new Object[] {
            P009V2_A396EmprCod, P009V2_A129BarCod, P009V2_A132BarCodReo, P009V2_A130BarCodPar, P009V2_A44AlbRecCod, P009V2_A200BarPieCod
            }
            , new Object[] {
            P009V4_A396EmprCod, P009V4_A129BarCod, P009V4_A132BarCodReo, P009V4_A130BarCodPar, P009V4_A212BarSer, P009V4_A361DisCod, P009V4_A166BarKgm, P009V4_A184BarMtr, P009V4_A199BarPie1, P009V4_A365DisDes,
            P009V4_A898BarPieNDes
            }
            , new Object[] {
            P009V5_A396EmprCod, P009V5_A2160HisEmpAlbD, P009V5_n2160HisEmpAlbD, P009V5_A2166HisEmpLTip, P009V5_n2166HisEmpLTip, P009V5_A44AlbRecCod, P009V5_A2164HisEmpKu, P009V5_n2164HisEmpKu, P009V5_A2169HisEmpMu, P009V5_n2169HisEmpMu,
            P009V5_A2172HisEmpPu, P009V5_n2172HisEmpPu, P009V5_A2165HisEmpLin
            }
            , new Object[] {
            }
            , new Object[] {
            P009V7_A396EmprCod, P009V7_A129BarCod, P009V7_A132BarCodReo, P009V7_A130BarCodPar, P009V7_A361DisCod, P009V7_A392DisUniMed, P009V7_A213BarSit
            }
            , new Object[] {
            P009V8_A44AlbRecCod, P009V8_A396EmprCod, P009V8_A129BarCod, P009V8_A132BarCodReo, P009V8_A130BarCodPar, P009V8_A203BarPieKil, P009V8_A205BarPieMet, P009V8_A1501BarPiePie, P009V8_A200BarPieCod
            }
            , new Object[] {
            P009V9_A60AlbRUniUti, P009V9_A54AlbRPieUti, P009V9_A47AlbREst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17FlagHisp ;
   private byte GXv_int1[] ;
   private byte A213BarSit ;
   private byte A47AlbREst ;
   private short A199BarPie1 ;
   private short A2172HisEmpPu ;
   private short A2165HisEmpLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV18ALbRecCod ;
   private int GXv_int3[] ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV19DisCod ;
   private int AV23Piezas ;
   private int A1501BarPiePie ;
   private int A54AlbRPieUti ;
   private long A2160HisEmpAlbD ;
   private java.math.BigDecimal AV24Sedamil ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV21Kilos ;
   private java.math.BigDecimal AV22Metros ;
   private java.math.BigDecimal A2164HisEmpKu ;
   private java.math.BigDecimal A2169HisEmpMu ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A212BarSer ;
   private String A365DisDes ;
   private String AV20DisDes ;
   private String A2166HisEmpLTip ;
   private String A392DisUniMed ;
   private boolean n2160HisEmpAlbD ;
   private boolean n2166HisEmpLTip ;
   private boolean n2164HisEmpKu ;
   private boolean n2169HisEmpMu ;
   private boolean n2172HisEmpPu ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P009V2_A396EmprCod ;
   private int[] P009V2_A129BarCod ;
   private byte[] P009V2_A132BarCodReo ;
   private String[] P009V2_A130BarCodPar ;
   private int[] P009V2_A44AlbRecCod ;
   private String[] P009V2_A200BarPieCod ;
   private String[] P009V4_A396EmprCod ;
   private int[] P009V4_A129BarCod ;
   private byte[] P009V4_A132BarCodReo ;
   private String[] P009V4_A130BarCodPar ;
   private String[] P009V4_A212BarSer ;
   private int[] P009V4_A361DisCod ;
   private java.math.BigDecimal[] P009V4_A166BarKgm ;
   private java.math.BigDecimal[] P009V4_A184BarMtr ;
   private short[] P009V4_A199BarPie1 ;
   private String[] P009V4_A365DisDes ;
   private int[] P009V4_A898BarPieNDes ;
   private String[] P009V5_A396EmprCod ;
   private long[] P009V5_A2160HisEmpAlbD ;
   private boolean[] P009V5_n2160HisEmpAlbD ;
   private String[] P009V5_A2166HisEmpLTip ;
   private boolean[] P009V5_n2166HisEmpLTip ;
   private int[] P009V5_A44AlbRecCod ;
   private java.math.BigDecimal[] P009V5_A2164HisEmpKu ;
   private boolean[] P009V5_n2164HisEmpKu ;
   private java.math.BigDecimal[] P009V5_A2169HisEmpMu ;
   private boolean[] P009V5_n2169HisEmpMu ;
   private short[] P009V5_A2172HisEmpPu ;
   private boolean[] P009V5_n2172HisEmpPu ;
   private short[] P009V5_A2165HisEmpLin ;
   private String[] P009V7_A396EmprCod ;
   private int[] P009V7_A129BarCod ;
   private byte[] P009V7_A132BarCodReo ;
   private String[] P009V7_A130BarCodPar ;
   private int[] P009V7_A361DisCod ;
   private String[] P009V7_A392DisUniMed ;
   private byte[] P009V7_A213BarSit ;
   private int[] P009V8_A44AlbRecCod ;
   private String[] P009V8_A396EmprCod ;
   private int[] P009V8_A129BarCod ;
   private byte[] P009V8_A132BarCodReo ;
   private String[] P009V8_A130BarCodPar ;
   private java.math.BigDecimal[] P009V8_A203BarPieKil ;
   private java.math.BigDecimal[] P009V8_A205BarPieMet ;
   private int[] P009V8_A1501BarPiePie ;
   private String[] P009V8_A200BarPieCod ;
   private java.math.BigDecimal[] P009V9_A60AlbRUniUti ;
   private int[] P009V9_A54AlbRPieUti ;
   private byte[] P009V9_A47AlbREst ;
}

final  class pconver__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P009V2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009V4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T1.DisCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009V5", "SELECT EmprCod, HisEmpAlbD, HisEmpLTip, AlbRecCod, HisEmpKu, HisEmpMu, HisEmpPu, HisEmpLin FROM TXPHISEMP WHERE (EmprCod = ? and AlbRecCod = ?) AND (HisEmpAlbD = ?) ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009V6", "UPDATE TXPHISEMP SET HisEmpKu=?, HisEmpMu=?, HisEmpPu=?  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new ForEachCursor("P009V7", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T2.DisUniMed, T1.BarSit FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009V8", "SELECT AlbRecCod, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, BarPieMet, BarPiePie, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P009V9", "SELECT AlbRUniUti, AlbRPieUti, AlbREst FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009V10", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009V11", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P009V12", "DELETE FROM TXPDISALB  WHERE (EmprCod = ? and DisCod = ?) AND (? = 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               return;
      }
   }

}

