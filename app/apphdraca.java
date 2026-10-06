package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apphdraca extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apphdraca pgm = new apphdraca (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};
      byte[] aP6 = new byte[] {0};
      byte[] aP7 = new byte[] {0};
      byte[] aP8 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (String) args[5];
         aP6[0] = (byte) GXutil.lval( args[6]);
         aP7[0] = (byte) GXutil.lval( args[7]);
         aP8[0] = (byte) GXutil.lval( args[8]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   public apphdraca( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apphdraca.class ), "" );
   }

   public apphdraca( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           byte[] aP6 ,
                           byte[] aP7 )
   {
      apphdraca.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 )
   {
      apphdraca.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apphdraca.this.AV9BarCod = aP1[0];
      this.aP1 = aP1;
      apphdraca.this.AV11Barcodreo = aP2[0];
      this.aP2 = aP2;
      apphdraca.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      apphdraca.this.AV14Station = aP4[0];
      this.aP4 = aP4;
      apphdraca.this.AV15Usurcod = aP5[0];
      this.aP5 = aP5;
      apphdraca.this.AV17ChgKilos = aP6[0];
      this.aP6 = aP6;
      apphdraca.this.AV18ChgMetros = aP7[0];
      this.aP7 = aP7;
      apphdraca.this.AV19ChgPiezas = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Inicio Proceso HDRACA...", "") );
      AV17ChgKilos = (byte)(0) ;
      AV18ChgMetros = (byte)(0) ;
      AV19ChgPiezas = (byte)(0) ;
      /* Using cursor P04TP3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11Barcodreo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04TP3_A130BarCodPar[0] ;
         A132BarCodReo = P04TP3_A132BarCodReo[0] ;
         A129BarCod = P04TP3_A129BarCod[0] ;
         A166BarKgm = P04TP3_A166BarKgm[0] ;
         A184BarMtr = P04TP3_A184BarMtr[0] ;
         A199BarPie1 = P04TP3_A199BarPie1[0] ;
         A365DisDes = P04TP3_A365DisDes[0] ;
         A898BarPieNDes = P04TP3_A898BarPieNDes[0] ;
         A166BarKgm = P04TP3_A166BarKgm[0] ;
         A184BarMtr = P04TP3_A184BarMtr[0] ;
         A199BarPie1 = P04TP3_A199BarPie1[0] ;
         A898BarPieNDes = P04TP3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV8BarKgm = A166BarKgm ;
         AV13BarMtr = A184BarMtr ;
         AV12BarPie = A198BarPie ;
         /* Execute user subroutine: 'HDRACA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Proceso finalizado...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'HDRACA' Routine */
      returnInSub = false ;
      AV17ChgKilos = (byte)(0) ;
      AV18ChgMetros = (byte)(0) ;
      AV19ChgPiezas = (byte)(0) ;
      /* Using cursor P04TP4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11Barcodreo), AV10BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6031Ac_Barcod = P04TP4_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = P04TP4_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = P04TP4_A6033Ac_BarPar[0] ;
         A6035Ac_Kilos = P04TP4_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = P04TP4_n6035Ac_Kilos[0] ;
         A6034Ac_Metros = P04TP4_A6034Ac_Metros[0] ;
         n6034Ac_Metros = P04TP4_n6034Ac_Metros[0] ;
         A129BarCod = P04TP4_A129BarCod[0] ;
         A132BarCodReo = P04TP4_A132BarCodReo[0] ;
         A130BarCodPar = P04TP4_A130BarCodPar[0] ;
         AV16Inc_obs = httpContext.getMessage( "Auditoria Kilos,Metros HDRACA", "") + GXutil.newLine( ) ;
         if ( DecimalUtil.compareTo(AV8BarKgm, A6035Ac_Kilos) != 0 )
         {
            AV16Inc_obs += httpContext.getMessage( "Kilos  Actuales ", "") + GXutil.str( A6035Ac_Kilos, 9, 2) + httpContext.getMessage( " se cambian a ", "") + GXutil.str( AV8BarKgm, 9, 2) + GXutil.newLine( ) ;
            AV17ChgKilos = (byte)(1) ;
         }
         if ( DecimalUtil.compareTo(AV13BarMtr, A6034Ac_Metros) != 0 )
         {
            AV16Inc_obs += httpContext.getMessage( "Metros Actuales ", "") + GXutil.str( A6034Ac_Metros, 9, 2) + httpContext.getMessage( " se cambian a ", "") + GXutil.str( AV13BarMtr, 9, 2) + GXutil.newLine( ) ;
            AV18ChgMetros = (byte)(1) ;
         }
         A6035Ac_Kilos = AV8BarKgm ;
         n6035Ac_Kilos = false ;
         A6034Ac_Metros = AV13BarMtr ;
         n6034Ac_Metros = false ;
         if ( ( AV17ChgKilos == 1 ) || ( AV18ChgMetros == 1 ) || ( AV19ChgPiezas == 1 ) )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV15Usurcod, AV14Station, AV16Inc_obs, AV9BarCod, AV11Barcodreo, AV10BarCodPar) ;
         }
         /* Using cursor P04TP5 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n6035Ac_Kilos), A6035Ac_Kilos, Boolean.valueOf(n6034Ac_Metros), A6034Ac_Metros, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pphdraca.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apphdraca.this.A396EmprCod;
      this.aP1[0] = apphdraca.this.AV9BarCod;
      this.aP2[0] = apphdraca.this.AV11Barcodreo;
      this.aP3[0] = apphdraca.this.AV10BarCodPar;
      this.aP4[0] = apphdraca.this.AV14Station;
      this.aP5[0] = apphdraca.this.AV15Usurcod;
      this.aP6[0] = apphdraca.this.AV17ChgKilos;
      this.aP7[0] = apphdraca.this.AV18ChgMetros;
      this.aP8[0] = apphdraca.this.AV19ChgPiezas;
      Application.commitDataStores(context, remoteHandle, pr_default, "apphdraca");
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
      P04TP3_A396EmprCod = new String[] {""} ;
      P04TP3_A130BarCodPar = new String[] {""} ;
      P04TP3_A132BarCodReo = new byte[1] ;
      P04TP3_A129BarCod = new int[1] ;
      P04TP3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04TP3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04TP3_A199BarPie1 = new short[1] ;
      P04TP3_A365DisDes = new String[] {""} ;
      P04TP3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV8BarKgm = DecimalUtil.ZERO ;
      AV13BarMtr = DecimalUtil.ZERO ;
      P04TP4_A396EmprCod = new String[] {""} ;
      P04TP4_A6031Ac_Barcod = new int[1] ;
      P04TP4_A6032Ac_BarReo = new byte[1] ;
      P04TP4_A6033Ac_BarPar = new String[] {""} ;
      P04TP4_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04TP4_n6035Ac_Kilos = new boolean[] {false} ;
      P04TP4_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04TP4_n6034Ac_Metros = new boolean[] {false} ;
      P04TP4_A129BarCod = new int[1] ;
      P04TP4_A132BarCodReo = new byte[1] ;
      P04TP4_A130BarCodPar = new String[] {""} ;
      A6033Ac_BarPar = "" ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      AV16Inc_obs = "" ;
      AV24Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apphdraca__default(),
         new Object[] {
             new Object[] {
            P04TP3_A396EmprCod, P04TP3_A130BarCodPar, P04TP3_A132BarCodReo, P04TP3_A129BarCod, P04TP3_A166BarKgm, P04TP3_A184BarMtr, P04TP3_A199BarPie1, P04TP3_A365DisDes, P04TP3_A898BarPieNDes
            }
            , new Object[] {
            P04TP4_A396EmprCod, P04TP4_A6031Ac_Barcod, P04TP4_A6032Ac_BarReo, P04TP4_A6033Ac_BarPar, P04TP4_A6035Ac_Kilos, P04TP4_n6035Ac_Kilos, P04TP4_A6034Ac_Metros, P04TP4_n6034Ac_Metros, P04TP4_A129BarCod, P04TP4_A132BarCodReo,
            P04TP4_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "APpHDRACA" ;
      /* GeneXus formulas. */
      AV24Pgmname = "APpHDRACA" ;
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte AV17ChgKilos ;
   private byte AV18ChgMetros ;
   private byte AV19ChgPiezas ;
   private byte A132BarCodReo ;
   private byte A6032Ac_BarReo ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV12BarPie ;
   private int A6031Ac_Barcod ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV8BarKgm ;
   private java.math.BigDecimal AV13BarMtr ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV14Station ;
   private String AV15Usurcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String A6033Ac_BarPar ;
   private String AV24Pgmname ;
   private boolean returnInSub ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private String AV16Inc_obs ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04TP3_A396EmprCod ;
   private String[] P04TP3_A130BarCodPar ;
   private byte[] P04TP3_A132BarCodReo ;
   private int[] P04TP3_A129BarCod ;
   private java.math.BigDecimal[] P04TP3_A166BarKgm ;
   private java.math.BigDecimal[] P04TP3_A184BarMtr ;
   private short[] P04TP3_A199BarPie1 ;
   private String[] P04TP3_A365DisDes ;
   private int[] P04TP3_A898BarPieNDes ;
   private String[] P04TP4_A396EmprCod ;
   private int[] P04TP4_A6031Ac_Barcod ;
   private byte[] P04TP4_A6032Ac_BarReo ;
   private String[] P04TP4_A6033Ac_BarPar ;
   private java.math.BigDecimal[] P04TP4_A6035Ac_Kilos ;
   private boolean[] P04TP4_n6035Ac_Kilos ;
   private java.math.BigDecimal[] P04TP4_A6034Ac_Metros ;
   private boolean[] P04TP4_n6034Ac_Metros ;
   private int[] P04TP4_A129BarCod ;
   private byte[] P04TP4_A132BarCodReo ;
   private String[] P04TP4_A130BarCodPar ;
}

final  class apphdraca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TP3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04TP4", "SELECT EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Kilos, Ac_Metros, BarCod, BarCodReo, BarCodPar FROM TXPHDRACA WHERE EmprCod = ? and Ac_Barcod = ? and Ac_BarReo = ? and Ac_BarPar = ? ORDER BY EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TP5", "UPDATE TXPHDRACA SET Ac_Kilos=?, Ac_Metros=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRACA")
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
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
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 1);
               return;
      }
   }

}

