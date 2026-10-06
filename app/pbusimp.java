package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusimp extends GXProcedure
{
   public pbusimp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusimp.class ), "" );
   }

   public pbusimp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pbusimp.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pbusimp.this.A942TermCod = aP0[0];
      this.aP0 = aP0;
      pbusimp.this.AV17ImpUsu = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000B2 */
      pr_default.execute(0, new Object[] {A942TermCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A574ImpCod = P000B2_A574ImpCod[0] ;
         n574ImpCod = P000B2_n574ImpCod[0] ;
         AV17ImpUsu = A574ImpCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusimp.this.A942TermCod;
      this.aP1[0] = pbusimp.this.AV17ImpUsu;
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
      P000B2_A942TermCod = new String[] {""} ;
      P000B2_A574ImpCod = new String[] {""} ;
      P000B2_n574ImpCod = new boolean[] {false} ;
      A574ImpCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusimp__default(),
         new Object[] {
             new Object[] {
            P000B2_A942TermCod, P000B2_A574ImpCod, P000B2_n574ImpCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A942TermCod ;
   private String AV17ImpUsu ;
   private String scmdbuf ;
   private String A574ImpCod ;
   private boolean n574ImpCod ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P000B2_A942TermCod ;
   private String[] P000B2_A574ImpCod ;
   private boolean[] P000B2_n574ImpCod ;
}

final  class pbusimp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000B2", "SELECT TermCod, ImpCod FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 10);
               return;
      }
   }

}

