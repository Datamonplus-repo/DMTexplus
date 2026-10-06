package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class generarguiaremessa extends GXReport
{
   public generarguiaremessa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generarguiaremessa.class ), "" );
   }

   public generarguiaremessa( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> aP0 ,
                        short aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> aP0 ,
                             short aP1 ,
                             String aP2 )
   {
      generarguiaremessa.this.AV38ImpresionGuiawwSDT = aP0;
      generarguiaremessa.this.AV32Copias = aP1;
      generarguiaremessa.this.AV27PATHPDF = aP2;
      initialize();
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
      getPrinter().GxSetDocName(AV27PATHPDF) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         AV31Copia[1-1] = httpContext.getMessage( "Original", "") ;
         AV31Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
         AV31Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
         AV31Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
         AV40Rows = (short)(AV38ImpresionGuiawwSDT.size()) ;
         AV41Row = (short)(0) ;
         Gx_page = 1 ;
         AV46GXV1 = 1 ;
         while ( AV46GXV1 <= AV38ImpresionGuiawwSDT.size() )
         {
            AV39ImpresionGuiawwSDTItem = (app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem)((app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem)AV38ImpresionGuiawwSDT.elementAt(-1+AV46GXV1));
            AV41Row = (short)(AV41Row+1) ;
            AV23emprcod = AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod() ;
            AV8albprocod = AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod() ;
            AV34i = (short)(1) ;
            while ( AV34i <= AV32Copias )
            {
               AV30TextoCopia = AV31Copia[AV34i-1] ;
               Gx_line = (int)(Gx_line+2) ;
               Gx_page = (int)(Gx_page+1) ;
               System.out.println( httpContext.getMessage( "Page :", "")+GXutil.str( Gx_page, 6, 0) );
               System.out.println( httpContext.getMessage( "Line :", "")+GXutil.str( Gx_line, 6, 0) );
               System.out.println( httpContext.getMessage( "&Row :", "")+GXutil.str( AV41Row, 4, 0) );
               if ( GXutil.strcmp(AV39ImpresionGuiawwSDTItem.getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala(), "S") == 0 )
               {
                  hAGH0( false, 0) ;
                  GXv_int1[0] = Gx_page ;
                  GXv_int2[0] = Gx_line ;
                  new app.documentotransporteproduccion.pgrmodv_header_group(remoteHandle, context).execute( AV23emprcod, AV8albprocod, AV37ImpCod, AV30TextoCopia, GXv_int1, GXv_int2, getPrinter()) ;
                  generarguiaremessa.this.Gx_page = GXv_int1[0] ;
                  generarguiaremessa.this.Gx_line = GXv_int2[0] ;
                  hAGH0( false, 0) ;
                  GXv_int2[0] = Gx_page ;
                  GXv_int1[0] = Gx_line ;
                  new app.documentotransporteproduccion.pgrmodv_group(remoteHandle, context).execute( AV23emprcod, AV8albprocod, AV37ImpCod, AV30TextoCopia, GXv_int2, GXv_int1, getPrinter()) ;
                  generarguiaremessa.this.Gx_page = GXv_int2[0] ;
                  generarguiaremessa.this.Gx_line = GXv_int1[0] ;
               }
               else
               {
                  hAGH0( false, 0) ;
                  GXv_int2[0] = Gx_page ;
                  GXv_int1[0] = Gx_line ;
                  new app.documentotransporteproduccion.pgrmoda_header_direct(remoteHandle, context).execute( AV23emprcod, AV8albprocod, AV37ImpCod, AV30TextoCopia, GXv_int2, GXv_int1, getPrinter()) ;
                  generarguiaremessa.this.Gx_page = GXv_int2[0] ;
                  generarguiaremessa.this.Gx_line = GXv_int1[0] ;
                  hAGH0( false, 0) ;
                  GXv_int2[0] = Gx_page ;
                  GXv_int1[0] = Gx_line ;
                  new app.documentotransporteproduccion.pgrmoda_direct(remoteHandle, context).execute( AV23emprcod, AV8albprocod, AV37ImpCod, AV30TextoCopia, GXv_int2, GXv_int1, getPrinter()) ;
                  generarguiaremessa.this.Gx_page = GXv_int2[0] ;
                  generarguiaremessa.this.Gx_line = GXv_int1[0] ;
               }
               AV34i = (short)(AV34i+1) ;
            }
            AV42LastRow = AV41Row ;
            System.out.println( httpContext.getMessage( "LastRow :", "")+GXutil.str( AV42LastRow, 4, 0) );
            AV46GXV1 = (int)(AV46GXV1+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAGH0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void hAGH0( boolean bFoot ,
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
               getPrinter().GxDrawLine(8, Gx_line+0, 816, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 0, Gx_line+0, 39, Gx_line+15, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV31Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV39ImpresionGuiawwSDTItem = new app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem(remoteHandle, context);
      AV23emprcod = "" ;
      AV30TextoCopia = "" ;
      AV37ImpCod = "" ;
      GXv_int2 = new int[1] ;
      GXv_int1 = new int[1] ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short AV32Copias ;
   private short AV40Rows ;
   private short AV41Row ;
   private short AV34i ;
   private short AV42LastRow ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV46GXV1 ;
   private int GXv_int2[] ;
   private int GXv_int1[] ;
   private int Gx_OldLine ;
   private int GX_I ;
   private long AV8albprocod ;
   private String AV31Copia[] ;
   private String AV23emprcod ;
   private String AV30TextoCopia ;
   private String AV37ImpCod ;
   private String AV27PATHPDF ;
   private GXBaseCollection<app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> AV38ImpresionGuiawwSDT ;
   private app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem AV39ImpresionGuiawwSDTItem ;
}

