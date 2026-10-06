package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno__impresion_dp extends GXProcedure
{
   public trabajoexterno__impresion_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno__impresion_dp.class ), "" );
   }

   public trabajoexterno__impresion_dp( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item> executeUdp( String aP0 ,
                                                                                                   java.util.Date aP1 ,
                                                                                                   java.util.Date aP2 ,
                                                                                                   byte aP3 ,
                                                                                                   short aP4 ,
                                                                                                   short aP5 ,
                                                                                                   int aP6 ,
                                                                                                   int aP7 )
   {
      trabajoexterno__impresion_dp.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        byte aP3 ,
                        short aP4 ,
                        short aP5 ,
                        int aP6 ,
                        int aP7 ,
                        GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             byte aP3 ,
                             short aP4 ,
                             short aP5 ,
                             int aP6 ,
                             int aP7 ,
                             GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item>[] aP8 )
   {
      trabajoexterno__impresion_dp.this.AV5EMprcod = aP0;
      trabajoexterno__impresion_dp.this.AV7SalExtFecfrom = aP1;
      trabajoexterno__impresion_dp.this.AV8SalExtFecto = aP2;
      trabajoexterno__impresion_dp.this.AV6SalExtLis = aP3;
      trabajoexterno__impresion_dp.this.AV9ManCodFrom = aP4;
      trabajoexterno__impresion_dp.this.AV10ManCodTo = aP5;
      trabajoexterno__impresion_dp.this.AV11SalExtAlbFrom = aP6;
      trabajoexterno__impresion_dp.this.AV12SalExtAlbto = aP7;
      trabajoexterno__impresion_dp.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV12SalExtAlbto) ,
                                           Integer.valueOf(AV11SalExtAlbFrom) ,
                                           Short.valueOf(AV10ManCodTo) ,
                                           Short.valueOf(AV9ManCodFrom) ,
                                           AV8SalExtFecto ,
                                           AV7SalExtFecfrom ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Short.valueOf(A2248ManCod) ,
                                           A2256SalExtFec ,
                                           Byte.valueOf(A2258SalExtLis) ,
                                           Byte.valueOf(AV6SalExtLis) ,
                                           AV5EMprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P004N2 */
      pr_default.execute(0, new Object[] {AV5EMprcod, Byte.valueOf(AV6SalExtLis), Byte.valueOf(AV6SalExtLis), Integer.valueOf(AV12SalExtAlbto), Integer.valueOf(AV11SalExtAlbFrom), Short.valueOf(AV10ManCodTo), Short.valueOf(AV9ManCodFrom), AV8SalExtFecto, AV7SalExtFecfrom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004N2_A396EmprCod[0] ;
         A2256SalExtFec = P004N2_A2256SalExtFec[0] ;
         A2248ManCod = P004N2_A2248ManCod[0] ;
         A2253SalExtAlb = P004N2_A2253SalExtAlb[0] ;
         A2258SalExtLis = P004N2_A2258SalExtLis[0] ;
         A2249ManNom = P004N2_A2249ManNom[0] ;
         n2249ManNom = P004N2_n2249ManNom[0] ;
         A2249ManNom = P004N2_A2249ManNom[0] ;
         n2249ManNom = P004N2_n2249ManNom[0] ;
         Gxm1trabajoexterno__impresion_sdt = (app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item)new app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1trabajoexterno__impresion_sdt, 0);
         Gxm1trabajoexterno__impresion_sdt.setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar( false );
         Gxm1trabajoexterno__impresion_sdt.setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb( A2253SalExtAlb );
         Gxm1trabajoexterno__impresion_sdt.setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec( A2256SalExtFec );
         Gxm1trabajoexterno__impresion_sdt.setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod( A2248ManCod );
         Gxm1trabajoexterno__impresion_sdt.setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom( A2249ManNom );
         Gxm1trabajoexterno__impresion_sdt.setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis( A2258SalExtLis );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = trabajoexterno__impresion_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item>(app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P004N2_A396EmprCod = new String[] {""} ;
      P004N2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P004N2_A2248ManCod = new short[1] ;
      P004N2_A2253SalExtAlb = new int[1] ;
      P004N2_A2258SalExtLis = new byte[1] ;
      P004N2_A2249ManNom = new String[] {""} ;
      P004N2_n2249ManNom = new boolean[] {false} ;
      A2249ManNom = "" ;
      Gxm1trabajoexterno__impresion_sdt = new app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno__impresion_dp__default(),
         new Object[] {
             new Object[] {
            P004N2_A396EmprCod, P004N2_A2256SalExtFec, P004N2_A2248ManCod, P004N2_A2253SalExtAlb, P004N2_A2258SalExtLis, P004N2_A2249ManNom, P004N2_n2249ManNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV6SalExtLis ;
   private byte A2258SalExtLis ;
   private short AV9ManCodFrom ;
   private short AV10ManCodTo ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int AV11SalExtAlbFrom ;
   private int AV12SalExtAlbto ;
   private int A2253SalExtAlb ;
   private String AV5EMprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A2249ManNom ;
   private java.util.Date AV7SalExtFecfrom ;
   private java.util.Date AV8SalExtFecto ;
   private java.util.Date A2256SalExtFec ;
   private boolean n2249ManNom ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P004N2_A396EmprCod ;
   private java.util.Date[] P004N2_A2256SalExtFec ;
   private short[] P004N2_A2248ManCod ;
   private int[] P004N2_A2253SalExtAlb ;
   private byte[] P004N2_A2258SalExtLis ;
   private String[] P004N2_A2249ManNom ;
   private boolean[] P004N2_n2249ManNom ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item> Gxm2rootcol ;
   private app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item Gxm1trabajoexterno__impresion_sdt ;
}

final  class trabajoexterno__impresion_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV12SalExtAlbto ,
                                          int AV11SalExtAlbFrom ,
                                          short AV10ManCodTo ,
                                          short AV9ManCodFrom ,
                                          java.util.Date AV8SalExtFecto ,
                                          java.util.Date AV7SalExtFecfrom ,
                                          int A2253SalExtAlb ,
                                          short A2248ManCod ,
                                          java.util.Date A2256SalExtFec ,
                                          byte A2258SalExtLis ,
                                          byte AV6SalExtLis ,
                                          String AV5EMprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[9];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtFec, T1.ManCod, T1.SalExtAlb, T1.SalExtLis, T2.ManNom FROM (TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod" ;
      scmdbuf += " = T1.ManCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalExtLis = ? or ? = 9)");
      if ( ! (0==AV12SalExtAlbto) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb <= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV11SalExtAlbFrom) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV10ManCodTo) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV9ManCodFrom) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8SalExtFecto)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec <= ?)");
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7SalExtFecfrom)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int1[8] = (byte)(1) ;
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
                  return conditional_P004N2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               return;
      }
   }

}

