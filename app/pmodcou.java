package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodcou extends GXProcedure
{
   public pmodcou( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodcou.class ), "" );
   }

   public pmodcou( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      pmodcou.this.aP2 = new int[] {0};
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
      pmodcou.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodcou.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      pmodcou.this.AV15NueVal = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P003H2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV15NueVal), A396EmprCod, A313ContCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodcou.this.A396EmprCod;
      this.aP1[0] = pmodcou.this.A313ContCod;
      this.aP2[0] = pmodcou.this.AV15NueVal;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodcou");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodcou__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15NueVal ;
   private int A316ContVal ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pmodcou__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P003H2", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

