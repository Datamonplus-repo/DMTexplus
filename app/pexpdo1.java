package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexpdo1 extends GXProcedure
{
   public pexpdo1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexpdo1.class ), "" );
   }

   public pexpdo1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            int[] aP3 )
   {
      pexpdo1.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 )
   {
      pexpdo1.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pexpdo1.this.AV16ExtPdoAlb = aP1[0];
      this.aP1 = aP1;
      pexpdo1.this.AV17PartCod = aP2[0];
      this.aP2 = aP2;
      pexpdo1.this.AV18CliCod = aP3[0];
      this.aP3 = aP3;
      pexpdo1.this.AV21ExtPdoLin = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00DK2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16ExtPdoAlb), Short.valueOf(AV21ExtPdoLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2790ExtPdoLin = P00DK2_A2790ExtPdoLin[0] ;
         A2333ExtPdoAlb = P00DK2_A2333ExtPdoAlb[0] ;
         A396EmprCod = P00DK2_A396EmprCod[0] ;
         A2345ExtPdoObs = P00DK2_A2345ExtPdoObs[0] ;
         n2345ExtPdoObs = P00DK2_n2345ExtPdoObs[0] ;
         A2248ManCod = P00DK2_A2248ManCod[0] ;
         n2248ManCod = P00DK2_n2248ManCod[0] ;
         A457FasCod = P00DK2_A457FasCod[0] ;
         n457FasCod = P00DK2_n457FasCod[0] ;
         A966PartCod = P00DK2_A966PartCod[0] ;
         n966PartCod = P00DK2_n966PartCod[0] ;
         A252CliCod = P00DK2_A252CliCod[0] ;
         n252CliCod = P00DK2_n252CliCod[0] ;
         A2360ExtPdoLoc = P00DK2_A2360ExtPdoLoc[0] ;
         n2360ExtPdoLoc = P00DK2_n2360ExtPdoLoc[0] ;
         A2248ManCod = P00DK2_A2248ManCod[0] ;
         n2248ManCod = P00DK2_n2248ManCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A2248ManCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_char4[0] = httpContext.getMessage( "E", "") ;
         GXv_int5[0] = A2333ExtPdoAlb ;
         GXv_char6[0] = A966PartCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char8[0] = A2360ExtPdoLoc ;
         new app.pbamvpd(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_char6, GXv_int7, GXv_char8) ;
         pexpdo1.this.A396EmprCod = GXv_char1[0] ;
         pexpdo1.this.A2248ManCod = GXv_int2[0] ;
         pexpdo1.this.A457FasCod = GXv_char3[0] ;
         pexpdo1.this.A2333ExtPdoAlb = GXv_int5[0] ;
         pexpdo1.this.A966PartCod = GXv_char6[0] ;
         pexpdo1.this.A252CliCod = GXv_int7[0] ;
         pexpdo1.this.A2360ExtPdoLoc = GXv_char8[0] ;
         /* Using cursor P00DK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2333ExtPdoAlb), Short.valueOf(A2790ExtPdoLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTPD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV20FlagEnv = (byte)(0) ;
      /* Using cursor P00DK4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16ExtPdoAlb)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2333ExtPdoAlb = P00DK4_A2333ExtPdoAlb[0] ;
         A396EmprCod = P00DK4_A396EmprCod[0] ;
         A2345ExtPdoObs = P00DK4_A2345ExtPdoObs[0] ;
         n2345ExtPdoObs = P00DK4_n2345ExtPdoObs[0] ;
         A2790ExtPdoLin = P00DK4_A2790ExtPdoLin[0] ;
         AV20FlagEnv = (byte)(1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( (0==AV20FlagEnv) )
      {
         n2747PartOpe = false ;
         n2376PartExt = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00DK5 */
         pr_default.execute(3, new Object[] {AV15EmprCod, AV17PartCod, Integer.valueOf(AV18CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         /* End optimized UPDATE. */
      }
      AV19Flag = (byte)(0) ;
      /* Using cursor P00DK6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV16ExtPdoAlb)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A2333ExtPdoAlb = P00DK6_A2333ExtPdoAlb[0] ;
         A396EmprCod = P00DK6_A396EmprCod[0] ;
         A2334ExtPdoFec = P00DK6_A2334ExtPdoFec[0] ;
         n2334ExtPdoFec = P00DK6_n2334ExtPdoFec[0] ;
         /* Using cursor P00DK7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2333ExtPdoAlb)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A2345ExtPdoObs = P00DK7_A2345ExtPdoObs[0] ;
            n2345ExtPdoObs = P00DK7_n2345ExtPdoObs[0] ;
            A2790ExtPdoLin = P00DK7_A2790ExtPdoLin[0] ;
            AV19Flag = (byte)(1) ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         if ( AV19Flag == 0 )
         {
            /* Using cursor P00DK8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A2333ExtPdoAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTPD");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexpdo1.this.AV15EmprCod;
      this.aP1[0] = pexpdo1.this.AV16ExtPdoAlb;
      this.aP2[0] = pexpdo1.this.AV17PartCod;
      this.aP3[0] = pexpdo1.this.AV18CliCod;
      this.aP4[0] = pexpdo1.this.AV21ExtPdoLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pexpdo1");
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
      P00DK2_A2790ExtPdoLin = new short[1] ;
      P00DK2_A2333ExtPdoAlb = new int[1] ;
      P00DK2_A396EmprCod = new String[] {""} ;
      P00DK2_A2345ExtPdoObs = new String[] {""} ;
      P00DK2_n2345ExtPdoObs = new boolean[] {false} ;
      P00DK2_A2248ManCod = new short[1] ;
      P00DK2_n2248ManCod = new boolean[] {false} ;
      P00DK2_A457FasCod = new String[] {""} ;
      P00DK2_n457FasCod = new boolean[] {false} ;
      P00DK2_A966PartCod = new String[] {""} ;
      P00DK2_n966PartCod = new boolean[] {false} ;
      P00DK2_A252CliCod = new int[1] ;
      P00DK2_n252CliCod = new boolean[] {false} ;
      P00DK2_A2360ExtPdoLoc = new String[] {""} ;
      P00DK2_n2360ExtPdoLoc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A2345ExtPdoObs = "" ;
      A457FasCod = "" ;
      A966PartCod = "" ;
      A2360ExtPdoLoc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      P00DK4_A2333ExtPdoAlb = new int[1] ;
      P00DK4_A396EmprCod = new String[] {""} ;
      P00DK4_A2345ExtPdoObs = new String[] {""} ;
      P00DK4_n2345ExtPdoObs = new boolean[] {false} ;
      P00DK4_A2790ExtPdoLin = new short[1] ;
      P00DK6_A2333ExtPdoAlb = new int[1] ;
      P00DK6_A396EmprCod = new String[] {""} ;
      P00DK6_A2334ExtPdoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00DK6_n2334ExtPdoFec = new boolean[] {false} ;
      A2334ExtPdoFec = GXutil.nullDate() ;
      P00DK7_A396EmprCod = new String[] {""} ;
      P00DK7_A2333ExtPdoAlb = new int[1] ;
      P00DK7_A2345ExtPdoObs = new String[] {""} ;
      P00DK7_n2345ExtPdoObs = new boolean[] {false} ;
      P00DK7_A2790ExtPdoLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexpdo1__default(),
         new Object[] {
             new Object[] {
            P00DK2_A2790ExtPdoLin, P00DK2_A2333ExtPdoAlb, P00DK2_A396EmprCod, P00DK2_A2345ExtPdoObs, P00DK2_n2345ExtPdoObs, P00DK2_A2248ManCod, P00DK2_n2248ManCod, P00DK2_A457FasCod, P00DK2_n457FasCod, P00DK2_A966PartCod,
            P00DK2_n966PartCod, P00DK2_A252CliCod, P00DK2_n252CliCod, P00DK2_A2360ExtPdoLoc, P00DK2_n2360ExtPdoLoc
            }
            , new Object[] {
            }
            , new Object[] {
            P00DK4_A2333ExtPdoAlb, P00DK4_A396EmprCod, P00DK4_A2345ExtPdoObs, P00DK4_n2345ExtPdoObs, P00DK4_A2790ExtPdoLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00DK6_A2333ExtPdoAlb, P00DK6_A396EmprCod, P00DK6_A2334ExtPdoFec, P00DK6_n2334ExtPdoFec
            }
            , new Object[] {
            P00DK7_A396EmprCod, P00DK7_A2333ExtPdoAlb, P00DK7_A2345ExtPdoObs, P00DK7_n2345ExtPdoObs, P00DK7_A2790ExtPdoLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20FlagEnv ;
   private byte AV19Flag ;
   private short AV21ExtPdoLin ;
   private short A2790ExtPdoLin ;
   private short A2248ManCod ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int AV16ExtPdoAlb ;
   private int AV18CliCod ;
   private int A2333ExtPdoAlb ;
   private int A252CliCod ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private String AV15EmprCod ;
   private String AV17PartCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A2345ExtPdoObs ;
   private String A457FasCod ;
   private String A966PartCod ;
   private String A2360ExtPdoLoc ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private java.util.Date A2334ExtPdoFec ;
   private boolean n2345ExtPdoObs ;
   private boolean n2248ManCod ;
   private boolean n457FasCod ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n2360ExtPdoLoc ;
   private boolean n2747PartOpe ;
   private boolean n2376PartExt ;
   private boolean n2334ExtPdoFec ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P00DK2_A2790ExtPdoLin ;
   private int[] P00DK2_A2333ExtPdoAlb ;
   private String[] P00DK2_A396EmprCod ;
   private String[] P00DK2_A2345ExtPdoObs ;
   private boolean[] P00DK2_n2345ExtPdoObs ;
   private short[] P00DK2_A2248ManCod ;
   private boolean[] P00DK2_n2248ManCod ;
   private String[] P00DK2_A457FasCod ;
   private boolean[] P00DK2_n457FasCod ;
   private String[] P00DK2_A966PartCod ;
   private boolean[] P00DK2_n966PartCod ;
   private int[] P00DK2_A252CliCod ;
   private boolean[] P00DK2_n252CliCod ;
   private String[] P00DK2_A2360ExtPdoLoc ;
   private boolean[] P00DK2_n2360ExtPdoLoc ;
   private int[] P00DK4_A2333ExtPdoAlb ;
   private String[] P00DK4_A396EmprCod ;
   private String[] P00DK4_A2345ExtPdoObs ;
   private boolean[] P00DK4_n2345ExtPdoObs ;
   private short[] P00DK4_A2790ExtPdoLin ;
   private int[] P00DK6_A2333ExtPdoAlb ;
   private String[] P00DK6_A396EmprCod ;
   private java.util.Date[] P00DK6_A2334ExtPdoFec ;
   private boolean[] P00DK6_n2334ExtPdoFec ;
   private String[] P00DK7_A396EmprCod ;
   private int[] P00DK7_A2333ExtPdoAlb ;
   private String[] P00DK7_A2345ExtPdoObs ;
   private boolean[] P00DK7_n2345ExtPdoObs ;
   private short[] P00DK7_A2790ExtPdoLin ;
}

final  class pexpdo1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DK2", "SELECT T1.ExtPdoLin, T1.ExtPdoAlb, T1.EmprCod, T1.ExtPdoObs, T2.ManCod, T1.FasCod, T1.PartCod, T1.CliCod, T1.ExtPdoLoc FROM (TXPLEXTPD T1 INNER JOIN TXPCEXTPD T2 ON T2.EmprCod = T1.EmprCod AND T2.ExtPdoAlb = T1.ExtPdoAlb) WHERE T1.EmprCod = ? and T1.ExtPdoAlb = ? and T1.ExtPdoLin = ? ORDER BY T1.EmprCod, T1.ExtPdoAlb, T1.ExtPdoLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00DK3", "DELETE FROM TXPLEXTPD  WHERE EmprCod = ? AND ExtPdoAlb = ? AND ExtPdoLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTPD")
         ,new ForEachCursor("P00DK4", "SELECT ExtPdoAlb, EmprCod, ExtPdoObs, ExtPdoLin FROM TXPLEXTPD WHERE EmprCod = ? and ExtPdoAlb = ? ORDER BY EmprCod, ExtPdoAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DK5", "UPDATE TXPCPARTI SET PartOpe=' ', PartExt=0  WHERE EmprCod = ? and PartCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new ForEachCursor("P00DK6", "SELECT ExtPdoAlb, EmprCod, ExtPdoFec FROM TXPCEXTPD WHERE EmprCod = ? and ExtPdoAlb = ? ORDER BY EmprCod, ExtPdoAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00DK7", "SELECT EmprCod, ExtPdoAlb, ExtPdoObs, ExtPdoLin FROM TXPLEXTPD WHERE EmprCod = ? and ExtPdoAlb = ? ORDER BY EmprCod, ExtPdoAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DK8", "DELETE FROM TXPCEXTPD  WHERE EmprCod = ? AND ExtPdoAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTPD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

