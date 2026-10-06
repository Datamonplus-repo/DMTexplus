package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu020 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu020 pgm = new apsuu020 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu020( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu020.class ), "" );
   }

   public apsuu020( int remoteHandle ,
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
         getPrinter().GxSetDocName("CONTROL RGTOS RECMAQ") ;
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
         apsuu020.this.AV18EmprCod = GXv_char1[0] ;
         apsuu020.this.AV19EmprNom = GXv_char2[0] ;
         apsuu020.this.AV20UsurCod = GXv_char3[0] ;
         AV24Num_rgtos = 0 ;
         AV37Total_rgt = 0 ;
         /* Using cursor P02VI2 */
         pr_default.execute(0, new Object[] {AV18EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4700RecEnvio = P02VI2_A4700RecEnvio[0] ;
            A396EmprCod = P02VI2_A396EmprCod[0] ;
            A129BarCod = P02VI2_A129BarCod[0] ;
            A132BarCodReo = P02VI2_A132BarCodReo[0] ;
            A130BarCodPar = P02VI2_A130BarCodPar[0] ;
            A2804RecLinMaq = P02VI2_A2804RecLinMaq[0] ;
            AV24Num_rgtos = (int)(AV24Num_rgtos+1) ;
            AV37Total_rgt = (int)(AV37Total_rgt+1) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV24Num_rgtos = 0 ;
         AV32DataHora_i = GXutil.serverNow( context, remoteHandle, pr_default) ;
         /* Using cursor P02VI3 */
         pr_default.execute(1, new Object[] {AV18EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4700RecEnvio = P02VI3_A4700RecEnvio[0] ;
            A396EmprCod = P02VI3_A396EmprCod[0] ;
            A129BarCod = P02VI3_A129BarCod[0] ;
            A130BarCodPar = P02VI3_A130BarCodPar[0] ;
            A132BarCodReo = P02VI3_A132BarCodReo[0] ;
            A4258RecMaqFas = P02VI3_A4258RecMaqFas[0] ;
            n4258RecMaqFas = P02VI3_n4258RecMaqFas[0] ;
            A4268RecOrdLin = P02VI3_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P02VI3_n4268RecOrdLin[0] ;
            A4654RecNroPar = P02VI3_A4654RecNroPar[0] ;
            n4654RecNroPar = P02VI3_n4654RecNroPar[0] ;
            A602MaqCod = P02VI3_A602MaqCod[0] ;
            A4866RecFecAlt = P02VI3_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P02VI3_n4866RecFecAlt[0] ;
            A2804RecLinMaq = P02VI3_A2804RecLinMaq[0] ;
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
            if ( AV31Flag_act == 1 )
            {
               h2VI0( false, 15) ;
               getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 6, Gx_line+0, 74, Gx_line+15, 2+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27BarOrdLin), "ZZZ9")), 200, Gx_line+0, 234, Gx_line+15, 2+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28RecNroPar), "ZZZZZ9")), 123, Gx_line+0, 174, Gx_line+15, 2+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 763, Gx_line+0, 814, Gx_line+15, 0+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29FasDsc2, "")), 251, Gx_line+0, 752, Gx_line+15, 0+256, 0, 1, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV38Barfasdti, "99/99/99 99:99:99"), 763, Gx_line+0, 906, Gx_line+15, 0+256, 0, 1, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV39Barfasdtf, "99/99/99 99:99:99"), 919, Gx_line+0, 1062, Gx_line+15, 0+256, 0, 1, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 77, Gx_line+0, 86, Gx_line+15, 0+256, 0, 1, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+15) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV33DataHora_f = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h2VI0( false, 15) ;
         getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV33DataHora_f, "99/99/99 99:99"), 463, Gx_line+0, 581, Gx_line+15, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 431, Gx_line+0, 450, Gx_line+14, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+15) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2VI0( true, 0) ;
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
      /* Using cursor P02VI4 */
      pr_default.execute(2, new Object[] {AV18EmprCod, AV26FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P02VI4_A457FasCod[0] ;
         A396EmprCod = P02VI4_A396EmprCod[0] ;
         A4642FasDsc2 = P02VI4_A4642FasDsc2[0] ;
         n4642FasDsc2 = P02VI4_n4642FasDsc2[0] ;
         A460FasDsc = P02VI4_A460FasDsc[0] ;
         AV29FasDsc2 = GXutil.trim( A460FasDsc) + GXutil.trim( A4642FasDsc2) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'LECTOR' Routine */
      returnInSub = false ;
      AV31Flag_act = (byte)(0) ;
      AV38Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV39Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      /* Using cursor P02VI5 */
      pr_default.execute(3, new Object[] {AV18EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV23BarCodReo), AV22BarCodPar, Short.valueOf(AV27BarOrdLin), Integer.valueOf(AV28RecNroPar)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P02VI5_A396EmprCod[0] ;
         A129BarCod = P02VI5_A129BarCod[0] ;
         A132BarCodReo = P02VI5_A132BarCodReo[0] ;
         A130BarCodPar = P02VI5_A130BarCodPar[0] ;
         A194BarOrdLin = P02VI5_A194BarOrdLin[0] ;
         A4704HisProNPar = P02VI5_A4704HisProNPar[0] ;
         A557HisProF = P02VI5_A557HisProF[0] ;
         A4440HisProDTI = P02VI5_A4440HisProDTI[0] ;
         n4440HisProDTI = P02VI5_n4440HisProDTI[0] ;
         A4441HisProDTF = P02VI5_A4441HisProDTF[0] ;
         n4441HisProDTF = P02VI5_n4441HisProDTF[0] ;
         A602MaqCod = P02VI5_A602MaqCod[0] ;
         A558HisProFec = P02VI5_A558HisProFec[0] ;
         A561HisProLin = P02VI5_A561HisProLin[0] ;
         if ( GXutil.strcmp(A557HisProF, httpContext.getMessage( "S", "")) == 0 )
         {
            AV31Flag_act = (byte)(1) ;
            AV38Barfasdti = A4440HisProDTI ;
            AV39Barfasdtf = A4441HisProDTF ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h2VI0( boolean bFoot ,
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
            getPrinter().GxDrawText(httpContext.getMessage( "OP", ""), 6, Gx_line+41, 25, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Bache", ""), 123, Gx_line+41, 162, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 200, Gx_line+41, 236, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 251, Gx_line+41, 280, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 906, Gx_line+0, 948, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 956, Gx_line+0, 1007, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recetas Quimicas Cerradas", ""), 6, Gx_line+0, 170, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Lucida Console", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV32DataHora_i, "99/99/99 99:99"), 463, Gx_line+0, 581, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 419, Gx_line+0, 452, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 763, Gx_line+41, 796, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 919, Gx_line+41, 938, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+54, 85, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(123, Gx_line+54, 173, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(200, Gx_line+54, 236, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(251, Gx_line+54, 751, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+54, 905, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(919, Gx_line+54, 1061, Gx_line+54, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+58) ;
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
      GXutil.refClasses(psuu020.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
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
      P02VI2_A4700RecEnvio = new byte[1] ;
      P02VI2_A396EmprCod = new String[] {""} ;
      P02VI2_A129BarCod = new int[1] ;
      P02VI2_A132BarCodReo = new byte[1] ;
      P02VI2_A130BarCodPar = new String[] {""} ;
      P02VI2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV32DataHora_i = GXutil.resetTime( GXutil.nullDate() );
      P02VI3_A4700RecEnvio = new byte[1] ;
      P02VI3_A396EmprCod = new String[] {""} ;
      P02VI3_A129BarCod = new int[1] ;
      P02VI3_A130BarCodPar = new String[] {""} ;
      P02VI3_A132BarCodReo = new byte[1] ;
      P02VI3_A4258RecMaqFas = new String[] {""} ;
      P02VI3_n4258RecMaqFas = new boolean[] {false} ;
      P02VI3_A4268RecOrdLin = new short[1] ;
      P02VI3_n4268RecOrdLin = new boolean[] {false} ;
      P02VI3_A4654RecNroPar = new int[1] ;
      P02VI3_n4654RecNroPar = new boolean[] {false} ;
      P02VI3_A602MaqCod = new String[] {""} ;
      P02VI3_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P02VI3_n4866RecFecAlt = new boolean[] {false} ;
      P02VI3_A2804RecLinMaq = new short[1] ;
      A4258RecMaqFas = "" ;
      A602MaqCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV22BarCodPar = "" ;
      AV26FasCod = "" ;
      AV30MaqCod = "" ;
      AV34Data_a = "" ;
      AV35Data_d = GXutil.nullDate() ;
      AV29FasDsc2 = "" ;
      AV38Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV39Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV33DataHora_f = GXutil.resetTime( GXutil.nullDate() );
      P02VI4_A457FasCod = new String[] {""} ;
      P02VI4_A396EmprCod = new String[] {""} ;
      P02VI4_A4642FasDsc2 = new String[] {""} ;
      P02VI4_n4642FasDsc2 = new boolean[] {false} ;
      P02VI4_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A4642FasDsc2 = "" ;
      A460FasDsc = "" ;
      P02VI5_A396EmprCod = new String[] {""} ;
      P02VI5_A129BarCod = new int[1] ;
      P02VI5_A132BarCodReo = new byte[1] ;
      P02VI5_A130BarCodPar = new String[] {""} ;
      P02VI5_A194BarOrdLin = new short[1] ;
      P02VI5_A4704HisProNPar = new int[1] ;
      P02VI5_A557HisProF = new String[] {""} ;
      P02VI5_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P02VI5_n4440HisProDTI = new boolean[] {false} ;
      P02VI5_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P02VI5_n4441HisProDTF = new boolean[] {false} ;
      P02VI5_A602MaqCod = new String[] {""} ;
      P02VI5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02VI5_A561HisProLin = new int[1] ;
      A557HisProF = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu020__default(),
         new Object[] {
             new Object[] {
            P02VI2_A4700RecEnvio, P02VI2_A396EmprCod, P02VI2_A129BarCod, P02VI2_A132BarCodReo, P02VI2_A130BarCodPar, P02VI2_A2804RecLinMaq
            }
            , new Object[] {
            P02VI3_A4700RecEnvio, P02VI3_A396EmprCod, P02VI3_A129BarCod, P02VI3_A130BarCodPar, P02VI3_A132BarCodReo, P02VI3_A4258RecMaqFas, P02VI3_n4258RecMaqFas, P02VI3_A4268RecOrdLin, P02VI3_n4268RecOrdLin, P02VI3_A4654RecNroPar,
            P02VI3_n4654RecNroPar, P02VI3_A602MaqCod, P02VI3_A4866RecFecAlt, P02VI3_n4866RecFecAlt, P02VI3_A2804RecLinMaq
            }
            , new Object[] {
            P02VI4_A457FasCod, P02VI4_A396EmprCod, P02VI4_A4642FasDsc2, P02VI4_n4642FasDsc2, P02VI4_A460FasDsc
            }
            , new Object[] {
            P02VI5_A396EmprCod, P02VI5_A129BarCod, P02VI5_A132BarCodReo, P02VI5_A130BarCodPar, P02VI5_A194BarOrdLin, P02VI5_A4704HisProNPar, P02VI5_A557HisProF, P02VI5_A4440HisProDTI, P02VI5_n4440HisProDTI, P02VI5_A4441HisProDTF,
            P02VI5_n4441HisProDTF, P02VI5_A602MaqCod, P02VI5_A558HisProFec, P02VI5_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A4700RecEnvio ;
   private byte A132BarCodReo ;
   private byte AV23BarCodReo ;
   private byte AV31Flag_act ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV36Porcent ;
   private short AV27BarOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV24Num_rgtos ;
   private int AV37Total_rgt ;
   private int A129BarCod ;
   private int A4654RecNroPar ;
   private int AV21BarCod ;
   private int AV28RecNroPar ;
   private int Gx_OldLine ;
   private int A4704HisProNPar ;
   private int A561HisProLin ;
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
   private String A4258RecMaqFas ;
   private String A602MaqCod ;
   private String AV22BarCodPar ;
   private String AV26FasCod ;
   private String AV30MaqCod ;
   private String AV34Data_a ;
   private String AV29FasDsc2 ;
   private String A457FasCod ;
   private String A4642FasDsc2 ;
   private String A460FasDsc ;
   private String A557HisProF ;
   private java.util.Date AV32DataHora_i ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV38Barfasdti ;
   private java.util.Date AV39Barfasdtf ;
   private java.util.Date AV33DataHora_f ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV35Data_d ;
   private java.util.Date A558HisProFec ;
   private boolean n4258RecMaqFas ;
   private boolean n4268RecOrdLin ;
   private boolean n4654RecNroPar ;
   private boolean n4866RecFecAlt ;
   private boolean returnInSub ;
   private boolean n4642FasDsc2 ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private IDataStoreProvider pr_default ;
   private byte[] P02VI2_A4700RecEnvio ;
   private String[] P02VI2_A396EmprCod ;
   private int[] P02VI2_A129BarCod ;
   private byte[] P02VI2_A132BarCodReo ;
   private String[] P02VI2_A130BarCodPar ;
   private short[] P02VI2_A2804RecLinMaq ;
   private byte[] P02VI3_A4700RecEnvio ;
   private String[] P02VI3_A396EmprCod ;
   private int[] P02VI3_A129BarCod ;
   private String[] P02VI3_A130BarCodPar ;
   private byte[] P02VI3_A132BarCodReo ;
   private String[] P02VI3_A4258RecMaqFas ;
   private boolean[] P02VI3_n4258RecMaqFas ;
   private short[] P02VI3_A4268RecOrdLin ;
   private boolean[] P02VI3_n4268RecOrdLin ;
   private int[] P02VI3_A4654RecNroPar ;
   private boolean[] P02VI3_n4654RecNroPar ;
   private String[] P02VI3_A602MaqCod ;
   private java.util.Date[] P02VI3_A4866RecFecAlt ;
   private boolean[] P02VI3_n4866RecFecAlt ;
   private short[] P02VI3_A2804RecLinMaq ;
   private String[] P02VI4_A457FasCod ;
   private String[] P02VI4_A396EmprCod ;
   private String[] P02VI4_A4642FasDsc2 ;
   private boolean[] P02VI4_n4642FasDsc2 ;
   private String[] P02VI4_A460FasDsc ;
   private String[] P02VI5_A396EmprCod ;
   private int[] P02VI5_A129BarCod ;
   private byte[] P02VI5_A132BarCodReo ;
   private String[] P02VI5_A130BarCodPar ;
   private short[] P02VI5_A194BarOrdLin ;
   private int[] P02VI5_A4704HisProNPar ;
   private String[] P02VI5_A557HisProF ;
   private java.util.Date[] P02VI5_A4440HisProDTI ;
   private boolean[] P02VI5_n4440HisProDTI ;
   private java.util.Date[] P02VI5_A4441HisProDTF ;
   private boolean[] P02VI5_n4441HisProDTF ;
   private String[] P02VI5_A602MaqCod ;
   private java.util.Date[] P02VI5_A558HisProFec ;
   private int[] P02VI5_A561HisProLin ;
}

final  class apsuu020__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VI2", "SELECT RecEnvio, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and RecEnvio >= 0 ORDER BY EmprCod, RecEnvio ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VI3", "SELECT RecEnvio, EmprCod, BarCod, BarCodPar, BarCodReo, RecMaqFas, RecOrdLin, RecNroPar, MaqCod, RecFecAlt, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and RecEnvio >= 0 ORDER BY EmprCod, RecEnvio ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VI4", "SELECT FasCod, EmprCod, FasDsc2, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VI5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProNPar, HisProF, HisProDTI, HisProDTF, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and HisProNPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProNPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

