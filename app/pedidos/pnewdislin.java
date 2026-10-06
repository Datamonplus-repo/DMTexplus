package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewdislin extends GXProcedure
{
   public pnewdislin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewdislin.class ), "" );
   }

   public pnewdislin( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      pnewdislin.this.AV10EmprCod = aP0;
      pnewdislin.this.AV8Discod = aP1;
      pnewdislin.this.AV9Procod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPDISLIN

      */
      A396EmprCod = AV10EmprCod ;
      A361DisCod = AV8Discod ;
      A758ProCod = AV9Procod ;
      A846UltFasLin = (short)(0) ;
      A5334DisFasApr = "" ;
      n5334DisFasApr = false ;
      A12143ProSts = (byte)(0) ;
      n12143ProSts = false ;
      A12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
      n12144ProStsFec = false ;
      /* Using cursor P045R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin), Boolean.valueOf(n5334DisFasApr), A5334DisFasApr, Boolean.valueOf(n12143ProSts), Byte.valueOf(A12143ProSts), Boolean.valueOf(n12144ProStsFec), A12144ProStsFec});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
      if ( (pr_default.getStatus(0) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.pnewdislin");
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
      A758ProCod = "" ;
      A5334DisFasApr = "" ;
      A12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.pnewdislin__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12143ProSts ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private int AV8Discod ;
   private int GX_INS38 ;
   private int A361DisCod ;
   private String AV10EmprCod ;
   private String AV9Procod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A5334DisFasApr ;
   private String Gx_emsg ;
   private java.util.Date A12144ProStsFec ;
   private boolean n5334DisFasApr ;
   private boolean n12143ProSts ;
   private boolean n12144ProStsFec ;
   private IDataStoreProvider pr_default ;
}

final  class pnewdislin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P045R2", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               return;
      }
   }

}

