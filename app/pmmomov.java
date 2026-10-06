package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmmomov extends GXProcedure
{
   public pmmomov( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmmomov.class ), "" );
   }

   public pmmomov( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           java.math.BigDecimal[] aP3 )
   {
      pmmomov.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pmmomov.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmmomov.this.A9425OMCod = aP1[0];
      this.aP1 = aP1;
      pmmomov.this.A9455OMOpeCod = aP2[0];
      this.aP2 = aP2;
      pmmomov.this.AV8oOMMCCnt = aP3[0];
      this.aP3 = aP3;
      pmmomov.this.AV9nOMMCCnt = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl2 = (byte)(0) ;
      /* Using cursor P03MG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9458OMMTpo = P03MG2_A9458OMMTpo[0] ;
         A9461OMMCCnt = P03MG2_A9461OMMCCnt[0] ;
         if ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "C", "")) == 0 )
         {
            AV13GXLvl2 = (byte)(1) ;
            A9461OMMCCnt = A9461OMMCCnt.add((AV9nOMMCCnt.subtract(AV8oOMMCCnt))) ;
            if ( A9461OMMCCnt.doubleValue() <= 0 )
            {
               /* Using cursor P03MG3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
            }
            /* Using cursor P03MG4 */
            pr_default.execute(2, new Object[] {A9461OMMCCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13GXLvl2 == 0 )
      {
         if ( AV9nOMMCCnt.doubleValue() > 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPMOrMO

            */
            A9458OMMTpo = httpContext.getMessage( "C", "") ;
            A9461OMMCCnt = AV9nOMMCCnt ;
            /* Using cursor P03MG5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, A9461OMMCCnt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
            if ( (pr_default.getStatus(3) == 1) )
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
            /* Using cursor P03MG6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A9458OMMTpo = P03MG6_A9458OMMTpo[0] ;
               A9457OMOpePre = P03MG6_A9457OMOpePre[0] ;
               n9457OMOpePre = P03MG6_n9457OMOpePre[0] ;
               A9462OMMCPre = P03MG6_A9462OMMCPre[0] ;
               A9457OMOpePre = P03MG6_A9457OMOpePre[0] ;
               n9457OMOpePre = P03MG6_n9457OMOpePre[0] ;
               if ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "C", "")) == 0 )
               {
                  A9462OMMCPre = A9457OMOpePre ;
                  /* Using cursor P03MG7 */
                  pr_default.execute(5, new Object[] {A9462OMMCPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmmomov.this.A396EmprCod;
      this.aP1[0] = pmmomov.this.A9425OMCod;
      this.aP2[0] = pmmomov.this.A9455OMOpeCod;
      this.aP3[0] = pmmomov.this.AV8oOMMCCnt;
      this.aP4[0] = pmmomov.this.AV9nOMMCCnt;
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
      P03MG2_A396EmprCod = new String[] {""} ;
      P03MG2_A9425OMCod = new int[1] ;
      P03MG2_A9455OMOpeCod = new int[1] ;
      P03MG2_A9458OMMTpo = new String[] {""} ;
      P03MG2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9458OMMTpo = "" ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P03MG6_A396EmprCod = new String[] {""} ;
      P03MG6_A9425OMCod = new int[1] ;
      P03MG6_A9455OMOpeCod = new int[1] ;
      P03MG6_A9458OMMTpo = new String[] {""} ;
      P03MG6_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MG6_n9457OMOpePre = new boolean[] {false} ;
      P03MG6_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmmomov__default(),
         new Object[] {
             new Object[] {
            P03MG2_A396EmprCod, P03MG2_A9425OMCod, P03MG2_A9455OMOpeCod, P03MG2_A9458OMMTpo, P03MG2_A9461OMMCCnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03MG6_A396EmprCod, P03MG6_A9425OMCod, P03MG6_A9455OMOpeCod, P03MG6_A9458OMMTpo, P03MG6_A9457OMOpePre, P03MG6_n9457OMOpePre, P03MG6_A9462OMMCPre
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13GXLvl2 ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int GX_INS1234 ;
   private java.math.BigDecimal AV8oOMMCCnt ;
   private java.math.BigDecimal AV9nOMMCCnt ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9457OMOpePre ;
   private java.math.BigDecimal A9462OMMCPre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9458OMMTpo ;
   private String Gx_emsg ;
   private boolean n9457OMOpePre ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MG2_A396EmprCod ;
   private int[] P03MG2_A9425OMCod ;
   private int[] P03MG2_A9455OMOpeCod ;
   private String[] P03MG2_A9458OMMTpo ;
   private java.math.BigDecimal[] P03MG2_A9461OMMCCnt ;
   private String[] P03MG6_A396EmprCod ;
   private int[] P03MG6_A9425OMCod ;
   private int[] P03MG6_A9455OMOpeCod ;
   private String[] P03MG6_A9458OMMTpo ;
   private java.math.BigDecimal[] P03MG6_A9457OMOpePre ;
   private boolean[] P03MG6_n9457OMOpePre ;
   private java.math.BigDecimal[] P03MG6_A9462OMMCPre ;
}

final  class pmmomov__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MG2", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCCnt FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? and OMOpeCod = ? ORDER BY EmprCod, OMCod, OMOpeCod  FOR UPDATE OF OMMCCnt NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MG3", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
         ,new UpdateCursor("P03MG4", "UPDATE TXPMOrMO SET OMMCCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
         ,new UpdateCursor("P03MG5", "INSERT INTO TXPMOrMO(EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCCnt, OMMRCnt, OMMRPre, OMMCPre, OMMCUlt) VALUES(?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
         ,new ForEachCursor("P03MG6", "SELECT T1.EmprCod, T1.OMCod, T1.OMOpeCod AS OMOpeCod, T1.OMMTpo, T2.OpePreHor AS OMOpePre, T1.OMMCPre FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMOpeCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod  FOR UPDATE OF T1.OMMCPre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MG7", "UPDATE TXPMOrMO SET OMMCPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

