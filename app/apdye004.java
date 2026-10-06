package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apdye004 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apdye004 pgm = new apdye004 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apdye004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apdye004.class ), "" );
   }

   public apdye004( int remoteHandle ,
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
      AV43UsurCod = " " ;
      AV44Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV45EmprCod ;
      GXv_char2[0] = AV46EmprNom ;
      GXv_char3[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char1, GXv_char2, GXv_char3) ;
      apdye004.this.AV45EmprCod = GXv_char1[0] ;
      apdye004.this.AV46EmprNom = GXv_char2[0] ;
      apdye004.this.AV43UsurCod = GXv_char3[0] ;
      GXt_int4 = AV74PreMed ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int5) ;
      apdye004.this.GXt_int4 = GXv_int5[0] ;
      AV74PreMed = GXt_int4 ;
      GXt_char6 = AV50Carpeta ;
      GXv_char3[0] = GXt_char6 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "PTHOGT", ""), GXv_char3) ;
      apdye004.this.GXt_char6 = GXv_char3[0] ;
      AV50Carpeta = GXt_char6 ;
      GXt_int4 = AV80tintex ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int5) ;
      apdye004.this.GXt_int4 = GXv_int5[0] ;
      AV80tintex = GXt_int4 ;
      GXt_int4 = AV81Actualizar ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "ORGACT", ""), GXv_int5) ;
      apdye004.this.GXt_int4 = GXv_int5[0] ;
      AV81Actualizar = GXt_int4 ;
      AV78FecAlfa = "01" + "/" + "07" + "/" + "2017" ;
      AV77BarFecgen = GXutil.resetTime(localUtil.ctot( AV78FecAlfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV53Control = httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Tabla DYECNS", "") + ";" + httpContext.getMessage( "State.DYELOTS", "") ;
      System.out.println( AV53Control );
      /* Execute user subroutine: 'BARCAD' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV53Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " ->Proceso Finalizado. Registros procesados ", "") + GXutil.trim( GXutil.str( AV58Nrgtos, 6, 0)) ;
      System.out.println( AV53Control );
      GXt_int4 = AV59Stat ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV56hnd, AV53Control, GXv_int5) ;
      apdye004.this.GXt_int4 = GXv_int5[0] ;
      AV59Stat = GXt_int4 ;
      AV53Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " ->Fichero creado. ", "") + GXutil.trim( AV54File) ;
      System.out.println( AV53Control );
      GXt_int4 = AV59Stat ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV56hnd, AV53Control, GXv_int5) ;
      apdye004.this.GXt_int4 = GXv_int5[0] ;
      AV59Stat = GXt_int4 ;
      GXt_int4 = AV59Stat ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fclose(remoteHandle, context).execute( AV56hnd, GXv_int5) ;
      apdye004.this.GXt_int4 = GXv_int5[0] ;
      AV59Stat = GXt_int4 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV48ReDye = 0 ;
      AV64CorrectionNumber = 0 ;
      /* Using cursor P05982 */
      pr_default.execute(0, new Object[] {AV77BarFecgen});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5058BarEnvLaw = P05982_A5058BarEnvLaw[0] ;
         A159BarFecGen = P05982_A159BarFecGen[0] ;
         A129BarCod = P05982_A129BarCod[0] ;
         A132BarCodReo = P05982_A132BarCodReo[0] ;
         A130BarCodPar = P05982_A130BarCodPar[0] ;
         A396EmprCod = P05982_A396EmprCod[0] ;
         if ( GXutil.strcmp(A5058BarEnvLaw, httpContext.getMessage( "S", "")) == 0 )
         {
            AV61Barcod = A129BarCod ;
            AV62Barcodreo = A132BarCodReo ;
            AV63Barcodpar = A130BarCodPar ;
            AV47Dyelot = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            AV79FecCreacion = A159BarFecGen ;
            /* Execute user subroutine: 'DYECNS' */
            S122 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV83Txt1 = ((AV67DyeCns==1) ? httpContext.getMessage( "Hay informacion tabla Acatex.DYECNS", "") : httpContext.getMessage( "NO hay informacion tabla Acatex.DYECNS", "")) ;
            AV84txt2 = ((AV49state==999) ? httpContext.getMessage( "NO Hay informacion tabla Orgatex.DYELOTS", "") : httpContext.getMessage( "Hay informacion tabla Orgatex.DYELOTS", "")) ;
            if ( ( AV67DyeCns == 0 ) || ( AV49state == 999 ) )
            {
               AV53Control = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + GXutil.trim( AV83Txt1) + ";" + GXutil.trim( AV84txt2) ;
               System.out.println( AV53Control );
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S122( )
   {
      /* 'DYECNS' Routine */
      returnInSub = false ;
      AV67DyeCns = (byte)(0) ;
      /* Using cursor P05983 */
      pr_default.execute(1, new Object[] {AV45EmprCod, Integer.valueOf(AV61Barcod), Byte.valueOf(AV62Barcodreo), AV63Barcodpar, Integer.valueOf(AV48ReDye), Integer.valueOf(AV64CorrectionNumber)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A12391OgCNumber = P05983_A12391OgCNumber[0] ;
         A12390OgRedye = P05983_A12390OgRedye[0] ;
         A12389OgP = P05983_A12389OgP[0] ;
         A12388OgR = P05983_A12388OgR[0] ;
         A12387OgHdr = P05983_A12387OgHdr[0] ;
         A396EmprCod = P05983_A396EmprCod[0] ;
         A12392OgCallOff = P05983_A12392OgCallOff[0] ;
         A12393OgCounter = P05983_A12393OgCounter[0] ;
         AV67DyeCns = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV49state = 999 ;
      /* Using cursor P05984 */
      pr_default.execute(2, new Object[] {AV47Dyelot});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A12313Dyelot = P05984_A12313Dyelot[0] ;
         A12381State = P05984_A12381State[0] ;
         n12381State = P05984_n12381State[0] ;
         A12314ReDye = P05984_A12314ReDye[0] ;
         AV49state = A12381State ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pdye004.class);
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
      AV43UsurCod = "" ;
      AV44Station = "" ;
      AV45EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV46EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV50Carpeta = "" ;
      GXt_char6 = "" ;
      GXv_char3 = new String[1] ;
      AV78FecAlfa = "" ;
      AV77BarFecgen = GXutil.nullDate() ;
      AV53Control = "" ;
      AV54File = "" ;
      GXv_int5 = new byte[1] ;
      scmdbuf = "" ;
      P05982_A5058BarEnvLaw = new String[] {""} ;
      P05982_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05982_A129BarCod = new int[1] ;
      P05982_A132BarCodReo = new byte[1] ;
      P05982_A130BarCodPar = new String[] {""} ;
      P05982_A396EmprCod = new String[] {""} ;
      A5058BarEnvLaw = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV63Barcodpar = "" ;
      AV47Dyelot = "" ;
      AV79FecCreacion = GXutil.nullDate() ;
      AV83Txt1 = "" ;
      AV84txt2 = "" ;
      P05983_A12391OgCNumber = new int[1] ;
      P05983_A12390OgRedye = new int[1] ;
      P05983_A12389OgP = new String[] {""} ;
      P05983_A12388OgR = new byte[1] ;
      P05983_A12387OgHdr = new int[1] ;
      P05983_A396EmprCod = new String[] {""} ;
      P05983_A12392OgCallOff = new int[1] ;
      P05983_A12393OgCounter = new int[1] ;
      A12389OgP = "" ;
      P05984_A12313Dyelot = new String[] {""} ;
      P05984_A12381State = new int[1] ;
      P05984_n12381State = new boolean[] {false} ;
      P05984_A12314ReDye = new int[1] ;
      A12313Dyelot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apdye004__default(),
         new Object[] {
             new Object[] {
            P05982_A5058BarEnvLaw, P05982_A159BarFecGen, P05982_A129BarCod, P05982_A132BarCodReo, P05982_A130BarCodPar, P05982_A396EmprCod
            }
            , new Object[] {
            P05983_A12391OgCNumber, P05983_A12390OgRedye, P05983_A12389OgP, P05983_A12388OgR, P05983_A12387OgHdr, P05983_A396EmprCod, P05983_A12392OgCallOff, P05983_A12393OgCounter
            }
            , new Object[] {
            P05984_A12313Dyelot, P05984_A12381State, P05984_n12381State, P05984_A12314ReDye
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV74PreMed ;
   private byte AV80tintex ;
   private byte AV81Actualizar ;
   private byte AV59Stat ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private byte A132BarCodReo ;
   private byte AV62Barcodreo ;
   private byte AV67DyeCns ;
   private byte A12388OgR ;
   private short Gx_err ;
   private int AV58Nrgtos ;
   private int AV48ReDye ;
   private int AV64CorrectionNumber ;
   private int A129BarCod ;
   private int AV61Barcod ;
   private int AV49state ;
   private int A12391OgCNumber ;
   private int A12390OgRedye ;
   private int A12387OgHdr ;
   private int A12392OgCallOff ;
   private int A12393OgCounter ;
   private int A12381State ;
   private int A12314ReDye ;
   private long AV56hnd ;
   private String AV43UsurCod ;
   private String AV44Station ;
   private String AV45EmprCod ;
   private String GXv_char1[] ;
   private String AV46EmprNom ;
   private String GXv_char2[] ;
   private String AV50Carpeta ;
   private String GXt_char6 ;
   private String GXv_char3[] ;
   private String AV78FecAlfa ;
   private String scmdbuf ;
   private String A5058BarEnvLaw ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV63Barcodpar ;
   private String AV83Txt1 ;
   private String AV84txt2 ;
   private String A12389OgP ;
   private java.util.Date AV77BarFecgen ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV79FecCreacion ;
   private boolean returnInSub ;
   private boolean n12381State ;
   private String AV53Control ;
   private String AV54File ;
   private String AV47Dyelot ;
   private String A12313Dyelot ;
   private IDataStoreProvider pr_default ;
   private String[] P05982_A5058BarEnvLaw ;
   private java.util.Date[] P05982_A159BarFecGen ;
   private int[] P05982_A129BarCod ;
   private byte[] P05982_A132BarCodReo ;
   private String[] P05982_A130BarCodPar ;
   private String[] P05982_A396EmprCod ;
   private int[] P05983_A12391OgCNumber ;
   private int[] P05983_A12390OgRedye ;
   private String[] P05983_A12389OgP ;
   private byte[] P05983_A12388OgR ;
   private int[] P05983_A12387OgHdr ;
   private String[] P05983_A396EmprCod ;
   private int[] P05983_A12392OgCallOff ;
   private int[] P05983_A12393OgCounter ;
   private String[] P05984_A12313Dyelot ;
   private int[] P05984_A12381State ;
   private boolean[] P05984_n12381State ;
   private int[] P05984_A12314ReDye ;
}

final  class apdye004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05982", "SELECT BarEnvLaw, BarFecGen, BarCod, BarCodReo, BarCodPar, EmprCod FROM TXPBARCAD WHERE BarFecGen >= ? ORDER BY EmprCod, BarEnvLaw ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05983", "SELECT * FROM (SELECT OgCNumber, OgRedye, OgP, OgR, OgHdr, EmprCod, OgCallOff, OgCounter FROM TXPDYECNS WHERE EmprCod = ? and OgHdr = ? and OgR = ? and OgP = ? and OgRedye = ? and OgCNumber = ? ORDER BY EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05984", "SELECT Dyelot, State, ReDye FROM TXPDYE001 WHERE Dyelot = ? ORDER BY Dyelot, State ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
      }
   }

}

