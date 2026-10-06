package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apmps003 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apmps003 pgm = new apmps003 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apmps003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apmps003.class ), "" );
   }

   public apmps003( int remoteHandle ,
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
      apmps003.this.AV13EmprCod = GXv_char1[0] ;
      apmps003.this.AV20EmprNom = GXv_char2[0] ;
      apmps003.this.AV8UsurCod = GXv_char3[0] ;
      GXt_char4 = AV12Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char3) ;
      apmps003.this.GXt_char4 = GXv_char3[0] ;
      AV12Carpeta = GXt_char4 ;
      GXt_char4 = AV12Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apmps003.this.GXt_char4 = GXv_char3[0] ;
      AV12Carpeta = ((GXutil.strcmp("", AV12Carpeta)==0) ? GXt_char4 : AV12Carpeta) ;
      AV14NomInf = httpContext.getMessage( "MPS-DATOS.V0", "") ;
      AV15File = GXutil.trim( AV12Carpeta) + "\\" + GXutil.trim( AV14NomInf) + httpContext.getMessage( ".csv", "") ;
      AV42NomInf2 = httpContext.getMessage( "MPS-DATOS.V0_DETAIL", "") ;
      AV41File2 = GXutil.trim( AV12Carpeta) + "\\" + GXutil.trim( AV42NomInf2) + httpContext.getMessage( ".csv", "") ;
      AV47NomInf3 = httpContext.getMessage( "MPS-DATOS.V0_DETAIL_Incidencias", "") ;
      AV48File3 = GXutil.trim( AV12Carpeta) + "\\" + GXutil.trim( AV47NomInf3) + httpContext.getMessage( ".csv", "") ;
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
      if ( new app.core.file(remoteHandle, context).executeUdp( AV41File2) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV43Stat2 = GXutil.deleteFile( AV41File2) ;
      }
      if ( new app.core.file(remoteHandle, context).executeUdp( AV48File3) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV51Stat3 = GXutil.deleteFile( AV48File3) ;
      }
      GXt_int5 = AV18hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV15File, GXv_int6) ;
      apmps003.this.GXt_int5 = GXv_int6[0] ;
      AV18hnd = GXt_int5 ;
      GXt_int5 = AV44hnd2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV41File2, GXv_int6) ;
      apmps003.this.GXt_int5 = GXv_int6[0] ;
      AV44hnd2 = GXt_int5 ;
      GXt_int5 = AV49hnd3 ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV48File3, GXv_int6) ;
      apmps003.this.GXt_int5 = GXv_int6[0] ;
      AV49hnd3 = GXt_int5 ;
      AV16Control = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Seccion", "") + ";" + httpContext.getMessage( "Fase", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Metros", "") ;
      GXt_int7 = AV19Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV16Control, GXv_int8) ;
      apmps003.this.GXt_int7 = GXv_int8[0] ;
      AV19Stat = GXt_int7 ;
      AV45Control2 = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Seccion", "") + ";" + httpContext.getMessage( "Fase", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Metros", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Fecha HDR", "") + ";" + httpContext.getMessage( "Sit", "") ;
      GXt_int7 = AV43Stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV44hnd2, AV45Control2, GXv_int8) ;
      apmps003.this.GXt_int7 = GXv_int8[0] ;
      AV43Stat2 = GXt_int7 ;
      AV52Control3 = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Seccion", "") + ";" + httpContext.getMessage( "Fase", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Metros", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Fecha HDR", "") + ";" + httpContext.getMessage( "Sit", "") + ";" + httpContext.getMessage( "Orden", "") + ";" + httpContext.getMessage( "Fase", "") + ";" + httpContext.getMessage( "Incidencia", "") ;
      GXt_int7 = AV51Stat3 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV49hnd3, AV52Control3, GXv_int8) ;
      apmps003.this.GXt_int7 = GXv_int8[0] ;
      AV51Stat3 = GXt_int7 ;
      AV34i = 0 ;
      AV39j = 1 ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV35Tab_fase[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV36Tab_secc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV37Tab_k[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV38Tab_m[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV29Fecha = GXutil.today( ) ;
      /* Using cursor P05S43 */
      pr_default.execute(0, new Object[] {AV13EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05S43_A396EmprCod[0] ;
         A213BarSit = P05S43_A213BarSit[0] ;
         A159BarFecGen = P05S43_A159BarFecGen[0] ;
         A130BarCodPar = P05S43_A130BarCodPar[0] ;
         A132BarCodReo = P05S43_A132BarCodReo[0] ;
         A129BarCod = P05S43_A129BarCod[0] ;
         A166BarKgm = P05S43_A166BarKgm[0] ;
         A184BarMtr = P05S43_A184BarMtr[0] ;
         A166BarKgm = P05S43_A166BarKgm[0] ;
         A184BarMtr = P05S43_A184BarMtr[0] ;
         AV31Barkgm = A166BarKgm ;
         AV32Barmtr = A184BarMtr ;
         AV16Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Procesando HDR... ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + GXutil.str( A213BarSit, 2, 0) ;
         System.out.println( AV16Control );
         AV53InicioHdr = (byte)(0) ;
         /* Using cursor P05S44 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk5S43 = false ;
            A6162SecCodF = P05S44_A6162SecCodF[0] ;
            n6162SecCodF = P05S44_n6162SecCodF[0] ;
            A153BarFasEst = P05S44_A153BarFasEst[0] ;
            A194BarOrdLin = P05S44_A194BarOrdLin[0] ;
            A6163SecNomF = P05S44_A6163SecNomF[0] ;
            n6163SecNomF = P05S44_n6163SecNomF[0] ;
            A460FasDsc = P05S44_A460FasDsc[0] ;
            A457FasCod = P05S44_A457FasCod[0] ;
            A758ProCod = P05S44_A758ProCod[0] ;
            A6162SecCodF = P05S44_A6162SecCodF[0] ;
            n6162SecCodF = P05S44_n6162SecCodF[0] ;
            A460FasDsc = P05S44_A460FasDsc[0] ;
            A6163SecNomF = P05S44_A6163SecNomF[0] ;
            n6163SecNomF = P05S44_n6163SecNomF[0] ;
            AV27kilos = DecimalUtil.doubleToDec(0) ;
            AV28metros = DecimalUtil.doubleToDec(0) ;
            AV50HayRgtos = (byte)(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P05S44_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P05S44_A6162SecCodF[0], A6162SecCodF) == 0 ) )
            {
               brk5S43 = false ;
               A153BarFasEst = P05S44_A153BarFasEst[0] ;
               A194BarOrdLin = P05S44_A194BarOrdLin[0] ;
               A6163SecNomF = P05S44_A6163SecNomF[0] ;
               n6163SecNomF = P05S44_n6163SecNomF[0] ;
               A460FasDsc = P05S44_A460FasDsc[0] ;
               A457FasCod = P05S44_A457FasCod[0] ;
               A758ProCod = P05S44_A758ProCod[0] ;
               A460FasDsc = P05S44_A460FasDsc[0] ;
               A6163SecNomF = P05S44_A6163SecNomF[0] ;
               n6163SecNomF = P05S44_n6163SecNomF[0] ;
               if ( P05S44_A129BarCod[0] == A129BarCod )
               {
                  if ( P05S44_A132BarCodReo[0] == A132BarCodReo )
                  {
                     if ( GXutil.strcmp(P05S44_A130BarCodPar[0], A130BarCodPar) == 0 )
                     {
                        if ( ! (GXutil.strcmp("", A6162SecCodF)==0) )
                        {
                           if ( A153BarFasEst < 2 )
                           {
                              GXv_char3[0] = A396EmprCod ;
                              GXv_int9[0] = A129BarCod ;
                              GXv_int8[0] = A132BarCodReo ;
                              GXv_char2[0] = A130BarCodPar ;
                              GXv_int10[0] = A194BarOrdLin ;
                              GXv_char1[0] = AV46Incidencia ;
                              new app.pmps002(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_int8, GXv_char2, GXv_int10, GXv_char1) ;
                              apmps003.this.A396EmprCod = GXv_char3[0] ;
                              apmps003.this.A129BarCod = GXv_int9[0] ;
                              apmps003.this.A132BarCodReo = GXv_int8[0] ;
                              apmps003.this.A130BarCodPar = GXv_char2[0] ;
                              apmps003.this.A194BarOrdLin = GXv_int10[0] ;
                              apmps003.this.AV46Incidencia = GXv_char1[0] ;
                              if ( (GXutil.strcmp("", AV46Incidencia)==0) )
                              {
                                 AV50HayRgtos = (byte)(1) ;
                                 AV27kilos = AV31Barkgm ;
                                 AV28metros = AV32Barmtr ;
                                 AV16Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Procesando Fase ", "") + A457FasCod + " " + A460FasDsc + " " + A6163SecNomF + httpContext.getMessage( "Incidencia.. ", "") + AV46Incidencia ;
                                 System.out.println( AV16Control );
                                 AV33fascod = A457FasCod ;
                                 AV25Seccodf = A6162SecCodF ;
                                 AV26SecNomF = A6163SecNomF ;
                                 GXv_char3[0] = AV30Fasdsc ;
                                 new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, AV33fascod, GXv_char3) ;
                                 apmps003.this.AV30Fasdsc = GXv_char3[0] ;
                              }
                              else
                              {
                                 AV52Control3 = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( AV29Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + A6162SecCodF + ";" + A396EmprCod + A6162SecCodF + ";" + A6163SecNomF + ";" + A460FasDsc + ";" + GXutil.str( AV31Barkgm, 9, 2) + ";" + GXutil.str( AV32Barmtr, 9, 2) + ";" ;
                                 AV52Control3 += GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( A213BarSit, 2, 0) + ";" + GXutil.str( A194BarOrdLin, 4, 0) + ";" + A457FasCod + ";" + AV46Incidencia ;
                                 GXt_int7 = AV51Stat3 ;
                                 GXv_int8[0] = GXt_int7 ;
                                 new app.core.fputs(remoteHandle, context).execute( AV49hnd3, AV52Control3, GXv_int8) ;
                                 apmps003.this.GXt_int7 = GXv_int8[0] ;
                                 AV51Stat3 = GXt_int7 ;
                              }
                           }
                        }
                     }
                  }
               }
               brk5S43 = true ;
               pr_default.readNext(1);
            }
            if ( AV50HayRgtos == 1 )
            {
               AV45Control2 = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( AV29Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + AV25Seccodf + ";" + A396EmprCod + AV25Seccodf + ";" + AV26SecNomF + ";" + AV30Fasdsc + ";" + GXutil.str( AV27kilos, 9, 2) + ";" + GXutil.str( AV28metros, 9, 2) + ";" ;
               AV45Control2 += GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( A213BarSit, 2, 0) ;
               GXt_int7 = AV43Stat2 ;
               GXv_int8[0] = GXt_int7 ;
               new app.core.fputs(remoteHandle, context).execute( AV44hnd2, AV45Control2, GXv_int8) ;
               apmps003.this.GXt_int7 = GXv_int8[0] ;
               AV43Stat2 = GXt_int7 ;
               /* Execute user subroutine: 'TABLA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV53InicioHdr = (byte)(1) ;
            }
            if ( ! brk5S43 )
            {
               brk5S43 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV34i = 1 ;
      while ( AV34i <= 10000 )
      {
         if ( GXutil.strcmp(AV35Tab_fase[AV34i-1], "") == 0 )
         {
            if (true) break;
         }
         AV33fascod = AV35Tab_fase[AV34i-1] ;
         GXv_char3[0] = AV30Fasdsc ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, AV33fascod, GXv_char3) ;
         apmps003.this.AV30Fasdsc = GXv_char3[0] ;
         AV25Seccodf = AV36Tab_secc[AV34i-1] ;
         /* Using cursor P05S45 */
         pr_default.execute(2, new Object[] {AV13EmprCod, AV25Seccodf});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A6162SecCodF = P05S45_A6162SecCodF[0] ;
            n6162SecCodF = P05S45_n6162SecCodF[0] ;
            A396EmprCod = P05S45_A396EmprCod[0] ;
            A6163SecNomF = P05S45_A6163SecNomF[0] ;
            n6163SecNomF = P05S45_n6163SecNomF[0] ;
            AV26SecNomF = A6163SecNomF ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV27kilos = AV37Tab_k[AV34i-1] ;
         AV28metros = AV38Tab_m[AV34i-1] ;
         AV29Fecha = GXutil.today( ) ;
         AV16Control = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( AV29Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + AV25Seccodf + ";" + A396EmprCod + AV25Seccodf + ";" + AV26SecNomF + ";" + AV30Fasdsc + ";" + GXutil.str( AV27kilos, 9, 2) + ";" + GXutil.str( AV28metros, 9, 2) ;
         GXt_int7 = AV19Stat ;
         GXv_int8[0] = GXt_int7 ;
         new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV16Control, GXv_int8) ;
         apmps003.this.GXt_int7 = GXv_int8[0] ;
         AV19Stat = GXt_int7 ;
         System.out.println( AV16Control );
         AV34i = (int)(AV34i+1) ;
      }
      GXt_int7 = AV19Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV18hnd, GXv_int8) ;
      apmps003.this.GXt_int7 = GXv_int8[0] ;
      AV19Stat = GXt_int7 ;
      GXt_int7 = AV43Stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV44hnd2, GXv_int8) ;
      apmps003.this.GXt_int7 = GXv_int8[0] ;
      AV43Stat2 = GXt_int7 ;
      GXt_int7 = AV51Stat3 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV49hnd3, GXv_int8) ;
      apmps003.this.GXt_int7 = GXv_int8[0] ;
      AV51Stat3 = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'TABLA' Routine */
      returnInSub = false ;
      AV40AltaTabla = (byte)(0) ;
      AV34i = 1 ;
      while ( AV34i <= 10000 )
      {
         if ( GXutil.strcmp(AV36Tab_secc[AV34i-1], "") == 0 )
         {
            AV40AltaTabla = (byte)(1) ;
            if (true) break;
         }
         if ( GXutil.strcmp(AV36Tab_secc[AV34i-1], AV25Seccodf) == 0 )
         {
            AV37Tab_k[AV34i-1] = AV37Tab_k[AV34i-1].add(AV27kilos) ;
            AV38Tab_m[AV34i-1] = AV38Tab_m[AV34i-1].add(AV28metros) ;
            if (true) break;
         }
         AV34i = (int)(AV34i+1) ;
      }
      if ( AV40AltaTabla == 1 )
      {
         AV35Tab_fase[AV39j-1] = AV33fascod ;
         AV37Tab_k[AV39j-1] = AV27kilos ;
         AV38Tab_m[AV39j-1] = AV28metros ;
         AV36Tab_secc[AV39j-1] = AV25Seccodf ;
         AV39j = (int)(AV39j+1) ;
      }
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pmps003.class);
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
      AV12Carpeta = "" ;
      GXt_char4 = "" ;
      AV14NomInf = "" ;
      AV15File = "" ;
      AV42NomInf2 = "" ;
      AV41File2 = "" ;
      AV47NomInf3 = "" ;
      AV48File3 = "" ;
      GXv_int6 = new long[1] ;
      AV16Control = "" ;
      AV45Control2 = "" ;
      AV52Control3 = "" ;
      AV35Tab_fase = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV35Tab_fase[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV36Tab_secc = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV36Tab_secc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV37Tab_k = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV37Tab_k[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV38Tab_m = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV38Tab_m[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV29Fecha = GXutil.nullDate() ;
      scmdbuf = "" ;
      P05S43_A396EmprCod = new String[] {""} ;
      P05S43_A213BarSit = new byte[1] ;
      P05S43_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05S43_A130BarCodPar = new String[] {""} ;
      P05S43_A132BarCodReo = new byte[1] ;
      P05S43_A129BarCod = new int[1] ;
      P05S43_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05S43_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV31Barkgm = DecimalUtil.ZERO ;
      AV32Barmtr = DecimalUtil.ZERO ;
      P05S44_A396EmprCod = new String[] {""} ;
      P05S44_A129BarCod = new int[1] ;
      P05S44_A132BarCodReo = new byte[1] ;
      P05S44_A130BarCodPar = new String[] {""} ;
      P05S44_A6162SecCodF = new String[] {""} ;
      P05S44_n6162SecCodF = new boolean[] {false} ;
      P05S44_A153BarFasEst = new byte[1] ;
      P05S44_A194BarOrdLin = new short[1] ;
      P05S44_A6163SecNomF = new String[] {""} ;
      P05S44_n6163SecNomF = new boolean[] {false} ;
      P05S44_A460FasDsc = new String[] {""} ;
      P05S44_A457FasCod = new String[] {""} ;
      P05S44_A758ProCod = new String[] {""} ;
      A6162SecCodF = "" ;
      A6163SecNomF = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV27kilos = DecimalUtil.ZERO ;
      AV28metros = DecimalUtil.ZERO ;
      GXv_int9 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new short[1] ;
      AV46Incidencia = "" ;
      GXv_char1 = new String[1] ;
      AV33fascod = "" ;
      AV25Seccodf = "" ;
      AV26SecNomF = "" ;
      AV30Fasdsc = "" ;
      GXv_char3 = new String[1] ;
      P05S45_A6162SecCodF = new String[] {""} ;
      P05S45_n6162SecCodF = new boolean[] {false} ;
      P05S45_A396EmprCod = new String[] {""} ;
      P05S45_A6163SecNomF = new String[] {""} ;
      P05S45_n6163SecNomF = new boolean[] {false} ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apmps003__default(),
         new Object[] {
             new Object[] {
            P05S43_A396EmprCod, P05S43_A213BarSit, P05S43_A159BarFecGen, P05S43_A130BarCodPar, P05S43_A132BarCodReo, P05S43_A129BarCod, P05S43_A166BarKgm, P05S43_A184BarMtr
            }
            , new Object[] {
            P05S44_A396EmprCod, P05S44_A129BarCod, P05S44_A132BarCodReo, P05S44_A130BarCodPar, P05S44_A6162SecCodF, P05S44_n6162SecCodF, P05S44_A153BarFasEst, P05S44_A194BarOrdLin, P05S44_A6163SecNomF, P05S44_n6163SecNomF,
            P05S44_A460FasDsc, P05S44_A457FasCod, P05S44_A758ProCod
            }
            , new Object[] {
            P05S45_A6162SecCodF, P05S45_A396EmprCod, P05S45_A6163SecNomF, P05S45_n6163SecNomF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Stat ;
   private byte AV43Stat2 ;
   private byte AV51Stat3 ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV53InicioHdr ;
   private byte A153BarFasEst ;
   private byte AV50HayRgtos ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV40AltaTabla ;
   private short A194BarOrdLin ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int AV34i ;
   private int AV39j ;
   private int GX_I ;
   private int A129BarCod ;
   private int GXv_int9[] ;
   private long AV18hnd ;
   private long AV44hnd2 ;
   private long AV49hnd3 ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal AV37Tab_k[] ;
   private java.math.BigDecimal AV38Tab_m[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV31Barkgm ;
   private java.math.BigDecimal AV32Barmtr ;
   private java.math.BigDecimal AV27kilos ;
   private java.math.BigDecimal AV28metros ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV13EmprCod ;
   private String AV20EmprNom ;
   private String AV12Carpeta ;
   private String GXt_char4 ;
   private String AV14NomInf ;
   private String AV42NomInf2 ;
   private String AV47NomInf3 ;
   private String AV35Tab_fase[] ;
   private String AV36Tab_secc[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6162SecCodF ;
   private String A6163SecNomF ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String GXv_char2[] ;
   private String AV46Incidencia ;
   private String GXv_char1[] ;
   private String AV33fascod ;
   private String AV25Seccodf ;
   private String AV26SecNomF ;
   private String AV30Fasdsc ;
   private String GXv_char3[] ;
   private java.util.Date AV29Fecha ;
   private java.util.Date A159BarFecGen ;
   private boolean Cond_result ;
   private boolean brk5S43 ;
   private boolean n6162SecCodF ;
   private boolean n6163SecNomF ;
   private boolean returnInSub ;
   private String AV15File ;
   private String AV41File2 ;
   private String AV48File3 ;
   private String AV16Control ;
   private String AV45Control2 ;
   private String AV52Control3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05S43_A396EmprCod ;
   private byte[] P05S43_A213BarSit ;
   private java.util.Date[] P05S43_A159BarFecGen ;
   private String[] P05S43_A130BarCodPar ;
   private byte[] P05S43_A132BarCodReo ;
   private int[] P05S43_A129BarCod ;
   private java.math.BigDecimal[] P05S43_A166BarKgm ;
   private java.math.BigDecimal[] P05S43_A184BarMtr ;
   private String[] P05S44_A396EmprCod ;
   private int[] P05S44_A129BarCod ;
   private byte[] P05S44_A132BarCodReo ;
   private String[] P05S44_A130BarCodPar ;
   private String[] P05S44_A6162SecCodF ;
   private boolean[] P05S44_n6162SecCodF ;
   private byte[] P05S44_A153BarFasEst ;
   private short[] P05S44_A194BarOrdLin ;
   private String[] P05S44_A6163SecNomF ;
   private boolean[] P05S44_n6163SecNomF ;
   private String[] P05S44_A460FasDsc ;
   private String[] P05S44_A457FasCod ;
   private String[] P05S44_A758ProCod ;
   private String[] P05S45_A6162SecCodF ;
   private boolean[] P05S45_n6162SecCodF ;
   private String[] P05S45_A396EmprCod ;
   private String[] P05S45_A6163SecNomF ;
   private boolean[] P05S45_n6163SecNomF ;
}

final  class apmps003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05S43", "SELECT T1.EmprCod, T1.BarSit, T1.BarFecGen, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarSit < 9) ORDER BY T1.EmprCod, T1.BarSit, T1.BarFecGen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05S44", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.SecCodF, T1.BarFasEst, T1.BarOrdLin, T3.SecNomF, T2.FasDsc, T1.FasCod, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) LEFT JOIN TXPTSECCI T3 ON T3.EmprCod = T1.EmprCod AND T3.SecCodF = T2.SecCodF) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) AND (T1.BarFasEst < 2) AND (Not (rtrim(T2.SecCodF) IS NULL AND NOT(T2.SecCodF IS NULL))) ORDER BY T1.EmprCod, T2.SecCodF ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05S45", "SELECT SecCodF, EmprCod, SecNomF FROM TXPTSECCI WHERE EmprCod = ? and SecCodF = ? ORDER BY EmprCod, SecCodF ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 28);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 2);
               return;
      }
   }

}

