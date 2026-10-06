package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pficcvpi extends GXProcedure
{
   public pficcvpi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pficcvpi.class ), "" );
   }

   public pficcvpi( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      pficcvpi.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pficcvpi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pficcvpi.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pficcvpi.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pficcvpi.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pficcvpi.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pficcvpi.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n8043ForTipT = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03GN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pficcvpi.this.A396EmprCod;
      this.aP1[0] = pficcvpi.this.A252CliCod;
      this.aP2[0] = pficcvpi.this.A494ForSer;
      this.aP3[0] = pficcvpi.this.A482ForColNom;
      this.aP4[0] = pficcvpi.this.A483ForColNum;
      this.aP5[0] = pficcvpi.this.A831TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pficcvpi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pficcvpi__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private boolean n8043ForTipT ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pficcvpi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03GN2", "UPDATE TXPCFORMU SET ForTipT=1  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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

