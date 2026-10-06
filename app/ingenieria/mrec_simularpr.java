package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_simularpr extends GXProcedure
{
   public mrec_simularpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_simularpr.class ), "" );
   }

   public mrec_simularpr( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.math.BigDecimal aP2 ,
                        short aP3 ,
                        short aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.math.BigDecimal aP2 ,
                             short aP3 ,
                             short aP4 )
   {
      mrec_simularpr.this.AV23EmprCod = aP0;
      mrec_simularpr.this.AV14ContCod = aP1;
      mrec_simularpr.this.AV43PorcError = aP2;
      mrec_simularpr.this.AV40TiempoDatos = aP3;
      mrec_simularpr.this.AV41TiempoFin = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "inicia la simulacion: &EmprCod=%1, &ContCod=%2, &PorcError=%3, &TiempoDatos=%4, &TiempoFin=%5.", ""), AV23EmprCod, AV14ContCod, GXutil.ltrimstr( AV43PorcError, 6, 2), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TiempoDatos), 4, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TiempoFin), 4, 0), "", "", "", ""), AV46Pgmname) ;
      AV39QueActualizar = httpContext.getMessage( "Limpiar", "") ;
      /* Execute user subroutine: 'ACTUALIZAR EN EMPLIN' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV39QueActualizar = httpContext.getMessage( "Inicio", "") ;
      /* Execute user subroutine: 'ACTUALIZAR EN EMPLIN' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV12c = 0 ;
      AV16d = 0 ;
      AV24f = false ;
      while ( 1 == 1 )
      {
         GXt_int1 = AV15ContVal ;
         GXv_int2[0] = GXt_int1 ;
         new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "DSP", AV23EmprCod, AV14ContCod, GXv_int2) ;
         mrec_simularpr.this.GXt_int1 = GXv_int2[0] ;
         AV15ContVal = GXt_int1 ;
         if ( AV15ContVal == 0 )
         {
            if (true) break;
         }
         AV39QueActualizar = httpContext.getMessage( "Ciclos", "") ;
         /* Execute user subroutine: 'ACTUALIZAR EN EMPLIN' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P09S62 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14152MEnvOrd = P09S62_A14152MEnvOrd[0] ;
            A130BarCodPar = P09S62_A130BarCodPar[0] ;
            A132BarCodReo = P09S62_A132BarCodReo[0] ;
            A129BarCod = P09S62_A129BarCod[0] ;
            A396EmprCod = P09S62_A396EmprCod[0] ;
            A14157MEnvFin = P09S62_A14157MEnvFin[0] ;
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Hdr abierta:%1-%2-%3-%4.  Orden:%5.", ""), A396EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0), "", "", "", ""), AV46Pgmname) ;
            AV9BarCod = A129BarCod ;
            AV11BarCodReo = A132BarCodReo ;
            AV10BarCodPar = A130BarCodPar ;
            AV28MEnvOrd = A14152MEnvOrd ;
            /* Using cursor P09S63 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A14161MPEnvVal = P09S63_A14161MPEnvVal[0] ;
               A14160MPEnvPLC = P09S63_A14160MPEnvPLC[0] ;
               A1664ParFasCod = P09S63_A1664ParFasCod[0] ;
               new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Localiza los parametros: ParFasCod=%1, MPEnvPLC=%2, MPEnvVal=%3.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0), A14160MPEnvPLC, A14161MPEnvVal, "", "", "", "", "", ""), AV46Pgmname) ;
               AV38ParFasCod = A1664ParFasCod ;
               AV32MPRecPLC = A14160MPEnvPLC ;
               AV31MPEnvVal = A14161MPEnvVal ;
               /* Execute user subroutine: 'OBTENER EN BARPAR MAX, MIN' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: 'AGREGAR EN MPREC' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV39QueActualizar = httpContext.getMessage( "Datos", "") ;
               /* Execute user subroutine: 'ACTUALIZAR EN EMPLIN' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               GXt_int1 = AV15ContVal ;
               GXv_int2[0] = GXt_int1 ;
               new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "DSP", AV23EmprCod, AV14ContCod, GXv_int2) ;
               mrec_simularpr.this.GXt_int1 = GXv_int2[0] ;
               AV15ContVal = GXt_int1 ;
               if ( AV15ContVal == 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               /* Execute user subroutine: 'EVALUAR FINALIZAR AUTOMÁTICAMENTE' */
               S151 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV24f )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV25i = GXutil.sleep( AV40TiempoDatos) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GXt_int1 = AV15ContVal ;
            GXv_int2[0] = GXt_int1 ;
            new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "DSP", AV23EmprCod, AV14ContCod, GXv_int2) ;
            mrec_simularpr.this.GXt_int1 = GXv_int2[0] ;
            AV15ContVal = GXt_int1 ;
            if ( AV15ContVal == 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Execute user subroutine: 'EVALUAR FINALIZAR AUTOMÁTICAMENTE' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV24f )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV24f )
         {
            if (true) break;
         }
      }
      AV39QueActualizar = httpContext.getMessage( "Fin", "") ;
      /* Execute user subroutine: 'ACTUALIZAR EN EMPLIN' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'AGREGAR EN MPREC' Routine */
      returnInSub = false ;
      AV26Max = CommonUtil.decimalVal( AV33MPRecValMax, ".") ;
      AV29Min = CommonUtil.decimalVal( AV34MPRecValMin, ".") ;
      AV27MaxE = AV26Max.add(GXutil.roundDecimal( AV26Max.multiply(AV43PorcError).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 1)) ;
      AV30MinE = AV29Min.subtract(GXutil.roundDecimal( AV29Min.multiply(AV43PorcError).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 1)) ;
      AV42Val = (DecimalUtil.doubleToDec(GXutil.random( )).multiply((AV27MaxE.subtract(AV30MinE)))).add(AV30MinE) ;
      /*
         INSERT RECORD ON TABLE TXPMPRec

      */
      A396EmprCod = AV23EmprCod ;
      A129BarCod = AV9BarCod ;
      A132BarCodReo = AV11BarCodReo ;
      A130BarCodPar = AV10BarCodPar ;
      A14152MEnvOrd = AV28MEnvOrd ;
      /* Execute user subroutine: 'OBTENER &MRECLIN' */
      S124 ();
      if (returnInSub) return;
      A14153MRecLin = AV35MRecLin ;
      A14166MPRecPLC = AV32MPRecPLC ;
      A14165MPRecVal = GXutil.str( AV42Val, 12, 2) ;
      A14167MPRecFec = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
      /* Using cursor P09S64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin), A14166MPRecPLC, A14165MPRecVal, A14167MPRecFec});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec_simularpr");
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Registro agregado MPREC: Hdr:%1-%2-%3-%4. Orden=%5. Linea:%6. &MPRecPLC=%7.", ""), AV23EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0), GXutil.str( AV11BarCodReo, 1, 0), AV10BarCodPar, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28MEnvOrd), 4, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35MRecLin), 12, 0), AV32MPRecPLC, "", ""), AV46Pgmname) ;
   }

   public void S124( )
   {
      /* 'OBTENER &MRECLIN' Routine */
      returnInSub = false ;
      AV35MRecLin = 0 ;
      /* Using cursor P09S65 */
      pr_default.execute(3, new Object[] {AV23EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar, Short.valueOf(AV28MEnvOrd)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14152MEnvOrd = P09S65_A14152MEnvOrd[0] ;
         A130BarCodPar = P09S65_A130BarCodPar[0] ;
         A132BarCodReo = P09S65_A132BarCodReo[0] ;
         A129BarCod = P09S65_A129BarCod[0] ;
         A396EmprCod = P09S65_A396EmprCod[0] ;
         A14153MRecLin = P09S65_A14153MRecLin[0] ;
         AV35MRecLin = A14153MRecLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV35MRecLin = (long)(AV35MRecLin+1) ;
   }

   public void S131( )
   {
      /* 'OBTENER EN BARPAR MAX, MIN' Routine */
      returnInSub = false ;
      AV34MPRecValMin = "" ;
      AV33MPRecValMax = "" ;
      /* Using cursor P09S66 */
      pr_default.execute(4, new Object[] {AV23EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar, Short.valueOf(AV38ParFasCod), Short.valueOf(AV28MEnvOrd)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A194BarOrdLin = P09S66_A194BarOrdLin[0] ;
         A1664ParFasCod = P09S66_A1664ParFasCod[0] ;
         A130BarCodPar = P09S66_A130BarCodPar[0] ;
         A132BarCodReo = P09S66_A132BarCodReo[0] ;
         A129BarCod = P09S66_A129BarCod[0] ;
         A396EmprCod = P09S66_A396EmprCod[0] ;
         A13991BarParVMn = P09S66_A13991BarParVMn[0] ;
         A13992BarParVMx = P09S66_A13992BarParVMx[0] ;
         A758ProCod = P09S66_A758ProCod[0] ;
         AV34MPRecValMin = A13991BarParVMn ;
         AV33MPRecValMax = A13992BarParVMx ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S141( )
   {
      /* 'ACTUALIZAR EN EMPLIN' Routine */
      returnInSub = false ;
      /* Using cursor P09S67 */
      pr_default.execute(5, new Object[] {AV23EmprCod, AV14ContCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A313ContCod = P09S67_A313ContCod[0] ;
         A396EmprCod = P09S67_A396EmprCod[0] ;
         A7208ContDsc2 = P09S67_A7208ContDsc2[0] ;
         AV13Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(A7208ContDsc2,"\\|")) ;
         if ( AV13Col_ContDsc2.size() >= 1 )
         {
            AV17Data1 = (String)AV13Col_ContDsc2.elementAt(-1+1) ;
         }
         if ( AV13Col_ContDsc2.size() >= 2 )
         {
            AV18Data2 = (String)AV13Col_ContDsc2.elementAt(-1+2) ;
         }
         if ( AV13Col_ContDsc2.size() >= 3 )
         {
            AV19Data3 = (String)AV13Col_ContDsc2.elementAt(-1+3) ;
         }
         if ( AV13Col_ContDsc2.size() >= 4 )
         {
            AV20Data4 = (String)AV13Col_ContDsc2.elementAt(-1+4) ;
         }
         if ( AV13Col_ContDsc2.size() >= 5 )
         {
            AV21Data5 = (String)AV13Col_ContDsc2.elementAt(-1+5) ;
         }
         if ( AV13Col_ContDsc2.size() == 5 )
         {
            AV17Data1 = (String)AV13Col_ContDsc2.elementAt(-1+1) ;
            AV18Data2 = (String)AV13Col_ContDsc2.elementAt(-1+2) ;
            AV19Data3 = (String)AV13Col_ContDsc2.elementAt(-1+3) ;
            AV20Data4 = (String)AV13Col_ContDsc2.elementAt(-1+4) ;
            AV21Data5 = (String)AV13Col_ContDsc2.elementAt(-1+5) ;
         }
         if ( (GXutil.strcmp("", AV21Data5)==0) )
         {
            AV21Data5 = httpContext.getMessage( "No iniciado", "") ;
         }
         if ( GXutil.strcmp(AV39QueActualizar, httpContext.getMessage( "Inicio", "")) == 0 )
         {
            AV36Now = GXutil.nowms( ) ;
            AV17Data1 = localUtil.ttoc( AV36Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         else if ( GXutil.strcmp(AV39QueActualizar, httpContext.getMessage( "Fin", "")) == 0 )
         {
            AV36Now = GXutil.nowms( ) ;
            AV18Data2 = localUtil.ttoc( AV36Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         else if ( GXutil.strcmp(AV39QueActualizar, httpContext.getMessage( "Ciclos", "")) == 0 )
         {
            AV12c = (long)(AV12c+1) ;
            AV19Data3 = GXutil.str( AV12c, 12, 0) ;
         }
         else if ( GXutil.strcmp(AV39QueActualizar, httpContext.getMessage( "Datos", "")) == 0 )
         {
            AV16d = (long)(AV16d+1) ;
            AV20Data4 = GXutil.str( AV16d, 12, 0) ;
         }
         else if ( GXutil.strcmp(AV39QueActualizar, httpContext.getMessage( "Limpiar", "")) == 0 )
         {
            AV17Data1 = "" ;
            AV18Data2 = "" ;
            AV19Data3 = "" ;
            AV20Data4 = "" ;
         }
         AV8ContDsc2 = GXutil.trim( AV17Data1) + "|" + GXutil.trim( AV18Data2) + "|" + GXutil.trim( AV19Data3) + "|" + GXutil.trim( AV20Data4) + "|" + GXutil.trim( AV21Data5) ;
         A7208ContDsc2 = GXutil.trim( GXutil.substring( AV8ContDsc2, 1, 100)) ;
         /* Using cursor P09S68 */
         pr_default.execute(6, new Object[] {A7208ContDsc2, A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec_simularpr");
   }

   public void S151( )
   {
      /* 'EVALUAR FINALIZAR AUTOMÁTICAMENTE' Routine */
      returnInSub = false ;
      if ( AV41TiempoFin != 0 )
      {
         AV37NowNow = GXutil.nowms( ) ;
         AV22Diferencia = (long)(GXutil.dtdiffms( AV37NowNow, AV36Now)) ;
         if ( AV22Diferencia > AV41TiempoFin )
         {
            AV24f = true ;
         }
      }
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
      AV46Pgmname = "" ;
      AV39QueActualizar = "" ;
      scmdbuf = "" ;
      P09S62_A14152MEnvOrd = new short[1] ;
      P09S62_A130BarCodPar = new String[] {""} ;
      P09S62_A132BarCodReo = new byte[1] ;
      P09S62_A129BarCod = new int[1] ;
      P09S62_A396EmprCod = new String[] {""} ;
      P09S62_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      AV10BarCodPar = "" ;
      P09S63_A396EmprCod = new String[] {""} ;
      P09S63_A129BarCod = new int[1] ;
      P09S63_A132BarCodReo = new byte[1] ;
      P09S63_A130BarCodPar = new String[] {""} ;
      P09S63_A14152MEnvOrd = new short[1] ;
      P09S63_A14161MPEnvVal = new String[] {""} ;
      P09S63_A14160MPEnvPLC = new String[] {""} ;
      P09S63_A1664ParFasCod = new short[1] ;
      A14161MPEnvVal = "" ;
      A14160MPEnvPLC = "" ;
      AV32MPRecPLC = "" ;
      AV31MPEnvVal = "" ;
      GXv_int2 = new int[1] ;
      AV26Max = DecimalUtil.ZERO ;
      AV33MPRecValMax = "" ;
      AV29Min = DecimalUtil.ZERO ;
      AV34MPRecValMin = "" ;
      AV27MaxE = DecimalUtil.ZERO ;
      AV30MinE = DecimalUtil.ZERO ;
      AV42Val = DecimalUtil.ZERO ;
      A14166MPRecPLC = "" ;
      A14165MPRecVal = "" ;
      A14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      P09S65_A14152MEnvOrd = new short[1] ;
      P09S65_A130BarCodPar = new String[] {""} ;
      P09S65_A132BarCodReo = new byte[1] ;
      P09S65_A129BarCod = new int[1] ;
      P09S65_A396EmprCod = new String[] {""} ;
      P09S65_A14153MRecLin = new long[1] ;
      P09S66_A194BarOrdLin = new short[1] ;
      P09S66_A1664ParFasCod = new short[1] ;
      P09S66_A130BarCodPar = new String[] {""} ;
      P09S66_A132BarCodReo = new byte[1] ;
      P09S66_A129BarCod = new int[1] ;
      P09S66_A396EmprCod = new String[] {""} ;
      P09S66_A13991BarParVMn = new String[] {""} ;
      P09S66_A13992BarParVMx = new String[] {""} ;
      P09S66_A758ProCod = new String[] {""} ;
      A13991BarParVMn = "" ;
      A13992BarParVMx = "" ;
      A758ProCod = "" ;
      P09S67_A313ContCod = new String[] {""} ;
      P09S67_A396EmprCod = new String[] {""} ;
      P09S67_A7208ContDsc2 = new String[] {""} ;
      A313ContCod = "" ;
      A7208ContDsc2 = "" ;
      AV13Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17Data1 = "" ;
      AV18Data2 = "" ;
      AV19Data3 = "" ;
      AV20Data4 = "" ;
      AV21Data5 = "" ;
      AV36Now = GXutil.resetTime( GXutil.nullDate() );
      AV8ContDsc2 = "" ;
      AV37NowNow = GXutil.resetTime( GXutil.nullDate() );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_simularpr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_simularpr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_simularpr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_simularpr__default(),
         new Object[] {
             new Object[] {
            P09S62_A14152MEnvOrd, P09S62_A130BarCodPar, P09S62_A132BarCodReo, P09S62_A129BarCod, P09S62_A396EmprCod, P09S62_A14157MEnvFin
            }
            , new Object[] {
            P09S63_A396EmprCod, P09S63_A129BarCod, P09S63_A132BarCodReo, P09S63_A130BarCodPar, P09S63_A14152MEnvOrd, P09S63_A14161MPEnvVal, P09S63_A14160MPEnvPLC, P09S63_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P09S65_A14152MEnvOrd, P09S65_A130BarCodPar, P09S65_A132BarCodReo, P09S65_A129BarCod, P09S65_A396EmprCod, P09S65_A14153MRecLin
            }
            , new Object[] {
            P09S66_A194BarOrdLin, P09S66_A1664ParFasCod, P09S66_A130BarCodPar, P09S66_A132BarCodReo, P09S66_A129BarCod, P09S66_A396EmprCod, P09S66_A13991BarParVMn, P09S66_A13992BarParVMx, P09S66_A758ProCod
            }
            , new Object[] {
            P09S67_A313ContCod, P09S67_A396EmprCod, P09S67_A7208ContDsc2
            }
            , new Object[] {
            }
         }
      );
      AV46Pgmname = "Ingenieria.MRec_SimularPR" ;
      /* GeneXus formulas. */
      AV46Pgmname = "Ingenieria.MRec_SimularPR" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11BarCodReo ;
   private short AV40TiempoDatos ;
   private short AV41TiempoFin ;
   private short A14152MEnvOrd ;
   private short AV28MEnvOrd ;
   private short A1664ParFasCod ;
   private short AV38ParFasCod ;
   private short AV25i ;
   private short Gx_err ;
   private short A194BarOrdLin ;
   private int AV15ContVal ;
   private int A129BarCod ;
   private int AV9BarCod ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int GX_INS1895 ;
   private long AV12c ;
   private long AV16d ;
   private long A14153MRecLin ;
   private long AV35MRecLin ;
   private long AV22Diferencia ;
   private java.math.BigDecimal AV43PorcError ;
   private java.math.BigDecimal AV26Max ;
   private java.math.BigDecimal AV29Min ;
   private java.math.BigDecimal AV27MaxE ;
   private java.math.BigDecimal AV30MinE ;
   private java.math.BigDecimal AV42Val ;
   private String AV23EmprCod ;
   private String AV14ContCod ;
   private String AV46Pgmname ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String A14161MPEnvVal ;
   private String AV31MPEnvVal ;
   private String AV33MPRecValMax ;
   private String AV34MPRecValMin ;
   private String A14165MPRecVal ;
   private String Gx_emsg ;
   private String A13991BarParVMn ;
   private String A13992BarParVMx ;
   private String A758ProCod ;
   private String A313ContCod ;
   private String A7208ContDsc2 ;
   private String AV8ContDsc2 ;
   private java.util.Date A14157MEnvFin ;
   private java.util.Date A14167MPRecFec ;
   private java.util.Date AV36Now ;
   private java.util.Date AV37NowNow ;
   private boolean returnInSub ;
   private boolean AV24f ;
   private String AV39QueActualizar ;
   private String A14160MPEnvPLC ;
   private String AV32MPRecPLC ;
   private String A14166MPRecPLC ;
   private String AV17Data1 ;
   private String AV18Data2 ;
   private String AV19Data3 ;
   private String AV20Data4 ;
   private String AV21Data5 ;
   private IDataStoreProvider pr_default ;
   private short[] P09S62_A14152MEnvOrd ;
   private String[] P09S62_A130BarCodPar ;
   private byte[] P09S62_A132BarCodReo ;
   private int[] P09S62_A129BarCod ;
   private String[] P09S62_A396EmprCod ;
   private java.util.Date[] P09S62_A14157MEnvFin ;
   private String[] P09S63_A396EmprCod ;
   private int[] P09S63_A129BarCod ;
   private byte[] P09S63_A132BarCodReo ;
   private String[] P09S63_A130BarCodPar ;
   private short[] P09S63_A14152MEnvOrd ;
   private String[] P09S63_A14161MPEnvVal ;
   private String[] P09S63_A14160MPEnvPLC ;
   private short[] P09S63_A1664ParFasCod ;
   private short[] P09S65_A14152MEnvOrd ;
   private String[] P09S65_A130BarCodPar ;
   private byte[] P09S65_A132BarCodReo ;
   private int[] P09S65_A129BarCod ;
   private String[] P09S65_A396EmprCod ;
   private long[] P09S65_A14153MRecLin ;
   private short[] P09S66_A194BarOrdLin ;
   private short[] P09S66_A1664ParFasCod ;
   private String[] P09S66_A130BarCodPar ;
   private byte[] P09S66_A132BarCodReo ;
   private int[] P09S66_A129BarCod ;
   private String[] P09S66_A396EmprCod ;
   private String[] P09S66_A13991BarParVMn ;
   private String[] P09S66_A13992BarParVMx ;
   private String[] P09S66_A758ProCod ;
   private String[] P09S67_A313ContCod ;
   private String[] P09S67_A396EmprCod ;
   private String[] P09S67_A7208ContDsc2 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXSimpleCollection<String> AV13Col_ContDsc2 ;
}

final  class mrec_simularpr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_simularpr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_simularpr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_simularpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09S62", "SELECT MEnvOrd, BarCodPar, BarCodReo, BarCod, EmprCod, MEnvFin FROM TXPMEnv WHERE (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09S63", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MPEnvVal, MPEnvPLC, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09S64", "INSERT INTO TXPMPRec(EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa, MPRecReg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPRec")
         ,new ForEachCursor("P09S65", "SELECT * FROM (SELECT MEnvOrd, BarCodPar, BarCodReo, BarCod, EmprCod, MRecLin FROM TXPMPRec WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MEnvOrd = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MRecLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09S66", "SELECT * FROM (SELECT BarOrdLin, ParFasCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarParVMn, BarParVMx, ProCod FROM TXPBarPar WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (ParFasCod = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09S67", "SELECT ContCod, EmprCod, ContDsc2 FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09S68", "UPDATE TXPEMPLIN SET ContDsc2=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 100, false);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setDateTime(9, (java.util.Date)parms[8], false, true);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

