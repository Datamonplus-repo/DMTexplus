package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinfplnaccion extends GXProcedure
{
   public pinfplnaccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinfplnaccion.class ), "" );
   }

   public pinfplnaccion( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pinfplnaccion.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pinfplnaccion.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinfplnaccion.this.AV28Emprnom = aP1[0];
      this.aP1 = aP1;
      pinfplnaccion.this.AV14Name = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV23Carpeta ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char2) ;
      pinfplnaccion.this.GXt_char1 = GXv_char2[0] ;
      AV23Carpeta = GXt_char1 ;
      GXt_char1 = AV23Carpeta ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char2) ;
      pinfplnaccion.this.GXt_char1 = GXv_char2[0] ;
      AV23Carpeta = ((GXutil.strcmp("", AV23Carpeta)==0) ? GXt_char1 : AV23Carpeta) ;
      AV16NomInf = GXutil.trim( AV31Pgmdesc) ;
      AV14Name = GXutil.trim( AV23Carpeta) + "\\" + GXutil.trim( AV16NomInf) + httpContext.getMessage( ".xls", "") ;
      if ( GXutil.fileExists( AV14Name) == 1 )
      {
         AV8Aux = GXutil.deleteFile( AV14Name) ;
      }
      GXt_int3 = AV13hnd ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fcreate(remoteHandle, context).execute( AV14Name, GXv_int4) ;
      pinfplnaccion.this.GXt_int3 = GXv_int4[0] ;
      AV13hnd = GXt_int3 ;
      /* Execute user subroutine: 'INICIO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV27numr = 0 ;
      /* Using cursor P05SV2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13186PLNColorDs = P05SV2_A13186PLNColorDs[0] ;
         n13186PLNColorDs = P05SV2_n13186PLNColorDs[0] ;
         A13184PLNCarga = P05SV2_A13184PLNCarga[0] ;
         n13184PLNCarga = P05SV2_n13184PLNCarga[0] ;
         A13189PLNCargaF = P05SV2_A13189PLNCargaF[0] ;
         n13189PLNCargaF = P05SV2_n13189PLNCargaF[0] ;
         A13185PLNDias = P05SV2_A13185PLNDias[0] ;
         n13185PLNDias = P05SV2_n13185PLNDias[0] ;
         A13188PLNLinea = P05SV2_A13188PLNLinea[0] ;
         A13183PLNColor = P05SV2_A13183PLNColor[0] ;
         A13182PLNTipoCru = P05SV2_A13182PLNTipoCru[0] ;
         A13181PLNProceso = P05SV2_A13181PLNProceso[0] ;
         A13186PLNColorDs = P05SV2_A13186PLNColorDs[0] ;
         n13186PLNColorDs = P05SV2_n13186PLNColorDs[0] ;
         AV25Proceso = ((GXutil.strcmp(A13181PLNProceso, httpContext.getMessage( "N", ""))==0) ? httpContext.getMessage( "Normal", "") : httpContext.getMessage( "Especial", "")) ;
         AV26TipoCrudo = ((A13182PLNTipoCru==1) ? httpContext.getMessage( "MTO", "") : httpContext.getMessage( "MTS", "")) ;
         GXt_int5 = AV17Ok ;
         GXv_int6[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " <Row ss:AutoFitHeight=\"0\">", ""), GXv_int6) ;
         pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
         AV17Ok = GXt_int5 ;
         GXt_int5 = AV17Ok ;
         GXv_int6[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( AV25Proceso)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int6) ;
         pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
         AV17Ok = GXt_int5 ;
         GXt_int5 = AV17Ok ;
         GXv_int6[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( AV26TipoCrudo)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int6) ;
         pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
         AV17Ok = GXt_int5 ;
         GXt_int5 = AV17Ok ;
         GXv_int6[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( A13186PLNColorDs)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int6) ;
         pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
         AV17Ok = GXt_int5 ;
         GXt_int5 = AV17Ok ;
         GXv_int6[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"Number\">", "")+GXutil.trim( GXutil.str( A13184PLNCarga, 9, 2))+httpContext.getMessage( "</Data></Cell>", ""), GXv_int6) ;
         pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
         AV17Ok = GXt_int5 ;
         GXt_int5 = AV17Ok ;
         GXv_int6[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"Number\">", "")+GXutil.trim( GXutil.str( A13189PLNCargaF, 4, 0))+httpContext.getMessage( "</Data></Cell>", ""), GXv_int6) ;
         pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
         AV17Ok = GXt_int5 ;
         GXt_int5 = AV17Ok ;
         GXv_int6[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"Number\">", "")+GXutil.trim( GXutil.str( A13185PLNDias, 4, 0))+httpContext.getMessage( "</Data></Cell>", ""), GXv_int6) ;
         pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
         AV17Ok = GXt_int5 ;
         GXt_int5 = AV17Ok ;
         GXv_int6[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " </Row>", ""), GXv_int6) ;
         pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
         AV17Ok = GXt_int5 ;
         AV27numr = (int)(AV27numr+1) ;
         Gx_msg = httpContext.getMessage( "Procesando... ", "") + GXutil.str( AV27numr, 6, 0) ;
         System.out.println( Gx_msg );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: 'FIN' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fclose(remoteHandle, context).execute( AV13hnd, GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      System.out.println( httpContext.getMessage( "Informe XML generado", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIO' Routine */
      returnInSub = false ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "<?mso-application progid=\"Excel.Sheet\"?>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "<Workbook xmlns=\"urn:schemas-microsoft-com:office:spreadsheet\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " xmlns:o=\"urn:schemas-microsoft-com:office:office\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " xmlns:x=\"urn:schemas-microsoft-com:office:excel\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " xmlns:ss=\"urn:schemas-microsoft-com:office:spreadsheet\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " xmlns:html=\"http://www.w3.org/TR/REC-html40\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " <DocumentProperties xmlns=\"urn:schemas-microsoft-com:office:office\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <LastAuthor>Usuario</LastAuthor>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <LastPrinted>2017-03-21T17:46:38Z</LastPrinted>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " <Created>2017-03-21T17:45:44Z</Created>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Version>12.00</Version>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " </DocumentProperties>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " <ExcelWorkbook xmlns=\"urn:schemas-microsoft-com:office:excel\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <WindowHeight>10680</WindowHeight>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <WindowWidth>28335</WindowWidth>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <WindowTopX>240</WindowTopX>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <WindowTopY>105</WindowTopY>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <ProtectStructure>False</ProtectStructure>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <ProtectWindows>False</ProtectWindows>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " </ExcelWorkbook>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      /* Execute user subroutine: 'ESTILOS' */
      S121 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'TITULOS' */
      S131 ();
      if (returnInSub) return;
   }

   public void S121( )
   {
      /* 'ESTILOS' Routine */
      returnInSub = false ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "<Styles>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " <Style ss:ID=\"Default\" ss:Name=\"Normal\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Alignment ss:Vertical=\"Bottom\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Borders/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Font ss:FontName=\"Calibri\" x:Family=\"Swiss\" ss:Size=\"11\" ss:Color=\"#000000\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    ss:Bold=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Interior/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <NumberFormat/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Protection/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  </Style>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Style ss:ID=\"s62\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Alignment ss:Horizontal=\"Center\" ss:Vertical=\"Bottom\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Borders>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Bottom\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Left\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Right\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Top\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   </Borders>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  </Style>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Style ss:ID=\"s63\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Alignment ss:Horizontal=\"Center\" ss:Vertical=\"Bottom\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Borders>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Bottom\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Left\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Right\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Top\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   </Borders>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Font ss:FontName=\"Calibri\" x:Family=\"Swiss\" ss:Size=\"11\" ss:Color=\"#000000\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  </Style>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " <Style ss:ID=\"s68\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Alignment ss:Horizontal=\"Center\" ss:Vertical=\"Bottom\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Borders>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Bottom\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Left\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Right\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Border ss:Position=\"Top\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   </Borders>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Interior ss:Color=\"#FAC090\" ss:Pattern=\"Solid\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  </Style>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " </Styles>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
   }

   public void S131( )
   {
      /* 'TITULOS' Routine */
      returnInSub = false ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "<Worksheet ss:Name=\"Hoja1\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "<Names>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <NamedRange ss:Name=\"Print_Titles\" ss:RefersTo=\"=Hoja1!R1\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "</Names>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Table ss:ExpandedColumnCount=\"100\" ss:ExpandedRowCount=\"100000\" x:FullColumns=\"1\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   x:FullRows=\"1\" ss:DefaultColumnWidth=\"60\" ss:DefaultRowHeight=\"15\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Row ss:AutoFitHeight=\"0\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Proceso</Data></Cell>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Tipo de Crudo</Data></Cell>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Color</Data></Cell>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Carga Inicial</Data></Cell>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Carga Final</Data></Cell>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Dias</Data></Cell>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   </Row>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
   }

   public void S141( )
   {
      /* 'FIN' Routine */
      returnInSub = false ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "</Table>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <WorksheetOptions xmlns=\"urn:schemas-microsoft-com:office:excel\">", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <PageSetup>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  <Header x:Margin=\"0.31496062992125984\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   x:Data=\"&amp;Z", "")+GXutil.trim( AV31Pgmdesc)+httpContext.getMessage( "&amp;C", "")+AV28Emprnom+httpContext.getMessage( "&amp;D&amp;F &amp;H\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Footer x:Margin=\"0.31496062992125984\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "       x:Data=\"&amp;C", "")+GXutil.trim( AV24Filtrostxt)+httpContext.getMessage( "&amp;D&amp;P /&amp;#\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <PageMargins x:Bottom=\"0.74803149606299213\" x:Left=\"0.70866141732283472\"", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    x:Right=\"0.70866141732283472\" x:Top=\"0.74803149606299213\"/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   </PageSetup>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Print>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <ValidPrinterInfo/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <PaperSizeIndex>9</PaperSizeIndex>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <Scale>90</Scale>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <HorizontalResolution>300</HorizontalResolution>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "    <VerticalResolution>300</VerticalResolution>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   </Print>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <Selected/>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <ProtectObjects>False</ProtectObjects>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "   <ProtectScenarios>False</ProtectScenarios>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( "  </WorksheetOptions>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " </Worksheet>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
      GXt_int5 = AV17Ok ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV13hnd, httpContext.getMessage( " </Workbook>", ""), GXv_int6) ;
      pinfplnaccion.this.GXt_int5 = GXv_int6[0] ;
      AV17Ok = GXt_int5 ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinfplnaccion.this.A396EmprCod;
      this.aP1[0] = pinfplnaccion.this.AV28Emprnom;
      this.aP2[0] = pinfplnaccion.this.AV14Name;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23Carpeta = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16NomInf = "" ;
      AV31Pgmdesc = "" ;
      GXv_int4 = new long[1] ;
      scmdbuf = "" ;
      P05SV2_A396EmprCod = new String[] {""} ;
      P05SV2_A13186PLNColorDs = new String[] {""} ;
      P05SV2_n13186PLNColorDs = new boolean[] {false} ;
      P05SV2_A13184PLNCarga = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SV2_n13184PLNCarga = new boolean[] {false} ;
      P05SV2_A13189PLNCargaF = new short[1] ;
      P05SV2_n13189PLNCargaF = new boolean[] {false} ;
      P05SV2_A13185PLNDias = new short[1] ;
      P05SV2_n13185PLNDias = new boolean[] {false} ;
      P05SV2_A13188PLNLinea = new short[1] ;
      P05SV2_A13183PLNColor = new byte[1] ;
      P05SV2_A13182PLNTipoCru = new byte[1] ;
      P05SV2_A13181PLNProceso = new String[] {""} ;
      A13186PLNColorDs = "" ;
      A13184PLNCarga = DecimalUtil.ZERO ;
      A13181PLNProceso = "" ;
      AV25Proceso = "" ;
      AV26TipoCrudo = "" ;
      Gx_msg = "" ;
      AV24Filtrostxt = "" ;
      GXv_int6 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinfplnaccion__default(),
         new Object[] {
             new Object[] {
            P05SV2_A396EmprCod, P05SV2_A13186PLNColorDs, P05SV2_n13186PLNColorDs, P05SV2_A13184PLNCarga, P05SV2_n13184PLNCarga, P05SV2_A13189PLNCargaF, P05SV2_n13189PLNCargaF, P05SV2_A13185PLNDias, P05SV2_n13185PLNDias, P05SV2_A13188PLNLinea,
            P05SV2_A13183PLNColor, P05SV2_A13182PLNTipoCru, P05SV2_A13181PLNProceso
            }
         }
      );
      AV31Pgmdesc = httpContext.getMessage( "Informe Plan de Accion", "") ;
      /* GeneXus formulas. */
      AV31Pgmdesc = httpContext.getMessage( "Informe Plan de Accion", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV8Aux ;
   private byte A13183PLNColor ;
   private byte A13182PLNTipoCru ;
   private byte AV17Ok ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short A13189PLNCargaF ;
   private short A13185PLNDias ;
   private short A13188PLNLinea ;
   private short Gx_err ;
   private int AV27numr ;
   private long AV13hnd ;
   private long GXt_int3 ;
   private long GXv_int4[] ;
   private java.math.BigDecimal A13184PLNCarga ;
   private String A396EmprCod ;
   private String AV28Emprnom ;
   private String AV23Carpeta ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16NomInf ;
   private String AV31Pgmdesc ;
   private String scmdbuf ;
   private String A13186PLNColorDs ;
   private String A13181PLNProceso ;
   private String AV25Proceso ;
   private String AV26TipoCrudo ;
   private String Gx_msg ;
   private String AV24Filtrostxt ;
   private boolean returnInSub ;
   private boolean n13186PLNColorDs ;
   private boolean n13184PLNCarga ;
   private boolean n13189PLNCargaF ;
   private boolean n13185PLNDias ;
   private String AV14Name ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05SV2_A396EmprCod ;
   private String[] P05SV2_A13186PLNColorDs ;
   private boolean[] P05SV2_n13186PLNColorDs ;
   private java.math.BigDecimal[] P05SV2_A13184PLNCarga ;
   private boolean[] P05SV2_n13184PLNCarga ;
   private short[] P05SV2_A13189PLNCargaF ;
   private boolean[] P05SV2_n13189PLNCargaF ;
   private short[] P05SV2_A13185PLNDias ;
   private boolean[] P05SV2_n13185PLNDias ;
   private short[] P05SV2_A13188PLNLinea ;
   private byte[] P05SV2_A13183PLNColor ;
   private byte[] P05SV2_A13182PLNTipoCru ;
   private String[] P05SV2_A13181PLNProceso ;
}

final  class pinfplnaccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SV2", "SELECT T1.EmprCod, T2.PLNColorDs, T1.PLNCarga, T1.PLNCargaF, T1.PLNDias, T1.PLNLinea, T1.PLNColor, T1.PLNTipoCru, T1.PLNProceso FROM (TXPPLNAC1 T1 INNER JOIN TXPPLNCol T2 ON T2.EmprCod = T1.EmprCod AND T2.PLNColor = T1.PLNColor) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.PLNProceso, T1.PLNTipoCru, T1.PLNColor, T1.PLNLinea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
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
      }
   }

}

