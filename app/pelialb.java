package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelialb extends GXProcedure
{
   public pelialb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelialb.class ), "" );
   }

   public pelialb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     long[] aP3 )
   {
      pelialb.this.aP4 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        long[] aP3 ,
                        java.util.Date[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             long[] aP3 ,
                             java.util.Date[] aP4 )
   {
      pelialb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelialb.this.AV15NumFac = aP1[0];
      this.aP1 = aP1;
      pelialb.this.AV16AlbTip = aP2[0];
      this.aP2 = aP2;
      pelialb.this.AV17AlbCod = aP3[0];
      this.aP3 = aP3;
      pelialb.this.AV20FacHor = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV19Moda21 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      pelialb.this.AV19Moda21 = GXv_int1[0] ;
      GXt_char2 = AV29Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      pelialb.this.GXt_char2 = GXv_char3[0] ;
      AV29Station = GXt_char2 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV30EmprNom ;
      GXv_char5[0] = AV31UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char3, GXv_char4, GXv_char5) ;
      pelialb.this.A396EmprCod = GXv_char3[0] ;
      pelialb.this.AV30EmprNom = GXv_char4[0] ;
      pelialb.this.AV31UsurCod = GXv_char5[0] ;
      AV26Col_Inc_obs.clear();
      AV27Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV27Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Tipo Albaran=", "")+GXutil.trim( GXutil.str( AV16AlbTip, 1, 0))+httpContext.getMessage( " Factura=", "")+GXutil.trim( GXutil.str( AV15NumFac, 8, 0))+httpContext.getMessage( " Documento=", "")+GXutil.trim( GXutil.str( AV17AlbCod, 10, 0)) );
      AV26Col_Inc_obs.add(AV27Item_Col_Inc_obs, 0);
      if ( AV26Col_Inc_obs.size() > 0 )
      {
         AV28Json_Inc_obs = AV26Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV31UsurCod, AV29Station, GXutil.trim( AV28Json_Inc_obs), AV15NumFac, (byte)(0), "") ;
      }
      if ( AV16AlbTip == 1 )
      {
         AV26Col_Inc_obs.clear();
         AV28Json_Inc_obs = "" ;
         /* Using cursor P00592 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV17AlbCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A30AlbProCod = P00592_A30AlbProCod[0] ;
            A33AlbProEst = P00592_A33AlbProEst[0] ;
            A1782AlbProEso = P00592_A1782AlbProEso[0] ;
            A33AlbProEst = (byte)(1) ;
            A1782AlbProEso = (byte)(1) ;
            if ( AV19Moda21 == 1 )
            {
               n2395BarAlbExt = false ;
               /* Optimized UPDATE. */
               /* Using cursor P00593 */
               pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
               /* End optimized UPDATE. */
            }
            AV27Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV27Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Act. AlbBar. ALbaran=", "")+GXutil.str( A30AlbProCod, 10, 0) );
            AV26Col_Inc_obs.add(AV27Item_Col_Inc_obs, 0);
            /* Using cursor P00594 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV26Col_Inc_obs.size() > 0 )
         {
            AV28Json_Inc_obs = AV26Col_Inc_obs.toJSonString(false) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV31UsurCod, AV29Station, GXutil.trim( AV28Json_Inc_obs), AV15NumFac, (byte)(0), "") ;
         }
      }
      if ( AV16AlbTip == 2 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P00595 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(AV17AlbCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* End optimized UPDATE. */
      }
      AV26Col_Inc_obs.clear();
      /* Using cursor P00596 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(AV17AlbCod), Integer.valueOf(AV15NumFac)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A427FacAlbCod = P00596_A427FacAlbCod[0] ;
         A430FacCod = P00596_A430FacCod[0] ;
         A454FacSer = P00596_A454FacSer[0] ;
         A428FacAlbTip = P00596_A428FacAlbTip[0] ;
         A1296FacBarPar = P00596_A1296FacBarPar[0] ;
         A1295FacBarReo = P00596_A1295FacBarReo[0] ;
         A1294FacBarCod = P00596_A1294FacBarCod[0] ;
         A446FacLin = P00596_A446FacLin[0] ;
         if ( ( A428FacAlbTip == AV16AlbTip ) || ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Observ.", "")) == 0 ) )
         {
            /* Using cursor P00597 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
            AV27Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV27Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "del LFAVEN=", "")+GXutil.trim( GXutil.str( A427FacAlbCod, 10, 0))+httpContext.getMessage( " Hdr=", "")+GXutil.trim( GXutil.str( A1294FacBarCod, 8, 0))+"-"+GXutil.str( A1295FacBarReo, 1, 0)+A1296FacBarPar );
            AV26Col_Inc_obs.add(AV27Item_Col_Inc_obs, 0);
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV26Col_Inc_obs.size() > 0 )
      {
         AV28Json_Inc_obs = AV26Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV31UsurCod, AV29Station, GXutil.trim( AV28Json_Inc_obs), AV15NumFac, (byte)(0), "") ;
      }
      AV26Col_Inc_obs.clear();
      /* Using cursor P00598 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV15NumFac)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A430FacCod = P00598_A430FacCod[0] ;
         A446FacLin = P00598_A446FacLin[0] ;
         AV18FacLin = A446FacLin ;
         AV27Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV27Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Ultima linea de LFAVEN=", "")+GXutil.str( AV18FacLin, 6, 0) );
         AV26Col_Inc_obs.add(AV27Item_Col_Inc_obs, 0);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( AV26Col_Inc_obs.size() > 0 )
      {
         AV28Json_Inc_obs = AV26Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV31UsurCod, AV29Station, GXutil.trim( AV28Json_Inc_obs), AV15NumFac, (byte)(0), "") ;
      }
      AV26Col_Inc_obs.clear();
      /* Using cursor P00599 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV15NumFac)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A430FacCod = P00599_A430FacCod[0] ;
         A445FacLiC = P00599_A445FacLiC[0] ;
         AV27Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV27Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Act. Lfaven FacLic=", "")+GXutil.str( A445FacLiC, 6, 0)+httpContext.getMessage( " con ", "")+GXutil.str( AV18FacLin, 6, 0) );
         AV26Col_Inc_obs.add(AV27Item_Col_Inc_obs, 0);
         A445FacLiC = AV18FacLin ;
         /* Using cursor P005910 */
         pr_default.execute(8, new Object[] {Integer.valueOf(A445FacLiC), A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      if ( AV26Col_Inc_obs.size() > 0 )
      {
         AV28Json_Inc_obs = AV26Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV31UsurCod, AV29Station, GXutil.trim( AV28Json_Inc_obs), AV15NumFac, (byte)(0), "") ;
      }
      new app.pcalvto(remoteHandle, context).execute( A396EmprCod, AV15NumFac) ;
      GXv_char5[0] = AV21Cadena ;
      GXv_char4[0] = AV22firma ;
      new app.obtengocadenaparahashdocumentofactura(remoteHandle, context).execute( A396EmprCod, AV15NumFac, AV20FacHor, GXv_char5, GXv_char4) ;
      pelialb.this.AV21Cadena = GXv_char5[0] ;
      pelialb.this.AV22firma = GXv_char4[0] ;
      GXv_char5[0] = AV24Hash ;
      GXv_objcol_SdtMessages_Message6[0] = AV23Messages ;
      GXv_boolean7[0] = AV25ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV21Cadena, GXv_char5, GXv_objcol_SdtMessages_Message6, GXv_boolean7) ;
      pelialb.this.AV24Hash = GXv_char5[0] ;
      AV23Messages = GXv_objcol_SdtMessages_Message6[0] ;
      pelialb.this.AV25ok = GXv_boolean7[0] ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int8[0] = AV15NumFac ;
      GXv_char4[0] = AV21Cadena ;
      GXv_char3[0] = AV24Hash ;
      new app.facturacion.actualizohashdocumentofactura(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_char4, GXv_char3) ;
      pelialb.this.A396EmprCod = GXv_char5[0] ;
      pelialb.this.AV15NumFac = GXv_int8[0] ;
      pelialb.this.AV21Cadena = GXv_char4[0] ;
      pelialb.this.AV24Hash = GXv_char3[0] ;
      AV26Col_Inc_obs.clear();
      AV27Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV27Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Hash=", "")+AV24Hash+httpContext.getMessage( " Ok=", "")+GXutil.booltostr( AV25ok) );
      AV26Col_Inc_obs.add(AV27Item_Col_Inc_obs, 0);
      if ( AV26Col_Inc_obs.size() > 0 )
      {
         AV28Json_Inc_obs = AV26Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV31UsurCod, AV29Station, GXutil.trim( AV28Json_Inc_obs), AV15NumFac, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelialb.this.A396EmprCod;
      this.aP1[0] = pelialb.this.AV15NumFac;
      this.aP2[0] = pelialb.this.AV16AlbTip;
      this.aP3[0] = pelialb.this.AV17AlbCod;
      this.aP4[0] = pelialb.this.AV20FacHor;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelialb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV29Station = "" ;
      GXt_char2 = "" ;
      AV30EmprNom = "" ;
      AV31UsurCod = "" ;
      AV26Col_Inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      AV27Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV28Json_Inc_obs = "" ;
      AV34Pgmname = "" ;
      scmdbuf = "" ;
      P00592_A396EmprCod = new String[] {""} ;
      P00592_A30AlbProCod = new long[1] ;
      P00592_A33AlbProEst = new byte[1] ;
      P00592_A1782AlbProEso = new byte[1] ;
      P00596_A396EmprCod = new String[] {""} ;
      P00596_A427FacAlbCod = new long[1] ;
      P00596_A430FacCod = new int[1] ;
      P00596_A454FacSer = new String[] {""} ;
      P00596_A428FacAlbTip = new byte[1] ;
      P00596_A1296FacBarPar = new String[] {""} ;
      P00596_A1295FacBarReo = new byte[1] ;
      P00596_A1294FacBarCod = new int[1] ;
      P00596_A446FacLin = new int[1] ;
      A454FacSer = "" ;
      A1296FacBarPar = "" ;
      P00598_A396EmprCod = new String[] {""} ;
      P00598_A430FacCod = new int[1] ;
      P00598_A446FacLin = new int[1] ;
      P00599_A396EmprCod = new String[] {""} ;
      P00599_A430FacCod = new int[1] ;
      P00599_A445FacLiC = new int[1] ;
      AV21Cadena = "" ;
      AV22firma = "" ;
      AV24Hash = "" ;
      AV23Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message6 = new GXBaseCollection[1] ;
      GXv_boolean7 = new boolean[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelialb__default(),
         new Object[] {
             new Object[] {
            P00592_A396EmprCod, P00592_A30AlbProCod, P00592_A33AlbProEst, P00592_A1782AlbProEso
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00596_A396EmprCod, P00596_A427FacAlbCod, P00596_A430FacCod, P00596_A454FacSer, P00596_A428FacAlbTip, P00596_A1296FacBarPar, P00596_A1295FacBarReo, P00596_A1294FacBarCod, P00596_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00598_A396EmprCod, P00598_A430FacCod, P00598_A446FacLin
            }
            , new Object[] {
            P00599_A396EmprCod, P00599_A430FacCod, P00599_A445FacLiC
            }
            , new Object[] {
            }
         }
      );
      AV34Pgmname = "PELIALB" ;
      /* GeneXus formulas. */
      AV34Pgmname = "PELIALB" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16AlbTip ;
   private byte AV19Moda21 ;
   private byte GXv_int1[] ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private short Gx_err ;
   private int AV15NumFac ;
   private int A430FacCod ;
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private int AV18FacLin ;
   private int A445FacLiC ;
   private int GXv_int8[] ;
   private long AV17AlbCod ;
   private long A30AlbProCod ;
   private long A427FacAlbCod ;
   private String A396EmprCod ;
   private String AV29Station ;
   private String GXt_char2 ;
   private String AV30EmprNom ;
   private String AV31UsurCod ;
   private String AV34Pgmname ;
   private String scmdbuf ;
   private String A454FacSer ;
   private String A1296FacBarPar ;
   private String AV21Cadena ;
   private String AV22firma ;
   private String AV24Hash ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV20FacHor ;
   private boolean n2395BarAlbExt ;
   private boolean AV25ok ;
   private boolean GXv_boolean7[] ;
   private String AV28Json_Inc_obs ;
   private java.util.Date[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private long[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00592_A396EmprCod ;
   private long[] P00592_A30AlbProCod ;
   private byte[] P00592_A33AlbProEst ;
   private byte[] P00592_A1782AlbProEso ;
   private String[] P00596_A396EmprCod ;
   private long[] P00596_A427FacAlbCod ;
   private int[] P00596_A430FacCod ;
   private String[] P00596_A454FacSer ;
   private byte[] P00596_A428FacAlbTip ;
   private String[] P00596_A1296FacBarPar ;
   private byte[] P00596_A1295FacBarReo ;
   private int[] P00596_A1294FacBarCod ;
   private int[] P00596_A446FacLin ;
   private String[] P00598_A396EmprCod ;
   private int[] P00598_A430FacCod ;
   private int[] P00598_A446FacLin ;
   private String[] P00599_A396EmprCod ;
   private int[] P00599_A430FacCod ;
   private int[] P00599_A445FacLiC ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV23Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message6[] ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV26Col_Inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV27Item_Col_Inc_obs ;
}

final  class pelialb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00592", "SELECT EmprCod, AlbProCod, AlbProEst, AlbProEso FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00593", "UPDATE TXPALBBAR SET BarAlbExt=0  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P00594", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P00595", "UPDATE TXPCALCOM SET AlbComEso=1, AlbComEst=1  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P00596", "SELECT EmprCod, FacAlbCod, FacCod, FacSer, FacAlbTip, FacBarPar, FacBarReo, FacBarCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacAlbCod = ? and FacCod = ? ORDER BY EmprCod, FacAlbCod, FacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00597", "DELETE FROM TXPLFAVEN  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P00598", "SELECT * FROM (SELECT EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00599", "SELECT EmprCod, FacCod, FacLiC FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P005910", "UPDATE TXPCFAVEN SET FacLiC=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

