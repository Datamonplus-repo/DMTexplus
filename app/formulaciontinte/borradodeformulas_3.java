package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class borradodeformulas_3 extends GXProcedure
{
   public borradodeformulas_3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( borradodeformulas_3.class ), "" );
   }

   public borradodeformulas_3( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        int aP6 ,
                        String aP7 ,
                        String aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             int aP6 ,
                             String aP7 ,
                             String aP8 )
   {
      borradodeformulas_3.this.AV11EmprCod = aP0;
      borradodeformulas_3.this.AV8CliCod = aP1;
      borradodeformulas_3.this.A494ForSer = aP2;
      borradodeformulas_3.this.AV12ForColNom = aP3;
      borradodeformulas_3.this.AV13ForColNum = aP4;
      borradodeformulas_3.this.AV20TipColCod = aP5;
      borradodeformulas_3.this.AV14ForNumCol = aP6;
      borradodeformulas_3.this.AV25Station = aP7;
      borradodeformulas_3.this.AV26usurcod = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV11EmprCod ;
      GXv_int2[0] = AV14ForNumCol ;
      GXv_int3[0] = AV10Contador ;
      new app.formulaciontinte.pelifo1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
      borradodeformulas_3.this.AV11EmprCod = GXv_char1[0] ;
      borradodeformulas_3.this.AV14ForNumCol = GXv_int2[0] ;
      borradodeformulas_3.this.AV10Contador = GXv_int3[0] ;
      AV21Json_Inc_Obs = "" ;
      AV22Col_Inc_Obs.clear();
      AV24observaciones = (short)(0) ;
      /* Using cursor P09TP2 */
      pr_default.execute(0, new Object[] {AV11EmprCod, Integer.valueOf(AV8CliCod), AV15ForSer, AV12ForColNom, Integer.valueOf(AV13ForColNum), Byte.valueOf(AV20TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P09TP2_A831TipColCod[0] ;
         A483ForColNum = P09TP2_A483ForColNum[0] ;
         A482ForColNom = P09TP2_A482ForColNom[0] ;
         A252CliCod = P09TP2_A252CliCod[0] ;
         A396EmprCod = P09TP2_A396EmprCod[0] ;
         A650ObsLin = P09TP2_A650ObsLin[0] ;
         /* Using cursor P09TP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A650ObsLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
         AV24observaciones = (short)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV24observaciones == 1 )
      {
         AV23Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "LOBFOR,DLT", "") );
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( 11111111 );
         AV22Col_Inc_Obs.add(AV23Item_Col_Inc_Obs, 0);
      }
      AV18procesos = (short)(0) ;
      /* Using cursor P09TP4 */
      pr_default.execute(2, new Object[] {AV11EmprCod, Integer.valueOf(AV8CliCod), AV15ForSer, AV12ForColNom, Integer.valueOf(AV13ForColNum), Byte.valueOf(AV20TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P09TP4_A831TipColCod[0] ;
         A483ForColNum = P09TP4_A483ForColNum[0] ;
         A482ForColNom = P09TP4_A482ForColNom[0] ;
         A252CliCod = P09TP4_A252CliCod[0] ;
         A396EmprCod = P09TP4_A396EmprCod[0] ;
         A1160ProForL = P09TP4_A1160ProForL[0] ;
         /* Using cursor P09TP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         AV18procesos = (short)(AV18procesos+1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV18procesos > 0 )
      {
         AV23Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "LFORMU,DLT.Rgtos= ", "")+GXutil.trim( GXutil.str( AV18procesos, 4, 0)) );
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( 11111111 );
         AV22Col_Inc_Obs.add(AV23Item_Col_Inc_Obs, 0);
      }
      /* Optimized DELETE. */
      /* Using cursor P09TP6 */
      pr_default.execute(4, new Object[] {AV11EmprCod, Integer.valueOf(AV8CliCod), AV15ForSer, AV12ForColNom, Integer.valueOf(AV13ForColNum), Byte.valueOf(AV20TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORMQP");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P09TP7 */
      pr_default.execute(5, new Object[] {AV11EmprCod, Integer.valueOf(AV8CliCod), AV15ForSer, AV12ForColNom, Integer.valueOf(AV13ForColNum), Byte.valueOf(AV20TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORLIS");
      /* End optimized DELETE. */
      if ( AV10Contador == 1 )
      {
         AV17NumFor = AV14ForNumCol ;
         /* Execute user subroutine: 'BORRAR' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         AV23Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Nº Formula Int ", "")+GXutil.trim( GXutil.str( AV14ForNumCol, 8, 0)) );
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV23Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "NO elimino colorantes, productos. Contador = ", "")+GXutil.trim( GXutil.str( AV10Contador, 1, 0)) );
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( AV14ForNumCol );
         AV22Col_Inc_Obs.add(AV23Item_Col_Inc_Obs, 0);
      }
      if ( AV22Col_Inc_Obs.size() > 0 )
      {
         AV33GXV1 = 1 ;
         while ( AV33GXV1 <= AV22Col_Inc_Obs.size() )
         {
            AV23Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)((app.SdtIncidenciasObservaciones_SDT)AV22Col_Inc_Obs.elementAt(-1+AV33GXV1));
            AV16Inc_obs = AV23Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs() ;
            AV14ForNumCol = AV23Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol() ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV26usurcod, AV25Station, AV16Inc_obs, AV14ForNumCol, (byte)(9), httpContext.getMessage( "z", "")) ;
            AV33GXV1 = (int)(AV33GXV1+1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BORRAR' Routine */
      returnInSub = false ;
      AV9colorantes = (short)(0) ;
      AV19productos = (short)(0) ;
      AV22Col_Inc_Obs.clear();
      /* Using cursor P09TP8 */
      pr_default.execute(6, new Object[] {AV11EmprCod, Integer.valueOf(AV14ForNumCol)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A486ForNumCol = P09TP8_A486ForNumCol[0] ;
         A396EmprCod = P09TP8_A396EmprCod[0] ;
         A310ColUltLin = P09TP8_A310ColUltLin[0] ;
         /* Using cursor P09TP9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A481ForCan = P09TP9_A481ForCan[0] ;
            A309ColLin = P09TP9_A309ColLin[0] ;
            /* Using cursor P09TP10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
            AV9colorantes = (short)(AV9colorantes+1) ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         if ( AV9colorantes > 0 )
         {
            AV23Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Nº Formula Int ", "")+GXutil.trim( GXutil.str( AV14ForNumCol, 8, 0)) );
            AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV23Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "LDFORM,DLT.Rgtos= ", "")+GXutil.trim( GXutil.str( AV9colorantes, 4, 0)) );
            AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( AV14ForNumCol );
            AV22Col_Inc_Obs.add(AV23Item_Col_Inc_Obs, 0);
         }
         /* Using cursor P09TP11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A487ForPrdCan = P09TP11_A487ForPrdCan[0] ;
            A715PrdLin = P09TP11_A715PrdLin[0] ;
            /* Using cursor P09TP12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
            AV19productos = (short)(AV19productos+1) ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         if ( AV19productos > 0 )
         {
            AV23Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Nº Formula Int ", "")+GXutil.trim( GXutil.str( AV14ForNumCol, 8, 0)) );
            AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV23Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "LPRFOR,DLT.Rgtos= ", "")+GXutil.trim( GXutil.str( AV19productos, 4, 0)) );
            AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( AV14ForNumCol );
            AV22Col_Inc_Obs.add(AV23Item_Col_Inc_Obs, 0);
         }
         /* Using cursor P09TP13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
         AV23Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Nº Formula Int ", "")+GXutil.trim( GXutil.str( AV14ForNumCol, 8, 0)) );
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV23Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "CDFORM,DLT ", "")+GXutil.newLine( ) );
         AV23Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( AV14ForNumCol );
         AV22Col_Inc_Obs.add(AV23Item_Col_Inc_Obs, 0);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.borradodeformulas_3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      AV21Json_Inc_Obs = "" ;
      AV22Col_Inc_Obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      AV15ForSer = "" ;
      P09TP2_A831TipColCod = new byte[1] ;
      P09TP2_A483ForColNum = new int[1] ;
      P09TP2_A482ForColNom = new String[] {""} ;
      P09TP2_A494ForSer = new String[] {""} ;
      P09TP2_A252CliCod = new int[1] ;
      P09TP2_A396EmprCod = new String[] {""} ;
      P09TP2_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A396EmprCod = "" ;
      AV23Item_Col_Inc_Obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      P09TP4_A831TipColCod = new byte[1] ;
      P09TP4_A483ForColNum = new int[1] ;
      P09TP4_A482ForColNom = new String[] {""} ;
      P09TP4_A494ForSer = new String[] {""} ;
      P09TP4_A252CliCod = new int[1] ;
      P09TP4_A396EmprCod = new String[] {""} ;
      P09TP4_A1160ProForL = new short[1] ;
      AV16Inc_obs = "" ;
      AV34Pgmname = "" ;
      P09TP8_A486ForNumCol = new int[1] ;
      P09TP8_A396EmprCod = new String[] {""} ;
      P09TP8_A310ColUltLin = new short[1] ;
      P09TP9_A396EmprCod = new String[] {""} ;
      P09TP9_A486ForNumCol = new int[1] ;
      P09TP9_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09TP9_A309ColLin = new short[1] ;
      A481ForCan = DecimalUtil.ZERO ;
      P09TP11_A396EmprCod = new String[] {""} ;
      P09TP11_A486ForNumCol = new int[1] ;
      P09TP11_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09TP11_A715PrdLin = new short[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.borradodeformulas_3__default(),
         new Object[] {
             new Object[] {
            P09TP2_A831TipColCod, P09TP2_A483ForColNum, P09TP2_A482ForColNom, P09TP2_A494ForSer, P09TP2_A252CliCod, P09TP2_A396EmprCod, P09TP2_A650ObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            P09TP4_A831TipColCod, P09TP4_A483ForColNum, P09TP4_A482ForColNom, P09TP4_A494ForSer, P09TP4_A252CliCod, P09TP4_A396EmprCod, P09TP4_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P09TP8_A486ForNumCol, P09TP8_A396EmprCod, P09TP8_A310ColUltLin
            }
            , new Object[] {
            P09TP9_A396EmprCod, P09TP9_A486ForNumCol, P09TP9_A481ForCan, P09TP9_A309ColLin
            }
            , new Object[] {
            }
            , new Object[] {
            P09TP11_A396EmprCod, P09TP11_A486ForNumCol, P09TP11_A487ForPrdCan, P09TP11_A715PrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV34Pgmname = "FormulacionTinte.BorradodeFormulas_3" ;
      /* GeneXus formulas. */
      AV34Pgmname = "FormulacionTinte.BorradodeFormulas_3" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20TipColCod ;
   private byte AV10Contador ;
   private byte GXv_int3[] ;
   private byte A831TipColCod ;
   private short AV24observaciones ;
   private short A650ObsLin ;
   private short AV18procesos ;
   private short A1160ProForL ;
   private short AV9colorantes ;
   private short AV19productos ;
   private short A310ColUltLin ;
   private short A309ColLin ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV13ForColNum ;
   private int AV14ForNumCol ;
   private int GXv_int2[] ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV17NumFor ;
   private int AV33GXV1 ;
   private int A486ForNumCol ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String AV11EmprCod ;
   private String A494ForSer ;
   private String AV12ForColNom ;
   private String AV25Station ;
   private String AV26usurcod ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String AV15ForSer ;
   private String A482ForColNom ;
   private String A396EmprCod ;
   private String AV34Pgmname ;
   private boolean returnInSub ;
   private String AV21Json_Inc_Obs ;
   private String AV16Inc_obs ;
   private IDataStoreProvider pr_default ;
   private byte[] P09TP2_A831TipColCod ;
   private int[] P09TP2_A483ForColNum ;
   private String[] P09TP2_A482ForColNom ;
   private String[] P09TP2_A494ForSer ;
   private int[] P09TP2_A252CliCod ;
   private String[] P09TP2_A396EmprCod ;
   private short[] P09TP2_A650ObsLin ;
   private byte[] P09TP4_A831TipColCod ;
   private int[] P09TP4_A483ForColNum ;
   private String[] P09TP4_A482ForColNom ;
   private String[] P09TP4_A494ForSer ;
   private int[] P09TP4_A252CliCod ;
   private String[] P09TP4_A396EmprCod ;
   private short[] P09TP4_A1160ProForL ;
   private int[] P09TP8_A486ForNumCol ;
   private String[] P09TP8_A396EmprCod ;
   private short[] P09TP8_A310ColUltLin ;
   private String[] P09TP9_A396EmprCod ;
   private int[] P09TP9_A486ForNumCol ;
   private java.math.BigDecimal[] P09TP9_A481ForCan ;
   private short[] P09TP9_A309ColLin ;
   private String[] P09TP11_A396EmprCod ;
   private int[] P09TP11_A486ForNumCol ;
   private java.math.BigDecimal[] P09TP11_A487ForPrdCan ;
   private short[] P09TP11_A715PrdLin ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV22Col_Inc_Obs ;
   private app.SdtIncidenciasObservaciones_SDT AV23Item_Col_Inc_Obs ;
}

final  class borradodeformulas_3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TP2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09TP3", "DELETE FROM TXPLOBFOR  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ObsLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
         ,new ForEachCursor("P09TP4", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09TP5", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P09TP6", "DELETE FROM TXPFORMQP  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORMQP")
         ,new UpdateCursor("P09TP7", "DELETE FROM TXPFORLIS  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORLIS")
         ,new ForEachCursor("P09TP8", "SELECT ForNumCol, EmprCod, ColUltLin FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09TP9", "SELECT EmprCod, ForNumCol, ForCan, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09TP10", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new ForEachCursor("P09TP11", "SELECT EmprCod, ForNumCol, ForPrdCan, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, PrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09TP12", "DELETE FROM TXPLPRFOR  WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
         ,new UpdateCursor("P09TP13", "DELETE FROM TXPCDFORM  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

