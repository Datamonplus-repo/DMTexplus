package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptiaes extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptiaes pgm = new aptiaes (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptiaes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptiaes.class ), "" );
   }

   public aptiaes( int remoteHandle ,
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
      AV41UsurCod = " " ;
      AV42Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV43EmprCod ;
      GXv_char2[0] = AV44EmprNom ;
      GXv_char3[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char1, GXv_char2, GXv_char3) ;
      aptiaes.this.AV43EmprCod = GXv_char1[0] ;
      aptiaes.this.AV44EmprNom = GXv_char2[0] ;
      aptiaes.this.AV41UsurCod = GXv_char3[0] ;
      GXt_char4 = AV63Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV43EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char3) ;
      aptiaes.this.GXt_char4 = GXv_char3[0] ;
      AV63Carpeta = GXt_char4 ;
      GXt_char4 = AV63Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      aptiaes.this.GXt_char4 = GXv_char3[0] ;
      AV63Carpeta = ((GXutil.strcmp("", AV63Carpeta)==0) ? GXt_char4 : AV63Carpeta) ;
      GXt_char4 = AV60ddmmaaaa ;
      GXv_char3[0] = AV43EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "TIAESI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      aptiaes.this.AV43EmprCod = GXv_char3[0] ;
      aptiaes.this.GXt_char4 = GXv_char1[0] ;
      AV60ddmmaaaa = GXt_char4 ;
      AV45Fec1 = ((GXutil.strcmp("", AV60ddmmaaaa)==0) ? GXutil.dadd(GXutil.today( ),-(60)) : localUtil.ctod( AV60ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      GXt_char4 = AV60ddmmaaaa ;
      GXv_char3[0] = AV43EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "TIAESF", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      aptiaes.this.AV43EmprCod = GXv_char3[0] ;
      aptiaes.this.GXt_char4 = GXv_char1[0] ;
      AV60ddmmaaaa = GXt_char4 ;
      AV46Fec2 = ((GXutil.strcmp("", AV60ddmmaaaa)==0) ? GXutil.today( ) : localUtil.ctod( AV60ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV46Fec2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46Fec2)) ? Gx_date : AV46Fec2) ;
      AV64NomInf = httpContext.getMessage( "TIAS_CONTROL", "") ;
      AV66File = GXutil.trim( AV63Carpeta) + "\\" + GXutil.trim( AV64NomInf) + httpContext.getMessage( ".csv", "") ;
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
         AV67Stat = GXutil.deleteFile( AV66File) ;
      }
      GXt_int5 = AV68hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV66File, GXv_int6) ;
      aptiaes.this.GXt_int5 = GXv_int6[0] ;
      AV68hnd = (short)(GXt_int5) ;
      AV56Control = httpContext.getMessage( "TABLA", "") + ";" + httpContext.getMessage( "EMPRESA", "") + ";" + httpContext.getMessage( "MAQUINA", "") + ";" + httpContext.getMessage( "FECHA", "") + ";" + httpContext.getMessage( "LINEA", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "SECCION", "") + ";" + httpContext.getMessage( "TIPO PRODUCCION", "") + ";" + httpContext.getMessage( "KILOS", "") + ";" + httpContext.getMessage( "METROS", "") + ";" + httpContext.getMessage( "ExisteTIAES", "") + ";" + httpContext.getMessage( "UNIDADES", "") + ";" + httpContext.getMessage( "KILOS_P", "") + ";" + httpContext.getMessage( "METROS_P", "") ;
      GXt_int7 = (byte)(AV67Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV68hnd, AV56Control, GXv_int8) ;
      aptiaes.this.GXt_int7 = GXv_int8[0] ;
      AV67Stat = GXt_int7 ;
      System.out.println( AV56Control );
      AV70UNIDADES = DecimalUtil.doubleToDec(0) ;
      AV71METROS_P = DecimalUtil.doubleToDec(0) ;
      AV72KILOS_P = DecimalUtil.doubleToDec(0) ;
      AV69Existe = (byte)(0) ;
      /* Using cursor P05AO2 */
      pr_default.execute(0, new Object[] {AV43EmprCod, AV45Fec1, AV46Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05AO2_A396EmprCod[0] ;
         A561HisProLin = P05AO2_A561HisProLin[0] ;
         A558HisProFec = P05AO2_A558HisProFec[0] ;
         A602MaqCod = P05AO2_A602MaqCod[0] ;
         n602MaqCod = P05AO2_n602MaqCod[0] ;
         A252CliCod = P05AO2_A252CliCod[0] ;
         n252CliCod = P05AO2_n252CliCod[0] ;
         A858ZonGeoCod = P05AO2_A858ZonGeoCod[0] ;
         A2247HisProTip = P05AO2_A2247HisProTip[0] ;
         A1011TipMaqCod = P05AO2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P05AO2_n1011TipMaqCod[0] ;
         A656ParCod = P05AO2_A656ParCod[0] ;
         n656ParCod = P05AO2_n656ParCod[0] ;
         A218BarTipCol = P05AO2_A218BarTipCol[0] ;
         A3612HisProReo = P05AO2_A3612HisProReo[0] ;
         A1526HisProMtr = P05AO2_A1526HisProMtr[0] ;
         A1525HisProKgr = P05AO2_A1525HisProKgr[0] ;
         A228BarUniMed = P05AO2_A228BarUniMed[0] ;
         A129BarCod = P05AO2_A129BarCod[0] ;
         A194BarOrdLin = P05AO2_A194BarOrdLin[0] ;
         A130BarCodPar = P05AO2_A130BarCodPar[0] ;
         A132BarCodReo = P05AO2_A132BarCodReo[0] ;
         A212BarSer = P05AO2_A212BarSer[0] ;
         A135BarColNom = P05AO2_A135BarColNom[0] ;
         A136BarColNum = P05AO2_A136BarColNum[0] ;
         A1011TipMaqCod = P05AO2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P05AO2_n1011TipMaqCod[0] ;
         A252CliCod = P05AO2_A252CliCod[0] ;
         n252CliCod = P05AO2_n252CliCod[0] ;
         A218BarTipCol = P05AO2_A218BarTipCol[0] ;
         A228BarUniMed = P05AO2_A228BarUniMed[0] ;
         A212BarSer = P05AO2_A212BarSer[0] ;
         A135BarColNom = P05AO2_A135BarColNom[0] ;
         A136BarColNum = P05AO2_A136BarColNum[0] ;
         A858ZonGeoCod = P05AO2_A858ZonGeoCod[0] ;
         AV53barcod = A129BarCod ;
         AV54barcodreo = A132BarCodReo ;
         AV55barcodpar = A130BarCodPar ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_char1[0] = A135BarColNom ;
         GXv_int10[0] = A136BarColNum ;
         GXv_int8[0] = A218BarTipCol ;
         GXv_int11[0] = AV51Intcod ;
         GXv_char12[0] = "" ;
         GXv_char13[0] = "" ;
         GXv_int14[0] = 0 ;
         new app.pbusint(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_char2, GXv_char1, GXv_int10, GXv_int8, GXv_int11, GXv_char12, GXv_char13, GXv_int14) ;
         aptiaes.this.A396EmprCod = GXv_char3[0] ;
         aptiaes.this.A252CliCod = GXv_int9[0] ;
         aptiaes.this.A212BarSer = GXv_char2[0] ;
         aptiaes.this.A135BarColNom = GXv_char1[0] ;
         aptiaes.this.A136BarColNum = GXv_int10[0] ;
         aptiaes.this.A218BarTipCol = GXv_int8[0] ;
         aptiaes.this.AV51Intcod = GXv_int11[0] ;
         /* Using cursor P05AO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4442BarFasDTI = P05AO3_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P05AO3_n4442BarFasDTI[0] ;
            A758ProCod = P05AO3_A758ProCod[0] ;
            AV47Procod = A758ProCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV48pascod = "" ;
         /* Using cursor P05AO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2677RecPasUA = P05AO4_A2677RecPasUA[0] ;
            n2677RecPasUA = P05AO4_n2677RecPasUA[0] ;
            A2107PasCod = P05AO4_A2107PasCod[0] ;
            n2107PasCod = P05AO4_n2107PasCod[0] ;
            A2524DisComLin = P05AO4_A2524DisComLin[0] ;
            A1056DisComCod = P05AO4_A1056DisComCod[0] ;
            A1032FonCod = P05AO4_A1032FonCod[0] ;
            A2124RecMolCod = P05AO4_A2124RecMolCod[0] ;
            A2672RecPasLin = P05AO4_A2672RecPasLin[0] ;
            AV48pascod = A2107PasCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV50Albproest = (byte)(0) ;
         /* Using cursor P05AO5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A30AlbProCod = P05AO5_A30AlbProCod[0] ;
            A32AlbProEsp = P05AO5_A32AlbProEsp[0] ;
            A33AlbProEst = P05AO5_A33AlbProEst[0] ;
            A33AlbProEst = P05AO5_A33AlbProEst[0] ;
            AV50Albproest = A33AlbProEst ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV47Procod = ((GXutil.strcmp(AV47Procod, "")==0) ? "-1" : AV47Procod) ;
         AV48pascod = ((GXutil.strcmp(AV48pascod, "")==0) ? "-1" : AV48pascod) ;
         AV51Intcod = (byte)(((AV51Intcod==0) ? -1 : AV51Intcod)) ;
         AV49TipDefcod = (short)(((AV49TipDefcod==0) ? -1 : AV49TipDefcod)) ;
         AV61Rps_cod = (short)(((AV61Rps_cod>0) ? AV61Rps_cod : -1)) ;
         AV65TIPO_PRODUCCION = ((A3612HisProReo==0) ? httpContext.getMessage( "PRODUCCION", "") : httpContext.getMessage( "SIN DEFINIR", "")) ;
         AV69Existe = (byte)(0) ;
         /*
            INSERT RECORD ON TABLE TXPTIAES

         */
         A12574ID_TIAES = httpContext.getMessage( "LHIPRO", "") + A396EmprCod + GXutil.trim( A602MaqCod) + GXutil.trim( localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + GXutil.padl( GXutil.trim( GXutil.str( A561HisProLin, 8, 0)), (short)(8), "0") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         A12540ID_EMPRESA = A396EmprCod ;
         n12540ID_EMPRESA = false ;
         A12541FECHA = A558HisProFec ;
         n12541FECHA = false ;
         A12542ID_CLIENTE = A252CliCod ;
         n12542ID_CLIENTE = false ;
         A12543ID_EMP_CLI = A396EmprCod + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) ;
         n12543ID_EMP_CLI = false ;
         A12544ID_EMP_ZON = A396EmprCod + GXutil.trim( GXutil.str( A858ZonGeoCod, 3, 0)) ;
         n12544ID_EMP_ZON = false ;
         A12545ID_MAQUINA = A602MaqCod ;
         n12545ID_MAQUINA = false ;
         A12546ID_EMP_MAQ = A396EmprCod + GXutil.trim( A602MaqCod) ;
         n12546ID_EMP_MAQ = false ;
         A12547ID_EMP_HDR = A396EmprCod + GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         n12547ID_EMP_HDR = false ;
         A12548HOJA_DE_RU = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         n12548HOJA_DE_RU = false ;
         A12549TIPO = A2247HisProTip ;
         n12549TIPO = false ;
         A12550ID_PROCESO = AV47Procod ;
         n12550ID_PROCESO = false ;
         A12551ID_EMP_PRO = A396EmprCod + GXutil.trim( AV47Procod) ;
         n12551ID_EMP_PRO = false ;
         A12552ID_SECCION = GXutil.trim( A1011TipMaqCod) ;
         n12552ID_SECCION = false ;
         A12553ID_EMP_SEC = A396EmprCod + GXutil.trim( A1011TipMaqCod) ;
         n12553ID_EMP_SEC = false ;
         A12554ID_ANO_MES = GXutil.trim( GXutil.str( GXutil.year( A558HisProFec), 10, 0)) + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A558HisProFec), 2, 0)), (short)(2), "0") + GXutil.trim( A1011TipMaqCod) ;
         n12554ID_ANO_MES = false ;
         A12555ID_EMP_ANO = A396EmprCod + GXutil.trim( GXutil.str( GXutil.year( A558HisProFec), 10, 0)) + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A558HisProFec), 2, 0)), (short)(2), "0") + GXutil.trim( A1011TipMaqCod) ;
         n12555ID_EMP_ANO = false ;
         A12556ID_PARO = A656ParCod ;
         n12556ID_PARO = false ;
         A12557ID_EMP_PAR = A396EmprCod + GXutil.trim( GXutil.str( A656ParCod, 4, 0)) ;
         n12557ID_EMP_PAR = false ;
         A12558ID_COLORAN = A218BarTipCol ;
         n12558ID_COLORAN = false ;
         A12559ID_EMP_COL = A396EmprCod + GXutil.trim( GXutil.str( A218BarTipCol, 2, 0)) ;
         n12559ID_EMP_COL = false ;
         A12560ID_INTENSI = AV51Intcod ;
         n12560ID_INTENSI = false ;
         A12561ID_EMP_INT = A396EmprCod + GXutil.trim( GXutil.str( AV51Intcod, 2, 0)) ;
         n12561ID_EMP_INT = false ;
         A12562TIPO_PRODU = ((A3612HisProReo==0) ? httpContext.getMessage( "PRODUCCION", "") : httpContext.getMessage( "SIN DEFINIR", "")) ;
         n12562TIPO_PRODU = false ;
         A12563ID_DEFECTO = AV49TipDefcod ;
         n12563ID_DEFECTO = false ;
         A12564ID_EMP_DEF = A396EmprCod + GXutil.trim( GXutil.str( AV49TipDefcod, 4, 0)) ;
         n12564ID_EMP_DEF = false ;
         A12565ID_RESPONS = AV61Rps_cod ;
         n12565ID_RESPONS = false ;
         A12566ID_EMP_RES = A396EmprCod + GXutil.trim( GXutil.str( AV61Rps_cod, 4, 0)) ;
         n12566ID_EMP_RES = false ;
         A12567FACTURADO = ((AV50Albproest==2) ? httpContext.getMessage( "S", "") : httpContext.getMessage( "N", "")) ;
         n12567FACTURADO = false ;
         A12568ID_PASTA = AV48pascod ;
         n12568ID_PASTA = false ;
         A12569ID_EMP_PAS = A396EmprCod + GXutil.trim( AV48pascod) ;
         n12569ID_EMP_PAS = false ;
         A12570UNIDADES = ((GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", ""))==0)&&(A656ParCod==0) ? A1525HisProKgr : ((GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", ""))==0)&&(A656ParCod==0) ? A1526HisProMtr : DecimalUtil.doubleToDec(0))) ;
         n12570UNIDADES = false ;
         A12571TIPO_UNIDA = A228BarUniMed ;
         n12571TIPO_UNIDA = false ;
         A12572METROS_P = ((A656ParCod==0) ? A1526HisProMtr : DecimalUtil.doubleToDec(0)) ;
         n12572METROS_P = false ;
         A12573KILOS_P = ((A656ParCod==0) ? A1525HisProKgr : DecimalUtil.doubleToDec(0)) ;
         n12573KILOS_P = false ;
         /* Using cursor P05AO6 */
         pr_default.execute(4, new Object[] {A12574ID_TIAES, Boolean.valueOf(n12540ID_EMPRESA), A12540ID_EMPRESA, Boolean.valueOf(n12541FECHA), A12541FECHA, Boolean.valueOf(n12542ID_CLIENTE), Integer.valueOf(A12542ID_CLIENTE), Boolean.valueOf(n12543ID_EMP_CLI), A12543ID_EMP_CLI, Boolean.valueOf(n12544ID_EMP_ZON), A12544ID_EMP_ZON, Boolean.valueOf(n12545ID_MAQUINA), A12545ID_MAQUINA, Boolean.valueOf(n12546ID_EMP_MAQ), A12546ID_EMP_MAQ, Boolean.valueOf(n12547ID_EMP_HDR), A12547ID_EMP_HDR, Boolean.valueOf(n12548HOJA_DE_RU), A12548HOJA_DE_RU, Boolean.valueOf(n12549TIPO), Short.valueOf(A12549TIPO), Boolean.valueOf(n12550ID_PROCESO), A12550ID_PROCESO, Boolean.valueOf(n12551ID_EMP_PRO), A12551ID_EMP_PRO, Boolean.valueOf(n12552ID_SECCION), A12552ID_SECCION, Boolean.valueOf(n12553ID_EMP_SEC), A12553ID_EMP_SEC, Boolean.valueOf(n12554ID_ANO_MES), A12554ID_ANO_MES, Boolean.valueOf(n12555ID_EMP_ANO), A12555ID_EMP_ANO, Boolean.valueOf(n12556ID_PARO), Short.valueOf(A12556ID_PARO), Boolean.valueOf(n12557ID_EMP_PAR), A12557ID_EMP_PAR, Boolean.valueOf(n12558ID_COLORAN), Short.valueOf(A12558ID_COLORAN), Boolean.valueOf(n12559ID_EMP_COL), A12559ID_EMP_COL, Boolean.valueOf(n12560ID_INTENSI), Short.valueOf(A12560ID_INTENSI), Boolean.valueOf(n12561ID_EMP_INT), A12561ID_EMP_INT, Boolean.valueOf(n12562TIPO_PRODU), A12562TIPO_PRODU, Boolean.valueOf(n12563ID_DEFECTO), Short.valueOf(A12563ID_DEFECTO), Boolean.valueOf(n12564ID_EMP_DEF), A12564ID_EMP_DEF, Boolean.valueOf(n12565ID_RESPONS), Short.valueOf(A12565ID_RESPONS), Boolean.valueOf(n12566ID_EMP_RES), A12566ID_EMP_RES, Boolean.valueOf(n12567FACTURADO), A12567FACTURADO, Boolean.valueOf(n12568ID_PASTA), A12568ID_PASTA, Boolean.valueOf(n12569ID_EMP_PAS), A12569ID_EMP_PAS, Boolean.valueOf(n12570UNIDADES), A12570UNIDADES, Boolean.valueOf(n12571TIPO_UNIDA), A12571TIPO_UNIDA, Boolean.valueOf(n12572METROS_P), A12572METROS_P, Boolean.valueOf(n12573KILOS_P), A12573KILOS_P});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIAES");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P05AO7 */
            pr_default.execute(5, new Object[] {A12574ID_TIAES});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A12574ID_TIAES = P05AO7_A12574ID_TIAES[0] ;
               A12570UNIDADES = P05AO7_A12570UNIDADES[0] ;
               n12570UNIDADES = P05AO7_n12570UNIDADES[0] ;
               A12572METROS_P = P05AO7_A12572METROS_P[0] ;
               n12572METROS_P = P05AO7_n12572METROS_P[0] ;
               A12573KILOS_P = P05AO7_A12573KILOS_P[0] ;
               n12573KILOS_P = P05AO7_n12573KILOS_P[0] ;
               A12540ID_EMPRESA = P05AO7_A12540ID_EMPRESA[0] ;
               n12540ID_EMPRESA = P05AO7_n12540ID_EMPRESA[0] ;
               A12541FECHA = P05AO7_A12541FECHA[0] ;
               n12541FECHA = P05AO7_n12541FECHA[0] ;
               A12542ID_CLIENTE = P05AO7_A12542ID_CLIENTE[0] ;
               n12542ID_CLIENTE = P05AO7_n12542ID_CLIENTE[0] ;
               A12543ID_EMP_CLI = P05AO7_A12543ID_EMP_CLI[0] ;
               n12543ID_EMP_CLI = P05AO7_n12543ID_EMP_CLI[0] ;
               A12544ID_EMP_ZON = P05AO7_A12544ID_EMP_ZON[0] ;
               n12544ID_EMP_ZON = P05AO7_n12544ID_EMP_ZON[0] ;
               A12545ID_MAQUINA = P05AO7_A12545ID_MAQUINA[0] ;
               n12545ID_MAQUINA = P05AO7_n12545ID_MAQUINA[0] ;
               A12546ID_EMP_MAQ = P05AO7_A12546ID_EMP_MAQ[0] ;
               n12546ID_EMP_MAQ = P05AO7_n12546ID_EMP_MAQ[0] ;
               A12547ID_EMP_HDR = P05AO7_A12547ID_EMP_HDR[0] ;
               n12547ID_EMP_HDR = P05AO7_n12547ID_EMP_HDR[0] ;
               A12548HOJA_DE_RU = P05AO7_A12548HOJA_DE_RU[0] ;
               n12548HOJA_DE_RU = P05AO7_n12548HOJA_DE_RU[0] ;
               A12549TIPO = P05AO7_A12549TIPO[0] ;
               n12549TIPO = P05AO7_n12549TIPO[0] ;
               A12550ID_PROCESO = P05AO7_A12550ID_PROCESO[0] ;
               n12550ID_PROCESO = P05AO7_n12550ID_PROCESO[0] ;
               A12551ID_EMP_PRO = P05AO7_A12551ID_EMP_PRO[0] ;
               n12551ID_EMP_PRO = P05AO7_n12551ID_EMP_PRO[0] ;
               A12552ID_SECCION = P05AO7_A12552ID_SECCION[0] ;
               n12552ID_SECCION = P05AO7_n12552ID_SECCION[0] ;
               A12553ID_EMP_SEC = P05AO7_A12553ID_EMP_SEC[0] ;
               n12553ID_EMP_SEC = P05AO7_n12553ID_EMP_SEC[0] ;
               A12554ID_ANO_MES = P05AO7_A12554ID_ANO_MES[0] ;
               n12554ID_ANO_MES = P05AO7_n12554ID_ANO_MES[0] ;
               A12555ID_EMP_ANO = P05AO7_A12555ID_EMP_ANO[0] ;
               n12555ID_EMP_ANO = P05AO7_n12555ID_EMP_ANO[0] ;
               A12556ID_PARO = P05AO7_A12556ID_PARO[0] ;
               n12556ID_PARO = P05AO7_n12556ID_PARO[0] ;
               A12557ID_EMP_PAR = P05AO7_A12557ID_EMP_PAR[0] ;
               n12557ID_EMP_PAR = P05AO7_n12557ID_EMP_PAR[0] ;
               A12558ID_COLORAN = P05AO7_A12558ID_COLORAN[0] ;
               n12558ID_COLORAN = P05AO7_n12558ID_COLORAN[0] ;
               A12559ID_EMP_COL = P05AO7_A12559ID_EMP_COL[0] ;
               n12559ID_EMP_COL = P05AO7_n12559ID_EMP_COL[0] ;
               A12560ID_INTENSI = P05AO7_A12560ID_INTENSI[0] ;
               n12560ID_INTENSI = P05AO7_n12560ID_INTENSI[0] ;
               A12561ID_EMP_INT = P05AO7_A12561ID_EMP_INT[0] ;
               n12561ID_EMP_INT = P05AO7_n12561ID_EMP_INT[0] ;
               A12562TIPO_PRODU = P05AO7_A12562TIPO_PRODU[0] ;
               n12562TIPO_PRODU = P05AO7_n12562TIPO_PRODU[0] ;
               A12563ID_DEFECTO = P05AO7_A12563ID_DEFECTO[0] ;
               n12563ID_DEFECTO = P05AO7_n12563ID_DEFECTO[0] ;
               A12564ID_EMP_DEF = P05AO7_A12564ID_EMP_DEF[0] ;
               n12564ID_EMP_DEF = P05AO7_n12564ID_EMP_DEF[0] ;
               A12565ID_RESPONS = P05AO7_A12565ID_RESPONS[0] ;
               n12565ID_RESPONS = P05AO7_n12565ID_RESPONS[0] ;
               A12566ID_EMP_RES = P05AO7_A12566ID_EMP_RES[0] ;
               n12566ID_EMP_RES = P05AO7_n12566ID_EMP_RES[0] ;
               A12567FACTURADO = P05AO7_A12567FACTURADO[0] ;
               n12567FACTURADO = P05AO7_n12567FACTURADO[0] ;
               A12568ID_PASTA = P05AO7_A12568ID_PASTA[0] ;
               n12568ID_PASTA = P05AO7_n12568ID_PASTA[0] ;
               A12569ID_EMP_PAS = P05AO7_A12569ID_EMP_PAS[0] ;
               n12569ID_EMP_PAS = P05AO7_n12569ID_EMP_PAS[0] ;
               A12571TIPO_UNIDA = P05AO7_A12571TIPO_UNIDA[0] ;
               n12571TIPO_UNIDA = P05AO7_n12571TIPO_UNIDA[0] ;
               AV70UNIDADES = A12570UNIDADES ;
               AV71METROS_P = A12572METROS_P ;
               AV72KILOS_P = A12573KILOS_P ;
               A12540ID_EMPRESA = A396EmprCod ;
               n12540ID_EMPRESA = false ;
               A12541FECHA = A558HisProFec ;
               n12541FECHA = false ;
               A12542ID_CLIENTE = A252CliCod ;
               n12542ID_CLIENTE = false ;
               A12543ID_EMP_CLI = A396EmprCod + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) ;
               n12543ID_EMP_CLI = false ;
               A12544ID_EMP_ZON = A396EmprCod + GXutil.trim( GXutil.str( A858ZonGeoCod, 3, 0)) ;
               n12544ID_EMP_ZON = false ;
               A12545ID_MAQUINA = A602MaqCod ;
               n12545ID_MAQUINA = false ;
               A12546ID_EMP_MAQ = A396EmprCod + GXutil.trim( A602MaqCod) ;
               n12546ID_EMP_MAQ = false ;
               A12547ID_EMP_HDR = A396EmprCod + GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               n12547ID_EMP_HDR = false ;
               A12548HOJA_DE_RU = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               n12548HOJA_DE_RU = false ;
               A12549TIPO = A2247HisProTip ;
               n12549TIPO = false ;
               A12550ID_PROCESO = AV47Procod ;
               n12550ID_PROCESO = false ;
               A12551ID_EMP_PRO = A396EmprCod + GXutil.trim( AV47Procod) ;
               n12551ID_EMP_PRO = false ;
               A12552ID_SECCION = GXutil.trim( A1011TipMaqCod) ;
               n12552ID_SECCION = false ;
               A12553ID_EMP_SEC = A396EmprCod + GXutil.trim( A1011TipMaqCod) ;
               n12553ID_EMP_SEC = false ;
               A12554ID_ANO_MES = GXutil.trim( GXutil.str( GXutil.year( A558HisProFec), 10, 0)) + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A558HisProFec), 2, 0)), (short)(2), "0") + GXutil.trim( A1011TipMaqCod) ;
               n12554ID_ANO_MES = false ;
               A12555ID_EMP_ANO = A396EmprCod + GXutil.trim( GXutil.str( GXutil.year( A558HisProFec), 10, 0)) + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A558HisProFec), 2, 0)), (short)(2), "0") + GXutil.trim( A1011TipMaqCod) ;
               n12555ID_EMP_ANO = false ;
               A12556ID_PARO = A656ParCod ;
               n12556ID_PARO = false ;
               A12557ID_EMP_PAR = A396EmprCod + GXutil.trim( GXutil.str( A656ParCod, 4, 0)) ;
               n12557ID_EMP_PAR = false ;
               A12558ID_COLORAN = A218BarTipCol ;
               n12558ID_COLORAN = false ;
               A12559ID_EMP_COL = A396EmprCod + GXutil.trim( GXutil.str( A218BarTipCol, 2, 0)) ;
               n12559ID_EMP_COL = false ;
               A12560ID_INTENSI = AV51Intcod ;
               n12560ID_INTENSI = false ;
               A12561ID_EMP_INT = A396EmprCod + GXutil.trim( GXutil.str( AV51Intcod, 2, 0)) ;
               n12561ID_EMP_INT = false ;
               A12562TIPO_PRODU = ((A3612HisProReo==0) ? httpContext.getMessage( "PRODUCCION", "") : httpContext.getMessage( "SIN DEFINIR", "")) ;
               n12562TIPO_PRODU = false ;
               A12563ID_DEFECTO = AV49TipDefcod ;
               n12563ID_DEFECTO = false ;
               A12564ID_EMP_DEF = A396EmprCod + GXutil.trim( GXutil.str( AV49TipDefcod, 4, 0)) ;
               n12564ID_EMP_DEF = false ;
               A12565ID_RESPONS = AV61Rps_cod ;
               n12565ID_RESPONS = false ;
               A12566ID_EMP_RES = A396EmprCod + GXutil.trim( GXutil.str( AV61Rps_cod, 4, 0)) ;
               n12566ID_EMP_RES = false ;
               A12567FACTURADO = ((AV50Albproest==2) ? httpContext.getMessage( "S", "") : httpContext.getMessage( "N", "")) ;
               n12567FACTURADO = false ;
               A12568ID_PASTA = AV48pascod ;
               n12568ID_PASTA = false ;
               A12569ID_EMP_PAS = A396EmprCod + GXutil.trim( AV48pascod) ;
               n12569ID_EMP_PAS = false ;
               A12570UNIDADES = ((GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", ""))==0)&&(A656ParCod==0) ? A1525HisProKgr : ((GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", ""))==0)&&(A656ParCod==0) ? A1526HisProMtr : DecimalUtil.doubleToDec(0))) ;
               n12570UNIDADES = false ;
               A12571TIPO_UNIDA = A228BarUniMed ;
               n12571TIPO_UNIDA = false ;
               A12572METROS_P = ((A656ParCod==0) ? A1526HisProMtr : DecimalUtil.doubleToDec(0)) ;
               n12572METROS_P = false ;
               A12573KILOS_P = ((A656ParCod==0) ? A1525HisProKgr : DecimalUtil.doubleToDec(0)) ;
               n12573KILOS_P = false ;
               AV69Existe = (byte)(1) ;
               /* Using cursor P05AO8 */
               pr_default.execute(6, new Object[] {Boolean.valueOf(n12570UNIDADES), A12570UNIDADES, Boolean.valueOf(n12572METROS_P), A12572METROS_P, Boolean.valueOf(n12573KILOS_P), A12573KILOS_P, Boolean.valueOf(n12540ID_EMPRESA), A12540ID_EMPRESA, Boolean.valueOf(n12541FECHA), A12541FECHA, Boolean.valueOf(n12542ID_CLIENTE), Integer.valueOf(A12542ID_CLIENTE), Boolean.valueOf(n12543ID_EMP_CLI), A12543ID_EMP_CLI, Boolean.valueOf(n12544ID_EMP_ZON), A12544ID_EMP_ZON, Boolean.valueOf(n12545ID_MAQUINA), A12545ID_MAQUINA, Boolean.valueOf(n12546ID_EMP_MAQ), A12546ID_EMP_MAQ, Boolean.valueOf(n12547ID_EMP_HDR), A12547ID_EMP_HDR, Boolean.valueOf(n12548HOJA_DE_RU), A12548HOJA_DE_RU, Boolean.valueOf(n12549TIPO), Short.valueOf(A12549TIPO), Boolean.valueOf(n12550ID_PROCESO), A12550ID_PROCESO, Boolean.valueOf(n12551ID_EMP_PRO), A12551ID_EMP_PRO, Boolean.valueOf(n12552ID_SECCION), A12552ID_SECCION, Boolean.valueOf(n12553ID_EMP_SEC), A12553ID_EMP_SEC, Boolean.valueOf(n12554ID_ANO_MES), A12554ID_ANO_MES, Boolean.valueOf(n12555ID_EMP_ANO), A12555ID_EMP_ANO, Boolean.valueOf(n12556ID_PARO), Short.valueOf(A12556ID_PARO), Boolean.valueOf(n12557ID_EMP_PAR), A12557ID_EMP_PAR, Boolean.valueOf(n12558ID_COLORAN), Short.valueOf(A12558ID_COLORAN), Boolean.valueOf(n12559ID_EMP_COL), A12559ID_EMP_COL, Boolean.valueOf(n12560ID_INTENSI), Short.valueOf(A12560ID_INTENSI), Boolean.valueOf(n12561ID_EMP_INT), A12561ID_EMP_INT, Boolean.valueOf(n12562TIPO_PRODU), A12562TIPO_PRODU, Boolean.valueOf(n12563ID_DEFECTO), Short.valueOf(A12563ID_DEFECTO), Boolean.valueOf(n12564ID_EMP_DEF), A12564ID_EMP_DEF, Boolean.valueOf(n12565ID_RESPONS), Short.valueOf(A12565ID_RESPONS), Boolean.valueOf(n12566ID_EMP_RES), A12566ID_EMP_RES, Boolean.valueOf(n12567FACTURADO), A12567FACTURADO, Boolean.valueOf(n12568ID_PASTA), A12568ID_PASTA, Boolean.valueOf(n12569ID_EMP_PAS), A12569ID_EMP_PAS, Boolean.valueOf(n12571TIPO_UNIDA), A12571TIPO_UNIDA, A12574ID_TIAES});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIAES");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         AV56Control = httpContext.getMessage( "LHIPRO", "") + ";" + A396EmprCod + ";" + GXutil.trim( A602MaqCod) + ";" + GXutil.trim( localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + GXutil.padl( GXutil.trim( GXutil.str( A561HisProLin, 8, 0)), (short)(8), "0") + ";" + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + A1011TipMaqCod + ";" + AV65TIPO_PRODUCCION + ";" ;
         AV56Control += GXutil.str( A1525HisProKgr, 9, 2) + ";" + GXutil.str( A1526HisProMtr, 9, 2) + ";" + GXutil.str( AV69Existe, 1, 0) + ";" + GXutil.str( AV70UNIDADES, 9, 2) + ";" + GXutil.str( AV72KILOS_P, 9, 2) + ";" + GXutil.str( AV71METROS_P, 9, 2) ;
         GXt_int7 = (byte)(AV67Stat) ;
         GXv_int11[0] = GXt_int7 ;
         new app.core.fputs(remoteHandle, context).execute( AV68hnd, AV56Control, GXv_int11) ;
         aptiaes.this.GXt_int7 = GXv_int11[0] ;
         AV67Stat = GXt_int7 ;
         System.out.println( AV56Control );
         AV70UNIDADES = DecimalUtil.doubleToDec(0) ;
         AV71METROS_P = DecimalUtil.doubleToDec(0) ;
         AV72KILOS_P = DecimalUtil.doubleToDec(0) ;
         AV69Existe = (byte)(0) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P05AO9 */
      pr_default.execute(7, new Object[] {AV43EmprCod, AV45Fec1, AV46Fec2});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A396EmprCod = P05AO9_A396EmprCod[0] ;
         A544HisCodPar = P05AO9_A544HisCodPar[0] ;
         A545HisCodReo = P05AO9_A545HisCodReo[0] ;
         A539HisBarCod = P05AO9_A539HisBarCod[0] ;
         A569HisReoFec = P05AO9_A569HisReoFec[0] ;
         n569HisReoFec = P05AO9_n569HisReoFec[0] ;
         A602MaqCod = P05AO9_A602MaqCod[0] ;
         n602MaqCod = P05AO9_n602MaqCod[0] ;
         A252CliCod = P05AO9_A252CliCod[0] ;
         n252CliCod = P05AO9_n252CliCod[0] ;
         A858ZonGeoCod = P05AO9_A858ZonGeoCod[0] ;
         A548HisEstReo = P05AO9_A548HisEstReo[0] ;
         n548HisEstReo = P05AO9_n548HisEstReo[0] ;
         A572HisTipCol = P05AO9_A572HisTipCol[0] ;
         n572HisTipCol = P05AO9_n572HisTipCol[0] ;
         A541HisBarMtr = P05AO9_A541HisBarMtr[0] ;
         n541HisBarMtr = P05AO9_n541HisBarMtr[0] ;
         A540HisBarKgm = P05AO9_A540HisBarKgm[0] ;
         n540HisBarKgm = P05AO9_n540HisBarKgm[0] ;
         A542HisBarSer = P05AO9_A542HisBarSer[0] ;
         n542HisBarSer = P05AO9_n542HisBarSer[0] ;
         A546HisColNom = P05AO9_A546HisColNom[0] ;
         n546HisColNom = P05AO9_n546HisColNom[0] ;
         A547HisColNum = P05AO9_A547HisColNum[0] ;
         n547HisColNum = P05AO9_n547HisColNum[0] ;
         A833TipDefCod = P05AO9_A833TipDefCod[0] ;
         A7000Rps_Cod = P05AO9_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P05AO9_n7000Rps_Cod[0] ;
         A858ZonGeoCod = P05AO9_A858ZonGeoCod[0] ;
         AV53barcod = A539HisBarCod ;
         AV54barcodreo = A545HisCodReo ;
         AV55barcodpar = A544HisCodPar ;
         AV65TIPO_PRODUCCION = ((A548HisEstReo==1) ? httpContext.getMessage( "REP INTERNO", "") : httpContext.getMessage( "REP EXTERNO", "")) ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(7);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV58barcad == 1 )
         {
            GXv_char13[0] = A396EmprCod ;
            GXv_int14[0] = A252CliCod ;
            GXv_char12[0] = A542HisBarSer ;
            GXv_char3[0] = A546HisColNom ;
            GXv_int10[0] = A547HisColNum ;
            GXv_int11[0] = A572HisTipCol ;
            GXv_int8[0] = AV51Intcod ;
            GXv_char2[0] = "" ;
            GXv_char1[0] = "" ;
            GXv_int9[0] = 0 ;
            new app.pbusint(remoteHandle, context).execute( GXv_char13, GXv_int14, GXv_char12, GXv_char3, GXv_int10, GXv_int11, GXv_int8, GXv_char2, GXv_char1, GXv_int9) ;
            aptiaes.this.A396EmprCod = GXv_char13[0] ;
            aptiaes.this.A252CliCod = GXv_int14[0] ;
            aptiaes.this.A542HisBarSer = GXv_char12[0] ;
            aptiaes.this.A546HisColNom = GXv_char3[0] ;
            aptiaes.this.A547HisColNum = GXv_int10[0] ;
            aptiaes.this.A572HisTipCol = GXv_int11[0] ;
            aptiaes.this.AV51Intcod = GXv_int8[0] ;
            AV47Procod = ((GXutil.strcmp(AV47Procod, "")==0) ? "-1" : AV47Procod) ;
            AV48pascod = ((GXutil.strcmp(AV48pascod, "")==0) ? "-1" : AV48pascod) ;
            AV51Intcod = (byte)(((AV51Intcod==0) ? -1 : AV51Intcod)) ;
            AV49TipDefcod = (short)(((A833TipDefCod==0) ? -1 : A833TipDefCod)) ;
            AV57TipMaqCod = ((A833TipDefCod>=100)&&(A833TipDefCod<=199) ? httpContext.getMessage( "TI", "") : ((A833TipDefCod>=200)&&(A833TipDefCod<=299) ? httpContext.getMessage( "ES", "") : ((A833TipDefCod>=300)&&(A833TipDefCod<=399) ? httpContext.getMessage( "AC", "") : httpContext.getMessage( "OT", "")))) ;
            AV61Rps_cod = (short)(((A7000Rps_Cod>0) ? A7000Rps_Cod : -1)) ;
            AV62Hisprolin = 0 ;
            AV69Existe = (byte)(0) ;
            /*
               INSERT RECORD ON TABLE TXPTIAES

            */
            A12574ID_TIAES = httpContext.getMessage( "HISREO", "") + A396EmprCod + GXutil.trim( A602MaqCod) + GXutil.trim( localUtil.dtoc( A569HisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + GXutil.padl( GXutil.trim( GXutil.str( AV62Hisprolin, 8, 0)), (short)(8), "0") + GXutil.str( A539HisBarCod, 8, 0) + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            A12540ID_EMPRESA = A396EmprCod ;
            n12540ID_EMPRESA = false ;
            A12541FECHA = A569HisReoFec ;
            n12541FECHA = false ;
            A12542ID_CLIENTE = A252CliCod ;
            n12542ID_CLIENTE = false ;
            A12543ID_EMP_CLI = A396EmprCod + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) ;
            n12543ID_EMP_CLI = false ;
            A12544ID_EMP_ZON = A396EmprCod + GXutil.trim( GXutil.str( A858ZonGeoCod, 3, 0)) ;
            n12544ID_EMP_ZON = false ;
            A12545ID_MAQUINA = A602MaqCod ;
            n12545ID_MAQUINA = false ;
            A12546ID_EMP_MAQ = A396EmprCod + GXutil.trim( A602MaqCod) ;
            n12546ID_EMP_MAQ = false ;
            A12547ID_EMP_HDR = A396EmprCod + GXutil.str( A539HisBarCod, 8, 0) + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            n12547ID_EMP_HDR = false ;
            A12548HOJA_DE_RU = GXutil.str( A539HisBarCod, 8, 0) + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            n12548HOJA_DE_RU = false ;
            A12549TIPO = A548HisEstReo ;
            n12549TIPO = false ;
            A12550ID_PROCESO = AV47Procod ;
            n12550ID_PROCESO = false ;
            A12551ID_EMP_PRO = A396EmprCod + GXutil.trim( AV47Procod) ;
            n12551ID_EMP_PRO = false ;
            A12552ID_SECCION = GXutil.trim( AV57TipMaqCod) ;
            n12552ID_SECCION = false ;
            A12553ID_EMP_SEC = A396EmprCod + GXutil.trim( AV57TipMaqCod) ;
            n12553ID_EMP_SEC = false ;
            A12554ID_ANO_MES = GXutil.trim( GXutil.str( GXutil.year( A569HisReoFec), 10, 0)) + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A569HisReoFec), 2, 0)), (short)(2), "0") + GXutil.trim( AV57TipMaqCod) ;
            n12554ID_ANO_MES = false ;
            A12555ID_EMP_ANO = A396EmprCod + GXutil.trim( GXutil.str( GXutil.year( A569HisReoFec), 10, 0)) + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A569HisReoFec), 2, 0)), (short)(2), "0") + GXutil.trim( AV57TipMaqCod) ;
            n12555ID_EMP_ANO = false ;
            A12556ID_PARO = (short)(0) ;
            n12556ID_PARO = false ;
            A12557ID_EMP_PAR = A396EmprCod + "0" ;
            n12557ID_EMP_PAR = false ;
            A12558ID_COLORAN = A572HisTipCol ;
            n12558ID_COLORAN = false ;
            A12559ID_EMP_COL = A396EmprCod + GXutil.trim( GXutil.str( A572HisTipCol, 2, 0)) ;
            n12559ID_EMP_COL = false ;
            A12560ID_INTENSI = AV51Intcod ;
            n12560ID_INTENSI = false ;
            A12561ID_EMP_INT = A396EmprCod + GXutil.trim( GXutil.str( AV51Intcod, 2, 0)) ;
            n12561ID_EMP_INT = false ;
            A12562TIPO_PRODU = ((A548HisEstReo==1) ? httpContext.getMessage( "REP INTERNO", "") : httpContext.getMessage( "REP EXTERNO", "")) ;
            n12562TIPO_PRODU = false ;
            A12563ID_DEFECTO = AV49TipDefcod ;
            n12563ID_DEFECTO = false ;
            A12564ID_EMP_DEF = A396EmprCod + GXutil.trim( GXutil.str( AV49TipDefcod, 4, 0)) ;
            n12564ID_EMP_DEF = false ;
            A12565ID_RESPONS = AV61Rps_cod ;
            n12565ID_RESPONS = false ;
            A12566ID_EMP_RES = A396EmprCod + GXutil.trim( GXutil.str( AV61Rps_cod, 4, 0)) ;
            n12566ID_EMP_RES = false ;
            A12567FACTURADO = ((AV50Albproest==2) ? httpContext.getMessage( "S", "") : httpContext.getMessage( "N", "")) ;
            n12567FACTURADO = false ;
            A12568ID_PASTA = AV48pascod ;
            n12568ID_PASTA = false ;
            A12569ID_EMP_PAS = A396EmprCod + GXutil.trim( AV48pascod) ;
            n12569ID_EMP_PAS = false ;
            A12570UNIDADES = ((GXutil.strcmp(AV59BarUniMed, httpContext.getMessage( "K", ""))==0) ? A540HisBarKgm : A541HisBarMtr) ;
            n12570UNIDADES = false ;
            A12571TIPO_UNIDA = AV59BarUniMed ;
            n12571TIPO_UNIDA = false ;
            A12572METROS_P = A541HisBarMtr ;
            n12572METROS_P = false ;
            A12573KILOS_P = A540HisBarKgm ;
            n12573KILOS_P = false ;
            /* Using cursor P05AO10 */
            pr_default.execute(8, new Object[] {A12574ID_TIAES, Boolean.valueOf(n12540ID_EMPRESA), A12540ID_EMPRESA, Boolean.valueOf(n12541FECHA), A12541FECHA, Boolean.valueOf(n12542ID_CLIENTE), Integer.valueOf(A12542ID_CLIENTE), Boolean.valueOf(n12543ID_EMP_CLI), A12543ID_EMP_CLI, Boolean.valueOf(n12544ID_EMP_ZON), A12544ID_EMP_ZON, Boolean.valueOf(n12545ID_MAQUINA), A12545ID_MAQUINA, Boolean.valueOf(n12546ID_EMP_MAQ), A12546ID_EMP_MAQ, Boolean.valueOf(n12547ID_EMP_HDR), A12547ID_EMP_HDR, Boolean.valueOf(n12548HOJA_DE_RU), A12548HOJA_DE_RU, Boolean.valueOf(n12549TIPO), Short.valueOf(A12549TIPO), Boolean.valueOf(n12550ID_PROCESO), A12550ID_PROCESO, Boolean.valueOf(n12551ID_EMP_PRO), A12551ID_EMP_PRO, Boolean.valueOf(n12552ID_SECCION), A12552ID_SECCION, Boolean.valueOf(n12553ID_EMP_SEC), A12553ID_EMP_SEC, Boolean.valueOf(n12554ID_ANO_MES), A12554ID_ANO_MES, Boolean.valueOf(n12555ID_EMP_ANO), A12555ID_EMP_ANO, Boolean.valueOf(n12556ID_PARO), Short.valueOf(A12556ID_PARO), Boolean.valueOf(n12557ID_EMP_PAR), A12557ID_EMP_PAR, Boolean.valueOf(n12558ID_COLORAN), Short.valueOf(A12558ID_COLORAN), Boolean.valueOf(n12559ID_EMP_COL), A12559ID_EMP_COL, Boolean.valueOf(n12560ID_INTENSI), Short.valueOf(A12560ID_INTENSI), Boolean.valueOf(n12561ID_EMP_INT), A12561ID_EMP_INT, Boolean.valueOf(n12562TIPO_PRODU), A12562TIPO_PRODU, Boolean.valueOf(n12563ID_DEFECTO), Short.valueOf(A12563ID_DEFECTO), Boolean.valueOf(n12564ID_EMP_DEF), A12564ID_EMP_DEF, Boolean.valueOf(n12565ID_RESPONS), Short.valueOf(A12565ID_RESPONS), Boolean.valueOf(n12566ID_EMP_RES), A12566ID_EMP_RES, Boolean.valueOf(n12567FACTURADO), A12567FACTURADO, Boolean.valueOf(n12568ID_PASTA), A12568ID_PASTA, Boolean.valueOf(n12569ID_EMP_PAS), A12569ID_EMP_PAS, Boolean.valueOf(n12570UNIDADES), A12570UNIDADES, Boolean.valueOf(n12571TIPO_UNIDA), A12571TIPO_UNIDA, Boolean.valueOf(n12572METROS_P), A12572METROS_P, Boolean.valueOf(n12573KILOS_P), A12573KILOS_P});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIAES");
            if ( (pr_default.getStatus(8) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P05AO11 */
               pr_default.execute(9, new Object[] {A12574ID_TIAES});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A12574ID_TIAES = P05AO11_A12574ID_TIAES[0] ;
                  A12540ID_EMPRESA = P05AO11_A12540ID_EMPRESA[0] ;
                  n12540ID_EMPRESA = P05AO11_n12540ID_EMPRESA[0] ;
                  A12541FECHA = P05AO11_A12541FECHA[0] ;
                  n12541FECHA = P05AO11_n12541FECHA[0] ;
                  A12542ID_CLIENTE = P05AO11_A12542ID_CLIENTE[0] ;
                  n12542ID_CLIENTE = P05AO11_n12542ID_CLIENTE[0] ;
                  A12543ID_EMP_CLI = P05AO11_A12543ID_EMP_CLI[0] ;
                  n12543ID_EMP_CLI = P05AO11_n12543ID_EMP_CLI[0] ;
                  A12544ID_EMP_ZON = P05AO11_A12544ID_EMP_ZON[0] ;
                  n12544ID_EMP_ZON = P05AO11_n12544ID_EMP_ZON[0] ;
                  A12545ID_MAQUINA = P05AO11_A12545ID_MAQUINA[0] ;
                  n12545ID_MAQUINA = P05AO11_n12545ID_MAQUINA[0] ;
                  A12546ID_EMP_MAQ = P05AO11_A12546ID_EMP_MAQ[0] ;
                  n12546ID_EMP_MAQ = P05AO11_n12546ID_EMP_MAQ[0] ;
                  A12547ID_EMP_HDR = P05AO11_A12547ID_EMP_HDR[0] ;
                  n12547ID_EMP_HDR = P05AO11_n12547ID_EMP_HDR[0] ;
                  A12548HOJA_DE_RU = P05AO11_A12548HOJA_DE_RU[0] ;
                  n12548HOJA_DE_RU = P05AO11_n12548HOJA_DE_RU[0] ;
                  A12549TIPO = P05AO11_A12549TIPO[0] ;
                  n12549TIPO = P05AO11_n12549TIPO[0] ;
                  A12550ID_PROCESO = P05AO11_A12550ID_PROCESO[0] ;
                  n12550ID_PROCESO = P05AO11_n12550ID_PROCESO[0] ;
                  A12551ID_EMP_PRO = P05AO11_A12551ID_EMP_PRO[0] ;
                  n12551ID_EMP_PRO = P05AO11_n12551ID_EMP_PRO[0] ;
                  A12552ID_SECCION = P05AO11_A12552ID_SECCION[0] ;
                  n12552ID_SECCION = P05AO11_n12552ID_SECCION[0] ;
                  A12553ID_EMP_SEC = P05AO11_A12553ID_EMP_SEC[0] ;
                  n12553ID_EMP_SEC = P05AO11_n12553ID_EMP_SEC[0] ;
                  A12554ID_ANO_MES = P05AO11_A12554ID_ANO_MES[0] ;
                  n12554ID_ANO_MES = P05AO11_n12554ID_ANO_MES[0] ;
                  A12555ID_EMP_ANO = P05AO11_A12555ID_EMP_ANO[0] ;
                  n12555ID_EMP_ANO = P05AO11_n12555ID_EMP_ANO[0] ;
                  A12556ID_PARO = P05AO11_A12556ID_PARO[0] ;
                  n12556ID_PARO = P05AO11_n12556ID_PARO[0] ;
                  A12557ID_EMP_PAR = P05AO11_A12557ID_EMP_PAR[0] ;
                  n12557ID_EMP_PAR = P05AO11_n12557ID_EMP_PAR[0] ;
                  A12558ID_COLORAN = P05AO11_A12558ID_COLORAN[0] ;
                  n12558ID_COLORAN = P05AO11_n12558ID_COLORAN[0] ;
                  A12559ID_EMP_COL = P05AO11_A12559ID_EMP_COL[0] ;
                  n12559ID_EMP_COL = P05AO11_n12559ID_EMP_COL[0] ;
                  A12560ID_INTENSI = P05AO11_A12560ID_INTENSI[0] ;
                  n12560ID_INTENSI = P05AO11_n12560ID_INTENSI[0] ;
                  A12561ID_EMP_INT = P05AO11_A12561ID_EMP_INT[0] ;
                  n12561ID_EMP_INT = P05AO11_n12561ID_EMP_INT[0] ;
                  A12562TIPO_PRODU = P05AO11_A12562TIPO_PRODU[0] ;
                  n12562TIPO_PRODU = P05AO11_n12562TIPO_PRODU[0] ;
                  A12563ID_DEFECTO = P05AO11_A12563ID_DEFECTO[0] ;
                  n12563ID_DEFECTO = P05AO11_n12563ID_DEFECTO[0] ;
                  A12564ID_EMP_DEF = P05AO11_A12564ID_EMP_DEF[0] ;
                  n12564ID_EMP_DEF = P05AO11_n12564ID_EMP_DEF[0] ;
                  A12565ID_RESPONS = P05AO11_A12565ID_RESPONS[0] ;
                  n12565ID_RESPONS = P05AO11_n12565ID_RESPONS[0] ;
                  A12566ID_EMP_RES = P05AO11_A12566ID_EMP_RES[0] ;
                  n12566ID_EMP_RES = P05AO11_n12566ID_EMP_RES[0] ;
                  A12567FACTURADO = P05AO11_A12567FACTURADO[0] ;
                  n12567FACTURADO = P05AO11_n12567FACTURADO[0] ;
                  A12568ID_PASTA = P05AO11_A12568ID_PASTA[0] ;
                  n12568ID_PASTA = P05AO11_n12568ID_PASTA[0] ;
                  A12569ID_EMP_PAS = P05AO11_A12569ID_EMP_PAS[0] ;
                  n12569ID_EMP_PAS = P05AO11_n12569ID_EMP_PAS[0] ;
                  A12570UNIDADES = P05AO11_A12570UNIDADES[0] ;
                  n12570UNIDADES = P05AO11_n12570UNIDADES[0] ;
                  A12571TIPO_UNIDA = P05AO11_A12571TIPO_UNIDA[0] ;
                  n12571TIPO_UNIDA = P05AO11_n12571TIPO_UNIDA[0] ;
                  A12572METROS_P = P05AO11_A12572METROS_P[0] ;
                  n12572METROS_P = P05AO11_n12572METROS_P[0] ;
                  A12573KILOS_P = P05AO11_A12573KILOS_P[0] ;
                  n12573KILOS_P = P05AO11_n12573KILOS_P[0] ;
                  A12540ID_EMPRESA = A396EmprCod ;
                  n12540ID_EMPRESA = false ;
                  A12541FECHA = A569HisReoFec ;
                  n12541FECHA = false ;
                  A12542ID_CLIENTE = A252CliCod ;
                  n12542ID_CLIENTE = false ;
                  A12543ID_EMP_CLI = A396EmprCod + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) ;
                  n12543ID_EMP_CLI = false ;
                  A12544ID_EMP_ZON = A396EmprCod + GXutil.trim( GXutil.str( A858ZonGeoCod, 3, 0)) ;
                  n12544ID_EMP_ZON = false ;
                  A12545ID_MAQUINA = A602MaqCod ;
                  n12545ID_MAQUINA = false ;
                  A12546ID_EMP_MAQ = A396EmprCod + GXutil.trim( A602MaqCod) ;
                  n12546ID_EMP_MAQ = false ;
                  A12547ID_EMP_HDR = A396EmprCod + GXutil.str( A539HisBarCod, 8, 0) + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
                  n12547ID_EMP_HDR = false ;
                  A12548HOJA_DE_RU = GXutil.str( A539HisBarCod, 8, 0) + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
                  n12548HOJA_DE_RU = false ;
                  A12549TIPO = A548HisEstReo ;
                  n12549TIPO = false ;
                  A12550ID_PROCESO = AV47Procod ;
                  n12550ID_PROCESO = false ;
                  A12551ID_EMP_PRO = A396EmprCod + GXutil.trim( AV47Procod) ;
                  n12551ID_EMP_PRO = false ;
                  A12552ID_SECCION = GXutil.trim( AV57TipMaqCod) ;
                  n12552ID_SECCION = false ;
                  A12553ID_EMP_SEC = A396EmprCod + GXutil.trim( AV57TipMaqCod) ;
                  n12553ID_EMP_SEC = false ;
                  A12554ID_ANO_MES = GXutil.trim( GXutil.str( GXutil.year( A569HisReoFec), 10, 0)) + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A569HisReoFec), 2, 0)), (short)(2), "0") + GXutil.trim( AV57TipMaqCod) ;
                  n12554ID_ANO_MES = false ;
                  A12555ID_EMP_ANO = A396EmprCod + GXutil.trim( GXutil.str( GXutil.year( A569HisReoFec), 10, 0)) + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A569HisReoFec), 2, 0)), (short)(2), "0") + GXutil.trim( AV57TipMaqCod) ;
                  n12555ID_EMP_ANO = false ;
                  A12556ID_PARO = (short)(0) ;
                  n12556ID_PARO = false ;
                  A12557ID_EMP_PAR = A396EmprCod + "0" ;
                  n12557ID_EMP_PAR = false ;
                  A12558ID_COLORAN = A572HisTipCol ;
                  n12558ID_COLORAN = false ;
                  A12559ID_EMP_COL = A396EmprCod + GXutil.trim( GXutil.str( A572HisTipCol, 2, 0)) ;
                  n12559ID_EMP_COL = false ;
                  A12560ID_INTENSI = AV51Intcod ;
                  n12560ID_INTENSI = false ;
                  A12561ID_EMP_INT = A396EmprCod + GXutil.trim( GXutil.str( AV51Intcod, 2, 0)) ;
                  n12561ID_EMP_INT = false ;
                  A12562TIPO_PRODU = ((A548HisEstReo==1) ? httpContext.getMessage( "REP INTERNO", "") : httpContext.getMessage( "REP EXTERNO", "")) ;
                  n12562TIPO_PRODU = false ;
                  A12563ID_DEFECTO = AV49TipDefcod ;
                  n12563ID_DEFECTO = false ;
                  A12564ID_EMP_DEF = A396EmprCod + GXutil.trim( GXutil.str( AV49TipDefcod, 4, 0)) ;
                  n12564ID_EMP_DEF = false ;
                  A12565ID_RESPONS = AV61Rps_cod ;
                  n12565ID_RESPONS = false ;
                  A12566ID_EMP_RES = A396EmprCod + GXutil.trim( GXutil.str( AV61Rps_cod, 4, 0)) ;
                  n12566ID_EMP_RES = false ;
                  A12567FACTURADO = ((AV50Albproest==2) ? httpContext.getMessage( "S", "") : httpContext.getMessage( "N", "")) ;
                  n12567FACTURADO = false ;
                  A12568ID_PASTA = AV48pascod ;
                  n12568ID_PASTA = false ;
                  A12569ID_EMP_PAS = A396EmprCod + GXutil.trim( AV48pascod) ;
                  n12569ID_EMP_PAS = false ;
                  A12570UNIDADES = ((GXutil.strcmp(AV59BarUniMed, httpContext.getMessage( "K", ""))==0) ? A540HisBarKgm : A541HisBarMtr) ;
                  n12570UNIDADES = false ;
                  A12571TIPO_UNIDA = AV59BarUniMed ;
                  n12571TIPO_UNIDA = false ;
                  A12572METROS_P = A541HisBarMtr ;
                  n12572METROS_P = false ;
                  A12573KILOS_P = A540HisBarKgm ;
                  n12573KILOS_P = false ;
                  AV69Existe = (byte)(1) ;
                  /* Using cursor P05AO12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n12540ID_EMPRESA), A12540ID_EMPRESA, Boolean.valueOf(n12541FECHA), A12541FECHA, Boolean.valueOf(n12542ID_CLIENTE), Integer.valueOf(A12542ID_CLIENTE), Boolean.valueOf(n12543ID_EMP_CLI), A12543ID_EMP_CLI, Boolean.valueOf(n12544ID_EMP_ZON), A12544ID_EMP_ZON, Boolean.valueOf(n12545ID_MAQUINA), A12545ID_MAQUINA, Boolean.valueOf(n12546ID_EMP_MAQ), A12546ID_EMP_MAQ, Boolean.valueOf(n12547ID_EMP_HDR), A12547ID_EMP_HDR, Boolean.valueOf(n12548HOJA_DE_RU), A12548HOJA_DE_RU, Boolean.valueOf(n12549TIPO), Short.valueOf(A12549TIPO), Boolean.valueOf(n12550ID_PROCESO), A12550ID_PROCESO, Boolean.valueOf(n12551ID_EMP_PRO), A12551ID_EMP_PRO, Boolean.valueOf(n12552ID_SECCION), A12552ID_SECCION, Boolean.valueOf(n12553ID_EMP_SEC), A12553ID_EMP_SEC, Boolean.valueOf(n12554ID_ANO_MES), A12554ID_ANO_MES, Boolean.valueOf(n12555ID_EMP_ANO), A12555ID_EMP_ANO, Boolean.valueOf(n12556ID_PARO), Short.valueOf(A12556ID_PARO), Boolean.valueOf(n12557ID_EMP_PAR), A12557ID_EMP_PAR, Boolean.valueOf(n12558ID_COLORAN), Short.valueOf(A12558ID_COLORAN), Boolean.valueOf(n12559ID_EMP_COL), A12559ID_EMP_COL, Boolean.valueOf(n12560ID_INTENSI), Short.valueOf(A12560ID_INTENSI), Boolean.valueOf(n12561ID_EMP_INT), A12561ID_EMP_INT, Boolean.valueOf(n12562TIPO_PRODU), A12562TIPO_PRODU, Boolean.valueOf(n12563ID_DEFECTO), Short.valueOf(A12563ID_DEFECTO), Boolean.valueOf(n12564ID_EMP_DEF), A12564ID_EMP_DEF, Boolean.valueOf(n12565ID_RESPONS), Short.valueOf(A12565ID_RESPONS), Boolean.valueOf(n12566ID_EMP_RES), A12566ID_EMP_RES, Boolean.valueOf(n12567FACTURADO), A12567FACTURADO, Boolean.valueOf(n12568ID_PASTA), A12568ID_PASTA, Boolean.valueOf(n12569ID_EMP_PAS), A12569ID_EMP_PAS, Boolean.valueOf(n12570UNIDADES), A12570UNIDADES, Boolean.valueOf(n12571TIPO_UNIDA), A12571TIPO_UNIDA, Boolean.valueOf(n12572METROS_P), A12572METROS_P, Boolean.valueOf(n12573KILOS_P), A12573KILOS_P, A12574ID_TIAES});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIAES");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(9);
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            AV56Control = httpContext.getMessage( "HISREO", "") + ";" + A396EmprCod + ";" + GXutil.trim( A602MaqCod) + ";" + GXutil.trim( localUtil.dtoc( A569HisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + GXutil.padl( GXutil.trim( GXutil.str( AV62Hisprolin, 8, 0)), (short)(8), "0") + ";" + GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar + ";" + AV57TipMaqCod + ";" + AV65TIPO_PRODUCCION + ";" + GXutil.str( A540HisBarKgm, 9, 2) + ";" ;
            AV56Control += GXutil.str( A541HisBarMtr, 9, 2) + ";" + GXutil.str( AV69Existe, 1, 0) ;
            GXt_int7 = (byte)(AV67Stat) ;
            GXv_int11[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV68hnd, AV56Control, GXv_int11) ;
            aptiaes.this.GXt_int7 = GXv_int11[0] ;
            AV67Stat = GXt_int7 ;
            System.out.println( AV56Control );
         }
         else
         {
            AV56Control = httpContext.getMessage( "NOBARCAD", "") + ";" + A396EmprCod + ";" + GXutil.trim( A602MaqCod) + ";" + GXutil.trim( localUtil.dtoc( A569HisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + GXutil.padl( GXutil.trim( GXutil.str( AV62Hisprolin, 8, 0)), (short)(8), "0") + ";" + GXutil.str( AV53barcod, 8, 0) + "-" + GXutil.str( AV54barcodreo, 1, 0) + AV55barcodpar + ";" + AV57TipMaqCod + ";" + AV65TIPO_PRODUCCION + ";" + GXutil.str( A540HisBarKgm, 9, 2) + ";" + GXutil.str( A541HisBarMtr, 9, 2) ;
            GXt_int7 = (byte)(AV67Stat) ;
            GXv_int11[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV68hnd, AV56Control, GXv_int11) ;
            aptiaes.this.GXt_int7 = GXv_int11[0] ;
            AV67Stat = GXt_int7 ;
            System.out.println( AV56Control );
            AV56Control = httpContext.getMessage( "TABLA", "") + ";" + httpContext.getMessage( "EMPRESA", "") + ";" + httpContext.getMessage( "MAQUINA", "") + ";" + httpContext.getMessage( "FECHA", "") + ";" + httpContext.getMessage( "LINEA", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "SECCION", "") + ";" + httpContext.getMessage( "TIPO PRODUCCION", "") + ";" + httpContext.getMessage( "KILOS", "") + ";" + httpContext.getMessage( "METROS", "") + ";" + httpContext.getMessage( "ExisteTIAES", "") + ";" + httpContext.getMessage( "UNIDADES", "") + ";" + httpContext.getMessage( "KILOS_P", "") + ";" + httpContext.getMessage( "METROS_P", "") ;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
      GXt_int7 = (byte)(AV67Stat) ;
      GXv_int11[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV68hnd, GXv_int11) ;
      aptiaes.this.GXt_int7 = GXv_int11[0] ;
      AV67Stat = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV58barcad = (byte)(0) ;
      /* Using cursor P05AO13 */
      pr_default.execute(11, new Object[] {AV43EmprCod, Integer.valueOf(AV53barcod), Byte.valueOf(AV54barcodreo), AV55barcodpar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = P05AO13_A130BarCodPar[0] ;
         A132BarCodReo = P05AO13_A132BarCodReo[0] ;
         A129BarCod = P05AO13_A129BarCod[0] ;
         A396EmprCod = P05AO13_A396EmprCod[0] ;
         A228BarUniMed = P05AO13_A228BarUniMed[0] ;
         /* Using cursor P05AO14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A761ProFasLin = P05AO14_A761ProFasLin[0] ;
            n761ProFasLin = P05AO14_n761ProFasLin[0] ;
            A758ProCod = P05AO14_A758ProCod[0] ;
            AV47Procod = A758ProCod ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
         AV59BarUniMed = A228BarUniMed ;
         AV58barcad = (byte)(1) ;
         AV50Albproest = (byte)(0) ;
         /* Using cursor P05AO15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A30AlbProCod = P05AO15_A30AlbProCod[0] ;
            A32AlbProEsp = P05AO15_A32AlbProEsp[0] ;
            A33AlbProEst = P05AO15_A33AlbProEst[0] ;
            A33AlbProEst = P05AO15_A33AlbProEst[0] ;
            AV50Albproest = A33AlbProEst ;
            pr_default.readNext(13);
         }
         pr_default.close(13);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      AV48pascod = "" ;
      /* Using cursor P05AO16 */
      pr_default.execute(14, new Object[] {AV43EmprCod, Integer.valueOf(AV53barcod), Byte.valueOf(AV54barcodreo), AV55barcodpar});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A130BarCodPar = P05AO16_A130BarCodPar[0] ;
         A132BarCodReo = P05AO16_A132BarCodReo[0] ;
         A129BarCod = P05AO16_A129BarCod[0] ;
         A396EmprCod = P05AO16_A396EmprCod[0] ;
         A2677RecPasUA = P05AO16_A2677RecPasUA[0] ;
         n2677RecPasUA = P05AO16_n2677RecPasUA[0] ;
         A2107PasCod = P05AO16_A2107PasCod[0] ;
         n2107PasCod = P05AO16_n2107PasCod[0] ;
         A2524DisComLin = P05AO16_A2524DisComLin[0] ;
         A1056DisComCod = P05AO16_A1056DisComCod[0] ;
         A1032FonCod = P05AO16_A1032FonCod[0] ;
         A2124RecMolCod = P05AO16_A2124RecMolCod[0] ;
         A2672RecPasLin = P05AO16_A2672RecPasLin[0] ;
         AV48pascod = A2107PasCod ;
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptiaes.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptiaes");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV41UsurCod = "" ;
      AV42Station = "" ;
      AV43EmprCod = "" ;
      AV44EmprNom = "" ;
      AV63Carpeta = "" ;
      AV60ddmmaaaa = "" ;
      AV45Fec1 = GXutil.nullDate() ;
      GXt_char4 = "" ;
      AV46Fec2 = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      AV64NomInf = "" ;
      AV66File = "" ;
      GXv_int6 = new long[1] ;
      AV56Control = "" ;
      AV70UNIDADES = DecimalUtil.ZERO ;
      AV71METROS_P = DecimalUtil.ZERO ;
      AV72KILOS_P = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05AO2_A396EmprCod = new String[] {""} ;
      P05AO2_A561HisProLin = new int[1] ;
      P05AO2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05AO2_A602MaqCod = new String[] {""} ;
      P05AO2_n602MaqCod = new boolean[] {false} ;
      P05AO2_A252CliCod = new int[1] ;
      P05AO2_n252CliCod = new boolean[] {false} ;
      P05AO2_A858ZonGeoCod = new short[1] ;
      P05AO2_A2247HisProTip = new short[1] ;
      P05AO2_A1011TipMaqCod = new String[] {""} ;
      P05AO2_n1011TipMaqCod = new boolean[] {false} ;
      P05AO2_A656ParCod = new short[1] ;
      P05AO2_n656ParCod = new boolean[] {false} ;
      P05AO2_A218BarTipCol = new byte[1] ;
      P05AO2_A3612HisProReo = new byte[1] ;
      P05AO2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO2_A228BarUniMed = new String[] {""} ;
      P05AO2_A129BarCod = new int[1] ;
      P05AO2_A194BarOrdLin = new short[1] ;
      P05AO2_A130BarCodPar = new String[] {""} ;
      P05AO2_A132BarCodReo = new byte[1] ;
      P05AO2_A212BarSer = new String[] {""} ;
      P05AO2_A135BarColNom = new String[] {""} ;
      P05AO2_A136BarColNum = new int[1] ;
      A396EmprCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      A1011TipMaqCod = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV55barcodpar = "" ;
      P05AO3_A396EmprCod = new String[] {""} ;
      P05AO3_A129BarCod = new int[1] ;
      P05AO3_A132BarCodReo = new byte[1] ;
      P05AO3_A130BarCodPar = new String[] {""} ;
      P05AO3_A194BarOrdLin = new short[1] ;
      P05AO3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05AO3_n4442BarFasDTI = new boolean[] {false} ;
      P05AO3_A758ProCod = new String[] {""} ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      AV47Procod = "" ;
      AV48pascod = "" ;
      P05AO4_A396EmprCod = new String[] {""} ;
      P05AO4_A129BarCod = new int[1] ;
      P05AO4_A132BarCodReo = new byte[1] ;
      P05AO4_A130BarCodPar = new String[] {""} ;
      P05AO4_A2677RecPasUA = new byte[1] ;
      P05AO4_n2677RecPasUA = new boolean[] {false} ;
      P05AO4_A2107PasCod = new String[] {""} ;
      P05AO4_n2107PasCod = new boolean[] {false} ;
      P05AO4_A2524DisComLin = new byte[1] ;
      P05AO4_A1056DisComCod = new String[] {""} ;
      P05AO4_A1032FonCod = new String[] {""} ;
      P05AO4_A2124RecMolCod = new byte[1] ;
      P05AO4_A2672RecPasLin = new short[1] ;
      A2107PasCod = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      P05AO5_A30AlbProCod = new long[1] ;
      P05AO5_A396EmprCod = new String[] {""} ;
      P05AO5_A129BarCod = new int[1] ;
      P05AO5_A132BarCodReo = new byte[1] ;
      P05AO5_A130BarCodPar = new String[] {""} ;
      P05AO5_A32AlbProEsp = new byte[1] ;
      P05AO5_A33AlbProEst = new byte[1] ;
      AV65TIPO_PRODUCCION = "" ;
      A12574ID_TIAES = "" ;
      A12540ID_EMPRESA = "" ;
      A12541FECHA = GXutil.nullDate() ;
      A12543ID_EMP_CLI = "" ;
      A12544ID_EMP_ZON = "" ;
      A12545ID_MAQUINA = "" ;
      A12546ID_EMP_MAQ = "" ;
      A12547ID_EMP_HDR = "" ;
      A12548HOJA_DE_RU = "" ;
      A12550ID_PROCESO = "" ;
      A12551ID_EMP_PRO = "" ;
      A12552ID_SECCION = "" ;
      A12553ID_EMP_SEC = "" ;
      A12554ID_ANO_MES = "" ;
      A12555ID_EMP_ANO = "" ;
      A12557ID_EMP_PAR = "" ;
      A12559ID_EMP_COL = "" ;
      A12561ID_EMP_INT = "" ;
      A12562TIPO_PRODU = "" ;
      A12564ID_EMP_DEF = "" ;
      A12566ID_EMP_RES = "" ;
      A12567FACTURADO = "" ;
      A12568ID_PASTA = "" ;
      A12569ID_EMP_PAS = "" ;
      A12570UNIDADES = DecimalUtil.ZERO ;
      A12571TIPO_UNIDA = "" ;
      A12572METROS_P = DecimalUtil.ZERO ;
      A12573KILOS_P = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P05AO7_A12574ID_TIAES = new String[] {""} ;
      P05AO7_A12570UNIDADES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO7_n12570UNIDADES = new boolean[] {false} ;
      P05AO7_A12572METROS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO7_n12572METROS_P = new boolean[] {false} ;
      P05AO7_A12573KILOS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO7_n12573KILOS_P = new boolean[] {false} ;
      P05AO7_A12540ID_EMPRESA = new String[] {""} ;
      P05AO7_n12540ID_EMPRESA = new boolean[] {false} ;
      P05AO7_A12541FECHA = new java.util.Date[] {GXutil.nullDate()} ;
      P05AO7_n12541FECHA = new boolean[] {false} ;
      P05AO7_A12542ID_CLIENTE = new int[1] ;
      P05AO7_n12542ID_CLIENTE = new boolean[] {false} ;
      P05AO7_A12543ID_EMP_CLI = new String[] {""} ;
      P05AO7_n12543ID_EMP_CLI = new boolean[] {false} ;
      P05AO7_A12544ID_EMP_ZON = new String[] {""} ;
      P05AO7_n12544ID_EMP_ZON = new boolean[] {false} ;
      P05AO7_A12545ID_MAQUINA = new String[] {""} ;
      P05AO7_n12545ID_MAQUINA = new boolean[] {false} ;
      P05AO7_A12546ID_EMP_MAQ = new String[] {""} ;
      P05AO7_n12546ID_EMP_MAQ = new boolean[] {false} ;
      P05AO7_A12547ID_EMP_HDR = new String[] {""} ;
      P05AO7_n12547ID_EMP_HDR = new boolean[] {false} ;
      P05AO7_A12548HOJA_DE_RU = new String[] {""} ;
      P05AO7_n12548HOJA_DE_RU = new boolean[] {false} ;
      P05AO7_A12549TIPO = new short[1] ;
      P05AO7_n12549TIPO = new boolean[] {false} ;
      P05AO7_A12550ID_PROCESO = new String[] {""} ;
      P05AO7_n12550ID_PROCESO = new boolean[] {false} ;
      P05AO7_A12551ID_EMP_PRO = new String[] {""} ;
      P05AO7_n12551ID_EMP_PRO = new boolean[] {false} ;
      P05AO7_A12552ID_SECCION = new String[] {""} ;
      P05AO7_n12552ID_SECCION = new boolean[] {false} ;
      P05AO7_A12553ID_EMP_SEC = new String[] {""} ;
      P05AO7_n12553ID_EMP_SEC = new boolean[] {false} ;
      P05AO7_A12554ID_ANO_MES = new String[] {""} ;
      P05AO7_n12554ID_ANO_MES = new boolean[] {false} ;
      P05AO7_A12555ID_EMP_ANO = new String[] {""} ;
      P05AO7_n12555ID_EMP_ANO = new boolean[] {false} ;
      P05AO7_A12556ID_PARO = new short[1] ;
      P05AO7_n12556ID_PARO = new boolean[] {false} ;
      P05AO7_A12557ID_EMP_PAR = new String[] {""} ;
      P05AO7_n12557ID_EMP_PAR = new boolean[] {false} ;
      P05AO7_A12558ID_COLORAN = new short[1] ;
      P05AO7_n12558ID_COLORAN = new boolean[] {false} ;
      P05AO7_A12559ID_EMP_COL = new String[] {""} ;
      P05AO7_n12559ID_EMP_COL = new boolean[] {false} ;
      P05AO7_A12560ID_INTENSI = new short[1] ;
      P05AO7_n12560ID_INTENSI = new boolean[] {false} ;
      P05AO7_A12561ID_EMP_INT = new String[] {""} ;
      P05AO7_n12561ID_EMP_INT = new boolean[] {false} ;
      P05AO7_A12562TIPO_PRODU = new String[] {""} ;
      P05AO7_n12562TIPO_PRODU = new boolean[] {false} ;
      P05AO7_A12563ID_DEFECTO = new short[1] ;
      P05AO7_n12563ID_DEFECTO = new boolean[] {false} ;
      P05AO7_A12564ID_EMP_DEF = new String[] {""} ;
      P05AO7_n12564ID_EMP_DEF = new boolean[] {false} ;
      P05AO7_A12565ID_RESPONS = new short[1] ;
      P05AO7_n12565ID_RESPONS = new boolean[] {false} ;
      P05AO7_A12566ID_EMP_RES = new String[] {""} ;
      P05AO7_n12566ID_EMP_RES = new boolean[] {false} ;
      P05AO7_A12567FACTURADO = new String[] {""} ;
      P05AO7_n12567FACTURADO = new boolean[] {false} ;
      P05AO7_A12568ID_PASTA = new String[] {""} ;
      P05AO7_n12568ID_PASTA = new boolean[] {false} ;
      P05AO7_A12569ID_EMP_PAS = new String[] {""} ;
      P05AO7_n12569ID_EMP_PAS = new boolean[] {false} ;
      P05AO7_A12571TIPO_UNIDA = new String[] {""} ;
      P05AO7_n12571TIPO_UNIDA = new boolean[] {false} ;
      P05AO9_A396EmprCod = new String[] {""} ;
      P05AO9_A544HisCodPar = new String[] {""} ;
      P05AO9_A545HisCodReo = new byte[1] ;
      P05AO9_A539HisBarCod = new int[1] ;
      P05AO9_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05AO9_n569HisReoFec = new boolean[] {false} ;
      P05AO9_A602MaqCod = new String[] {""} ;
      P05AO9_n602MaqCod = new boolean[] {false} ;
      P05AO9_A252CliCod = new int[1] ;
      P05AO9_n252CliCod = new boolean[] {false} ;
      P05AO9_A858ZonGeoCod = new short[1] ;
      P05AO9_A548HisEstReo = new byte[1] ;
      P05AO9_n548HisEstReo = new boolean[] {false} ;
      P05AO9_A572HisTipCol = new byte[1] ;
      P05AO9_n572HisTipCol = new boolean[] {false} ;
      P05AO9_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO9_n541HisBarMtr = new boolean[] {false} ;
      P05AO9_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO9_n540HisBarKgm = new boolean[] {false} ;
      P05AO9_A542HisBarSer = new String[] {""} ;
      P05AO9_n542HisBarSer = new boolean[] {false} ;
      P05AO9_A546HisColNom = new String[] {""} ;
      P05AO9_n546HisColNom = new boolean[] {false} ;
      P05AO9_A547HisColNum = new int[1] ;
      P05AO9_n547HisColNum = new boolean[] {false} ;
      P05AO9_A833TipDefCod = new short[1] ;
      P05AO9_A7000Rps_Cod = new short[1] ;
      P05AO9_n7000Rps_Cod = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A542HisBarSer = "" ;
      A546HisColNom = "" ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int9 = new int[1] ;
      AV57TipMaqCod = "" ;
      AV59BarUniMed = "" ;
      P05AO11_A12574ID_TIAES = new String[] {""} ;
      P05AO11_A12540ID_EMPRESA = new String[] {""} ;
      P05AO11_n12540ID_EMPRESA = new boolean[] {false} ;
      P05AO11_A12541FECHA = new java.util.Date[] {GXutil.nullDate()} ;
      P05AO11_n12541FECHA = new boolean[] {false} ;
      P05AO11_A12542ID_CLIENTE = new int[1] ;
      P05AO11_n12542ID_CLIENTE = new boolean[] {false} ;
      P05AO11_A12543ID_EMP_CLI = new String[] {""} ;
      P05AO11_n12543ID_EMP_CLI = new boolean[] {false} ;
      P05AO11_A12544ID_EMP_ZON = new String[] {""} ;
      P05AO11_n12544ID_EMP_ZON = new boolean[] {false} ;
      P05AO11_A12545ID_MAQUINA = new String[] {""} ;
      P05AO11_n12545ID_MAQUINA = new boolean[] {false} ;
      P05AO11_A12546ID_EMP_MAQ = new String[] {""} ;
      P05AO11_n12546ID_EMP_MAQ = new boolean[] {false} ;
      P05AO11_A12547ID_EMP_HDR = new String[] {""} ;
      P05AO11_n12547ID_EMP_HDR = new boolean[] {false} ;
      P05AO11_A12548HOJA_DE_RU = new String[] {""} ;
      P05AO11_n12548HOJA_DE_RU = new boolean[] {false} ;
      P05AO11_A12549TIPO = new short[1] ;
      P05AO11_n12549TIPO = new boolean[] {false} ;
      P05AO11_A12550ID_PROCESO = new String[] {""} ;
      P05AO11_n12550ID_PROCESO = new boolean[] {false} ;
      P05AO11_A12551ID_EMP_PRO = new String[] {""} ;
      P05AO11_n12551ID_EMP_PRO = new boolean[] {false} ;
      P05AO11_A12552ID_SECCION = new String[] {""} ;
      P05AO11_n12552ID_SECCION = new boolean[] {false} ;
      P05AO11_A12553ID_EMP_SEC = new String[] {""} ;
      P05AO11_n12553ID_EMP_SEC = new boolean[] {false} ;
      P05AO11_A12554ID_ANO_MES = new String[] {""} ;
      P05AO11_n12554ID_ANO_MES = new boolean[] {false} ;
      P05AO11_A12555ID_EMP_ANO = new String[] {""} ;
      P05AO11_n12555ID_EMP_ANO = new boolean[] {false} ;
      P05AO11_A12556ID_PARO = new short[1] ;
      P05AO11_n12556ID_PARO = new boolean[] {false} ;
      P05AO11_A12557ID_EMP_PAR = new String[] {""} ;
      P05AO11_n12557ID_EMP_PAR = new boolean[] {false} ;
      P05AO11_A12558ID_COLORAN = new short[1] ;
      P05AO11_n12558ID_COLORAN = new boolean[] {false} ;
      P05AO11_A12559ID_EMP_COL = new String[] {""} ;
      P05AO11_n12559ID_EMP_COL = new boolean[] {false} ;
      P05AO11_A12560ID_INTENSI = new short[1] ;
      P05AO11_n12560ID_INTENSI = new boolean[] {false} ;
      P05AO11_A12561ID_EMP_INT = new String[] {""} ;
      P05AO11_n12561ID_EMP_INT = new boolean[] {false} ;
      P05AO11_A12562TIPO_PRODU = new String[] {""} ;
      P05AO11_n12562TIPO_PRODU = new boolean[] {false} ;
      P05AO11_A12563ID_DEFECTO = new short[1] ;
      P05AO11_n12563ID_DEFECTO = new boolean[] {false} ;
      P05AO11_A12564ID_EMP_DEF = new String[] {""} ;
      P05AO11_n12564ID_EMP_DEF = new boolean[] {false} ;
      P05AO11_A12565ID_RESPONS = new short[1] ;
      P05AO11_n12565ID_RESPONS = new boolean[] {false} ;
      P05AO11_A12566ID_EMP_RES = new String[] {""} ;
      P05AO11_n12566ID_EMP_RES = new boolean[] {false} ;
      P05AO11_A12567FACTURADO = new String[] {""} ;
      P05AO11_n12567FACTURADO = new boolean[] {false} ;
      P05AO11_A12568ID_PASTA = new String[] {""} ;
      P05AO11_n12568ID_PASTA = new boolean[] {false} ;
      P05AO11_A12569ID_EMP_PAS = new String[] {""} ;
      P05AO11_n12569ID_EMP_PAS = new boolean[] {false} ;
      P05AO11_A12570UNIDADES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO11_n12570UNIDADES = new boolean[] {false} ;
      P05AO11_A12571TIPO_UNIDA = new String[] {""} ;
      P05AO11_n12571TIPO_UNIDA = new boolean[] {false} ;
      P05AO11_A12572METROS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO11_n12572METROS_P = new boolean[] {false} ;
      P05AO11_A12573KILOS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AO11_n12573KILOS_P = new boolean[] {false} ;
      GXv_int11 = new byte[1] ;
      P05AO13_A130BarCodPar = new String[] {""} ;
      P05AO13_A132BarCodReo = new byte[1] ;
      P05AO13_A129BarCod = new int[1] ;
      P05AO13_A396EmprCod = new String[] {""} ;
      P05AO13_A228BarUniMed = new String[] {""} ;
      P05AO14_A396EmprCod = new String[] {""} ;
      P05AO14_A129BarCod = new int[1] ;
      P05AO14_A132BarCodReo = new byte[1] ;
      P05AO14_A130BarCodPar = new String[] {""} ;
      P05AO14_A761ProFasLin = new short[1] ;
      P05AO14_n761ProFasLin = new boolean[] {false} ;
      P05AO14_A758ProCod = new String[] {""} ;
      P05AO15_A30AlbProCod = new long[1] ;
      P05AO15_A396EmprCod = new String[] {""} ;
      P05AO15_A129BarCod = new int[1] ;
      P05AO15_A132BarCodReo = new byte[1] ;
      P05AO15_A130BarCodPar = new String[] {""} ;
      P05AO15_A32AlbProEsp = new byte[1] ;
      P05AO15_A33AlbProEst = new byte[1] ;
      P05AO16_A130BarCodPar = new String[] {""} ;
      P05AO16_A132BarCodReo = new byte[1] ;
      P05AO16_A129BarCod = new int[1] ;
      P05AO16_A396EmprCod = new String[] {""} ;
      P05AO16_A2677RecPasUA = new byte[1] ;
      P05AO16_n2677RecPasUA = new boolean[] {false} ;
      P05AO16_A2107PasCod = new String[] {""} ;
      P05AO16_n2107PasCod = new boolean[] {false} ;
      P05AO16_A2524DisComLin = new byte[1] ;
      P05AO16_A1056DisComCod = new String[] {""} ;
      P05AO16_A1032FonCod = new String[] {""} ;
      P05AO16_A2124RecMolCod = new byte[1] ;
      P05AO16_A2672RecPasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptiaes__default(),
         new Object[] {
             new Object[] {
            P05AO2_A396EmprCod, P05AO2_A561HisProLin, P05AO2_A558HisProFec, P05AO2_A602MaqCod, P05AO2_A252CliCod, P05AO2_n252CliCod, P05AO2_A858ZonGeoCod, P05AO2_A2247HisProTip, P05AO2_A1011TipMaqCod, P05AO2_n1011TipMaqCod,
            P05AO2_A656ParCod, P05AO2_n656ParCod, P05AO2_A218BarTipCol, P05AO2_A3612HisProReo, P05AO2_A1526HisProMtr, P05AO2_A1525HisProKgr, P05AO2_A228BarUniMed, P05AO2_A129BarCod, P05AO2_A194BarOrdLin, P05AO2_A130BarCodPar,
            P05AO2_A132BarCodReo, P05AO2_A212BarSer, P05AO2_A135BarColNom, P05AO2_A136BarColNum
            }
            , new Object[] {
            P05AO3_A396EmprCod, P05AO3_A129BarCod, P05AO3_A132BarCodReo, P05AO3_A130BarCodPar, P05AO3_A194BarOrdLin, P05AO3_A4442BarFasDTI, P05AO3_n4442BarFasDTI, P05AO3_A758ProCod
            }
            , new Object[] {
            P05AO4_A396EmprCod, P05AO4_A129BarCod, P05AO4_A132BarCodReo, P05AO4_A130BarCodPar, P05AO4_A2677RecPasUA, P05AO4_n2677RecPasUA, P05AO4_A2107PasCod, P05AO4_n2107PasCod, P05AO4_A2524DisComLin, P05AO4_A1056DisComCod,
            P05AO4_A1032FonCod, P05AO4_A2124RecMolCod, P05AO4_A2672RecPasLin
            }
            , new Object[] {
            P05AO5_A30AlbProCod, P05AO5_A396EmprCod, P05AO5_A129BarCod, P05AO5_A132BarCodReo, P05AO5_A130BarCodPar, P05AO5_A32AlbProEsp, P05AO5_A33AlbProEst
            }
            , new Object[] {
            }
            , new Object[] {
            P05AO7_A12574ID_TIAES, P05AO7_A12570UNIDADES, P05AO7_n12570UNIDADES, P05AO7_A12572METROS_P, P05AO7_n12572METROS_P, P05AO7_A12573KILOS_P, P05AO7_n12573KILOS_P, P05AO7_A12540ID_EMPRESA, P05AO7_n12540ID_EMPRESA, P05AO7_A12541FECHA,
            P05AO7_n12541FECHA, P05AO7_A12542ID_CLIENTE, P05AO7_n12542ID_CLIENTE, P05AO7_A12543ID_EMP_CLI, P05AO7_n12543ID_EMP_CLI, P05AO7_A12544ID_EMP_ZON, P05AO7_n12544ID_EMP_ZON, P05AO7_A12545ID_MAQUINA, P05AO7_n12545ID_MAQUINA, P05AO7_A12546ID_EMP_MAQ,
            P05AO7_n12546ID_EMP_MAQ, P05AO7_A12547ID_EMP_HDR, P05AO7_n12547ID_EMP_HDR, P05AO7_A12548HOJA_DE_RU, P05AO7_n12548HOJA_DE_RU, P05AO7_A12549TIPO, P05AO7_n12549TIPO, P05AO7_A12550ID_PROCESO, P05AO7_n12550ID_PROCESO, P05AO7_A12551ID_EMP_PRO,
            P05AO7_n12551ID_EMP_PRO, P05AO7_A12552ID_SECCION, P05AO7_n12552ID_SECCION, P05AO7_A12553ID_EMP_SEC, P05AO7_n12553ID_EMP_SEC, P05AO7_A12554ID_ANO_MES, P05AO7_n12554ID_ANO_MES, P05AO7_A12555ID_EMP_ANO, P05AO7_n12555ID_EMP_ANO, P05AO7_A12556ID_PARO,
            P05AO7_n12556ID_PARO, P05AO7_A12557ID_EMP_PAR, P05AO7_n12557ID_EMP_PAR, P05AO7_A12558ID_COLORAN, P05AO7_n12558ID_COLORAN, P05AO7_A12559ID_EMP_COL, P05AO7_n12559ID_EMP_COL, P05AO7_A12560ID_INTENSI, P05AO7_n12560ID_INTENSI, P05AO7_A12561ID_EMP_INT,
            P05AO7_n12561ID_EMP_INT, P05AO7_A12562TIPO_PRODU, P05AO7_n12562TIPO_PRODU, P05AO7_A12563ID_DEFECTO, P05AO7_n12563ID_DEFECTO, P05AO7_A12564ID_EMP_DEF, P05AO7_n12564ID_EMP_DEF, P05AO7_A12565ID_RESPONS, P05AO7_n12565ID_RESPONS, P05AO7_A12566ID_EMP_RES,
            P05AO7_n12566ID_EMP_RES, P05AO7_A12567FACTURADO, P05AO7_n12567FACTURADO, P05AO7_A12568ID_PASTA, P05AO7_n12568ID_PASTA, P05AO7_A12569ID_EMP_PAS, P05AO7_n12569ID_EMP_PAS, P05AO7_A12571TIPO_UNIDA, P05AO7_n12571TIPO_UNIDA
            }
            , new Object[] {
            }
            , new Object[] {
            P05AO9_A396EmprCod, P05AO9_A544HisCodPar, P05AO9_A545HisCodReo, P05AO9_A539HisBarCod, P05AO9_A569HisReoFec, P05AO9_n569HisReoFec, P05AO9_A602MaqCod, P05AO9_n602MaqCod, P05AO9_A252CliCod, P05AO9_n252CliCod,
            P05AO9_A858ZonGeoCod, P05AO9_A548HisEstReo, P05AO9_n548HisEstReo, P05AO9_A572HisTipCol, P05AO9_n572HisTipCol, P05AO9_A541HisBarMtr, P05AO9_n541HisBarMtr, P05AO9_A540HisBarKgm, P05AO9_n540HisBarKgm, P05AO9_A542HisBarSer,
            P05AO9_n542HisBarSer, P05AO9_A546HisColNom, P05AO9_n546HisColNom, P05AO9_A547HisColNum, P05AO9_n547HisColNum, P05AO9_A833TipDefCod, P05AO9_A7000Rps_Cod, P05AO9_n7000Rps_Cod
            }
            , new Object[] {
            }
            , new Object[] {
            P05AO11_A12574ID_TIAES, P05AO11_A12540ID_EMPRESA, P05AO11_n12540ID_EMPRESA, P05AO11_A12541FECHA, P05AO11_n12541FECHA, P05AO11_A12542ID_CLIENTE, P05AO11_n12542ID_CLIENTE, P05AO11_A12543ID_EMP_CLI, P05AO11_n12543ID_EMP_CLI, P05AO11_A12544ID_EMP_ZON,
            P05AO11_n12544ID_EMP_ZON, P05AO11_A12545ID_MAQUINA, P05AO11_n12545ID_MAQUINA, P05AO11_A12546ID_EMP_MAQ, P05AO11_n12546ID_EMP_MAQ, P05AO11_A12547ID_EMP_HDR, P05AO11_n12547ID_EMP_HDR, P05AO11_A12548HOJA_DE_RU, P05AO11_n12548HOJA_DE_RU, P05AO11_A12549TIPO,
            P05AO11_n12549TIPO, P05AO11_A12550ID_PROCESO, P05AO11_n12550ID_PROCESO, P05AO11_A12551ID_EMP_PRO, P05AO11_n12551ID_EMP_PRO, P05AO11_A12552ID_SECCION, P05AO11_n12552ID_SECCION, P05AO11_A12553ID_EMP_SEC, P05AO11_n12553ID_EMP_SEC, P05AO11_A12554ID_ANO_MES,
            P05AO11_n12554ID_ANO_MES, P05AO11_A12555ID_EMP_ANO, P05AO11_n12555ID_EMP_ANO, P05AO11_A12556ID_PARO, P05AO11_n12556ID_PARO, P05AO11_A12557ID_EMP_PAR, P05AO11_n12557ID_EMP_PAR, P05AO11_A12558ID_COLORAN, P05AO11_n12558ID_COLORAN, P05AO11_A12559ID_EMP_COL,
            P05AO11_n12559ID_EMP_COL, P05AO11_A12560ID_INTENSI, P05AO11_n12560ID_INTENSI, P05AO11_A12561ID_EMP_INT, P05AO11_n12561ID_EMP_INT, P05AO11_A12562TIPO_PRODU, P05AO11_n12562TIPO_PRODU, P05AO11_A12563ID_DEFECTO, P05AO11_n12563ID_DEFECTO, P05AO11_A12564ID_EMP_DEF,
            P05AO11_n12564ID_EMP_DEF, P05AO11_A12565ID_RESPONS, P05AO11_n12565ID_RESPONS, P05AO11_A12566ID_EMP_RES, P05AO11_n12566ID_EMP_RES, P05AO11_A12567FACTURADO, P05AO11_n12567FACTURADO, P05AO11_A12568ID_PASTA, P05AO11_n12568ID_PASTA, P05AO11_A12569ID_EMP_PAS,
            P05AO11_n12569ID_EMP_PAS, P05AO11_A12570UNIDADES, P05AO11_n12570UNIDADES, P05AO11_A12571TIPO_UNIDA, P05AO11_n12571TIPO_UNIDA, P05AO11_A12572METROS_P, P05AO11_n12572METROS_P, P05AO11_A12573KILOS_P, P05AO11_n12573KILOS_P
            }
            , new Object[] {
            }
            , new Object[] {
            P05AO13_A130BarCodPar, P05AO13_A132BarCodReo, P05AO13_A129BarCod, P05AO13_A396EmprCod, P05AO13_A228BarUniMed
            }
            , new Object[] {
            P05AO14_A396EmprCod, P05AO14_A129BarCod, P05AO14_A132BarCodReo, P05AO14_A130BarCodPar, P05AO14_A761ProFasLin, P05AO14_n761ProFasLin, P05AO14_A758ProCod
            }
            , new Object[] {
            P05AO15_A30AlbProCod, P05AO15_A396EmprCod, P05AO15_A129BarCod, P05AO15_A132BarCodReo, P05AO15_A130BarCodPar, P05AO15_A32AlbProEsp, P05AO15_A33AlbProEst
            }
            , new Object[] {
            P05AO16_A130BarCodPar, P05AO16_A132BarCodReo, P05AO16_A129BarCod, P05AO16_A396EmprCod, P05AO16_A2677RecPasUA, P05AO16_n2677RecPasUA, P05AO16_A2107PasCod, P05AO16_n2107PasCod, P05AO16_A2524DisComLin, P05AO16_A1056DisComCod,
            P05AO16_A1032FonCod, P05AO16_A2124RecMolCod, P05AO16_A2672RecPasLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV69Existe ;
   private byte A218BarTipCol ;
   private byte A3612HisProReo ;
   private byte A132BarCodReo ;
   private byte AV54barcodreo ;
   private byte AV51Intcod ;
   private byte A2677RecPasUA ;
   private byte A2524DisComLin ;
   private byte A2124RecMolCod ;
   private byte AV50Albproest ;
   private byte A32AlbProEsp ;
   private byte A33AlbProEst ;
   private byte A545HisCodReo ;
   private byte A548HisEstReo ;
   private byte A572HisTipCol ;
   private byte AV58barcad ;
   private byte GXv_int8[] ;
   private byte GXt_int7 ;
   private byte GXv_int11[] ;
   private short AV67Stat ;
   private short AV68hnd ;
   private short A858ZonGeoCod ;
   private short A2247HisProTip ;
   private short A656ParCod ;
   private short A194BarOrdLin ;
   private short A2672RecPasLin ;
   private short AV49TipDefcod ;
   private short AV61Rps_cod ;
   private short A12549TIPO ;
   private short A12556ID_PARO ;
   private short A12558ID_COLORAN ;
   private short A12560ID_INTENSI ;
   private short A12563ID_DEFECTO ;
   private short A12565ID_RESPONS ;
   private short Gx_err ;
   private short A833TipDefCod ;
   private short A7000Rps_Cod ;
   private short A761ProFasLin ;
   private int A561HisProLin ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV53barcod ;
   private int GX_INS1734 ;
   private int A12542ID_CLIENTE ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int GXv_int14[] ;
   private int GXv_int10[] ;
   private int GXv_int9[] ;
   private int AV62Hisprolin ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV70UNIDADES ;
   private java.math.BigDecimal AV71METROS_P ;
   private java.math.BigDecimal AV72KILOS_P ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A12570UNIDADES ;
   private java.math.BigDecimal A12572METROS_P ;
   private java.math.BigDecimal A12573KILOS_P ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A540HisBarKgm ;
   private String AV41UsurCod ;
   private String AV42Station ;
   private String AV43EmprCod ;
   private String AV44EmprNom ;
   private String AV63Carpeta ;
   private String AV60ddmmaaaa ;
   private String GXt_char4 ;
   private String AV64NomInf ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1011TipMaqCod ;
   private String A228BarUniMed ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV55barcodpar ;
   private String A758ProCod ;
   private String AV47Procod ;
   private String AV48pascod ;
   private String A2107PasCod ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A12540ID_EMPRESA ;
   private String A12567FACTURADO ;
   private String A12569ID_EMP_PAS ;
   private String A12571TIPO_UNIDA ;
   private String Gx_emsg ;
   private String A544HisCodPar ;
   private String A542HisBarSer ;
   private String A546HisColNom ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV57TipMaqCod ;
   private String AV59BarUniMed ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV45Fec1 ;
   private java.util.Date AV46Fec2 ;
   private java.util.Date Gx_date ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A12541FECHA ;
   private java.util.Date A569HisReoFec ;
   private boolean Cond_result ;
   private boolean n602MaqCod ;
   private boolean n252CliCod ;
   private boolean n1011TipMaqCod ;
   private boolean n656ParCod ;
   private boolean n4442BarFasDTI ;
   private boolean n2677RecPasUA ;
   private boolean n2107PasCod ;
   private boolean n12540ID_EMPRESA ;
   private boolean n12541FECHA ;
   private boolean n12542ID_CLIENTE ;
   private boolean n12543ID_EMP_CLI ;
   private boolean n12544ID_EMP_ZON ;
   private boolean n12545ID_MAQUINA ;
   private boolean n12546ID_EMP_MAQ ;
   private boolean n12547ID_EMP_HDR ;
   private boolean n12548HOJA_DE_RU ;
   private boolean n12549TIPO ;
   private boolean n12550ID_PROCESO ;
   private boolean n12551ID_EMP_PRO ;
   private boolean n12552ID_SECCION ;
   private boolean n12553ID_EMP_SEC ;
   private boolean n12554ID_ANO_MES ;
   private boolean n12555ID_EMP_ANO ;
   private boolean n12556ID_PARO ;
   private boolean n12557ID_EMP_PAR ;
   private boolean n12558ID_COLORAN ;
   private boolean n12559ID_EMP_COL ;
   private boolean n12560ID_INTENSI ;
   private boolean n12561ID_EMP_INT ;
   private boolean n12562TIPO_PRODU ;
   private boolean n12563ID_DEFECTO ;
   private boolean n12564ID_EMP_DEF ;
   private boolean n12565ID_RESPONS ;
   private boolean n12566ID_EMP_RES ;
   private boolean n12567FACTURADO ;
   private boolean n12568ID_PASTA ;
   private boolean n12569ID_EMP_PAS ;
   private boolean n12570UNIDADES ;
   private boolean n12571TIPO_UNIDA ;
   private boolean n12572METROS_P ;
   private boolean n12573KILOS_P ;
   private boolean n569HisReoFec ;
   private boolean n548HisEstReo ;
   private boolean n572HisTipCol ;
   private boolean n541HisBarMtr ;
   private boolean n540HisBarKgm ;
   private boolean n542HisBarSer ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n7000Rps_Cod ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private String AV66File ;
   private String AV56Control ;
   private String AV65TIPO_PRODUCCION ;
   private String A12574ID_TIAES ;
   private String A12543ID_EMP_CLI ;
   private String A12544ID_EMP_ZON ;
   private String A12545ID_MAQUINA ;
   private String A12546ID_EMP_MAQ ;
   private String A12547ID_EMP_HDR ;
   private String A12548HOJA_DE_RU ;
   private String A12550ID_PROCESO ;
   private String A12551ID_EMP_PRO ;
   private String A12552ID_SECCION ;
   private String A12553ID_EMP_SEC ;
   private String A12554ID_ANO_MES ;
   private String A12555ID_EMP_ANO ;
   private String A12557ID_EMP_PAR ;
   private String A12559ID_EMP_COL ;
   private String A12561ID_EMP_INT ;
   private String A12562TIPO_PRODU ;
   private String A12564ID_EMP_DEF ;
   private String A12566ID_EMP_RES ;
   private String A12568ID_PASTA ;
   private IDataStoreProvider pr_default ;
   private String[] P05AO2_A396EmprCod ;
   private int[] P05AO2_A561HisProLin ;
   private java.util.Date[] P05AO2_A558HisProFec ;
   private String[] P05AO2_A602MaqCod ;
   private boolean[] P05AO2_n602MaqCod ;
   private int[] P05AO2_A252CliCod ;
   private boolean[] P05AO2_n252CliCod ;
   private short[] P05AO2_A858ZonGeoCod ;
   private short[] P05AO2_A2247HisProTip ;
   private String[] P05AO2_A1011TipMaqCod ;
   private boolean[] P05AO2_n1011TipMaqCod ;
   private short[] P05AO2_A656ParCod ;
   private boolean[] P05AO2_n656ParCod ;
   private byte[] P05AO2_A218BarTipCol ;
   private byte[] P05AO2_A3612HisProReo ;
   private java.math.BigDecimal[] P05AO2_A1526HisProMtr ;
   private java.math.BigDecimal[] P05AO2_A1525HisProKgr ;
   private String[] P05AO2_A228BarUniMed ;
   private int[] P05AO2_A129BarCod ;
   private short[] P05AO2_A194BarOrdLin ;
   private String[] P05AO2_A130BarCodPar ;
   private byte[] P05AO2_A132BarCodReo ;
   private String[] P05AO2_A212BarSer ;
   private String[] P05AO2_A135BarColNom ;
   private int[] P05AO2_A136BarColNum ;
   private String[] P05AO3_A396EmprCod ;
   private int[] P05AO3_A129BarCod ;
   private byte[] P05AO3_A132BarCodReo ;
   private String[] P05AO3_A130BarCodPar ;
   private short[] P05AO3_A194BarOrdLin ;
   private java.util.Date[] P05AO3_A4442BarFasDTI ;
   private boolean[] P05AO3_n4442BarFasDTI ;
   private String[] P05AO3_A758ProCod ;
   private String[] P05AO4_A396EmprCod ;
   private int[] P05AO4_A129BarCod ;
   private byte[] P05AO4_A132BarCodReo ;
   private String[] P05AO4_A130BarCodPar ;
   private byte[] P05AO4_A2677RecPasUA ;
   private boolean[] P05AO4_n2677RecPasUA ;
   private String[] P05AO4_A2107PasCod ;
   private boolean[] P05AO4_n2107PasCod ;
   private byte[] P05AO4_A2524DisComLin ;
   private String[] P05AO4_A1056DisComCod ;
   private String[] P05AO4_A1032FonCod ;
   private byte[] P05AO4_A2124RecMolCod ;
   private short[] P05AO4_A2672RecPasLin ;
   private long[] P05AO5_A30AlbProCod ;
   private String[] P05AO5_A396EmprCod ;
   private int[] P05AO5_A129BarCod ;
   private byte[] P05AO5_A132BarCodReo ;
   private String[] P05AO5_A130BarCodPar ;
   private byte[] P05AO5_A32AlbProEsp ;
   private byte[] P05AO5_A33AlbProEst ;
   private String[] P05AO7_A12574ID_TIAES ;
   private java.math.BigDecimal[] P05AO7_A12570UNIDADES ;
   private boolean[] P05AO7_n12570UNIDADES ;
   private java.math.BigDecimal[] P05AO7_A12572METROS_P ;
   private boolean[] P05AO7_n12572METROS_P ;
   private java.math.BigDecimal[] P05AO7_A12573KILOS_P ;
   private boolean[] P05AO7_n12573KILOS_P ;
   private String[] P05AO7_A12540ID_EMPRESA ;
   private boolean[] P05AO7_n12540ID_EMPRESA ;
   private java.util.Date[] P05AO7_A12541FECHA ;
   private boolean[] P05AO7_n12541FECHA ;
   private int[] P05AO7_A12542ID_CLIENTE ;
   private boolean[] P05AO7_n12542ID_CLIENTE ;
   private String[] P05AO7_A12543ID_EMP_CLI ;
   private boolean[] P05AO7_n12543ID_EMP_CLI ;
   private String[] P05AO7_A12544ID_EMP_ZON ;
   private boolean[] P05AO7_n12544ID_EMP_ZON ;
   private String[] P05AO7_A12545ID_MAQUINA ;
   private boolean[] P05AO7_n12545ID_MAQUINA ;
   private String[] P05AO7_A12546ID_EMP_MAQ ;
   private boolean[] P05AO7_n12546ID_EMP_MAQ ;
   private String[] P05AO7_A12547ID_EMP_HDR ;
   private boolean[] P05AO7_n12547ID_EMP_HDR ;
   private String[] P05AO7_A12548HOJA_DE_RU ;
   private boolean[] P05AO7_n12548HOJA_DE_RU ;
   private short[] P05AO7_A12549TIPO ;
   private boolean[] P05AO7_n12549TIPO ;
   private String[] P05AO7_A12550ID_PROCESO ;
   private boolean[] P05AO7_n12550ID_PROCESO ;
   private String[] P05AO7_A12551ID_EMP_PRO ;
   private boolean[] P05AO7_n12551ID_EMP_PRO ;
   private String[] P05AO7_A12552ID_SECCION ;
   private boolean[] P05AO7_n12552ID_SECCION ;
   private String[] P05AO7_A12553ID_EMP_SEC ;
   private boolean[] P05AO7_n12553ID_EMP_SEC ;
   private String[] P05AO7_A12554ID_ANO_MES ;
   private boolean[] P05AO7_n12554ID_ANO_MES ;
   private String[] P05AO7_A12555ID_EMP_ANO ;
   private boolean[] P05AO7_n12555ID_EMP_ANO ;
   private short[] P05AO7_A12556ID_PARO ;
   private boolean[] P05AO7_n12556ID_PARO ;
   private String[] P05AO7_A12557ID_EMP_PAR ;
   private boolean[] P05AO7_n12557ID_EMP_PAR ;
   private short[] P05AO7_A12558ID_COLORAN ;
   private boolean[] P05AO7_n12558ID_COLORAN ;
   private String[] P05AO7_A12559ID_EMP_COL ;
   private boolean[] P05AO7_n12559ID_EMP_COL ;
   private short[] P05AO7_A12560ID_INTENSI ;
   private boolean[] P05AO7_n12560ID_INTENSI ;
   private String[] P05AO7_A12561ID_EMP_INT ;
   private boolean[] P05AO7_n12561ID_EMP_INT ;
   private String[] P05AO7_A12562TIPO_PRODU ;
   private boolean[] P05AO7_n12562TIPO_PRODU ;
   private short[] P05AO7_A12563ID_DEFECTO ;
   private boolean[] P05AO7_n12563ID_DEFECTO ;
   private String[] P05AO7_A12564ID_EMP_DEF ;
   private boolean[] P05AO7_n12564ID_EMP_DEF ;
   private short[] P05AO7_A12565ID_RESPONS ;
   private boolean[] P05AO7_n12565ID_RESPONS ;
   private String[] P05AO7_A12566ID_EMP_RES ;
   private boolean[] P05AO7_n12566ID_EMP_RES ;
   private String[] P05AO7_A12567FACTURADO ;
   private boolean[] P05AO7_n12567FACTURADO ;
   private String[] P05AO7_A12568ID_PASTA ;
   private boolean[] P05AO7_n12568ID_PASTA ;
   private String[] P05AO7_A12569ID_EMP_PAS ;
   private boolean[] P05AO7_n12569ID_EMP_PAS ;
   private String[] P05AO7_A12571TIPO_UNIDA ;
   private boolean[] P05AO7_n12571TIPO_UNIDA ;
   private String[] P05AO9_A396EmprCod ;
   private String[] P05AO9_A544HisCodPar ;
   private byte[] P05AO9_A545HisCodReo ;
   private int[] P05AO9_A539HisBarCod ;
   private java.util.Date[] P05AO9_A569HisReoFec ;
   private boolean[] P05AO9_n569HisReoFec ;
   private String[] P05AO9_A602MaqCod ;
   private boolean[] P05AO9_n602MaqCod ;
   private int[] P05AO9_A252CliCod ;
   private boolean[] P05AO9_n252CliCod ;
   private short[] P05AO9_A858ZonGeoCod ;
   private byte[] P05AO9_A548HisEstReo ;
   private boolean[] P05AO9_n548HisEstReo ;
   private byte[] P05AO9_A572HisTipCol ;
   private boolean[] P05AO9_n572HisTipCol ;
   private java.math.BigDecimal[] P05AO9_A541HisBarMtr ;
   private boolean[] P05AO9_n541HisBarMtr ;
   private java.math.BigDecimal[] P05AO9_A540HisBarKgm ;
   private boolean[] P05AO9_n540HisBarKgm ;
   private String[] P05AO9_A542HisBarSer ;
   private boolean[] P05AO9_n542HisBarSer ;
   private String[] P05AO9_A546HisColNom ;
   private boolean[] P05AO9_n546HisColNom ;
   private int[] P05AO9_A547HisColNum ;
   private boolean[] P05AO9_n547HisColNum ;
   private short[] P05AO9_A833TipDefCod ;
   private short[] P05AO9_A7000Rps_Cod ;
   private boolean[] P05AO9_n7000Rps_Cod ;
   private String[] P05AO11_A12574ID_TIAES ;
   private String[] P05AO11_A12540ID_EMPRESA ;
   private boolean[] P05AO11_n12540ID_EMPRESA ;
   private java.util.Date[] P05AO11_A12541FECHA ;
   private boolean[] P05AO11_n12541FECHA ;
   private int[] P05AO11_A12542ID_CLIENTE ;
   private boolean[] P05AO11_n12542ID_CLIENTE ;
   private String[] P05AO11_A12543ID_EMP_CLI ;
   private boolean[] P05AO11_n12543ID_EMP_CLI ;
   private String[] P05AO11_A12544ID_EMP_ZON ;
   private boolean[] P05AO11_n12544ID_EMP_ZON ;
   private String[] P05AO11_A12545ID_MAQUINA ;
   private boolean[] P05AO11_n12545ID_MAQUINA ;
   private String[] P05AO11_A12546ID_EMP_MAQ ;
   private boolean[] P05AO11_n12546ID_EMP_MAQ ;
   private String[] P05AO11_A12547ID_EMP_HDR ;
   private boolean[] P05AO11_n12547ID_EMP_HDR ;
   private String[] P05AO11_A12548HOJA_DE_RU ;
   private boolean[] P05AO11_n12548HOJA_DE_RU ;
   private short[] P05AO11_A12549TIPO ;
   private boolean[] P05AO11_n12549TIPO ;
   private String[] P05AO11_A12550ID_PROCESO ;
   private boolean[] P05AO11_n12550ID_PROCESO ;
   private String[] P05AO11_A12551ID_EMP_PRO ;
   private boolean[] P05AO11_n12551ID_EMP_PRO ;
   private String[] P05AO11_A12552ID_SECCION ;
   private boolean[] P05AO11_n12552ID_SECCION ;
   private String[] P05AO11_A12553ID_EMP_SEC ;
   private boolean[] P05AO11_n12553ID_EMP_SEC ;
   private String[] P05AO11_A12554ID_ANO_MES ;
   private boolean[] P05AO11_n12554ID_ANO_MES ;
   private String[] P05AO11_A12555ID_EMP_ANO ;
   private boolean[] P05AO11_n12555ID_EMP_ANO ;
   private short[] P05AO11_A12556ID_PARO ;
   private boolean[] P05AO11_n12556ID_PARO ;
   private String[] P05AO11_A12557ID_EMP_PAR ;
   private boolean[] P05AO11_n12557ID_EMP_PAR ;
   private short[] P05AO11_A12558ID_COLORAN ;
   private boolean[] P05AO11_n12558ID_COLORAN ;
   private String[] P05AO11_A12559ID_EMP_COL ;
   private boolean[] P05AO11_n12559ID_EMP_COL ;
   private short[] P05AO11_A12560ID_INTENSI ;
   private boolean[] P05AO11_n12560ID_INTENSI ;
   private String[] P05AO11_A12561ID_EMP_INT ;
   private boolean[] P05AO11_n12561ID_EMP_INT ;
   private String[] P05AO11_A12562TIPO_PRODU ;
   private boolean[] P05AO11_n12562TIPO_PRODU ;
   private short[] P05AO11_A12563ID_DEFECTO ;
   private boolean[] P05AO11_n12563ID_DEFECTO ;
   private String[] P05AO11_A12564ID_EMP_DEF ;
   private boolean[] P05AO11_n12564ID_EMP_DEF ;
   private short[] P05AO11_A12565ID_RESPONS ;
   private boolean[] P05AO11_n12565ID_RESPONS ;
   private String[] P05AO11_A12566ID_EMP_RES ;
   private boolean[] P05AO11_n12566ID_EMP_RES ;
   private String[] P05AO11_A12567FACTURADO ;
   private boolean[] P05AO11_n12567FACTURADO ;
   private String[] P05AO11_A12568ID_PASTA ;
   private boolean[] P05AO11_n12568ID_PASTA ;
   private String[] P05AO11_A12569ID_EMP_PAS ;
   private boolean[] P05AO11_n12569ID_EMP_PAS ;
   private java.math.BigDecimal[] P05AO11_A12570UNIDADES ;
   private boolean[] P05AO11_n12570UNIDADES ;
   private String[] P05AO11_A12571TIPO_UNIDA ;
   private boolean[] P05AO11_n12571TIPO_UNIDA ;
   private java.math.BigDecimal[] P05AO11_A12572METROS_P ;
   private boolean[] P05AO11_n12572METROS_P ;
   private java.math.BigDecimal[] P05AO11_A12573KILOS_P ;
   private boolean[] P05AO11_n12573KILOS_P ;
   private String[] P05AO13_A130BarCodPar ;
   private byte[] P05AO13_A132BarCodReo ;
   private int[] P05AO13_A129BarCod ;
   private String[] P05AO13_A396EmprCod ;
   private String[] P05AO13_A228BarUniMed ;
   private String[] P05AO14_A396EmprCod ;
   private int[] P05AO14_A129BarCod ;
   private byte[] P05AO14_A132BarCodReo ;
   private String[] P05AO14_A130BarCodPar ;
   private short[] P05AO14_A761ProFasLin ;
   private boolean[] P05AO14_n761ProFasLin ;
   private String[] P05AO14_A758ProCod ;
   private long[] P05AO15_A30AlbProCod ;
   private String[] P05AO15_A396EmprCod ;
   private int[] P05AO15_A129BarCod ;
   private byte[] P05AO15_A132BarCodReo ;
   private String[] P05AO15_A130BarCodPar ;
   private byte[] P05AO15_A32AlbProEsp ;
   private byte[] P05AO15_A33AlbProEst ;
   private String[] P05AO16_A130BarCodPar ;
   private byte[] P05AO16_A132BarCodReo ;
   private int[] P05AO16_A129BarCod ;
   private String[] P05AO16_A396EmprCod ;
   private byte[] P05AO16_A2677RecPasUA ;
   private boolean[] P05AO16_n2677RecPasUA ;
   private String[] P05AO16_A2107PasCod ;
   private boolean[] P05AO16_n2107PasCod ;
   private byte[] P05AO16_A2524DisComLin ;
   private String[] P05AO16_A1056DisComCod ;
   private String[] P05AO16_A1032FonCod ;
   private byte[] P05AO16_A2124RecMolCod ;
   private short[] P05AO16_A2672RecPasLin ;
}

final  class aptiaes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05AO2", "SELECT T1.EmprCod, T1.HisProLin, T1.HisProFec, T1.MaqCod, T3.CliCod, T4.ZonGeoCod, T1.HisProTip, T2.TipMaqCod, T1.ParCod, T3.BarTipCol, T1.HisProReo, T1.HisProMtr, T1.HisProKgr, T3.BarUniMed, T1.BarCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T3.BarSer, T3.BarColNom, T3.BarColNum FROM (((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) WHERE (T1.EmprCod = ? and T1.HisProFec >= ?) AND (T1.HisProFec <= ?) ORDER BY T1.EmprCod, T1.HisProFec, T1.MaqCod, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AO3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasDTI, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AO4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecPasUA, PasCod, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin FROM TXPRECPAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AO5", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProEsp, T2.AlbProEst FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05AO6", "INSERT INTO TXPTIAES(ID_TIAES, ID_EMPRESA, FECHA, ID_CLIENTE, ID_EMP_CLI, ID_EMP_ZON, ID_MAQUINA, ID_EMP_MAQ, ID_EMP_HDR, HOJA_DE_RU, TIPO, ID_PROCESO, ID_EMP_PRO, ID_SECCION, ID_EMP_SEC, ID_ANO_MES, ID_EMP_ANO, ID_PARO, ID_EMP_PAR, ID_COLORAN, ID_EMP_COL, ID_INTENSI, ID_EMP_INT, TIPO_PRODU, ID_DEFECTO, ID_EMP_DEF, ID_RESPONS, ID_EMP_RES, FACTURADO, ID_PASTA, ID_EMP_PAS, UNIDADES, TIPO_UNIDA, METROS_P, KILOS_P) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIAES")
         ,new ForEachCursor("P05AO7", "SELECT ID_TIAES, UNIDADES, METROS_P, KILOS_P, ID_EMPRESA, FECHA, ID_CLIENTE, ID_EMP_CLI, ID_EMP_ZON, ID_MAQUINA, ID_EMP_MAQ, ID_EMP_HDR, HOJA_DE_RU, TIPO, ID_PROCESO, ID_EMP_PRO, ID_SECCION, ID_EMP_SEC, ID_ANO_MES, ID_EMP_ANO, ID_PARO, ID_EMP_PAR, ID_COLORAN, ID_EMP_COL, ID_INTENSI, ID_EMP_INT, TIPO_PRODU, ID_DEFECTO, ID_EMP_DEF, ID_RESPONS, ID_EMP_RES, FACTURADO, ID_PASTA, ID_EMP_PAS, TIPO_UNIDA FROM TXPTIAES WHERE ID_TIAES = ? ORDER BY ID_TIAES ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05AO8", "UPDATE TXPTIAES SET UNIDADES=?, METROS_P=?, KILOS_P=?, ID_EMPRESA=?, FECHA=?, ID_CLIENTE=?, ID_EMP_CLI=?, ID_EMP_ZON=?, ID_MAQUINA=?, ID_EMP_MAQ=?, ID_EMP_HDR=?, HOJA_DE_RU=?, TIPO=?, ID_PROCESO=?, ID_EMP_PRO=?, ID_SECCION=?, ID_EMP_SEC=?, ID_ANO_MES=?, ID_EMP_ANO=?, ID_PARO=?, ID_EMP_PAR=?, ID_COLORAN=?, ID_EMP_COL=?, ID_INTENSI=?, ID_EMP_INT=?, TIPO_PRODU=?, ID_DEFECTO=?, ID_EMP_DEF=?, ID_RESPONS=?, ID_EMP_RES=?, FACTURADO=?, ID_PASTA=?, ID_EMP_PAS=?, TIPO_UNIDA=?  WHERE ID_TIAES = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIAES")
         ,new ForEachCursor("P05AO9", "SELECT T1.EmprCod, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.HisReoFec, T1.MaqCod, T1.CliCod, T2.ZonGeoCod, T1.HisEstReo, T1.HisTipCol, T1.HisBarMtr, T1.HisBarKgm, T1.HisBarSer, T1.HisColNom, T1.HisColNum, T1.TipDefCod, T1.Rps_Cod FROM (TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) ORDER BY T1.EmprCod, T1.HisReoFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05AO10", "INSERT INTO TXPTIAES(ID_TIAES, ID_EMPRESA, FECHA, ID_CLIENTE, ID_EMP_CLI, ID_EMP_ZON, ID_MAQUINA, ID_EMP_MAQ, ID_EMP_HDR, HOJA_DE_RU, TIPO, ID_PROCESO, ID_EMP_PRO, ID_SECCION, ID_EMP_SEC, ID_ANO_MES, ID_EMP_ANO, ID_PARO, ID_EMP_PAR, ID_COLORAN, ID_EMP_COL, ID_INTENSI, ID_EMP_INT, TIPO_PRODU, ID_DEFECTO, ID_EMP_DEF, ID_RESPONS, ID_EMP_RES, FACTURADO, ID_PASTA, ID_EMP_PAS, UNIDADES, TIPO_UNIDA, METROS_P, KILOS_P) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIAES")
         ,new ForEachCursor("P05AO11", "SELECT ID_TIAES, ID_EMPRESA, FECHA, ID_CLIENTE, ID_EMP_CLI, ID_EMP_ZON, ID_MAQUINA, ID_EMP_MAQ, ID_EMP_HDR, HOJA_DE_RU, TIPO, ID_PROCESO, ID_EMP_PRO, ID_SECCION, ID_EMP_SEC, ID_ANO_MES, ID_EMP_ANO, ID_PARO, ID_EMP_PAR, ID_COLORAN, ID_EMP_COL, ID_INTENSI, ID_EMP_INT, TIPO_PRODU, ID_DEFECTO, ID_EMP_DEF, ID_RESPONS, ID_EMP_RES, FACTURADO, ID_PASTA, ID_EMP_PAS, UNIDADES, TIPO_UNIDA, METROS_P, KILOS_P FROM TXPTIAES WHERE ID_TIAES = ? ORDER BY ID_TIAES ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05AO12", "UPDATE TXPTIAES SET ID_EMPRESA=?, FECHA=?, ID_CLIENTE=?, ID_EMP_CLI=?, ID_EMP_ZON=?, ID_MAQUINA=?, ID_EMP_MAQ=?, ID_EMP_HDR=?, HOJA_DE_RU=?, TIPO=?, ID_PROCESO=?, ID_EMP_PRO=?, ID_SECCION=?, ID_EMP_SEC=?, ID_ANO_MES=?, ID_EMP_ANO=?, ID_PARO=?, ID_EMP_PAR=?, ID_COLORAN=?, ID_EMP_COL=?, ID_INTENSI=?, ID_EMP_INT=?, TIPO_PRODU=?, ID_DEFECTO=?, ID_EMP_DEF=?, ID_RESPONS=?, ID_EMP_RES=?, FACTURADO=?, ID_PASTA=?, ID_EMP_PAS=?, UNIDADES=?, TIPO_UNIDA=?, METROS_P=?, KILOS_P=?  WHERE ID_TIAES = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIAES")
         ,new ForEachCursor("P05AO13", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarUniMed FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AO14", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AO15", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProEsp, T2.AlbProEst FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AO16", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, RecPasUA, PasCod, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin FROM TXPRECPAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((short[]) buf[18])[0] = rslt.getShort(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 16);
               ((String[]) buf[22])[0] = rslt.getString(20, 13);
               ((int[]) buf[23])[0] = rslt.getInt(21);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 12);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 9);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(16);
               ((short[]) buf[26])[0] = rslt.getShort(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 9);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 12);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setVarchar(1, (String)parms[0], 360, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 43);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 43);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 6);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 9);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 84);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 81);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 8);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 11);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 7);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 10);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 13);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 43);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 43);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[44], 43);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 11);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 43);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[52]).shortValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 43);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[58], 6);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[60], 9);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[68], 2);
               }
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 43);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 43);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 6);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 9);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 84);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 81);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 8);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 11);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 7);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 10);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 13);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 43);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 43);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 43);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 11);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[55], 43);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[59], 43);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[63], 6);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 9);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 1);
               }
               stmt.setVarchar(35, (String)parms[68], 360, false);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 43);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 43);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 6);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 9);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 84);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 81);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 8);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 11);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 7);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 10);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 13);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 43);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 43);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[44], 43);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 11);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 43);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[52]).shortValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 43);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[58], 6);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[60], 9);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[68], 2);
               }
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 43);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 43);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 9);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 84);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 81);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 8);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 11);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 7);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 13);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 43);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 43);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 43);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 11);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 43);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 43);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 6);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 9);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[67], 2);
               }
               stmt.setVarchar(35, (String)parms[68], 360, false);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

