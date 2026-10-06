package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rqil024 extends GXReport
{
   public rqil024( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rqil024.class ), "" );
   }

   public rqil024( int remoteHandle ,
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
      rqil024.this.aP5 = new byte[] {0};
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
      rqil024.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rqil024.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      rqil024.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      rqil024.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      rqil024.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      rqil024.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 2 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("INFORME QIL024R0") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV10ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "QIL024", ""), GXv_char1) ;
         rqil024.this.AV10ContDsc = GXv_char1[0] ;
         GxHdr2 = true ;
         /* Using cursor P07J42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A279CliNom = P07J42_A279CliNom[0] ;
            A279CliNom = P07J42_A279CliNom[0] ;
            if ( AV8Ini == 0 )
            {
               AV8Ini = (byte)(1) ;
               h7J40( false, 173) ;
               getPrinter().GxDrawRect(7, Gx_line+47, 606, Gx_line+79, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+16, 606, Gx_line+48, 1, 0, 0, 0, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Amostra de cor após", ""), 213, Gx_line+25, 335, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Secar 1ª vez", ""), 15, Gx_line+56, 92, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ramular", ""), 438, Gx_line+56, 487, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(605, Gx_line+47, 774, Gx_line+79, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Refª", ""), 620, Gx_line+56, 647, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(656, Gx_line+47, 656, Gx_line+173, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+78, 606, Gx_line+172, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(139, Gx_line+47, 139, Gx_line+172, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(306, Gx_line+47, 306, Gx_line+172, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(605, Gx_line+78, 774, Gx_line+110, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(605, Gx_line+109, 774, Gx_line+141, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(605, Gx_line+141, 774, Gx_line+172, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 620, Gx_line+88, 647, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Enc", ""), 620, Gx_line+119, 644, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 620, Gx_line+150, 649, Gx_line+164, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Secar 2ª vez", ""), 175, Gx_line+56, 252, Gx_line+70, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+173) ;
            }
            AV9i = (byte)(1) ;
            while ( AV9i <= 6 )
            {
               h7J40( false, 94) ;
               getPrinter().GxDrawRect(7, Gx_line+0, 606, Gx_line+94, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(605, Gx_line+0, 774, Gx_line+32, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(605, Gx_line+31, 774, Gx_line+63, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(605, Gx_line+63, 774, Gx_line+94, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 625, Gx_line+9, 652, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Enc", ""), 625, Gx_line+41, 649, Gx_line+55, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 625, Gx_line+72, 654, Gx_line+86, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
               AV9i = (byte)(AV9i+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7J40( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7J40( boolean bFoot ,
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
               getPrinter().GxDrawLine(7, Gx_line+0, 775, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ContDsc, "")), 7, Gx_line+4, 112, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "5a16d547-693a-41bf-ab81-2ffc32ded6fb", "", context.getHttpContext().getTheme( )), 7, Gx_line+16, 160, Gx_line+157) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "QIL024/0 - ___/___", ""), 632, Gx_line+16, 752, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Controlo de Cor", ""), 277, Gx_line+79, 409, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pág.", ""), 597, Gx_line+140, 631, Gx_line+158, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 641, Gx_line+140, 677, Gx_line+157, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 686, Gx_line+140, 706, Gx_line+158, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 716, Gx_line+140, 752, Gx_line+157, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+172) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 50, Gx_line+31, 71, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Código", ""), 29, Gx_line+63, 71, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Amostra", ""), 29, Gx_line+94, 77, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 124, Gx_line+30, 220, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 175, Gx_line+61, 220, Gx_line+78, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(88, Gx_line+94, 286, Gx_line+158, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 474, Gx_line+16, 516, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 532, Gx_line+16, 752, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 480, Gx_line+47, 515, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 532, Gx_line+47, 650, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Largura", ""), 470, Gx_line+78, 516, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gramagem", ""), 453, Gx_line+109, 515, Gx_line+123, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+159) ;
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
      this.aP0[0] = rqil024.this.A396EmprCod;
      this.aP1[0] = rqil024.this.A252CliCod;
      this.aP2[0] = rqil024.this.A494ForSer;
      this.aP3[0] = rqil024.this.A482ForColNom;
      this.aP4[0] = rqil024.this.A483ForColNum;
      this.aP5[0] = rqil024.this.A831TipColCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ContDsc = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P07J42_A396EmprCod = new String[] {""} ;
      P07J42_A252CliCod = new int[1] ;
      P07J42_A494ForSer = new String[] {""} ;
      P07J42_A482ForColNom = new String[] {""} ;
      P07J42_A483ForColNum = new int[1] ;
      P07J42_A831TipColCod = new byte[1] ;
      P07J42_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rqil024__default(),
         new Object[] {
             new Object[] {
            P07J42_A396EmprCod, P07J42_A252CliCod, P07J42_A494ForSer, P07J42_A482ForColNom, P07J42_A483ForColNum, P07J42_A831TipColCod, P07J42_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8Ini ;
   private byte AV9i ;
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
   private String AV10ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A279CliNom ;
   private boolean GxHdr2 ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07J42_A396EmprCod ;
   private int[] P07J42_A252CliCod ;
   private String[] P07J42_A494ForSer ;
   private String[] P07J42_A482ForColNom ;
   private int[] P07J42_A483ForColNum ;
   private byte[] P07J42_A831TipColCod ;
   private String[] P07J42_A279CliNom ;
}

final  class rqil024__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07J42", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T2.CliNom FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
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
      }
   }

}

