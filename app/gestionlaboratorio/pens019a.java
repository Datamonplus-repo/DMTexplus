package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens019a extends GXProcedure
{
   public pens019a( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens019a.class ), "" );
   }

   public pens019a( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           int[] aP3 )
   {
      pens019a.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      pens019a.this.AV19EmprCod = aP0[0];
      this.aP0 = aP0;
      pens019a.this.AV18Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens019a.this.AV10Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens019a.this.AV8Lb_colnum = aP3[0];
      this.aP3 = aP3;
      pens019a.this.AV9Lb_tiprec = aP4[0];
      this.aP4 = aP4;
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
      pens019a.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = AV19EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens019a.this.AV19EmprCod = GXv_char2[0] ;
      pens019a.this.AV13EmprNom = GXv_char3[0] ;
      pens019a.this.AV14UsurCod = GXv_char4[0] ;
      AV15Col_Inc_Obs.clear();
      /* Using cursor P02LO2 */
      pr_default.execute(0, new Object[] {AV19EmprCod, Integer.valueOf(AV18Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P02LO2_A5532Lb_numero[0] ;
         A396EmprCod = P02LO2_A396EmprCod[0] ;
         A5537Lb_ColNum = P02LO2_A5537Lb_ColNum[0] ;
         A5597Lb_TipRec = P02LO2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = AV8Lb_colnum ;
         A5597Lb_TipRec = AV9Lb_tiprec ;
         /* Using cursor P02LO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV10Lb_opcion});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5555Lb_opcion = P02LO3_A5555Lb_opcion[0] ;
            A5566Lb_Estado = P02LO3_A5566Lb_Estado[0] ;
            A5567Lb_FechaEn = P02LO3_A5567Lb_FechaEn[0] ;
            A5568Lb_HoraEn = P02LO3_A5568Lb_HoraEn[0] ;
            A5563Lb_FechaR = P02LO3_A5563Lb_FechaR[0] ;
            A5564Lb_HoraR = P02LO3_A5564Lb_HoraR[0] ;
            AV16Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Elimino Registros.Aprobacion Interna.", "")+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Opcion           ", "")+A5555Lb_opcion+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Estado actual    ", "")+GXutil.str( A5566Lb_Estado, 1, 0)+httpContext.getMessage( " Estado Nuevo     ", "")+"0"+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fec Env   actual ", "")+localUtil.dtoc( A5567Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+httpContext.getMessage( " Fecha Env Nueva  ", "")+" "+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hhmm Env actual  ", "")+localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+httpContext.getMessage( " Hhmm Env Nueva  ", "")+" "+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fec Recep actual  ", "")+localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+httpContext.getMessage( " Fecha Recep Nueva ", "")+" "+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hhmm Recep actual ", "")+localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+httpContext.getMessage( " Hhmm Recep Nueva  ", "")+" "+GXutil.newLine( ) );
            AV15Col_Inc_Obs.add(AV16Item_Col_Inc_Obs, 0);
            A5563Lb_FechaR = GXutil.nullDate() ;
            A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
            A5566Lb_Estado = (byte)(0) ;
            A5567Lb_FechaEn = GXutil.nullDate() ;
            A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
            /* Using cursor P02LO4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A5566Lb_Estado), A5567Lb_FechaEn, A5568Lb_HoraEn, A5563Lb_FechaR, A5564Lb_HoraR, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P02LO5 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A5537Lb_ColNum), Byte.valueOf(A5597Lb_TipRec), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV15Col_Inc_Obs.size() > 0 )
      {
         AV17Json_Inc_Obs = AV15Col_Inc_Obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV14UsurCod, AV12Station, AV17Json_Inc_Obs, AV18Lb_numero, (byte)(0), " ") ;
      }
      AV15Col_Inc_Obs.clear();
      /* Using cursor P02LO6 */
      pr_default.execute(4, new Object[] {AV19EmprCod, Integer.valueOf(AV18Lb_numero)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A5532Lb_numero = P02LO6_A5532Lb_numero[0] ;
         A396EmprCod = P02LO6_A396EmprCod[0] ;
         A5537Lb_ColNum = P02LO6_A5537Lb_ColNum[0] ;
         A5597Lb_TipRec = P02LO6_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = AV8Lb_colnum ;
         A5597Lb_TipRec = AV9Lb_tiprec ;
         /* Using cursor P02LO7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV10Lb_opcion});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A5566Lb_Estado = P02LO7_A5566Lb_Estado[0] ;
            A5555Lb_opcion = P02LO7_A5555Lb_opcion[0] ;
            A5567Lb_FechaEn = P02LO7_A5567Lb_FechaEn[0] ;
            A5568Lb_HoraEn = P02LO7_A5568Lb_HoraEn[0] ;
            A5563Lb_FechaR = P02LO7_A5563Lb_FechaR[0] ;
            A5564Lb_HoraR = P02LO7_A5564Lb_HoraR[0] ;
            AV16Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Elimino Registros.Aprobacion Interna.Resto Opciones", "")+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Opcion           ", "")+A5555Lb_opcion+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Estado actual    ", "")+GXutil.str( A5566Lb_Estado, 1, 0)+httpContext.getMessage( " Estado Nuevo     ", "")+"0"+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fec Env   actual ", "")+localUtil.dtoc( A5567Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+httpContext.getMessage( " Fecha Env Nueva  ", "")+" "+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hhmm Env actual  ", "")+localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+httpContext.getMessage( " Hhmm Env Nueva  ", "")+" "+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fec Recep actual  ", "")+localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+httpContext.getMessage( " Fecha Recep Nueva ", "")+" "+GXutil.newLine( ) );
            AV16Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV16Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hhmm Recep actual ", "")+localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+httpContext.getMessage( " Hhmm Recep Nueva  ", "")+" "+GXutil.newLine( ) );
            AV15Col_Inc_Obs.add(AV16Item_Col_Inc_Obs, 0);
            A5563Lb_FechaR = GXutil.nullDate() ;
            A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
            A5566Lb_Estado = (byte)(0) ;
            A5567Lb_FechaEn = GXutil.nullDate() ;
            A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
            /* Using cursor P02LO8 */
            pr_default.execute(6, new Object[] {Byte.valueOf(A5566Lb_Estado), A5567Lb_FechaEn, A5568Lb_HoraEn, A5563Lb_FechaR, A5564Lb_HoraR, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Using cursor P02LO9 */
         pr_default.execute(7, new Object[] {Integer.valueOf(A5537Lb_ColNum), Byte.valueOf(A5597Lb_TipRec), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV15Col_Inc_Obs.size() > 0 )
      {
         AV17Json_Inc_Obs = AV15Col_Inc_Obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV14UsurCod, AV12Station, AV17Json_Inc_Obs, AV18Lb_numero, (byte)(0), " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens019a.this.AV19EmprCod;
      this.aP1[0] = pens019a.this.AV18Lb_numero;
      this.aP2[0] = pens019a.this.AV10Lb_opcion;
      this.aP3[0] = pens019a.this.AV8Lb_colnum;
      this.aP4[0] = pens019a.this.AV9Lb_tiprec;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens019a");
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
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV15Col_Inc_Obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P02LO2_A5532Lb_numero = new int[1] ;
      P02LO2_A396EmprCod = new String[] {""} ;
      P02LO2_A5537Lb_ColNum = new int[1] ;
      P02LO2_A5597Lb_TipRec = new byte[1] ;
      A396EmprCod = "" ;
      P02LO3_A396EmprCod = new String[] {""} ;
      P02LO3_A5532Lb_numero = new int[1] ;
      P02LO3_A5555Lb_opcion = new String[] {""} ;
      P02LO3_A5566Lb_Estado = new byte[1] ;
      P02LO3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P02LO3_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P02LO3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P02LO3_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      A5555Lb_opcion = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV16Item_Col_Inc_Obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV17Json_Inc_Obs = "" ;
      AV24Pgmname = "" ;
      P02LO6_A5532Lb_numero = new int[1] ;
      P02LO6_A396EmprCod = new String[] {""} ;
      P02LO6_A5537Lb_ColNum = new int[1] ;
      P02LO6_A5597Lb_TipRec = new byte[1] ;
      P02LO7_A396EmprCod = new String[] {""} ;
      P02LO7_A5532Lb_numero = new int[1] ;
      P02LO7_A5566Lb_Estado = new byte[1] ;
      P02LO7_A5555Lb_opcion = new String[] {""} ;
      P02LO7_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P02LO7_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P02LO7_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P02LO7_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens019a__default(),
         new Object[] {
             new Object[] {
            P02LO2_A5532Lb_numero, P02LO2_A396EmprCod, P02LO2_A5537Lb_ColNum, P02LO2_A5597Lb_TipRec
            }
            , new Object[] {
            P02LO3_A396EmprCod, P02LO3_A5532Lb_numero, P02LO3_A5555Lb_opcion, P02LO3_A5566Lb_Estado, P02LO3_A5567Lb_FechaEn, P02LO3_A5568Lb_HoraEn, P02LO3_A5563Lb_FechaR, P02LO3_A5564Lb_HoraR
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02LO6_A5532Lb_numero, P02LO6_A396EmprCod, P02LO6_A5537Lb_ColNum, P02LO6_A5597Lb_TipRec
            }
            , new Object[] {
            P02LO7_A396EmprCod, P02LO7_A5532Lb_numero, P02LO7_A5566Lb_Estado, P02LO7_A5555Lb_opcion, P02LO7_A5567Lb_FechaEn, P02LO7_A5568Lb_HoraEn, P02LO7_A5563Lb_FechaR, P02LO7_A5564Lb_HoraR
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "GestionLaboratorio.PENS019a" ;
      /* GeneXus formulas. */
      AV24Pgmname = "GestionLaboratorio.PENS019a" ;
      Gx_err = (short)(0) ;
   }

   private byte AV9Lb_tiprec ;
   private byte A5597Lb_TipRec ;
   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int AV18Lb_numero ;
   private int AV8Lb_colnum ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private String AV19EmprCod ;
   private String AV10Lb_opcion ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String AV24Pgmname ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private String AV17Json_Inc_Obs ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P02LO2_A5532Lb_numero ;
   private String[] P02LO2_A396EmprCod ;
   private int[] P02LO2_A5537Lb_ColNum ;
   private byte[] P02LO2_A5597Lb_TipRec ;
   private String[] P02LO3_A396EmprCod ;
   private int[] P02LO3_A5532Lb_numero ;
   private String[] P02LO3_A5555Lb_opcion ;
   private byte[] P02LO3_A5566Lb_Estado ;
   private java.util.Date[] P02LO3_A5567Lb_FechaEn ;
   private java.util.Date[] P02LO3_A5568Lb_HoraEn ;
   private java.util.Date[] P02LO3_A5563Lb_FechaR ;
   private java.util.Date[] P02LO3_A5564Lb_HoraR ;
   private int[] P02LO6_A5532Lb_numero ;
   private String[] P02LO6_A396EmprCod ;
   private int[] P02LO6_A5537Lb_ColNum ;
   private byte[] P02LO6_A5597Lb_TipRec ;
   private String[] P02LO7_A396EmprCod ;
   private int[] P02LO7_A5532Lb_numero ;
   private byte[] P02LO7_A5566Lb_Estado ;
   private String[] P02LO7_A5555Lb_opcion ;
   private java.util.Date[] P02LO7_A5567Lb_FechaEn ;
   private java.util.Date[] P02LO7_A5568Lb_HoraEn ;
   private java.util.Date[] P02LO7_A5563Lb_FechaR ;
   private java.util.Date[] P02LO7_A5564Lb_HoraR ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV15Col_Inc_Obs ;
   private app.SdtIncidenciasObservaciones_SDT AV16Item_Col_Inc_Obs ;
}

final  class pens019a__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LO2", "SELECT Lb_numero, EmprCod, Lb_ColNum, Lb_TipRec FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LO3", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_Estado, Lb_FechaEn, Lb_HoraEn, Lb_FechaR, Lb_HoraR FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02LO4", "UPDATE TXPENS002 SET Lb_Estado=?, Lb_FechaEn=?, Lb_HoraEn=?, Lb_FechaR=?, Lb_HoraR=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new UpdateCursor("P02LO5", "UPDATE TXPENS001 SET Lb_ColNum=?, Lb_TipRec=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
         ,new ForEachCursor("P02LO6", "SELECT Lb_numero, EmprCod, Lb_ColNum, Lb_TipRec FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LO7", "SELECT EmprCod, Lb_numero, Lb_Estado, Lb_opcion, Lb_FechaEn, Lb_HoraEn, Lb_FechaR, Lb_HoraR FROM TXPENS002 WHERE (EmprCod = ? and Lb_numero = ?) AND (Lb_opcion <> ?) AND (Lb_Estado = 3) ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02LO8", "UPDATE TXPENS002 SET Lb_Estado=?, Lb_FechaEn=?, Lb_HoraEn=?, Lb_FechaR=?, Lb_HoraR=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new UpdateCursor("P02LO9", "UPDATE TXPENS001 SET Lb_ColNum=?, Lb_TipRec=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDateTime(3, (java.util.Date)parms[2], true);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], true);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDateTime(3, (java.util.Date)parms[2], true);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], true);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

