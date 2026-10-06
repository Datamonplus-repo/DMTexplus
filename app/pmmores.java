package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmmores extends GXProcedure
{
   public pmmores( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmmores.class ), "" );
   }

   public pmmores( int remoteHandle ,
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
      pmmores.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pmmores.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmmores.this.A9425OMCod = aP1[0];
      this.aP1 = aP1;
      pmmores.this.A9455OMOpeCod = aP2[0];
      this.aP2 = aP2;
      pmmores.this.AV8oOMMRCnt = aP3[0];
      this.aP3 = aP3;
      pmmores.this.AV9nOMMRCnt = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl2 = (byte)(0) ;
      /* Using cursor P03MH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9458OMMTpo = P03MH2_A9458OMMTpo[0] ;
         A9459OMMRCnt = P03MH2_A9459OMMRCnt[0] ;
         if ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 )
         {
            AV13GXLvl2 = (byte)(1) ;
            A9459OMMRCnt = A9459OMMRCnt.add((AV9nOMMRCnt.subtract(AV8oOMMRCnt))) ;
            if ( A9459OMMRCnt.doubleValue() <= 0 )
            {
               /* Using cursor P03MH3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
            }
            /* Using cursor P03MH4 */
            pr_default.execute(2, new Object[] {A9459OMMRCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13GXLvl2 == 0 )
      {
         if ( AV9nOMMRCnt.doubleValue() > 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPMOrMO

            */
            A9458OMMTpo = httpContext.getMessage( "R", "") ;
            A9459OMMRCnt = AV9nOMMRCnt ;
            /* Using cursor P03MH5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, A9459OMMRCnt});
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
            /* Using cursor P03MH6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A9458OMMTpo = P03MH6_A9458OMMTpo[0] ;
               A9457OMOpePre = P03MH6_A9457OMOpePre[0] ;
               n9457OMOpePre = P03MH6_n9457OMOpePre[0] ;
               A9460OMMRPre = P03MH6_A9460OMMRPre[0] ;
               A9457OMOpePre = P03MH6_A9457OMOpePre[0] ;
               n9457OMOpePre = P03MH6_n9457OMOpePre[0] ;
               if ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 )
               {
                  A9460OMMRPre = A9457OMOpePre ;
                  /* Using cursor P03MH7 */
                  pr_default.execute(5, new Object[] {A9460OMMRPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
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
      this.aP0[0] = pmmores.this.A396EmprCod;
      this.aP1[0] = pmmores.this.A9425OMCod;
      this.aP2[0] = pmmores.this.A9455OMOpeCod;
      this.aP3[0] = pmmores.this.AV8oOMMRCnt;
      this.aP4[0] = pmmores.this.AV9nOMMRCnt;
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
      P03MH2_A396EmprCod = new String[] {""} ;
      P03MH2_A9425OMCod = new int[1] ;
      P03MH2_A9455OMOpeCod = new int[1] ;
      P03MH2_A9458OMMTpo = new String[] {""} ;
      P03MH2_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9458OMMTpo = "" ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P03MH6_A396EmprCod = new String[] {""} ;
      P03MH6_A9425OMCod = new int[1] ;
      P03MH6_A9455OMOpeCod = new int[1] ;
      P03MH6_A9458OMMTpo = new String[] {""} ;
      P03MH6_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MH6_n9457OMOpePre = new boolean[] {false} ;
      P03MH6_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmmores__default(),
         new Object[] {
             new Object[] {
            P03MH2_A396EmprCod, P03MH2_A9425OMCod, P03MH2_A9455OMOpeCod, P03MH2_A9458OMMTpo, P03MH2_A9459OMMRCnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03MH6_A396EmprCod, P03MH6_A9425OMCod, P03MH6_A9455OMOpeCod, P03MH6_A9458OMMTpo, P03MH6_A9457OMOpePre, P03MH6_n9457OMOpePre, P03MH6_A9460OMMRPre
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
   private java.math.BigDecimal AV8oOMMRCnt ;
   private java.math.BigDecimal AV9nOMMRCnt ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal A9457OMOpePre ;
   private java.math.BigDecimal A9460OMMRPre ;
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
   private String[] P03MH2_A396EmprCod ;
   private int[] P03MH2_A9425OMCod ;
   private int[] P03MH2_A9455OMOpeCod ;
   private String[] P03MH2_A9458OMMTpo ;
   private java.math.BigDecimal[] P03MH2_A9459OMMRCnt ;
   private String[] P03MH6_A396EmprCod ;
   private int[] P03MH6_A9425OMCod ;
   private int[] P03MH6_A9455OMOpeCod ;
   private String[] P03MH6_A9458OMMTpo ;
   private java.math.BigDecimal[] P03MH6_A9457OMOpePre ;
   private boolean[] P03MH6_n9457OMOpePre ;
   private java.math.BigDecimal[] P03MH6_A9460OMMRPre ;
}

final  class pmmores__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MH2", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMRCnt FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? and OMOpeCod = ? ORDER BY EmprCod, OMCod, OMOpeCod  FOR UPDATE OF OMMRCnt NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MH3", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
         ,new UpdateCursor("P03MH4", "UPDATE TXPMOrMO SET OMMRCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
         ,new UpdateCursor("P03MH5", "INSERT INTO TXPMOrMO(EmprCod, OMCod, OMOpeCod, OMMTpo, OMMRCnt, OMMRPre, OMMCCnt, OMMCPre, OMMCUlt) VALUES(?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
         ,new ForEachCursor("P03MH6", "SELECT T1.EmprCod, T1.OMCod, T1.OMOpeCod AS OMOpeCod, T1.OMMTpo, T2.OpePreHor AS OMOpePre, T1.OMMRPre FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMOpeCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod  FOR UPDATE OF T1.OMMRPre NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MH7", "UPDATE TXPMOrMO SET OMMRPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
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

