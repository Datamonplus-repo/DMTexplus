package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppreqf extends GXProcedure
{
   public ppreqf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreqf.class ), "" );
   }

   public ppreqf( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      ppreqf.this.aP2 = new String[] {""};
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
      ppreqf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppreqf.this.A764ProForCod = aP1[0];
      this.aP1 = aP1;
      ppreqf.this.AV8ProForFac = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ProForFac = httpContext.getMessage( "N", "") ;
      /* Using cursor P01RL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5465ProForFac = P01RL2_A5465ProForFac[0] ;
         n5465ProForFac = P01RL2_n5465ProForFac[0] ;
         AV8ProForFac = A5465ProForFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppreqf.this.A396EmprCod;
      this.aP1[0] = ppreqf.this.A764ProForCod;
      this.aP2[0] = ppreqf.this.AV8ProForFac;
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
      P01RL2_A396EmprCod = new String[] {""} ;
      P01RL2_A764ProForCod = new String[] {""} ;
      P01RL2_A5465ProForFac = new String[] {""} ;
      P01RL2_n5465ProForFac = new boolean[] {false} ;
      A5465ProForFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreqf__default(),
         new Object[] {
             new Object[] {
            P01RL2_A396EmprCod, P01RL2_A764ProForCod, P01RL2_A5465ProForFac, P01RL2_n5465ProForFac
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String AV8ProForFac ;
   private String scmdbuf ;
   private String A5465ProForFac ;
   private boolean n5465ProForFac ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01RL2_A396EmprCod ;
   private String[] P01RL2_A764ProForCod ;
   private String[] P01RL2_A5465ProForFac ;
   private boolean[] P01RL2_n5465ProForFac ;
}

final  class ppreqf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01RL2", "SELECT EmprCod, ProForCod, ProForFac FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

