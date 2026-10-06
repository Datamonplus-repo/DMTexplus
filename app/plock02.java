package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock02 extends GXProcedure
{
   public plock02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock02.class ), "" );
   }

   public plock02( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      plock02.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      plock02.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock02.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04592 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3093AlbDivTCod = P04592_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = P04592_n3093AlbDivTCod[0] ;
         AV8AlcDivTCod = A3093AlbDivTCod ;
         A3093AlbDivTCod = AV8AlcDivTCod ;
         n3093AlbDivTCod = false ;
         /* Using cursor P04593 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock02.this.A396EmprCod;
      this.aP1[0] = plock02.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock02");
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
      P04592_A396EmprCod = new String[] {""} ;
      P04592_A30AlbProCod = new long[1] ;
      P04592_A3093AlbDivTCod = new String[] {""} ;
      P04592_n3093AlbDivTCod = new boolean[] {false} ;
      A3093AlbDivTCod = "" ;
      AV8AlcDivTCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock02__default(),
         new Object[] {
             new Object[] {
            P04592_A396EmprCod, P04592_A30AlbProCod, P04592_A3093AlbDivTCod, P04592_n3093AlbDivTCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3093AlbDivTCod ;
   private String AV8AlcDivTCod ;
   private boolean n3093AlbDivTCod ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04592_A396EmprCod ;
   private long[] P04592_A30AlbProCod ;
   private String[] P04592_A3093AlbDivTCod ;
   private boolean[] P04592_n3093AlbDivTCod ;
}

final  class plock02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04592", "SELECT EmprCod, AlbProCod, AlbDivTCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04593", "UPDATE TXPCALPRD SET AlbDivTCod=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
      }
   }

}

