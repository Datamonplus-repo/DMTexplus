package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class updtalmprx extends GXProcedure
{
   public updtalmprx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( updtalmprx.class ), "" );
   }

   public updtalmprx( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          short[] aP2 ,
                          String[] aP3 ,
                          java.util.Date[] aP4 ,
                          java.util.Date[] aP5 ,
                          String[] aP6 ,
                          String[] aP7 ,
                          java.math.BigDecimal[] aP8 ,
                          java.math.BigDecimal[] aP9 ,
                          int[] aP10 ,
                          java.math.BigDecimal[] aP11 ,
                          java.math.BigDecimal[] aP12 )
   {
      updtalmprx.this.aP13 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        int[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             int[] aP13 )
   {
      updtalmprx.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      updtalmprx.this.AV9PrdNum = aP1[0];
      this.aP1 = aP1;
      updtalmprx.this.AV10LinEnt = aP2[0];
      this.aP2 = aP2;
      updtalmprx.this.AV11Albaran = aP3[0];
      this.aP3 = aP3;
      updtalmprx.this.AV15EntFecEnt = aP4[0];
      this.aP4 = aP4;
      updtalmprx.this.AV17EntFVal = aP5[0];
      this.aP5 = aP5;
      updtalmprx.this.AV16EntLotN = aP6[0];
      this.aP6 = aP6;
      updtalmprx.this.AV19EntNAlbar = aP7[0];
      this.aP7 = aP7;
      updtalmprx.this.AV14EntPre = aP8[0];
      this.aP8 = aP8;
      updtalmprx.this.AV22OldEntPre = aP9[0];
      this.aP9 = aP9;
      updtalmprx.this.AV18EntPrvNum = aP10[0];
      this.aP10 = aP10;
      updtalmprx.this.AV13EntUniEnt = aP11[0];
      this.aP11 = aP11;
      updtalmprx.this.AV21OldEntUnient = aP12[0];
      this.aP12 = aP12;
      updtalmprx.this.AV12Pedcod = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV20Consumos ;
      new app.pbuscon(remoteHandle, context).execute( AV8EmprCod, "011100", GXv_int1) ;
      updtalmprx.this.AV20Consumos = (short)((short)(GXv_int1[0])) ;
      n6156EntPrvNum = false ;
      n658PedCod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P08SG2 */
      pr_default.execute(0, new Object[] {AV19EntNAlbar, Integer.valueOf(AV18EntPrvNum), Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(AV18EntPrvNum), AV16EntLotN, AV17EntFVal, AV15EntFecEnt, AV13EntUniEnt, AV14EntPre, AV13EntUniEnt, Boolean.valueOf(n658PedCod), Integer.valueOf(AV12Pedcod), AV11Albaran, AV8EmprCod, AV9PrdNum, Short.valueOf(AV10LinEnt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
      /* End optimized UPDATE. */
      /* Using cursor P08SG3 */
      pr_default.execute(1, new Object[] {AV8EmprCod, AV9PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P08SG3_A719PrdNum[0] ;
         A396EmprCod = P08SG3_A396EmprCod[0] ;
         A704PrdExiAlm = P08SG3_A704PrdExiAlm[0] ;
         A713PrdFulEnt = P08SG3_A713PrdFulEnt[0] ;
         A709PrdFecPre = P08SG3_A709PrdFecPre[0] ;
         A724PrdPreAct = P08SG3_A724PrdPreAct[0] ;
         A750PrdValStk = P08SG3_A750PrdValStk[0] ;
         A726PrdPreMed = P08SG3_A726PrdPreMed[0] ;
         A705PrdExiCC = P08SG3_A705PrdExiCC[0] ;
         A704PrdExiAlm = A704PrdExiAlm.add((AV13EntUniEnt.subtract(AV21OldEntUnient))) ;
         A713PrdFulEnt = AV15EntFecEnt ;
         A709PrdFecPre = AV15EntFecEnt ;
         A724PrdPreAct = AV14EntPre ;
         A750PrdValStk = A750PrdValStk.add((GXutil.roundDecimal( AV14EntPre.multiply(AV13EntUniEnt), 2).subtract(GXutil.roundDecimal( AV22OldEntPre.multiply(AV21OldEntUnient), 2)))) ;
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV20Consumos == 1 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         }
         if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV20Consumos == 0 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
         }
         /* Using cursor P08SG4 */
         pr_default.execute(2, new Object[] {A704PrdExiAlm, A713PrdFulEnt, A709PrdFecPre, A724PrdPreAct, A750PrdValStk, A726PrdPreMed, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = updtalmprx.this.AV8EmprCod;
      this.aP1[0] = updtalmprx.this.AV9PrdNum;
      this.aP2[0] = updtalmprx.this.AV10LinEnt;
      this.aP3[0] = updtalmprx.this.AV11Albaran;
      this.aP4[0] = updtalmprx.this.AV15EntFecEnt;
      this.aP5[0] = updtalmprx.this.AV17EntFVal;
      this.aP6[0] = updtalmprx.this.AV16EntLotN;
      this.aP7[0] = updtalmprx.this.AV19EntNAlbar;
      this.aP8[0] = updtalmprx.this.AV14EntPre;
      this.aP9[0] = updtalmprx.this.AV22OldEntPre;
      this.aP10[0] = updtalmprx.this.AV18EntPrvNum;
      this.aP11[0] = updtalmprx.this.AV13EntUniEnt;
      this.aP12[0] = updtalmprx.this.AV21OldEntUnient;
      this.aP13[0] = updtalmprx.this.AV12Pedcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "core.updtalmprx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      A12857EntNAlbar = "" ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      A415EntFecEnt = GXutil.nullDate() ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A11Albaran = "" ;
      scmdbuf = "" ;
      P08SG3_A719PrdNum = new String[] {""} ;
      P08SG3_A396EmprCod = new String[] {""} ;
      P08SG3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08SG3_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08SG3_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08SG3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08SG3_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08SG3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08SG3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A709PrdFecPre = GXutil.nullDate() ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.updtalmprx__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P08SG3_A719PrdNum, P08SG3_A396EmprCod, P08SG3_A704PrdExiAlm, P08SG3_A713PrdFulEnt, P08SG3_A709PrdFecPre, P08SG3_A724PrdPreAct, P08SG3_A750PrdValStk, P08SG3_A726PrdPreMed, P08SG3_A705PrdExiCC
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10LinEnt ;
   private short AV20Consumos ;
   private short Gx_err ;
   private int AV18EntPrvNum ;
   private int AV12Pedcod ;
   private int GXv_int1[] ;
   private int A12716EntFabId ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private java.math.BigDecimal AV14EntPre ;
   private java.math.BigDecimal AV22OldEntPre ;
   private java.math.BigDecimal AV13EntUniEnt ;
   private java.math.BigDecimal AV21OldEntUnient ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A705PrdExiCC ;
   private String AV8EmprCod ;
   private String AV9PrdNum ;
   private String AV11Albaran ;
   private String AV16EntLotN ;
   private String AV19EntNAlbar ;
   private String A12857EntNAlbar ;
   private String A5686EntLotN ;
   private String A11Albaran ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private java.util.Date AV15EntFecEnt ;
   private java.util.Date AV17EntFVal ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A709PrdFecPre ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private int[] aP13 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private int[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P08SG3_A719PrdNum ;
   private String[] P08SG3_A396EmprCod ;
   private java.math.BigDecimal[] P08SG3_A704PrdExiAlm ;
   private java.util.Date[] P08SG3_A713PrdFulEnt ;
   private java.util.Date[] P08SG3_A709PrdFecPre ;
   private java.math.BigDecimal[] P08SG3_A724PrdPreAct ;
   private java.math.BigDecimal[] P08SG3_A750PrdValStk ;
   private java.math.BigDecimal[] P08SG3_A726PrdPreMed ;
   private java.math.BigDecimal[] P08SG3_A705PrdExiCC ;
}

final  class updtalmprx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P08SG2", "UPDATE TXPENTALM SET EntNAlbar=?, EntFabId=?, EntPrvNum=?, EntLotN=?, EntFVal=?, EntFecEnt=?, EntUniRem=?, EntPre=?, EntUniEnt=?, PedCod=?, Albaran=?  WHERE EmprCod = ? and PrdNum = ? and LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new ForEachCursor("P08SG3", "SELECT PrdNum, EmprCod, PrdExiAlm, PrdFulEnt, PrdFecPre, PrdPreAct, PrdValStk, PrdPreMed, PrdExiCC FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08SG4", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdFulEnt=?, PrdFecPre=?, PrdPreAct=?, PrdValStk=?, PrdPreMed=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
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
               stmt.setString(1, (String)parms[0], 20);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setString(4, (String)parms[4], 26);
               stmt.setDate(5, (java.util.Date)parms[5]);
               stmt.setDate(6, (java.util.Date)parms[6]);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 4);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[11]).intValue());
               }
               stmt.setString(11, (String)parms[12], 10);
               stmt.setString(12, (String)parms[13], 3);
               stmt.setString(13, (String)parms[14], 6);
               stmt.setShort(14, ((Number) parms[15]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               return;
      }
   }

}

