package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxrohrtej extends GXProcedure
{
   public pvxrohrtej( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxrohrtej.class ), "" );
   }

   public pvxrohrtej( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 )
   {
      pvxrohrtej.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 )
   {
      pvxrohrtej.this.AV8BarPieCod = aP0;
      pvxrohrtej.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9VxLotId = (int)(GXutil.lval( AV8BarPieCod)) ;
      /* Using cursor P05TC2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV9VxLotId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6224VxLotId = P05TC2_A6224VxLotId[0] ;
         A11686VxLotHRT = P05TC2_A11686VxLotHRT[0] ;
         n11686VxLotHRT = P05TC2_n11686VxLotHRT[0] ;
         AV10HRTej = (int)(GXutil.lval( GXutil.substring( A11686VxLotHRT, 1, 8))) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxrohrtej.this.AV10HRTej;
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
      P05TC2_A6224VxLotId = new int[1] ;
      P05TC2_A11686VxLotHRT = new String[] {""} ;
      P05TC2_n11686VxLotHRT = new boolean[] {false} ;
      A11686VxLotHRT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxrohrtej__default(),
         new Object[] {
             new Object[] {
            P05TC2_A6224VxLotId, P05TC2_A11686VxLotHRT, P05TC2_n11686VxLotHRT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10HRTej ;
   private int AV9VxLotId ;
   private int A6224VxLotId ;
   private String AV8BarPieCod ;
   private String scmdbuf ;
   private String A11686VxLotHRT ;
   private boolean n11686VxLotHRT ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P05TC2_A6224VxLotId ;
   private String[] P05TC2_A11686VxLotHRT ;
   private boolean[] P05TC2_n11686VxLotHRT ;
}

final  class pvxrohrtej__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05TC2", "SELECT STeLotId, STeHRTej FROM VTXSTKTE WHERE STeLotId = ? ORDER BY STeLotId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

