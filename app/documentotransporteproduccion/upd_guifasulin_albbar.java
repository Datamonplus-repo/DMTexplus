package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upd_guifasulin_albbar extends GXProcedure
{
   public upd_guifasulin_albbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upd_guifasulin_albbar.class ), "" );
   }

   public upd_guifasulin_albbar( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 )
   {
      upd_guifasulin_albbar.this.AV8emprcod = aP0;
      upd_guifasulin_albbar.this.AV9albprocod = aP1;
      upd_guifasulin_albbar.this.AV10barcod = aP2;
      upd_guifasulin_albbar.this.AV11barcodreo = aP3;
      upd_guifasulin_albbar.this.AV12barcodpar = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AHE2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Long.valueOf(AV9albprocod), Integer.valueOf(AV10barcod), Byte.valueOf(AV11barcodreo), AV12barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AHE2_A396EmprCod[0] ;
         A30AlbProCod = P0AHE2_A30AlbProCod[0] ;
         A129BarCod = P0AHE2_A129BarCod[0] ;
         A132BarCodReo = P0AHE2_A132BarCodReo[0] ;
         A130BarCodPar = P0AHE2_A130BarCodPar[0] ;
         A1240GuiFasLin = P0AHE2_A1240GuiFasLin[0] ;
         AV13Guifaslin = A1240GuiFasLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P0AHE3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV13Guifaslin), AV8emprcod, Long.valueOf(AV9albprocod), Integer.valueOf(AV10barcod), Byte.valueOf(AV11barcodreo), AV12barcodpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.upd_guifasulin_albbar");
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
      P0AHE2_A396EmprCod = new String[] {""} ;
      P0AHE2_A30AlbProCod = new long[1] ;
      P0AHE2_A129BarCod = new int[1] ;
      P0AHE2_A132BarCodReo = new byte[1] ;
      P0AHE2_A130BarCodPar = new String[] {""} ;
      P0AHE2_A1240GuiFasLin = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.upd_guifasulin_albbar__default(),
         new Object[] {
             new Object[] {
            P0AHE2_A396EmprCod, P0AHE2_A30AlbProCod, P0AHE2_A129BarCod, P0AHE2_A132BarCodReo, P0AHE2_A130BarCodPar, P0AHE2_A1240GuiFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11barcodreo ;
   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short AV13Guifaslin ;
   private short A1248GuiFasULin ;
   private short Gx_err ;
   private int AV10barcod ;
   private int A129BarCod ;
   private long AV9albprocod ;
   private long A30AlbProCod ;
   private String AV8emprcod ;
   private String AV12barcodpar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHE2_A396EmprCod ;
   private long[] P0AHE2_A30AlbProCod ;
   private int[] P0AHE2_A129BarCod ;
   private byte[] P0AHE2_A132BarCodReo ;
   private String[] P0AHE2_A130BarCodPar ;
   private short[] P0AHE2_A1240GuiFasLin ;
}

final  class upd_guifasulin_albbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHE2", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AHE3", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

