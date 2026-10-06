package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrechdr_pr extends GXProcedure
{
   public mrechdr_pr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrechdr_pr.class ), "" );
   }

   public mrechdr_pr( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           String aP1 ,
                           String aP2 ,
                           java.util.Date aP3 ,
                           java.util.Date aP4 ,
                           java.util.Date aP5 ,
                           String aP6 )
   {
      mrechdr_pr.this.aP7 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        String aP6 ,
                        long[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String aP6 ,
                             long[] aP7 )
   {
      mrechdr_pr.this.AV61inEmprCod = aP0;
      mrechdr_pr.this.AV56UsurCod = aP1;
      mrechdr_pr.this.AV59Ip = aP2;
      mrechdr_pr.this.AV32FechaIni = aP3;
      mrechdr_pr.this.AV31FechaFin = aP4;
      mrechdr_pr.this.AV47Now = aP5;
      mrechdr_pr.this.AV62MTkn = aP6;
      mrechdr_pr.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV45MRasTxt = GXutil.format( "Inicia   Evaluar 01. Recepcion Data fecha:%1--%2. EmprCod:%3, Usuario:%4, Ip:%5, Fecha:%6,  funcionfecha:%7, Token:%8...", localUtil.ttoc( AV32FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV31FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV61inEmprCod, AV56UsurCod, AV59Ip, localUtil.ttoc( AV47Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV62MTkn, "") ;
      new app.ingenieria.crearrastro(remoteHandle, context).execute( AV56UsurCod, AV59Ip, AV58Version, AV67Pgmname, AV45MRasTxt) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "%1", AV45MRasTxt, "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      AV60Registros = 0 ;
      AV33i = GXutil.sleep( 1) ;
      AV45MRasTxt = GXutil.format( "Espera   Evaluar 01. Recepcion Data fecha:%1", localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "", "", "") ;
      new app.ingenieria.crearrastro(remoteHandle, context).execute( AV56UsurCod, AV59Ip, AV58Version, AV67Pgmname, AV45MRasTxt) ;
      AV64PrimerRegistro = true ;
      AV68GXLvl11 = (byte)(0) ;
      /* Using cursor P0AUV2 */
      pr_default.execute(0, new Object[] {AV32FechaIni, AV31FechaFin, AV47Now, AV56UsurCod, AV59Ip, AV62MTkn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14716DRecReg = P0AUV2_A14716DRecReg[0] ;
         n14716DRecReg = P0AUV2_n14716DRecReg[0] ;
         A14711DRecBarCod = P0AUV2_A14711DRecBarCod[0] ;
         n14711DRecBarCod = P0AUV2_n14711DRecBarCod[0] ;
         A14676DRecFec = P0AUV2_A14676DRecFec[0] ;
         A14717DRecTkn = P0AUV2_A14717DRecTkn[0] ;
         n14717DRecTkn = P0AUV2_n14717DRecTkn[0] ;
         A14715DRecIp = P0AUV2_A14715DRecIp[0] ;
         n14715DRecIp = P0AUV2_n14715DRecIp[0] ;
         A14714DRecUsu = P0AUV2_A14714DRecUsu[0] ;
         n14714DRecUsu = P0AUV2_n14714DRecUsu[0] ;
         A14675DRecId = P0AUV2_A14675DRecId[0] ;
         A14705DRecMaqCod = P0AUV2_A14705DRecMaqCod[0] ;
         A14712DRecBarReo = P0AUV2_A14712DRecBarReo[0] ;
         n14712DRecBarReo = P0AUV2_n14712DRecBarReo[0] ;
         A14713DRecBarPar = P0AUV2_A14713DRecBarPar[0] ;
         n14713DRecBarPar = P0AUV2_n14713DRecBarPar[0] ;
         A14710DRecOrd = P0AUV2_A14710DRecOrd[0] ;
         n14710DRecOrd = P0AUV2_n14710DRecOrd[0] ;
         A14709DRecFasCod = P0AUV2_A14709DRecFasCod[0] ;
         n14709DRecFasCod = P0AUV2_n14709DRecFasCod[0] ;
         A14708DRecHdr = P0AUV2_A14708DRecHdr[0] ;
         n14708DRecHdr = P0AUV2_n14708DRecHdr[0] ;
         A14706DRecPLC = P0AUV2_A14706DRecPLC[0] ;
         A14707DRecVal = P0AUV2_A14707DRecVal[0] ;
         AV68GXLvl11 = (byte)(1) ;
         if ( AV64PrimerRegistro )
         {
            AV45MRasTxt = GXutil.format( "DREC     Evaluar 02. Encontrado registro PLC en el Rango:%1-%2. Id:%3, Fecha:%4.", localUtil.ttoc( AV32FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV31FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0), localUtil.ttoc( A14676DRecFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "") ;
            new app.ingenieria.crearrastro(remoteHandle, context).execute( AV56UsurCod, AV59Ip, AV58Version, AV67Pgmname, AV45MRasTxt) ;
            AV64PrimerRegistro = false ;
         }
         if ( ! P0AUV2_n14711DRecBarCod[0] )
         {
            AV60Registros = (long)(AV60Registros+1) ;
            AV27EmprCod = AV61inEmprCod ;
            AV35MaqCod = A14705DRecMaqCod ;
            AV8BarCod = A14711DRecBarCod ;
            AV10BarCodReo = A14712DRecBarReo ;
            AV9BarCodPar = A14713DRecBarPar ;
            AV38MEnvOrd = A14710DRecOrd ;
            AV30FasCod = A14709DRecFasCod ;
            AV63MRecHdr = A14708DRecHdr ;
            AV24DRecId = A14675DRecId ;
            AV25DRecPLC = A14706DRecPLC ;
            AV26DRecVal = A14707DRecVal ;
            AV23DRecFec = A14676DRecFec ;
            /* Execute user subroutine: 'LEER EN MENV' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'AGREGAR EN MPREC' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV68GXLvl11 == 0 )
      {
         AV45MRasTxt = GXutil.format( "DREC     Evaluar 03. No Encontrado registro PLC en el Rango:%1-%2.", localUtil.ttoc( AV32FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV31FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV56UsurCod, AV59Ip, AV58Version, AV67Pgmname, AV45MRasTxt) ;
      }
      AV45MRasTxt = GXutil.format( "Finaliza Evaluar 04. Recepcion Data fecha:%1--%2. Registros:%3.", localUtil.ttoc( AV32FechaIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV31FechaFin, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Registros), 12, 0), "", "", "", "", "", "") ;
      new app.ingenieria.crearrastro(remoteHandle, context).execute( AV56UsurCod, AV59Ip, AV58Version, AV67Pgmname, AV45MRasTxt) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LEER EN MENV' Routine */
      returnInSub = false ;
      AV69GXLvl67 = (byte)(0) ;
      /* Using cursor P0AUV3 */
      pr_default.execute(1, new Object[] {AV27EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV38MEnvOrd)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14152MEnvOrd = P0AUV3_A14152MEnvOrd[0] ;
         A130BarCodPar = P0AUV3_A130BarCodPar[0] ;
         A132BarCodReo = P0AUV3_A132BarCodReo[0] ;
         A129BarCod = P0AUV3_A129BarCod[0] ;
         A396EmprCod = P0AUV3_A396EmprCod[0] ;
         AV69GXLvl67 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV69GXLvl67 == 0 )
      {
         /* Execute user subroutine: 'AGREGAR EN MENV' */
         S121 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'AGREGAR EN MENV' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPMEnv

      */
      A396EmprCod = AV27EmprCod ;
      A129BarCod = AV8BarCod ;
      A132BarCodReo = AV10BarCodReo ;
      A130BarCodPar = AV9BarCodPar ;
      A14152MEnvOrd = AV38MEnvOrd ;
      A457FasCod = AV30FasCod ;
      A14154MEnvMaqCod = AV35MaqCod ;
      A14158MEnvIni = AV47Now ;
      A14686MRecHdr = AV63MRecHdr ;
      n14686MRecHdr = false ;
      /* Using cursor P0AUV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), A457FasCod, A14154MEnvMaqCod, A14158MEnvIni, Boolean.valueOf(n14686MRecHdr), A14686MRecHdr});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrechdr_pr");
   }

   public void S131( )
   {
      /* 'AGREGAR EN MPREC' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPMPRec

      */
      A396EmprCod = AV27EmprCod ;
      A129BarCod = AV8BarCod ;
      A132BarCodReo = AV10BarCodReo ;
      A130BarCodPar = AV9BarCodPar ;
      A14152MEnvOrd = AV38MEnvOrd ;
      A14153MRecLin = AV24DRecId ;
      A14166MPRecPLC = AV25DRecPLC ;
      A14165MPRecVal = AV26DRecVal ;
      A14167MPRecFec = AV23DRecFec ;
      A14690MPRecReg = AV47Now ;
      n14690MPRecReg = false ;
      /* Using cursor P0AUV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin), A14166MPRecPLC, A14165MPRecVal, A14167MPRecFec, Boolean.valueOf(n14690MPRecReg), A14690MPRecReg});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
      if ( (pr_default.getStatus(3) == 1) )
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
      Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrechdr_pr");
   }

   protected void cleanup( )
   {
      this.aP7[0] = mrechdr_pr.this.AV60Registros;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV45MRasTxt = "" ;
      AV58Version = "" ;
      AV67Pgmname = "" ;
      scmdbuf = "" ;
      P0AUV2_A14716DRecReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUV2_n14716DRecReg = new boolean[] {false} ;
      P0AUV2_A14711DRecBarCod = new int[1] ;
      P0AUV2_n14711DRecBarCod = new boolean[] {false} ;
      P0AUV2_A14676DRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUV2_A14717DRecTkn = new String[] {""} ;
      P0AUV2_n14717DRecTkn = new boolean[] {false} ;
      P0AUV2_A14715DRecIp = new String[] {""} ;
      P0AUV2_n14715DRecIp = new boolean[] {false} ;
      P0AUV2_A14714DRecUsu = new String[] {""} ;
      P0AUV2_n14714DRecUsu = new boolean[] {false} ;
      P0AUV2_A14675DRecId = new long[1] ;
      P0AUV2_A14705DRecMaqCod = new String[] {""} ;
      P0AUV2_A14712DRecBarReo = new byte[1] ;
      P0AUV2_n14712DRecBarReo = new boolean[] {false} ;
      P0AUV2_A14713DRecBarPar = new String[] {""} ;
      P0AUV2_n14713DRecBarPar = new boolean[] {false} ;
      P0AUV2_A14710DRecOrd = new short[1] ;
      P0AUV2_n14710DRecOrd = new boolean[] {false} ;
      P0AUV2_A14709DRecFasCod = new String[] {""} ;
      P0AUV2_n14709DRecFasCod = new boolean[] {false} ;
      P0AUV2_A14708DRecHdr = new String[] {""} ;
      P0AUV2_n14708DRecHdr = new boolean[] {false} ;
      P0AUV2_A14706DRecPLC = new String[] {""} ;
      P0AUV2_A14707DRecVal = new String[] {""} ;
      A14716DRecReg = GXutil.resetTime( GXutil.nullDate() );
      A14676DRecFec = GXutil.resetTime( GXutil.nullDate() );
      A14717DRecTkn = "" ;
      A14715DRecIp = "" ;
      A14714DRecUsu = "" ;
      A14705DRecMaqCod = "" ;
      A14713DRecBarPar = "" ;
      A14709DRecFasCod = "" ;
      A14708DRecHdr = "" ;
      A14706DRecPLC = "" ;
      A14707DRecVal = "" ;
      AV27EmprCod = "" ;
      AV35MaqCod = "" ;
      AV9BarCodPar = "" ;
      AV30FasCod = "" ;
      AV63MRecHdr = "" ;
      AV25DRecPLC = "" ;
      AV26DRecVal = "" ;
      AV23DRecFec = GXutil.resetTime( GXutil.nullDate() );
      P0AUV3_A14152MEnvOrd = new short[1] ;
      P0AUV3_A130BarCodPar = new String[] {""} ;
      P0AUV3_A132BarCodReo = new byte[1] ;
      P0AUV3_A129BarCod = new int[1] ;
      P0AUV3_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A14154MEnvMaqCod = "" ;
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      A14686MRecHdr = "" ;
      Gx_emsg = "" ;
      A14166MPRecPLC = "" ;
      A14165MPRecVal = "" ;
      A14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      A14690MPRecReg = GXutil.resetTime( GXutil.nullDate() );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrechdr_pr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrechdr_pr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrechdr_pr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrechdr_pr__default(),
         new Object[] {
             new Object[] {
            P0AUV2_A14716DRecReg, P0AUV2_n14716DRecReg, P0AUV2_A14711DRecBarCod, P0AUV2_n14711DRecBarCod, P0AUV2_A14676DRecFec, P0AUV2_A14717DRecTkn, P0AUV2_n14717DRecTkn, P0AUV2_A14715DRecIp, P0AUV2_n14715DRecIp, P0AUV2_A14714DRecUsu,
            P0AUV2_n14714DRecUsu, P0AUV2_A14675DRecId, P0AUV2_A14705DRecMaqCod, P0AUV2_A14712DRecBarReo, P0AUV2_n14712DRecBarReo, P0AUV2_A14713DRecBarPar, P0AUV2_n14713DRecBarPar, P0AUV2_A14710DRecOrd, P0AUV2_n14710DRecOrd, P0AUV2_A14709DRecFasCod,
            P0AUV2_n14709DRecFasCod, P0AUV2_A14708DRecHdr, P0AUV2_n14708DRecHdr, P0AUV2_A14706DRecPLC, P0AUV2_A14707DRecVal
            }
            , new Object[] {
            P0AUV3_A14152MEnvOrd, P0AUV3_A130BarCodPar, P0AUV3_A132BarCodReo, P0AUV3_A129BarCod, P0AUV3_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV67Pgmname = "Ingenieria.MRecHdr_PR" ;
      /* GeneXus formulas. */
      AV67Pgmname = "Ingenieria.MRecHdr_PR" ;
      Gx_err = (short)(0) ;
   }

   private byte AV68GXLvl11 ;
   private byte A14712DRecBarReo ;
   private byte AV10BarCodReo ;
   private byte AV69GXLvl67 ;
   private byte A132BarCodReo ;
   private short AV33i ;
   private short A14710DRecOrd ;
   private short AV38MEnvOrd ;
   private short A14152MEnvOrd ;
   private short Gx_err ;
   private int A14711DRecBarCod ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int GX_INS1893 ;
   private int GX_INS1895 ;
   private long AV60Registros ;
   private long A14675DRecId ;
   private long AV24DRecId ;
   private long A14153MRecLin ;
   private String AV61inEmprCod ;
   private String AV56UsurCod ;
   private String AV58Version ;
   private String AV67Pgmname ;
   private String scmdbuf ;
   private String A14714DRecUsu ;
   private String A14705DRecMaqCod ;
   private String A14713DRecBarPar ;
   private String A14709DRecFasCod ;
   private String A14708DRecHdr ;
   private String A14707DRecVal ;
   private String AV27EmprCod ;
   private String AV35MaqCod ;
   private String AV9BarCodPar ;
   private String AV30FasCod ;
   private String AV63MRecHdr ;
   private String AV26DRecVal ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A14154MEnvMaqCod ;
   private String A14686MRecHdr ;
   private String Gx_emsg ;
   private String A14165MPRecVal ;
   private java.util.Date AV32FechaIni ;
   private java.util.Date AV31FechaFin ;
   private java.util.Date AV47Now ;
   private java.util.Date A14716DRecReg ;
   private java.util.Date A14676DRecFec ;
   private java.util.Date AV23DRecFec ;
   private java.util.Date A14158MEnvIni ;
   private java.util.Date A14167MPRecFec ;
   private java.util.Date A14690MPRecReg ;
   private boolean AV64PrimerRegistro ;
   private boolean n14716DRecReg ;
   private boolean n14711DRecBarCod ;
   private boolean n14717DRecTkn ;
   private boolean n14715DRecIp ;
   private boolean n14714DRecUsu ;
   private boolean n14712DRecBarReo ;
   private boolean n14713DRecBarPar ;
   private boolean n14710DRecOrd ;
   private boolean n14709DRecFasCod ;
   private boolean n14708DRecHdr ;
   private boolean returnInSub ;
   private boolean n14686MRecHdr ;
   private boolean n14690MPRecReg ;
   private String AV45MRasTxt ;
   private String AV59Ip ;
   private String AV62MTkn ;
   private String A14717DRecTkn ;
   private String A14715DRecIp ;
   private String A14706DRecPLC ;
   private String AV25DRecPLC ;
   private String A14166MPRecPLC ;
   private long[] aP7 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0AUV2_A14716DRecReg ;
   private boolean[] P0AUV2_n14716DRecReg ;
   private int[] P0AUV2_A14711DRecBarCod ;
   private boolean[] P0AUV2_n14711DRecBarCod ;
   private java.util.Date[] P0AUV2_A14676DRecFec ;
   private String[] P0AUV2_A14717DRecTkn ;
   private boolean[] P0AUV2_n14717DRecTkn ;
   private String[] P0AUV2_A14715DRecIp ;
   private boolean[] P0AUV2_n14715DRecIp ;
   private String[] P0AUV2_A14714DRecUsu ;
   private boolean[] P0AUV2_n14714DRecUsu ;
   private long[] P0AUV2_A14675DRecId ;
   private String[] P0AUV2_A14705DRecMaqCod ;
   private byte[] P0AUV2_A14712DRecBarReo ;
   private boolean[] P0AUV2_n14712DRecBarReo ;
   private String[] P0AUV2_A14713DRecBarPar ;
   private boolean[] P0AUV2_n14713DRecBarPar ;
   private short[] P0AUV2_A14710DRecOrd ;
   private boolean[] P0AUV2_n14710DRecOrd ;
   private String[] P0AUV2_A14709DRecFasCod ;
   private boolean[] P0AUV2_n14709DRecFasCod ;
   private String[] P0AUV2_A14708DRecHdr ;
   private boolean[] P0AUV2_n14708DRecHdr ;
   private String[] P0AUV2_A14706DRecPLC ;
   private String[] P0AUV2_A14707DRecVal ;
   private short[] P0AUV3_A14152MEnvOrd ;
   private String[] P0AUV3_A130BarCodPar ;
   private byte[] P0AUV3_A132BarCodReo ;
   private int[] P0AUV3_A129BarCod ;
   private String[] P0AUV3_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class mrechdr_pr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrechdr_pr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrechdr_pr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrechdr_pr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUV2", "SELECT DRecReg, DRecBarCod, DRecFec, DRecTkn, DRecIp, DRecUsu, DRecId, DRecMaqCod, DRecBarReo, DRecBarPar, DRecOrd, DRecFasCod, DRecHdr, DRecPLC, DRecVal FROM DRec WHERE (DRecFec >= ?) AND (DRecFec <= ?) AND (Not DRecBarCod IS NULL) AND (DRecReg >= ?) AND (DRecUsu = ?) AND (DRecIp = ?) AND (DRecTkn = ?) ORDER BY DRecId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUV3", "SELECT MEnvOrd, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPMEnv WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AUV4", "INSERT INTO TXPMEnv(EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, FasCod, MEnvMaqCod, MEnvIni, MRecHdr, MEnvFin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMEnv")
         ,new UpdateCursor("P0AUV5", "INSERT INTO TXPMPRec(EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecReg, MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPRec")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7);
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 12);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false, true);
               stmt.setDateTime(2, (java.util.Date)parms[1], false, true);
               stmt.setDateTime(3, (java.util.Date)parms[2], false, true);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 20);
               stmt.setVarchar(6, (String)parms[5], 256);
               return;
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
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setDateTime(8, (java.util.Date)parms[7], false, true);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 10);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 100, false);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setDateTime(9, (java.util.Date)parms[8], false, true);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[10], false, true);
               }
               return;
      }
   }

}

