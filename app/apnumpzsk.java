package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apnumpzsk extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apnumpzsk pgm = new apnumpzsk (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apnumpzsk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apnumpzsk.class ), "" );
   }

   public apnumpzsk( int remoteHandle ,
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
      AV19Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV20Emprcod ;
      GXv_char2[0] = AV21EmprNom ;
      GXv_char3[0] = AV22Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char1, GXv_char2, GXv_char3) ;
      apnumpzsk.this.AV20Emprcod = GXv_char1[0] ;
      apnumpzsk.this.AV21EmprNom = GXv_char2[0] ;
      apnumpzsk.this.AV22Usurcod = GXv_char3[0] ;
      /* Using cursor P04P32 */
      pr_default.execute(0, new Object[] {AV20Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04P32_A130BarCodPar[0] ;
         A132BarCodReo = P04P32_A132BarCodReo[0] ;
         A129BarCod = P04P32_A129BarCod[0] ;
         A2809MetTerCod = P04P32_A2809MetTerCod[0] ;
         A396EmprCod = P04P32_A396EmprCod[0] ;
         AV23Barcod = A129BarCod ;
         AV24Barcodreo = A132BarCodReo ;
         AV25Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'ALBBAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV30Facturado == 0 )
         {
            Gx_msg = httpContext.getMessage( "Procesando ... ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            System.out.println( Gx_msg );
            /* Using cursor P04P33 */
            pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               brk4P33 = false ;
               A10780MetPiectr = P04P33_A10780MetPiectr[0] ;
               A4917MetPieObs = P04P33_A4917MetPieObs[0] ;
               A2813MetPieCod = P04P33_A2813MetPieCod[0] ;
               AV29MetPieObs = A4917MetPieObs ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P04P33_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P04P33_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( P04P33_A129BarCod[0] == A129BarCod ) && ( P04P33_A132BarCodReo[0] == A132BarCodReo ) )
               {
                  if ( ! ( ( GXutil.strcmp(P04P33_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P04P33_A10780MetPiectr[0], A10780MetPiectr) == 0 ) ) )
                  {
                     if (true) break;
                  }
                  brk4P33 = false ;
                  A2813MetPieCod = P04P33_A2813MetPieCod[0] ;
                  brk4P33 = true ;
                  pr_default.readNext(1);
               }
               if ( GXutil.strcmp(AV29MetPieObs, " ") != 0 )
               {
                  GXv_char3[0] = A396EmprCod ;
                  GXv_char2[0] = A2809MetTerCod ;
                  GXv_int4[0] = A129BarCod ;
                  GXv_int5[0] = A132BarCodReo ;
                  GXv_char1[0] = A130BarCodPar ;
                  GXv_char6[0] = AV29MetPieObs ;
                  new app.pnumpzsi(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4, GXv_int5, GXv_char1, GXv_char6) ;
                  apnumpzsk.this.A396EmprCod = GXv_char3[0] ;
                  apnumpzsk.this.A2809MetTerCod = GXv_char2[0] ;
                  apnumpzsk.this.A129BarCod = GXv_int4[0] ;
                  apnumpzsk.this.A132BarCodReo = GXv_int5[0] ;
                  apnumpzsk.this.A130BarCodPar = GXv_char1[0] ;
                  apnumpzsk.this.AV29MetPieObs = GXv_char6[0] ;
                  GXv_char6[0] = A396EmprCod ;
                  GXv_char3[0] = A2809MetTerCod ;
                  GXv_int4[0] = A129BarCod ;
                  GXv_int5[0] = A132BarCodReo ;
                  GXv_char2[0] = A130BarCodPar ;
                  GXv_char1[0] = AV29MetPieObs ;
                  new app.pnumpzsl(remoteHandle, context).execute( GXv_char6, GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_char1) ;
                  apnumpzsk.this.A396EmprCod = GXv_char6[0] ;
                  apnumpzsk.this.A2809MetTerCod = GXv_char3[0] ;
                  apnumpzsk.this.A129BarCod = GXv_int4[0] ;
                  apnumpzsk.this.A132BarCodReo = GXv_int5[0] ;
                  apnumpzsk.this.A130BarCodPar = GXv_char2[0] ;
                  apnumpzsk.this.AV29MetPieObs = GXv_char1[0] ;
                  GXv_char6[0] = A396EmprCod ;
                  GXv_char3[0] = A2809MetTerCod ;
                  GXv_int4[0] = A129BarCod ;
                  GXv_int5[0] = A132BarCodReo ;
                  GXv_char2[0] = A130BarCodPar ;
                  GXv_char1[0] = AV29MetPieObs ;
                  new app.pnumpzsj(remoteHandle, context).execute( GXv_char6, GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_char1) ;
                  apnumpzsk.this.A396EmprCod = GXv_char6[0] ;
                  apnumpzsk.this.A2809MetTerCod = GXv_char3[0] ;
                  apnumpzsk.this.A129BarCod = GXv_int4[0] ;
                  apnumpzsk.this.A132BarCodReo = GXv_int5[0] ;
                  apnumpzsk.this.A130BarCodPar = GXv_char2[0] ;
                  apnumpzsk.this.AV29MetPieObs = GXv_char1[0] ;
                  new app.pcommit(remoteHandle, context).execute( ) ;
               }
               if ( ! brk4P33 )
               {
                  brk4P33 = true ;
                  pr_default.readNext(1);
               }
            }
            pr_default.close(1);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin.", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV30Facturado = (byte)(0) ;
      /* Using cursor P04P34 */
      pr_default.execute(2, new Object[] {AV20Emprcod, Integer.valueOf(AV23Barcod), Byte.valueOf(AV24Barcodreo), AV25Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A30AlbProCod = P04P34_A30AlbProCod[0] ;
         A130BarCodPar = P04P34_A130BarCodPar[0] ;
         A132BarCodReo = P04P34_A132BarCodReo[0] ;
         A129BarCod = P04P34_A129BarCod[0] ;
         A396EmprCod = P04P34_A396EmprCod[0] ;
         A34AlbProfch = P04P34_A34AlbProfch[0] ;
         A34AlbProfch = P04P34_A34AlbProfch[0] ;
         if ( GXutil.year( A34AlbProfch) >= 2015 )
         {
            AV30Facturado = (byte)(0) ;
         }
         else
         {
            AV30Facturado = (byte)(1) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pnumpzsk.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Station = "" ;
      AV20Emprcod = "" ;
      AV21EmprNom = "" ;
      AV22Usurcod = "" ;
      scmdbuf = "" ;
      P04P32_A130BarCodPar = new String[] {""} ;
      P04P32_A132BarCodReo = new byte[1] ;
      P04P32_A129BarCod = new int[1] ;
      P04P32_A2809MetTerCod = new String[] {""} ;
      P04P32_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
      A396EmprCod = "" ;
      AV25Barcodpar = "" ;
      Gx_msg = "" ;
      P04P33_A396EmprCod = new String[] {""} ;
      P04P33_A2809MetTerCod = new String[] {""} ;
      P04P33_A129BarCod = new int[1] ;
      P04P33_A132BarCodReo = new byte[1] ;
      P04P33_A130BarCodPar = new String[] {""} ;
      P04P33_A10780MetPiectr = new String[] {""} ;
      P04P33_A4917MetPieObs = new String[] {""} ;
      P04P33_A2813MetPieCod = new String[] {""} ;
      A10780MetPiectr = "" ;
      A4917MetPieObs = "" ;
      A2813MetPieCod = "" ;
      AV29MetPieObs = "" ;
      GXv_char6 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      P04P34_A30AlbProCod = new long[1] ;
      P04P34_A130BarCodPar = new String[] {""} ;
      P04P34_A132BarCodReo = new byte[1] ;
      P04P34_A129BarCod = new int[1] ;
      P04P34_A396EmprCod = new String[] {""} ;
      P04P34_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apnumpzsk__default(),
         new Object[] {
             new Object[] {
            P04P32_A130BarCodPar, P04P32_A132BarCodReo, P04P32_A129BarCod, P04P32_A2809MetTerCod, P04P32_A396EmprCod
            }
            , new Object[] {
            P04P33_A396EmprCod, P04P33_A2809MetTerCod, P04P33_A129BarCod, P04P33_A132BarCodReo, P04P33_A130BarCodPar, P04P33_A10780MetPiectr, P04P33_A4917MetPieObs, P04P33_A2813MetPieCod
            }
            , new Object[] {
            P04P34_A30AlbProCod, P04P34_A130BarCodPar, P04P34_A132BarCodReo, P04P34_A129BarCod, P04P34_A396EmprCod, P04P34_A34AlbProfch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV24Barcodreo ;
   private byte AV30Facturado ;
   private byte GXv_int5[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV23Barcod ;
   private int GXv_int4[] ;
   private long A30AlbProCod ;
   private String AV19Station ;
   private String AV20Emprcod ;
   private String AV21EmprNom ;
   private String AV22Usurcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String A396EmprCod ;
   private String AV25Barcodpar ;
   private String Gx_msg ;
   private String A10780MetPiectr ;
   private String A2813MetPieCod ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean brk4P33 ;
   private String A4917MetPieObs ;
   private String AV29MetPieObs ;
   private IDataStoreProvider pr_default ;
   private String[] P04P32_A130BarCodPar ;
   private byte[] P04P32_A132BarCodReo ;
   private int[] P04P32_A129BarCod ;
   private String[] P04P32_A2809MetTerCod ;
   private String[] P04P32_A396EmprCod ;
   private String[] P04P33_A396EmprCod ;
   private String[] P04P33_A2809MetTerCod ;
   private int[] P04P33_A129BarCod ;
   private byte[] P04P33_A132BarCodReo ;
   private String[] P04P33_A130BarCodPar ;
   private String[] P04P33_A10780MetPiectr ;
   private String[] P04P33_A4917MetPieObs ;
   private String[] P04P33_A2813MetPieCod ;
   private long[] P04P34_A30AlbProCod ;
   private String[] P04P34_A130BarCodPar ;
   private byte[] P04P34_A132BarCodReo ;
   private int[] P04P34_A129BarCod ;
   private String[] P04P34_A396EmprCod ;
   private java.util.Date[] P04P34_A34AlbProfch ;
}

final  class apnumpzsk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04P32", "SELECT BarCodPar, BarCodReo, BarCod, MetTerCod, EmprCod FROM TXPCMETPI WHERE EmprCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04P33", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetPieObs, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04P34", "SELECT T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.AlbProfch FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

