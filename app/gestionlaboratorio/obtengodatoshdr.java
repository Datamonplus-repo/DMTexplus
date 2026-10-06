package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengodatoshdr extends GXProcedure
{
   public obtengodatoshdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengodatoshdr.class ), "" );
   }

   public obtengodatoshdr( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 ,
                          int[] aP7 ,
                          byte[] aP8 ,
                          String[] aP9 )
   {
      obtengodatoshdr.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 )
   {
      obtengodatoshdr.this.A396EmprCod = aP0;
      obtengodatoshdr.this.A129BarCod = aP1;
      obtengodatoshdr.this.A132BarCodReo = aP2;
      obtengodatoshdr.this.A130BarCodPar = aP3;
      obtengodatoshdr.this.aP4 = aP4;
      obtengodatoshdr.this.aP5 = aP5;
      obtengodatoshdr.this.aP6 = aP6;
      obtengodatoshdr.this.aP7 = aP7;
      obtengodatoshdr.this.aP8 = aP8;
      obtengodatoshdr.this.aP9 = aP9;
      obtengodatoshdr.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0ADW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P0ADW2_A252CliCod[0] ;
         n252CliCod = P0ADW2_n252CliCod[0] ;
         A212BarSer = P0ADW2_A212BarSer[0] ;
         A135BarColNom = P0ADW2_A135BarColNom[0] ;
         A136BarColNum = P0ADW2_A136BarColNum[0] ;
         A218BarTipCol = P0ADW2_A218BarTipCol[0] ;
         A1234BarNomCli = P0ADW2_A1234BarNomCli[0] ;
         A1235BarNumCli = P0ADW2_A1235BarNumCli[0] ;
         AV9clicod = A252CliCod ;
         AV10BarSer = A212BarSer ;
         AV11BarColNom = A135BarColNom ;
         AV12BarColNum = A136BarColNum ;
         AV13BarTipCol = A218BarTipCol ;
         AV14Barnomcli = A1234BarNomCli ;
         AV8Barnumcli = A1235BarNumCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = obtengodatoshdr.this.AV9clicod;
      this.aP5[0] = obtengodatoshdr.this.AV10BarSer;
      this.aP6[0] = obtengodatoshdr.this.AV11BarColNom;
      this.aP7[0] = obtengodatoshdr.this.AV12BarColNum;
      this.aP8[0] = obtengodatoshdr.this.AV13BarTipCol;
      this.aP9[0] = obtengodatoshdr.this.AV14Barnomcli;
      this.aP10[0] = obtengodatoshdr.this.AV8Barnumcli;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10BarSer = "" ;
      AV11BarColNom = "" ;
      AV14Barnomcli = "" ;
      scmdbuf = "" ;
      P0ADW2_A396EmprCod = new String[] {""} ;
      P0ADW2_A129BarCod = new int[1] ;
      P0ADW2_A132BarCodReo = new byte[1] ;
      P0ADW2_A130BarCodPar = new String[] {""} ;
      P0ADW2_A252CliCod = new int[1] ;
      P0ADW2_n252CliCod = new boolean[] {false} ;
      P0ADW2_A212BarSer = new String[] {""} ;
      P0ADW2_A135BarColNom = new String[] {""} ;
      P0ADW2_A136BarColNum = new int[1] ;
      P0ADW2_A218BarTipCol = new byte[1] ;
      P0ADW2_A1234BarNomCli = new String[] {""} ;
      P0ADW2_A1235BarNumCli = new int[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.obtengodatoshdr__default(),
         new Object[] {
             new Object[] {
            P0ADW2_A396EmprCod, P0ADW2_A129BarCod, P0ADW2_A132BarCodReo, P0ADW2_A130BarCodPar, P0ADW2_A252CliCod, P0ADW2_n252CliCod, P0ADW2_A212BarSer, P0ADW2_A135BarColNom, P0ADW2_A136BarColNum, P0ADW2_A218BarTipCol,
            P0ADW2_A1234BarNomCli, P0ADW2_A1235BarNumCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13BarTipCol ;
   private byte A218BarTipCol ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9clicod ;
   private int AV12BarColNum ;
   private int AV8Barnumcli ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10BarSer ;
   private String AV11BarColNom ;
   private String AV14Barnomcli ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private boolean n252CliCod ;
   private int[] aP10 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADW2_A396EmprCod ;
   private int[] P0ADW2_A129BarCod ;
   private byte[] P0ADW2_A132BarCodReo ;
   private String[] P0ADW2_A130BarCodPar ;
   private int[] P0ADW2_A252CliCod ;
   private boolean[] P0ADW2_n252CliCod ;
   private String[] P0ADW2_A212BarSer ;
   private String[] P0ADW2_A135BarColNom ;
   private int[] P0ADW2_A136BarColNum ;
   private byte[] P0ADW2_A218BarTipCol ;
   private String[] P0ADW2_A1234BarNomCli ;
   private int[] P0ADW2_A1235BarNumCli ;
}

final  class obtengodatoshdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADW2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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

