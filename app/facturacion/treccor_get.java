package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class treccor_get extends GXProcedure
{
   public treccor_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( treccor_get.class ), "" );
   }

   public treccor_get( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           String aP2 ,
                                           String aP3 ,
                                           int aP4 ,
                                           byte aP5 ,
                                           byte aP6 ,
                                           int[] aP7 ,
                                           int[] aP8 )
   {
      treccor_get.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        byte aP6 ,
                        int[] aP7 ,
                        int[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             byte aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      treccor_get.this.A396EmprCod = aP0;
      treccor_get.this.A252CliCod = aP1;
      treccor_get.this.A494ForSer = aP2;
      treccor_get.this.A482ForColNom = aP3;
      treccor_get.this.A483ForColNum = aP4;
      treccor_get.this.A831TipColCod = aP5;
      treccor_get.this.AV8RecCorLin = aP6;
      treccor_get.this.aP7 = aP7;
      treccor_get.this.aP8 = aP8;
      treccor_get.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11RecCanRec = DecimalUtil.ZERO ;
      AV10RecValFin = 0 ;
      AV9RecValIni = 0 ;
      /* Using cursor P0AML2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(AV8RecCorLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1519RecCorLin = P0AML2_A1519RecCorLin[0] ;
         A1522RecCanRec = P0AML2_A1522RecCanRec[0] ;
         n1522RecCanRec = P0AML2_n1522RecCanRec[0] ;
         A1521RecValFin = P0AML2_A1521RecValFin[0] ;
         n1521RecValFin = P0AML2_n1521RecValFin[0] ;
         A1520RecValIni = P0AML2_A1520RecValIni[0] ;
         n1520RecValIni = P0AML2_n1520RecValIni[0] ;
         AV11RecCanRec = A1522RecCanRec ;
         AV10RecValFin = A1521RecValFin ;
         AV9RecValIni = A1520RecValIni ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = treccor_get.this.AV9RecValIni;
      this.aP8[0] = treccor_get.this.AV10RecValFin;
      this.aP9[0] = treccor_get.this.AV11RecCanRec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11RecCanRec = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AML2_A396EmprCod = new String[] {""} ;
      P0AML2_A252CliCod = new int[1] ;
      P0AML2_A494ForSer = new String[] {""} ;
      P0AML2_A482ForColNom = new String[] {""} ;
      P0AML2_A483ForColNum = new int[1] ;
      P0AML2_A831TipColCod = new byte[1] ;
      P0AML2_A1519RecCorLin = new byte[1] ;
      P0AML2_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AML2_n1522RecCanRec = new boolean[] {false} ;
      P0AML2_A1521RecValFin = new int[1] ;
      P0AML2_n1521RecValFin = new boolean[] {false} ;
      P0AML2_A1520RecValIni = new int[1] ;
      P0AML2_n1520RecValIni = new boolean[] {false} ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_get__default(),
         new Object[] {
             new Object[] {
            P0AML2_A396EmprCod, P0AML2_A252CliCod, P0AML2_A494ForSer, P0AML2_A482ForColNom, P0AML2_A483ForColNum, P0AML2_A831TipColCod, P0AML2_A1519RecCorLin, P0AML2_A1522RecCanRec, P0AML2_n1522RecCanRec, P0AML2_A1521RecValFin,
            P0AML2_n1521RecValFin, P0AML2_A1520RecValIni, P0AML2_n1520RecValIni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8RecCorLin ;
   private byte A1519RecCorLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV9RecValIni ;
   private int AV10RecValFin ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private java.math.BigDecimal AV11RecCanRec ;
   private java.math.BigDecimal A1522RecCanRec ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private boolean n1522RecCanRec ;
   private boolean n1521RecValFin ;
   private boolean n1520RecValIni ;
   private java.math.BigDecimal[] aP9 ;
   private int[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AML2_A396EmprCod ;
   private int[] P0AML2_A252CliCod ;
   private String[] P0AML2_A494ForSer ;
   private String[] P0AML2_A482ForColNom ;
   private int[] P0AML2_A483ForColNum ;
   private byte[] P0AML2_A831TipColCod ;
   private byte[] P0AML2_A1519RecCorLin ;
   private java.math.BigDecimal[] P0AML2_A1522RecCanRec ;
   private boolean[] P0AML2_n1522RecCanRec ;
   private int[] P0AML2_A1521RecValFin ;
   private boolean[] P0AML2_n1521RecValFin ;
   private int[] P0AML2_A1520RecValIni ;
   private boolean[] P0AML2_n1520RecValIni ;
}

final  class treccor_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AML2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin, RecCanRec, RecValFin, RecValIni FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and RecCorLin = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

