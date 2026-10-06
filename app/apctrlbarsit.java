package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apctrlbarsit extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apctrlbarsit pgm = new apctrlbarsit (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apctrlbarsit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apctrlbarsit.class ), "" );
   }

   public apctrlbarsit( int remoteHandle ,
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
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apctrlbarsit.this.AV10EmprCod = GXv_char1[0] ;
      apctrlbarsit.this.AV11EmprNom = GXv_char2[0] ;
      apctrlbarsit.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P06142 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P06142_A213BarSit[0] ;
         A396EmprCod = P06142_A396EmprCod[0] ;
         A129BarCod = P06142_A129BarCod[0] ;
         A132BarCodReo = P06142_A132BarCodReo[0] ;
         A130BarCodPar = P06142_A130BarCodPar[0] ;
         A120BarAgrEst = P06142_A120BarAgrEst[0] ;
         AV12Barcodm = A129BarCod ;
         AV13Barcodreom = A132BarCodReo ;
         AV14Barcodparm = A130BarCodPar ;
         AV21Barcod = A129BarCod ;
         AV22Barcodreo = A132BarCodReo ;
         AV23Barcodpar = A130BarCodPar ;
         AV15HdMin = (byte)(1) ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pminagr(remoteHandle, context).execute( AV10EmprCod, AV12Barcodm, AV13Barcodreom, AV14Barcodparm) ;
            if ( ( A129BarCod == AV12Barcodm ) && ( A132BarCodReo == AV13Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV14Barcodparm) == 0 ) )
            {
               AV15HdMin = (byte)(1) ;
            }
            else
            {
               AV15HdMin = (byte)(0) ;
            }
         }
         /* Execute user subroutine: 'RECMAQ' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV16recmaq == 0 )
         {
            AV18Datatime = GXutil.serverNow( context, remoteHandle, pr_default) ;
            AV17Control = "-> " + localUtil.ttoc( AV18Datatime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + httpContext.getMessage( "Situacion = 4 ", "") + GXutil.trim( AV20Inc) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      AV16recmaq = (byte)(0) ;
      AV20Inc = "" ;
      /* Using cursor P06143 */
      pr_default.execute(1, new Object[] {AV10EmprCod, Integer.valueOf(AV12Barcodm), Byte.valueOf(AV13Barcodreom), AV14Barcodparm});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P06143_A130BarCodPar[0] ;
         A132BarCodReo = P06143_A132BarCodReo[0] ;
         A129BarCod = P06143_A129BarCod[0] ;
         A396EmprCod = P06143_A396EmprCod[0] ;
         A2805RecVolPrd = P06143_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P06143_A2804RecLinMaq[0] ;
         AV16recmaq = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV16recmaq == 0 )
      {
         AV20Inc = httpContext.getMessage( "NO existe en RECMAQ", "") + GXutil.newLine( ) ;
         AV19Lconti = (byte)(0) ;
         /* Using cursor P06144 */
         pr_default.execute(2, new Object[] {AV10EmprCod, Integer.valueOf(AV21Barcod), Byte.valueOf(AV22Barcodreo), AV23Barcodpar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1935BarParTin = P06144_A1935BarParTin[0] ;
            n1935BarParTin = P06144_n1935BarParTin[0] ;
            A1934BarReoTin = P06144_A1934BarReoTin[0] ;
            n1934BarReoTin = P06144_n1934BarReoTin[0] ;
            A1933BarCodTin = P06144_A1933BarCodTin[0] ;
            n1933BarCodTin = P06144_n1933BarCodTin[0] ;
            A396EmprCod = P06144_A396EmprCod[0] ;
            A3646EstTinAny = P06144_A3646EstTinAny[0] ;
            A3647EstTinMes = P06144_A3647EstTinMes[0] ;
            A3648EstTinDia = P06144_A3648EstTinDia[0] ;
            A1929EstTinNr = P06144_A1929EstTinNr[0] ;
            AV19Lconti = (byte)(1) ;
            AV20Inc += httpContext.getMessage( ",Existe en LCONTI", "") ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pctrlbarsit.class);
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
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P06142_A213BarSit = new byte[1] ;
      P06142_A396EmprCod = new String[] {""} ;
      P06142_A129BarCod = new int[1] ;
      P06142_A132BarCodReo = new byte[1] ;
      P06142_A130BarCodPar = new String[] {""} ;
      P06142_A120BarAgrEst = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      AV14Barcodparm = "" ;
      AV23Barcodpar = "" ;
      AV18Datatime = GXutil.resetTime( GXutil.nullDate() );
      AV17Control = "" ;
      AV20Inc = "" ;
      P06143_A130BarCodPar = new String[] {""} ;
      P06143_A132BarCodReo = new byte[1] ;
      P06143_A129BarCod = new int[1] ;
      P06143_A396EmprCod = new String[] {""} ;
      P06143_A2805RecVolPrd = new int[1] ;
      P06143_A2804RecLinMaq = new short[1] ;
      P06144_A1935BarParTin = new String[] {""} ;
      P06144_n1935BarParTin = new boolean[] {false} ;
      P06144_A1934BarReoTin = new byte[1] ;
      P06144_n1934BarReoTin = new boolean[] {false} ;
      P06144_A1933BarCodTin = new int[1] ;
      P06144_n1933BarCodTin = new boolean[] {false} ;
      P06144_A396EmprCod = new String[] {""} ;
      P06144_A3646EstTinAny = new short[1] ;
      P06144_A3647EstTinMes = new byte[1] ;
      P06144_A3648EstTinDia = new byte[1] ;
      P06144_A1929EstTinNr = new short[1] ;
      A1935BarParTin = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apctrlbarsit__default(),
         new Object[] {
             new Object[] {
            P06142_A213BarSit, P06142_A396EmprCod, P06142_A129BarCod, P06142_A132BarCodReo, P06142_A130BarCodPar, P06142_A120BarAgrEst
            }
            , new Object[] {
            P06143_A130BarCodPar, P06143_A132BarCodReo, P06143_A129BarCod, P06143_A396EmprCod, P06143_A2805RecVolPrd, P06143_A2804RecLinMaq
            }
            , new Object[] {
            P06144_A1935BarParTin, P06144_n1935BarParTin, P06144_A1934BarReoTin, P06144_n1934BarReoTin, P06144_A1933BarCodTin, P06144_n1933BarCodTin, P06144_A396EmprCod, P06144_A3646EstTinAny, P06144_A3647EstTinMes, P06144_A3648EstTinDia,
            P06144_A1929EstTinNr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV13Barcodreom ;
   private byte AV22Barcodreo ;
   private byte AV15HdMin ;
   private byte AV16recmaq ;
   private byte AV19Lconti ;
   private byte A1934BarReoTin ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private short A2804RecLinMaq ;
   private short A3646EstTinAny ;
   private short A1929EstTinNr ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12Barcodm ;
   private int AV21Barcod ;
   private int A2805RecVolPrd ;
   private int A1933BarCodTin ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String AV14Barcodparm ;
   private String AV23Barcodpar ;
   private String AV20Inc ;
   private String A1935BarParTin ;
   private java.util.Date AV18Datatime ;
   private boolean returnInSub ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private String AV17Control ;
   private IDataStoreProvider pr_default ;
   private byte[] P06142_A213BarSit ;
   private String[] P06142_A396EmprCod ;
   private int[] P06142_A129BarCod ;
   private byte[] P06142_A132BarCodReo ;
   private String[] P06142_A130BarCodPar ;
   private String[] P06142_A120BarAgrEst ;
   private String[] P06143_A130BarCodPar ;
   private byte[] P06143_A132BarCodReo ;
   private int[] P06143_A129BarCod ;
   private String[] P06143_A396EmprCod ;
   private int[] P06143_A2805RecVolPrd ;
   private short[] P06143_A2804RecLinMaq ;
   private String[] P06144_A1935BarParTin ;
   private boolean[] P06144_n1935BarParTin ;
   private byte[] P06144_A1934BarReoTin ;
   private boolean[] P06144_n1934BarReoTin ;
   private int[] P06144_A1933BarCodTin ;
   private boolean[] P06144_n1933BarCodTin ;
   private String[] P06144_A396EmprCod ;
   private short[] P06144_A3646EstTinAny ;
   private byte[] P06144_A3647EstTinMes ;
   private byte[] P06144_A3648EstTinDia ;
   private short[] P06144_A1929EstTinNr ;
}

final  class apctrlbarsit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06142", "SELECT BarSit, EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarSit = 4 ORDER BY EmprCod, BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06143", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06144", "SELECT BarParTin, BarReoTin, BarCodTin, EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ? ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((short[]) buf[10])[0] = rslt.getShort(8);
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
      }
   }

}

