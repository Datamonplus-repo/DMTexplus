package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prec1 extends GXProcedure
{
   public prec1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prec1.class ), "" );
   }

   public prec1( int remoteHandle ,
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
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      prec1.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 )
   {
      prec1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prec1.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prec1.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prec1.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prec1.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      prec1.this.AV8Maqcod = aP5[0];
      this.aP5 = aP5;
      prec1.this.AV9Recvolprd = aP6[0];
      this.aP6 = aP6;
      prec1.this.AV10Recfa = aP7[0];
      this.aP7 = aP7;
      prec1.this.AV11RecNumprg = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      prec1.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      prec1.this.A396EmprCod = GXv_char2[0] ;
      prec1.this.AV13EmprNom = GXv_char3[0] ;
      prec1.this.AV14UsurCod = GXv_char4[0] ;
      GXt_int5 = AV16etm ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int6) ;
      prec1.this.GXt_int5 = GXv_int6[0] ;
      AV16etm = GXt_int5 ;
      /* Using cursor P04LE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P04LE2_A602MaqCod[0] ;
         A2806RecFA = P04LE2_A2806RecFA[0] ;
         A5110RecNumPrg = P04LE2_A5110RecNumPrg[0] ;
         A2805RecVolPrd = P04LE2_A2805RecVolPrd[0] ;
         A5431RecPriPla = P04LE2_A5431RecPriPla[0] ;
         n5431RecPriPla = P04LE2_n5431RecPriPla[0] ;
         /* Using cursor P04LE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A3594BarPriTin = P04LE3_A3594BarPriTin[0] ;
         A180BarMaqCod = P04LE3_A180BarMaqCod[0] ;
         A120BarAgrEst = P04LE3_A120BarAgrEst[0] ;
         AV15Inc_obs = httpContext.getMessage( "Cambio Datos RECMAQ", "") + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Maquina  ", "") + A602MaqCod + " -> " + AV8Maqcod + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Fact Abs ", "") + GXutil.str( A2806RecFA, 6, 2) + " -> " + GXutil.str( AV10Recfa, 6, 2) + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "N Prog   ", "") + A5110RecNumPrg + " -> " + AV11RecNumprg + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Volumen  ", "") + GXutil.str( A2805RecVolPrd, 5, 0) + " -> " + GXutil.str( AV9Recvolprd, 5, 0) + GXutil.newLine( ) ;
         if ( ( GXutil.strcmp(A602MaqCod, AV8Maqcod) != 0 ) && ( AV16etm == 1 ) )
         {
            AV15Inc_obs += httpContext.getMessage( "Cambio PP  ", "") + GXutil.str( A5431RecPriPla, 2, 0) + " -> " + "80" + GXutil.newLine( ) ;
         }
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV14UsurCod, AV12Station, AV15Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         A5431RecPriPla = (byte)(((AV16etm==0) ? A5431RecPriPla : ((GXutil.strcmp(A602MaqCod, AV8Maqcod)!=0) ? 80 : A5431RecPriPla))) ;
         n5431RecPriPla = false ;
         A3594BarPriTin = (byte)(((AV16etm==0) ? A3594BarPriTin : ((GXutil.strcmp(A602MaqCod, AV8Maqcod)!=0) ? 80 : A3594BarPriTin))) ;
         A602MaqCod = AV8Maqcod ;
         A2806RecFA = AV10Recfa ;
         A5110RecNumPrg = AV11RecNumprg ;
         A2805RecVolPrd = AV9Recvolprd ;
         A180BarMaqCod = AV8Maqcod ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P04LE4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A119BarAgrCod = P04LE4_A119BarAgrCod[0] ;
               A124BarAgrReo = P04LE4_A124BarAgrReo[0] ;
               A122BarAgrPar = P04LE4_A122BarAgrPar[0] ;
               GXv_char4[0] = A396EmprCod ;
               GXv_int7[0] = A119BarAgrCod ;
               GXv_int6[0] = A124BarAgrReo ;
               GXv_char3[0] = A122BarAgrPar ;
               GXv_char2[0] = AV8Maqcod ;
               GXv_int8[0] = AV9Recvolprd ;
               new app.pagrrec1(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_int8) ;
               prec1.this.A396EmprCod = GXv_char4[0] ;
               prec1.this.A119BarAgrCod = GXv_int7[0] ;
               prec1.this.A124BarAgrReo = GXv_int6[0] ;
               prec1.this.A122BarAgrPar = GXv_char3[0] ;
               prec1.this.AV8Maqcod = GXv_char2[0] ;
               prec1.this.AV9Recvolprd = GXv_int8[0] ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         /* Using cursor P04LE5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A3594BarPriTin), A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Using cursor P04LE6 */
         pr_default.execute(4, new Object[] {A602MaqCod, A2806RecFA, A5110RecNumPrg, Integer.valueOf(A2805RecVolPrd), Boolean.valueOf(n5431RecPriPla), Byte.valueOf(A5431RecPriPla), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prec1.this.A396EmprCod;
      this.aP1[0] = prec1.this.A129BarCod;
      this.aP2[0] = prec1.this.A132BarCodReo;
      this.aP3[0] = prec1.this.A130BarCodPar;
      this.aP4[0] = prec1.this.A2804RecLinMaq;
      this.aP5[0] = prec1.this.AV8Maqcod;
      this.aP6[0] = prec1.this.AV9Recvolprd;
      this.aP7[0] = prec1.this.AV10Recfa;
      this.aP8[0] = prec1.this.AV11RecNumprg;
      Application.commitDataStores(context, remoteHandle, pr_default, "prec1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV13EmprNom = "" ;
      AV14UsurCod = "" ;
      scmdbuf = "" ;
      P04LE2_A396EmprCod = new String[] {""} ;
      P04LE2_A129BarCod = new int[1] ;
      P04LE2_A132BarCodReo = new byte[1] ;
      P04LE2_A130BarCodPar = new String[] {""} ;
      P04LE2_A2804RecLinMaq = new short[1] ;
      P04LE2_A602MaqCod = new String[] {""} ;
      P04LE2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04LE2_A5110RecNumPrg = new String[] {""} ;
      P04LE2_A2805RecVolPrd = new int[1] ;
      P04LE2_A5431RecPriPla = new byte[1] ;
      P04LE2_n5431RecPriPla = new boolean[] {false} ;
      A602MaqCod = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A5110RecNumPrg = "" ;
      P04LE3_A3594BarPriTin = new byte[1] ;
      P04LE3_A180BarMaqCod = new String[] {""} ;
      P04LE3_A120BarAgrEst = new String[] {""} ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      AV15Inc_obs = "" ;
      AV20Pgmname = "" ;
      P04LE4_A396EmprCod = new String[] {""} ;
      P04LE4_A129BarCod = new int[1] ;
      P04LE4_A132BarCodReo = new byte[1] ;
      P04LE4_A130BarCodPar = new String[] {""} ;
      P04LE4_A119BarAgrCod = new int[1] ;
      P04LE4_A124BarAgrReo = new byte[1] ;
      P04LE4_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prec1__default(),
         new Object[] {
             new Object[] {
            P04LE2_A396EmprCod, P04LE2_A129BarCod, P04LE2_A132BarCodReo, P04LE2_A130BarCodPar, P04LE2_A2804RecLinMaq, P04LE2_A602MaqCod, P04LE2_A2806RecFA, P04LE2_A5110RecNumPrg, P04LE2_A2805RecVolPrd, P04LE2_A5431RecPriPla,
            P04LE2_n5431RecPriPla
            }
            , new Object[] {
            P04LE3_A3594BarPriTin, P04LE3_A180BarMaqCod, P04LE3_A120BarAgrEst
            }
            , new Object[] {
            P04LE4_A396EmprCod, P04LE4_A129BarCod, P04LE4_A132BarCodReo, P04LE4_A130BarCodPar, P04LE4_A119BarAgrCod, P04LE4_A124BarAgrReo, P04LE4_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PREC1" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PREC1" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV16etm ;
   private byte GXt_int5 ;
   private byte A5431RecPriPla ;
   private byte A3594BarPriTin ;
   private byte A124BarAgrReo ;
   private byte GXv_int6[] ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Recvolprd ;
   private int A2805RecVolPrd ;
   private int A119BarAgrCod ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private java.math.BigDecimal AV10Recfa ;
   private java.math.BigDecimal A2806RecFA ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Maqcod ;
   private String AV11RecNumprg ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV13EmprNom ;
   private String AV14UsurCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A5110RecNumPrg ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String AV20Pgmname ;
   private String A122BarAgrPar ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean n5431RecPriPla ;
   private String AV15Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04LE2_A396EmprCod ;
   private int[] P04LE2_A129BarCod ;
   private byte[] P04LE2_A132BarCodReo ;
   private String[] P04LE2_A130BarCodPar ;
   private short[] P04LE2_A2804RecLinMaq ;
   private String[] P04LE2_A602MaqCod ;
   private java.math.BigDecimal[] P04LE2_A2806RecFA ;
   private String[] P04LE2_A5110RecNumPrg ;
   private int[] P04LE2_A2805RecVolPrd ;
   private byte[] P04LE2_A5431RecPriPla ;
   private boolean[] P04LE2_n5431RecPriPla ;
   private byte[] P04LE3_A3594BarPriTin ;
   private String[] P04LE3_A180BarMaqCod ;
   private String[] P04LE3_A120BarAgrEst ;
   private String[] P04LE4_A396EmprCod ;
   private int[] P04LE4_A129BarCod ;
   private byte[] P04LE4_A132BarCodReo ;
   private String[] P04LE4_A130BarCodPar ;
   private int[] P04LE4_A119BarAgrCod ;
   private byte[] P04LE4_A124BarAgrReo ;
   private String[] P04LE4_A122BarAgrPar ;
}

final  class prec1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04LE2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod, RecFA, RecNumPrg, RecVolPrd, RecPriPla FROM TXPRECMAQ WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04LE3", "SELECT BarPriTin, BarMaqCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04LE4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04LE5", "UPDATE TXPBARCAD SET BarPriTin=?, BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P04LE6", "UPDATE TXPRECMAQ SET MaqCod=?, RecFA=?, RecNumPrg=?, RecVolPrd=?, RecPriPla=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 2 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               stmt.setString(6, (String)parms[6], 3);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 1);
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               return;
      }
   }

}

