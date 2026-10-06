package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppvolmn extends GXProcedure
{
   public ppvolmn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppvolmn.class ), "" );
   }

   public ppvolmn( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      ppvolmn.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      ppvolmn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppvolmn.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      ppvolmn.this.AV8Maqvolmax = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Maqvolmax = 0 ;
      /* Using cursor P03DP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A625MaqVolMin = P03DP2_A625MaqVolMin[0] ;
         n625MaqVolMin = P03DP2_n625MaqVolMin[0] ;
         AV8Maqvolmax = A625MaqVolMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppvolmn.this.A396EmprCod;
      this.aP1[0] = ppvolmn.this.A602MaqCod;
      this.aP2[0] = ppvolmn.this.AV8Maqvolmax;
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
      P03DP2_A396EmprCod = new String[] {""} ;
      P03DP2_A602MaqCod = new String[] {""} ;
      P03DP2_A625MaqVolMin = new int[1] ;
      P03DP2_n625MaqVolMin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppvolmn__default(),
         new Object[] {
             new Object[] {
            P03DP2_A396EmprCod, P03DP2_A602MaqCod, P03DP2_A625MaqVolMin, P03DP2_n625MaqVolMin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Maqvolmax ;
   private int A625MaqVolMin ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private boolean n625MaqVolMin ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03DP2_A396EmprCod ;
   private String[] P03DP2_A602MaqCod ;
   private int[] P03DP2_A625MaqVolMin ;
   private boolean[] P03DP2_n625MaqVolMin ;
}

final  class ppvolmn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DP2", "SELECT EmprCod, MaqCod, MaqVolMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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

