package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_impresiondocumentos_dp extends GXProcedure
{
   public trabajoexterno_impresiondocumentos_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_impresiondocumentos_dp.class ), "" );
   }

   public trabajoexterno_impresiondocumentos_dp( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item> executeUdp( String aP0 ,
                                                                                                            java.util.Date aP1 ,
                                                                                                            java.util.Date aP2 ,
                                                                                                            byte aP3 )
   {
      trabajoexterno_impresiondocumentos_dp.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        byte aP3 ,
                        GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             byte aP3 ,
                             GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item>[] aP4 )
   {
      trabajoexterno_impresiondocumentos_dp.this.AV5Emprcod = aP0;
      trabajoexterno_impresiondocumentos_dp.this.AV6SalExtFecfrom = aP1;
      trabajoexterno_impresiondocumentos_dp.this.AV7SalExtFecto = aP2;
      trabajoexterno_impresiondocumentos_dp.this.AV8SalExtLis = aP3;
      trabajoexterno_impresiondocumentos_dp.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV7SalExtFecto ,
                                           AV6SalExtFecfrom ,
                                           A2256SalExtFec ,
                                           Byte.valueOf(A2258SalExtLis) ,
                                           Byte.valueOf(AV8SalExtLis) ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P004C2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Byte.valueOf(AV8SalExtLis), Byte.valueOf(AV8SalExtLis), AV7SalExtFecto, AV6SalExtFecfrom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004C2_A396EmprCod[0] ;
         A2256SalExtFec = P004C2_A2256SalExtFec[0] ;
         A2258SalExtLis = P004C2_A2258SalExtLis[0] ;
         A2253SalExtAlb = P004C2_A2253SalExtAlb[0] ;
         A2248ManCod = P004C2_A2248ManCod[0] ;
         A2249ManNom = P004C2_A2249ManNom[0] ;
         n2249ManNom = P004C2_n2249ManNom[0] ;
         A2249ManNom = P004C2_A2249ManNom[0] ;
         n2249ManNom = P004C2_n2249ManNom[0] ;
         Gxm1trabajoexterno_impresiondocumentos_sdt = (app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item)new app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1trabajoexterno_impresiondocumentos_sdt, 0);
         Gxm1trabajoexterno_impresiondocumentos_sdt.setgxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Seleccionar( false );
         Gxm1trabajoexterno_impresiondocumentos_sdt.setgxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextalb( A2253SalExtAlb );
         Gxm1trabajoexterno_impresiondocumentos_sdt.setgxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextfec( A2256SalExtFec );
         Gxm1trabajoexterno_impresiondocumentos_sdt.setgxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mancod( A2248ManCod );
         Gxm1trabajoexterno_impresiondocumentos_sdt.setgxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Mannom( A2249ManNom );
         Gxm1trabajoexterno_impresiondocumentos_sdt.setgxTv_SdtTrabajoExterno_ImpresionDocumentos_SDT_Item_Salextlis( A2258SalExtLis );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = trabajoexterno_impresiondocumentos_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item>(app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P004C2_A396EmprCod = new String[] {""} ;
      P004C2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P004C2_A2258SalExtLis = new byte[1] ;
      P004C2_A2253SalExtAlb = new int[1] ;
      P004C2_A2248ManCod = new short[1] ;
      P004C2_A2249ManNom = new String[] {""} ;
      P004C2_n2249ManNom = new boolean[] {false} ;
      A2249ManNom = "" ;
      Gxm1trabajoexterno_impresiondocumentos_sdt = new app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_impresiondocumentos_dp__default(),
         new Object[] {
             new Object[] {
            P004C2_A396EmprCod, P004C2_A2256SalExtFec, P004C2_A2258SalExtLis, P004C2_A2253SalExtAlb, P004C2_A2248ManCod, P004C2_A2249ManNom, P004C2_n2249ManNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8SalExtLis ;
   private byte A2258SalExtLis ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A2249ManNom ;
   private java.util.Date AV6SalExtFecfrom ;
   private java.util.Date AV7SalExtFecto ;
   private java.util.Date A2256SalExtFec ;
   private boolean n2249ManNom ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P004C2_A396EmprCod ;
   private java.util.Date[] P004C2_A2256SalExtFec ;
   private byte[] P004C2_A2258SalExtLis ;
   private int[] P004C2_A2253SalExtAlb ;
   private short[] P004C2_A2248ManCod ;
   private String[] P004C2_A2249ManNom ;
   private boolean[] P004C2_n2249ManNom ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item> Gxm2rootcol ;
   private app.trabajosexternos.SdtTrabajoExterno_ImpresionDocumentos_SDT_Item Gxm1trabajoexterno_impresiondocumentos_sdt ;
}

final  class trabajoexterno_impresiondocumentos_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV7SalExtFecto ,
                                          java.util.Date AV6SalExtFecfrom ,
                                          java.util.Date A2256SalExtFec ,
                                          byte A2258SalExtLis ,
                                          byte AV8SalExtLis ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[5];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtFec, T1.SalExtLis, T1.SalExtAlb, T1.ManCod, T2.ManNom FROM (TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod" ;
      scmdbuf += " = T1.ManCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtLis = ? or ? = 9)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7SalExtFecto)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec <= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6SalExtFecfrom)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SalExtLis, T1.SalExtFec" ;
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
                  return conditional_P004C2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[6]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[7]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               return;
      }
   }

}

