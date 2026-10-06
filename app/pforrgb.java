package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pforrgb extends GXProcedure
{
   public pforrgb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pforrgb.class ), "" );
   }

   public pforrgb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 )
   {
      pforrgb.this.aP6 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        long[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             long[] aP6 )
   {
      pforrgb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pforrgb.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pforrgb.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pforrgb.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pforrgb.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pforrgb.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pforrgb.this.AV8Selected = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n4339ForRGB = false ;
      /* Optimized UPDATE. */
      /* Using cursor P018R2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n4339ForRGB), Long.valueOf(AV8Selected), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pforrgb.this.A396EmprCod;
      this.aP1[0] = pforrgb.this.A252CliCod;
      this.aP2[0] = pforrgb.this.A494ForSer;
      this.aP3[0] = pforrgb.this.A482ForColNom;
      this.aP4[0] = pforrgb.this.A483ForColNum;
      this.aP5[0] = pforrgb.this.A831TipColCod;
      this.aP6[0] = pforrgb.this.AV8Selected;
      Application.commitDataStores(context, remoteHandle, pr_default, "pforrgb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pforrgb__default(),
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
   private long AV8Selected ;
   private long A4339ForRGB ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private boolean n4339ForRGB ;
   private long[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class pforrgb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P018R2", "UPDATE TXPCFORMU SET ForRGB=?  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

