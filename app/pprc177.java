package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc177 extends GXProcedure
{
   public pprc177( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc177.class ), "" );
   }

   public pprc177( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprc177.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc177.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc177.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprc177.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprc177.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprc177.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pprc177.this.AV11usurcod = aP5[0];
      this.aP5 = aP5;
      pprc177.this.AV12station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05PR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3276BarMtsAut = P05PR2_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P05PR2_n3276BarMtsAut[0] ;
         A3275BarKgsAut = P05PR2_A3275BarKgsAut[0] ;
         n3275BarKgsAut = P05PR2_n3275BarKgsAut[0] ;
         A12911BarPieFep = P05PR2_A12911BarPieFep[0] ;
         n12911BarPieFep = P05PR2_n12911BarPieFep[0] ;
         A1691BarPieAnc = P05PR2_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P05PR2_n1691BarPieAnc[0] ;
         AV8BarMtsAut = DecimalUtil.doubleToDec(0) ;
         AV9BarKgsAut = DecimalUtil.doubleToDec(0) ;
         AV10BarTroFec = GXutil.nullDate() ;
         AV13BarTroAnc = (short)(0) ;
         /* Using cursor P05PR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3860BarTroMet = P05PR3_A3860BarTroMet[0] ;
            n3860BarTroMet = P05PR3_n3860BarTroMet[0] ;
            A6556BarTroKil = P05PR3_A6556BarTroKil[0] ;
            n6556BarTroKil = P05PR3_n6556BarTroKil[0] ;
            A3859BarTroFec = P05PR3_A3859BarTroFec[0] ;
            n3859BarTroFec = P05PR3_n3859BarTroFec[0] ;
            A3861BarTroAnc = P05PR3_A3861BarTroAnc[0] ;
            n3861BarTroAnc = P05PR3_n3861BarTroAnc[0] ;
            A3858BarTroCod = P05PR3_A3858BarTroCod[0] ;
            AV9BarKgsAut = AV9BarKgsAut.add(A3860BarTroMet) ;
            AV8BarMtsAut = AV8BarMtsAut.add(A6556BarTroKil) ;
            AV10BarTroFec = A3859BarTroFec ;
            AV13BarTroAnc = A3861BarTroAnc ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A3276BarMtsAut = AV8BarMtsAut ;
         n3276BarMtsAut = false ;
         A3275BarKgsAut = AV9BarKgsAut ;
         n3275BarKgsAut = false ;
         A12911BarPieFep = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10BarTroFec)) ? GXutil.today( ) : AV10BarTroFec) ;
         n12911BarPieFep = false ;
         A1691BarPieAnc = ((0==AV13BarTroAnc) ? A1691BarPieAnc : AV13BarTroAnc) ;
         n1691BarPieAnc = false ;
         AV14inc_obs = httpContext.getMessage( "Actualizo Pieza (BARPIE) ", "") + A200BarPieCod + GXutil.newLine( ) ;
         AV14inc_obs += httpContext.getMessage( "Metros =", "") + GXutil.str( A3276BarMtsAut, 9, 2) + GXutil.newLine( ) ;
         AV14inc_obs += httpContext.getMessage( "Kilos  =", "") + GXutil.str( A3275BarKgsAut, 9, 2) + GXutil.newLine( ) ;
         AV14inc_obs += httpContext.getMessage( "Ancho  =", "") + GXutil.str( A1691BarPieAnc, 4, 0) + GXutil.newLine( ) ;
         AV14inc_obs += httpContext.getMessage( "Fecha  =", "") + localUtil.dtoc( A12911BarPieFep, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV19Pgmname, AV11usurcod, AV12station, AV14inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P05PR4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc177.this.A396EmprCod;
      this.aP1[0] = pprc177.this.A129BarCod;
      this.aP2[0] = pprc177.this.A132BarCodReo;
      this.aP3[0] = pprc177.this.A130BarCodPar;
      this.aP4[0] = pprc177.this.A200BarPieCod;
      this.aP5[0] = pprc177.this.AV11usurcod;
      this.aP6[0] = pprc177.this.AV12station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc177");
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
      P05PR2_A396EmprCod = new String[] {""} ;
      P05PR2_A129BarCod = new int[1] ;
      P05PR2_A132BarCodReo = new byte[1] ;
      P05PR2_A130BarCodPar = new String[] {""} ;
      P05PR2_A200BarPieCod = new String[] {""} ;
      P05PR2_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PR2_n3276BarMtsAut = new boolean[] {false} ;
      P05PR2_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PR2_n3275BarKgsAut = new boolean[] {false} ;
      P05PR2_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P05PR2_n12911BarPieFep = new boolean[] {false} ;
      P05PR2_A1691BarPieAnc = new short[1] ;
      P05PR2_n1691BarPieAnc = new boolean[] {false} ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A12911BarPieFep = GXutil.nullDate() ;
      AV8BarMtsAut = DecimalUtil.ZERO ;
      AV9BarKgsAut = DecimalUtil.ZERO ;
      AV10BarTroFec = GXutil.nullDate() ;
      P05PR3_A396EmprCod = new String[] {""} ;
      P05PR3_A129BarCod = new int[1] ;
      P05PR3_A132BarCodReo = new byte[1] ;
      P05PR3_A130BarCodPar = new String[] {""} ;
      P05PR3_A200BarPieCod = new String[] {""} ;
      P05PR3_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PR3_n3860BarTroMet = new boolean[] {false} ;
      P05PR3_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PR3_n6556BarTroKil = new boolean[] {false} ;
      P05PR3_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05PR3_n3859BarTroFec = new boolean[] {false} ;
      P05PR3_A3861BarTroAnc = new short[1] ;
      P05PR3_n3861BarTroAnc = new boolean[] {false} ;
      P05PR3_A3858BarTroCod = new short[1] ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      A3859BarTroFec = GXutil.nullDate() ;
      AV14inc_obs = "" ;
      AV19Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc177__default(),
         new Object[] {
             new Object[] {
            P05PR2_A396EmprCod, P05PR2_A129BarCod, P05PR2_A132BarCodReo, P05PR2_A130BarCodPar, P05PR2_A200BarPieCod, P05PR2_A3276BarMtsAut, P05PR2_n3276BarMtsAut, P05PR2_A3275BarKgsAut, P05PR2_n3275BarKgsAut, P05PR2_A12911BarPieFep,
            P05PR2_n12911BarPieFep, P05PR2_A1691BarPieAnc, P05PR2_n1691BarPieAnc
            }
            , new Object[] {
            P05PR3_A396EmprCod, P05PR3_A129BarCod, P05PR3_A132BarCodReo, P05PR3_A130BarCodPar, P05PR3_A200BarPieCod, P05PR3_A3860BarTroMet, P05PR3_n3860BarTroMet, P05PR3_A6556BarTroKil, P05PR3_n6556BarTroKil, P05PR3_A3859BarTroFec,
            P05PR3_n3859BarTroFec, P05PR3_A3861BarTroAnc, P05PR3_n3861BarTroAnc, P05PR3_A3858BarTroCod
            }
            , new Object[] {
            }
         }
      );
      AV19Pgmname = "PPrc177" ;
      /* GeneXus formulas. */
      AV19Pgmname = "PPrc177" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1691BarPieAnc ;
   private short AV13BarTroAnc ;
   private short A3861BarTroAnc ;
   private short A3858BarTroCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal AV8BarMtsAut ;
   private java.math.BigDecimal AV9BarKgsAut ;
   private java.math.BigDecimal A3860BarTroMet ;
   private java.math.BigDecimal A6556BarTroKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV11usurcod ;
   private String AV12station ;
   private String scmdbuf ;
   private String AV19Pgmname ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date AV10BarTroFec ;
   private java.util.Date A3859BarTroFec ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private boolean n12911BarPieFep ;
   private boolean n1691BarPieAnc ;
   private boolean n3860BarTroMet ;
   private boolean n6556BarTroKil ;
   private boolean n3859BarTroFec ;
   private boolean n3861BarTroAnc ;
   private String AV14inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PR2_A396EmprCod ;
   private int[] P05PR2_A129BarCod ;
   private byte[] P05PR2_A132BarCodReo ;
   private String[] P05PR2_A130BarCodPar ;
   private String[] P05PR2_A200BarPieCod ;
   private java.math.BigDecimal[] P05PR2_A3276BarMtsAut ;
   private boolean[] P05PR2_n3276BarMtsAut ;
   private java.math.BigDecimal[] P05PR2_A3275BarKgsAut ;
   private boolean[] P05PR2_n3275BarKgsAut ;
   private java.util.Date[] P05PR2_A12911BarPieFep ;
   private boolean[] P05PR2_n12911BarPieFep ;
   private short[] P05PR2_A1691BarPieAnc ;
   private boolean[] P05PR2_n1691BarPieAnc ;
   private String[] P05PR3_A396EmprCod ;
   private int[] P05PR3_A129BarCod ;
   private byte[] P05PR3_A132BarCodReo ;
   private String[] P05PR3_A130BarCodPar ;
   private String[] P05PR3_A200BarPieCod ;
   private java.math.BigDecimal[] P05PR3_A3860BarTroMet ;
   private boolean[] P05PR3_n3860BarTroMet ;
   private java.math.BigDecimal[] P05PR3_A6556BarTroKil ;
   private boolean[] P05PR3_n6556BarTroKil ;
   private java.util.Date[] P05PR3_A3859BarTroFec ;
   private boolean[] P05PR3_n3859BarTroFec ;
   private short[] P05PR3_A3861BarTroAnc ;
   private boolean[] P05PR3_n3861BarTroAnc ;
   private short[] P05PR3_A3858BarTroCod ;
}

final  class pprc177__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PR2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarMtsAut, BarKgsAut, BarPieFep, BarPieAnc FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05PR3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroMet, BarTroKil, BarTroFec, BarTroAnc, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05PR4", "UPDATE TXPBARPIE SET BarMtsAut=?, BarKgsAut=?, BarPieFep=?, BarPieAnc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
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
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               stmt.setString(9, (String)parms[12], 9);
               return;
      }
   }

}

