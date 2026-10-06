package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputac04 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputac04 pgm = new aputac04 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputac04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputac04.class ), "" );
   }

   public aputac04( int remoteHandle ,
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("CONTROL FASQUI") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         new app.pdbconn(remoteHandle, context).execute( ) ;
         System.out.println( httpContext.getMessage( "Analisis Tabla fasqui....", "") );
         /* Using cursor P04LD2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk4LD3 = false ;
            A396EmprCod = P04LD2_A396EmprCod[0] ;
            A129BarCod = P04LD2_A129BarCod[0] ;
            A132BarCodReo = P04LD2_A132BarCodReo[0] ;
            A130BarCodPar = P04LD2_A130BarCodPar[0] ;
            A758ProCod = P04LD2_A758ProCod[0] ;
            A194BarOrdLin = P04LD2_A194BarOrdLin[0] ;
            A5371FasQuiLin = P04LD2_A5371FasQuiLin[0] ;
            AV14Num_l = (short)(0) ;
            AV8Emprcod = A396EmprCod ;
            AV9Barcod = A129BarCod ;
            AV11Barcodreo = A132BarCodReo ;
            AV10Barcodpar = A130BarCodPar ;
            AV12Procod = A758ProCod ;
            /* Execute user subroutine: 'BARFAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P04LD2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P04LD2_A129BarCod[0] == A129BarCod ) && ( P04LD2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P04LD2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( GXutil.strcmp(P04LD2_A758ProCod[0], A758ProCod) == 0 ) ) )
               {
                  if (true) break;
               }
               brk4LD3 = false ;
               A194BarOrdLin = P04LD2_A194BarOrdLin[0] ;
               A5371FasQuiLin = P04LD2_A5371FasQuiLin[0] ;
               AV8Emprcod = A396EmprCod ;
               AV9Barcod = A129BarCod ;
               AV11Barcodreo = A132BarCodReo ;
               AV10Barcodpar = A130BarCodPar ;
               AV12Procod = A758ProCod ;
               AV13Barordlin = A194BarOrdLin ;
               AV14Num_l = (short)(AV14Num_l+1) ;
               brk4LD3 = true ;
               pr_default.readNext(0);
            }
            if ( AV14Num_l != AV15Num_r )
            {
               h4LD0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 76, Gx_line+1, 135, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 151, Gx_line+1, 159, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 173, Gx_line+0, 181, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 220, Gx_line+0, 279, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Num_l), "ZZZ9")), 426, Gx_line+1, 456, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Num_r), "ZZ9")), 597, Gx_line+1, 620, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            if ( ! brk4LD3 )
            {
               brk4LD3 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         System.out.println( httpContext.getMessage( "Fin Analisis Tabla fasqui....", "") );
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h4LD0( true, 0) ;
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
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV15Num_r = (short)(0) ;
      /* Using cursor P04LD3 */
      pr_default.execute(1, new Object[] {AV8Emprcod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV11Barcodreo), AV10Barcodpar, AV12Procod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A758ProCod = P04LD3_A758ProCod[0] ;
         A130BarCodPar = P04LD3_A130BarCodPar[0] ;
         A132BarCodReo = P04LD3_A132BarCodReo[0] ;
         A129BarCod = P04LD3_A129BarCod[0] ;
         A396EmprCod = P04LD3_A396EmprCod[0] ;
         A4905BarFasAcab = P04LD3_A4905BarFasAcab[0] ;
         A194BarOrdLin = P04LD3_A194BarOrdLin[0] ;
         if ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV15Num_r = (short)(AV15Num_r+1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void h4LD0( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Control tabla FASQUI", ""), 26, Gx_line+20, 153, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 389, Gx_line+19, 434, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Paginas", ""), 329, Gx_line+20, 377, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 182, Gx_line+19, 241, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 253, Gx_line+19, 312, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(19, Gx_line+48, 1018, Gx_line+48, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço", ""), 76, Gx_line+79, 163, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(80, Gx_line+96, 180, Gx_line+96, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Processo", ""), 220, Gx_line+79, 275, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(220, Gx_line+96, 275, Gx_line+96, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lineas en Fasqui", ""), 354, Gx_line+80, 455, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lineas reales", ""), 540, Gx_line+81, 619, Gx_line+95, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+104) ;
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
      GXutil.refClasses(putac04.class);
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
      scmdbuf = "" ;
      P04LD2_A396EmprCod = new String[] {""} ;
      P04LD2_A129BarCod = new int[1] ;
      P04LD2_A132BarCodReo = new byte[1] ;
      P04LD2_A130BarCodPar = new String[] {""} ;
      P04LD2_A758ProCod = new String[] {""} ;
      P04LD2_A194BarOrdLin = new short[1] ;
      P04LD2_A5371FasQuiLin = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      AV8Emprcod = "" ;
      AV10Barcodpar = "" ;
      AV12Procod = "" ;
      P04LD3_A758ProCod = new String[] {""} ;
      P04LD3_A130BarCodPar = new String[] {""} ;
      P04LD3_A132BarCodReo = new byte[1] ;
      P04LD3_A129BarCod = new int[1] ;
      P04LD3_A396EmprCod = new String[] {""} ;
      P04LD3_A4905BarFasAcab = new String[] {""} ;
      P04LD3_A194BarOrdLin = new short[1] ;
      A4905BarFasAcab = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputac04__default(),
         new Object[] {
             new Object[] {
            P04LD2_A396EmprCod, P04LD2_A129BarCod, P04LD2_A132BarCodReo, P04LD2_A130BarCodPar, P04LD2_A758ProCod, P04LD2_A194BarOrdLin, P04LD2_A5371FasQuiLin
            }
            , new Object[] {
            P04LD3_A758ProCod, P04LD3_A130BarCodPar, P04LD3_A132BarCodReo, P04LD3_A129BarCod, P04LD3_A396EmprCod, P04LD3_A4905BarFasAcab, P04LD3_A194BarOrdLin
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

   private byte A132BarCodReo ;
   private byte AV11Barcodreo ;
   private short A194BarOrdLin ;
   private short A5371FasQuiLin ;
   private short AV14Num_l ;
   private short AV13Barordlin ;
   private short AV15Num_r ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int AV9Barcod ;
   private int Gx_OldLine ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV8Emprcod ;
   private String AV10Barcodpar ;
   private String AV12Procod ;
   private String A4905BarFasAcab ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean brk4LD3 ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P04LD2_A396EmprCod ;
   private int[] P04LD2_A129BarCod ;
   private byte[] P04LD2_A132BarCodReo ;
   private String[] P04LD2_A130BarCodPar ;
   private String[] P04LD2_A758ProCod ;
   private short[] P04LD2_A194BarOrdLin ;
   private short[] P04LD2_A5371FasQuiLin ;
   private String[] P04LD3_A758ProCod ;
   private String[] P04LD3_A130BarCodPar ;
   private byte[] P04LD3_A132BarCodReo ;
   private int[] P04LD3_A129BarCod ;
   private String[] P04LD3_A396EmprCod ;
   private String[] P04LD3_A4905BarFasAcab ;
   private short[] P04LD3_A194BarOrdLin ;
}

final  class aputac04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04LD2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04LD3", "SELECT ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasAcab, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

