package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprueba1 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprueba1 pgm = new apprueba1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprueba1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprueba1.class ), "" );
   }

   public apprueba1( int remoteHandle ,
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Prueba1") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV8Aux = DecimalUtil.doubleToDec(30*3600+40*60+35) ;
         AV9Aux1 = GXutil.resetTime( GXutil.nullDate() );
         AV10Aux2 = GXutil.resetTime( GXutil.nullDate() );
         AV9Aux1 = localUtil.ymdhmsToT( (short)(0), (byte)(0), (byte)(0), (byte)(30), (byte)(40), (byte)(35)) ;
         h1MM0( false, 63) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV9Aux1, "99/99/99 99:99"), 98, Gx_line+19, 201, Gx_line+36, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV8Aux, "ZZZZZZ9.99")), 82, Gx_line+0, 156, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV10Aux2, "99/99/99 99:99"), 70, Gx_line+43, 173, Gx_line+60, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+63) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1MM0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h1MM0( boolean bFoot ,
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

   public static Object refClasses( )
   {
      GXutil.refClasses(pprueba1.class);
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
      AV8Aux = DecimalUtil.ZERO ;
      AV9Aux1 = GXutil.resetTime( GXutil.nullDate() );
      AV10Aux2 = GXutil.resetTime( GXutil.nullDate() );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV8Aux ;
   private java.util.Date AV9Aux1 ;
   private java.util.Date AV10Aux2 ;
}

