package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ptrf001 extends GXReport
{
   public ptrf001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptrf001.class ), "" );
   }

   public ptrf001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      ptrf001.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      ptrf001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptrf001.this.A11644TransferId = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 9 ;
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
         getPrinter().GxSetDocName("INFORME NOTA TRASLADO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*9)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV8MovTxt = httpContext.getMessage( "Traslado UPQ", "") ;
         AV10TipmovTxt = httpContext.getMessage( "Traslado Interno", "") ;
         GxHdr2 = true ;
         /* Using cursor P04O82 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A3839CcoCod = P04O82_A3839CcoCod[0] ;
            n3839CcoCod = P04O82_n3839CcoCod[0] ;
            A11650TransferFb = P04O82_A11650TransferFb[0] ;
            n11650TransferFb = P04O82_n11650TransferFb[0] ;
            A3840CcoDsc = P04O82_A3840CcoDsc[0] ;
            n3840CcoDsc = P04O82_n3840CcoDsc[0] ;
            A11651TransferUs = P04O82_A11651TransferUs[0] ;
            n11651TransferUs = P04O82_n11651TransferUs[0] ;
            A11645TransferDi = P04O82_A11645TransferDi[0] ;
            n11645TransferDi = P04O82_n11645TransferDi[0] ;
            A11646TransferAO = P04O82_A11646TransferAO[0] ;
            n11646TransferAO = P04O82_n11646TransferAO[0] ;
            A11648TransferAD = P04O82_A11648TransferAD[0] ;
            n11648TransferAD = P04O82_n11648TransferAD[0] ;
            A3840CcoDsc = P04O82_A3840CcoDsc[0] ;
            n3840CcoDsc = P04O82_n3840CcoDsc[0] ;
            GXt_char1 = A11647TransferOD ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A11646TransferAO ;
            GXv_char4[0] = GXt_char1 ;
            new app.pexialmc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            ptrf001.this.A396EmprCod = GXv_char2[0] ;
            ptrf001.this.A11646TransferAO = GXv_int3[0] ;
            ptrf001.this.GXt_char1 = GXv_char4[0] ;
            A11647TransferOD = GXt_char1 ;
            GXt_char1 = A11649TransferDD ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = A11648TransferAD ;
            GXv_char2[0] = GXt_char1 ;
            new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
            ptrf001.this.A396EmprCod = GXv_char4[0] ;
            ptrf001.this.A11648TransferAD = GXv_int3[0] ;
            ptrf001.this.GXt_char1 = GXv_char2[0] ;
            A11649TransferDD = GXt_char1 ;
            AV9TransferFb = GXutil.substring( A11650TransferFb, 1, 50) ;
            /* Using cursor P04O83 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A11654TransferCt = P04O83_A11654TransferCt[0] ;
               n11654TransferCt = P04O83_n11654TransferCt[0] ;
               A718PrdNom = P04O83_A718PrdNom[0] ;
               A719PrdNum = P04O83_A719PrdNum[0] ;
               n719PrdNum = P04O83_n719PrdNum[0] ;
               A11653TransferLn = P04O83_A11653TransferLn[0] ;
               A718PrdNom = P04O83_A718PrdNom[0] ;
               h4O80( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11653TransferLn), "ZZZZZZZ9")), 146, Gx_line+0, 205, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 219, Gx_line+0, 264, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 328, Gx_line+0, 519, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11654TransferCt, "ZZZZZZ9.9999")), 736, Gx_line+0, 825, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
         h4O80( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h4O80( boolean bFoot ,
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
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES:", ""), 14, Gx_line+16, 128, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Agradecemos verificar la informacion contenida en este documento contra las unidades fisicas entregadas certificando el recibo de los insumos", ""), 130, Gx_line+16, 979, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "en la Unidad de Producto Quimico de Destino. En caso de cualquier novedad informar de inmediato al Coordinador de UPQ ecargado.", ""), 14, Gx_line+31, 807, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+5, 1029, Gx_line+54, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+53, 1029, Gx_line+138, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ELABORADO POR:", ""), 17, Gx_line+71, 132, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REVISADO POR:", ""), 391, Gx_line+71, 493, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "APROBADO POR:", ""), 753, Gx_line+71, 860, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+101, 1029, Gx_line+101, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA UNICA DE IMPRESION:", ""), 17, Gx_line+109, 206, Gx_line+123, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+140) ;
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
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MANUFACTURAS ELIOT S.A.S NIT 860.000.460-6", ""), 101, Gx_line+16, 402, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NOTA DE TRASLADO DE INSUMOS UNIDAD DE PRODUCTOS QUIMICOS", ""), 29, Gx_line+47, 474, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Calle 19 N68B-65 Bogota D.C. - Colombia", ""), 730, Gx_line+16, 976, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Telefono: 4059400 Fax: 4059097 / Vereda", ""), 726, Gx_line+31, 979, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guadalajara Costado oriental de la via Siberia-", ""), 715, Gx_line+47, 991, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cota Norte de la Autopista Medellin", ""), 748, Gx_line+63, 958, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+0, 1029, Gx_line+95, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(685, Gx_line+0, 685, Gx_line+95, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+109) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A11645TransferDi, "99/99/99 99:99"), 95, Gx_line+16, 198, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha-Hora", ""), 15, Gx_line+16, 85, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "UPQ Origen", ""), 15, Gx_line+31, 86, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11647TransferOD, "")), 95, Gx_line+30, 388, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "UPQDestino", ""), 15, Gx_line+47, 88, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11649TransferDD, "")), 95, Gx_line+46, 388, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11644TransferId), "ZZZZZZZZZ9")), 466, Gx_line+15, 540, Gx_line+32, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nota Nº", ""), 394, Gx_line+16, 442, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Movimiento", ""), 394, Gx_line+31, 462, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo Mov", ""), 394, Gx_line+47, 450, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 592, Gx_line+16, 638, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11651TransferUs, "")), 671, Gx_line+15, 745, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fabrica", ""), 592, Gx_line+31, 637, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Centro Costo", ""), 592, Gx_line+47, 669, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ITEM", ""), 158, Gx_line+78, 190, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REFERENCIA", ""), 219, Gx_line+78, 301, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESCRIPCION", ""), 328, Gx_line+78, 417, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "UNIDAD DE MEDIDA", ""), 547, Gx_line+78, 674, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CANTIDAD", ""), 757, Gx_line+78, 824, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(146, Gx_line+93, 204, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(219, Gx_line+93, 301, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(328, Gx_line+93, 518, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+93, 674, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(736, Gx_line+93, 824, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3840CcoDsc, "")), 671, Gx_line+46, 891, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9TransferFb, "")), 671, Gx_line+30, 1037, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8MovTxt, "")), 466, Gx_line+30, 576, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10TipmovTxt, "")), 466, Gx_line+46, 591, Gx_line+63, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+96) ;
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
      this.aP0[0] = ptrf001.this.A396EmprCod;
      this.aP1[0] = ptrf001.this.A11644TransferId;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8MovTxt = "" ;
      AV10TipmovTxt = "" ;
      scmdbuf = "" ;
      P04O82_A3839CcoCod = new short[1] ;
      P04O82_n3839CcoCod = new boolean[] {false} ;
      P04O82_A11644TransferId = new long[1] ;
      P04O82_A11650TransferFb = new String[] {""} ;
      P04O82_n11650TransferFb = new boolean[] {false} ;
      P04O82_A3840CcoDsc = new String[] {""} ;
      P04O82_n3840CcoDsc = new boolean[] {false} ;
      P04O82_A11651TransferUs = new String[] {""} ;
      P04O82_n11651TransferUs = new boolean[] {false} ;
      P04O82_A11645TransferDi = new java.util.Date[] {GXutil.nullDate()} ;
      P04O82_n11645TransferDi = new boolean[] {false} ;
      P04O82_A396EmprCod = new String[] {""} ;
      P04O82_A11646TransferAO = new byte[1] ;
      P04O82_n11646TransferAO = new boolean[] {false} ;
      P04O82_A11648TransferAD = new byte[1] ;
      P04O82_n11648TransferAD = new boolean[] {false} ;
      A11650TransferFb = "" ;
      A3840CcoDsc = "" ;
      A11651TransferUs = "" ;
      A11645TransferDi = GXutil.resetTime( GXutil.nullDate() );
      A11647TransferOD = "" ;
      A11649TransferDD = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV9TransferFb = "" ;
      P04O83_A396EmprCod = new String[] {""} ;
      P04O83_A11644TransferId = new long[1] ;
      P04O83_A11654TransferCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04O83_n11654TransferCt = new boolean[] {false} ;
      P04O83_A718PrdNom = new String[] {""} ;
      P04O83_A719PrdNum = new String[] {""} ;
      P04O83_n719PrdNum = new boolean[] {false} ;
      P04O83_A11653TransferLn = new int[1] ;
      A11654TransferCt = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptrf001__default(),
         new Object[] {
             new Object[] {
            P04O82_A3839CcoCod, P04O82_n3839CcoCod, P04O82_A11644TransferId, P04O82_A11650TransferFb, P04O82_n11650TransferFb, P04O82_A3840CcoDsc, P04O82_n3840CcoDsc, P04O82_A11651TransferUs, P04O82_n11651TransferUs, P04O82_A11645TransferDi,
            P04O82_n11645TransferDi, P04O82_A396EmprCod, P04O82_A11646TransferAO, P04O82_n11646TransferAO, P04O82_A11648TransferAD, P04O82_n11648TransferAD
            }
            , new Object[] {
            P04O83_A396EmprCod, P04O83_A11644TransferId, P04O83_A11654TransferCt, P04O83_n11654TransferCt, P04O83_A718PrdNom, P04O83_A719PrdNum, P04O83_n719PrdNum, P04O83_A11653TransferLn
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A11646TransferAO ;
   private byte A11648TransferAD ;
   private byte GXv_int3[] ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A11653TransferLn ;
   private int Gx_OldLine ;
   private long A11644TransferId ;
   private java.math.BigDecimal A11654TransferCt ;
   private String A396EmprCod ;
   private String AV8MovTxt ;
   private String AV10TipmovTxt ;
   private String scmdbuf ;
   private String A11650TransferFb ;
   private String A3840CcoDsc ;
   private String A11651TransferUs ;
   private String A11647TransferOD ;
   private String A11649TransferDD ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String AV9TransferFb ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private java.util.Date A11645TransferDi ;
   private boolean GxHdr2 ;
   private boolean n3839CcoCod ;
   private boolean n11650TransferFb ;
   private boolean n3840CcoDsc ;
   private boolean n11651TransferUs ;
   private boolean n11645TransferDi ;
   private boolean n11646TransferAO ;
   private boolean n11648TransferAD ;
   private boolean n11654TransferCt ;
   private boolean n719PrdNum ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P04O82_A3839CcoCod ;
   private boolean[] P04O82_n3839CcoCod ;
   private long[] P04O82_A11644TransferId ;
   private String[] P04O82_A11650TransferFb ;
   private boolean[] P04O82_n11650TransferFb ;
   private String[] P04O82_A3840CcoDsc ;
   private boolean[] P04O82_n3840CcoDsc ;
   private String[] P04O82_A11651TransferUs ;
   private boolean[] P04O82_n11651TransferUs ;
   private java.util.Date[] P04O82_A11645TransferDi ;
   private boolean[] P04O82_n11645TransferDi ;
   private String[] P04O82_A396EmprCod ;
   private byte[] P04O82_A11646TransferAO ;
   private boolean[] P04O82_n11646TransferAO ;
   private byte[] P04O82_A11648TransferAD ;
   private boolean[] P04O82_n11648TransferAD ;
   private String[] P04O83_A396EmprCod ;
   private long[] P04O83_A11644TransferId ;
   private java.math.BigDecimal[] P04O83_A11654TransferCt ;
   private boolean[] P04O83_n11654TransferCt ;
   private String[] P04O83_A718PrdNom ;
   private String[] P04O83_A719PrdNum ;
   private boolean[] P04O83_n719PrdNum ;
   private int[] P04O83_A11653TransferLn ;
}

final  class ptrf001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04O82", "SELECT T1.CcoCod, T1.TransferId, T1.TransferFb, T2.CcoDsc, T1.TransferUs, T1.TransferDi, T1.EmprCod, T1.TransferAO, T1.TransferAD FROM (TXPTRF000 T1 LEFT JOIN TXPCENTCO T2 ON T2.CcoCod = T1.CcoCod) WHERE T1.EmprCod = ? and T1.TransferId = ? ORDER BY T1.EmprCod, T1.TransferId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04O83", "SELECT T1.EmprCod, T1.TransferId, T1.TransferCt, T2.PrdNom, T1.PrdNum, T1.TransferLn FROM (TXPTRF001 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.TransferId = ? ORDER BY T1.EmprCod, T1.TransferId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

