package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelimin extends GXProcedure
{
   public pelimin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelimin.class ), "" );
   }

   public pelimin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pelimin.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pelimin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelimin.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pelimin.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pelimin.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13BarCodP = AV8BarCod ;
      AV14BarCodRP = AV9BarCodReo ;
      AV15BarCodPP = AV10BarCodPar ;
      new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV13BarCodP, AV14BarCodRP, AV15BarCodPP) ;
      AV11PlaHdrMin = GXutil.str( AV13BarCodP, 8, 0) + GXutil.str( AV14BarCodRP, 1, 0) + AV15BarCodPP ;
      /* Optimized DELETE. */
      /* Using cursor P02J52 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV11PlaHdrMin});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMINAGR");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelimin.this.A396EmprCod;
      this.aP1[0] = pelimin.this.AV8BarCod;
      this.aP2[0] = pelimin.this.AV9BarCodReo;
      this.aP3[0] = pelimin.this.AV10BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelimin");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15BarCodPP = "" ;
      AV11PlaHdrMin = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelimin__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV14BarCodRP ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int AV13BarCodP ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV15BarCodPP ;
   private String AV11PlaHdrMin ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pelimin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02J52", "DELETE FROM TXPMINAGR  WHERE EmprCod = ? and PlaHdrMin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMINAGR")
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

