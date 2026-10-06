package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdscmat extends GXProcedure
{
   public pdscmat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdscmat.class ), "" );
   }

   public pdscmat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pdscmat.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pdscmat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdscmat.this.A626MatCod = aP1[0];
      this.aP1 = aP1;
      pdscmat.this.AV9MatDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01QL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A626MatCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A627MatDsc = P01QL2_A627MatDsc[0] ;
         n627MatDsc = P01QL2_n627MatDsc[0] ;
         AV9MatDsc = A627MatDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdscmat.this.A396EmprCod;
      this.aP1[0] = pdscmat.this.A626MatCod;
      this.aP2[0] = pdscmat.this.AV9MatDsc;
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
      P01QL2_A396EmprCod = new String[] {""} ;
      P01QL2_A626MatCod = new short[1] ;
      P01QL2_A627MatDsc = new String[] {""} ;
      P01QL2_n627MatDsc = new boolean[] {false} ;
      A627MatDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdscmat__default(),
         new Object[] {
             new Object[] {
            P01QL2_A396EmprCod, P01QL2_A626MatCod, P01QL2_A627MatDsc, P01QL2_n627MatDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A626MatCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9MatDsc ;
   private String scmdbuf ;
   private String A627MatDsc ;
   private boolean n627MatDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01QL2_A396EmprCod ;
   private short[] P01QL2_A626MatCod ;
   private String[] P01QL2_A627MatDsc ;
   private boolean[] P01QL2_n627MatDsc ;
}

final  class pdscmat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01QL2", "SELECT EmprCod, MatCod, MatDsc FROM TXPMATICE WHERE EmprCod = ? and MatCod = ? ORDER BY EmprCod, MatCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

