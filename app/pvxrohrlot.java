package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxrohrlot extends GXProcedure
{
   public pvxrohrlot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxrohrlot.class ), "" );
   }

   public pvxrohrlot( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String[] aP1 )
   {
      pvxrohrlot.this.aP2 = new String[] {""};
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
      pvxrohrlot.this.AV8BarPieCod = aP0;
      pvxrohrlot.this.aP1 = aP1;
      pvxrohrlot.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9VxLotId = (int)(GXutil.lval( AV8BarPieCod)) ;
      /* Using cursor P05U82 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV9VxLotId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6224VxLotId = P05U82_A6224VxLotId[0] ;
         A6642VxLotTeLo = P05U82_A6642VxLotTeLo[0] ;
         n6642VxLotTeLo = P05U82_n6642VxLotTeLo[0] ;
         A13230VXTeLoDsc = P05U82_A13230VXTeLoDsc[0] ;
         n13230VXTeLoDsc = P05U82_n13230VXTeLoDsc[0] ;
         A13230VXTeLoDsc = P05U82_A13230VXTeLoDsc[0] ;
         n13230VXTeLoDsc = P05U82_n13230VXTeLoDsc[0] ;
         AV10VxLotTeLo = A6642VxLotTeLo ;
         AV11VXTeLoDsc = A13230VXTeLoDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxrohrlot.this.AV10VxLotTeLo;
      this.aP2[0] = pvxrohrlot.this.AV11VXTeLoDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10VxLotTeLo = "" ;
      AV11VXTeLoDsc = "" ;
      scmdbuf = "" ;
      P05U82_A6224VxLotId = new int[1] ;
      P05U82_A6642VxLotTeLo = new String[] {""} ;
      P05U82_n6642VxLotTeLo = new boolean[] {false} ;
      P05U82_A13230VXTeLoDsc = new String[] {""} ;
      P05U82_n13230VXTeLoDsc = new boolean[] {false} ;
      A6642VxLotTeLo = "" ;
      A13230VXTeLoDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxrohrlot__default(),
         new Object[] {
             new Object[] {
            P05U82_A6224VxLotId, P05U82_A6642VxLotTeLo, P05U82_n6642VxLotTeLo, P05U82_A13230VXTeLoDsc, P05U82_n13230VXTeLoDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9VxLotId ;
   private int A6224VxLotId ;
   private String AV8BarPieCod ;
   private String AV10VxLotTeLo ;
   private String AV11VXTeLoDsc ;
   private String scmdbuf ;
   private String A6642VxLotTeLo ;
   private String A13230VXTeLoDsc ;
   private boolean n6642VxLotTeLo ;
   private boolean n13230VXTeLoDsc ;
   private String[] aP2 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P05U82_A6224VxLotId ;
   private String[] P05U82_A6642VxLotTeLo ;
   private boolean[] P05U82_n6642VxLotTeLo ;
   private String[] P05U82_A13230VXTeLoDsc ;
   private boolean[] P05U82_n13230VXTeLoDsc ;
}

final  class pvxrohrlot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05U82", "SELECT T1.STeLotId, T1.TeLoCod AS VxLotTeLo, T2.TeLoDsc FROM (VTXSTKTE T1 LEFT JOIN VTXTELOTES T2 ON T2.TeLoCod = T1.TeLoCod) WHERE T1.STeLotId = ? ORDER BY T1.STeLotId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
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

