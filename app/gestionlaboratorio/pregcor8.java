package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pregcor8 extends GXProcedure
{
   public pregcor8( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pregcor8.class ), "" );
   }

   public pregcor8( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          java.util.Date[] aP3 )
   {
      pregcor8.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             int[] aP4 )
   {
      pregcor8.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pregcor8.this.AV8Lb_numero = aP1[0];
      this.aP1 = aP1;
      pregcor8.this.AV12Lb_opcions = aP2[0];
      this.aP2 = aP2;
      pregcor8.this.AV10Lb_fechar = aP3[0];
      this.aP3 = aP3;
      pregcor8.this.AV11Clicod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n7012Lb_rcOpEnv = false ;
      n7010Lb_rcFecEn = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02PV2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n7012Lb_rcOpEnv), AV12Lb_opcions, Boolean.valueOf(n7010Lb_rcFecEn), AV10Lb_fechar, A396EmprCod, Integer.valueOf(AV11Clicod), Integer.valueOf(AV8Lb_numero)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pregcor8.this.A396EmprCod;
      this.aP1[0] = pregcor8.this.AV8Lb_numero;
      this.aP2[0] = pregcor8.this.AV12Lb_opcions;
      this.aP3[0] = pregcor8.this.AV10Lb_fechar;
      this.aP4[0] = pregcor8.this.AV11Clicod;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pregcor8");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A7012Lb_rcOpEnv = "" ;
      A7010Lb_rcFecEn = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pregcor8__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Lb_numero ;
   private int AV11Clicod ;
   private String A396EmprCod ;
   private String AV12Lb_opcions ;
   private String A7012Lb_rcOpEnv ;
   private java.util.Date AV10Lb_fechar ;
   private java.util.Date A7010Lb_rcFecEn ;
   private boolean n7012Lb_rcOpEnv ;
   private boolean n7010Lb_rcFecEn ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pregcor8__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02PV2", "UPDATE TXPREGCOR SET Lb_rcOpEnv=?, Lb_rcFecEn=?  WHERE (EmprCod = ? and CliCod = ?) AND (Lb_rcnens = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGCOR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
      }
   }

}

