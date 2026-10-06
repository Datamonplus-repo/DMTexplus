package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrostablaens007 extends GXProcedure
{
   public registrostablaens007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrostablaens007.class ), "" );
   }

   public registrostablaens007( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      registrostablaens007.this.aP2 = new long[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 )
   {
      registrostablaens007.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      registrostablaens007.this.A6310Lb_TaAuxC = aP1[0];
      this.aP1 = aP1;
      registrostablaens007.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8NumeroRegistros = 0 ;
      /* Optimized group. */
      /* Using cursor P09A92 */
      pr_default.execute(0, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
      cV8NumeroRegistros = P09A92_AV8NumeroRegistros[0] ;
      pr_default.close(0);
      AV8NumeroRegistros = (long)(AV8NumeroRegistros+cV8NumeroRegistros*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = registrostablaens007.this.A396EmprCod;
      this.aP1[0] = registrostablaens007.this.A6310Lb_TaAuxC;
      this.aP2[0] = registrostablaens007.this.AV8NumeroRegistros;
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
      P09A92_AV8NumeroRegistros = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.registrostablaens007__default(),
         new Object[] {
             new Object[] {
            P09A92_AV8NumeroRegistros
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8NumeroRegistros ;
   private long cV8NumeroRegistros ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String scmdbuf ;
   private long[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P09A92_AV8NumeroRegistros ;
}

final  class registrostablaens007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A92", "SELECT COUNT(*) FROM TXPENS007 WHERE EmprCod = ? and Lb_TaAuxC = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

