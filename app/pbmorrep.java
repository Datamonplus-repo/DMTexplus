package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbmorrep extends GXProcedure
{
   public pbmorrep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbmorrep.class ), "" );
   }

   public pbmorrep( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      pbmorrep.this.A396EmprCod = aP0;
      pbmorrep.this.AV8PMCod = aP1;
      pbmorrep.this.AV10Maqcod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AR42 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10Maqcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9492MRCod = P0AR42_A9492MRCod[0] ;
         A11442MaqRepCnt = P0AR42_A11442MaqRepCnt[0] ;
         A9499MRStkPre = P0AR42_A9499MRStkPre[0] ;
         n9499MRStkPre = P0AR42_n9499MRStkPre[0] ;
         A11440MaqPieCod = P0AR42_A11440MaqPieCod[0] ;
         A11439MaqSEqCod = P0AR42_A11439MaqSEqCod[0] ;
         A11438MaqEquCod = P0AR42_A11438MaqEquCod[0] ;
         A602MaqCod = P0AR42_A602MaqCod[0] ;
         A9499MRStkPre = P0AR42_A9499MRStkPre[0] ;
         n9499MRStkPre = P0AR42_n9499MRStkPre[0] ;
         /*
            INSERT RECORD ON TABLE TXPMOrRep

         */
         A9425OMCod = AV8PMCod ;
         A9446OMRepCod = A9492MRCod ;
         A9449OMRTpo = httpContext.getMessage( "R", "") ;
         A9450OMRRCnt = A11442MaqRepCnt ;
         A9451OMRRPre = A9499MRStkPre ;
         A9452OMRCCnt = DecimalUtil.doubleToDec(0) ;
         A9453OMRCPre = DecimalUtil.doubleToDec(0) ;
         A14496OMRObs = " " ;
         /* Using cursor P0AR43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo, A9450OMRRCnt, A9451OMRRPre, A9452OMRCCnt, A9453OMRCPre, A14496OMRObs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P0AR44 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P0AR44_A396EmprCod[0] ;
               A9425OMCod = P0AR44_A9425OMCod[0] ;
               A9446OMRepCod = P0AR44_A9446OMRepCod[0] ;
               A9449OMRTpo = P0AR44_A9449OMRTpo[0] ;
               A9450OMRRCnt = P0AR44_A9450OMRRCnt[0] ;
               A9450OMRRCnt = A9450OMRRCnt.add(A11442MaqRepCnt) ;
               /* Using cursor P0AR45 */
               pr_default.execute(3, new Object[] {A9450OMRRCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
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
      P0AR42_A396EmprCod = new String[] {""} ;
      P0AR42_A9492MRCod = new int[1] ;
      P0AR42_A11442MaqRepCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AR42_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AR42_n9499MRStkPre = new boolean[] {false} ;
      P0AR42_A11440MaqPieCod = new String[] {""} ;
      P0AR42_A11439MaqSEqCod = new String[] {""} ;
      P0AR42_A11438MaqEquCod = new String[] {""} ;
      P0AR42_A602MaqCod = new String[] {""} ;
      A11442MaqRepCnt = DecimalUtil.ZERO ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A11440MaqPieCod = "" ;
      A11439MaqSEqCod = "" ;
      A11438MaqEquCod = "" ;
      A602MaqCod = "" ;
      A9449OMRTpo = "" ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A14496OMRObs = "" ;
      Gx_emsg = "" ;
      P0AR44_A396EmprCod = new String[] {""} ;
      P0AR44_A9425OMCod = new int[1] ;
      P0AR44_A9446OMRepCod = new int[1] ;
      P0AR44_A9449OMRTpo = new String[] {""} ;
      P0AR44_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbmorrep__default(),
         new Object[] {
             new Object[] {
            P0AR42_A396EmprCod, P0AR42_A9492MRCod, P0AR42_A11442MaqRepCnt, P0AR42_A9499MRStkPre, P0AR42_n9499MRStkPre, P0AR42_A11440MaqPieCod, P0AR42_A11439MaqSEqCod, P0AR42_A11438MaqEquCod, P0AR42_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P0AR44_A396EmprCod, P0AR44_A9425OMCod, P0AR44_A9446OMRepCod, P0AR44_A9449OMRTpo, P0AR44_A9450OMRRCnt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8PMCod ;
   private int A9492MRCod ;
   private int GX_INS1233 ;
   private int A9425OMCod ;
   private int A9446OMRepCod ;
   private java.math.BigDecimal A11442MaqRepCnt ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private String A396EmprCod ;
   private String AV10Maqcod ;
   private String scmdbuf ;
   private String A11440MaqPieCod ;
   private String A11439MaqSEqCod ;
   private String A11438MaqEquCod ;
   private String A602MaqCod ;
   private String A9449OMRTpo ;
   private String A14496OMRObs ;
   private String Gx_emsg ;
   private boolean n9499MRStkPre ;
   private IDataStoreProvider pr_default ;
   private String[] P0AR42_A396EmprCod ;
   private int[] P0AR42_A9492MRCod ;
   private java.math.BigDecimal[] P0AR42_A11442MaqRepCnt ;
   private java.math.BigDecimal[] P0AR42_A9499MRStkPre ;
   private boolean[] P0AR42_n9499MRStkPre ;
   private String[] P0AR42_A11440MaqPieCod ;
   private String[] P0AR42_A11439MaqSEqCod ;
   private String[] P0AR42_A11438MaqEquCod ;
   private String[] P0AR42_A602MaqCod ;
   private String[] P0AR44_A396EmprCod ;
   private int[] P0AR44_A9425OMCod ;
   private int[] P0AR44_A9446OMRepCod ;
   private String[] P0AR44_A9449OMRTpo ;
   private java.math.BigDecimal[] P0AR44_A9450OMRRCnt ;
}

final  class pbmorrep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AR42", "SELECT T1.EmprCod, T1.MRCod, T1.MaqRepCnt, T2.MRStkPre, T1.MaqPieCod, T1.MaqSEqCod, T1.MaqEquCod, T1.MaqCod FROM (TXPMaqRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) WHERE T1.EmprCod = ? and T1.MaqCod = ? and T1.MaqEquCod = ' ' and T1.MaqSEqCod = ' ' and T1.MaqPieCod = ' ' ORDER BY T1.EmprCod, T1.MaqCod, T1.MaqEquCod, T1.MaqSEqCod, T1.MaqPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AR43", "INSERT INTO TXPMOrRep(EmprCod, OMCod, OMRepCod, OMRTpo, OMRRCnt, OMRRPre, OMRCCnt, OMRCPre, OMRObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new ForEachCursor("P0AR44", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo, OMRRCnt FROM TXPMOrRep WHERE EmprCod = ? and OMCod = ? and OMRepCod = ? and OMRTpo = ? ORDER BY EmprCod, OMCod, OMRepCod, OMRTpo ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AR45", "UPDATE TXPMOrRep SET OMRRCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 3);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               stmt.setString(9, (String)parms[8], 60);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

