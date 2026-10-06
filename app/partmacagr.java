package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partmacagr extends GXProcedure
{
   public partmacagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partmacagr.class ), "" );
   }

   public partmacagr( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String[] aP0 ,
                               int[] aP1 ,
                               byte[] aP2 ,
                               String[] aP3 ,
                               int[] aP4 ,
                               String[] AV9HDRA ,
                               String[] AV8HDRAgr )
   {
      AV15BarLocDis = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV15BarLocDis[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, aP2, aP3, aP4, AV9HDRA, AV8HDRAgr, AV15BarLocDis);
      return AV15BarLocDis;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] AV9HDRA ,
                        String[] AV8HDRAgr ,
                        String[] AV15BarLocDis )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, AV9HDRA, AV8HDRAgr, AV15BarLocDis);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] AV9HDRA ,
                             String[] AV8HDRAgr ,
                             String[] AV15BarLocDis )
   {
      partmacagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partmacagr.this.AV11BarCod = aP1[0];
      this.aP1 = aP1;
      partmacagr.this.AV12BarCodReo = aP2[0];
      this.aP2 = aP2;
      partmacagr.this.AV13BarCodPar = aP3[0];
      this.aP3 = aP3;
      partmacagr.this.AV10MacCod = aP4[0];
      this.aP4 = aP4;
      partmacagr.this.AV9HDRA = AV9HDRA;
      partmacagr.this.AV8HDRAgr = AV8HDRAgr;
      partmacagr.this.AV15BarLocDis = AV15BarLocDis;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV9HDRA[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV14ContHr = 1 ;
      /* Using cursor P02SV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10MacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1205MacBarPar = P02SV2_A1205MacBarPar[0] ;
         A1204MacBarReo = P02SV2_A1204MacBarReo[0] ;
         A1203MacBarCod = P02SV2_A1203MacBarCod[0] ;
         A1199MacCod = P02SV2_A1199MacCod[0] ;
         A1201MacLin = P02SV2_A1201MacLin[0] ;
         if ( ( AV11BarCod == A1203MacBarCod ) && ( AV12BarCodReo == A1204MacBarReo ) && ( GXutil.strcmp(A1205MacBarPar, AV13BarCodPar) == 0 ) )
         {
         }
         else
         {
            AV9HDRA[(int)(AV14ContHr)-1] = GXutil.str( A1203MacBarCod, 8, 0) + "-" + GXutil.str( A1204MacBarReo, 1, 0) + A1205MacBarPar ;
            /* Using cursor P02SV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A129BarCod = P02SV3_A129BarCod[0] ;
               A132BarCodReo = P02SV3_A132BarCodReo[0] ;
               A130BarCodPar = P02SV3_A130BarCodPar[0] ;
               A1431BarLocDis = P02SV3_A1431BarLocDis[0] ;
               AV15BarLocDis[(int)(AV14ContHr)-1] = A1431BarLocDis ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            AV14ContHr = (long)(AV14ContHr+1) ;
         }
         if ( AV14ContHr > 5 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV8HDRAgr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16ContAgr = 1 ;
      /* Using cursor P02SV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A122BarAgrPar = P02SV4_A122BarAgrPar[0] ;
         A124BarAgrReo = P02SV4_A124BarAgrReo[0] ;
         A119BarAgrCod = P02SV4_A119BarAgrCod[0] ;
         A1431BarLocDis = P02SV4_A1431BarLocDis[0] ;
         A130BarCodPar = P02SV4_A130BarCodPar[0] ;
         A132BarCodReo = P02SV4_A132BarCodReo[0] ;
         A129BarCod = P02SV4_A129BarCod[0] ;
         A1431BarLocDis = P02SV4_A1431BarLocDis[0] ;
         AV8HDRAgr[(int)(AV16ContAgr)-1] = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV15BarLocDis[(int)(AV16ContAgr+5)-1] = A1431BarLocDis ;
         AV16ContAgr = (long)(AV16ContAgr+1) ;
         if ( AV16ContAgr > 5 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partmacagr.this.A396EmprCod;
      this.aP1[0] = partmacagr.this.AV11BarCod;
      this.aP2[0] = partmacagr.this.AV12BarCodReo;
      this.aP3[0] = partmacagr.this.AV13BarCodPar;
      this.aP4[0] = partmacagr.this.AV10MacCod;
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
      P02SV2_A396EmprCod = new String[] {""} ;
      P02SV2_A1205MacBarPar = new String[] {""} ;
      P02SV2_A1204MacBarReo = new byte[1] ;
      P02SV2_A1203MacBarCod = new int[1] ;
      P02SV2_A1199MacCod = new int[1] ;
      P02SV2_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      P02SV3_A396EmprCod = new String[] {""} ;
      P02SV3_A129BarCod = new int[1] ;
      P02SV3_A132BarCodReo = new byte[1] ;
      P02SV3_A130BarCodPar = new String[] {""} ;
      P02SV3_A1431BarLocDis = new String[] {""} ;
      A130BarCodPar = "" ;
      A1431BarLocDis = "" ;
      P02SV4_A396EmprCod = new String[] {""} ;
      P02SV4_A122BarAgrPar = new String[] {""} ;
      P02SV4_A124BarAgrReo = new byte[1] ;
      P02SV4_A119BarAgrCod = new int[1] ;
      P02SV4_A1431BarLocDis = new String[] {""} ;
      P02SV4_A130BarCodPar = new String[] {""} ;
      P02SV4_A132BarCodReo = new byte[1] ;
      P02SV4_A129BarCod = new int[1] ;
      A122BarAgrPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partmacagr__default(),
         new Object[] {
             new Object[] {
            P02SV2_A396EmprCod, P02SV2_A1205MacBarPar, P02SV2_A1204MacBarReo, P02SV2_A1203MacBarCod, P02SV2_A1199MacCod, P02SV2_A1201MacLin
            }
            , new Object[] {
            P02SV3_A396EmprCod, P02SV3_A129BarCod, P02SV3_A132BarCodReo, P02SV3_A130BarCodPar, P02SV3_A1431BarLocDis
            }
            , new Object[] {
            P02SV4_A396EmprCod, P02SV4_A122BarAgrPar, P02SV4_A124BarAgrReo, P02SV4_A119BarAgrCod, P02SV4_A1431BarLocDis, P02SV4_A130BarCodPar, P02SV4_A132BarCodReo, P02SV4_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte A1204MacBarReo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int GX_I ;
   private int AV11BarCod ;
   private int AV10MacCod ;
   private int A1203MacBarCod ;
   private int A1199MacCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private long AV14ContHr ;
   private long AV16ContAgr ;
   private String A396EmprCod ;
   private String AV13BarCodPar ;
   private String AV9HDRA[] ;
   private String AV8HDRAgr[] ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private String A130BarCodPar ;
   private String A1431BarLocDis ;
   private String A122BarAgrPar ;
   private String[] AV15BarLocDis ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02SV2_A396EmprCod ;
   private String[] P02SV2_A1205MacBarPar ;
   private byte[] P02SV2_A1204MacBarReo ;
   private int[] P02SV2_A1203MacBarCod ;
   private int[] P02SV2_A1199MacCod ;
   private short[] P02SV2_A1201MacLin ;
   private String[] P02SV3_A396EmprCod ;
   private int[] P02SV3_A129BarCod ;
   private byte[] P02SV3_A132BarCodReo ;
   private String[] P02SV3_A130BarCodPar ;
   private String[] P02SV3_A1431BarLocDis ;
   private String[] P02SV4_A396EmprCod ;
   private String[] P02SV4_A122BarAgrPar ;
   private byte[] P02SV4_A124BarAgrReo ;
   private int[] P02SV4_A119BarAgrCod ;
   private String[] P02SV4_A1431BarLocDis ;
   private String[] P02SV4_A130BarCodPar ;
   private byte[] P02SV4_A132BarCodReo ;
   private int[] P02SV4_A129BarCod ;
}

final  class partmacagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02SV2", "SELECT EmprCod, MacBarPar, MacBarReo, MacBarCod, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02SV3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarLocDis FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02SV4", "SELECT T1.EmprCod, T1.BarAgrPar, T1.BarAgrReo, T1.BarAgrCod, T2.BarLocDis, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARAGR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarAgrCod = ?) AND (T1.BarAgrReo = ?) AND (T1.BarAgrPar = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAgrCod, T1.BarAgrReo, T1.BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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

