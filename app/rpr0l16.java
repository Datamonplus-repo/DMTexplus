package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rpr0l16 extends GXReport
{
   public rpr0l16( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpr0l16.class ), "" );
   }

   public rpr0l16( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          java.util.Date[] aP1 ,
                          String[] aP2 ,
                          java.util.Date[] aP3 ,
                          String[] aP4 ,
                          byte[] aP5 ,
                          byte[] aP6 ,
                          int[] aP7 )
   {
      rpr0l16.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 )
   {
      rpr0l16.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rpr0l16.this.AV17Pfec = aP1[0];
      this.aP1 = aP1;
      rpr0l16.this.AV19Pmaq = aP2[0];
      this.aP2 = aP2;
      rpr0l16.this.AV18Ufec = aP3[0];
      this.aP3 = aP3;
      rpr0l16.this.AV20Umaq = aP4[0];
      this.aP4 = aP4;
      rpr0l16.this.AV55PTurno = aP5[0];
      this.aP5 = aP5;
      rpr0l16.this.AV56UTurno = aP6[0];
      this.aP6 = aP6;
      rpr0l16.this.AV70PCliCod = aP7[0];
      this.aP7 = aP7;
      rpr0l16.this.AV71UCliCod = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("LIST PROD GENERAL (LAV)") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV28Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit1 = GXt_char1 ;
         GXt_char1 = AV63Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV63Lit2 = GXt_char1 ;
         GXt_char1 = AV29Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit3 = GXt_char1 ;
         GXt_char1 = AV38Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit4 = GXt_char1 ;
         GXt_char1 = AV40Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit6 = GXt_char1 ;
         GXt_char1 = AV41Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit7 = GXt_char1 ;
         GXt_char1 = AV42Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit8 = GXt_char1 ;
         GXt_char1 = AV43Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit9 = GXt_char1 ;
         GXt_char1 = AV44Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit10 = GXt_char1 ;
         GXt_char1 = AV68Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1150_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV68Lit11 = GXutil.trim( GXt_char1) ;
         GXt_char1 = AV67Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV67Lit12 = GXt_char1 ;
         GXt_char1 = AV64Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT174_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV64Lit13 = GXt_char1 ;
         AV64Lit13 = GXutil.substring( AV64Lit13, 1, 6) ;
         GXt_char1 = AV65Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT175_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV65Lit14 = GXt_char1 ;
         AV65Lit14 = GXutil.substring( AV65Lit14, 1, 6) ;
         GXt_char1 = AV66Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV66Lit15 = GXt_char1 ;
         GXt_char1 = AV69Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "PR0016", ""), (byte)(99), GXv_char2) ;
         rpr0l16.this.GXt_char1 = GXv_char2[0] ;
         AV69Lit18 = GXt_char1 ;
         /* Using cursor P06VR2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06VR2_A407EmprNom[0] ;
            n407EmprNom = P06VR2_n407EmprNom[0] ;
            AV25NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06VR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV19Pmaq, AV17Pfec, AV18Ufec, Byte.valueOf(AV55PTurno), Byte.valueOf(AV56UTurno), Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71UCliCod), AV20Umaq});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6VR3 = false ;
            A656ParCod = P06VR3_A656ParCod[0] ;
            n656ParCod = P06VR3_n656ParCod[0] ;
            A556HisProEst = P06VR3_A556HisProEst[0] ;
            A461Fase = P06VR3_A461Fase[0] ;
            A130BarCodPar = P06VR3_A130BarCodPar[0] ;
            A132BarCodReo = P06VR3_A132BarCodReo[0] ;
            A129BarCod = P06VR3_A129BarCod[0] ;
            A3610HisProLot = P06VR3_A3610HisProLot[0] ;
            A4704HisProNPar = P06VR3_A4704HisProNPar[0] ;
            A2748CliAlias = P06VR3_A2748CliAlias[0] ;
            A1525HisProKgr = P06VR3_A1525HisProKgr[0] ;
            A4714HisProNpzs = P06VR3_A4714HisProNpzs[0] ;
            A503GruOpeCod = P06VR3_A503GruOpeCod[0] ;
            A867ParCodNom = P06VR3_A867ParCodNom[0] ;
            n867ParCodNom = P06VR3_n867ParCodNom[0] ;
            A602MaqCod = P06VR3_A602MaqCod[0] ;
            A252CliCod = P06VR3_A252CliCod[0] ;
            n252CliCod = P06VR3_n252CliCod[0] ;
            A566HisProTur = P06VR3_A566HisProTur[0] ;
            A558HisProFec = P06VR3_A558HisProFec[0] ;
            A561HisProLin = P06VR3_A561HisProLin[0] ;
            A606MaqDsc = P06VR3_A606MaqDsc[0] ;
            n606MaqDsc = P06VR3_n606MaqDsc[0] ;
            A563HisProMin = P06VR3_A563HisProMin[0] ;
            A560HisProHin = P06VR3_A560HisProHin[0] ;
            A562HisProMfi = P06VR3_A562HisProMfi[0] ;
            A559HisProHfi = P06VR3_A559HisProHfi[0] ;
            A606MaqDsc = P06VR3_A606MaqDsc[0] ;
            n606MaqDsc = P06VR3_n606MaqDsc[0] ;
            A252CliCod = P06VR3_A252CliCod[0] ;
            n252CliCod = P06VR3_n252CliCod[0] ;
            A2748CliAlias = P06VR3_A2748CliAlias[0] ;
            A867ParCodNom = P06VR3_A867ParCodNom[0] ;
            n867ParCodNom = P06VR3_n867ParCodNom[0] ;
            if ( A560HisProHin <= A559HisProHfi )
            {
               A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            }
            else
            {
               A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            }
            h6VR0( false, 33) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 21, Gx_line+8, 72, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 86, Gx_line+8, 131, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 147, Gx_line+8, 265, Gx_line+25, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            AV45FlagImp = (byte)(0) ;
            AV47TotMet = 0 ;
            AV48TotKgs = DecimalUtil.doubleToDec(0) ;
            AV49TotHm = DecimalUtil.doubleToDec(0) ;
            AV50TotHmP = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06VR3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06VR3_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk6VR3 = false ;
               A656ParCod = P06VR3_A656ParCod[0] ;
               n656ParCod = P06VR3_n656ParCod[0] ;
               A556HisProEst = P06VR3_A556HisProEst[0] ;
               A461Fase = P06VR3_A461Fase[0] ;
               A130BarCodPar = P06VR3_A130BarCodPar[0] ;
               A132BarCodReo = P06VR3_A132BarCodReo[0] ;
               A129BarCod = P06VR3_A129BarCod[0] ;
               A3610HisProLot = P06VR3_A3610HisProLot[0] ;
               A4704HisProNPar = P06VR3_A4704HisProNPar[0] ;
               A2748CliAlias = P06VR3_A2748CliAlias[0] ;
               A1525HisProKgr = P06VR3_A1525HisProKgr[0] ;
               A4714HisProNpzs = P06VR3_A4714HisProNpzs[0] ;
               A503GruOpeCod = P06VR3_A503GruOpeCod[0] ;
               A867ParCodNom = P06VR3_A867ParCodNom[0] ;
               n867ParCodNom = P06VR3_n867ParCodNom[0] ;
               A252CliCod = P06VR3_A252CliCod[0] ;
               n252CliCod = P06VR3_n252CliCod[0] ;
               A566HisProTur = P06VR3_A566HisProTur[0] ;
               A558HisProFec = P06VR3_A558HisProFec[0] ;
               A561HisProLin = P06VR3_A561HisProLin[0] ;
               A563HisProMin = P06VR3_A563HisProMin[0] ;
               A560HisProHin = P06VR3_A560HisProHin[0] ;
               A562HisProMfi = P06VR3_A562HisProMfi[0] ;
               A559HisProHfi = P06VR3_A559HisProHfi[0] ;
               A252CliCod = P06VR3_A252CliCod[0] ;
               n252CliCod = P06VR3_n252CliCod[0] ;
               A2748CliAlias = P06VR3_A2748CliAlias[0] ;
               A867ParCodNom = P06VR3_A867ParCodNom[0] ;
               n867ParCodNom = P06VR3_n867ParCodNom[0] ;
               if ( ( A252CliCod >= AV70PCliCod ) && ( A252CliCod <= AV71UCliCod ) )
               {
                  if ( ( A566HisProTur >= AV55PTurno ) && ( A566HisProTur <= AV56UTurno ) )
                  {
                     if ( A560HisProHin <= A559HisProHfi )
                     {
                        A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                     }
                     else
                     {
                        A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                     }
                     AV72MtsFech = 0 ;
                     AV73KilosFec = DecimalUtil.doubleToDec(0) ;
                     AV74TotHmF = DecimalUtil.doubleToDec(0) ;
                     AV75TotHmPF = DecimalUtil.doubleToDec(0) ;
                     AV76HisProFec = A558HisProFec ;
                     while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06VR3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06VR3_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P06VR3_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) )
                     {
                        brk6VR3 = false ;
                        A656ParCod = P06VR3_A656ParCod[0] ;
                        n656ParCod = P06VR3_n656ParCod[0] ;
                        A556HisProEst = P06VR3_A556HisProEst[0] ;
                        A461Fase = P06VR3_A461Fase[0] ;
                        A130BarCodPar = P06VR3_A130BarCodPar[0] ;
                        A132BarCodReo = P06VR3_A132BarCodReo[0] ;
                        A129BarCod = P06VR3_A129BarCod[0] ;
                        A3610HisProLot = P06VR3_A3610HisProLot[0] ;
                        A4704HisProNPar = P06VR3_A4704HisProNPar[0] ;
                        A2748CliAlias = P06VR3_A2748CliAlias[0] ;
                        A1525HisProKgr = P06VR3_A1525HisProKgr[0] ;
                        A4714HisProNpzs = P06VR3_A4714HisProNpzs[0] ;
                        A503GruOpeCod = P06VR3_A503GruOpeCod[0] ;
                        A867ParCodNom = P06VR3_A867ParCodNom[0] ;
                        n867ParCodNom = P06VR3_n867ParCodNom[0] ;
                        A252CliCod = P06VR3_A252CliCod[0] ;
                        n252CliCod = P06VR3_n252CliCod[0] ;
                        A566HisProTur = P06VR3_A566HisProTur[0] ;
                        A561HisProLin = P06VR3_A561HisProLin[0] ;
                        A563HisProMin = P06VR3_A563HisProMin[0] ;
                        A560HisProHin = P06VR3_A560HisProHin[0] ;
                        A562HisProMfi = P06VR3_A562HisProMfi[0] ;
                        A559HisProHfi = P06VR3_A559HisProHfi[0] ;
                        A252CliCod = P06VR3_A252CliCod[0] ;
                        n252CliCod = P06VR3_n252CliCod[0] ;
                        A2748CliAlias = P06VR3_A2748CliAlias[0] ;
                        A867ParCodNom = P06VR3_A867ParCodNom[0] ;
                        n867ParCodNom = P06VR3_n867ParCodNom[0] ;
                        if ( A560HisProHin <= A559HisProHfi )
                        {
                           A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                        }
                        else
                        {
                           A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                        }
                        if ( (0==A656ParCod) )
                        {
                           AV37HisProTre = (short)(0) ;
                           AV46HhMm = DecimalUtil.doubleToDec(0) ;
                           AV58HorRea = (short)(0) ;
                           AV59HorReaint = (short)(0) ;
                           AV57MinRea = (byte)(0) ;
                           if ( A556HisProEst != 0 )
                           {
                              AV37HisProTre = A564HisProTre ;
                              AV46HhMm = DecimalUtil.doubleToDec(AV37HisProTre/ (double) (60)) ;
                              AV58HorRea = (short)(AV37HisProTre/ (double) (60)) ;
                              AV59HorReaint = (short)(GXutil.Int( AV58HorRea)) ;
                              AV57MinRea = (byte)(AV37HisProTre-(AV59HorReaint*60)) ;
                           }
                           GXv_char2[0] = A396EmprCod ;
                           GXv_char3[0] = A461Fase ;
                           GXv_char4[0] = AV54FasActTin ;
                           new app.pfasest(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
                           rpr0l16.this.A396EmprCod = GXv_char2[0] ;
                           rpr0l16.this.A461Fase = GXv_char3[0] ;
                           rpr0l16.this.AV54FasActTin = GXv_char4[0] ;
                           AV52FlagMarca = (byte)(0) ;
                           AV53HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                           if ( GXutil.strcmp(A3610HisProLot, AV53HisProLot) == 0 )
                           {
                              AV52FlagMarca = (byte)(1) ;
                           }
                           if ( GXutil.strcmp(AV54FasActTin, httpContext.getMessage( "N", "")) == 0 )
                           {
                              AV52FlagMarca = (byte)(1) ;
                           }
                           GXv_char4[0] = AV24FasDsc ;
                           new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char4) ;
                           rpr0l16.this.AV24FasDsc = GXv_char4[0] ;
                           h6VR0( false, 16) ;
                           getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(":", 817, Gx_line+1, 822, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(":", 870, Gx_line+1, 875, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 9, Gx_line+0, 68, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(localUtil.format( A558HisProFec, "99/99/99"), 980, Gx_line+0, 1039, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9")), 802, Gx_line+0, 818, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99")), 821, Gx_line+0, 837, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9")), 853, Gx_line+0, 869, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99")), 876, Gx_line+0, 892, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")), 301, Gx_line+0, 346, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24FasDsc, "")), 372, Gx_line+0, 577, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9")), 608, Gx_line+0, 638, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9")), 777, Gx_line+0, 785, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")), 692, Gx_line+0, 759, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 120, Gx_line+0, 165, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58HorRea), "ZZZ9")), 911, Gx_line+0, 941, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57MinRea), "Z9")), 948, Gx_line+0, 964, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(":", 942, Gx_line+0, 950, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2748CliAlias, "")), 171, Gx_line+0, 289, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4704HisProNPar), "ZZZZZ9")), 72, Gx_line+0, 117, Gx_line+17, 2+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+16) ;
                           AV48TotKgs = AV48TotKgs.add(A1525HisProKgr) ;
                           AV47TotMet = (long)(AV47TotMet+A4714HisProNpzs) ;
                           AV73KilosFec = AV73KilosFec.add(A1525HisProKgr) ;
                           AV72MtsFech = (long)(AV72MtsFech+A4714HisProNpzs) ;
                           if ( AV52FlagMarca == 1 )
                           {
                              AV49TotHm = AV49TotHm.add(DecimalUtil.doubleToDec(AV37HisProTre)) ;
                              AV74TotHmF = AV74TotHmF.add(DecimalUtil.doubleToDec(AV37HisProTre)) ;
                           }
                        }
                        else
                        {
                           AV37HisProTre = (short)(0) ;
                           AV46HhMm = DecimalUtil.doubleToDec(0) ;
                           AV58HorRea = (short)(0) ;
                           AV59HorReaint = (short)(0) ;
                           AV57MinRea = (byte)(0) ;
                           if ( A556HisProEst != 0 )
                           {
                              AV37HisProTre = A564HisProTre ;
                              AV46HhMm = DecimalUtil.doubleToDec(AV37HisProTre/ (double) (60)) ;
                              AV61HorPar = (short)(AV37HisProTre/ (double) (60)) ;
                              AV62HorParint = (short)(GXutil.Int( AV61HorPar)) ;
                              AV60MinPar = (byte)(AV37HisProTre-(AV62HorParint*60)) ;
                           }
                           AV50TotHmP = AV50TotHmP.add(DecimalUtil.doubleToDec(AV37HisProTre)) ;
                           AV75TotHmPF = AV75TotHmPF.add(DecimalUtil.doubleToDec(AV37HisProTre)) ;
                           h6VR0( false, 17) ;
                           getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A867ParCodNom, "")), 372, Gx_line+0, 576, Gx_line+17, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(":", 817, Gx_line+1, 822, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(":", 870, Gx_line+1, 875, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(localUtil.format( A558HisProFec, "99/99/99"), 980, Gx_line+0, 1039, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9")), 802, Gx_line+0, 818, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99")), 821, Gx_line+0, 837, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9")), 853, Gx_line+0, 869, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99")), 876, Gx_line+0, 892, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9")), 777, Gx_line+0, 785, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61HorPar), "ZZZ9")), 911, Gx_line+0, 941, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV60MinPar), "Z9")), 948, Gx_line+0, 964, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(":", 942, Gx_line+0, 950, Gx_line+17, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                        brk6VR3 = true ;
                        pr_default.readNext(1);
                     }
                     AV46HhMm = AV74TotHmF.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                     AV58HorRea = (short)(DecimalUtil.decToDouble(AV74TotHmF.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                     AV59HorReaint = (short)(GXutil.Int( AV58HorRea)) ;
                     AV57MinRea = (byte)(DecimalUtil.decToDouble(AV74TotHmF.subtract(DecimalUtil.doubleToDec((AV59HorReaint*60))))) ;
                     AV61HorPar = (short)(DecimalUtil.decToDouble(AV75TotHmPF.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                     AV62HorParint = (short)(GXutil.Int( AV61HorPar)) ;
                     AV60MinPar = (byte)(DecimalUtil.decToDouble(AV75TotHmPF.subtract(DecimalUtil.doubleToDec((AV62HorParint*60))))) ;
                     h6VR0( false, 29) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58HorRea), "ZZZ9")), 911, Gx_line+7, 941, Gx_line+25, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57MinRea), "Z9")), 948, Gx_line+7, 964, Gx_line+25, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 942, Gx_line+8, 947, Gx_line+24, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61HorPar), "ZZZ9")), 981, Gx_line+7, 1011, Gx_line+25, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV60MinPar), "Z9")), 1022, Gx_line+7, 1038, Gx_line+25, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 1014, Gx_line+8, 1019, Gx_line+24, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(")", 1036, Gx_line+7, 1041, Gx_line+23, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText("(", 977, Gx_line+7, 982, Gx_line+23, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72MtsFech), "ZZZZZZZZZZZZ9")), 543, Gx_line+7, 639, Gx_line+25, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV73KilosFec, "ZZ,ZZZ,ZZ9.99")), 663, Gx_line+7, 759, Gx_line+25, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV76HisProFec, "99/99/99"), 449, Gx_line+8, 508, Gx_line+26, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+29) ;
                  }
               }
               if ( ! brk6VR3 )
               {
                  brk6VR3 = true ;
                  pr_default.readNext(1);
               }
            }
            AV46HhMm = AV49TotHm.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
            AV58HorRea = (short)(DecimalUtil.decToDouble(AV49TotHm.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
            AV59HorReaint = (short)(GXutil.Int( AV58HorRea)) ;
            AV57MinRea = (byte)(DecimalUtil.decToDouble(AV49TotHm.subtract(DecimalUtil.doubleToDec((AV59HorReaint*60))))) ;
            AV61HorPar = (short)(DecimalUtil.decToDouble(AV50TotHmP.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
            AV62HorParint = (short)(GXutil.Int( AV61HorPar)) ;
            AV60MinPar = (byte)(DecimalUtil.decToDouble(AV50TotHmP.subtract(DecimalUtil.doubleToDec((AV62HorParint*60))))) ;
            h6VR0( false, 30) ;
            getPrinter().GxDrawLine(3, Gx_line+26, 1061, Gx_line+26, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48TotKgs, "ZZ,ZZZ,ZZ9.99")), 663, Gx_line+6, 759, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TotMet), "ZZZZZZZZZZZZ9")), 543, Gx_line+6, 638, Gx_line+23, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58HorRea), "ZZZ9")), 911, Gx_line+6, 941, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57MinRea), "Z9")), 948, Gx_line+6, 964, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 942, Gx_line+7, 947, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61HorPar), "ZZZ9")), 979, Gx_line+6, 1009, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV60MinPar), "Z9")), 1020, Gx_line+6, 1036, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 1011, Gx_line+7, 1016, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(")", 1034, Gx_line+6, 1039, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("(", 975, Gx_line+6, 980, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(3, Gx_line+3, 1061, Gx_line+3, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total Maquina", ""), 430, Gx_line+6, 534, Gx_line+24, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+30) ;
            if ( ! brk6VR3 )
            {
               brk6VR3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6VR0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6VR0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25NomEmp, "")), 15, Gx_line+17, 417, Gx_line+37, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 782, Gx_line+19, 833, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 898, Gx_line+19, 991, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 930, Gx_line+50, 975, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV17Pfec, "99/99/99"), 82, Gx_line+84, 133, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV18Ufec, "99/99/99"), 232, Gx_line+84, 283, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "T", ""), 777, Gx_line+124, 785, Gx_line+140, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+9, 1064, Gx_line+9, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+75, 1064, Gx_line+75, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hh:Mm", ""), 918, Gx_line+124, 960, Gx_line+140, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit1, "")), 706, Gx_line+19, 777, Gx_line+35, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit2, "")), 839, Gx_line+19, 890, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit3, "")), 851, Gx_line+50, 927, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit13, "")), 792, Gx_line+124, 836, Gx_line+140, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit14, "")), 847, Gx_line+124, 891, Gx_line+140, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit15, "")), 980, Gx_line+124, 1038, Gx_line+140, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit12, "")), 682, Gx_line+124, 758, Gx_line+141, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit11, "")), 594, Gx_line+124, 638, Gx_line+140, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit10, "")), 372, Gx_line+124, 423, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit7, "")), 301, Gx_line+124, 359, Gx_line+140, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit6, "")), 120, Gx_line+124, 209, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit4, "")), 9, Gx_line+124, 67, Gx_line+140, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit18, "")), 15, Gx_line+50, 501, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit8, "")), 15, Gx_line+84, 79, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit9, "")), 166, Gx_line+84, 230, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(9, Gx_line+143, 67, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(120, Gx_line+143, 288, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(301, Gx_line+143, 359, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(372, Gx_line+143, 576, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(594, Gx_line+143, 638, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(692, Gx_line+143, 758, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(777, Gx_line+143, 784, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(794, Gx_line+143, 838, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(847, Gx_line+143, 891, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(911, Gx_line+143, 965, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(980, Gx_line+143, 1038, Gx_line+143, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pda", ""), 82, Gx_line+124, 106, Gx_line+140, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(72, Gx_line+143, 116, Gx_line+143, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+145) ;
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
      this.aP0[0] = rpr0l16.this.A396EmprCod;
      this.aP1[0] = rpr0l16.this.AV17Pfec;
      this.aP2[0] = rpr0l16.this.AV19Pmaq;
      this.aP3[0] = rpr0l16.this.AV18Ufec;
      this.aP4[0] = rpr0l16.this.AV20Umaq;
      this.aP5[0] = rpr0l16.this.AV55PTurno;
      this.aP6[0] = rpr0l16.this.AV56UTurno;
      this.aP7[0] = rpr0l16.this.AV70PCliCod;
      this.aP8[0] = rpr0l16.this.AV71UCliCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Lit1 = "" ;
      AV63Lit2 = "" ;
      AV29Lit3 = "" ;
      AV38Lit4 = "" ;
      AV40Lit6 = "" ;
      AV41Lit7 = "" ;
      AV42Lit8 = "" ;
      AV43Lit9 = "" ;
      AV44Lit10 = "" ;
      AV68Lit11 = "" ;
      AV67Lit12 = "" ;
      AV64Lit13 = "" ;
      AV65Lit14 = "" ;
      AV66Lit15 = "" ;
      AV69Lit18 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P06VR2_A396EmprCod = new String[] {""} ;
      P06VR2_A407EmprNom = new String[] {""} ;
      P06VR2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV25NomEmp = "" ;
      P06VR3_A396EmprCod = new String[] {""} ;
      P06VR3_A656ParCod = new short[1] ;
      P06VR3_n656ParCod = new boolean[] {false} ;
      P06VR3_A556HisProEst = new byte[1] ;
      P06VR3_A461Fase = new String[] {""} ;
      P06VR3_A130BarCodPar = new String[] {""} ;
      P06VR3_A132BarCodReo = new byte[1] ;
      P06VR3_A129BarCod = new int[1] ;
      P06VR3_A3610HisProLot = new String[] {""} ;
      P06VR3_A4704HisProNPar = new int[1] ;
      P06VR3_A2748CliAlias = new String[] {""} ;
      P06VR3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06VR3_A4714HisProNpzs = new short[1] ;
      P06VR3_A503GruOpeCod = new int[1] ;
      P06VR3_A867ParCodNom = new String[] {""} ;
      P06VR3_n867ParCodNom = new boolean[] {false} ;
      P06VR3_A602MaqCod = new String[] {""} ;
      P06VR3_A252CliCod = new int[1] ;
      P06VR3_n252CliCod = new boolean[] {false} ;
      P06VR3_A566HisProTur = new byte[1] ;
      P06VR3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06VR3_A561HisProLin = new int[1] ;
      P06VR3_A606MaqDsc = new String[] {""} ;
      P06VR3_n606MaqDsc = new boolean[] {false} ;
      P06VR3_A563HisProMin = new byte[1] ;
      P06VR3_A560HisProHin = new byte[1] ;
      P06VR3_A562HisProMfi = new byte[1] ;
      P06VR3_A559HisProHfi = new byte[1] ;
      A461Fase = "" ;
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      A2748CliAlias = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A606MaqDsc = "" ;
      AV48TotKgs = DecimalUtil.ZERO ;
      AV49TotHm = DecimalUtil.ZERO ;
      AV50TotHmP = DecimalUtil.ZERO ;
      AV73KilosFec = DecimalUtil.ZERO ;
      AV74TotHmF = DecimalUtil.ZERO ;
      AV75TotHmPF = DecimalUtil.ZERO ;
      AV76HisProFec = GXutil.nullDate() ;
      AV46HhMm = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV54FasActTin = "" ;
      AV53HisProLot = "" ;
      AV24FasDsc = "" ;
      GXv_char4 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rpr0l16__default(),
         new Object[] {
             new Object[] {
            P06VR2_A396EmprCod, P06VR2_A407EmprNom, P06VR2_n407EmprNom
            }
            , new Object[] {
            P06VR3_A396EmprCod, P06VR3_A656ParCod, P06VR3_n656ParCod, P06VR3_A556HisProEst, P06VR3_A461Fase, P06VR3_A130BarCodPar, P06VR3_A132BarCodReo, P06VR3_A129BarCod, P06VR3_A3610HisProLot, P06VR3_A4704HisProNPar,
            P06VR3_A2748CliAlias, P06VR3_A1525HisProKgr, P06VR3_A4714HisProNpzs, P06VR3_A503GruOpeCod, P06VR3_A867ParCodNom, P06VR3_n867ParCodNom, P06VR3_A602MaqCod, P06VR3_A252CliCod, P06VR3_n252CliCod, P06VR3_A566HisProTur,
            P06VR3_A558HisProFec, P06VR3_A561HisProLin, P06VR3_A606MaqDsc, P06VR3_n606MaqDsc, P06VR3_A563HisProMin, P06VR3_A560HisProHin, P06VR3_A562HisProMfi, P06VR3_A559HisProHfi
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV55PTurno ;
   private byte AV56UTurno ;
   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV45FlagImp ;
   private byte AV57MinRea ;
   private byte AV52FlagMarca ;
   private byte AV60MinPar ;
   private short A656ParCod ;
   private short A4714HisProNpzs ;
   private short A564HisProTre ;
   private short AV37HisProTre ;
   private short AV58HorRea ;
   private short AV59HorReaint ;
   private short AV61HorPar ;
   private short AV62HorParint ;
   private short Gx_err ;
   private int AV70PCliCod ;
   private int AV71UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A4704HisProNPar ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private int Gx_OldLine ;
   private long AV47TotMet ;
   private long AV72MtsFech ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV48TotKgs ;
   private java.math.BigDecimal AV49TotHm ;
   private java.math.BigDecimal AV50TotHmP ;
   private java.math.BigDecimal AV73KilosFec ;
   private java.math.BigDecimal AV74TotHmF ;
   private java.math.BigDecimal AV75TotHmPF ;
   private java.math.BigDecimal AV46HhMm ;
   private String A396EmprCod ;
   private String AV19Pmaq ;
   private String AV20Umaq ;
   private String AV28Lit1 ;
   private String AV63Lit2 ;
   private String AV29Lit3 ;
   private String AV38Lit4 ;
   private String AV40Lit6 ;
   private String AV41Lit7 ;
   private String AV42Lit8 ;
   private String AV43Lit9 ;
   private String AV44Lit10 ;
   private String AV68Lit11 ;
   private String AV67Lit12 ;
   private String AV64Lit13 ;
   private String AV65Lit14 ;
   private String AV66Lit15 ;
   private String AV69Lit18 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV25NomEmp ;
   private String A461Fase ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A2748CliAlias ;
   private String A867ParCodNom ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV54FasActTin ;
   private String AV53HisProLot ;
   private String AV24FasDsc ;
   private String GXv_char4[] ;
   private String Gx_time ;
   private java.util.Date AV17Pfec ;
   private java.util.Date AV18Ufec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV76HisProFec ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean brk6VR3 ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n252CliCod ;
   private boolean n606MaqDsc ;
   private int[] aP8 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P06VR2_A396EmprCod ;
   private String[] P06VR2_A407EmprNom ;
   private boolean[] P06VR2_n407EmprNom ;
   private String[] P06VR3_A396EmprCod ;
   private short[] P06VR3_A656ParCod ;
   private boolean[] P06VR3_n656ParCod ;
   private byte[] P06VR3_A556HisProEst ;
   private String[] P06VR3_A461Fase ;
   private String[] P06VR3_A130BarCodPar ;
   private byte[] P06VR3_A132BarCodReo ;
   private int[] P06VR3_A129BarCod ;
   private String[] P06VR3_A3610HisProLot ;
   private int[] P06VR3_A4704HisProNPar ;
   private String[] P06VR3_A2748CliAlias ;
   private java.math.BigDecimal[] P06VR3_A1525HisProKgr ;
   private short[] P06VR3_A4714HisProNpzs ;
   private int[] P06VR3_A503GruOpeCod ;
   private String[] P06VR3_A867ParCodNom ;
   private boolean[] P06VR3_n867ParCodNom ;
   private String[] P06VR3_A602MaqCod ;
   private int[] P06VR3_A252CliCod ;
   private boolean[] P06VR3_n252CliCod ;
   private byte[] P06VR3_A566HisProTur ;
   private java.util.Date[] P06VR3_A558HisProFec ;
   private int[] P06VR3_A561HisProLin ;
   private String[] P06VR3_A606MaqDsc ;
   private boolean[] P06VR3_n606MaqDsc ;
   private byte[] P06VR3_A563HisProMin ;
   private byte[] P06VR3_A560HisProHin ;
   private byte[] P06VR3_A562HisProMfi ;
   private byte[] P06VR3_A559HisProHfi ;
}

final  class rpr0l16__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06VR2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06VR3", "SELECT T1.EmprCod, T1.ParCod, T1.HisProEst, T1.Fase, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLot, T1.HisProNPar, T4.CliAlias, T1.HisProKgr, T1.HisProNpzs, T1.GruOpeCod, T5.ParCodNom, T1.MaqCod, T3.CliCod, T1.HisProTur, T1.HisProFec, T1.HisProLin, T2.MaqDsc, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi FROM ((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN TXPCODPAR T5 ON T5.EmprCod = T1.EmprCod AND T5.ParCod = T1.ParCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ? and T1.HisProFec >= ?) AND (T1.HisProFec <= ?) AND (T1.HisProTur >= ? and T1.HisProTur <= ?) AND (T3.CliCod >= ? and T3.CliCod <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 10);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               ((byte[]) buf[26])[0] = rslt.getByte(23);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 6);
               return;
      }
   }

}

