package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class treccor_nextlinea extends GXProcedure
{
   public treccor_nextlinea( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( treccor_nextlinea.class ), "" );
   }

   public treccor_nextlinea( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 ,
                           String aP3 ,
                           int aP4 ,
                           byte aP5 )
   {
      treccor_nextlinea.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             byte[] aP6 )
   {
      treccor_nextlinea.this.A396EmprCod = aP0;
      treccor_nextlinea.this.A252CliCod = aP1;
      treccor_nextlinea.this.A494ForSer = aP2;
      treccor_nextlinea.this.A482ForColNom = aP3;
      treccor_nextlinea.this.A483ForColNum = aP4;
      treccor_nextlinea.this.A831TipColCod = aP5;
      treccor_nextlinea.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8RecCorLin = (byte)(0) ;
      /* Using cursor P0AMM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1519RecCorLin = P0AMM2_A1519RecCorLin[0] ;
         AV8RecCorLin = A1519RecCorLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8RecCorLin = (byte)(AV8RecCorLin+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = treccor_nextlinea.this.AV8RecCorLin;
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
      P0AMM2_A396EmprCod = new String[] {""} ;
      P0AMM2_A252CliCod = new int[1] ;
      P0AMM2_A494ForSer = new String[] {""} ;
      P0AMM2_A482ForColNom = new String[] {""} ;
      P0AMM2_A483ForColNum = new int[1] ;
      P0AMM2_A831TipColCod = new byte[1] ;
      P0AMM2_A1519RecCorLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_nextlinea__default(),
         new Object[] {
             new Object[] {
            P0AMM2_A396EmprCod, P0AMM2_A252CliCod, P0AMM2_A494ForSer, P0AMM2_A482ForColNom, P0AMM2_A483ForColNum, P0AMM2_A831TipColCod, P0AMM2_A1519RecCorLin
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
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMM2_A396EmprCod ;
   private int[] P0AMM2_A252CliCod ;
   private String[] P0AMM2_A494ForSer ;
   private String[] P0AMM2_A482ForColNom ;
   private int[] P0AMM2_A483ForColNum ;
   private byte[] P0AMM2_A831TipColCod ;
   private byte[] P0AMM2_A1519RecCorLin ;
}

final  class treccor_nextlinea__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMM2", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

}

