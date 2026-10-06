package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prieclca extends GXProcedure
{
   public prieclca( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prieclca.class ), "" );
   }

   public prieclca( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           java.math.BigDecimal[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      prieclca.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      prieclca.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prieclca.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      prieclca.this.AV10Riesgo = aP2[0];
      this.aP2 = aP2;
      prieclca.this.AV15Kgsalb = aP3[0];
      this.aP3 = aP3;
      prieclca.this.AV17KgsDisp = aP4[0];
      this.aP4 = aP4;
      prieclca.this.AV16KgsHDR = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Consulta Riesgo Cliente", "") );
      AV10Riesgo = DecimalUtil.doubleToDec(0) ;
      AV15Kgsalb = DecimalUtil.doubleToDec(0) ;
      AV17KgsDisp = DecimalUtil.doubleToDec(0) ;
      AV16KgsHDR = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02P52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02P52_A252CliCod[0] ;
         n252CliCod = P02P52_n252CliCod[0] ;
         A300CliRieCir = P02P52_A300CliRieCir[0] ;
         A279CliNom = P02P52_A279CliNom[0] ;
         AV10Riesgo = A300CliRieCir ;
         AV14CliNom = A279CliNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02P54 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A33AlbProEst = P02P54_A33AlbProEst[0] ;
         A1243GuiRemCli = P02P54_A1243GuiRemCli[0] ;
         A30AlbProCod = P02P54_A30AlbProCod[0] ;
         A35AlbProKgs = P02P54_A35AlbProKgs[0] ;
         n35AlbProKgs = P02P54_n35AlbProKgs[0] ;
         A35AlbProKgs = P02P54_A35AlbProKgs[0] ;
         n35AlbProKgs = P02P54_n35AlbProKgs[0] ;
         GXt_decimal1 = AV12Total ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A30AlbProCod ;
         GXv_decimal4[0] = GXt_decimal1 ;
         new app.ptotalbpr(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_decimal4) ;
         prieclca.this.A396EmprCod = GXv_char2[0] ;
         prieclca.this.A30AlbProCod = GXv_int3[0] ;
         prieclca.this.GXt_decimal1 = GXv_decimal4[0] ;
         AV12Total = GXt_decimal1 ;
         AV10Riesgo = AV10Riesgo.add(AV12Total) ;
         AV15Kgsalb = AV15Kgsalb.add(A35AlbProKgs) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P02P55 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P02P55_A252CliCod[0] ;
         n252CliCod = P02P55_n252CliCod[0] ;
         A16AlbComEst = P02P55_A16AlbComEst[0] ;
         A14AlbComCod = P02P55_A14AlbComCod[0] ;
         GXt_decimal1 = AV12Total ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int5[0] = A14AlbComCod ;
         GXv_decimal4[0] = GXt_decimal1 ;
         new app.ptotalbc(remoteHandle, context).execute( GXv_char2, GXv_int5, GXv_decimal4) ;
         prieclca.this.A396EmprCod = GXv_char2[0] ;
         prieclca.this.A14AlbComCod = GXv_int5[0] ;
         prieclca.this.GXt_decimal1 = GXv_decimal4[0] ;
         AV12Total = GXt_decimal1 ;
         AV10Riesgo = AV10Riesgo.add(AV12Total) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P02P57 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A213BarSit = P02P57_A213BarSit[0] ;
         A252CliCod = P02P57_A252CliCod[0] ;
         n252CliCod = P02P57_n252CliCod[0] ;
         A130BarCodPar = P02P57_A130BarCodPar[0] ;
         A132BarCodReo = P02P57_A132BarCodReo[0] ;
         A129BarCod = P02P57_A129BarCod[0] ;
         A166BarKgm = P02P57_A166BarKgm[0] ;
         n166BarKgm = P02P57_n166BarKgm[0] ;
         A166BarKgm = P02P57_A166BarKgm[0] ;
         n166BarKgm = P02P57_n166BarKgm[0] ;
         GXt_decimal1 = AV12Total ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char7[0] = A130BarCodPar ;
         GXv_int8[0] = 0 ;
         GXv_char9[0] = httpContext.getMessage( "H", "") ;
         GXv_decimal4[0] = GXt_decimal1 ;
         new app.pprehdr(remoteHandle, context).execute( GXv_char2, GXv_int5, GXv_int6, GXv_char7, GXv_int8, GXv_char9, GXv_decimal4) ;
         prieclca.this.A396EmprCod = GXv_char2[0] ;
         prieclca.this.A129BarCod = GXv_int5[0] ;
         prieclca.this.A132BarCodReo = GXv_int6[0] ;
         prieclca.this.A130BarCodPar = GXv_char7[0] ;
         prieclca.this.GXt_decimal1 = GXv_decimal4[0] ;
         AV12Total = GXt_decimal1 ;
         AV10Riesgo = AV10Riesgo.add(AV12Total) ;
         AV16KgsHDR = AV16KgsHDR.add(A166BarKgm) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P02P58 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A367DisEst = P02P58_A367DisEst[0] ;
         A252CliCod = P02P58_A252CliCod[0] ;
         n252CliCod = P02P58_n252CliCod[0] ;
         A361DisCod = P02P58_A361DisCod[0] ;
         A375DisNumUni = P02P58_A375DisNumUni[0] ;
         GXt_decimal1 = AV12Total ;
         GXv_char9[0] = A396EmprCod ;
         GXv_int8[0] = 0 ;
         GXv_int6[0] = (byte)(0) ;
         GXv_char7[0] = " " ;
         GXv_int5[0] = A361DisCod ;
         GXv_char2[0] = httpContext.getMessage( "D", "") ;
         GXv_decimal4[0] = GXt_decimal1 ;
         new app.pprehdr(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_int6, GXv_char7, GXv_int5, GXv_char2, GXv_decimal4) ;
         prieclca.this.A396EmprCod = GXv_char9[0] ;
         prieclca.this.A361DisCod = GXv_int5[0] ;
         prieclca.this.GXt_decimal1 = GXv_decimal4[0] ;
         AV12Total = GXt_decimal1 ;
         AV10Riesgo = AV10Riesgo.add(AV12Total) ;
         AV17KgsDisp = AV17KgsDisp.add(A375DisNumUni) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prieclca.this.A396EmprCod;
      this.aP1[0] = prieclca.this.AV8CliCod;
      this.aP2[0] = prieclca.this.AV10Riesgo;
      this.aP3[0] = prieclca.this.AV15Kgsalb;
      this.aP4[0] = prieclca.this.AV17KgsDisp;
      this.aP5[0] = prieclca.this.AV16KgsHDR;
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
      P02P52_A396EmprCod = new String[] {""} ;
      P02P52_A252CliCod = new int[1] ;
      P02P52_n252CliCod = new boolean[] {false} ;
      P02P52_A300CliRieCir = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02P52_A279CliNom = new String[] {""} ;
      A300CliRieCir = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV14CliNom = "" ;
      P02P54_A396EmprCod = new String[] {""} ;
      P02P54_A33AlbProEst = new byte[1] ;
      P02P54_A1243GuiRemCli = new int[1] ;
      P02P54_A30AlbProCod = new long[1] ;
      P02P54_A35AlbProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02P54_n35AlbProKgs = new boolean[] {false} ;
      A35AlbProKgs = DecimalUtil.ZERO ;
      AV12Total = DecimalUtil.ZERO ;
      GXv_int3 = new long[1] ;
      P02P55_A396EmprCod = new String[] {""} ;
      P02P55_A252CliCod = new int[1] ;
      P02P55_n252CliCod = new boolean[] {false} ;
      P02P55_A16AlbComEst = new byte[1] ;
      P02P55_A14AlbComCod = new int[1] ;
      P02P57_A396EmprCod = new String[] {""} ;
      P02P57_A213BarSit = new byte[1] ;
      P02P57_A252CliCod = new int[1] ;
      P02P57_n252CliCod = new boolean[] {false} ;
      P02P57_A130BarCodPar = new String[] {""} ;
      P02P57_A132BarCodReo = new byte[1] ;
      P02P57_A129BarCod = new int[1] ;
      P02P57_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02P57_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      P02P58_A396EmprCod = new String[] {""} ;
      P02P58_A367DisEst = new byte[1] ;
      P02P58_A252CliCod = new int[1] ;
      P02P58_n252CliCod = new boolean[] {false} ;
      P02P58_A361DisCod = new int[1] ;
      P02P58_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A375DisNumUni = DecimalUtil.ZERO ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_char9 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prieclca__default(),
         new Object[] {
             new Object[] {
            P02P52_A396EmprCod, P02P52_A252CliCod, P02P52_A300CliRieCir, P02P52_A279CliNom
            }
            , new Object[] {
            P02P54_A396EmprCod, P02P54_A33AlbProEst, P02P54_A1243GuiRemCli, P02P54_A30AlbProCod, P02P54_A35AlbProKgs, P02P54_n35AlbProKgs
            }
            , new Object[] {
            P02P55_A396EmprCod, P02P55_A252CliCod, P02P55_A16AlbComEst, P02P55_A14AlbComCod
            }
            , new Object[] {
            P02P57_A396EmprCod, P02P57_A213BarSit, P02P57_A252CliCod, P02P57_n252CliCod, P02P57_A130BarCodPar, P02P57_A132BarCodReo, P02P57_A129BarCod, P02P57_A166BarKgm, P02P57_n166BarKgm
            }
            , new Object[] {
            P02P58_A396EmprCod, P02P58_A367DisEst, P02P58_A252CliCod, P02P58_A361DisCod, P02P58_A375DisNumUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      AV13Fichero = httpContext.getMessage( httpContext.getMessage( "RIECLI", ""), "") ;
   }

   private byte A33AlbProEst ;
   private byte A16AlbComEst ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A367DisEst ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int A252CliCod ;
   private int A1243GuiRemCli ;
   private int A14AlbComCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int GXv_int8[] ;
   private int GXv_int5[] ;
   private long A30AlbProCod ;
   private long GXv_int3[] ;
   private java.math.BigDecimal AV10Riesgo ;
   private java.math.BigDecimal AV15Kgsalb ;
   private java.math.BigDecimal AV17KgsDisp ;
   private java.math.BigDecimal AV16KgsHDR ;
   private java.math.BigDecimal A300CliRieCir ;
   private java.math.BigDecimal A35AlbProKgs ;
   private java.math.BigDecimal AV12Total ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String AV14CliNom ;
   private String A130BarCodPar ;
   private String GXv_char9[] ;
   private String GXv_char7[] ;
   private String GXv_char2[] ;
   private String AV13Fichero ;
   private boolean n252CliCod ;
   private boolean n35AlbProKgs ;
   private boolean n166BarKgm ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02P52_A396EmprCod ;
   private int[] P02P52_A252CliCod ;
   private boolean[] P02P52_n252CliCod ;
   private java.math.BigDecimal[] P02P52_A300CliRieCir ;
   private String[] P02P52_A279CliNom ;
   private String[] P02P54_A396EmprCod ;
   private byte[] P02P54_A33AlbProEst ;
   private int[] P02P54_A1243GuiRemCli ;
   private long[] P02P54_A30AlbProCod ;
   private java.math.BigDecimal[] P02P54_A35AlbProKgs ;
   private boolean[] P02P54_n35AlbProKgs ;
   private String[] P02P55_A396EmprCod ;
   private int[] P02P55_A252CliCod ;
   private boolean[] P02P55_n252CliCod ;
   private byte[] P02P55_A16AlbComEst ;
   private int[] P02P55_A14AlbComCod ;
   private String[] P02P57_A396EmprCod ;
   private byte[] P02P57_A213BarSit ;
   private int[] P02P57_A252CliCod ;
   private boolean[] P02P57_n252CliCod ;
   private String[] P02P57_A130BarCodPar ;
   private byte[] P02P57_A132BarCodReo ;
   private int[] P02P57_A129BarCod ;
   private java.math.BigDecimal[] P02P57_A166BarKgm ;
   private boolean[] P02P57_n166BarKgm ;
   private String[] P02P58_A396EmprCod ;
   private byte[] P02P58_A367DisEst ;
   private int[] P02P58_A252CliCod ;
   private boolean[] P02P58_n252CliCod ;
   private int[] P02P58_A361DisCod ;
   private java.math.BigDecimal[] P02P58_A375DisNumUni ;
}

final  class prieclca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02P52", "SELECT EmprCod, CliCod, CliRieCir, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02P54", "SELECT T1.EmprCod, T1.AlbProEst, T1.GuiRemCli, T1.AlbProCod, COALESCE( T2.AlbProKgs, 0) AS AlbProKgs FROM (TXPCALPRD T1 LEFT JOIN (SELECT SUM(BarAlbKgmE) AS AlbProKgs, EmprCod, AlbProCod FROM TXPALBBAR GROUP BY EmprCod, AlbProCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ? and T1.GuiRemCli = ?) AND (T1.AlbProEst < 2) ORDER BY T1.EmprCod, T1.GuiRemCli, T1.AlbProEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02P55", "SELECT EmprCod, CliCod, AlbComEst, AlbComCod FROM TXPCALCOM WHERE (EmprCod = ? and CliCod = ?) AND (AlbComEst < 2) ORDER BY EmprCod, CliCod, AlbComEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02P57", "SELECT T1.EmprCod, T1.BarSit, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T1.BarSit < 9) ORDER BY T1.EmprCod, T1.CliCod, T1.BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02P58", "SELECT EmprCod, DisEst, CliCod, DisCod, DisNumUni FROM TXPDISPOS WHERE (EmprCod = ? and CliCod = ?) AND (DisEst < 3) ORDER BY EmprCod, CliCod, DisEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

