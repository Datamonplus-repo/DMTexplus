package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rindetiqueta extends GXReport
{
   public rindetiqueta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rindetiqueta.class ), "" );
   }

   public rindetiqueta( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 )
   {
      rindetiqueta.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 )
   {
      rindetiqueta.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rindetiqueta.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rindetiqueta.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rindetiqueta.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rindetiqueta.this.AV8BarPieCod = aP4[0];
      this.aP4 = aP4;
      rindetiqueta.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      rindetiqueta.this.AV14Bartrocal = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 256, 4406, 5947, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Etiqueta 105mm x 770mm") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV19vxlotid = (int)(GXutil.lval( AV8BarPieCod)) ;
         AV20vxrapcod = 0 ;
         AV21vxrapdsc = "" ;
         /* Using cursor P07UH2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV19vxlotid)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A6224VxLotId = P07UH2_A6224VxLotId[0] ;
            A7550VxRapCod = P07UH2_A7550VxRapCod[0] ;
            n7550VxRapCod = P07UH2_n7550VxRapCod[0] ;
            AV20vxrapcod = A7550VxRapCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV20vxrapcod != 0 )
         {
            /* Using cursor P07UH3 */
            pr_default.execute(1, new Object[] {Integer.valueOf(AV20vxrapcod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A7550VxRapCod = P07UH3_A7550VxRapCod[0] ;
               n7550VxRapCod = P07UH3_n7550VxRapCod[0] ;
               A7551VxRapDsc = P07UH3_A7551VxRapDsc[0] ;
               n7551VxRapDsc = P07UH3_n7551VxRapDsc[0] ;
               AV21vxrapdsc = A7551VxRapDsc ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
         AV15Calidad = httpContext.getMessage( "A", "") ;
         if ( AV14Bartrocal == 2 )
         {
            AV15Calidad = httpContext.getMessage( "B", "") ;
         }
         AV15Calidad = ((AV14Bartrocal==1) ? httpContext.getMessage( "A", "") : ((AV14Bartrocal==2) ? httpContext.getMessage( "B", "") : httpContext.getMessage( "C", ""))) ;
         /* Using cursor P07UH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV8BarPieCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A200BarPieCod = P07UH4_A200BarPieCod[0] ;
            A1691BarPieAnc = P07UH4_A1691BarPieAnc[0] ;
            n1691BarPieAnc = P07UH4_n1691BarPieAnc[0] ;
            A212BarSer = P07UH4_A212BarSer[0] ;
            A8707BapieObs = P07UH4_A8707BapieObs[0] ;
            n8707BapieObs = P07UH4_n8707BapieObs[0] ;
            A1642BarPieOrd = P07UH4_A1642BarPieOrd[0] ;
            n1642BarPieOrd = P07UH4_n1642BarPieOrd[0] ;
            A135BarColNom = P07UH4_A135BarColNom[0] ;
            A3276BarMtsAut = P07UH4_A3276BarMtsAut[0] ;
            n3276BarMtsAut = P07UH4_n3276BarMtsAut[0] ;
            A3275BarKgsAut = P07UH4_A3275BarKgsAut[0] ;
            n3275BarKgsAut = P07UH4_n3275BarKgsAut[0] ;
            A3595BarMacCod = P07UH4_A3595BarMacCod[0] ;
            A1652BarSerDsc = P07UH4_A1652BarSerDsc[0] ;
            A212BarSer = P07UH4_A212BarSer[0] ;
            A135BarColNom = P07UH4_A135BarColNom[0] ;
            A3595BarMacCod = P07UH4_A3595BarMacCod[0] ;
            A1652BarSerDsc = P07UH4_A1652BarSerDsc[0] ;
            AV16barPieAnc = GXutil.str( A1691BarPieAnc, 3, 0) ;
            AV16barPieAnc += " " + httpContext.getMessage( "cm", "") ;
            AV18BarSer_12 = GXutil.substring( A212BarSer, 1, 12) ;
            AV9PieCod = "*" + AV8BarPieCod + "*" ;
            AV22Bapieobs = A8707BapieObs ;
            AV24Aux1 = GXutil.trim( GXutil.str( A1642BarPieOrd, 8, 0)) ;
            AV25Aux2 = (byte)(GXutil.lval( GXutil.substring( AV24Aux1, 1, 2))) ;
            h7UH0( false, 302) ;
            getPrinter().GxAttris("Tahoma", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21vxrapdsc, "")), 248, Gx_line+170, 371, Gx_line+189, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(16, Gx_line+236, 370, Gx_line+276, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9PieCod, "")), 146, Gx_line+46, 365, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9PieCod, "")), 215, Gx_line+120, 296, Gx_line+138, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9PieCod, "")), 146, Gx_line+58, 365, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9PieCod, "")), 146, Gx_line+73, 365, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9PieCod, "")), 146, Gx_line+89, 365, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 28, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Calidad, "")), 60, Gx_line+18, 95, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 29, Gx_line+80, 115, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18BarSer_12, "")), 26, Gx_line+143, 115, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 149, Gx_line+143, 340, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANCHO:", ""), 19, Gx_line+169, 83, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16barPieAnc, "")), 82, Gx_line+169, 138, Gx_line+189, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LOTE:", ""), 19, Gx_line+190, 66, Gx_line+209, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3595BarMacCod), "ZZZZZZZ9")), 19, Gx_line+208, 87, Gx_line+228, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PESO:", ""), 150, Gx_line+190, 199, Gx_line+209, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3275BarKgsAut, "ZZZZZ9.99")), 150, Gx_line+209, 226, Gx_line+229, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "METROS:", ""), 273, Gx_line+190, 346, Gx_line+209, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3276BarMtsAut, "ZZZZZ9.99")), 273, Gx_line+209, 349, Gx_line+229, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(142, Gx_line+2, 142, Gx_line+232, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+191, 378, Gx_line+191, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(267, Gx_line+185, 267, Gx_line+232, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+164, 143, Gx_line+164, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+139, 378, Gx_line+139, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 148, Gx_line+170, 244, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+72, 143, Gx_line+72, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+231, 378, Gx_line+231, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "EN CASO DE INCONFORMIDAD NO CORTAR LA TELA", ""), 27, Gx_line+240, 355, Gx_line+254, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Y DEVOLVERLA CON ESTA ETIQUETA", ""), 74, Gx_line+258, 309, Gx_line+272, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 242, Gx_line+211, 260, Gx_line+226, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hecho en Ecuador", ""), 274, Gx_line+282, 379, Gx_line+296, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 22, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "INDUTEXMA", ""), 147, Gx_line+5, 337, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(11, Gx_line+1, 378, Gx_line+280, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Bapieobs, "")), 13, Gx_line+281, 269, Gx_line+298, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25Aux2), "Z9")), 103, Gx_line+29, 125, Gx_line+54, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+302) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7UH0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7UH0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = rindetiqueta.this.A396EmprCod;
      this.aP1[0] = rindetiqueta.this.A129BarCod;
      this.aP2[0] = rindetiqueta.this.A132BarCodReo;
      this.aP3[0] = rindetiqueta.this.A130BarCodPar;
      this.aP4[0] = rindetiqueta.this.AV8BarPieCod;
      this.aP5[0] = rindetiqueta.this.Gx_out;
      this.aP6[0] = rindetiqueta.this.AV14Bartrocal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21vxrapdsc = "" ;
      scmdbuf = "" ;
      P07UH2_A6224VxLotId = new int[1] ;
      P07UH2_A7550VxRapCod = new int[1] ;
      P07UH2_n7550VxRapCod = new boolean[] {false} ;
      P07UH3_A7550VxRapCod = new int[1] ;
      P07UH3_n7550VxRapCod = new boolean[] {false} ;
      P07UH3_A7551VxRapDsc = new String[] {""} ;
      P07UH3_n7551VxRapDsc = new boolean[] {false} ;
      A7551VxRapDsc = "" ;
      AV15Calidad = "" ;
      P07UH4_A396EmprCod = new String[] {""} ;
      P07UH4_A129BarCod = new int[1] ;
      P07UH4_A132BarCodReo = new byte[1] ;
      P07UH4_A130BarCodPar = new String[] {""} ;
      P07UH4_A200BarPieCod = new String[] {""} ;
      P07UH4_A1691BarPieAnc = new short[1] ;
      P07UH4_n1691BarPieAnc = new boolean[] {false} ;
      P07UH4_A212BarSer = new String[] {""} ;
      P07UH4_A8707BapieObs = new String[] {""} ;
      P07UH4_n8707BapieObs = new boolean[] {false} ;
      P07UH4_A1642BarPieOrd = new int[1] ;
      P07UH4_n1642BarPieOrd = new boolean[] {false} ;
      P07UH4_A135BarColNom = new String[] {""} ;
      P07UH4_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07UH4_n3276BarMtsAut = new boolean[] {false} ;
      P07UH4_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07UH4_n3275BarKgsAut = new boolean[] {false} ;
      P07UH4_A3595BarMacCod = new int[1] ;
      P07UH4_A1652BarSerDsc = new String[] {""} ;
      A200BarPieCod = "" ;
      A212BarSer = "" ;
      A8707BapieObs = "" ;
      A135BarColNom = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      AV16barPieAnc = "" ;
      AV18BarSer_12 = "" ;
      AV9PieCod = "" ;
      AV22Bapieobs = "" ;
      AV24Aux1 = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rindetiqueta__default(),
         new Object[] {
             new Object[] {
            P07UH2_A6224VxLotId, P07UH2_A7550VxRapCod, P07UH2_n7550VxRapCod
            }
            , new Object[] {
            P07UH3_A7550VxRapCod, P07UH3_A7551VxRapDsc, P07UH3_n7551VxRapDsc
            }
            , new Object[] {
            P07UH4_A396EmprCod, P07UH4_A129BarCod, P07UH4_A132BarCodReo, P07UH4_A130BarCodPar, P07UH4_A200BarPieCod, P07UH4_A1691BarPieAnc, P07UH4_n1691BarPieAnc, P07UH4_A212BarSer, P07UH4_A8707BapieObs, P07UH4_n8707BapieObs,
            P07UH4_A1642BarPieOrd, P07UH4_n1642BarPieOrd, P07UH4_A135BarColNom, P07UH4_A3276BarMtsAut, P07UH4_n3276BarMtsAut, P07UH4_A3275BarKgsAut, P07UH4_n3275BarKgsAut, P07UH4_A3595BarMacCod, P07UH4_A1652BarSerDsc
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV14Bartrocal ;
   private byte AV25Aux2 ;
   private short A1691BarPieAnc ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV19vxlotid ;
   private int AV20vxrapcod ;
   private int A6224VxLotId ;
   private int A7550VxRapCod ;
   private int A1642BarPieOrd ;
   private int A3595BarMacCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarPieCod ;
   private String Gx_out ;
   private String AV21vxrapdsc ;
   private String scmdbuf ;
   private String A7551VxRapDsc ;
   private String AV15Calidad ;
   private String A200BarPieCod ;
   private String A212BarSer ;
   private String A8707BapieObs ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String AV16barPieAnc ;
   private String AV18BarSer_12 ;
   private String AV9PieCod ;
   private String AV22Bapieobs ;
   private String AV24Aux1 ;
   private java.util.Date Gx_date ;
   private boolean n7550VxRapCod ;
   private boolean n7551VxRapDsc ;
   private boolean n1691BarPieAnc ;
   private boolean n8707BapieObs ;
   private boolean n1642BarPieOrd ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P07UH2_A6224VxLotId ;
   private int[] P07UH2_A7550VxRapCod ;
   private boolean[] P07UH2_n7550VxRapCod ;
   private int[] P07UH3_A7550VxRapCod ;
   private boolean[] P07UH3_n7550VxRapCod ;
   private String[] P07UH3_A7551VxRapDsc ;
   private boolean[] P07UH3_n7551VxRapDsc ;
   private String[] P07UH4_A396EmprCod ;
   private int[] P07UH4_A129BarCod ;
   private byte[] P07UH4_A132BarCodReo ;
   private String[] P07UH4_A130BarCodPar ;
   private String[] P07UH4_A200BarPieCod ;
   private short[] P07UH4_A1691BarPieAnc ;
   private boolean[] P07UH4_n1691BarPieAnc ;
   private String[] P07UH4_A212BarSer ;
   private String[] P07UH4_A8707BapieObs ;
   private boolean[] P07UH4_n8707BapieObs ;
   private int[] P07UH4_A1642BarPieOrd ;
   private boolean[] P07UH4_n1642BarPieOrd ;
   private String[] P07UH4_A135BarColNom ;
   private java.math.BigDecimal[] P07UH4_A3276BarMtsAut ;
   private boolean[] P07UH4_n3276BarMtsAut ;
   private java.math.BigDecimal[] P07UH4_A3275BarKgsAut ;
   private boolean[] P07UH4_n3275BarKgsAut ;
   private int[] P07UH4_A3595BarMacCod ;
   private String[] P07UH4_A1652BarSerDsc ;
}

final  class rindetiqueta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07UH2", "SELECT STeLotId, RapCod FROM VTXSTKTE WHERE STeLotId = ? ORDER BY STeLotId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07UH3", "SELECT rapcod, rapdsc FROM VTXRAPPORT WHERE rapcod = ? ORDER BY rapcod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07UH4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarPieAnc, T2.BarSer, T1.BapieObs, T1.BarPieOrd, T2.BarColNom, T1.BarMtsAut, T1.BarKgsAut, T2.BarMacCod, T2.BarSerDsc FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 26);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

