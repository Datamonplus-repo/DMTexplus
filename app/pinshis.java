package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinshis extends GXProcedure
{
   public pinshis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinshis.class ), "" );
   }

   public pinshis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 )
   {
      pinshis.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pinshis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinshis.this.AV15HisEmpAlbD = aP1[0];
      this.aP1 = aP1;
      pinshis.this.AV16AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pinshis.this.AV17Kilos = aP3[0];
      this.aP3 = aP3;
      pinshis.this.AV18Metros = aP4[0];
      this.aP4 = aP4;
      pinshis.this.AV19Piezas = aP5[0];
      this.aP5 = aP5;
      pinshis.this.AV20KilAnt = aP6[0];
      this.aP6 = aP6;
      pinshis.this.AV21MetAnt = aP7[0];
      this.aP7 = aP7;
      pinshis.this.AV22PieAnt = aP8[0];
      this.aP8 = aP8;
      pinshis.this.AV23HisEmpLTip = aP9[0];
      this.aP9 = aP9;
      pinshis.this.AV24DisColNom = aP10[0];
      this.aP10 = aP10;
      pinshis.this.AV25DisColNum = aP11[0];
      this.aP11 = aP11;
      pinshis.this.AV26Modo = aP12[0];
      this.aP12 = aP12;
      pinshis.this.AV27CodALb = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00CQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P00CQ2_A44AlbRecCod[0] ;
         A49AlbRFen = P00CQ2_A49AlbRFen[0] ;
         A2183HisEmpULin = P00CQ2_A2183HisEmpULin[0] ;
         n2183HisEmpULin = P00CQ2_n2183HisEmpULin[0] ;
         A56AlbRUni = P00CQ2_A56AlbRUni[0] ;
         AV30UltLin = A2183HisEmpULin ;
         AV32Unidad = A56AlbRUni ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV30UltLin = (short)(AV30UltLin+1) ;
      if ( GXutil.strcmp(AV26Modo, httpContext.getMessage( "INS", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPHISEMP

         */
         A44AlbRecCod = AV16AlbRecCod ;
         A2165HisEmpLin = AV30UltLin ;
         A2166HisEmpLTip = httpContext.getMessage( "E", "") ;
         n2166HisEmpLTip = false ;
         A2160HisEmpAlbD = AV15HisEmpAlbD ;
         n2160HisEmpAlbD = false ;
         A2161HisEmpFMov = GXutil.today( ) ;
         n2161HisEmpFMov = false ;
         A2173HisEmpSd = httpContext.getMessage( "ENTRADA ALMACEN", "") ;
         n2173HisEmpSd = false ;
         if ( GXutil.strcmp(AV32Unidad, httpContext.getMessage( "K", "")) == 0 )
         {
            A2163HisEmpKe = AV18Metros ;
            n2163HisEmpKe = false ;
            A2168HisEmpMe = DecimalUtil.doubleToDec(0) ;
            n2168HisEmpMe = false ;
         }
         else
         {
            A2168HisEmpMe = AV18Metros ;
            n2168HisEmpMe = false ;
            A2163HisEmpKe = DecimalUtil.doubleToDec(0) ;
            n2163HisEmpKe = false ;
         }
         A2171HisEmpPe = (short)(AV19Piezas) ;
         n2171HisEmpPe = false ;
         /* Using cursor P00CQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin), Boolean.valueOf(n2166HisEmpLTip), A2166HisEmpLTip, Boolean.valueOf(n2160HisEmpAlbD), Long.valueOf(A2160HisEmpAlbD), Boolean.valueOf(n2161HisEmpFMov), A2161HisEmpFMov, Boolean.valueOf(n2173HisEmpSd), A2173HisEmpSd, Boolean.valueOf(n2163HisEmpKe), A2163HisEmpKe, Boolean.valueOf(n2168HisEmpMe), A2168HisEmpMe, Boolean.valueOf(n2171HisEmpPe), Short.valueOf(A2171HisEmpPe)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
         if ( (pr_default.getStatus(1) == 1) )
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
         n2183HisEmpULin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00CQ4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n2183HisEmpULin), Short.valueOf(AV30UltLin), A396EmprCod, Integer.valueOf(AV16AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinshis.this.A396EmprCod;
      this.aP1[0] = pinshis.this.AV15HisEmpAlbD;
      this.aP2[0] = pinshis.this.AV16AlbRecCod;
      this.aP3[0] = pinshis.this.AV17Kilos;
      this.aP4[0] = pinshis.this.AV18Metros;
      this.aP5[0] = pinshis.this.AV19Piezas;
      this.aP6[0] = pinshis.this.AV20KilAnt;
      this.aP7[0] = pinshis.this.AV21MetAnt;
      this.aP8[0] = pinshis.this.AV22PieAnt;
      this.aP9[0] = pinshis.this.AV23HisEmpLTip;
      this.aP10[0] = pinshis.this.AV24DisColNom;
      this.aP11[0] = pinshis.this.AV25DisColNum;
      this.aP12[0] = pinshis.this.AV26Modo;
      this.aP13[0] = pinshis.this.AV27CodALb;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinshis");
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
      P00CQ2_A396EmprCod = new String[] {""} ;
      P00CQ2_A44AlbRecCod = new int[1] ;
      P00CQ2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P00CQ2_A2183HisEmpULin = new short[1] ;
      P00CQ2_n2183HisEmpULin = new boolean[] {false} ;
      P00CQ2_A56AlbRUni = new String[] {""} ;
      A49AlbRFen = GXutil.nullDate() ;
      A56AlbRUni = "" ;
      AV32Unidad = "" ;
      A2166HisEmpLTip = "" ;
      A2161HisEmpFMov = GXutil.nullDate() ;
      A2173HisEmpSd = "" ;
      A2163HisEmpKe = DecimalUtil.ZERO ;
      A2168HisEmpMe = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinshis__default(),
         new Object[] {
             new Object[] {
            P00CQ2_A396EmprCod, P00CQ2_A44AlbRecCod, P00CQ2_A49AlbRFen, P00CQ2_A2183HisEmpULin, P00CQ2_n2183HisEmpULin, P00CQ2_A56AlbRUni
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

   private short A2183HisEmpULin ;
   private short AV30UltLin ;
   private short A2165HisEmpLin ;
   private short A2171HisEmpPe ;
   private short Gx_err ;
   private int AV16AlbRecCod ;
   private int AV19Piezas ;
   private int AV22PieAnt ;
   private int AV25DisColNum ;
   private int A44AlbRecCod ;
   private int GX_INS298 ;
   private long AV15HisEmpAlbD ;
   private long A2160HisEmpAlbD ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal AV18Metros ;
   private java.math.BigDecimal AV20KilAnt ;
   private java.math.BigDecimal AV21MetAnt ;
   private java.math.BigDecimal A2163HisEmpKe ;
   private java.math.BigDecimal A2168HisEmpMe ;
   private String A396EmprCod ;
   private String AV23HisEmpLTip ;
   private String AV24DisColNom ;
   private String AV26Modo ;
   private String AV27CodALb ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String AV32Unidad ;
   private String A2166HisEmpLTip ;
   private String A2173HisEmpSd ;
   private String Gx_emsg ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A2161HisEmpFMov ;
   private boolean n2183HisEmpULin ;
   private boolean n2166HisEmpLTip ;
   private boolean n2160HisEmpAlbD ;
   private boolean n2161HisEmpFMov ;
   private boolean n2173HisEmpSd ;
   private boolean n2163HisEmpKe ;
   private boolean n2168HisEmpMe ;
   private boolean n2171HisEmpPe ;
   private String[] aP13 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CQ2_A396EmprCod ;
   private int[] P00CQ2_A44AlbRecCod ;
   private java.util.Date[] P00CQ2_A49AlbRFen ;
   private short[] P00CQ2_A2183HisEmpULin ;
   private boolean[] P00CQ2_n2183HisEmpULin ;
   private String[] P00CQ2_A56AlbRUni ;
}

final  class pinshis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CQ2", "SELECT EmprCod, AlbRecCod, AlbRFen, HisEmpULin, AlbRUni FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00CQ3", "INSERT INTO TXPHISEMP(EmprCod, AlbRecCod, HisEmpLin, HisEmpLTip, HisEmpAlbD, HisEmpFMov, HisEmpSd, HisEmpKe, HisEmpMe, HisEmpPe, HisEmpKu, HisEmpMu, HisEmpPu) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P00CQ4", "UPDATE TXPALBREC SET HisEmpULin=?  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[6]).longValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 20);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

