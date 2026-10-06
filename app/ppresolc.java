package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ppresolc extends GXReport
{
   public ppresolc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppresolc.class ), "" );
   }

   public ppresolc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ppresolc.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppresolc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppresolc.this.A6290PreCoNum = aP1[0];
      this.aP1 = aP1;
      ppresolc.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      ppresolc.this.AV9Usurcod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 11 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("SOLICITUD INTERNA PRODUCTOS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*11)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV8ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRESOL", ""), GXv_char1) ;
         ppresolc.this.AV8ContDsc = GXv_char1[0] ;
         GxHdr2 = true ;
         /* Using cursor P02EE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6290PreCoNum)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A6294PreCoObs = P02EE2_A6294PreCoObs[0] ;
            n6294PreCoObs = P02EE2_n6294PreCoObs[0] ;
            A6295PreCoStC = P02EE2_A6295PreCoStC[0] ;
            n6295PreCoStC = P02EE2_n6295PreCoStC[0] ;
            A6293PreCoFch = P02EE2_A6293PreCoFch[0] ;
            n6293PreCoFch = P02EE2_n6293PreCoFch[0] ;
            A6291PreCoPrv = P02EE2_A6291PreCoPrv[0] ;
            n6291PreCoPrv = P02EE2_n6291PreCoPrv[0] ;
            GXt_char2 = A6292PrePrvNom ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int3[0] = A6291PreCoPrv ;
            GXv_char4[0] = GXt_char2 ;
            new app.pprvnom(remoteHandle, context).execute( GXv_char1, GXv_int3, GXv_char4) ;
            ppresolc.this.A396EmprCod = GXv_char1[0] ;
            ppresolc.this.A6291PreCoPrv = GXv_int3[0] ;
            ppresolc.this.GXt_char2 = GXv_char4[0] ;
            A6292PrePrvNom = GXt_char2 ;
            AV10PrePrvNom = A6292PrePrvNom ;
            AV11PreCoObs = A6294PreCoObs ;
            /* Using cursor P02EE3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6290PreCoNum)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A718PrdNom = P02EE3_A718PrdNom[0] ;
               A6296PreCoUni = P02EE3_A6296PreCoUni[0] ;
               n6296PreCoUni = P02EE3_n6296PreCoUni[0] ;
               A719PrdNum = P02EE3_A719PrdNum[0] ;
               A718PrdNom = P02EE3_A718PrdNom[0] ;
               h2EE0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6296PreCoUni, "ZZZZZZ9.9999")), 27, Gx_line+0, 116, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 149, Gx_line+0, 194, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 203, Gx_line+0, 394, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( A6295PreCoStC == 0 )
            {
               A6295PreCoStC = (byte)(1) ;
               n6295PreCoStC = false ;
            }
            /* Using cursor P02EE4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n6295PreCoStC), Byte.valueOf(A6295PreCoStC), A396EmprCod, Integer.valueOf(A6290PreCoNum)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRESOL");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2EE0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h2EE0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processado por Computador", ""), 46, Gx_line+0, 191, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8ContDsc, "")), 46, Gx_line+128, 192, Gx_line+143, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Usurcod, "@!")), 491, Gx_line+127, 575, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(AV11PreCoObs, 46, Gx_line+25, 574, Gx_line+125, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+156) ;
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
               getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Carvema", ""), 14, Gx_line+14, 156, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "- TÊXTIL - Tinturaria e Acabamentos", ""), 163, Gx_line+26, 403, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 460, Gx_line+27, 476, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6290PreCoNum), "ZZZZZZZ9")), 488, Gx_line+27, 556, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REQUISIÇAO INTERNA", ""), 163, Gx_line+68, 334, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data,", ""), 442, Gx_line+68, 475, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A6293PreCoFch, "99/99/99"), 488, Gx_line+68, 556, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Requisila-se a", ""), 27, Gx_line+149, 133, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6292PrePrvNom, "")), 149, Gx_line+149, 400, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "seguiente:", ""), 406, Gx_line+149, 482, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 46, Gx_line+190, 115, Gx_line+204, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 149, Gx_line+190, 196, Gx_line+204, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(27, Gx_line+203, 115, Gx_line+203, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(148, Gx_line+203, 393, Gx_line+203, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+209) ;
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
      this.aP0[0] = ppresolc.this.A396EmprCod;
      this.aP1[0] = ppresolc.this.A6290PreCoNum;
      this.aP2[0] = ppresolc.this.Gx_out;
      this.aP3[0] = ppresolc.this.AV9Usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppresolc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ContDsc = "" ;
      scmdbuf = "" ;
      P02EE2_A6294PreCoObs = new String[] {""} ;
      P02EE2_n6294PreCoObs = new boolean[] {false} ;
      P02EE2_A6290PreCoNum = new int[1] ;
      P02EE2_A6295PreCoStC = new byte[1] ;
      P02EE2_n6295PreCoStC = new boolean[] {false} ;
      P02EE2_A6293PreCoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P02EE2_n6293PreCoFch = new boolean[] {false} ;
      P02EE2_A396EmprCod = new String[] {""} ;
      P02EE2_A6291PreCoPrv = new int[1] ;
      P02EE2_n6291PreCoPrv = new boolean[] {false} ;
      A6294PreCoObs = "" ;
      A6293PreCoFch = GXutil.nullDate() ;
      A6292PrePrvNom = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      AV10PrePrvNom = "" ;
      AV11PreCoObs = "" ;
      P02EE3_A396EmprCod = new String[] {""} ;
      P02EE3_A6290PreCoNum = new int[1] ;
      P02EE3_A718PrdNom = new String[] {""} ;
      P02EE3_A6296PreCoUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EE3_n6296PreCoUni = new boolean[] {false} ;
      P02EE3_A719PrdNum = new String[] {""} ;
      A718PrdNom = "" ;
      A6296PreCoUni = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppresolc__default(),
         new Object[] {
             new Object[] {
            P02EE2_A6294PreCoObs, P02EE2_n6294PreCoObs, P02EE2_A6290PreCoNum, P02EE2_A6295PreCoStC, P02EE2_n6295PreCoStC, P02EE2_A6293PreCoFch, P02EE2_n6293PreCoFch, P02EE2_A396EmprCod, P02EE2_A6291PreCoPrv, P02EE2_n6291PreCoPrv
            }
            , new Object[] {
            P02EE3_A396EmprCod, P02EE3_A6290PreCoNum, P02EE3_A718PrdNom, P02EE3_A6296PreCoUni, P02EE3_n6296PreCoUni, P02EE3_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A6295PreCoStC ;
   private short Gx_err ;
   private int A6290PreCoNum ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A6291PreCoPrv ;
   private int GXv_int3[] ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A6296PreCoUni ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String AV9Usurcod ;
   private String AV8ContDsc ;
   private String scmdbuf ;
   private String A6292PrePrvNom ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV10PrePrvNom ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private java.util.Date A6293PreCoFch ;
   private boolean GxHdr2 ;
   private boolean n6294PreCoObs ;
   private boolean n6295PreCoStC ;
   private boolean n6293PreCoFch ;
   private boolean n6291PreCoPrv ;
   private boolean n6296PreCoUni ;
   private String A6294PreCoObs ;
   private String AV11PreCoObs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02EE2_A6294PreCoObs ;
   private boolean[] P02EE2_n6294PreCoObs ;
   private int[] P02EE2_A6290PreCoNum ;
   private byte[] P02EE2_A6295PreCoStC ;
   private boolean[] P02EE2_n6295PreCoStC ;
   private java.util.Date[] P02EE2_A6293PreCoFch ;
   private boolean[] P02EE2_n6293PreCoFch ;
   private String[] P02EE2_A396EmprCod ;
   private int[] P02EE2_A6291PreCoPrv ;
   private boolean[] P02EE2_n6291PreCoPrv ;
   private String[] P02EE3_A396EmprCod ;
   private int[] P02EE3_A6290PreCoNum ;
   private String[] P02EE3_A718PrdNom ;
   private java.math.BigDecimal[] P02EE3_A6296PreCoUni ;
   private boolean[] P02EE3_n6296PreCoUni ;
   private String[] P02EE3_A719PrdNum ;
}

final  class ppresolc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02EE2", "SELECT PreCoObs, PreCoNum, PreCoStC, PreCoFch, EmprCod, PreCoPrv FROM TXPPRESOL WHERE EmprCod = ? and PreCoNum = ? ORDER BY EmprCod, PreCoNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02EE3", "SELECT T1.EmprCod, T1.PreCoNum, T2.PrdNom, T1.PreCoUni, T1.PrdNum FROM (TXPPRESO1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PreCoNum = ? ORDER BY T1.EmprCod, T1.PreCoNum, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02EE4", "UPDATE TXPPRESOL SET PreCoStC=?  WHERE EmprCod = ? AND PreCoNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRESOL")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

