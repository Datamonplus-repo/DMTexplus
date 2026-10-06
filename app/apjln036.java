package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln036 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln036 pgm = new apjln036 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln036( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln036.class ), "" );
   }

   public apjln036( int remoteHandle ,
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("CONTROL REGTOS RECMAQ") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV17Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV18EmprCod ;
         GXv_char2[0] = AV19EmprNom ;
         GXv_char3[0] = AV20UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char1, GXv_char2, GXv_char3) ;
         apjln036.this.AV18EmprCod = GXv_char1[0] ;
         apjln036.this.AV19EmprNom = GXv_char2[0] ;
         apjln036.this.AV20UsurCod = GXv_char3[0] ;
         AV24Num_rgtos = 0 ;
         AV37Total_rgt = 0 ;
         /* Using cursor P01K02 */
         pr_default.execute(0, new Object[] {AV18EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P01K02_A396EmprCod[0] ;
            A4700RecEnvio = P01K02_A4700RecEnvio[0] ;
            A4654RecNroPar = P01K02_A4654RecNroPar[0] ;
            n4654RecNroPar = P01K02_n4654RecNroPar[0] ;
            A130BarCodPar = P01K02_A130BarCodPar[0] ;
            A132BarCodReo = P01K02_A132BarCodReo[0] ;
            A129BarCod = P01K02_A129BarCod[0] ;
            A4866RecFecAlt = P01K02_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P01K02_n4866RecFecAlt[0] ;
            A602MaqCod = P01K02_A602MaqCod[0] ;
            A2804RecLinMaq = P01K02_A2804RecLinMaq[0] ;
            AV24Num_rgtos = (int)(AV24Num_rgtos+1) ;
            AV37Total_rgt = (int)(AV37Total_rgt+1) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV24Num_rgtos = 0 ;
         AV32DataHora_i = GXutil.serverNow( context, remoteHandle, pr_default) ;
         /* Using cursor P01K03 */
         pr_default.execute(1, new Object[] {AV18EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P01K03_A396EmprCod[0] ;
            A4700RecEnvio = P01K03_A4700RecEnvio[0] ;
            A4258RecMaqFas = P01K03_A4258RecMaqFas[0] ;
            n4258RecMaqFas = P01K03_n4258RecMaqFas[0] ;
            A4268RecOrdLin = P01K03_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P01K03_n4268RecOrdLin[0] ;
            A4701RecRecep = P01K03_A4701RecRecep[0] ;
            A4654RecNroPar = P01K03_A4654RecNroPar[0] ;
            n4654RecNroPar = P01K03_n4654RecNroPar[0] ;
            A130BarCodPar = P01K03_A130BarCodPar[0] ;
            A132BarCodReo = P01K03_A132BarCodReo[0] ;
            A129BarCod = P01K03_A129BarCod[0] ;
            A4866RecFecAlt = P01K03_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P01K03_n4866RecFecAlt[0] ;
            A602MaqCod = P01K03_A602MaqCod[0] ;
            A2804RecLinMaq = P01K03_A2804RecLinMaq[0] ;
            AV36Porcent = (short)(0) ;
            if ( AV37Total_rgt > 0 )
            {
               AV36Porcent = (short)((AV24Num_rgtos/ (double) (AV37Total_rgt))*100) ;
            }
            AV24Num_rgtos = (int)(AV24Num_rgtos+1) ;
            AV21BarCod = A129BarCod ;
            AV22BarCodPar = A130BarCodPar ;
            AV23BarCodReo = A132BarCodReo ;
            AV26FasCod = A4258RecMaqFas ;
            AV27BarOrdLin = A4268RecOrdLin ;
            AV28RecNroPar = A4654RecNroPar ;
            AV30MaqCod = A602MaqCod ;
            AV34Data_a = localUtil.ttoc( A4866RecFecAlt, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV35Data_d = localUtil.ctod( AV34Data_a, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            /* Execute user subroutine: 'LECTOR' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'FASPRO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV31Flag_act == 0 )
            {
               h1K00( false, 15) ;
               getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 6, Gx_line+0, 74, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 103, Gx_line+1, 112, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 84, Gx_line+1, 93, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27BarOrdLin), "ZZZ9")), 200, Gx_line+0, 234, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28RecNroPar), "ZZZZZ9")), 123, Gx_line+1, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29FasDsc2, "")), 251, Gx_line+0, 752, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 844, Gx_line+1, 962, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 763, Gx_line+0, 814, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV35Data_d, "99/99/99"), 994, Gx_line+0, 1062, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+15) ;
               A4701RecRecep = (byte)(1) ;
            }
            else
            {
               h1K00( false, 15) ;
               getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 6, Gx_line+0, 74, Gx_line+15, 2+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 103, Gx_line+0, 112, Gx_line+15, 0+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 84, Gx_line+0, 93, Gx_line+15, 2+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27BarOrdLin), "ZZZ9")), 200, Gx_line+0, 234, Gx_line+15, 2+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28RecNroPar), "ZZZZZ9")), 123, Gx_line+0, 174, Gx_line+15, 2+256, 0, 1, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 844, Gx_line+0, 962, Gx_line+15, 0+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 763, Gx_line+0, 814, Gx_line+15, 0+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29FasDsc2, "")), 251, Gx_line+0, 752, Gx_line+15, 0+256, 0, 1, 0) ;
               getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV35Data_d, "99/99/99"), 994, Gx_line+0, 1062, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+15) ;
            }
            /* Using cursor P01K04 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A4701RecRecep), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV33DataHora_f = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h1K00( false, 15) ;
         getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV33DataHora_f, "99/99/99 99:99"), 463, Gx_line+0, 581, Gx_line+15, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fim", ""), 431, Gx_line+0, 452, Gx_line+14, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+15) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1K00( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV29FasDsc2 = GXutil.space( (short)(60)) ;
      /* Using cursor P01K05 */
      pr_default.execute(3, new Object[] {AV18EmprCod, AV26FasCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A457FasCod = P01K05_A457FasCod[0] ;
         A396EmprCod = P01K05_A396EmprCod[0] ;
         A4642FasDsc2 = P01K05_A4642FasDsc2[0] ;
         n4642FasDsc2 = P01K05_n4642FasDsc2[0] ;
         AV29FasDsc2 = A4642FasDsc2 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'LECTOR' Routine */
      returnInSub = false ;
      AV31Flag_act = (byte)(0) ;
      /* Using cursor P01K06 */
      pr_default.execute(4, new Object[] {AV18EmprCod, AV30MaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1166LecMaqCod = P01K06_A1166LecMaqCod[0] ;
         A396EmprCod = P01K06_A396EmprCod[0] ;
         A1188LecFasOrd = P01K06_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P01K06_n1188LecFasOrd[0] ;
         A4702LecNumLot = P01K06_A4702LecNumLot[0] ;
         n4702LecNumLot = P01K06_n4702LecNumLot[0] ;
         A1169LecBarPar = P01K06_A1169LecBarPar[0] ;
         n1169LecBarPar = P01K06_n1169LecBarPar[0] ;
         A1168LecBarReo = P01K06_A1168LecBarReo[0] ;
         n1168LecBarReo = P01K06_n1168LecBarReo[0] ;
         A1167LecBarCod = P01K06_A1167LecBarCod[0] ;
         n1167LecBarCod = P01K06_n1167LecBarCod[0] ;
         if ( ( AV21BarCod == A1167LecBarCod ) && ( AV23BarCodReo == A1168LecBarReo ) && ( GXutil.strcmp(AV22BarCodPar, A1169LecBarPar) == 0 ) && ( AV28RecNroPar == A4702LecNumLot ) && ( AV27BarOrdLin == A1188LecFasOrd ) )
         {
            AV31Flag_act = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void h1K00( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço", ""), 6, Gx_line+41, 93, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Partida", ""), 123, Gx_line+41, 184, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem", ""), 200, Gx_line+41, 239, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 251, Gx_line+41, 280, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data Alta Receita", ""), 844, Gx_line+41, 950, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+54, 1026, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 906, Gx_line+0, 948, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 956, Gx_line+0, 1007, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 763, Gx_line+41, 814, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Receitas enviadas a Termoelectronica", ""), 6, Gx_line+0, 234, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV32DataHora_i, "99/99/99 99:99"), 463, Gx_line+0, 581, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 419, Gx_line+0, 452, Gx_line+14, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+68) ;
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

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln036.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln036");
      if (Application.realMainProgram == this)	waitPrinterEnd();
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Station = "" ;
      AV18EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV20UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P01K02_A396EmprCod = new String[] {""} ;
      P01K02_A4700RecEnvio = new byte[1] ;
      P01K02_A4654RecNroPar = new int[1] ;
      P01K02_n4654RecNroPar = new boolean[] {false} ;
      P01K02_A130BarCodPar = new String[] {""} ;
      P01K02_A132BarCodReo = new byte[1] ;
      P01K02_A129BarCod = new int[1] ;
      P01K02_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P01K02_n4866RecFecAlt = new boolean[] {false} ;
      P01K02_A602MaqCod = new String[] {""} ;
      P01K02_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      AV32DataHora_i = GXutil.resetTime( GXutil.nullDate() );
      P01K03_A396EmprCod = new String[] {""} ;
      P01K03_A4700RecEnvio = new byte[1] ;
      P01K03_A4258RecMaqFas = new String[] {""} ;
      P01K03_n4258RecMaqFas = new boolean[] {false} ;
      P01K03_A4268RecOrdLin = new short[1] ;
      P01K03_n4268RecOrdLin = new boolean[] {false} ;
      P01K03_A4701RecRecep = new byte[1] ;
      P01K03_A4654RecNroPar = new int[1] ;
      P01K03_n4654RecNroPar = new boolean[] {false} ;
      P01K03_A130BarCodPar = new String[] {""} ;
      P01K03_A132BarCodReo = new byte[1] ;
      P01K03_A129BarCod = new int[1] ;
      P01K03_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P01K03_n4866RecFecAlt = new boolean[] {false} ;
      P01K03_A602MaqCod = new String[] {""} ;
      P01K03_A2804RecLinMaq = new short[1] ;
      A4258RecMaqFas = "" ;
      AV22BarCodPar = "" ;
      AV26FasCod = "" ;
      AV30MaqCod = "" ;
      AV34Data_a = "" ;
      AV35Data_d = GXutil.nullDate() ;
      AV29FasDsc2 = "" ;
      AV33DataHora_f = GXutil.resetTime( GXutil.nullDate() );
      P01K05_A457FasCod = new String[] {""} ;
      P01K05_A396EmprCod = new String[] {""} ;
      P01K05_A4642FasDsc2 = new String[] {""} ;
      P01K05_n4642FasDsc2 = new boolean[] {false} ;
      A457FasCod = "" ;
      A4642FasDsc2 = "" ;
      P01K06_A1166LecMaqCod = new String[] {""} ;
      P01K06_A396EmprCod = new String[] {""} ;
      P01K06_A1188LecFasOrd = new short[1] ;
      P01K06_n1188LecFasOrd = new boolean[] {false} ;
      P01K06_A4702LecNumLot = new int[1] ;
      P01K06_n4702LecNumLot = new boolean[] {false} ;
      P01K06_A1169LecBarPar = new String[] {""} ;
      P01K06_n1169LecBarPar = new boolean[] {false} ;
      P01K06_A1168LecBarReo = new byte[1] ;
      P01K06_n1168LecBarReo = new boolean[] {false} ;
      P01K06_A1167LecBarCod = new int[1] ;
      P01K06_n1167LecBarCod = new boolean[] {false} ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln036__default(),
         new Object[] {
             new Object[] {
            P01K02_A396EmprCod, P01K02_A4700RecEnvio, P01K02_A4654RecNroPar, P01K02_n4654RecNroPar, P01K02_A130BarCodPar, P01K02_A132BarCodReo, P01K02_A129BarCod, P01K02_A4866RecFecAlt, P01K02_n4866RecFecAlt, P01K02_A602MaqCod,
            P01K02_A2804RecLinMaq
            }
            , new Object[] {
            P01K03_A396EmprCod, P01K03_A4700RecEnvio, P01K03_A4258RecMaqFas, P01K03_n4258RecMaqFas, P01K03_A4268RecOrdLin, P01K03_n4268RecOrdLin, P01K03_A4701RecRecep, P01K03_A4654RecNroPar, P01K03_n4654RecNroPar, P01K03_A130BarCodPar,
            P01K03_A132BarCodReo, P01K03_A129BarCod, P01K03_A4866RecFecAlt, P01K03_n4866RecFecAlt, P01K03_A602MaqCod, P01K03_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            P01K05_A457FasCod, P01K05_A396EmprCod, P01K05_A4642FasDsc2, P01K05_n4642FasDsc2
            }
            , new Object[] {
            P01K06_A1166LecMaqCod, P01K06_A396EmprCod, P01K06_A1188LecFasOrd, P01K06_n1188LecFasOrd, P01K06_A4702LecNumLot, P01K06_n4702LecNumLot, P01K06_A1169LecBarPar, P01K06_n1169LecBarPar, P01K06_A1168LecBarReo, P01K06_n1168LecBarReo,
            P01K06_A1167LecBarCod, P01K06_n1167LecBarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A4700RecEnvio ;
   private byte A132BarCodReo ;
   private byte A4701RecRecep ;
   private byte AV23BarCodReo ;
   private byte AV31Flag_act ;
   private byte A1168LecBarReo ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV36Porcent ;
   private short AV27BarOrdLin ;
   private short A1188LecFasOrd ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV24Num_rgtos ;
   private int AV37Total_rgt ;
   private int A4654RecNroPar ;
   private int A129BarCod ;
   private int AV21BarCod ;
   private int AV28RecNroPar ;
   private int Gx_OldLine ;
   private int A4702LecNumLot ;
   private int A1167LecBarCod ;
   private String AV17Station ;
   private String AV18EmprCod ;
   private String GXv_char1[] ;
   private String AV19EmprNom ;
   private String GXv_char2[] ;
   private String AV20UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A4258RecMaqFas ;
   private String AV22BarCodPar ;
   private String AV26FasCod ;
   private String AV30MaqCod ;
   private String AV34Data_a ;
   private String AV29FasDsc2 ;
   private String A457FasCod ;
   private String A4642FasDsc2 ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV32DataHora_i ;
   private java.util.Date AV33DataHora_f ;
   private java.util.Date AV35Data_d ;
   private boolean n4654RecNroPar ;
   private boolean n4866RecFecAlt ;
   private boolean n4258RecMaqFas ;
   private boolean n4268RecOrdLin ;
   private boolean returnInSub ;
   private boolean n4642FasDsc2 ;
   private boolean n1188LecFasOrd ;
   private boolean n4702LecNumLot ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private IDataStoreProvider pr_default ;
   private String[] P01K02_A396EmprCod ;
   private byte[] P01K02_A4700RecEnvio ;
   private int[] P01K02_A4654RecNroPar ;
   private boolean[] P01K02_n4654RecNroPar ;
   private String[] P01K02_A130BarCodPar ;
   private byte[] P01K02_A132BarCodReo ;
   private int[] P01K02_A129BarCod ;
   private java.util.Date[] P01K02_A4866RecFecAlt ;
   private boolean[] P01K02_n4866RecFecAlt ;
   private String[] P01K02_A602MaqCod ;
   private short[] P01K02_A2804RecLinMaq ;
   private String[] P01K03_A396EmprCod ;
   private byte[] P01K03_A4700RecEnvio ;
   private String[] P01K03_A4258RecMaqFas ;
   private boolean[] P01K03_n4258RecMaqFas ;
   private short[] P01K03_A4268RecOrdLin ;
   private boolean[] P01K03_n4268RecOrdLin ;
   private byte[] P01K03_A4701RecRecep ;
   private int[] P01K03_A4654RecNroPar ;
   private boolean[] P01K03_n4654RecNroPar ;
   private String[] P01K03_A130BarCodPar ;
   private byte[] P01K03_A132BarCodReo ;
   private int[] P01K03_A129BarCod ;
   private java.util.Date[] P01K03_A4866RecFecAlt ;
   private boolean[] P01K03_n4866RecFecAlt ;
   private String[] P01K03_A602MaqCod ;
   private short[] P01K03_A2804RecLinMaq ;
   private String[] P01K05_A457FasCod ;
   private String[] P01K05_A396EmprCod ;
   private String[] P01K05_A4642FasDsc2 ;
   private boolean[] P01K05_n4642FasDsc2 ;
   private String[] P01K06_A1166LecMaqCod ;
   private String[] P01K06_A396EmprCod ;
   private short[] P01K06_A1188LecFasOrd ;
   private boolean[] P01K06_n1188LecFasOrd ;
   private int[] P01K06_A4702LecNumLot ;
   private boolean[] P01K06_n4702LecNumLot ;
   private String[] P01K06_A1169LecBarPar ;
   private boolean[] P01K06_n1169LecBarPar ;
   private byte[] P01K06_A1168LecBarReo ;
   private boolean[] P01K06_n1168LecBarReo ;
   private int[] P01K06_A1167LecBarCod ;
   private boolean[] P01K06_n1167LecBarCod ;
}

final  class apjln036__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01K02", "SELECT EmprCod, RecEnvio, RecNroPar, BarCodPar, BarCodReo, BarCod, RecFecAlt, MaqCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and RecEnvio = 1 ORDER BY EmprCod, RecEnvio, MaqCod, RecFecAlt, BarCod, BarCodReo, BarCodPar, RecNroPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01K03", "SELECT EmprCod, RecEnvio, RecMaqFas, RecOrdLin, RecRecep, RecNroPar, BarCodPar, BarCodReo, BarCod, RecFecAlt, MaqCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and RecEnvio = 1 ORDER BY EmprCod, RecEnvio, MaqCod, RecFecAlt, BarCod, BarCodReo, BarCodPar, RecNroPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01K04", "UPDATE TXPRECMAQ SET RecRecep=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P01K05", "SELECT FasCod, EmprCod, FasDsc2 FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01K06", "SELECT LecMaqCod, EmprCod, LecFasOrd, LecNumLot, LecBarPar, LecBarReo, LecBarCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

