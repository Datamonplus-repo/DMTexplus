package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptiaescontrol extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptiaescontrol pgm = new aptiaescontrol (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptiaescontrol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptiaescontrol.class ), "" );
   }

   public aptiaescontrol( int remoteHandle ,
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
      AV20UsurCod = " " ;
      AV21Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV25EmprCod ;
      GXv_char2[0] = AV22EmprNom ;
      GXv_char3[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char1, GXv_char2, GXv_char3) ;
      aptiaescontrol.this.AV25EmprCod = GXv_char1[0] ;
      aptiaescontrol.this.AV22EmprNom = GXv_char2[0] ;
      aptiaescontrol.this.AV20UsurCod = GXv_char3[0] ;
      GXt_char4 = AV11Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char3) ;
      aptiaescontrol.this.GXt_char4 = GXv_char3[0] ;
      AV11Carpeta = GXt_char4 ;
      GXt_char4 = AV11Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      aptiaescontrol.this.GXt_char4 = GXv_char3[0] ;
      AV11Carpeta = ((GXutil.strcmp("", AV11Carpeta)==0) ? GXt_char4 : AV11Carpeta) ;
      AV18Fec2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18Fec2)) ? Gx_date : AV18Fec2) ;
      AV24Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV16NomInf = httpContext.getMessage( "TIAS_DEL_UPD", "") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV24Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV24Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV24Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV24Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV24Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV24Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") ;
      AV14File = GXutil.trim( AV11Carpeta) + "\\" + GXutil.trim( AV16NomInf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV14File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV17Stat = GXutil.deleteFile( AV14File) ;
      }
      GXt_int5 = AV15hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV14File, GXv_int6) ;
      aptiaescontrol.this.GXt_int5 = GXv_int6[0] ;
      AV15hnd = (short)(GXt_int5) ;
      AV12Control = httpContext.getMessage( "TABLA", "") + ";" + httpContext.getMessage( "EMPRESA", "") + ";" + httpContext.getMessage( "MAQUINA", "") + ";" + httpContext.getMessage( "FECHA", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "SECCION", "") + ";" + httpContext.getMessage( "SeccionHISREO", "") + ";" + httpContext.getMessage( "KILOS", "") + ";" + httpContext.getMessage( "KilosHISREO", "") + ";" + httpContext.getMessage( "METROS", "") + ";" + httpContext.getMessage( "MetrosHISREO", "") + ";" + httpContext.getMessage( "DEFECTO", "") + ";" + httpContext.getMessage( "DefectoHISREO", "") + ";" + httpContext.getMessage( "OBSERVACION", "") ;
      GXt_int7 = (byte)(AV17Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV12Control, GXv_int8) ;
      aptiaescontrol.this.GXt_int7 = GXv_int8[0] ;
      AV17Stat = GXt_int7 ;
      System.out.println( AV12Control );
      /* Using cursor P05IG2 */
      pr_default.execute(0, new Object[] {AV25EmprCod, AV23Fec1, AV18Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12540ID_EMPRESA = P05IG2_A12540ID_EMPRESA[0] ;
         n12540ID_EMPRESA = P05IG2_n12540ID_EMPRESA[0] ;
         A12574ID_TIAES = P05IG2_A12574ID_TIAES[0] ;
         A12541FECHA = P05IG2_A12541FECHA[0] ;
         n12541FECHA = P05IG2_n12541FECHA[0] ;
         A12548HOJA_DE_RU = P05IG2_A12548HOJA_DE_RU[0] ;
         n12548HOJA_DE_RU = P05IG2_n12548HOJA_DE_RU[0] ;
         A12573KILOS_P = P05IG2_A12573KILOS_P[0] ;
         n12573KILOS_P = P05IG2_n12573KILOS_P[0] ;
         A12552ID_SECCION = P05IG2_A12552ID_SECCION[0] ;
         n12552ID_SECCION = P05IG2_n12552ID_SECCION[0] ;
         A12545ID_MAQUINA = P05IG2_A12545ID_MAQUINA[0] ;
         n12545ID_MAQUINA = P05IG2_n12545ID_MAQUINA[0] ;
         A12563ID_DEFECTO = P05IG2_A12563ID_DEFECTO[0] ;
         n12563ID_DEFECTO = P05IG2_n12563ID_DEFECTO[0] ;
         A12572METROS_P = P05IG2_A12572METROS_P[0] ;
         n12572METROS_P = P05IG2_n12572METROS_P[0] ;
         A12562TIPO_PRODU = P05IG2_A12562TIPO_PRODU[0] ;
         n12562TIPO_PRODU = P05IG2_n12562TIPO_PRODU[0] ;
         if ( GXutil.strcmp(GXutil.substring( A12574ID_TIAES, 1, 6), httpContext.getMessage( "HISREO", "")) == 0 )
         {
            AV8HisBarCod = (int)(GXutil.lval( GXutil.substring( A12548HOJA_DE_RU, 1, 8))) ;
            AV9HisCodReo = (byte)(GXutil.lval( GXutil.substring( A12548HOJA_DE_RU, 9, 1))) ;
            AV10HisCodPar = GXutil.substring( A12548HOJA_DE_RU, 10, 1) ;
            /* Execute user subroutine: 'HISREO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV19Hisreo == 0 )
            {
               AV12Control = httpContext.getMessage( "HISREO", "") + ";" + A12540ID_EMPRESA + ";" + A12545ID_MAQUINA + ";" + localUtil.dtoc( A12541FECHA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( AV8HisBarCod, 8, 0) + "-" + GXutil.str( AV9HisCodReo, 1, 0) + AV10HisCodPar + ";" + A12552ID_SECCION + ";" + " " + ";" + GXutil.str( A12573KILOS_P, 9, 2) + ";" + GXutil.str( AV28HisBarKgm, 9, 2) + ";" ;
               AV12Control += GXutil.str( A12572METROS_P, 9, 2) + ";" + GXutil.str( AV26HisBarMtr, 9, 2) + ";" + GXutil.str( A12563ID_DEFECTO, 4, 0) + ";" + httpContext.getMessage( "Registro ELIMINADO en HISREO", "") ;
               GXt_int7 = (byte)(AV17Stat) ;
               GXv_int8[0] = GXt_int7 ;
               new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV12Control, GXv_int8) ;
               aptiaescontrol.this.GXt_int7 = GXv_int8[0] ;
               AV17Stat = GXt_int7 ;
               System.out.println( AV12Control );
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A12572METROS_P, AV26HisBarMtr) != 0 ) || ( DecimalUtil.compareTo(A12573KILOS_P, AV28HisBarKgm) != 0 ) || ( A12563ID_DEFECTO != AV27Tipdefcod ) )
               {
                  AV12Control = httpContext.getMessage( "HISREO", "") + ";" + A12540ID_EMPRESA + ";" + A12545ID_MAQUINA + ";" + localUtil.dtoc( A12541FECHA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( AV8HisBarCod, 8, 0) + "-" + GXutil.str( AV9HisCodReo, 1, 0) + AV10HisCodPar + ";" + A12552ID_SECCION + ";" + AV29TipMaqCod + ";" + GXutil.str( A12573KILOS_P, 9, 2) + ";" + GXutil.str( AV28HisBarKgm, 9, 2) + ";" ;
                  AV12Control += GXutil.trim( GXutil.str( A12572METROS_P, 9, 2)) + ";" + GXutil.trim( GXutil.str( AV26HisBarMtr, 9, 2)) + ";" + GXutil.trim( GXutil.str( A12563ID_DEFECTO, 4, 0)) + ";" + GXutil.trim( GXutil.str( AV27Tipdefcod, 4, 0)) + ";" + httpContext.getMessage( "Existe HISREO", "") ;
                  GXt_int7 = (byte)(AV17Stat) ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV12Control, GXv_int8) ;
                  aptiaescontrol.this.GXt_int7 = GXv_int8[0] ;
                  AV17Stat = GXt_int7 ;
                  System.out.println( AV12Control );
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = (byte)(AV17Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV15hnd, GXv_int8) ;
      aptiaescontrol.this.GXt_int7 = GXv_int8[0] ;
      AV17Stat = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'HISREO' Routine */
      returnInSub = false ;
      AV19Hisreo = (byte)(0) ;
      AV28HisBarKgm = DecimalUtil.doubleToDec(0) ;
      AV26HisBarMtr = DecimalUtil.doubleToDec(0) ;
      AV27Tipdefcod = (short)(0) ;
      /* Using cursor P05IG3 */
      pr_default.execute(1, new Object[] {AV25EmprCod, Integer.valueOf(AV8HisBarCod), Byte.valueOf(AV9HisCodReo), AV10HisCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A544HisCodPar = P05IG3_A544HisCodPar[0] ;
         A545HisCodReo = P05IG3_A545HisCodReo[0] ;
         A539HisBarCod = P05IG3_A539HisBarCod[0] ;
         A396EmprCod = P05IG3_A396EmprCod[0] ;
         A540HisBarKgm = P05IG3_A540HisBarKgm[0] ;
         n540HisBarKgm = P05IG3_n540HisBarKgm[0] ;
         A541HisBarMtr = P05IG3_A541HisBarMtr[0] ;
         n541HisBarMtr = P05IG3_n541HisBarMtr[0] ;
         A833TipDefCod = P05IG3_A833TipDefCod[0] ;
         AV19Hisreo = (byte)(1) ;
         AV28HisBarKgm = A540HisBarKgm ;
         AV26HisBarMtr = A541HisBarMtr ;
         AV27Tipdefcod = A833TipDefCod ;
         AV29TipMaqCod = ((A833TipDefCod>=100)&&(A833TipDefCod<=199) ? httpContext.getMessage( "TI", "") : ((A833TipDefCod>=200)&&(A833TipDefCod<=299) ? httpContext.getMessage( "ES", "") : ((A833TipDefCod>=300)&&(A833TipDefCod<=399) ? httpContext.getMessage( "AC", "") : httpContext.getMessage( "OT", "")))) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptiaescontrol.class);
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
      AV20UsurCod = "" ;
      AV21Station = "" ;
      AV25EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV22EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV11Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV18Fec2 = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      AV24Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV16NomInf = "" ;
      AV14File = "" ;
      GXv_int6 = new long[1] ;
      AV12Control = "" ;
      scmdbuf = "" ;
      AV23Fec1 = GXutil.nullDate() ;
      P05IG2_A12540ID_EMPRESA = new String[] {""} ;
      P05IG2_n12540ID_EMPRESA = new boolean[] {false} ;
      P05IG2_A12574ID_TIAES = new String[] {""} ;
      P05IG2_A12541FECHA = new java.util.Date[] {GXutil.nullDate()} ;
      P05IG2_n12541FECHA = new boolean[] {false} ;
      P05IG2_A12548HOJA_DE_RU = new String[] {""} ;
      P05IG2_n12548HOJA_DE_RU = new boolean[] {false} ;
      P05IG2_A12573KILOS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05IG2_n12573KILOS_P = new boolean[] {false} ;
      P05IG2_A12552ID_SECCION = new String[] {""} ;
      P05IG2_n12552ID_SECCION = new boolean[] {false} ;
      P05IG2_A12545ID_MAQUINA = new String[] {""} ;
      P05IG2_n12545ID_MAQUINA = new boolean[] {false} ;
      P05IG2_A12563ID_DEFECTO = new short[1] ;
      P05IG2_n12563ID_DEFECTO = new boolean[] {false} ;
      P05IG2_A12572METROS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05IG2_n12572METROS_P = new boolean[] {false} ;
      P05IG2_A12562TIPO_PRODU = new String[] {""} ;
      P05IG2_n12562TIPO_PRODU = new boolean[] {false} ;
      A12540ID_EMPRESA = "" ;
      A12574ID_TIAES = "" ;
      A12541FECHA = GXutil.nullDate() ;
      A12548HOJA_DE_RU = "" ;
      A12573KILOS_P = DecimalUtil.ZERO ;
      A12552ID_SECCION = "" ;
      A12545ID_MAQUINA = "" ;
      A12572METROS_P = DecimalUtil.ZERO ;
      A12562TIPO_PRODU = "" ;
      AV10HisCodPar = "" ;
      AV28HisBarKgm = DecimalUtil.ZERO ;
      AV26HisBarMtr = DecimalUtil.ZERO ;
      AV29TipMaqCod = "" ;
      GXv_int8 = new byte[1] ;
      P05IG3_A544HisCodPar = new String[] {""} ;
      P05IG3_A545HisCodReo = new byte[1] ;
      P05IG3_A539HisBarCod = new int[1] ;
      P05IG3_A396EmprCod = new String[] {""} ;
      P05IG3_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05IG3_n540HisBarKgm = new boolean[] {false} ;
      P05IG3_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05IG3_n541HisBarMtr = new boolean[] {false} ;
      P05IG3_A833TipDefCod = new short[1] ;
      A544HisCodPar = "" ;
      A396EmprCod = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptiaescontrol__default(),
         new Object[] {
             new Object[] {
            P05IG2_A12540ID_EMPRESA, P05IG2_n12540ID_EMPRESA, P05IG2_A12574ID_TIAES, P05IG2_A12541FECHA, P05IG2_n12541FECHA, P05IG2_A12548HOJA_DE_RU, P05IG2_n12548HOJA_DE_RU, P05IG2_A12573KILOS_P, P05IG2_n12573KILOS_P, P05IG2_A12552ID_SECCION,
            P05IG2_n12552ID_SECCION, P05IG2_A12545ID_MAQUINA, P05IG2_n12545ID_MAQUINA, P05IG2_A12563ID_DEFECTO, P05IG2_n12563ID_DEFECTO, P05IG2_A12572METROS_P, P05IG2_n12572METROS_P, P05IG2_A12562TIPO_PRODU, P05IG2_n12562TIPO_PRODU
            }
            , new Object[] {
            P05IG3_A544HisCodPar, P05IG3_A545HisCodReo, P05IG3_A539HisBarCod, P05IG3_A396EmprCod, P05IG3_A540HisBarKgm, P05IG3_n540HisBarKgm, P05IG3_A541HisBarMtr, P05IG3_n541HisBarMtr, P05IG3_A833TipDefCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV9HisCodReo ;
   private byte AV19Hisreo ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte A545HisCodReo ;
   private short AV17Stat ;
   private short AV15hnd ;
   private short A12563ID_DEFECTO ;
   private short AV27Tipdefcod ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV8HisBarCod ;
   private int A539HisBarCod ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A12573KILOS_P ;
   private java.math.BigDecimal A12572METROS_P ;
   private java.math.BigDecimal AV28HisBarKgm ;
   private java.math.BigDecimal AV26HisBarMtr ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private String AV20UsurCod ;
   private String AV21Station ;
   private String AV25EmprCod ;
   private String GXv_char1[] ;
   private String AV22EmprNom ;
   private String GXv_char2[] ;
   private String AV11Carpeta ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV16NomInf ;
   private String scmdbuf ;
   private String A12540ID_EMPRESA ;
   private String AV10HisCodPar ;
   private String AV29TipMaqCod ;
   private String A544HisCodPar ;
   private String A396EmprCod ;
   private java.util.Date AV24Hhmmss ;
   private java.util.Date AV18Fec2 ;
   private java.util.Date Gx_date ;
   private java.util.Date AV23Fec1 ;
   private java.util.Date A12541FECHA ;
   private boolean Cond_result ;
   private boolean n12540ID_EMPRESA ;
   private boolean n12541FECHA ;
   private boolean n12548HOJA_DE_RU ;
   private boolean n12573KILOS_P ;
   private boolean n12552ID_SECCION ;
   private boolean n12545ID_MAQUINA ;
   private boolean n12563ID_DEFECTO ;
   private boolean n12572METROS_P ;
   private boolean n12562TIPO_PRODU ;
   private boolean returnInSub ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private String AV14File ;
   private String AV12Control ;
   private String A12574ID_TIAES ;
   private String A12548HOJA_DE_RU ;
   private String A12552ID_SECCION ;
   private String A12545ID_MAQUINA ;
   private String A12562TIPO_PRODU ;
   private IDataStoreProvider pr_default ;
   private String[] P05IG2_A12540ID_EMPRESA ;
   private boolean[] P05IG2_n12540ID_EMPRESA ;
   private String[] P05IG2_A12574ID_TIAES ;
   private java.util.Date[] P05IG2_A12541FECHA ;
   private boolean[] P05IG2_n12541FECHA ;
   private String[] P05IG2_A12548HOJA_DE_RU ;
   private boolean[] P05IG2_n12548HOJA_DE_RU ;
   private java.math.BigDecimal[] P05IG2_A12573KILOS_P ;
   private boolean[] P05IG2_n12573KILOS_P ;
   private String[] P05IG2_A12552ID_SECCION ;
   private boolean[] P05IG2_n12552ID_SECCION ;
   private String[] P05IG2_A12545ID_MAQUINA ;
   private boolean[] P05IG2_n12545ID_MAQUINA ;
   private short[] P05IG2_A12563ID_DEFECTO ;
   private boolean[] P05IG2_n12563ID_DEFECTO ;
   private java.math.BigDecimal[] P05IG2_A12572METROS_P ;
   private boolean[] P05IG2_n12572METROS_P ;
   private String[] P05IG2_A12562TIPO_PRODU ;
   private boolean[] P05IG2_n12562TIPO_PRODU ;
   private String[] P05IG3_A544HisCodPar ;
   private byte[] P05IG3_A545HisCodReo ;
   private int[] P05IG3_A539HisBarCod ;
   private String[] P05IG3_A396EmprCod ;
   private java.math.BigDecimal[] P05IG3_A540HisBarKgm ;
   private boolean[] P05IG3_n540HisBarKgm ;
   private java.math.BigDecimal[] P05IG3_A541HisBarMtr ;
   private boolean[] P05IG3_n541HisBarMtr ;
   private short[] P05IG3_A833TipDefCod ;
}

final  class aptiaescontrol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05IG2", "SELECT ID_EMPRESA, ID_TIAES, FECHA, HOJA_DE_RU, KILOS_P, ID_SECCION, ID_MAQUINA, ID_DEFECTO, METROS_P, TIPO_PRODU FROM TXPTIAES WHERE (ID_EMPRESA = ? and FECHA >= ?) AND (FECHA <= ?) ORDER BY ID_EMPRESA, FECHA, TIPO_PRODU ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05IG3", "SELECT HisCodPar, HisCodReo, HisBarCod, EmprCod, HisBarKgm, HisBarMtr, TipDefCod FROM TXPHISREO WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ? ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
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
      }
   }

}

