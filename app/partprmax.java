package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partprmax extends GXProcedure
{
   public partprmax( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partprmax.class ), "" );
   }

   public partprmax( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 ,
                                           String[] aP6 )
   {
      partprmax.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      partprmax.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partprmax.this.AV11CliCod = aP1[0];
      this.aP1 = aP1;
      partprmax.this.AV10ForSer = aP2[0];
      this.aP2 = aP2;
      partprmax.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      partprmax.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      partprmax.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      partprmax.this.AV9Tinte = aP6[0];
      this.aP6 = aP6;
      partprmax.this.AV8Precio = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14GXLvl1 = (byte)(0) ;
      /* Using cursor P03012 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod), A482ForColNom, Integer.valueOf(A483ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P03012_A583IntCod[0] ;
         A1192ForNumCli = P03012_A1192ForNumCli[0] ;
         n1192ForNumCli = P03012_n1192ForNumCli[0] ;
         A7755IntPreMax = P03012_A7755IntPreMax[0] ;
         n7755IntPreMax = P03012_n7755IntPreMax[0] ;
         A252CliCod = P03012_A252CliCod[0] ;
         A494ForSer = P03012_A494ForSer[0] ;
         A7755IntPreMax = P03012_A7755IntPreMax[0] ;
         n7755IntPreMax = P03012_n7755IntPreMax[0] ;
         if ( GXutil.strcmp(AV9Tinte, httpContext.getMessage( "S", "")) == 0 )
         {
            AV14GXLvl1 = (byte)(1) ;
            AV8Precio = A7755IntPreMax ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14GXLvl1 == 0 )
      {
         AV8Precio = DecimalUtil.stringToDec("9999999.99") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partprmax.this.A396EmprCod;
      this.aP1[0] = partprmax.this.AV11CliCod;
      this.aP2[0] = partprmax.this.AV10ForSer;
      this.aP3[0] = partprmax.this.A482ForColNom;
      this.aP4[0] = partprmax.this.A483ForColNum;
      this.aP5[0] = partprmax.this.A831TipColCod;
      this.aP6[0] = partprmax.this.AV9Tinte;
      this.aP7[0] = partprmax.this.AV8Precio;
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
      P03012_A583IntCod = new byte[1] ;
      P03012_A396EmprCod = new String[] {""} ;
      P03012_A482ForColNom = new String[] {""} ;
      P03012_A483ForColNum = new int[1] ;
      P03012_A831TipColCod = new byte[1] ;
      P03012_A1192ForNumCli = new int[1] ;
      P03012_n1192ForNumCli = new boolean[] {false} ;
      P03012_A7755IntPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03012_n7755IntPreMax = new boolean[] {false} ;
      P03012_A252CliCod = new int[1] ;
      P03012_A494ForSer = new String[] {""} ;
      A7755IntPreMax = DecimalUtil.ZERO ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partprmax__default(),
         new Object[] {
             new Object[] {
            P03012_A583IntCod, P03012_A396EmprCod, P03012_A482ForColNom, P03012_A483ForColNum, P03012_A831TipColCod, P03012_A1192ForNumCli, P03012_n1192ForNumCli, P03012_A7755IntPreMax, P03012_n7755IntPreMax, P03012_A252CliCod,
            P03012_A494ForSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV14GXLvl1 ;
   private byte A583IntCod ;
   private short Gx_err ;
   private int AV11CliCod ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8Precio ;
   private java.math.BigDecimal A7755IntPreMax ;
   private String A396EmprCod ;
   private String AV10ForSer ;
   private String A482ForColNom ;
   private String AV9Tinte ;
   private String scmdbuf ;
   private String A494ForSer ;
   private boolean n1192ForNumCli ;
   private boolean n7755IntPreMax ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03012_A583IntCod ;
   private String[] P03012_A396EmprCod ;
   private String[] P03012_A482ForColNom ;
   private int[] P03012_A483ForColNum ;
   private byte[] P03012_A831TipColCod ;
   private int[] P03012_A1192ForNumCli ;
   private boolean[] P03012_n1192ForNumCli ;
   private java.math.BigDecimal[] P03012_A7755IntPreMax ;
   private boolean[] P03012_n7755IntPreMax ;
   private int[] P03012_A252CliCod ;
   private String[] P03012_A494ForSer ;
}

final  class partprmax__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03012", "SELECT T1.IntCod, T1.EmprCod, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForNumCli, T2.IntPreMax, T1.CliCod, T1.ForSer FROM (TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE (T1.EmprCod = ? and T1.TipColCod = ?) AND (T1.ForColNom = ?) AND (T1.ForColNum = ?) ORDER BY T1.EmprCod, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

