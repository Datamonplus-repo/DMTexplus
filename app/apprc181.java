package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc181 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc181 pgm = new apprc181 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc181( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc181.class ), "" );
   }

   public apprc181( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc181.this.AV10EmprCod = GXv_char1[0] ;
      apprc181.this.AV13EmprNom = GXv_char2[0] ;
      apprc181.this.AV8UsurCod = GXv_char3[0] ;
      AV14Nregistros = 1 ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV15Tab_hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16i = 1 ;
      /* Using cursor P05Q42 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05Q42_A130BarCodPar[0] ;
         A132BarCodReo = P05Q42_A132BarCodReo[0] ;
         A129BarCod = P05Q42_A129BarCod[0] ;
         A396EmprCod = P05Q42_A396EmprCod[0] ;
         A213BarSit = P05Q42_A213BarSit[0] ;
         AV12albbar = (byte)(0) ;
         /* Using cursor P05Q43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1261BarAlbKgmE = P05Q43_A1261BarAlbKgmE[0] ;
            A30AlbProCod = P05Q43_A30AlbProCod[0] ;
            AV12albbar = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV12albbar == 1 )
         {
            if ( AV14Nregistros > 10000 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo procesa 10000 registros", ""));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            else
            {
               AV15Tab_hdr[AV14Nregistros-1] = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               AV11Control = httpContext.getMessage( "Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + GXutil.str( A213BarSit, 2, 0) + " " + GXutil.str( AV14Nregistros, 9, 0) ;
               System.out.println( AV11Control );
               AV14Nregistros = (int)(AV14Nregistros+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV16i = 1 ;
      while ( AV16i <= 10000 )
      {
         if ( GXutil.strcmp(AV15Tab_hdr[AV16i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV17barcod = (int)(GXutil.lval( GXutil.substring( AV15Tab_hdr[AV16i-1], 1, 8))) ;
         AV18barcodreo = (byte)(GXutil.lval( GXutil.substring( AV15Tab_hdr[AV16i-1], 9, 1))) ;
         AV19barcodpar = (GXutil.substring( AV15Tab_hdr[AV16i-1], 10, 1)) ;
         /* Using cursor P05Q44 */
         pr_default.execute(2, new Object[] {AV10EmprCod, Integer.valueOf(AV17barcod), Byte.valueOf(AV18barcodreo), AV19barcodpar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P05Q44_A130BarCodPar[0] ;
            A132BarCodReo = P05Q44_A132BarCodReo[0] ;
            A129BarCod = P05Q44_A129BarCod[0] ;
            A396EmprCod = P05Q44_A396EmprCod[0] ;
            A213BarSit = P05Q44_A213BarSit[0] ;
            AV20Inc_obs = httpContext.getMessage( "Cambio situacion ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( " a 9", "") ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV26Pgmname, AV8UsurCod, AV9Station, AV20Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(9) ;
            /* Using cursor P05Q45 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV16i = (int)(AV16i+1) ;
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc181.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprc181");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV15Tab_hdr = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV15Tab_hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P05Q42_A130BarCodPar = new String[] {""} ;
      P05Q42_A132BarCodReo = new byte[1] ;
      P05Q42_A129BarCod = new int[1] ;
      P05Q42_A396EmprCod = new String[] {""} ;
      P05Q42_A213BarSit = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P05Q43_A396EmprCod = new String[] {""} ;
      P05Q43_A129BarCod = new int[1] ;
      P05Q43_A132BarCodReo = new byte[1] ;
      P05Q43_A130BarCodPar = new String[] {""} ;
      P05Q43_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Q43_A30AlbProCod = new long[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      AV11Control = "" ;
      AV19barcodpar = "" ;
      P05Q44_A130BarCodPar = new String[] {""} ;
      P05Q44_A132BarCodReo = new byte[1] ;
      P05Q44_A129BarCod = new int[1] ;
      P05Q44_A396EmprCod = new String[] {""} ;
      P05Q44_A213BarSit = new byte[1] ;
      AV20Inc_obs = "" ;
      AV26Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc181__default(),
         new Object[] {
             new Object[] {
            P05Q42_A130BarCodPar, P05Q42_A132BarCodReo, P05Q42_A129BarCod, P05Q42_A396EmprCod, P05Q42_A213BarSit
            }
            , new Object[] {
            P05Q43_A396EmprCod, P05Q43_A129BarCod, P05Q43_A132BarCodReo, P05Q43_A130BarCodPar, P05Q43_A1261BarAlbKgmE, P05Q43_A30AlbProCod
            }
            , new Object[] {
            P05Q44_A130BarCodPar, P05Q44_A132BarCodReo, P05Q44_A129BarCod, P05Q44_A396EmprCod, P05Q44_A213BarSit
            }
            , new Object[] {
            }
         }
      );
      AV26Pgmname = "APPrc181" ;
      /* GeneXus formulas. */
      AV26Pgmname = "APPrc181" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV12albbar ;
   private byte AV18barcodreo ;
   private short Gx_err ;
   private int AV14Nregistros ;
   private int GX_I ;
   private int AV16i ;
   private int A129BarCod ;
   private int AV17barcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV13EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV15Tab_hdr[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV19barcodpar ;
   private String AV26Pgmname ;
   private String AV11Control ;
   private String AV20Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P05Q42_A130BarCodPar ;
   private byte[] P05Q42_A132BarCodReo ;
   private int[] P05Q42_A129BarCod ;
   private String[] P05Q42_A396EmprCod ;
   private byte[] P05Q42_A213BarSit ;
   private String[] P05Q43_A396EmprCod ;
   private int[] P05Q43_A129BarCod ;
   private byte[] P05Q43_A132BarCodReo ;
   private String[] P05Q43_A130BarCodPar ;
   private java.math.BigDecimal[] P05Q43_A1261BarAlbKgmE ;
   private long[] P05Q43_A30AlbProCod ;
   private String[] P05Q44_A130BarCodPar ;
   private byte[] P05Q44_A132BarCodReo ;
   private int[] P05Q44_A129BarCod ;
   private String[] P05Q44_A396EmprCod ;
   private byte[] P05Q44_A213BarSit ;
}

final  class apprc181__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Q42", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarSit = 6 ORDER BY EmprCod, BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Q43", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Q44", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05Q45", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

