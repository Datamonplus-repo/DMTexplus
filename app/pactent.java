package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactent extends GXProcedure
{
   public pactent( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactent.class ), "" );
   }

   public pactent( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pactent.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pactent.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactent.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21DisEnt = "" ;
      AV22Flag = (byte)(0) ;
      /* Using cursor P00OK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1879AlbProEnt = P00OK2_A1879AlbProEnt[0] ;
         n1879AlbProEnt = P00OK2_n1879AlbProEnt[0] ;
         /* Using cursor P00OK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A361DisCod = P00OK3_A361DisCod[0] ;
            A32AlbProEsp = P00OK3_A32AlbProEsp[0] ;
            A366DisEnt = P00OK3_A366DisEnt[0] ;
            A130BarCodPar = P00OK3_A130BarCodPar[0] ;
            A132BarCodReo = P00OK3_A132BarCodReo[0] ;
            A129BarCod = P00OK3_A129BarCod[0] ;
            A361DisCod = P00OK3_A361DisCod[0] ;
            A366DisEnt = P00OK3_A366DisEnt[0] ;
            if ( ! (GXutil.strcmp("", A366DisEnt)==0) )
            {
               AV21DisEnt = A366DisEnt ;
               AV22Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV22Flag == 1 )
         {
            A1879AlbProEnt = AV21DisEnt ;
            n1879AlbProEnt = false ;
         }
         /* Using cursor P00OK4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n1879AlbProEnt), A1879AlbProEnt, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactent.this.A396EmprCod;
      this.aP1[0] = pactent.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactent");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21DisEnt = "" ;
      scmdbuf = "" ;
      P00OK2_A396EmprCod = new String[] {""} ;
      P00OK2_A30AlbProCod = new long[1] ;
      P00OK2_A1879AlbProEnt = new String[] {""} ;
      P00OK2_n1879AlbProEnt = new boolean[] {false} ;
      A1879AlbProEnt = "" ;
      P00OK3_A361DisCod = new int[1] ;
      P00OK3_A396EmprCod = new String[] {""} ;
      P00OK3_A30AlbProCod = new long[1] ;
      P00OK3_A32AlbProEsp = new byte[1] ;
      P00OK3_A366DisEnt = new String[] {""} ;
      P00OK3_A130BarCodPar = new String[] {""} ;
      P00OK3_A132BarCodReo = new byte[1] ;
      P00OK3_A129BarCod = new int[1] ;
      A366DisEnt = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactent__default(),
         new Object[] {
             new Object[] {
            P00OK2_A396EmprCod, P00OK2_A30AlbProCod, P00OK2_A1879AlbProEnt, P00OK2_n1879AlbProEnt
            }
            , new Object[] {
            P00OK3_A361DisCod, P00OK3_A396EmprCod, P00OK3_A30AlbProCod, P00OK3_A32AlbProEsp, P00OK3_A366DisEnt, P00OK3_A130BarCodPar, P00OK3_A132BarCodReo, P00OK3_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Flag ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV21DisEnt ;
   private String scmdbuf ;
   private String A1879AlbProEnt ;
   private String A366DisEnt ;
   private String A130BarCodPar ;
   private boolean n1879AlbProEnt ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00OK2_A396EmprCod ;
   private long[] P00OK2_A30AlbProCod ;
   private String[] P00OK2_A1879AlbProEnt ;
   private boolean[] P00OK2_n1879AlbProEnt ;
   private int[] P00OK3_A361DisCod ;
   private String[] P00OK3_A396EmprCod ;
   private long[] P00OK3_A30AlbProCod ;
   private byte[] P00OK3_A32AlbProEsp ;
   private String[] P00OK3_A366DisEnt ;
   private String[] P00OK3_A130BarCodPar ;
   private byte[] P00OK3_A132BarCodReo ;
   private int[] P00OK3_A129BarCod ;
}

final  class pactent__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00OK2", "SELECT EmprCod, AlbProCod, AlbProEnt FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OK3", "SELECT T2.DisCod, T1.EmprCod, T1.AlbProCod, T1.AlbProEsp, T3.DisEnt, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) INNER JOIN TXPCALPRD T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00OK4", "UPDATE TXPCALPRD SET AlbProEnt=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
      }
   }

}

