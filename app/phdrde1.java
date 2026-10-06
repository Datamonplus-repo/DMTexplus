package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrde1 extends GXProcedure
{
   public phdrde1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrde1.class ), "" );
   }

   public phdrde1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      phdrde1.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      phdrde1.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrde1.this.AV16SalExtAlb = aP1[0];
      this.aP1 = aP1;
      phdrde1.this.AV17BarCod = aP2[0];
      this.aP2 = aP2;
      phdrde1.this.AV18BarCodReo = aP3[0];
      this.aP3 = aP3;
      phdrde1.this.AV19BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV22Firmad ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      phdrde1.this.GXt_int1 = GXv_int2[0] ;
      AV22Firmad = GXt_int1 ;
      /* Using cursor P00CU2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2256SalExtFec = P00CU2_A2256SalExtFec[0] ;
         A396EmprCod = P00CU2_A396EmprCod[0] ;
         A2248ManCod = P00CU2_A2248ManCod[0] ;
         A2253SalExtAlb = P00CU2_A2253SalExtAlb[0] ;
         /* Using cursor P00CU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P00CU3_A130BarCodPar[0] ;
            A132BarCodReo = P00CU3_A132BarCodReo[0] ;
            A129BarCod = P00CU3_A129BarCod[0] ;
            A2255SalExtObs1 = P00CU3_A2255SalExtObs1[0] ;
            n2255SalExtObs1 = P00CU3_n2255SalExtObs1[0] ;
            A457FasCod = P00CU3_A457FasCod[0] ;
            n457FasCod = P00CU3_n457FasCod[0] ;
            GXv_char3[0] = AV15EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_char6[0] = A457FasCod ;
            GXv_date7[0] = A2256SalExtFec ;
            GXv_int8[0] = (byte)(0) ;
            GXv_int9[0] = AV16SalExtAlb ;
            new app.phdrext(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_char6, GXv_date7, GXv_int8, GXv_int9) ;
            phdrde1.this.AV15EmprCod = GXv_char3[0] ;
            phdrde1.this.A129BarCod = GXv_int4[0] ;
            phdrde1.this.A132BarCodReo = GXv_int2[0] ;
            phdrde1.this.A130BarCodPar = GXv_char5[0] ;
            phdrde1.this.A457FasCod = GXv_char6[0] ;
            phdrde1.this.A2256SalExtFec = GXv_date7[0] ;
            phdrde1.this.AV16SalExtAlb = GXv_int9[0] ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int10[0] = A2248ManCod ;
            GXv_char5[0] = A457FasCod ;
            GXv_char3[0] = httpContext.getMessage( "E", "") ;
            GXv_int9[0] = A2253SalExtAlb ;
            GXv_int4[0] = A129BarCod ;
            GXv_int8[0] = A132BarCodReo ;
            GXv_char11[0] = A130BarCodPar ;
            new app.trabajosexternos.pbmvhdr(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5, GXv_char3, GXv_int9, GXv_int4, GXv_int8, GXv_char11) ;
            phdrde1.this.A396EmprCod = GXv_char6[0] ;
            phdrde1.this.A2248ManCod = GXv_int10[0] ;
            phdrde1.this.A457FasCod = GXv_char5[0] ;
            phdrde1.this.A2253SalExtAlb = GXv_int9[0] ;
            phdrde1.this.A129BarCod = GXv_int4[0] ;
            phdrde1.this.A132BarCodReo = GXv_int8[0] ;
            phdrde1.this.A130BarCodPar = GXv_char11[0] ;
            /* Using cursor P00CU4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTSA");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV20Flag = (byte)(0) ;
      /* Using cursor P00CU5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2253SalExtAlb = P00CU5_A2253SalExtAlb[0] ;
         A396EmprCod = P00CU5_A396EmprCod[0] ;
         A2256SalExtFec = P00CU5_A2256SalExtFec[0] ;
         A10080SalSts = P00CU5_A10080SalSts[0] ;
         /* Using cursor P00CU6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A2255SalExtObs1 = P00CU6_A2255SalExtObs1[0] ;
            n2255SalExtObs1 = P00CU6_n2255SalExtObs1[0] ;
            A129BarCod = P00CU6_A129BarCod[0] ;
            A132BarCodReo = P00CU6_A132BarCodReo[0] ;
            A130BarCodPar = P00CU6_A130BarCodPar[0] ;
            AV20Flag = (byte)(1) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( ( AV20Flag == 0 ) && ( AV22Firmad == 0 ) )
         {
            /* Using cursor P00CU7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         }
         if ( ( AV20Flag == 0 ) && ( AV22Firmad == 1 ) )
         {
            A10080SalSts = httpContext.getMessage( "A", "") ;
         }
         /* Using cursor P00CU8 */
         pr_default.execute(6, new Object[] {A10080SalSts, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrde1.this.AV15EmprCod;
      this.aP1[0] = phdrde1.this.AV16SalExtAlb;
      this.aP2[0] = phdrde1.this.AV17BarCod;
      this.aP3[0] = phdrde1.this.AV18BarCodReo;
      this.aP4[0] = phdrde1.this.AV19BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrde1");
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
      P00CU2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00CU2_A396EmprCod = new String[] {""} ;
      P00CU2_A2248ManCod = new short[1] ;
      P00CU2_A2253SalExtAlb = new int[1] ;
      A2256SalExtFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P00CU3_A396EmprCod = new String[] {""} ;
      P00CU3_A2253SalExtAlb = new int[1] ;
      P00CU3_A130BarCodPar = new String[] {""} ;
      P00CU3_A132BarCodReo = new byte[1] ;
      P00CU3_A129BarCod = new int[1] ;
      P00CU3_A2255SalExtObs1 = new String[] {""} ;
      P00CU3_n2255SalExtObs1 = new boolean[] {false} ;
      P00CU3_A457FasCod = new String[] {""} ;
      P00CU3_n457FasCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A2255SalExtObs1 = "" ;
      A457FasCod = "" ;
      GXv_int2 = new byte[1] ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_char6 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_char5 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int4 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char11 = new String[1] ;
      P00CU5_A2253SalExtAlb = new int[1] ;
      P00CU5_A396EmprCod = new String[] {""} ;
      P00CU5_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00CU5_A10080SalSts = new String[] {""} ;
      A10080SalSts = "" ;
      P00CU6_A396EmprCod = new String[] {""} ;
      P00CU6_A2253SalExtAlb = new int[1] ;
      P00CU6_A2255SalExtObs1 = new String[] {""} ;
      P00CU6_n2255SalExtObs1 = new boolean[] {false} ;
      P00CU6_A129BarCod = new int[1] ;
      P00CU6_A132BarCodReo = new byte[1] ;
      P00CU6_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrde1__default(),
         new Object[] {
             new Object[] {
            P00CU2_A2256SalExtFec, P00CU2_A396EmprCod, P00CU2_A2248ManCod, P00CU2_A2253SalExtAlb
            }
            , new Object[] {
            P00CU3_A396EmprCod, P00CU3_A2253SalExtAlb, P00CU3_A130BarCodPar, P00CU3_A132BarCodReo, P00CU3_A129BarCod, P00CU3_A2255SalExtObs1, P00CU3_n2255SalExtObs1, P00CU3_A457FasCod, P00CU3_n457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00CU5_A2253SalExtAlb, P00CU5_A396EmprCod, P00CU5_A2256SalExtFec, P00CU5_A10080SalSts
            }
            , new Object[] {
            P00CU6_A396EmprCod, P00CU6_A2253SalExtAlb, P00CU6_A2255SalExtObs1, P00CU6_n2255SalExtObs1, P00CU6_A129BarCod, P00CU6_A132BarCodReo, P00CU6_A130BarCodPar
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

   private byte AV18BarCodReo ;
   private byte AV22Firmad ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte GXv_int2[] ;
   private byte GXv_int8[] ;
   private byte AV20Flag ;
   private short A2248ManCod ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int AV16SalExtAlb ;
   private int AV17BarCod ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private int GXv_int9[] ;
   private int GXv_int4[] ;
   private String AV15EmprCod ;
   private String AV19BarCodPar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2255SalExtObs1 ;
   private String A457FasCod ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String GXv_char11[] ;
   private String A10080SalSts ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date GXv_date7[] ;
   private boolean n2255SalExtObs1 ;
   private boolean n457FasCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00CU2_A2256SalExtFec ;
   private String[] P00CU2_A396EmprCod ;
   private short[] P00CU2_A2248ManCod ;
   private int[] P00CU2_A2253SalExtAlb ;
   private String[] P00CU3_A396EmprCod ;
   private int[] P00CU3_A2253SalExtAlb ;
   private String[] P00CU3_A130BarCodPar ;
   private byte[] P00CU3_A132BarCodReo ;
   private int[] P00CU3_A129BarCod ;
   private String[] P00CU3_A2255SalExtObs1 ;
   private boolean[] P00CU3_n2255SalExtObs1 ;
   private String[] P00CU3_A457FasCod ;
   private boolean[] P00CU3_n457FasCod ;
   private int[] P00CU5_A2253SalExtAlb ;
   private String[] P00CU5_A396EmprCod ;
   private java.util.Date[] P00CU5_A2256SalExtFec ;
   private String[] P00CU5_A10080SalSts ;
   private String[] P00CU6_A396EmprCod ;
   private int[] P00CU6_A2253SalExtAlb ;
   private String[] P00CU6_A2255SalExtObs1 ;
   private boolean[] P00CU6_n2255SalExtObs1 ;
   private int[] P00CU6_A129BarCod ;
   private byte[] P00CU6_A132BarCodReo ;
   private String[] P00CU6_A130BarCodPar ;
}

final  class phdrde1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CU2", "SELECT SalExtFec, EmprCod, ManCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CU3", "SELECT EmprCod, SalExtAlb, BarCodPar, BarCodReo, BarCod, SalExtObs1, FasCod FROM TXPLEXTSA WHERE EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00CU4", "DELETE FROM TXPLEXTSA  WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTSA")
         ,new ForEachCursor("P00CU5", "SELECT SalExtAlb, EmprCod, SalExtFec, SalSts FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CU6", "SELECT EmprCod, SalExtAlb, SalExtObs1, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00CU7", "DELETE FROM TXPCEXTSA  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new UpdateCursor("P00CU8", "UPDATE TXPCEXTSA SET SalSts=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

