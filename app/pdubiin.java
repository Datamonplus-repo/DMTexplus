package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdubiin extends GXProcedure
{
   public pdubiin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdubiin.class ), "" );
   }

   public pdubiin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pdubiin.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pdubiin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdubiin.this.AV9Albreccod = aP1[0];
      this.aP1 = aP1;
      pdubiin.this.AV8Msg_err = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Msg_err = " " ;
      AV11Hay_p = (byte)(0) ;
      /* Using cursor P03YO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Albreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P03YO2_A44AlbRecCod[0] ;
         A9756Dis_CUb = P03YO2_A9756Dis_CUb[0] ;
         A361DisCod = P03YO2_A361DisCod[0] ;
         AV11Hay_p = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11Hay_p == 1 )
      {
         AV8Msg_err = httpContext.getMessage( "Atencion.Este N Recepcion", "") + GXutil.chr( (short)(13)) ;
         AV8Msg_err += httpContext.getMessage( "tiene PEDIDOS y estan Ubicados", "") + GXutil.chr( (short)(13)) ;
         AV8Msg_err += httpContext.getMessage( "NO es posible su Eliminacion", "") + GXutil.chr( (short)(13)) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Optimized DELETE. */
      /* Using cursor P03YO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9Albreccod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIIN");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdubiin.this.A396EmprCod;
      this.aP1[0] = pdubiin.this.AV9Albreccod;
      this.aP2[0] = pdubiin.this.AV8Msg_err;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdubiin");
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
      P03YO2_A396EmprCod = new String[] {""} ;
      P03YO2_A44AlbRecCod = new int[1] ;
      P03YO2_A9756Dis_CUb = new String[] {""} ;
      P03YO2_A361DisCod = new int[1] ;
      A9756Dis_CUb = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdubiin__default(),
         new Object[] {
             new Object[] {
            P03YO2_A396EmprCod, P03YO2_A44AlbRecCod, P03YO2_A9756Dis_CUb, P03YO2_A361DisCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Hay_p ;
   private short Gx_err ;
   private int AV9Albreccod ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String AV8Msg_err ;
   private String scmdbuf ;
   private String A9756Dis_CUb ;
   private boolean returnInSub ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03YO2_A396EmprCod ;
   private int[] P03YO2_A44AlbRecCod ;
   private String[] P03YO2_A9756Dis_CUb ;
   private int[] P03YO2_A361DisCod ;
}

final  class pdubiin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03YO2", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Dis_CUb, DisCod FROM TXPUBIOUT WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, Dis_CUb) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03YO3", "DELETE FROM TXPUBIIN  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIIN")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

