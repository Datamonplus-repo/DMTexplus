package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partprmin extends GXProcedure
{
   public partprmin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partprmin.class ), "" );
   }

   public partprmin( int remoteHandle ,
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
      partprmin.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      partprmin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partprmin.this.AV10CliCod = aP1[0];
      this.aP1 = aP1;
      partprmin.this.AV11ForSer = aP2[0];
      this.aP2 = aP2;
      partprmin.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      partprmin.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      partprmin.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      partprmin.this.AV9Tinte = aP6[0];
      this.aP6 = aP6;
      partprmin.this.AV8Precio = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14GXLvl1 = (byte)(0) ;
      /* Using cursor P03022 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod), A482ForColNom, Integer.valueOf(A483ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P03022_A583IntCod[0] ;
         A1192ForNumCli = P03022_A1192ForNumCli[0] ;
         n1192ForNumCli = P03022_n1192ForNumCli[0] ;
         A7754IntPreMin = P03022_A7754IntPreMin[0] ;
         n7754IntPreMin = P03022_n7754IntPreMin[0] ;
         A252CliCod = P03022_A252CliCod[0] ;
         A494ForSer = P03022_A494ForSer[0] ;
         A7754IntPreMin = P03022_A7754IntPreMin[0] ;
         n7754IntPreMin = P03022_n7754IntPreMin[0] ;
         if ( GXutil.strcmp(AV9Tinte, httpContext.getMessage( "S", "")) == 0 )
         {
            AV14GXLvl1 = (byte)(1) ;
            AV8Precio = A7754IntPreMin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14GXLvl1 == 0 )
      {
         AV8Precio = DecimalUtil.doubleToDec(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partprmin.this.A396EmprCod;
      this.aP1[0] = partprmin.this.AV10CliCod;
      this.aP2[0] = partprmin.this.AV11ForSer;
      this.aP3[0] = partprmin.this.A482ForColNom;
      this.aP4[0] = partprmin.this.A483ForColNum;
      this.aP5[0] = partprmin.this.A831TipColCod;
      this.aP6[0] = partprmin.this.AV9Tinte;
      this.aP7[0] = partprmin.this.AV8Precio;
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
      P03022_A583IntCod = new byte[1] ;
      P03022_A396EmprCod = new String[] {""} ;
      P03022_A482ForColNom = new String[] {""} ;
      P03022_A483ForColNum = new int[1] ;
      P03022_A831TipColCod = new byte[1] ;
      P03022_A1192ForNumCli = new int[1] ;
      P03022_n1192ForNumCli = new boolean[] {false} ;
      P03022_A7754IntPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03022_n7754IntPreMin = new boolean[] {false} ;
      P03022_A252CliCod = new int[1] ;
      P03022_A494ForSer = new String[] {""} ;
      A7754IntPreMin = DecimalUtil.ZERO ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partprmin__default(),
         new Object[] {
             new Object[] {
            P03022_A583IntCod, P03022_A396EmprCod, P03022_A482ForColNom, P03022_A483ForColNum, P03022_A831TipColCod, P03022_A1192ForNumCli, P03022_n1192ForNumCli, P03022_A7754IntPreMin, P03022_n7754IntPreMin, P03022_A252CliCod,
            P03022_A494ForSer
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
   private int AV10CliCod ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8Precio ;
   private java.math.BigDecimal A7754IntPreMin ;
   private String A396EmprCod ;
   private String AV11ForSer ;
   private String A482ForColNom ;
   private String AV9Tinte ;
   private String scmdbuf ;
   private String A494ForSer ;
   private boolean n1192ForNumCli ;
   private boolean n7754IntPreMin ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03022_A583IntCod ;
   private String[] P03022_A396EmprCod ;
   private String[] P03022_A482ForColNom ;
   private int[] P03022_A483ForColNum ;
   private byte[] P03022_A831TipColCod ;
   private int[] P03022_A1192ForNumCli ;
   private boolean[] P03022_n1192ForNumCli ;
   private java.math.BigDecimal[] P03022_A7754IntPreMin ;
   private boolean[] P03022_n7754IntPreMin ;
   private int[] P03022_A252CliCod ;
   private String[] P03022_A494ForSer ;
}

final  class partprmin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03022", "SELECT T1.IntCod, T1.EmprCod, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForNumCli, T2.IntPreMin, T1.CliCod, T1.ForSer FROM (TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE (T1.EmprCod = ? and T1.TipColCod = ?) AND (T1.ForColNom = ?) AND (T1.ForColNum = ?) ORDER BY T1.EmprCod, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

