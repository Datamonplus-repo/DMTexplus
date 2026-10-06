package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkproc extends GXProcedure
{
   public pkproc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkproc.class ), "" );
   }

   public pkproc( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pkproc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pkproc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkproc.this.A758ProCod = aP1[0];
      this.aP1 = aP1;
      pkproc.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Barpro = (byte)(0) ;
      Gx_msg = "" ;
      /* Using cursor P03J02 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A761ProFasLin = P03J02_A761ProFasLin[0] ;
         n761ProFasLin = P03J02_n761ProFasLin[0] ;
         A129BarCod = P03J02_A129BarCod[0] ;
         A132BarCodReo = P03J02_A132BarCodReo[0] ;
         A130BarCodPar = P03J02_A130BarCodPar[0] ;
         Gx_msg = httpContext.getMessage( "Atencion este Proceso esta en HDRS, Tabla BARPRO", "") + GXutil.newLine( ) + httpContext.getMessage( "No se puede eliminar ¡¡¡", "") ;
         AV9Barpro = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV9Barpro == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10Artlin = (byte)(0) ;
      /* Using cursor P03J03 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A8065Art_GrmA = P03J03_A8065Art_GrmA[0] ;
         n8065Art_GrmA = P03J03_n8065Art_GrmA[0] ;
         A252CliCod = P03J03_A252CliCod[0] ;
         A65ArtCod = P03J03_A65ArtCod[0] ;
         Gx_msg = httpContext.getMessage( "Atencion este Proceso esta en Articulos, Tabla ARTLIN", "") + GXutil.newLine( ) + httpContext.getMessage( "No se puede eliminar ¡¡¡", "") ;
         AV10Artlin = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV10Artlin == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P03J04 */
      pr_default.execute(2, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         /* Using cursor P03J05 */
         pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A774ProNumLin = P03J05_A774ProNumLin[0] ;
            /* Optimized DELETE. */
            /* Using cursor P03J06 */
            pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROFSA");
            /* End optimized DELETE. */
            /* Using cursor P03J07 */
            pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P03J08 */
         pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      Gx_msg = httpContext.getMessage( "Proceso Eliminado", "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkproc.this.A396EmprCod;
      this.aP1[0] = pkproc.this.A758ProCod;
      this.aP2[0] = pkproc.this.Gx_msg;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkproc");
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
      P03J02_A396EmprCod = new String[] {""} ;
      P03J02_A758ProCod = new String[] {""} ;
      P03J02_A761ProFasLin = new short[1] ;
      P03J02_n761ProFasLin = new boolean[] {false} ;
      P03J02_A129BarCod = new int[1] ;
      P03J02_A132BarCodReo = new byte[1] ;
      P03J02_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      P03J03_A396EmprCod = new String[] {""} ;
      P03J03_A758ProCod = new String[] {""} ;
      P03J03_A8065Art_GrmA = new short[1] ;
      P03J03_n8065Art_GrmA = new boolean[] {false} ;
      P03J03_A252CliCod = new int[1] ;
      P03J03_A65ArtCod = new String[] {""} ;
      A65ArtCod = "" ;
      P03J04_A396EmprCod = new String[] {""} ;
      P03J04_A758ProCod = new String[] {""} ;
      P03J05_A396EmprCod = new String[] {""} ;
      P03J05_A758ProCod = new String[] {""} ;
      P03J05_A774ProNumLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkproc__default(),
         new Object[] {
             new Object[] {
            P03J02_A396EmprCod, P03J02_A758ProCod, P03J02_A761ProFasLin, P03J02_n761ProFasLin, P03J02_A129BarCod, P03J02_A132BarCodReo, P03J02_A130BarCodPar
            }
            , new Object[] {
            P03J03_A396EmprCod, P03J03_A758ProCod, P03J03_A8065Art_GrmA, P03J03_n8065Art_GrmA, P03J03_A252CliCod, P03J03_A65ArtCod
            }
            , new Object[] {
            P03J04_A396EmprCod, P03J04_A758ProCod
            }
            , new Object[] {
            P03J05_A396EmprCod, P03J05_A758ProCod, P03J05_A774ProNumLin
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

   private byte AV9Barpro ;
   private byte A132BarCodReo ;
   private byte AV10Artlin ;
   private short A761ProFasLin ;
   private short A8065Art_GrmA ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A65ArtCod ;
   private boolean n761ProFasLin ;
   private boolean returnInSub ;
   private boolean n8065Art_GrmA ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03J02_A396EmprCod ;
   private String[] P03J02_A758ProCod ;
   private short[] P03J02_A761ProFasLin ;
   private boolean[] P03J02_n761ProFasLin ;
   private int[] P03J02_A129BarCod ;
   private byte[] P03J02_A132BarCodReo ;
   private String[] P03J02_A130BarCodPar ;
   private String[] P03J03_A396EmprCod ;
   private String[] P03J03_A758ProCod ;
   private short[] P03J03_A8065Art_GrmA ;
   private boolean[] P03J03_n8065Art_GrmA ;
   private int[] P03J03_A252CliCod ;
   private String[] P03J03_A65ArtCod ;
   private String[] P03J04_A396EmprCod ;
   private String[] P03J04_A758ProCod ;
   private String[] P03J05_A396EmprCod ;
   private String[] P03J05_A758ProCod ;
   private short[] P03J05_A774ProNumLin ;
}

final  class pkproc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03J02", "SELECT EmprCod, ProCod, ProFasLin, BarCod, BarCodReo, BarCodPar FROM TXPBARPRO WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03J03", "SELECT EmprCod, ProCod, Art_GrmA, CliCod, ArtCod FROM TXPARTLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03J04", "SELECT EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03J05", "SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03J06", "DELETE FROM TXPPROFSA  WHERE EmprCod = ? and ProCod = ? and ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROFSA")
         ,new UpdateCursor("P03J07", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new UpdateCursor("P03J08", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

