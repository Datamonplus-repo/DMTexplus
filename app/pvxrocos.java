package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxrocos extends GXProcedure
{
   public pvxrocos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxrocos.class ), "" );
   }

   public pvxrocos( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           byte aP1 )
   {
      pvxrocos.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pvxrocos.this.AV8BarPieCod = aP0;
      pvxrocos.this.AV18Modo = aP1;
      pvxrocos.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13VxLotId = (int)(GXutil.lval( AV8BarPieCod)) ;
      /* Using cursor P05KV2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV13VxLotId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6224VxLotId = P05KV2_A6224VxLotId[0] ;
         A11686VxLotHRT = P05KV2_A11686VxLotHRT[0] ;
         n11686VxLotHRT = P05KV2_n11686VxLotHRT[0] ;
         A6318VxLotCan = P05KV2_A6318VxLotCan[0] ;
         n6318VxLotCan = P05KV2_n6318VxLotCan[0] ;
         A7422VxLotACru = P05KV2_A7422VxLotACru[0] ;
         n7422VxLotACru = P05KV2_n7422VxLotACru[0] ;
         AV9VxOSCod = (int)(GXutil.lval( GXutil.substring( A11686VxLotHRT, 1, 8))) ;
         AV10VxLotCan = A6318VxLotCan ;
         GXt_char1 = AV16VxArtTipo ;
         GXv_char2[0] = GXt_char1 ;
         new app.rvxarttipo(remoteHandle, context).execute( A7422VxLotACru, GXv_char2) ;
         pvxrocos.this.GXt_char1 = GXv_char2[0] ;
         AV16VxArtTipo = GXt_char1 ;
         if ( GXutil.strcmp(AV16VxArtTipo, "TC") == 0 )
         {
            AV19VXOFabTip = httpContext.getMessage( "TE", "") ;
         }
         else if ( GXutil.strcmp(AV16VxArtTipo, "TP") == 0 )
         {
            AV19VXOFabTip = httpContext.getMessage( "TP", "") ;
         }
         else
         {
            AV19VXOFabTip = httpContext.getMessage( "TE", "") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05KV3 */
      pr_default.execute(1, new Object[] {AV19VXOFabTip, Integer.valueOf(AV9VxOSCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A12372VxOSCod = P05KV3_A12372VxOSCod[0] ;
         A7525VxOFabTip = P05KV3_A7525VxOFabTip[0] ;
         A14123VxOsCosKT = P05KV3_A14123VxOsCosKT[0] ;
         n14123VxOsCosKT = P05KV3_n14123VxOsCosKT[0] ;
         A14122VxOsCosKR = P05KV3_A14122VxOsCosKR[0] ;
         n14122VxOsCosKR = P05KV3_n14122VxOsCosKR[0] ;
         AV15CosKgTeo = A14123VxOsCosKT ;
         AV17CosKgReal = A14122VxOsCosKR ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV18Modo == 1 )
      {
         AV12CosRollo = AV10VxLotCan.multiply(AV17CosKgReal) ;
      }
      else if ( AV18Modo == 2 )
      {
         AV12CosRollo = AV10VxLotCan.multiply(AV15CosKgTeo) ;
      }
      else
      {
         AV12CosRollo = AV10VxLotCan.multiply(AV17CosKgReal) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pvxrocos.this.AV12CosRollo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12CosRollo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05KV2_A6224VxLotId = new int[1] ;
      P05KV2_A11686VxLotHRT = new String[] {""} ;
      P05KV2_n11686VxLotHRT = new boolean[] {false} ;
      P05KV2_A6318VxLotCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KV2_n6318VxLotCan = new boolean[] {false} ;
      P05KV2_A7422VxLotACru = new String[] {""} ;
      P05KV2_n7422VxLotACru = new boolean[] {false} ;
      A11686VxLotHRT = "" ;
      A6318VxLotCan = DecimalUtil.ZERO ;
      A7422VxLotACru = "" ;
      AV10VxLotCan = DecimalUtil.ZERO ;
      AV16VxArtTipo = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV19VXOFabTip = "" ;
      P05KV3_A12372VxOSCod = new int[1] ;
      P05KV3_A7525VxOFabTip = new String[] {""} ;
      P05KV3_A14123VxOsCosKT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KV3_n14123VxOsCosKT = new boolean[] {false} ;
      P05KV3_A14122VxOsCosKR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KV3_n14122VxOsCosKR = new boolean[] {false} ;
      A7525VxOFabTip = "" ;
      A14123VxOsCosKT = DecimalUtil.ZERO ;
      A14122VxOsCosKR = DecimalUtil.ZERO ;
      AV15CosKgTeo = DecimalUtil.ZERO ;
      AV17CosKgReal = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxrocos__default(),
         new Object[] {
             new Object[] {
            P05KV2_A6224VxLotId, P05KV2_A11686VxLotHRT, P05KV2_n11686VxLotHRT, P05KV2_A6318VxLotCan, P05KV2_n6318VxLotCan, P05KV2_A7422VxLotACru, P05KV2_n7422VxLotACru
            }
            , new Object[] {
            P05KV3_A12372VxOSCod, P05KV3_A7525VxOFabTip, P05KV3_A14123VxOsCosKT, P05KV3_n14123VxOsCosKT, P05KV3_A14122VxOsCosKR, P05KV3_n14122VxOsCosKR
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Modo ;
   private short Gx_err ;
   private int AV13VxLotId ;
   private int A6224VxLotId ;
   private int AV9VxOSCod ;
   private int A12372VxOSCod ;
   private java.math.BigDecimal AV12CosRollo ;
   private java.math.BigDecimal A6318VxLotCan ;
   private java.math.BigDecimal AV10VxLotCan ;
   private java.math.BigDecimal A14123VxOsCosKT ;
   private java.math.BigDecimal A14122VxOsCosKR ;
   private java.math.BigDecimal AV15CosKgTeo ;
   private java.math.BigDecimal AV17CosKgReal ;
   private String AV8BarPieCod ;
   private String scmdbuf ;
   private String A11686VxLotHRT ;
   private String A7422VxLotACru ;
   private String AV16VxArtTipo ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV19VXOFabTip ;
   private String A7525VxOFabTip ;
   private boolean n11686VxLotHRT ;
   private boolean n6318VxLotCan ;
   private boolean n7422VxLotACru ;
   private boolean n14123VxOsCosKT ;
   private boolean n14122VxOsCosKR ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P05KV2_A6224VxLotId ;
   private String[] P05KV2_A11686VxLotHRT ;
   private boolean[] P05KV2_n11686VxLotHRT ;
   private java.math.BigDecimal[] P05KV2_A6318VxLotCan ;
   private boolean[] P05KV2_n6318VxLotCan ;
   private String[] P05KV2_A7422VxLotACru ;
   private boolean[] P05KV2_n7422VxLotACru ;
   private int[] P05KV3_A12372VxOSCod ;
   private String[] P05KV3_A7525VxOFabTip ;
   private java.math.BigDecimal[] P05KV3_A14123VxOsCosKT ;
   private boolean[] P05KV3_n14123VxOsCosKT ;
   private java.math.BigDecimal[] P05KV3_A14122VxOsCosKR ;
   private boolean[] P05KV3_n14122VxOsCosKR ;
}

final  class pvxrocos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05KV2", "SELECT STeLotId, STeHRTej, SteCanCre, STeArtCre FROM VTXSTKTE WHERE STeLotId = ? ORDER BY STeLotId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05KV3", "SELECT OSCod, OFabTip, VxOsCosKT, VxOsCosKR FROM VTXOSERVI WHERE OFabTip = ? and OSCod = ? ORDER BY OFabTip, OSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

