package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpgridmaquinas extends GXProcedure
{
   public dpgridmaquinas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpgridmaquinas.class ), "" );
   }

   public dpgridmaquinas( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem> executeUdp( String aP0 ,
                                                                                 String aP1 ,
                                                                                 String aP2 )
   {
      dpgridmaquinas.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem>[] aP3 )
   {
      dpgridmaquinas.this.AV7EmprCod = aP0;
      dpgridmaquinas.this.AV5MaqCod = aP1;
      dpgridmaquinas.this.AV8PMDsc = aP2;
      dpgridmaquinas.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV5MaqCod ,
                                           A602MaqCod ,
                                           AV7EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P003U2 */
      pr_default.execute(0, new Object[] {AV7EmprCod, AV5MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P003U2_A396EmprCod[0] ;
         A602MaqCod = P003U2_A602MaqCod[0] ;
         A606MaqDsc = P003U2_A606MaqDsc[0] ;
         n606MaqDsc = P003U2_n606MaqDsc[0] ;
         Gxm1sdtgridmaquina = (app.SdtSDTGridMaquina_SDTGridMaquinaItem)new app.SdtSDTGridMaquina_SDTGridMaquinaItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtgridmaquina, 0);
         Gxm1sdtgridmaquina.setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven( (byte)(0) );
         Gxm1sdtgridmaquina.setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod( A602MaqCod );
         Gxm1sdtgridmaquina.setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc( A606MaqDsc );
         GXt_int1 = (byte)(0) ;
         GXv_int2[0] = GXt_int1 ;
         new app.pget_maquinaprevencion(remoteHandle, context).execute( AV7EmprCod, AV5MaqCod, AV8PMDsc, GXv_int2) ;
         dpgridmaquinas.this.GXt_int1 = GXv_int2[0] ;
         Gxm1sdtgridmaquina.setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven( GXt_int1 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = dpgridmaquinas.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem>(app.SdtSDTGridMaquina_SDTGridMaquinaItem.class, "SDTGridMaquinaItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      P003U2_A396EmprCod = new String[] {""} ;
      P003U2_A602MaqCod = new String[] {""} ;
      P003U2_A606MaqDsc = new String[] {""} ;
      P003U2_n606MaqDsc = new boolean[] {false} ;
      A606MaqDsc = "" ;
      Gxm1sdtgridmaquina = new app.SdtSDTGridMaquina_SDTGridMaquinaItem(remoteHandle, context);
      GXv_int2 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpgridmaquinas__default(),
         new Object[] {
             new Object[] {
            P003U2_A396EmprCod, P003U2_A602MaqCod, P003U2_A606MaqDsc, P003U2_n606MaqDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private String AV7EmprCod ;
   private String AV5MaqCod ;
   private String AV8PMDsc ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private boolean n606MaqDsc ;
   private GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P003U2_A396EmprCod ;
   private String[] P003U2_A602MaqCod ;
   private String[] P003U2_A606MaqDsc ;
   private boolean[] P003U2_n606MaqDsc ;
   private GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem> Gxm2rootcol ;
   private app.SdtSDTGridMaquina_SDTGridMaquinaItem Gxm1sdtgridmaquina ;
}

final  class dpgridmaquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV5MaqCod ,
                                          String A602MaqCod ,
                                          String AV7EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[2];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV5MaqCod)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
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
                  return conditional_P003U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 6);
               }
               return;
      }
   }

}

