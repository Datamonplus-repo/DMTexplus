package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pldipserzedelo extends GXReport
{
   public pldipserzedelo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pldipserzedelo.class ), "" );
   }

   public pldipserzedelo( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pldipserzedelo.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pldipserzedelo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pldipserzedelo.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 2 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Lab DIP") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV10ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char1) ;
         pldipserzedelo.this.AV10ContDsc = GXv_char1[0] ;
         GxHdr2 = true ;
         /* Using cursor P05KJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5533Lb_ArtCod = P05KJ2_A5533Lb_ArtCod[0] ;
            A5541Lb_FechaE = P05KJ2_A5541Lb_FechaE[0] ;
            A5536Lb_ColNom = P05KJ2_A5536Lb_ColNom[0] ;
            A279CliNom = P05KJ2_A279CliNom[0] ;
            A252CliCod = P05KJ2_A252CliCod[0] ;
            A279CliNom = P05KJ2_A279CliNom[0] ;
            AV11NumOpciones = (short)(0) ;
            AV9NumLineas = (short)(0) ;
            /* Using cursor P05KJ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5555Lb_opcion = P05KJ3_A5555Lb_opcion[0] ;
               A5556Lb_UltLC = P05KJ3_A5556Lb_UltLC[0] ;
               if ( AV11NumOpciones == 3 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV11NumOpciones = (short)(0) ;
               }
               /* Using cursor P05KJ4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A490ForPrdUMe = P05KJ4_A490ForPrdUMe[0] ;
                  A488ForPrdDsc = P05KJ4_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P05KJ4_n488ForPrdDsc[0] ;
                  A5558LB_CantC = P05KJ4_A5558LB_CantC[0] ;
                  A718PrdNom = P05KJ4_A718PrdNom[0] ;
                  A719PrdNum = P05KJ4_A719PrdNum[0] ;
                  A5557Lb_LineaC = P05KJ4_A5557Lb_LineaC[0] ;
                  A718PrdNom = P05KJ4_A718PrdNom[0] ;
                  A488ForPrdDsc = P05KJ4_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P05KJ4_n488ForPrdDsc[0] ;
                  if ( AV9NumLineas == 0 )
                  {
                     h5KJ0( false, 23) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+4, 111, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 117, Gx_line+4, 308, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5558LB_CantC, "ZZZZ9.99999")), 365, Gx_line+4, 446, Gx_line+22, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 452, Gx_line+4, 489, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(51, Gx_line+0, 51, Gx_line+22, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(328, Gx_line+0, 328, Gx_line+24, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(547, Gx_line+0, 547, Gx_line+24, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(809, Gx_line+0, 809, Gx_line+24, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(51, Gx_line+0, 548, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(547, Gx_line+0, 811, Gx_line+0, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+23) ;
                  }
                  else
                  {
                     h5KJ0( false, 23) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+4, 111, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 117, Gx_line+4, 308, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5558LB_CantC, "ZZZZ9.99999")), 365, Gx_line+4, 446, Gx_line+22, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 452, Gx_line+4, 489, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(51, Gx_line+0, 51, Gx_line+22, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(328, Gx_line+0, 328, Gx_line+24, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(547, Gx_line+0, 547, Gx_line+24, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(809, Gx_line+0, 809, Gx_line+24, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(51, Gx_line+0, 548, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+23) ;
                  }
                  AV9NumLineas = (short)(AV9NumLineas+1) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               /* Using cursor P05KJ5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A490ForPrdUMe = P05KJ5_A490ForPrdUMe[0] ;
                  A488ForPrdDsc = P05KJ5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P05KJ5_n488ForPrdDsc[0] ;
                  A5561LB_CantP = P05KJ5_A5561LB_CantP[0] ;
                  A718PrdNom = P05KJ5_A718PrdNom[0] ;
                  A719PrdNum = P05KJ5_A719PrdNum[0] ;
                  A5560Lb_LineaPr = P05KJ5_A5560Lb_LineaPr[0] ;
                  A718PrdNom = P05KJ5_A718PrdNom[0] ;
                  A488ForPrdDsc = P05KJ5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P05KJ5_n488ForPrdDsc[0] ;
                  h5KJ0( false, 23) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+4, 111, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 117, Gx_line+4, 308, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5561LB_CantP, "ZZZZ9.99999")), 365, Gx_line+4, 446, Gx_line+21, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 452, Gx_line+4, 489, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(51, Gx_line+0, 51, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(328, Gx_line+0, 328, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(547, Gx_line+0, 547, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(809, Gx_line+0, 809, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(51, Gx_line+0, 548, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+23) ;
                  AV9NumLineas = (short)(AV9NumLineas+1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               while ( AV9NumLineas <= 8 )
               {
                  h5KJ0( false, 24) ;
                  getPrinter().GxDrawLine(51, Gx_line+0, 51, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(328, Gx_line+0, 328, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(547, Gx_line+0, 547, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(809, Gx_line+0, 809, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(51, Gx_line+0, 548, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+24) ;
                  AV9NumLineas = (short)(AV9NumLineas+1) ;
               }
               h5KJ0( false, 33) ;
               getPrinter().GxDrawRect(693, Gx_line+2, 723, Gx_line+23, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Obs:", ""), 64, Gx_line+4, 103, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+0, 547, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Aprovada:", ""), 561, Gx_line+4, 646, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Sim", ""), 656, Gx_line+5, 685, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Não", ""), 744, Gx_line+5, 773, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(51, Gx_line+0, 810, Gx_line+26, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(776, Gx_line+2, 806, Gx_line+23, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
               AV11NumOpciones = (short)(AV11NumOpciones+1) ;
               AV9NumLineas = (short)(0) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5KJ0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h5KJ0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ContDsc, "")), 665, Gx_line+0, 812, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Desenvolvimento de Cor", ""), 583, Gx_line+51, 790, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(51, Gx_line+83, 810, Gx_line+117, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processo:", ""), 73, Gx_line+93, 140, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(146, Gx_line+83, 146, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(229, Gx_line+83, 229, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(313, Gx_line+83, 313, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(395, Gx_line+83, 395, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(478, Gx_line+83, 478, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(561, Gx_line+83, 561, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(644, Gx_line+83, 644, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(727, Gx_line+83, 727, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "f54f02e2-3385-4498-b67f-de24d29f7d06", "", context.getHttpContext().getTheme( )), 51, Gx_line+26, 251, Gx_line+68) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+133) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 66, Gx_line+1, 125, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 131, Gx_line+1, 176, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 182, Gx_line+1, 402, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(51, Gx_line+0, 810, Gx_line+101, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(51, Gx_line+19, 810, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data de Entrada", ""), 57, Gx_line+22, 167, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data de Saida", ""), 204, Gx_line+22, 300, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(190, Gx_line+17, 190, Gx_line+85, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(328, Gx_line+19, 328, Gx_line+85, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(328, Gx_line+51, 548, Gx_line+51, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 335, Gx_line+26, 374, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fio Ne:", ""), 335, Gx_line+60, 402, Gx_line+78, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 381, Gx_line+27, 477, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+19, 547, Gx_line+101, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Padrão", ""), 640, Gx_line+25, 697, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Do", ""), 658, Gx_line+41, 678, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 634, Gx_line+57, 701, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comercial:", ""), 58, Gx_line+83, 132, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(51, Gx_line+83, 548, Gx_line+83, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 83, Gx_line+50, 142, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 403, Gx_line+61, 521, Gx_line+78, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+117) ;
               getPrinter().GxDrawRect(51, Gx_line+33, 810, Gx_line+67, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Receita", ""), 80, Gx_line+42, 147, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Concentração", ""), 365, Gx_line+42, 479, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Amostra (Lab Dip)", ""), 588, Gx_line+42, 748, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(328, Gx_line+33, 328, Gx_line+67, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+33, 547, Gx_line+67, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ensaio Nº ", ""), 56, Gx_line+7, 151, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 149, Gx_line+7, 225, Gx_line+26, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+74) ;
            }
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
      this.aP0[0] = pldipserzedelo.this.A396EmprCod;
      this.aP1[0] = pldipserzedelo.this.A5532Lb_numero;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ContDsc = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P05KJ2_A396EmprCod = new String[] {""} ;
      P05KJ2_A5532Lb_numero = new int[1] ;
      P05KJ2_A5533Lb_ArtCod = new String[] {""} ;
      P05KJ2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P05KJ2_A5536Lb_ColNom = new String[] {""} ;
      P05KJ2_A279CliNom = new String[] {""} ;
      P05KJ2_A252CliCod = new int[1] ;
      A5533Lb_ArtCod = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      P05KJ3_A396EmprCod = new String[] {""} ;
      P05KJ3_A5532Lb_numero = new int[1] ;
      P05KJ3_A5555Lb_opcion = new String[] {""} ;
      P05KJ3_A5556Lb_UltLC = new short[1] ;
      A5555Lb_opcion = "" ;
      P05KJ4_A490ForPrdUMe = new byte[1] ;
      P05KJ4_A396EmprCod = new String[] {""} ;
      P05KJ4_A5532Lb_numero = new int[1] ;
      P05KJ4_A5555Lb_opcion = new String[] {""} ;
      P05KJ4_A488ForPrdDsc = new String[] {""} ;
      P05KJ4_n488ForPrdDsc = new boolean[] {false} ;
      P05KJ4_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KJ4_A718PrdNom = new String[] {""} ;
      P05KJ4_A719PrdNum = new String[] {""} ;
      P05KJ4_A5557Lb_LineaC = new short[1] ;
      A488ForPrdDsc = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      P05KJ5_A490ForPrdUMe = new byte[1] ;
      P05KJ5_A396EmprCod = new String[] {""} ;
      P05KJ5_A5532Lb_numero = new int[1] ;
      P05KJ5_A5555Lb_opcion = new String[] {""} ;
      P05KJ5_A488ForPrdDsc = new String[] {""} ;
      P05KJ5_n488ForPrdDsc = new boolean[] {false} ;
      P05KJ5_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KJ5_A718PrdNom = new String[] {""} ;
      P05KJ5_A719PrdNum = new String[] {""} ;
      P05KJ5_A5560Lb_LineaPr = new short[1] ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pldipserzedelo__default(),
         new Object[] {
             new Object[] {
            P05KJ2_A396EmprCod, P05KJ2_A5532Lb_numero, P05KJ2_A5533Lb_ArtCod, P05KJ2_A5541Lb_FechaE, P05KJ2_A5536Lb_ColNom, P05KJ2_A279CliNom, P05KJ2_A252CliCod
            }
            , new Object[] {
            P05KJ3_A396EmprCod, P05KJ3_A5532Lb_numero, P05KJ3_A5555Lb_opcion, P05KJ3_A5556Lb_UltLC
            }
            , new Object[] {
            P05KJ4_A490ForPrdUMe, P05KJ4_A396EmprCod, P05KJ4_A5532Lb_numero, P05KJ4_A5555Lb_opcion, P05KJ4_A488ForPrdDsc, P05KJ4_n488ForPrdDsc, P05KJ4_A5558LB_CantC, P05KJ4_A718PrdNom, P05KJ4_A719PrdNum, P05KJ4_A5557Lb_LineaC
            }
            , new Object[] {
            P05KJ5_A490ForPrdUMe, P05KJ5_A396EmprCod, P05KJ5_A5532Lb_numero, P05KJ5_A5555Lb_opcion, P05KJ5_A488ForPrdDsc, P05KJ5_n488ForPrdDsc, P05KJ5_A5561LB_CantP, P05KJ5_A718PrdNom, P05KJ5_A719PrdNum, P05KJ5_A5560Lb_LineaPr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private short AV11NumOpciones ;
   private short AV9NumLineas ;
   private short A5556Lb_UltLC ;
   private short A5557Lb_LineaC ;
   private short A5560Lb_LineaPr ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String A396EmprCod ;
   private String AV10ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5555Lb_opcion ;
   private String A488ForPrdDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean GxHdr2 ;
   private boolean n488ForPrdDsc ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05KJ2_A396EmprCod ;
   private int[] P05KJ2_A5532Lb_numero ;
   private String[] P05KJ2_A5533Lb_ArtCod ;
   private java.util.Date[] P05KJ2_A5541Lb_FechaE ;
   private String[] P05KJ2_A5536Lb_ColNom ;
   private String[] P05KJ2_A279CliNom ;
   private int[] P05KJ2_A252CliCod ;
   private String[] P05KJ3_A396EmprCod ;
   private int[] P05KJ3_A5532Lb_numero ;
   private String[] P05KJ3_A5555Lb_opcion ;
   private short[] P05KJ3_A5556Lb_UltLC ;
   private byte[] P05KJ4_A490ForPrdUMe ;
   private String[] P05KJ4_A396EmprCod ;
   private int[] P05KJ4_A5532Lb_numero ;
   private String[] P05KJ4_A5555Lb_opcion ;
   private String[] P05KJ4_A488ForPrdDsc ;
   private boolean[] P05KJ4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P05KJ4_A5558LB_CantC ;
   private String[] P05KJ4_A718PrdNom ;
   private String[] P05KJ4_A719PrdNum ;
   private short[] P05KJ4_A5557Lb_LineaC ;
   private byte[] P05KJ5_A490ForPrdUMe ;
   private String[] P05KJ5_A396EmprCod ;
   private int[] P05KJ5_A5532Lb_numero ;
   private String[] P05KJ5_A5555Lb_opcion ;
   private String[] P05KJ5_A488ForPrdDsc ;
   private boolean[] P05KJ5_n488ForPrdDsc ;
   private java.math.BigDecimal[] P05KJ5_A5561LB_CantP ;
   private String[] P05KJ5_A718PrdNom ;
   private String[] P05KJ5_A719PrdNum ;
   private short[] P05KJ5_A5560Lb_LineaPr ;
}

final  class pldipserzedelo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05KJ2", "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_ColNom, T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05KJ3", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_UltLC FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KJ4", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T3.ForPrdDsc, T1.LB_CantC, T2.PrdNom, T1.PrdNum, T1.Lb_LineaC FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KJ5", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T3.ForPrdDsc, T1.LB_CantP, T2.PrdNom, T1.PrdNum, T1.Lb_LineaPr FROM ((TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

