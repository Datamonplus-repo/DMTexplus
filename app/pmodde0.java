package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodde0 extends GXProcedure
{
   public pmodde0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodde0.class ), "" );
   }

   public pmodde0( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pmodde0.this.aP1 = new long[] {0};
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
      pmodde0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodde0.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Lalprd = (byte)(0) ;
      /* Using cursor P00GU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200BarPieCod = P00GU2_A200BarPieCod[0] ;
         A130BarCodPar = P00GU2_A130BarCodPar[0] ;
         A132BarCodReo = P00GU2_A132BarCodReo[0] ;
         A129BarCod = P00GU2_A129BarCod[0] ;
         AV16Lalprd = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV16Lalprd == 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A30AlbProCod ;
         new app.pdelalb(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         pmodde0.this.A396EmprCod = GXv_char1[0] ;
         pmodde0.this.A30AlbProCod = GXv_int2[0] ;
      }
      else
      {
         AV17BarMaccod = 0 ;
         /* Using cursor P00GU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3595BarMacCod = P00GU3_A3595BarMacCod[0] ;
            A4467BarAcaMar = P00GU3_A4467BarAcaMar[0] ;
            A130BarCodPar = P00GU3_A130BarCodPar[0] ;
            A132BarCodReo = P00GU3_A132BarCodReo[0] ;
            A129BarCod = P00GU3_A129BarCod[0] ;
            A3595BarMacCod = P00GU3_A3595BarMacCod[0] ;
            A4467BarAcaMar = P00GU3_A4467BarAcaMar[0] ;
            AV17BarMaccod = A3595BarMacCod ;
            AV18Albdomenv = (byte)(0) ;
            if ( GXutil.strcmp(A4467BarAcaMar, " ") != 0 )
            {
               AV18Albdomenv = (byte)(GXutil.lval( A4467BarAcaMar)) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00GU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A3869AlbCliDes = P00GU4_A3869AlbCliDes[0] ;
            A1243GuiRemCli = P00GU4_A1243GuiRemCli[0] ;
            A7985AlbTipDoc = P00GU4_A7985AlbTipDoc[0] ;
            A3868AlbMat = P00GU4_A3868AlbMat[0] ;
            A1259AlbDomEnv = P00GU4_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P00GU4_n1259AlbDomEnv[0] ;
            if ( A3869AlbCliDes == 0 )
            {
               A3869AlbCliDes = A1243GuiRemCli ;
            }
            A7985AlbTipDoc = AV17BarMaccod ;
            A3868AlbMat = httpContext.getMessage( "Talbhr", "") ;
            A1259AlbDomEnv = AV18Albdomenv ;
            n1259AlbDomEnv = false ;
            /* Using cursor P00GU5 */
            pr_default.execute(3, new Object[] {Integer.valueOf(A3869AlbCliDes), Integer.valueOf(A7985AlbTipDoc), A3868AlbMat, Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodde0.this.A396EmprCod;
      this.aP1[0] = pmodde0.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodde0");
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
      P00GU2_A396EmprCod = new String[] {""} ;
      P00GU2_A30AlbProCod = new long[1] ;
      P00GU2_A200BarPieCod = new String[] {""} ;
      P00GU2_A130BarCodPar = new String[] {""} ;
      P00GU2_A132BarCodReo = new byte[1] ;
      P00GU2_A129BarCod = new int[1] ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      P00GU3_A396EmprCod = new String[] {""} ;
      P00GU3_A30AlbProCod = new long[1] ;
      P00GU3_A3595BarMacCod = new int[1] ;
      P00GU3_A4467BarAcaMar = new String[] {""} ;
      P00GU3_A130BarCodPar = new String[] {""} ;
      P00GU3_A132BarCodReo = new byte[1] ;
      P00GU3_A129BarCod = new int[1] ;
      A4467BarAcaMar = "" ;
      P00GU4_A396EmprCod = new String[] {""} ;
      P00GU4_A30AlbProCod = new long[1] ;
      P00GU4_A3869AlbCliDes = new int[1] ;
      P00GU4_A1243GuiRemCli = new int[1] ;
      P00GU4_A7985AlbTipDoc = new int[1] ;
      P00GU4_A3868AlbMat = new String[] {""} ;
      P00GU4_A1259AlbDomEnv = new byte[1] ;
      P00GU4_n1259AlbDomEnv = new boolean[] {false} ;
      A3868AlbMat = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodde0__default(),
         new Object[] {
             new Object[] {
            P00GU2_A396EmprCod, P00GU2_A30AlbProCod, P00GU2_A200BarPieCod, P00GU2_A130BarCodPar, P00GU2_A132BarCodReo, P00GU2_A129BarCod
            }
            , new Object[] {
            P00GU3_A396EmprCod, P00GU3_A30AlbProCod, P00GU3_A3595BarMacCod, P00GU3_A4467BarAcaMar, P00GU3_A130BarCodPar, P00GU3_A132BarCodReo, P00GU3_A129BarCod
            }
            , new Object[] {
            P00GU4_A396EmprCod, P00GU4_A30AlbProCod, P00GU4_A3869AlbCliDes, P00GU4_A1243GuiRemCli, P00GU4_A7985AlbTipDoc, P00GU4_A3868AlbMat, P00GU4_A1259AlbDomEnv, P00GU4_n1259AlbDomEnv
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Lalprd ;
   private byte A132BarCodReo ;
   private byte AV18Albdomenv ;
   private byte A1259AlbDomEnv ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17BarMaccod ;
   private int A3595BarMacCod ;
   private int A3869AlbCliDes ;
   private int A1243GuiRemCli ;
   private int A7985AlbTipDoc ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String A4467BarAcaMar ;
   private String A3868AlbMat ;
   private boolean n1259AlbDomEnv ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00GU2_A396EmprCod ;
   private long[] P00GU2_A30AlbProCod ;
   private String[] P00GU2_A200BarPieCod ;
   private String[] P00GU2_A130BarCodPar ;
   private byte[] P00GU2_A132BarCodReo ;
   private int[] P00GU2_A129BarCod ;
   private String[] P00GU3_A396EmprCod ;
   private long[] P00GU3_A30AlbProCod ;
   private int[] P00GU3_A3595BarMacCod ;
   private String[] P00GU3_A4467BarAcaMar ;
   private String[] P00GU3_A130BarCodPar ;
   private byte[] P00GU3_A132BarCodReo ;
   private int[] P00GU3_A129BarCod ;
   private String[] P00GU4_A396EmprCod ;
   private long[] P00GU4_A30AlbProCod ;
   private int[] P00GU4_A3869AlbCliDes ;
   private int[] P00GU4_A1243GuiRemCli ;
   private int[] P00GU4_A7985AlbTipDoc ;
   private String[] P00GU4_A3868AlbMat ;
   private byte[] P00GU4_A1259AlbDomEnv ;
   private boolean[] P00GU4_n1259AlbDomEnv ;
}

final  class pmodde0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00GU2", "SELECT EmprCod, AlbProCod, BarPieCod, BarCodPar, BarCodReo, BarCod FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00GU3", "SELECT T1.EmprCod, T1.AlbProCod, T2.BarMacCod, T2.BarAcaMar, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00GU4", "SELECT EmprCod, AlbProCod, AlbCliDes, GuiRemCli, AlbTipDoc, AlbMat, AlbDomEnv FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00GU5", "UPDATE TXPCALPRD SET AlbCliDes=?, AlbTipDoc=?, AlbMat=?, AlbDomEnv=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setLong(6, ((Number) parms[6]).longValue());
               return;
      }
   }

}

