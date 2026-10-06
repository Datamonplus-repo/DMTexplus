package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobsagr extends GXProcedure
{
   public pobsagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobsagr.class ), "" );
   }

   public pobsagr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 )
   {
      pobsagr.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      pobsagr.this.A396EmprCod = aP0;
      pobsagr.this.A129BarCod = aP1;
      pobsagr.this.A132BarCodReo = aP2;
      pobsagr.this.A130BarCodPar = aP3;
      pobsagr.this.AV9KgsAgr = aP4[0];
      this.aP4 = aP4;
      pobsagr.this.AV10BarSerDsc = aP5[0];
      this.aP5 = aP5;
      pobsagr.this.AV8ObsTxt = aP6[0];
      this.aP6 = aP6;
      pobsagr.this.AV11BarPie = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV12F_carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      pobsagr.this.GXt_int1 = GXv_int2[0] ;
      AV12F_carvema = GXt_int1 ;
      /* Using cursor P00QK3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00QK3_A361DisCod[0] ;
         A1652BarSerDsc = P00QK3_A1652BarSerDsc[0] ;
         A212BarSer = P00QK3_A212BarSer[0] ;
         A166BarKgm = P00QK3_A166BarKgm[0] ;
         A199BarPie1 = P00QK3_A199BarPie1[0] ;
         A365DisDes = P00QK3_A365DisDes[0] ;
         A898BarPieNDes = P00QK3_A898BarPieNDes[0] ;
         A166BarKgm = P00QK3_A166BarKgm[0] ;
         A199BarPie1 = P00QK3_A199BarPie1[0] ;
         A898BarPieNDes = P00QK3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV9KgsAgr = A166BarKgm ;
         AV11BarPie = A198BarPie ;
         AV10BarSerDsc = A1652BarSerDsc ;
         AV8ObsTxt = "" ;
         /* Using cursor P00QK4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A377DisObsTxt = P00QK4_A377DisObsTxt[0] ;
            A376DisObsLin = P00QK4_A376DisObsLin[0] ;
            AV8ObsTxt = A377DisObsTxt ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV12F_carvema == 1 )
         {
            AV10BarSerDsc = A212BarSer ;
            /* Using cursor P00QK5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A187BarNotDsc = P00QK5_A187BarNotDsc[0] ;
               A188BarNotLin = P00QK5_A188BarNotLin[0] ;
               AV8ObsTxt = A187BarNotDsc ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pobsagr.this.AV9KgsAgr;
      this.aP5[0] = pobsagr.this.AV10BarSerDsc;
      this.aP6[0] = pobsagr.this.AV8ObsTxt;
      this.aP7[0] = pobsagr.this.AV11BarPie;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P00QK3_A396EmprCod = new String[] {""} ;
      P00QK3_A129BarCod = new int[1] ;
      P00QK3_A132BarCodReo = new byte[1] ;
      P00QK3_A130BarCodPar = new String[] {""} ;
      P00QK3_A361DisCod = new int[1] ;
      P00QK3_A1652BarSerDsc = new String[] {""} ;
      P00QK3_A212BarSer = new String[] {""} ;
      P00QK3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00QK3_A199BarPie1 = new short[1] ;
      P00QK3_A365DisDes = new String[] {""} ;
      P00QK3_A898BarPieNDes = new int[1] ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P00QK4_A396EmprCod = new String[] {""} ;
      P00QK4_A361DisCod = new int[1] ;
      P00QK4_A377DisObsTxt = new String[] {""} ;
      P00QK4_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P00QK5_A396EmprCod = new String[] {""} ;
      P00QK5_A129BarCod = new int[1] ;
      P00QK5_A132BarCodReo = new byte[1] ;
      P00QK5_A130BarCodPar = new String[] {""} ;
      P00QK5_A187BarNotDsc = new String[] {""} ;
      P00QK5_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pobsagr__default(),
         new Object[] {
             new Object[] {
            P00QK3_A396EmprCod, P00QK3_A129BarCod, P00QK3_A132BarCodReo, P00QK3_A130BarCodPar, P00QK3_A361DisCod, P00QK3_A1652BarSerDsc, P00QK3_A212BarSer, P00QK3_A166BarKgm, P00QK3_A199BarPie1, P00QK3_A365DisDes,
            P00QK3_A898BarPieNDes
            }
            , new Object[] {
            P00QK4_A396EmprCod, P00QK4_A361DisCod, P00QK4_A377DisObsTxt, P00QK4_A376DisObsLin
            }
            , new Object[] {
            P00QK5_A396EmprCod, P00QK5_A129BarCod, P00QK5_A132BarCodReo, P00QK5_A130BarCodPar, P00QK5_A187BarNotDsc, P00QK5_A188BarNotLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12F_carvema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A376DisObsLin ;
   private byte A188BarNotLin ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11BarPie ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal AV9KgsAgr ;
   private java.math.BigDecimal A166BarKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10BarSerDsc ;
   private String AV8ObsTxt ;
   private String scmdbuf ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A365DisDes ;
   private String A377DisObsTxt ;
   private String A187BarNotDsc ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00QK3_A396EmprCod ;
   private int[] P00QK3_A129BarCod ;
   private byte[] P00QK3_A132BarCodReo ;
   private String[] P00QK3_A130BarCodPar ;
   private int[] P00QK3_A361DisCod ;
   private String[] P00QK3_A1652BarSerDsc ;
   private String[] P00QK3_A212BarSer ;
   private java.math.BigDecimal[] P00QK3_A166BarKgm ;
   private short[] P00QK3_A199BarPie1 ;
   private String[] P00QK3_A365DisDes ;
   private int[] P00QK3_A898BarPieNDes ;
   private String[] P00QK4_A396EmprCod ;
   private int[] P00QK4_A361DisCod ;
   private String[] P00QK4_A377DisObsTxt ;
   private byte[] P00QK4_A376DisObsLin ;
   private String[] P00QK5_A396EmprCod ;
   private int[] P00QK5_A129BarCod ;
   private byte[] P00QK5_A132BarCodReo ;
   private String[] P00QK5_A130BarCodPar ;
   private String[] P00QK5_A187BarNotDsc ;
   private byte[] P00QK5_A188BarNotLin ;
}

final  class pobsagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00QK3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarSerDsc, T1.BarSer, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00QK4", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00QK5", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

