package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prepkil extends GXProcedure
{
   public prepkil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prepkil.class ), "" );
   }

   public prepkil( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      prepkil.this.aP2 = new long[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 )
   {
      prepkil.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prepkil.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      prepkil.this.AV22ContVal2 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22ContVal2 = 0 ;
      /* Using cursor P00822 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1147ContVal2 = P00822_A1147ContVal2[0] ;
         AV22ContVal2 = A1147ContVal2 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prepkil.this.A396EmprCod;
      this.aP1[0] = prepkil.this.A313ContCod;
      this.aP2[0] = prepkil.this.AV22ContVal2;
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
      P00822_A396EmprCod = new String[] {""} ;
      P00822_A313ContCod = new String[] {""} ;
      P00822_A1147ContVal2 = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prepkil__default(),
         new Object[] {
             new Object[] {
            P00822_A396EmprCod, P00822_A313ContCod, P00822_A1147ContVal2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV22ContVal2 ;
   private long A1147ContVal2 ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private long[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00822_A396EmprCod ;
   private String[] P00822_A313ContCod ;
   private long[] P00822_A1147ContVal2 ;
}

final  class prepkil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00822", "SELECT EmprCod, ContCod, ContVal2 FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

