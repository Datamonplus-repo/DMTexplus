package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rmorart1 extends GXReport
{
   public rmorart1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rmorart1.class ), "" );
   }

   public rmorart1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          int[] aP3 ,
                          int[] aP4 )
   {
      rmorart1.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, reportHandler);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        IReportHandler reportHandler )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, reportHandler);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             IReportHandler reportHandler )
   {
      rmorart1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rmorart1.this.A9425OMCod = aP1[0];
      this.aP1 = aP1;
      rmorart1.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      rmorart1.this.Gx_page = aP3[0];
      this.aP3 = aP3;
      rmorart1.this.Gx_line = aP4[0];
      this.aP4 = aP4;
      this.reportHandler = reportHandler;
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
      try
      {
         setPrinter(reportHandler);
         P_lines = getPrinter().getPageLines();
         lineHeight = getPrinter().getLineHeight();
         M_top = getPrinter().getM_top();
         M_bot = getPrinter().getM_bot();
         Gx_page = getPrinter().getPage();
         GxHdr2 = true ;
         /* Using cursor P07QS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9445OMEst = P07QS2_A9445OMEst[0] ;
            A9427OMMaqDsc = P07QS2_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P07QS2_n9427OMMaqDsc[0] ;
            A9426OMMaqCod = P07QS2_A9426OMMaqCod[0] ;
            A9433OMTxt = P07QS2_A9433OMTxt[0] ;
            A9464OMNot = P07QS2_A9464OMNot[0] ;
            A9429PMCod = P07QS2_A9429PMCod[0] ;
            n9429PMCod = P07QS2_n9429PMCod[0] ;
            A9428SMCod = P07QS2_A9428SMCod[0] ;
            n9428SMCod = P07QS2_n9428SMCod[0] ;
            A9436OMFchCre = P07QS2_A9436OMFchCre[0] ;
            A9427OMMaqDsc = P07QS2_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P07QS2_n9427OMMaqDsc[0] ;
            h7QS0( false, 44) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8NomEmp, "")), 19, Gx_line+18, 239, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 16, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ORDEN DE TRABAJO", ""), 299, Gx_line+15, 539, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 744, Gx_line+19, 803, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(688, Gx_line+15, 813, Gx_line+40, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+44) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 17) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Generación", ""), 19, Gx_line+1, 147, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A9436OMFchCre, "99/99/99 99:99"), 161, Gx_line+1, 264, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9")), 442, Gx_line+1, 501, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Solicitud (Correctivo)", ""), 299, Gx_line+1, 424, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Preventivo", ""), 571, Gx_line+1, 636, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), 643, Gx_line+1, 702, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            AV23GXLvl24 = (byte)(0) ;
            /* Using cursor P07QS3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               brk7QS6 = false ;
               A11448OMMPieCod = P07QS3_A11448OMMPieCod[0] ;
               A11447OMMSEqCod = P07QS3_A11447OMMSEqCod[0] ;
               A11446OMMEquCod = P07QS3_A11446OMMEquCod[0] ;
               A11449OMMPieDsc = P07QS3_A11449OMMPieDsc[0] ;
               n11449OMMPieDsc = P07QS3_n11449OMMPieDsc[0] ;
               A11449OMMPieDsc = P07QS3_A11449OMMPieDsc[0] ;
               n11449OMMPieDsc = P07QS3_n11449OMMPieDsc[0] ;
               AV23GXLvl24 = (byte)(1) ;
               h7QS0( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 19, Gx_line+1, 70, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), 85, Gx_line+1, 130, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), 134, Gx_line+1, 252, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07QS3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P07QS3_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(P07QS3_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
               {
                  brk7QS6 = false ;
                  A11448OMMPieCod = P07QS3_A11448OMMPieCod[0] ;
                  A11447OMMSEqCod = P07QS3_A11447OMMSEqCod[0] ;
                  A11446OMMEquCod = P07QS3_A11446OMMEquCod[0] ;
                  brk7QS6 = true ;
                  pr_default.readNext(1);
               }
               if ( ! brk7QS6 )
               {
                  brk7QS6 = true ;
                  pr_default.readNext(1);
               }
            }
            pr_default.close(1);
            if ( AV23GXLvl24 == 0 )
            {
               h7QS0( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 17) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Trabajo : ", ""), 19, Gx_line+1, 108, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mecánico", ""), 145, Gx_line+1, 203, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Eléctrico", ""), 240, Gx_line+1, 293, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Eléctrico", ""), 461, Gx_line+1, 514, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Instrumentación", ""), 330, Gx_line+1, 425, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Otro", ""), 552, Gx_line+1, 578, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Montaje", ""), 616, Gx_line+1, 664, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Traslado máquina", ""), 701, Gx_line+1, 806, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(216, Gx_line+1, 227, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(120, Gx_line+1, 131, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(305, Gx_line+1, 316, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(438, Gx_line+1, 449, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(529, Gx_line+1, 540, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(591, Gx_line+1, 602, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(677, Gx_line+1, 688, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Respons.", ""), 19, Gx_line+1, 75, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            AV25GXLvl44 = (byte)(0) ;
            /* Using cursor P07QS4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A9458OMMTpo = P07QS4_A9458OMMTpo[0] ;
               A9455OMOpeCod = P07QS4_A9455OMOpeCod[0] ;
               A9456OMOpeNom = P07QS4_A9456OMOpeNom[0] ;
               n9456OMOpeNom = P07QS4_n9456OMOpeNom[0] ;
               A9456OMOpeNom = P07QS4_A9456OMOpeNom[0] ;
               n9456OMOpeNom = P07QS4_n9456OMOpeNom[0] ;
               if ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 )
               {
                  AV25GXLvl44 = (byte)(1) ;
                  h7QS0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9")), 164, Gx_line+1, 209, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9456OMOpeNom, "")), 213, Gx_line+1, 433, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  h7QS0( false, 1) ;
                  getPrinter().GxDrawLine(80, Gx_line+0, 812, Gx_line+0, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+1, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV25GXLvl44 == 0 )
            {
               h7QS0( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            Gx_line = (int)(Gx_line-1) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tarea", ""), 19, Gx_line+0, 54, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            AV26GXLvl77 = (byte)(0) ;
            /* Using cursor P07QS5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A9430TMCod = P07QS5_A9430TMCod[0] ;
               A9431TMDsc = P07QS5_A9431TMDsc[0] ;
               n9431TMDsc = P07QS5_n9431TMDsc[0] ;
               A9431TMDsc = P07QS5_A9431TMDsc[0] ;
               n9431TMDsc = P07QS5_n9431TMDsc[0] ;
               AV26GXLvl77 = (byte)(1) ;
               h7QS0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9430TMCod), "ZZZZZZZ9")), 149, Gx_line+1, 208, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9431TMDsc, "")), 213, Gx_line+1, 433, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h7QS0( false, 1) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 812, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+1, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV26GXLvl77 == 0 )
            {
               h7QS0( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            Gx_line = (int)(Gx_line-1) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Despiece", ""), 19, Gx_line+2, 75, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            AV27GXLvl109 = (byte)(0) ;
            /* Using cursor P07QS6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A11449OMMPieDsc = P07QS6_A11449OMMPieDsc[0] ;
               n11449OMMPieDsc = P07QS6_n11449OMMPieDsc[0] ;
               A11448OMMPieCod = P07QS6_A11448OMMPieCod[0] ;
               A11447OMMSEqCod = P07QS6_A11447OMMSEqCod[0] ;
               A11446OMMEquCod = P07QS6_A11446OMMEquCod[0] ;
               A11449OMMPieDsc = P07QS6_A11449OMMPieDsc[0] ;
               n11449OMMPieDsc = P07QS6_n11449OMMPieDsc[0] ;
               AV27GXLvl109 = (byte)(1) ;
               h7QS0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), 85, Gx_line+1, 130, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11446OMMEquCod, "")), 134, Gx_line+1, 208, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11448OMMPieCod, "")), 290, Gx_line+1, 364, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11449OMMPieDsc, "")), 368, Gx_line+1, 807, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11447OMMSEqCod, "")), 213, Gx_line+1, 287, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h7QS0( false, 1) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 812, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+1, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( AV27GXLvl109 == 0 )
            {
               h7QS0( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            Gx_line = (int)(Gx_line-1) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 35) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cant.", ""), 86, Gx_line+20, 118, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Vr. Unit.", ""), 555, Gx_line+20, 605, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor Total", ""), 697, Gx_line+20, 763, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 306, Gx_line+20, 377, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MATERIAL REQUERIDO", ""), 340, Gx_line+5, 487, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+35, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+35, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(170, Gx_line+19, 170, Gx_line+36, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(513, Gx_line+19, 513, Gx_line+36, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(647, Gx_line+19, 647, Gx_line+36, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+19, 813, Gx_line+19, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+35) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            AV28GXLvl143 = (byte)(0) ;
            /* Using cursor P07QS7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A9446OMRepCod = P07QS7_A9446OMRepCod[0] ;
               A9449OMRTpo = P07QS7_A9449OMRTpo[0] ;
               A9447OMRepNom = P07QS7_A9447OMRepNom[0] ;
               n9447OMRepNom = P07QS7_n9447OMRepNom[0] ;
               A9453OMRCPre = P07QS7_A9453OMRCPre[0] ;
               A9452OMRCCnt = P07QS7_A9452OMRCCnt[0] ;
               A9451OMRRPre = P07QS7_A9451OMRRPre[0] ;
               A9450OMRRCnt = P07QS7_A9450OMRRCnt[0] ;
               A9447OMRepNom = P07QS7_A9447OMRepNom[0] ;
               n9447OMRepNom = P07QS7_n9447OMRepNom[0] ;
               if ( ( ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "C", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) )
               {
                  A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
                  A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
                  AV28GXLvl143 = (byte)(1) ;
                  if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 )
                  {
                     h7QS0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999")), 52, Gx_line+1, 155, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9447OMRepNom, "")), 189, Gx_line+1, 495, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999")), 664, Gx_line+1, 753, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9451OMRRPre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+1, 631, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(170, Gx_line+0, 170, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(513, Gx_line+0, 513, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(647, Gx_line+0, 647, Gx_line+17, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     h7QS0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9452OMRCCnt, "ZZ,ZZZ,ZZ9.999")), 52, Gx_line+1, 155, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9454OMRCCos, "ZZZZZZZ9.999")), 664, Gx_line+1, 753, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9453OMRCPre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+1, 631, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9447OMRepNom, "")), 189, Gx_line+1, 495, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(170, Gx_line+0, 170, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(513, Gx_line+0, 513, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(647, Gx_line+0, 647, Gx_line+17, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  h7QS0( false, 1) ;
                  getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1) ;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV28GXLvl143 == 0 )
            {
               h7QS0( false, 17) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(170, Gx_line+0, 170, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(513, Gx_line+0, 513, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(647, Gx_line+0, 647, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DESCRIPCIÓN DEL MANTENIMIENTO", ""), 298, Gx_line+0, 528, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            AV11n = (short)(GXutil.gxmlines( GXutil.trim( A9433OMTxt), (short)(100))) ;
            AV11n = (short)(((AV11n==0) ? 1 : AV11n)) ;
            AV13i = (short)(1) ;
            while ( AV13i <= AV11n )
            {
               AV12t = GXutil.gxgetmli( A9433OMTxt, AV13i, (short)(100)) ;
               h7QS0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12t, "")), 49, Gx_line+1, 779, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV13i = (short)(AV13i+1) ;
            }
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            AV11n = (short)(GXutil.gxmlines( GXutil.trim( A9464OMNot), (short)(100))) ;
            AV11n = (short)(((AV11n==0) ? 1 : AV11n)) ;
            h7QS0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CAUSA/OBSERVACIONES Y RECOMENDACIONES", ""), 261, Gx_line+0, 565, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            AV13i = (short)(1) ;
            while ( AV13i <= AV11n )
            {
               AV12t = GXutil.gxgetmli( GXutil.trim( A9464OMNot), AV13i, (short)(100)) ;
               h7QS0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12t, "")), 49, Gx_line+1, 779, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV13i = (short)(AV13i+1) ;
            }
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h7QS0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            /* Using cursor P07QS8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A9468OMMCIni = P07QS8_A9468OMMCIni[0] ;
               A9455OMOpeCod = P07QS8_A9455OMOpeCod[0] ;
               A9458OMMTpo = P07QS8_A9458OMMTpo[0] ;
               A9466OMMCLin = P07QS8_A9466OMMCLin[0] ;
               h7QS0( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Inicio del trabajo", ""), 52, Gx_line+1, 152, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A9468OMMCIni, "99/99/99 99:99"), 174, Gx_line+1, 277, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            /* Using cursor P07QS9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A9469OMMCFin = P07QS9_A9469OMMCFin[0] ;
               A9455OMOpeCod = P07QS9_A9455OMOpeCod[0] ;
               A9458OMMTpo = P07QS9_A9458OMMTpo[0] ;
               A9466OMMCLin = P07QS9_A9466OMMCLin[0] ;
               h7QS0( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fin del Trabajo", ""), 298, Gx_line+1, 388, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A9469OMMCFin, "99/99/99 99:99"), 409, Gx_line+1, 512, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            AV14OMMCCos = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P07QS10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A9462OMMCPre = P07QS10_A9462OMMCPre[0] ;
               A9461OMMCCnt = P07QS10_A9461OMMCCnt[0] ;
               A9455OMOpeCod = P07QS10_A9455OMOpeCod[0] ;
               A9458OMMTpo = P07QS10_A9458OMMTpo[0] ;
               A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
               AV14OMMCCos = AV14OMMCCos.add(A9463OMMCCos) ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            if ( AV14OMMCCos.doubleValue() != 0 )
            {
               h7QS0( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tiempo de trabajo", ""), 533, Gx_line+1, 640, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14OMMCCos, "ZZZZZZZ9.999")), 664, Gx_line+1, 753, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h7QS0( false, 1) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1) ;
            }
            h7QS0( false, 101) ;
            getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(170, Gx_line+0, 170, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Trabajo Solicitado por :", ""), 19, Gx_line+1, 159, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+17, 813, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+17, 811, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+17, 14, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(170, Gx_line+17, 170, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(413, Gx_line+17, 413, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Paro", ""), 19, Gx_line+18, 106, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+33, 813, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(569, Gx_line+17, 569, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 418, Gx_line+18, 447, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+33, 811, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+33, 14, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(170, Gx_line+33, 170, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(413, Gx_line+33, 413, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicio de Trabajo", ""), 19, Gx_line+34, 120, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+50, 813, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(569, Gx_line+33, 569, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora Inicial", ""), 418, Gx_line+34, 487, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+50, 811, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+50, 14, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(170, Gx_line+50, 170, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(413, Gx_line+50, 413, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fin de Trabajo", ""), 19, Gx_line+51, 105, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+67, 813, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(569, Gx_line+50, 569, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora Final", ""), 418, Gx_line+51, 479, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+67, 811, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+67, 14, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(170, Gx_line+67, 170, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(413, Gx_line+67, 413, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Trabajo autorizado por", ""), 19, Gx_line+68, 153, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+83, 813, Gx_line+83, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(569, Gx_line+67, 569, Gx_line+84, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tiempo Real", ""), 418, Gx_line+68, 493, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(811, Gx_line+83, 811, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+83, 14, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(170, Gx_line+83, 170, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recibido a Satisfacción", ""), 19, Gx_line+84, 161, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+100, 813, Gx_line+100, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+101) ;
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Force skipping of lines */
         h7QS0( false, 0) ;
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7QS0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8NomEmp, "")), 19, Gx_line+18, 239, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 16, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ORDEN DE TRABAJO", ""), 299, Gx_line+15, 539, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 744, Gx_line+19, 803, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(688, Gx_line+15, 813, Gx_line+40, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+44) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Generación", ""), 19, Gx_line+1, 147, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A9436OMFchCre, "99/99/99 99:99"), 161, Gx_line+1, 264, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9")), 442, Gx_line+1, 501, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Solicitud (Correctivo)", ""), 299, Gx_line+1, 424, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preventivo", ""), 571, Gx_line+1, 636, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), 643, Gx_line+1, 702, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV21GXLvl8 = (byte)(0) ;
               /* Using cursor P07QS11 */
               pr_default.execute(9);
               while ( (pr_default.getStatus(9) != 101) )
               {
                  brk7QS4 = false ;
                  A9426OMMaqCod = P07QS11_A9426OMMaqCod[0] ;
                  A9425OMCod = P07QS11_A9425OMCod[0] ;
                  A396EmprCod = P07QS11_A396EmprCod[0] ;
                  A11448OMMPieCod = P07QS11_A11448OMMPieCod[0] ;
                  A11447OMMSEqCod = P07QS11_A11447OMMSEqCod[0] ;
                  A11446OMMEquCod = P07QS11_A11446OMMEquCod[0] ;
                  A9427OMMaqDsc = P07QS11_A9427OMMaqDsc[0] ;
                  n9427OMMaqDsc = P07QS11_n9427OMMaqDsc[0] ;
                  A9426OMMaqCod = P07QS11_A9426OMMaqCod[0] ;
                  A9427OMMaqDsc = P07QS11_A9427OMMaqDsc[0] ;
                  n9427OMMaqDsc = P07QS11_n9427OMMaqDsc[0] ;
                  AV21GXLvl8 = (byte)(1) ;
                  getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 19, Gx_line+1, 70, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), 85, Gx_line+1, 130, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), 134, Gx_line+1, 252, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P07QS11_A396EmprCod[0], A396EmprCod) == 0 ) && ( P07QS11_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(P07QS11_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
                  {
                     brk7QS4 = false ;
                     A11448OMMPieCod = P07QS11_A11448OMMPieCod[0] ;
                     A11447OMMSEqCod = P07QS11_A11447OMMSEqCod[0] ;
                     A11446OMMEquCod = P07QS11_A11446OMMEquCod[0] ;
                     brk7QS4 = true ;
                     pr_default.readNext(9);
                  }
                  if ( ! brk7QS4 )
                  {
                     brk7QS4 = true ;
                     pr_default.readNext(9);
                  }
               }
               pr_default.close(9);
               if ( AV21GXLvl8 == 0 )
               {
                  getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(80, Gx_line+0, 80, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+0, 811, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo Trabajo : ", ""), 19, Gx_line+1, 108, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mecánico", ""), 145, Gx_line+1, 203, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Eléctrico", ""), 240, Gx_line+1, 293, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Eléctrico", ""), 461, Gx_line+1, 514, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Instrumentación", ""), 330, Gx_line+1, 425, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Otro", ""), 552, Gx_line+1, 578, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Montaje", ""), 616, Gx_line+1, 664, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Traslado máquina", ""), 701, Gx_line+1, 806, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(216, Gx_line+1, 227, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(120, Gx_line+1, 131, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(305, Gx_line+1, 316, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(438, Gx_line+1, 449, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(529, Gx_line+1, 540, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(591, Gx_line+1, 602, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(677, Gx_line+1, 688, Gx_line+15, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               getPrinter().GxDrawLine(14, Gx_line+0, 813, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1) ;
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
      this.aP0[0] = rmorart1.this.A396EmprCod;
      this.aP1[0] = rmorart1.this.A9425OMCod;
      this.aP2[0] = rmorart1.this.Gx_out;
      this.aP3[0] = rmorart1.this.Gx_page;
      this.aP4[0] = rmorart1.this.Gx_line;
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
      P07QS2_A396EmprCod = new String[] {""} ;
      P07QS2_A9425OMCod = new int[1] ;
      P07QS2_A9445OMEst = new String[] {""} ;
      P07QS2_A9427OMMaqDsc = new String[] {""} ;
      P07QS2_n9427OMMaqDsc = new boolean[] {false} ;
      P07QS2_A9426OMMaqCod = new String[] {""} ;
      P07QS2_A9433OMTxt = new String[] {""} ;
      P07QS2_A9464OMNot = new String[] {""} ;
      P07QS2_A9429PMCod = new int[1] ;
      P07QS2_n9429PMCod = new boolean[] {false} ;
      P07QS2_A9428SMCod = new int[1] ;
      P07QS2_n9428SMCod = new boolean[] {false} ;
      P07QS2_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      A9445OMEst = "" ;
      A9427OMMaqDsc = "" ;
      A9426OMMaqCod = "" ;
      A9433OMTxt = "" ;
      A9464OMNot = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV8NomEmp = "" ;
      P07QS3_A9426OMMaqCod = new String[] {""} ;
      P07QS3_A396EmprCod = new String[] {""} ;
      P07QS3_A9425OMCod = new int[1] ;
      P07QS3_A11448OMMPieCod = new String[] {""} ;
      P07QS3_A11447OMMSEqCod = new String[] {""} ;
      P07QS3_A11446OMMEquCod = new String[] {""} ;
      P07QS3_A11449OMMPieDsc = new String[] {""} ;
      P07QS3_n11449OMMPieDsc = new boolean[] {false} ;
      A11448OMMPieCod = "" ;
      A11447OMMSEqCod = "" ;
      A11446OMMEquCod = "" ;
      A11449OMMPieDsc = "" ;
      P07QS4_A396EmprCod = new String[] {""} ;
      P07QS4_A9425OMCod = new int[1] ;
      P07QS4_A9458OMMTpo = new String[] {""} ;
      P07QS4_A9455OMOpeCod = new int[1] ;
      P07QS4_A9456OMOpeNom = new String[] {""} ;
      P07QS4_n9456OMOpeNom = new boolean[] {false} ;
      A9458OMMTpo = "" ;
      A9456OMOpeNom = "" ;
      P07QS5_A396EmprCod = new String[] {""} ;
      P07QS5_A9425OMCod = new int[1] ;
      P07QS5_A9430TMCod = new int[1] ;
      P07QS5_A9431TMDsc = new String[] {""} ;
      P07QS5_n9431TMDsc = new boolean[] {false} ;
      A9431TMDsc = "" ;
      P07QS6_A9426OMMaqCod = new String[] {""} ;
      P07QS6_A396EmprCod = new String[] {""} ;
      P07QS6_A9425OMCod = new int[1] ;
      P07QS6_A11449OMMPieDsc = new String[] {""} ;
      P07QS6_n11449OMMPieDsc = new boolean[] {false} ;
      P07QS6_A11448OMMPieCod = new String[] {""} ;
      P07QS6_A11447OMMSEqCod = new String[] {""} ;
      P07QS6_A11446OMMEquCod = new String[] {""} ;
      P07QS7_A9446OMRepCod = new int[1] ;
      P07QS7_A396EmprCod = new String[] {""} ;
      P07QS7_A9425OMCod = new int[1] ;
      P07QS7_A9449OMRTpo = new String[] {""} ;
      P07QS7_A9447OMRepNom = new String[] {""} ;
      P07QS7_n9447OMRepNom = new boolean[] {false} ;
      P07QS7_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07QS7_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07QS7_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07QS7_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9449OMRTpo = "" ;
      A9447OMRepNom = "" ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9471OMRRCos = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      AV12t = "" ;
      P07QS8_A396EmprCod = new String[] {""} ;
      P07QS8_A9425OMCod = new int[1] ;
      P07QS8_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      P07QS8_A9455OMOpeCod = new int[1] ;
      P07QS8_A9458OMMTpo = new String[] {""} ;
      P07QS8_A9466OMMCLin = new short[1] ;
      A9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      P07QS9_A396EmprCod = new String[] {""} ;
      P07QS9_A9425OMCod = new int[1] ;
      P07QS9_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      P07QS9_A9455OMOpeCod = new int[1] ;
      P07QS9_A9458OMMTpo = new String[] {""} ;
      P07QS9_A9466OMMCLin = new short[1] ;
      A9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      AV14OMMCCos = DecimalUtil.ZERO ;
      P07QS10_A396EmprCod = new String[] {""} ;
      P07QS10_A9425OMCod = new int[1] ;
      P07QS10_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07QS10_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07QS10_A9455OMOpeCod = new int[1] ;
      P07QS10_A9458OMMTpo = new String[] {""} ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9463OMMCCos = DecimalUtil.ZERO ;
      P07QS11_A9426OMMaqCod = new String[] {""} ;
      P07QS11_A9425OMCod = new int[1] ;
      P07QS11_A396EmprCod = new String[] {""} ;
      P07QS11_A11448OMMPieCod = new String[] {""} ;
      P07QS11_A11447OMMSEqCod = new String[] {""} ;
      P07QS11_A11446OMMEquCod = new String[] {""} ;
      P07QS11_A9427OMMaqDsc = new String[] {""} ;
      P07QS11_n9427OMMaqDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rmorart1__default(),
         new Object[] {
             new Object[] {
            P07QS2_A396EmprCod, P07QS2_A9425OMCod, P07QS2_A9445OMEst, P07QS2_A9427OMMaqDsc, P07QS2_n9427OMMaqDsc, P07QS2_A9426OMMaqCod, P07QS2_A9433OMTxt, P07QS2_A9464OMNot, P07QS2_A9429PMCod, P07QS2_n9429PMCod,
            P07QS2_A9428SMCod, P07QS2_n9428SMCod, P07QS2_A9436OMFchCre
            }
            , new Object[] {
            P07QS3_A9426OMMaqCod, P07QS3_A396EmprCod, P07QS3_A9425OMCod, P07QS3_A11448OMMPieCod, P07QS3_A11447OMMSEqCod, P07QS3_A11446OMMEquCod, P07QS3_A11449OMMPieDsc, P07QS3_n11449OMMPieDsc
            }
            , new Object[] {
            P07QS4_A396EmprCod, P07QS4_A9425OMCod, P07QS4_A9458OMMTpo, P07QS4_A9455OMOpeCod, P07QS4_A9456OMOpeNom, P07QS4_n9456OMOpeNom
            }
            , new Object[] {
            P07QS5_A396EmprCod, P07QS5_A9425OMCod, P07QS5_A9430TMCod, P07QS5_A9431TMDsc, P07QS5_n9431TMDsc
            }
            , new Object[] {
            P07QS6_A9426OMMaqCod, P07QS6_A396EmprCod, P07QS6_A9425OMCod, P07QS6_A11449OMMPieDsc, P07QS6_n11449OMMPieDsc, P07QS6_A11448OMMPieCod, P07QS6_A11447OMMSEqCod, P07QS6_A11446OMMEquCod
            }
            , new Object[] {
            P07QS7_A9446OMRepCod, P07QS7_A396EmprCod, P07QS7_A9425OMCod, P07QS7_A9449OMRTpo, P07QS7_A9447OMRepNom, P07QS7_n9447OMRepNom, P07QS7_A9453OMRCPre, P07QS7_A9452OMRCCnt, P07QS7_A9451OMRRPre, P07QS7_A9450OMRRCnt
            }
            , new Object[] {
            P07QS8_A396EmprCod, P07QS8_A9425OMCod, P07QS8_A9468OMMCIni, P07QS8_A9455OMOpeCod, P07QS8_A9458OMMTpo, P07QS8_A9466OMMCLin
            }
            , new Object[] {
            P07QS9_A396EmprCod, P07QS9_A9425OMCod, P07QS9_A9469OMMCFin, P07QS9_A9455OMOpeCod, P07QS9_A9458OMMTpo, P07QS9_A9466OMMCLin
            }
            , new Object[] {
            P07QS10_A396EmprCod, P07QS10_A9425OMCod, P07QS10_A9462OMMCPre, P07QS10_A9461OMMCCnt, P07QS10_A9455OMOpeCod, P07QS10_A9458OMMTpo
            }
            , new Object[] {
            P07QS11_A9426OMMaqCod, P07QS11_A9425OMCod, P07QS11_A396EmprCod, P07QS11_A11448OMMPieCod, P07QS11_A11447OMMSEqCod, P07QS11_A11446OMMEquCod, P07QS11_A9427OMMaqDsc, P07QS11_n9427OMMaqDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl24 ;
   private byte AV25GXLvl44 ;
   private byte AV26GXLvl77 ;
   private byte AV27GXLvl109 ;
   private byte AV28GXLvl143 ;
   private byte AV21GXLvl8 ;
   private short AV11n ;
   private short AV13i ;
   private short A9466OMMCLin ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int Gx_page ;
   private int Gx_line ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9429PMCod ;
   private int A9428SMCod ;
   private int Gx_OldLine ;
   private int A9455OMOpeCod ;
   private int A9430TMCod ;
   private int A9446OMRepCod ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9471OMRRCos ;
   private java.math.BigDecimal A9454OMRCCos ;
   private java.math.BigDecimal AV14OMMCCos ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9463OMMCCos ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A9445OMEst ;
   private String A9427OMMaqDsc ;
   private String A9426OMMaqCod ;
   private String AV8NomEmp ;
   private String A11448OMMPieCod ;
   private String A11447OMMSEqCod ;
   private String A11446OMMEquCod ;
   private String A11449OMMPieDsc ;
   private String A9458OMMTpo ;
   private String A9456OMOpeNom ;
   private String A9431TMDsc ;
   private String A9449OMRTpo ;
   private String A9447OMRepNom ;
   private String AV12t ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9468OMMCIni ;
   private java.util.Date A9469OMMCFin ;
   private boolean GxHdr2 ;
   private boolean n9427OMMaqDsc ;
   private boolean n9429PMCod ;
   private boolean n9428SMCod ;
   private boolean brk7QS6 ;
   private boolean n11449OMMPieDsc ;
   private boolean n9456OMOpeNom ;
   private boolean n9431TMDsc ;
   private boolean n9447OMRepNom ;
   private boolean brk7QS4 ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private IReportHandler reportHandler ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P07QS2_A396EmprCod ;
   private int[] P07QS2_A9425OMCod ;
   private String[] P07QS2_A9445OMEst ;
   private String[] P07QS2_A9427OMMaqDsc ;
   private boolean[] P07QS2_n9427OMMaqDsc ;
   private String[] P07QS2_A9426OMMaqCod ;
   private String[] P07QS2_A9433OMTxt ;
   private String[] P07QS2_A9464OMNot ;
   private int[] P07QS2_A9429PMCod ;
   private boolean[] P07QS2_n9429PMCod ;
   private int[] P07QS2_A9428SMCod ;
   private boolean[] P07QS2_n9428SMCod ;
   private java.util.Date[] P07QS2_A9436OMFchCre ;
   private String[] P07QS3_A9426OMMaqCod ;
   private String[] P07QS3_A396EmprCod ;
   private int[] P07QS3_A9425OMCod ;
   private String[] P07QS3_A11448OMMPieCod ;
   private String[] P07QS3_A11447OMMSEqCod ;
   private String[] P07QS3_A11446OMMEquCod ;
   private String[] P07QS3_A11449OMMPieDsc ;
   private boolean[] P07QS3_n11449OMMPieDsc ;
   private String[] P07QS4_A396EmprCod ;
   private int[] P07QS4_A9425OMCod ;
   private String[] P07QS4_A9458OMMTpo ;
   private int[] P07QS4_A9455OMOpeCod ;
   private String[] P07QS4_A9456OMOpeNom ;
   private boolean[] P07QS4_n9456OMOpeNom ;
   private String[] P07QS5_A396EmprCod ;
   private int[] P07QS5_A9425OMCod ;
   private int[] P07QS5_A9430TMCod ;
   private String[] P07QS5_A9431TMDsc ;
   private boolean[] P07QS5_n9431TMDsc ;
   private String[] P07QS6_A9426OMMaqCod ;
   private String[] P07QS6_A396EmprCod ;
   private int[] P07QS6_A9425OMCod ;
   private String[] P07QS6_A11449OMMPieDsc ;
   private boolean[] P07QS6_n11449OMMPieDsc ;
   private String[] P07QS6_A11448OMMPieCod ;
   private String[] P07QS6_A11447OMMSEqCod ;
   private String[] P07QS6_A11446OMMEquCod ;
   private int[] P07QS7_A9446OMRepCod ;
   private String[] P07QS7_A396EmprCod ;
   private int[] P07QS7_A9425OMCod ;
   private String[] P07QS7_A9449OMRTpo ;
   private String[] P07QS7_A9447OMRepNom ;
   private boolean[] P07QS7_n9447OMRepNom ;
   private java.math.BigDecimal[] P07QS7_A9453OMRCPre ;
   private java.math.BigDecimal[] P07QS7_A9452OMRCCnt ;
   private java.math.BigDecimal[] P07QS7_A9451OMRRPre ;
   private java.math.BigDecimal[] P07QS7_A9450OMRRCnt ;
   private String[] P07QS8_A396EmprCod ;
   private int[] P07QS8_A9425OMCod ;
   private java.util.Date[] P07QS8_A9468OMMCIni ;
   private int[] P07QS8_A9455OMOpeCod ;
   private String[] P07QS8_A9458OMMTpo ;
   private short[] P07QS8_A9466OMMCLin ;
   private String[] P07QS9_A396EmprCod ;
   private int[] P07QS9_A9425OMCod ;
   private java.util.Date[] P07QS9_A9469OMMCFin ;
   private int[] P07QS9_A9455OMOpeCod ;
   private String[] P07QS9_A9458OMMTpo ;
   private short[] P07QS9_A9466OMMCLin ;
   private String[] P07QS10_A396EmprCod ;
   private int[] P07QS10_A9425OMCod ;
   private java.math.BigDecimal[] P07QS10_A9462OMMCPre ;
   private java.math.BigDecimal[] P07QS10_A9461OMMCCnt ;
   private int[] P07QS10_A9455OMOpeCod ;
   private String[] P07QS10_A9458OMMTpo ;
   private String[] P07QS11_A9426OMMaqCod ;
   private int[] P07QS11_A9425OMCod ;
   private String[] P07QS11_A396EmprCod ;
   private String[] P07QS11_A11448OMMPieCod ;
   private String[] P07QS11_A11447OMMSEqCod ;
   private String[] P07QS11_A11446OMMEquCod ;
   private String[] P07QS11_A9427OMMaqDsc ;
   private boolean[] P07QS11_n9427OMMaqDsc ;
}

final  class rmorart1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07QS2", "SELECT T1.EmprCod, T1.OMCod, T1.OMEst, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T1.OMTxt, T1.OMNot, T1.PMCod, T1.SMCod, T1.OMFchCre FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07QS3", "SELECT T2.OMMaqCod AS OMMaqCod, T1.EmprCod, T1.OMCod, T1.OMMPieCod AS OMMPieCod, T1.OMMSEqCod AS OMMSEqCod, T1.OMMEquCod AS OMMEquCod, T3.MaqPieDsc AS OMMPieDsc FROM ((TXPMOrde1 T1 INNER JOIN TXPMORDEN T2 ON T2.EmprCod = T1.EmprCod AND T2.OMCod = T1.OMCod) LEFT JOIN TXPMaqPie T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T2.OMMaqCod AND T3.MaqEquCod = T1.OMMEquCod AND T3.MaqSEqCod = T1.OMMSEqCod AND T3.MaqPieCod = T1.OMMPieCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T2.OMMaqCod, T1.OMMEquCod, T1.OMMSEqCod, T1.OMMPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07QS4", "SELECT T1.EmprCod, T1.OMCod, T1.OMMTpo, T1.OMOpeCod AS OMOpeCod, T2.OpeNom AS OMOpeNom FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T2.OpeNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07QS5", "SELECT T1.EmprCod, T1.OMCod, T1.TMCod, T2.TMDsc FROM (TXPMOrde2 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.TMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T2.TMDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07QS6", "SELECT T2.OMMaqCod AS OMMaqCod, T1.EmprCod, T1.OMCod, T3.MaqPieDsc AS OMMPieDsc, T1.OMMPieCod AS OMMPieCod, T1.OMMSEqCod AS OMMSEqCod, T1.OMMEquCod AS OMMEquCod FROM ((TXPMOrde1 T1 INNER JOIN TXPMORDEN T2 ON T2.EmprCod = T1.EmprCod AND T2.OMCod = T1.OMCod) LEFT JOIN TXPMaqPie T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T2.OMMaqCod AND T3.MaqEquCod = T1.OMMEquCod AND T3.MaqSEqCod = T1.OMMSEqCod AND T3.MaqPieCod = T1.OMMPieCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T2.OMMaqCod, T1.OMMEquCod, T1.OMMSEqCod, T1.OMMPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07QS7", "SELECT T1.OMRepCod AS OMRepCod, T1.EmprCod, T1.OMCod, T1.OMRTpo, T2.MRNom AS OMRepNom, T1.OMRCPre, T1.OMRCCnt, T1.OMRRPre, T1.OMRRCnt FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T2.MRNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07QS8", "SELECT * FROM (SELECT EmprCod, OMCod, OMMCIni, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, OMMCIni) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07QS9", "SELECT * FROM (SELECT EmprCod, OMCod, OMMCFin, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, OMMCFin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07QS10", "SELECT EmprCod, OMCod, OMMCPre, OMMCCnt, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07QS11", "SELECT T2.OMMaqCod AS OMMaqCod, T1.OMCod, T1.EmprCod, T1.OMMPieCod AS OMMPieCod, T1.OMMSEqCod AS OMMSEqCod, T1.OMMEquCod AS OMMEquCod, T3.MaqDsc AS OMMaqDsc FROM ((TXPMOrde1 T1 INNER JOIN TXPMORDEN T2 ON T2.EmprCod = T1.EmprCod AND T2.OMCod = T1.OMCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T2.OMMaqCod) ORDER BY T1.EmprCod, T1.OMCod, T2.OMMaqCod, T1.OMMEquCod, T1.OMMSEqCod, T1.OMMPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

