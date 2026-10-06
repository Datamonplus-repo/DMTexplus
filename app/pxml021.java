package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxml021 extends GXProcedure
{
   public pxml021( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxml021.class ), "" );
   }

   public pxml021( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pxml021.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pxml021.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxml021.this.AV20Clicod = aP1[0];
      this.aP1 = aP1;
      pxml021.this.AV21CliNom = aP2[0];
      this.aP2 = aP2;
      pxml021.this.AV22ArtCod = aP3[0];
      this.aP3 = aP3;
      pxml021.this.AV23ArtDsc = aP4[0];
      this.aP4 = aP4;
      pxml021.this.AV9File = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05512 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P05512_A407EmprNom[0] ;
         n407EmprNom = P05512_n407EmprNom[0] ;
         AV16EmprNom = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05513 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV20Clicod), AV22ArtCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A65ArtCod = P05513_A65ArtCod[0] ;
         A252CliCod = P05513_A252CliCod[0] ;
         A12353Mat_ObsG = P05513_A12353Mat_ObsG[0] ;
         n12353Mat_ObsG = P05513_n12353Mat_ObsG[0] ;
         AV24Mat_ObsG = A12353Mat_ObsG ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      System.out.println( httpContext.getMessage( "Generando Informe xml... ", "") );
      if ( new app.core.file(remoteHandle, context).executeUdp( AV9File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV10OK = GXutil.deleteFile( AV9File) ;
      }
      GXt_int1 = AV8hnd ;
      GXv_int2[0] = GXt_int1 ;
      new app.core.fcreate(remoteHandle, context).execute( AV9File, GXv_int2) ;
      pxml021.this.GXt_int1 = GXv_int2[0] ;
      AV8hnd = GXt_int1 ;
      /* Execute user subroutine: 'INICIO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15numr = 0 ;
      /* Using cursor P05514 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV20Clicod), AV22ArtCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A65ArtCod = P05514_A65ArtCod[0] ;
         A252CliCod = P05514_A252CliCod[0] ;
         A6954Mat_lin = P05514_A6954Mat_lin[0] ;
         A6955Mat_Estr = P05514_A6955Mat_Estr[0] ;
         n6955Mat_Estr = P05514_n6955Mat_Estr[0] ;
         A12357Mat_Color = P05514_A12357Mat_Color[0] ;
         n12357Mat_Color = P05514_n12357Mat_Color[0] ;
         A12356Mat_Dsc = P05514_A12356Mat_Dsc[0] ;
         n12356Mat_Dsc = P05514_n12356Mat_Dsc[0] ;
         A12354Mat_Lu = P05514_A12354Mat_Lu[0] ;
         n12354Mat_Lu = P05514_n12354Mat_Lu[0] ;
         A12355Mat_NE = P05514_A12355Mat_NE[0] ;
         n12355Mat_NE = P05514_n12355Mat_NE[0] ;
         A6962Mat_Porc = P05514_A6962Mat_Porc[0] ;
         n6962Mat_Porc = P05514_n6962Mat_Porc[0] ;
         A12358Mat_NAlim = P05514_A12358Mat_NAlim[0] ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " <Row ss:AutoFitHeight=\"0\">", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"Number\">", "")+GXutil.trim( GXutil.str( A6954Mat_lin, 4, 0))+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( A6955Mat_Estr)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( A12357Mat_Color)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( A12356Mat_Dsc)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"Number\">", "")+GXutil.trim( GXutil.str( A12354Mat_Lu, 6, 2))+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( A12355Mat_NE)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"Number\">", "")+GXutil.trim( GXutil.str( A6962Mat_Porc, 6, 2))+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( A12358Mat_NAlim)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         GXt_int3 = AV10OK ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " </Row>", ""), GXv_int4) ;
         pxml021.this.GXt_int3 = GXv_int4[0] ;
         AV10OK = GXt_int3 ;
         AV15numr = (int)(AV15numr+1) ;
         Gx_msg = httpContext.getMessage( "Procesando... ", "") + GXutil.str( AV15numr, 6, 0) ;
         System.out.println( Gx_msg );
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Execute user subroutine: 'FIN' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fclose(remoteHandle, context).execute( AV8hnd, GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      System.out.println( httpContext.getMessage( "Informe XML generado", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIO' Routine */
      returnInSub = false ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "<?mso-application progid=\"Excel.Sheet\"?>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "<Workbook xmlns=\"urn:schemas-microsoft-com:office:spreadsheet\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " xmlns:o=\"urn:schemas-microsoft-com:office:office\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " xmlns:x=\"urn:schemas-microsoft-com:office:excel\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " xmlns:ss=\"urn:schemas-microsoft-com:office:spreadsheet\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " xmlns:html=\"http://www.w3.org/TR/REC-html40\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " <DocumentProperties xmlns=\"urn:schemas-microsoft-com:office:office\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <LastAuthor>Usuario</LastAuthor>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <LastPrinted>2017-03-21T17:46:38Z</LastPrinted>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " <Created>2017-03-21T17:45:44Z</Created>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Version>12.00</Version>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " </DocumentProperties>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " <ExcelWorkbook xmlns=\"urn:schemas-microsoft-com:office:excel\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <WindowHeight>10680</WindowHeight>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <WindowWidth>28335</WindowWidth>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <WindowTopX>240</WindowTopX>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <WindowTopY>105</WindowTopY>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <ProtectStructure>False</ProtectStructure>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <ProtectWindows>False</ProtectWindows>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " </ExcelWorkbook>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
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
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "<Styles>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " <Style ss:ID=\"Default\" ss:Name=\"Normal\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Alignment ss:Vertical=\"Bottom\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Borders/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Font ss:FontName=\"Calibri\" x:Family=\"Swiss\" ss:Size=\"11\" ss:Color=\"#000000\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    ss:Bold=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Interior/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <NumberFormat/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Protection/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  </Style>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Style ss:ID=\"s62\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Alignment ss:Horizontal=\"Center\" ss:Vertical=\"Bottom\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Borders>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Bottom\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Left\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Right\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Top\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Borders>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  </Style>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Style ss:ID=\"s63\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Alignment ss:Horizontal=\"Center\" ss:Vertical=\"Bottom\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Borders>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Bottom\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Left\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Right\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Top\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Borders>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Font ss:FontName=\"Calibri\" x:Family=\"Swiss\" ss:Size=\"11\" ss:Color=\"#000000\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  </Style>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " <Style ss:ID=\"s68\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Alignment ss:Horizontal=\"Center\" ss:Vertical=\"Bottom\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Borders>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Bottom\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Left\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Right\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Border ss:Position=\"Top\" ss:LineStyle=\"Continuous\" ss:Weight=\"1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Borders>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Interior ss:Color=\"#FAC090\" ss:Pattern=\"Solid\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  </Style>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " </Styles>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
   }

   public void S131( )
   {
      /* 'TITULOS' Routine */
      returnInSub = false ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "<Worksheet ss:Name=\"Hoja1\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "<Names>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <NamedRange ss:Name=\"Print_Titles\" ss:RefersTo=\"=Hoja1!R1\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "</Names>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Table ss:ExpandedColumnCount=\"50\" ss:ExpandedRowCount=\"100000\" x:FullColumns=\"1\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   x:FullRows=\"1\" ss:DefaultColumnWidth=\"60\" ss:DefaultRowHeight=\"15\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Row ss:AutoFitHeight=\"0\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Nº de Relatorio</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Row>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Row ss:AutoFitHeight=\"0\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Cliente</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"Number\">", "")+GXutil.trim( GXutil.str( AV20Clicod, 6, 0))+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( AV21CliNom)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Row>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Row ss:AutoFitHeight=\"0\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Artigo</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( AV22ArtCod)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( AV23ArtDsc)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Row>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Row ss:AutoFitHeight=\"0\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Observaçoes</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">", "")+GXutil.trim( AV24Mat_ObsG)+httpContext.getMessage( "</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Row>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Row ss:AutoFitHeight=\"0\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Linha</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Codigo</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Cor</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Designaçao</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">Lu</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">NE</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">% Fio</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Cell ss:StyleID=\"s68\"><Data ss:Type=\"String\">N Alimentadores</Data></Cell>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Row>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
   }

   public void S141( )
   {
      /* 'FIN' Routine */
      returnInSub = false ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "</Table>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <WorksheetOptions xmlns=\"urn:schemas-microsoft-com:office:excel\">", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <PageSetup>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Layout x:Orientation=\"Landscape\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  <Header x:Margin=\"0.31496062992125984\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   x:Data=\"&amp;Z", "")+GXutil.trim( AV31Pgmdesc)+httpContext.getMessage( "&amp;C", "")+AV16EmprNom+httpContext.getMessage( "&amp;D&amp;F &amp;H\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Footer x:Margin=\"0.31496062992125984\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "       x:Data=\"&amp;C", "")+GXutil.trim( AV19Filtrostxt)+httpContext.getMessage( "&amp;D&amp;P /&amp;#\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <PageMargins x:Bottom=\"0.74803149606299213\" x:Left=\"0.70866141732283472\"", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    x:Right=\"0.70866141732283472\" x:Top=\"0.74803149606299213\"/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </PageSetup>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Print>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <ValidPrinterInfo/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <PaperSizeIndex>9</PaperSizeIndex>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <Scale>90</Scale>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <HorizontalResolution>300</HorizontalResolution>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "    <VerticalResolution>300</VerticalResolution>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   </Print>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <Selected/>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <ProtectObjects>False</ProtectObjects>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "   <ProtectScenarios>False</ProtectScenarios>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( "  </WorksheetOptions>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " </Worksheet>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
      GXt_int3 = AV10OK ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fputs(remoteHandle, context).execute( AV8hnd, httpContext.getMessage( " </Workbook>", ""), GXv_int4) ;
      pxml021.this.GXt_int3 = GXv_int4[0] ;
      AV10OK = GXt_int3 ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxml021.this.A396EmprCod;
      this.aP1[0] = pxml021.this.AV20Clicod;
      this.aP2[0] = pxml021.this.AV21CliNom;
      this.aP3[0] = pxml021.this.AV22ArtCod;
      this.aP4[0] = pxml021.this.AV23ArtDsc;
      this.aP5[0] = pxml021.this.AV9File;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05512_A396EmprCod = new String[] {""} ;
      P05512_A407EmprNom = new String[] {""} ;
      P05512_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV16EmprNom = "" ;
      P05513_A396EmprCod = new String[] {""} ;
      P05513_A65ArtCod = new String[] {""} ;
      P05513_A252CliCod = new int[1] ;
      P05513_A12353Mat_ObsG = new String[] {""} ;
      P05513_n12353Mat_ObsG = new boolean[] {false} ;
      A65ArtCod = "" ;
      A12353Mat_ObsG = "" ;
      AV24Mat_ObsG = "" ;
      GXv_int2 = new long[1] ;
      P05514_A396EmprCod = new String[] {""} ;
      P05514_A65ArtCod = new String[] {""} ;
      P05514_A252CliCod = new int[1] ;
      P05514_A6954Mat_lin = new short[1] ;
      P05514_A6955Mat_Estr = new String[] {""} ;
      P05514_n6955Mat_Estr = new boolean[] {false} ;
      P05514_A12357Mat_Color = new String[] {""} ;
      P05514_n12357Mat_Color = new boolean[] {false} ;
      P05514_A12356Mat_Dsc = new String[] {""} ;
      P05514_n12356Mat_Dsc = new boolean[] {false} ;
      P05514_A12354Mat_Lu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05514_n12354Mat_Lu = new boolean[] {false} ;
      P05514_A12355Mat_NE = new String[] {""} ;
      P05514_n12355Mat_NE = new boolean[] {false} ;
      P05514_A6962Mat_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05514_n6962Mat_Porc = new boolean[] {false} ;
      P05514_A12358Mat_NAlim = new String[] {""} ;
      A6955Mat_Estr = "" ;
      A12357Mat_Color = "" ;
      A12356Mat_Dsc = "" ;
      A12354Mat_Lu = DecimalUtil.ZERO ;
      A12355Mat_NE = "" ;
      A6962Mat_Porc = DecimalUtil.ZERO ;
      A12358Mat_NAlim = "" ;
      Gx_msg = "" ;
      AV31Pgmdesc = "" ;
      AV19Filtrostxt = "" ;
      GXv_int4 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxml021__default(),
         new Object[] {
             new Object[] {
            P05512_A396EmprCod, P05512_A407EmprNom, P05512_n407EmprNom
            }
            , new Object[] {
            P05513_A396EmprCod, P05513_A65ArtCod, P05513_A252CliCod, P05513_A12353Mat_ObsG, P05513_n12353Mat_ObsG
            }
            , new Object[] {
            P05514_A396EmprCod, P05514_A65ArtCod, P05514_A252CliCod, P05514_A6954Mat_lin, P05514_A6955Mat_Estr, P05514_n6955Mat_Estr, P05514_A12357Mat_Color, P05514_n12357Mat_Color, P05514_A12356Mat_Dsc, P05514_n12356Mat_Dsc,
            P05514_A12354Mat_Lu, P05514_n12354Mat_Lu, P05514_A12355Mat_NE, P05514_n12355Mat_NE, P05514_A6962Mat_Porc, P05514_n6962Mat_Porc, P05514_A12358Mat_NAlim
            }
         }
      );
      AV31Pgmdesc = httpContext.getMessage( "Ficha Tecnica da Malha", "") ;
      /* GeneXus formulas. */
      AV31Pgmdesc = httpContext.getMessage( "Ficha Tecnica da Malha", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV10OK ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private short A6954Mat_lin ;
   private short Gx_err ;
   private int AV20Clicod ;
   private int A252CliCod ;
   private int AV15numr ;
   private long AV8hnd ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private java.math.BigDecimal A12354Mat_Lu ;
   private java.math.BigDecimal A6962Mat_Porc ;
   private String A396EmprCod ;
   private String AV21CliNom ;
   private String AV22ArtCod ;
   private String AV23ArtDsc ;
   private String AV9File ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV16EmprNom ;
   private String A65ArtCod ;
   private String A6955Mat_Estr ;
   private String A12357Mat_Color ;
   private String A12355Mat_NE ;
   private String A12358Mat_NAlim ;
   private String Gx_msg ;
   private String AV31Pgmdesc ;
   private String AV19Filtrostxt ;
   private boolean n407EmprNom ;
   private boolean n12353Mat_ObsG ;
   private boolean Cond_result ;
   private boolean returnInSub ;
   private boolean n6955Mat_Estr ;
   private boolean n12357Mat_Color ;
   private boolean n12356Mat_Dsc ;
   private boolean n12354Mat_Lu ;
   private boolean n12355Mat_NE ;
   private boolean n6962Mat_Porc ;
   private String A12353Mat_ObsG ;
   private String AV24Mat_ObsG ;
   private String A12356Mat_Dsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05512_A396EmprCod ;
   private String[] P05512_A407EmprNom ;
   private boolean[] P05512_n407EmprNom ;
   private String[] P05513_A396EmprCod ;
   private String[] P05513_A65ArtCod ;
   private int[] P05513_A252CliCod ;
   private String[] P05513_A12353Mat_ObsG ;
   private boolean[] P05513_n12353Mat_ObsG ;
   private String[] P05514_A396EmprCod ;
   private String[] P05514_A65ArtCod ;
   private int[] P05514_A252CliCod ;
   private short[] P05514_A6954Mat_lin ;
   private String[] P05514_A6955Mat_Estr ;
   private boolean[] P05514_n6955Mat_Estr ;
   private String[] P05514_A12357Mat_Color ;
   private boolean[] P05514_n12357Mat_Color ;
   private String[] P05514_A12356Mat_Dsc ;
   private boolean[] P05514_n12356Mat_Dsc ;
   private java.math.BigDecimal[] P05514_A12354Mat_Lu ;
   private boolean[] P05514_n12354Mat_Lu ;
   private String[] P05514_A12355Mat_NE ;
   private boolean[] P05514_n12355Mat_NE ;
   private java.math.BigDecimal[] P05514_A6962Mat_Porc ;
   private boolean[] P05514_n6962Mat_Porc ;
   private String[] P05514_A12358Mat_NAlim ;
}

final  class pxml021__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05512", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05513", "SELECT EmprCod, ArtCod, CliCod, Mat_ObsG FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05514", "SELECT EmprCod, ArtCod, CliCod, Mat_lin, Mat_Estr, Mat_Color, Mat_Dsc, Mat_Lu, Mat_NE, Mat_Porc, Mat_NAlim FROM TXPARTMAT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

