package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc219 extends GXProcedure
{
   public pprc219( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc219.class ), "" );
   }

   public pprc219( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc219.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pprc219.this.AV8emprcod = aP0[0];
      this.aP0 = aP0;
      pprc219.this.AV9barcod = aP1[0];
      this.aP1 = aP1;
      pprc219.this.AV10barcodreo = aP2[0];
      this.aP2 = aP2;
      pprc219.this.AV11barcodpar = aP3[0];
      this.aP3 = aP3;
      pprc219.this.AV12reclinmaq = aP4[0];
      this.aP4 = aP4;
      pprc219.this.AV13Maqcod = aP5[0];
      this.aP5 = aP5;
      pprc219.this.AV14Usurcod = aP6[0];
      this.aP6 = aP6;
      pprc219.this.AV15station = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05TT2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05TT2_A130BarCodPar[0] ;
         A132BarCodReo = P05TT2_A132BarCodReo[0] ;
         A129BarCod = P05TT2_A129BarCod[0] ;
         A396EmprCod = P05TT2_A396EmprCod[0] ;
         A180BarMaqCod = P05TT2_A180BarMaqCod[0] ;
         A120BarAgrEst = P05TT2_A120BarAgrEst[0] ;
         AV16Inc_obs = httpContext.getMessage( "BARCAD.Cambio Maquina ", "") + A180BarMaqCod + httpContext.getMessage( " por ", "") + AV13Maqcod + GXutil.newLine( ) ;
         A180BarMaqCod = AV13Maqcod ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV14Usurcod, AV15station, AV16Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P05TT3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A119BarAgrCod = P05TT3_A119BarAgrCod[0] ;
               A124BarAgrReo = P05TT3_A124BarAgrReo[0] ;
               A122BarAgrPar = P05TT3_A122BarAgrPar[0] ;
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A119BarAgrCod ;
               GXv_int3[0] = A124BarAgrReo ;
               GXv_char4[0] = A122BarAgrPar ;
               GXv_char5[0] = AV13Maqcod ;
               GXv_char6[0] = AV14Usurcod ;
               GXv_char7[0] = AV15station ;
               new app.pprc206(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
               pprc219.this.A396EmprCod = GXv_char1[0] ;
               pprc219.this.A119BarAgrCod = GXv_int2[0] ;
               pprc219.this.A124BarAgrReo = GXv_int3[0] ;
               pprc219.this.A122BarAgrPar = GXv_char4[0] ;
               pprc219.this.AV13Maqcod = GXv_char5[0] ;
               pprc219.this.AV14Usurcod = GXv_char6[0] ;
               pprc219.this.AV15station = GXv_char7[0] ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Using cursor P05TT4 */
         pr_default.execute(2, new Object[] {A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05TT5 */
      pr_default.execute(3, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar, Short.valueOf(AV12reclinmaq), AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar, Short.valueOf(AV12reclinmaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2804RecLinMaq = P05TT5_A2804RecLinMaq[0] ;
         A130BarCodPar = P05TT5_A130BarCodPar[0] ;
         A132BarCodReo = P05TT5_A132BarCodReo[0] ;
         A129BarCod = P05TT5_A129BarCod[0] ;
         A396EmprCod = P05TT5_A396EmprCod[0] ;
         A602MaqCod = P05TT5_A602MaqCod[0] ;
         /* Using cursor P05TT6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A180BarMaqCod = P05TT6_A180BarMaqCod[0] ;
         AV16Inc_obs = httpContext.getMessage( "RECMAQ.Cambio Maquina ", "") + A602MaqCod + httpContext.getMessage( " por ", "") + AV13Maqcod + GXutil.newLine( ) ;
         AV16Inc_obs += "# " + GXutil.str( AV12reclinmaq, 4, 0) ;
         A180BarMaqCod = AV13Maqcod ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV14Usurcod, AV15station, AV16Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P05TT7 */
         pr_default.execute(5, new Object[] {A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc219.this.AV8emprcod;
      this.aP1[0] = pprc219.this.AV9barcod;
      this.aP2[0] = pprc219.this.AV10barcodreo;
      this.aP3[0] = pprc219.this.AV11barcodpar;
      this.aP4[0] = pprc219.this.AV12reclinmaq;
      this.aP5[0] = pprc219.this.AV13Maqcod;
      this.aP6[0] = pprc219.this.AV14Usurcod;
      this.aP7[0] = pprc219.this.AV15station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc219");
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
      P05TT2_A130BarCodPar = new String[] {""} ;
      P05TT2_A132BarCodReo = new byte[1] ;
      P05TT2_A129BarCod = new int[1] ;
      P05TT2_A396EmprCod = new String[] {""} ;
      P05TT2_A180BarMaqCod = new String[] {""} ;
      P05TT2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      AV16Inc_obs = "" ;
      AV20Pgmname = "" ;
      P05TT3_A396EmprCod = new String[] {""} ;
      P05TT3_A129BarCod = new int[1] ;
      P05TT3_A132BarCodReo = new byte[1] ;
      P05TT3_A130BarCodPar = new String[] {""} ;
      P05TT3_A119BarAgrCod = new int[1] ;
      P05TT3_A124BarAgrReo = new byte[1] ;
      P05TT3_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      P05TT5_A2804RecLinMaq = new short[1] ;
      P05TT5_A130BarCodPar = new String[] {""} ;
      P05TT5_A132BarCodReo = new byte[1] ;
      P05TT5_A129BarCod = new int[1] ;
      P05TT5_A396EmprCod = new String[] {""} ;
      P05TT5_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      P05TT6_A180BarMaqCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc219__default(),
         new Object[] {
             new Object[] {
            P05TT2_A130BarCodPar, P05TT2_A132BarCodReo, P05TT2_A129BarCod, P05TT2_A396EmprCod, P05TT2_A180BarMaqCod, P05TT2_A120BarAgrEst
            }
            , new Object[] {
            P05TT3_A396EmprCod, P05TT3_A129BarCod, P05TT3_A132BarCodReo, P05TT3_A130BarCodPar, P05TT3_A119BarAgrCod, P05TT3_A124BarAgrReo, P05TT3_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            P05TT5_A2804RecLinMaq, P05TT5_A130BarCodPar, P05TT5_A132BarCodReo, P05TT5_A129BarCod, P05TT5_A396EmprCod, P05TT5_A602MaqCod
            }
            , new Object[] {
            P05TT6_A180BarMaqCod
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PPrc219" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PPrc219" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private short AV12reclinmaq ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV9barcod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private String AV8emprcod ;
   private String AV11barcodpar ;
   private String AV13Maqcod ;
   private String AV14Usurcod ;
   private String AV15station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String AV20Pgmname ;
   private String A122BarAgrPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String A602MaqCod ;
   private String AV16Inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P05TT2_A130BarCodPar ;
   private byte[] P05TT2_A132BarCodReo ;
   private int[] P05TT2_A129BarCod ;
   private String[] P05TT2_A396EmprCod ;
   private String[] P05TT2_A180BarMaqCod ;
   private String[] P05TT2_A120BarAgrEst ;
   private String[] P05TT3_A396EmprCod ;
   private int[] P05TT3_A129BarCod ;
   private byte[] P05TT3_A132BarCodReo ;
   private String[] P05TT3_A130BarCodPar ;
   private int[] P05TT3_A119BarAgrCod ;
   private byte[] P05TT3_A124BarAgrReo ;
   private String[] P05TT3_A122BarAgrPar ;
   private short[] P05TT5_A2804RecLinMaq ;
   private String[] P05TT5_A130BarCodPar ;
   private byte[] P05TT5_A132BarCodReo ;
   private int[] P05TT5_A129BarCod ;
   private String[] P05TT5_A396EmprCod ;
   private String[] P05TT5_A602MaqCod ;
   private String[] P05TT6_A180BarMaqCod ;
}

final  class pprc219__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05TT2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarMaqCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TT3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05TT4", "UPDATE TXPBARCAD SET BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P05TT5", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, MaqCod FROM TXPRECMAQ WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TT6", "SELECT BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05TT7", "UPDATE TXPBARCAD SET BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

