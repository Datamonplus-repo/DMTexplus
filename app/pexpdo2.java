package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexpdo2 extends GXProcedure
{
   public pexpdo2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexpdo2.class ), "" );
   }

   public pexpdo2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pexpdo2.this.aP1 = new int[] {0};
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
      pexpdo2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pexpdo2.this.AV16ExtPdoAlb = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00DL2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16ExtPdoAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00DL2_A396EmprCod[0] ;
         A2248ManCod = P00DL2_A2248ManCod[0] ;
         n2248ManCod = P00DL2_n2248ManCod[0] ;
         A2333ExtPdoAlb = P00DL2_A2333ExtPdoAlb[0] ;
         A2334ExtPdoFec = P00DL2_A2334ExtPdoFec[0] ;
         n2334ExtPdoFec = P00DL2_n2334ExtPdoFec[0] ;
         /* Using cursor P00DL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2333ExtPdoAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2345ExtPdoObs = P00DL3_A2345ExtPdoObs[0] ;
            n2345ExtPdoObs = P00DL3_n2345ExtPdoObs[0] ;
            A457FasCod = P00DL3_A457FasCod[0] ;
            n457FasCod = P00DL3_n457FasCod[0] ;
            A966PartCod = P00DL3_A966PartCod[0] ;
            n966PartCod = P00DL3_n966PartCod[0] ;
            A252CliCod = P00DL3_A252CliCod[0] ;
            n252CliCod = P00DL3_n252CliCod[0] ;
            A2360ExtPdoLoc = P00DL3_A2360ExtPdoLoc[0] ;
            n2360ExtPdoLoc = P00DL3_n2360ExtPdoLoc[0] ;
            A2790ExtPdoLin = P00DL3_A2790ExtPdoLin[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A2248ManCod ;
            GXv_char3[0] = A457FasCod ;
            GXv_char4[0] = httpContext.getMessage( "E", "") ;
            GXv_int5[0] = A2333ExtPdoAlb ;
            GXv_char6[0] = A966PartCod ;
            GXv_int7[0] = A252CliCod ;
            GXv_char8[0] = A2360ExtPdoLoc ;
            new app.pbamvpd(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_char6, GXv_int7, GXv_char8) ;
            pexpdo2.this.A396EmprCod = GXv_char1[0] ;
            pexpdo2.this.A2248ManCod = GXv_int2[0] ;
            pexpdo2.this.A457FasCod = GXv_char3[0] ;
            pexpdo2.this.A2333ExtPdoAlb = GXv_int5[0] ;
            pexpdo2.this.A966PartCod = GXv_char6[0] ;
            pexpdo2.this.A252CliCod = GXv_int7[0] ;
            pexpdo2.this.A2360ExtPdoLoc = GXv_char8[0] ;
            AV19CliCod = A252CliCod ;
            AV20PartCod = A966PartCod ;
            /* Execute user subroutine: 'LEOPDO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P00DL4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2333ExtPdoAlb), Short.valueOf(A2790ExtPdoLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTPD");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00DL5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A2333ExtPdoAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTPD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LEOPDO' Routine */
      returnInSub = false ;
      n2747PartOpe = false ;
      n2376PartExt = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00DL6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, AV20PartCod, Integer.valueOf(AV19CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexpdo2.this.AV15EmprCod;
      this.aP1[0] = pexpdo2.this.AV16ExtPdoAlb;
      Application.commitDataStores(context, remoteHandle, pr_default, "pexpdo2");
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
      P00DL2_A396EmprCod = new String[] {""} ;
      P00DL2_A2248ManCod = new short[1] ;
      P00DL2_n2248ManCod = new boolean[] {false} ;
      P00DL2_A2333ExtPdoAlb = new int[1] ;
      P00DL2_A2334ExtPdoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00DL2_n2334ExtPdoFec = new boolean[] {false} ;
      A396EmprCod = "" ;
      A2334ExtPdoFec = GXutil.nullDate() ;
      P00DL3_A396EmprCod = new String[] {""} ;
      P00DL3_A2333ExtPdoAlb = new int[1] ;
      P00DL3_A2345ExtPdoObs = new String[] {""} ;
      P00DL3_n2345ExtPdoObs = new boolean[] {false} ;
      P00DL3_A457FasCod = new String[] {""} ;
      P00DL3_n457FasCod = new boolean[] {false} ;
      P00DL3_A966PartCod = new String[] {""} ;
      P00DL3_n966PartCod = new boolean[] {false} ;
      P00DL3_A252CliCod = new int[1] ;
      P00DL3_n252CliCod = new boolean[] {false} ;
      P00DL3_A2360ExtPdoLoc = new String[] {""} ;
      P00DL3_n2360ExtPdoLoc = new boolean[] {false} ;
      P00DL3_A2790ExtPdoLin = new short[1] ;
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
      AV20PartCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexpdo2__default(),
         new Object[] {
             new Object[] {
            P00DL2_A396EmprCod, P00DL2_A2248ManCod, P00DL2_n2248ManCod, P00DL2_A2333ExtPdoAlb, P00DL2_A2334ExtPdoFec, P00DL2_n2334ExtPdoFec
            }
            , new Object[] {
            P00DL3_A396EmprCod, P00DL3_A2333ExtPdoAlb, P00DL3_A2345ExtPdoObs, P00DL3_n2345ExtPdoObs, P00DL3_A457FasCod, P00DL3_n457FasCod, P00DL3_A966PartCod, P00DL3_n966PartCod, P00DL3_A252CliCod, P00DL3_n252CliCod,
            P00DL3_A2360ExtPdoLoc, P00DL3_n2360ExtPdoLoc, P00DL3_A2790ExtPdoLin
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

   private short A2248ManCod ;
   private short A2790ExtPdoLin ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int AV16ExtPdoAlb ;
   private int A2333ExtPdoAlb ;
   private int A252CliCod ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int AV19CliCod ;
   private String AV15EmprCod ;
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
   private String AV20PartCod ;
   private java.util.Date A2334ExtPdoFec ;
   private boolean n2248ManCod ;
   private boolean n2334ExtPdoFec ;
   private boolean n2345ExtPdoObs ;
   private boolean n457FasCod ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n2360ExtPdoLoc ;
   private boolean returnInSub ;
   private boolean n2747PartOpe ;
   private boolean n2376PartExt ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DL2_A396EmprCod ;
   private short[] P00DL2_A2248ManCod ;
   private boolean[] P00DL2_n2248ManCod ;
   private int[] P00DL2_A2333ExtPdoAlb ;
   private java.util.Date[] P00DL2_A2334ExtPdoFec ;
   private boolean[] P00DL2_n2334ExtPdoFec ;
   private String[] P00DL3_A396EmprCod ;
   private int[] P00DL3_A2333ExtPdoAlb ;
   private String[] P00DL3_A2345ExtPdoObs ;
   private boolean[] P00DL3_n2345ExtPdoObs ;
   private String[] P00DL3_A457FasCod ;
   private boolean[] P00DL3_n457FasCod ;
   private String[] P00DL3_A966PartCod ;
   private boolean[] P00DL3_n966PartCod ;
   private int[] P00DL3_A252CliCod ;
   private boolean[] P00DL3_n252CliCod ;
   private String[] P00DL3_A2360ExtPdoLoc ;
   private boolean[] P00DL3_n2360ExtPdoLoc ;
   private short[] P00DL3_A2790ExtPdoLin ;
}

final  class pexpdo2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DL2", "SELECT EmprCod, ManCod, ExtPdoAlb, ExtPdoFec FROM TXPCEXTPD WHERE EmprCod = ? and ExtPdoAlb = ? ORDER BY EmprCod, ExtPdoAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00DL3", "SELECT EmprCod, ExtPdoAlb, ExtPdoObs, FasCod, PartCod, CliCod, ExtPdoLoc, ExtPdoLin FROM TXPLEXTPD WHERE EmprCod = ? and ExtPdoAlb = ? ORDER BY EmprCod, ExtPdoAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DL4", "DELETE FROM TXPLEXTPD  WHERE EmprCod = ? AND ExtPdoAlb = ? AND ExtPdoLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTPD")
         ,new UpdateCursor("P00DL5", "DELETE FROM TXPCEXTPD  WHERE EmprCod = ? AND ExtPdoAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTPD")
         ,new UpdateCursor("P00DL6", "UPDATE TXPCPARTI SET PartOpe=' ', PartExt=0  WHERE EmprCod = ? and PartCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

