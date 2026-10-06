package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsecvirx extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsecvirx pgm = new apsecvirx (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsecvirx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsecvirx.class ), "" );
   }

   public apsecvirx( int remoteHandle ,
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
      /* Using cursor P03AY2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03AY2_A130BarCodPar[0] ;
         A132BarCodReo = P03AY2_A132BarCodReo[0] ;
         A129BarCod = P03AY2_A129BarCod[0] ;
         A396EmprCod = P03AY2_A396EmprCod[0] ;
         A213BarSit = P03AY2_A213BarSit[0] ;
         A4610BarTam = P03AY2_A4610BarTam[0] ;
         A8097BarFecHis = P03AY2_A8097BarFecHis[0] ;
         AV8Bartam = " " ;
         AV9Barfechis = GXutil.resetTime( GXutil.nullDate() );
         /* Using cursor P03AY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7914BarfasRb = P03AY3_A7914BarfasRb[0] ;
            n7914BarfasRb = P03AY3_n7914BarfasRb[0] ;
            A603MaqCodBis = P03AY3_A603MaqCodBis[0] ;
            A153BarFasEst = P03AY3_A153BarFasEst[0] ;
            A5047BarFasFPl = P03AY3_A5047BarFasFPl[0] ;
            n5047BarFasFPl = P03AY3_n5047BarFasFPl[0] ;
            A4442BarFasDTI = P03AY3_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P03AY3_n4442BarFasDTI[0] ;
            A194BarOrdLin = P03AY3_A194BarOrdLin[0] ;
            A758ProCod = P03AY3_A758ProCod[0] ;
            AV8Bartam = GXutil.substring( A603MaqCodBis, 1, 4) ;
            if ( A153BarFasEst > 0 )
            {
               AV9Barfechis = GXutil.resetTime( A5047BarFasFPl );
            }
            else
            {
               AV9Barfechis = A4442BarFasDTI ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( GXutil.strcmp(AV8Bartam, " ") != 0 )
         {
            A4610BarTam = AV8Bartam ;
            A8097BarFecHis = AV9Barfechis ;
            Gx_msg = httpContext.getMessage( "Actualizando OT= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + AV8Bartam + " " + localUtil.ttoc( AV9Barfechis, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P03AY4 */
         pr_default.execute(2, new Object[] {A4610BarTam, A8097BarFecHis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psecvirx.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsecvirx");
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
      P03AY2_A130BarCodPar = new String[] {""} ;
      P03AY2_A132BarCodReo = new byte[1] ;
      P03AY2_A129BarCod = new int[1] ;
      P03AY2_A396EmprCod = new String[] {""} ;
      P03AY2_A213BarSit = new byte[1] ;
      P03AY2_A4610BarTam = new String[] {""} ;
      P03AY2_A8097BarFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A4610BarTam = "" ;
      A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
      AV8Bartam = "" ;
      AV9Barfechis = GXutil.resetTime( GXutil.nullDate() );
      P03AY3_A396EmprCod = new String[] {""} ;
      P03AY3_A129BarCod = new int[1] ;
      P03AY3_A132BarCodReo = new byte[1] ;
      P03AY3_A130BarCodPar = new String[] {""} ;
      P03AY3_A7914BarfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03AY3_n7914BarfasRb = new boolean[] {false} ;
      P03AY3_A603MaqCodBis = new String[] {""} ;
      P03AY3_A153BarFasEst = new byte[1] ;
      P03AY3_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P03AY3_n5047BarFasFPl = new boolean[] {false} ;
      P03AY3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P03AY3_n4442BarFasDTI = new boolean[] {false} ;
      P03AY3_A194BarOrdLin = new short[1] ;
      P03AY3_A758ProCod = new String[] {""} ;
      A7914BarfasRb = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsecvirx__default(),
         new Object[] {
             new Object[] {
            P03AY2_A130BarCodPar, P03AY2_A132BarCodReo, P03AY2_A129BarCod, P03AY2_A396EmprCod, P03AY2_A213BarSit, P03AY2_A4610BarTam, P03AY2_A8097BarFecHis
            }
            , new Object[] {
            P03AY3_A396EmprCod, P03AY3_A129BarCod, P03AY3_A132BarCodReo, P03AY3_A130BarCodPar, P03AY3_A7914BarfasRb, P03AY3_n7914BarfasRb, P03AY3_A603MaqCodBis, P03AY3_A153BarFasEst, P03AY3_A5047BarFasFPl, P03AY3_n5047BarFasFPl,
            P03AY3_A4442BarFasDTI, P03AY3_n4442BarFasDTI, P03AY3_A194BarOrdLin, P03AY3_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A7914BarfasRb ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A4610BarTam ;
   private String AV8Bartam ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String Gx_msg ;
   private java.util.Date A8097BarFecHis ;
   private java.util.Date AV9Barfechis ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A5047BarFasFPl ;
   private boolean n7914BarfasRb ;
   private boolean n5047BarFasFPl ;
   private boolean n4442BarFasDTI ;
   private IDataStoreProvider pr_default ;
   private String[] P03AY2_A130BarCodPar ;
   private byte[] P03AY2_A132BarCodReo ;
   private int[] P03AY2_A129BarCod ;
   private String[] P03AY2_A396EmprCod ;
   private byte[] P03AY2_A213BarSit ;
   private String[] P03AY2_A4610BarTam ;
   private java.util.Date[] P03AY2_A8097BarFecHis ;
   private String[] P03AY3_A396EmprCod ;
   private int[] P03AY3_A129BarCod ;
   private byte[] P03AY3_A132BarCodReo ;
   private String[] P03AY3_A130BarCodPar ;
   private java.math.BigDecimal[] P03AY3_A7914BarfasRb ;
   private boolean[] P03AY3_n7914BarfasRb ;
   private String[] P03AY3_A603MaqCodBis ;
   private byte[] P03AY3_A153BarFasEst ;
   private java.util.Date[] P03AY3_A5047BarFasFPl ;
   private boolean[] P03AY3_n5047BarFasFPl ;
   private java.util.Date[] P03AY3_A4442BarFasDTI ;
   private boolean[] P03AY3_n4442BarFasDTI ;
   private short[] P03AY3_A194BarOrdLin ;
   private String[] P03AY3_A758ProCod ;
}

final  class apsecvirx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03AY2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit, BarTam, BarFecHis FROM TXPBARCAD WHERE (EmprCod = '001') AND (BarSit <= 6) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03AY3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarfasRb, MaqCodBis, BarFasEst, BarFasFPl, BarFasDTI, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarfasRb = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03AY4", "UPDATE TXPBARCAD SET BarTam=?, BarFecHis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

