package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusemplin extends GXProcedure
{
   public pbusemplin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusemplin.class ), "" );
   }

   public pbusemplin( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pbusemplin.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      pbusemplin.this.A396EmprCod = aP0;
      pbusemplin.this.A313ContCod = aP1;
      pbusemplin.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09LU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7208ContDsc2 = P09LU2_A7208ContDsc2[0] ;
         AV8ContDsc2 = GXutil.trim( A7208ContDsc2) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pbusemplin.this.AV8ContDsc2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ContDsc2 = "" ;
      scmdbuf = "" ;
      P09LU2_A396EmprCod = new String[] {""} ;
      P09LU2_A313ContCod = new String[] {""} ;
      P09LU2_A7208ContDsc2 = new String[] {""} ;
      A7208ContDsc2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusemplin__default(),
         new Object[] {
             new Object[] {
            P09LU2_A396EmprCod, P09LU2_A313ContCod, P09LU2_A7208ContDsc2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private String A7208ContDsc2 ;
   private String AV8ContDsc2 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LU2_A396EmprCod ;
   private String[] P09LU2_A313ContCod ;
   private String[] P09LU2_A7208ContDsc2 ;
}

final  class pbusemplin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LU2", "SELECT EmprCod, ContCod, ContDsc2 FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
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

