package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class insobserva extends GXProcedure
{
   public insobserva( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( insobserva.class ), "" );
   }

   public insobserva( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      insobserva.this.A396EmprCod = aP0;
      insobserva.this.AV10Discod = aP1;
      insobserva.this.AV13DisObslin = aP2;
      insobserva.this.AV14DisObsTxt = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17GXLvl2 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0A8A2 */
      pr_default.execute(0, new Object[] {AV14DisObsTxt, A396EmprCod, Integer.valueOf(AV10Discod), Byte.valueOf(AV13DisObslin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV17GXLvl2 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
      /* End optimized UPDATE. */
      if ( AV17GXLvl2 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPOBSERV

         */
         A361DisCod = AV10Discod ;
         A376DisObsLin = AV13DisObslin ;
         A377DisObsTxt = AV14DisObsTxt ;
         /* Using cursor P0A8A3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.insobserva");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A377DisObsTxt = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.insobserva__default(),
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

   private byte AV13DisObslin ;
   private byte AV17GXLvl2 ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV10Discod ;
   private int GX_INS40 ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String AV14DisObsTxt ;
   private String A377DisObsTxt ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class insobserva__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A8A2", "UPDATE TXPOBSERV SET DisObsTxt=?  WHERE EmprCod = ? and DisCod = ? and DisObsLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P0A8A3", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
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
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
      }
   }

}

