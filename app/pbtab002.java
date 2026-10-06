package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbtab002 extends GXProcedure
{
   public pbtab002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbtab002.class ), "" );
   }

   public pbtab002( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 ,
                          String[] aP6 )
   {
      pbtab002.this.aP7 = new int[] {0};
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
                        int[] aP7 )
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
                             int[] aP7 )
   {
      pbtab002.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbtab002.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbtab002.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pbtab002.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pbtab002.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pbtab002.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pbtab002.this.A853For_ProC = aP6[0];
      this.aP6 = aP6;
      pbtab002.this.A1028For_Ord = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P03XT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A853For_ProC, Integer.valueOf(A1028For_Ord)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAB002");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbtab002.this.A396EmprCod;
      this.aP1[0] = pbtab002.this.A252CliCod;
      this.aP2[0] = pbtab002.this.A494ForSer;
      this.aP3[0] = pbtab002.this.A482ForColNom;
      this.aP4[0] = pbtab002.this.A483ForColNum;
      this.aP5[0] = pbtab002.this.A831TipColCod;
      this.aP6[0] = pbtab002.this.A853For_ProC;
      this.aP7[0] = pbtab002.this.A1028For_Ord;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbtab002");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbtab002__default(),
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
   private int A1028For_Ord ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A853For_ProC ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
}

final  class pbtab002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03XT2", "DELETE FROM TXPTAB002  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and For_ProC = ? and For_Ord = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTAB002")
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
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
      }
   }

}

