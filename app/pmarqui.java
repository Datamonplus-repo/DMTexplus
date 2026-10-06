package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmarqui extends GXProcedure
{
   public pmarqui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmarqui.class ), "" );
   }

   public pmarqui( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pmarqui.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pmarqui.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmarqui.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pmarqui.this.A7066CliMq = aP2[0];
      this.aP2 = aP2;
      pmarqui.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "NoOk", "") ;
      /* Using cursor P035Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n7066CliMq), A7066CliMq});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7065CliLMq = P035Q2_A7065CliLMq[0] ;
         Gx_msg = httpContext.getMessage( "OK", "") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmarqui.this.A396EmprCod;
      this.aP1[0] = pmarqui.this.A252CliCod;
      this.aP2[0] = pmarqui.this.A7066CliMq;
      this.aP3[0] = pmarqui.this.Gx_msg;
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
      P035Q2_A396EmprCod = new String[] {""} ;
      P035Q2_A252CliCod = new int[1] ;
      P035Q2_A7066CliMq = new String[] {""} ;
      P035Q2_n7066CliMq = new boolean[] {false} ;
      P035Q2_A7065CliLMq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmarqui__default(),
         new Object[] {
             new Object[] {
            P035Q2_A396EmprCod, P035Q2_A252CliCod, P035Q2_A7066CliMq, P035Q2_n7066CliMq, P035Q2_A7065CliLMq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A7065CliLMq ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A7066CliMq ;
   private String Gx_msg ;
   private String scmdbuf ;
   private boolean n7066CliMq ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P035Q2_A396EmprCod ;
   private int[] P035Q2_A252CliCod ;
   private String[] P035Q2_A7066CliMq ;
   private boolean[] P035Q2_n7066CliMq ;
   private short[] P035Q2_A7065CliLMq ;
}

final  class pmarqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P035Q2", "SELECT EmprCod, CliCod, CliMq, CliLMq FROM TXPCLIMQ WHERE EmprCod = ? and CliCod = ? and CliMq = ? ORDER BY EmprCod, CliCod, CliMq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 20);
               }
               return;
      }
   }

}

