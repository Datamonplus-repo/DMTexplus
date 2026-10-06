package app.ponteway ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistartico extends GXProcedure
{
   public dplistartico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistartico.class ), "" );
   }

   public dplistartico( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ponteway.v1.SdtListValues_Item> executeUdp( String aP0 ,
                                                                           int aP1 ,
                                                                           String aP2 )
   {
      dplistartico.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<app.ponteway.v1.SdtListValues_Item>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        GXBaseCollection<app.ponteway.v1.SdtListValues_Item>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             GXBaseCollection<app.ponteway.v1.SdtListValues_Item>[] aP3 )
   {
      dplistartico.this.AV6EmprCod = aP0;
      dplistartico.this.AV5CliCod = aP1;
      dplistartico.this.AV9ArtCod = aP2;
      dplistartico.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9ArtCod ,
                                           A65ArtCod ,
                                           A14295ArtActivo ,
                                           AV6EmprCod ,
                                           Integer.valueOf(AV5CliCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor P004X2 */
      pr_default.execute(0, new Object[] {AV6EmprCod, Integer.valueOf(AV5CliCod), AV9ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004X2_A396EmprCod[0] ;
         A252CliCod = P004X2_A252CliCod[0] ;
         A65ArtCod = P004X2_A65ArtCod[0] ;
         A14295ArtActivo = P004X2_A14295ArtActivo[0] ;
         A69ArtDsc = P004X2_A69ArtDsc[0] ;
         n69ArtDsc = P004X2_n69ArtDsc[0] ;
         Gxm1listvalues = (app.ponteway.v1.SdtListValues_Item)new app.ponteway.v1.SdtListValues_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1listvalues, 0);
         Gxm1listvalues.setgxTv_SdtListValues_Item_Key( GXutil.trim( A65ArtCod) );
         Gxm1listvalues.setgxTv_SdtListValues_Item_Value( GXutil.trim( A65ArtCod)+"-"+GXutil.trim( A69ArtDsc) );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = dplistartico.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.ponteway.v1.SdtListValues_Item>(app.ponteway.v1.SdtListValues_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A65ArtCod = "" ;
      A14295ArtActivo = "" ;
      A396EmprCod = "" ;
      P004X2_A396EmprCod = new String[] {""} ;
      P004X2_A252CliCod = new int[1] ;
      P004X2_A65ArtCod = new String[] {""} ;
      P004X2_A14295ArtActivo = new String[] {""} ;
      P004X2_A69ArtDsc = new String[] {""} ;
      P004X2_n69ArtDsc = new boolean[] {false} ;
      A69ArtDsc = "" ;
      Gxm1listvalues = new app.ponteway.v1.SdtListValues_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ponteway.dplistartico__default(),
         new Object[] {
             new Object[] {
            P004X2_A396EmprCod, P004X2_A252CliCod, P004X2_A65ArtCod, P004X2_A14295ArtActivo, P004X2_A69ArtDsc, P004X2_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV5CliCod ;
   private int A252CliCod ;
   private String AV6EmprCod ;
   private String AV9ArtCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A14295ArtActivo ;
   private String A396EmprCod ;
   private String A69ArtDsc ;
   private boolean n69ArtDsc ;
   private GXBaseCollection<app.ponteway.v1.SdtListValues_Item>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P004X2_A396EmprCod ;
   private int[] P004X2_A252CliCod ;
   private String[] P004X2_A65ArtCod ;
   private String[] P004X2_A14295ArtActivo ;
   private String[] P004X2_A69ArtDsc ;
   private boolean[] P004X2_n69ArtDsc ;
   private GXBaseCollection<app.ponteway.v1.SdtListValues_Item> Gxm2rootcol ;
   private app.ponteway.v1.SdtListValues_Item Gxm1listvalues ;
}

final  class dplistartico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV9ArtCod ,
                                          String A65ArtCod ,
                                          String A14295ArtActivo ,
                                          String AV6EmprCod ,
                                          int AV5CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[3];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ArtCod, ArtActivo, ArtDsc FROM TXPARTICU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(ArtActivo = 'S')");
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         addWhere(sWhereString, "(ArtCod = ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ArtCod" ;
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
                  return conditional_P004X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
                  stmt.setString(sIdx, (String)parms[5], 16);
               }
               return;
      }
   }

}

