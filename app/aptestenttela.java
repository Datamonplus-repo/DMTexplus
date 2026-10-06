package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptestenttela extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptestenttela pgm = new aptestenttela (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptestenttela( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptestenttela.class ), "" );
   }

   public aptestenttela( int remoteHandle ,
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
      GXv_char1[0] = AV13EmprCod ;
      GXv_char2[0] = AV20EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      aptestenttela.this.AV13EmprCod = GXv_char1[0] ;
      aptestenttela.this.AV20EmprNom = GXv_char2[0] ;
      aptestenttela.this.AV8UsurCod = GXv_char3[0] ;
      GXt_char4 = AV48ddmmaaaa ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEINI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      aptestenttela.this.AV13EmprCod = GXv_char3[0] ;
      aptestenttela.this.GXt_char4 = GXv_char1[0] ;
      AV48ddmmaaaa = GXt_char4 ;
      AV10Fec1 = ((GXutil.strcmp("", AV48ddmmaaaa)==0) ? localUtil.ctod( "01/01/01", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) : localUtil.ctod( AV48ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      GXt_char4 = AV48ddmmaaaa ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEFIN", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      aptestenttela.this.AV13EmprCod = GXv_char3[0] ;
      aptestenttela.this.GXt_char4 = GXv_char1[0] ;
      AV48ddmmaaaa = GXt_char4 ;
      AV11Fec2 = ((GXutil.strcmp("", AV48ddmmaaaa)==0) ? GXutil.today( ) : localUtil.ctod( AV48ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      GXt_char4 = AV12Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char3) ;
      aptestenttela.this.GXt_char4 = GXv_char3[0] ;
      AV12Carpeta = GXt_char4 ;
      GXt_char4 = AV12Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      aptestenttela.this.GXt_char4 = GXv_char3[0] ;
      AV12Carpeta = ((GXutil.strcmp("", AV12Carpeta)==0) ? GXt_char4 : AV12Carpeta) ;
      AV14NomInf = httpContext.getMessage( "Test_Entradas TELA-DATOS v1", "") ;
      AV15File = GXutil.trim( AV12Carpeta) + "\\" + GXutil.trim( AV14NomInf) + httpContext.getMessage( ".csv", "") ;
      AV29NomInf2 = httpContext.getMessage( "Test_Entradas TELA-DATOS_DETALLE v1", "") ;
      AV28File2 = GXutil.trim( AV12Carpeta) + "\\" + GXutil.trim( AV29NomInf2) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV15File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV19Stat = GXutil.deleteFile( AV15File) ;
      }
      if ( new app.core.file(remoteHandle, context).executeUdp( AV28File2) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV30Stat2 = GXutil.deleteFile( AV28File2) ;
      }
      GXt_int5 = AV18hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV15File, GXv_int6) ;
      aptestenttela.this.GXt_int5 = GXv_int6[0] ;
      AV18hnd = GXt_int5 ;
      GXt_int5 = AV31hnd2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV28File2, GXv_int6) ;
      aptestenttela.this.GXt_int5 = GXv_int6[0] ;
      AV31hnd2 = GXt_int5 ;
      AV16Control = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Seccion", "") + ";" + httpContext.getMessage( "Kg/Mt", "") ;
      GXt_int7 = AV19Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV16Control, GXv_int8) ;
      aptestenttela.this.GXt_int7 = GXv_int8[0] ;
      AV19Stat = GXt_int7 ;
      AV32Control2 = httpContext.getMessage( "N recpecion", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Seccion", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Metros", "") + ";" + httpContext.getMessage( "Almacen", "") ;
      GXt_int7 = AV30Stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV31hnd2, AV32Control2, GXv_int8) ;
      aptestenttela.this.GXt_int7 = GXv_int8[0] ;
      AV30Stat2 = GXt_int7 ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV39Seccion[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV39Seccion[1-1] = httpContext.getMessage( "Tinte", "") ;
      AV39Seccion[2-1] = httpContext.getMessage( "Estampacion", "") ;
      AV39Seccion[3-1] = httpContext.getMessage( "Prefijados", "") ;
      AV39Seccion[4-1] = httpContext.getMessage( "Tinte+Estampacion", "") ;
      AV39Seccion[5-1] = httpContext.getMessage( "Prefijados+Tinte", "") ;
      AV39Seccion[6-1] = httpContext.getMessage( "Sin Definir", "") ;
      AV39Seccion[7-1] = httpContext.getMessage( "Sin Definir", "") ;
      AV39Seccion[8-1] = httpContext.getMessage( "Estampacion Interna", "") ;
      AV39Seccion[9-1] = httpContext.getMessage( "Prefijado+Tinte+Estampacion", "") ;
      AV39Seccion[20-1] = httpContext.getMessage( "Sin VALOR", "") ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV46Tab_kg[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV47Tab_mt[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV44Tab_sec[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27j = 1 ;
      /* Using cursor P05W12 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV10Fec1, AV11Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5W12 = false ;
         A396EmprCod = P05W12_A396EmprCod[0] ;
         A44AlbRecCod = P05W12_A44AlbRecCod[0] ;
         A7501AlbRecSec = P05W12_A7501AlbRecSec[0] ;
         n7501AlbRecSec = P05W12_n7501AlbRecSec[0] ;
         A49AlbRFen = P05W12_A49AlbRFen[0] ;
         A55AlbRReo = P05W12_A55AlbRReo[0] ;
         if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 )
         {
            AV34Kilos = DecimalUtil.doubleToDec(0) ;
            AV35Metros = DecimalUtil.doubleToDec(0) ;
            GX_I = 1 ;
            while ( GX_I <= 3 )
            {
               AV46Tab_kg[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 3 )
            {
               AV47Tab_mt[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 3 )
            {
               AV44Tab_sec[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV27j = 1 ;
            AV25Fecha = A49AlbRFen ;
            AV21anyo = (short)(GXutil.year( AV25Fecha)) ;
            AV33mes = (byte)(GXutil.month( AV25Fecha)) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05W12_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P05W12_A49AlbRFen[0]), GXutil.resetTime(A49AlbRFen)) )
            {
               brk5W12 = false ;
               A44AlbRecCod = P05W12_A44AlbRecCod[0] ;
               A7501AlbRecSec = P05W12_A7501AlbRecSec[0] ;
               n7501AlbRecSec = P05W12_n7501AlbRecSec[0] ;
               A55AlbRReo = P05W12_A55AlbRReo[0] ;
               if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 )
               {
                  AV40Kgs = DecimalUtil.doubleToDec(0) ;
                  AV41mts = DecimalUtil.doubleToDec(0) ;
                  AV34Kilos = DecimalUtil.doubleToDec(0) ;
                  AV35Metros = DecimalUtil.doubleToDec(0) ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05W12_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P05W12_A49AlbRFen[0]), GXutil.resetTime(A49AlbRFen)) && ( P05W12_A7501AlbRecSec[0] == A7501AlbRecSec ) )
                  {
                     brk5W12 = false ;
                     A44AlbRecCod = P05W12_A44AlbRecCod[0] ;
                     GXv_char3[0] = AV49Almacen ;
                     new app.pvxalbealm(remoteHandle, context).execute( A44AlbRecCod, GXv_char3) ;
                     aptestenttela.this.AV49Almacen = GXv_char3[0] ;
                     AV40Kgs = DecimalUtil.doubleToDec(0) ;
                     AV41mts = DecimalUtil.doubleToDec(0) ;
                     AV34Kilos = DecimalUtil.doubleToDec(0) ;
                     AV35Metros = DecimalUtil.doubleToDec(0) ;
                     /* Using cursor P05W13 */
                     pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                     while ( (pr_default.getStatus(1) != 101) )
                     {
                        A2159AlbRecPie = P05W13_A2159AlbRecPie[0] ;
                        A2155AlbRecKgm = P05W13_A2155AlbRecKgm[0] ;
                        A2157AlbRecMtr = P05W13_A2157AlbRecMtr[0] ;
                        GXv_int8[0] = AV50PasoaTXP ;
                        new app.pvxroeac(remoteHandle, context).execute( A2159AlbRecPie, GXv_int8) ;
                        aptestenttela.this.AV50PasoaTXP = GXv_int8[0] ;
                        if ( ( ( GXutil.strcmp(AV49Almacen, "12") == 0 ) && ( AV50PasoaTXP == 1 ) ) || ( ( GXutil.strcmp(AV49Almacen, "12") != 0 ) ) )
                        {
                           AV40Kgs = AV40Kgs.add(((A2155AlbRecKgm))) ;
                           AV41mts = AV41mts.add(((A2157AlbRecMtr))) ;
                        }
                        pr_default.readNext(1);
                     }
                     pr_default.close(1);
                     AV34Kilos = AV40Kgs ;
                     AV35Metros = AV41mts ;
                     AV32Control2 = GXutil.str( A44AlbRecCod, 8, 0) + ";" + localUtil.dtoc( AV25Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( A7501AlbRecSec, 3, 0) + ";" + GXutil.str( AV34Kilos, 9, 2) + ";" + GXutil.str( AV35Metros, 9, 2) + ";" + AV49Almacen ;
                     GXt_int7 = AV30Stat2 ;
                     GXv_int8[0] = GXt_int7 ;
                     new app.core.fputs(remoteHandle, context).execute( AV31hnd2, AV32Control2, GXv_int8) ;
                     aptestenttela.this.GXt_int7 = GXv_int8[0] ;
                     AV30Stat2 = GXt_int7 ;
                     System.out.println( AV32Control2 );
                     if ( A7501AlbRecSec == 1 )
                     {
                        AV40Kgs = AV34Kilos ;
                        AV41mts = DecimalUtil.doubleToDec(0) ;
                        AV43CodSeccion = httpContext.getMessage( "TI", "") ;
                        /* Execute user subroutine: 'SUMOTABLA' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                     if ( A7501AlbRecSec == 2 )
                     {
                        AV40Kgs = DecimalUtil.doubleToDec(0) ;
                        AV41mts = AV35Metros ;
                        AV43CodSeccion = httpContext.getMessage( "ES", "") ;
                        /* Execute user subroutine: 'SUMOTABLA' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                     if ( ( A7501AlbRecSec == 4 ) || ( A7501AlbRecSec == 7 ) )
                     {
                        AV40Kgs = AV34Kilos ;
                        AV41mts = DecimalUtil.doubleToDec(0) ;
                        AV43CodSeccion = httpContext.getMessage( "TI", "") ;
                        /* Execute user subroutine: 'SUMOTABLA' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        AV40Kgs = DecimalUtil.doubleToDec(0) ;
                        AV41mts = AV35Metros ;
                        AV43CodSeccion = httpContext.getMessage( "ES", "") ;
                        /* Execute user subroutine: 'SUMOTABLA' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                     if ( A7501AlbRecSec == 5 )
                     {
                        AV40Kgs = AV34Kilos ;
                        AV41mts = DecimalUtil.doubleToDec(0) ;
                        AV43CodSeccion = httpContext.getMessage( "TI", "") ;
                        /* Execute user subroutine: 'SUMOTABLA' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                     brk5W12 = true ;
                     pr_default.readNext(0);
                  }
               }
               if ( ! brk5W12 )
               {
                  brk5W12 = true ;
                  pr_default.readNext(0);
               }
            }
            AV26i = 1 ;
            while ( AV26i <= 3 )
            {
               if ( GXutil.strcmp(AV44Tab_sec[AV26i-1], "") == 0 )
               {
                  if (true) break;
               }
               AV43CodSeccion = AV44Tab_sec[AV26i-1] ;
               AV34Kilos = AV46Tab_kg[AV26i-1] ;
               AV35Metros = AV47Tab_mt[AV26i-1] ;
               AV37SecNomf = ((GXutil.strcmp(AV43CodSeccion, httpContext.getMessage( "TI", ""))==0) ? httpContext.getMessage( "TINTE", "") : httpContext.getMessage( "ESTAMPACION", "")) ;
               AV16Control = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( AV25Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + AV43CodSeccion + ";" + A396EmprCod + AV43CodSeccion + ";" + AV37SecNomf + ";" ;
               if ( AV34Kilos.doubleValue() > 0 )
               {
                  AV16Control += GXutil.str( AV34Kilos, 9, 2) ;
               }
               else
               {
                  AV16Control += GXutil.str( AV35Metros, 9, 2) ;
               }
               GXt_int7 = AV19Stat ;
               GXv_int8[0] = GXt_int7 ;
               new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV16Control, GXv_int8) ;
               aptestenttela.this.GXt_int7 = GXv_int8[0] ;
               AV19Stat = GXt_int7 ;
               AV26i = (int)(AV26i+1) ;
            }
         }
         if ( ! brk5W12 )
         {
            brk5W12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      GXt_int7 = AV19Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV18hnd, GXv_int8) ;
      aptestenttela.this.GXt_int7 = GXv_int8[0] ;
      AV19Stat = GXt_int7 ;
      GXt_int7 = AV30Stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV31hnd2, GXv_int8) ;
      aptestenttela.this.GXt_int7 = GXv_int8[0] ;
      AV30Stat2 = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'SUMOTABLA' Routine */
      returnInSub = false ;
      AV26i = 1 ;
      AV45altaseccion = (byte)(0) ;
      while ( AV26i <= 3 )
      {
         if ( GXutil.strcmp(AV44Tab_sec[AV26i-1], "") == 0 )
         {
            AV45altaseccion = (byte)(1) ;
            if (true) break;
         }
         if ( GXutil.strcmp(AV44Tab_sec[AV26i-1], AV43CodSeccion) == 0 )
         {
            AV46Tab_kg[AV26i-1] = AV46Tab_kg[AV26i-1].add(AV40Kgs) ;
            AV47Tab_mt[AV26i-1] = AV47Tab_mt[AV26i-1].add(AV41mts) ;
            AV45altaseccion = (byte)(0) ;
            if (true) break;
         }
         AV26i = (int)(AV26i+1) ;
      }
      if ( AV45altaseccion == 1 )
      {
         AV44Tab_sec[AV27j-1] = AV43CodSeccion ;
         AV46Tab_kg[AV27j-1] = AV40Kgs ;
         AV47Tab_mt[AV27j-1] = AV41mts ;
         AV27j = (int)(AV27j+1) ;
      }
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptestenttela.class);
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
      AV13EmprCod = "" ;
      AV20EmprNom = "" ;
      AV48ddmmaaaa = "" ;
      AV10Fec1 = GXutil.nullDate() ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      AV11Fec2 = GXutil.nullDate() ;
      AV12Carpeta = "" ;
      GXt_char4 = "" ;
      AV14NomInf = "" ;
      AV15File = "" ;
      AV29NomInf2 = "" ;
      AV28File2 = "" ;
      GXv_int6 = new long[1] ;
      AV16Control = "" ;
      AV32Control2 = "" ;
      AV39Seccion = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV39Seccion[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV46Tab_kg = new java.math.BigDecimal[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV46Tab_kg[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV47Tab_mt = new java.math.BigDecimal[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV47Tab_mt[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV44Tab_sec = new String[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV44Tab_sec[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P05W12_A396EmprCod = new String[] {""} ;
      P05W12_A44AlbRecCod = new int[1] ;
      P05W12_A7501AlbRecSec = new short[1] ;
      P05W12_n7501AlbRecSec = new boolean[] {false} ;
      P05W12_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P05W12_A55AlbRReo = new String[] {""} ;
      A396EmprCod = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A55AlbRReo = "" ;
      AV34Kilos = DecimalUtil.ZERO ;
      AV35Metros = DecimalUtil.ZERO ;
      AV25Fecha = GXutil.nullDate() ;
      AV40Kgs = DecimalUtil.ZERO ;
      AV41mts = DecimalUtil.ZERO ;
      AV49Almacen = "" ;
      GXv_char3 = new String[1] ;
      P05W13_A396EmprCod = new String[] {""} ;
      P05W13_A44AlbRecCod = new int[1] ;
      P05W13_A2159AlbRecPie = new String[] {""} ;
      P05W13_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05W13_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      AV43CodSeccion = "" ;
      AV37SecNomf = "" ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptestenttela__default(),
         new Object[] {
             new Object[] {
            P05W12_A396EmprCod, P05W12_A44AlbRecCod, P05W12_A7501AlbRecSec, P05W12_n7501AlbRecSec, P05W12_A49AlbRFen, P05W12_A55AlbRReo
            }
            , new Object[] {
            P05W13_A396EmprCod, P05W13_A44AlbRecCod, P05W13_A2159AlbRecPie, P05W13_A2155AlbRecKgm, P05W13_A2157AlbRecMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Stat ;
   private byte AV30Stat2 ;
   private byte AV33mes ;
   private byte AV50PasoaTXP ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV45altaseccion ;
   private short A7501AlbRecSec ;
   private short AV21anyo ;
   private short Gx_err ;
   private int GX_I ;
   private int AV27j ;
   private int A44AlbRecCod ;
   private int AV26i ;
   private long AV18hnd ;
   private long AV31hnd2 ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal AV46Tab_kg[] ;
   private java.math.BigDecimal AV47Tab_mt[] ;
   private java.math.BigDecimal AV34Kilos ;
   private java.math.BigDecimal AV35Metros ;
   private java.math.BigDecimal AV40Kgs ;
   private java.math.BigDecimal AV41mts ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV13EmprCod ;
   private String AV20EmprNom ;
   private String AV48ddmmaaaa ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV12Carpeta ;
   private String GXt_char4 ;
   private String AV14NomInf ;
   private String AV29NomInf2 ;
   private String AV39Seccion[] ;
   private String AV44Tab_sec[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A55AlbRReo ;
   private String AV49Almacen ;
   private String GXv_char3[] ;
   private String A2159AlbRecPie ;
   private String AV43CodSeccion ;
   private String AV37SecNomf ;
   private java.util.Date AV10Fec1 ;
   private java.util.Date AV11Fec2 ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV25Fecha ;
   private boolean Cond_result ;
   private boolean brk5W12 ;
   private boolean n7501AlbRecSec ;
   private boolean returnInSub ;
   private String AV15File ;
   private String AV28File2 ;
   private String AV16Control ;
   private String AV32Control2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05W12_A396EmprCod ;
   private int[] P05W12_A44AlbRecCod ;
   private short[] P05W12_A7501AlbRecSec ;
   private boolean[] P05W12_n7501AlbRecSec ;
   private java.util.Date[] P05W12_A49AlbRFen ;
   private String[] P05W12_A55AlbRReo ;
   private String[] P05W13_A396EmprCod ;
   private int[] P05W13_A44AlbRecCod ;
   private String[] P05W13_A2159AlbRecPie ;
   private java.math.BigDecimal[] P05W13_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P05W13_A2157AlbRecMtr ;
}

final  class aptestenttela__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05W12", "SELECT EmprCod, AlbRecCod, AlbRecSec, AlbRFen, AlbRReo FROM TXPALBREC WHERE (EmprCod = ? and AlbRFen >= ?) AND (( AlbRecSec = 1 or AlbRecSec = 2 or AlbRecSec = 4 or AlbRecSec = 5 or AlbRecSec = 7)) AND (AlbRFen <= ?) ORDER BY EmprCod, AlbRFen, AlbRecSec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05W13", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               return;
      }
   }

}

