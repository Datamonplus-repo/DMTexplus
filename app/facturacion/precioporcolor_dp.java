package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precioporcolor_dp extends GXProcedure
{
   public precioporcolor_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporcolor_dp.class ), "" );
   }

   public precioporcolor_dp( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtPrecioporColor_SDT_Item> executeUdp( String aP0 ,
                                                                                   int aP1 ,
                                                                                   int aP2 )
   {
      precioporcolor_dp.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtPrecioporColor_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        GXBaseCollection<app.facturacion.SdtPrecioporColor_SDT_Item>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             GXBaseCollection<app.facturacion.SdtPrecioporColor_SDT_Item>[] aP3 )
   {
      precioporcolor_dp.this.AV5Emprcod = aP0;
      precioporcolor_dp.this.AV6Clicodfrom = aP1;
      precioporcolor_dp.this.AV7Clicodto = aP2;
      precioporcolor_dp.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV7Clicodto) ,
                                           Integer.valueOf(AV6Clicodfrom) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A10045CliAct ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P003G2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV7Clicodto), Integer.valueOf(AV6Clicodfrom)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P003G2_A396EmprCod[0] ;
         A252CliCod = P003G2_A252CliCod[0] ;
         A10045CliAct = P003G2_A10045CliAct[0] ;
         A279CliNom = P003G2_A279CliNom[0] ;
         Gxm1precioporcolor_sdt = (app.facturacion.SdtPrecioporColor_SDT_Item)new app.facturacion.SdtPrecioporColor_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1precioporcolor_sdt, 0);
         Gxm1precioporcolor_sdt.setgxTv_SdtPrecioporColor_SDT_Item_Clicod( A252CliCod );
         Gxm1precioporcolor_sdt.setgxTv_SdtPrecioporColor_SDT_Item_Clinom( A279CliNom );
         GXt_boolean1 = false ;
         GXv_boolean2[0] = GXt_boolean1 ;
         new app.facturacion.hayformulacolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, GXv_boolean2) ;
         precioporcolor_dp.this.GXt_boolean1 = GXv_boolean2[0] ;
         Gxm1precioporcolor_sdt.setgxTv_SdtPrecioporColor_SDT_Item_Formulacolor( GXt_boolean1 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = precioporcolor_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtPrecioporColor_SDT_Item>(app.facturacion.SdtPrecioporColor_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A10045CliAct = "" ;
      A396EmprCod = "" ;
      P003G2_A396EmprCod = new String[] {""} ;
      P003G2_A252CliCod = new int[1] ;
      P003G2_A10045CliAct = new String[] {""} ;
      P003G2_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      Gxm1precioporcolor_sdt = new app.facturacion.SdtPrecioporColor_SDT_Item(remoteHandle, context);
      GXv_boolean2 = new boolean[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporcolor_dp__default(),
         new Object[] {
             new Object[] {
            P003G2_A396EmprCod, P003G2_A252CliCod, P003G2_A10045CliAct, P003G2_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6Clicodfrom ;
   private int AV7Clicodto ;
   private int A252CliCod ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private boolean GXt_boolean1 ;
   private boolean GXv_boolean2[] ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_SDT_Item>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P003G2_A396EmprCod ;
   private int[] P003G2_A252CliCod ;
   private String[] P003G2_A10045CliAct ;
   private String[] P003G2_A279CliNom ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtPrecioporColor_SDT_Item Gxm1precioporcolor_sdt ;
}

final  class precioporcolor_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV7Clicodto ,
                                          int AV6Clicodfrom ,
                                          int A252CliCod ,
                                          String A10045CliAct ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[3];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, CliAct, CliNom FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliAct = 'S')");
      if ( ! (0==AV7Clicodto) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV6Clicodfrom) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P003G2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
      }
   }

}

