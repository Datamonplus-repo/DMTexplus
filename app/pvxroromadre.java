package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxroromadre extends GXProcedure
{
   public pvxroromadre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxroromadre.class ), "" );
   }

   public pvxroromadre( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 )
   {
      pvxroromadre.this.aP1 = new int[] {0};
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
      pvxroromadre.this.AV8BarPieCod = aP0;
      pvxroromadre.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9VxLotId = (int)(GXutil.lval( AV8BarPieCod)) ;
      /* Using cursor P05TD2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV9VxLotId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6224VxLotId = P05TD2_A6224VxLotId[0] ;
         A13202VxSteIdMad = P05TD2_A13202VxSteIdMad[0] ;
         n13202VxSteIdMad = P05TD2_n13202VxSteIdMad[0] ;
         AV10VxSteIdMadre = A13202VxSteIdMad ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxroromadre.this.AV10VxSteIdMadre;
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
      P05TD2_A6224VxLotId = new int[1] ;
      P05TD2_A13202VxSteIdMad = new int[1] ;
      P05TD2_n13202VxSteIdMad = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxroromadre__default(),
         new Object[] {
             new Object[] {
            P05TD2_A6224VxLotId, P05TD2_A13202VxSteIdMad, P05TD2_n13202VxSteIdMad
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10VxSteIdMadre ;
   private int AV9VxLotId ;
   private int A6224VxLotId ;
   private int A13202VxSteIdMad ;
   private String AV8BarPieCod ;
   private String scmdbuf ;
   private boolean n13202VxSteIdMad ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P05TD2_A6224VxLotId ;
   private int[] P05TD2_A13202VxSteIdMad ;
   private boolean[] P05TD2_n13202VxSteIdMad ;
}

final  class pvxroromadre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05TD2", "SELECT STeLotId, SteIdMadre FROM VTXSTKTE WHERE STeLotId = ? ORDER BY STeLotId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
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

