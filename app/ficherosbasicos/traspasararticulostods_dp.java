package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class traspasararticulostods_dp extends GXProcedure
{
   public traspasararticulostods_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( traspasararticulostods_dp.class ), "" );
   }

   public traspasararticulostods_dp( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem> executeUdp( String aP0 ,
                                                                                                                           int aP1 )
   {
      traspasararticulostods_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        GXBaseCollection<app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             GXBaseCollection<app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem>[] aP2 )
   {
      traspasararticulostods_dp.this.AV5EmprCod = aP0;
      traspasararticulostods_dp.this.AV6CliCodOri = aP1;
      traspasararticulostods_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00472 */
      pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV6CliCodOri)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00472_A396EmprCod[0] ;
         A252CliCod = P00472_A252CliCod[0] ;
         A14295ArtActivo = P00472_A14295ArtActivo[0] ;
         A65ArtCod = P00472_A65ArtCod[0] ;
         A69ArtDsc = P00472_A69ArtDsc[0] ;
         n69ArtDsc = P00472_n69ArtDsc[0] ;
         Gxm1traspasararticulostodos_sdt = (app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem)new app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1traspasararticulostodos_sdt, 0);
         Gxm1traspasararticulostodos_sdt.setgxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Seleccion( false );
         Gxm1traspasararticulostodos_sdt.setgxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artcod( A65ArtCod );
         Gxm1traspasararticulostodos_sdt.setgxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artdsc( A69ArtDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = traspasararticulostods_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem>(app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem.class, "TraspasarArticulosTodos_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00472_A396EmprCod = new String[] {""} ;
      P00472_A252CliCod = new int[1] ;
      P00472_A14295ArtActivo = new String[] {""} ;
      P00472_A65ArtCod = new String[] {""} ;
      P00472_A69ArtDsc = new String[] {""} ;
      P00472_n69ArtDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A14295ArtActivo = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      Gxm1traspasararticulostodos_sdt = new app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.traspasararticulostods_dp__default(),
         new Object[] {
             new Object[] {
            P00472_A396EmprCod, P00472_A252CliCod, P00472_A14295ArtActivo, P00472_A65ArtCod, P00472_A69ArtDsc, P00472_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6CliCodOri ;
   private int A252CliCod ;
   private String AV5EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A14295ArtActivo ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private boolean n69ArtDsc ;
   private GXBaseCollection<app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00472_A396EmprCod ;
   private int[] P00472_A252CliCod ;
   private String[] P00472_A14295ArtActivo ;
   private String[] P00472_A65ArtCod ;
   private String[] P00472_A69ArtDsc ;
   private boolean[] P00472_n69ArtDsc ;
   private GXBaseCollection<app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem> Gxm2rootcol ;
   private app.ficherosbasicos.SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem Gxm1traspasararticulostodos_sdt ;
}

final  class traspasararticulostods_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00472", "SELECT EmprCod, CliCod, ArtActivo, ArtCod, ArtDsc FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ?) AND (ArtActivo = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

