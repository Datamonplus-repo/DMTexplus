package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pncacabatsotras extends GXReport
{
   public pncacabatsotras( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pncacabatsotras.class ), "" );
   }

   public pncacabatsotras( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pncacabatsotras.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pncacabatsotras.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pncacabatsotras.this.A13161NCNumero = aP1[0];
      this.aP1 = aP1;
      pncacabatsotras.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 12 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("No Conformidad, otras") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*12)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P05RQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05RQ2_A407EmprNom[0] ;
            n407EmprNom = P05RQ2_n407EmprNom[0] ;
            AV8Emprnom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P05RQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n13161NCNumero), Integer.valueOf(A13161NCNumero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P05RQ3_A252CliCod[0] ;
            n252CliCod = P05RQ3_n252CliCod[0] ;
            A833TipDefCod = P05RQ3_A833TipDefCod[0] ;
            n833TipDefCod = P05RQ3_n833TipDefCod[0] ;
            A13152NCAcCo = P05RQ3_A13152NCAcCo[0] ;
            n13152NCAcCo = P05RQ3_n13152NCAcCo[0] ;
            A13153NCAcCoT = P05RQ3_A13153NCAcCoT[0] ;
            n13153NCAcCoT = P05RQ3_n13153NCAcCoT[0] ;
            A13151NCObs = P05RQ3_A13151NCObs[0] ;
            n13151NCObs = P05RQ3_n13151NCObs[0] ;
            A13148NCOperario = P05RQ3_A13148NCOperario[0] ;
            n13148NCOperario = P05RQ3_n13148NCOperario[0] ;
            A13150NCOperaFir = P05RQ3_A13150NCOperaFir[0] ;
            n13150NCOperaFir = P05RQ3_n13150NCOperaFir[0] ;
            A279CliNom = P05RQ3_A279CliNom[0] ;
            A834TipDefDsc = P05RQ3_A834TipDefDsc[0] ;
            n834TipDefDsc = P05RQ3_n834TipDefDsc[0] ;
            A13140NCArticulo = P05RQ3_A13140NCArticulo[0] ;
            n13140NCArticulo = P05RQ3_n13140NCArticulo[0] ;
            A13141NCArtDsc = P05RQ3_A13141NCArtDsc[0] ;
            n13141NCArtDsc = P05RQ3_n13141NCArtDsc[0] ;
            A13138NCHdrr = P05RQ3_A13138NCHdrr[0] ;
            A13139NCHdrp = P05RQ3_A13139NCHdrp[0] ;
            A13137NCHdr = P05RQ3_A13137NCHdr[0] ;
            A602MaqCod = P05RQ3_A602MaqCod[0] ;
            n602MaqCod = P05RQ3_n602MaqCod[0] ;
            A13156NCMtsCarg = P05RQ3_A13156NCMtsCarg[0] ;
            n13156NCMtsCarg = P05RQ3_n13156NCMtsCarg[0] ;
            A13157NCImpCarg = P05RQ3_A13157NCImpCarg[0] ;
            n13157NCImpCarg = P05RQ3_n13157NCImpCarg[0] ;
            A279CliNom = P05RQ3_A279CliNom[0] ;
            A834TipDefDsc = P05RQ3_A834TipDefDsc[0] ;
            n834TipDefDsc = P05RQ3_n834TipDefDsc[0] ;
            if ( A13156NCMtsCarg.doubleValue() > 0 )
            {
               A13163NCPrecioCa = GXutil.roundDecimal( A13157NCImpCarg.divide(A13156NCMtsCarg, 18, java.math.RoundingMode.DOWN), 3) ;
            }
            else
            {
               if ( true )
               {
                  A13163NCPrecioCa = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A13163NCPrecioCa = DecimalUtil.doubleToDec(0) ;
               }
            }
            AV9ACCO = GXutil.trim( A13152NCAcCo) ;
            AV10ACCOT = GXutil.trim( A13153NCAcCoT) ;
            AV11HISADEOBS = GXutil.trim( A13151NCObs) ;
            GXt_char1 = AV12Openom1 ;
            GXv_char2[0] = GXt_char1 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A13148NCOperario, GXv_char2) ;
            pncacabatsotras.this.GXt_char1 = GXv_char2[0] ;
            AV12Openom1 = GXt_char1 ;
            AV12Openom1 = ((A13148NCOperario==0) ? "" : AV12Openom1) ;
            GXt_char1 = AV13OpeNom2 ;
            GXv_char2[0] = GXt_char1 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A13150NCOperaFir, GXv_char2) ;
            pncacabatsotras.this.GXt_char1 = GXv_char2[0] ;
            AV13OpeNom2 = GXt_char1 ;
            AV13OpeNom2 = ((A13150NCOperaFir==0) ? "" : AV13OpeNom2) ;
            AV15TitPrecio = "(" + GXutil.str( A13163NCPrecioCa, 13, 3) + httpContext.getMessage( " €/Mt)", "") ;
            h5RQ0( false, 101) ;
            getPrinter().GxAttris("Calibri", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Emprnom, "")), 27, Gx_line+14, 372, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora:", ""), 571, Gx_line+70, 622, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE:", ""), 27, Gx_line+68, 83, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 95, Gx_line+68, 346, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº NC:", ""), 609, Gx_line+41, 654, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13161NCNumero), "ZZZZZ9")), 664, Gx_line+41, 709, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+95, 773, Gx_line+95, 3, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 681, Gx_line+70, 774, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 628, Gx_line+70, 677, Gx_line+86, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NO CONFORMIDAD", ""), 615, Gx_line+19, 741, Gx_line+38, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+101) ;
            h5RQ0( false, 217) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº HDR:", ""), 54, Gx_line+14, 107, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13137NCHdr), "ZZZZZZZ9")), 122, Gx_line+14, 181, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13139NCHdrp, "")), 203, Gx_line+14, 218, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13138NCHdrr), "9")), 190, Gx_line+14, 198, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo:", ""), 54, Gx_line+41, 110, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13141NCArtDsc, "")), 257, Gx_line+41, 475, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13140NCArticulo, "")), 122, Gx_line+41, 256, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Incidencia:", ""), 41, Gx_line+149, 190, Gx_line+168, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 41, Gx_line+176, 292, Gx_line+196, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+203, 773, Gx_line+203, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Revision", ""), 569, Gx_line+95, 625, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(570, Gx_line+117, 774, Gx_line+190, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Firma", ""), 583, Gx_line+116, 620, Gx_line+135, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 732, Gx_line+117, 762, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 583, Gx_line+170, 637, Gx_line+189, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros Cargo:", ""), 597, Gx_line+34, 689, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Importe:", ""), 597, Gx_line+55, 654, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13156NCMtsCarg, "ZZZZZ9.99")), 705, Gx_line+34, 772, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15TitPrecio, "")), 646, Gx_line+76, 772, Gx_line+96, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13157NCImpCarg, "ZZZZZZZZZZ9.99")), 669, Gx_line+55, 772, Gx_line+75, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+217) ;
            h5RQ0( false, 244) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Informacion a Fabrica", ""), 27, Gx_line+13, 166, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV9ACCO, 27, Gx_line+40, 544, Gx_line+110, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 27, Gx_line+134, 85, Gx_line+153, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 122, Gx_line+134, 204, Gx_line+154, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 27, Gx_line+161, 85, Gx_line+180, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Openom1, "")), 122, Gx_line+161, 373, Gx_line+181, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsable", ""), 27, Gx_line+202, 110, Gx_line+221, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13OpeNom2, "")), 122, Gx_line+202, 373, Gx_line+222, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Revision", ""), 568, Gx_line+10, 624, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(569, Gx_line+32, 773, Gx_line+105, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Firma", ""), 582, Gx_line+31, 619, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 731, Gx_line+32, 761, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 582, Gx_line+85, 636, Gx_line+104, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Revision", ""), 568, Gx_line+121, 624, Gx_line+140, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(569, Gx_line+143, 773, Gx_line+216, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Firma", ""), 582, Gx_line+142, 619, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 731, Gx_line+143, 761, Gx_line+162, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 582, Gx_line+196, 636, Gx_line+215, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+244) ;
            h5RQ0( false, 122) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Conclusion de Fabrica", ""), 27, Gx_line+14, 168, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV10ACCOT, 27, Gx_line+34, 522, Gx_line+118, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Revision", ""), 568, Gx_line+18, 624, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(569, Gx_line+40, 773, Gx_line+113, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Firma", ""), 582, Gx_line+39, 619, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 731, Gx_line+40, 761, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 582, Gx_line+93, 636, Gx_line+112, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+122) ;
            h5RQ0( false, 122) ;
            getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 27, Gx_line+14, 123, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV11HISADEOBS, 27, Gx_line+41, 740, Gx_line+115, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+122) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5RQ0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h5RQ0( boolean bFoot ,
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
               getPrinter().GxDrawLine(14, Gx_line+0, 773, Gx_line+0, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Recepcion Delegados", ""), 41, Gx_line+14, 180, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Revision Direccion", ""), 488, Gx_line+14, 608, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(41, Gx_line+41, 313, Gx_line+137, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Firma", ""), 54, Gx_line+54, 91, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 271, Gx_line+54, 301, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 54, Gx_line+108, 108, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(488, Gx_line+41, 760, Gx_line+137, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Firma", ""), 501, Gx_line+54, 538, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 718, Gx_line+54, 748, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 501, Gx_line+108, 555, Gx_line+127, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+149) ;
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
      this.aP0[0] = pncacabatsotras.this.A396EmprCod;
      this.aP1[0] = pncacabatsotras.this.A13161NCNumero;
      this.aP2[0] = pncacabatsotras.this.Gx_out;
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
      P05RQ2_A396EmprCod = new String[] {""} ;
      P05RQ2_A407EmprNom = new String[] {""} ;
      P05RQ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8Emprnom = "" ;
      P05RQ3_A252CliCod = new int[1] ;
      P05RQ3_n252CliCod = new boolean[] {false} ;
      P05RQ3_A833TipDefCod = new short[1] ;
      P05RQ3_n833TipDefCod = new boolean[] {false} ;
      P05RQ3_A396EmprCod = new String[] {""} ;
      P05RQ3_A13161NCNumero = new int[1] ;
      P05RQ3_n13161NCNumero = new boolean[] {false} ;
      P05RQ3_A13152NCAcCo = new String[] {""} ;
      P05RQ3_n13152NCAcCo = new boolean[] {false} ;
      P05RQ3_A13153NCAcCoT = new String[] {""} ;
      P05RQ3_n13153NCAcCoT = new boolean[] {false} ;
      P05RQ3_A13151NCObs = new String[] {""} ;
      P05RQ3_n13151NCObs = new boolean[] {false} ;
      P05RQ3_A13148NCOperario = new int[1] ;
      P05RQ3_n13148NCOperario = new boolean[] {false} ;
      P05RQ3_A13150NCOperaFir = new int[1] ;
      P05RQ3_n13150NCOperaFir = new boolean[] {false} ;
      P05RQ3_A279CliNom = new String[] {""} ;
      P05RQ3_A834TipDefDsc = new String[] {""} ;
      P05RQ3_n834TipDefDsc = new boolean[] {false} ;
      P05RQ3_A13140NCArticulo = new String[] {""} ;
      P05RQ3_n13140NCArticulo = new boolean[] {false} ;
      P05RQ3_A13141NCArtDsc = new String[] {""} ;
      P05RQ3_n13141NCArtDsc = new boolean[] {false} ;
      P05RQ3_A13138NCHdrr = new byte[1] ;
      P05RQ3_A13139NCHdrp = new String[] {""} ;
      P05RQ3_A13137NCHdr = new int[1] ;
      P05RQ3_A602MaqCod = new String[] {""} ;
      P05RQ3_n602MaqCod = new boolean[] {false} ;
      P05RQ3_A13156NCMtsCarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RQ3_n13156NCMtsCarg = new boolean[] {false} ;
      P05RQ3_A13157NCImpCarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RQ3_n13157NCImpCarg = new boolean[] {false} ;
      A13152NCAcCo = "" ;
      A13153NCAcCoT = "" ;
      A13151NCObs = "" ;
      A279CliNom = "" ;
      A834TipDefDsc = "" ;
      A13140NCArticulo = "" ;
      A13141NCArtDsc = "" ;
      A13139NCHdrp = "" ;
      A602MaqCod = "" ;
      A13156NCMtsCarg = DecimalUtil.ZERO ;
      A13157NCImpCarg = DecimalUtil.ZERO ;
      A13163NCPrecioCa = DecimalUtil.ZERO ;
      AV9ACCO = "" ;
      AV10ACCOT = "" ;
      AV11HISADEOBS = "" ;
      AV12Openom1 = "" ;
      AV13OpeNom2 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV15TitPrecio = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pncacabatsotras__default(),
         new Object[] {
             new Object[] {
            P05RQ2_A396EmprCod, P05RQ2_A407EmprNom, P05RQ2_n407EmprNom
            }
            , new Object[] {
            P05RQ3_A252CliCod, P05RQ3_n252CliCod, P05RQ3_A833TipDefCod, P05RQ3_n833TipDefCod, P05RQ3_A396EmprCod, P05RQ3_A13161NCNumero, P05RQ3_n13161NCNumero, P05RQ3_A13152NCAcCo, P05RQ3_n13152NCAcCo, P05RQ3_A13153NCAcCoT,
            P05RQ3_n13153NCAcCoT, P05RQ3_A13151NCObs, P05RQ3_n13151NCObs, P05RQ3_A13148NCOperario, P05RQ3_n13148NCOperario, P05RQ3_A13150NCOperaFir, P05RQ3_n13150NCOperaFir, P05RQ3_A279CliNom, P05RQ3_A834TipDefDsc, P05RQ3_n834TipDefDsc,
            P05RQ3_A13140NCArticulo, P05RQ3_n13140NCArticulo, P05RQ3_A13141NCArtDsc, P05RQ3_n13141NCArtDsc, P05RQ3_A13138NCHdrr, P05RQ3_A13139NCHdrp, P05RQ3_A13137NCHdr, P05RQ3_A602MaqCod, P05RQ3_n602MaqCod, P05RQ3_A13156NCMtsCarg,
            P05RQ3_n13156NCMtsCarg, P05RQ3_A13157NCImpCarg, P05RQ3_n13157NCImpCarg
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A13138NCHdrr ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int A13161NCNumero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A13148NCOperario ;
   private int A13150NCOperaFir ;
   private int A13137NCHdr ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A13156NCMtsCarg ;
   private java.math.BigDecimal A13157NCImpCarg ;
   private java.math.BigDecimal A13163NCPrecioCa ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8Emprnom ;
   private String A279CliNom ;
   private String A834TipDefDsc ;
   private String A13140NCArticulo ;
   private String A13141NCArtDsc ;
   private String A13139NCHdrp ;
   private String A602MaqCod ;
   private String AV12Openom1 ;
   private String AV13OpeNom2 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV15TitPrecio ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n13161NCNumero ;
   private boolean n252CliCod ;
   private boolean n833TipDefCod ;
   private boolean n13152NCAcCo ;
   private boolean n13153NCAcCoT ;
   private boolean n13151NCObs ;
   private boolean n13148NCOperario ;
   private boolean n13150NCOperaFir ;
   private boolean n834TipDefDsc ;
   private boolean n13140NCArticulo ;
   private boolean n13141NCArtDsc ;
   private boolean n602MaqCod ;
   private boolean n13156NCMtsCarg ;
   private boolean n13157NCImpCarg ;
   private String AV9ACCO ;
   private String AV10ACCOT ;
   private String AV11HISADEOBS ;
   private String A13152NCAcCo ;
   private String A13153NCAcCoT ;
   private String A13151NCObs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05RQ2_A396EmprCod ;
   private String[] P05RQ2_A407EmprNom ;
   private boolean[] P05RQ2_n407EmprNom ;
   private int[] P05RQ3_A252CliCod ;
   private boolean[] P05RQ3_n252CliCod ;
   private short[] P05RQ3_A833TipDefCod ;
   private boolean[] P05RQ3_n833TipDefCod ;
   private String[] P05RQ3_A396EmprCod ;
   private int[] P05RQ3_A13161NCNumero ;
   private boolean[] P05RQ3_n13161NCNumero ;
   private String[] P05RQ3_A13152NCAcCo ;
   private boolean[] P05RQ3_n13152NCAcCo ;
   private String[] P05RQ3_A13153NCAcCoT ;
   private boolean[] P05RQ3_n13153NCAcCoT ;
   private String[] P05RQ3_A13151NCObs ;
   private boolean[] P05RQ3_n13151NCObs ;
   private int[] P05RQ3_A13148NCOperario ;
   private boolean[] P05RQ3_n13148NCOperario ;
   private int[] P05RQ3_A13150NCOperaFir ;
   private boolean[] P05RQ3_n13150NCOperaFir ;
   private String[] P05RQ3_A279CliNom ;
   private String[] P05RQ3_A834TipDefDsc ;
   private boolean[] P05RQ3_n834TipDefDsc ;
   private String[] P05RQ3_A13140NCArticulo ;
   private boolean[] P05RQ3_n13140NCArticulo ;
   private String[] P05RQ3_A13141NCArtDsc ;
   private boolean[] P05RQ3_n13141NCArtDsc ;
   private byte[] P05RQ3_A13138NCHdrr ;
   private String[] P05RQ3_A13139NCHdrp ;
   private int[] P05RQ3_A13137NCHdr ;
   private String[] P05RQ3_A602MaqCod ;
   private boolean[] P05RQ3_n602MaqCod ;
   private java.math.BigDecimal[] P05RQ3_A13156NCMtsCarg ;
   private boolean[] P05RQ3_n13156NCMtsCarg ;
   private java.math.BigDecimal[] P05RQ3_A13157NCImpCarg ;
   private boolean[] P05RQ3_n13157NCImpCarg ;
}

final  class pncacabatsotras__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05RQ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05RQ3", "SELECT T1.CliCod, T1.TipDefCod, T1.EmprCod, T1.NCNumero, T1.NCAcCo, T1.NCAcCoT, T1.NCObs, T1.NCOperario, T1.NCOperaFir, T2.CliNom, T3.TipDefDsc, T1.NCArticulo, T1.NCArtDsc, T1.NCHdrr, T1.NCHdrp, T1.NCHdr, T1.MaqCod, T1.NCMtsCarg, T1.NCImpCarg FROM ((TXPNOCONF T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.NCNumero = ? ORDER BY T1.EmprCod, T1.NCNumero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((String[]) buf[18])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((String[]) buf[25])[0] = rslt.getString(15, 1);
               ((int[]) buf[26])[0] = rslt.getInt(16);
               ((String[]) buf[27])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

