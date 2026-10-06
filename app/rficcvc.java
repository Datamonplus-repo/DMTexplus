package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rficcvc extends GXReport
{
   public rficcvc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rficcvc.class ), "" );
   }

   public rficcvc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      rficcvc.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      rficcvc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rficcvc.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      rficcvc.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      rficcvc.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      rficcvc.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      rficcvc.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FICHA DEL COLOR") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV8ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FICCVC", ""), GXv_char1) ;
         rficcvc.this.AV8ContDsc = GXv_char1[0] ;
         /* Using cursor P07672 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1191ForNomCli = P07672_A1191ForNomCli[0] ;
            n1191ForNomCli = P07672_n1191ForNomCli[0] ;
            A1514MacProCod = P07672_A1514MacProCod[0] ;
            n1514MacProCod = P07672_n1514MacProCod[0] ;
            A279CliNom = P07672_A279CliNom[0] ;
            A3560ForOpcCli = P07672_A3560ForOpcCli[0] ;
            n3560ForOpcCli = P07672_n3560ForOpcCli[0] ;
            A3558ForFecApr = P07672_A3558ForFecApr[0] ;
            n3558ForFecApr = P07672_n3558ForFecApr[0] ;
            A279CliNom = P07672_A279CliNom[0] ;
            AV9ObsForTxt = "" ;
            AV10Num_l = (short)(0) ;
            /* Using cursor P07673 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A649ObsForTxt = P07673_A649ObsForTxt[0] ;
               A650ObsLin = P07673_A650ObsLin[0] ;
               if ( AV10Num_l > 3 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               if ( GXutil.strcmp(AV9ObsForTxt, "") == 0 )
               {
                  AV9ObsForTxt = A649ObsForTxt ;
               }
               else
               {
                  AV9ObsForTxt += A649ObsForTxt ;
               }
               AV10Num_l = (short)(AV10Num_l+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            h7670( false, 802) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CONTROLO DA COR", ""), 407, Gx_line+11, 615, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TINTURARIA", ""), 460, Gx_line+36, 562, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DATA DA APROVAÇÃO", ""), 776, Gx_line+9, 947, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A3558ForFecApr, "99/99/99"), 957, Gx_line+9, 1010, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OPÇAO:", ""), 778, Gx_line+31, 837, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!")), 860, Gx_line+28, 875, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(4, Gx_line+4, 1106, Gx_line+65, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CONTRA-AMOSTRA", ""), 38, Gx_line+83, 165, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "APROVADA", ""), 59, Gx_line+102, 135, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE:", ""), 210, Gx_line+90, 281, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 286, Gx_line+90, 331, Gx_line+108, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 339, Gx_line+90, 528, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "COR:", ""), 598, Gx_line+90, 637, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 644, Gx_line+90, 726, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 735, Gx_line+90, 757, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C.CLIENTE", ""), 929, Gx_line+90, 1010, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "F. T.", ""), 795, Gx_line+90, 828, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1514MacProCod, "")), 835, Gx_line+90, 917, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 766, Gx_line+90, 782, Gx_line+108, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), 1019, Gx_line+90, 1101, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(4, Gx_line+76, 1106, Gx_line+119, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8ContDsc, "")), 7, Gx_line+778, 86, Gx_line+795, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Padrão da", ""), 21, Gx_line+576, 83, Gx_line+593, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Preparação", ""), 20, Gx_line+597, 90, Gx_line+614, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Trat. Redutor", ""), 106, Gx_line+588, 185, Gx_line+605, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.S./Grupo:_______________", ""), 218, Gx_line+634, 376, Gx_line+649, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Máq. Tint.:________", ""), 218, Gx_line+655, 327, Gx_line+670, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Qtd.:_____ Kgs Data: ___/___/___", ""), 218, Gx_line+675, 397, Gx_line+690, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Talão Cliente:________________", ""), 218, Gx_line+696, 395, Gx_line+711, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo(s):_________________", ""), 218, Gx_line+716, 379, Gx_line+731, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Obs:", ""), 222, Gx_line+748, 256, Gx_line+766, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.S./Grupo:_______________", ""), 444, Gx_line+634, 602, Gx_line+649, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Máq. Tint.:________", ""), 444, Gx_line+655, 553, Gx_line+670, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Qtd.:_____ Kgs Data: ___/___/___", ""), 444, Gx_line+675, 623, Gx_line+690, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Talão Cliente:________________", ""), 444, Gx_line+696, 621, Gx_line+711, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo(s):_________________", ""), 444, Gx_line+716, 605, Gx_line+731, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.S./Grupo:_______________", ""), 679, Gx_line+634, 837, Gx_line+649, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Máq. Tint.:________", ""), 679, Gx_line+655, 788, Gx_line+670, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Qtd.:_____ Kgs Data: ___/___/___", ""), 679, Gx_line+675, 858, Gx_line+690, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Talão Cliente:________________", ""), 679, Gx_line+696, 856, Gx_line+711, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo(s):_________________", ""), 679, Gx_line+716, 840, Gx_line+731, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.S./Grupo:_______________", ""), 913, Gx_line+634, 1071, Gx_line+649, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Máq. Tint.:________", ""), 913, Gx_line+655, 1022, Gx_line+670, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Qtd.:_____ Kgs Data: ___/___/___", ""), 913, Gx_line+675, 1092, Gx_line+690, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Talão Cliente:________________", ""), 913, Gx_line+696, 1090, Gx_line+711, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo(s):_________________", ""), 913, Gx_line+716, 1074, Gx_line+731, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ESQUELETO", ""), 52, Gx_line+468, 135, Gx_line+485, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(4, Gx_line+457, 202, Gx_line+457, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9ObsForTxt, "")), 260, Gx_line+748, 886, Gx_line+766, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(4, Gx_line+127, 1105, Gx_line+771, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(873, Gx_line+127, 873, Gx_line+744, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(646, Gx_line+127, 646, Gx_line+744, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(423, Gx_line+127, 423, Gx_line+744, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(202, Gx_line+127, 202, Gx_line+771, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(4, Gx_line+495, 202, Gx_line+495, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(202, Gx_line+621, 1105, Gx_line+621, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+572, 203, Gx_line+572, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+621, 203, Gx_line+621, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(97, Gx_line+572, 97, Gx_line+771, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(202, Gx_line+76, 202, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(202, Gx_line+743, 1105, Gx_line+743, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+802) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7670( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7670( boolean bFoot ,
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
      this.aP0[0] = rficcvc.this.A396EmprCod;
      this.aP1[0] = rficcvc.this.A252CliCod;
      this.aP2[0] = rficcvc.this.A494ForSer;
      this.aP3[0] = rficcvc.this.A482ForColNom;
      this.aP4[0] = rficcvc.this.A483ForColNum;
      this.aP5[0] = rficcvc.this.A831TipColCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ContDsc = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P07672_A396EmprCod = new String[] {""} ;
      P07672_A252CliCod = new int[1] ;
      P07672_A494ForSer = new String[] {""} ;
      P07672_A482ForColNom = new String[] {""} ;
      P07672_A483ForColNum = new int[1] ;
      P07672_A831TipColCod = new byte[1] ;
      P07672_A1191ForNomCli = new String[] {""} ;
      P07672_n1191ForNomCli = new boolean[] {false} ;
      P07672_A1514MacProCod = new String[] {""} ;
      P07672_n1514MacProCod = new boolean[] {false} ;
      P07672_A279CliNom = new String[] {""} ;
      P07672_A3560ForOpcCli = new String[] {""} ;
      P07672_n3560ForOpcCli = new boolean[] {false} ;
      P07672_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P07672_n3558ForFecApr = new boolean[] {false} ;
      A1191ForNomCli = "" ;
      A1514MacProCod = "" ;
      A279CliNom = "" ;
      A3560ForOpcCli = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      AV9ObsForTxt = "" ;
      P07673_A396EmprCod = new String[] {""} ;
      P07673_A252CliCod = new int[1] ;
      P07673_A494ForSer = new String[] {""} ;
      P07673_A482ForColNom = new String[] {""} ;
      P07673_A483ForColNum = new int[1] ;
      P07673_A831TipColCod = new byte[1] ;
      P07673_A649ObsForTxt = new String[] {""} ;
      P07673_A650ObsLin = new short[1] ;
      A649ObsForTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rficcvc__default(),
         new Object[] {
             new Object[] {
            P07672_A396EmprCod, P07672_A252CliCod, P07672_A494ForSer, P07672_A482ForColNom, P07672_A483ForColNum, P07672_A831TipColCod, P07672_A1191ForNomCli, P07672_n1191ForNomCli, P07672_A1514MacProCod, P07672_n1514MacProCod,
            P07672_A279CliNom, P07672_A3560ForOpcCli, P07672_n3560ForOpcCli, P07672_A3558ForFecApr, P07672_n3558ForFecApr
            }
            , new Object[] {
            P07673_A396EmprCod, P07673_A252CliCod, P07673_A494ForSer, P07673_A482ForColNom, P07673_A483ForColNum, P07673_A831TipColCod, P07673_A649ObsForTxt, P07673_A650ObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short AV10Num_l ;
   private short A650ObsLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV8ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A1191ForNomCli ;
   private String A1514MacProCod ;
   private String A279CliNom ;
   private String A3560ForOpcCli ;
   private String AV9ObsForTxt ;
   private String A649ObsForTxt ;
   private java.util.Date A3558ForFecApr ;
   private boolean n1191ForNomCli ;
   private boolean n1514MacProCod ;
   private boolean n3560ForOpcCli ;
   private boolean n3558ForFecApr ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07672_A396EmprCod ;
   private int[] P07672_A252CliCod ;
   private String[] P07672_A494ForSer ;
   private String[] P07672_A482ForColNom ;
   private int[] P07672_A483ForColNum ;
   private byte[] P07672_A831TipColCod ;
   private String[] P07672_A1191ForNomCli ;
   private boolean[] P07672_n1191ForNomCli ;
   private String[] P07672_A1514MacProCod ;
   private boolean[] P07672_n1514MacProCod ;
   private String[] P07672_A279CliNom ;
   private String[] P07672_A3560ForOpcCli ;
   private boolean[] P07672_n3560ForOpcCli ;
   private java.util.Date[] P07672_A3558ForFecApr ;
   private boolean[] P07672_n3558ForFecApr ;
   private String[] P07673_A396EmprCod ;
   private int[] P07673_A252CliCod ;
   private String[] P07673_A494ForSer ;
   private String[] P07673_A482ForColNom ;
   private int[] P07673_A483ForColNum ;
   private byte[] P07673_A831TipColCod ;
   private String[] P07673_A649ObsForTxt ;
   private short[] P07673_A650ObsLin ;
}

final  class rficcvc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07672", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForNomCli, T1.MacProCod, T2.CliNom, T1.ForOpcCli, T1.ForFecApr FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07673", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

