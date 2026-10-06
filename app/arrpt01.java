package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class arrpt01 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      arrpt01 pgm = new arrpt01 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public arrpt01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( arrpt01.class ), "" );
   }

   public arrpt01( int remoteHandle ,
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("QUE PASA CON BARKGM") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         new app.pdbconn(remoteHandle, context).execute( ) ;
         AV8Emprcod = "001" ;
         /* Using cursor P07L43 */
         pr_default.execute(0, new Object[] {AV8Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A430FacCod = P07L43_A430FacCod[0] ;
            A396EmprCod = P07L43_A396EmprCod[0] ;
            A14219FacEnergia = P07L43_A14219FacEnergia[0] ;
            A3918FacImpTot1 = P07L43_A3918FacImpTot1[0] ;
            A3918FacImpTot1 = P07L43_A3918FacImpTot1[0] ;
            A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
            h7L40( false, 115) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 0, Gx_line+0, 59, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3918FacImpTot1, "ZZZZZZZZZ9.99")), 95, Gx_line+0, 191, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99")), 201, Gx_line+0, 297, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+115) ;
            /* Using cursor P07L44 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A12197FacUnds = P07L44_A12197FacUnds[0] ;
               A3897FacKgsA = P07L44_A3897FacKgsA[0] ;
               A3898FacPreKgsA = P07L44_A3898FacPreKgsA[0] ;
               A12198FacPreUnd = P07L44_A12198FacPreUnd[0] ;
               A449FacPreMts = P07L44_A449FacPreMts[0] ;
               A5353FacImpMan = P07L44_A5353FacImpMan[0] ;
               A447FacMts = P07L44_A447FacMts[0] ;
               A444FacKgs = P07L44_A444FacKgs[0] ;
               A448FacPreKgs = P07L44_A448FacPreKgs[0] ;
               A5355FacImpMin = P07L44_A5355FacImpMin[0] ;
               A446FacLin = P07L44_A446FacLin[0] ;
               A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
               if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
               {
                  A3923FacImp1 = A5355FacImpMin ;
               }
               else
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
                  {
                     A3923FacImp1 = A5353FacImpMan ;
                  }
                  else
                  {
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
                     {
                        A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
                     }
                     else
                     {
                        A3923FacImp1 = A2239FacIml ;
                     }
                  }
               }
               A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
               h7L40( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2239FacIml, "ZZZZZZZZZ9.99999")), 88, Gx_line+1, 206, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3923FacImp1, "ZZZZZZZZZ9.99999")), 220, Gx_line+1, 338, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A438FacImp, "ZZZZZZZZZZ9.99")), 361, Gx_line+0, 464, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            httpContext.GX_msglist.addItem("...");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7L40( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7L40( boolean bFoot ,
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
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
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
      GXutil.refClasses(rrpt01.class);
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
      AV8Emprcod = "" ;
      scmdbuf = "" ;
      P07L43_A430FacCod = new int[1] ;
      P07L43_A396EmprCod = new String[] {""} ;
      P07L43_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L43_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      P07L44_A396EmprCod = new String[] {""} ;
      P07L44_A430FacCod = new int[1] ;
      P07L44_A12197FacUnds = new int[1] ;
      P07L44_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07L44_A446FacLin = new int[1] ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.arrpt01__default(),
         new Object[] {
             new Object[] {
            P07L43_A430FacCod, P07L43_A396EmprCod, P07L43_A14219FacEnergia, P07L43_A3918FacImpTot1
            }
            , new Object[] {
            P07L44_A396EmprCod, P07L44_A430FacCod, P07L44_A12197FacUnds, P07L44_A3897FacKgsA, P07L44_A3898FacPreKgsA, P07L44_A12198FacPreUnd, P07L44_A449FacPreMts, P07L44_A5353FacImpMan, P07L44_A447FacMts, P07L44_A444FacKgs,
            P07L44_A448FacPreKgs, P07L44_A5355FacImpMin, P07L44_A446FacLin
            }
         }
      );
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
   private int A430FacCod ;
   private int Gx_OldLine ;
   private int A12197FacUnds ;
   private int A446FacLin ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A438FacImp ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private int[] P07L43_A430FacCod ;
   private String[] P07L43_A396EmprCod ;
   private java.math.BigDecimal[] P07L43_A14219FacEnergia ;
   private java.math.BigDecimal[] P07L43_A3918FacImpTot1 ;
   private String[] P07L44_A396EmprCod ;
   private int[] P07L44_A430FacCod ;
   private int[] P07L44_A12197FacUnds ;
   private java.math.BigDecimal[] P07L44_A3897FacKgsA ;
   private java.math.BigDecimal[] P07L44_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P07L44_A12198FacPreUnd ;
   private java.math.BigDecimal[] P07L44_A449FacPreMts ;
   private java.math.BigDecimal[] P07L44_A5353FacImpMan ;
   private java.math.BigDecimal[] P07L44_A447FacMts ;
   private java.math.BigDecimal[] P07L44_A444FacKgs ;
   private java.math.BigDecimal[] P07L44_A448FacPreKgs ;
   private java.math.BigDecimal[] P07L44_A5355FacImpMin ;
   private int[] P07L44_A446FacLin ;
}

final  class arrpt01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07L43", "SELECT T1.FacCod, T1.EmprCod, T1.FacEnergia, COALESCE( T2.FacImpTot1, 0) AS FacImpTot1 FROM (TXPCFAVEN T1 LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = 312276 ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07L44", "SELECT EmprCod, FacCod, FacUnds, FacKgsA, FacPreKgsA, FacPreUnd, FacPreMts, FacImpMan, FacMts, FacKgs, FacPreKgs, FacImpMin, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[12])[0] = rslt.getInt(13);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

