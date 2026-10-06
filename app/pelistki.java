package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelistki extends GXProcedure
{
   public pelistki( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelistki.class ), "" );
   }

   public pelistki( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pelistki.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pelistki.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelistki.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pelistki.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pelistki.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P023P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P023P2_A361DisCod[0] ;
         A130BarCodPar = P023P2_A130BarCodPar[0] ;
         A132BarCodReo = P023P2_A132BarCodReo[0] ;
         A129BarCod = P023P2_A129BarCod[0] ;
         A966PartCod = P023P2_A966PartCod[0] ;
         n966PartCod = P023P2_n966PartCod[0] ;
         A966PartCod = P023P2_A966PartCod[0] ;
         n966PartCod = P023P2_n966PartCod[0] ;
         if ( GXutil.strcmp(GXutil.substring( A966PartCod, 1, 4), httpContext.getMessage( "STKI", "")) == 0 )
         {
            AV17Ok = (byte)(1) ;
            AV14BarCodM = (int)(GXutil.lval( GXutil.substring( A966PartCod, 5, 7))) ;
            AV15BarCodReoM = (byte)(GXutil.lval( GXutil.substring( A966PartCod, 12, 1))) ;
            AV16BarCodParM = GXutil.substring( A966PartCod, 13, 1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17Ok == 1 )
      {
         /* Using cursor P023P3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCodM), Byte.valueOf(AV15BarCodReoM), AV16BarCodParM});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P023P3_A130BarCodPar[0] ;
            A132BarCodReo = P023P3_A132BarCodReo[0] ;
            A129BarCod = P023P3_A129BarCod[0] ;
            A457FasCod = P023P3_A457FasCod[0] ;
            A758ProCod = P023P3_A758ProCod[0] ;
            A194BarOrdLin = P023P3_A194BarOrdLin[0] ;
            AV13i = AV13i.add(DecimalUtil.doubleToDec(1)) ;
            AV12FasCod[(int)(DecimalUtil.decToDouble(AV13i))-1] = A457FasCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P023P4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = P023P4_A457FasCod[0] ;
            A130BarCodPar = P023P4_A130BarCodPar[0] ;
            A132BarCodReo = P023P4_A132BarCodReo[0] ;
            A129BarCod = P023P4_A129BarCod[0] ;
            A758ProCod = P023P4_A758ProCod[0] ;
            A194BarOrdLin = P023P4_A194BarOrdLin[0] ;
            if ( new app.core.ascan(remoteHandle, context).executeUdp( AV12FasCod, A457FasCod) > 0 )
            {
               /* Using cursor P023P5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelistki.this.A396EmprCod;
      this.aP1[0] = pelistki.this.AV8BarCod;
      this.aP2[0] = pelistki.this.AV9BarCodReo;
      this.aP3[0] = pelistki.this.AV10BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelistki");
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
      P023P2_A361DisCod = new int[1] ;
      P023P2_A396EmprCod = new String[] {""} ;
      P023P2_A130BarCodPar = new String[] {""} ;
      P023P2_A132BarCodReo = new byte[1] ;
      P023P2_A129BarCod = new int[1] ;
      P023P2_A966PartCod = new String[] {""} ;
      P023P2_n966PartCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A966PartCod = "" ;
      AV16BarCodParM = "" ;
      P023P3_A396EmprCod = new String[] {""} ;
      P023P3_A130BarCodPar = new String[] {""} ;
      P023P3_A132BarCodReo = new byte[1] ;
      P023P3_A129BarCod = new int[1] ;
      P023P3_A457FasCod = new String[] {""} ;
      P023P3_A758ProCod = new String[] {""} ;
      P023P3_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV13i = DecimalUtil.ZERO ;
      AV12FasCod = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV12FasCod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P023P4_A396EmprCod = new String[] {""} ;
      P023P4_A457FasCod = new String[] {""} ;
      P023P4_A130BarCodPar = new String[] {""} ;
      P023P4_A132BarCodReo = new byte[1] ;
      P023P4_A129BarCod = new int[1] ;
      P023P4_A758ProCod = new String[] {""} ;
      P023P4_A194BarOrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelistki__default(),
         new Object[] {
             new Object[] {
            P023P2_A361DisCod, P023P2_A396EmprCod, P023P2_A130BarCodPar, P023P2_A132BarCodReo, P023P2_A129BarCod, P023P2_A966PartCod, P023P2_n966PartCod
            }
            , new Object[] {
            P023P3_A396EmprCod, P023P3_A130BarCodPar, P023P3_A132BarCodReo, P023P3_A129BarCod, P023P3_A457FasCod, P023P3_A758ProCod, P023P3_A194BarOrdLin
            }
            , new Object[] {
            P023P4_A396EmprCod, P023P4_A457FasCod, P023P4_A130BarCodPar, P023P4_A132BarCodReo, P023P4_A129BarCod, P023P4_A758ProCod, P023P4_A194BarOrdLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte A132BarCodReo ;
   private byte AV17Ok ;
   private byte AV15BarCodReoM ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int AV14BarCodM ;
   private int GX_I ;
   private java.math.BigDecimal AV13i ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A966PartCod ;
   private String AV16BarCodParM ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV12FasCod[] ;
   private boolean n966PartCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P023P2_A361DisCod ;
   private String[] P023P2_A396EmprCod ;
   private String[] P023P2_A130BarCodPar ;
   private byte[] P023P2_A132BarCodReo ;
   private int[] P023P2_A129BarCod ;
   private String[] P023P2_A966PartCod ;
   private boolean[] P023P2_n966PartCod ;
   private String[] P023P3_A396EmprCod ;
   private String[] P023P3_A130BarCodPar ;
   private byte[] P023P3_A132BarCodReo ;
   private int[] P023P3_A129BarCod ;
   private String[] P023P3_A457FasCod ;
   private String[] P023P3_A758ProCod ;
   private short[] P023P3_A194BarOrdLin ;
   private String[] P023P4_A396EmprCod ;
   private String[] P023P4_A457FasCod ;
   private String[] P023P4_A130BarCodPar ;
   private byte[] P023P4_A132BarCodReo ;
   private int[] P023P4_A129BarCod ;
   private String[] P023P4_A758ProCod ;
   private short[] P023P4_A194BarOrdLin ;
}

final  class pelistki__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P023P2", "SELECT T1.DisCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.PartCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P023P3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, FasCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P023P4", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P023P5", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

