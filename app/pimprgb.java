package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pimprgb extends GXReport
{
   public pimprgb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pimprgb.class ), "" );
   }

   public pimprgb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pimprgb.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pimprgb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pimprgb.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pimprgb.this.A4415EstCol = aP2[0];
      this.aP2 = aP2;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Imp RGB") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P05LE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A12712EstColRGB = P05LE2_A12712EstColRGB[0] ;
            n12712EstColRGB = P05LE2_n12712EstColRGB[0] ;
            GXv_int1[0] = A12712EstColRGB ;
            GXv_int2[0] = AV14R ;
            GXv_int3[0] = AV15G ;
            GXv_int4[0] = AV16B ;
            new app.pleorgb(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_int3, GXv_int4) ;
            pimprgb.this.A12712EstColRGB = GXv_int1[0] ;
            pimprgb.this.AV14R = GXv_int2[0] ;
            pimprgb.this.AV15G = GXv_int3[0] ;
            pimprgb.this.AV16B = GXv_int4[0] ;
            h5LE0( false, 1) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            h5LE0( false, 81) ;
            getPrinter().GxDrawRect(14, Gx_line+13, 679, Gx_line+82, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 27, Gx_line+27, 72, Gx_line+44, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4415EstCol, "")), 81, Gx_line+27, 228, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12712EstColRGB), "ZZZZZZZZZ9")), 257, Gx_line+27, 331, Gx_line+44, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+81) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5LE0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h5LE0( boolean bFoot ,
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

   protected void cleanup( )
   {
      this.aP0[0] = pimprgb.this.A396EmprCod;
      this.aP1[0] = pimprgb.this.A252CliCod;
      this.aP2[0] = pimprgb.this.A4415EstCol;
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
      P05LE2_A396EmprCod = new String[] {""} ;
      P05LE2_A252CliCod = new int[1] ;
      P05LE2_A4415EstCol = new String[] {""} ;
      P05LE2_A12712EstColRGB = new long[1] ;
      P05LE2_n12712EstColRGB = new boolean[] {false} ;
      GXv_int1 = new long[1] ;
      GXv_int2 = new short[1] ;
      GXv_int3 = new short[1] ;
      GXv_int4 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pimprgb__default(),
         new Object[] {
             new Object[] {
            P05LE2_A396EmprCod, P05LE2_A252CliCod, P05LE2_A4415EstCol, P05LE2_A12712EstColRGB, P05LE2_n12712EstColRGB
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short AV14R ;
   private short GXv_int2[] ;
   private short AV15G ;
   private short GXv_int3[] ;
   private short AV16B ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private long A12712EstColRGB ;
   private long GXv_int1[] ;
   private String A396EmprCod ;
   private String A4415EstCol ;
   private String scmdbuf ;
   private boolean n12712EstColRGB ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LE2_A396EmprCod ;
   private int[] P05LE2_A252CliCod ;
   private String[] P05LE2_A4415EstCol ;
   private long[] P05LE2_A12712EstColRGB ;
   private boolean[] P05LE2_n12712EstColRGB ;
}

final  class pimprgb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LE2", "SELECT EmprCod, CliCod, EstCol, EstColRGB FROM TXPCEstCo WHERE EmprCod = ? and CliCod = ? and EstCol = ? ORDER BY EmprCod, CliCod, EstCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 20);
               return;
      }
   }

}

