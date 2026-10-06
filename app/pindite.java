package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pindite extends GXProcedure
{
   public pindite( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pindite.class ), "" );
   }

   public pindite( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pindite.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pindite.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pindite.this.AV11Cod_mta = aP1[0];
      this.aP1 = aP1;
      pindite.this.AV9Dsc_Idtx = aP2[0];
      this.aP2 = aP2;
      pindite.this.Gx_mode = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Cod_Idtx = GXutil.trim( GXutil.str( AV11Cod_mta, 4, 0)) ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DLT", "")) == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P04Y42 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV8Cod_Idtx});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINDITE");
         /* End optimized DELETE. */
      }
      else
      {
         /*
            INSERT RECORD ON TABLE TXPINDITE

         */
         A10887Cod_Idtx = AV8Cod_Idtx ;
         A10888Dsc_Idtx = AV9Dsc_Idtx ;
         n10888Dsc_Idtx = false ;
         /* Using cursor P04Y43 */
         pr_default.execute(1, new Object[] {A396EmprCod, A10887Cod_Idtx, Boolean.valueOf(n10888Dsc_Idtx), A10888Dsc_Idtx});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINDITE");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n10888Dsc_Idtx = false ;
            /* Optimized UPDATE. */
            /* Using cursor P04Y44 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n10888Dsc_Idtx), AV9Dsc_Idtx, A396EmprCod, A10887Cod_Idtx});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINDITE");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pindite.this.A396EmprCod;
      this.aP1[0] = pindite.this.AV11Cod_mta;
      this.aP2[0] = pindite.this.AV9Dsc_Idtx;
      this.aP3[0] = pindite.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pindite");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Cod_Idtx = "" ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pindite__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11Cod_mta ;
   private short Gx_err ;
   private int GX_INS1451 ;
   private String A396EmprCod ;
   private String AV9Dsc_Idtx ;
   private String Gx_mode ;
   private String AV8Cod_Idtx ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String Gx_emsg ;
   private boolean n10888Dsc_Idtx ;
   private String[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pindite__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04Y42", "DELETE FROM TXPINDITE  WHERE EmprCod = ? and Cod_Idtx = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINDITE")
         ,new UpdateCursor("P04Y43", "INSERT INTO TXPINDITE(EmprCod, Cod_Idtx, Dsc_Idtx, Imp_Idtx) VALUES(?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINDITE")
         ,new UpdateCursor("P04Y44", "UPDATE TXPINDITE SET Dsc_Idtx=?  WHERE EmprCod = ? and Cod_Idtx = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINDITE")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 60);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 4);
               return;
      }
   }

}

