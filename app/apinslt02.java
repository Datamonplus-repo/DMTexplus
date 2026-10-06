package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apinslt02 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apinslt02 pgm = new apinslt02 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apinslt02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apinslt02.class ), "" );
   }

   public apinslt02( int remoteHandle ,
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
      GXv_char1[0] = AV11EmprCod ;
      GXv_char2[0] = AV10EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apinslt02.this.AV11EmprCod = GXv_char1[0] ;
      apinslt02.this.AV10EmprNom = GXv_char2[0] ;
      apinslt02.this.AV8UsurCod = GXv_char3[0] ;
      GXt_int4 = AV23ExisteNumLote ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "NOLT00", ""), GXv_int5) ;
      apinslt02.this.GXt_int4 = GXv_int5[0] ;
      AV23ExisteNumLote = GXt_int4 ;
      if ( AV23ExisteNumLote == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Contador de LOTES, NOLT00", ""));
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV24Last_EncPart = " " ;
      /* Using cursor P061O2 */
      pr_default.execute(0, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P061O2_A396EmprCod[0] ;
         A148BarEstReo = P061O2_A148BarEstReo[0] ;
         A3746BarNPed = P061O2_A3746BarNPed[0] ;
         A130BarCodPar = P061O2_A130BarCodPar[0] ;
         A132BarCodReo = P061O2_A132BarCodReo[0] ;
         A129BarCod = P061O2_A129BarCod[0] ;
         A1503BarPart = P061O2_A1503BarPart[0] ;
         A4812BarEncCli = P061O2_A4812BarEncCli[0] ;
         A159BarFecGen = P061O2_A159BarFecGen[0] ;
         if ( GXutil.strcmp(AV24Last_EncPart, A4812BarEncCli+GXutil.str( A1503BarPart, 4, 0)) != 0 )
         {
            GXt_int6 = AV18NumLote ;
            GXv_char3[0] = AV11EmprCod ;
            GXv_char2[0] = httpContext.getMessage( "NOLT00", "") ;
            GXv_int7[0] = GXt_int6 ;
            new app.precagr(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int7) ;
            apinslt02.this.AV11EmprCod = GXv_char3[0] ;
            apinslt02.this.GXt_int6 = GXv_int7[0] ;
            AV18NumLote = GXt_int6 ;
         }
         A3746BarNPed = GXutil.str( AV18NumLote, 10, 0) ;
         AV14Control = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + A3746BarNPed ;
         System.out.println( AV14Control );
         AV24Last_EncPart = A4812BarEncCli + GXutil.str( A1503BarPart, 4, 0) ;
         /* Using cursor P061O3 */
         pr_default.execute(1, new Object[] {A3746BarNPed, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      new app.pcommit(remoteHandle, context).execute( ) ;
      /* Using cursor P061O4 */
      pr_default.execute(2, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P061O4_A396EmprCod[0] ;
         A148BarEstReo = P061O4_A148BarEstReo[0] ;
         A129BarCod = P061O4_A129BarCod[0] ;
         A130BarCodPar = P061O4_A130BarCodPar[0] ;
         A3746BarNPed = P061O4_A3746BarNPed[0] ;
         A132BarCodReo = P061O4_A132BarCodReo[0] ;
         AV20Barcod = A129BarCod ;
         AV21barcodreo = (byte)(0) ;
         AV22barcodpar = A130BarCodPar ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int8[0] = AV20Barcod ;
         GXv_int5[0] = (byte)(0) ;
         GXv_char2[0] = AV22barcodpar ;
         GXv_char1[0] = AV26BarNped ;
         new app.pinslt06(remoteHandle, context).execute( GXv_char3, GXv_int8, GXv_int5, GXv_char2, GXv_char1) ;
         apinslt02.this.A396EmprCod = GXv_char3[0] ;
         apinslt02.this.AV20Barcod = GXv_int8[0] ;
         apinslt02.this.AV22barcodpar = GXv_char2[0] ;
         apinslt02.this.AV26BarNped = GXv_char1[0] ;
         A3746BarNPed = AV26BarNped ;
         AV14Control = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + A3746BarNPed ;
         System.out.println( AV14Control );
         /* Using cursor P061O5 */
         pr_default.execute(3, new Object[] {A3746BarNPed, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pinslt02.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apinslt02");
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
      AV11EmprCod = "" ;
      AV10EmprNom = "" ;
      AV24Last_EncPart = "" ;
      scmdbuf = "" ;
      P061O2_A396EmprCod = new String[] {""} ;
      P061O2_A148BarEstReo = new byte[1] ;
      P061O2_A3746BarNPed = new String[] {""} ;
      P061O2_A130BarCodPar = new String[] {""} ;
      P061O2_A132BarCodReo = new byte[1] ;
      P061O2_A129BarCod = new int[1] ;
      P061O2_A1503BarPart = new short[1] ;
      P061O2_A4812BarEncCli = new String[] {""} ;
      P061O2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A3746BarNPed = "" ;
      A130BarCodPar = "" ;
      A4812BarEncCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      GXv_int7 = new long[1] ;
      AV14Control = "" ;
      P061O4_A396EmprCod = new String[] {""} ;
      P061O4_A148BarEstReo = new byte[1] ;
      P061O4_A129BarCod = new int[1] ;
      P061O4_A130BarCodPar = new String[] {""} ;
      P061O4_A3746BarNPed = new String[] {""} ;
      P061O4_A132BarCodReo = new byte[1] ;
      AV22barcodpar = "" ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV26BarNped = "" ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apinslt02__default(),
         new Object[] {
             new Object[] {
            P061O2_A396EmprCod, P061O2_A148BarEstReo, P061O2_A3746BarNPed, P061O2_A130BarCodPar, P061O2_A132BarCodReo, P061O2_A129BarCod, P061O2_A1503BarPart, P061O2_A4812BarEncCli, P061O2_A159BarFecGen
            }
            , new Object[] {
            }
            , new Object[] {
            P061O4_A396EmprCod, P061O4_A148BarEstReo, P061O4_A129BarCod, P061O4_A130BarCodPar, P061O4_A3746BarNPed, P061O4_A132BarCodReo
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23ExisteNumLote ;
   private byte GXt_int4 ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV21barcodreo ;
   private byte GXv_int5[] ;
   private short A1503BarPart ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV20Barcod ;
   private int GXv_int8[] ;
   private long AV18NumLote ;
   private long GXt_int6 ;
   private long GXv_int7[] ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV11EmprCod ;
   private String AV10EmprNom ;
   private String AV24Last_EncPart ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A3746BarNPed ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String AV22barcodpar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV26BarNped ;
   private String GXv_char1[] ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private String AV14Control ;
   private IDataStoreProvider pr_default ;
   private String[] P061O2_A396EmprCod ;
   private byte[] P061O2_A148BarEstReo ;
   private String[] P061O2_A3746BarNPed ;
   private String[] P061O2_A130BarCodPar ;
   private byte[] P061O2_A132BarCodReo ;
   private int[] P061O2_A129BarCod ;
   private short[] P061O2_A1503BarPart ;
   private String[] P061O2_A4812BarEncCli ;
   private java.util.Date[] P061O2_A159BarFecGen ;
   private String[] P061O4_A396EmprCod ;
   private byte[] P061O4_A148BarEstReo ;
   private int[] P061O4_A129BarCod ;
   private String[] P061O4_A130BarCodPar ;
   private String[] P061O4_A3746BarNPed ;
   private byte[] P061O4_A132BarCodReo ;
}

final  class apinslt02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P061O2", "SELECT EmprCod, BarEstReo, BarNPed, BarCodPar, BarCodReo, BarCod, BarPart, BarEncCli, BarFecGen FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarEstReo <> 1) ORDER BY EmprCod, BarFecGen, BarEncCli, BarPart, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P061O3", "UPDATE TXPBARCAD SET BarNPed=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P061O4", "SELECT EmprCod, BarEstReo, BarCod, BarCodPar, BarNPed, BarCodReo FROM TXPBARCAD WHERE EmprCod = ? and BarEstReo = 1 ORDER BY EmprCod, BarEstReo ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P061O5", "UPDATE TXPBARCAD SET BarNPed=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

