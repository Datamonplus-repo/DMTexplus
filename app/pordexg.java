package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pordexg extends GXProcedure
{
   public pordexg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pordexg.class ), "" );
   }

   public pordexg( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          short[] aP5 ,
                          String[] aP6 ,
                          String[] aP7 ,
                          byte[] aP8 ,
                          String[] aP9 ,
                          java.math.BigDecimal[] aP10 ,
                          java.math.BigDecimal[] aP11 )
   {
      pordexg.this.aP12 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        int[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             int[] aP12 )
   {
      pordexg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pordexg.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pordexg.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pordexg.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pordexg.this.AV37TiKgs = aP4[0];
      this.aP4 = aP4;
      pordexg.this.AV38TiConos = aP5[0];
      this.aP5 = aP5;
      pordexg.this.AV39TiTipDis = aP6[0];
      this.aP6 = aP6;
      pordexg.this.AV40TiMaqcod = aP7[0];
      this.aP7 = aP7;
      pordexg.this.AV41TiReoper = aP8[0];
      this.aP8 = aP8;
      pordexg.this.AV42TiAgrupa = aP9[0];
      this.aP9 = aP9;
      pordexg.this.AV43TiCosteP = aP10[0];
      this.aP10 = aP10;
      pordexg.this.AV44TiCosteA = aP11[0];
      this.aP11 = aP11;
      pordexg.this.AV45Clicod = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00NB3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P00NB3_A120BarAgrEst[0] ;
         A140BarCosAny = P00NB3_A140BarCosAny[0] ;
         A141BarCosPro = P00NB3_A141BarCosPro[0] ;
         A180BarMaqCod = P00NB3_A180BarMaqCod[0] ;
         A148BarEstReo = P00NB3_A148BarEstReo[0] ;
         A2010BarTipDis = P00NB3_A2010BarTipDis[0] ;
         A252CliCod = P00NB3_A252CliCod[0] ;
         n252CliCod = P00NB3_n252CliCod[0] ;
         A166BarKgm = P00NB3_A166BarKgm[0] ;
         A199BarPie1 = P00NB3_A199BarPie1[0] ;
         A365DisDes = P00NB3_A365DisDes[0] ;
         A898BarPieNDes = P00NB3_A898BarPieNDes[0] ;
         A166BarKgm = P00NB3_A166BarKgm[0] ;
         A199BarPie1 = P00NB3_A199BarPie1[0] ;
         A898BarPieNDes = P00NB3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV42TiAgrupa = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV17BarCod, AV18BarCodReo, AV19BarCodPar) ;
            AV42TiAgrupa = GXutil.str( AV17BarCod, 8, 0) + GXutil.str( AV18BarCodReo, 1, 0) + AV19BarCodPar ;
         }
         AV38TiConos = (short)(A198BarPie) ;
         AV44TiCosteA = A140BarCosAny ;
         AV43TiCosteP = A141BarCosPro ;
         AV37TiKgs = A166BarKgm ;
         AV40TiMaqcod = A180BarMaqCod ;
         AV41TiReoper = A148BarEstReo ;
         AV39TiTipDis = A2010BarTipDis ;
         AV45Clicod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pordexg.this.A396EmprCod;
      this.aP1[0] = pordexg.this.A129BarCod;
      this.aP2[0] = pordexg.this.A132BarCodReo;
      this.aP3[0] = pordexg.this.A130BarCodPar;
      this.aP4[0] = pordexg.this.AV37TiKgs;
      this.aP5[0] = pordexg.this.AV38TiConos;
      this.aP6[0] = pordexg.this.AV39TiTipDis;
      this.aP7[0] = pordexg.this.AV40TiMaqcod;
      this.aP8[0] = pordexg.this.AV41TiReoper;
      this.aP9[0] = pordexg.this.AV42TiAgrupa;
      this.aP10[0] = pordexg.this.AV43TiCosteP;
      this.aP11[0] = pordexg.this.AV44TiCosteA;
      this.aP12[0] = pordexg.this.AV45Clicod;
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
      P00NB3_A396EmprCod = new String[] {""} ;
      P00NB3_A129BarCod = new int[1] ;
      P00NB3_A132BarCodReo = new byte[1] ;
      P00NB3_A130BarCodPar = new String[] {""} ;
      P00NB3_A120BarAgrEst = new String[] {""} ;
      P00NB3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NB3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NB3_A180BarMaqCod = new String[] {""} ;
      P00NB3_A148BarEstReo = new byte[1] ;
      P00NB3_A2010BarTipDis = new String[] {""} ;
      P00NB3_A252CliCod = new int[1] ;
      P00NB3_n252CliCod = new boolean[] {false} ;
      P00NB3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NB3_A199BarPie1 = new short[1] ;
      P00NB3_A365DisDes = new String[] {""} ;
      P00NB3_A898BarPieNDes = new int[1] ;
      A120BarAgrEst = "" ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A180BarMaqCod = "" ;
      A2010BarTipDis = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV19BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pordexg__default(),
         new Object[] {
             new Object[] {
            P00NB3_A396EmprCod, P00NB3_A129BarCod, P00NB3_A132BarCodReo, P00NB3_A130BarCodPar, P00NB3_A120BarAgrEst, P00NB3_A140BarCosAny, P00NB3_A141BarCosPro, P00NB3_A180BarMaqCod, P00NB3_A148BarEstReo, P00NB3_A2010BarTipDis,
            P00NB3_A252CliCod, P00NB3_n252CliCod, P00NB3_A166BarKgm, P00NB3_A199BarPie1, P00NB3_A365DisDes, P00NB3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV41TiReoper ;
   private byte A148BarEstReo ;
   private byte AV18BarCodReo ;
   private short AV38TiConos ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV45Clicod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV17BarCod ;
   private java.math.BigDecimal AV37TiKgs ;
   private java.math.BigDecimal AV43TiCosteP ;
   private java.math.BigDecimal AV44TiCosteA ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A166BarKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV39TiTipDis ;
   private String AV40TiMaqcod ;
   private String AV42TiAgrupa ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A180BarMaqCod ;
   private String A2010BarTipDis ;
   private String A365DisDes ;
   private String AV19BarCodPar ;
   private boolean n252CliCod ;
   private int[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private String[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NB3_A396EmprCod ;
   private int[] P00NB3_A129BarCod ;
   private byte[] P00NB3_A132BarCodReo ;
   private String[] P00NB3_A130BarCodPar ;
   private String[] P00NB3_A120BarAgrEst ;
   private java.math.BigDecimal[] P00NB3_A140BarCosAny ;
   private java.math.BigDecimal[] P00NB3_A141BarCosPro ;
   private String[] P00NB3_A180BarMaqCod ;
   private byte[] P00NB3_A148BarEstReo ;
   private String[] P00NB3_A2010BarTipDis ;
   private int[] P00NB3_A252CliCod ;
   private boolean[] P00NB3_n252CliCod ;
   private java.math.BigDecimal[] P00NB3_A166BarKgm ;
   private short[] P00NB3_A199BarPie1 ;
   private String[] P00NB3_A365DisDes ;
   private int[] P00NB3_A898BarPieNDes ;
}

final  class pordexg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NB3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAgrEst, T1.BarCosAny, T1.BarCosPro, T1.BarMaqCod, T1.BarEstReo, T1.BarTipDis, T1.CliCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((int[]) buf[15])[0] = rslt.getInt(15);
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
      }
   }

}

