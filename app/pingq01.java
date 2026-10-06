package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pingq01 extends GXReport
{
   public pingq01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pingq01.class ), "" );
   }

   public pingq01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pingq01.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pingq01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pingq01.this.A12205OrdenCID = aP1[0];
      this.aP1 = aP1;
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
         getPrinter().GxSetDocName("Informe Orden de Compra") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GxHdr2 = true ;
         /* Using cursor P052A2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A12202OrdenCEst = P052A2_A12202OrdenCEst[0] ;
            n12202OrdenCEst = P052A2_n12202OrdenCEst[0] ;
            A794PrvNom = P052A2_A794PrvNom[0] ;
            n794PrvNom = P052A2_n794PrvNom[0] ;
            A795PrvNum = P052A2_A795PrvNum[0] ;
            n795PrvNum = P052A2_n795PrvNum[0] ;
            A12201OrdenCFc = P052A2_A12201OrdenCFc[0] ;
            n12201OrdenCFc = P052A2_n12201OrdenCFc[0] ;
            A794PrvNom = P052A2_A794PrvNom[0] ;
            n794PrvNom = P052A2_n794PrvNom[0] ;
            AV8OrdenCEst = ((A12202OrdenCEst==0) ? httpContext.getMessage( "Pendiente Ingreso Compra Almacen", "") : httpContext.getMessage( "Ingresada en Almacen", "")) ;
            /* Using cursor P052A3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A12204OrdenCPre = P052A3_A12204OrdenCPre[0] ;
               n12204OrdenCPre = P052A3_n12204OrdenCPre[0] ;
               A12203OrdenCCnt = P052A3_A12203OrdenCCnt[0] ;
               n12203OrdenCCnt = P052A3_n12203OrdenCCnt[0] ;
               A718PrdNom = P052A3_A718PrdNom[0] ;
               A719PrdNum = P052A3_A719PrdNum[0] ;
               n719PrdNum = P052A3_n719PrdNum[0] ;
               A12206OrdenCLnId = P052A3_A12206OrdenCLnId[0] ;
               A718PrdNom = P052A3_A718PrdNom[0] ;
               AV9OrdenCpre = A12204OrdenCPre ;
               h52A0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12206OrdenCLnId), "ZZZ9")), 73, Gx_line+0, 103, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 146, Gx_line+0, 191, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 197, Gx_line+0, 388, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12203OrdenCCnt, "ZZZZZ9.99")), 416, Gx_line+0, 483, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9OrdenCpre, "ZZZZZZZ9.99")), 510, Gx_line+0, 613, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h52A0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h52A0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Orden Compra Nº", ""), 117, Gx_line+17, 227, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12205OrdenCID), "ZZZZZZZZZ9")), 233, Gx_line+17, 307, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 117, Gx_line+50, 154, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A12201OrdenCFc, "99/99/99"), 241, Gx_line+50, 300, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 117, Gx_line+83, 184, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 241, Gx_line+83, 286, Gx_line+100, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 292, Gx_line+83, 512, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 117, Gx_line+67, 162, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8OrdenCEst, "")), 241, Gx_line+67, 461, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Item", ""), 73, Gx_line+117, 103, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 146, Gx_line+117, 205, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 423, Gx_line+117, 482, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 569, Gx_line+117, 614, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(73, Gx_line+135, 102, Gx_line+135, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(147, Gx_line+132, 388, Gx_line+132, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(416, Gx_line+135, 482, Gx_line+135, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(510, Gx_line+132, 612, Gx_line+132, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+140) ;
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
      this.aP0[0] = pingq01.this.A396EmprCod;
      this.aP1[0] = pingq01.this.A12205OrdenCID;
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
      P052A2_A396EmprCod = new String[] {""} ;
      P052A2_A12205OrdenCID = new long[1] ;
      P052A2_A12202OrdenCEst = new byte[1] ;
      P052A2_n12202OrdenCEst = new boolean[] {false} ;
      P052A2_A794PrvNom = new String[] {""} ;
      P052A2_n794PrvNom = new boolean[] {false} ;
      P052A2_A795PrvNum = new int[1] ;
      P052A2_n795PrvNum = new boolean[] {false} ;
      P052A2_A12201OrdenCFc = new java.util.Date[] {GXutil.nullDate()} ;
      P052A2_n12201OrdenCFc = new boolean[] {false} ;
      A794PrvNom = "" ;
      A12201OrdenCFc = GXutil.nullDate() ;
      AV8OrdenCEst = "" ;
      P052A3_A396EmprCod = new String[] {""} ;
      P052A3_A12205OrdenCID = new long[1] ;
      P052A3_A12204OrdenCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052A3_n12204OrdenCPre = new boolean[] {false} ;
      P052A3_A12203OrdenCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052A3_n12203OrdenCCnt = new boolean[] {false} ;
      P052A3_A718PrdNom = new String[] {""} ;
      P052A3_A719PrdNum = new String[] {""} ;
      P052A3_n719PrdNum = new boolean[] {false} ;
      P052A3_A12206OrdenCLnId = new short[1] ;
      A12204OrdenCPre = DecimalUtil.ZERO ;
      A12203OrdenCCnt = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV9OrdenCpre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pingq01__default(),
         new Object[] {
             new Object[] {
            P052A2_A396EmprCod, P052A2_A12205OrdenCID, P052A2_A12202OrdenCEst, P052A2_n12202OrdenCEst, P052A2_A794PrvNom, P052A2_n794PrvNom, P052A2_A795PrvNum, P052A2_n795PrvNum, P052A2_A12201OrdenCFc, P052A2_n12201OrdenCFc
            }
            , new Object[] {
            P052A3_A396EmprCod, P052A3_A12205OrdenCID, P052A3_A12204OrdenCPre, P052A3_n12204OrdenCPre, P052A3_A12203OrdenCCnt, P052A3_n12203OrdenCCnt, P052A3_A718PrdNom, P052A3_A719PrdNum, P052A3_n719PrdNum, P052A3_A12206OrdenCLnId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A12202OrdenCEst ;
   private short A12206OrdenCLnId ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int Gx_OldLine ;
   private long A12205OrdenCID ;
   private java.math.BigDecimal A12204OrdenCPre ;
   private java.math.BigDecimal A12203OrdenCCnt ;
   private java.math.BigDecimal AV9OrdenCpre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A794PrvNom ;
   private String AV8OrdenCEst ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private java.util.Date A12201OrdenCFc ;
   private boolean GxHdr2 ;
   private boolean n12202OrdenCEst ;
   private boolean n794PrvNom ;
   private boolean n795PrvNum ;
   private boolean n12201OrdenCFc ;
   private boolean n12204OrdenCPre ;
   private boolean n12203OrdenCCnt ;
   private boolean n719PrdNum ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P052A2_A396EmprCod ;
   private long[] P052A2_A12205OrdenCID ;
   private byte[] P052A2_A12202OrdenCEst ;
   private boolean[] P052A2_n12202OrdenCEst ;
   private String[] P052A2_A794PrvNom ;
   private boolean[] P052A2_n794PrvNom ;
   private int[] P052A2_A795PrvNum ;
   private boolean[] P052A2_n795PrvNum ;
   private java.util.Date[] P052A2_A12201OrdenCFc ;
   private boolean[] P052A2_n12201OrdenCFc ;
   private String[] P052A3_A396EmprCod ;
   private long[] P052A3_A12205OrdenCID ;
   private java.math.BigDecimal[] P052A3_A12204OrdenCPre ;
   private boolean[] P052A3_n12204OrdenCPre ;
   private java.math.BigDecimal[] P052A3_A12203OrdenCCnt ;
   private boolean[] P052A3_n12203OrdenCCnt ;
   private String[] P052A3_A718PrdNom ;
   private String[] P052A3_A719PrdNum ;
   private boolean[] P052A3_n719PrdNum ;
   private short[] P052A3_A12206OrdenCLnId ;
}

final  class pingq01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P052A2", "SELECT T1.EmprCod, T1.OrdenCID, T1.OrdenCEst, T2.PrvNom, T1.PrvNum, T1.OrdenCFc FROM (TXPIngQui T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.OrdenCID = ? ORDER BY T1.EmprCod, T1.OrdenCID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P052A3", "SELECT T1.EmprCod, T1.OrdenCID, T1.OrdenCPre, T1.OrdenCCnt, T2.PrdNom, T1.PrdNum, T1.OrdenCLnId FROM (TXPIngQu1 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.OrdenCID = ? ORDER BY T1.EmprCod, T1.OrdenCID, T1.OrdenCLnId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

