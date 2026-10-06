package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc230 extends GXProcedure
{
   public pprc230( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc230.class ), "" );
   }

   public pprc230( int remoteHandle ,
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
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 )
   {
      pprc230.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      pprc230.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc230.this.A119BarAgrCod = aP1[0];
      this.aP1 = aP1;
      pprc230.this.A124BarAgrReo = aP2[0];
      this.aP2 = aP2;
      pprc230.this.A122BarAgrPar = aP3[0];
      this.aP3 = aP3;
      pprc230.this.AV8BarColNom = aP4[0];
      this.aP4 = aP4;
      pprc230.this.AV9BarColNum = aP5[0];
      this.aP5 = aP5;
      pprc230.this.AV10BarTipCol = aP6[0];
      this.aP6 = aP6;
      pprc230.this.AV11BarNomCli = aP7[0];
      this.aP7 = aP7;
      pprc230.this.AV12BarNumCli = aP8[0];
      this.aP8 = aP8;
      pprc230.this.AV13usurcod = aP9[0];
      this.aP9 = aP9;
      pprc230.this.AV14Station = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05V12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1510ColNomAgr = P05V12_A1510ColNomAgr[0] ;
         A1512ColNumAgr = P05V12_A1512ColNumAgr[0] ;
         A1509ColNoCAgr = P05V12_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = P05V12_A1511ColNuCAgr[0] ;
         A129BarCod = P05V12_A129BarCod[0] ;
         A132BarCodReo = P05V12_A132BarCodReo[0] ;
         A130BarCodPar = P05V12_A130BarCodPar[0] ;
         AV15Inc_obs = httpContext.getMessage( "Agrupadas.Cambio Color", "") + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Color    = ", "") + GXutil.trim( A1510ColNomAgr) + " <- " + GXutil.trim( AV8BarColNom) + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Numero   = ", "") + GXutil.str( A1512ColNumAgr, 6, 0) + " <- " + GXutil.str( AV9BarColNum, 6, 0) + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Color Cli= ", "") + GXutil.trim( A1509ColNoCAgr) + " <- " + GXutil.trim( AV11BarNomCli) + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "NumeroCli= ", "") + GXutil.str( A1511ColNuCAgr, 6, 0) + " <- " + GXutil.str( AV12BarNumCli, 6, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV19Pgmname, AV13usurcod, AV14Station, AV15Inc_obs, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         A1510ColNomAgr = AV8BarColNom ;
         A1512ColNumAgr = AV9BarColNum ;
         A1509ColNoCAgr = AV11BarNomCli ;
         A1511ColNuCAgr = AV12BarNumCli ;
         /* Using cursor P05V13 */
         pr_default.execute(1, new Object[] {A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc230.this.A396EmprCod;
      this.aP1[0] = pprc230.this.A119BarAgrCod;
      this.aP2[0] = pprc230.this.A124BarAgrReo;
      this.aP3[0] = pprc230.this.A122BarAgrPar;
      this.aP4[0] = pprc230.this.AV8BarColNom;
      this.aP5[0] = pprc230.this.AV9BarColNum;
      this.aP6[0] = pprc230.this.AV10BarTipCol;
      this.aP7[0] = pprc230.this.AV11BarNomCli;
      this.aP8[0] = pprc230.this.AV12BarNumCli;
      this.aP9[0] = pprc230.this.AV13usurcod;
      this.aP10[0] = pprc230.this.AV14Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc230");
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
      P05V12_A396EmprCod = new String[] {""} ;
      P05V12_A119BarAgrCod = new int[1] ;
      P05V12_A124BarAgrReo = new byte[1] ;
      P05V12_A122BarAgrPar = new String[] {""} ;
      P05V12_A1510ColNomAgr = new String[] {""} ;
      P05V12_A1512ColNumAgr = new int[1] ;
      P05V12_A1509ColNoCAgr = new String[] {""} ;
      P05V12_A1511ColNuCAgr = new int[1] ;
      P05V12_A129BarCod = new int[1] ;
      P05V12_A132BarCodReo = new byte[1] ;
      P05V12_A130BarCodPar = new String[] {""} ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      A130BarCodPar = "" ;
      AV15Inc_obs = "" ;
      AV19Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc230__default(),
         new Object[] {
             new Object[] {
            P05V12_A396EmprCod, P05V12_A119BarAgrCod, P05V12_A124BarAgrReo, P05V12_A122BarAgrPar, P05V12_A1510ColNomAgr, P05V12_A1512ColNumAgr, P05V12_A1509ColNoCAgr, P05V12_A1511ColNuCAgr, P05V12_A129BarCod, P05V12_A132BarCodReo,
            P05V12_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      AV19Pgmname = "PPrc230" ;
      /* GeneXus formulas. */
      AV19Pgmname = "PPrc230" ;
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private byte AV10BarTipCol ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A119BarAgrCod ;
   private int AV9BarColNum ;
   private int AV12BarNumCli ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private String AV8BarColNom ;
   private String AV11BarNomCli ;
   private String AV13usurcod ;
   private String AV14Station ;
   private String scmdbuf ;
   private String A1510ColNomAgr ;
   private String A1509ColNoCAgr ;
   private String A130BarCodPar ;
   private String AV19Pgmname ;
   private String AV15Inc_obs ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P05V12_A396EmprCod ;
   private int[] P05V12_A119BarAgrCod ;
   private byte[] P05V12_A124BarAgrReo ;
   private String[] P05V12_A122BarAgrPar ;
   private String[] P05V12_A1510ColNomAgr ;
   private int[] P05V12_A1512ColNumAgr ;
   private String[] P05V12_A1509ColNoCAgr ;
   private int[] P05V12_A1511ColNuCAgr ;
   private int[] P05V12_A129BarCod ;
   private byte[] P05V12_A132BarCodReo ;
   private String[] P05V12_A130BarCodPar ;
}

final  class pprc230__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05V12", "SELECT EmprCod, BarAgrCod, BarAgrReo, BarAgrPar, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE (EmprCod = ?) AND (BarAgrCod = ?) AND (BarAgrReo = ?) AND (BarAgrPar = ?) ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05V13", "UPDATE TXPBARAGR SET ColNomAgr=?, ColNumAgr=?, ColNoCAgr=?, ColNuCAgr=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
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
               stmt.setString(1, (String)parms[0], 13);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               return;
      }
   }

}

