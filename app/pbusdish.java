package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusdish extends GXProcedure
{
   public pbusdish( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusdish.class ), "" );
   }

   public pbusdish( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pbusdish.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pbusdish.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusdish.this.A4718DishCod = aP1[0];
      this.aP1 = aP1;
      pbusdish.this.AV15DishDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01C12 */
      pr_default.execute(0, new Object[] {A396EmprCod, A4718DishCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4719DishDsc = P01C12_A4719DishDsc[0] ;
         n4719DishDsc = P01C12_n4719DishDsc[0] ;
         AV15DishDsc = A4719DishDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusdish.this.A396EmprCod;
      this.aP1[0] = pbusdish.this.A4718DishCod;
      this.aP2[0] = pbusdish.this.AV15DishDsc;
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
      P01C12_A396EmprCod = new String[] {""} ;
      P01C12_A4718DishCod = new String[] {""} ;
      P01C12_A4719DishDsc = new String[] {""} ;
      P01C12_n4719DishDsc = new boolean[] {false} ;
      A4719DishDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusdish__default(),
         new Object[] {
             new Object[] {
            P01C12_A396EmprCod, P01C12_A4718DishCod, P01C12_A4719DishDsc, P01C12_n4719DishDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A4718DishCod ;
   private String AV15DishDsc ;
   private String scmdbuf ;
   private String A4719DishDsc ;
   private boolean n4719DishDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01C12_A396EmprCod ;
   private String[] P01C12_A4718DishCod ;
   private String[] P01C12_A4719DishDsc ;
   private boolean[] P01C12_n4719DishDsc ;
}

final  class pbusdish__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01C12", "SELECT EmprCod, DishCod, DishDsc FROM TXPDISENH WHERE EmprCod = ? and DishCod = ? ORDER BY EmprCod, DishCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 12);
               return;
      }
   }

}

