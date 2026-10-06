package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln501 extends GXReportText
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln501 pgm = new apjln501 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln501( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln501.class ), "" );
   }

   public apjln501( int remoteHandle ,
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
         setOutput( "apjln501.prn" );
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
               setOutput( "apjln501.prn" );
            }
         }
      }
      h34F0( false, 0) ;
      out.print( "         " + "HDR" + "                  " + "Maquina Calculada" + "          " + "Maquina Actual" );
      ToSkip = 1 ;
      h34F0( false, 0) ;
      out.print( "" + " " );
      ToSkip = 1 ;
      /* Using cursor P034F2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P034F2_A213BarSit[0] ;
         A396EmprCod = P034F2_A396EmprCod[0] ;
         A129BarCod = P034F2_A129BarCod[0] ;
         A132BarCodReo = P034F2_A132BarCodReo[0] ;
         A130BarCodPar = P034F2_A130BarCodPar[0] ;
         A120BarAgrEst = P034F2_A120BarAgrEst[0] ;
         A180BarMaqCod = P034F2_A180BarMaqCod[0] ;
         AV8Barcod = A129BarCod ;
         AV9Barcodreo = A132BarCodReo ;
         AV10Barcodpar = A130BarCodPar ;
         AV11Emprcod = A396EmprCod ;
         AV14Barcodi = A129BarCod ;
         AV15Barcodreoi = A132BarCodReo ;
         AV16Barcodpari = A130BarCodPar ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV8Barcod, AV9Barcodreo, AV10Barcodpar) ;
         }
         /* Execute user subroutine: 'RECMAQ' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV13Linei > 1 ) && ( GXutil.strcmp(AV12Maqcod, A180BarMaqCod) != 0 ) )
         {
            h34F0( false, 0) ;
            out.print( "    " + localUtil.format( DecimalUtil.doubleToDec(AV14Barcodi), "ZZZZZZZ9") + " " + localUtil.format( DecimalUtil.doubleToDec(AV15Barcodreoi), "9") + " " + localUtil.format( AV16Barcodpari, "") + "  " + localUtil.format( A120BarAgrEst, "@!") + "                 " + localUtil.format( AV12Maqcod, "") + " " + localUtil.format( DecimalUtil.doubleToDec(AV13Linei), "ZZZZZ9") + "            " + localUtil.format( A180BarMaqCod, "") );
            ToSkip = 1 ;
            A180BarMaqCod = AV12Maqcod ;
         }
         /* Using cursor P034F3 */
         pr_default.execute(1, new Object[] {A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      h34F0( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      GXv_char1[0] = AV11Emprcod ;
      GXv_int2[0] = AV8Barcod ;
      GXv_int3[0] = AV9Barcodreo ;
      GXv_char4[0] = AV10Barcodpar ;
      GXv_char5[0] = AV12Maqcod ;
      GXv_int6[0] = AV13Linei ;
      new app.pjln502(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_int6) ;
      apjln501.this.AV11Emprcod = GXv_char1[0] ;
      apjln501.this.AV8Barcod = GXv_int2[0] ;
      apjln501.this.AV9Barcodreo = GXv_int3[0] ;
      apjln501.this.AV10Barcodpar = GXv_char4[0] ;
      apjln501.this.AV12Maqcod = GXv_char5[0] ;
      apjln501.this.AV13Linei = GXv_int6[0] ;
   }

   public void h34F0( boolean bFoot ,
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

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln501.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln501");
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
      P034F2_A213BarSit = new byte[1] ;
      P034F2_A396EmprCod = new String[] {""} ;
      P034F2_A129BarCod = new int[1] ;
      P034F2_A132BarCodReo = new byte[1] ;
      P034F2_A130BarCodPar = new String[] {""} ;
      P034F2_A120BarAgrEst = new String[] {""} ;
      P034F2_A180BarMaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A180BarMaqCod = "" ;
      AV10Barcodpar = "" ;
      AV11Emprcod = "" ;
      AV16Barcodpari = "" ;
      AV12Maqcod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln501__default(),
         new Object[] {
             new Object[] {
            P034F2_A213BarSit, P034F2_A396EmprCod, P034F2_A129BarCod, P034F2_A132BarCodReo, P034F2_A130BarCodPar, P034F2_A120BarAgrEst, P034F2_A180BarMaqCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV9Barcodreo ;
   private byte AV15Barcodreoi ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int A129BarCod ;
   private int AV8Barcod ;
   private int AV14Barcodi ;
   private int AV13Linei ;
   private int GXv_int2[] ;
   private int GXv_int6[] ;
   private int Gx_page ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A180BarMaqCod ;
   private String AV10Barcodpar ;
   private String AV11Emprcod ;
   private String AV16Barcodpari ;
   private String AV12Maqcod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private byte[] P034F2_A213BarSit ;
   private String[] P034F2_A396EmprCod ;
   private int[] P034F2_A129BarCod ;
   private byte[] P034F2_A132BarCodReo ;
   private String[] P034F2_A130BarCodPar ;
   private String[] P034F2_A120BarAgrEst ;
   private String[] P034F2_A180BarMaqCod ;
}

final  class apjln501__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P034F2", "SELECT BarSit, EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod FROM TXPBARCAD WHERE (EmprCod = '001') AND (BarSit <= 5) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P034F3", "UPDATE TXPBARCAD SET BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

