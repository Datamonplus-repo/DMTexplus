package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tiempomedioentrega_lab_dp extends GXProcedure
{
   public tiempomedioentrega_lab_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tiempomedioentrega_lab_dp.class ), "" );
   }

   public tiempomedioentrega_lab_dp( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB> executeUdp( String aP0 ,
                                                                                         int aP1 ,
                                                                                         int aP2 ,
                                                                                         String aP3 ,
                                                                                         String aP4 ,
                                                                                         String aP5 ,
                                                                                         String aP6 ,
                                                                                         java.util.Date aP7 ,
                                                                                         java.util.Date aP8 ,
                                                                                         java.util.Date aP9 ,
                                                                                         java.util.Date aP10 )
   {
      tiempomedioentrega_lab_dp.this.aP11 = new GXBaseCollection[] {new GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        java.util.Date aP7 ,
                        java.util.Date aP8 ,
                        java.util.Date aP9 ,
                        java.util.Date aP10 ,
                        GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB>[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             java.util.Date aP7 ,
                             java.util.Date aP8 ,
                             java.util.Date aP9 ,
                             java.util.Date aP10 ,
                             GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB>[] aP11 )
   {
      tiempomedioentrega_lab_dp.this.AV11Emprcod = aP0;
      tiempomedioentrega_lab_dp.this.AV7Clicod = aP1;
      tiempomedioentrega_lab_dp.this.AV9CLicod_to = aP2;
      tiempomedioentrega_lab_dp.this.AV8Lb_Artcod = aP3;
      tiempomedioentrega_lab_dp.this.AV10Lb_Artcod_to = aP4;
      tiempomedioentrega_lab_dp.this.AV12Lb_Cartaz = aP5;
      tiempomedioentrega_lab_dp.this.AV13Lb_Cartaz_to = aP6;
      tiempomedioentrega_lab_dp.this.AV14Lb_FechaE = aP7;
      tiempomedioentrega_lab_dp.this.AV15Lb_FechaE_to = aP8;
      tiempomedioentrega_lab_dp.this.AV16Lb_FechaEninout = aP9;
      tiempomedioentrega_lab_dp.this.AV17Lb_FechaEninout_to = aP10;
      tiempomedioentrega_lab_dp.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV15Lb_FechaE_to ,
                                           AV14Lb_FechaE ,
                                           AV13Lb_Cartaz_to ,
                                           AV12Lb_Cartaz ,
                                           AV10Lb_Artcod_to ,
                                           AV8Lb_Artcod ,
                                           Integer.valueOf(AV9CLicod_to) ,
                                           Integer.valueOf(AV7Clicod) ,
                                           A5541Lb_FechaE ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           AV11Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P002H2 */
      pr_default.execute(0, new Object[] {AV11Emprcod, AV15Lb_FechaE_to, AV14Lb_FechaE, AV13Lb_Cartaz_to, AV12Lb_Cartaz, AV10Lb_Artcod_to, AV8Lb_Artcod, Integer.valueOf(AV9CLicod_to), Integer.valueOf(AV7Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P002H2_A5532Lb_numero[0] ;
         A396EmprCod = P002H2_A396EmprCod[0] ;
         A252CliCod = P002H2_A252CliCod[0] ;
         A5533Lb_ArtCod = P002H2_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P002H2_A5540Lb_Cartaz[0] ;
         A5541Lb_FechaE = P002H2_A5541Lb_FechaE[0] ;
         A279CliNom = P002H2_A279CliNom[0] ;
         A5536Lb_ColNom = P002H2_A5536Lb_ColNom[0] ;
         A279CliNom = P002H2_A279CliNom[0] ;
         Gxm1tiempomedioentrega_lab = (app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB)new app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB(remoteHandle, context);
         Gxm2rootcol.add(Gxm1tiempomedioentrega_lab, 0);
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Clicod( A252CliCod );
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Clinom( A279CliNom );
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Lb_numero( A5532Lb_numero );
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod( A5533Lb_ArtCod );
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom( A5536Lb_ColNom );
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz( A5540Lb_Cartaz );
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae( A5541Lb_FechaE );
         AV5Lb_fechaen = GXutil.nullDate() ;
         AV6Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV16Lb_FechaEninout ,
                                              AV17Lb_FechaEninout_to ,
                                              A5567Lb_FechaEn ,
                                              A396EmprCod ,
                                              Integer.valueOf(A5532Lb_numero) } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         /* Using cursor P002H3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV16Lb_FechaEninout, AV17Lb_FechaEninout_to});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5567Lb_FechaEn = P002H3_A5567Lb_FechaEn[0] ;
            A5568Lb_HoraEn = P002H3_A5568Lb_HoraEn[0] ;
            A5555Lb_opcion = P002H3_A5555Lb_opcion[0] ;
            AV5Lb_fechaen = A5567Lb_FechaEn ;
            AV6Lb_HoraEn = A5568Lb_HoraEn ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GXt_int1 = AV18Lb_Dias ;
         GXv_char2[0] = A396EmprCod ;
         GXv_date3[0] = A5541Lb_FechaE ;
         GXv_date4[0] = AV5Lb_fechaen ;
         GXv_int5[0] = AV19Dias_f ;
         GXv_int6[0] = GXt_int1 ;
         new app.pdialbdcopy1(remoteHandle, context).execute( GXv_char2, GXv_date3, GXv_date4, GXv_int5, GXv_int6) ;
         tiempomedioentrega_lab_dp.this.A396EmprCod = GXv_char2[0] ;
         tiempomedioentrega_lab_dp.this.A5541Lb_FechaE = GXv_date3[0] ;
         tiempomedioentrega_lab_dp.this.AV5Lb_fechaen = GXv_date4[0] ;
         tiempomedioentrega_lab_dp.this.AV19Dias_f = GXv_int5[0] ;
         tiempomedioentrega_lab_dp.this.GXt_int1 = GXv_int6[0] ;
         AV18Lb_Dias = (short)((GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV5Lb_fechaen)) ? 0 : GXt_int1)) ;
         AV18Lb_Dias = (short)(((0==AV18Lb_Dias)&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV5Lb_fechaen)) ? 0 : (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV5Lb_fechaen)) ? 0 : (GXutil.ddiff(AV5Lb_fechaen,A5541Lb_FechaE))))) ;
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen( AV5Lb_fechaen );
         Gxm1tiempomedioentrega_lab.setgxTv_SdtTiempoMedioEntrega_LAB_Lb_dias( AV18Lb_Dias );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP11[0] = tiempomedioentrega_lab_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB>(app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB.class, "TiempoMedioEntrega_LAB", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A396EmprCod = "" ;
      P002H2_A5532Lb_numero = new int[1] ;
      P002H2_A396EmprCod = new String[] {""} ;
      P002H2_A252CliCod = new int[1] ;
      P002H2_A5533Lb_ArtCod = new String[] {""} ;
      P002H2_A5540Lb_Cartaz = new String[] {""} ;
      P002H2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P002H2_A279CliNom = new String[] {""} ;
      P002H2_A5536Lb_ColNom = new String[] {""} ;
      A279CliNom = "" ;
      A5536Lb_ColNom = "" ;
      Gxm1tiempomedioentrega_lab = new app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB(remoteHandle, context);
      AV5Lb_fechaen = GXutil.nullDate() ;
      AV6Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5567Lb_FechaEn = GXutil.nullDate() ;
      P002H3_A396EmprCod = new String[] {""} ;
      P002H3_A5532Lb_numero = new int[1] ;
      P002H3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P002H3_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P002H3_A5555Lb_opcion = new String[] {""} ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5555Lb_opcion = "" ;
      GXv_char2 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_date4 = new java.util.Date[1] ;
      GXv_int5 = new short[1] ;
      GXv_int6 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tiempomedioentrega_lab_dp__default(),
         new Object[] {
             new Object[] {
            P002H2_A5532Lb_numero, P002H2_A396EmprCod, P002H2_A252CliCod, P002H2_A5533Lb_ArtCod, P002H2_A5540Lb_Cartaz, P002H2_A5541Lb_FechaE, P002H2_A279CliNom, P002H2_A5536Lb_ColNom
            }
            , new Object[] {
            P002H3_A396EmprCod, P002H3_A5532Lb_numero, P002H3_A5567Lb_FechaEn, P002H3_A5568Lb_HoraEn, P002H3_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18Lb_Dias ;
   private short GXt_int1 ;
   private short AV19Dias_f ;
   private short GXv_int5[] ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int AV7Clicod ;
   private int AV9CLicod_to ;
   private int A252CliCod ;
   private int A5532Lb_numero ;
   private String AV11Emprcod ;
   private String AV8Lb_Artcod ;
   private String AV10Lb_Artcod_to ;
   private String AV12Lb_Cartaz ;
   private String AV13Lb_Cartaz_to ;
   private String scmdbuf ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A5536Lb_ColNom ;
   private String A5555Lb_opcion ;
   private String GXv_char2[] ;
   private java.util.Date AV6Lb_HoraEn ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date AV14Lb_FechaE ;
   private java.util.Date AV15Lb_FechaE_to ;
   private java.util.Date AV16Lb_FechaEninout ;
   private java.util.Date AV17Lb_FechaEninout_to ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV5Lb_fechaen ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date GXv_date4[] ;
   private GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB>[] aP11 ;
   private IDataStoreProvider pr_default ;
   private int[] P002H2_A5532Lb_numero ;
   private String[] P002H2_A396EmprCod ;
   private int[] P002H2_A252CliCod ;
   private String[] P002H2_A5533Lb_ArtCod ;
   private String[] P002H2_A5540Lb_Cartaz ;
   private java.util.Date[] P002H2_A5541Lb_FechaE ;
   private String[] P002H2_A279CliNom ;
   private String[] P002H2_A5536Lb_ColNom ;
   private String[] P002H3_A396EmprCod ;
   private int[] P002H3_A5532Lb_numero ;
   private java.util.Date[] P002H3_A5567Lb_FechaEn ;
   private java.util.Date[] P002H3_A5568Lb_HoraEn ;
   private String[] P002H3_A5555Lb_opcion ;
   private GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB> Gxm2rootcol ;
   private app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB Gxm1tiempomedioentrega_lab ;
}

final  class tiempomedioentrega_lab_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV15Lb_FechaE_to ,
                                          java.util.Date AV14Lb_FechaE ,
                                          String AV13Lb_Cartaz_to ,
                                          String AV12Lb_Cartaz ,
                                          String AV10Lb_Artcod_to ,
                                          String AV8Lb_Artcod ,
                                          int AV9CLicod_to ,
                                          int AV7Clicod ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          int A252CliCod ,
                                          String AV11Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[9];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.CliCod, T1.Lb_ArtCod, T1.Lb_Cartaz, T1.Lb_FechaE, T2.CliNom, T1.Lb_ColNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15Lb_FechaE_to)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14Lb_FechaE)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13Lb_Cartaz_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz <= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz >= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10Lb_Artcod_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod <= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8Lb_Artcod)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod >= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (0==AV9CLicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (0==AV7Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P002H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV16Lb_FechaEninout ,
                                          java.util.Date AV17Lb_FechaEninout_to ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[4];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_HoraEn, Lb_opcion FROM TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ? and Lb_numero = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16Lb_FechaEninout)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17Lb_FechaEninout_to)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn <= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Lb_numero" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P002H2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_P002H3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               return;
      }
   }

}

