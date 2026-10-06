package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppvolmd extends GXProcedure
{
   public ppvolmd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppvolmd.class ), "" );
   }

   public ppvolmd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      ppvolmd.this.aP2 = new int[] {0};
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
      ppvolmd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppvolmd.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      ppvolmd.this.AV8Maqvolmax = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Maqvolmax = 0 ;
      /* Using cursor P03DQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A624MaqVolMed = P03DQ2_A624MaqVolMed[0] ;
         n624MaqVolMed = P03DQ2_n624MaqVolMed[0] ;
         AV8Maqvolmax = A624MaqVolMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppvolmd.this.A396EmprCod;
      this.aP1[0] = ppvolmd.this.A602MaqCod;
      this.aP2[0] = ppvolmd.this.AV8Maqvolmax;
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
      P03DQ2_A396EmprCod = new String[] {""} ;
      P03DQ2_A602MaqCod = new String[] {""} ;
      P03DQ2_A624MaqVolMed = new int[1] ;
      P03DQ2_n624MaqVolMed = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppvolmd__default(),
         new Object[] {
             new Object[] {
            P03DQ2_A396EmprCod, P03DQ2_A602MaqCod, P03DQ2_A624MaqVolMed, P03DQ2_n624MaqVolMed
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Maqvolmax ;
   private int A624MaqVolMed ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private boolean n624MaqVolMed ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03DQ2_A396EmprCod ;
   private String[] P03DQ2_A602MaqCod ;
   private int[] P03DQ2_A624MaqVolMed ;
   private boolean[] P03DQ2_n624MaqVolMed ;
}

final  class ppvolmd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DQ2", "SELECT EmprCod, MaqCod, MaqVolMed FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

