package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dptipoarticulo extends GXProcedure
{
   public dptipoarticulo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dptipoarticulo.class ), "" );
   }

   public dptipoarticulo( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSdtTipoArticulo> executeUdp( String aP0 )
   {
      dptipoarticulo.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSdtTipoArticulo>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.SdtSdtTipoArticulo>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.SdtSdtTipoArticulo>[] aP1 )
   {
      dptipoarticulo.this.AV5EmprCod = aP0;
      dptipoarticulo.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001E2 */
      pr_default.execute(0, new Object[] {AV5EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P001E2_A396EmprCod[0] ;
         A829TipArtCod = P001E2_A829TipArtCod[0] ;
         A830TipArtDsc = P001E2_A830TipArtDsc[0] ;
         n830TipArtDsc = P001E2_n830TipArtDsc[0] ;
         Gxm1sdttipoarticulo = (app.SdtSdtTipoArticulo)new app.SdtSdtTipoArticulo(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdttipoarticulo, 0);
         Gxm1sdttipoarticulo.setgxTv_SdtSdtTipoArticulo_Codigo( A829TipArtCod );
         Gxm1sdttipoarticulo.setgxTv_SdtSdtTipoArticulo_Descripcion( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0))+"-"+GXutil.trim( A830TipArtDsc) );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dptipoarticulo.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSdtTipoArticulo>(app.SdtSdtTipoArticulo.class, "SdtTipoArticulo", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001E2_A396EmprCod = new String[] {""} ;
      P001E2_A829TipArtCod = new short[1] ;
      P001E2_A830TipArtDsc = new String[] {""} ;
      P001E2_n830TipArtDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A830TipArtDsc = "" ;
      Gxm1sdttipoarticulo = new app.SdtSdtTipoArticulo(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dptipoarticulo__default(),
         new Object[] {
             new Object[] {
            P001E2_A396EmprCod, P001E2_A829TipArtCod, P001E2_A830TipArtDsc, P001E2_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short Gx_err ;
   private String AV5EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A830TipArtDsc ;
   private boolean n830TipArtDsc ;
   private GXBaseCollection<app.SdtSdtTipoArticulo>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P001E2_A396EmprCod ;
   private short[] P001E2_A829TipArtCod ;
   private String[] P001E2_A830TipArtDsc ;
   private boolean[] P001E2_n830TipArtDsc ;
   private GXBaseCollection<app.SdtSdtTipoArticulo> Gxm2rootcol ;
   private app.SdtSdtTipoArticulo Gxm1sdttipoarticulo ;
}

final  class dptipoarticulo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001E2", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
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

