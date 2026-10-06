package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu000 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu000 pgm = new apsuu000 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu000.class ), "" );
   }

   public apsuu000( int remoteHandle ,
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
         getPrinter().GxSetDocName("UTILIDA SUPREMA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         System.out.println( httpContext.getMessage( "Control Articu-Models-Modpro", "") );
         /* Using cursor P02TS2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A65ArtCod = P02TS2_A65ArtCod[0] ;
            A252CliCod = P02TS2_A252CliCod[0] ;
            A396EmprCod = P02TS2_A396EmprCod[0] ;
            AV8Mdlcod = GXutil.substring( A65ArtCod, 1, 13) ;
            AV9Clicod = A252CliCod ;
            AV11Emprcod = A396EmprCod ;
            /* Execute user subroutine: 'MODELS' */
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
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2TS0( true, 0) ;
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
      /* 'MODELS' Routine */
      returnInSub = false ;
      AV12Models = (byte)(0) ;
      /* Using cursor P02TS3 */
      pr_default.execute(1, new Object[] {AV11Emprcod, Integer.valueOf(AV9Clicod), AV10Artcod, AV8Mdlcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4658MdlCod = P02TS3_A4658MdlCod[0] ;
         A65ArtCod = P02TS3_A65ArtCod[0] ;
         A252CliCod = P02TS3_A252CliCod[0] ;
         A396EmprCod = P02TS3_A396EmprCod[0] ;
         AV12Models = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV12Models == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPModels

         */
         A396EmprCod = AV11Emprcod ;
         A252CliCod = AV9Clicod ;
         A65ArtCod = AV10Artcod ;
         A4658MdlCod = AV8Mdlcod ;
         A4659MdlDsc = " " ;
         n4659MdlDsc = false ;
         /* Using cursor P02TS4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, Boolean.valueOf(n4659MdlDsc), A4659MdlDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModels");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      AV13Modpro = (byte)(0) ;
      /* Using cursor P02TS5 */
      pr_default.execute(3, new Object[] {AV11Emprcod, Integer.valueOf(AV9Clicod), AV10Artcod, AV8Mdlcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4658MdlCod = P02TS5_A4658MdlCod[0] ;
         A65ArtCod = P02TS5_A65ArtCod[0] ;
         A252CliCod = P02TS5_A252CliCod[0] ;
         A396EmprCod = P02TS5_A396EmprCod[0] ;
         A758ProCod = P02TS5_A758ProCod[0] ;
         AV13Modpro = (byte)(1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV13Modpro == 0 )
      {
         AV14procod = GXutil.substring( AV8Mdlcod, 1, 8) ;
         /*
            INSERT RECORD ON TABLE TXPModPro

         */
         A396EmprCod = AV11Emprcod ;
         A252CliCod = AV9Clicod ;
         A65ArtCod = AV10Artcod ;
         A4658MdlCod = AV8Mdlcod ;
         A758ProCod = AV14procod ;
         /* Using cursor P02TS6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModPro");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         h2TS0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Clicod), "ZZZZZ9")), 34, Gx_line+0, 79, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Artcod, "")), 90, Gx_line+0, 208, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Mdlcod, "")), 217, Gx_line+0, 313, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14procod, "")), 366, Gx_line+0, 425, Gx_line+17, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
      }
   }

   public void h2TS0( boolean bFoot ,
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
      GXutil.refClasses(psuu000.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu000");
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
      P02TS2_A65ArtCod = new String[] {""} ;
      P02TS2_A252CliCod = new int[1] ;
      P02TS2_A396EmprCod = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      AV8Mdlcod = "" ;
      AV10Artcod = "" ;
      AV11Emprcod = "" ;
      P02TS3_A4658MdlCod = new String[] {""} ;
      P02TS3_A65ArtCod = new String[] {""} ;
      P02TS3_A252CliCod = new int[1] ;
      P02TS3_A396EmprCod = new String[] {""} ;
      A4658MdlCod = "" ;
      A4659MdlDsc = "" ;
      Gx_emsg = "" ;
      P02TS5_A4658MdlCod = new String[] {""} ;
      P02TS5_A65ArtCod = new String[] {""} ;
      P02TS5_A252CliCod = new int[1] ;
      P02TS5_A396EmprCod = new String[] {""} ;
      P02TS5_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV14procod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu000__default(),
         new Object[] {
             new Object[] {
            P02TS2_A65ArtCod, P02TS2_A252CliCod, P02TS2_A396EmprCod
            }
            , new Object[] {
            P02TS3_A4658MdlCod, P02TS3_A65ArtCod, P02TS3_A252CliCod, P02TS3_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02TS5_A4658MdlCod, P02TS5_A65ArtCod, P02TS5_A252CliCod, P02TS5_A396EmprCod, P02TS5_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV12Models ;
   private byte AV13Modpro ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV9Clicod ;
   private int GX_INS696 ;
   private int GX_INS697 ;
   private int Gx_OldLine ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String AV8Mdlcod ;
   private String AV10Artcod ;
   private String AV11Emprcod ;
   private String A4658MdlCod ;
   private String A4659MdlDsc ;
   private String Gx_emsg ;
   private String A758ProCod ;
   private String AV14procod ;
   private boolean returnInSub ;
   private boolean n4659MdlDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P02TS2_A65ArtCod ;
   private int[] P02TS2_A252CliCod ;
   private String[] P02TS2_A396EmprCod ;
   private String[] P02TS3_A4658MdlCod ;
   private String[] P02TS3_A65ArtCod ;
   private int[] P02TS3_A252CliCod ;
   private String[] P02TS3_A396EmprCod ;
   private String[] P02TS5_A4658MdlCod ;
   private String[] P02TS5_A65ArtCod ;
   private int[] P02TS5_A252CliCod ;
   private String[] P02TS5_A396EmprCod ;
   private String[] P02TS5_A758ProCod ;
}

final  class apsuu000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02TS2", "SELECT ArtCod, CliCod, EmprCod FROM TXPARTICU ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02TS3", "SELECT MdlCod, ArtCod, CliCod, EmprCod FROM TXPModels WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and MdlCod = ? ORDER BY EmprCod, CliCod, ArtCod, MdlCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02TS4", "INSERT INTO TXPModels(EmprCod, CliCod, ArtCod, MdlCod, MdlDsc) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModels")
         ,new ForEachCursor("P02TS5", "SELECT MdlCod, ArtCod, CliCod, EmprCod, ProCod FROM TXPModPro WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and MdlCod = ? ORDER BY EmprCod, CliCod, ArtCod, MdlCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TS6", "INSERT INTO TXPModPro(EmprCod, CliCod, ArtCod, MdlCod, ProCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModPro")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

