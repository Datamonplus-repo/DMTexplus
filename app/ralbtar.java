package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralbtar extends GXReport
{
   public ralbtar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralbtar.class ), "" );
   }

   public ralbtar( int remoteHandle ,
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
         getPrinter().GxSetDocName("Maestro de Taras") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV10Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV9EmprCod ;
         GXv_char2[0] = AV8EmprNom ;
         GXv_char3[0] = AV11UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char1, GXv_char2, GXv_char3) ;
         ralbtar.this.AV9EmprCod = GXv_char1[0] ;
         ralbtar.this.AV8EmprNom = GXv_char2[0] ;
         ralbtar.this.AV11UsurCod = GXv_char3[0] ;
         /* Using cursor P06OS2 */
         pr_default.execute(0, new Object[] {AV9EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P06OS2_A396EmprCod[0] ;
            A3812AlbTarDsc = P06OS2_A3812AlbTarDsc[0] ;
            n3812AlbTarDsc = P06OS2_n3812AlbTarDsc[0] ;
            A3733AlbTar = P06OS2_A3733AlbTar[0] ;
            h6OS0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3733AlbTar, "")), 130, Gx_line+1, 146, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3812AlbTarDsc, "")), 174, Gx_line+1, 394, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6OS0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6OS0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 7, Gx_line+1, 196, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Listado de Taras", ""), 221, Gx_line+28, 345, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 430, Gx_line+29, 475, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 77, Gx_line+21, 136, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 7, Gx_line+21, 66, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 68, Gx_line+21, 74, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+47, 478, Gx_line+47, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hoja", ""), 403, Gx_line+31, 427, Gx_line+45, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+60) ;
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
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      AV9EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV8EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV11UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P06OS2_A396EmprCod = new String[] {""} ;
      P06OS2_A3812AlbTarDsc = new String[] {""} ;
      P06OS2_n3812AlbTarDsc = new boolean[] {false} ;
      P06OS2_A3733AlbTar = new String[] {""} ;
      A396EmprCod = "" ;
      A3812AlbTarDsc = "" ;
      A3733AlbTar = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralbtar__default(),
         new Object[] {
             new Object[] {
            P06OS2_A396EmprCod, P06OS2_A3812AlbTarDsc, P06OS2_n3812AlbTarDsc, P06OS2_A3733AlbTar
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String AV10Station ;
   private String AV9EmprCod ;
   private String GXv_char1[] ;
   private String AV8EmprNom ;
   private String GXv_char2[] ;
   private String AV11UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A3812AlbTarDsc ;
   private String A3733AlbTar ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n3812AlbTarDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P06OS2_A396EmprCod ;
   private String[] P06OS2_A3812AlbTarDsc ;
   private boolean[] P06OS2_n3812AlbTarDsc ;
   private String[] P06OS2_A3733AlbTar ;
}

final  class ralbtar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06OS2", "SELECT EmprCod, AlbTarDsc, AlbTar FROM TXPALBTAR WHERE EmprCod = ? ORDER BY EmprCod, AlbTar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
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
      }
   }

}

