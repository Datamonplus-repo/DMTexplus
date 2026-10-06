package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_insupd extends GXProcedure
{
   public tpromd_insupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_insupd.class ), "" );
   }

   public tpromd_insupd( int remoteHandle ,
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
      tpromd_insupd.this.A396EmprCod = aP0;
      tpromd_insupd.this.A252CliCod = aP1;
      tpromd_insupd.this.AV8Pmdcod = aP2;
      tpromd_insupd.this.AV9Pmddsc = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12GXLvl3 = (byte)(0) ;
      n8392PMDDsc = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AN02 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n8392PMDDsc), AV9Pmddsc, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(AV8Pmdcod)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV12GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
      /* End optimized UPDATE. */
      if ( AV12GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPProMD

         */
         A8391PMDCod = AV8Pmdcod ;
         A8392PMDDsc = AV9Pmddsc ;
         n8392PMDDsc = false ;
         /* Using cursor P0AN03 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Boolean.valueOf(n8392PMDDsc), A8392PMDDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpromd_insupd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A8392PMDDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_insupd__default(),
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

   private byte AV12GXLvl3 ;
   private short AV8Pmdcod ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int GX_INS1158 ;
   private String A396EmprCod ;
   private String AV9Pmddsc ;
   private String A8392PMDDsc ;
   private String Gx_emsg ;
   private boolean n8392PMDDsc ;
   private IDataStoreProvider pr_default ;
}

final  class tpromd_insupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AN02", "UPDATE TXPProMD SET PMDDsc=?  WHERE EmprCod = ? and CliCod = ? and PMDCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD")
         ,new UpdateCursor("P0AN03", "INSERT INTO TXPProMD(EmprCod, CliCod, PMDCod, PMDDsc, PMDUltCon) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD")
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
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 1 :
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
               return;
      }
   }

}

