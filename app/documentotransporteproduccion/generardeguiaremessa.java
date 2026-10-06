package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class generardeguiaremessa extends GXReport
{
   public generardeguiaremessa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generardeguiaremessa.class ), "" );
   }

   public generardeguiaremessa( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> aP0 ,
                        short aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> aP0 ,
                             short aP1 ,
                             String aP2 )
   {
      generardeguiaremessa.this.AV14ImpresionDeGuiawwSDT = aP0;
      generardeguiaremessa.this.AV10Copias = aP1;
      generardeguiaremessa.this.AV17PATHPDF = aP2;
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
      getPrinter().GxSetDocName(AV17PATHPDF) ;
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
         AV9Copia[1-1] = httpContext.getMessage( "Original", "") ;
         AV9Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
         AV9Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
         AV9Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
         AV19Rows = (short)(AV14ImpresionDeGuiawwSDT.size()) ;
         AV18Row = (short)(0) ;
         AV23GXV1 = 1 ;
         while ( AV23GXV1 <= AV14ImpresionDeGuiawwSDT.size() )
         {
            AV15ImpresionDeGuiawwSDTItem = (app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)((app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)AV14ImpresionDeGuiawwSDT.elementAt(-1+AV23GXV1));
            AV18Row = (short)(AV18Row+1) ;
            AV11emprcod = AV15ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod() ;
            AV8albprocod = AV15ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod() ;
            AV12i = (short)(1) ;
            while ( AV12i <= AV10Copias )
            {
               AV20TextoCopia = AV9Copia[AV12i-1] ;
               if ( GXutil.strcmp(AV15ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala(), "S") == 0 )
               {
                  hAGW0( false, 0) ;
                  GXv_int1[0] = Gx_page ;
                  GXv_int2[0] = Gx_line ;
                  new app.documentotransporteproduccion.pgrmodv_header_group(remoteHandle, context).execute( AV11emprcod, AV8albprocod, AV13ImpCod, AV20TextoCopia, GXv_int1, GXv_int2, getPrinter()) ;
                  generardeguiaremessa.this.Gx_page = GXv_int1[0] ;
                  generardeguiaremessa.this.Gx_line = GXv_int2[0] ;
                  hAGW0( false, 0) ;
                  GXv_int2[0] = Gx_page ;
                  GXv_int1[0] = Gx_line ;
                  new app.documentotransporteproduccion.pgrmodv_group(remoteHandle, context).execute( AV11emprcod, AV8albprocod, AV13ImpCod, AV20TextoCopia, GXv_int2, GXv_int1, getPrinter()) ;
                  generardeguiaremessa.this.Gx_page = GXv_int2[0] ;
                  generardeguiaremessa.this.Gx_line = GXv_int1[0] ;
               }
               else
               {
                  hAGW0( false, 0) ;
                  GXv_int2[0] = Gx_page ;
                  GXv_int1[0] = Gx_line ;
                  new app.documentotransporteproduccion.pgrmoda_header_direct(remoteHandle, context).execute( AV11emprcod, AV8albprocod, AV13ImpCod, AV20TextoCopia, GXv_int2, GXv_int1, getPrinter()) ;
                  generardeguiaremessa.this.Gx_page = GXv_int2[0] ;
                  generardeguiaremessa.this.Gx_line = GXv_int1[0] ;
                  hAGW0( false, 0) ;
                  GXv_int2[0] = Gx_page ;
                  GXv_int1[0] = Gx_line ;
                  new app.documentotransporteproduccion.pgrmoda_direct(remoteHandle, context).execute( AV11emprcod, AV8albprocod, AV13ImpCod, AV20TextoCopia, GXv_int2, GXv_int1, getPrinter()) ;
                  generardeguiaremessa.this.Gx_page = GXv_int2[0] ;
                  generardeguiaremessa.this.Gx_line = GXv_int1[0] ;
               }
               AV12i = (short)(AV12i+1) ;
            }
            AV16LastRow = AV18Row ;
            AV23GXV1 = (int)(AV23GXV1+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAGW0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void hAGW0( boolean bFoot ,
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
      AV9Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV9Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV15ImpresionDeGuiawwSDTItem = new app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem(remoteHandle, context);
      AV11emprcod = "" ;
      AV20TextoCopia = "" ;
      AV13ImpCod = "" ;
      GXv_int2 = new int[1] ;
      GXv_int1 = new int[1] ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short AV10Copias ;
   private short AV19Rows ;
   private short AV18Row ;
   private short AV12i ;
   private short AV16LastRow ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV23GXV1 ;
   private int GXv_int2[] ;
   private int GXv_int1[] ;
   private int Gx_OldLine ;
   private int GX_I ;
   private long AV8albprocod ;
   private String AV11emprcod ;
   private String AV20TextoCopia ;
   private String AV13ImpCod ;
   private String AV17PATHPDF ;
   private String AV9Copia[] ;
   private GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> AV14ImpresionDeGuiawwSDT ;
   private app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem AV15ImpresionDeGuiawwSDTItem ;
}

