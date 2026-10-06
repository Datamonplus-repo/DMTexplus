package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tforpag_dp extends GXProcedure
{
   public tforpag_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tforpag_dp.class ), "" );
   }

   public tforpag_dp( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 )
   {
      tforpag_dp.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP1 )
   {
      tforpag_dp.this.AV5EmprCod = aP0;
      tforpag_dp.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV5EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P002R2 */
      pr_default.execute(0, new Object[] {AV5EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P002R2_A396EmprCod[0] ;
         A498FpgDsc = P002R2_A498FpgDsc[0] ;
         n498FpgDsc = P002R2_n498FpgDsc[0] ;
         A497FpgCod = P002R2_A497FpgCod[0] ;
         A13811FpgDscID = GXutil.trim( A497FpgCod) + "-" + GXutil.trim( A498FpgDsc) ;
         Gxm1dvb_sdtcombodata = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1dvb_sdtcombodata, 0);
         Gxm1dvb_sdtcombodata.setgxTv_SdtDVB_SDTComboData_Item_Id( A497FpgCod );
         Gxm1dvb_sdtcombodata.setgxTv_SdtDVB_SDTComboData_Item_Title( A13811FpgDscID );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = tforpag_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      scmdbuf = "" ;
      A396EmprCod = "" ;
      P002R2_A396EmprCod = new String[] {""} ;
      P002R2_A498FpgDsc = new String[] {""} ;
      P002R2_n498FpgDsc = new boolean[] {false} ;
      P002R2_A497FpgCod = new String[] {""} ;
      A498FpgDsc = "" ;
      A497FpgCod = "" ;
      A13811FpgDscID = "" ;
      Gxm1dvb_sdtcombodata = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tforpag_dp__default(),
         new Object[] {
             new Object[] {
            P002R2_A396EmprCod, P002R2_A498FpgDsc, P002R2_n498FpgDsc, P002R2_A497FpgCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV5EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A498FpgDsc ;
   private String A497FpgCod ;
   private boolean n498FpgDsc ;
   private String A13811FpgDscID ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P002R2_A396EmprCod ;
   private String[] P002R2_A498FpgDsc ;
   private boolean[] P002R2_n498FpgDsc ;
   private String[] P002R2_A497FpgCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> Gxm2rootcol ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item Gxm1dvb_sdtcombodata ;
}

final  class tforpag_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV5EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[1];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, FpgDsc, FpgCod FROM TXPFORPAG" ;
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, FpgCod" ;
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
                  return conditional_P002R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
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
                  stmt.setString(sIdx, (String)parms[1], 3);
               }
               return;
      }
   }

}

