package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class applnacc extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      applnacc pgm = new applnacc (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public applnacc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( applnacc.class ), "" );
   }

   public applnacc( int remoteHandle ,
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
      AV28UsurCod = " " ;
      AV29Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV8Emprcod ;
      GXv_char2[0] = AV30EmprNom ;
      GXv_char3[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char1, GXv_char2, GXv_char3) ;
      applnacc.this.AV8Emprcod = GXv_char1[0] ;
      applnacc.this.AV30EmprNom = GXv_char2[0] ;
      applnacc.this.AV28UsurCod = GXv_char3[0] ;
      GXt_char4 = AV21Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      applnacc.this.GXt_char4 = GXv_char3[0] ;
      AV21Carpeta = GXt_char4 ;
      AV20Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV19Nominf = GXutil.trim( AV37Pgmdesc) + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV20Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV20Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV20Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV20Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV20Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV20Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") ;
      AV23File = GXutil.trim( AV21Carpeta) + "\\" + GXutil.trim( AV19Nominf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV23File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV26Stat = GXutil.deleteFile( AV23File) ;
      }
      GXt_int5 = AV24hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV23File, GXv_int6) ;
      applnacc.this.GXt_int5 = GXv_int6[0] ;
      AV24hnd = (short)(GXt_int5) ;
      AV22Control = httpContext.getMessage( "Calculo Fecha Entrefa en funcion Plan de Accion", "") ;
      GXt_int7 = (byte)(AV26Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV24hnd, AV22Control, GXv_int8) ;
      applnacc.this.GXt_int7 = GXv_int8[0] ;
      AV26Stat = GXt_int7 ;
      System.out.println( AV22Control );
      AV22Control = httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Fecha HDR", "") + ";" + httpContext.getMessage( "Fecha Entrega", "") + ";" + httpContext.getMessage( "Proceso", "") + ";" + httpContext.getMessage( "TipoCrudo", "") + ";" + httpContext.getMessage( "Color", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Dias", "") ;
      GXt_int7 = (byte)(AV26Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV24hnd, AV22Control, GXv_int8) ;
      applnacc.this.GXt_int7 = GXv_int8[0] ;
      AV26Stat = GXt_int7 ;
      System.out.println( AV22Control );
      /* Using cursor P05SU3 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV31fec1, AV32fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05SU3_A396EmprCod[0] ;
         A130BarCodPar = P05SU3_A130BarCodPar[0] ;
         A132BarCodReo = P05SU3_A132BarCodReo[0] ;
         A129BarCod = P05SU3_A129BarCod[0] ;
         A159BarFecGen = P05SU3_A159BarFecGen[0] ;
         A252CliCod = P05SU3_A252CliCod[0] ;
         n252CliCod = P05SU3_n252CliCod[0] ;
         A212BarSer = P05SU3_A212BarSer[0] ;
         A135BarColNom = P05SU3_A135BarColNom[0] ;
         A136BarColNum = P05SU3_A136BarColNum[0] ;
         A218BarTipCol = P05SU3_A218BarTipCol[0] ;
         A166BarKgm = P05SU3_A166BarKgm[0] ;
         n166BarKgm = P05SU3_n166BarKgm[0] ;
         A166BarKgm = P05SU3_A166BarKgm[0] ;
         n166BarKgm = P05SU3_n166BarKgm[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_char1[0] = A135BarColNom ;
         GXv_int10[0] = A136BarColNum ;
         GXv_int8[0] = A218BarTipCol ;
         GXv_int11[0] = AV12PLNTipoCrudo ;
         new app.pmtsvalor(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_char2, GXv_char1, GXv_int10, GXv_int8, GXv_int11) ;
         applnacc.this.A396EmprCod = GXv_char3[0] ;
         applnacc.this.A252CliCod = GXv_int9[0] ;
         applnacc.this.A212BarSer = GXv_char2[0] ;
         applnacc.this.A135BarColNom = GXv_char1[0] ;
         applnacc.this.A136BarColNum = GXv_int10[0] ;
         applnacc.this.A218BarTipCol = GXv_int8[0] ;
         applnacc.this.AV12PLNTipoCrudo = GXv_int11[0] ;
         AV13Fascod300103 = (byte)(0) ;
         /* Using cursor P05SU4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = P05SU4_A457FasCod[0] ;
            A758ProCod = P05SU4_A758ProCod[0] ;
            A194BarOrdLin = P05SU4_A194BarOrdLin[0] ;
            if ( GXutil.strcmp(A457FasCod, "300103") == 0 )
            {
               AV13Fascod300103 = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV15PLNProcesos = ((AV13Fascod300103==1) ? httpContext.getMessage( "E", "") : httpContext.getMessage( "N", "")) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_char1[0] = A135BarColNom ;
         GXv_int9[0] = A136BarColNum ;
         GXv_int11[0] = A218BarTipCol ;
         GXv_int8[0] = AV16Intcod ;
         GXv_char12[0] = " " ;
         GXv_char13[0] = " " ;
         GXv_int14[0] = 0 ;
         new app.pbusint(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_char2, GXv_char1, GXv_int9, GXv_int11, GXv_int8, GXv_char12, GXv_char13, GXv_int14) ;
         applnacc.this.A396EmprCod = GXv_char3[0] ;
         applnacc.this.A252CliCod = GXv_int10[0] ;
         applnacc.this.A212BarSer = GXv_char2[0] ;
         applnacc.this.A135BarColNom = GXv_char1[0] ;
         applnacc.this.A136BarColNum = GXv_int9[0] ;
         applnacc.this.A218BarTipCol = GXv_int11[0] ;
         applnacc.this.AV16Intcod = GXv_int8[0] ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int11[0] = AV16Intcod ;
         GXv_int8[0] = AV33PLNColor ;
         GXv_char12[0] = AV34PLNColorDsc ;
         new app.pplncolintensidad(remoteHandle, context).execute( GXv_char13, GXv_int11, GXv_int8, GXv_char12) ;
         applnacc.this.A396EmprCod = GXv_char13[0] ;
         applnacc.this.AV16Intcod = GXv_int11[0] ;
         applnacc.this.AV33PLNColor = GXv_int8[0] ;
         applnacc.this.AV34PLNColorDsc = GXv_char12[0] ;
         AV14BarKgm = A166BarKgm ;
         /* Execute user subroutine: 'PLAN' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char13[0] = A396EmprCod ;
         GXv_int15[0] = AV17PLNDias ;
         GXv_date16[0] = AV18BarFecFpr ;
         new app.pdisfecent(remoteHandle, context).execute( GXv_char13, GXv_int15, GXv_date16) ;
         applnacc.this.A396EmprCod = GXv_char13[0] ;
         applnacc.this.AV17PLNDias = GXv_int15[0] ;
         applnacc.this.AV18BarFecFpr = GXv_date16[0] ;
         AV22Control = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + localUtil.dtoc( AV18BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + ((GXutil.strcmp(AV15PLNProcesos, httpContext.getMessage( "N", ""))==0) ? httpContext.getMessage( "Normal", "") : httpContext.getMessage( "Especial", "")) + ";" + ((AV12PLNTipoCrudo==0) ? httpContext.getMessage( "MTS", "") : httpContext.getMessage( "MTO", "")) + ";" + AV34PLNColorDsc + ";" + GXutil.str( AV14BarKgm, 9, 2) + ";" + GXutil.str( AV17PLNDias, 4, 0) ;
         GXt_int7 = (byte)(AV26Stat) ;
         GXv_int11[0] = GXt_int7 ;
         new app.core.fputs(remoteHandle, context).execute( AV24hnd, AV22Control, GXv_int11) ;
         applnacc.this.GXt_int7 = GXv_int11[0] ;
         AV26Stat = GXt_int7 ;
         System.out.println( AV22Control );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = (byte)(AV26Stat) ;
      GXv_int11[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV24hnd, GXv_int11) ;
      applnacc.this.GXt_int7 = GXv_int11[0] ;
      AV26Stat = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'PLAN' Routine */
      returnInSub = false ;
      AV17PLNDias = (short)(0) ;
      /* Using cursor P05SU5 */
      pr_default.execute(2, new Object[] {AV8Emprcod, AV15PLNProcesos, Byte.valueOf(AV12PLNTipoCrudo), Byte.valueOf(AV33PLNColor)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13183PLNColor = P05SU5_A13183PLNColor[0] ;
         A13182PLNTipoCru = P05SU5_A13182PLNTipoCru[0] ;
         A13181PLNProceso = P05SU5_A13181PLNProceso[0] ;
         A396EmprCod = P05SU5_A396EmprCod[0] ;
         A13189PLNCargaF = P05SU5_A13189PLNCargaF[0] ;
         n13189PLNCargaF = P05SU5_n13189PLNCargaF[0] ;
         A13184PLNCarga = P05SU5_A13184PLNCarga[0] ;
         n13184PLNCarga = P05SU5_n13184PLNCarga[0] ;
         A13185PLNDias = P05SU5_A13185PLNDias[0] ;
         n13185PLNDias = P05SU5_n13185PLNDias[0] ;
         A13188PLNLinea = P05SU5_A13188PLNLinea[0] ;
         if ( ( DecimalUtil.compareTo(AV14BarKgm, A13184PLNCarga) >= 0 ) && ( AV14BarKgm.doubleValue() <= A13189PLNCargaF ) )
         {
            AV17PLNDias = A13185PLNDias ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pplnacc.class);
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
      AV28UsurCod = "" ;
      AV29Station = "" ;
      AV8Emprcod = "" ;
      AV30EmprNom = "" ;
      AV21Carpeta = "" ;
      GXt_char4 = "" ;
      AV20Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV19Nominf = "" ;
      AV37Pgmdesc = "" ;
      AV23File = "" ;
      GXv_int6 = new long[1] ;
      AV22Control = "" ;
      scmdbuf = "" ;
      AV31fec1 = GXutil.nullDate() ;
      AV32fec2 = GXutil.nullDate() ;
      P05SU3_A396EmprCod = new String[] {""} ;
      P05SU3_A130BarCodPar = new String[] {""} ;
      P05SU3_A132BarCodReo = new byte[1] ;
      P05SU3_A129BarCod = new int[1] ;
      P05SU3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05SU3_A252CliCod = new int[1] ;
      P05SU3_n252CliCod = new boolean[] {false} ;
      P05SU3_A212BarSer = new String[] {""} ;
      P05SU3_A135BarColNom = new String[] {""} ;
      P05SU3_A136BarColNum = new int[1] ;
      P05SU3_A218BarTipCol = new byte[1] ;
      P05SU3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SU3_n166BarKgm = new boolean[] {false} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      P05SU4_A396EmprCod = new String[] {""} ;
      P05SU4_A129BarCod = new int[1] ;
      P05SU4_A132BarCodReo = new byte[1] ;
      P05SU4_A130BarCodPar = new String[] {""} ;
      P05SU4_A457FasCod = new String[] {""} ;
      P05SU4_A758ProCod = new String[] {""} ;
      P05SU4_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV15PLNProcesos = "" ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int14 = new int[1] ;
      GXv_int8 = new byte[1] ;
      AV34PLNColorDsc = "" ;
      GXv_char12 = new String[1] ;
      AV14BarKgm = DecimalUtil.ZERO ;
      GXv_char13 = new String[1] ;
      GXv_int15 = new short[1] ;
      AV18BarFecFpr = GXutil.nullDate() ;
      GXv_date16 = new java.util.Date[1] ;
      GXv_int11 = new byte[1] ;
      P05SU5_A13183PLNColor = new byte[1] ;
      P05SU5_A13182PLNTipoCru = new byte[1] ;
      P05SU5_A13181PLNProceso = new String[] {""} ;
      P05SU5_A396EmprCod = new String[] {""} ;
      P05SU5_A13189PLNCargaF = new short[1] ;
      P05SU5_n13189PLNCargaF = new boolean[] {false} ;
      P05SU5_A13184PLNCarga = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SU5_n13184PLNCarga = new boolean[] {false} ;
      P05SU5_A13185PLNDias = new short[1] ;
      P05SU5_n13185PLNDias = new boolean[] {false} ;
      P05SU5_A13188PLNLinea = new short[1] ;
      A13181PLNProceso = "" ;
      A13184PLNCarga = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.applnacc__default(),
         new Object[] {
             new Object[] {
            P05SU3_A396EmprCod, P05SU3_A130BarCodPar, P05SU3_A132BarCodReo, P05SU3_A129BarCod, P05SU3_A159BarFecGen, P05SU3_A252CliCod, P05SU3_n252CliCod, P05SU3_A212BarSer, P05SU3_A135BarColNom, P05SU3_A136BarColNum,
            P05SU3_A218BarTipCol, P05SU3_A166BarKgm, P05SU3_n166BarKgm
            }
            , new Object[] {
            P05SU4_A396EmprCod, P05SU4_A129BarCod, P05SU4_A132BarCodReo, P05SU4_A130BarCodPar, P05SU4_A457FasCod, P05SU4_A758ProCod, P05SU4_A194BarOrdLin
            }
            , new Object[] {
            P05SU5_A13183PLNColor, P05SU5_A13182PLNTipoCru, P05SU5_A13181PLNProceso, P05SU5_A396EmprCod, P05SU5_A13189PLNCargaF, P05SU5_n13189PLNCargaF, P05SU5_A13184PLNCarga, P05SU5_n13184PLNCarga, P05SU5_A13185PLNDias, P05SU5_n13185PLNDias,
            P05SU5_A13188PLNLinea
            }
         }
      );
      AV37Pgmdesc = httpContext.getMessage( "Plan de Accion", "") ;
      /* GeneXus formulas. */
      AV37Pgmdesc = httpContext.getMessage( "Plan de Accion", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV12PLNTipoCrudo ;
   private byte AV13Fascod300103 ;
   private byte AV16Intcod ;
   private byte AV33PLNColor ;
   private byte GXv_int8[] ;
   private byte GXt_int7 ;
   private byte GXv_int11[] ;
   private byte A13183PLNColor ;
   private byte A13182PLNTipoCru ;
   private short AV26Stat ;
   private short AV24hnd ;
   private short A194BarOrdLin ;
   private short AV17PLNDias ;
   private short GXv_int15[] ;
   private short A13189PLNCargaF ;
   private short A13185PLNDias ;
   private short A13188PLNLinea ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int10[] ;
   private int GXv_int9[] ;
   private int GXv_int14[] ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV14BarKgm ;
   private java.math.BigDecimal A13184PLNCarga ;
   private String AV28UsurCod ;
   private String AV29Station ;
   private String AV8Emprcod ;
   private String AV30EmprNom ;
   private String AV21Carpeta ;
   private String GXt_char4 ;
   private String AV19Nominf ;
   private String AV37Pgmdesc ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV15PLNProcesos ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV34PLNColorDsc ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String A13181PLNProceso ;
   private java.util.Date AV20Hhmmss ;
   private java.util.Date AV31fec1 ;
   private java.util.Date AV32fec2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV18BarFecFpr ;
   private java.util.Date GXv_date16[] ;
   private boolean Cond_result ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n13189PLNCargaF ;
   private boolean n13184PLNCarga ;
   private boolean n13185PLNDias ;
   private String AV23File ;
   private String AV22Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05SU3_A396EmprCod ;
   private String[] P05SU3_A130BarCodPar ;
   private byte[] P05SU3_A132BarCodReo ;
   private int[] P05SU3_A129BarCod ;
   private java.util.Date[] P05SU3_A159BarFecGen ;
   private int[] P05SU3_A252CliCod ;
   private boolean[] P05SU3_n252CliCod ;
   private String[] P05SU3_A212BarSer ;
   private String[] P05SU3_A135BarColNom ;
   private int[] P05SU3_A136BarColNum ;
   private byte[] P05SU3_A218BarTipCol ;
   private java.math.BigDecimal[] P05SU3_A166BarKgm ;
   private boolean[] P05SU3_n166BarKgm ;
   private String[] P05SU4_A396EmprCod ;
   private int[] P05SU4_A129BarCod ;
   private byte[] P05SU4_A132BarCodReo ;
   private String[] P05SU4_A130BarCodPar ;
   private String[] P05SU4_A457FasCod ;
   private String[] P05SU4_A758ProCod ;
   private short[] P05SU4_A194BarOrdLin ;
   private byte[] P05SU5_A13183PLNColor ;
   private byte[] P05SU5_A13182PLNTipoCru ;
   private String[] P05SU5_A13181PLNProceso ;
   private String[] P05SU5_A396EmprCod ;
   private short[] P05SU5_A13189PLNCargaF ;
   private boolean[] P05SU5_n13189PLNCargaF ;
   private java.math.BigDecimal[] P05SU5_A13184PLNCarga ;
   private boolean[] P05SU5_n13184PLNCarga ;
   private short[] P05SU5_A13185PLNDias ;
   private boolean[] P05SU5_n13185PLNDias ;
   private short[] P05SU5_A13188PLNLinea ;
}

final  class applnacc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SU3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFecGen, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarFecGen >= ?) AND (T1.BarFecGen <= ?) ORDER BY T1.EmprCod, T1.BarFecGen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05SU4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05SU5", "SELECT PLNColor, PLNTipoCru, PLNProceso, EmprCod, PLNCargaF, PLNCarga, PLNDias, PLNLinea FROM TXPPLNAC1 WHERE EmprCod = ? and PLNProceso = ? and PLNTipoCru = ? and PLNColor = ? ORDER BY EmprCod, PLNProceso, PLNTipoCru, PLNColor, PLNLinea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

