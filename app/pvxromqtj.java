package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxromqtj extends GXProcedure
{
   public pvxromqtj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxromqtj.class ), "" );
   }

   public pvxromqtj( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      pvxromqtj.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      pvxromqtj.this.AV9BarPieCod = aP0;
      pvxromqtj.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10VxLotId = (int)(GXutil.lval( AV9BarPieCod)) ;
      /* Using cursor P05PP2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV10VxLotId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6224VxLotId = P05PP2_A6224VxLotId[0] ;
         A6643VxLotMaqT = P05PP2_A6643VxLotMaqT[0] ;
         n6643VxLotMaqT = P05PP2_n6643VxLotMaqT[0] ;
         AV8MaqCod = A6643VxLotMaqT ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxromqtj.this.AV8MaqCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8MaqCod = "" ;
      scmdbuf = "" ;
      P05PP2_A6224VxLotId = new int[1] ;
      P05PP2_A6643VxLotMaqT = new String[] {""} ;
      P05PP2_n6643VxLotMaqT = new boolean[] {false} ;
      A6643VxLotMaqT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxromqtj__default(),
         new Object[] {
             new Object[] {
            P05PP2_A6224VxLotId, P05PP2_A6643VxLotMaqT, P05PP2_n6643VxLotMaqT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10VxLotId ;
   private int A6224VxLotId ;
   private String AV9BarPieCod ;
   private String AV8MaqCod ;
   private String scmdbuf ;
   private String A6643VxLotMaqT ;
   private boolean n6643VxLotMaqT ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P05PP2_A6224VxLotId ;
   private String[] P05PP2_A6643VxLotMaqT ;
   private boolean[] P05PP2_n6643VxLotMaqT ;
}

final  class pvxromqtj__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PP2", "SELECT STeLotId, SteMaqTej FROM VTXSTKTE WHERE STeLotId = ? ORDER BY STeLotId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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

