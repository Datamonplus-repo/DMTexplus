package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchgco2 extends GXProcedure
{
   public pchgco2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchgco2.class ), "" );
   }

   public pchgco2( int remoteHandle ,
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
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pchgco2.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pchgco2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchgco2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pchgco2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pchgco2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pchgco2.this.AV15BarSer = aP4[0];
      this.aP4 = aP4;
      pchgco2.this.AV16ColNom = aP5[0];
      this.aP5 = aP5;
      pchgco2.this.AV17ColNum = aP6[0];
      this.aP6 = aP6;
      pchgco2.this.AV18TipCol = aP7[0];
      this.aP7 = aP7;
      pchgco2.this.AV23BaNomcli = aP8[0];
      this.aP8 = aP8;
      pchgco2.this.AV24BarNumCli = aP9[0];
      this.aP9 = aP9;
      pchgco2.this.AV27UsurCod = aP10[0];
      this.aP10 = aP10;
      pchgco2.this.AV28Station = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P061S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A135BarColNom = P061S2_A135BarColNom[0] ;
         A136BarColNum = P061S2_A136BarColNum[0] ;
         A218BarTipCol = P061S2_A218BarTipCol[0] ;
         A1234BarNomCli = P061S2_A1234BarNomCli[0] ;
         A1235BarNumCli = P061S2_A1235BarNumCli[0] ;
         AV21ColNom1 = A135BarColNom ;
         AV22ColNum1 = A136BarColNum ;
         AV26Inc_obs = httpContext.getMessage( "Agrupadas.Cambio Color", "") + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "Color    = ", "") + GXutil.trim( A135BarColNom) + " <- " + GXutil.trim( AV16ColNom) + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "Numero   = ", "") + GXutil.str( A136BarColNum, 6, 0) + " <- " + GXutil.str( AV17ColNum, 6, 0) + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "Tc       = ", "") + GXutil.str( A218BarTipCol, 2, 0) + " <- " + GXutil.str( AV18TipCol, 2, 0) + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "Color Cli= ", "") + GXutil.trim( A1234BarNomCli) + " <- " + GXutil.trim( AV23BaNomcli) + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "NumeroCli= ", "") + GXutil.str( A1235BarNumCli, 6, 0) + " <- " + GXutil.str( AV24BarNumCli, 6, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV27UsurCod, AV28Station, AV26Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         A135BarColNom = AV16ColNom ;
         A136BarColNum = AV17ColNum ;
         A218BarTipCol = AV18TipCol ;
         A1234BarNomCli = AV23BaNomcli ;
         A1235BarNumCli = AV24BarNumCli ;
         /* Using cursor P061S3 */
         pr_default.execute(1, new Object[] {A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchgco2.this.A396EmprCod;
      this.aP1[0] = pchgco2.this.A129BarCod;
      this.aP2[0] = pchgco2.this.A132BarCodReo;
      this.aP3[0] = pchgco2.this.A130BarCodPar;
      this.aP4[0] = pchgco2.this.AV15BarSer;
      this.aP5[0] = pchgco2.this.AV16ColNom;
      this.aP6[0] = pchgco2.this.AV17ColNum;
      this.aP7[0] = pchgco2.this.AV18TipCol;
      this.aP8[0] = pchgco2.this.AV23BaNomcli;
      this.aP9[0] = pchgco2.this.AV24BarNumCli;
      this.aP10[0] = pchgco2.this.AV27UsurCod;
      this.aP11[0] = pchgco2.this.AV28Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pchgco2");
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
      P061S2_A396EmprCod = new String[] {""} ;
      P061S2_A129BarCod = new int[1] ;
      P061S2_A132BarCodReo = new byte[1] ;
      P061S2_A130BarCodPar = new String[] {""} ;
      P061S2_A135BarColNom = new String[] {""} ;
      P061S2_A136BarColNum = new int[1] ;
      P061S2_A218BarTipCol = new byte[1] ;
      P061S2_A1234BarNomCli = new String[] {""} ;
      P061S2_A1235BarNumCli = new int[1] ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      AV21ColNom1 = "" ;
      AV26Inc_obs = "" ;
      AV40Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchgco2__default(),
         new Object[] {
             new Object[] {
            P061S2_A396EmprCod, P061S2_A129BarCod, P061S2_A132BarCodReo, P061S2_A130BarCodPar, P061S2_A135BarColNom, P061S2_A136BarColNum, P061S2_A218BarTipCol, P061S2_A1234BarNomCli, P061S2_A1235BarNumCli
            }
            , new Object[] {
            }
         }
      );
      AV40Pgmname = "PChgCo2" ;
      /* GeneXus formulas. */
      AV40Pgmname = "PChgCo2" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18TipCol ;
   private byte A218BarTipCol ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17ColNum ;
   private int AV24BarNumCli ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int AV22ColNum1 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15BarSer ;
   private String AV16ColNom ;
   private String AV23BaNomcli ;
   private String AV27UsurCod ;
   private String AV28Station ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String AV21ColNom1 ;
   private String AV40Pgmname ;
   private String AV26Inc_obs ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P061S2_A396EmprCod ;
   private int[] P061S2_A129BarCod ;
   private byte[] P061S2_A132BarCodReo ;
   private String[] P061S2_A130BarCodPar ;
   private String[] P061S2_A135BarColNom ;
   private int[] P061S2_A136BarColNum ;
   private byte[] P061S2_A218BarTipCol ;
   private String[] P061S2_A1234BarNomCli ;
   private int[] P061S2_A1235BarNumCli ;
}

final  class pchgco2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P061S2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarColNom, BarColNum, BarTipCol, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P061S3", "UPDATE TXPBARCAD SET BarColNom=?, BarColNum=?, BarTipCol=?, BarNomCli=?, BarNumCli=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

