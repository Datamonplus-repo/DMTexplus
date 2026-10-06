package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdetain extends GXProcedure
{
   public pdetain( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdetain.class ), "" );
   }

   public pdetain( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           short[] aP1 )
   {
      pdetain.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 )
   {
      pdetain.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdetain.this.A829TipArtCod = aP1[0];
      this.aP1 = aP1;
      pdetain.this.A583IntCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P03A42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod), Byte.valueOf(A583IntCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARINT");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdetain.this.A396EmprCod;
      this.aP1[0] = pdetain.this.A829TipArtCod;
      this.aP2[0] = pdetain.this.A583IntCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdetain");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdetain__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pdetain__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03A42", "DELETE FROM TXPTARINT  WHERE EmprCod = ? and TipArtCod = ? and IntCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTARINT")
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

