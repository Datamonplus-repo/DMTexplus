package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datoshdrnc extends GXProcedure
{
   public datoshdrnc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datoshdrnc.class ), "" );
   }

   public datoshdrnc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 ,
                                     byte aP2 ,
                                     String aP3 ,
                                     String[] aP4 ,
                                     int[] aP5 ,
                                     String[] aP6 ,
                                     String[] aP7 ,
                                     String[] aP8 )
   {
      datoshdrnc.this.aP9 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        java.util.Date[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             java.util.Date[] aP9 )
   {
      datoshdrnc.this.A396EmprCod = aP0;
      datoshdrnc.this.A129BarCod = aP1;
      datoshdrnc.this.A132BarCodReo = aP2;
      datoshdrnc.this.A130BarCodPar = aP3;
      datoshdrnc.this.aP4 = aP4;
      datoshdrnc.this.aP5 = aP5;
      datoshdrnc.this.aP6 = aP6;
      datoshdrnc.this.aP7 = aP7;
      datoshdrnc.this.aP8 = aP8;
      datoshdrnc.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0ABC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P0ABC2_A361DisCod[0] ;
         A159BarFecGen = P0ABC2_A159BarFecGen[0] ;
         A212BarSer = P0ABC2_A212BarSer[0] ;
         A1652BarSerDsc = P0ABC2_A1652BarSerDsc[0] ;
         A252CliCod = P0ABC2_A252CliCod[0] ;
         n252CliCod = P0ABC2_n252CliCod[0] ;
         A279CliNom = P0ABC2_A279CliNom[0] ;
         A757PriCod = P0ABC2_A757PriCod[0] ;
         A757PriCod = P0ABC2_A757PriCod[0] ;
         A279CliNom = P0ABC2_A279CliNom[0] ;
         AV12Barfecgen = A159BarFecGen ;
         AV10Barser = A212BarSer ;
         AV11Barserdsc = A1652BarSerDsc ;
         AV9clicod = A252CliCod ;
         AV13Clinom = A279CliNom ;
         AV8PriCod = A757PriCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = datoshdrnc.this.AV8PriCod;
      this.aP5[0] = datoshdrnc.this.AV9clicod;
      this.aP6[0] = datoshdrnc.this.AV13Clinom;
      this.aP7[0] = datoshdrnc.this.AV10Barser;
      this.aP8[0] = datoshdrnc.this.AV11Barserdsc;
      this.aP9[0] = datoshdrnc.this.AV12Barfecgen;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8PriCod = "" ;
      AV13Clinom = "" ;
      AV10Barser = "" ;
      AV11Barserdsc = "" ;
      AV12Barfecgen = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0ABC2_A361DisCod = new int[1] ;
      P0ABC2_A396EmprCod = new String[] {""} ;
      P0ABC2_A129BarCod = new int[1] ;
      P0ABC2_A132BarCodReo = new byte[1] ;
      P0ABC2_A130BarCodPar = new String[] {""} ;
      P0ABC2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABC2_A212BarSer = new String[] {""} ;
      P0ABC2_A1652BarSerDsc = new String[] {""} ;
      P0ABC2_A252CliCod = new int[1] ;
      P0ABC2_n252CliCod = new boolean[] {false} ;
      P0ABC2_A279CliNom = new String[] {""} ;
      P0ABC2_A757PriCod = new String[] {""} ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A279CliNom = "" ;
      A757PriCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.datoshdrnc__default(),
         new Object[] {
             new Object[] {
            P0ABC2_A361DisCod, P0ABC2_A396EmprCod, P0ABC2_A129BarCod, P0ABC2_A132BarCodReo, P0ABC2_A130BarCodPar, P0ABC2_A159BarFecGen, P0ABC2_A212BarSer, P0ABC2_A1652BarSerDsc, P0ABC2_A252CliCod, P0ABC2_n252CliCod,
            P0ABC2_A279CliNom, P0ABC2_A757PriCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9clicod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8PriCod ;
   private String AV13Clinom ;
   private String AV10Barser ;
   private String AV11Barserdsc ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A279CliNom ;
   private String A757PriCod ;
   private java.util.Date AV12Barfecgen ;
   private java.util.Date A159BarFecGen ;
   private boolean n252CliCod ;
   private java.util.Date[] aP9 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private int[] P0ABC2_A361DisCod ;
   private String[] P0ABC2_A396EmprCod ;
   private int[] P0ABC2_A129BarCod ;
   private byte[] P0ABC2_A132BarCodReo ;
   private String[] P0ABC2_A130BarCodPar ;
   private java.util.Date[] P0ABC2_A159BarFecGen ;
   private String[] P0ABC2_A212BarSer ;
   private String[] P0ABC2_A1652BarSerDsc ;
   private int[] P0ABC2_A252CliCod ;
   private boolean[] P0ABC2_n252CliCod ;
   private String[] P0ABC2_A279CliNom ;
   private String[] P0ABC2_A757PriCod ;
}

final  class datoshdrnc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABC2", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecGen, T1.BarSer, T1.BarSerDsc, T1.CliCod, T3.CliNom, T2.PriCod FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
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

