package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pabarsit6 extends GXProcedure
{
   public pabarsit6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pabarsit6.class ), "" );
   }

   public pabarsit6( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 )
   {
      pabarsit6.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      pabarsit6.this.AV17EmprCod = aP0[0];
      this.aP0 = aP0;
      pabarsit6.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pabarsit6.this.AV23PgmnameR = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV17EmprCod ;
      GXv_char2[0] = AV18EmprNom ;
      GXv_char3[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char1, GXv_char2, GXv_char3) ;
      pabarsit6.this.AV17EmprCod = GXv_char1[0] ;
      pabarsit6.this.AV18EmprNom = GXv_char2[0] ;
      pabarsit6.this.AV19UsurCod = GXv_char3[0] ;
      /* Using cursor P04BN2 */
      pr_default.execute(0, new Object[] {AV17EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04BN2_A396EmprCod[0] ;
         A129BarCod = P04BN2_A129BarCod[0] ;
         A132BarCodReo = P04BN2_A132BarCodReo[0] ;
         A130BarCodPar = P04BN2_A130BarCodPar[0] ;
         AV24Barcod = A129BarCod ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P04BN3 */
      pr_default.execute(1, new Object[] {AV17EmprCod, Integer.valueOf(AV24Barcod), Byte.valueOf(AV25Barcodreo), AV26Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P04BN3_A130BarCodPar[0] ;
         A132BarCodReo = P04BN3_A132BarCodReo[0] ;
         A129BarCod = P04BN3_A129BarCod[0] ;
         A396EmprCod = P04BN3_A396EmprCod[0] ;
         A213BarSit = P04BN3_A213BarSit[0] ;
         AV20Pzasest = (short)(0) ;
         AV21Pzasclose = (short)(0) ;
         /* Using cursor P04BN4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A201BarPieEst = P04BN4_A201BarPieEst[0] ;
            A200BarPieCod = P04BN4_A200BarPieCod[0] ;
            AV20Pzasest = (short)(AV20Pzasest+1) ;
            if ( A201BarPieEst == 1 )
            {
               AV21Pzasclose = (short)(AV21Pzasclose+1) ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( ( AV21Pzasclose == AV20Pzasest ) && ( AV21Pzasclose > 0 ) && ( AV20Pzasest > 0 ) && ( A213BarSit == 6 ) )
         {
            AV22Inc_obs = httpContext.getMessage( "Llamado desde Prg =", "") + AV23PgmnameR + httpContext.getMessage( " Cambio Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> 9" ;
            Gx_msg = httpContext.getMessage( "Cambio Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> 9 " + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            new app.pctrinc(remoteHandle, context).execute( AV17EmprCod, AV33Pgmname, AV19UsurCod, AV16Station, AV22Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(9) ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P04BN5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pabarsit6.this.AV17EmprCod;
      this.aP1[0] = pabarsit6.this.A30AlbProCod;
      this.aP2[0] = pabarsit6.this.AV23PgmnameR;
      Application.commitDataStores(context, remoteHandle, pr_default, "pabarsit6");
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
      GXv_char1 = new String[1] ;
      AV18EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV19UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04BN2_A30AlbProCod = new long[1] ;
      P04BN2_A396EmprCod = new String[] {""} ;
      P04BN2_A129BarCod = new int[1] ;
      P04BN2_A132BarCodReo = new byte[1] ;
      P04BN2_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV26Barcodpar = "" ;
      P04BN3_A130BarCodPar = new String[] {""} ;
      P04BN3_A132BarCodReo = new byte[1] ;
      P04BN3_A129BarCod = new int[1] ;
      P04BN3_A396EmprCod = new String[] {""} ;
      P04BN3_A213BarSit = new byte[1] ;
      P04BN4_A396EmprCod = new String[] {""} ;
      P04BN4_A129BarCod = new int[1] ;
      P04BN4_A132BarCodReo = new byte[1] ;
      P04BN4_A130BarCodPar = new String[] {""} ;
      P04BN4_A201BarPieEst = new byte[1] ;
      P04BN4_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV22Inc_obs = "" ;
      Gx_msg = "" ;
      AV33Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pabarsit6__default(),
         new Object[] {
             new Object[] {
            P04BN2_A30AlbProCod, P04BN2_A396EmprCod, P04BN2_A129BarCod, P04BN2_A132BarCodReo, P04BN2_A130BarCodPar
            }
            , new Object[] {
            P04BN3_A130BarCodPar, P04BN3_A132BarCodReo, P04BN3_A129BarCod, P04BN3_A396EmprCod, P04BN3_A213BarSit
            }
            , new Object[] {
            P04BN4_A396EmprCod, P04BN4_A129BarCod, P04BN4_A132BarCodReo, P04BN4_A130BarCodPar, P04BN4_A201BarPieEst, P04BN4_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      AV33Pgmname = "PaBARSIT6" ;
      /* GeneXus formulas. */
      AV33Pgmname = "PaBARSIT6" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV25Barcodreo ;
   private byte A213BarSit ;
   private byte A201BarPieEst ;
   private short AV20Pzasest ;
   private short AV21Pzasclose ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV24Barcod ;
   private long A30AlbProCod ;
   private String AV17EmprCod ;
   private String AV23PgmnameR ;
   private String AV16Station ;
   private String GXv_char1[] ;
   private String AV18EmprNom ;
   private String GXv_char2[] ;
   private String AV19UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV26Barcodpar ;
   private String A200BarPieCod ;
   private String Gx_msg ;
   private String AV33Pgmname ;
   private boolean returnInSub ;
   private String AV22Inc_obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P04BN2_A30AlbProCod ;
   private String[] P04BN2_A396EmprCod ;
   private int[] P04BN2_A129BarCod ;
   private byte[] P04BN2_A132BarCodReo ;
   private String[] P04BN2_A130BarCodPar ;
   private String[] P04BN3_A130BarCodPar ;
   private byte[] P04BN3_A132BarCodReo ;
   private int[] P04BN3_A129BarCod ;
   private String[] P04BN3_A396EmprCod ;
   private byte[] P04BN3_A213BarSit ;
   private String[] P04BN4_A396EmprCod ;
   private int[] P04BN4_A129BarCod ;
   private byte[] P04BN4_A132BarCodReo ;
   private String[] P04BN4_A130BarCodPar ;
   private byte[] P04BN4_A201BarPieEst ;
   private String[] P04BN4_A200BarPieCod ;
}

final  class pabarsit6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04BN2", "SELECT AlbProCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04BN3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04BN4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04BN5", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
      }
   }

}

