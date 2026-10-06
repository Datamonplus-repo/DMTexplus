package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminaciondocumento extends GXProcedure
{
   public eliminaciondocumento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminaciondocumento.class ), "" );
   }

   public eliminaciondocumento( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             long aP1 )
   {
      eliminaciondocumento.this.AV8EmprCod = aP0;
      eliminaciondocumento.this.AV9AlbProCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      eliminaciondocumento.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = AV8EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      eliminaciondocumento.this.AV8EmprCod = GXv_char2[0] ;
      eliminaciondocumento.this.AV11EmprNom = GXv_char3[0] ;
      eliminaciondocumento.this.AV12UsurCod = GXv_char4[0] ;
      AV13NumLin = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P0ADV2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Long.valueOf(AV9AlbProCod)});
      cV13NumLin = P0ADV2_AV13NumLin[0] ;
      pr_default.close(0);
      AV13NumLin = (short)(AV13NumLin+cV13NumLin*1) ;
      /* End optimized group. */
      AV14Inc_obs = "" ;
      if ( (0==AV13NumLin) )
      {
         /* Using cursor P0ADV3 */
         pr_default.execute(1, new Object[] {AV8EmprCod, Long.valueOf(AV9AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A30AlbProCod = P0ADV3_A30AlbProCod[0] ;
            A396EmprCod = P0ADV3_A396EmprCod[0] ;
            A5140AlbMarca = P0ADV3_A5140AlbMarca[0] ;
            /* Using cursor P0ADV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A200BarPieCod = P0ADV4_A200BarPieCod[0] ;
               A130BarCodPar = P0ADV4_A130BarCodPar[0] ;
               A132BarCodReo = P0ADV4_A132BarCodReo[0] ;
               A129BarCod = P0ADV4_A129BarCod[0] ;
               A27AlbPKilEnt = P0ADV4_A27AlbPKilEnt[0] ;
               /* Using cursor P0ADV5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
               /* Optimized DELETE. */
               /* Using cursor P0ADV6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
               /* End optimized DELETE. */
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Optimized DELETE. */
            /* Using cursor P0ADV7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P0ADV8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P0ADV9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
            /* End optimized DELETE. */
            A5140AlbMarca = " " ;
            AV14Inc_obs = httpContext.getMessage( "Albaran queda como en preparacion", "") + GXutil.newLine( ) ;
            AV14Inc_obs += httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
            /* Using cursor P0ADV10 */
            pr_default.execute(8, new Object[] {A5140AlbMarca, A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      if ( ! (GXutil.strcmp("", AV14Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( AV8EmprCod, AV24Pgmname, AV12UsurCod, AV10Station, AV14Inc_obs, (int)(AV9AlbProCod), (byte)(0), "") ;
      }
      System.out.println( httpContext.getMessage( "&Inc_obs=", "")+GXutil.trim( AV14Inc_obs) );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.eliminaciondocumento");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P0ADV2_AV13NumLin = new short[1] ;
      AV14Inc_obs = "" ;
      P0ADV3_A30AlbProCod = new long[1] ;
      P0ADV3_A396EmprCod = new String[] {""} ;
      P0ADV3_A5140AlbMarca = new String[] {""} ;
      A396EmprCod = "" ;
      A5140AlbMarca = "" ;
      P0ADV4_A396EmprCod = new String[] {""} ;
      P0ADV4_A30AlbProCod = new long[1] ;
      P0ADV4_A200BarPieCod = new String[] {""} ;
      P0ADV4_A130BarCodPar = new String[] {""} ;
      P0ADV4_A132BarCodReo = new byte[1] ;
      P0ADV4_A129BarCod = new int[1] ;
      P0ADV4_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      AV24Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.eliminaciondocumento__default(),
         new Object[] {
             new Object[] {
            P0ADV2_AV13NumLin
            }
            , new Object[] {
            P0ADV3_A30AlbProCod, P0ADV3_A396EmprCod, P0ADV3_A5140AlbMarca
            }
            , new Object[] {
            P0ADV4_A396EmprCod, P0ADV4_A30AlbProCod, P0ADV4_A200BarPieCod, P0ADV4_A130BarCodPar, P0ADV4_A132BarCodReo, P0ADV4_A129BarCod, P0ADV4_A27AlbPKilEnt
            }
            , new Object[] {
            }
            , new Object[] {
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
      AV24Pgmname = "DocumentoTransporteProduccion.EliminacionDocumento" ;
      /* GeneXus formulas. */
      AV24Pgmname = "DocumentoTransporteProduccion.EliminacionDocumento" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV13NumLin ;
   private short cV13NumLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long AV9AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private String AV8EmprCod ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV12UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5140AlbMarca ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String AV24Pgmname ;
   private String AV14Inc_obs ;
   private IDataStoreProvider pr_default ;
   private short[] P0ADV2_AV13NumLin ;
   private long[] P0ADV3_A30AlbProCod ;
   private String[] P0ADV3_A396EmprCod ;
   private String[] P0ADV3_A5140AlbMarca ;
   private String[] P0ADV4_A396EmprCod ;
   private long[] P0ADV4_A30AlbProCod ;
   private String[] P0ADV4_A200BarPieCod ;
   private String[] P0ADV4_A130BarCodPar ;
   private byte[] P0ADV4_A132BarCodReo ;
   private int[] P0ADV4_A129BarCod ;
   private java.math.BigDecimal[] P0ADV4_A27AlbPKilEnt ;
}

final  class eliminaciondocumento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADV2", "SELECT COUNT(*) FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADV3", "SELECT AlbProCod, EmprCod, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ADV4", "SELECT EmprCod, AlbProCod, BarPieCod, BarCodPar, BarCodReo, BarCod, AlbPKilEnt FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0ADV5", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P0ADV6", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new UpdateCursor("P0ADV7", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new UpdateCursor("P0ADV8", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P0ADV9", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P0ADV10", "UPDATE TXPCALPRD SET AlbMarca=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

