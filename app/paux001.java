package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paux001 extends GXProcedure
{
   public paux001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paux001.class ), "" );
   }

   public paux001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      paux001.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      paux001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paux001.this.AV9BarCod = aP1[0];
      this.aP1 = aP1;
      paux001.this.AV10BarCodReo = aP2[0];
      this.aP2 = aP2;
      paux001.this.AV11BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00PJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00PJ2_A130BarCodPar[0] ;
         A132BarCodReo = P00PJ2_A132BarCodReo[0] ;
         A129BarCod = P00PJ2_A129BarCod[0] ;
         A44AlbRecCod = P00PJ2_A44AlbRecCod[0] ;
         A200BarPieCod = P00PJ2_A200BarPieCod[0] ;
         AV12AlbRecCod = A44AlbRecCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00PJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P00PJ3_A130BarCodPar[0] ;
         A132BarCodReo = P00PJ3_A132BarCodReo[0] ;
         A129BarCod = P00PJ3_A129BarCod[0] ;
         A361DisCod = P00PJ3_A361DisCod[0] ;
         AV8DisCod = A361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P00PJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1141DisBarPar = P00PJ4_A1141DisBarPar[0] ;
         A1140DisBarReo = P00PJ4_A1140DisBarReo[0] ;
         A1139DisBarCod = P00PJ4_A1139DisBarCod[0] ;
         A1146DisDisCod = P00PJ4_A1146DisDisCod[0] ;
         /* Using cursor P00PJ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar, A396EmprCod, Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A44AlbRecCod = P00PJ5_A44AlbRecCod[0] ;
            A129BarCod = P00PJ5_A129BarCod[0] ;
            A132BarCodReo = P00PJ5_A132BarCodReo[0] ;
            A130BarCodPar = P00PJ5_A130BarCodPar[0] ;
            A203BarPieKil = P00PJ5_A203BarPieKil[0] ;
            A205BarPieMet = P00PJ5_A205BarPieMet[0] ;
            A1501BarPiePie = P00PJ5_A1501BarPiePie[0] ;
            A2186BarPieLoc = P00PJ5_A2186BarPieLoc[0] ;
            n2186BarPieLoc = P00PJ5_n2186BarPieLoc[0] ;
            A200BarPieCod = P00PJ5_A200BarPieCod[0] ;
            /* Using cursor P00PJ6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            A361DisCod = P00PJ6_A361DisCod[0] ;
            /* Using cursor P00PJ7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            A392DisUniMed = P00PJ7_A392DisUniMed[0] ;
            /* Using cursor P00PJ8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            A60AlbRUniUti = P00PJ8_A60AlbRUniUti[0] ;
            A54AlbRPieUti = P00PJ8_A54AlbRPieUti[0] ;
            A47AlbREst = P00PJ8_A47AlbREst[0] ;
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
            A203BarPieKil = DecimalUtil.doubleToDec(0) ;
            A205BarPieMet = DecimalUtil.doubleToDec(0) ;
            A1501BarPiePie = 0 ;
            A2186BarPieLoc = "XXXXXXXXXX" ;
            n2186BarPieLoc = false ;
            /* Using cursor P00PJ9 */
            pr_default.execute(7, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            /* Using cursor P00PJ10 */
            pr_default.execute(8, new Object[] {A203BarPieKil, A205BarPieMet, Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(5);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P00PJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV12AlbRecCod), Integer.valueOf(AV8DisCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A2160HisEmpAlbD = P00PJ11_A2160HisEmpAlbD[0] ;
         n2160HisEmpAlbD = P00PJ11_n2160HisEmpAlbD[0] ;
         A2166HisEmpLTip = P00PJ11_A2166HisEmpLTip[0] ;
         n2166HisEmpLTip = P00PJ11_n2166HisEmpLTip[0] ;
         A44AlbRecCod = P00PJ11_A44AlbRecCod[0] ;
         A2164HisEmpKu = P00PJ11_A2164HisEmpKu[0] ;
         n2164HisEmpKu = P00PJ11_n2164HisEmpKu[0] ;
         A2169HisEmpMu = P00PJ11_A2169HisEmpMu[0] ;
         n2169HisEmpMu = P00PJ11_n2169HisEmpMu[0] ;
         A2172HisEmpPu = P00PJ11_A2172HisEmpPu[0] ;
         n2172HisEmpPu = P00PJ11_n2172HisEmpPu[0] ;
         A2165HisEmpLin = P00PJ11_A2165HisEmpLin[0] ;
         if ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "B", "")) == 0 )
         {
            A2164HisEmpKu = DecimalUtil.doubleToDec(0) ;
            n2164HisEmpKu = false ;
            A2169HisEmpMu = DecimalUtil.doubleToDec(0) ;
            n2169HisEmpMu = false ;
            A2172HisEmpPu = (short)(0) ;
            n2172HisEmpPu = false ;
            /* Using cursor P00PJ12 */
            pr_default.execute(10, new Object[] {Boolean.valueOf(n2164HisEmpKu), A2164HisEmpKu, Boolean.valueOf(n2169HisEmpMu), A2169HisEmpMu, Boolean.valueOf(n2172HisEmpPu), Short.valueOf(A2172HisEmpPu), A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paux001.this.A396EmprCod;
      this.aP1[0] = paux001.this.AV9BarCod;
      this.aP2[0] = paux001.this.AV10BarCodReo;
      this.aP3[0] = paux001.this.AV11BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "paux001");
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
      P00PJ2_A396EmprCod = new String[] {""} ;
      P00PJ2_A130BarCodPar = new String[] {""} ;
      P00PJ2_A132BarCodReo = new byte[1] ;
      P00PJ2_A129BarCod = new int[1] ;
      P00PJ2_A44AlbRecCod = new int[1] ;
      P00PJ2_A200BarPieCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      P00PJ3_A396EmprCod = new String[] {""} ;
      P00PJ3_A130BarCodPar = new String[] {""} ;
      P00PJ3_A132BarCodReo = new byte[1] ;
      P00PJ3_A129BarCod = new int[1] ;
      P00PJ3_A361DisCod = new int[1] ;
      P00PJ4_A396EmprCod = new String[] {""} ;
      P00PJ4_A1141DisBarPar = new String[] {""} ;
      P00PJ4_A1140DisBarReo = new byte[1] ;
      P00PJ4_A1139DisBarCod = new int[1] ;
      P00PJ4_A1146DisDisCod = new int[1] ;
      A1141DisBarPar = "" ;
      P00PJ5_A44AlbRecCod = new int[1] ;
      P00PJ5_A396EmprCod = new String[] {""} ;
      P00PJ5_A129BarCod = new int[1] ;
      P00PJ5_A132BarCodReo = new byte[1] ;
      P00PJ5_A130BarCodPar = new String[] {""} ;
      P00PJ5_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00PJ5_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00PJ5_A1501BarPiePie = new int[1] ;
      P00PJ5_A2186BarPieLoc = new String[] {""} ;
      P00PJ5_n2186BarPieLoc = new boolean[] {false} ;
      P00PJ5_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      P00PJ6_A361DisCod = new int[1] ;
      P00PJ7_A392DisUniMed = new String[] {""} ;
      A392DisUniMed = "" ;
      P00PJ8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00PJ8_A54AlbRPieUti = new int[1] ;
      P00PJ8_A47AlbREst = new byte[1] ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      P00PJ11_A396EmprCod = new String[] {""} ;
      P00PJ11_A2160HisEmpAlbD = new long[1] ;
      P00PJ11_n2160HisEmpAlbD = new boolean[] {false} ;
      P00PJ11_A2166HisEmpLTip = new String[] {""} ;
      P00PJ11_n2166HisEmpLTip = new boolean[] {false} ;
      P00PJ11_A44AlbRecCod = new int[1] ;
      P00PJ11_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00PJ11_n2164HisEmpKu = new boolean[] {false} ;
      P00PJ11_A2169HisEmpMu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00PJ11_n2169HisEmpMu = new boolean[] {false} ;
      P00PJ11_A2172HisEmpPu = new short[1] ;
      P00PJ11_n2172HisEmpPu = new boolean[] {false} ;
      P00PJ11_A2165HisEmpLin = new short[1] ;
      A2166HisEmpLTip = "" ;
      A2164HisEmpKu = DecimalUtil.ZERO ;
      A2169HisEmpMu = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paux001__default(),
         new Object[] {
             new Object[] {
            P00PJ2_A396EmprCod, P00PJ2_A130BarCodPar, P00PJ2_A132BarCodReo, P00PJ2_A129BarCod, P00PJ2_A44AlbRecCod, P00PJ2_A200BarPieCod
            }
            , new Object[] {
            P00PJ3_A396EmprCod, P00PJ3_A130BarCodPar, P00PJ3_A132BarCodReo, P00PJ3_A129BarCod, P00PJ3_A361DisCod
            }
            , new Object[] {
            P00PJ4_A396EmprCod, P00PJ4_A1141DisBarPar, P00PJ4_A1140DisBarReo, P00PJ4_A1139DisBarCod, P00PJ4_A1146DisDisCod
            }
            , new Object[] {
            P00PJ5_A44AlbRecCod, P00PJ5_A396EmprCod, P00PJ5_A129BarCod, P00PJ5_A132BarCodReo, P00PJ5_A130BarCodPar, P00PJ5_A203BarPieKil, P00PJ5_A205BarPieMet, P00PJ5_A1501BarPiePie, P00PJ5_A2186BarPieLoc, P00PJ5_n2186BarPieLoc,
            P00PJ5_A200BarPieCod
            }
            , new Object[] {
            P00PJ6_A361DisCod
            }
            , new Object[] {
            P00PJ7_A392DisUniMed
            }
            , new Object[] {
            P00PJ8_A60AlbRUniUti, P00PJ8_A54AlbRPieUti, P00PJ8_A47AlbREst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00PJ11_A396EmprCod, P00PJ11_A2160HisEmpAlbD, P00PJ11_n2160HisEmpAlbD, P00PJ11_A2166HisEmpLTip, P00PJ11_n2166HisEmpLTip, P00PJ11_A44AlbRecCod, P00PJ11_A2164HisEmpKu, P00PJ11_n2164HisEmpKu, P00PJ11_A2169HisEmpMu, P00PJ11_n2169HisEmpMu,
            P00PJ11_A2172HisEmpPu, P00PJ11_n2172HisEmpPu, P00PJ11_A2165HisEmpLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte A132BarCodReo ;
   private byte A1140DisBarReo ;
   private byte A47AlbREst ;
   private short A2172HisEmpPu ;
   private short A2165HisEmpLin ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int AV12AlbRecCod ;
   private int A361DisCod ;
   private int AV8DisCod ;
   private int A1139DisBarCod ;
   private int A1146DisDisCod ;
   private int A1501BarPiePie ;
   private int A54AlbRPieUti ;
   private long A2160HisEmpAlbD ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A2164HisEmpKu ;
   private java.math.BigDecimal A2169HisEmpMu ;
   private String A396EmprCod ;
   private String AV11BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String A1141DisBarPar ;
   private String A2186BarPieLoc ;
   private String A392DisUniMed ;
   private String A2166HisEmpLTip ;
   private boolean n2186BarPieLoc ;
   private boolean n2160HisEmpAlbD ;
   private boolean n2166HisEmpLTip ;
   private boolean n2164HisEmpKu ;
   private boolean n2169HisEmpMu ;
   private boolean n2172HisEmpPu ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00PJ2_A396EmprCod ;
   private String[] P00PJ2_A130BarCodPar ;
   private byte[] P00PJ2_A132BarCodReo ;
   private int[] P00PJ2_A129BarCod ;
   private int[] P00PJ2_A44AlbRecCod ;
   private String[] P00PJ2_A200BarPieCod ;
   private String[] P00PJ3_A396EmprCod ;
   private String[] P00PJ3_A130BarCodPar ;
   private byte[] P00PJ3_A132BarCodReo ;
   private int[] P00PJ3_A129BarCod ;
   private int[] P00PJ3_A361DisCod ;
   private String[] P00PJ4_A396EmprCod ;
   private String[] P00PJ4_A1141DisBarPar ;
   private byte[] P00PJ4_A1140DisBarReo ;
   private int[] P00PJ4_A1139DisBarCod ;
   private int[] P00PJ4_A1146DisDisCod ;
   private int[] P00PJ5_A44AlbRecCod ;
   private String[] P00PJ5_A396EmprCod ;
   private int[] P00PJ5_A129BarCod ;
   private byte[] P00PJ5_A132BarCodReo ;
   private String[] P00PJ5_A130BarCodPar ;
   private java.math.BigDecimal[] P00PJ5_A203BarPieKil ;
   private java.math.BigDecimal[] P00PJ5_A205BarPieMet ;
   private int[] P00PJ5_A1501BarPiePie ;
   private String[] P00PJ5_A2186BarPieLoc ;
   private boolean[] P00PJ5_n2186BarPieLoc ;
   private String[] P00PJ5_A200BarPieCod ;
   private int[] P00PJ6_A361DisCod ;
   private String[] P00PJ7_A392DisUniMed ;
   private java.math.BigDecimal[] P00PJ8_A60AlbRUniUti ;
   private int[] P00PJ8_A54AlbRPieUti ;
   private byte[] P00PJ8_A47AlbREst ;
   private String[] P00PJ11_A396EmprCod ;
   private long[] P00PJ11_A2160HisEmpAlbD ;
   private boolean[] P00PJ11_n2160HisEmpAlbD ;
   private String[] P00PJ11_A2166HisEmpLTip ;
   private boolean[] P00PJ11_n2166HisEmpLTip ;
   private int[] P00PJ11_A44AlbRecCod ;
   private java.math.BigDecimal[] P00PJ11_A2164HisEmpKu ;
   private boolean[] P00PJ11_n2164HisEmpKu ;
   private java.math.BigDecimal[] P00PJ11_A2169HisEmpMu ;
   private boolean[] P00PJ11_n2169HisEmpMu ;
   private short[] P00PJ11_A2172HisEmpPu ;
   private boolean[] P00PJ11_n2172HisEmpPu ;
   private short[] P00PJ11_A2165HisEmpLin ;
}

final  class paux001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00PJ2", "SELECT * FROM (SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00PJ3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00PJ4", "SELECT EmprCod, DisBarPar, DisBarReo, DisBarCod, DisDisCod FROM TXPDISBAR WHERE EmprCod = ? and DisDisCod = ? ORDER BY EmprCod, DisDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00PJ5", "SELECT AlbRecCod, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, BarPieMet, BarPiePie, BarPieLoc, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00PJ6", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00PJ7", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00PJ8", "SELECT AlbRUniUti, AlbRPieUti, AlbREst FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00PJ9", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P00PJ10", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?, BarPiePie=?, BarPieLoc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P00PJ11", "SELECT EmprCod, HisEmpAlbD, HisEmpLTip, AlbRecCod, HisEmpKu, HisEmpMu, HisEmpPu, HisEmpLin FROM TXPHISEMP WHERE (EmprCod = ? and AlbRecCod = ?) AND (HisEmpAlbD = ?) ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00PJ12", "UPDATE TXPHISEMP SET HisEmpKu=?, HisEmpMu=?, HisEmpPu=?  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 9);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 9 :
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 10);
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
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
      }
   }

}

