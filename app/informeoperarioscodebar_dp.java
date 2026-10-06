package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeoperarioscodebar_dp extends GXProcedure
{
   public informeoperarioscodebar_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeoperarioscodebar_dp.class ), "" );
   }

   public informeoperarioscodebar_dp( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtInformeOperariosCodebar_SDT_Item> executeUdp( String aP0 ,
                                                                                int aP1 ,
                                                                                int aP2 ,
                                                                                String aP3 ,
                                                                                String aP4 ,
                                                                                String aP5 )
   {
      informeoperarioscodebar_dp.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtInformeOperariosCodebar_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        GXBaseCollection<app.SdtInformeOperariosCodebar_SDT_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             GXBaseCollection<app.SdtInformeOperariosCodebar_SDT_Item>[] aP6 )
   {
      informeoperarioscodebar_dp.this.AV5Emprcod = aP0;
      informeoperarioscodebar_dp.this.AV8TFInformeOperariosCodebar_SDT__Opecod = aP1;
      informeoperarioscodebar_dp.this.AV9TFInformeOperariosCodebar_SDT__Opecod_To = aP2;
      informeoperarioscodebar_dp.this.AV10TFInformeOperariosCodebar_SDT__Openom = aP3;
      informeoperarioscodebar_dp.this.AV11TFInformeOperariosCodebar_SDT__Openom2 = aP4;
      informeoperarioscodebar_dp.this.AV6TFInformeOperariosCodebar_SDT__Opeact = aP5;
      informeoperarioscodebar_dp.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV6TFInformeOperariosCodebar_SDT__Opeact ,
                                           AV11TFInformeOperariosCodebar_SDT__Openom2 ,
                                           AV10TFInformeOperariosCodebar_SDT__Openom ,
                                           Integer.valueOf(AV9TFInformeOperariosCodebar_SDT__Opecod_To) ,
                                           Integer.valueOf(AV8TFInformeOperariosCodebar_SDT__Opecod) ,
                                           A8482OpeAct ,
                                           A6869OpeNom2 ,
                                           A653OpeNom ,
                                           Integer.valueOf(A652OpeCod) ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV6TFInformeOperariosCodebar_SDT__Opeact = GXutil.padr( GXutil.rtrim( AV6TFInformeOperariosCodebar_SDT__Opeact), 1, "%") ;
      lV11TFInformeOperariosCodebar_SDT__Openom2 = GXutil.padr( GXutil.rtrim( AV11TFInformeOperariosCodebar_SDT__Openom2), 30, "%") ;
      lV10TFInformeOperariosCodebar_SDT__Openom = GXutil.padr( GXutil.rtrim( AV10TFInformeOperariosCodebar_SDT__Openom), 30, "%") ;
      /* Using cursor P003J2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, lV6TFInformeOperariosCodebar_SDT__Opeact, lV11TFInformeOperariosCodebar_SDT__Openom2, lV10TFInformeOperariosCodebar_SDT__Openom, Integer.valueOf(AV9TFInformeOperariosCodebar_SDT__Opecod_To), Integer.valueOf(AV8TFInformeOperariosCodebar_SDT__Opecod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P003J2_A396EmprCod[0] ;
         A652OpeCod = P003J2_A652OpeCod[0] ;
         A653OpeNom = P003J2_A653OpeNom[0] ;
         n653OpeNom = P003J2_n653OpeNom[0] ;
         A6869OpeNom2 = P003J2_A6869OpeNom2[0] ;
         n6869OpeNom2 = P003J2_n6869OpeNom2[0] ;
         A8482OpeAct = P003J2_A8482OpeAct[0] ;
         n8482OpeAct = P003J2_n8482OpeAct[0] ;
         Gxm1informeoperarioscodebar_sdt = (app.SdtInformeOperariosCodebar_SDT_Item)new app.SdtInformeOperariosCodebar_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1informeoperarioscodebar_sdt, 0);
         Gxm1informeoperarioscodebar_sdt.setgxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar( false );
         Gxm1informeoperarioscodebar_sdt.setgxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod( A652OpeCod );
         Gxm1informeoperarioscodebar_sdt.setgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom( A653OpeNom );
         Gxm1informeoperarioscodebar_sdt.setgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2( A6869OpeNom2 );
         Gxm1informeoperarioscodebar_sdt.setgxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact( A8482OpeAct );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = informeoperarioscodebar_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtInformeOperariosCodebar_SDT_Item>(app.SdtInformeOperariosCodebar_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV6TFInformeOperariosCodebar_SDT__Opeact = "" ;
      lV11TFInformeOperariosCodebar_SDT__Openom2 = "" ;
      lV10TFInformeOperariosCodebar_SDT__Openom = "" ;
      A8482OpeAct = "" ;
      A6869OpeNom2 = "" ;
      A653OpeNom = "" ;
      A396EmprCod = "" ;
      P003J2_A396EmprCod = new String[] {""} ;
      P003J2_A652OpeCod = new int[1] ;
      P003J2_A653OpeNom = new String[] {""} ;
      P003J2_n653OpeNom = new boolean[] {false} ;
      P003J2_A6869OpeNom2 = new String[] {""} ;
      P003J2_n6869OpeNom2 = new boolean[] {false} ;
      P003J2_A8482OpeAct = new String[] {""} ;
      P003J2_n8482OpeAct = new boolean[] {false} ;
      Gxm1informeoperarioscodebar_sdt = new app.SdtInformeOperariosCodebar_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informeoperarioscodebar_dp__default(),
         new Object[] {
             new Object[] {
            P003J2_A396EmprCod, P003J2_A652OpeCod, P003J2_A653OpeNom, P003J2_n653OpeNom, P003J2_A6869OpeNom2, P003J2_n6869OpeNom2, P003J2_A8482OpeAct, P003J2_n8482OpeAct
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8TFInformeOperariosCodebar_SDT__Opecod ;
   private int AV9TFInformeOperariosCodebar_SDT__Opecod_To ;
   private int A652OpeCod ;
   private String AV5Emprcod ;
   private String AV10TFInformeOperariosCodebar_SDT__Openom ;
   private String AV11TFInformeOperariosCodebar_SDT__Openom2 ;
   private String AV6TFInformeOperariosCodebar_SDT__Opeact ;
   private String scmdbuf ;
   private String lV6TFInformeOperariosCodebar_SDT__Opeact ;
   private String lV11TFInformeOperariosCodebar_SDT__Openom2 ;
   private String lV10TFInformeOperariosCodebar_SDT__Openom ;
   private String A8482OpeAct ;
   private String A6869OpeNom2 ;
   private String A653OpeNom ;
   private String A396EmprCod ;
   private boolean n653OpeNom ;
   private boolean n6869OpeNom2 ;
   private boolean n8482OpeAct ;
   private GXBaseCollection<app.SdtInformeOperariosCodebar_SDT_Item>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P003J2_A396EmprCod ;
   private int[] P003J2_A652OpeCod ;
   private String[] P003J2_A653OpeNom ;
   private boolean[] P003J2_n653OpeNom ;
   private String[] P003J2_A6869OpeNom2 ;
   private boolean[] P003J2_n6869OpeNom2 ;
   private String[] P003J2_A8482OpeAct ;
   private boolean[] P003J2_n8482OpeAct ;
   private GXBaseCollection<app.SdtInformeOperariosCodebar_SDT_Item> Gxm2rootcol ;
   private app.SdtInformeOperariosCodebar_SDT_Item Gxm1informeoperarioscodebar_sdt ;
}

final  class informeoperarioscodebar_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV6TFInformeOperariosCodebar_SDT__Opeact ,
                                          String AV11TFInformeOperariosCodebar_SDT__Openom2 ,
                                          String AV10TFInformeOperariosCodebar_SDT__Openom ,
                                          int AV9TFInformeOperariosCodebar_SDT__Opecod_To ,
                                          int AV8TFInformeOperariosCodebar_SDT__Opecod ,
                                          String A8482OpeAct ,
                                          String A6869OpeNom2 ,
                                          String A653OpeNom ,
                                          int A652OpeCod ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, OpeCod, OpeNom, OpeNom2, OpeAct FROM TXPOPERAR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV6TFInformeOperariosCodebar_SDT__Opeact)==0) )
      {
         addWhere(sWhereString, "(OpeAct like '%' || ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFInformeOperariosCodebar_SDT__Openom2)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(OpeNom2))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10TFInformeOperariosCodebar_SDT__Openom)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(OpeNom))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV9TFInformeOperariosCodebar_SDT__Opecod_To) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV8TFInformeOperariosCodebar_SDT__Opecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, OpeCod" ;
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
                  return conditional_P003J2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

