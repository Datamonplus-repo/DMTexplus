package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apm21u00 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apm21u00 pgm = new apm21u00 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apm21u00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apm21u00.class ), "" );
   }

   public apm21u00( int remoteHandle ,
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
         getPrinter().GxSetDocName("CONTROL CAMPO LB_ULTOP") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         new app.pdbconn(remoteHandle, context).execute( ) ;
         AV12Fec1 = GXutil.dadd(GXutil.today( ),-(30)) ;
         AV13Fec2 = GXutil.today( ) ;
         GxHdr2 = true ;
         /* Using cursor P02UL2 */
         pr_default.execute(0, new Object[] {AV12Fec1, AV13Fec2});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5532Lb_numero = P02UL2_A5532Lb_numero[0] ;
            A396EmprCod = P02UL2_A396EmprCod[0] ;
            A5541Lb_FechaE = P02UL2_A5541Lb_FechaE[0] ;
            A5549Lb_UltOp = P02UL2_A5549Lb_UltOp[0] ;
            A5717Lb_numopu = P02UL2_A5717Lb_numopu[0] ;
            AV8Lb_ultop = A5549Lb_UltOp ;
            AV10Lb_numopu = A5717Lb_numopu ;
            /* Using cursor P02UL3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5718Lb_numop = P02UL3_A5718Lb_numop[0] ;
               A5555Lb_opcion = P02UL3_A5555Lb_opcion[0] ;
               AV9Lb_opcion = A5555Lb_opcion ;
               AV11LB_NUMOP = A5718Lb_numop ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( ( ( GXutil.strcmp(AV8Lb_ultop, AV9Lb_opcion) != 0 ) && ! (GXutil.strcmp("", AV9Lb_opcion)==0) ) || ( ( AV10Lb_numopu != AV11LB_NUMOP ) && ! (0==AV11LB_NUMOP) ) )
            {
               h2UL0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 131, Gx_line+1, 190, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lb_ultop, "")), 502, Gx_line+1, 510, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lb_opcion, "@!")), 278, Gx_line+0, 286, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11LB_NUMOP), "Z9")), 308, Gx_line+1, 324, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10Lb_numopu), "Z9")), 551, Gx_line+1, 567, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               A5549Lb_UltOp = AV9Lb_opcion ;
               A5717Lb_numopu = AV11LB_NUMOP ;
            }
            /* Using cursor P02UL4 */
            pr_default.execute(2, new Object[] {A5549Lb_UltOp, Byte.valueOf(A5717Lb_numopu), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2UL0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h2UL0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ensayo", ""), 131, Gx_line+3, 175, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Opcion Ultima", ""), 244, Gx_line+3, 327, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Opcion Ultima en Ens001", ""), 431, Gx_line+3, 581, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+23) ;
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

   public static Object refClasses( )
   {
      GXutil.refClasses(pm21u00.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apm21u00");
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
      AV12Fec1 = GXutil.nullDate() ;
      AV13Fec2 = GXutil.nullDate() ;
      scmdbuf = "" ;
      P02UL2_A5532Lb_numero = new int[1] ;
      P02UL2_A396EmprCod = new String[] {""} ;
      P02UL2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P02UL2_A5549Lb_UltOp = new String[] {""} ;
      P02UL2_A5717Lb_numopu = new byte[1] ;
      A396EmprCod = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5549Lb_UltOp = "" ;
      AV8Lb_ultop = "" ;
      P02UL3_A396EmprCod = new String[] {""} ;
      P02UL3_A5532Lb_numero = new int[1] ;
      P02UL3_A5718Lb_numop = new byte[1] ;
      P02UL3_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV9Lb_opcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apm21u00__default(),
         new Object[] {
             new Object[] {
            P02UL2_A5532Lb_numero, P02UL2_A396EmprCod, P02UL2_A5541Lb_FechaE, P02UL2_A5549Lb_UltOp, P02UL2_A5717Lb_numopu
            }
            , new Object[] {
            P02UL3_A396EmprCod, P02UL3_A5532Lb_numero, P02UL3_A5718Lb_numop, P02UL3_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A5717Lb_numopu ;
   private byte AV10Lb_numopu ;
   private byte A5718Lb_numop ;
   private byte AV11LB_NUMOP ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A5532Lb_numero ;
   private int Gx_OldLine ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5549Lb_UltOp ;
   private String AV8Lb_ultop ;
   private String A5555Lb_opcion ;
   private String AV9Lb_opcion ;
   private java.util.Date AV12Fec1 ;
   private java.util.Date AV13Fec2 ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean GxHdr2 ;
   private IDataStoreProvider pr_default ;
   private int[] P02UL2_A5532Lb_numero ;
   private String[] P02UL2_A396EmprCod ;
   private java.util.Date[] P02UL2_A5541Lb_FechaE ;
   private String[] P02UL2_A5549Lb_UltOp ;
   private byte[] P02UL2_A5717Lb_numopu ;
   private String[] P02UL3_A396EmprCod ;
   private int[] P02UL3_A5532Lb_numero ;
   private byte[] P02UL3_A5718Lb_numop ;
   private String[] P02UL3_A5555Lb_opcion ;
}

final  class apm21u00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UL2", "SELECT Lb_numero, EmprCod, Lb_FechaE, Lb_UltOp, Lb_numopu FROM TXPENS001 WHERE (Lb_FechaE >= ?) AND (Lb_FechaE <= ?) ORDER BY EmprCod, Lb_FechaE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02UL3", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02UL4", "UPDATE TXPENS001 SET Lb_UltOp=?, Lb_numopu=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

