package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rrevmtx extends GXReport
{
   public rrevmtx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rrevmtx.class ), "" );
   }

   public rrevmtx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      rrevmtx.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      rrevmtx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rrevmtx.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rrevmtx.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rrevmtx.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REVMTX", "", 2, 2, 256, 12240, 15926, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Planilla Revisado Martex") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Execute user subroutine: 'CARGARDATOS' */
         S111 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.pverifec(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
         rrevmtx.this.A396EmprCod = GXv_char1[0] ;
         rrevmtx.this.A129BarCod = GXv_int2[0] ;
         rrevmtx.this.A132BarCodReo = GXv_int3[0] ;
         rrevmtx.this.A130BarCodPar = GXv_char4[0] ;
         AV41Pag = 1 ;
         AV53Cont = (byte)(4) ;
         while ( AV53Cont <= 99 )
         {
            AV18BarMetLan[3-1] = AV18BarMetLan[3-1].add((AV18BarMetLan[AV53Cont-1])) ;
            AV53Cont = (byte)(AV53Cont+1) ;
         }
         while ( ( AV41Pag <= 10 ) && ( GXutil.strcmp(AV11BarPieCod[(int)((AV41Pag-1)*10+1)-1], "") != 0 ) )
         {
            /* Using cursor P07KZ3 */
            pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A2826BarNumLot = P07KZ3_A2826BarNumLot[0] ;
               A118BarAcaQui = P07KZ3_A118BarAcaQui[0] ;
               A135BarColNom = P07KZ3_A135BarColNom[0] ;
               A136BarColNum = P07KZ3_A136BarColNum[0] ;
               A143BarDisNum = P07KZ3_A143BarDisNum[0] ;
               A1652BarSerDsc = P07KZ3_A1652BarSerDsc[0] ;
               A212BarSer = P07KZ3_A212BarSer[0] ;
               A168BarKgmLan = P07KZ3_A168BarKgmLan[0] ;
               A186BarMtrLan = P07KZ3_A186BarMtrLan[0] ;
               A168BarKgmLan = P07KZ3_A168BarKgmLan[0] ;
               A186BarMtrLan = P07KZ3_A186BarMtrLan[0] ;
               h7KZ0( false, 116) ;
               getPrinter().GxAttris("Arial", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 386, Gx_line+0, 700, Gx_line+26, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REGISTRO DE CALIDAD DE INSPECCION PRODUCTO FINAL", ""), 299, Gx_line+29, 786, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 30, Gx_line+50, 76, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 30, Gx_line+67, 66, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 30, Gx_line+83, 62, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Acabado", ""), 30, Gx_line+101, 80, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composición", ""), 314, Gx_line+50, 391, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 314, Gx_line+67, 357, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta", ""), 314, Gx_line+83, 385, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 314, Gx_line+101, 343, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros Segunda Acabado", ""), 580, Gx_line+67, 728, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros Segunda Tejido", ""), 580, Gx_line+83, 713, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros/Kilos Crudo", ""), 580, Gx_line+101, 692, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros Primera", ""), 580, Gx_line+50, 672, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Revisor", ""), 808, Gx_line+67, 853, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Trans", ""), 808, Gx_line+83, 841, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Merma", ""), 808, Gx_line+101, 850, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 808, Gx_line+50, 842, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 84, Gx_line+49, 167, Gx_line+65, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 176, Gx_line+49, 311, Gx_line+65, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 84, Gx_line+66, 176, Gx_line+82, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 84, Gx_line+82, 128, Gx_line+98, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 176, Gx_line+82, 272, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A118BarAcaQui, "")), 84, Gx_line+100, 129, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9TipArtDsc, "")), 397, Gx_line+49, 575, Gx_line+64, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A186BarMtrLan, "ZZZZZ9.99")), 397, Gx_line+66, 464, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A168BarKgmLan, "ZZZZZ9.99")), 397, Gx_line+100, 463, Gx_line+116, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10HDR, "")), 397, Gx_line+82, 449, Gx_line+98, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18BarMetLan[1-1], "ZZZZZZ.ZZ")), 733, Gx_line+50, 800, Gx_line+66, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18BarMetLan[2-1], "ZZZZZZ.ZZ")), 733, Gx_line+83, 800, Gx_line+99, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18BarMetLan[3-1], "ZZZZZZ.ZZ")), 733, Gx_line+67, 800, Gx_line+83, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33BarUniCru, "ZZZZZ9.99")), 733, Gx_line+101, 800, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25BarMer, "ZZ9.99 %")), 866, Gx_line+101, 925, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV24HisProFec, "99/99/99"), 866, Gx_line+50, 925, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23OpeNom, "")), 866, Gx_line+67, 1063, Gx_line+82, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2826BarNumLot), "ZZZZZZZ9")), 866, Gx_line+83, 925, Gx_line+99, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(941, Gx_line+0, 1067, Gx_line+39, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CODIGO", ""), 947, Gx_line+4, 992, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REVISION", ""), 947, Gx_line+20, 999, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R1-IT-REVF", ""), 1002, Gx_line+4, 1060, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "D", ""), 1002, Gx_line+20, 1010, Gx_line+35, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+116) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            h7KZ0( false, 54) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+10)-1], "")), 995, Gx_line+2, 1062, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+9)-1], "")), 892, Gx_line+2, 959, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+8)-1], "")), 786, Gx_line+2, 853, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+7)-1], "")), 681, Gx_line+2, 748, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+6)-1], "")), 577, Gx_line+2, 644, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+2)-1], "")), 157, Gx_line+2, 224, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+3)-1], "")), 263, Gx_line+2, 330, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+4)-1], "")), 368, Gx_line+2, 435, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+5)-1], "")), 472, Gx_line+2, 539, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+1)-1], "ZZZZZZ.ZZ")), 61, Gx_line+20, 118, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11BarPieCod[(int)((AV41Pag-1)*10+1)-1], "")), 53, Gx_line+2, 120, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+7)-1], "ZZZZZZ.ZZ")), 690, Gx_line+20, 747, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+8)-1], "ZZZZZZ.ZZ")), 795, Gx_line+20, 852, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+9)-1], "ZZZZZZ.ZZ")), 900, Gx_line+20, 957, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+0, 1067, Gx_line+0, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1066, Gx_line+0, 1066, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+0, 18, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(960, Gx_line+0, 960, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(856, Gx_line+0, 856, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(752, Gx_line+0, 752, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(647, Gx_line+0, 647, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(542, Gx_line+0, 542, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(438, Gx_line+0, 438, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(332, Gx_line+0, 332, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(228, Gx_line+0, 228, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(123, Gx_line+0, 123, Gx_line+54, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+53, 1067, Gx_line+53, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+35, 1067, Gx_line+35, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+18, 1067, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 24, Gx_line+2, 55, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 24, Gx_line+20, 60, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 24, Gx_line+38, 45, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 53, Gx_line+38, 79, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 89, Gx_line+38, 120, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(48, Gx_line+35, 48, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(83, Gx_line+35, 83, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 128, Gx_line+2, 159, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 128, Gx_line+20, 164, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 128, Gx_line+38, 149, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 158, Gx_line+38, 184, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 193, Gx_line+38, 224, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(153, Gx_line+35, 153, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(188, Gx_line+35, 188, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 233, Gx_line+2, 264, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 233, Gx_line+20, 269, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 233, Gx_line+38, 254, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 263, Gx_line+38, 289, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 298, Gx_line+38, 329, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(257, Gx_line+35, 257, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(293, Gx_line+35, 293, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 339, Gx_line+2, 370, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 339, Gx_line+20, 375, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 339, Gx_line+38, 360, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 368, Gx_line+38, 394, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 403, Gx_line+38, 434, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(363, Gx_line+35, 363, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 443, Gx_line+2, 474, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 443, Gx_line+20, 479, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 443, Gx_line+38, 464, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 473, Gx_line+38, 499, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 507, Gx_line+38, 538, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(467, Gx_line+35, 467, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(502, Gx_line+35, 502, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 548, Gx_line+2, 579, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 548, Gx_line+20, 584, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 548, Gx_line+38, 569, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 577, Gx_line+38, 603, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 613, Gx_line+38, 644, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(572, Gx_line+35, 572, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(607, Gx_line+35, 607, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 652, Gx_line+2, 683, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 652, Gx_line+20, 688, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 652, Gx_line+38, 673, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 682, Gx_line+38, 708, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 717, Gx_line+38, 748, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(677, Gx_line+35, 677, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(711, Gx_line+35, 711, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 757, Gx_line+2, 788, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 757, Gx_line+20, 793, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 757, Gx_line+38, 778, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 786, Gx_line+38, 812, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 822, Gx_line+38, 853, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(781, Gx_line+35, 781, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(817, Gx_line+35, 817, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 863, Gx_line+2, 894, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 863, Gx_line+20, 899, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 863, Gx_line+38, 884, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 892, Gx_line+38, 918, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 927, Gx_line+38, 958, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(886, Gx_line+35, 886, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(921, Gx_line+35, 921, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 966, Gx_line+2, 997, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 966, Gx_line+20, 1002, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEF", ""), 966, Gx_line+38, 987, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS", ""), 995, Gx_line+38, 1021, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(990, Gx_line+35, 990, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1025, Gx_line+35, 1025, Gx_line+54, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PTOS", ""), 1030, Gx_line+38, 1061, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+2)-1], "ZZZZZZ.ZZ")), 166, Gx_line+20, 223, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+3)-1], "ZZZZZZ.ZZ")), 271, Gx_line+20, 328, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+4)-1], "ZZZZZZ.ZZ")), 376, Gx_line+20, 433, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+5)-1], "ZZZZZZ.ZZ")), 480, Gx_line+20, 537, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+6)-1], "ZZZZZZ.ZZ")), 585, Gx_line+20, 642, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34BarPieUni[(int)((AV41Pag-1)*10+10)-1], "ZZZZZZ.ZZ")), 1003, Gx_line+20, 1060, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(397, Gx_line+35, 397, Gx_line+54, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+54) ;
            AV27ContDef = (byte)(0) ;
            while ( AV27ContDef < 19 )
            {
               AV27ContDef = (byte)(AV27ContDef+1) ;
               h7KZ0( false, 19) ;
               getPrinter().GxDrawLine(397, Gx_line+0, 397, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(18, Gx_line+0, 18, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(48, Gx_line+0, 48, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(960, Gx_line+0, 960, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(856, Gx_line+0, 856, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(752, Gx_line+0, 752, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(647, Gx_line+0, 647, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(542, Gx_line+0, 542, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(438, Gx_line+0, 438, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(332, Gx_line+0, 332, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(228, Gx_line+0, 228, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(123, Gx_line+0, 123, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1066, Gx_line+0, 1066, Gx_line+19, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(83, Gx_line+0, 83, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(153, Gx_line+0, 153, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(188, Gx_line+0, 188, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(257, Gx_line+0, 257, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(293, Gx_line+0, 293, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(572, Gx_line+0, 572, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(607, Gx_line+0, 607, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(502, Gx_line+0, 502, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(467, Gx_line+0, 467, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(363, Gx_line+0, 363, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(886, Gx_line+0, 886, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(921, Gx_line+0, 921, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(817, Gx_line+0, 817, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(781, Gx_line+0, 781, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(711, Gx_line+0, 711, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(677, Gx_line+0, 677, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(990, Gx_line+0, 990, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1025, Gx_line+0, 1025, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+1)-1][AV27ContDef-1]), "ZZZZ")), 22, Gx_line+2, 48, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+1)-1][AV27ContDef-1]), "ZZZZ")), 92, Gx_line+2, 118, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+1)-1][AV27ContDef-1], "ZZZ.Z")), 50, Gx_line+2, 82, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+2)-1][AV27ContDef-1]), "ZZZZ")), 198, Gx_line+2, 224, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+2)-1][AV27ContDef-1], "ZZZ.Z")), 155, Gx_line+2, 187, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+2)-1][AV27ContDef-1]), "ZZZZ")), 126, Gx_line+2, 152, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+3)-1][AV27ContDef-1]), "ZZZZ")), 301, Gx_line+2, 327, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+3)-1][AV27ContDef-1], "ZZZ.Z")), 259, Gx_line+2, 291, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+3)-1][AV27ContDef-1]), "ZZZZ")), 231, Gx_line+2, 257, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+4)-1][AV27ContDef-1]), "ZZZZ")), 406, Gx_line+2, 432, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+4)-1][AV27ContDef-1], "ZZZ.Z")), 365, Gx_line+2, 397, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+4)-1][AV27ContDef-1]), "ZZZZ")), 336, Gx_line+2, 362, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+5)-1][AV27ContDef-1], "ZZZ.Z")), 470, Gx_line+2, 502, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+5)-1][AV27ContDef-1]), "ZZZZ")), 441, Gx_line+2, 467, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+5)-1][AV27ContDef-1]), "ZZZZ")), 510, Gx_line+2, 536, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+6)-1][AV27ContDef-1]), "ZZZZ")), 616, Gx_line+2, 642, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+6)-1][AV27ContDef-1], "ZZZ.Z")), 574, Gx_line+2, 606, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+6)-1][AV27ContDef-1]), "ZZZZ")), 546, Gx_line+2, 572, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+7)-1][AV27ContDef-1]), "ZZZZ")), 720, Gx_line+2, 746, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+7)-1][AV27ContDef-1], "ZZZ.Z")), 679, Gx_line+2, 711, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+7)-1][AV27ContDef-1]), "ZZZZ")), 650, Gx_line+2, 676, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+8)-1][AV27ContDef-1]), "ZZZZ")), 825, Gx_line+2, 851, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+8)-1][AV27ContDef-1], "ZZZ.Z")), 783, Gx_line+2, 815, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+8)-1][AV27ContDef-1]), "ZZZZ")), 755, Gx_line+2, 781, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+9)-1][AV27ContDef-1]), "ZZZZ")), 930, Gx_line+2, 956, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+9)-1][AV27ContDef-1], "ZZZ.Z")), 889, Gx_line+2, 921, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+9)-1][AV27ContDef-1]), "ZZZZ")), 860, Gx_line+2, 886, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarDefPnt[(int)((AV41Pag-1)*10+10)-1][AV27ContDef-1]), "ZZZZ")), 1033, Gx_line+2, 1059, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarDefMtr[(int)((AV41Pag-1)*10+10)-1][AV27ContDef-1], "ZZZ.Z")), 992, Gx_line+2, 1024, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29BarDefCod[(int)((AV41Pag-1)*10+10)-1][AV27ContDef-1]), "ZZZZ")), 964, Gx_line+2, 990, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(18, Gx_line+18, 1067, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            h7KZ0( false, 271) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Observa[4-1], "")), 652, Gx_line+250, 945, Gx_line+266, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+0, 18, Gx_line+266, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(960, Gx_line+0, 960, Gx_line+177, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(856, Gx_line+0, 856, Gx_line+177, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(752, Gx_line+0, 752, Gx_line+177, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(647, Gx_line+0, 647, Gx_line+266, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(542, Gx_line+0, 542, Gx_line+266, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(438, Gx_line+0, 438, Gx_line+266, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(332, Gx_line+0, 332, Gx_line+177, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(228, Gx_line+0, 228, Gx_line+177, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(123, Gx_line+0, 123, Gx_line+266, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 20, Gx_line+1, 61, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 20, Gx_line+19, 46, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 20, Gx_line+36, 45, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 20, Gx_line+54, 57, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 20, Gx_line+72, 53, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 20, Gx_line+90, 53, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 20, Gx_line+107, 57, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 20, Gx_line+126, 63, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 966, Gx_line+1, 1007, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 966, Gx_line+19, 992, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 966, Gx_line+36, 991, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 966, Gx_line+54, 1003, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 966, Gx_line+72, 999, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 966, Gx_line+90, 999, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 966, Gx_line+107, 1003, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 966, Gx_line+126, 1009, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 863, Gx_line+1, 904, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 863, Gx_line+19, 889, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 863, Gx_line+36, 888, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 863, Gx_line+54, 900, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 863, Gx_line+72, 896, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 863, Gx_line+90, 896, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 863, Gx_line+107, 900, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 863, Gx_line+126, 906, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 757, Gx_line+1, 798, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 757, Gx_line+19, 783, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 757, Gx_line+36, 782, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 757, Gx_line+54, 794, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 757, Gx_line+72, 790, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 757, Gx_line+90, 790, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 757, Gx_line+107, 794, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 757, Gx_line+126, 800, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 652, Gx_line+1, 693, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 652, Gx_line+20, 678, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 652, Gx_line+38, 677, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 652, Gx_line+55, 689, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 652, Gx_line+73, 685, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 652, Gx_line+91, 685, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 652, Gx_line+107, 689, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 652, Gx_line+126, 695, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 548, Gx_line+1, 589, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 548, Gx_line+20, 574, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 548, Gx_line+38, 573, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 548, Gx_line+55, 585, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 548, Gx_line+73, 581, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 548, Gx_line+91, 581, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 548, Gx_line+107, 585, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 548, Gx_line+126, 591, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 443, Gx_line+1, 484, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 443, Gx_line+20, 469, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 443, Gx_line+38, 468, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 443, Gx_line+55, 480, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 443, Gx_line+73, 476, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 443, Gx_line+91, 476, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 443, Gx_line+107, 480, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 443, Gx_line+126, 486, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 339, Gx_line+1, 380, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 339, Gx_line+20, 365, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 339, Gx_line+38, 364, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 339, Gx_line+55, 376, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 339, Gx_line+73, 372, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 339, Gx_line+91, 372, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 339, Gx_line+107, 376, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 339, Gx_line+126, 382, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 233, Gx_line+1, 274, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 233, Gx_line+20, 259, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 233, Gx_line+38, 258, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 233, Gx_line+55, 270, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 233, Gx_line+73, 266, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 233, Gx_line+91, 266, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 233, Gx_line+107, 270, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 233, Gx_line+126, 276, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R m/kg", ""), 128, Gx_line+1, 169, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PML", ""), 128, Gx_line+20, 154, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 128, Gx_line+38, 153, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 128, Gx_line+55, 165, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs T", ""), 128, Gx_line+73, 161, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts T", ""), 128, Gx_line+91, 161, Gx_line+106, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ptos T", ""), 128, Gx_line+107, 165, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 128, Gx_line+126, 171, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+1)-1]), "ZZZZ")), 88, Gx_line+55, 118, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+1)-1]), "ZZ")), 102, Gx_line+126, 118, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+1)-1], "ZZZZZZ.ZZ")), 51, Gx_line+72, 118, Gx_line+88, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+1)-1], "ZZZZZZ.ZZ")), 51, Gx_line+91, 118, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+1)-1]), "ZZZZ")), 88, Gx_line+19, 118, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+1)-1]), "ZZZZZ")), 80, Gx_line+107, 117, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+1)-1], "ZZZ.ZZ")), 73, Gx_line+1, 118, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+1)-1]), "ZZZZ")), 88, Gx_line+36, 118, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+2)-1]), "ZZZZ")), 194, Gx_line+54, 224, Gx_line+70, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+2)-1]), "ZZ")), 208, Gx_line+126, 224, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+2)-1], "ZZZZZZ.ZZ")), 157, Gx_line+72, 224, Gx_line+88, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+2)-1], "ZZZZZZ.ZZ")), 157, Gx_line+90, 224, Gx_line+106, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+2)-1]), "ZZZZ")), 194, Gx_line+19, 224, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+2)-1]), "ZZZZZ")), 186, Gx_line+107, 223, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+2)-1], "ZZZ.ZZ")), 179, Gx_line+1, 224, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+2)-1]), "ZZZZ")), 194, Gx_line+36, 224, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+3)-1]), "ZZZZ")), 299, Gx_line+54, 329, Gx_line+70, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+3)-1]), "ZZ")), 314, Gx_line+126, 330, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+3)-1], "ZZZZZZ.ZZ")), 263, Gx_line+72, 330, Gx_line+88, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+3)-1], "ZZZZZZ.ZZ")), 263, Gx_line+90, 330, Gx_line+106, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+3)-1]), "ZZZZ")), 299, Gx_line+19, 329, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+3)-1]), "ZZZZZ")), 292, Gx_line+107, 329, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+3)-1]), "ZZZZ")), 299, Gx_line+36, 329, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+3)-1], "ZZZ.ZZ")), 284, Gx_line+1, 329, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+4)-1]), "ZZZZ")), 404, Gx_line+54, 434, Gx_line+70, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+4)-1]), "ZZ")), 419, Gx_line+126, 435, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+4)-1], "ZZZZZZ.ZZ")), 368, Gx_line+72, 435, Gx_line+88, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+4)-1], "ZZZZZZ.ZZ")), 368, Gx_line+90, 435, Gx_line+106, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+4)-1]), "ZZZZ")), 404, Gx_line+19, 434, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+4)-1]), "ZZZZZ")), 397, Gx_line+107, 434, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+4)-1]), "ZZZZ")), 375, Gx_line+36, 405, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+4)-1], "ZZZ.ZZ")), 390, Gx_line+1, 435, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+5)-1]), "ZZZZ")), 508, Gx_line+55, 538, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+5)-1]), "ZZ")), 523, Gx_line+126, 539, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+5)-1], "ZZZZZZ.ZZ")), 472, Gx_line+73, 539, Gx_line+89, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+5)-1], "ZZZZZZ.ZZ")), 472, Gx_line+91, 539, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+5)-1]), "ZZZZ")), 508, Gx_line+20, 538, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+5)-1]), "ZZZZZ")), 501, Gx_line+107, 538, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+5)-1]), "ZZZZ")), 508, Gx_line+38, 538, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+5)-1], "ZZZ.ZZ")), 494, Gx_line+1, 539, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+6)-1]), "ZZZZ")), 614, Gx_line+55, 644, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+6)-1]), "ZZ")), 628, Gx_line+126, 644, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+6)-1], "ZZZZZZ.ZZ")), 577, Gx_line+73, 644, Gx_line+89, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+6)-1], "ZZZZZZ.ZZ")), 577, Gx_line+91, 644, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+6)-1]), "ZZZZ")), 614, Gx_line+20, 644, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+6)-1]), "ZZZZZ")), 606, Gx_line+107, 643, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+6)-1], "ZZZ.ZZ")), 599, Gx_line+1, 644, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+6)-1]), "ZZZZ")), 614, Gx_line+38, 644, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+7)-1]), "ZZZZ")), 718, Gx_line+55, 748, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+7)-1]), "ZZ")), 732, Gx_line+126, 748, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+7)-1], "ZZZZZZ.ZZ")), 681, Gx_line+73, 748, Gx_line+89, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+7)-1], "ZZZZZZ.ZZ")), 681, Gx_line+91, 748, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+7)-1]), "ZZZZ")), 718, Gx_line+20, 748, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+7)-1]), "ZZZZZ")), 710, Gx_line+107, 747, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+7)-1], "ZZZ.ZZ")), 703, Gx_line+1, 748, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+7)-1]), "ZZZZ")), 718, Gx_line+38, 748, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+8)-1]), "ZZZZ")), 823, Gx_line+55, 853, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+8)-1]), "ZZ")), 838, Gx_line+126, 854, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+8)-1], "ZZZZZZ.ZZ")), 786, Gx_line+73, 853, Gx_line+89, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+8)-1], "ZZZZZZ.ZZ")), 786, Gx_line+91, 853, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+8)-1]), "ZZZZ")), 823, Gx_line+20, 853, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+8)-1]), "ZZZZZ")), 816, Gx_line+107, 853, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+8)-1], "ZZZ.ZZ")), 808, Gx_line+1, 853, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+8)-1]), "ZZZZ")), 823, Gx_line+38, 853, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+9)-1]), "ZZZZ")), 928, Gx_line+55, 958, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+9)-1]), "ZZ")), 943, Gx_line+126, 959, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+9)-1], "ZZZZZZ.ZZ")), 892, Gx_line+73, 959, Gx_line+89, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+9)-1], "ZZZZZZ.ZZ")), 892, Gx_line+91, 959, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+9)-1]), "ZZZZ")), 928, Gx_line+20, 958, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+9)-1]), "ZZZZZ")), 921, Gx_line+107, 958, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+9)-1], "ZZZ.ZZ")), 914, Gx_line+1, 959, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+9)-1]), "ZZZZ")), 928, Gx_line+38, 958, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarPieAnc[(int)((AV41Pag-1)*10+10)-1]), "ZZZZ")), 1031, Gx_line+55, 1061, Gx_line+71, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20BarPieCal[(int)((AV41Pag-1)*10+10)-1]), "ZZ")), 1046, Gx_line+126, 1062, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarPieKil[(int)((AV41Pag-1)*10+10)-1], "ZZZZZZ.ZZ")), 995, Gx_line+73, 1062, Gx_line+89, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12BarPieMtr[(int)((AV41Pag-1)*10+10)-1], "ZZZZZZ.ZZ")), 995, Gx_line+91, 1062, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePML[(int)((AV41Pag-1)*10+10)-1]), "ZZZZ")), 1031, Gx_line+20, 1061, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19BarPiePnt[(int)((AV41Pag-1)*10+10)-1]), "ZZZZZ")), 1024, Gx_line+107, 1061, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarPieRdt[(int)((AV41Pag-1)*10+10)-1], "ZZZ.ZZ")), 1017, Gx_line+1, 1062, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16BarPieGrm[(int)((AV41Pag-1)*10+10)-1]), "ZZZZ")), 1031, Gx_line+38, 1061, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+213, 1066, Gx_line+213, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+230, 1066, Gx_line+230, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+248, 1066, Gx_line+248, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+266, 1066, Gx_line+266, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1066, Gx_line+0, 1066, Gx_line+266, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Autorización", ""), 39, Gx_line+179, 112, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Resultados", ""), 248, Gx_line+179, 314, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 652, Gx_line+179, 694, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 652, Gx_line+197, 730, Gx_line+212, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35CliNom, "")), 757, Gx_line+179, 977, Gx_line+195, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 20, Gx_line+197, 45, Gx_line+212, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Aceptado", ""), 20, Gx_line+215, 70, Gx_line+230, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rechazado", ""), 20, Gx_line+250, 78, Gx_line+265, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubicación", ""), 907, Gx_line+250, 962, Gx_line+265, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+0, 1067, Gx_line+0, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+18, 1067, Gx_line+18, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+35, 1067, Gx_line+35, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+53, 1067, Gx_line+53, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+71, 1067, Gx_line+71, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+89, 1067, Gx_line+89, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+106, 1067, Gx_line+106, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+124, 1067, Gx_line+124, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+195, 1066, Gx_line+195, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Liberación", ""), 459, Gx_line+179, 520, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Resultados", ""), 563, Gx_line+179, 629, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 443, Gx_line+197, 483, Gx_line+212, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Salida", ""), 443, Gx_line+215, 474, Gx_line+230, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 443, Gx_line+232, 475, Gx_line+247, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts Reales", ""), 443, Gx_line+250, 499, Gx_line+265, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37BarPieLoc, "")), 988, Gx_line+250, 1062, Gx_line+266, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Observa[1-1], "")), 752, Gx_line+197, 1045, Gx_line+213, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Observa[2-1], "")), 652, Gx_line+215, 945, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Observa[3-1], "")), 652, Gx_line+232, 945, Gx_line+248, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Aceptado, "")), 128, Gx_line+215, 275, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Autoriza, "")), 128, Gx_line+197, 275, Gx_line+213, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Rechazado, "")), 128, Gx_line+250, 421, Gx_line+266, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47PESO, "")), 128, Gx_line+232, 202, Gx_line+248, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PM2", ""), 20, Gx_line+232, 42, Gx_line+247, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+142, 1067, Gx_line+142, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 20, Gx_line+163, 59, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+1)-1]), "ZZZZZZ")), 72, Gx_line+163, 117, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 966, Gx_line+163, 1005, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 863, Gx_line+163, 902, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 757, Gx_line+163, 796, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 652, Gx_line+163, 691, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 548, Gx_line+163, 587, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 443, Gx_line+163, 482, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 339, Gx_line+163, 378, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 233, Gx_line+163, 272, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+2)-1]), "ZZZZZZ")), 178, Gx_line+163, 223, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+3)-1]), "ZZZZZZ")), 283, Gx_line+163, 328, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+4)-1]), "ZZZZZZ")), 389, Gx_line+163, 434, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+5)-1]), "ZZZZZZ")), 493, Gx_line+163, 538, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+6)-1]), "ZZZZZZ")), 598, Gx_line+163, 643, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+7)-1]), "ZZZZZZ")), 702, Gx_line+163, 747, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+8)-1]), "ZZZZZZ")), 807, Gx_line+163, 852, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+9)-1]), "ZZZZZZ")), 913, Gx_line+163, 958, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54OpeCod[(int)((AV41Pag-1)*10+10)-1]), "ZZZZZZ")), 1016, Gx_line+163, 1061, Gx_line+179, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opera.", ""), 128, Gx_line+163, 167, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+178, 1067, Gx_line+178, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 20, Gx_line+145, 49, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+160, 1067, Gx_line+160, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+1)-1], "")), 102, Gx_line+145, 118, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+2)-1], "")), 208, Gx_line+145, 224, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 128, Gx_line+145, 157, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+3)-1], "")), 314, Gx_line+145, 330, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 233, Gx_line+145, 262, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+4)-1], "")), 419, Gx_line+145, 435, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 339, Gx_line+145, 368, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+5)-1], "")), 523, Gx_line+145, 539, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 443, Gx_line+145, 472, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+6)-1], "")), 628, Gx_line+145, 644, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 548, Gx_line+145, 577, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+7)-1], "")), 732, Gx_line+145, 748, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 652, Gx_line+145, 681, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+8)-1], "")), 838, Gx_line+145, 854, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 757, Gx_line+145, 786, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+9)-1], "")), 943, Gx_line+145, 959, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 863, Gx_line+145, 892, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Tono[(int)((AV41Pag-1)*10+10)-1], "")), 1046, Gx_line+145, 1062, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tono", ""), 966, Gx_line+145, 995, Gx_line+160, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+271) ;
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            AV41Pag = (long)(AV41Pag+1) ;
            while ( ( AV41Pag <= 10 ) && ( GXutil.strcmp(AV11BarPieCod[(int)((AV41Pag-1)*10+1)-1], "") == 0 ) )
            {
               AV41Pag = (long)(AV41Pag+1) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7KZ0( true, 0) ;
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
      /* 'CARGARDATOS' Routine */
      returnInSub = false ;
      AV38Cal = (byte)(1) ;
      AV26ContPie = (byte)(0) ;
      while ( AV38Cal <= 9 )
      {
         Gx_msg = "" ;
         Gx_msg += httpContext.getMessage( "cal ", "") + GXutil.trim( GXutil.str( AV38Cal, 10, 0)) + "; " + GXutil.chr( (short)(13)) ;
         /* Using cursor P07KZ4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A228BarUniMed = P07KZ4_A228BarUniMed[0] ;
            A3134BarAncSal1 = P07KZ4_A3134BarAncSal1[0] ;
            A407EmprNom = P07KZ4_A407EmprNom[0] ;
            n407EmprNom = P07KZ4_n407EmprNom[0] ;
            A217BarTipArt = P07KZ4_A217BarTipArt[0] ;
            n217BarTipArt = P07KZ4_n217BarTipArt[0] ;
            A2311BarCliDes = P07KZ4_A2311BarCliDes[0] ;
            A407EmprNom = P07KZ4_A407EmprNom[0] ;
            n407EmprNom = P07KZ4_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            GXt_char5 = AV9TipArtDsc ;
            GXv_char4[0] = GXt_char5 ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char4) ;
            rrevmtx.this.GXt_char5 = GXv_char4[0] ;
            AV9TipArtDsc = GXt_char5 ;
            AV10HDR = GXutil.trim( GXutil.str( A129BarCod, 10, 0)) + GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)) + GXutil.trim( A130BarCodPar) ;
            GXt_char5 = AV35CliNom ;
            GXv_char4[0] = GXt_char5 ;
            new app.pclinom(remoteHandle, context).execute( A396EmprCod, A2311BarCliDes, GXv_char4) ;
            rrevmtx.this.GXt_char5 = GXv_char4[0] ;
            AV35CliNom = GXt_char5 ;
            /* Using cursor P07KZ5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P07KZ5_A44AlbRecCod[0] ;
               A200BarPieCod = P07KZ5_A200BarPieCod[0] ;
               A183BarMetLan = P07KZ5_A183BarMetLan[0] ;
               A1691BarPieAnc = P07KZ5_A1691BarPieAnc[0] ;
               n1691BarPieAnc = P07KZ5_n1691BarPieAnc[0] ;
               A170BarKilLan = P07KZ5_A170BarKilLan[0] ;
               A9798BarPz1 = P07KZ5_A9798BarPz1[0] ;
               n9798BarPz1 = P07KZ5_n9798BarPz1[0] ;
               A8907PzaB80 = P07KZ5_A8907PzaB80[0] ;
               n8907PzaB80 = P07KZ5_n8907PzaB80[0] ;
               A2186BarPieLoc = P07KZ5_A2186BarPieLoc[0] ;
               n2186BarPieLoc = P07KZ5_n2186BarPieLoc[0] ;
               AV26ContPie = (byte)(AV26ContPie+1) ;
               if ( AV26ContPie > 100 )
               {
                  AV11BarPieCod[100-1] = httpContext.getMessage( "+100Pie!!", "") ;
                  AV17BarPieAnc[100-1] = (short)(0) ;
                  AV20BarPieCal[100-1] = (byte)(0) ;
                  AV16BarPieGrm[100-1] = (short)(0) ;
                  AV13BarPieKil[100-1] = DecimalUtil.doubleToDec(0) ;
                  AV12BarPieMtr[100-1] = DecimalUtil.doubleToDec(0) ;
                  AV15BarPiePML[100-1] = (short)(0) ;
                  AV19BarPiePnt[100-1] = 0 ;
                  AV14BarPieRdt[100-1] = DecimalUtil.doubleToDec(0) ;
                  AV56Tono[100-1] = " " ;
               }
               else
               {
                  AV32AlbRecCod = A44AlbRecCod ;
                  AV28AlbRecPie = A200BarPieCod ;
                  AV12BarPieMtr[AV26ContPie-1] = A183BarMetLan ;
                  AV55ContPie1 = DecimalUtil.doubleToDec(AV26ContPie) ;
                  AV39BarUniMed = A228BarUniMed ;
                  /* Execute user subroutine: 'CARGARDEFECTOS' */
                  S124 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(1);
                     pr_default.close(1);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     if (true) return;
                  }
                  if ( AV40OkCal == 1 )
                  {
                     Gx_msg += httpContext.getMessage( "carg; ", "") + GXutil.chr( (short)(13)) ;
                     AV12BarPieMtr[AV26ContPie-1] = DecimalUtil.doubleToDec(0) ;
                     AV11BarPieCod[AV26ContPie-1] = GXutil.trim( A200BarPieCod) ;
                     AV26ContPie = (byte)(DecimalUtil.decToDouble(AV55ContPie1)) ;
                     AV17BarPieAnc[AV26ContPie-1] = ((A1691BarPieAnc==0) ? A3134BarAncSal1 : A1691BarPieAnc) ;
                     AV16BarPieGrm[AV26ContPie-1] = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( A170BarKilLan.multiply(DecimalUtil.doubleToDec(1000)).divide((A183BarMetLan.multiply(DecimalUtil.doubleToDec(AV17BarPieAnc[AV26ContPie-1])).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 18, java.math.RoundingMode.DOWN), 0))) ;
                     AV13BarPieKil[AV26ContPie-1] = A170BarKilLan ;
                     AV12BarPieMtr[AV26ContPie-1] = A183BarMetLan ;
                     AV15BarPiePML[AV26ContPie-1] = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( A170BarKilLan.multiply(DecimalUtil.doubleToDec(1000)).divide(A183BarMetLan, 18, java.math.RoundingMode.DOWN), 2))) ;
                     AV14BarPieRdt[AV26ContPie-1] = GXutil.roundDecimal( A183BarMetLan.divide(A170BarKilLan, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV54OpeCod[AV26ContPie-1] = A9798BarPz1 ;
                     AV56Tono[AV26ContPie-1] = GXutil.substring( A8907PzaB80, 1, 2) ;
                     AV37BarPieLoc = A2186BarPieLoc ;
                     AV39BarUniMed = A228BarUniMed ;
                     AV43BarKgmLan = AV43BarKgmLan.add(A170BarKilLan) ;
                     AV42BarMtrLan = AV42BarMtrLan.add(A183BarMetLan) ;
                  }
                  else
                  {
                     AV32AlbRecCod = 0 ;
                     AV28AlbRecPie = "" ;
                     AV12BarPieMtr[AV26ContPie-1] = DecimalUtil.doubleToDec(0) ;
                     AV26ContPie = (byte)(AV26ContPie-1) ;
                  }
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV38Cal == 1 )
         {
            AV26ContPie = (byte)(GXutil.Int( AV26ContPie/ (double) (10))*10+10) ;
         }
         AV38Cal = (byte)(AV38Cal+1) ;
      }
      AV33BarUniCru = AV33BarUniCru.add((((GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", ""))==0) ? AV21BarKgmCru : AV22BarMtrCru))) ;
      AV25BarMer = ((GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", ""))==0) ? ((AV21BarKgmCru.subtract(AV43BarKgmLan)).divide(AV21BarKgmCru, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : ((AV22BarMtrCru.subtract(AV42BarMtrLan)).divide(AV22BarMtrCru, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
      /* Using cursor P07KZ6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4031CCTCod = P07KZ6_A4031CCTCod[0] ;
         A194BarOrdLin = P07KZ6_A194BarOrdLin[0] ;
         A758ProCod = P07KZ6_A758ProCod[0] ;
         A3281CcObs = P07KZ6_A3281CcObs[0] ;
         n3281CcObs = P07KZ6_n3281CcObs[0] ;
         AV50Lineas = (short)(GXutil.gxmlines( A3281CcObs, (short)(40))) ;
         AV50Lineas = (short)(((AV50Lineas>4) ? 4 : AV50Lineas)) ;
         AV49Linea = (byte)(1) ;
         while ( AV49Linea <= AV50Lineas )
         {
            AV48Observa[AV49Linea-1] = GXutil.gxgetmli( A3281CcObs, AV49Linea, (short)(40)) ;
            AV49Linea = (byte)(AV49Linea+1) ;
         }
         /* Using cursor P07KZ7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A4034CCTLin = P07KZ7_A4034CCTLin[0] ;
            A4035CCVal = P07KZ7_A4035CCVal[0] ;
            if ( A4034CCTLin == 1 )
            {
               AV44Autoriza = GXutil.substring( A4035CCVal, 1, 20) ;
            }
            else if ( A4034CCTLin == 2 )
            {
               AV45Aceptado = GXutil.substring( A4035CCVal, 1, 20) ;
            }
            else if ( A4034CCTLin == 3 )
            {
               AV46Rechazado = GXutil.substring( A4035CCVal, 1, 40) ;
            }
            else if ( A4034CCTLin == 4 )
            {
               AV47PESO = GXutil.substring( A4035CCVal, 1, 10) ;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S124( ) throws ProcessInterruptedException
   {
      /* 'CARGARDEFECTOS' Routine */
      returnInSub = false ;
      Gx_msg += "# " + GXutil.trim( GXutil.str( AV26ContPie, 10, 0)) + "; " ;
      Gx_msg += httpContext.getMessage( "rc ", "") + GXutil.trim( GXutil.str( AV32AlbRecCod, 10, 0)) + "; " ;
      Gx_msg += httpContext.getMessage( "Pie ", "") + AV28AlbRecPie + "; " ;
      AV65GXLvl126 = (byte)(0) ;
      /* Using cursor P07KZ8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV32AlbRecCod), AV28AlbRecPie, Byte.valueOf(AV38Cal)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A2159AlbRecPie = P07KZ8_A2159AlbRecPie[0] ;
         A44AlbRecCod = P07KZ8_A44AlbRecCod[0] ;
         A4798AlRPieClaM = P07KZ8_A4798AlRPieClaM[0] ;
         n4798AlRPieClaM = P07KZ8_n4798AlRPieClaM[0] ;
         A2155AlbRecKgm = P07KZ8_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = P07KZ8_A2157AlbRecMtr[0] ;
         A4799AlRPieUltC = P07KZ8_A4799AlRPieUltC[0] ;
         n4799AlRPieUltC = P07KZ8_n4799AlRPieUltC[0] ;
         AV65GXLvl126 = (byte)(1) ;
         AV20BarPieCal[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1] = A4798AlRPieClaM ;
         AV18BarMetLan[A4798AlRPieClaM-1] = AV18BarMetLan[A4798AlRPieClaM-1].add((AV12BarPieMtr[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1])) ;
         AV27ContDef = (byte)(0) ;
         AV21BarKgmCru = AV21BarKgmCru.add(A2155AlbRecKgm) ;
         AV22BarMtrCru = AV22BarMtrCru.add(A2157AlbRecMtr) ;
         AV34BarPieUni[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1] = ((GXutil.strcmp(AV39BarUniMed, httpContext.getMessage( "K", ""))==0) ? A2155AlbRecKgm : A2157AlbRecMtr) ;
         /* Using cursor P07KZ9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A4412AlRFasCod = P07KZ9_A4412AlRFasCod[0] ;
            A4395AlRDefCod = P07KZ9_A4395AlRDefCod[0] ;
            A4397AlRDefPnt = P07KZ9_A4397AlRDefPnt[0] ;
            n4397AlRDefPnt = P07KZ9_n4397AlRDefPnt[0] ;
            A4403AlRDefCnt = P07KZ9_A4403AlRDefCnt[0] ;
            n4403AlRDefCnt = P07KZ9_n4403AlRDefCnt[0] ;
            A4397AlRDefPnt = P07KZ9_A4397AlRDefPnt[0] ;
            n4397AlRDefPnt = P07KZ9_n4397AlRDefPnt[0] ;
            Gx_msg += httpContext.getMessage( "df ", "") + GXutil.trim( GXutil.str( A4395AlRDefCod, 10, 0)) + "; " ;
            Gx_msg += httpContext.getMessage( "pnt ", "") + GXutil.trim( GXutil.str( A4397AlRDefPnt, 10, 0)) + "; " ;
            AV19BarPiePnt[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1] = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV19BarPiePnt[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1]).add(A4403AlRDefCnt))) ;
            AV27ContDef = (byte)(AV27ContDef+1) ;
            if ( AV27ContDef > 20 )
            {
               AV27ContDef = (byte)(1) ;
               AV55ContPie1 = AV55ContPie1.add(DecimalUtil.doubleToDec(1)) ;
               AV20BarPieCal[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1] = AV20BarPieCal[(int)(DecimalUtil.decToDouble(AV55ContPie1.subtract(DecimalUtil.doubleToDec(1))))-1] ;
               AV20BarPieCal[(int)(DecimalUtil.decToDouble(AV55ContPie1.subtract(DecimalUtil.doubleToDec(1))))-1] = (byte)(0) ;
               AV19BarPiePnt[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1] = AV19BarPiePnt[(int)(DecimalUtil.decToDouble(AV55ContPie1.subtract(DecimalUtil.doubleToDec(1))))-1] ;
               AV19BarPiePnt[(int)(DecimalUtil.decToDouble(AV55ContPie1.subtract(DecimalUtil.doubleToDec(1))))-1] = 0 ;
            }
            else
            {
               AV29BarDefCod[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1][AV27ContDef-1] = A4395AlRDefCod ;
               AV67GXLvl150 = (byte)(0) ;
               /* Using cursor P07KZ10 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A6683AlrDefMtr = P07KZ10_A6683AlrDefMtr[0] ;
                  A6684AlRDefCDe = P07KZ10_A6684AlRDefCDe[0] ;
                  n6684AlRDefCDe = P07KZ10_n6684AlRDefCDe[0] ;
                  AV67GXLvl150 = (byte)(1) ;
                  Gx_msg += httpContext.getMessage( "mt ", "") + GXutil.trim( GXutil.str( A6683AlrDefMtr, 10, 2)) + "; " ;
                  if ( AV30BarDefMtr[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1][AV27ContDef-1].doubleValue() != 0 )
                  {
                     AV27ContDef = (byte)(AV27ContDef+1) ;
                     if ( AV27ContDef > 20 )
                     {
                        AV27ContDef = (byte)(1) ;
                        AV55ContPie1 = AV55ContPie1.add(DecimalUtil.doubleToDec(1)) ;
                        AV20BarPieCal[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1] = AV20BarPieCal[(int)(DecimalUtil.decToDouble(AV55ContPie1.subtract(DecimalUtil.doubleToDec(1))))-1] ;
                        AV20BarPieCal[(int)(DecimalUtil.decToDouble(AV55ContPie1.subtract(DecimalUtil.doubleToDec(1))))-1] = (byte)(0) ;
                        AV19BarPiePnt[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1] = AV19BarPiePnt[(int)(DecimalUtil.decToDouble(AV55ContPie1.subtract(DecimalUtil.doubleToDec(1))))-1] ;
                        AV19BarPiePnt[(int)(DecimalUtil.decToDouble(AV55ContPie1.subtract(DecimalUtil.doubleToDec(1))))-1] = 0 ;
                     }
                  }
                  if ( AV27ContDef <= 20 )
                  {
                     AV30BarDefMtr[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1][AV27ContDef-1] = A6683AlrDefMtr ;
                     AV31BarDefPnt[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1][AV27ContDef-1] = (short)(DecimalUtil.decToDouble(A6684AlRDefCDe)) ;
                  }
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               if ( AV67GXLvl150 == 0 )
               {
                  AV31BarDefPnt[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1][AV27ContDef-1] = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV31BarDefPnt[(int)(DecimalUtil.decToDouble(AV55ContPie1))-1][AV27ContDef-1]).add(A4403AlRDefCnt))) ;
               }
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         Gx_msg += httpContext.getMessage( "fs ", "") + A4799AlRPieUltC + "; " ;
         AV36FasCod = A4799AlRPieUltC ;
         AV40OkCal = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      if ( AV65GXLvl126 == 0 )
      {
         Gx_msg += httpContext.getMessage( "no cal; ", "") + GXutil.chr( (short)(13)) ;
         AV40OkCal = (byte)(0) ;
      }
      /* Using cursor P07KZ11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV36FasCod, Byte.valueOf(AV40OkCal)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A461Fase = P07KZ11_A461Fase[0] ;
         A656ParCod = P07KZ11_A656ParCod[0] ;
         n656ParCod = P07KZ11_n656ParCod[0] ;
         A503GruOpeCod = P07KZ11_A503GruOpeCod[0] ;
         A561HisProLin = P07KZ11_A561HisProLin[0] ;
         A558HisProFec = P07KZ11_A558HisProFec[0] ;
         A602MaqCod = P07KZ11_A602MaqCod[0] ;
         AV24HisProFec = A558HisProFec ;
         GXt_char5 = AV23OpeNom ;
         GXv_char4[0] = GXt_char5 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char4) ;
         rrevmtx.this.GXt_char5 = GXv_char4[0] ;
         AV23OpeNom = GXt_char5 ;
         Gx_msg += httpContext.getMessage( "op ", "") + GXutil.trim( AV23OpeNom) + ";" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void h7KZ0( boolean bFoot ,
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
      this.aP0[0] = rrevmtx.this.A396EmprCod;
      this.aP1[0] = rrevmtx.this.A129BarCod;
      this.aP2[0] = rrevmtx.this.A132BarCodReo;
      this.aP3[0] = rrevmtx.this.A130BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      AV18BarMetLan = new java.math.BigDecimal[99] ;
      GX_I = 1 ;
      while ( GX_I <= 99 )
      {
         AV18BarMetLan[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV11BarPieCod = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV11BarPieCod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P07KZ3_A396EmprCod = new String[] {""} ;
      P07KZ3_A129BarCod = new int[1] ;
      P07KZ3_A132BarCodReo = new byte[1] ;
      P07KZ3_A130BarCodPar = new String[] {""} ;
      P07KZ3_A2826BarNumLot = new int[1] ;
      P07KZ3_A118BarAcaQui = new String[] {""} ;
      P07KZ3_A135BarColNom = new String[] {""} ;
      P07KZ3_A136BarColNum = new int[1] ;
      P07KZ3_A143BarDisNum = new String[] {""} ;
      P07KZ3_A1652BarSerDsc = new String[] {""} ;
      P07KZ3_A212BarSer = new String[] {""} ;
      P07KZ3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07KZ3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A118BarAcaQui = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      AV8EmprNom = "" ;
      AV9TipArtDsc = "" ;
      AV10HDR = "" ;
      AV33BarUniCru = DecimalUtil.ZERO ;
      AV25BarMer = DecimalUtil.ZERO ;
      AV24HisProFec = GXutil.nullDate() ;
      AV23OpeNom = "" ;
      AV34BarPieUni = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV34BarPieUni[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV29BarDefCod = new short[100][20] ;
      AV31BarDefPnt = new short[100][20] ;
      AV30BarDefMtr = new java.math.BigDecimal[100][20] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 20 )
         {
            AV30BarDefMtr[GX_I-1][GX_J-1] = DecimalUtil.ZERO ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV48Observa = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV48Observa[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV17BarPieAnc = new short[100] ;
      AV20BarPieCal = new byte[100] ;
      AV13BarPieKil = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV13BarPieKil[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV12BarPieMtr = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV12BarPieMtr[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV15BarPiePML = new short[100] ;
      AV19BarPiePnt = new int[100] ;
      AV14BarPieRdt = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV14BarPieRdt[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16BarPieGrm = new short[100] ;
      AV35CliNom = "" ;
      AV37BarPieLoc = "" ;
      AV45Aceptado = "" ;
      AV44Autoriza = "" ;
      AV46Rechazado = "" ;
      AV47PESO = "" ;
      AV54OpeCod = new int[100] ;
      AV56Tono = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV56Tono[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      A228BarUniMed = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A4799AlRPieUltC = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gx_msg = "" ;
      P07KZ4_A396EmprCod = new String[] {""} ;
      P07KZ4_A129BarCod = new int[1] ;
      P07KZ4_A132BarCodReo = new byte[1] ;
      P07KZ4_A130BarCodPar = new String[] {""} ;
      P07KZ4_A228BarUniMed = new String[] {""} ;
      P07KZ4_A3134BarAncSal1 = new short[1] ;
      P07KZ4_A407EmprNom = new String[] {""} ;
      P07KZ4_n407EmprNom = new boolean[] {false} ;
      P07KZ4_A217BarTipArt = new short[1] ;
      P07KZ4_n217BarTipArt = new boolean[] {false} ;
      P07KZ4_A2311BarCliDes = new int[1] ;
      A407EmprNom = "" ;
      P07KZ5_A396EmprCod = new String[] {""} ;
      P07KZ5_A129BarCod = new int[1] ;
      P07KZ5_A132BarCodReo = new byte[1] ;
      P07KZ5_A130BarCodPar = new String[] {""} ;
      P07KZ5_A44AlbRecCod = new int[1] ;
      P07KZ5_A200BarPieCod = new String[] {""} ;
      P07KZ5_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07KZ5_A1691BarPieAnc = new short[1] ;
      P07KZ5_n1691BarPieAnc = new boolean[] {false} ;
      P07KZ5_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07KZ5_A9798BarPz1 = new int[1] ;
      P07KZ5_n9798BarPz1 = new boolean[] {false} ;
      P07KZ5_A8907PzaB80 = new String[] {""} ;
      P07KZ5_n8907PzaB80 = new boolean[] {false} ;
      P07KZ5_A2186BarPieLoc = new String[] {""} ;
      P07KZ5_n2186BarPieLoc = new boolean[] {false} ;
      A200BarPieCod = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A8907PzaB80 = "" ;
      A2186BarPieLoc = "" ;
      AV28AlbRecPie = "" ;
      AV55ContPie1 = DecimalUtil.ZERO ;
      AV39BarUniMed = "" ;
      AV43BarKgmLan = DecimalUtil.ZERO ;
      AV42BarMtrLan = DecimalUtil.ZERO ;
      AV21BarKgmCru = DecimalUtil.ZERO ;
      AV22BarMtrCru = DecimalUtil.ZERO ;
      P07KZ6_A396EmprCod = new String[] {""} ;
      P07KZ6_A129BarCod = new int[1] ;
      P07KZ6_A132BarCodReo = new byte[1] ;
      P07KZ6_A130BarCodPar = new String[] {""} ;
      P07KZ6_A4031CCTCod = new int[1] ;
      P07KZ6_A194BarOrdLin = new short[1] ;
      P07KZ6_A758ProCod = new String[] {""} ;
      P07KZ6_A3281CcObs = new String[] {""} ;
      P07KZ6_n3281CcObs = new boolean[] {false} ;
      A758ProCod = "" ;
      A3281CcObs = "" ;
      P07KZ7_A396EmprCod = new String[] {""} ;
      P07KZ7_A129BarCod = new int[1] ;
      P07KZ7_A132BarCodReo = new byte[1] ;
      P07KZ7_A130BarCodPar = new String[] {""} ;
      P07KZ7_A758ProCod = new String[] {""} ;
      P07KZ7_A194BarOrdLin = new short[1] ;
      P07KZ7_A4031CCTCod = new int[1] ;
      P07KZ7_A4034CCTLin = new short[1] ;
      P07KZ7_A4035CCVal = new String[] {""} ;
      A4035CCVal = "" ;
      P07KZ8_A396EmprCod = new String[] {""} ;
      P07KZ8_A2159AlbRecPie = new String[] {""} ;
      P07KZ8_A44AlbRecCod = new int[1] ;
      P07KZ8_A4798AlRPieClaM = new byte[1] ;
      P07KZ8_n4798AlRPieClaM = new boolean[] {false} ;
      P07KZ8_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07KZ8_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07KZ8_A4799AlRPieUltC = new String[] {""} ;
      P07KZ8_n4799AlRPieUltC = new boolean[] {false} ;
      A2159AlbRecPie = "" ;
      P07KZ9_A396EmprCod = new String[] {""} ;
      P07KZ9_A44AlbRecCod = new int[1] ;
      P07KZ9_A2159AlbRecPie = new String[] {""} ;
      P07KZ9_A4412AlRFasCod = new String[] {""} ;
      P07KZ9_A4395AlRDefCod = new short[1] ;
      P07KZ9_A4397AlRDefPnt = new short[1] ;
      P07KZ9_n4397AlRDefPnt = new boolean[] {false} ;
      P07KZ9_A4403AlRDefCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07KZ9_n4403AlRDefCnt = new boolean[] {false} ;
      A4412AlRFasCod = "" ;
      A4403AlRDefCnt = DecimalUtil.ZERO ;
      P07KZ10_A396EmprCod = new String[] {""} ;
      P07KZ10_A44AlbRecCod = new int[1] ;
      P07KZ10_A2159AlbRecPie = new String[] {""} ;
      P07KZ10_A4395AlRDefCod = new short[1] ;
      P07KZ10_A4412AlRFasCod = new String[] {""} ;
      P07KZ10_A6683AlrDefMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07KZ10_A6684AlRDefCDe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07KZ10_n6684AlRDefCDe = new boolean[] {false} ;
      A6683AlrDefMtr = DecimalUtil.ZERO ;
      A6684AlRDefCDe = DecimalUtil.ZERO ;
      AV36FasCod = "" ;
      P07KZ11_A396EmprCod = new String[] {""} ;
      P07KZ11_A129BarCod = new int[1] ;
      P07KZ11_A132BarCodReo = new byte[1] ;
      P07KZ11_A130BarCodPar = new String[] {""} ;
      P07KZ11_A461Fase = new String[] {""} ;
      P07KZ11_A656ParCod = new short[1] ;
      P07KZ11_n656ParCod = new boolean[] {false} ;
      P07KZ11_A503GruOpeCod = new int[1] ;
      P07KZ11_A561HisProLin = new int[1] ;
      P07KZ11_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07KZ11_A602MaqCod = new String[] {""} ;
      A461Fase = "" ;
      A602MaqCod = "" ;
      GXt_char5 = "" ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rrevmtx__default(),
         new Object[] {
             new Object[] {
            P07KZ3_A396EmprCod, P07KZ3_A129BarCod, P07KZ3_A132BarCodReo, P07KZ3_A130BarCodPar, P07KZ3_A2826BarNumLot, P07KZ3_A118BarAcaQui, P07KZ3_A135BarColNom, P07KZ3_A136BarColNum, P07KZ3_A143BarDisNum, P07KZ3_A1652BarSerDsc,
            P07KZ3_A212BarSer, P07KZ3_A168BarKgmLan, P07KZ3_A186BarMtrLan
            }
            , new Object[] {
            P07KZ4_A396EmprCod, P07KZ4_A129BarCod, P07KZ4_A132BarCodReo, P07KZ4_A130BarCodPar, P07KZ4_A228BarUniMed, P07KZ4_A3134BarAncSal1, P07KZ4_A407EmprNom, P07KZ4_n407EmprNom, P07KZ4_A217BarTipArt, P07KZ4_n217BarTipArt,
            P07KZ4_A2311BarCliDes
            }
            , new Object[] {
            P07KZ5_A396EmprCod, P07KZ5_A129BarCod, P07KZ5_A132BarCodReo, P07KZ5_A130BarCodPar, P07KZ5_A44AlbRecCod, P07KZ5_A200BarPieCod, P07KZ5_A183BarMetLan, P07KZ5_A1691BarPieAnc, P07KZ5_n1691BarPieAnc, P07KZ5_A170BarKilLan,
            P07KZ5_A9798BarPz1, P07KZ5_n9798BarPz1, P07KZ5_A8907PzaB80, P07KZ5_n8907PzaB80, P07KZ5_A2186BarPieLoc, P07KZ5_n2186BarPieLoc
            }
            , new Object[] {
            P07KZ6_A396EmprCod, P07KZ6_A129BarCod, P07KZ6_A132BarCodReo, P07KZ6_A130BarCodPar, P07KZ6_A4031CCTCod, P07KZ6_A194BarOrdLin, P07KZ6_A758ProCod, P07KZ6_A3281CcObs, P07KZ6_n3281CcObs
            }
            , new Object[] {
            P07KZ7_A396EmprCod, P07KZ7_A129BarCod, P07KZ7_A132BarCodReo, P07KZ7_A130BarCodPar, P07KZ7_A758ProCod, P07KZ7_A194BarOrdLin, P07KZ7_A4031CCTCod, P07KZ7_A4034CCTLin, P07KZ7_A4035CCVal
            }
            , new Object[] {
            P07KZ8_A396EmprCod, P07KZ8_A2159AlbRecPie, P07KZ8_A44AlbRecCod, P07KZ8_A4798AlRPieClaM, P07KZ8_n4798AlRPieClaM, P07KZ8_A2155AlbRecKgm, P07KZ8_A2157AlbRecMtr, P07KZ8_A4799AlRPieUltC, P07KZ8_n4799AlRPieUltC
            }
            , new Object[] {
            P07KZ9_A396EmprCod, P07KZ9_A44AlbRecCod, P07KZ9_A2159AlbRecPie, P07KZ9_A4412AlRFasCod, P07KZ9_A4395AlRDefCod, P07KZ9_A4397AlRDefPnt, P07KZ9_n4397AlRDefPnt, P07KZ9_A4403AlRDefCnt, P07KZ9_n4403AlRDefCnt
            }
            , new Object[] {
            P07KZ10_A396EmprCod, P07KZ10_A44AlbRecCod, P07KZ10_A2159AlbRecPie, P07KZ10_A4395AlRDefCod, P07KZ10_A4412AlRFasCod, P07KZ10_A6683AlrDefMtr, P07KZ10_A6684AlRDefCDe, P07KZ10_n6684AlRDefCDe
            }
            , new Object[] {
            P07KZ11_A396EmprCod, P07KZ11_A129BarCod, P07KZ11_A132BarCodReo, P07KZ11_A130BarCodPar, P07KZ11_A461Fase, P07KZ11_A656ParCod, P07KZ11_n656ParCod, P07KZ11_A503GruOpeCod, P07KZ11_A561HisProLin, P07KZ11_A558HisProFec,
            P07KZ11_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte AV53Cont ;
   private byte AV27ContDef ;
   private byte AV20BarPieCal[] ;
   private byte A4798AlRPieClaM ;
   private byte AV38Cal ;
   private byte AV26ContPie ;
   private byte AV40OkCal ;
   private byte AV49Linea ;
   private byte AV65GXLvl126 ;
   private byte AV67GXLvl150 ;
   private short AV29BarDefCod[][] ;
   private short AV31BarDefPnt[][] ;
   private short AV17BarPieAnc[] ;
   private short AV15BarPiePML[] ;
   private short AV16BarPieGrm[] ;
   private short A3134BarAncSal1 ;
   private short A217BarTipArt ;
   private short A1691BarPieAnc ;
   private short A194BarOrdLin ;
   private short AV50Lineas ;
   private short A4034CCTLin ;
   private short A4395AlRDefCod ;
   private short A4397AlRDefPnt ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXv_int2[] ;
   private int A2826BarNumLot ;
   private int A136BarColNum ;
   private int Gx_OldLine ;
   private int AV19BarPiePnt[] ;
   private int AV54OpeCod[] ;
   private int A503GruOpeCod ;
   private int A2311BarCliDes ;
   private int A44AlbRecCod ;
   private int A9798BarPz1 ;
   private int AV32AlbRecCod ;
   private int A4031CCTCod ;
   private int A561HisProLin ;
   private int GX_I ;
   private int GX_J ;
   private long AV41Pag ;
   private java.math.BigDecimal AV18BarMetLan[] ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal AV33BarUniCru ;
   private java.math.BigDecimal AV25BarMer ;
   private java.math.BigDecimal AV34BarPieUni[] ;
   private java.math.BigDecimal AV30BarDefMtr[][] ;
   private java.math.BigDecimal AV13BarPieKil[] ;
   private java.math.BigDecimal AV12BarPieMtr[] ;
   private java.math.BigDecimal AV14BarPieRdt[] ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal AV55ContPie1 ;
   private java.math.BigDecimal AV43BarKgmLan ;
   private java.math.BigDecimal AV42BarMtrLan ;
   private java.math.BigDecimal AV21BarKgmCru ;
   private java.math.BigDecimal AV22BarMtrCru ;
   private java.math.BigDecimal A4403AlRDefCnt ;
   private java.math.BigDecimal A6683AlrDefMtr ;
   private java.math.BigDecimal A6684AlRDefCDe ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String AV11BarPieCod[] ;
   private String scmdbuf ;
   private String A118BarAcaQui ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String AV8EmprNom ;
   private String AV9TipArtDsc ;
   private String AV10HDR ;
   private String AV23OpeNom ;
   private String AV48Observa[] ;
   private String AV35CliNom ;
   private String AV37BarPieLoc ;
   private String AV45Aceptado ;
   private String AV44Autoriza ;
   private String AV46Rechazado ;
   private String AV47PESO ;
   private String AV56Tono[] ;
   private String A228BarUniMed ;
   private String A4799AlRPieUltC ;
   private String Gx_msg ;
   private String A407EmprNom ;
   private String A200BarPieCod ;
   private String A8907PzaB80 ;
   private String A2186BarPieLoc ;
   private String AV28AlbRecPie ;
   private String AV39BarUniMed ;
   private String A758ProCod ;
   private String A4035CCVal ;
   private String A2159AlbRecPie ;
   private String A4412AlRFasCod ;
   private String AV36FasCod ;
   private String A461Fase ;
   private String A602MaqCod ;
   private String GXt_char5 ;
   private String GXv_char4[] ;
   private java.util.Date AV24HisProFec ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n217BarTipArt ;
   private boolean n1691BarPieAnc ;
   private boolean n9798BarPz1 ;
   private boolean n8907PzaB80 ;
   private boolean n2186BarPieLoc ;
   private boolean n3281CcObs ;
   private boolean n4798AlRPieClaM ;
   private boolean n4799AlRPieUltC ;
   private boolean n4397AlRDefPnt ;
   private boolean n4403AlRDefCnt ;
   private boolean n6684AlRDefCDe ;
   private boolean n656ParCod ;
   private String A3281CcObs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P07KZ3_A396EmprCod ;
   private int[] P07KZ3_A129BarCod ;
   private byte[] P07KZ3_A132BarCodReo ;
   private String[] P07KZ3_A130BarCodPar ;
   private int[] P07KZ3_A2826BarNumLot ;
   private String[] P07KZ3_A118BarAcaQui ;
   private String[] P07KZ3_A135BarColNom ;
   private int[] P07KZ3_A136BarColNum ;
   private String[] P07KZ3_A143BarDisNum ;
   private String[] P07KZ3_A1652BarSerDsc ;
   private String[] P07KZ3_A212BarSer ;
   private java.math.BigDecimal[] P07KZ3_A168BarKgmLan ;
   private java.math.BigDecimal[] P07KZ3_A186BarMtrLan ;
   private String[] P07KZ4_A396EmprCod ;
   private int[] P07KZ4_A129BarCod ;
   private byte[] P07KZ4_A132BarCodReo ;
   private String[] P07KZ4_A130BarCodPar ;
   private String[] P07KZ4_A228BarUniMed ;
   private short[] P07KZ4_A3134BarAncSal1 ;
   private String[] P07KZ4_A407EmprNom ;
   private boolean[] P07KZ4_n407EmprNom ;
   private short[] P07KZ4_A217BarTipArt ;
   private boolean[] P07KZ4_n217BarTipArt ;
   private int[] P07KZ4_A2311BarCliDes ;
   private String[] P07KZ5_A396EmprCod ;
   private int[] P07KZ5_A129BarCod ;
   private byte[] P07KZ5_A132BarCodReo ;
   private String[] P07KZ5_A130BarCodPar ;
   private int[] P07KZ5_A44AlbRecCod ;
   private String[] P07KZ5_A200BarPieCod ;
   private java.math.BigDecimal[] P07KZ5_A183BarMetLan ;
   private short[] P07KZ5_A1691BarPieAnc ;
   private boolean[] P07KZ5_n1691BarPieAnc ;
   private java.math.BigDecimal[] P07KZ5_A170BarKilLan ;
   private int[] P07KZ5_A9798BarPz1 ;
   private boolean[] P07KZ5_n9798BarPz1 ;
   private String[] P07KZ5_A8907PzaB80 ;
   private boolean[] P07KZ5_n8907PzaB80 ;
   private String[] P07KZ5_A2186BarPieLoc ;
   private boolean[] P07KZ5_n2186BarPieLoc ;
   private String[] P07KZ6_A396EmprCod ;
   private int[] P07KZ6_A129BarCod ;
   private byte[] P07KZ6_A132BarCodReo ;
   private String[] P07KZ6_A130BarCodPar ;
   private int[] P07KZ6_A4031CCTCod ;
   private short[] P07KZ6_A194BarOrdLin ;
   private String[] P07KZ6_A758ProCod ;
   private String[] P07KZ6_A3281CcObs ;
   private boolean[] P07KZ6_n3281CcObs ;
   private String[] P07KZ7_A396EmprCod ;
   private int[] P07KZ7_A129BarCod ;
   private byte[] P07KZ7_A132BarCodReo ;
   private String[] P07KZ7_A130BarCodPar ;
   private String[] P07KZ7_A758ProCod ;
   private short[] P07KZ7_A194BarOrdLin ;
   private int[] P07KZ7_A4031CCTCod ;
   private short[] P07KZ7_A4034CCTLin ;
   private String[] P07KZ7_A4035CCVal ;
   private String[] P07KZ8_A396EmprCod ;
   private String[] P07KZ8_A2159AlbRecPie ;
   private int[] P07KZ8_A44AlbRecCod ;
   private byte[] P07KZ8_A4798AlRPieClaM ;
   private boolean[] P07KZ8_n4798AlRPieClaM ;
   private java.math.BigDecimal[] P07KZ8_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P07KZ8_A2157AlbRecMtr ;
   private String[] P07KZ8_A4799AlRPieUltC ;
   private boolean[] P07KZ8_n4799AlRPieUltC ;
   private String[] P07KZ9_A396EmprCod ;
   private int[] P07KZ9_A44AlbRecCod ;
   private String[] P07KZ9_A2159AlbRecPie ;
   private String[] P07KZ9_A4412AlRFasCod ;
   private short[] P07KZ9_A4395AlRDefCod ;
   private short[] P07KZ9_A4397AlRDefPnt ;
   private boolean[] P07KZ9_n4397AlRDefPnt ;
   private java.math.BigDecimal[] P07KZ9_A4403AlRDefCnt ;
   private boolean[] P07KZ9_n4403AlRDefCnt ;
   private String[] P07KZ10_A396EmprCod ;
   private int[] P07KZ10_A44AlbRecCod ;
   private String[] P07KZ10_A2159AlbRecPie ;
   private short[] P07KZ10_A4395AlRDefCod ;
   private String[] P07KZ10_A4412AlRFasCod ;
   private java.math.BigDecimal[] P07KZ10_A6683AlrDefMtr ;
   private java.math.BigDecimal[] P07KZ10_A6684AlRDefCDe ;
   private boolean[] P07KZ10_n6684AlRDefCDe ;
   private String[] P07KZ11_A396EmprCod ;
   private int[] P07KZ11_A129BarCod ;
   private byte[] P07KZ11_A132BarCodReo ;
   private String[] P07KZ11_A130BarCodPar ;
   private String[] P07KZ11_A461Fase ;
   private short[] P07KZ11_A656ParCod ;
   private boolean[] P07KZ11_n656ParCod ;
   private int[] P07KZ11_A503GruOpeCod ;
   private int[] P07KZ11_A561HisProLin ;
   private java.util.Date[] P07KZ11_A558HisProFec ;
   private String[] P07KZ11_A602MaqCod ;
}

final  class rrevmtx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07KZ3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarNumLot, T1.BarAcaQui, T1.BarColNom, T1.BarColNum, T1.BarDisNum, T1.BarSerDsc, T1.BarSer, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan, COALESCE( T2.BarMtrLan, 0) AS BarMtrLan FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarKilLan) AS BarKgmLan, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07KZ4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarUniMed, T1.BarAncSal1, T2.EmprNom, T1.BarTipArt, T1.BarCliDes FROM (TXPBARCAD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07KZ5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod, BarMetLan, BarPieAnc, BarKilLan, BarPz1, PzaB80, BarPieLoc FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07KZ6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CCTCod, BarOrdLin, ProCod, CcObs FROM TXPCC WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (CCTCod = 10000) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07KZ7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07KZ8", "SELECT EmprCod, AlbRecPie, AlbRecCod, AlRPieClaM, AlbRecKgm, AlbRecMtr, AlRPieUltC FROM TXPALBDET WHERE (EmprCod = ? and AlbRecCod = ? and AlbRecPie = ?) AND (AlRPieClaM = ?) ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07KZ9", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlRFasCod, T1.AlRDefCod AS AlRDefCod, T2.TipDefPnt AS AlRDefPnt, T1.AlRDefCnt FROM (TXPAlRPie T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.AlRDefCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07KZ10", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr, AlRDefCDe FROM TXPAlRPMe WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? and AlRDefCod = ? and AlRFasCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07KZ11", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Fase, ParCod, GruOpeCod, HisProLin, HisProFec, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Fase = ?) AND (? = 1) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Fase, HisProFec DESC, HisProLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

