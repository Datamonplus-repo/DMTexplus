package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class instablapromd extends GXProcedure
{
   public instablapromd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( instablapromd.class ), "" );
   }

   public instablapromd( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 )
   {
      instablapromd.this.AV11Emprcod = aP0;
      instablapromd.this.AV8Clicod = aP1;
      instablapromd.this.AV9PMDCod = aP2;
      instablapromd.this.AV10PMDDsc = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPProMD

      */
      A396EmprCod = AV11Emprcod ;
      A252CliCod = AV8Clicod ;
      A8391PMDCod = AV9PMDCod ;
      A8392PMDDsc = AV10PMDDsc ;
      n8392PMDDsc = false ;
      A8529PMDUltCon = 0 ;
      n8529PMDUltCon = false ;
      /* Using cursor P0A8J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Boolean.valueOf(n8392PMDDsc), A8392PMDDsc, Boolean.valueOf(n8529PMDUltCon), Integer.valueOf(A8529PMDUltCon)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n8392PMDDsc = false ;
         /* Optimized UPDATE. */
         /* Using cursor P0A8J3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n8392PMDDsc), AV10PMDDsc, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.instablapromd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A8392PMDDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.instablapromd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9PMDCod ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int GX_INS1158 ;
   private int A252CliCod ;
   private int A8529PMDUltCon ;
   private String AV11Emprcod ;
   private String AV10PMDDsc ;
   private String A396EmprCod ;
   private String A8392PMDDsc ;
   private String Gx_emsg ;
   private boolean n8392PMDDsc ;
   private boolean n8529PMDUltCon ;
   private IDataStoreProvider pr_default ;
}

final  class instablapromd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A8J2", "INSERT INTO TXPProMD(EmprCod, CliCod, PMDCod, PMDDsc, PMDUltCon) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD")
         ,new UpdateCursor("P0A8J3", "UPDATE TXPProMD SET PMDDsc=?  WHERE EmprCod = ? and CliCod = ? and PMDCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

