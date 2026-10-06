package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc221 extends GXProcedure
{
   public pprc221( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc221.class ), "" );
   }

   public pprc221( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprc221.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc221.this.AV8emprcod = aP0[0];
      this.aP0 = aP0;
      pprc221.this.AV9barcod = aP1[0];
      this.aP1 = aP1;
      pprc221.this.AV10barcodreo = aP2[0];
      this.aP2 = aP2;
      pprc221.this.AV11barcodpar = aP3[0];
      this.aP3 = aP3;
      pprc221.this.AV13Maqcod = aP4[0];
      this.aP4 = aP4;
      pprc221.this.AV14Usurcod = aP5[0];
      this.aP5 = aP5;
      pprc221.this.AV15station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05UB2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05UB2_A130BarCodPar[0] ;
         A132BarCodReo = P05UB2_A132BarCodReo[0] ;
         A129BarCod = P05UB2_A129BarCod[0] ;
         A396EmprCod = P05UB2_A396EmprCod[0] ;
         A180BarMaqCod = P05UB2_A180BarMaqCod[0] ;
         A120BarAgrEst = P05UB2_A120BarAgrEst[0] ;
         AV16Inc_obs = httpContext.getMessage( "BARCAD.Delete Maquina ", "") + A180BarMaqCod + httpContext.getMessage( " por ", "") + AV13Maqcod + GXutil.newLine( ) ;
         A180BarMaqCod = AV13Maqcod ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV14Usurcod, AV15station, AV16Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P05UB3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A119BarAgrCod = P05UB3_A119BarAgrCod[0] ;
               A124BarAgrReo = P05UB3_A124BarAgrReo[0] ;
               A122BarAgrPar = P05UB3_A122BarAgrPar[0] ;
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A119BarAgrCod ;
               GXv_int3[0] = A124BarAgrReo ;
               GXv_char4[0] = A122BarAgrPar ;
               GXv_char5[0] = AV13Maqcod ;
               GXv_char6[0] = AV14Usurcod ;
               GXv_char7[0] = AV15station ;
               new app.pprc206(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
               pprc221.this.A396EmprCod = GXv_char1[0] ;
               pprc221.this.A119BarAgrCod = GXv_int2[0] ;
               pprc221.this.A124BarAgrReo = GXv_int3[0] ;
               pprc221.this.A122BarAgrPar = GXv_char4[0] ;
               pprc221.this.AV13Maqcod = GXv_char5[0] ;
               pprc221.this.AV14Usurcod = GXv_char6[0] ;
               pprc221.this.AV15station = GXv_char7[0] ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Using cursor P05UB4 */
         pr_default.execute(2, new Object[] {A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc221.this.AV8emprcod;
      this.aP1[0] = pprc221.this.AV9barcod;
      this.aP2[0] = pprc221.this.AV10barcodreo;
      this.aP3[0] = pprc221.this.AV11barcodpar;
      this.aP4[0] = pprc221.this.AV13Maqcod;
      this.aP5[0] = pprc221.this.AV14Usurcod;
      this.aP6[0] = pprc221.this.AV15station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc221");
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
      P05UB2_A130BarCodPar = new String[] {""} ;
      P05UB2_A132BarCodReo = new byte[1] ;
      P05UB2_A129BarCod = new int[1] ;
      P05UB2_A396EmprCod = new String[] {""} ;
      P05UB2_A180BarMaqCod = new String[] {""} ;
      P05UB2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      AV16Inc_obs = "" ;
      AV20Pgmname = "" ;
      P05UB3_A396EmprCod = new String[] {""} ;
      P05UB3_A129BarCod = new int[1] ;
      P05UB3_A132BarCodReo = new byte[1] ;
      P05UB3_A130BarCodPar = new String[] {""} ;
      P05UB3_A119BarAgrCod = new int[1] ;
      P05UB3_A124BarAgrReo = new byte[1] ;
      P05UB3_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc221__default(),
         new Object[] {
             new Object[] {
            P05UB2_A130BarCodPar, P05UB2_A132BarCodReo, P05UB2_A129BarCod, P05UB2_A396EmprCod, P05UB2_A180BarMaqCod, P05UB2_A120BarAgrEst
            }
            , new Object[] {
            P05UB3_A396EmprCod, P05UB3_A129BarCod, P05UB3_A132BarCodReo, P05UB3_A130BarCodPar, P05UB3_A119BarAgrCod, P05UB3_A124BarAgrReo, P05UB3_A122BarAgrPar
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PPrc221" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PPrc221" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
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
   private String AV16Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05UB2_A130BarCodPar ;
   private byte[] P05UB2_A132BarCodReo ;
   private int[] P05UB2_A129BarCod ;
   private String[] P05UB2_A396EmprCod ;
   private String[] P05UB2_A180BarMaqCod ;
   private String[] P05UB2_A120BarAgrEst ;
   private String[] P05UB3_A396EmprCod ;
   private int[] P05UB3_A129BarCod ;
   private byte[] P05UB3_A132BarCodReo ;
   private String[] P05UB3_A130BarCodPar ;
   private int[] P05UB3_A119BarAgrCod ;
   private byte[] P05UB3_A124BarAgrReo ;
   private String[] P05UB3_A122BarAgrPar ;
}

final  class pprc221__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05UB2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarMaqCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05UB3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05UB4", "UPDATE TXPBARCAD SET BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
      }
   }

}

