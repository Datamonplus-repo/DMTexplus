package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodsi2 extends GXProcedure
{
   public pmodsi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodsi2.class ), "" );
   }

   public pmodsi2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        byte aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             byte aP4 )
   {
      pmodsi2.this.AV24EmprCod = aP0;
      pmodsi2.this.AV25BarCod = aP1;
      pmodsi2.this.AV26BarCodReo = aP2;
      pmodsi2.this.AV27BarCodPar = aP3;
      pmodsi2.this.AV15Sit = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pmodsi2.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char4[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      pmodsi2.this.A396EmprCod = GXv_char2[0] ;
      pmodsi2.this.AV17EmprNom = GXv_char3[0] ;
      pmodsi2.this.AV18UsurCod = GXv_char4[0] ;
      AV20DisDes = "" ;
      AV19Inc_obs = " " ;
      /* Using cursor P009M2 */
      pr_default.execute(0, new Object[] {AV24EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P009M2_A130BarCodPar[0] ;
         A132BarCodReo = P009M2_A132BarCodReo[0] ;
         A129BarCod = P009M2_A129BarCod[0] ;
         A396EmprCod = P009M2_A396EmprCod[0] ;
         A213BarSit = P009M2_A213BarSit[0] ;
         A161BarFecSal = P009M2_A161BarFecSal[0] ;
         A365DisDes = P009M2_A365DisDes[0] ;
         AV22BarSit = A213BarSit ;
         AV19Inc_obs = httpContext.getMessage( "CAMBIO SITUACION HR.", "") + GXutil.str( A129BarCod, 8, 0) ;
         AV19Inc_obs += httpContext.getMessage( "/Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV15Sit, 2, 0) ;
         A213BarSit = AV15Sit ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A161BarFecSal)) && ( AV15Sit == 9 ) )
         {
            AV19Inc_obs += httpContext.getMessage( "/Barfecsal = ", "") + localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " se cambia por ", "") + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            A161BarFecSal = GXutil.today( ) ;
         }
         AV20DisDes = A365DisDes ;
         /* Using cursor P009M3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV19Inc_obs, " ") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV18UsurCod, AV16Station, AV19Inc_obs, AV25BarCod, AV26BarCodReo, AV27BarCodPar) ;
      }
      if ( GXutil.strcmp(AV20DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         AV19Inc_obs = " " ;
         AV23cambioestado = (short)(0) ;
         /* Using cursor P009M4 */
         pr_default.execute(2, new Object[] {AV24EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P009M4_A130BarCodPar[0] ;
            A132BarCodReo = P009M4_A132BarCodReo[0] ;
            A129BarCod = P009M4_A129BarCod[0] ;
            A396EmprCod = P009M4_A396EmprCod[0] ;
            A201BarPieEst = P009M4_A201BarPieEst[0] ;
            A200BarPieCod = P009M4_A200BarPieCod[0] ;
            AV21BarPieest = A201BarPieEst ;
            A201BarPieEst = (byte)(((AV15Sit<9)&&(A201BarPieEst==1)&&(AV22BarSit>=9) ? 0 : A201BarPieEst)) ;
            AV19Inc_obs = httpContext.getMessage( "Antencion. La HDR estaba en Situacion = ", "") + GXutil.str( AV22BarSit, 2, 0) + httpContext.getMessage( " y se cambia a ", "") + GXutil.str( AV15Sit, 2, 0) ;
            AV19Inc_obs += httpContext.getMessage( "/El registro de BARPIE, estaba en Cerrado(1) y pasa a Abierto(0) ", "") + GXutil.str( AV21BarPieest, 1, 0) + " -> 0" ;
            if ( AV21BarPieest != A201BarPieEst )
            {
               AV23cambioestado = (short)(1) ;
            }
            /* Using cursor P009M5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV23cambioestado == 1 )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV18UsurCod, AV16Station, AV19Inc_obs, AV25BarCod, AV26BarCodReo, AV27BarCodPar) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodsi2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Station = "" ;
      GXt_char1 = "" ;
      A396EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV18UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV20DisDes = "" ;
      AV19Inc_obs = "" ;
      scmdbuf = "" ;
      P009M2_A130BarCodPar = new String[] {""} ;
      P009M2_A132BarCodReo = new byte[1] ;
      P009M2_A129BarCod = new int[1] ;
      P009M2_A396EmprCod = new String[] {""} ;
      P009M2_A213BarSit = new byte[1] ;
      P009M2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P009M2_A365DisDes = new String[] {""} ;
      A130BarCodPar = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A365DisDes = "" ;
      Gx_date = GXutil.nullDate() ;
      AV32Pgmname = "" ;
      P009M4_A130BarCodPar = new String[] {""} ;
      P009M4_A132BarCodReo = new byte[1] ;
      P009M4_A129BarCod = new int[1] ;
      P009M4_A396EmprCod = new String[] {""} ;
      P009M4_A201BarPieEst = new byte[1] ;
      P009M4_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodsi2__default(),
         new Object[] {
             new Object[] {
            P009M2_A130BarCodPar, P009M2_A132BarCodReo, P009M2_A129BarCod, P009M2_A396EmprCod, P009M2_A213BarSit, P009M2_A161BarFecSal, P009M2_A365DisDes
            }
            , new Object[] {
            }
            , new Object[] {
            P009M4_A130BarCodPar, P009M4_A132BarCodReo, P009M4_A129BarCod, P009M4_A396EmprCod, P009M4_A201BarPieEst, P009M4_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      AV32Pgmname = "PMODSI2" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV32Pgmname = "PMODSI2" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV26BarCodReo ;
   private byte AV15Sit ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV22BarSit ;
   private byte A201BarPieEst ;
   private byte AV21BarPieest ;
   private short AV23cambioestado ;
   private short Gx_err ;
   private int AV25BarCod ;
   private int A129BarCod ;
   private String AV24EmprCod ;
   private String AV27BarCodPar ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String A396EmprCod ;
   private String GXv_char2[] ;
   private String AV17EmprNom ;
   private String GXv_char3[] ;
   private String AV18UsurCod ;
   private String GXv_char4[] ;
   private String AV20DisDes ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String AV32Pgmname ;
   private String A200BarPieCod ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private String AV19Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P009M2_A130BarCodPar ;
   private byte[] P009M2_A132BarCodReo ;
   private int[] P009M2_A129BarCod ;
   private String[] P009M2_A396EmprCod ;
   private byte[] P009M2_A213BarSit ;
   private java.util.Date[] P009M2_A161BarFecSal ;
   private String[] P009M2_A365DisDes ;
   private String[] P009M4_A130BarCodPar ;
   private byte[] P009M4_A132BarCodReo ;
   private int[] P009M4_A129BarCod ;
   private String[] P009M4_A396EmprCod ;
   private byte[] P009M4_A201BarPieEst ;
   private String[] P009M4_A200BarPieCod ;
}

final  class pmodsi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P009M2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit, BarFecSal, DisDes FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009M3", "UPDATE TXPBARCAD SET BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P009M4", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarPieEst, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009M5", "UPDATE TXPBARPIE SET BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

