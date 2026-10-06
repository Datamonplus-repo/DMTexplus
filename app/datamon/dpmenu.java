package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpmenu extends GXProcedure
{
   public dpmenu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpmenu.class ), "" );
   }

   public dpmenu( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> executeUdp( String aP0 ,
                                                                    String aP1 )
   {
      dpmenu.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP2 )
   {
      dpmenu.this.AV5Modulo = aP0;
      dpmenu.this.AV7MNUPGMTPO = aP1;
      dpmenu.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV7MNUPGMTPO ,
                                           A948MnuPgmTpo ,
                                           A14294MnuSit ,
                                           AV5Modulo ,
                                           A945MnuId } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P004D2 */
      pr_default.execute(0, new Object[] {AV5Modulo, AV7MNUPGMTPO});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A945MnuId = P004D2_A945MnuId[0] ;
         A14294MnuSit = P004D2_A14294MnuSit[0] ;
         A948MnuPgmTpo = P004D2_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = P004D2_A949MnuPgmTxt[0] ;
         A947MnuPgm = P004D2_A947MnuPgm[0] ;
         A946MnuOp = P004D2_A946MnuOp[0] ;
         Gxm1sdtmenu = (app.datamon.SdtSdtMenu_ITEM)new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtmenu, 0);
         AV6id = (long)(AV6id+1) ;
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Id( (short)(AV6id) );
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Url( "#" );
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Title( A949MnuPgmTxt );
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Description( A949MnuPgmTxt );
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Fontawsome( "" );
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Window( false );
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Exibir_favorito( false );
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Info( false );
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Info_text( "" );
         GXt_objcol_SdtSdtMenu_ITEM1 = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>() ;
         GXv_objcol_SdtSdtMenu_ITEM2[0] = GXt_objcol_SdtSdtMenu_ITEM1 ;
         new app.datamon.dpmenu(remoteHandle, context).execute( A947MnuPgm, A948MnuPgmTpo, GXv_objcol_SdtSdtMenu_ITEM2) ;
         GXt_objcol_SdtSdtMenu_ITEM1 = GXv_objcol_SdtSdtMenu_ITEM2[0] ;
         Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Items( GXt_objcol_SdtSdtMenu_ITEM1 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dpmenu.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A948MnuPgmTpo = "" ;
      A14294MnuSit = "" ;
      A945MnuId = "" ;
      P004D2_A945MnuId = new String[] {""} ;
      P004D2_A14294MnuSit = new String[] {""} ;
      P004D2_A948MnuPgmTpo = new String[] {""} ;
      P004D2_A949MnuPgmTxt = new String[] {""} ;
      P004D2_A947MnuPgm = new String[] {""} ;
      P004D2_A946MnuOp = new byte[1] ;
      A949MnuPgmTxt = "" ;
      A947MnuPgm = "" ;
      Gxm1sdtmenu = new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      GXt_objcol_SdtSdtMenu_ITEM1 = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSdtMenu_ITEM2 = new GXBaseCollection[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.datamon.dpmenu__default(),
         new Object[] {
             new Object[] {
            P004D2_A945MnuId, P004D2_A14294MnuSit, P004D2_A948MnuPgmTpo, P004D2_A949MnuPgmTxt, P004D2_A947MnuPgm, P004D2_A946MnuOp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A946MnuOp ;
   private short Gx_err ;
   private long AV6id ;
   private String AV5Modulo ;
   private String AV7MNUPGMTPO ;
   private String scmdbuf ;
   private String A948MnuPgmTpo ;
   private String A14294MnuSit ;
   private String A945MnuId ;
   private String A949MnuPgmTxt ;
   private String A947MnuPgm ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P004D2_A945MnuId ;
   private String[] P004D2_A14294MnuSit ;
   private String[] P004D2_A948MnuPgmTpo ;
   private String[] P004D2_A949MnuPgmTxt ;
   private String[] P004D2_A947MnuPgm ;
   private byte[] P004D2_A946MnuOp ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> Gxm2rootcol ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> GXt_objcol_SdtSdtMenu_ITEM1 ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> GXv_objcol_SdtSdtMenu_ITEM2[] ;
   private app.datamon.SdtSdtMenu_ITEM Gxm1sdtmenu ;
}

final  class dpmenu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV7MNUPGMTPO ,
                                          String A948MnuPgmTpo ,
                                          String A14294MnuSit ,
                                          String AV5Modulo ,
                                          String A945MnuId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[2];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT MnuId, MnuSit, MnuPgmTpo, MnuPgmTxt, MnuPgm, MnuOp FROM TXPMNUOP" ;
      addWhere(sWhereString, "(MnuId = ?)");
      addWhere(sWhereString, "(MnuSit = 'T')");
      if ( ! (GXutil.strcmp("", AV7MNUPGMTPO)==0) )
      {
         addWhere(sWhereString, "(MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MnuId, MnuOp" ;
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
                  return conditional_P004D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
                  stmt.setString(sIdx, (String)parms[2], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 1);
               }
               return;
      }
   }

}

