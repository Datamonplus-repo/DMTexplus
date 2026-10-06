package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pmaqhis extends GXReport
{
   public pmaqhis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqhis.class ), "" );
   }

   public pmaqhis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pmaqhis.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pmaqhis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmaqhis.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Historico de máquina") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV8Artextil ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
         pmaqhis.this.GXt_int1 = GXv_int2[0] ;
         AV8Artextil = GXt_int1 ;
         /* Using cursor P04JG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A606MaqDsc = P04JG2_A606MaqDsc[0] ;
            n606MaqDsc = P04JG2_n606MaqDsc[0] ;
            A11504MaqDTGarIn = P04JG2_A11504MaqDTGarIn[0] ;
            n11504MaqDTGarIn = P04JG2_n11504MaqDTGarIn[0] ;
            A11505MaqDTGarFi = P04JG2_A11505MaqDTGarFi[0] ;
            n11505MaqDTGarFi = P04JG2_n11505MaqDTGarFi[0] ;
            A11496MaqDTRepCo = P04JG2_A11496MaqDTRepCo[0] ;
            n11496MaqDTRepCo = P04JG2_n11496MaqDTRepCo[0] ;
            A11495MaqDTAdqCo = P04JG2_A11495MaqDTAdqCo[0] ;
            n11495MaqDTAdqCo = P04JG2_n11495MaqDTAdqCo[0] ;
            A11503MaqDTInv = P04JG2_A11503MaqDTInv[0] ;
            n11503MaqDTInv = P04JG2_n11503MaqDTInv[0] ;
            A11502MaqDTServ = P04JG2_A11502MaqDTServ[0] ;
            n11502MaqDTServ = P04JG2_n11502MaqDTServ[0] ;
            A11501MaqDTCal = P04JG2_A11501MaqDTCal[0] ;
            n11501MaqDTCal = P04JG2_n11501MaqDTCal[0] ;
            A11500MaqDTMnt = P04JG2_A11500MaqDTMnt[0] ;
            n11500MaqDTMnt = P04JG2_n11500MaqDTMnt[0] ;
            A11499MaqDTReq = P04JG2_A11499MaqDTReq[0] ;
            n11499MaqDTReq = P04JG2_n11499MaqDTReq[0] ;
            A11498MaqDTVolt = P04JG2_A11498MaqDTVolt[0] ;
            n11498MaqDTVolt = P04JG2_n11498MaqDTVolt[0] ;
            A11497MaqDTCar = P04JG2_A11497MaqDTCar[0] ;
            n11497MaqDTCar = P04JG2_n11497MaqDTCar[0] ;
            A11494MaqDTPrvDi = P04JG2_A11494MaqDTPrvDi[0] ;
            n11494MaqDTPrvDi = P04JG2_n11494MaqDTPrvDi[0] ;
            A11493MaqDTPrv = P04JG2_A11493MaqDTPrv[0] ;
            n11493MaqDTPrv = P04JG2_n11493MaqDTPrv[0] ;
            A11492MaqDTAdqFo = P04JG2_A11492MaqDTAdqFo[0] ;
            n11492MaqDTAdqFo = P04JG2_n11492MaqDTAdqFo[0] ;
            A11491MaqDTAdqFc = P04JG2_A11491MaqDTAdqFc[0] ;
            n11491MaqDTAdqFc = P04JG2_n11491MaqDTAdqFc[0] ;
            A11490MaqDTOri = P04JG2_A11490MaqDTOri[0] ;
            n11490MaqDTOri = P04JG2_n11490MaqDTOri[0] ;
            A11489MaqDTFab = P04JG2_A11489MaqDTFab[0] ;
            n11489MaqDTFab = P04JG2_n11489MaqDTFab[0] ;
            A11488MaqDTSer = P04JG2_A11488MaqDTSer[0] ;
            n11488MaqDTSer = P04JG2_n11488MaqDTSer[0] ;
            A11487MaqDTRef = P04JG2_A11487MaqDTRef[0] ;
            n11487MaqDTRef = P04JG2_n11487MaqDTRef[0] ;
            A11486MaqDTMod = P04JG2_A11486MaqDTMod[0] ;
            n11486MaqDTMod = P04JG2_n11486MaqDTMod[0] ;
            A11485MaqDTMar = P04JG2_A11485MaqDTMar[0] ;
            n11485MaqDTMar = P04JG2_n11485MaqDTMar[0] ;
            A11484MaqDTTipo = P04JG2_A11484MaqDTTipo[0] ;
            n11484MaqDTTipo = P04JG2_n11484MaqDTTipo[0] ;
            h4JG0( false, 95) ;
            getPrinter().GxDrawRect(14, Gx_line+14, 800, Gx_line+56, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+54, 800, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+54, 150, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HOJA DE VIDA DE EQUIPOS", ""), 138, Gx_line+23, 406, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA DE ELABORACION", ""), 542, Gx_line+68, 712, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(528, Gx_line+14, 800, Gx_line+56, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+14, 530, Gx_line+56, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(528, Gx_line+54, 800, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 728, Gx_line+67, 794, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 691, Gx_line+27, 739, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 765, Gx_line+27, 770, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 772, Gx_line+27, 793, Gx_line+44, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 53, Gx_line+68, 111, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 163, Gx_line+67, 258, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 271, Gx_line+67, 389, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 741, Gx_line+27, 762, Gx_line+43, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+95) ;
            h4JG0( false, 555) ;
            getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ESPECIFICACIONES TECNICAS", ""), 255, Gx_line+9, 559, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11484MaqDTTipo, "")), 339, Gx_line+36, 787, Gx_line+58, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11485MaqDTMar, "")), 339, Gx_line+64, 787, Gx_line+86, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11486MaqDTMod, "")), 339, Gx_line+91, 787, Gx_line+113, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11487MaqDTRef, "")), 339, Gx_line+118, 787, Gx_line+140, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11488MaqDTSer, "")), 339, Gx_line+145, 787, Gx_line+167, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11489MaqDTFab, "")), 339, Gx_line+172, 787, Gx_line+194, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11490MaqDTOri, "")), 339, Gx_line+199, 787, Gx_line+221, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A11491MaqDTAdqFc, "99/99/99"), 339, Gx_line+226, 397, Gx_line+248, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11492MaqDTAdqFo, "")), 421, Gx_line+226, 787, Gx_line+248, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11493MaqDTPrv, "")), 339, Gx_line+252, 787, Gx_line+274, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11494MaqDTPrvDi, "")), 339, Gx_line+279, 787, Gx_line+301, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 27, Gx_line+36, 54, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 27, Gx_line+255, 88, Gx_line+269, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Marca", ""), 27, Gx_line+64, 64, Gx_line+78, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha y Forma de Adquisición", ""), 27, Gx_line+228, 205, Gx_line+242, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lugar de Origen", ""), 27, Gx_line+201, 123, Gx_line+215, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fabricante", ""), 27, Gx_line+173, 91, Gx_line+187, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 27, Gx_line+146, 58, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 27, Gx_line+118, 93, Gx_line+132, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Modelo", ""), 27, Gx_line+91, 71, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dirección Proveedor", ""), 27, Gx_line+283, 149, Gx_line+297, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11497MaqDTCar, "")), 339, Gx_line+334, 787, Gx_line+356, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11498MaqDTVolt, "")), 339, Gx_line+361, 787, Gx_line+383, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11499MaqDTReq, "")), 339, Gx_line+389, 787, Gx_line+411, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11500MaqDTMnt, "")), 339, Gx_line+416, 787, Gx_line+438, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11501MaqDTCal, "")), 339, Gx_line+443, 787, Gx_line+465, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11502MaqDTServ, "")), 339, Gx_line+470, 787, Gx_line+492, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11503MaqDTInv, "")), 339, Gx_line+497, 787, Gx_line+519, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11495MaqDTAdqCo), "ZZZZZZZZZZZ9")), 339, Gx_line+307, 427, Gx_line+329, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11496MaqDTRepCo), "ZZZZZZZZZZZ9")), 699, Gx_line+307, 787, Gx_line+329, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A11505MaqDTGarFi, "99/99/99"), 728, Gx_line+524, 786, Gx_line+546, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A11504MaqDTGarIn, "99/99/99"), 339, Gx_line+524, 397, Gx_line+546, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( " Nº Placa o Cod Inventario", ""), 27, Gx_line+500, 186, Gx_line+514, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Costo Reposición", ""), 582, Gx_line+311, 686, Gx_line+325, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Serv. en el que se encuentra", ""), 27, Gx_line+473, 200, Gx_line+487, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calibración (Tipo/Periodicidad)", ""), 27, Gx_line+445, 211, Gx_line+459, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mant. Indicado Fabricante", ""), 27, Gx_line+418, 183, Gx_line+432, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Requis. e Indicac. Fabricante", ""), 27, Gx_line+390, 203, Gx_line+404, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Voltaje", ""), 27, Gx_line+363, 69, Gx_line+377, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Características", ""), 27, Gx_line+334, 118, Gx_line+348, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Costo Aquisición", ""), 27, Gx_line+307, 126, Gx_line+321, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Garantía - Inicio", ""), 27, Gx_line+528, 125, Gx_line+542, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 668, Gx_line+528, 687, Gx_line+542, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+555) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Eject command */
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(P_lines+1) ;
         /* Using cursor P04JG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9426OMMaqCod = P04JG3_A9426OMMaqCod[0] ;
            A9425OMCod = P04JG3_A9425OMCod[0] ;
            h4JG0( false, 95) ;
            getPrinter().GxDrawRect(14, Gx_line+14, 800, Gx_line+56, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+54, 800, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+54, 150, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HOJA DE VIDA DE EQUIPOS", ""), 138, Gx_line+23, 406, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA DE ELABORACION", ""), 542, Gx_line+68, 712, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(528, Gx_line+14, 800, Gx_line+56, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+14, 530, Gx_line+56, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(528, Gx_line+54, 800, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 728, Gx_line+67, 794, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 691, Gx_line+27, 739, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 765, Gx_line+27, 770, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 772, Gx_line+27, 793, Gx_line+44, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 53, Gx_line+68, 111, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 163, Gx_line+67, 258, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 271, Gx_line+67, 389, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 741, Gx_line+27, 762, Gx_line+43, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+95) ;
            Gx_line = (int)(Gx_line+3) ;
            if ( AV8Artextil == 0 )
            {
               h4JG0( false, 0) ;
               GXv_char3[0] = A396EmprCod ;
               GXv_int4[0] = A9425OMCod ;
               GXv_char5[0] = httpContext.getMessage( "D", "") ;
               GXv_char6[0] = Gx_out ;
               GXv_int7[0] = Gx_page ;
               GXv_int8[0] = Gx_line ;
               new app.mantenimientomaquina.rmordenes_bck(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int8, getPrinter()) ;
               pmaqhis.this.A396EmprCod = GXv_char3[0] ;
               pmaqhis.this.A9425OMCod = GXv_int4[0] ;
               pmaqhis.this.Gx_out = GXv_char6[0] ;
               pmaqhis.this.Gx_page = GXv_int7[0] ;
               pmaqhis.this.Gx_line = GXv_int8[0] ;
            }
            else
            {
               h4JG0( false, 0) ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A9425OMCod ;
               GXv_char5[0] = Gx_out ;
               GXv_int7[0] = Gx_page ;
               GXv_int4[0] = Gx_line ;
               new app.rmorart1(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_char5, GXv_int7, GXv_int4, getPrinter()) ;
               pmaqhis.this.A396EmprCod = GXv_char6[0] ;
               pmaqhis.this.A9425OMCod = GXv_int8[0] ;
               pmaqhis.this.Gx_out = GXv_char5[0] ;
               pmaqhis.this.Gx_page = GXv_int7[0] ;
               pmaqhis.this.Gx_line = GXv_int4[0] ;
            }
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h4JG0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h4JG0( boolean bFoot ,
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
      this.aP0[0] = pmaqhis.this.A396EmprCod;
      this.aP1[0] = pmaqhis.this.A602MaqCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P04JG2_A396EmprCod = new String[] {""} ;
      P04JG2_A602MaqCod = new String[] {""} ;
      P04JG2_A606MaqDsc = new String[] {""} ;
      P04JG2_n606MaqDsc = new boolean[] {false} ;
      P04JG2_A11504MaqDTGarIn = new java.util.Date[] {GXutil.nullDate()} ;
      P04JG2_n11504MaqDTGarIn = new boolean[] {false} ;
      P04JG2_A11505MaqDTGarFi = new java.util.Date[] {GXutil.nullDate()} ;
      P04JG2_n11505MaqDTGarFi = new boolean[] {false} ;
      P04JG2_A11496MaqDTRepCo = new long[1] ;
      P04JG2_n11496MaqDTRepCo = new boolean[] {false} ;
      P04JG2_A11495MaqDTAdqCo = new long[1] ;
      P04JG2_n11495MaqDTAdqCo = new boolean[] {false} ;
      P04JG2_A11503MaqDTInv = new String[] {""} ;
      P04JG2_n11503MaqDTInv = new boolean[] {false} ;
      P04JG2_A11502MaqDTServ = new String[] {""} ;
      P04JG2_n11502MaqDTServ = new boolean[] {false} ;
      P04JG2_A11501MaqDTCal = new String[] {""} ;
      P04JG2_n11501MaqDTCal = new boolean[] {false} ;
      P04JG2_A11500MaqDTMnt = new String[] {""} ;
      P04JG2_n11500MaqDTMnt = new boolean[] {false} ;
      P04JG2_A11499MaqDTReq = new String[] {""} ;
      P04JG2_n11499MaqDTReq = new boolean[] {false} ;
      P04JG2_A11498MaqDTVolt = new String[] {""} ;
      P04JG2_n11498MaqDTVolt = new boolean[] {false} ;
      P04JG2_A11497MaqDTCar = new String[] {""} ;
      P04JG2_n11497MaqDTCar = new boolean[] {false} ;
      P04JG2_A11494MaqDTPrvDi = new String[] {""} ;
      P04JG2_n11494MaqDTPrvDi = new boolean[] {false} ;
      P04JG2_A11493MaqDTPrv = new String[] {""} ;
      P04JG2_n11493MaqDTPrv = new boolean[] {false} ;
      P04JG2_A11492MaqDTAdqFo = new String[] {""} ;
      P04JG2_n11492MaqDTAdqFo = new boolean[] {false} ;
      P04JG2_A11491MaqDTAdqFc = new java.util.Date[] {GXutil.nullDate()} ;
      P04JG2_n11491MaqDTAdqFc = new boolean[] {false} ;
      P04JG2_A11490MaqDTOri = new String[] {""} ;
      P04JG2_n11490MaqDTOri = new boolean[] {false} ;
      P04JG2_A11489MaqDTFab = new String[] {""} ;
      P04JG2_n11489MaqDTFab = new boolean[] {false} ;
      P04JG2_A11488MaqDTSer = new String[] {""} ;
      P04JG2_n11488MaqDTSer = new boolean[] {false} ;
      P04JG2_A11487MaqDTRef = new String[] {""} ;
      P04JG2_n11487MaqDTRef = new boolean[] {false} ;
      P04JG2_A11486MaqDTMod = new String[] {""} ;
      P04JG2_n11486MaqDTMod = new boolean[] {false} ;
      P04JG2_A11485MaqDTMar = new String[] {""} ;
      P04JG2_n11485MaqDTMar = new boolean[] {false} ;
      P04JG2_A11484MaqDTTipo = new String[] {""} ;
      P04JG2_n11484MaqDTTipo = new boolean[] {false} ;
      A606MaqDsc = "" ;
      A11504MaqDTGarIn = GXutil.nullDate() ;
      A11505MaqDTGarFi = GXutil.nullDate() ;
      A11503MaqDTInv = "" ;
      A11502MaqDTServ = "" ;
      A11501MaqDTCal = "" ;
      A11500MaqDTMnt = "" ;
      A11499MaqDTReq = "" ;
      A11498MaqDTVolt = "" ;
      A11497MaqDTCar = "" ;
      A11494MaqDTPrvDi = "" ;
      A11493MaqDTPrv = "" ;
      A11492MaqDTAdqFo = "" ;
      A11491MaqDTAdqFc = GXutil.nullDate() ;
      A11490MaqDTOri = "" ;
      A11489MaqDTFab = "" ;
      A11488MaqDTSer = "" ;
      A11487MaqDTRef = "" ;
      A11486MaqDTMod = "" ;
      A11485MaqDTMar = "" ;
      A11484MaqDTTipo = "" ;
      Gx_date = GXutil.nullDate() ;
      P04JG3_A396EmprCod = new String[] {""} ;
      P04JG3_A9426OMMaqCod = new String[] {""} ;
      P04JG3_A9425OMCod = new int[1] ;
      A9426OMMaqCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int4 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqhis__default(),
         new Object[] {
             new Object[] {
            P04JG2_A396EmprCod, P04JG2_A602MaqCod, P04JG2_A606MaqDsc, P04JG2_n606MaqDsc, P04JG2_A11504MaqDTGarIn, P04JG2_n11504MaqDTGarIn, P04JG2_A11505MaqDTGarFi, P04JG2_n11505MaqDTGarFi, P04JG2_A11496MaqDTRepCo, P04JG2_n11496MaqDTRepCo,
            P04JG2_A11495MaqDTAdqCo, P04JG2_n11495MaqDTAdqCo, P04JG2_A11503MaqDTInv, P04JG2_n11503MaqDTInv, P04JG2_A11502MaqDTServ, P04JG2_n11502MaqDTServ, P04JG2_A11501MaqDTCal, P04JG2_n11501MaqDTCal, P04JG2_A11500MaqDTMnt, P04JG2_n11500MaqDTMnt,
            P04JG2_A11499MaqDTReq, P04JG2_n11499MaqDTReq, P04JG2_A11498MaqDTVolt, P04JG2_n11498MaqDTVolt, P04JG2_A11497MaqDTCar, P04JG2_n11497MaqDTCar, P04JG2_A11494MaqDTPrvDi, P04JG2_n11494MaqDTPrvDi, P04JG2_A11493MaqDTPrv, P04JG2_n11493MaqDTPrv,
            P04JG2_A11492MaqDTAdqFo, P04JG2_n11492MaqDTAdqFo, P04JG2_A11491MaqDTAdqFc, P04JG2_n11491MaqDTAdqFc, P04JG2_A11490MaqDTOri, P04JG2_n11490MaqDTOri, P04JG2_A11489MaqDTFab, P04JG2_n11489MaqDTFab, P04JG2_A11488MaqDTSer, P04JG2_n11488MaqDTSer,
            P04JG2_A11487MaqDTRef, P04JG2_n11487MaqDTRef, P04JG2_A11486MaqDTMod, P04JG2_n11486MaqDTMod, P04JG2_A11485MaqDTMar, P04JG2_n11485MaqDTMar, P04JG2_A11484MaqDTTipo, P04JG2_n11484MaqDTTipo
            }
            , new Object[] {
            P04JG3_A396EmprCod, P04JG3_A9426OMMaqCod, P04JG3_A9425OMCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV8Artextil ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A9425OMCod ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private int GXv_int4[] ;
   private long A11496MaqDTRepCo ;
   private long A11495MaqDTAdqCo ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private String A9426OMMaqCod ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private java.util.Date A11504MaqDTGarIn ;
   private java.util.Date A11505MaqDTGarFi ;
   private java.util.Date A11491MaqDTAdqFc ;
   private java.util.Date Gx_date ;
   private boolean n606MaqDsc ;
   private boolean n11504MaqDTGarIn ;
   private boolean n11505MaqDTGarFi ;
   private boolean n11496MaqDTRepCo ;
   private boolean n11495MaqDTAdqCo ;
   private boolean n11503MaqDTInv ;
   private boolean n11502MaqDTServ ;
   private boolean n11501MaqDTCal ;
   private boolean n11500MaqDTMnt ;
   private boolean n11499MaqDTReq ;
   private boolean n11498MaqDTVolt ;
   private boolean n11497MaqDTCar ;
   private boolean n11494MaqDTPrvDi ;
   private boolean n11493MaqDTPrv ;
   private boolean n11492MaqDTAdqFo ;
   private boolean n11491MaqDTAdqFc ;
   private boolean n11490MaqDTOri ;
   private boolean n11489MaqDTFab ;
   private boolean n11488MaqDTSer ;
   private boolean n11487MaqDTRef ;
   private boolean n11486MaqDTMod ;
   private boolean n11485MaqDTMar ;
   private boolean n11484MaqDTTipo ;
   private String A11503MaqDTInv ;
   private String A11502MaqDTServ ;
   private String A11501MaqDTCal ;
   private String A11500MaqDTMnt ;
   private String A11499MaqDTReq ;
   private String A11498MaqDTVolt ;
   private String A11497MaqDTCar ;
   private String A11494MaqDTPrvDi ;
   private String A11493MaqDTPrv ;
   private String A11492MaqDTAdqFo ;
   private String A11490MaqDTOri ;
   private String A11489MaqDTFab ;
   private String A11488MaqDTSer ;
   private String A11487MaqDTRef ;
   private String A11486MaqDTMod ;
   private String A11485MaqDTMar ;
   private String A11484MaqDTTipo ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04JG2_A396EmprCod ;
   private String[] P04JG2_A602MaqCod ;
   private String[] P04JG2_A606MaqDsc ;
   private boolean[] P04JG2_n606MaqDsc ;
   private java.util.Date[] P04JG2_A11504MaqDTGarIn ;
   private boolean[] P04JG2_n11504MaqDTGarIn ;
   private java.util.Date[] P04JG2_A11505MaqDTGarFi ;
   private boolean[] P04JG2_n11505MaqDTGarFi ;
   private long[] P04JG2_A11496MaqDTRepCo ;
   private boolean[] P04JG2_n11496MaqDTRepCo ;
   private long[] P04JG2_A11495MaqDTAdqCo ;
   private boolean[] P04JG2_n11495MaqDTAdqCo ;
   private String[] P04JG2_A11503MaqDTInv ;
   private boolean[] P04JG2_n11503MaqDTInv ;
   private String[] P04JG2_A11502MaqDTServ ;
   private boolean[] P04JG2_n11502MaqDTServ ;
   private String[] P04JG2_A11501MaqDTCal ;
   private boolean[] P04JG2_n11501MaqDTCal ;
   private String[] P04JG2_A11500MaqDTMnt ;
   private boolean[] P04JG2_n11500MaqDTMnt ;
   private String[] P04JG2_A11499MaqDTReq ;
   private boolean[] P04JG2_n11499MaqDTReq ;
   private String[] P04JG2_A11498MaqDTVolt ;
   private boolean[] P04JG2_n11498MaqDTVolt ;
   private String[] P04JG2_A11497MaqDTCar ;
   private boolean[] P04JG2_n11497MaqDTCar ;
   private String[] P04JG2_A11494MaqDTPrvDi ;
   private boolean[] P04JG2_n11494MaqDTPrvDi ;
   private String[] P04JG2_A11493MaqDTPrv ;
   private boolean[] P04JG2_n11493MaqDTPrv ;
   private String[] P04JG2_A11492MaqDTAdqFo ;
   private boolean[] P04JG2_n11492MaqDTAdqFo ;
   private java.util.Date[] P04JG2_A11491MaqDTAdqFc ;
   private boolean[] P04JG2_n11491MaqDTAdqFc ;
   private String[] P04JG2_A11490MaqDTOri ;
   private boolean[] P04JG2_n11490MaqDTOri ;
   private String[] P04JG2_A11489MaqDTFab ;
   private boolean[] P04JG2_n11489MaqDTFab ;
   private String[] P04JG2_A11488MaqDTSer ;
   private boolean[] P04JG2_n11488MaqDTSer ;
   private String[] P04JG2_A11487MaqDTRef ;
   private boolean[] P04JG2_n11487MaqDTRef ;
   private String[] P04JG2_A11486MaqDTMod ;
   private boolean[] P04JG2_n11486MaqDTMod ;
   private String[] P04JG2_A11485MaqDTMar ;
   private boolean[] P04JG2_n11485MaqDTMar ;
   private String[] P04JG2_A11484MaqDTTipo ;
   private boolean[] P04JG2_n11484MaqDTTipo ;
   private String[] P04JG3_A396EmprCod ;
   private String[] P04JG3_A9426OMMaqCod ;
   private int[] P04JG3_A9425OMCod ;
}

final  class pmaqhis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04JG2", "SELECT EmprCod, MaqCod, MaqDsc, MaqDTGarIn, MaqDTGarFi, MaqDTRepCo, MaqDTAdqCo, MaqDTInv, MaqDTServ, MaqDTCal, MaqDTMnt, MaqDTReq, MaqDTVolt, MaqDTCar, MaqDTPrvDi, MaqDTPrv, MaqDTAdqFo, MaqDTAdqFc, MaqDTOri, MaqDTFab, MaqDTSer, MaqDTRef, MaqDTMod, MaqDTMar, MaqDTTipo FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04JG3", "SELECT EmprCod, OMMaqCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMMaqCod = ? ORDER BY EmprCod, OMMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

