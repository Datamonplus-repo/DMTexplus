package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pregcor4 extends GXProcedure
{
   public pregcor4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pregcor4.class ), "" );
   }

   public pregcor4( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 )
   {
      pregcor4.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      pregcor4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pregcor4.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pregcor4.this.AV12Lb_rclastn = aP2[0];
      this.aP2 = aP2;
      pregcor4.this.AV13Lb_prox = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Lb_rclastn = 0 ;
      AV13Lb_prox = 0 ;
      /* Using cursor P02PJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6934Lb_rcncar = P02PJ2_A6934Lb_rcncar[0] ;
         n6934Lb_rcncar = P02PJ2_n6934Lb_rcncar[0] ;
         A6930Lb_rclin = P02PJ2_A6930Lb_rclin[0] ;
         AV14Lb_rcncar6 = GXutil.substring( A6934Lb_rcncar, 1, 6) ;
         AV12Lb_rclastn = (int)(GXutil.lval( AV14Lb_rcncar6)) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV12Lb_rclastn > 0 )
      {
         AV13Lb_prox = (int)(AV12Lb_rclastn+1) ;
         Gx_msg = httpContext.getMessage( "&Lb_prox=", "") + GXutil.str( AV13Lb_prox, 6, 0) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pregcor4.this.A396EmprCod;
      this.aP1[0] = pregcor4.this.A252CliCod;
      this.aP2[0] = pregcor4.this.AV12Lb_rclastn;
      this.aP3[0] = pregcor4.this.AV13Lb_prox;
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
      P02PJ2_A396EmprCod = new String[] {""} ;
      P02PJ2_A252CliCod = new int[1] ;
      P02PJ2_A6934Lb_rcncar = new String[] {""} ;
      P02PJ2_n6934Lb_rcncar = new boolean[] {false} ;
      P02PJ2_A6930Lb_rclin = new int[1] ;
      A6934Lb_rcncar = "" ;
      AV14Lb_rcncar6 = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pregcor4__default(),
         new Object[] {
             new Object[] {
            P02PJ2_A396EmprCod, P02PJ2_A252CliCod, P02PJ2_A6934Lb_rcncar, P02PJ2_n6934Lb_rcncar, P02PJ2_A6930Lb_rclin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV12Lb_rclastn ;
   private int AV13Lb_prox ;
   private int A6930Lb_rclin ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A6934Lb_rcncar ;
   private String AV14Lb_rcncar6 ;
   private String Gx_msg ;
   private boolean n6934Lb_rcncar ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02PJ2_A396EmprCod ;
   private int[] P02PJ2_A252CliCod ;
   private String[] P02PJ2_A6934Lb_rcncar ;
   private boolean[] P02PJ2_n6934Lb_rcncar ;
   private int[] P02PJ2_A6930Lb_rclin ;
}

final  class pregcor4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PJ2", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rcncar, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, Lb_rcncar DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(4);
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
               return;
      }
   }

}

