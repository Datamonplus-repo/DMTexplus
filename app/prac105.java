package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prac105 extends GXProcedure
{
   public prac105( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prac105.class ), "" );
   }

   public prac105( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      prac105.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      prac105.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prac105.this.AV8RecHdrlts = aP1[0];
      this.aP1 = aP1;
      prac105.this.AV9LtsRec = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Barcod = (int)(GXutil.lval( GXutil.substring( AV8RecHdrlts, 1, 8))) ;
      AV11BarCodreo = (byte)(GXutil.lval( GXutil.substring( AV8RecHdrlts, 9, 1))) ;
      AV12Barcodpar = (GXutil.substring( AV8RecHdrlts, 10, 1)) ;
      AV13HreNumCie = (byte)(GXutil.lval( GXutil.substring( AV8RecHdrlts, 11, 2))) ;
      n9806HreLtsRs = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03U92 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV9LtsRec), A396EmprCod, Integer.valueOf(AV10Barcod), Byte.valueOf(AV11BarCodreo), AV12Barcodpar, Byte.valueOf(AV13HreNumCie)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prac105.this.A396EmprCod;
      this.aP1[0] = prac105.this.AV8RecHdrlts;
      this.aP2[0] = prac105.this.AV9LtsRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "prac105");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Barcodpar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prac105__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodreo ;
   private byte AV13HreNumCie ;
   private short Gx_err ;
   private int AV9LtsRec ;
   private int AV10Barcod ;
   private String A396EmprCod ;
   private String AV8RecHdrlts ;
   private String AV12Barcodpar ;
   private boolean n9806HreLtsRs ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class prac105__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03U92", "UPDATE TXPHISREH SET HreLtsRs=HreLtsRs + ?  WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREH")
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

