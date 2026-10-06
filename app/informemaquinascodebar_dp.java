package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informemaquinascodebar_dp extends GXProcedure
{
   public informemaquinascodebar_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informemaquinascodebar_dp.class ), "" );
   }

   public informemaquinascodebar_dp( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtInformeMaquinasCodebar_SDT_Item> executeUdp( String aP0 ,
                                                                               String aP1 ,
                                                                               String aP2 ,
                                                                               String aP3 )
   {
      informemaquinascodebar_dp.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.SdtInformeMaquinasCodebar_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        GXBaseCollection<app.SdtInformeMaquinasCodebar_SDT_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GXBaseCollection<app.SdtInformeMaquinasCodebar_SDT_Item>[] aP4 )
   {
      informemaquinascodebar_dp.this.AV5Emprcod = aP0;
      informemaquinascodebar_dp.this.AV7TFInformeMaquinasCodebar_SDT__Maqcod = aP1;
      informemaquinascodebar_dp.this.AV8TFInformeMaquinasCodebar_SDT__MaqDsc = aP2;
      informemaquinascodebar_dp.this.AV9TFInformeMaquinasCodebar_SDT__MaqEst = aP3;
      informemaquinascodebar_dp.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9TFInformeMaquinasCodebar_SDT__MaqEst ,
                                           AV8TFInformeMaquinasCodebar_SDT__MaqDsc ,
                                           AV7TFInformeMaquinasCodebar_SDT__Maqcod ,
                                           A607MaqEst ,
                                           A606MaqDsc ,
                                           A602MaqCod ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV9TFInformeMaquinasCodebar_SDT__MaqEst = GXutil.padr( GXutil.rtrim( AV9TFInformeMaquinasCodebar_SDT__MaqEst), 1, "%") ;
      lV8TFInformeMaquinasCodebar_SDT__MaqDsc = GXutil.padr( GXutil.rtrim( AV8TFInformeMaquinasCodebar_SDT__MaqDsc), 16, "%") ;
      lV7TFInformeMaquinasCodebar_SDT__Maqcod = GXutil.padr( GXutil.rtrim( AV7TFInformeMaquinasCodebar_SDT__Maqcod), 6, "%") ;
      /* Using cursor P003K2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, lV9TFInformeMaquinasCodebar_SDT__MaqEst, lV8TFInformeMaquinasCodebar_SDT__MaqDsc, lV7TFInformeMaquinasCodebar_SDT__Maqcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P003K2_A396EmprCod[0] ;
         A602MaqCod = P003K2_A602MaqCod[0] ;
         A606MaqDsc = P003K2_A606MaqDsc[0] ;
         n606MaqDsc = P003K2_n606MaqDsc[0] ;
         A607MaqEst = P003K2_A607MaqEst[0] ;
         n607MaqEst = P003K2_n607MaqEst[0] ;
         Gxm1informemaquinascodebar_sdt = (app.SdtInformeMaquinasCodebar_SDT_Item)new app.SdtInformeMaquinasCodebar_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1informemaquinascodebar_sdt, 0);
         Gxm1informemaquinascodebar_sdt.setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar( false );
         Gxm1informemaquinascodebar_sdt.setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod( A602MaqCod );
         Gxm1informemaquinascodebar_sdt.setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc( A606MaqDsc );
         Gxm1informemaquinascodebar_sdt.setgxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest( A607MaqEst );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = informemaquinascodebar_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtInformeMaquinasCodebar_SDT_Item>(app.SdtInformeMaquinasCodebar_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV9TFInformeMaquinasCodebar_SDT__MaqEst = "" ;
      lV8TFInformeMaquinasCodebar_SDT__MaqDsc = "" ;
      lV7TFInformeMaquinasCodebar_SDT__Maqcod = "" ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      P003K2_A396EmprCod = new String[] {""} ;
      P003K2_A602MaqCod = new String[] {""} ;
      P003K2_A606MaqDsc = new String[] {""} ;
      P003K2_n606MaqDsc = new boolean[] {false} ;
      P003K2_A607MaqEst = new String[] {""} ;
      P003K2_n607MaqEst = new boolean[] {false} ;
      Gxm1informemaquinascodebar_sdt = new app.SdtInformeMaquinasCodebar_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informemaquinascodebar_dp__default(),
         new Object[] {
             new Object[] {
            P003K2_A396EmprCod, P003K2_A602MaqCod, P003K2_A606MaqDsc, P003K2_n606MaqDsc, P003K2_A607MaqEst, P003K2_n607MaqEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV5Emprcod ;
   private String AV7TFInformeMaquinasCodebar_SDT__Maqcod ;
   private String AV8TFInformeMaquinasCodebar_SDT__MaqDsc ;
   private String AV9TFInformeMaquinasCodebar_SDT__MaqEst ;
   private String scmdbuf ;
   private String lV9TFInformeMaquinasCodebar_SDT__MaqEst ;
   private String lV8TFInformeMaquinasCodebar_SDT__MaqDsc ;
   private String lV7TFInformeMaquinasCodebar_SDT__Maqcod ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private boolean n606MaqDsc ;
   private boolean n607MaqEst ;
   private GXBaseCollection<app.SdtInformeMaquinasCodebar_SDT_Item>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P003K2_A396EmprCod ;
   private String[] P003K2_A602MaqCod ;
   private String[] P003K2_A606MaqDsc ;
   private boolean[] P003K2_n606MaqDsc ;
   private String[] P003K2_A607MaqEst ;
   private boolean[] P003K2_n607MaqEst ;
   private GXBaseCollection<app.SdtInformeMaquinasCodebar_SDT_Item> Gxm2rootcol ;
   private app.SdtInformeMaquinasCodebar_SDT_Item Gxm1informemaquinascodebar_sdt ;
}

final  class informemaquinascodebar_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV9TFInformeMaquinasCodebar_SDT__MaqEst ,
                                          String AV8TFInformeMaquinasCodebar_SDT__MaqDsc ,
                                          String AV7TFInformeMaquinasCodebar_SDT__Maqcod ,
                                          String A607MaqEst ,
                                          String A606MaqDsc ,
                                          String A602MaqCod ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[4];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, MaqCod, MaqDsc, MaqEst FROM TXPMAQUIN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV9TFInformeMaquinasCodebar_SDT__MaqEst)==0) )
      {
         addWhere(sWhereString, "(MaqEst like '%' || ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8TFInformeMaquinasCodebar_SDT__MaqDsc)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(MaqDsc))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7TFInformeMaquinasCodebar_SDT__Maqcod)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(MaqCod))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod" ;
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
                  return conditional_P003K2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               return;
      }
   }

}

