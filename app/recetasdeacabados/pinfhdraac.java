package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinfhdraac extends GXProcedure
{
   public pinfhdraac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinfhdraac.class ), "" );
   }

   public pinfhdraac( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 ,
                          String[] aP7 )
   {
      pinfhdraac.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 )
   {
      pinfhdraac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinfhdraac.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinfhdraac.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinfhdraac.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinfhdraac.this.AV8Clicod = aP4[0];
      this.aP4 = aP4;
      pinfhdraac.this.AV9Barser = aP5[0];
      this.aP5 = aP5;
      pinfhdraac.this.AV10BarSerdsc = aP6[0];
      this.aP6 = aP6;
      pinfhdraac.this.AV11Barcolnom = aP7[0];
      this.aP7 = aP7;
      pinfhdraac.this.AV12Barcolnum = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03WN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A135BarColNom = P03WN2_A135BarColNom[0] ;
         A136BarColNum = P03WN2_A136BarColNum[0] ;
         A212BarSer = P03WN2_A212BarSer[0] ;
         A1652BarSerDsc = P03WN2_A1652BarSerDsc[0] ;
         A252CliCod = P03WN2_A252CliCod[0] ;
         n252CliCod = P03WN2_n252CliCod[0] ;
         AV11Barcolnom = A135BarColNom ;
         AV12Barcolnum = A136BarColNum ;
         AV9Barser = A212BarSer ;
         AV10BarSerdsc = A1652BarSerDsc ;
         AV8Clicod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinfhdraac.this.A396EmprCod;
      this.aP1[0] = pinfhdraac.this.A129BarCod;
      this.aP2[0] = pinfhdraac.this.A132BarCodReo;
      this.aP3[0] = pinfhdraac.this.A130BarCodPar;
      this.aP4[0] = pinfhdraac.this.AV8Clicod;
      this.aP5[0] = pinfhdraac.this.AV9Barser;
      this.aP6[0] = pinfhdraac.this.AV10BarSerdsc;
      this.aP7[0] = pinfhdraac.this.AV11Barcolnom;
      this.aP8[0] = pinfhdraac.this.AV12Barcolnum;
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
      P03WN2_A396EmprCod = new String[] {""} ;
      P03WN2_A129BarCod = new int[1] ;
      P03WN2_A132BarCodReo = new byte[1] ;
      P03WN2_A130BarCodPar = new String[] {""} ;
      P03WN2_A135BarColNom = new String[] {""} ;
      P03WN2_A136BarColNum = new int[1] ;
      P03WN2_A212BarSer = new String[] {""} ;
      P03WN2_A1652BarSerDsc = new String[] {""} ;
      P03WN2_A252CliCod = new int[1] ;
      P03WN2_n252CliCod = new boolean[] {false} ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pinfhdraac__default(),
         new Object[] {
             new Object[] {
            P03WN2_A396EmprCod, P03WN2_A129BarCod, P03WN2_A132BarCodReo, P03WN2_A130BarCodPar, P03WN2_A135BarColNom, P03WN2_A136BarColNum, P03WN2_A212BarSer, P03WN2_A1652BarSerDsc, P03WN2_A252CliCod, P03WN2_n252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Clicod ;
   private int AV12Barcolnum ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9Barser ;
   private String AV10BarSerdsc ;
   private String AV11Barcolnom ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private boolean n252CliCod ;
   private int[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P03WN2_A396EmprCod ;
   private int[] P03WN2_A129BarCod ;
   private byte[] P03WN2_A132BarCodReo ;
   private String[] P03WN2_A130BarCodPar ;
   private String[] P03WN2_A135BarColNom ;
   private int[] P03WN2_A136BarColNum ;
   private String[] P03WN2_A212BarSer ;
   private String[] P03WN2_A1652BarSerDsc ;
   private int[] P03WN2_A252CliCod ;
   private boolean[] P03WN2_n252CliCod ;
}

final  class pinfhdraac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WN2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarColNom, BarColNum, BarSer, BarSerDsc, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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

