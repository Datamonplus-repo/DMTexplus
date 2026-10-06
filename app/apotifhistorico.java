package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apotifhistorico extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apotifhistorico pgm = new apotifhistorico (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apotifhistorico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apotifhistorico.class ), "" );
   }

   public apotifhistorico( int remoteHandle ,
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
      AV90UsurCod = " " ;
      AV95Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV96EmprCod ;
      GXv_char2[0] = AV97EmprNom ;
      GXv_char3[0] = AV90UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV95Station, GXv_char1, GXv_char2, GXv_char3) ;
      apotifhistorico.this.AV96EmprCod = GXv_char1[0] ;
      apotifhistorico.this.AV97EmprNom = GXv_char2[0] ;
      apotifhistorico.this.AV90UsurCod = GXv_char3[0] ;
      AV62Fec1 = GXutil.today( ) ;
      AV63Fec2 = GXutil.dadd(AV62Fec1,-(1)) ;
      /* Execute user subroutine: 'CONTROL' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV115Otif == 1 )
      {
         Gx_msg = httpContext.getMessage( "Atencion.Ya existen registros del dia ", "") + localUtil.dtoc( AV63Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "El proceso NO continua", "") ;
         AV116Inc_obs = Gx_msg ;
         new app.pctrinc(remoteHandle, context).execute( AV96EmprCod, AV121Pgmname, AV90UsurCod, AV95Station, AV116Inc_obs, 99999999, (byte)(0), "") ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'PROCESO' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESO' Routine */
      returnInSub = false ;
      AV113FechaCorte = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P05LQ2 */
      pr_default.execute(0, new Object[] {AV96EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5LQ2 = false ;
         A396EmprCod = P05LQ2_A396EmprCod[0] ;
         A161BarFecSal = P05LQ2_A161BarFecSal[0] ;
         A159BarFecGen = P05LQ2_A159BarFecGen[0] ;
         A213BarSit = P05LQ2_A213BarSit[0] ;
         A143BarDisNum = P05LQ2_A143BarDisNum[0] ;
         A2010BarTipDis = P05LQ2_A2010BarTipDis[0] ;
         A212BarSer = P05LQ2_A212BarSer[0] ;
         A129BarCod = P05LQ2_A129BarCod[0] ;
         A132BarCodReo = P05LQ2_A132BarCodReo[0] ;
         A130BarCodPar = P05LQ2_A130BarCodPar[0] ;
         A8097BarFecHis = P05LQ2_A8097BarFecHis[0] ;
         A158BarFecFpr = P05LQ2_A158BarFecFpr[0] ;
         A148BarEstReo = P05LQ2_A148BarEstReo[0] ;
         if ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A8097BarFecHis, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV63Fec2)) )
         {
            if ( ( (GXutil.strcmp("", A130BarCodPar)==0) && ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) != 0 ) ) )
            {
               if ( ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRENDAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEPARACI", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRABACIO", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MUESTRAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRAB+MUE", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOMUES", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOPREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEP+GRAB", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "AGRABAR", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-GRAN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGPAPEL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-PREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGTELA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRETRATA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGITAL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MULTIDNO", "")) != 0 ) )
               {
                  AV87Seccodf = ((GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "ES", "") : httpContext.getMessage( "TI", "")) ;
                  AV88SecNomF = ((GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "Estampacion", "") : httpContext.getMessage( "Tintoreria", "")) ;
                  AV98Fecha = A158BarFecFpr ;
                  AV92anyo = (short)(GXutil.year( AV98Fecha)) ;
                  AV94mes = (byte)(GXutil.month( AV98Fecha)) ;
                  AV78Nhdrs = 0 ;
                  AV80Nhdrsok = 0 ;
                  AV79NhdrsnoOk = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05LQ2_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(P05LQ2_A8097BarFecHis[0], A8097BarFecHis) && ( GXutil.strcmp(P05LQ2_A2010BarTipDis[0], A2010BarTipDis) == 0 ) )
                  {
                     brk5LQ2 = false ;
                     A161BarFecSal = P05LQ2_A161BarFecSal[0] ;
                     A159BarFecGen = P05LQ2_A159BarFecGen[0] ;
                     A213BarSit = P05LQ2_A213BarSit[0] ;
                     A143BarDisNum = P05LQ2_A143BarDisNum[0] ;
                     A212BarSer = P05LQ2_A212BarSer[0] ;
                     A129BarCod = P05LQ2_A129BarCod[0] ;
                     A132BarCodReo = P05LQ2_A132BarCodReo[0] ;
                     A130BarCodPar = P05LQ2_A130BarCodPar[0] ;
                     A158BarFecFpr = P05LQ2_A158BarFecFpr[0] ;
                     if ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A8097BarFecHis, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV63Fec2)) )
                     {
                        if ( ( (GXutil.strcmp("", A130BarCodPar)==0) && ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) != 0 ) ) )
                        {
                           if ( ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRENDAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEPARACI", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRABACIO", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MUESTRAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRAB+MUE", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOMUES", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOPREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEP+GRAB", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "AGRABAR", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-GRAN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGPAPEL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-PREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGTELA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRETRATA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGITAL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MULTIDNO", "")) != 0 ) )
                           {
                              AV99barcod = A129BarCod ;
                              AV100barcodreo = A132BarCodReo ;
                              AV101barcodpar = A130BarCodPar ;
                              AV71Fascodnew = "" ;
                              /* Using cursor P05LQ3 */
                              pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                              while ( (pr_default.getStatus(1) != 101) )
                              {
                                 A457FasCod = P05LQ3_A457FasCod[0] ;
                                 A194BarOrdLin = P05LQ3_A194BarOrdLin[0] ;
                                 A758ProCod = P05LQ3_A758ProCod[0] ;
                                 if ( ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CARTERA", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "PARA EST", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "BODEGAJE", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "FINDEMES", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CIUDAD", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "NEGOCIAC", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CLIENTE", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CITA", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "REV EXT", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "PDTE OC", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CIUDAD", "")) == 0 ) )
                                 {
                                    AV71Fascodnew = A457FasCod ;
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                                 pr_default.readNext(1);
                              }
                              pr_default.close(1);
                              AV67Facturacion = GXutil.nullDate() ;
                              /* Using cursor P05LQ4 */
                              pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                              while ( (pr_default.getStatus(2) != 101) )
                              {
                                 A457FasCod = P05LQ4_A457FasCod[0] ;
                                 A4442BarFasDTI = P05LQ4_A4442BarFasDTI[0] ;
                                 n4442BarFasDTI = P05LQ4_n4442BarFasDTI[0] ;
                                 A194BarOrdLin = P05LQ4_A194BarOrdLin[0] ;
                                 A758ProCod = P05LQ4_A758ProCod[0] ;
                                 if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "FACTURA", "")) == 0 )
                                 {
                                    AV67Facturacion = localUtil.ctod( localUtil.ttoc( A4442BarFasDTI, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                                 }
                                 pr_default.readNext(2);
                              }
                              pr_default.close(2);
                              AV64Accion = "" ;
                              AV73FechaIns = GXutil.nullDate() ;
                              AV70FascodIns = "" ;
                              if ( GXutil.strcmp(AV71Fascodnew, "") != 0 )
                              {
                                 /* Execute user subroutine: 'CTRIN1' */
                                 S123 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    returnInSub = true;
                                    if (true) return;
                                 }
                              }
                              AV85Presinco = (byte)(0) ;
                              /* Using cursor P05LQ5 */
                              pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                              while ( (pr_default.getStatus(3) != 101) )
                              {
                                 A761ProFasLin = P05LQ5_A761ProFasLin[0] ;
                                 n761ProFasLin = P05LQ5_n761ProFasLin[0] ;
                                 A758ProCod = P05LQ5_A758ProCod[0] ;
                                 AV85Presinco = (byte)(((GXutil.strcmp(A758ProCod, httpContext.getMessage( "PRESINCO", ""))==0) ? 1 : ((GXutil.strcmp(A758ProCod, httpContext.getMessage( "LAVMAQUI", ""))==0) ? 1 : ((GXutil.strcmp(A758ProCod, httpContext.getMessage( "DIGTELA", ""))==0) ? 1 : ((GXutil.strcmp(A758ProCod, httpContext.getMessage( "NEGOCIAC", ""))==0) ? 1 : ((GXutil.strcmp(A758ProCod, httpContext.getMessage( "PDTE OC", ""))==0) ? 1 : 0)))))) ;
                                 AV86Procod = A758ProCod ;
                                 pr_default.readNext(3);
                              }
                              pr_default.close(3);
                              AV77Inserto = (byte)(0) ;
                              AV84Ok = "" ;
                              AV82NoOk = "" ;
                              AV72FechaEnvH = localUtil.ctod( localUtil.ttoc( A8097BarFecHis, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                              if ( AV85Presinco == 0 )
                              {
                                 AV78Nhdrs = (int)(AV78Nhdrs+1) ;
                                 if ( ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "CARTERA", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "PARA EST", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "BODEGAJE", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "FINDEMES", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "CIUDAD", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "NEGOCIAC", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "CLIENTE", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "CITA", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "REV EXT", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "PDTE OC", "")) == 0 ) || ( GXutil.strcmp(AV70FascodIns, httpContext.getMessage( "CIUDAD", "")) == 0 ) )
                                 {
                                    if ( (( GXutil.resetTime(AV73FechaIns).before( GXutil.resetTime( A158BarFecFpr )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV73FechaIns), GXutil.resetTime(A158BarFecFpr)) )) )
                                    {
                                       AV80Nhdrsok = (int)(AV80Nhdrsok+1) ;
                                       AV84Ok = httpContext.getMessage( "S", "") ;
                                       AV77Inserto = (byte)(1) ;
                                    }
                                    if ( GXutil.resetTime(AV73FechaIns).after( GXutil.resetTime( A158BarFecFpr )) )
                                    {
                                       AV79NhdrsnoOk = (int)(AV79NhdrsnoOk+1) ;
                                       AV82NoOk = httpContext.getMessage( "S", "") ;
                                       AV77Inserto = (byte)(1) ;
                                    }
                                 }
                                 else
                                 {
                                    if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72FechaEnvH)) )
                                    {
                                       AV79NhdrsnoOk = (int)(AV79NhdrsnoOk+1) ;
                                       AV82NoOk = httpContext.getMessage( "S", "") ;
                                       AV77Inserto = (byte)(1) ;
                                    }
                                    if ( GXutil.resetTime(AV72FechaEnvH).after( GXutil.resetTime( A158BarFecFpr )) )
                                    {
                                       AV79NhdrsnoOk = (int)(AV79NhdrsnoOk+1) ;
                                       AV82NoOk = httpContext.getMessage( "S", "") ;
                                       AV77Inserto = (byte)(1) ;
                                    }
                                    if ( (( GXutil.resetTime(AV72FechaEnvH).before( GXutil.resetTime( A158BarFecFpr )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV72FechaEnvH), GXutil.resetTime(A158BarFecFpr)) )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72FechaEnvH)) )
                                    {
                                       AV80Nhdrsok = (int)(AV80Nhdrsok+1) ;
                                       AV84Ok = httpContext.getMessage( "S", "") ;
                                       AV77Inserto = (byte)(1) ;
                                    }
                                 }
                              }
                              /*
                                 INSERT RECORD ON TABLE TXPOTIFDE

                              */
                              A12781OFIdEmpres = A396EmprCod ;
                              A12782OFFecha = AV72FechaEnvH ;
                              A12783OFIdSeccio = AV87Seccodf ;
                              A12791OFHdr = AV99barcod ;
                              A12792OFHdrR = AV100barcodreo ;
                              A12793OFHdrP = AV101barcodpar ;
                              A12794OFFecHis = AV72FechaEnvH ;
                              n12794OFFecHis = false ;
                              A12795OFFecEnt = A158BarFecFpr ;
                              n12795OFFecEnt = false ;
                              A12796OFFecRm = A161BarFecSal ;
                              n12796OFFecRm = false ;
                              A12797OFFecHd = A159BarFecGen ;
                              n12797OFFecHd = false ;
                              A12798OFSit = A213BarSit ;
                              n12798OFSit = false ;
                              A12799OFFase1 = AV71Fascodnew ;
                              n12799OFFase1 = false ;
                              A12800OFFase2 = AV70FascodIns ;
                              n12800OFFase2 = false ;
                              A12801OFAccion = AV64Accion ;
                              n12801OFAccion = false ;
                              A12802OFFecIns = AV73FechaIns ;
                              n12802OFFecIns = false ;
                              A12803OFPedcli = A143BarDisNum ;
                              n12803OFPedcli = false ;
                              A12804OFProceso = AV86Procod ;
                              n12804OFProceso = false ;
                              A12805OFFec1 = AV113FechaCorte ;
                              n12805OFFec1 = false ;
                              A12806OFFec2 = AV63Fec2 ;
                              n12806OFFec2 = false ;
                              A12807OFOk = ((AV77Inserto==0) ? "-" : AV84Ok) ;
                              n12807OFOk = false ;
                              A12808OFNoOk = ((AV77Inserto==0) ? "-" : AV82NoOk) ;
                              n12808OFNoOk = false ;
                              /* Using cursor P05LQ6 */
                              pr_default.execute(4, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Integer.valueOf(A12791OFHdr), Byte.valueOf(A12792OFHdrR), A12793OFHdrP, Boolean.valueOf(n12794OFFecHis), A12794OFFecHis, Boolean.valueOf(n12795OFFecEnt), A12795OFFecEnt, Boolean.valueOf(n12796OFFecRm), A12796OFFecRm, Boolean.valueOf(n12797OFFecHd), A12797OFFecHd, Boolean.valueOf(n12798OFSit), Byte.valueOf(A12798OFSit), Boolean.valueOf(n12799OFFase1), A12799OFFase1, Boolean.valueOf(n12800OFFase2), A12800OFFase2, Boolean.valueOf(n12801OFAccion), A12801OFAccion, Boolean.valueOf(n12802OFFecIns), A12802OFFecIns, Boolean.valueOf(n12803OFPedcli), A12803OFPedcli, Boolean.valueOf(n12804OFProceso), A12804OFProceso, Boolean.valueOf(n12805OFFec1), A12805OFFec1, Boolean.valueOf(n12806OFFec2), A12806OFFec2, Boolean.valueOf(n12807OFOk), A12807OFOk, Boolean.valueOf(n12808OFNoOk), A12808OFNoOk});
                              Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIFDE");
                              if ( (pr_default.getStatus(4) == 1) )
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
                              AV77Inserto = (byte)(0) ;
                           }
                        }
                     }
                     brk5LQ2 = true ;
                     pr_default.readNext(0);
                  }
                  AV78Nhdrs = (int)(AV79NhdrsnoOk+AV80Nhdrsok) ;
                  AV65Control = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( AV72FechaEnvH, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + AV87Seccodf + ";" + A396EmprCod + AV87Seccodf + ";" + GXutil.str( AV92anyo, 4, 0) + ";" + GXutil.str( AV94mes, 2, 0) + ";" + AV88SecNomF + ";" + GXutil.str( AV78Nhdrs, 8, 0) + ";" ;
                  AV65Control += GXutil.str( AV80Nhdrsok, 8, 0) + ";" + GXutil.str( AV79NhdrsnoOk, 8, 0) ;
                  System.out.println( AV65Control );
                  /*
                     INSERT RECORD ON TABLE TXPOTIF

                  */
                  A12781OFIdEmpres = A396EmprCod ;
                  A12782OFFecha = AV72FechaEnvH ;
                  A12783OFIdSeccio = AV87Seccodf ;
                  A12784OFIdEmpSec = A396EmprCod + AV87Seccodf ;
                  n12784OFIdEmpSec = false ;
                  A12785OFAnyo = AV92anyo ;
                  n12785OFAnyo = false ;
                  A12786OFMes = AV94mes ;
                  n12786OFMes = false ;
                  A12787OFSecion = AV88SecNomF ;
                  n12787OFSecion = false ;
                  A12788OFHdrs = AV78Nhdrs ;
                  n12788OFHdrs = false ;
                  A12789OFCumplida = AV80Nhdrsok ;
                  n12789OFCumplida = false ;
                  A12790OFIncumpli = AV79NhdrsnoOk ;
                  n12790OFIncumpli = false ;
                  A12812OFFecCorte = AV113FechaCorte ;
                  n12812OFFecCorte = false ;
                  AV117OFObs = httpContext.getMessage( "Registros creados desde ", "") + GXutil.trim( AV121Pgmname) + GXutil.newLine( ) ;
                  AV117OFObs += httpContext.getMessage( "Nueva Programacion, Busqueda por Fecha Envio Historico", "") ;
                  A12813OFObs = AV117OFObs ;
                  n12813OFObs = false ;
                  /* Using cursor P05LQ7 */
                  pr_default.execute(5, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Boolean.valueOf(n12784OFIdEmpSec), A12784OFIdEmpSec, Boolean.valueOf(n12785OFAnyo), Short.valueOf(A12785OFAnyo), Boolean.valueOf(n12786OFMes), Byte.valueOf(A12786OFMes), Boolean.valueOf(n12787OFSecion), A12787OFSecion, Boolean.valueOf(n12788OFHdrs), Integer.valueOf(A12788OFHdrs), Boolean.valueOf(n12789OFCumplida), Integer.valueOf(A12789OFCumplida), Boolean.valueOf(n12790OFIncumpli), Integer.valueOf(A12790OFIncumpli), Boolean.valueOf(n12812OFFecCorte), A12812OFFecCorte, Boolean.valueOf(n12813OFObs), A12813OFObs});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIF");
                  if ( (pr_default.getStatus(5) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     n12790OFIncumpli = false ;
                     n12789OFCumplida = false ;
                     n12788OFHdrs = false ;
                     /* Optimized UPDATE. */
                     /* Using cursor P05LQ8 */
                     pr_default.execute(6, new Object[] {Integer.valueOf(AV79NhdrsnoOk), Integer.valueOf(AV80Nhdrsok), Integer.valueOf(AV78Nhdrs), A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIF");
                     /* End optimized UPDATE. */
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
               }
            }
         }
         if ( ! brk5LQ2 )
         {
            brk5LQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S123( )
   {
      /* 'CTRIN1' Routine */
      returnInSub = false ;
      /* Using cursor P05LQ9 */
      pr_default.execute(7, new Object[] {AV96EmprCod, Integer.valueOf(AV99barcod), Byte.valueOf(AV100barcodreo), AV101barcodpar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A396EmprCod = P05LQ9_A396EmprCod[0] ;
         A5299Inc_Barcod = P05LQ9_A5299Inc_Barcod[0] ;
         A5300Inc_BarReo = P05LQ9_A5300Inc_BarReo[0] ;
         A5301Inc_BarPar = P05LQ9_A5301Inc_BarPar[0] ;
         A4935Inc_Prog = P05LQ9_A4935Inc_Prog[0] ;
         A4936Inc_Obs = P05LQ9_A4936Inc_Obs[0] ;
         A4931Inc_Linea = P05LQ9_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P05LQ9_A4929Inc_Dia[0] ;
         if ( ( GXutil.strcmp(A4935Inc_Prog, httpContext.getMessage( "WBARFASw  ", "")) == 0 ) || ( GXutil.strcmp(A4935Inc_Prog, httpContext.getMessage( "WOPENFS0  ", "")) == 0 ) )
         {
            AV69Fascodctrl = GXutil.substring( A4936Inc_Obs, 7, 8) ;
            AV64Accion = GXutil.substring( A4936Inc_Obs, 28, 9) ;
            if ( ( GXutil.strcmp(GXutil.trim( AV69Fascodctrl), GXutil.trim( AV71Fascodnew)) == 0 ) && ( GXutil.strcmp(GXutil.trim( AV64Accion), httpContext.getMessage( "Insertada", "")) == 0 ) )
            {
               AV73FechaIns = A4929Inc_Dia ;
               AV70FascodIns = AV69Fascodctrl ;
            }
            if ( ( GXutil.strcmp(GXutil.trim( AV69Fascodctrl), GXutil.trim( AV71Fascodnew)) == 0 ) && ( GXutil.strcmp(GXutil.trim( AV64Accion), httpContext.getMessage( "Eliminada", "")) == 0 ) )
            {
               AV73FechaIns = A4929Inc_Dia ;
               AV70FascodIns = AV69Fascodctrl ;
            }
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S131( )
   {
      /* 'CONTROL' Routine */
      returnInSub = false ;
      AV115Otif = (byte)(0) ;
      /* Using cursor P05LQ10 */
      pr_default.execute(8, new Object[] {AV96EmprCod, AV63Fec2});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A12782OFFecha = P05LQ10_A12782OFFecha[0] ;
         A12781OFIdEmpres = P05LQ10_A12781OFIdEmpres[0] ;
         A12783OFIdSeccio = P05LQ10_A12783OFIdSeccio[0] ;
         AV115Otif = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(potifhistorico.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apotifhistorico");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV90UsurCod = "" ;
      AV95Station = "" ;
      AV96EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV97EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV62Fec1 = GXutil.nullDate() ;
      AV63Fec2 = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV116Inc_obs = "" ;
      AV121Pgmname = "" ;
      AV113FechaCorte = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P05LQ2_A396EmprCod = new String[] {""} ;
      P05LQ2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P05LQ2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05LQ2_A213BarSit = new byte[1] ;
      P05LQ2_A143BarDisNum = new String[] {""} ;
      P05LQ2_A2010BarTipDis = new String[] {""} ;
      P05LQ2_A212BarSer = new String[] {""} ;
      P05LQ2_A129BarCod = new int[1] ;
      P05LQ2_A132BarCodReo = new byte[1] ;
      P05LQ2_A130BarCodPar = new String[] {""} ;
      P05LQ2_A8097BarFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      P05LQ2_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P05LQ2_A148BarEstReo = new byte[1] ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A143BarDisNum = "" ;
      A2010BarTipDis = "" ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
      A158BarFecFpr = GXutil.nullDate() ;
      AV87Seccodf = "" ;
      AV88SecNomF = "" ;
      AV98Fecha = GXutil.nullDate() ;
      AV101barcodpar = "" ;
      AV71Fascodnew = "" ;
      P05LQ3_A396EmprCod = new String[] {""} ;
      P05LQ3_A129BarCod = new int[1] ;
      P05LQ3_A132BarCodReo = new byte[1] ;
      P05LQ3_A130BarCodPar = new String[] {""} ;
      P05LQ3_A457FasCod = new String[] {""} ;
      P05LQ3_A194BarOrdLin = new short[1] ;
      P05LQ3_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV67Facturacion = GXutil.nullDate() ;
      P05LQ4_A396EmprCod = new String[] {""} ;
      P05LQ4_A129BarCod = new int[1] ;
      P05LQ4_A132BarCodReo = new byte[1] ;
      P05LQ4_A130BarCodPar = new String[] {""} ;
      P05LQ4_A457FasCod = new String[] {""} ;
      P05LQ4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05LQ4_n4442BarFasDTI = new boolean[] {false} ;
      P05LQ4_A194BarOrdLin = new short[1] ;
      P05LQ4_A758ProCod = new String[] {""} ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV64Accion = "" ;
      AV73FechaIns = GXutil.nullDate() ;
      AV70FascodIns = "" ;
      P05LQ5_A396EmprCod = new String[] {""} ;
      P05LQ5_A129BarCod = new int[1] ;
      P05LQ5_A132BarCodReo = new byte[1] ;
      P05LQ5_A130BarCodPar = new String[] {""} ;
      P05LQ5_A761ProFasLin = new short[1] ;
      P05LQ5_n761ProFasLin = new boolean[] {false} ;
      P05LQ5_A758ProCod = new String[] {""} ;
      AV86Procod = "" ;
      AV84Ok = "" ;
      AV82NoOk = "" ;
      AV72FechaEnvH = GXutil.nullDate() ;
      A12781OFIdEmpres = "" ;
      A12782OFFecha = GXutil.nullDate() ;
      A12783OFIdSeccio = "" ;
      A12793OFHdrP = "" ;
      A12794OFFecHis = GXutil.nullDate() ;
      A12795OFFecEnt = GXutil.nullDate() ;
      A12796OFFecRm = GXutil.nullDate() ;
      A12797OFFecHd = GXutil.nullDate() ;
      A12799OFFase1 = "" ;
      A12800OFFase2 = "" ;
      A12801OFAccion = "" ;
      A12802OFFecIns = GXutil.nullDate() ;
      A12803OFPedcli = "" ;
      A12804OFProceso = "" ;
      A12805OFFec1 = GXutil.resetTime( GXutil.nullDate() );
      A12806OFFec2 = GXutil.nullDate() ;
      A12807OFOk = "" ;
      A12808OFNoOk = "" ;
      Gx_emsg = "" ;
      AV65Control = "" ;
      A12784OFIdEmpSec = "" ;
      A12787OFSecion = "" ;
      A12812OFFecCorte = GXutil.resetTime( GXutil.nullDate() );
      AV117OFObs = "" ;
      A12813OFObs = "" ;
      P05LQ9_A396EmprCod = new String[] {""} ;
      P05LQ9_A5299Inc_Barcod = new int[1] ;
      P05LQ9_A5300Inc_BarReo = new byte[1] ;
      P05LQ9_A5301Inc_BarPar = new String[] {""} ;
      P05LQ9_A4935Inc_Prog = new String[] {""} ;
      P05LQ9_A4936Inc_Obs = new String[] {""} ;
      P05LQ9_A4931Inc_Linea = new long[1] ;
      P05LQ9_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      A5301Inc_BarPar = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      AV69Fascodctrl = "" ;
      P05LQ10_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P05LQ10_A12781OFIdEmpres = new String[] {""} ;
      P05LQ10_A12783OFIdSeccio = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apotifhistorico__default(),
         new Object[] {
             new Object[] {
            P05LQ2_A396EmprCod, P05LQ2_A161BarFecSal, P05LQ2_A159BarFecGen, P05LQ2_A213BarSit, P05LQ2_A143BarDisNum, P05LQ2_A2010BarTipDis, P05LQ2_A212BarSer, P05LQ2_A129BarCod, P05LQ2_A132BarCodReo, P05LQ2_A130BarCodPar,
            P05LQ2_A8097BarFecHis, P05LQ2_A158BarFecFpr, P05LQ2_A148BarEstReo
            }
            , new Object[] {
            P05LQ3_A396EmprCod, P05LQ3_A129BarCod, P05LQ3_A132BarCodReo, P05LQ3_A130BarCodPar, P05LQ3_A457FasCod, P05LQ3_A194BarOrdLin, P05LQ3_A758ProCod
            }
            , new Object[] {
            P05LQ4_A396EmprCod, P05LQ4_A129BarCod, P05LQ4_A132BarCodReo, P05LQ4_A130BarCodPar, P05LQ4_A457FasCod, P05LQ4_A4442BarFasDTI, P05LQ4_n4442BarFasDTI, P05LQ4_A194BarOrdLin, P05LQ4_A758ProCod
            }
            , new Object[] {
            P05LQ5_A396EmprCod, P05LQ5_A129BarCod, P05LQ5_A132BarCodReo, P05LQ5_A130BarCodPar, P05LQ5_A761ProFasLin, P05LQ5_n761ProFasLin, P05LQ5_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05LQ9_A396EmprCod, P05LQ9_A5299Inc_Barcod, P05LQ9_A5300Inc_BarReo, P05LQ9_A5301Inc_BarPar, P05LQ9_A4935Inc_Prog, P05LQ9_A4936Inc_Obs, P05LQ9_A4931Inc_Linea, P05LQ9_A4929Inc_Dia
            }
            , new Object[] {
            P05LQ10_A12782OFFecha, P05LQ10_A12781OFIdEmpres, P05LQ10_A12783OFIdSeccio
            }
         }
      );
      AV121Pgmname = "APOtifHistorico" ;
      /* GeneXus formulas. */
      AV121Pgmname = "APOtifHistorico" ;
      Gx_err = (short)(0) ;
   }

   private byte AV115Otif ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte AV94mes ;
   private byte AV100barcodreo ;
   private byte AV85Presinco ;
   private byte AV77Inserto ;
   private byte A12792OFHdrR ;
   private byte A12798OFSit ;
   private byte A12786OFMes ;
   private byte A5300Inc_BarReo ;
   private short AV92anyo ;
   private short A194BarOrdLin ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private short A12785OFAnyo ;
   private int A129BarCod ;
   private int AV78Nhdrs ;
   private int AV80Nhdrsok ;
   private int AV79NhdrsnoOk ;
   private int AV99barcod ;
   private int GX_INS1757 ;
   private int A12791OFHdr ;
   private int GX_INS1756 ;
   private int A12788OFHdrs ;
   private int A12789OFCumplida ;
   private int A12790OFIncumpli ;
   private int A5299Inc_Barcod ;
   private long A4931Inc_Linea ;
   private String AV90UsurCod ;
   private String AV95Station ;
   private String AV96EmprCod ;
   private String GXv_char1[] ;
   private String AV97EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String Gx_msg ;
   private String AV121Pgmname ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A2010BarTipDis ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String AV87Seccodf ;
   private String AV88SecNomF ;
   private String AV101barcodpar ;
   private String AV71Fascodnew ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV64Accion ;
   private String AV70FascodIns ;
   private String AV86Procod ;
   private String AV84Ok ;
   private String AV82NoOk ;
   private String A12781OFIdEmpres ;
   private String A12783OFIdSeccio ;
   private String A12793OFHdrP ;
   private String A12799OFFase1 ;
   private String A12800OFFase2 ;
   private String A12801OFAccion ;
   private String A12803OFPedcli ;
   private String A12804OFProceso ;
   private String A12807OFOk ;
   private String A12808OFNoOk ;
   private String Gx_emsg ;
   private String A12784OFIdEmpSec ;
   private String A12787OFSecion ;
   private String A5301Inc_BarPar ;
   private String A4935Inc_Prog ;
   private String AV69Fascodctrl ;
   private java.util.Date AV113FechaCorte ;
   private java.util.Date A8097BarFecHis ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A12805OFFec1 ;
   private java.util.Date A12812OFFecCorte ;
   private java.util.Date AV62Fec1 ;
   private java.util.Date AV63Fec2 ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV98Fecha ;
   private java.util.Date AV67Facturacion ;
   private java.util.Date AV73FechaIns ;
   private java.util.Date AV72FechaEnvH ;
   private java.util.Date A12782OFFecha ;
   private java.util.Date A12794OFFecHis ;
   private java.util.Date A12795OFFecEnt ;
   private java.util.Date A12796OFFecRm ;
   private java.util.Date A12797OFFecHd ;
   private java.util.Date A12802OFFecIns ;
   private java.util.Date A12806OFFec2 ;
   private java.util.Date A4929Inc_Dia ;
   private boolean returnInSub ;
   private boolean brk5LQ2 ;
   private boolean n4442BarFasDTI ;
   private boolean n761ProFasLin ;
   private boolean n12794OFFecHis ;
   private boolean n12795OFFecEnt ;
   private boolean n12796OFFecRm ;
   private boolean n12797OFFecHd ;
   private boolean n12798OFSit ;
   private boolean n12799OFFase1 ;
   private boolean n12800OFFase2 ;
   private boolean n12801OFAccion ;
   private boolean n12802OFFecIns ;
   private boolean n12803OFPedcli ;
   private boolean n12804OFProceso ;
   private boolean n12805OFFec1 ;
   private boolean n12806OFFec2 ;
   private boolean n12807OFOk ;
   private boolean n12808OFNoOk ;
   private boolean n12784OFIdEmpSec ;
   private boolean n12785OFAnyo ;
   private boolean n12786OFMes ;
   private boolean n12787OFSecion ;
   private boolean n12788OFHdrs ;
   private boolean n12789OFCumplida ;
   private boolean n12790OFIncumpli ;
   private boolean n12812OFFecCorte ;
   private boolean n12813OFObs ;
   private String AV116Inc_obs ;
   private String AV65Control ;
   private String AV117OFObs ;
   private String A12813OFObs ;
   private String A4936Inc_Obs ;
   private IDataStoreProvider pr_default ;
   private String[] P05LQ2_A396EmprCod ;
   private java.util.Date[] P05LQ2_A161BarFecSal ;
   private java.util.Date[] P05LQ2_A159BarFecGen ;
   private byte[] P05LQ2_A213BarSit ;
   private String[] P05LQ2_A143BarDisNum ;
   private String[] P05LQ2_A2010BarTipDis ;
   private String[] P05LQ2_A212BarSer ;
   private int[] P05LQ2_A129BarCod ;
   private byte[] P05LQ2_A132BarCodReo ;
   private String[] P05LQ2_A130BarCodPar ;
   private java.util.Date[] P05LQ2_A8097BarFecHis ;
   private java.util.Date[] P05LQ2_A158BarFecFpr ;
   private byte[] P05LQ2_A148BarEstReo ;
   private String[] P05LQ3_A396EmprCod ;
   private int[] P05LQ3_A129BarCod ;
   private byte[] P05LQ3_A132BarCodReo ;
   private String[] P05LQ3_A130BarCodPar ;
   private String[] P05LQ3_A457FasCod ;
   private short[] P05LQ3_A194BarOrdLin ;
   private String[] P05LQ3_A758ProCod ;
   private String[] P05LQ4_A396EmprCod ;
   private int[] P05LQ4_A129BarCod ;
   private byte[] P05LQ4_A132BarCodReo ;
   private String[] P05LQ4_A130BarCodPar ;
   private String[] P05LQ4_A457FasCod ;
   private java.util.Date[] P05LQ4_A4442BarFasDTI ;
   private boolean[] P05LQ4_n4442BarFasDTI ;
   private short[] P05LQ4_A194BarOrdLin ;
   private String[] P05LQ4_A758ProCod ;
   private String[] P05LQ5_A396EmprCod ;
   private int[] P05LQ5_A129BarCod ;
   private byte[] P05LQ5_A132BarCodReo ;
   private String[] P05LQ5_A130BarCodPar ;
   private short[] P05LQ5_A761ProFasLin ;
   private boolean[] P05LQ5_n761ProFasLin ;
   private String[] P05LQ5_A758ProCod ;
   private String[] P05LQ9_A396EmprCod ;
   private int[] P05LQ9_A5299Inc_Barcod ;
   private byte[] P05LQ9_A5300Inc_BarReo ;
   private String[] P05LQ9_A5301Inc_BarPar ;
   private String[] P05LQ9_A4935Inc_Prog ;
   private String[] P05LQ9_A4936Inc_Obs ;
   private long[] P05LQ9_A4931Inc_Linea ;
   private java.util.Date[] P05LQ9_A4929Inc_Dia ;
   private java.util.Date[] P05LQ10_A12782OFFecha ;
   private String[] P05LQ10_A12781OFIdEmpres ;
   private String[] P05LQ10_A12783OFIdSeccio ;
}

final  class apotifhistorico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LQ2", "SELECT EmprCod, BarFecSal, BarFecGen, BarSit, BarDisNum, BarTipDis, BarSer, BarCod, BarCodReo, BarCodPar, BarFecHis, BarFecFpr, BarEstReo FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarSit <= 11) AND (Not (BarFecHis = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) AND (BarEstReo <> 1) ORDER BY EmprCod, BarFecHis, BarTipDis ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LQ3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LQ4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasDTI, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LQ5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05LQ6", "INSERT INTO TXPOTIFDE(OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP, OFFecHis, OFFecEnt, OFFecRm, OFFecHd, OFSit, OFFase1, OFFase2, OFAccion, OFFecIns, OFPedcli, OFProceso, OFFec1, OFFec2, OFOk, OFNoOk) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOTIFDE")
         ,new UpdateCursor("P05LQ7", "INSERT INTO TXPOTIF(OFIdEmpres, OFFecha, OFIdSeccio, OFIdEmpSec, OFAnyo, OFMes, OFSecion, OFHdrs, OFCumplida, OFIncumpli, OFFecCorte, OFObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOTIF")
         ,new UpdateCursor("P05LQ8", "UPDATE TXPOTIF SET OFIncumpli=OFIncumpli + ?, OFCumplida=OFCumplida + ?, OFHdrs=OFHdrs + ?  WHERE OFIdEmpres = ? and OFFecha = ? and OFIdSeccio = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOTIF")
         ,new ForEachCursor("P05LQ9", "SELECT EmprCod, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Prog, Inc_Obs, Inc_Linea, Inc_Dia FROM TXPCRTIN1 WHERE EmprCod = ? and Inc_Barcod = ? and Inc_BarReo = ? and Inc_BarPar = ? ORDER BY EmprCod, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Dia, Inc_Linea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LQ10", "SELECT * FROM (SELECT OFFecha, OFIdEmpres, OFIdSeccio FROM TXPOTIF WHERE OFIdEmpres = ? and OFFecha = ? ORDER BY OFIdEmpres, OFFecha) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 8 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[19], 8);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[21], 9);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[25], 8);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[27], 8);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[29], false);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[35], 1);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 30);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 200);
               }
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 2);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

