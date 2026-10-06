package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dptipocolor extends GXProcedure
{
   public dptipocolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dptipocolor.class ), "" );
   }

   public dptipocolor( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSdtTipoColor> executeUdp( String aP0 )
   {
      dptipocolor.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSdtTipoColor>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.SdtSdtTipoColor>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.SdtSdtTipoColor>[] aP1 )
   {
      dptipocolor.this.AV5EmprCod = aP0;
      dptipocolor.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000N2 */
      pr_default.execute(0, new Object[] {AV5EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P000N2_A396EmprCod[0] ;
         A831TipColCod = P000N2_A831TipColCod[0] ;
         A832TipColDsc = P000N2_A832TipColDsc[0] ;
         n832TipColDsc = P000N2_n832TipColDsc[0] ;
         Gxm1sdttipocolor = (app.SdtSdtTipoColor)new app.SdtSdtTipoColor(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdttipocolor, 0);
         Gxm1sdttipocolor.setgxTv_SdtSdtTipoColor_Codigo( A831TipColCod );
         Gxm1sdttipocolor.setgxTv_SdtSdtTipoColor_Descripcion( GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+"-"+GXutil.trim( A832TipColDsc) );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dptipocolor.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSdtTipoColor>(app.SdtSdtTipoColor.class, "SdtTipoColor", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000N2_A396EmprCod = new String[] {""} ;
      P000N2_A831TipColCod = new byte[1] ;
      P000N2_A832TipColDsc = new String[] {""} ;
      P000N2_n832TipColDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A832TipColDsc = "" ;
      Gxm1sdttipocolor = new app.SdtSdtTipoColor(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dptipocolor__default(),
         new Object[] {
             new Object[] {
            P000N2_A396EmprCod, P000N2_A831TipColCod, P000N2_A832TipColDsc, P000N2_n832TipColDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private String AV5EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A832TipColDsc ;
   private boolean n832TipColDsc ;
   private GXBaseCollection<app.SdtSdtTipoColor>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000N2_A396EmprCod ;
   private byte[] P000N2_A831TipColCod ;
   private String[] P000N2_A832TipColDsc ;
   private boolean[] P000N2_n832TipColDsc ;
   private GXBaseCollection<app.SdtSdtTipoColor> Gxm2rootcol ;
   private app.SdtSdtTipoColor Gxm1sdttipocolor ;
}

final  class dptipocolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000N2", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

