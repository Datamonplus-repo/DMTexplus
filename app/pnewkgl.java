package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewkgl extends GXProcedure
{
   public pnewkgl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewkgl.class ), "" );
   }

   public pnewkgl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pnewkgl.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pnewkgl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewkgl.this.AV8Fecha = aP1[0];
      this.aP1 = aP1;
      pnewkgl.this.AV9LzaKgs = aP2[0];
      this.aP2 = aP2;
      pnewkgl.this.AV10LzaConos = aP3[0];
      this.aP3 = aP3;
      pnewkgl.this.AV11LzaTipDis = aP4[0];
      this.aP4 = aP4;
      pnewkgl.this.AV12LzaMaqCod = aP5[0];
      this.aP5 = aP5;
      pnewkgl.this.AV16LzaBarCod = aP6[0];
      this.aP6 = aP6;
      pnewkgl.this.AV17LzaBarReo = aP7[0];
      this.aP7 = aP7;
      pnewkgl.this.AV18LzaBarPar = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Dia = (byte)(GXutil.day( AV8Fecha)) ;
      AV14Mes = (byte)(GXutil.month( AV8Fecha)) ;
      AV15Any = (short)(GXutil.year( AV8Fecha)) ;
      AV19LzaLin = (byte)(0) ;
      /* Using cursor P00IV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(AV13Dia), Byte.valueOf(AV14Mes), Short.valueOf(AV15Any)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2944LzaAny = P00IV2_A2944LzaAny[0] ;
         A2943LzaMes = P00IV2_A2943LzaMes[0] ;
         A2942LzaDia = P00IV2_A2942LzaDia[0] ;
         A2946LzaLin = P00IV2_A2946LzaLin[0] ;
         A2947LzaBarCod = P00IV2_A2947LzaBarCod[0] ;
         A2948LzaBarReo = P00IV2_A2948LzaBarReo[0] ;
         A2949LzaBarPar = P00IV2_A2949LzaBarPar[0] ;
         AV19LzaLin = A2946LzaLin ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV19LzaLin = (byte)(A2946LzaLin+1) ;
      /*
         INSERT RECORD ON TABLE TXPCKGSLA

      */
      A2942LzaDia = AV13Dia ;
      A2943LzaMes = AV14Mes ;
      A2944LzaAny = AV15Any ;
      A2945LzaUltLin = AV19LzaLin ;
      n2945LzaUltLin = false ;
      /* Using cursor P00IV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Byte.valueOf(A2942LzaDia), Byte.valueOf(A2943LzaMes), Short.valueOf(A2944LzaAny), Boolean.valueOf(n2945LzaUltLin), Byte.valueOf(A2945LzaUltLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCKGSLA");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n2945LzaUltLin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00IV4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n2945LzaUltLin), Byte.valueOf(AV19LzaLin), A396EmprCod, Byte.valueOf(A2942LzaDia), Byte.valueOf(A2943LzaMes), Short.valueOf(A2944LzaAny)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCKGSLA");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPLKGSLA

      */
      A2942LzaDia = AV13Dia ;
      A2943LzaMes = AV14Mes ;
      A2944LzaAny = AV15Any ;
      A2946LzaLin = AV19LzaLin ;
      A2947LzaBarCod = AV16LzaBarCod ;
      A2948LzaBarReo = AV17LzaBarReo ;
      A2949LzaBarPar = AV18LzaBarPar ;
      A2950LzaKgs = AV9LzaKgs ;
      n2950LzaKgs = false ;
      A2951LzaConos = AV10LzaConos ;
      n2951LzaConos = false ;
      A2952LzaTipDis = AV11LzaTipDis ;
      n2952LzaTipDis = false ;
      A2953LzaMaqCod = AV12LzaMaqCod ;
      n2953LzaMaqCod = false ;
      /* Using cursor P00IV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A2942LzaDia), Byte.valueOf(A2943LzaMes), Short.valueOf(A2944LzaAny), Byte.valueOf(A2946LzaLin), Integer.valueOf(A2947LzaBarCod), Byte.valueOf(A2948LzaBarReo), A2949LzaBarPar, Boolean.valueOf(n2950LzaKgs), A2950LzaKgs, Boolean.valueOf(n2951LzaConos), Short.valueOf(A2951LzaConos), Boolean.valueOf(n2952LzaTipDis), A2952LzaTipDis, Boolean.valueOf(n2953LzaMaqCod), A2953LzaMaqCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLKGSLA");
      if ( (pr_default.getStatus(3) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewkgl.this.A396EmprCod;
      this.aP1[0] = pnewkgl.this.AV8Fecha;
      this.aP2[0] = pnewkgl.this.AV9LzaKgs;
      this.aP3[0] = pnewkgl.this.AV10LzaConos;
      this.aP4[0] = pnewkgl.this.AV11LzaTipDis;
      this.aP5[0] = pnewkgl.this.AV12LzaMaqCod;
      this.aP6[0] = pnewkgl.this.AV16LzaBarCod;
      this.aP7[0] = pnewkgl.this.AV17LzaBarReo;
      this.aP8[0] = pnewkgl.this.AV18LzaBarPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewkgl");
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
      P00IV2_A396EmprCod = new String[] {""} ;
      P00IV2_A2944LzaAny = new short[1] ;
      P00IV2_A2943LzaMes = new byte[1] ;
      P00IV2_A2942LzaDia = new byte[1] ;
      P00IV2_A2946LzaLin = new byte[1] ;
      P00IV2_A2947LzaBarCod = new int[1] ;
      P00IV2_A2948LzaBarReo = new byte[1] ;
      P00IV2_A2949LzaBarPar = new String[] {""} ;
      A2949LzaBarPar = "" ;
      Gx_emsg = "" ;
      A2950LzaKgs = DecimalUtil.ZERO ;
      A2952LzaTipDis = "" ;
      A2953LzaMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewkgl__default(),
         new Object[] {
             new Object[] {
            P00IV2_A396EmprCod, P00IV2_A2944LzaAny, P00IV2_A2943LzaMes, P00IV2_A2942LzaDia, P00IV2_A2946LzaLin, P00IV2_A2947LzaBarCod, P00IV2_A2948LzaBarReo, P00IV2_A2949LzaBarPar
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

   private byte AV17LzaBarReo ;
   private byte AV13Dia ;
   private byte AV14Mes ;
   private byte AV19LzaLin ;
   private byte A2943LzaMes ;
   private byte A2942LzaDia ;
   private byte A2946LzaLin ;
   private byte A2948LzaBarReo ;
   private byte A2945LzaUltLin ;
   private short AV10LzaConos ;
   private short AV15Any ;
   private short A2944LzaAny ;
   private short Gx_err ;
   private short A2951LzaConos ;
   private int AV16LzaBarCod ;
   private int A2947LzaBarCod ;
   private int GX_INS435 ;
   private int GX_INS436 ;
   private java.math.BigDecimal AV9LzaKgs ;
   private java.math.BigDecimal A2950LzaKgs ;
   private String A396EmprCod ;
   private String AV11LzaTipDis ;
   private String AV12LzaMaqCod ;
   private String AV18LzaBarPar ;
   private String scmdbuf ;
   private String A2949LzaBarPar ;
   private String Gx_emsg ;
   private String A2952LzaTipDis ;
   private String A2953LzaMaqCod ;
   private java.util.Date AV8Fecha ;
   private boolean n2945LzaUltLin ;
   private boolean n2950LzaKgs ;
   private boolean n2951LzaConos ;
   private boolean n2952LzaTipDis ;
   private boolean n2953LzaMaqCod ;
   private String[] aP8 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00IV2_A396EmprCod ;
   private short[] P00IV2_A2944LzaAny ;
   private byte[] P00IV2_A2943LzaMes ;
   private byte[] P00IV2_A2942LzaDia ;
   private byte[] P00IV2_A2946LzaLin ;
   private int[] P00IV2_A2947LzaBarCod ;
   private byte[] P00IV2_A2948LzaBarReo ;
   private String[] P00IV2_A2949LzaBarPar ;
}

final  class pnewkgl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00IV2", "SELECT EmprCod, LzaAny, LzaMes, LzaDia, LzaLin, LzaBarCod, LzaBarReo, LzaBarPar FROM TXPLKGSLA WHERE EmprCod = ? and LzaDia = ? and LzaMes = ? and LzaAny = ? ORDER BY EmprCod, LzaDia, LzaMes, LzaAny, LzaLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00IV3", "INSERT INTO TXPCKGSLA(EmprCod, LzaDia, LzaMes, LzaAny, LzaUltLin) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCKGSLA")
         ,new UpdateCursor("P00IV4", "UPDATE TXPCKGSLA SET LzaUltLin=?  WHERE EmprCod = ? and LzaDia = ? and LzaMes = ? and LzaAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCKGSLA")
         ,new UpdateCursor("P00IV5", "INSERT INTO TXPLKGSLA(EmprCod, LzaDia, LzaMes, LzaAny, LzaLin, LzaBarCod, LzaBarReo, LzaBarPar, LzaKgs, LzaConos, LzaTipDis, LzaMaqCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLKGSLA")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 6);
               }
               return;
      }
   }

}

