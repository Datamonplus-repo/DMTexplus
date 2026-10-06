package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pultncartaz extends GXProcedure
{
   public pultncartaz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pultncartaz.class ), "" );
   }

   public pultncartaz( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           int[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 )
   {
      pultncartaz.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pultncartaz.this.A396EmprCod = aP0;
      pultncartaz.this.A252CliCod = aP1;
      pultncartaz.this.AV14Lb_rclastn = aP2[0];
      this.aP2 = aP2;
      pultncartaz.this.AV15Lb_prox = aP3[0];
      this.aP3 = aP3;
      pultncartaz.this.aP4 = aP4;
      pultncartaz.this.AV18vctrl = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "&vctrl=", "")+GXutil.str( AV18vctrl, 1, 0) );
      if ( AV18vctrl == 2 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14Lb_rclastn = 0 ;
      AV15Lb_prox = 0 ;
      AV17Lb_cartaz = "" ;
      System.out.println( httpContext.getMessage( "&Lb_rclastn=", "")+GXutil.str( AV14Lb_rclastn, 6, 0) );
      System.out.println( httpContext.getMessage( "&Lb_prox=", "")+GXutil.str( AV15Lb_prox, 6, 0) );
      System.out.println( httpContext.getMessage( "&Lb_cartaz=", "")+AV17Lb_cartaz );
      System.out.println( httpContext.getMessage( "-------for each-----", "") );
      AV21GXLvl17 = (byte)(0) ;
      /* Using cursor P04GH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6934Lb_rcncar = P04GH2_A6934Lb_rcncar[0] ;
         n6934Lb_rcncar = P04GH2_n6934Lb_rcncar[0] ;
         A6930Lb_rclin = P04GH2_A6930Lb_rclin[0] ;
         AV21GXLvl17 = (byte)(1) ;
         AV16Lb_rcncar6 = GXutil.substring( A6934Lb_rcncar, 1, 6) ;
         AV14Lb_rclastn = (int)(GXutil.lval( AV16Lb_rcncar6)) ;
         System.out.println( httpContext.getMessage( "&Lb_rcncar6=", "")+AV16Lb_rcncar6 );
         System.out.println( httpContext.getMessage( "&Lb_rclastn=", "")+GXutil.str( AV14Lb_rclastn, 6, 0) );
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV21GXLvl17 == 0 )
      {
         AV18vctrl = (byte)(2) ;
      }
      if ( AV14Lb_rclastn > 0 )
      {
         AV18vctrl = (byte)(2) ;
         AV15Lb_prox = (int)(AV14Lb_rclastn+1) ;
         AV17Lb_cartaz = GXutil.trim( GXutil.str( AV15Lb_prox, 6, 0)) ;
         System.out.println( httpContext.getMessage( "&Lb_prox=", "")+GXutil.str( AV15Lb_prox, 6, 0) );
         System.out.println( httpContext.getMessage( "&Lb_cartaz=", "")+AV17Lb_cartaz );
         System.out.println( httpContext.getMessage( "&vctrl=", "")+GXutil.str( AV18vctrl, 1, 0) );
      }
      else
      {
         System.out.println( httpContext.getMessage( "&Lb_rclastn=", "")+GXutil.str( AV14Lb_rclastn, 6, 0) );
         AV18vctrl = (byte)(2) ;
         AV15Lb_prox = 1 ;
         AV17Lb_cartaz = GXutil.trim( GXutil.str( AV15Lb_prox, 6, 0)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pultncartaz.this.AV14Lb_rclastn;
      this.aP3[0] = pultncartaz.this.AV15Lb_prox;
      this.aP4[0] = pultncartaz.this.AV17Lb_cartaz;
      this.aP5[0] = pultncartaz.this.AV18vctrl;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Lb_cartaz = "" ;
      scmdbuf = "" ;
      P04GH2_A396EmprCod = new String[] {""} ;
      P04GH2_A252CliCod = new int[1] ;
      P04GH2_A6934Lb_rcncar = new String[] {""} ;
      P04GH2_n6934Lb_rcncar = new boolean[] {false} ;
      P04GH2_A6930Lb_rclin = new int[1] ;
      A6934Lb_rcncar = "" ;
      AV16Lb_rcncar6 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pultncartaz__default(),
         new Object[] {
             new Object[] {
            P04GH2_A396EmprCod, P04GH2_A252CliCod, P04GH2_A6934Lb_rcncar, P04GH2_n6934Lb_rcncar, P04GH2_A6930Lb_rclin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18vctrl ;
   private byte AV21GXLvl17 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV14Lb_rclastn ;
   private int AV15Lb_prox ;
   private int A6930Lb_rclin ;
   private String A396EmprCod ;
   private String AV17Lb_cartaz ;
   private String scmdbuf ;
   private String A6934Lb_rcncar ;
   private String AV16Lb_rcncar6 ;
   private boolean returnInSub ;
   private boolean n6934Lb_rcncar ;
   private byte[] aP5 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04GH2_A396EmprCod ;
   private int[] P04GH2_A252CliCod ;
   private String[] P04GH2_A6934Lb_rcncar ;
   private boolean[] P04GH2_n6934Lb_rcncar ;
   private int[] P04GH2_A6930Lb_rclin ;
}

final  class pultncartaz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04GH2", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rcncar, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, Lb_rcncar DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

