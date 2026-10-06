package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliccs extends GXProcedure
{
   public peliccs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliccs.class ), "" );
   }

   public peliccs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      peliccs.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      peliccs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliccs.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      peliccs.this.A3358CCStkLen = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "pELICCS", "") );
      /* Optimized DELETE. */
      /* Using cursor P00MS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A3358CCStkLen)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliccs.this.A396EmprCod;
      this.aP1[0] = peliccs.this.A719PrdNum;
      this.aP2[0] = peliccs.this.A3358CCStkLen;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliccs");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliccs__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A3358CCStkLen ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class peliccs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00MS2", "DELETE FROM TXPCCSTKS  WHERE EmprCod = ? and PrdNum = ? and CCStkLen = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

