package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class duplicararticulos_dp extends GXProcedure
{
   public duplicararticulos_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( duplicararticulos_dp.class ), "" );
   }

   public duplicararticulos_dp( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> executeUdp( String aP0 ,
                                                                                                               int aP1 ,
                                                                                                               String aP2 ,
                                                                                                               String aP3 )
   {
      duplicararticulos_dp.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem>[] aP4 )
   {
      duplicararticulos_dp.this.AV5emprcod = aP0;
      duplicararticulos_dp.this.AV6Clicod = aP1;
      duplicararticulos_dp.this.AV7Artcod = aP2;
      duplicararticulos_dp.this.AV8Artdc = aP3;
      duplicararticulos_dp.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9ArtDsc ,
                                           AV7Artcod ,
                                           A69ArtDsc ,
                                           A65ArtCod ,
                                           A14295ArtActivo ,
                                           AV5emprcod ,
                                           Integer.valueOf(AV6Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV9ArtDsc = GXutil.padr( GXutil.rtrim( AV9ArtDsc), 26, "%") ;
      lV7Artcod = GXutil.padr( GXutil.rtrim( AV7Artcod), 16, "%") ;
      /* Using cursor P00442 */
      pr_default.execute(0, new Object[] {AV5emprcod, Integer.valueOf(AV6Clicod), lV9ArtDsc, lV7Artcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00442_A396EmprCod[0] ;
         A252CliCod = P00442_A252CliCod[0] ;
         A14295ArtActivo = P00442_A14295ArtActivo[0] ;
         A65ArtCod = P00442_A65ArtCod[0] ;
         A69ArtDsc = P00442_A69ArtDsc[0] ;
         n69ArtDsc = P00442_n69ArtDsc[0] ;
         Gxm1duplicararticulos_sdt = (app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)new app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1duplicararticulos_sdt, 0);
         Gxm1duplicararticulos_sdt.setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar( false );
         Gxm1duplicararticulos_sdt.setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod( A65ArtCod );
         Gxm1duplicararticulos_sdt.setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc( A69ArtDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = duplicararticulos_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem>(app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem.class, "DuplicarArticulos_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV9ArtDsc = "" ;
      lV7Artcod = "" ;
      AV9ArtDsc = "" ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      A14295ArtActivo = "" ;
      A396EmprCod = "" ;
      P00442_A396EmprCod = new String[] {""} ;
      P00442_A252CliCod = new int[1] ;
      P00442_A14295ArtActivo = new String[] {""} ;
      P00442_A65ArtCod = new String[] {""} ;
      P00442_A69ArtDsc = new String[] {""} ;
      P00442_n69ArtDsc = new boolean[] {false} ;
      Gxm1duplicararticulos_sdt = new app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.duplicararticulos_dp__default(),
         new Object[] {
             new Object[] {
            P00442_A396EmprCod, P00442_A252CliCod, P00442_A14295ArtActivo, P00442_A65ArtCod, P00442_A69ArtDsc, P00442_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6Clicod ;
   private int A252CliCod ;
   private String AV5emprcod ;
   private String AV7Artcod ;
   private String AV8Artdc ;
   private String scmdbuf ;
   private String lV9ArtDsc ;
   private String lV7Artcod ;
   private String AV9ArtDsc ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private String A14295ArtActivo ;
   private String A396EmprCod ;
   private boolean n69ArtDsc ;
   private GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00442_A396EmprCod ;
   private int[] P00442_A252CliCod ;
   private String[] P00442_A14295ArtActivo ;
   private String[] P00442_A65ArtCod ;
   private String[] P00442_A69ArtDsc ;
   private boolean[] P00442_n69ArtDsc ;
   private GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> Gxm2rootcol ;
   private app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem Gxm1duplicararticulos_sdt ;
}

final  class duplicararticulos_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00442( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV9ArtDsc ,
                                          String AV7Artcod ,
                                          String A69ArtDsc ,
                                          String A65ArtCod ,
                                          String A14295ArtActivo ,
                                          String AV5emprcod ,
                                          int AV6Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[4];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtActivo, ArtCod, ArtDsc FROM TXPARTICU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(Not (rtrim(ArtDsc) IS NULL AND NOT(ArtDsc IS NULL)))");
      addWhere(sWhereString, "(Not (rtrim(ArtCod) IS NULL AND NOT(ArtCod IS NULL)))");
      addWhere(sWhereString, "(ArtActivo = 'S')");
      if ( ! (GXutil.strcmp("", AV9ArtDsc)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ArtDsc))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7Artcod)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ArtCod))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
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
                  return conditional_P00442(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00442", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
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
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 16);
               }
               return;
      }
   }

}

