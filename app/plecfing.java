package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plecfing extends GXProcedure
{
   public plecfing( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plecfing.class ), "" );
   }

   public plecfing( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            int[] aP5 )
   {
      plecfing.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 )
   {
      plecfing.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plecfing.this.A1166LecMaqCod = aP1[0];
      this.aP1 = aP1;
      plecfing.this.AV29LecBarCodG = aP2[0];
      this.aP2 = aP2;
      plecfing.this.AV30LecBarReoG = aP3[0];
      this.aP3 = aP3;
      plecfing.this.AV31LecBarParG = aP4[0];
      this.aP4 = aP4;
      plecfing.this.AV32LecNumLotG = aP5[0];
      this.aP5 = aP5;
      plecfing.this.AV33LecFasOrdG = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P022O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1166LecMaqCod, Integer.valueOf(AV29LecBarCodG), Byte.valueOf(AV30LecBarReoG), AV31LecBarParG, Integer.valueOf(AV32LecNumLotG), Short.valueOf(AV33LecFasOrdG)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECLAV");
      /* End optimized DELETE. */
      AV34Fin_gral = (byte)(1) ;
      /* Using cursor P022O3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A1166LecMaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5972LecFinG = P022O3_A5972LecFinG[0] ;
         n5972LecFinG = P022O3_n5972LecFinG[0] ;
         A5961LecBarCodG = P022O3_A5961LecBarCodG[0] ;
         A5962LecBarReoG = P022O3_A5962LecBarReoG[0] ;
         A5963LecBarParG = P022O3_A5963LecBarParG[0] ;
         A5964LecNumLotG = P022O3_A5964LecNumLotG[0] ;
         A5965LecFasOrdG = P022O3_A5965LecFasOrdG[0] ;
         if ( GXutil.strcmp(A5972LecFinG, httpContext.getMessage( "NO", "")) == 0 )
         {
            AV34Fin_gral = (byte)(0) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV34Fin_gral == 1 )
      {
         /* Using cursor P022O4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A1166LecMaqCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4345LecCombin = P022O4_A4345LecCombin[0] ;
            n4345LecCombin = P022O4_n4345LecCombin[0] ;
            A4345LecCombin = httpContext.getMessage( "SI", "") ;
            n4345LecCombin = false ;
            /* Using cursor P022O5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n4345LecCombin), A4345LecCombin, A396EmprCod, A1166LecMaqCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      else
      {
         /* Using cursor P022O6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A1166LecMaqCod, Integer.valueOf(AV29LecBarCodG), Byte.valueOf(AV30LecBarReoG), AV31LecBarParG, Integer.valueOf(AV32LecNumLotG), Short.valueOf(AV33LecFasOrdG)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1188LecFasOrd = P022O6_A1188LecFasOrd[0] ;
            n1188LecFasOrd = P022O6_n1188LecFasOrd[0] ;
            A4702LecNumLot = P022O6_A4702LecNumLot[0] ;
            n4702LecNumLot = P022O6_n4702LecNumLot[0] ;
            A1169LecBarPar = P022O6_A1169LecBarPar[0] ;
            n1169LecBarPar = P022O6_n1169LecBarPar[0] ;
            A1168LecBarReo = P022O6_A1168LecBarReo[0] ;
            n1168LecBarReo = P022O6_n1168LecBarReo[0] ;
            A1167LecBarCod = P022O6_A1167LecBarCod[0] ;
            n1167LecBarCod = P022O6_n1167LecBarCod[0] ;
            A4345LecCombin = P022O6_A4345LecCombin[0] ;
            n4345LecCombin = P022O6_n4345LecCombin[0] ;
            A4345LecCombin = httpContext.getMessage( "SI", "") ;
            n4345LecCombin = false ;
            /* Using cursor P022O7 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n4345LecCombin), A4345LecCombin, A396EmprCod, A1166LecMaqCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plecfing.this.A396EmprCod;
      this.aP1[0] = plecfing.this.A1166LecMaqCod;
      this.aP2[0] = plecfing.this.AV29LecBarCodG;
      this.aP3[0] = plecfing.this.AV30LecBarReoG;
      this.aP4[0] = plecfing.this.AV31LecBarParG;
      this.aP5[0] = plecfing.this.AV32LecNumLotG;
      this.aP6[0] = plecfing.this.AV33LecFasOrdG;
      Application.commitDataStores(context, remoteHandle, pr_default, "plecfing");
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
      P022O3_A396EmprCod = new String[] {""} ;
      P022O3_A1166LecMaqCod = new String[] {""} ;
      P022O3_A5972LecFinG = new String[] {""} ;
      P022O3_n5972LecFinG = new boolean[] {false} ;
      P022O3_A5961LecBarCodG = new int[1] ;
      P022O3_A5962LecBarReoG = new byte[1] ;
      P022O3_A5963LecBarParG = new String[] {""} ;
      P022O3_A5964LecNumLotG = new int[1] ;
      P022O3_A5965LecFasOrdG = new short[1] ;
      A5972LecFinG = "" ;
      A5963LecBarParG = "" ;
      P022O4_A396EmprCod = new String[] {""} ;
      P022O4_A1166LecMaqCod = new String[] {""} ;
      P022O4_A4345LecCombin = new String[] {""} ;
      P022O4_n4345LecCombin = new boolean[] {false} ;
      A4345LecCombin = "" ;
      P022O6_A396EmprCod = new String[] {""} ;
      P022O6_A1166LecMaqCod = new String[] {""} ;
      P022O6_A1188LecFasOrd = new short[1] ;
      P022O6_n1188LecFasOrd = new boolean[] {false} ;
      P022O6_A4702LecNumLot = new int[1] ;
      P022O6_n4702LecNumLot = new boolean[] {false} ;
      P022O6_A1169LecBarPar = new String[] {""} ;
      P022O6_n1169LecBarPar = new boolean[] {false} ;
      P022O6_A1168LecBarReo = new byte[1] ;
      P022O6_n1168LecBarReo = new boolean[] {false} ;
      P022O6_A1167LecBarCod = new int[1] ;
      P022O6_n1167LecBarCod = new boolean[] {false} ;
      P022O6_A4345LecCombin = new String[] {""} ;
      P022O6_n4345LecCombin = new boolean[] {false} ;
      A1169LecBarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plecfing__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P022O3_A396EmprCod, P022O3_A1166LecMaqCod, P022O3_A5972LecFinG, P022O3_n5972LecFinG, P022O3_A5961LecBarCodG, P022O3_A5962LecBarReoG, P022O3_A5963LecBarParG, P022O3_A5964LecNumLotG, P022O3_A5965LecFasOrdG
            }
            , new Object[] {
            P022O4_A396EmprCod, P022O4_A1166LecMaqCod, P022O4_A4345LecCombin, P022O4_n4345LecCombin
            }
            , new Object[] {
            }
            , new Object[] {
            P022O6_A396EmprCod, P022O6_A1166LecMaqCod, P022O6_A1188LecFasOrd, P022O6_n1188LecFasOrd, P022O6_A4702LecNumLot, P022O6_n4702LecNumLot, P022O6_A1169LecBarPar, P022O6_n1169LecBarPar, P022O6_A1168LecBarReo, P022O6_n1168LecBarReo,
            P022O6_A1167LecBarCod, P022O6_n1167LecBarCod, P022O6_A4345LecCombin, P022O6_n4345LecCombin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30LecBarReoG ;
   private byte AV34Fin_gral ;
   private byte A5962LecBarReoG ;
   private byte A1168LecBarReo ;
   private short AV33LecFasOrdG ;
   private short A5965LecFasOrdG ;
   private short A1188LecFasOrd ;
   private short Gx_err ;
   private int AV29LecBarCodG ;
   private int AV32LecNumLotG ;
   private int A5961LecBarCodG ;
   private int A5964LecNumLotG ;
   private int A4702LecNumLot ;
   private int A1167LecBarCod ;
   private String A396EmprCod ;
   private String A1166LecMaqCod ;
   private String AV31LecBarParG ;
   private String scmdbuf ;
   private String A5972LecFinG ;
   private String A5963LecBarParG ;
   private String A4345LecCombin ;
   private String A1169LecBarPar ;
   private boolean n5972LecFinG ;
   private boolean n4345LecCombin ;
   private boolean n1188LecFasOrd ;
   private boolean n4702LecNumLot ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private short[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P022O3_A396EmprCod ;
   private String[] P022O3_A1166LecMaqCod ;
   private String[] P022O3_A5972LecFinG ;
   private boolean[] P022O3_n5972LecFinG ;
   private int[] P022O3_A5961LecBarCodG ;
   private byte[] P022O3_A5962LecBarReoG ;
   private String[] P022O3_A5963LecBarParG ;
   private int[] P022O3_A5964LecNumLotG ;
   private short[] P022O3_A5965LecFasOrdG ;
   private String[] P022O4_A396EmprCod ;
   private String[] P022O4_A1166LecMaqCod ;
   private String[] P022O4_A4345LecCombin ;
   private boolean[] P022O4_n4345LecCombin ;
   private String[] P022O6_A396EmprCod ;
   private String[] P022O6_A1166LecMaqCod ;
   private short[] P022O6_A1188LecFasOrd ;
   private boolean[] P022O6_n1188LecFasOrd ;
   private int[] P022O6_A4702LecNumLot ;
   private boolean[] P022O6_n4702LecNumLot ;
   private String[] P022O6_A1169LecBarPar ;
   private boolean[] P022O6_n1169LecBarPar ;
   private byte[] P022O6_A1168LecBarReo ;
   private boolean[] P022O6_n1168LecBarReo ;
   private int[] P022O6_A1167LecBarCod ;
   private boolean[] P022O6_n1167LecBarCod ;
   private String[] P022O6_A4345LecCombin ;
   private boolean[] P022O6_n4345LecCombin ;
}

final  class plecfing__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P022O2", "DELETE FROM TXPLECLAV  WHERE EmprCod = ? and LecMaqCod = ? and LecBarCodG = ? and LecBarReoG = ? and LecBarParG = ? and LecNumLotG = ? and LecFasOrdG = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECLAV")
         ,new ForEachCursor("P022O3", "SELECT EmprCod, LecMaqCod, LecFinG, LecBarCodG, LecBarReoG, LecBarParG, LecNumLotG, LecFasOrdG FROM TXPLECLAV WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P022O4", "SELECT EmprCod, LecMaqCod, LecCombin FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P022O5", "UPDATE TXPLECTOR SET LecCombin=?  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
         ,new ForEachCursor("P022O6", "SELECT EmprCod, LecMaqCod, LecFasOrd, LecNumLot, LecBarPar, LecBarReo, LecBarCod, LecCombin FROM TXPLECTOR WHERE (EmprCod = ? and LecMaqCod = ?) AND (LecBarCod = ?) AND (LecBarReo = ?) AND (LecBarPar = ?) AND (LecNumLot = ?) AND (LecFasOrd = ?) ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P022O7", "UPDATE TXPLECTOR SET LecCombin=?  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

