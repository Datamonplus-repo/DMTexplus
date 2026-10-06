package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appbaragr extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appbaragr pgm = new appbaragr (-1);
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

   public appbaragr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appbaragr.class ), "" );
   }

   public appbaragr( int remoteHandle ,
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
      appbaragr.this.aP8 = new byte[] {0};
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
      appbaragr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      appbaragr.this.AV9BarCod = aP1[0];
      this.aP1 = aP1;
      appbaragr.this.AV11Barcodreo = aP2[0];
      this.aP2 = aP2;
      appbaragr.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      appbaragr.this.AV14Station = aP4[0];
      this.aP4 = aP4;
      appbaragr.this.AV15Usurcod = aP5[0];
      this.aP5 = aP5;
      appbaragr.this.AV17ChgKilos = aP6[0];
      this.aP6 = aP6;
      appbaragr.this.AV18ChgMetros = aP7[0];
      this.aP7 = aP7;
      appbaragr.this.AV19ChgPiezas = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Inicio Proceso BARAGR...", "") );
      AV17ChgKilos = (byte)(0) ;
      AV18ChgMetros = (byte)(0) ;
      AV19ChgPiezas = (byte)(0) ;
      /* Using cursor P02S73 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11Barcodreo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02S73_A130BarCodPar[0] ;
         A132BarCodReo = P02S73_A132BarCodReo[0] ;
         A129BarCod = P02S73_A129BarCod[0] ;
         A166BarKgm = P02S73_A166BarKgm[0] ;
         A184BarMtr = P02S73_A184BarMtr[0] ;
         A199BarPie1 = P02S73_A199BarPie1[0] ;
         A365DisDes = P02S73_A365DisDes[0] ;
         A898BarPieNDes = P02S73_A898BarPieNDes[0] ;
         A166BarKgm = P02S73_A166BarKgm[0] ;
         A184BarMtr = P02S73_A184BarMtr[0] ;
         A199BarPie1 = P02S73_A199BarPie1[0] ;
         A898BarPieNDes = P02S73_A898BarPieNDes[0] ;
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
         /* Execute user subroutine: 'BARAGR' */
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
      /* 'BARAGR' Routine */
      returnInSub = false ;
      AV17ChgKilos = (byte)(0) ;
      AV18ChgMetros = (byte)(0) ;
      AV19ChgPiezas = (byte)(0) ;
      /* Using cursor P02S74 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11Barcodreo), AV10BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A119BarAgrCod = P02S74_A119BarAgrCod[0] ;
         A124BarAgrReo = P02S74_A124BarAgrReo[0] ;
         A122BarAgrPar = P02S74_A122BarAgrPar[0] ;
         A590KgmAgr = P02S74_A590KgmAgr[0] ;
         A869MtrAgr = P02S74_A869MtrAgr[0] ;
         A671PieAgr = P02S74_A671PieAgr[0] ;
         A129BarCod = P02S74_A129BarCod[0] ;
         A132BarCodReo = P02S74_A132BarCodReo[0] ;
         A130BarCodPar = P02S74_A130BarCodPar[0] ;
         AV16Inc_obs = httpContext.getMessage( "Auditoria Kilos,Metros,Piezas BARAGR", "") + GXutil.newLine( ) ;
         if ( DecimalUtil.compareTo(AV8BarKgm, A590KgmAgr) != 0 )
         {
            AV16Inc_obs += httpContext.getMessage( "Kilos  Actuales ", "") + GXutil.str( A590KgmAgr, 9, 2) + httpContext.getMessage( " se cambian a ", "") + GXutil.str( AV8BarKgm, 9, 2) + GXutil.newLine( ) ;
            AV17ChgKilos = (byte)(1) ;
         }
         if ( DecimalUtil.compareTo(AV13BarMtr, A869MtrAgr) != 0 )
         {
            AV16Inc_obs += httpContext.getMessage( "Metros Actuales ", "") + GXutil.str( A869MtrAgr, 9, 2) + httpContext.getMessage( " se cambian a ", "") + GXutil.str( AV13BarMtr, 9, 2) + GXutil.newLine( ) ;
            AV18ChgMetros = (byte)(1) ;
         }
         if ( AV12BarPie != A671PieAgr )
         {
            AV16Inc_obs += httpContext.getMessage( "Piezas Actuales ", "") + GXutil.str( A671PieAgr, 4, 0) + httpContext.getMessage( " se cambian a ", "") + GXutil.str( AV12BarPie, 6, 0) + GXutil.newLine( ) ;
            AV19ChgPiezas = (byte)(1) ;
         }
         A590KgmAgr = AV8BarKgm ;
         A671PieAgr = (short)(AV12BarPie) ;
         A869MtrAgr = AV13BarMtr ;
         if ( ( AV17ChgKilos == 1 ) || ( AV18ChgMetros == 1 ) || ( AV19ChgPiezas == 1 ) )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV15Usurcod, AV14Station, AV16Inc_obs, AV9BarCod, AV11Barcodreo, AV10BarCodPar) ;
         }
         /* Using cursor P02S75 */
         pr_default.execute(2, new Object[] {A590KgmAgr, A869MtrAgr, Short.valueOf(A671PieAgr), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppbaragr.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = appbaragr.this.A396EmprCod;
      this.aP1[0] = appbaragr.this.AV9BarCod;
      this.aP2[0] = appbaragr.this.AV11Barcodreo;
      this.aP3[0] = appbaragr.this.AV10BarCodPar;
      this.aP4[0] = appbaragr.this.AV14Station;
      this.aP5[0] = appbaragr.this.AV15Usurcod;
      this.aP6[0] = appbaragr.this.AV17ChgKilos;
      this.aP7[0] = appbaragr.this.AV18ChgMetros;
      this.aP8[0] = appbaragr.this.AV19ChgPiezas;
      Application.commitDataStores(context, remoteHandle, pr_default, "appbaragr");
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
      P02S73_A396EmprCod = new String[] {""} ;
      P02S73_A130BarCodPar = new String[] {""} ;
      P02S73_A132BarCodReo = new byte[1] ;
      P02S73_A129BarCod = new int[1] ;
      P02S73_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02S73_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02S73_A199BarPie1 = new short[1] ;
      P02S73_A365DisDes = new String[] {""} ;
      P02S73_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV8BarKgm = DecimalUtil.ZERO ;
      AV13BarMtr = DecimalUtil.ZERO ;
      P02S74_A396EmprCod = new String[] {""} ;
      P02S74_A119BarAgrCod = new int[1] ;
      P02S74_A124BarAgrReo = new byte[1] ;
      P02S74_A122BarAgrPar = new String[] {""} ;
      P02S74_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02S74_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02S74_A671PieAgr = new short[1] ;
      P02S74_A129BarCod = new int[1] ;
      P02S74_A132BarCodReo = new byte[1] ;
      P02S74_A130BarCodPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      AV16Inc_obs = "" ;
      AV24Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.appbaragr__default(),
         new Object[] {
             new Object[] {
            P02S73_A396EmprCod, P02S73_A130BarCodPar, P02S73_A132BarCodReo, P02S73_A129BarCod, P02S73_A166BarKgm, P02S73_A184BarMtr, P02S73_A199BarPie1, P02S73_A365DisDes, P02S73_A898BarPieNDes
            }
            , new Object[] {
            P02S74_A396EmprCod, P02S74_A119BarAgrCod, P02S74_A124BarAgrReo, P02S74_A122BarAgrPar, P02S74_A590KgmAgr, P02S74_A869MtrAgr, P02S74_A671PieAgr, P02S74_A129BarCod, P02S74_A132BarCodReo, P02S74_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "APpBARAGR" ;
      /* GeneXus formulas. */
      AV24Pgmname = "APpBARAGR" ;
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte AV17ChgKilos ;
   private byte AV18ChgMetros ;
   private byte AV19ChgPiezas ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short A199BarPie1 ;
   private short A671PieAgr ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV12BarPie ;
   private int A119BarAgrCod ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV8BarKgm ;
   private java.math.BigDecimal AV13BarMtr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV14Station ;
   private String AV15Usurcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String A122BarAgrPar ;
   private String AV24Pgmname ;
   private boolean returnInSub ;
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
   private String[] P02S73_A396EmprCod ;
   private String[] P02S73_A130BarCodPar ;
   private byte[] P02S73_A132BarCodReo ;
   private int[] P02S73_A129BarCod ;
   private java.math.BigDecimal[] P02S73_A166BarKgm ;
   private java.math.BigDecimal[] P02S73_A184BarMtr ;
   private short[] P02S73_A199BarPie1 ;
   private String[] P02S73_A365DisDes ;
   private int[] P02S73_A898BarPieNDes ;
   private String[] P02S74_A396EmprCod ;
   private int[] P02S74_A119BarAgrCod ;
   private byte[] P02S74_A124BarAgrReo ;
   private String[] P02S74_A122BarAgrPar ;
   private java.math.BigDecimal[] P02S74_A590KgmAgr ;
   private java.math.BigDecimal[] P02S74_A869MtrAgr ;
   private short[] P02S74_A671PieAgr ;
   private int[] P02S74_A129BarCod ;
   private byte[] P02S74_A132BarCodReo ;
   private String[] P02S74_A130BarCodPar ;
}

final  class appbaragr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02S73", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02S74", "SELECT EmprCod, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, MtrAgr, PieAgr, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ? ORDER BY EmprCod, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02S75", "UPDATE TXPBARAGR SET KgmAgr=?, MtrAgr=?, PieAgr=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
      }
   }

}

