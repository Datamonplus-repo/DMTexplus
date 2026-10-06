package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodhi1 extends GXProcedure
{
   public pmodhi1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodhi1.class ), "" );
   }

   public pmodhi1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      pmodhi1.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pmodhi1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodhi1.this.AV15HisEmpAlbD = aP1[0];
      this.aP1 = aP1;
      pmodhi1.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pmodhi1.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pmodhi1.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pmodhi1.this.AV16Kilos = aP5[0];
      this.aP5 = aP5;
      pmodhi1.this.AV17Metros = aP6[0];
      this.aP6 = aP6;
      pmodhi1.this.AV18Piezas = aP7[0];
      this.aP7 = aP7;
      pmodhi1.this.AV19KilAnt = aP8[0];
      this.aP8 = aP8;
      pmodhi1.this.AV20MetAnt = aP9[0];
      this.aP9 = aP9;
      pmodhi1.this.AV21PieAnt = aP10[0];
      this.aP10 = aP10;
      pmodhi1.this.AV22HisEmpLTip = aP11[0];
      this.aP11 = aP11;
      pmodhi1.this.AV23Modo = aP12[0];
      this.aP12 = aP12;
      pmodhi1.this.AV24BarPieCod = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35CodAlb = GXutil.str( AV15HisEmpAlbD, 10, 0) ;
      /* Using cursor P00CM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A365DisDes = P00CM2_A365DisDes[0] ;
         A362DisColNom = P00CM2_A362DisColNom[0] ;
         n362DisColNom = P00CM2_n362DisColNom[0] ;
         A363DisColNum = P00CM2_A363DisColNum[0] ;
         n363DisColNum = P00CM2_n363DisColNum[0] ;
         A361DisCod = P00CM2_A361DisCod[0] ;
         A362DisColNom = P00CM2_A362DisColNom[0] ;
         n362DisColNom = P00CM2_n362DisColNom[0] ;
         A363DisColNum = P00CM2_A363DisColNum[0] ;
         n363DisColNum = P00CM2_n363DisColNum[0] ;
         AV32DisDes = A365DisDes ;
         AV33BarColNom = A362DisColNom ;
         AV34BarColNum = A363DisColNum ;
         AV26DisCod = A361DisCod ;
         if ( GXutil.strcmp(AV32DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P00CM3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV24BarPieCod});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A200BarPieCod = P00CM3_A200BarPieCod[0] ;
               A44AlbRecCod = P00CM3_A44AlbRecCod[0] ;
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = AV26DisCod ;
               GXv_int3[0] = A44AlbRecCod ;
               GXv_decimal4[0] = AV16Kilos ;
               GXv_decimal5[0] = AV17Metros ;
               GXv_int6[0] = 1 ;
               GXv_decimal7[0] = AV19KilAnt ;
               GXv_decimal8[0] = AV20MetAnt ;
               GXv_int9[0] = 1 ;
               GXv_char10[0] = AV22HisEmpLTip ;
               GXv_char11[0] = AV33BarColNom ;
               GXv_int12[0] = AV34BarColNum ;
               GXv_char13[0] = AV23Modo ;
               GXv_char14[0] = AV35CodAlb ;
               new app.pmodhis(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_decimal4, GXv_decimal5, GXv_int6, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_char14) ;
               pmodhi1.this.A396EmprCod = GXv_char1[0] ;
               pmodhi1.this.AV26DisCod = (int)((int)(GXv_int2[0])) ;
               pmodhi1.this.A44AlbRecCod = GXv_int3[0] ;
               pmodhi1.this.AV16Kilos = GXv_decimal4[0] ;
               pmodhi1.this.AV17Metros = GXv_decimal5[0] ;
               pmodhi1.this.AV19KilAnt = GXv_decimal7[0] ;
               pmodhi1.this.AV20MetAnt = GXv_decimal8[0] ;
               pmodhi1.this.AV22HisEmpLTip = GXv_char10[0] ;
               pmodhi1.this.AV33BarColNom = GXv_char11[0] ;
               pmodhi1.this.AV34BarColNum = GXv_int12[0] ;
               pmodhi1.this.AV23Modo = GXv_char13[0] ;
               pmodhi1.this.AV35CodAlb = GXv_char14[0] ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
         else
         {
            /* Using cursor P00CM4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P00CM4_A44AlbRecCod[0] ;
               A200BarPieCod = P00CM4_A200BarPieCod[0] ;
               GXv_char14[0] = A396EmprCod ;
               GXv_int2[0] = AV26DisCod ;
               GXv_int12[0] = A44AlbRecCod ;
               GXv_decimal8[0] = AV16Kilos ;
               GXv_decimal7[0] = AV17Metros ;
               GXv_int9[0] = AV18Piezas ;
               GXv_decimal5[0] = AV19KilAnt ;
               GXv_decimal4[0] = AV20MetAnt ;
               GXv_int6[0] = AV21PieAnt ;
               GXv_char13[0] = AV22HisEmpLTip ;
               GXv_char11[0] = AV33BarColNom ;
               GXv_int3[0] = AV34BarColNum ;
               GXv_char10[0] = AV23Modo ;
               GXv_char1[0] = AV35CodAlb ;
               new app.pmodhis(remoteHandle, context).execute( GXv_char14, GXv_int2, GXv_int12, GXv_decimal8, GXv_decimal7, GXv_int9, GXv_decimal5, GXv_decimal4, GXv_int6, GXv_char13, GXv_char11, GXv_int3, GXv_char10, GXv_char1) ;
               pmodhi1.this.A396EmprCod = GXv_char14[0] ;
               pmodhi1.this.AV26DisCod = (int)((int)(GXv_int2[0])) ;
               pmodhi1.this.A44AlbRecCod = GXv_int12[0] ;
               pmodhi1.this.AV16Kilos = GXv_decimal8[0] ;
               pmodhi1.this.AV17Metros = GXv_decimal7[0] ;
               pmodhi1.this.AV18Piezas = GXv_int9[0] ;
               pmodhi1.this.AV19KilAnt = GXv_decimal5[0] ;
               pmodhi1.this.AV20MetAnt = GXv_decimal4[0] ;
               pmodhi1.this.AV21PieAnt = GXv_int6[0] ;
               pmodhi1.this.AV22HisEmpLTip = GXv_char13[0] ;
               pmodhi1.this.AV33BarColNom = GXv_char11[0] ;
               pmodhi1.this.AV34BarColNum = GXv_int3[0] ;
               pmodhi1.this.AV23Modo = GXv_char10[0] ;
               pmodhi1.this.AV35CodAlb = GXv_char1[0] ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodhi1.this.A396EmprCod;
      this.aP1[0] = pmodhi1.this.AV15HisEmpAlbD;
      this.aP2[0] = pmodhi1.this.A129BarCod;
      this.aP3[0] = pmodhi1.this.A132BarCodReo;
      this.aP4[0] = pmodhi1.this.A130BarCodPar;
      this.aP5[0] = pmodhi1.this.AV16Kilos;
      this.aP6[0] = pmodhi1.this.AV17Metros;
      this.aP7[0] = pmodhi1.this.AV18Piezas;
      this.aP8[0] = pmodhi1.this.AV19KilAnt;
      this.aP9[0] = pmodhi1.this.AV20MetAnt;
      this.aP10[0] = pmodhi1.this.AV21PieAnt;
      this.aP11[0] = pmodhi1.this.AV22HisEmpLTip;
      this.aP12[0] = pmodhi1.this.AV23Modo;
      this.aP13[0] = pmodhi1.this.AV24BarPieCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35CodAlb = "" ;
      scmdbuf = "" ;
      P00CM2_A396EmprCod = new String[] {""} ;
      P00CM2_A129BarCod = new int[1] ;
      P00CM2_A132BarCodReo = new byte[1] ;
      P00CM2_A130BarCodPar = new String[] {""} ;
      P00CM2_A365DisDes = new String[] {""} ;
      P00CM2_A362DisColNom = new String[] {""} ;
      P00CM2_n362DisColNom = new boolean[] {false} ;
      P00CM2_A363DisColNum = new int[1] ;
      P00CM2_n363DisColNum = new boolean[] {false} ;
      P00CM2_A361DisCod = new int[1] ;
      A365DisDes = "" ;
      A362DisColNom = "" ;
      AV32DisDes = "" ;
      AV33BarColNom = "" ;
      P00CM3_A396EmprCod = new String[] {""} ;
      P00CM3_A129BarCod = new int[1] ;
      P00CM3_A132BarCodReo = new byte[1] ;
      P00CM3_A130BarCodPar = new String[] {""} ;
      P00CM3_A200BarPieCod = new String[] {""} ;
      P00CM3_A44AlbRecCod = new int[1] ;
      A200BarPieCod = "" ;
      P00CM4_A396EmprCod = new String[] {""} ;
      P00CM4_A129BarCod = new int[1] ;
      P00CM4_A132BarCodReo = new byte[1] ;
      P00CM4_A130BarCodPar = new String[] {""} ;
      P00CM4_A44AlbRecCod = new int[1] ;
      P00CM4_A200BarPieCod = new String[] {""} ;
      GXv_char14 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int12 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      GXv_char13 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodhi1__default(),
         new Object[] {
             new Object[] {
            P00CM2_A396EmprCod, P00CM2_A129BarCod, P00CM2_A132BarCodReo, P00CM2_A130BarCodPar, P00CM2_A365DisDes, P00CM2_A362DisColNom, P00CM2_n362DisColNom, P00CM2_A363DisColNum, P00CM2_n363DisColNum, P00CM2_A361DisCod
            }
            , new Object[] {
            P00CM3_A396EmprCod, P00CM3_A129BarCod, P00CM3_A132BarCodReo, P00CM3_A130BarCodPar, P00CM3_A200BarPieCod, P00CM3_A44AlbRecCod
            }
            , new Object[] {
            P00CM4_A396EmprCod, P00CM4_A129BarCod, P00CM4_A132BarCodReo, P00CM4_A130BarCodPar, P00CM4_A44AlbRecCod, P00CM4_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV18Piezas ;
   private int AV21PieAnt ;
   private int A363DisColNum ;
   private int A361DisCod ;
   private int AV34BarColNum ;
   private int AV26DisCod ;
   private int A44AlbRecCod ;
   private int GXv_int12[] ;
   private int GXv_int9[] ;
   private int GXv_int6[] ;
   private int GXv_int3[] ;
   private long AV15HisEmpAlbD ;
   private long GXv_int2[] ;
   private java.math.BigDecimal AV16Kilos ;
   private java.math.BigDecimal AV17Metros ;
   private java.math.BigDecimal AV19KilAnt ;
   private java.math.BigDecimal AV20MetAnt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV22HisEmpLTip ;
   private String AV23Modo ;
   private String AV24BarPieCod ;
   private String AV35CodAlb ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String A362DisColNom ;
   private String AV32DisDes ;
   private String AV33BarColNom ;
   private String A200BarPieCod ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char1[] ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private String[] aP13 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CM2_A396EmprCod ;
   private int[] P00CM2_A129BarCod ;
   private byte[] P00CM2_A132BarCodReo ;
   private String[] P00CM2_A130BarCodPar ;
   private String[] P00CM2_A365DisDes ;
   private String[] P00CM2_A362DisColNom ;
   private boolean[] P00CM2_n362DisColNom ;
   private int[] P00CM2_A363DisColNum ;
   private boolean[] P00CM2_n363DisColNum ;
   private int[] P00CM2_A361DisCod ;
   private String[] P00CM3_A396EmprCod ;
   private int[] P00CM3_A129BarCod ;
   private byte[] P00CM3_A132BarCodReo ;
   private String[] P00CM3_A130BarCodPar ;
   private String[] P00CM3_A200BarPieCod ;
   private int[] P00CM3_A44AlbRecCod ;
   private String[] P00CM4_A396EmprCod ;
   private int[] P00CM4_A129BarCod ;
   private byte[] P00CM4_A132BarCodReo ;
   private String[] P00CM4_A130BarCodPar ;
   private int[] P00CM4_A44AlbRecCod ;
   private String[] P00CM4_A200BarPieCod ;
}

final  class pmodhi1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CM2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisDes, T2.DisColNom, T2.DisColNum, T1.DisCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CM3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CM4", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

