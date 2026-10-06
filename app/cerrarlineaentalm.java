package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cerrarlineaentalm extends GXProcedure
{
   public cerrarlineaentalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cerrarlineaentalm.class ), "" );
   }

   public cerrarlineaentalm( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      cerrarlineaentalm.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      cerrarlineaentalm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      cerrarlineaentalm.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      cerrarlineaentalm.this.A597LinEnt = aP2[0];
      this.aP2 = aP2;
      cerrarlineaentalm.this.AV8EntPedCum = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P09QQ2 */
      pr_default.execute(0, new Object[] {AV8EntPedCum, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = cerrarlineaentalm.this.A396EmprCod;
      this.aP1[0] = cerrarlineaentalm.this.A719PrdNum;
      this.aP2[0] = cerrarlineaentalm.this.A597LinEnt;
      this.aP3[0] = cerrarlineaentalm.this.AV8EntPedCum;
      Application.commitDataStores(context, remoteHandle, pr_default, "cerrarlineaentalm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A3404EntPedCum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cerrarlineaentalm__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A597LinEnt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8EntPedCum ;
   private String A3404EntPedCum ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class cerrarlineaentalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09QQ2", "UPDATE TXPENTALM SET EntPedCum=?  WHERE EmprCod = ? and PrdNum = ? and LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

