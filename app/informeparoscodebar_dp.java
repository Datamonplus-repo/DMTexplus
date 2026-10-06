package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeparoscodebar_dp extends GXProcedure
{
   public informeparoscodebar_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeparoscodebar_dp.class ), "" );
   }

   public informeparoscodebar_dp( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtInformeParosCodebar_SDT_Item> executeUdp( String aP0 ,
                                                                            short aP1 ,
                                                                            short aP2 ,
                                                                            short aP3 ,
                                                                            String aP4 ,
                                                                            String aP5 ,
                                                                            String aP6 ,
                                                                            String aP7 )
   {
      informeparoscodebar_dp.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.SdtInformeParosCodebar_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short aP2 ,
                        short aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        GXBaseCollection<app.SdtInformeParosCodebar_SDT_Item>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short aP2 ,
                             short aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             GXBaseCollection<app.SdtInformeParosCodebar_SDT_Item>[] aP8 )
   {
      informeparoscodebar_dp.this.AV5Emprcod = aP0;
      informeparoscodebar_dp.this.AV6TFInformeParosCodebar_SDTs__Parcod = aP1;
      informeparoscodebar_dp.this.AV8TFInformeParosCodebar_SDTs__Parcod_To = aP2;
      informeparoscodebar_dp.this.AV7TFInformeParosCodebar_SDTs__Parcod_Sel = aP3;
      informeparoscodebar_dp.this.AV9TFInformeParosCodebar_SDTs__Parcodnom = aP4;
      informeparoscodebar_dp.this.AV10TFInformeParosCodebar_SDTs__Parcodnom_Sel = aP5;
      informeparoscodebar_dp.this.AV11TFInformeParosCodebar_SDTs__ParCodEst = aP6;
      informeparoscodebar_dp.this.AV12TFInformeParosCodebar_SDTs__ParCodEst_Sel = aP7;
      informeparoscodebar_dp.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV6TFInformeParosCodebar_SDTs__Parcod) ,
                                           Short.valueOf(AV8TFInformeParosCodebar_SDTs__Parcod_To) ,
                                           Short.valueOf(AV7TFInformeParosCodebar_SDTs__Parcod_Sel) ,
                                           AV9TFInformeParosCodebar_SDTs__Parcodnom ,
                                           AV10TFInformeParosCodebar_SDTs__Parcodnom_Sel ,
                                           AV11TFInformeParosCodebar_SDTs__ParCodEst ,
                                           AV12TFInformeParosCodebar_SDTs__ParCodEst_Sel ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           A8481ParCodEst ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV9TFInformeParosCodebar_SDTs__Parcodnom = GXutil.padr( GXutil.rtrim( AV9TFInformeParosCodebar_SDTs__Parcodnom), 30, "%") ;
      lV11TFInformeParosCodebar_SDTs__ParCodEst = GXutil.padr( GXutil.rtrim( AV11TFInformeParosCodebar_SDTs__ParCodEst), 1, "%") ;
      /* Using cursor P003L2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Short.valueOf(AV6TFInformeParosCodebar_SDTs__Parcod), Short.valueOf(AV8TFInformeParosCodebar_SDTs__Parcod_To), Short.valueOf(AV7TFInformeParosCodebar_SDTs__Parcod_Sel), lV9TFInformeParosCodebar_SDTs__Parcodnom, AV10TFInformeParosCodebar_SDTs__Parcodnom_Sel, lV11TFInformeParosCodebar_SDTs__ParCodEst, AV12TFInformeParosCodebar_SDTs__ParCodEst_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8481ParCodEst = P003L2_A8481ParCodEst[0] ;
         n8481ParCodEst = P003L2_n8481ParCodEst[0] ;
         A867ParCodNom = P003L2_A867ParCodNom[0] ;
         n867ParCodNom = P003L2_n867ParCodNom[0] ;
         A656ParCod = P003L2_A656ParCod[0] ;
         A396EmprCod = P003L2_A396EmprCod[0] ;
         Gxm1informeparoscodebar_sdt = (app.SdtInformeParosCodebar_SDT_Item)new app.SdtInformeParosCodebar_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1informeparoscodebar_sdt, 0);
         Gxm1informeparoscodebar_sdt.setgxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar( false );
         Gxm1informeparoscodebar_sdt.setgxTv_SdtInformeParosCodebar_SDT_Item_Parcod( A656ParCod );
         Gxm1informeparoscodebar_sdt.setgxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom( A867ParCodNom );
         Gxm1informeparoscodebar_sdt.setgxTv_SdtInformeParosCodebar_SDT_Item_Parcodest( A8481ParCodEst );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = informeparoscodebar_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtInformeParosCodebar_SDT_Item>(app.SdtInformeParosCodebar_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV9TFInformeParosCodebar_SDTs__Parcodnom = "" ;
      lV11TFInformeParosCodebar_SDTs__ParCodEst = "" ;
      A867ParCodNom = "" ;
      A8481ParCodEst = "" ;
      A396EmprCod = "" ;
      P003L2_A8481ParCodEst = new String[] {""} ;
      P003L2_n8481ParCodEst = new boolean[] {false} ;
      P003L2_A867ParCodNom = new String[] {""} ;
      P003L2_n867ParCodNom = new boolean[] {false} ;
      P003L2_A656ParCod = new short[1] ;
      P003L2_A396EmprCod = new String[] {""} ;
      Gxm1informeparoscodebar_sdt = new app.SdtInformeParosCodebar_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informeparoscodebar_dp__default(),
         new Object[] {
             new Object[] {
            P003L2_A8481ParCodEst, P003L2_n8481ParCodEst, P003L2_A867ParCodNom, P003L2_n867ParCodNom, P003L2_A656ParCod, P003L2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV6TFInformeParosCodebar_SDTs__Parcod ;
   private short AV8TFInformeParosCodebar_SDTs__Parcod_To ;
   private short AV7TFInformeParosCodebar_SDTs__Parcod_Sel ;
   private short A656ParCod ;
   private short Gx_err ;
   private String AV5Emprcod ;
   private String AV9TFInformeParosCodebar_SDTs__Parcodnom ;
   private String AV10TFInformeParosCodebar_SDTs__Parcodnom_Sel ;
   private String AV11TFInformeParosCodebar_SDTs__ParCodEst ;
   private String AV12TFInformeParosCodebar_SDTs__ParCodEst_Sel ;
   private String scmdbuf ;
   private String lV9TFInformeParosCodebar_SDTs__Parcodnom ;
   private String lV11TFInformeParosCodebar_SDTs__ParCodEst ;
   private String A867ParCodNom ;
   private String A8481ParCodEst ;
   private String A396EmprCod ;
   private boolean n8481ParCodEst ;
   private boolean n867ParCodNom ;
   private GXBaseCollection<app.SdtInformeParosCodebar_SDT_Item>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P003L2_A8481ParCodEst ;
   private boolean[] P003L2_n8481ParCodEst ;
   private String[] P003L2_A867ParCodNom ;
   private boolean[] P003L2_n867ParCodNom ;
   private short[] P003L2_A656ParCod ;
   private String[] P003L2_A396EmprCod ;
   private GXBaseCollection<app.SdtInformeParosCodebar_SDT_Item> Gxm2rootcol ;
   private app.SdtInformeParosCodebar_SDT_Item Gxm1informeparoscodebar_sdt ;
}

final  class informeparoscodebar_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV6TFInformeParosCodebar_SDTs__Parcod ,
                                          short AV8TFInformeParosCodebar_SDTs__Parcod_To ,
                                          short AV7TFInformeParosCodebar_SDTs__Parcod_Sel ,
                                          String AV9TFInformeParosCodebar_SDTs__Parcodnom ,
                                          String AV10TFInformeParosCodebar_SDTs__Parcodnom_Sel ,
                                          String AV11TFInformeParosCodebar_SDTs__ParCodEst ,
                                          String AV12TFInformeParosCodebar_SDTs__ParCodEst_Sel ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String A8481ParCodEst ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[8];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT ParCodEst, ParCodNom, ParCod, EmprCod FROM TXPCODPAR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (0==AV6TFInformeParosCodebar_SDTs__Parcod) )
      {
         addWhere(sWhereString, "(ParCod >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8TFInformeParosCodebar_SDTs__Parcod_To) )
      {
         addWhere(sWhereString, "(ParCod <= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV7TFInformeParosCodebar_SDTs__Parcod_Sel) )
      {
         addWhere(sWhereString, "(ParCod = ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9TFInformeParosCodebar_SDTs__Parcodnom)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ParCodNom))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10TFInformeParosCodebar_SDTs__Parcodnom_Sel)==0) )
      {
         addWhere(sWhereString, "(ParCodNom = ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFInformeParosCodebar_SDTs__ParCodEst)==0) )
      {
         addWhere(sWhereString, "(ParCodEst like '%' || ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12TFInformeParosCodebar_SDTs__ParCodEst_Sel)==0) )
      {
         addWhere(sWhereString, "(ParCodEst = ?)");
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, ParCod" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_P003L2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               return;
      }
   }

}

