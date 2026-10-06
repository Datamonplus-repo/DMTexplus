package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class barcadaget extends GXProcedure
{
   public barcadaget( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( barcadaget.class ), "" );
   }

   public barcadaget( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              int aP1 ,
                              byte aP2 ,
                              String aP3 ,
                              int[] aP4 ,
                              String[] aP5 ,
                              String[] aP6 ,
                              String[] aP7 ,
                              int[] aP8 ,
                              String[] aP9 ,
                              byte[] aP10 )
   {
      barcadaget.this.aP11 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 ,
                        byte[] aP10 ,
                        boolean[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             boolean[] aP11 )
   {
      barcadaget.this.AV10EmprCod = aP0;
      barcadaget.this.AV11BarCod = aP1;
      barcadaget.this.AV12BarCodReo = aP2;
      barcadaget.this.AV13BarCodPar = aP3;
      barcadaget.this.aP4 = aP4;
      barcadaget.this.aP5 = aP5;
      barcadaget.this.aP6 = aP6;
      barcadaget.this.aP7 = aP7;
      barcadaget.this.aP8 = aP8;
      barcadaget.this.aP9 = aP9;
      barcadaget.this.aP10 = aP10;
      barcadaget.this.AV16Existe = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Existe = false ;
      /* Using cursor P0AV72 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AV72_A130BarCodPar[0] ;
         A132BarCodReo = P0AV72_A132BarCodReo[0] ;
         A129BarCod = P0AV72_A129BarCod[0] ;
         A396EmprCod = P0AV72_A396EmprCod[0] ;
         A252CliCod = P0AV72_A252CliCod[0] ;
         n252CliCod = P0AV72_n252CliCod[0] ;
         A279CliNom = P0AV72_A279CliNom[0] ;
         A212BarSer = P0AV72_A212BarSer[0] ;
         A1652BarSerDsc = P0AV72_A1652BarSerDsc[0] ;
         A136BarColNum = P0AV72_A136BarColNum[0] ;
         A135BarColNom = P0AV72_A135BarColNom[0] ;
         A218BarTipCol = P0AV72_A218BarTipCol[0] ;
         A279CliNom = P0AV72_A279CliNom[0] ;
         AV8Clicod = A252CliCod ;
         AV9CliNom = A279CliNom ;
         AV14BarSer = A212BarSer ;
         AV15BarSerDsc = A1652BarSerDsc ;
         AV17BarColNum = A136BarColNum ;
         AV18BarColNom = A135BarColNom ;
         AV19BarTipCol = A218BarTipCol ;
         AV16Existe = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Buscando BarCad para %1-%2-%3-%4. encontrado:%5", ""), AV10EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCod), 8, 0), GXutil.str( AV12BarCodReo, 1, 0), AV13BarCodPar, GXutil.booltostr( AV16Existe), "", "", "", ""), AV23Pgmname) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = barcadaget.this.AV8Clicod;
      this.aP5[0] = barcadaget.this.AV9CliNom;
      this.aP6[0] = barcadaget.this.AV14BarSer;
      this.aP7[0] = barcadaget.this.AV15BarSerDsc;
      this.aP8[0] = barcadaget.this.AV17BarColNum;
      this.aP9[0] = barcadaget.this.AV18BarColNom;
      this.aP10[0] = barcadaget.this.AV19BarTipCol;
      this.aP11[0] = barcadaget.this.AV16Existe;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9CliNom = "" ;
      AV14BarSer = "" ;
      AV15BarSerDsc = "" ;
      AV18BarColNom = "" ;
      scmdbuf = "" ;
      P0AV72_A130BarCodPar = new String[] {""} ;
      P0AV72_A132BarCodReo = new byte[1] ;
      P0AV72_A129BarCod = new int[1] ;
      P0AV72_A396EmprCod = new String[] {""} ;
      P0AV72_A252CliCod = new int[1] ;
      P0AV72_n252CliCod = new boolean[] {false} ;
      P0AV72_A279CliNom = new String[] {""} ;
      P0AV72_A212BarSer = new String[] {""} ;
      P0AV72_A1652BarSerDsc = new String[] {""} ;
      P0AV72_A136BarColNum = new int[1] ;
      P0AV72_A135BarColNom = new String[] {""} ;
      P0AV72_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      AV23Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.barcadaget__default(),
         new Object[] {
             new Object[] {
            P0AV72_A130BarCodPar, P0AV72_A132BarCodReo, P0AV72_A129BarCod, P0AV72_A396EmprCod, P0AV72_A252CliCod, P0AV72_n252CliCod, P0AV72_A279CliNom, P0AV72_A212BarSer, P0AV72_A1652BarSerDsc, P0AV72_A136BarColNum,
            P0AV72_A135BarColNom, P0AV72_A218BarTipCol
            }
         }
      );
      AV23Pgmname = "Ingenieria.BarcadaGet" ;
      /* GeneXus formulas. */
      AV23Pgmname = "Ingenieria.BarcadaGet" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV19BarTipCol ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int AV8Clicod ;
   private int AV17BarColNum ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private String AV10EmprCod ;
   private String AV13BarCodPar ;
   private String AV9CliNom ;
   private String AV14BarSer ;
   private String AV15BarSerDsc ;
   private String AV18BarColNom ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String AV23Pgmname ;
   private boolean AV16Existe ;
   private boolean n252CliCod ;
   private boolean[] aP11 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private String[] aP9 ;
   private byte[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AV72_A130BarCodPar ;
   private byte[] P0AV72_A132BarCodReo ;
   private int[] P0AV72_A129BarCod ;
   private String[] P0AV72_A396EmprCod ;
   private int[] P0AV72_A252CliCod ;
   private boolean[] P0AV72_n252CliCod ;
   private String[] P0AV72_A279CliNom ;
   private String[] P0AV72_A212BarSer ;
   private String[] P0AV72_A1652BarSerDsc ;
   private int[] P0AV72_A136BarColNum ;
   private String[] P0AV72_A135BarColNom ;
   private byte[] P0AV72_A218BarTipCol ;
}

final  class barcadaget__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AV72", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarColNum, T1.BarColNom, T1.BarTipCol FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
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
      }
   }

}

