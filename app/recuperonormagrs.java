package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuperonormagrs extends GXProcedure
{
   public recuperonormagrs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuperonormagrs.class ), "" );
   }

   public recuperonormagrs( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      recuperonormagrs.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      recuperonormagrs.this.A396EmprCod = aP0;
      recuperonormagrs.this.A361DisCod = aP1;
      recuperonormagrs.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P092S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13213DisNormID = P092S2_A13213DisNormID[0] ;
         A13214DisNormSt = P092S2_A13214DisNormSt[0] ;
         AV9BarGrs = ((GXutil.strcmp(A13214DisNormSt, "S")==0) ? "SIM" : "NAO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = recuperonormagrs.this.AV9BarGrs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9BarGrs = "" ;
      scmdbuf = "" ;
      P092S2_A396EmprCod = new String[] {""} ;
      P092S2_A361DisCod = new int[1] ;
      P092S2_A13213DisNormID = new String[] {""} ;
      P092S2_A13214DisNormSt = new String[] {""} ;
      A13213DisNormID = "" ;
      A13214DisNormSt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuperonormagrs__default(),
         new Object[] {
             new Object[] {
            P092S2_A396EmprCod, P092S2_A361DisCod, P092S2_A13213DisNormID, P092S2_A13214DisNormSt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String AV9BarGrs ;
   private String scmdbuf ;
   private String A13213DisNormID ;
   private String A13214DisNormSt ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P092S2_A396EmprCod ;
   private int[] P092S2_A361DisCod ;
   private String[] P092S2_A13213DisNormID ;
   private String[] P092S2_A13214DisNormSt ;
}

final  class recuperonormagrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P092S2", "SELECT EmprCod, DisCod, DisNormID, DisNormSt FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? and DisNormID = 'GRS' ORDER BY EmprCod, DisCod, DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

