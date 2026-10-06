package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrde6 extends GXProcedure
{
   public phdrde6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrde6.class ), "" );
   }

   public phdrde6( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      phdrde6.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      phdrde6.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrde6.this.AV16SalExtAlb = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV18Firmad ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      phdrde6.this.GXt_int1 = GXv_int2[0] ;
      AV18Firmad = GXt_int1 ;
      /* Using cursor P055E2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2256SalExtFec = P055E2_A2256SalExtFec[0] ;
         A396EmprCod = P055E2_A396EmprCod[0] ;
         A2248ManCod = P055E2_A2248ManCod[0] ;
         A2253SalExtAlb = P055E2_A2253SalExtAlb[0] ;
         /* Using cursor P055E3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P055E3_A129BarCod[0] ;
            A132BarCodReo = P055E3_A132BarCodReo[0] ;
            A130BarCodPar = P055E3_A130BarCodPar[0] ;
            A6558FasCodn = P055E3_A6558FasCodn[0] ;
            A6248SalExNln = P055E3_A6248SalExNln[0] ;
            GXv_char3[0] = AV15EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_char6[0] = A6558FasCodn ;
            GXv_date7[0] = A2256SalExtFec ;
            GXv_int8[0] = (byte)(0) ;
            GXv_int9[0] = AV16SalExtAlb ;
            GXv_int10[0] = A6248SalExNln ;
            GXv_char11[0] = "" ;
            new app.phdrex9(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_char6, GXv_date7, GXv_int8, GXv_int9, GXv_int10, GXv_char11) ;
            phdrde6.this.AV15EmprCod = GXv_char3[0] ;
            phdrde6.this.A129BarCod = GXv_int4[0] ;
            phdrde6.this.A132BarCodReo = GXv_int2[0] ;
            phdrde6.this.A130BarCodPar = GXv_char5[0] ;
            phdrde6.this.A6558FasCodn = GXv_char6[0] ;
            phdrde6.this.A2256SalExtFec = GXv_date7[0] ;
            phdrde6.this.AV16SalExtAlb = GXv_int9[0] ;
            phdrde6.this.A6248SalExNln = GXv_int10[0] ;
            GXv_char11[0] = A396EmprCod ;
            GXv_int10[0] = A2248ManCod ;
            GXv_char6[0] = A6558FasCodn ;
            GXv_char5[0] = httpContext.getMessage( "E", "") ;
            GXv_int9[0] = A2253SalExtAlb ;
            GXv_int4[0] = A129BarCod ;
            GXv_int8[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            new app.trabajosexternos.pbmvhdr(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_char6, GXv_char5, GXv_int9, GXv_int4, GXv_int8, GXv_char3) ;
            phdrde6.this.A396EmprCod = GXv_char11[0] ;
            phdrde6.this.A2248ManCod = GXv_int10[0] ;
            phdrde6.this.A6558FasCodn = GXv_char6[0] ;
            phdrde6.this.A2253SalExtAlb = GXv_int9[0] ;
            phdrde6.this.A129BarCod = GXv_int4[0] ;
            phdrde6.this.A132BarCodReo = GXv_int8[0] ;
            phdrde6.this.A130BarCodPar = GXv_char3[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P055E4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2253SalExtAlb = P055E4_A2253SalExtAlb[0] ;
         A396EmprCod = P055E4_A396EmprCod[0] ;
         A2256SalExtFec = P055E4_A2256SalExtFec[0] ;
         A10080SalSts = P055E4_A10080SalSts[0] ;
         /* Optimized DELETE. */
         /* Using cursor P055E5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
         /* End optimized DELETE. */
         if ( AV18Firmad == 1 )
         {
            A10080SalSts = httpContext.getMessage( "A", "") ;
         }
         else
         {
            /* Using cursor P055E6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         }
         /* Using cursor P055E7 */
         pr_default.execute(5, new Object[] {A10080SalSts, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrde6.this.AV15EmprCod;
      this.aP1[0] = phdrde6.this.AV16SalExtAlb;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrde6");
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
      P055E2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P055E2_A396EmprCod = new String[] {""} ;
      P055E2_A2248ManCod = new short[1] ;
      P055E2_A2253SalExtAlb = new int[1] ;
      A2256SalExtFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P055E3_A396EmprCod = new String[] {""} ;
      P055E3_A2253SalExtAlb = new int[1] ;
      P055E3_A129BarCod = new int[1] ;
      P055E3_A132BarCodReo = new byte[1] ;
      P055E3_A130BarCodPar = new String[] {""} ;
      P055E3_A6558FasCodn = new String[] {""} ;
      P055E3_A6248SalExNln = new short[1] ;
      A130BarCodPar = "" ;
      A6558FasCodn = "" ;
      GXv_int2 = new byte[1] ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int4 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char3 = new String[1] ;
      P055E4_A2253SalExtAlb = new int[1] ;
      P055E4_A396EmprCod = new String[] {""} ;
      P055E4_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P055E4_A10080SalSts = new String[] {""} ;
      A10080SalSts = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrde6__default(),
         new Object[] {
             new Object[] {
            P055E2_A2256SalExtFec, P055E2_A396EmprCod, P055E2_A2248ManCod, P055E2_A2253SalExtAlb
            }
            , new Object[] {
            P055E3_A396EmprCod, P055E3_A2253SalExtAlb, P055E3_A129BarCod, P055E3_A132BarCodReo, P055E3_A130BarCodPar, P055E3_A6558FasCodn, P055E3_A6248SalExNln
            }
            , new Object[] {
            P055E4_A2253SalExtAlb, P055E4_A396EmprCod, P055E4_A2256SalExtFec, P055E4_A10080SalSts
            }
            , new Object[] {
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

   private byte AV18Firmad ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte GXv_int2[] ;
   private byte GXv_int8[] ;
   private short A2248ManCod ;
   private short A6248SalExNln ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int AV16SalExtAlb ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private int GXv_int9[] ;
   private int GXv_int4[] ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6558FasCodn ;
   private String GXv_char11[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String A10080SalSts ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date GXv_date7[] ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P055E2_A2256SalExtFec ;
   private String[] P055E2_A396EmprCod ;
   private short[] P055E2_A2248ManCod ;
   private int[] P055E2_A2253SalExtAlb ;
   private String[] P055E3_A396EmprCod ;
   private int[] P055E3_A2253SalExtAlb ;
   private int[] P055E3_A129BarCod ;
   private byte[] P055E3_A132BarCodReo ;
   private String[] P055E3_A130BarCodPar ;
   private String[] P055E3_A6558FasCodn ;
   private short[] P055E3_A6248SalExNln ;
   private int[] P055E4_A2253SalExtAlb ;
   private String[] P055E4_A396EmprCod ;
   private java.util.Date[] P055E4_A2256SalExtFec ;
   private String[] P055E4_A10080SalSts ;
}

final  class phdrde6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055E2", "SELECT SalExtFec, EmprCod, ManCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055E3", "SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar, FasCodn, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P055E4", "SELECT SalExtAlb, EmprCod, SalExtFec, SalSts FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055E5", "DELETE FROM TXPEXHDPZ  WHERE EmprCod = ? and SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
         ,new UpdateCursor("P055E6", "DELETE FROM TXPCEXTSA  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new UpdateCursor("P055E7", "UPDATE TXPCEXTSA SET SalSts=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

