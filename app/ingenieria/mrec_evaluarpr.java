package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_evaluarpr extends GXProcedure
{
   public mrec_evaluarpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_evaluarpr.class ), "" );
   }

   public mrec_evaluarpr( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      mrec_evaluarpr.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      mrec_evaluarpr.this.AV19EmprCod = aP0;
      mrec_evaluarpr.this.AV12ContCod = aP1;
      mrec_evaluarpr.this.AV37UsurCod = aP2;
      mrec_evaluarpr.this.AV41Ip = aP3[0];
      this.aP3 = aP3;
      mrec_evaluarpr.this.AV52IngresaMTkn = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38Contador = 0 ;
      AV33MRasTxt = GXutil.format( "Ciclo    Evaluar 00. Inicia   Data: Empresa:%1, Codigo:%2,  Usuario:%3, IP:%4, Tkn:%5", AV19EmprCod, AV12ContCod, AV37UsurCod, AV41Ip, AV52IngresaMTkn, "", "", "", "") ;
      new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
      AV20f = false ;
      while ( true )
      {
         gxexitloop = false ;
         if ( gxexitloop )
         {
            break;
         }
         AV38Contador = (long)(AV38Contador+1) ;
         AV28Now = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
         AV43FechaFin = AV28Now ;
         AV43FechaFin = GXutil.dtadd( AV43FechaFin, 60*(-1)) ;
         AV33MRasTxt = GXutil.format( "Ciclo    Evaluar 01. Data: %1. Inicia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Contador), 10, 0), "", "", "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         /* Execute user subroutine: 'LEER EN EMPLIN' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! (GXutil.strcmp("", AV15Data2)==0) )
         {
            AV44FechaIni = localUtil.ctot( AV15Data2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV53DiferenciaHora = DecimalUtil.doubleToDec(GXutil.dtdiffms( AV43FechaFin, AV44FechaIni)/ (double) (3600)) ;
            if ( AV53DiferenciaHora.doubleValue() < 0 )
            {
               AV33MRasTxt = GXutil.format( "Fechas   Evaluar 02. ERROR en fecha Data2. Data: EmpLin (&Data2=%1, DiferenciaHora=%4) entonces --> Fechas:%2-%3.", AV15Data2, localUtil.ttoc( AV44FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV43FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), GXutil.ltrimstr( AV53DiferenciaHora, 10, 2), "", "", "", "", "") ;
               new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
            }
            else if ( AV53DiferenciaHora.doubleValue() > 1 )
            {
               AV43FechaFin = GXutil.dtadd( AV44FechaIni, 3600*(1)) ;
            }
            AV33MRasTxt = GXutil.format( "Fechas   Evaluar 02. Data: EmpLin (&Data2=%1, DiferenciaHora=%4) entonces --> Fechas:%2-%3.", AV15Data2, localUtil.ttoc( AV44FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV43FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), GXutil.ltrimstr( AV53DiferenciaHora, 10, 2), "", "", "", "", "") ;
            new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         }
         else
         {
            AV44FechaIni = GXutil.dtadd( AV43FechaFin, 3600*(-1)) ;
            AV33MRasTxt = GXutil.format( "Fechas   Evaluar 02. Data: Fecha Vacia EmpLin (&Data2=%1) ---> entonces --> Fechas:%2-%3.", AV15Data2, localUtil.ttoc( AV44FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV43FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "") ;
            new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         }
         AV33MRasTxt = GXutil.format( "Ciclo    Evaluar 02. Data: %1. Fechas:%2-%3.", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Contador), 10, 0), localUtil.ttoc( AV44FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV43FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         /* Execute user subroutine: 'CREAR FILTRO' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXt_int1 = AV45Registros ;
         GXv_int2[0] = GXt_int1 ;
         new app.ingenieria.mrechdr_pr(remoteHandle, context).execute( AV19EmprCod, AV37UsurCod, AV41Ip, AV44FechaIni, AV43FechaFin, AV28Now, AV50InFilTkn, GXv_int2) ;
         mrec_evaluarpr.this.GXt_int1 = GXv_int2[0] ;
         AV45Registros = GXt_int1 ;
         AV33MRasTxt = GXutil.format( "Ciclo    Evaluar 03. Data: %1, Registra:%2.", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Contador), 10, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Registros), 12, 0), "", "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         AV46Contar = 0 ;
         /* Using cursor P09SA2 */
         pr_default.execute(0, new Object[] {AV19EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14169MPRecFecEv = P09SA2_A14169MPRecFecEv[0] ;
            A396EmprCod = P09SA2_A396EmprCod[0] ;
            A129BarCod = P09SA2_A129BarCod[0] ;
            A132BarCodReo = P09SA2_A132BarCodReo[0] ;
            A130BarCodPar = P09SA2_A130BarCodPar[0] ;
            A14152MEnvOrd = P09SA2_A14152MEnvOrd[0] ;
            A14153MRecLin = P09SA2_A14153MRecLin[0] ;
            A14166MPRecPLC = P09SA2_A14166MPRecPLC[0] ;
            A14165MPRecVal = P09SA2_A14165MPRecVal[0] ;
            AV8BarCod = A129BarCod ;
            AV10BarCodReo = A132BarCodReo ;
            AV9BarCodPar = A130BarCodPar ;
            AV22MEnvOrd = A14152MEnvOrd ;
            AV27MRecLin = A14153MRecLin ;
            AV23MPRecPLC = A14166MPRecPLC ;
            AV24MPRecVal = A14165MPRecVal ;
            /* Execute user subroutine: 'OBTENER EN BARPAR MAX, MIN' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'AGREGAR EN MPENV' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'EVALUAR Y GRABAR VALOR CORRECTO O INCORRECTO' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV46Contar = (long)(AV46Contar+1) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV33MRasTxt = GXutil.format( "Ciclo    Evaluar 04. Data: %1. Evalua:%2.", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Contador), 10, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Contar), 12, 0), "", "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         /* Execute user subroutine: 'ACTUALIZAREMPLIN' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ACTUALIZARTOKEN' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV33MRasTxt = GXutil.format( "Ciclo    Evaluar 05. Data: %1. Finaliza", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Contador), 10, 0), "", "", "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         if ( AV20f )
         {
            if (true) break;
         }
      }
      AV33MRasTxt = GXutil.format( "Ciclo    Evaluar 99. Finaliza Data: contador:%1, fechas:%2-%3, token:%1, ultimo rastro:%2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Contador), 10, 0), localUtil.ttoc( AV44FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV43FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV52IngresaMTkn, AV33MRasTxt, "", "", "", "") ;
      new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'AGREGAR EN MPENV' Routine */
      returnInSub = false ;
      AV59GXLvl109 = (byte)(0) ;
      /* Using cursor P09SA3 */
      pr_default.execute(1, new Object[] {AV19EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV22MEnvOrd), Short.valueOf(AV32ParFasCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1664ParFasCod = P09SA3_A1664ParFasCod[0] ;
         A14152MEnvOrd = P09SA3_A14152MEnvOrd[0] ;
         A130BarCodPar = P09SA3_A130BarCodPar[0] ;
         A132BarCodReo = P09SA3_A132BarCodReo[0] ;
         A129BarCod = P09SA3_A129BarCod[0] ;
         A396EmprCod = P09SA3_A396EmprCod[0] ;
         AV59GXLvl109 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV59GXLvl109 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPMPEnv

         */
         A396EmprCod = AV19EmprCod ;
         A129BarCod = AV8BarCod ;
         A132BarCodReo = AV10BarCodReo ;
         A130BarCodPar = AV9BarCodPar ;
         A14152MEnvOrd = AV22MEnvOrd ;
         A1664ParFasCod = AV32ParFasCod ;
         A14160MPEnvPLC = AV23MPRecPLC ;
         /* Using cursor P09SA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod), A14160MPEnvPLC});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPEnv");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec_evaluarpr");
      }
   }

   public void S121( )
   {
      /* 'OBTENER EN BARPAR MAX, MIN' Routine */
      returnInSub = false ;
      AV26MPRecValMin = "" ;
      AV25MPRecValMax = "" ;
      AV32ParFasCod = (short)(0) ;
      AV60GXLvl138 = (byte)(0) ;
      /* Using cursor P09SA5 */
      pr_default.execute(3, new Object[] {AV19EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, AV23MPRecPLC, Short.valueOf(AV22MEnvOrd)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A194BarOrdLin = P09SA5_A194BarOrdLin[0] ;
         A14079BarParPLC = P09SA5_A14079BarParPLC[0] ;
         A130BarCodPar = P09SA5_A130BarCodPar[0] ;
         A132BarCodReo = P09SA5_A132BarCodReo[0] ;
         A129BarCod = P09SA5_A129BarCod[0] ;
         A396EmprCod = P09SA5_A396EmprCod[0] ;
         A13991BarParVMn = P09SA5_A13991BarParVMn[0] ;
         A13992BarParVMx = P09SA5_A13992BarParVMx[0] ;
         A1664ParFasCod = P09SA5_A1664ParFasCod[0] ;
         A758ProCod = P09SA5_A758ProCod[0] ;
         AV60GXLvl138 = (byte)(1) ;
         AV26MPRecValMin = A13991BarParVMn ;
         AV25MPRecValMax = A13992BarParVMx ;
         AV32ParFasCod = A1664ParFasCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV60GXLvl138 == 0 )
      {
         AV32ParFasCod = (short)(9999) ;
      }
   }

   public void S131( )
   {
      /* 'EVALUAR Y GRABAR VALOR CORRECTO O INCORRECTO' Routine */
      returnInSub = false ;
      /* Using cursor P09SA6 */
      pr_default.execute(4, new Object[] {AV19EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV22MEnvOrd), Long.valueOf(AV27MRecLin)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxt9SA6 = (byte)(0) ;
         A14153MRecLin = P09SA6_A14153MRecLin[0] ;
         A14152MEnvOrd = P09SA6_A14152MEnvOrd[0] ;
         A130BarCodPar = P09SA6_A130BarCodPar[0] ;
         A132BarCodReo = P09SA6_A132BarCodReo[0] ;
         A129BarCod = P09SA6_A129BarCod[0] ;
         A396EmprCod = P09SA6_A396EmprCod[0] ;
         A14168MPRecEr = P09SA6_A14168MPRecEr[0] ;
         A14169MPRecFecEv = P09SA6_A14169MPRecFecEv[0] ;
         A14687MPRecValMi = P09SA6_A14687MPRecValMi[0] ;
         n14687MPRecValMi = P09SA6_n14687MPRecValMi[0] ;
         A14688MPRecValMa = P09SA6_A14688MPRecValMa[0] ;
         n14688MPRecValMa = P09SA6_n14688MPRecValMa[0] ;
         A14689MPRecParFa = P09SA6_A14689MPRecParFa[0] ;
         n14689MPRecParFa = P09SA6_n14689MPRecParFa[0] ;
         AV29Num_MPRecVal = CommonUtil.decimalVal( AV24MPRecVal, ".") ;
         AV31Num_MPRecValMin = CommonUtil.decimalVal( AV26MPRecValMin, ".") ;
         AV30Num_MPRecValMax = CommonUtil.decimalVal( AV25MPRecValMax, ".") ;
         if ( ( DecimalUtil.compareTo(AV29Num_MPRecVal, AV31Num_MPRecValMin) >= 0 ) && ( DecimalUtil.compareTo(AV29Num_MPRecVal, AV30Num_MPRecValMax) <= 0 ) )
         {
            A14168MPRecEr = false ;
         }
         else
         {
            A14168MPRecEr = true ;
         }
         A14169MPRecFecEv = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
         A14687MPRecValMi = AV26MPRecValMin ;
         n14687MPRecValMi = false ;
         A14688MPRecValMa = AV25MPRecValMax ;
         n14688MPRecValMa = false ;
         A14689MPRecParFa = AV32ParFasCod ;
         n14689MPRecParFa = false ;
         gxt9SA6 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P09SA7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(A14168MPRecEr), A14169MPRecFecEv, Boolean.valueOf(n14687MPRecValMi), A14687MPRecValMi, Boolean.valueOf(n14688MPRecValMa), A14688MPRecValMa, Boolean.valueOf(n14689MPRecParFa), Short.valueOf(A14689MPRecParFa), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
         if ( gxt9SA6 == 1 )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec_evaluarpr");
         }
         if (true) break;
         /* Using cursor P09SA8 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(A14168MPRecEr), A14169MPRecFecEv, Boolean.valueOf(n14687MPRecValMi), A14687MPRecValMi, Boolean.valueOf(n14688MPRecValMa), A14688MPRecValMa, Boolean.valueOf(n14689MPRecParFa), Short.valueOf(A14689MPRecParFa), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
         if ( gxt9SA6 == 1 )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec_evaluarpr");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S141( )
   {
      /* 'ACTUALIZAREMPLIN' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "ingresa a Actualizar en EmpLin:%1-%2.", ""), AV19EmprCod, AV12ContCod, "", "", "", "", "", "", ""), AV57Pgmname) ;
      /* Using cursor P09SA9 */
      pr_default.execute(7, new Object[] {AV19EmprCod, AV12ContCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A313ContCod = P09SA9_A313ContCod[0] ;
         A396EmprCod = P09SA9_A396EmprCod[0] ;
         A7208ContDsc2 = P09SA9_A7208ContDsc2[0] ;
         A1147ContVal2 = P09SA9_A1147ContVal2[0] ;
         A316ContVal = P09SA9_A316ContVal[0] ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "leer      Actualizar en EmpLin:%1-%2.", ""), AV19EmprCod, AV12ContCod, "", "", "", "", "", "", ""), AV57Pgmname) ;
         AV11Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(A7208ContDsc2,"\\|")) ;
         if ( AV11Col_ContDsc2.size() >= 1 )
         {
            AV14Data1 = (String)AV11Col_ContDsc2.elementAt(-1+1) ;
         }
         if ( AV11Col_ContDsc2.size() >= 2 )
         {
            AV15Data2 = (String)AV11Col_ContDsc2.elementAt(-1+2) ;
         }
         if ( AV11Col_ContDsc2.size() >= 3 )
         {
            AV16Data3 = (String)AV11Col_ContDsc2.elementAt(-1+3) ;
         }
         if ( AV11Col_ContDsc2.size() >= 4 )
         {
            AV17Data4 = (String)AV11Col_ContDsc2.elementAt(-1+4) ;
         }
         if ( AV11Col_ContDsc2.size() >= 5 )
         {
            AV18Data5 = (String)AV11Col_ContDsc2.elementAt(-1+5) ;
         }
         if ( GXutil.strcmp(GXutil.trim( AV18Data5), httpContext.getMessage( "No iniciado", "")) == 0 )
         {
            AV20f = true ;
         }
         AV15Data2 = localUtil.ttoc( AV43FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         A1147ContVal2 = AV38Contador ;
         AV16Data3 = GXutil.str( AV38Contador, 10, 0) ;
         AV17Data4 = GXutil.str( AV45Registros, 12, 0) ;
         AV13ContDsc2 = GXutil.trim( AV14Data1) + "|" + GXutil.trim( AV15Data2) + "|" + GXutil.trim( AV16Data3) + "|" + GXutil.trim( AV17Data4) + "|" + GXutil.trim( AV18Data5) ;
         A7208ContDsc2 = GXutil.trim( GXutil.substring( AV13ContDsc2, 1, 100)) ;
         AV33MRasTxt = GXutil.format( "EMPLIN   Evaluar     Actu: &ContCod:%1, FechaFin:%2, ContVal:%3, ContVal2:%4, ContDsc2:%5.", AV12ContCod, AV15Data2, GXutil.ltrimstr( DecimalUtil.doubleToDec(A316ContVal), 8, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(A1147ContVal2), 10, 0), A7208ContDsc2, "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         /* Using cursor P09SA10 */
         pr_default.execute(8, new Object[] {A7208ContDsc2, Long.valueOf(A1147ContVal2), A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S151( )
   {
      /* 'LEER EN EMPLIN' Routine */
      returnInSub = false ;
      AV63GXLvl243 = (byte)(0) ;
      /* Using cursor P09SA11 */
      pr_default.execute(9, new Object[] {AV19EmprCod, AV12ContCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A313ContCod = P09SA11_A313ContCod[0] ;
         A396EmprCod = P09SA11_A396EmprCod[0] ;
         A7208ContDsc2 = P09SA11_A7208ContDsc2[0] ;
         A1147ContVal2 = P09SA11_A1147ContVal2[0] ;
         A316ContVal = P09SA11_A316ContVal[0] ;
         AV63GXLvl243 = (byte)(1) ;
         AV11Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(A7208ContDsc2,"\\|")) ;
         if ( AV11Col_ContDsc2.size() >= 1 )
         {
            AV14Data1 = (String)AV11Col_ContDsc2.elementAt(-1+1) ;
         }
         if ( AV11Col_ContDsc2.size() >= 2 )
         {
            AV15Data2 = (String)AV11Col_ContDsc2.elementAt(-1+2) ;
         }
         if ( AV11Col_ContDsc2.size() >= 3 )
         {
            AV16Data3 = (String)AV11Col_ContDsc2.elementAt(-1+3) ;
         }
         if ( AV11Col_ContDsc2.size() >= 4 )
         {
            AV17Data4 = (String)AV11Col_ContDsc2.elementAt(-1+4) ;
         }
         if ( AV11Col_ContDsc2.size() >= 5 )
         {
            AV18Data5 = (String)AV11Col_ContDsc2.elementAt(-1+5) ;
         }
         if ( GXutil.strcmp(GXutil.trim( AV18Data5), httpContext.getMessage( "No iniciado", "")) == 0 )
         {
            AV20f = true ;
         }
         AV14Data1 = AV15Data2 ;
         AV13ContDsc2 = GXutil.trim( AV14Data1) + "|" + GXutil.trim( AV15Data2) + "|" + GXutil.trim( AV16Data3) + "|" + GXutil.trim( AV17Data4) + "|" + GXutil.trim( AV18Data5) ;
         A7208ContDsc2 = GXutil.trim( GXutil.substring( AV13ContDsc2, 1, 100)) ;
         AV33MRasTxt = GXutil.format( "EMPLIN   Evaluar 01. FIni: &ContCod:%1, FechaIni:%2, ContVal:%3, ContVal2:%4, ContDsc2:%5.", AV12ContCod, AV15Data2, GXutil.ltrimstr( DecimalUtil.doubleToDec(A316ContVal), 8, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(A1147ContVal2), 10, 0), A7208ContDsc2, "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
         /* Using cursor P09SA12 */
         pr_default.execute(10, new Object[] {A7208ContDsc2, A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      if ( AV63GXLvl243 == 0 )
      {
         AV15Data2 = "" ;
      }
   }

   public void S161( )
   {
      /* 'CREAR FILTRO' Routine */
      returnInSub = false ;
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilusu( AV37UsurCod );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilip( AV41Ip );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilobj( AV57Pgmname );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilfreg( AV28Now );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilfini( AV44FechaIni );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilffin( AV43FechaFin );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilmaq( " " );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilfase( " " );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilhdr( " " );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilpar( " " );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilerr( false );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilemp( AV19EmprCod );
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( AV52IngresaMTkn );
      GXt_boolean3 = AV48ExisteFiltro ;
      GXv_int2[0] = AV49InFilId ;
      GXv_char4[0] = AV50InFilTkn ;
      GXv_boolean5[0] = GXt_boolean3 ;
      new app.ingenieria.crearfiltro(remoteHandle, context).execute( AV47InFilSDT, GXv_int2, GXv_char4, GXv_boolean5) ;
      mrec_evaluarpr.this.AV49InFilId = GXv_int2[0] ;
      mrec_evaluarpr.this.AV50InFilTkn = GXv_char4[0] ;
      mrec_evaluarpr.this.GXt_boolean3 = GXv_boolean5[0] ;
      AV48ExisteFiltro = GXt_boolean3 ;
      AV47InFilSDT.setgxTv_SdtInFilSDT_Infilid( AV49InFilId );
      AV33MRasTxt = GXutil.format( "Crear    Evaluar 02. Filtro: Registro:%1, InFilSDT:%2", localUtil.ttoc( AV28Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV47InFilSDT.toJSonString(false, true), "", "", "", "", "", "", "") ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(AV33MRasTxt, AV57Pgmname) ;
      new app.ingenieria.crearrastro(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV39Version, AV57Pgmname, AV33MRasTxt) ;
   }

   public void S171( )
   {
      /* 'ACTUALIZARTOKEN' Routine */
      returnInSub = false ;
      GXt_boolean3 = AV54ActualizadoToken ;
      GXv_boolean5[0] = GXt_boolean3 ;
      new app.anticipacionerrores.tokenupdate(remoteHandle, context).execute( AV37UsurCod, AV41Ip, AV52IngresaMTkn, GXv_boolean5) ;
      mrec_evaluarpr.this.GXt_boolean3 = GXv_boolean5[0] ;
      AV54ActualizadoToken = GXt_boolean3 ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = mrec_evaluarpr.this.AV41Ip;
      this.aP4[0] = mrec_evaluarpr.this.AV52IngresaMTkn;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33MRasTxt = "" ;
      AV39Version = "" ;
      AV57Pgmname = "" ;
      AV28Now = GXutil.resetTime( GXutil.nullDate() );
      AV43FechaFin = GXutil.resetTime( GXutil.nullDate() );
      AV15Data2 = "" ;
      AV44FechaIni = GXutil.resetTime( GXutil.nullDate() );
      AV53DiferenciaHora = DecimalUtil.ZERO ;
      AV50InFilTkn = "" ;
      scmdbuf = "" ;
      P09SA2_A14169MPRecFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P09SA2_A396EmprCod = new String[] {""} ;
      P09SA2_A129BarCod = new int[1] ;
      P09SA2_A132BarCodReo = new byte[1] ;
      P09SA2_A130BarCodPar = new String[] {""} ;
      P09SA2_A14152MEnvOrd = new short[1] ;
      P09SA2_A14153MRecLin = new long[1] ;
      P09SA2_A14166MPRecPLC = new String[] {""} ;
      P09SA2_A14165MPRecVal = new String[] {""} ;
      A14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A14166MPRecPLC = "" ;
      A14165MPRecVal = "" ;
      AV9BarCodPar = "" ;
      AV23MPRecPLC = "" ;
      AV24MPRecVal = "" ;
      P09SA3_A1664ParFasCod = new short[1] ;
      P09SA3_A14152MEnvOrd = new short[1] ;
      P09SA3_A130BarCodPar = new String[] {""} ;
      P09SA3_A132BarCodReo = new byte[1] ;
      P09SA3_A129BarCod = new int[1] ;
      P09SA3_A396EmprCod = new String[] {""} ;
      A14160MPEnvPLC = "" ;
      Gx_emsg = "" ;
      A13991BarParVMn = "" ;
      A13992BarParVMx = "" ;
      AV26MPRecValMin = "" ;
      AV25MPRecValMax = "" ;
      P09SA5_A194BarOrdLin = new short[1] ;
      P09SA5_A14079BarParPLC = new String[] {""} ;
      P09SA5_A130BarCodPar = new String[] {""} ;
      P09SA5_A132BarCodReo = new byte[1] ;
      P09SA5_A129BarCod = new int[1] ;
      P09SA5_A396EmprCod = new String[] {""} ;
      P09SA5_A13991BarParVMn = new String[] {""} ;
      P09SA5_A13992BarParVMx = new String[] {""} ;
      P09SA5_A1664ParFasCod = new short[1] ;
      P09SA5_A758ProCod = new String[] {""} ;
      A14079BarParPLC = "" ;
      A758ProCod = "" ;
      P09SA6_A14153MRecLin = new long[1] ;
      P09SA6_A14152MEnvOrd = new short[1] ;
      P09SA6_A130BarCodPar = new String[] {""} ;
      P09SA6_A132BarCodReo = new byte[1] ;
      P09SA6_A129BarCod = new int[1] ;
      P09SA6_A396EmprCod = new String[] {""} ;
      P09SA6_A14168MPRecEr = new boolean[] {false} ;
      P09SA6_A14169MPRecFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P09SA6_A14687MPRecValMi = new String[] {""} ;
      P09SA6_n14687MPRecValMi = new boolean[] {false} ;
      P09SA6_A14688MPRecValMa = new String[] {""} ;
      P09SA6_n14688MPRecValMa = new boolean[] {false} ;
      P09SA6_A14689MPRecParFa = new short[1] ;
      P09SA6_n14689MPRecParFa = new boolean[] {false} ;
      A14687MPRecValMi = "" ;
      A14688MPRecValMa = "" ;
      AV29Num_MPRecVal = DecimalUtil.ZERO ;
      AV31Num_MPRecValMin = DecimalUtil.ZERO ;
      AV30Num_MPRecValMax = DecimalUtil.ZERO ;
      P09SA9_A313ContCod = new String[] {""} ;
      P09SA9_A396EmprCod = new String[] {""} ;
      P09SA9_A7208ContDsc2 = new String[] {""} ;
      P09SA9_A1147ContVal2 = new long[1] ;
      P09SA9_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      A7208ContDsc2 = "" ;
      AV11Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "");
      AV14Data1 = "" ;
      AV16Data3 = "" ;
      AV17Data4 = "" ;
      AV18Data5 = "" ;
      AV13ContDsc2 = "" ;
      P09SA11_A313ContCod = new String[] {""} ;
      P09SA11_A396EmprCod = new String[] {""} ;
      P09SA11_A7208ContDsc2 = new String[] {""} ;
      P09SA11_A1147ContVal2 = new long[1] ;
      P09SA11_A316ContVal = new int[1] ;
      AV47InFilSDT = new app.ingenieria.SdtInFilSDT(remoteHandle, context);
      GXv_int2 = new long[1] ;
      GXv_char4 = new String[1] ;
      GXv_boolean5 = new boolean[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluarpr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluarpr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluarpr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluarpr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluarpr__default(),
         new Object[] {
             new Object[] {
            P09SA2_A14169MPRecFecEv, P09SA2_A396EmprCod, P09SA2_A129BarCod, P09SA2_A132BarCodReo, P09SA2_A130BarCodPar, P09SA2_A14152MEnvOrd, P09SA2_A14153MRecLin, P09SA2_A14166MPRecPLC, P09SA2_A14165MPRecVal
            }
            , new Object[] {
            P09SA3_A1664ParFasCod, P09SA3_A14152MEnvOrd, P09SA3_A130BarCodPar, P09SA3_A132BarCodReo, P09SA3_A129BarCod, P09SA3_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P09SA5_A194BarOrdLin, P09SA5_A14079BarParPLC, P09SA5_A130BarCodPar, P09SA5_A132BarCodReo, P09SA5_A129BarCod, P09SA5_A396EmprCod, P09SA5_A13991BarParVMn, P09SA5_A13992BarParVMx, P09SA5_A1664ParFasCod, P09SA5_A758ProCod
            }
            , new Object[] {
            P09SA6_A14153MRecLin, P09SA6_A14152MEnvOrd, P09SA6_A130BarCodPar, P09SA6_A132BarCodReo, P09SA6_A129BarCod, P09SA6_A396EmprCod, P09SA6_A14168MPRecEr, P09SA6_A14169MPRecFecEv, P09SA6_A14687MPRecValMi, P09SA6_n14687MPRecValMi,
            P09SA6_A14688MPRecValMa, P09SA6_n14688MPRecValMa, P09SA6_A14689MPRecParFa, P09SA6_n14689MPRecParFa
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P09SA9_A313ContCod, P09SA9_A396EmprCod, P09SA9_A7208ContDsc2, P09SA9_A1147ContVal2, P09SA9_A316ContVal
            }
            , new Object[] {
            }
            , new Object[] {
            P09SA11_A313ContCod, P09SA11_A396EmprCod, P09SA11_A7208ContDsc2, P09SA11_A1147ContVal2, P09SA11_A316ContVal
            }
            , new Object[] {
            }
         }
      );
      AV57Pgmname = "Ingenieria.MRec_EvaluarPR" ;
      /* GeneXus formulas. */
      AV57Pgmname = "Ingenieria.MRec_EvaluarPR" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV10BarCodReo ;
   private byte AV59GXLvl109 ;
   private byte AV60GXLvl138 ;
   private byte gxt9SA6 ;
   private byte AV63GXLvl243 ;
   private short A14152MEnvOrd ;
   private short AV22MEnvOrd ;
   private short AV32ParFasCod ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private short A194BarOrdLin ;
   private short A14689MPRecParFa ;
   private int A129BarCod ;
   private int AV8BarCod ;
   private int GX_INS1894 ;
   private int A316ContVal ;
   private long AV38Contador ;
   private long AV45Registros ;
   private long GXt_int1 ;
   private long AV46Contar ;
   private long A14153MRecLin ;
   private long AV27MRecLin ;
   private long A1147ContVal2 ;
   private long AV49InFilId ;
   private long GXv_int2[] ;
   private java.math.BigDecimal AV53DiferenciaHora ;
   private java.math.BigDecimal AV29Num_MPRecVal ;
   private java.math.BigDecimal AV31Num_MPRecValMin ;
   private java.math.BigDecimal AV30Num_MPRecValMax ;
   private String AV19EmprCod ;
   private String AV12ContCod ;
   private String AV37UsurCod ;
   private String AV41Ip ;
   private String AV39Version ;
   private String AV57Pgmname ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A14165MPRecVal ;
   private String AV9BarCodPar ;
   private String AV24MPRecVal ;
   private String Gx_emsg ;
   private String A13991BarParVMn ;
   private String A13992BarParVMx ;
   private String AV26MPRecValMin ;
   private String AV25MPRecValMax ;
   private String A14079BarParPLC ;
   private String A758ProCod ;
   private String A14687MPRecValMi ;
   private String A14688MPRecValMa ;
   private String A313ContCod ;
   private String A7208ContDsc2 ;
   private String AV13ContDsc2 ;
   private String GXv_char4[] ;
   private java.util.Date AV28Now ;
   private java.util.Date AV43FechaFin ;
   private java.util.Date AV44FechaIni ;
   private java.util.Date A14169MPRecFecEv ;
   private boolean AV20f ;
   private boolean gxexitloop ;
   private boolean returnInSub ;
   private boolean A14168MPRecEr ;
   private boolean n14687MPRecValMi ;
   private boolean n14688MPRecValMa ;
   private boolean n14689MPRecParFa ;
   private boolean AV48ExisteFiltro ;
   private boolean AV54ActualizadoToken ;
   private boolean GXt_boolean3 ;
   private boolean GXv_boolean5[] ;
   private String AV33MRasTxt ;
   private String AV52IngresaMTkn ;
   private String AV15Data2 ;
   private String AV50InFilTkn ;
   private String A14166MPRecPLC ;
   private String AV23MPRecPLC ;
   private String A14160MPEnvPLC ;
   private String AV14Data1 ;
   private String AV16Data3 ;
   private String AV17Data4 ;
   private String AV18Data5 ;
   private app.ingenieria.SdtInFilSDT AV47InFilSDT ;
   private String[] aP4 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09SA2_A14169MPRecFecEv ;
   private String[] P09SA2_A396EmprCod ;
   private int[] P09SA2_A129BarCod ;
   private byte[] P09SA2_A132BarCodReo ;
   private String[] P09SA2_A130BarCodPar ;
   private short[] P09SA2_A14152MEnvOrd ;
   private long[] P09SA2_A14153MRecLin ;
   private String[] P09SA2_A14166MPRecPLC ;
   private String[] P09SA2_A14165MPRecVal ;
   private short[] P09SA3_A1664ParFasCod ;
   private short[] P09SA3_A14152MEnvOrd ;
   private String[] P09SA3_A130BarCodPar ;
   private byte[] P09SA3_A132BarCodReo ;
   private int[] P09SA3_A129BarCod ;
   private String[] P09SA3_A396EmprCod ;
   private short[] P09SA5_A194BarOrdLin ;
   private String[] P09SA5_A14079BarParPLC ;
   private String[] P09SA5_A130BarCodPar ;
   private byte[] P09SA5_A132BarCodReo ;
   private int[] P09SA5_A129BarCod ;
   private String[] P09SA5_A396EmprCod ;
   private String[] P09SA5_A13991BarParVMn ;
   private String[] P09SA5_A13992BarParVMx ;
   private short[] P09SA5_A1664ParFasCod ;
   private String[] P09SA5_A758ProCod ;
   private long[] P09SA6_A14153MRecLin ;
   private short[] P09SA6_A14152MEnvOrd ;
   private String[] P09SA6_A130BarCodPar ;
   private byte[] P09SA6_A132BarCodReo ;
   private int[] P09SA6_A129BarCod ;
   private String[] P09SA6_A396EmprCod ;
   private boolean[] P09SA6_A14168MPRecEr ;
   private java.util.Date[] P09SA6_A14169MPRecFecEv ;
   private String[] P09SA6_A14687MPRecValMi ;
   private boolean[] P09SA6_n14687MPRecValMi ;
   private String[] P09SA6_A14688MPRecValMa ;
   private boolean[] P09SA6_n14688MPRecValMa ;
   private short[] P09SA6_A14689MPRecParFa ;
   private boolean[] P09SA6_n14689MPRecParFa ;
   private String[] P09SA9_A313ContCod ;
   private String[] P09SA9_A396EmprCod ;
   private String[] P09SA9_A7208ContDsc2 ;
   private long[] P09SA9_A1147ContVal2 ;
   private int[] P09SA9_A316ContVal ;
   private String[] P09SA11_A313ContCod ;
   private String[] P09SA11_A396EmprCod ;
   private String[] P09SA11_A7208ContDsc2 ;
   private long[] P09SA11_A1147ContVal2 ;
   private int[] P09SA11_A316ContVal ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXSimpleCollection<String> AV11Col_ContDsc2 ;
}

final  class mrec_evaluarpr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class mrec_evaluarpr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class mrec_evaluarpr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class mrec_evaluarpr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class mrec_evaluarpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SA2", "SELECT MPRecFecEv, EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal FROM TXPMPRec WHERE (EmprCod = ?) AND ((MPRecFecEv = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) ORDER BY EmprCod, MPRecFecEv DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SA3", "SELECT ParFasCod, MEnvOrd, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPMPEnv WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? and ParFasCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09SA4", "INSERT INTO TXPMPEnv(EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod, MPEnvPLC, MPEnvVal) VALUES(?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPEnv")
         ,new ForEachCursor("P09SA5", "SELECT * FROM (SELECT BarOrdLin, BarParPLC, BarCodPar, BarCodReo, BarCod, EmprCod, BarParVMn, BarParVMx, ParFasCod, ProCod FROM TXPBarPar WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarParPLC = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09SA6", "SELECT MRecLin, MEnvOrd, BarCodPar, BarCodReo, BarCod, EmprCod, MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa FROM TXPMPRec WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? and MRecLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin  FOR UPDATE OF MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09SA7", "UPDATE TXPMPRec SET MPRecEr=?, MPRecFecEv=?, MPRecValMi=?, MPRecValMa=?, MPRecParFa=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPRec")
         ,new UpdateCursor("P09SA8", "UPDATE TXPMPRec SET MPRecEr=?, MPRecFecEv=?, MPRecValMi=?, MPRecValMa=?, MPRecParFa=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPRec")
         ,new ForEachCursor("P09SA9", "SELECT ContCod, EmprCod, ContDsc2, ContVal2, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod  FOR UPDATE OF ContDsc2, ContVal2 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09SA10", "UPDATE TXPEMPLIN SET ContDsc2=?, ContVal2=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new ForEachCursor("P09SA11", "SELECT ContCod, EmprCod, ContDsc2, ContVal2, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod  FOR UPDATE OF ContDsc2 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09SA12", "UPDATE TXPEMPLIN SET ContDsc2=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1, true);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[6])[0] = rslt.getBoolean(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8, true);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 12);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 100, false);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setVarchar(5, (String)parms[4], 100);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 5 :
               stmt.setBoolean(1, ((Boolean) parms[0]).booleanValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false, true);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 12);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               stmt.setString(6, (String)parms[8], 3);
               stmt.setInt(7, ((Number) parms[9]).intValue());
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               stmt.setString(9, (String)parms[11], 1);
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               stmt.setLong(11, ((Number) parms[13]).longValue());
               return;
            case 6 :
               stmt.setBoolean(1, ((Boolean) parms[0]).booleanValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false, true);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 12);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               stmt.setString(6, (String)parms[8], 3);
               stmt.setInt(7, ((Number) parms[9]).intValue());
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               stmt.setString(9, (String)parms[11], 1);
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               stmt.setLong(11, ((Number) parms[13]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

