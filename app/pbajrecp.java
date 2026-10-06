package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbajrecp extends GXProcedure
{
   public pbajrecp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbajrecp.class ), "" );
   }

   public pbajrecp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 )
   {
      pbajrecp.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 )
   {
      pbajrecp.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbajrecp.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbajrecp.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbajrecp.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbajrecp.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pbajrecp.this.A1273RecLinPro = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV19Flag2)) ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "038001", GXv_int1) ;
      pbajrecp.this.AV19Flag2 = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXt_char2 = AV21Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      pbajrecp.this.GXt_char2 = GXv_char3[0] ;
      AV21Station = GXt_char2 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV22EmprNom ;
      GXv_char5[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char3, GXv_char4, GXv_char5) ;
      pbajrecp.this.A396EmprCod = GXv_char3[0] ;
      pbajrecp.this.AV22EmprNom = GXv_char4[0] ;
      pbajrecp.this.AV23UsurCod = GXv_char5[0] ;
      /* Using cursor P00G72 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00G72_A396EmprCod[0] ;
         A766ProForDsc = P00G72_A766ProForDsc[0] ;
         A764ProForCod = P00G72_A764ProForCod[0] ;
         A766ProForDsc = P00G72_A766ProForDsc[0] ;
         if ( AV19Flag2.doubleValue() == 1 )
         {
            /* Using cursor P00G73 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A719PrdNum = P00G73_A719PrdNum[0] ;
               n719PrdNum = P00G73_n719PrdNum[0] ;
               A686PrdCant = P00G73_A686PrdCant[0] ;
               A811RecLin = P00G73_A811RecLin[0] ;
               /* Using cursor P00G74 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               A707PrdFacCon = P00G74_A707PrdFacCon[0] ;
               A685PrdCanRes = P00G74_A685PrdCanRes[0] ;
               if ( A685PrdCanRes.subtract(((A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))).doubleValue() >= 0 )
               {
                  A685PrdCanRes = A685PrdCanRes.subtract(((A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
               }
               else
               {
                  A685PrdCanRes = DecimalUtil.ZERO ;
               }
               /* Using cursor P00G75 */
               pr_default.execute(3, new Object[] {A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
               pr_default.readNext(1);
            }
            pr_default.close(1);
            pr_default.close(2);
         }
         AV27lrecet = (short)(0) ;
         /* Using cursor P00G76 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A686PrdCant = P00G76_A686PrdCant[0] ;
            A811RecLin = P00G76_A811RecLin[0] ;
            /* Using cursor P00G77 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            AV27lrecet = (short)(AV27lrecet+1) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( AV27lrecet > 0 )
         {
            AV25Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV25Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Eliminacion Lineas.", "")+GXutil.newLine( ) );
            AV25Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV25Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+"#       ="+GXutil.str( A2804RecLinMaq, 4, 0)+GXutil.newLine( ) );
            AV25Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV25Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Lineas eliminadas LRECET ", "")+GXutil.str( AV27lrecet, 4, 0)+GXutil.newLine( ) );
            AV24Col_inc_obs.add(AV25Item_Col_Inc_obs, 0);
         }
         AV25Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV25Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Eliminacion Proceso QUimico.", "")+GXutil.newLine( ) );
         AV25Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV25Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+"#       ="+GXutil.str( A2804RecLinMaq, 4, 0)+GXutil.newLine( ) );
         AV25Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV25Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Linea   =", "")+GXutil.str( A1273RecLinPro, 2, 0)+GXutil.newLine( ) );
         AV25Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV25Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Proceso =", "")+A764ProForCod+" "+A766ProForDsc+GXutil.newLine( ) );
         AV24Col_inc_obs.add(AV25Item_Col_Inc_obs, 0);
         /* Using cursor P00G78 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV24Col_inc_obs.size() > 0 )
      {
         AV26Json_Inc_obs = AV24Col_inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV23UsurCod, AV21Station, AV26Json_Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      /* Optimized DELETE. */
      /* Using cursor P00G79 */
      pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbajrecp.this.AV15EmprCod;
      this.aP1[0] = pbajrecp.this.A129BarCod;
      this.aP2[0] = pbajrecp.this.A132BarCodReo;
      this.aP3[0] = pbajrecp.this.A130BarCodPar;
      this.aP4[0] = pbajrecp.this.A2804RecLinMaq;
      this.aP5[0] = pbajrecp.this.A1273RecLinPro;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbajrecp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Flag2 = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      AV21Station = "" ;
      GXt_char2 = "" ;
      A396EmprCod = "" ;
      GXv_char3 = new String[1] ;
      AV22EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV23UsurCod = "" ;
      GXv_char5 = new String[1] ;
      scmdbuf = "" ;
      P00G72_A129BarCod = new int[1] ;
      P00G72_A132BarCodReo = new byte[1] ;
      P00G72_A130BarCodPar = new String[] {""} ;
      P00G72_A2804RecLinMaq = new short[1] ;
      P00G72_A1273RecLinPro = new byte[1] ;
      P00G72_A396EmprCod = new String[] {""} ;
      P00G72_A766ProForDsc = new String[] {""} ;
      P00G72_A764ProForCod = new String[] {""} ;
      A766ProForDsc = "" ;
      A764ProForCod = "" ;
      P00G73_A719PrdNum = new String[] {""} ;
      P00G73_n719PrdNum = new boolean[] {false} ;
      P00G73_A396EmprCod = new String[] {""} ;
      P00G73_A129BarCod = new int[1] ;
      P00G73_A132BarCodReo = new byte[1] ;
      P00G73_A130BarCodPar = new String[] {""} ;
      P00G73_A2804RecLinMaq = new short[1] ;
      P00G73_A1273RecLinPro = new byte[1] ;
      P00G73_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G73_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      P00G74_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G74_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      P00G76_A396EmprCod = new String[] {""} ;
      P00G76_A129BarCod = new int[1] ;
      P00G76_A132BarCodReo = new byte[1] ;
      P00G76_A130BarCodPar = new String[] {""} ;
      P00G76_A2804RecLinMaq = new short[1] ;
      P00G76_A1273RecLinPro = new byte[1] ;
      P00G76_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G76_A811RecLin = new short[1] ;
      AV25Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV24Col_inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      AV26Json_Inc_obs = "" ;
      AV33Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbajrecp__default(),
         new Object[] {
             new Object[] {
            P00G72_A129BarCod, P00G72_A132BarCodReo, P00G72_A130BarCodPar, P00G72_A2804RecLinMaq, P00G72_A1273RecLinPro, P00G72_A396EmprCod, P00G72_A766ProForDsc, P00G72_A764ProForCod
            }
            , new Object[] {
            P00G73_A719PrdNum, P00G73_n719PrdNum, P00G73_A396EmprCod, P00G73_A129BarCod, P00G73_A132BarCodReo, P00G73_A130BarCodPar, P00G73_A2804RecLinMaq, P00G73_A1273RecLinPro, P00G73_A686PrdCant, P00G73_A811RecLin
            }
            , new Object[] {
            P00G74_A707PrdFacCon, P00G74_A685PrdCanRes
            }
            , new Object[] {
            }
            , new Object[] {
            P00G76_A396EmprCod, P00G76_A129BarCod, P00G76_A132BarCodReo, P00G76_A130BarCodPar, P00G76_A2804RecLinMaq, P00G76_A1273RecLinPro, P00G76_A686PrdCant, P00G76_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV33Pgmname = "PBAJRECP" ;
      /* GeneXus formulas. */
      AV33Pgmname = "PBAJRECP" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte GXv_int1[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV27lrecet ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV19Flag2 ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String AV15EmprCod ;
   private String A130BarCodPar ;
   private String AV21Station ;
   private String GXt_char2 ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private String AV22EmprNom ;
   private String GXv_char4[] ;
   private String AV23UsurCod ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A766ProForDsc ;
   private String A764ProForCod ;
   private String A719PrdNum ;
   private String AV33Pgmname ;
   private boolean n719PrdNum ;
   private String AV26Json_Inc_obs ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P00G72_A129BarCod ;
   private byte[] P00G72_A132BarCodReo ;
   private String[] P00G72_A130BarCodPar ;
   private short[] P00G72_A2804RecLinMaq ;
   private byte[] P00G72_A1273RecLinPro ;
   private String[] P00G72_A396EmprCod ;
   private String[] P00G72_A766ProForDsc ;
   private String[] P00G72_A764ProForCod ;
   private String[] P00G73_A719PrdNum ;
   private boolean[] P00G73_n719PrdNum ;
   private String[] P00G73_A396EmprCod ;
   private int[] P00G73_A129BarCod ;
   private byte[] P00G73_A132BarCodReo ;
   private String[] P00G73_A130BarCodPar ;
   private short[] P00G73_A2804RecLinMaq ;
   private byte[] P00G73_A1273RecLinPro ;
   private java.math.BigDecimal[] P00G73_A686PrdCant ;
   private short[] P00G73_A811RecLin ;
   private java.math.BigDecimal[] P00G74_A707PrdFacCon ;
   private java.math.BigDecimal[] P00G74_A685PrdCanRes ;
   private String[] P00G76_A396EmprCod ;
   private int[] P00G76_A129BarCod ;
   private byte[] P00G76_A132BarCodReo ;
   private String[] P00G76_A130BarCodPar ;
   private short[] P00G76_A2804RecLinMaq ;
   private byte[] P00G76_A1273RecLinPro ;
   private java.math.BigDecimal[] P00G76_A686PrdCant ;
   private short[] P00G76_A811RecLin ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV24Col_inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV25Item_Col_Inc_obs ;
}

final  class pbajrecp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00G72", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.EmprCod, T2.ProForDsc, T1.ProForCod FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro  FOR UPDATE OF T1.ProForCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G73", "SELECT PrdNum, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, PrdCant, RecLin FROM TXPLRECET WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00G74", "SELECT PrdFacCon, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdCanRes NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00G75", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P00G76", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, PrdCant, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro  FOR UPDATE OF PrdCant NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00G77", "DELETE FROM TXPLRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P00G78", "DELETE FROM TXPCRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P00G79", "DELETE FROM TXPBARPR2  WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (BarLinMaq = ?) AND (BarPrfLin = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

