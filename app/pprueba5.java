package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprueba5 extends GXProcedure
{
   public pprueba5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprueba5.class ), "" );
   }

   public pprueba5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pprueba5.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pprueba5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprueba5.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Mts = DecimalUtil.doubleToDec(0) ;
      AV9MtsU = DecimalUtil.doubleToDec(0) ;
      AV10Kgs = DecimalUtil.doubleToDec(0) ;
      AV11KgsU = DecimalUtil.doubleToDec(0) ;
      AV12Pzs = 0 ;
      AV13PzsU = 0 ;
      /* Using cursor P012Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2157AlbRecMtr = P012Z2_A2157AlbRecMtr[0] ;
         A2158AlbRecMtrU = P012Z2_A2158AlbRecMtrU[0] ;
         A2155AlbRecKgm = P012Z2_A2155AlbRecKgm[0] ;
         A2156AlbRecKgmU = P012Z2_A2156AlbRecKgmU[0] ;
         A56AlbRUni = P012Z2_A56AlbRUni[0] ;
         A2159AlbRecPie = P012Z2_A2159AlbRecPie[0] ;
         A56AlbRUni = P012Z2_A56AlbRUni[0] ;
         AV8Mts = AV8Mts.add(A2157AlbRecMtr) ;
         AV9MtsU = AV9MtsU.add(A2158AlbRecMtrU) ;
         AV10Kgs = AV10Kgs.add(A2155AlbRecKgm) ;
         AV11KgsU = AV11KgsU.add(A2156AlbRecKgmU) ;
         AV12Pzs = (int)(AV12Pzs+1) ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            if ( A2158AlbRecMtrU.doubleValue() > 0 )
            {
               AV13PzsU = (int)(AV13PzsU+1) ;
            }
         }
         else
         {
            if ( A2156AlbRecKgmU.doubleValue() > 0 )
            {
               AV13PzsU = (int)(AV13PzsU+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P012Z3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A56AlbRUni = P012Z3_A56AlbRUni[0] ;
         A58AlbRUniEnt = P012Z3_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P012Z3_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P012Z3_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P012Z3_A54AlbRPieUti[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A58AlbRUniEnt = AV8Mts ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A58AlbRUniEnt = AV10Kgs ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A60AlbRUniUti = AV9MtsU ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A60AlbRUniUti = AV11KgsU ;
         }
         A52AlbRPieEnt = AV12Pzs ;
         A54AlbRPieUti = AV13PzsU ;
         /* Using cursor P012Z4 */
         pr_default.execute(2, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P012Z6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A56AlbRUni = P012Z6_A56AlbRUni[0] ;
         A47AlbREst = P012Z6_A47AlbREst[0] ;
         A2151AlbDetMtrU = P012Z6_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P012Z6_A2149AlbDetMtr[0] ;
         A2148AlbDetKgmU = P012Z6_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P012Z6_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = P012Z6_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P012Z6_A2149AlbDetMtr[0] ;
         A2148AlbDetKgmU = P012Z6_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P012Z6_A2146AlbDetKgm[0] ;
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
         if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
         /* Using cursor P012Z7 */
         pr_default.execute(4, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprueba5.this.A396EmprCod;
      this.aP1[0] = pprueba5.this.A44AlbRecCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprueba5");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Mts = DecimalUtil.ZERO ;
      AV9MtsU = DecimalUtil.ZERO ;
      AV10Kgs = DecimalUtil.ZERO ;
      AV11KgsU = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P012Z2_A396EmprCod = new String[] {""} ;
      P012Z2_A44AlbRecCod = new int[1] ;
      P012Z2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z2_A56AlbRUni = new String[] {""} ;
      P012Z2_A2159AlbRecPie = new String[] {""} ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A2159AlbRecPie = "" ;
      P012Z3_A396EmprCod = new String[] {""} ;
      P012Z3_A44AlbRecCod = new int[1] ;
      P012Z3_A56AlbRUni = new String[] {""} ;
      P012Z3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z3_A52AlbRPieEnt = new int[1] ;
      P012Z3_A54AlbRPieUti = new int[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      P012Z6_A396EmprCod = new String[] {""} ;
      P012Z6_A44AlbRecCod = new int[1] ;
      P012Z6_A56AlbRUni = new String[] {""} ;
      P012Z6_A47AlbREst = new byte[1] ;
      P012Z6_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z6_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z6_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012Z6_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprueba5__default(),
         new Object[] {
             new Object[] {
            P012Z2_A396EmprCod, P012Z2_A44AlbRecCod, P012Z2_A2157AlbRecMtr, P012Z2_A2158AlbRecMtrU, P012Z2_A2155AlbRecKgm, P012Z2_A2156AlbRecKgmU, P012Z2_A56AlbRUni, P012Z2_A2159AlbRecPie
            }
            , new Object[] {
            P012Z3_A396EmprCod, P012Z3_A44AlbRecCod, P012Z3_A56AlbRUni, P012Z3_A58AlbRUniEnt, P012Z3_A60AlbRUniUti, P012Z3_A52AlbRPieEnt, P012Z3_A54AlbRPieUti
            }
            , new Object[] {
            }
            , new Object[] {
            P012Z6_A396EmprCod, P012Z6_A44AlbRecCod, P012Z6_A56AlbRUni, P012Z6_A47AlbREst, P012Z6_A2151AlbDetMtrU, P012Z6_A2149AlbDetMtr, P012Z6_A2148AlbDetKgmU, P012Z6_A2146AlbDetKgm
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV12Pzs ;
   private int AV13PzsU ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private java.math.BigDecimal AV8Mts ;
   private java.math.BigDecimal AV9MtsU ;
   private java.math.BigDecimal AV10Kgs ;
   private java.math.BigDecimal AV11KgsU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String A2159AlbRecPie ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P012Z2_A396EmprCod ;
   private int[] P012Z2_A44AlbRecCod ;
   private java.math.BigDecimal[] P012Z2_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P012Z2_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P012Z2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P012Z2_A2156AlbRecKgmU ;
   private String[] P012Z2_A56AlbRUni ;
   private String[] P012Z2_A2159AlbRecPie ;
   private String[] P012Z3_A396EmprCod ;
   private int[] P012Z3_A44AlbRecCod ;
   private String[] P012Z3_A56AlbRUni ;
   private java.math.BigDecimal[] P012Z3_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P012Z3_A60AlbRUniUti ;
   private int[] P012Z3_A52AlbRPieEnt ;
   private int[] P012Z3_A54AlbRPieUti ;
   private String[] P012Z6_A396EmprCod ;
   private int[] P012Z6_A44AlbRecCod ;
   private String[] P012Z6_A56AlbRUni ;
   private byte[] P012Z6_A47AlbREst ;
   private java.math.BigDecimal[] P012Z6_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] P012Z6_A2149AlbDetMtr ;
   private java.math.BigDecimal[] P012Z6_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] P012Z6_A2146AlbDetKgm ;
}

final  class pprueba5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012Z2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecMtr, T1.AlbRecMtrU, T1.AlbRecKgm, T1.AlbRecKgmU, T2.AlbRUni, T1.AlbRecPie FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P012Z3", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012Z4", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P012Z6", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRUni, T1.AlbREst, COALESCE( T2.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T2.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T2.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T2.AlbDetKgm, 0) AS AlbDetKgm FROM (TXPALBREC T1 LEFT JOIN (SELECT SUM(AlbRecKgm) AS AlbDetKgm, EmprCod, AlbRecCod, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecMtrU) AS AlbDetMtrU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012Z7", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

