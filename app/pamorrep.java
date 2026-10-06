package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pamorrep extends GXProcedure
{
   public pamorrep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pamorrep.class ), "" );
   }

   public pamorrep( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pamorrep.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pamorrep.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pamorrep.this.AV8PMCod = aP1[0];
      this.aP1 = aP1;
      pamorrep.this.AV9TMCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AR32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9TMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9525TMRepCod = P0AR32_A9525TMRepCod[0] ;
         A9527TMRepCnt = P0AR32_A9527TMRepCnt[0] ;
         A9499MRStkPre = P0AR32_A9499MRStkPre[0] ;
         n9499MRStkPre = P0AR32_n9499MRStkPre[0] ;
         A9430TMCod = P0AR32_A9430TMCod[0] ;
         A9499MRStkPre = P0AR32_A9499MRStkPre[0] ;
         n9499MRStkPre = P0AR32_n9499MRStkPre[0] ;
         /*
            INSERT RECORD ON TABLE TXPMOrRep

         */
         A9425OMCod = AV8PMCod ;
         A9446OMRepCod = A9525TMRepCod ;
         A9449OMRTpo = httpContext.getMessage( "R", "") ;
         A9450OMRRCnt = A9527TMRepCnt ;
         A9451OMRRPre = A9499MRStkPre ;
         A9452OMRCCnt = DecimalUtil.doubleToDec(0) ;
         A9453OMRCPre = DecimalUtil.doubleToDec(0) ;
         A14496OMRObs = " " ;
         /* Using cursor P0AR33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo, A9450OMRRCnt, A9451OMRRPre, A9452OMRCCnt, A9453OMRCPre, A14496OMRObs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P0AR34 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P0AR34_A396EmprCod[0] ;
               A9425OMCod = P0AR34_A9425OMCod[0] ;
               A9446OMRepCod = P0AR34_A9446OMRepCod[0] ;
               A9449OMRTpo = P0AR34_A9449OMRTpo[0] ;
               A9450OMRRCnt = P0AR34_A9450OMRRCnt[0] ;
               A9450OMRRCnt = A9450OMRRCnt.add(A9527TMRepCnt) ;
               /* Using cursor P0AR35 */
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
      this.aP0[0] = pamorrep.this.A396EmprCod;
      this.aP1[0] = pamorrep.this.AV8PMCod;
      this.aP2[0] = pamorrep.this.AV9TMCod;
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
      P0AR32_A396EmprCod = new String[] {""} ;
      P0AR32_A9525TMRepCod = new int[1] ;
      P0AR32_A9527TMRepCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AR32_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AR32_n9499MRStkPre = new boolean[] {false} ;
      P0AR32_A9430TMCod = new int[1] ;
      A9527TMRepCnt = DecimalUtil.ZERO ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9449OMRTpo = "" ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A14496OMRObs = "" ;
      Gx_emsg = "" ;
      P0AR34_A396EmprCod = new String[] {""} ;
      P0AR34_A9425OMCod = new int[1] ;
      P0AR34_A9446OMRepCod = new int[1] ;
      P0AR34_A9449OMRTpo = new String[] {""} ;
      P0AR34_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pamorrep__default(),
         new Object[] {
             new Object[] {
            P0AR32_A396EmprCod, P0AR32_A9525TMRepCod, P0AR32_A9527TMRepCnt, P0AR32_A9499MRStkPre, P0AR32_n9499MRStkPre, P0AR32_A9430TMCod
            }
            , new Object[] {
            }
            , new Object[] {
            P0AR34_A396EmprCod, P0AR34_A9425OMCod, P0AR34_A9446OMRepCod, P0AR34_A9449OMRTpo, P0AR34_A9450OMRRCnt
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
   private int AV9TMCod ;
   private int A9525TMRepCod ;
   private int A9430TMCod ;
   private int GX_INS1233 ;
   private int A9425OMCod ;
   private int A9446OMRepCod ;
   private java.math.BigDecimal A9527TMRepCnt ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9449OMRTpo ;
   private String A14496OMRObs ;
   private String Gx_emsg ;
   private boolean n9499MRStkPre ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AR32_A396EmprCod ;
   private int[] P0AR32_A9525TMRepCod ;
   private java.math.BigDecimal[] P0AR32_A9527TMRepCnt ;
   private java.math.BigDecimal[] P0AR32_A9499MRStkPre ;
   private boolean[] P0AR32_n9499MRStkPre ;
   private int[] P0AR32_A9430TMCod ;
   private String[] P0AR34_A396EmprCod ;
   private int[] P0AR34_A9425OMCod ;
   private int[] P0AR34_A9446OMRepCod ;
   private String[] P0AR34_A9449OMRTpo ;
   private java.math.BigDecimal[] P0AR34_A9450OMRRCnt ;
}

final  class pamorrep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AR32", "SELECT T1.EmprCod, T1.TMRepCod AS TMRepCod, T1.TMRepCnt, T2.MRStkPre, T1.TMCod FROM (TXPMTaRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.TMRepCod) WHERE T1.EmprCod = ? and T1.TMCod = ? ORDER BY T1.EmprCod, T1.TMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AR33", "INSERT INTO TXPMOrRep(EmprCod, OMCod, OMRepCod, OMRTpo, OMRRCnt, OMRRPre, OMRCCnt, OMRCPre, OMRObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new ForEachCursor("P0AR34", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo, OMRRCnt FROM TXPMOrRep WHERE EmprCod = ? and OMCod = ? and OMRepCod = ? and OMRTpo = ? ORDER BY EmprCod, OMCod, OMRepCod, OMRTpo ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AR35", "UPDATE TXPMOrRep SET OMRRCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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

