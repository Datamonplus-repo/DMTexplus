package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbofor2 extends GXProcedure
{
   public pbofor2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbofor2.class ), "" );
   }

   public pbofor2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      pbofor2.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pbofor2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbofor2.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      pbofor2.this.AV17ForSer = aP2[0];
      this.aP2 = aP2;
      pbofor2.this.AV18ForColNom = aP3[0];
      this.aP3 = aP3;
      pbofor2.this.AV19ForColNum = aP4[0];
      this.aP4 = aP4;
      pbofor2.this.AV20TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00NV2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P00NV2_A831TipColCod[0] ;
         A483ForColNum = P00NV2_A483ForColNum[0] ;
         A482ForColNom = P00NV2_A482ForColNom[0] ;
         A494ForSer = P00NV2_A494ForSer[0] ;
         A252CliCod = P00NV2_A252CliCod[0] ;
         A396EmprCod = P00NV2_A396EmprCod[0] ;
         A2749ForPro = P00NV2_A2749ForPro[0] ;
         n2749ForPro = P00NV2_n2749ForPro[0] ;
         A486ForNumCol = P00NV2_A486ForNumCol[0] ;
         AV22ForNumCol = A486ForNumCol ;
         /* Optimized DELETE. */
         /* Using cursor P00NV3 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00NV4 */
         pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
         /* End optimized DELETE. */
         /* Execute user subroutine: 'BUSFOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P00NV5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSFOR' Routine */
      returnInSub = false ;
      AV21Flag = (byte)(0) ;
      /* Optimized group. */
      /* Using cursor P00NV6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV22ForNumCol)});
      cV21Flag = P00NV6_AV21Flag[0] ;
      pr_default.close(4);
      AV21Flag = (byte)(AV21Flag+cV21Flag*1) ;
      /* End optimized group. */
      if ( AV21Flag == 1 )
      {
         GXv_char1[0] = AV15EmprCod ;
         GXv_int2[0] = AV22ForNumCol ;
         new app.pborfor2(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         pbofor2.this.AV15EmprCod = GXv_char1[0] ;
         pbofor2.this.AV22ForNumCol = GXv_int2[0] ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbofor2.this.AV15EmprCod;
      this.aP1[0] = pbofor2.this.AV16CliCod;
      this.aP2[0] = pbofor2.this.AV17ForSer;
      this.aP3[0] = pbofor2.this.AV18ForColNom;
      this.aP4[0] = pbofor2.this.AV19ForColNum;
      this.aP5[0] = pbofor2.this.AV20TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbofor2");
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
      P00NV2_A831TipColCod = new byte[1] ;
      P00NV2_A483ForColNum = new int[1] ;
      P00NV2_A482ForColNom = new String[] {""} ;
      P00NV2_A494ForSer = new String[] {""} ;
      P00NV2_A252CliCod = new int[1] ;
      P00NV2_A396EmprCod = new String[] {""} ;
      P00NV2_A2749ForPro = new String[] {""} ;
      P00NV2_n2749ForPro = new boolean[] {false} ;
      P00NV2_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A2749ForPro = "" ;
      P00NV6_AV21Flag = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbofor2__default(),
         new Object[] {
             new Object[] {
            P00NV2_A831TipColCod, P00NV2_A483ForColNum, P00NV2_A482ForColNom, P00NV2_A494ForSer, P00NV2_A252CliCod, P00NV2_A396EmprCod, P00NV2_A2749ForPro, P00NV2_n2749ForPro, P00NV2_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00NV6_AV21Flag
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TipColCod ;
   private byte A831TipColCod ;
   private byte AV21Flag ;
   private byte cV21Flag ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV19ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int AV22ForNumCol ;
   private int GXv_int2[] ;
   private String AV15EmprCod ;
   private String AV17ForSer ;
   private String AV18ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A2749ForPro ;
   private String GXv_char1[] ;
   private boolean n2749ForPro ;
   private boolean returnInSub ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00NV2_A831TipColCod ;
   private int[] P00NV2_A483ForColNum ;
   private String[] P00NV2_A482ForColNom ;
   private String[] P00NV2_A494ForSer ;
   private int[] P00NV2_A252CliCod ;
   private String[] P00NV2_A396EmprCod ;
   private String[] P00NV2_A2749ForPro ;
   private boolean[] P00NV2_n2749ForPro ;
   private int[] P00NV2_A486ForNumCol ;
   private byte[] P00NV6_AV21Flag ;
}

final  class pbofor2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NV2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForPro, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00NV3", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P00NV4", "DELETE FROM TXPLOBFOR  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
         ,new UpdateCursor("P00NV5", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P00NV6", "SELECT COUNT(*) FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

