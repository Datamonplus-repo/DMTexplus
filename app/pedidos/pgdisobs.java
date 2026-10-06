package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgdisobs extends GXProcedure
{
   public pgdisobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgdisobs.class ), "" );
   }

   public pgdisobs( int remoteHandle ,
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
      pgdisobs.this.A396EmprCod = aP0;
      pgdisobs.this.A361DisCod = aP1;
      pgdisobs.this.AV8vObs = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00LZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A378DisObsULin = P00LZ2_A378DisObsULin[0] ;
         AV9DisObsULin = (short)(A378DisObsULin+1) ;
         if ( AV9DisObsULin > 9 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo de lineas permitido, 9", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P00LZ3 */
            pr_default.execute(1, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            if (true) break;
         }
         A378DisObsULin = (byte)(A378DisObsULin+1) ;
         /*
            INSERT RECORD ON TABLE TXPOBSERV

         */
         A376DisObsLin = A378DisObsULin ;
         A377DisObsTxt = AV8vObs ;
         /* Using cursor P00LZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Optimized UPDATE. */
            /* Using cursor P00LZ5 */
            pr_default.execute(3, new Object[] {AV8vObs, A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /* Using cursor P00LZ6 */
         pr_default.execute(4, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.pgdisobs");
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
      P00LZ2_A396EmprCod = new String[] {""} ;
      P00LZ2_A361DisCod = new int[1] ;
      P00LZ2_A378DisObsULin = new byte[1] ;
      A377DisObsTxt = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.pgdisobs__default(),
         new Object[] {
             new Object[] {
            P00LZ2_A396EmprCod, P00LZ2_A361DisCod, P00LZ2_A378DisObsULin
            }
            , new Object[] {
            }
            , new Object[] {
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

   private byte A378DisObsULin ;
   private byte A376DisObsLin ;
   private short AV9DisObsULin ;
   private short Gx_err ;
   private int A361DisCod ;
   private int GX_INS40 ;
   private String A396EmprCod ;
   private String AV8vObs ;
   private String scmdbuf ;
   private String A377DisObsTxt ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
   private String[] P00LZ2_A396EmprCod ;
   private int[] P00LZ2_A361DisCod ;
   private byte[] P00LZ2_A378DisObsULin ;
}

final  class pgdisobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00LZ2", "SELECT EmprCod, DisCod, DisObsULin FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00LZ3", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P00LZ4", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P00LZ5", "UPDATE TXPOBSERV SET DisObsTxt=?  WHERE EmprCod = ? and DisCod = ? and DisObsLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P00LZ6", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

