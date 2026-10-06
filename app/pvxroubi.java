package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxroubi extends GXProcedure
{
   public pvxroubi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxroubi.class ), "" );
   }

   public pvxroubi( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String[] aP1 )
   {
      pvxroubi.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pvxroubi.this.AV15BarPieCod = aP0;
      pvxroubi.this.aP1 = aP1;
      pvxroubi.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16VxLotId = (int)(GXutil.lval( AV15BarPieCod)) ;
      AV13VxAlmCod = "" ;
      AV14VxAlmUbi = "" ;
      /* Using cursor P05DR2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV16VxLotId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6224VxLotId = P05DR2_A6224VxLotId[0] ;
         A12248VxAlmCod = P05DR2_A12248VxAlmCod[0] ;
         n12248VxAlmCod = P05DR2_n12248VxAlmCod[0] ;
         A12249VxAlmUbi = P05DR2_A12249VxAlmUbi[0] ;
         n12249VxAlmUbi = P05DR2_n12249VxAlmUbi[0] ;
         AV13VxAlmCod = A12248VxAlmCod ;
         AV14VxAlmUbi = A12249VxAlmUbi ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxroubi.this.AV13VxAlmCod;
      this.aP2[0] = pvxroubi.this.AV14VxAlmUbi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13VxAlmCod = "" ;
      AV14VxAlmUbi = "" ;
      scmdbuf = "" ;
      P05DR2_A6224VxLotId = new int[1] ;
      P05DR2_A12248VxAlmCod = new String[] {""} ;
      P05DR2_n12248VxAlmCod = new boolean[] {false} ;
      P05DR2_A12249VxAlmUbi = new String[] {""} ;
      P05DR2_n12249VxAlmUbi = new boolean[] {false} ;
      A12248VxAlmCod = "" ;
      A12249VxAlmUbi = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxroubi__default(),
         new Object[] {
             new Object[] {
            P05DR2_A6224VxLotId, P05DR2_A12248VxAlmCod, P05DR2_n12248VxAlmCod, P05DR2_A12249VxAlmUbi, P05DR2_n12249VxAlmUbi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16VxLotId ;
   private int A6224VxLotId ;
   private String AV15BarPieCod ;
   private String AV13VxAlmCod ;
   private String AV14VxAlmUbi ;
   private String scmdbuf ;
   private String A12248VxAlmCod ;
   private String A12249VxAlmUbi ;
   private boolean n12248VxAlmCod ;
   private boolean n12249VxAlmUbi ;
   private String[] aP2 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P05DR2_A6224VxLotId ;
   private String[] P05DR2_A12248VxAlmCod ;
   private boolean[] P05DR2_n12248VxAlmCod ;
   private String[] P05DR2_A12249VxAlmUbi ;
   private boolean[] P05DR2_n12249VxAlmUbi ;
}

final  class pvxroubi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05DR2", "SELECT STeLotId, AlmCod, AlmUbi FROM VTXSTKTE WHERE STeLotId = ? ORDER BY STeLotId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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

