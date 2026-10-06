package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchecksit extends GXProcedure
{
   public pchecksit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchecksit.class ), "" );
   }

   public pchecksit( int remoteHandle ,
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
      pchecksit.this.aP6 = new String[] {""};
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
      pchecksit.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchecksit.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pchecksit.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pchecksit.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pchecksit.this.AV12Station = aP4[0];
      this.aP4 = aP4;
      pchecksit.this.AV13Usurcod = aP5[0];
      this.aP5 = aP5;
      pchecksit.this.AV14Pgmnick = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04EB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P04EB2_A213BarSit[0] ;
         AV9Pzasclose = 0 ;
         AV8Pzasest = 0 ;
         /* Using cursor P04EB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A201BarPieEst = P04EB3_A201BarPieEst[0] ;
            A200BarPieCod = P04EB3_A200BarPieCod[0] ;
            AV8Pzasest = (int)(AV8Pzasest+1) ;
            if ( A201BarPieEst == 1 )
            {
               AV9Pzasclose = (int)(AV9Pzasclose+1) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV10Barsit = A213BarSit ;
         if ( ( AV9Pzasclose == AV8Pzasest ) && ( AV9Pzasclose > 0 ) && ( AV8Pzasest > 0 ) )
         {
            AV10Barsit = (byte)(9) ;
         }
         else
         {
            if ( A213BarSit == 9 )
            {
               AV10Barsit = (byte)(6) ;
            }
         }
         AV11Inc_obs = httpContext.getMessage( "->Situacion actual= ", "") + GXutil.str( A213BarSit, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "Piezas           Hdr= ", "") + GXutil.trim( GXutil.str( AV8Pzasest, 6, 0)) + GXutil.newLine( ) + httpContext.getMessage( "Piezas Cerradas, Hdr= ", "") + GXutil.trim( GXutil.str( AV9Pzasclose, 6, 0)) + GXutil.newLine( ) + httpContext.getMessage( "Situacion      , Hdr= ", "") + GXutil.trim( GXutil.str( A213BarSit, 2, 0)) + GXutil.newLine( ) + httpContext.getMessage( "Situacion Nueva     = ", "") + GXutil.str( AV10Barsit, 2, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV14Pgmnick, AV13Usurcod, AV12Station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         if ( AV10Barsit != A213BarSit )
         {
            A213BarSit = AV10Barsit ;
         }
         /* Using cursor P04EB4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchecksit.this.A396EmprCod;
      this.aP1[0] = pchecksit.this.A129BarCod;
      this.aP2[0] = pchecksit.this.A132BarCodReo;
      this.aP3[0] = pchecksit.this.A130BarCodPar;
      this.aP4[0] = pchecksit.this.AV12Station;
      this.aP5[0] = pchecksit.this.AV13Usurcod;
      this.aP6[0] = pchecksit.this.AV14Pgmnick;
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
      P04EB2_A396EmprCod = new String[] {""} ;
      P04EB2_A129BarCod = new int[1] ;
      P04EB2_A132BarCodReo = new byte[1] ;
      P04EB2_A130BarCodPar = new String[] {""} ;
      P04EB2_A213BarSit = new byte[1] ;
      P04EB3_A396EmprCod = new String[] {""} ;
      P04EB3_A129BarCod = new int[1] ;
      P04EB3_A132BarCodReo = new byte[1] ;
      P04EB3_A130BarCodPar = new String[] {""} ;
      P04EB3_A201BarPieEst = new byte[1] ;
      P04EB3_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV11Inc_obs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchecksit__default(),
         new Object[] {
             new Object[] {
            P04EB2_A396EmprCod, P04EB2_A129BarCod, P04EB2_A132BarCodReo, P04EB2_A130BarCodPar, P04EB2_A213BarSit
            }
            , new Object[] {
            P04EB3_A396EmprCod, P04EB3_A129BarCod, P04EB3_A132BarCodReo, P04EB3_A130BarCodPar, P04EB3_A201BarPieEst, P04EB3_A200BarPieCod
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
   private byte A201BarPieEst ;
   private byte AV10Barsit ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Pzasclose ;
   private int AV8Pzasest ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12Station ;
   private String AV13Usurcod ;
   private String AV14Pgmnick ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String AV11Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04EB2_A396EmprCod ;
   private int[] P04EB2_A129BarCod ;
   private byte[] P04EB2_A132BarCodReo ;
   private String[] P04EB2_A130BarCodPar ;
   private byte[] P04EB2_A213BarSit ;
   private String[] P04EB3_A396EmprCod ;
   private int[] P04EB3_A129BarCod ;
   private byte[] P04EB3_A132BarCodReo ;
   private String[] P04EB3_A130BarCodPar ;
   private byte[] P04EB3_A201BarPieEst ;
   private String[] P04EB3_A200BarPieCod ;
}

final  class pchecksit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04EB2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04EB3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04EB4", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 1 :
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

