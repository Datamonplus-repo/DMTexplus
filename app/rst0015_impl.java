package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0015_impl extends GXWebReport
{
   public rst0015_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV8PrdNum = httpContext.GetPar( "PrdNum") ;
            AV17Tipo = (byte)(GXutil.lval( httpContext.GetPar( "Tipo"))) ;
            AV39Pr1 = (byte)(GXutil.lval( httpContext.GetPar( "Pr1"))) ;
            AV40Pr2 = (byte)(GXutil.lval( httpContext.GetPar( "Pr2"))) ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV37Carvema ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
         rst0015_impl.this.GXt_int1 = GXv_int2[0] ;
         AV37Carvema = GXt_int1 ;
         /* Using cursor P06HL2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06HL2_A407EmprNom[0] ;
            n407EmprNom = P06HL2_n407EmprNom[0] ;
            AV10EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06HL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV8PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P06HL3_A719PrdNum[0] ;
            n719PrdNum = P06HL3_n719PrdNum[0] ;
            A718PrdNom = P06HL3_A718PrdNom[0] ;
            AV11PrdNom = A718PrdNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( ( AV17Tipo == 1 ) || ( AV17Tipo == 2 ) || ( AV17Tipo == 5 ) )
         {
            AV12FlagCol = (byte)(0) ;
            /* Using cursor P06HL4 */
            pr_default.execute(2, new Object[] {A396EmprCod, AV8PrdNum});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A719PrdNum = P06HL4_A719PrdNum[0] ;
               n719PrdNum = P06HL4_n719PrdNum[0] ;
               A309ColLin = P06HL4_A309ColLin[0] ;
               A486ForNumCol = P06HL4_A486ForNumCol[0] ;
               AV9ForNumCol = A486ForNumCol ;
               if ( AV12FlagCol == 0 )
               {
                  AV12FlagCol = (byte)(1) ;
                  if ( AV37Carvema == 0 )
                  {
                     h6HL0( false, 50) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 20, Gx_line+30, 62, Gx_line+46, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 297, Gx_line+30, 344, Gx_line+46, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 423, Gx_line+30, 455, Gx_line+46, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 529, Gx_line+30, 577, Gx_line+46, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 598, Gx_line+30, 613, Gx_line+46, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(16, Gx_line+46, 760, Gx_line+46, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "(Colorantes Formulas)", ""), 276, Gx_line+6, 408, Gx_line+22, 1+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº Formula", ""), 633, Gx_line+29, 698, Gx_line+45, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+50) ;
                  }
                  else
                  {
                     h6HL0( false, 44) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 22, Gx_line+24, 64, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 299, Gx_line+24, 335, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 423, Gx_line+24, 445, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 656, Gx_line+24, 671, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(15, Gx_line+40, 759, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "(Colorantes Formulas)", ""), 275, Gx_line+0, 407, Gx_line+16, 1+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº Formula", ""), 685, Gx_line+23, 750, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 534, Gx_line+3, 562, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 525, Gx_line+24, 572, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 606, Gx_line+3, 634, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Aprova", ""), 599, Gx_line+21, 642, Gx_line+37, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+44) ;
                  }
               }
               /* Using cursor P06HL5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV9ForNumCol)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A486ForNumCol = P06HL5_A486ForNumCol[0] ;
                  A831TipColCod = P06HL5_A831TipColCod[0] ;
                  A483ForColNum = P06HL5_A483ForColNum[0] ;
                  A482ForColNom = P06HL5_A482ForColNom[0] ;
                  A494ForSer = P06HL5_A494ForSer[0] ;
                  A279CliNom = P06HL5_A279CliNom[0] ;
                  A252CliCod = P06HL5_A252CliCod[0] ;
                  n252CliCod = P06HL5_n252CliCod[0] ;
                  A485ForFec = P06HL5_A485ForFec[0] ;
                  n485ForFec = P06HL5_n485ForFec[0] ;
                  A3558ForFecApr = P06HL5_A3558ForFecApr[0] ;
                  n3558ForFecApr = P06HL5_n3558ForFecApr[0] ;
                  A279CliNom = P06HL5_A279CliNom[0] ;
                  if ( AV37Carvema == 0 )
                  {
                     h6HL0( false, 19) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 20, Gx_line+0, 65, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 69, Gx_line+1, 289, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 297, Gx_line+1, 415, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 423, Gx_line+0, 519, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 529, Gx_line+0, 574, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 598, Gx_line+1, 614, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")), 639, Gx_line+0, 698, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                  }
                  else
                  {
                     h6HL0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 22, Gx_line+0, 67, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 73, Gx_line+0, 293, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 299, Gx_line+0, 417, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 423, Gx_line+0, 519, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A3558ForFecApr, "99/99/99"), 591, Gx_line+0, 650, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A485ForFec, "99/99/99"), 525, Gx_line+0, 584, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 656, Gx_line+0, 672, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")), 685, Gx_line+0, 744, Gx_line+16, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV12FlagCol = (byte)(0) ;
            AV44Lb_numero = 0 ;
            /* Using cursor P06HL6 */
            pr_default.execute(4, new Object[] {A396EmprCod, AV8PrdNum});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A719PrdNum = P06HL6_A719PrdNum[0] ;
               n719PrdNum = P06HL6_n719PrdNum[0] ;
               A5557Lb_LineaC = P06HL6_A5557Lb_LineaC[0] ;
               A5555Lb_opcion = P06HL6_A5555Lb_opcion[0] ;
               A5532Lb_numero = P06HL6_A5532Lb_numero[0] ;
               if ( AV12FlagCol == 0 )
               {
                  AV12FlagCol = (byte)(1) ;
                  h6HL0( false, 32) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N Ensayo / Tabla Alcali", ""), 20, Gx_line+16, 151, Gx_line+32, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Texto_c, "")), 249, Gx_line+0, 438, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+32) ;
               }
               if ( AV44Lb_numero != A5532Lb_numero )
               {
                  h6HL0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 20, Gx_line+0, 79, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV44Lb_numero = A5532Lb_numero ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV13FlagProd = (byte)(0) ;
            if ( GXutil.strcmp(GXutil.substring( AV8PrdNum, 1, 1), "#") == 0 )
            {
               AV34ForPrd = GXutil.substring( AV8PrdNum, 2, 4) ;
               AV33ForPrdNor = (short)(GXutil.lval( AV34ForPrd)) ;
               /* Using cursor P06HL7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(AV33ForPrdNor)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A489ForPrdNor = P06HL7_A489ForPrdNor[0] ;
                  A715PrdLin = P06HL7_A715PrdLin[0] ;
                  A486ForNumCol = P06HL7_A486ForNumCol[0] ;
                  A719PrdNum = P06HL7_A719PrdNum[0] ;
                  n719PrdNum = P06HL7_n719PrdNum[0] ;
                  AV9ForNumCol = A486ForNumCol ;
                  AV32PrdNumCol = A719PrdNum ;
                  if ( AV13FlagProd == 0 )
                  {
                     AV13FlagProd = (byte)(1) ;
                     /* Execute user subroutine: 'CAB_PRDFOR' */
                     S141 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  /* Execute user subroutine: 'LIN_PRDFOR' */
                  S151 ();
                  if ( returnInSub )
                  {
                     pr_default.close(5);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  pr_default.readNext(5);
               }
               pr_default.close(5);
            }
            else
            {
               AV32PrdNumCol = "" ;
               /* Using cursor P06HL8 */
               pr_default.execute(6, new Object[] {A396EmprCod, AV8PrdNum});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A719PrdNum = P06HL8_A719PrdNum[0] ;
                  n719PrdNum = P06HL8_n719PrdNum[0] ;
                  A715PrdLin = P06HL8_A715PrdLin[0] ;
                  A486ForNumCol = P06HL8_A486ForNumCol[0] ;
                  AV9ForNumCol = A486ForNumCol ;
                  if ( AV13FlagProd == 0 )
                  {
                     AV13FlagProd = (byte)(1) ;
                     /* Execute user subroutine: 'CAB_PRDFOR' */
                     S141 ();
                     if ( returnInSub )
                     {
                        pr_default.close(6);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  /* Execute user subroutine: 'LIN_PRDFOR' */
                  S151 ();
                  if ( returnInSub )
                  {
                     pr_default.close(6);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  pr_default.readNext(6);
               }
               pr_default.close(6);
            }
            AV12FlagCol = (byte)(0) ;
            AV44Lb_numero = 0 ;
            /* Using cursor P06HL9 */
            pr_default.execute(7, new Object[] {A396EmprCod, AV8PrdNum});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A719PrdNum = P06HL9_A719PrdNum[0] ;
               n719PrdNum = P06HL9_n719PrdNum[0] ;
               A5560Lb_LineaPr = P06HL9_A5560Lb_LineaPr[0] ;
               A5555Lb_opcion = P06HL9_A5555Lb_opcion[0] ;
               A5532Lb_numero = P06HL9_A5532Lb_numero[0] ;
               if ( AV12FlagCol == 0 )
               {
                  AV12FlagCol = (byte)(1) ;
                  AV43Texto_c = httpContext.getMessage( "(Productos Ensayos)", "") ;
                  h6HL0( false, 32) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N Ensayo / Tabla Alcali", ""), 20, Gx_line+16, 151, Gx_line+32, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Texto_c, "")), 249, Gx_line+0, 438, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+32) ;
               }
               if ( AV44Lb_numero != A5532Lb_numero )
               {
                  h6HL0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 20, Gx_line+0, 79, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV44Lb_numero = A5532Lb_numero ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            /* Using cursor P06HL10 */
            pr_default.execute(8, new Object[] {A396EmprCod, AV8PrdNum});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A719PrdNum = P06HL10_A719PrdNum[0] ;
               n719PrdNum = P06HL10_n719PrdNum[0] ;
               A6311Lb_TaAuxD = P06HL10_A6311Lb_TaAuxD[0] ;
               A6310Lb_TaAuxC = P06HL10_A6310Lb_TaAuxC[0] ;
               A6313lb_TaAuxL = P06HL10_A6313lb_TaAuxL[0] ;
               A6378Lb_TauxLP = P06HL10_A6378Lb_TauxLP[0] ;
               A6311Lb_TaAuxD = P06HL10_A6311Lb_TaAuxD[0] ;
               if ( AV12FlagCol == 0 )
               {
                  AV12FlagCol = (byte)(1) ;
                  AV43Texto_c = httpContext.getMessage( "(Tabla Alcalis)", "") ;
                  h6HL0( false, 32) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N Ensayo / Tabla Alcali", ""), 20, Gx_line+16, 151, Gx_line+32, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Texto_c, "")), 249, Gx_line+0, 438, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+32) ;
               }
               if ( GXutil.strcmp(AV45Lb_taauxc, A6310Lb_TaAuxC) != 0 )
               {
                  h6HL0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6310Lb_TaAuxC, "")), 20, Gx_line+0, 50, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6311Lb_TaAuxD, "")), 58, Gx_line+0, 497, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV45Lb_taauxc = A6310Lb_TaAuxC ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            h6HL0( false, 10) ;
            getPrinter().GxDrawLine(16, Gx_line+5, 760, Gx_line+5, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+10) ;
         }
         if ( ( AV17Tipo == 1 ) || ( AV17Tipo == 3 ) || ( AV17Tipo == 5 ) )
         {
            AV14FlagProc = (byte)(0) ;
            /* Using cursor P06HL11 */
            pr_default.execute(9, new Object[] {A396EmprCod, AV8PrdNum});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A770ProForPrd = P06HL11_A770ProForPrd[0] ;
               A766ProForDsc = P06HL11_A766ProForDsc[0] ;
               A764ProForCod = P06HL11_A764ProForCod[0] ;
               A767ProForLin = P06HL11_A767ProForLin[0] ;
               A766ProForDsc = P06HL11_A766ProForDsc[0] ;
               if ( AV14FlagProc == 0 )
               {
                  AV14FlagProc = (byte)(1) ;
                  h6HL0( false, 46) ;
                  getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "(Procesos Formulación)", ""), 272, Gx_line+10, 415, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 50, Gx_line+24, 101, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(16, Gx_line+39, 760, Gx_line+39, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+46) ;
               }
               h6HL0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 50, Gx_line+0, 95, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 117, Gx_line+0, 336, Gx_line+17, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(9);
            }
            pr_default.close(9);
            h6HL0( false, 10) ;
            getPrinter().GxDrawLine(16, Gx_line+4, 760, Gx_line+4, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+10) ;
         }
         if ( ( AV17Tipo == 4 ) || ( AV17Tipo == 5 ) )
         {
            AV16FlagRec = (byte)(0) ;
            /* Using cursor P06HL12 */
            pr_default.execute(10, new Object[] {A396EmprCod, AV8PrdNum});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A719PrdNum = P06HL12_A719PrdNum[0] ;
               n719PrdNum = P06HL12_n719PrdNum[0] ;
               A1273RecLinPro = P06HL12_A1273RecLinPro[0] ;
               A252CliCod = P06HL12_A252CliCod[0] ;
               n252CliCod = P06HL12_n252CliCod[0] ;
               A129BarCod = P06HL12_A129BarCod[0] ;
               A132BarCodReo = P06HL12_A132BarCodReo[0] ;
               A130BarCodPar = P06HL12_A130BarCodPar[0] ;
               A212BarSer = P06HL12_A212BarSer[0] ;
               A135BarColNom = P06HL12_A135BarColNom[0] ;
               A136BarColNum = P06HL12_A136BarColNum[0] ;
               A218BarTipCol = P06HL12_A218BarTipCol[0] ;
               A2804RecLinMaq = P06HL12_A2804RecLinMaq[0] ;
               A686PrdCant = P06HL12_A686PrdCant[0] ;
               A490ForPrdUMe = P06HL12_A490ForPrdUMe[0] ;
               n490ForPrdUMe = P06HL12_n490ForPrdUMe[0] ;
               A488ForPrdDsc = P06HL12_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06HL12_n488ForPrdDsc[0] ;
               A213BarSit = P06HL12_A213BarSit[0] ;
               A811RecLin = P06HL12_A811RecLin[0] ;
               A488ForPrdDsc = P06HL12_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06HL12_n488ForPrdDsc[0] ;
               A252CliCod = P06HL12_A252CliCod[0] ;
               n252CliCod = P06HL12_n252CliCod[0] ;
               A212BarSer = P06HL12_A212BarSer[0] ;
               A135BarColNom = P06HL12_A135BarColNom[0] ;
               A136BarColNum = P06HL12_A136BarColNum[0] ;
               A218BarTipCol = P06HL12_A218BarTipCol[0] ;
               A213BarSit = P06HL12_A213BarSit[0] ;
               if ( AV16FlagRec == 0 )
               {
                  AV16FlagRec = (byte)(1) ;
                  h6HL0( false, 55) ;
                  getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "( Recetas )", ""), 303, Gx_line+8, 368, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hoja Ruta", ""), 26, Gx_line+34, 83, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 115, Gx_line+34, 157, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 175, Gx_line+34, 207, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 320, Gx_line+34, 352, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(16, Gx_line+50, 760, Gx_line+50, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 541, Gx_line+34, 592, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 618, Gx_line+34, 674, Gx_line+50, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+55) ;
               }
               AV28Clicod = A252CliCod ;
               AV18barcod = A129BarCod ;
               AV19barcodreo = A132BarCodReo ;
               AV20Barcodpar = A130BarCodPar ;
               AV21barSer = A212BarSer ;
               AV22Barcolnom = A135BarColNom ;
               AV23Barcolnum = A136BarColNum ;
               AV24barTipCol = A218BarTipCol ;
               AV30RecLinMaq = A2804RecLinMaq ;
               /* Execute user subroutine: 'RECMAQ' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(10);
                  pr_default.close(10);
                  pr_default.close(10);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV41recmaq == 1 )
               {
                  AV26Prdcant = A686PrdCant ;
                  if ( A490ForPrdUMe == 3 )
                  {
                     AV27Forprddsc = httpContext.getMessage( "Gr", "") ;
                  }
                  else
                  {
                     AV27Forprddsc = A488ForPrdDsc ;
                  }
                  AV29BarSit = A213BarSit ;
                  /* Execute user subroutine: 'BARFAS' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(10);
                     pr_default.close(10);
                     pr_default.close(10);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( ( AV37Carvema == 1 ) && ( AV36Barfasest > 0 ) )
                  {
                  }
                  else
                  {
                     AV31Tot_ct = AV31Tot_ct.add(A686PrdCant) ;
                  }
                  /* Execute user subroutine: 'LRECET' */
                  S121 ();
                  if ( returnInSub )
                  {
                     pr_default.close(10);
                     pr_default.close(10);
                     pr_default.close(10);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               pr_default.readNext(10);
            }
            pr_default.close(10);
            if ( AV31Tot_ct.doubleValue() > 0 )
            {
               h6HL0( false, 25) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Tot_ct, "ZZZZZ9.999")), 571, Gx_line+4, 645, Gx_line+22, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+25) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6HL0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV36Barfasest = (byte)(0) ;
      /* Using cursor P06HL13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV18barcod), Byte.valueOf(AV19barcodreo), AV20Barcodpar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = P06HL13_A130BarCodPar[0] ;
         A132BarCodReo = P06HL13_A132BarCodReo[0] ;
         A129BarCod = P06HL13_A129BarCod[0] ;
         A150BarFacTin = P06HL13_A150BarFacTin[0] ;
         A153BarFasEst = P06HL13_A153BarFasEst[0] ;
         A194BarOrdLin = P06HL13_A194BarOrdLin[0] ;
         A758ProCod = P06HL13_A758ProCod[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV36Barfasest = A153BarFasEst ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'LRECET' Routine */
      returnInSub = false ;
      if ( ( AV37Carvema == 1 ) && ( AV36Barfasest > 0 ) )
      {
      }
      else
      {
         h6HL0( false, 19) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18barcod), "ZZZZZZZ9")), 19, Gx_line+0, 78, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19barcodreo), "9")), 82, Gx_line+1, 90, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Barcodpar, "")), 95, Gx_line+1, 103, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28Clicod), "ZZZZZ9")), 119, Gx_line+1, 164, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 174, Gx_line+0, 292, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Barcolnom, "")), 311, Gx_line+1, 407, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23Barcolnum), "ZZZZZ9")), 421, Gx_line+1, 466, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24barTipCol), "Z9")), 479, Gx_line+1, 495, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarSit), "Z9")), 515, Gx_line+1, 531, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Maqcod, "")), 544, Gx_line+1, 589, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Prdcant, "ZZZZZZ9.999")), 593, Gx_line+1, 674, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Forprddsc, "")), 677, Gx_line+0, 714, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21barSer, "")), 174, Gx_line+1, 292, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36Barfasest), "9")), 732, Gx_line+1, 740, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38recpripla), "Z9")), 753, Gx_line+0, 769, Gx_line+18, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+19) ;
      }
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      AV41recmaq = (byte)(0) ;
      /* Using cursor P06HL14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV18barcod), Byte.valueOf(AV19barcodreo), AV20Barcodpar, Short.valueOf(AV30RecLinMaq), Byte.valueOf(AV39Pr1), Byte.valueOf(AV40Pr2)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A5431RecPriPla = P06HL14_A5431RecPriPla[0] ;
         n5431RecPriPla = P06HL14_n5431RecPriPla[0] ;
         A2804RecLinMaq = P06HL14_A2804RecLinMaq[0] ;
         A130BarCodPar = P06HL14_A130BarCodPar[0] ;
         A132BarCodReo = P06HL14_A132BarCodReo[0] ;
         A129BarCod = P06HL14_A129BarCod[0] ;
         A602MaqCod = P06HL14_A602MaqCod[0] ;
         AV25Maqcod = A602MaqCod ;
         AV38recpripla = A5431RecPriPla ;
         AV41recmaq = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'CAB_PRDFOR' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV32PrdNumCol)==0) )
      {
         AV35PrdTxt = httpContext.getMessage( "Prd.", "") ;
      }
      h6HL0( false, 45) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 20, Gx_line+24, 62, Gx_line+40, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 297, Gx_line+24, 344, Gx_line+40, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 423, Gx_line+24, 455, Gx_line+40, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 529, Gx_line+24, 577, Gx_line+40, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 598, Gx_line+24, 613, Gx_line+40, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(16, Gx_line+41, 760, Gx_line+41, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "(Productos Especiales - Formulas)", ""), 241, Gx_line+0, 445, Gx_line+16, 1+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Formula", ""), 628, Gx_line+24, 693, Gx_line+40, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35PrdTxt, "")), 708, Gx_line+24, 749, Gx_line+40, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+45) ;
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LIN_PRDFOR' Routine */
      returnInSub = false ;
      /* Using cursor P06HL15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV9ForNumCol)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A486ForNumCol = P06HL15_A486ForNumCol[0] ;
         A831TipColCod = P06HL15_A831TipColCod[0] ;
         A483ForColNum = P06HL15_A483ForColNum[0] ;
         A482ForColNom = P06HL15_A482ForColNom[0] ;
         A494ForSer = P06HL15_A494ForSer[0] ;
         A279CliNom = P06HL15_A279CliNom[0] ;
         A252CliCod = P06HL15_A252CliCod[0] ;
         n252CliCod = P06HL15_n252CliCod[0] ;
         A279CliNom = P06HL15_A279CliNom[0] ;
         h6HL0( false, 19) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 20, Gx_line+0, 65, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 74, Gx_line+1, 294, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 297, Gx_line+1, 415, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 423, Gx_line+0, 519, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 529, Gx_line+0, 574, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 598, Gx_line+0, 614, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32PrdNumCol, "")), 706, Gx_line+0, 751, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9ForNumCol), "ZZZZZZZ9")), 633, Gx_line+0, 692, Gx_line+18, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+19) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void h6HL0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 11, Gx_line+11, 324, Gx_line+30, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Informacion Producto", ""), 11, Gx_line+41, 185, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+66, 759, Gx_line+66, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 619, Gx_line+43, 661, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 692, Gx_line+43, 737, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11PrdNom, "")), 252, Gx_line+43, 443, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8PrdNum, "")), 202, Gx_line+43, 247, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha ", ""), 501, Gx_line+13, 541, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 553, Gx_line+13, 612, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Pgmname, "")), 544, Gx_line+43, 764, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 631, Gx_line+13, 660, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 686, Gx_line+13, 745, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 541, Gx_line+13, 545, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 668, Gx_line+13, 672, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 668, Gx_line+43, 672, Gx_line+59, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+71) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV8PrdNum = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P06HL2_A396EmprCod = new String[] {""} ;
      P06HL2_A407EmprNom = new String[] {""} ;
      P06HL2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      P06HL3_A396EmprCod = new String[] {""} ;
      P06HL3_A719PrdNum = new String[] {""} ;
      P06HL3_n719PrdNum = new boolean[] {false} ;
      P06HL3_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV11PrdNom = "" ;
      P06HL4_A396EmprCod = new String[] {""} ;
      P06HL4_A719PrdNum = new String[] {""} ;
      P06HL4_n719PrdNum = new boolean[] {false} ;
      P06HL4_A309ColLin = new short[1] ;
      P06HL4_A486ForNumCol = new int[1] ;
      P06HL5_A396EmprCod = new String[] {""} ;
      P06HL5_A486ForNumCol = new int[1] ;
      P06HL5_A831TipColCod = new byte[1] ;
      P06HL5_A483ForColNum = new int[1] ;
      P06HL5_A482ForColNom = new String[] {""} ;
      P06HL5_A494ForSer = new String[] {""} ;
      P06HL5_A279CliNom = new String[] {""} ;
      P06HL5_A252CliCod = new int[1] ;
      P06HL5_n252CliCod = new boolean[] {false} ;
      P06HL5_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06HL5_n485ForFec = new boolean[] {false} ;
      P06HL5_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P06HL5_n3558ForFecApr = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A279CliNom = "" ;
      A485ForFec = GXutil.nullDate() ;
      A3558ForFecApr = GXutil.nullDate() ;
      P06HL6_A396EmprCod = new String[] {""} ;
      P06HL6_A719PrdNum = new String[] {""} ;
      P06HL6_n719PrdNum = new boolean[] {false} ;
      P06HL6_A5557Lb_LineaC = new short[1] ;
      P06HL6_A5555Lb_opcion = new String[] {""} ;
      P06HL6_A5532Lb_numero = new int[1] ;
      A5555Lb_opcion = "" ;
      AV43Texto_c = "" ;
      AV34ForPrd = "" ;
      P06HL7_A396EmprCod = new String[] {""} ;
      P06HL7_A489ForPrdNor = new short[1] ;
      P06HL7_A715PrdLin = new short[1] ;
      P06HL7_A486ForNumCol = new int[1] ;
      P06HL7_A719PrdNum = new String[] {""} ;
      P06HL7_n719PrdNum = new boolean[] {false} ;
      AV32PrdNumCol = "" ;
      P06HL8_A396EmprCod = new String[] {""} ;
      P06HL8_A719PrdNum = new String[] {""} ;
      P06HL8_n719PrdNum = new boolean[] {false} ;
      P06HL8_A715PrdLin = new short[1] ;
      P06HL8_A486ForNumCol = new int[1] ;
      P06HL9_A396EmprCod = new String[] {""} ;
      P06HL9_A719PrdNum = new String[] {""} ;
      P06HL9_n719PrdNum = new boolean[] {false} ;
      P06HL9_A5560Lb_LineaPr = new short[1] ;
      P06HL9_A5555Lb_opcion = new String[] {""} ;
      P06HL9_A5532Lb_numero = new int[1] ;
      P06HL10_A396EmprCod = new String[] {""} ;
      P06HL10_A719PrdNum = new String[] {""} ;
      P06HL10_n719PrdNum = new boolean[] {false} ;
      P06HL10_A6311Lb_TaAuxD = new String[] {""} ;
      P06HL10_A6310Lb_TaAuxC = new String[] {""} ;
      P06HL10_A6313lb_TaAuxL = new short[1] ;
      P06HL10_A6378Lb_TauxLP = new short[1] ;
      A6311Lb_TaAuxD = "" ;
      A6310Lb_TaAuxC = "" ;
      AV45Lb_taauxc = "" ;
      P06HL11_A396EmprCod = new String[] {""} ;
      P06HL11_A770ProForPrd = new String[] {""} ;
      P06HL11_A766ProForDsc = new String[] {""} ;
      P06HL11_A764ProForCod = new String[] {""} ;
      P06HL11_A767ProForLin = new short[1] ;
      A770ProForPrd = "" ;
      A766ProForDsc = "" ;
      A764ProForCod = "" ;
      P06HL12_A396EmprCod = new String[] {""} ;
      P06HL12_A719PrdNum = new String[] {""} ;
      P06HL12_n719PrdNum = new boolean[] {false} ;
      P06HL12_A1273RecLinPro = new byte[1] ;
      P06HL12_A252CliCod = new int[1] ;
      P06HL12_n252CliCod = new boolean[] {false} ;
      P06HL12_A129BarCod = new int[1] ;
      P06HL12_A132BarCodReo = new byte[1] ;
      P06HL12_A130BarCodPar = new String[] {""} ;
      P06HL12_A212BarSer = new String[] {""} ;
      P06HL12_A135BarColNom = new String[] {""} ;
      P06HL12_A136BarColNum = new int[1] ;
      P06HL12_A218BarTipCol = new byte[1] ;
      P06HL12_A2804RecLinMaq = new short[1] ;
      P06HL12_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HL12_A490ForPrdUMe = new byte[1] ;
      P06HL12_n490ForPrdUMe = new boolean[] {false} ;
      P06HL12_A488ForPrdDsc = new String[] {""} ;
      P06HL12_n488ForPrdDsc = new boolean[] {false} ;
      P06HL12_A213BarSit = new byte[1] ;
      P06HL12_A811RecLin = new short[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV20Barcodpar = "" ;
      AV21barSer = "" ;
      AV22Barcolnom = "" ;
      AV26Prdcant = DecimalUtil.ZERO ;
      AV27Forprddsc = "" ;
      AV31Tot_ct = DecimalUtil.ZERO ;
      P06HL13_A396EmprCod = new String[] {""} ;
      P06HL13_A130BarCodPar = new String[] {""} ;
      P06HL13_A132BarCodReo = new byte[1] ;
      P06HL13_A129BarCod = new int[1] ;
      P06HL13_A150BarFacTin = new String[] {""} ;
      P06HL13_A153BarFasEst = new byte[1] ;
      P06HL13_A194BarOrdLin = new short[1] ;
      P06HL13_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      AV25Maqcod = "" ;
      P06HL14_A396EmprCod = new String[] {""} ;
      P06HL14_A5431RecPriPla = new byte[1] ;
      P06HL14_n5431RecPriPla = new boolean[] {false} ;
      P06HL14_A2804RecLinMaq = new short[1] ;
      P06HL14_A130BarCodPar = new String[] {""} ;
      P06HL14_A132BarCodReo = new byte[1] ;
      P06HL14_A129BarCod = new int[1] ;
      P06HL14_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV35PrdTxt = "" ;
      P06HL15_A396EmprCod = new String[] {""} ;
      P06HL15_A486ForNumCol = new int[1] ;
      P06HL15_A831TipColCod = new byte[1] ;
      P06HL15_A483ForColNum = new int[1] ;
      P06HL15_A482ForColNom = new String[] {""} ;
      P06HL15_A494ForSer = new String[] {""} ;
      P06HL15_A279CliNom = new String[] {""} ;
      P06HL15_A252CliCod = new int[1] ;
      P06HL15_n252CliCod = new boolean[] {false} ;
      Gx_date = GXutil.nullDate() ;
      AV52Pgmname = "" ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0015__default(),
         new Object[] {
             new Object[] {
            P06HL2_A396EmprCod, P06HL2_A407EmprNom, P06HL2_n407EmprNom
            }
            , new Object[] {
            P06HL3_A396EmprCod, P06HL3_A719PrdNum, P06HL3_A718PrdNom
            }
            , new Object[] {
            P06HL4_A396EmprCod, P06HL4_A719PrdNum, P06HL4_A309ColLin, P06HL4_A486ForNumCol
            }
            , new Object[] {
            P06HL5_A396EmprCod, P06HL5_A486ForNumCol, P06HL5_A831TipColCod, P06HL5_A483ForColNum, P06HL5_A482ForColNom, P06HL5_A494ForSer, P06HL5_A279CliNom, P06HL5_A252CliCod, P06HL5_A485ForFec, P06HL5_n485ForFec,
            P06HL5_A3558ForFecApr, P06HL5_n3558ForFecApr
            }
            , new Object[] {
            P06HL6_A396EmprCod, P06HL6_A719PrdNum, P06HL6_A5557Lb_LineaC, P06HL6_A5555Lb_opcion, P06HL6_A5532Lb_numero
            }
            , new Object[] {
            P06HL7_A396EmprCod, P06HL7_A489ForPrdNor, P06HL7_A715PrdLin, P06HL7_A486ForNumCol, P06HL7_A719PrdNum
            }
            , new Object[] {
            P06HL8_A396EmprCod, P06HL8_A719PrdNum, P06HL8_A715PrdLin, P06HL8_A486ForNumCol
            }
            , new Object[] {
            P06HL9_A396EmprCod, P06HL9_A719PrdNum, P06HL9_A5560Lb_LineaPr, P06HL9_A5555Lb_opcion, P06HL9_A5532Lb_numero
            }
            , new Object[] {
            P06HL10_A396EmprCod, P06HL10_A719PrdNum, P06HL10_A6311Lb_TaAuxD, P06HL10_A6310Lb_TaAuxC, P06HL10_A6313lb_TaAuxL, P06HL10_A6378Lb_TauxLP
            }
            , new Object[] {
            P06HL11_A396EmprCod, P06HL11_A770ProForPrd, P06HL11_A766ProForDsc, P06HL11_A764ProForCod, P06HL11_A767ProForLin
            }
            , new Object[] {
            P06HL12_A396EmprCod, P06HL12_A719PrdNum, P06HL12_n719PrdNum, P06HL12_A1273RecLinPro, P06HL12_A252CliCod, P06HL12_n252CliCod, P06HL12_A129BarCod, P06HL12_A132BarCodReo, P06HL12_A130BarCodPar, P06HL12_A212BarSer,
            P06HL12_A135BarColNom, P06HL12_A136BarColNum, P06HL12_A218BarTipCol, P06HL12_A2804RecLinMaq, P06HL12_A686PrdCant, P06HL12_A490ForPrdUMe, P06HL12_n490ForPrdUMe, P06HL12_A488ForPrdDsc, P06HL12_n488ForPrdDsc, P06HL12_A213BarSit,
            P06HL12_A811RecLin
            }
            , new Object[] {
            P06HL13_A396EmprCod, P06HL13_A130BarCodPar, P06HL13_A132BarCodReo, P06HL13_A129BarCod, P06HL13_A150BarFacTin, P06HL13_A153BarFasEst, P06HL13_A194BarOrdLin, P06HL13_A758ProCod
            }
            , new Object[] {
            P06HL14_A396EmprCod, P06HL14_A5431RecPriPla, P06HL14_n5431RecPriPla, P06HL14_A2804RecLinMaq, P06HL14_A130BarCodPar, P06HL14_A132BarCodReo, P06HL14_A129BarCod, P06HL14_A602MaqCod
            }
            , new Object[] {
            P06HL15_A396EmprCod, P06HL15_A486ForNumCol, P06HL15_A831TipColCod, P06HL15_A483ForColNum, P06HL15_A482ForColNom, P06HL15_A494ForSer, P06HL15_A279CliNom, P06HL15_A252CliCod
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      AV52Pgmname = "RST0015" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      AV52Pgmname = "RST0015" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17Tipo ;
   private byte AV39Pr1 ;
   private byte AV40Pr2 ;
   private byte AV37Carvema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV12FlagCol ;
   private byte A831TipColCod ;
   private byte AV13FlagProd ;
   private byte AV14FlagProc ;
   private byte AV16FlagRec ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A490ForPrdUMe ;
   private byte A213BarSit ;
   private byte AV19barcodreo ;
   private byte AV24barTipCol ;
   private byte AV41recmaq ;
   private byte AV29BarSit ;
   private byte AV36Barfasest ;
   private byte A153BarFasEst ;
   private byte AV38recpripla ;
   private byte A5431RecPriPla ;
   private short gxcookieaux ;
   private short A309ColLin ;
   private short A5557Lb_LineaC ;
   private short AV33ForPrdNor ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short A5560Lb_LineaPr ;
   private short A6313lb_TaAuxL ;
   private short A6378Lb_TauxLP ;
   private short A767ProForLin ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV30RecLinMaq ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A486ForNumCol ;
   private int AV9ForNumCol ;
   private int Gx_OldLine ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV44Lb_numero ;
   private int A5532Lb_numero ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV28Clicod ;
   private int AV18barcod ;
   private int AV23Barcolnum ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV26Prdcant ;
   private java.math.BigDecimal AV31Tot_ct ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV11PrdNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A279CliNom ;
   private String A5555Lb_opcion ;
   private String AV43Texto_c ;
   private String AV34ForPrd ;
   private String AV32PrdNumCol ;
   private String A6311Lb_TaAuxD ;
   private String A6310Lb_TaAuxC ;
   private String AV45Lb_taauxc ;
   private String A770ProForPrd ;
   private String A766ProForDsc ;
   private String A764ProForCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A488ForPrdDsc ;
   private String AV20Barcodpar ;
   private String AV21barSer ;
   private String AV22Barcolnom ;
   private String AV27Forprddsc ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String AV25Maqcod ;
   private String A602MaqCod ;
   private String AV35PrdTxt ;
   private String AV52Pgmname ;
   private String Gx_time ;
   private java.util.Date A485ForFec ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n719PrdNum ;
   private boolean n252CliCod ;
   private boolean n485ForFec ;
   private boolean n3558ForFecApr ;
   private boolean returnInSub ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean n5431RecPriPla ;
   private IDataStoreProvider pr_default ;
   private String[] P06HL2_A396EmprCod ;
   private String[] P06HL2_A407EmprNom ;
   private boolean[] P06HL2_n407EmprNom ;
   private String[] P06HL3_A396EmprCod ;
   private String[] P06HL3_A719PrdNum ;
   private boolean[] P06HL3_n719PrdNum ;
   private String[] P06HL3_A718PrdNom ;
   private String[] P06HL4_A396EmprCod ;
   private String[] P06HL4_A719PrdNum ;
   private boolean[] P06HL4_n719PrdNum ;
   private short[] P06HL4_A309ColLin ;
   private int[] P06HL4_A486ForNumCol ;
   private String[] P06HL5_A396EmprCod ;
   private int[] P06HL5_A486ForNumCol ;
   private byte[] P06HL5_A831TipColCod ;
   private int[] P06HL5_A483ForColNum ;
   private String[] P06HL5_A482ForColNom ;
   private String[] P06HL5_A494ForSer ;
   private String[] P06HL5_A279CliNom ;
   private int[] P06HL5_A252CliCod ;
   private boolean[] P06HL5_n252CliCod ;
   private java.util.Date[] P06HL5_A485ForFec ;
   private boolean[] P06HL5_n485ForFec ;
   private java.util.Date[] P06HL5_A3558ForFecApr ;
   private boolean[] P06HL5_n3558ForFecApr ;
   private String[] P06HL6_A396EmprCod ;
   private String[] P06HL6_A719PrdNum ;
   private boolean[] P06HL6_n719PrdNum ;
   private short[] P06HL6_A5557Lb_LineaC ;
   private String[] P06HL6_A5555Lb_opcion ;
   private int[] P06HL6_A5532Lb_numero ;
   private String[] P06HL7_A396EmprCod ;
   private short[] P06HL7_A489ForPrdNor ;
   private short[] P06HL7_A715PrdLin ;
   private int[] P06HL7_A486ForNumCol ;
   private String[] P06HL7_A719PrdNum ;
   private boolean[] P06HL7_n719PrdNum ;
   private String[] P06HL8_A396EmprCod ;
   private String[] P06HL8_A719PrdNum ;
   private boolean[] P06HL8_n719PrdNum ;
   private short[] P06HL8_A715PrdLin ;
   private int[] P06HL8_A486ForNumCol ;
   private String[] P06HL9_A396EmprCod ;
   private String[] P06HL9_A719PrdNum ;
   private boolean[] P06HL9_n719PrdNum ;
   private short[] P06HL9_A5560Lb_LineaPr ;
   private String[] P06HL9_A5555Lb_opcion ;
   private int[] P06HL9_A5532Lb_numero ;
   private String[] P06HL10_A396EmprCod ;
   private String[] P06HL10_A719PrdNum ;
   private boolean[] P06HL10_n719PrdNum ;
   private String[] P06HL10_A6311Lb_TaAuxD ;
   private String[] P06HL10_A6310Lb_TaAuxC ;
   private short[] P06HL10_A6313lb_TaAuxL ;
   private short[] P06HL10_A6378Lb_TauxLP ;
   private String[] P06HL11_A396EmprCod ;
   private String[] P06HL11_A770ProForPrd ;
   private String[] P06HL11_A766ProForDsc ;
   private String[] P06HL11_A764ProForCod ;
   private short[] P06HL11_A767ProForLin ;
   private String[] P06HL12_A396EmprCod ;
   private String[] P06HL12_A719PrdNum ;
   private boolean[] P06HL12_n719PrdNum ;
   private byte[] P06HL12_A1273RecLinPro ;
   private int[] P06HL12_A252CliCod ;
   private boolean[] P06HL12_n252CliCod ;
   private int[] P06HL12_A129BarCod ;
   private byte[] P06HL12_A132BarCodReo ;
   private String[] P06HL12_A130BarCodPar ;
   private String[] P06HL12_A212BarSer ;
   private String[] P06HL12_A135BarColNom ;
   private int[] P06HL12_A136BarColNum ;
   private byte[] P06HL12_A218BarTipCol ;
   private short[] P06HL12_A2804RecLinMaq ;
   private java.math.BigDecimal[] P06HL12_A686PrdCant ;
   private byte[] P06HL12_A490ForPrdUMe ;
   private boolean[] P06HL12_n490ForPrdUMe ;
   private String[] P06HL12_A488ForPrdDsc ;
   private boolean[] P06HL12_n488ForPrdDsc ;
   private byte[] P06HL12_A213BarSit ;
   private short[] P06HL12_A811RecLin ;
   private String[] P06HL13_A396EmprCod ;
   private String[] P06HL13_A130BarCodPar ;
   private byte[] P06HL13_A132BarCodReo ;
   private int[] P06HL13_A129BarCod ;
   private String[] P06HL13_A150BarFacTin ;
   private byte[] P06HL13_A153BarFasEst ;
   private short[] P06HL13_A194BarOrdLin ;
   private String[] P06HL13_A758ProCod ;
   private String[] P06HL14_A396EmprCod ;
   private byte[] P06HL14_A5431RecPriPla ;
   private boolean[] P06HL14_n5431RecPriPla ;
   private short[] P06HL14_A2804RecLinMaq ;
   private String[] P06HL14_A130BarCodPar ;
   private byte[] P06HL14_A132BarCodReo ;
   private int[] P06HL14_A129BarCod ;
   private String[] P06HL14_A602MaqCod ;
   private String[] P06HL15_A396EmprCod ;
   private int[] P06HL15_A486ForNumCol ;
   private byte[] P06HL15_A831TipColCod ;
   private int[] P06HL15_A483ForColNum ;
   private String[] P06HL15_A482ForColNom ;
   private String[] P06HL15_A494ForSer ;
   private String[] P06HL15_A279CliNom ;
   private int[] P06HL15_A252CliCod ;
   private boolean[] P06HL15_n252CliCod ;
}

final  class rst0015__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06HL2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06HL3", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06HL4", "SELECT EmprCod, PrdNum, ColLin, ForNumCol FROM TXPLDFORM WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL5", "SELECT T1.EmprCod, T1.ForNumCol, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T2.CliNom, T1.CliCod, T1.ForFec, T1.ForFecApr FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL6", "SELECT EmprCod, PrdNum, Lb_LineaC, Lb_opcion, Lb_numero FROM TXPENS003 WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL7", "SELECT EmprCod, ForPrdNor, PrdLin, ForNumCol, PrdNum FROM TXPLPRFOR WHERE (EmprCod = ?) AND (ForPrdNor = ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL8", "SELECT EmprCod, PrdNum, PrdLin, ForNumCol FROM TXPLPRFOR WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL9", "SELECT EmprCod, PrdNum, Lb_LineaPr, Lb_opcion, Lb_numero FROM TXPENS004 WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL10", "SELECT T1.EmprCod, T1.PrdNum, T2.Lb_TaAuxD, T1.Lb_TaAuxC, T1.lb_TaAuxL, T1.Lb_TauxLP FROM (TXPENS007 T1 INNER JOIN TXPENS005 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_TaAuxC = T1.Lb_TaAuxC) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.Lb_TaAuxC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL11", "SELECT T1.EmprCod, T1.ProForPrd, T2.ProForDsc, T1.ProForCod, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.ProForPrd = ? ORDER BY T1.EmprCod, T1.ProForPrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL12", "SELECT T1.EmprCod, T1.PrdNum, T1.RecLinPro, T3.CliCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T1.RecLinMaq, T1.PrdCant, T1.ForPrdUMe, T2.ForPrdDsc, T3.BarSit, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL13", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFacTin, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HL14", "SELECT EmprCod, RecPriPla, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (RecPriPla >= ? and RecPriPla <= ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06HL15", "SELECT T1.EmprCod, T1.ForNumCol, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T2.CliNom, T1.CliCod FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,3);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((short[]) buf[20])[0] = rslt.getShort(17);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

