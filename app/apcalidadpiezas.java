package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apcalidadpiezas extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apcalidadpiezas pgm = new apcalidadpiezas (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apcalidadpiezas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apcalidadpiezas.class ), "" );
   }

   public apcalidadpiezas( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV29UsurCod = " " ;
      AV30Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV16EmprCod ;
      GXv_char2[0] = AV31EmprNom ;
      GXv_char3[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char1, GXv_char2, GXv_char3) ;
      apcalidadpiezas.this.AV16EmprCod = GXv_char1[0] ;
      apcalidadpiezas.this.AV31EmprNom = GXv_char2[0] ;
      apcalidadpiezas.this.AV29UsurCod = GXv_char3[0] ;
      System.out.println( httpContext.getMessage( "Inicio Actualizacion Items LALPRD....", "") );
      /* Using cursor P05B92 */
      pr_default.execute(0, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200BarPieCod = P05B92_A200BarPieCod[0] ;
         A130BarCodPar = P05B92_A130BarCodPar[0] ;
         A132BarCodReo = P05B92_A132BarCodReo[0] ;
         A129BarCod = P05B92_A129BarCod[0] ;
         A396EmprCod = P05B92_A396EmprCod[0] ;
         A10132AlbPrePgd = P05B92_A10132AlbPrePgd[0] ;
         n10132AlbPrePgd = P05B92_n10132AlbPrePgd[0] ;
         A30AlbProCod = P05B92_A30AlbProCod[0] ;
         AV28BarTrocal = (byte)(0) ;
         /* Using cursor P05B93 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3858BarTroCod = P05B93_A3858BarTroCod[0] ;
            A4990BarTroCal = P05B93_A4990BarTroCal[0] ;
            n4990BarTroCal = P05B93_n4990BarTroCal[0] ;
            AV28BarTrocal = A4990BarTroCal ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         A10132AlbPrePgd = DecimalUtil.doubleToDec(AV28BarTrocal) ;
         n10132AlbPrePgd = false ;
         /* Using cursor P05B94 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n10132AlbPrePgd), A10132AlbPrePgd, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Actualizacion Items LALPRD....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pcalidadpiezas.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apcalidadpiezas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29UsurCod = "" ;
      AV30Station = "" ;
      AV16EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV31EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05B92_A200BarPieCod = new String[] {""} ;
      P05B92_A130BarCodPar = new String[] {""} ;
      P05B92_A132BarCodReo = new byte[1] ;
      P05B92_A129BarCod = new int[1] ;
      P05B92_A396EmprCod = new String[] {""} ;
      P05B92_A10132AlbPrePgd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05B92_n10132AlbPrePgd = new boolean[] {false} ;
      P05B92_A30AlbProCod = new long[1] ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A10132AlbPrePgd = DecimalUtil.ZERO ;
      P05B93_A396EmprCod = new String[] {""} ;
      P05B93_A129BarCod = new int[1] ;
      P05B93_A132BarCodReo = new byte[1] ;
      P05B93_A130BarCodPar = new String[] {""} ;
      P05B93_A200BarPieCod = new String[] {""} ;
      P05B93_A3858BarTroCod = new short[1] ;
      P05B93_A4990BarTroCal = new byte[1] ;
      P05B93_n4990BarTroCal = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apcalidadpiezas__default(),
         new Object[] {
             new Object[] {
            P05B92_A200BarPieCod, P05B92_A130BarCodPar, P05B92_A132BarCodReo, P05B92_A129BarCod, P05B92_A396EmprCod, P05B92_A10132AlbPrePgd, P05B92_n10132AlbPrePgd, P05B92_A30AlbProCod
            }
            , new Object[] {
            P05B93_A396EmprCod, P05B93_A129BarCod, P05B93_A132BarCodReo, P05B93_A130BarCodPar, P05B93_A200BarPieCod, P05B93_A3858BarTroCod, P05B93_A4990BarTroCal, P05B93_n4990BarTroCal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV28BarTrocal ;
   private byte A4990BarTroCal ;
   private short A3858BarTroCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A10132AlbPrePgd ;
   private String AV29UsurCod ;
   private String AV30Station ;
   private String AV16EmprCod ;
   private String GXv_char1[] ;
   private String AV31EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private boolean n10132AlbPrePgd ;
   private boolean n4990BarTroCal ;
   private IDataStoreProvider pr_default ;
   private String[] P05B92_A200BarPieCod ;
   private String[] P05B92_A130BarCodPar ;
   private byte[] P05B92_A132BarCodReo ;
   private int[] P05B92_A129BarCod ;
   private String[] P05B92_A396EmprCod ;
   private java.math.BigDecimal[] P05B92_A10132AlbPrePgd ;
   private boolean[] P05B92_n10132AlbPrePgd ;
   private long[] P05B92_A30AlbProCod ;
   private String[] P05B93_A396EmprCod ;
   private int[] P05B93_A129BarCod ;
   private byte[] P05B93_A132BarCodReo ;
   private String[] P05B93_A130BarCodPar ;
   private String[] P05B93_A200BarPieCod ;
   private short[] P05B93_A3858BarTroCod ;
   private byte[] P05B93_A4990BarTroCal ;
   private boolean[] P05B93_n4990BarTroCal ;
}

final  class apcalidadpiezas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05B92", "SELECT BarPieCod, BarCodPar, BarCodReo, BarCod, EmprCod, AlbPrePgd, AlbProCod FROM TXPLALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05B93", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroCal FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = 9999 ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05B94", "UPDATE TXPLALPRD SET AlbPrePgd=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 9);
               return;
      }
   }

}

