package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpduplicacionserie extends GXProcedure
{
   public dpduplicacionserie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpduplicacionserie.class ), "" );
   }

   public dpduplicacionserie( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie> executeUdp( String aP0 ,
                                                                                          short aP1 )
   {
      dpduplicacionserie.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>[] aP2 )
   {
      dpduplicacionserie.this.AV5EmprCod = aP0;
      dpduplicacionserie.this.AV6CliCodOri = aP1;
      dpduplicacionserie.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P003N2 */
      pr_default.execute(0, new Object[] {AV5EmprCod, Short.valueOf(AV6CliCodOri)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P003N2_A396EmprCod[0] ;
         A252CliCod = P003N2_A252CliCod[0] ;
         A14295ArtActivo = P003N2_A14295ArtActivo[0] ;
         A69ArtDsc = P003N2_A69ArtDsc[0] ;
         n69ArtDsc = P003N2_n69ArtDsc[0] ;
         A65ArtCod = P003N2_A65ArtCod[0] ;
         Gxm1sdtduplicaccionserie = (app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)new app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtduplicaccionserie, 0);
         Gxm1sdtduplicaccionserie.setgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori( A65ArtCod );
         Gxm1sdtduplicaccionserie.setgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes( A69ArtDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dpduplicacionserie.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>(app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie.class, "Serie", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P003N2_A396EmprCod = new String[] {""} ;
      P003N2_A252CliCod = new int[1] ;
      P003N2_A14295ArtActivo = new String[] {""} ;
      P003N2_A69ArtDsc = new String[] {""} ;
      P003N2_n69ArtDsc = new boolean[] {false} ;
      P003N2_A65ArtCod = new String[] {""} ;
      A396EmprCod = "" ;
      A14295ArtActivo = "" ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      Gxm1sdtduplicaccionserie = new app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.dpduplicacionserie__default(),
         new Object[] {
             new Object[] {
            P003N2_A396EmprCod, P003N2_A252CliCod, P003N2_A14295ArtActivo, P003N2_A69ArtDsc, P003N2_n69ArtDsc, P003N2_A65ArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV6CliCodOri ;
   private short Gx_err ;
   private int A252CliCod ;
   private String AV5EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A14295ArtActivo ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private boolean n69ArtDsc ;
   private GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P003N2_A396EmprCod ;
   private int[] P003N2_A252CliCod ;
   private String[] P003N2_A14295ArtActivo ;
   private String[] P003N2_A69ArtDsc ;
   private boolean[] P003N2_n69ArtDsc ;
   private String[] P003N2_A65ArtCod ;
   private GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie> Gxm2rootcol ;
   private app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie Gxm1sdtduplicaccionserie ;
}

final  class dpduplicacionserie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003N2", "SELECT EmprCod, CliCod, ArtActivo, ArtDsc, ArtCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ?) AND (ArtActivo = 'S') ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

