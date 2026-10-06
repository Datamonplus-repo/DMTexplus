package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pregcor7 extends GXProcedure
{
   public pregcor7( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pregcor7.class ), "" );
   }

   public pregcor7( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        int aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             int aP4 ,
                             String aP5 )
   {
      pregcor7.this.AV13EmprCod = aP0;
      pregcor7.this.AV8Lb_numero = aP1;
      pregcor7.this.AV9Lb_Opcion = aP2;
      pregcor7.this.AV10Lb_fechar = aP3;
      pregcor7.this.AV11Clicod = aP4;
      pregcor7.this.AV12Lb_ProvDef = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n8022Lb_rcProDe = false ;
      n7013Lb_rcOpApr = false ;
      n7011Lb_rcFecRe = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02Q92 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n8022Lb_rcProDe), AV12Lb_ProvDef, Boolean.valueOf(n7013Lb_rcOpApr), AV9Lb_Opcion, Boolean.valueOf(n7011Lb_rcFecRe), AV10Lb_fechar, AV13EmprCod, Integer.valueOf(AV11Clicod), Integer.valueOf(AV8Lb_numero)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pregcor7");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A8022Lb_rcProDe = "" ;
      A7013Lb_rcOpApr = "" ;
      A7011Lb_rcFecRe = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pregcor7__default(),
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
   private String AV13EmprCod ;
   private String AV9Lb_Opcion ;
   private String AV12Lb_ProvDef ;
   private String A8022Lb_rcProDe ;
   private String A7013Lb_rcOpApr ;
   private java.util.Date AV10Lb_fechar ;
   private java.util.Date A7011Lb_rcFecRe ;
   private boolean n8022Lb_rcProDe ;
   private boolean n7013Lb_rcOpApr ;
   private boolean n7011Lb_rcFecRe ;
   private IDataStoreProvider pr_default ;
}

final  class pregcor7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02Q92", "UPDATE TXPREGCOR SET Lb_rcProDe=?, Lb_rcOpApr=?, Lb_rcFecRe=?  WHERE (EmprCod = ? and CliCod = ?) AND (Lb_rcnens = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGCOR")
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
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setInt(6, ((Number) parms[8]).intValue());
               return;
      }
   }

}

