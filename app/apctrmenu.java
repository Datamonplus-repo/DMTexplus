package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apctrmenu extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apctrmenu pgm = new apctrmenu (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apctrmenu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apctrmenu.class ), "" );
   }

   public apctrmenu( int remoteHandle ,
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("AUDITORIA MENUS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         new app.pdbconn(remoteHandle, context).execute( ) ;
         Gx_msg = httpContext.getMessage( "Auditoria Menus: Mnucab(Mnuop(OpcGru))", "") ;
         h1ET0( false, 68) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_msg, "")), 14, Gx_line+27, 380, Gx_line+44, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 555, Gx_line+28, 582, Gx_line+43, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 596, Gx_line+27, 689, Gx_line+44, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(14, Gx_line+54, 746, Gx_line+54, 2, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+68) ;
         AV16Count_rg = 0 ;
         /* Using cursor P01ET2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A945MnuId = P01ET2_A945MnuId[0] ;
            A951MnuTxt = P01ET2_A951MnuTxt[0] ;
            n951MnuTxt = P01ET2_n951MnuTxt[0] ;
            AV14Mnuop_1 = 0 ;
            /* Using cursor P01ET3 */
            pr_default.execute(1, new Object[] {A945MnuId});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A947MnuPgm = P01ET3_A947MnuPgm[0] ;
               A946MnuOp = P01ET3_A946MnuOp[0] ;
               AV14Mnuop_1 = 1 ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV14Mnuop_1 == 0 )
            {
               /* Using cursor P01ET4 */
               pr_default.execute(2, new Object[] {A945MnuId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUCAB");
               AV16Count_rg = (int)(AV16Count_rg+1) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         Gx_msg = httpContext.getMessage( "Registros Eliminados en Mnucab = ", "") + GXutil.str( AV16Count_rg, 6, 0) ;
         h1ET0( false, 41) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_msg, "")), 14, Gx_line+14, 380, Gx_line+31, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+41) ;
         AV16Count_rg = 0 ;
         /* Using cursor P01ET5 */
         pr_default.execute(3);
         while ( (pr_default.getStatus(3) != 101) )
         {
            A946MnuOp = P01ET5_A946MnuOp[0] ;
            A945MnuId = P01ET5_A945MnuId[0] ;
            A947MnuPgm = P01ET5_A947MnuPgm[0] ;
            AV13Mnucab_1 = 0 ;
            AV17MnuId = A945MnuId ;
            /* Execute user subroutine: 'MNUCAB' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV13Mnucab_1 == 0 )
            {
               /* Optimized DELETE. */
               /* Using cursor P01ET6 */
               pr_default.execute(4, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPCGRU");
               /* End optimized DELETE. */
               /* Using cursor P01ET7 */
               pr_default.execute(5, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
               AV16Count_rg = (int)(AV16Count_rg+1) ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         Gx_msg = httpContext.getMessage( "Registros Eliminados en Mnuop = ", "") + GXutil.str( AV16Count_rg, 6, 0) ;
         h1ET0( false, 41) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_msg, "")), 14, Gx_line+14, 380, Gx_line+31, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+41) ;
         AV13Mnucab_1 = 0 ;
         AV14Mnuop_1 = 0 ;
         AV15Opcgru_1 = 0 ;
         /* Using cursor P01ET8 */
         pr_default.execute(6);
         while ( (pr_default.getStatus(6) != 101) )
         {
            A945MnuId = P01ET8_A945MnuId[0] ;
            A951MnuTxt = P01ET8_A951MnuTxt[0] ;
            n951MnuTxt = P01ET8_n951MnuTxt[0] ;
            /* Using cursor P01ET9 */
            pr_default.execute(7, new Object[] {A945MnuId});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A946MnuOp = P01ET9_A946MnuOp[0] ;
               A947MnuPgm = P01ET9_A947MnuPgm[0] ;
               AV14Mnuop_1 = (int)(AV14Mnuop_1+1) ;
               /* Using cursor P01ET10 */
               pr_default.execute(8, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A950MnuPri = P01ET10_A950MnuPri[0] ;
                  A943GrpId = P01ET10_A943GrpId[0] ;
                  AV15Opcgru_1 = (int)(AV15Opcgru_1+1) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            AV13Mnucab_1 = (int)(AV13Mnucab_1+1) ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         Gx_msg = httpContext.getMessage( "Tabla Mnucab=", "") + GXutil.str( AV13Mnucab_1, 6, 0) + httpContext.getMessage( " Tabla Mnuop= ", "") + GXutil.str( AV14Mnuop_1, 6, 0) + httpContext.getMessage( " Tabla Opcgru= ", "") + GXutil.str( AV15Opcgru_1, 6, 0) ;
         h1ET0( false, 41) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_msg, "")), 14, Gx_line+14, 380, Gx_line+31, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+41) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1ET0( true, 0) ;
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
      /* 'MNUCAB' Routine */
      returnInSub = false ;
      /* Using cursor P01ET11 */
      pr_default.execute(9, new Object[] {AV17MnuId});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A945MnuId = P01ET11_A945MnuId[0] ;
         A951MnuTxt = P01ET11_A951MnuTxt[0] ;
         n951MnuTxt = P01ET11_n951MnuTxt[0] ;
         AV13Mnucab_1 = 1 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void h1ET0( boolean bFoot ,
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
      GXutil.refClasses(pctrmenu.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apctrmenu");
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
      Gx_msg = "" ;
      Gx_time = "" ;
      scmdbuf = "" ;
      P01ET2_A945MnuId = new String[] {""} ;
      P01ET2_A951MnuTxt = new String[] {""} ;
      P01ET2_n951MnuTxt = new boolean[] {false} ;
      A945MnuId = "" ;
      A951MnuTxt = "" ;
      P01ET3_A945MnuId = new String[] {""} ;
      P01ET3_A947MnuPgm = new String[] {""} ;
      P01ET3_A946MnuOp = new byte[1] ;
      A947MnuPgm = "" ;
      P01ET5_A946MnuOp = new byte[1] ;
      P01ET5_A945MnuId = new String[] {""} ;
      P01ET5_A947MnuPgm = new String[] {""} ;
      AV17MnuId = "" ;
      P01ET8_A945MnuId = new String[] {""} ;
      P01ET8_A951MnuTxt = new String[] {""} ;
      P01ET8_n951MnuTxt = new boolean[] {false} ;
      P01ET9_A945MnuId = new String[] {""} ;
      P01ET9_A946MnuOp = new byte[1] ;
      P01ET9_A947MnuPgm = new String[] {""} ;
      P01ET10_A945MnuId = new String[] {""} ;
      P01ET10_A946MnuOp = new byte[1] ;
      P01ET10_A950MnuPri = new byte[1] ;
      P01ET10_A943GrpId = new String[] {""} ;
      A943GrpId = "" ;
      P01ET11_A945MnuId = new String[] {""} ;
      P01ET11_A951MnuTxt = new String[] {""} ;
      P01ET11_n951MnuTxt = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apctrmenu__default(),
         new Object[] {
             new Object[] {
            P01ET2_A945MnuId, P01ET2_A951MnuTxt, P01ET2_n951MnuTxt
            }
            , new Object[] {
            P01ET3_A945MnuId, P01ET3_A947MnuPgm, P01ET3_A946MnuOp
            }
            , new Object[] {
            }
            , new Object[] {
            P01ET5_A946MnuOp, P01ET5_A945MnuId, P01ET5_A947MnuPgm
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01ET8_A945MnuId, P01ET8_A951MnuTxt, P01ET8_n951MnuTxt
            }
            , new Object[] {
            P01ET9_A945MnuId, P01ET9_A946MnuOp, P01ET9_A947MnuPgm
            }
            , new Object[] {
            P01ET10_A945MnuId, P01ET10_A946MnuOp, P01ET10_A950MnuPri, P01ET10_A943GrpId
            }
            , new Object[] {
            P01ET11_A945MnuId, P01ET11_A951MnuTxt, P01ET11_n951MnuTxt
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A946MnuOp ;
   private byte A950MnuPri ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV16Count_rg ;
   private int AV14Mnuop_1 ;
   private int AV13Mnucab_1 ;
   private int AV15Opcgru_1 ;
   private String Gx_msg ;
   private String Gx_time ;
   private String scmdbuf ;
   private String A945MnuId ;
   private String A951MnuTxt ;
   private String A947MnuPgm ;
   private String AV17MnuId ;
   private String A943GrpId ;
   private boolean n951MnuTxt ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P01ET2_A945MnuId ;
   private String[] P01ET2_A951MnuTxt ;
   private boolean[] P01ET2_n951MnuTxt ;
   private String[] P01ET3_A945MnuId ;
   private String[] P01ET3_A947MnuPgm ;
   private byte[] P01ET3_A946MnuOp ;
   private byte[] P01ET5_A946MnuOp ;
   private String[] P01ET5_A945MnuId ;
   private String[] P01ET5_A947MnuPgm ;
   private String[] P01ET8_A945MnuId ;
   private String[] P01ET8_A951MnuTxt ;
   private boolean[] P01ET8_n951MnuTxt ;
   private String[] P01ET9_A945MnuId ;
   private byte[] P01ET9_A946MnuOp ;
   private String[] P01ET9_A947MnuPgm ;
   private String[] P01ET10_A945MnuId ;
   private byte[] P01ET10_A946MnuOp ;
   private byte[] P01ET10_A950MnuPri ;
   private String[] P01ET10_A943GrpId ;
   private String[] P01ET11_A945MnuId ;
   private String[] P01ET11_A951MnuTxt ;
   private boolean[] P01ET11_n951MnuTxt ;
}

final  class apctrmenu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ET2", "SELECT MnuId, MnuTxt FROM TXPMNUCAB ORDER BY MnuId  FOR UPDATE OF MnuTxt NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01ET3", "SELECT MnuId, MnuPgm, MnuOp FROM TXPMNUOP WHERE MnuId = ? ORDER BY MnuId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01ET4", "DELETE FROM TXPMNUCAB  WHERE MnuId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMNUCAB")
         ,new ForEachCursor("P01ET5", "SELECT MnuOp, MnuId, MnuPgm FROM TXPMNUOP ORDER BY MnuId, MnuOp  FOR UPDATE OF MnuPgm NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01ET6", "DELETE FROM TXPOPCGRU  WHERE MnuId = ? and MnuOp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOPCGRU")
         ,new UpdateCursor("P01ET7", "DELETE FROM TXPMNUOP  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMNUOP")
         ,new ForEachCursor("P01ET8", "SELECT MnuId, MnuTxt FROM TXPMNUCAB ORDER BY MnuId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01ET9", "SELECT * FROM (SELECT MnuId, MnuOp, MnuPgm FROM TXPMNUOP WHERE MnuId = ? ORDER BY MnuId) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01ET10", "SELECT * FROM (SELECT MnuId, MnuOp, MnuPri, GrpId FROM TXPOPCGRU WHERE MnuId = ? and MnuOp = ? ORDER BY MnuId, MnuOp) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01ET11", "SELECT MnuId, MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ORDER BY MnuId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

