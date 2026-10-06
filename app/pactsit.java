package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pactsit extends GXReportText
{
   public pactsit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactsit.class ), "" );
   }

   public pactsit( int remoteHandle ,
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
      Gx_line = (int)(P_lines+1) ;
      Gx_out = "FIL" ;
      if ( GXutil.strcmp(Gx_out, "PRN") == 0 )
      {
         setOutput( "pactsit.prn" );
      }
      else
      {
         if ( GXutil.strcmp(Gx_out, "SCR") == 0 )
         {
            setOutput(System.out);
         }
         else
         {
            if ( GXutil.strcmp(Gx_out, "FIL") == 0 )
            {
               setOutput( "pactsit.prn" );
            }
         }
      }
      httpContext.GX_msglist.addItem(httpContext.getMessage( "INICIO. Proceso reactualizacion Situacion de 5 a 9", ""));
      AV15Flag = (byte)(0) ;
      hK30( false, 0) ;
      out.print( " " + "HOJAS DE RUTA actualizadas de Situacion 5 a 9" );
      ToSkip = 1 ;
      hK30( false, 0) ;
      out.print( " " + "---------------------------------------------" );
      ToSkip = 2 ;
      hK30( false, 0) ;
      out.print( " " + "Hoja de Ruta     Cliente  Serie" );
      ToSkip = 1 ;
      hK30( false, 0) ;
      out.print( " " + "---------------- -------  ----------------" );
      ToSkip = 1 ;
      /* Using cursor P00K32 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00K32_A130BarCodPar[0] ;
         A132BarCodReo = P00K32_A132BarCodReo[0] ;
         A129BarCod = P00K32_A129BarCod[0] ;
         A396EmprCod = P00K32_A396EmprCod[0] ;
         A213BarSit = P00K32_A213BarSit[0] ;
         A212BarSer = P00K32_A212BarSer[0] ;
         A252CliCod = P00K32_A252CliCod[0] ;
         n252CliCod = P00K32_n252CliCod[0] ;
         AV15Flag = (byte)(0) ;
         if ( A213BarSit == 5 )
         {
            /* Using cursor P00K33 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1540BarComMLan = P00K33_A1540BarComMLan[0] ;
               n1540BarComMLan = P00K33_n1540BarComMLan[0] ;
               A1542BarComPEst = P00K33_A1542BarComPEst[0] ;
               n1542BarComPEst = P00K33_n1542BarComPEst[0] ;
               A1032FonCod = P00K33_A1032FonCod[0] ;
               A1056DisComCod = P00K33_A1056DisComCod[0] ;
               A2524DisComLin = P00K33_A2524DisComLin[0] ;
               if ( (0==A1542BarComPEst) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1540BarComMLan)==0) )
               {
                  AV15Flag = (byte)(1) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( (0==AV15Flag) )
            {
               A213BarSit = (byte)(9) ;
               hK30( false, 0) ;
               out.print( " " + localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") + " " + localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") + "   " + localUtil.format( A130BarCodPar, "") + "   " + localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") + "   " + localUtil.format( A212BarSer, "") );
               ToSkip = 1 ;
               hK30( false, 0) ;
               out.print( "" + " " );
               ToSkip = 1 ;
            }
         }
         /* Using cursor P00K34 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      hK30( false, 0) ;
      out.print( "" + " " );
      ToSkip = 1 ;
      hK30( false, 0) ;
      out.print( "   " + "FIN DEL PROCESO" );
      ToSkip = 1 ;
      httpContext.GX_msglist.addItem(httpContext.getMessage( "FIN. Proceso reactualizacion Situacion de 5 a 9", ""));
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      hK30( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void hK30( boolean bFoot ,
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
               out.print("\f");
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top)) ;
            /* Print headers */
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            out.print( "\n" );
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pactsit");
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
      P00K32_A130BarCodPar = new String[] {""} ;
      P00K32_A132BarCodReo = new byte[1] ;
      P00K32_A129BarCod = new int[1] ;
      P00K32_A396EmprCod = new String[] {""} ;
      P00K32_A213BarSit = new byte[1] ;
      P00K32_A212BarSer = new String[] {""} ;
      P00K32_A252CliCod = new int[1] ;
      P00K32_n252CliCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      P00K33_A396EmprCod = new String[] {""} ;
      P00K33_A129BarCod = new int[1] ;
      P00K33_A132BarCodReo = new byte[1] ;
      P00K33_A130BarCodPar = new String[] {""} ;
      P00K33_A1540BarComMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00K33_n1540BarComMLan = new boolean[] {false} ;
      P00K33_A1542BarComPEst = new byte[1] ;
      P00K33_n1542BarComPEst = new boolean[] {false} ;
      P00K33_A1032FonCod = new String[] {""} ;
      P00K33_A1056DisComCod = new String[] {""} ;
      P00K33_A2524DisComLin = new byte[1] ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactsit__default(),
         new Object[] {
             new Object[] {
            P00K32_A130BarCodPar, P00K32_A132BarCodReo, P00K32_A129BarCod, P00K32_A396EmprCod, P00K32_A213BarSit, P00K32_A212BarSer, P00K32_A252CliCod, P00K32_n252CliCod
            }
            , new Object[] {
            P00K33_A396EmprCod, P00K33_A129BarCod, P00K33_A132BarCodReo, P00K33_A130BarCodPar, P00K33_A1540BarComMLan, P00K33_n1540BarComMLan, P00K33_A1542BarComPEst, P00K33_n1542BarComPEst, P00K33_A1032FonCod, P00K33_A1056DisComCod,
            P00K33_A2524DisComLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A1542BarComPEst ;
   private byte A2524DisComLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int Gx_page ;
   private java.math.BigDecimal A1540BarComMLan ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private boolean n252CliCod ;
   private boolean n1540BarComMLan ;
   private boolean n1542BarComPEst ;
   private IDataStoreProvider pr_default ;
   private String[] P00K32_A130BarCodPar ;
   private byte[] P00K32_A132BarCodReo ;
   private int[] P00K32_A129BarCod ;
   private String[] P00K32_A396EmprCod ;
   private byte[] P00K32_A213BarSit ;
   private String[] P00K32_A212BarSer ;
   private int[] P00K32_A252CliCod ;
   private boolean[] P00K32_n252CliCod ;
   private String[] P00K33_A396EmprCod ;
   private int[] P00K33_A129BarCod ;
   private byte[] P00K33_A132BarCodReo ;
   private String[] P00K33_A130BarCodPar ;
   private java.math.BigDecimal[] P00K33_A1540BarComMLan ;
   private boolean[] P00K33_n1540BarComMLan ;
   private byte[] P00K33_A1542BarComPEst ;
   private boolean[] P00K33_n1542BarComPEst ;
   private String[] P00K33_A1032FonCod ;
   private String[] P00K33_A1056DisComCod ;
   private byte[] P00K33_A2524DisComLin ;
}

final  class pactsit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00K32", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit, BarSer, CliCod FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00K33", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarComMLan, BarComPEst, FonCod, DisComCod, DisComLin FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00K34", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 12);
               ((String[]) buf[9])[0] = rslt.getString(8, 12);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
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
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

