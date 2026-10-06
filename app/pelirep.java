package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelirep extends GXProcedure
{
   public pelirep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelirep.class ), "" );
   }

   public pelirep( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      pelirep.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      pelirep.this.A942TermCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00Z22 */
      pr_default.execute(0, new Object[] {A942TermCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2140RepFonCod = P00Z22_A2140RepFonCod[0] ;
         A2138RepComCod = P00Z22_A2138RepComCod[0] ;
         A2681RepComLin = P00Z22_A2681RepComLin[0] ;
         A2136RepBarPar = P00Z22_A2136RepBarPar[0] ;
         A2137RepBarReo = P00Z22_A2137RepBarReo[0] ;
         A2135RepBarCod = P00Z22_A2135RepBarCod[0] ;
         A396EmprCod = P00Z22_A396EmprCod[0] ;
         n396EmprCod = P00Z22_n396EmprCod[0] ;
         A396EmprCod = P00Z22_A396EmprCod[0] ;
         n396EmprCod = P00Z22_n396EmprCod[0] ;
         /* Using cursor P00Z23 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A2135RepBarCod), Byte.valueOf(A2137RepBarReo), A2136RepBarPar, Byte.valueOf(A2681RepComLin), A2138RepComCod, A2140RepFonCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P00Z23_A129BarCod[0] ;
            A132BarCodReo = P00Z23_A132BarCodReo[0] ;
            A130BarCodPar = P00Z23_A130BarCodPar[0] ;
            A2524DisComLin = P00Z23_A2524DisComLin[0] ;
            A1056DisComCod = P00Z23_A1056DisComCod[0] ;
            A1032FonCod = P00Z23_A1032FonCod[0] ;
            A2069BarComEst = P00Z23_A2069BarComEst[0] ;
            n2069BarComEst = P00Z23_n2069BarComEst[0] ;
            if ( GXutil.strcmp(A2069BarComEst, httpContext.getMessage( "B", "")) == 0 )
            {
               A2069BarComEst = httpContext.getMessage( "N", "") ;
               n2069BarComEst = false ;
            }
            /* Using cursor P00Z24 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n2069BarComEst), A2069BarComEst, Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P00Z25 */
         pr_default.execute(3, new Object[] {A942TermCod, Integer.valueOf(A2135RepBarCod), Byte.valueOf(A2137RepBarReo), A2136RepBarPar, Byte.valueOf(A2681RepComLin), A2138RepComCod, A2140RepFonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANREP");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelirep.this.A942TermCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelirep");
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
      P00Z22_A942TermCod = new String[] {""} ;
      P00Z22_A2140RepFonCod = new String[] {""} ;
      P00Z22_A2138RepComCod = new String[] {""} ;
      P00Z22_A2681RepComLin = new byte[1] ;
      P00Z22_A2136RepBarPar = new String[] {""} ;
      P00Z22_A2137RepBarReo = new byte[1] ;
      P00Z22_A2135RepBarCod = new int[1] ;
      P00Z22_A396EmprCod = new String[] {""} ;
      P00Z22_n396EmprCod = new boolean[] {false} ;
      A2140RepFonCod = "" ;
      A2138RepComCod = "" ;
      A2136RepBarPar = "" ;
      A396EmprCod = "" ;
      P00Z23_A396EmprCod = new String[] {""} ;
      P00Z23_n396EmprCod = new boolean[] {false} ;
      P00Z23_A129BarCod = new int[1] ;
      P00Z23_A132BarCodReo = new byte[1] ;
      P00Z23_A130BarCodPar = new String[] {""} ;
      P00Z23_A2524DisComLin = new byte[1] ;
      P00Z23_A1056DisComCod = new String[] {""} ;
      P00Z23_A1032FonCod = new String[] {""} ;
      P00Z23_A2069BarComEst = new String[] {""} ;
      P00Z23_n2069BarComEst = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A2069BarComEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelirep__default(),
         new Object[] {
             new Object[] {
            P00Z22_A942TermCod, P00Z22_A2140RepFonCod, P00Z22_A2138RepComCod, P00Z22_A2681RepComLin, P00Z22_A2136RepBarPar, P00Z22_A2137RepBarReo, P00Z22_A2135RepBarCod, P00Z22_A396EmprCod, P00Z22_n396EmprCod
            }
            , new Object[] {
            P00Z23_A396EmprCod, P00Z23_A129BarCod, P00Z23_A132BarCodReo, P00Z23_A130BarCodPar, P00Z23_A2524DisComLin, P00Z23_A1056DisComCod, P00Z23_A1032FonCod, P00Z23_A2069BarComEst, P00Z23_n2069BarComEst
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2681RepComLin ;
   private byte A2137RepBarReo ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private short Gx_err ;
   private int A2135RepBarCod ;
   private int A129BarCod ;
   private String A942TermCod ;
   private String scmdbuf ;
   private String A2140RepFonCod ;
   private String A2138RepComCod ;
   private String A2136RepBarPar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A2069BarComEst ;
   private boolean n396EmprCod ;
   private boolean n2069BarComEst ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Z22_A942TermCod ;
   private String[] P00Z22_A2140RepFonCod ;
   private String[] P00Z22_A2138RepComCod ;
   private byte[] P00Z22_A2681RepComLin ;
   private String[] P00Z22_A2136RepBarPar ;
   private byte[] P00Z22_A2137RepBarReo ;
   private int[] P00Z22_A2135RepBarCod ;
   private String[] P00Z22_A396EmprCod ;
   private boolean[] P00Z22_n396EmprCod ;
   private String[] P00Z23_A396EmprCod ;
   private boolean[] P00Z23_n396EmprCod ;
   private int[] P00Z23_A129BarCod ;
   private byte[] P00Z23_A132BarCodReo ;
   private String[] P00Z23_A130BarCodPar ;
   private byte[] P00Z23_A2524DisComLin ;
   private String[] P00Z23_A1056DisComCod ;
   private String[] P00Z23_A1032FonCod ;
   private String[] P00Z23_A2069BarComEst ;
   private boolean[] P00Z23_n2069BarComEst ;
}

final  class pelirep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Z22", "SELECT T1.TermCod, T1.RepFonCod, T1.RepComCod, T1.RepComLin, T1.RepBarPar, T1.RepBarReo, T1.RepBarCod, T2.EmprCod FROM (TXPLANREP T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod) WHERE T1.TermCod = ? ORDER BY T1.TermCod, T1.RepBarCod, T1.RepBarReo, T1.RepBarPar, T1.RepComLin, T1.RepComCod, T1.RepFonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Z23", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarComEst FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00Z24", "UPDATE TXPBARCOM SET BarComEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new UpdateCursor("P00Z25", "DELETE FROM TXPLANREP  WHERE TermCod = ? AND RepBarCod = ? AND RepBarReo = ? AND RepBarPar = ? AND RepComLin = ? AND RepComCod = ? AND RepFonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANREP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               stmt.setInt(3, ((Number) parms[4]).intValue());
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               stmt.setString(5, (String)parms[6], 1);
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 12);
               stmt.setString(8, (String)parms[9], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
      }
   }

}

