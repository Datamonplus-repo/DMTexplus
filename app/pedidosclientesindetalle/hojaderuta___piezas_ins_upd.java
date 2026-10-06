package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta___piezas_ins_upd extends GXProcedure
{
   public hojaderuta___piezas_ins_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta___piezas_ins_upd.class ), "" );
   }

   public hojaderuta___piezas_ins_upd( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int aP4 ,
                        String aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal aP7 ,
                        int aP8 ,
                        short aP9 ,
                        short aP10 ,
                        java.math.BigDecimal aP11 ,
                        java.math.BigDecimal aP12 ,
                        int aP13 ,
                        short aP14 ,
                        String aP15 ,
                        java.math.BigDecimal aP16 ,
                        java.math.BigDecimal aP17 ,
                        int aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 ,
                             int aP8 ,
                             short aP9 ,
                             short aP10 ,
                             java.math.BigDecimal aP11 ,
                             java.math.BigDecimal aP12 ,
                             int aP13 ,
                             short aP14 ,
                             String aP15 ,
                             java.math.BigDecimal aP16 ,
                             java.math.BigDecimal aP17 ,
                             int aP18 )
   {
      hojaderuta___piezas_ins_upd.this.AV8emprcod = aP0;
      hojaderuta___piezas_ins_upd.this.AV9barcod = aP1;
      hojaderuta___piezas_ins_upd.this.AV10barcodreo = aP2;
      hojaderuta___piezas_ins_upd.this.AV11barcodpar = aP3;
      hojaderuta___piezas_ins_upd.this.AV12ALbreccod = aP4;
      hojaderuta___piezas_ins_upd.this.AV15BarUnimed = aP5;
      hojaderuta___piezas_ins_upd.this.AV13Barpiekil = aP6;
      hojaderuta___piezas_ins_upd.this.AV14barpiemet = aP7;
      hojaderuta___piezas_ins_upd.this.AV16Barpiepie = aP8;
      hojaderuta___piezas_ins_upd.this.AV20ALbrec = aP9;
      hojaderuta___piezas_ins_upd.this.AV19barpie = aP10;
      hojaderuta___piezas_ins_upd.this.AV24oldbarpiekil = aP11;
      hojaderuta___piezas_ins_upd.this.AV25oldbarpiemet = aP12;
      hojaderuta___piezas_ins_upd.this.AV26oldbarpiepie = aP13;
      hojaderuta___piezas_ins_upd.this.AV21BarPes = aP14;
      hojaderuta___piezas_ins_upd.this.AV23BarAgrEst = aP15;
      hojaderuta___piezas_ins_upd.this.AV24oldbarpiekil = aP16;
      hojaderuta___piezas_ins_upd.this.AV25oldbarpiemet = aP17;
      hojaderuta___piezas_ins_upd.this.AV26oldbarpiepie = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = (byte)(AV28PesoML) ;
      new app.pexicon(remoteHandle, context).execute( AV8emprcod, httpContext.getMessage( "NOPML", ""), GXv_int1) ;
      hojaderuta___piezas_ins_upd.this.AV28PesoML = GXv_int1[0] ;
      if ( AV19barpie == 0 )
      {
         AV22BarpieCod = GXutil.str( AV12ALbreccod, 8, 0) ;
         AV13Barpiekil = ((GXutil.strcmp(AV15BarUnimed, "M")==0) ? AV14barpiemet.multiply(DecimalUtil.doubleToDec(AV21BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV13Barpiekil) ;
         GXv_char2[0] = AV8emprcod ;
         GXv_int3[0] = AV9barcod ;
         GXv_int1[0] = AV10barcodreo ;
         GXv_char4[0] = AV11barcodpar ;
         GXv_int5[0] = AV12ALbreccod ;
         GXv_char6[0] = AV22BarpieCod ;
         GXv_decimal7[0] = AV13Barpiekil ;
         GXv_decimal8[0] = AV14barpiemet ;
         GXv_int9[0] = AV16Barpiepie ;
         new app.paltpin(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_int5, GXv_char6, GXv_decimal7, GXv_decimal8, GXv_int9) ;
         hojaderuta___piezas_ins_upd.this.AV8emprcod = GXv_char2[0] ;
         hojaderuta___piezas_ins_upd.this.AV9barcod = GXv_int3[0] ;
         hojaderuta___piezas_ins_upd.this.AV10barcodreo = GXv_int1[0] ;
         hojaderuta___piezas_ins_upd.this.AV11barcodpar = GXv_char4[0] ;
         hojaderuta___piezas_ins_upd.this.AV12ALbreccod = GXv_int5[0] ;
         hojaderuta___piezas_ins_upd.this.AV22BarpieCod = GXv_char6[0] ;
         hojaderuta___piezas_ins_upd.this.AV13Barpiekil = GXv_decimal7[0] ;
         hojaderuta___piezas_ins_upd.this.AV14barpiemet = GXv_decimal8[0] ;
         hojaderuta___piezas_ins_upd.this.AV16Barpiepie = GXv_int9[0] ;
         if ( GXutil.strcmp(AV23BarAgrEst, "S") == 0 )
         {
            GXv_char6[0] = AV8emprcod ;
            GXv_int9[0] = AV9barcod ;
            GXv_int1[0] = AV10barcodreo ;
            GXv_char4[0] = AV11barcodpar ;
            new app.pactagr(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_int1, GXv_char4) ;
            hojaderuta___piezas_ins_upd.this.AV8emprcod = GXv_char6[0] ;
            hojaderuta___piezas_ins_upd.this.AV9barcod = GXv_int9[0] ;
            hojaderuta___piezas_ins_upd.this.AV10barcodreo = GXv_int1[0] ;
            hojaderuta___piezas_ins_upd.this.AV11barcodpar = GXv_char4[0] ;
         }
      }
      else
      {
         /* Using cursor P0AGO2 */
         pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P0AGO2_A130BarCodPar[0] ;
            A132BarCodReo = P0AGO2_A132BarCodReo[0] ;
            A129BarCod = P0AGO2_A129BarCod[0] ;
            A396EmprCod = P0AGO2_A396EmprCod[0] ;
            A361DisCod = P0AGO2_A361DisCod[0] ;
            AV27DisCod = A361DisCod ;
            /* Optimized UPDATE. */
            /* Using cursor P0AGO3 */
            pr_default.execute(1, new Object[] {Integer.valueOf(AV16Barpiepie), AV14barpiemet, AV13Barpiekil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(AV12ALbreccod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* End optimized UPDATE. */
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( ( GXutil.strcmp(AV15BarUnimed, "M") == 0 ) && ( AV28PesoML == 0 ) )
         {
            GXv_char6[0] = AV8emprcod ;
            GXv_int9[0] = AV9barcod ;
            GXv_int1[0] = AV10barcodreo ;
            GXv_char4[0] = AV11barcodpar ;
            new app.pmodpes(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_int1, GXv_char4) ;
            hojaderuta___piezas_ins_upd.this.AV8emprcod = GXv_char6[0] ;
            hojaderuta___piezas_ins_upd.this.AV9barcod = GXv_int9[0] ;
            hojaderuta___piezas_ins_upd.this.AV10barcodreo = GXv_int1[0] ;
            hojaderuta___piezas_ins_upd.this.AV11barcodpar = GXv_char4[0] ;
         }
         GXv_char6[0] = AV8emprcod ;
         GXv_int9[0] = AV27DisCod ;
         GXv_int5[0] = AV12ALbreccod ;
         GXv_char4[0] = AV22BarpieCod ;
         GXv_decimal8[0] = AV13Barpiekil ;
         GXv_decimal7[0] = AV24oldbarpiekil ;
         GXv_decimal10[0] = AV14barpiemet ;
         GXv_decimal11[0] = AV25oldbarpiemet ;
         GXv_int3[0] = AV16Barpiepie ;
         GXv_int12[0] = AV26oldbarpiepie ;
         GXv_char2[0] = httpContext.getMessage( "N", "") ;
         new app.pmodpdi2(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_int5, GXv_char4, GXv_decimal8, GXv_decimal7, GXv_decimal10, GXv_decimal11, GXv_int3, GXv_int12, GXv_char2) ;
         hojaderuta___piezas_ins_upd.this.AV8emprcod = GXv_char6[0] ;
         hojaderuta___piezas_ins_upd.this.AV27DisCod = GXv_int9[0] ;
         hojaderuta___piezas_ins_upd.this.AV12ALbreccod = GXv_int5[0] ;
         hojaderuta___piezas_ins_upd.this.AV22BarpieCod = GXv_char4[0] ;
         hojaderuta___piezas_ins_upd.this.AV13Barpiekil = GXv_decimal8[0] ;
         hojaderuta___piezas_ins_upd.this.AV24oldbarpiekil = GXv_decimal7[0] ;
         hojaderuta___piezas_ins_upd.this.AV14barpiemet = GXv_decimal10[0] ;
         hojaderuta___piezas_ins_upd.this.AV25oldbarpiemet = GXv_decimal11[0] ;
         hojaderuta___piezas_ins_upd.this.AV16Barpiepie = GXv_int3[0] ;
         hojaderuta___piezas_ins_upd.this.AV26oldbarpiepie = GXv_int12[0] ;
         if ( GXutil.strcmp(AV23BarAgrEst, "S") == 0 )
         {
            GXv_char6[0] = AV8emprcod ;
            GXv_int12[0] = AV9barcod ;
            GXv_int1[0] = AV10barcodreo ;
            GXv_char4[0] = AV11barcodpar ;
            new app.pactagr(remoteHandle, context).execute( GXv_char6, GXv_int12, GXv_int1, GXv_char4) ;
            hojaderuta___piezas_ins_upd.this.AV8emprcod = GXv_char6[0] ;
            hojaderuta___piezas_ins_upd.this.AV9barcod = GXv_int12[0] ;
            hojaderuta___piezas_ins_upd.this.AV10barcodreo = GXv_int1[0] ;
            hojaderuta___piezas_ins_upd.this.AV11barcodpar = GXv_char4[0] ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.hojaderuta___piezas_ins_upd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22BarpieCod = "" ;
      scmdbuf = "" ;
      P0AGO2_A130BarCodPar = new String[] {""} ;
      P0AGO2_A132BarCodReo = new byte[1] ;
      P0AGO2_A129BarCod = new int[1] ;
      P0AGO2_A396EmprCod = new String[] {""} ;
      P0AGO2_A361DisCod = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      GXv_int9 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int3 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta___piezas_ins_upd__default(),
         new Object[] {
             new Object[] {
            P0AGO2_A130BarCodPar, P0AGO2_A132BarCodReo, P0AGO2_A129BarCod, P0AGO2_A396EmprCod, P0AGO2_A361DisCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte A132BarCodReo ;
   private byte GXv_int1[] ;
   private short AV20ALbrec ;
   private short AV19barpie ;
   private short AV21BarPes ;
   private short AV28PesoML ;
   private short Gx_err ;
   private int AV9barcod ;
   private int AV12ALbreccod ;
   private int AV16Barpiepie ;
   private int AV26oldbarpiepie ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV27DisCod ;
   private int A1501BarPiePie ;
   private int GXv_int9[] ;
   private int GXv_int5[] ;
   private int GXv_int3[] ;
   private int GXv_int12[] ;
   private java.math.BigDecimal AV13Barpiekil ;
   private java.math.BigDecimal AV14barpiemet ;
   private java.math.BigDecimal AV24oldbarpiekil ;
   private java.math.BigDecimal AV25oldbarpiemet ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String AV8emprcod ;
   private String AV11barcodpar ;
   private String AV15BarUnimed ;
   private String AV23BarAgrEst ;
   private String AV22BarpieCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGO2_A130BarCodPar ;
   private byte[] P0AGO2_A132BarCodReo ;
   private int[] P0AGO2_A129BarCod ;
   private String[] P0AGO2_A396EmprCod ;
   private int[] P0AGO2_A361DisCod ;
}

final  class hojaderuta___piezas_ins_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGO2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AGO3", "UPDATE TXPBARPIE SET BarPiePie=?, BarPieMet=?, BarPieKil=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
      }
   }

}

