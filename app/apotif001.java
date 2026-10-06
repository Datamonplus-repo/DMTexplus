package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apotif001 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apotif001 pgm = new apotif001 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apotif001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apotif001.class ), "" );
   }

   public apotif001( int remoteHandle ,
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
      AV59UsurCod = " " ;
      AV60Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV64EmprCod ;
      GXv_char2[0] = AV71EmprNom ;
      GXv_char3[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV60Station, GXv_char1, GXv_char2, GXv_char3) ;
      apotif001.this.AV64EmprCod = GXv_char1[0] ;
      apotif001.this.AV71EmprNom = GXv_char2[0] ;
      apotif001.this.AV59UsurCod = GXv_char3[0] ;
      GXt_char4 = AV104ddmmaaaa ;
      GXv_char3[0] = AV64EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEINI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apotif001.this.AV64EmprCod = GXv_char3[0] ;
      apotif001.this.GXt_char4 = GXv_char1[0] ;
      AV104ddmmaaaa = GXt_char4 ;
      AV61Fec1 = ((GXutil.strcmp("", AV104ddmmaaaa)==0) ? localUtil.ctod( "01/01/01", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) : localUtil.ctod( AV104ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      GXt_char4 = AV104ddmmaaaa ;
      GXv_char3[0] = AV64EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEFIN", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apotif001.this.AV64EmprCod = GXv_char3[0] ;
      apotif001.this.GXt_char4 = GXv_char1[0] ;
      AV104ddmmaaaa = GXt_char4 ;
      AV62Fec2 = ((GXutil.strcmp("", AV104ddmmaaaa)==0) ? GXutil.today( ) : localUtil.ctod( AV104ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV61Fec1 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61Fec1)) ? GXutil.today( ) : AV61Fec1) ;
      AV62Fec2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Fec2)) ? GXutil.today( ) : AV62Fec2) ;
      GXt_char4 = AV63Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV64EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char3) ;
      apotif001.this.GXt_char4 = GXv_char3[0] ;
      AV63Carpeta = GXt_char4 ;
      GXt_char4 = AV63Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apotif001.this.GXt_char4 = GXv_char3[0] ;
      AV63Carpeta = ((GXutil.strcmp("", AV63Carpeta)==0) ? GXt_char4 : AV63Carpeta) ;
      AV65NomInf = httpContext.getMessage( "OTIF-DATOS v0", "") ;
      AV66File = GXutil.trim( AV63Carpeta) + "\\" + GXutil.trim( AV65NomInf) + httpContext.getMessage( ".csv", "") ;
      AV93NomInf2 = httpContext.getMessage( "OTIF_DETAIL", "") ;
      AV92File2 = GXutil.trim( AV63Carpeta) + "\\" + GXutil.trim( AV93NomInf2) + httpContext.getMessage( ".csv", "") ;
      AV115NomInf3 = httpContext.getMessage( "OTIF_DETAIL_NO", "") ;
      AV116File3 = GXutil.trim( AV63Carpeta) + "\\" + GXutil.trim( AV115NomInf3) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV66File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV70Stat = GXutil.deleteFile( AV66File) ;
      }
      if ( new app.core.file(remoteHandle, context).executeUdp( AV92File2) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV94Stat2 = GXutil.deleteFile( AV92File2) ;
      }
      if ( new app.core.file(remoteHandle, context).executeUdp( AV116File3) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV113Stat3 = GXutil.deleteFile( AV116File3) ;
      }
      GXt_int5 = AV69hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV66File, GXv_int6) ;
      apotif001.this.GXt_int5 = GXv_int6[0] ;
      AV69hnd = GXt_int5 ;
      GXt_int5 = AV95hnd2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV92File2, GXv_int6) ;
      apotif001.this.GXt_int5 = GXv_int6[0] ;
      AV95hnd2 = GXt_int5 ;
      GXt_int5 = AV114hnd3 ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV116File3, GXv_int6) ;
      apotif001.this.GXt_int5 = GXv_int6[0] ;
      AV114hnd3 = GXt_int5 ;
      AV67Control = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Año", "") + ";" + httpContext.getMessage( "Mes", "") + ";" + httpContext.getMessage( "Seccion", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Cumplidas", "") + ";" + httpContext.getMessage( "Incumplidas", "") ;
      GXt_int7 = AV70Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV69hnd, AV67Control, GXv_int8) ;
      apotif001.this.GXt_int7 = GXv_int8[0] ;
      AV70Stat = GXt_int7 ;
      AV96Control2 = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Año", "") + ";" + httpContext.getMessage( "Mes", "") + ";" + httpContext.getMessage( "Seccion", "") + ";" + httpContext.getMessage( "Fecha Env Hist", "") + ";" + httpContext.getMessage( "Fecha Comp Cli", "") + ";" + httpContext.getMessage( "Fecha Remito", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Fecha HDR", "") + ";" + httpContext.getMessage( "Sit", "") + ";" + httpContext.getMessage( "Cumplida", "") + ";" + httpContext.getMessage( "Incumplida", "") + ";" + httpContext.getMessage( "Facturacion", "") + ";" ;
      AV96Control2 += httpContext.getMessage( "Fase", "") + ";" + httpContext.getMessage( "Fase Inci", "") + ";" + httpContext.getMessage( "Accion", "") + ";" + httpContext.getMessage( "Dia Inci", "") + ";" + httpContext.getMessage( "Ped Cli", "") + ";" + httpContext.getMessage( "Proceso", "") + ";" + httpContext.getMessage( "Cliente", "") + ";" + httpContext.getMessage( "Observaciones", "") ;
      GXt_int7 = AV94Stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV95hnd2, AV96Control2, GXv_int8) ;
      apotif001.this.GXt_int7 = GXv_int8[0] ;
      AV94Stat2 = GXt_int7 ;
      GXt_int7 = AV113Stat3 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV114hnd3, AV96Control2, GXv_int8) ;
      apotif001.this.GXt_int7 = GXv_int8[0] ;
      AV113Stat3 = GXt_int7 ;
      /* Using cursor P05DI2 */
      pr_default.execute(0, new Object[] {AV64EmprCod, AV61Fec1, AV62Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5DI2 = false ;
         A252CliCod = P05DI2_A252CliCod[0] ;
         n252CliCod = P05DI2_n252CliCod[0] ;
         A396EmprCod = P05DI2_A396EmprCod[0] ;
         A2010BarTipDis = P05DI2_A2010BarTipDis[0] ;
         A8097BarFecHis = P05DI2_A8097BarFecHis[0] ;
         A158BarFecFpr = P05DI2_A158BarFecFpr[0] ;
         A161BarFecSal = P05DI2_A161BarFecSal[0] ;
         A213BarSit = P05DI2_A213BarSit[0] ;
         A159BarFecGen = P05DI2_A159BarFecGen[0] ;
         A130BarCodPar = P05DI2_A130BarCodPar[0] ;
         A132BarCodReo = P05DI2_A132BarCodReo[0] ;
         A129BarCod = P05DI2_A129BarCod[0] ;
         A279CliNom = P05DI2_A279CliNom[0] ;
         A143BarDisNum = P05DI2_A143BarDisNum[0] ;
         A148BarEstReo = P05DI2_A148BarEstReo[0] ;
         A279CliNom = P05DI2_A279CliNom[0] ;
         if ( ( (GXutil.strcmp("", A130BarCodPar)==0) && ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) != 0 ) ) )
         {
            if ( ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRENDAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEPARACI", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRABACIO", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MUESTRAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRAB+MUE", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOMUES", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOPREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEP+GRAB", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "AGRABAR", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-GRAN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGPAPEL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-PREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGTELA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRETRATA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGITAL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MULTIDNO", "")) != 0 ) )
            {
               AV76Seccodf = ((GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "ES", "") : httpContext.getMessage( "TI", "")) ;
               AV77SecNomF = ((GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "Estampacion", "") : httpContext.getMessage( "Tintoreria", "")) ;
               AV80Fecha = A158BarFecFpr ;
               AV72anyo = (short)(GXutil.year( AV80Fecha)) ;
               AV97mes = (byte)(GXutil.month( AV80Fecha)) ;
               AV99Nhdrs = 0 ;
               AV100Nhdrsok = 0 ;
               AV101NhdrsnoOk = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05DI2_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P05DI2_A158BarFecFpr[0]), GXutil.resetTime(A158BarFecFpr)) && ( GXutil.strcmp(P05DI2_A2010BarTipDis[0], A2010BarTipDis) == 0 ) )
               {
                  brk5DI2 = false ;
                  A252CliCod = P05DI2_A252CliCod[0] ;
                  n252CliCod = P05DI2_n252CliCod[0] ;
                  A8097BarFecHis = P05DI2_A8097BarFecHis[0] ;
                  A161BarFecSal = P05DI2_A161BarFecSal[0] ;
                  A213BarSit = P05DI2_A213BarSit[0] ;
                  A159BarFecGen = P05DI2_A159BarFecGen[0] ;
                  A130BarCodPar = P05DI2_A130BarCodPar[0] ;
                  A132BarCodReo = P05DI2_A132BarCodReo[0] ;
                  A129BarCod = P05DI2_A129BarCod[0] ;
                  A279CliNom = P05DI2_A279CliNom[0] ;
                  A143BarDisNum = P05DI2_A143BarDisNum[0] ;
                  A279CliNom = P05DI2_A279CliNom[0] ;
                  if ( ( (GXutil.strcmp("", A130BarCodPar)==0) && ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) != 0 ) ) )
                  {
                     if ( ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRENDAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEPARACI", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRABACIO", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MUESTRAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRAB+MUE", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOMUES", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOPREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEP+GRAB", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "AGRABAR", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-GRAN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGPAPEL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-PREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGTELA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRETRATA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGITAL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MULTIDNO", "")) != 0 ) )
                     {
                        AV105Fascodnew = "" ;
                        /* Using cursor P05DI3 */
                        pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                        while ( (pr_default.getStatus(1) != 101) )
                        {
                           A457FasCod = P05DI3_A457FasCod[0] ;
                           A758ProCod = P05DI3_A758ProCod[0] ;
                           A194BarOrdLin = P05DI3_A194BarOrdLin[0] ;
                           if ( ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CARTERA", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "PARA EST", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "BODEGAJE", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "FINDEMES", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CIUDAD", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "NEGOCIAC", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CLIENTE", "")) == 0 ) || ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "CITA", "")) == 0 ) )
                           {
                              AV105Fascodnew = A457FasCod ;
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                           pr_default.readNext(1);
                        }
                        pr_default.close(1);
                        AV111Facturacion = GXutil.nullDate() ;
                        /* Using cursor P05DI4 */
                        pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                        while ( (pr_default.getStatus(2) != 101) )
                        {
                           A457FasCod = P05DI4_A457FasCod[0] ;
                           A4442BarFasDTI = P05DI4_A4442BarFasDTI[0] ;
                           n4442BarFasDTI = P05DI4_n4442BarFasDTI[0] ;
                           A758ProCod = P05DI4_A758ProCod[0] ;
                           A194BarOrdLin = P05DI4_A194BarOrdLin[0] ;
                           if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "FACTURA", "")) == 0 )
                           {
                              AV111Facturacion = localUtil.ctod( localUtil.ttoc( A4442BarFasDTI, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                           }
                           pr_default.readNext(2);
                        }
                        pr_default.close(2);
                        AV107Accion = "" ;
                        AV108FechaIns = GXutil.nullDate() ;
                        AV109FascodIns = "" ;
                        if ( GXutil.strcmp(AV105Fascodnew, "") != 0 )
                        {
                           /* Using cursor P05DI5 */
                           pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                           while ( (pr_default.getStatus(3) != 101) )
                           {
                              A5299Inc_Barcod = P05DI5_A5299Inc_Barcod[0] ;
                              A5300Inc_BarReo = P05DI5_A5300Inc_BarReo[0] ;
                              A5301Inc_BarPar = P05DI5_A5301Inc_BarPar[0] ;
                              A4935Inc_Prog = P05DI5_A4935Inc_Prog[0] ;
                              A4936Inc_Obs = P05DI5_A4936Inc_Obs[0] ;
                              A4931Inc_Linea = P05DI5_A4931Inc_Linea[0] ;
                              A4929Inc_Dia = P05DI5_A4929Inc_Dia[0] ;
                              if ( GXutil.strcmp(A4935Inc_Prog, httpContext.getMessage( "WBARFASw  ", "")) == 0 )
                              {
                                 AV106Fascodctrl = GXutil.substring( A4936Inc_Obs, 7, 8) ;
                                 AV107Accion = GXutil.substring( A4936Inc_Obs, 28, 9) ;
                                 if ( ( GXutil.strcmp(GXutil.trim( AV106Fascodctrl), GXutil.trim( AV105Fascodnew)) == 0 ) && ( GXutil.strcmp(GXutil.trim( AV107Accion), httpContext.getMessage( "Insertada", "")) == 0 ) )
                                 {
                                    AV108FechaIns = A4929Inc_Dia ;
                                    AV109FascodIns = AV106Fascodctrl ;
                                 }
                                 if ( ( GXutil.strcmp(GXutil.trim( AV106Fascodctrl), GXutil.trim( AV105Fascodnew)) == 0 ) && ( GXutil.strcmp(GXutil.trim( AV107Accion), httpContext.getMessage( "Eliminada", "")) == 0 ) )
                                 {
                                    AV108FechaIns = A4929Inc_Dia ;
                                    AV109FascodIns = AV106Fascodctrl ;
                                 }
                              }
                              pr_default.readNext(3);
                           }
                           pr_default.close(3);
                        }
                        AV118Presinco = (byte)(0) ;
                        /* Using cursor P05DI6 */
                        pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                        while ( (pr_default.getStatus(4) != 101) )
                        {
                           A761ProFasLin = P05DI6_A761ProFasLin[0] ;
                           n761ProFasLin = P05DI6_n761ProFasLin[0] ;
                           A758ProCod = P05DI6_A758ProCod[0] ;
                           AV118Presinco = (byte)(((GXutil.strcmp(A758ProCod, httpContext.getMessage( "PRESINCO", ""))==0) ? 1 : ((GXutil.strcmp(A758ProCod, httpContext.getMessage( "LAVMAQUI", ""))==0) ? 1 : ((GXutil.strcmp(A758ProCod, httpContext.getMessage( "DIGTELA", ""))==0) ? 1 : 0)))) ;
                           AV117Procod = A758ProCod ;
                           pr_default.readNext(4);
                        }
                        pr_default.close(4);
                        if ( AV118Presinco == 0 )
                        {
                           AV98FechaEnvH = localUtil.ctod( localUtil.ttoc( A8097BarFecHis, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                           AV99Nhdrs = (int)(AV99Nhdrs+1) ;
                           AV110Inserto = (byte)(0) ;
                           AV103Ok = "" ;
                           AV102NoOk = "" ;
                           if ( ( GXutil.strcmp(AV109FascodIns, httpContext.getMessage( "CARTERA", "")) == 0 ) || ( GXutil.strcmp(AV109FascodIns, httpContext.getMessage( "PARA EST", "")) == 0 ) || ( GXutil.strcmp(AV109FascodIns, httpContext.getMessage( "BODEGAJE", "")) == 0 ) || ( GXutil.strcmp(AV109FascodIns, httpContext.getMessage( "FINDEMES", "")) == 0 ) || ( GXutil.strcmp(AV109FascodIns, httpContext.getMessage( "CIUDAD", "")) == 0 ) || ( GXutil.strcmp(AV109FascodIns, httpContext.getMessage( "NEGOCIAC", "")) == 0 ) || ( GXutil.strcmp(AV109FascodIns, httpContext.getMessage( "CLIENTE", "")) == 0 ) || ( GXutil.strcmp(AV109FascodIns, httpContext.getMessage( "CITA", "")) == 0 ) )
                           {
                              if ( (( GXutil.resetTime(AV108FechaIns).before( GXutil.resetTime( A158BarFecFpr )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV108FechaIns), GXutil.resetTime(A158BarFecFpr)) )) )
                              {
                                 AV100Nhdrsok = (int)(AV100Nhdrsok+1) ;
                                 AV103Ok = httpContext.getMessage( "S", "") ;
                                 AV110Inserto = (byte)(1) ;
                              }
                              if ( GXutil.resetTime(AV108FechaIns).after( GXutil.resetTime( A158BarFecFpr )) )
                              {
                                 AV101NhdrsnoOk = (int)(AV101NhdrsnoOk+1) ;
                                 AV102NoOk = httpContext.getMessage( "S", "") ;
                                 AV110Inserto = (byte)(1) ;
                              }
                           }
                           else
                           {
                              if ( GXutil.resetTime(AV98FechaEnvH).after( GXutil.resetTime( A158BarFecFpr )) )
                              {
                                 AV101NhdrsnoOk = (int)(AV101NhdrsnoOk+1) ;
                                 AV102NoOk = httpContext.getMessage( "S", "") ;
                                 AV110Inserto = (byte)(1) ;
                              }
                              if ( (( GXutil.resetTime(AV98FechaEnvH).before( GXutil.resetTime( A158BarFecFpr )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV98FechaEnvH), GXutil.resetTime(A158BarFecFpr)) )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98FechaEnvH)) )
                              {
                                 AV100Nhdrsok = (int)(AV100Nhdrsok+1) ;
                                 AV103Ok = httpContext.getMessage( "S", "") ;
                                 AV110Inserto = (byte)(1) ;
                              }
                           }
                        }
                        AV119Observaciones = httpContext.getMessage( "Modificacion aplicada 01/10/2018", "") ;
                        if ( AV110Inserto == 1 )
                        {
                           AV96Control2 = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( A158BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + AV76Seccodf + ";" + A396EmprCod + AV76Seccodf + ";" + GXutil.str( AV72anyo, 4, 0) + ";" + GXutil.str( AV97mes, 2, 0) + ";" + AV77SecNomF + ";" ;
                           AV96Control2 += localUtil.dtoc( AV98FechaEnvH, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + localUtil.dtoc( A158BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" ;
                           AV96Control2 += GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( A213BarSit, 2, 0) + ";" + AV103Ok + ";" + AV102NoOk + ";" + localUtil.dtoc( AV111Facturacion, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + AV105Fascodnew + ";" + AV109FascodIns + ";" + AV107Accion + ";" + localUtil.dtoc( AV108FechaIns, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" ;
                           AV96Control2 += A143BarDisNum + ";" + AV117Procod + ";" + A279CliNom + ";" + AV119Observaciones ;
                           GXt_int7 = AV94Stat2 ;
                           GXv_int8[0] = GXt_int7 ;
                           new app.core.fputs(remoteHandle, context).execute( AV95hnd2, AV96Control2, GXv_int8) ;
                           apotif001.this.GXt_int7 = GXv_int8[0] ;
                           AV94Stat2 = GXt_int7 ;
                        }
                        else
                        {
                           AV112Control3 = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( A158BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + AV76Seccodf + ";" + A396EmprCod + AV76Seccodf + ";" + GXutil.str( AV72anyo, 4, 0) + ";" + GXutil.str( AV97mes, 2, 0) + ";" + AV77SecNomF + ";" ;
                           AV112Control3 += localUtil.dtoc( AV98FechaEnvH, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + localUtil.dtoc( A158BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" ;
                           AV112Control3 += GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( A213BarSit, 2, 0) + ";" + "-" + ";" + "-" + ";" + localUtil.dtoc( AV111Facturacion, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + AV105Fascodnew + ";" + AV109FascodIns + ";" + AV107Accion + ";" + localUtil.dtoc( AV108FechaIns, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" ;
                           AV112Control3 += A143BarDisNum + ";" + AV117Procod + ";" + A279CliNom + ";" + AV119Observaciones ;
                           GXt_int7 = AV113Stat3 ;
                           GXv_int8[0] = GXt_int7 ;
                           new app.core.fputs(remoteHandle, context).execute( AV114hnd3, AV112Control3, GXv_int8) ;
                           apotif001.this.GXt_int7 = GXv_int8[0] ;
                           AV113Stat3 = GXt_int7 ;
                        }
                        AV110Inserto = (byte)(0) ;
                     }
                  }
                  brk5DI2 = true ;
                  pr_default.readNext(0);
               }
               AV99Nhdrs = (int)(AV101NhdrsnoOk+AV100Nhdrsok) ;
               AV67Control = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( A158BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + AV76Seccodf + ";" + A396EmprCod + AV76Seccodf + ";" + GXutil.str( AV72anyo, 4, 0) + ";" + GXutil.str( AV97mes, 2, 0) + ";" + AV77SecNomF + ";" + GXutil.str( AV99Nhdrs, 8, 0) + ";" ;
               AV67Control += GXutil.str( AV100Nhdrsok, 8, 0) + ";" + GXutil.str( AV101NhdrsnoOk, 8, 0) ;
               GXt_int7 = AV70Stat ;
               GXv_int8[0] = GXt_int7 ;
               new app.core.fputs(remoteHandle, context).execute( AV69hnd, AV67Control, GXv_int8) ;
               apotif001.this.GXt_int7 = GXv_int8[0] ;
               AV70Stat = GXt_int7 ;
            }
         }
         if ( ! brk5DI2 )
         {
            brk5DI2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      GXt_int7 = AV70Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV69hnd, GXv_int8) ;
      apotif001.this.GXt_int7 = GXv_int8[0] ;
      AV70Stat = GXt_int7 ;
      GXt_int7 = AV94Stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV95hnd2, GXv_int8) ;
      apotif001.this.GXt_int7 = GXv_int8[0] ;
      AV94Stat2 = GXt_int7 ;
      GXt_int7 = AV113Stat3 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV114hnd3, GXv_int8) ;
      apotif001.this.GXt_int7 = GXv_int8[0] ;
      AV113Stat3 = GXt_int7 ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(potif001.class);
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
      AV59UsurCod = "" ;
      AV60Station = "" ;
      AV64EmprCod = "" ;
      AV71EmprNom = "" ;
      AV104ddmmaaaa = "" ;
      AV61Fec1 = GXutil.nullDate() ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      AV62Fec2 = GXutil.nullDate() ;
      AV63Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV65NomInf = "" ;
      AV66File = "" ;
      AV93NomInf2 = "" ;
      AV92File2 = "" ;
      AV115NomInf3 = "" ;
      AV116File3 = "" ;
      GXv_int6 = new long[1] ;
      AV67Control = "" ;
      AV96Control2 = "" ;
      scmdbuf = "" ;
      P05DI2_A252CliCod = new int[1] ;
      P05DI2_n252CliCod = new boolean[] {false} ;
      P05DI2_A396EmprCod = new String[] {""} ;
      P05DI2_A2010BarTipDis = new String[] {""} ;
      P05DI2_A8097BarFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      P05DI2_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P05DI2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P05DI2_A213BarSit = new byte[1] ;
      P05DI2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05DI2_A130BarCodPar = new String[] {""} ;
      P05DI2_A132BarCodReo = new byte[1] ;
      P05DI2_A129BarCod = new int[1] ;
      P05DI2_A279CliNom = new String[] {""} ;
      P05DI2_A143BarDisNum = new String[] {""} ;
      P05DI2_A148BarEstReo = new byte[1] ;
      A396EmprCod = "" ;
      A2010BarTipDis = "" ;
      A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
      A158BarFecFpr = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A143BarDisNum = "" ;
      AV76Seccodf = "" ;
      AV77SecNomF = "" ;
      AV80Fecha = GXutil.nullDate() ;
      AV105Fascodnew = "" ;
      P05DI3_A396EmprCod = new String[] {""} ;
      P05DI3_A129BarCod = new int[1] ;
      P05DI3_A132BarCodReo = new byte[1] ;
      P05DI3_A130BarCodPar = new String[] {""} ;
      P05DI3_A457FasCod = new String[] {""} ;
      P05DI3_A758ProCod = new String[] {""} ;
      P05DI3_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV111Facturacion = GXutil.nullDate() ;
      P05DI4_A396EmprCod = new String[] {""} ;
      P05DI4_A129BarCod = new int[1] ;
      P05DI4_A132BarCodReo = new byte[1] ;
      P05DI4_A130BarCodPar = new String[] {""} ;
      P05DI4_A457FasCod = new String[] {""} ;
      P05DI4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05DI4_n4442BarFasDTI = new boolean[] {false} ;
      P05DI4_A758ProCod = new String[] {""} ;
      P05DI4_A194BarOrdLin = new short[1] ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV107Accion = "" ;
      AV108FechaIns = GXutil.nullDate() ;
      AV109FascodIns = "" ;
      P05DI5_A396EmprCod = new String[] {""} ;
      P05DI5_A5299Inc_Barcod = new int[1] ;
      P05DI5_A5300Inc_BarReo = new byte[1] ;
      P05DI5_A5301Inc_BarPar = new String[] {""} ;
      P05DI5_A4935Inc_Prog = new String[] {""} ;
      P05DI5_A4936Inc_Obs = new String[] {""} ;
      P05DI5_A4931Inc_Linea = new long[1] ;
      P05DI5_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      A5301Inc_BarPar = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      AV106Fascodctrl = "" ;
      P05DI6_A396EmprCod = new String[] {""} ;
      P05DI6_A129BarCod = new int[1] ;
      P05DI6_A132BarCodReo = new byte[1] ;
      P05DI6_A130BarCodPar = new String[] {""} ;
      P05DI6_A761ProFasLin = new short[1] ;
      P05DI6_n761ProFasLin = new boolean[] {false} ;
      P05DI6_A758ProCod = new String[] {""} ;
      AV117Procod = "" ;
      AV98FechaEnvH = GXutil.nullDate() ;
      AV103Ok = "" ;
      AV102NoOk = "" ;
      AV119Observaciones = "" ;
      AV112Control3 = "" ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apotif001__default(),
         new Object[] {
             new Object[] {
            P05DI2_A252CliCod, P05DI2_n252CliCod, P05DI2_A396EmprCod, P05DI2_A2010BarTipDis, P05DI2_A8097BarFecHis, P05DI2_A158BarFecFpr, P05DI2_A161BarFecSal, P05DI2_A213BarSit, P05DI2_A159BarFecGen, P05DI2_A130BarCodPar,
            P05DI2_A132BarCodReo, P05DI2_A129BarCod, P05DI2_A279CliNom, P05DI2_A143BarDisNum, P05DI2_A148BarEstReo
            }
            , new Object[] {
            P05DI3_A396EmprCod, P05DI3_A129BarCod, P05DI3_A132BarCodReo, P05DI3_A130BarCodPar, P05DI3_A457FasCod, P05DI3_A758ProCod, P05DI3_A194BarOrdLin
            }
            , new Object[] {
            P05DI4_A396EmprCod, P05DI4_A129BarCod, P05DI4_A132BarCodReo, P05DI4_A130BarCodPar, P05DI4_A457FasCod, P05DI4_A4442BarFasDTI, P05DI4_n4442BarFasDTI, P05DI4_A758ProCod, P05DI4_A194BarOrdLin
            }
            , new Object[] {
            P05DI5_A396EmprCod, P05DI5_A5299Inc_Barcod, P05DI5_A5300Inc_BarReo, P05DI5_A5301Inc_BarPar, P05DI5_A4935Inc_Prog, P05DI5_A4936Inc_Obs, P05DI5_A4931Inc_Linea, P05DI5_A4929Inc_Dia
            }
            , new Object[] {
            P05DI6_A396EmprCod, P05DI6_A129BarCod, P05DI6_A132BarCodReo, P05DI6_A130BarCodPar, P05DI6_A761ProFasLin, P05DI6_n761ProFasLin, P05DI6_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV70Stat ;
   private byte AV94Stat2 ;
   private byte AV113Stat3 ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte AV97mes ;
   private byte A5300Inc_BarReo ;
   private byte AV118Presinco ;
   private byte AV110Inserto ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short AV72anyo ;
   private short A194BarOrdLin ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV99Nhdrs ;
   private int AV100Nhdrsok ;
   private int AV101NhdrsnoOk ;
   private int A5299Inc_Barcod ;
   private long AV69hnd ;
   private long AV95hnd2 ;
   private long AV114hnd3 ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private long A4931Inc_Linea ;
   private String AV59UsurCod ;
   private String AV60Station ;
   private String AV64EmprCod ;
   private String AV71EmprNom ;
   private String AV104ddmmaaaa ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV63Carpeta ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV65NomInf ;
   private String AV93NomInf2 ;
   private String AV115NomInf3 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A2010BarTipDis ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A143BarDisNum ;
   private String AV76Seccodf ;
   private String AV77SecNomF ;
   private String AV105Fascodnew ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV107Accion ;
   private String AV109FascodIns ;
   private String A5301Inc_BarPar ;
   private String A4935Inc_Prog ;
   private String AV106Fascodctrl ;
   private String AV117Procod ;
   private String AV103Ok ;
   private String AV102NoOk ;
   private String AV119Observaciones ;
   private java.util.Date A8097BarFecHis ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV61Fec1 ;
   private java.util.Date AV62Fec2 ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV80Fecha ;
   private java.util.Date AV111Facturacion ;
   private java.util.Date AV108FechaIns ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date AV98FechaEnvH ;
   private boolean Cond_result ;
   private boolean brk5DI2 ;
   private boolean n252CliCod ;
   private boolean n4442BarFasDTI ;
   private boolean n761ProFasLin ;
   private String AV66File ;
   private String AV92File2 ;
   private String AV116File3 ;
   private String AV67Control ;
   private String AV96Control2 ;
   private String A4936Inc_Obs ;
   private String AV112Control3 ;
   private IDataStoreProvider pr_default ;
   private int[] P05DI2_A252CliCod ;
   private boolean[] P05DI2_n252CliCod ;
   private String[] P05DI2_A396EmprCod ;
   private String[] P05DI2_A2010BarTipDis ;
   private java.util.Date[] P05DI2_A8097BarFecHis ;
   private java.util.Date[] P05DI2_A158BarFecFpr ;
   private java.util.Date[] P05DI2_A161BarFecSal ;
   private byte[] P05DI2_A213BarSit ;
   private java.util.Date[] P05DI2_A159BarFecGen ;
   private String[] P05DI2_A130BarCodPar ;
   private byte[] P05DI2_A132BarCodReo ;
   private int[] P05DI2_A129BarCod ;
   private String[] P05DI2_A279CliNom ;
   private String[] P05DI2_A143BarDisNum ;
   private byte[] P05DI2_A148BarEstReo ;
   private String[] P05DI3_A396EmprCod ;
   private int[] P05DI3_A129BarCod ;
   private byte[] P05DI3_A132BarCodReo ;
   private String[] P05DI3_A130BarCodPar ;
   private String[] P05DI3_A457FasCod ;
   private String[] P05DI3_A758ProCod ;
   private short[] P05DI3_A194BarOrdLin ;
   private String[] P05DI4_A396EmprCod ;
   private int[] P05DI4_A129BarCod ;
   private byte[] P05DI4_A132BarCodReo ;
   private String[] P05DI4_A130BarCodPar ;
   private String[] P05DI4_A457FasCod ;
   private java.util.Date[] P05DI4_A4442BarFasDTI ;
   private boolean[] P05DI4_n4442BarFasDTI ;
   private String[] P05DI4_A758ProCod ;
   private short[] P05DI4_A194BarOrdLin ;
   private String[] P05DI5_A396EmprCod ;
   private int[] P05DI5_A5299Inc_Barcod ;
   private byte[] P05DI5_A5300Inc_BarReo ;
   private String[] P05DI5_A5301Inc_BarPar ;
   private String[] P05DI5_A4935Inc_Prog ;
   private String[] P05DI5_A4936Inc_Obs ;
   private long[] P05DI5_A4931Inc_Linea ;
   private java.util.Date[] P05DI5_A4929Inc_Dia ;
   private String[] P05DI6_A396EmprCod ;
   private int[] P05DI6_A129BarCod ;
   private byte[] P05DI6_A132BarCodReo ;
   private String[] P05DI6_A130BarCodPar ;
   private short[] P05DI6_A761ProFasLin ;
   private boolean[] P05DI6_n761ProFasLin ;
   private String[] P05DI6_A758ProCod ;
}

final  class apotif001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05DI2", "SELECT T1.CliCod, T1.EmprCod, T1.BarTipDis, T1.BarFecHis, T1.BarFecFpr, T1.BarFecSal, T1.BarSit, T1.BarFecGen, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.CliNom, T1.BarDisNum, T1.BarEstReo FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.BarFecFpr >= ?) AND (T1.BarSit <= 11) AND (Not (T1.BarFecFpr = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) AND (T1.BarEstReo <> 1) AND (T1.BarFecFpr <= ?) ORDER BY T1.EmprCod, T1.BarFecFpr, T1.BarTipDis ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DI3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DI4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasDTI, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DI5", "SELECT EmprCod, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Prog, Inc_Obs, Inc_Linea, Inc_Dia FROM TXPCRTIN1 WHERE EmprCod = ? and Inc_Barcod = ? and Inc_BarReo = ? and Inc_BarPar = ? ORDER BY EmprCod, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Dia, Inc_Linea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DI6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((String[]) buf[13])[0] = rslt.getString(13, 8);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

