package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obsalb_dp extends GXProcedure
{
   public obsalb_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obsalb_dp.class ), "" );
   }

   public obsalb_dp( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtObsalb_SDT> executeUdp( String aP0 ,
                                                          long aP1 )
   {
      obsalb_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.SdtObsalb_SDT>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        GXBaseCollection<app.SdtObsalb_SDT>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             GXBaseCollection<app.SdtObsalb_SDT>[] aP2 )
   {
      obsalb_dp.this.AV6Emprcod = aP0;
      obsalb_dp.this.AV5AlbProcod = aP1;
      obsalb_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002D2 */
      pr_default.execute(0, new Object[] {AV6Emprcod, Long.valueOf(AV5AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P002D2_A396EmprCod[0] ;
         A30AlbProCod = P002D2_A30AlbProCod[0] ;
         A915AlbPObsLin = P002D2_A915AlbPObsLin[0] ;
         A916AlbPObs = P002D2_A916AlbPObs[0] ;
         Gxm1obsalb_sdt = (app.SdtObsalb_SDT)new app.SdtObsalb_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1obsalb_sdt, 0);
         Gxm1obsalb_sdt.setgxTv_SdtObsalb_SDT_Emprcod( A396EmprCod );
         Gxm1obsalb_sdt.setgxTv_SdtObsalb_SDT_Albprocod( A30AlbProCod );
         Gxm1obsalb_sdt.setgxTv_SdtObsalb_SDT_Albpobslin( A915AlbPObsLin );
         Gxm1obsalb_sdt.setgxTv_SdtObsalb_SDT_Albpobs( A916AlbPObs );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = obsalb_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtObsalb_SDT>(app.SdtObsalb_SDT.class, "Obsalb_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P002D2_A396EmprCod = new String[] {""} ;
      P002D2_A30AlbProCod = new long[1] ;
      P002D2_A915AlbPObsLin = new byte[1] ;
      P002D2_A916AlbPObs = new String[] {""} ;
      A396EmprCod = "" ;
      A916AlbPObs = "" ;
      Gxm1obsalb_sdt = new app.SdtObsalb_SDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obsalb_dp__default(),
         new Object[] {
             new Object[] {
            P002D2_A396EmprCod, P002D2_A30AlbProCod, P002D2_A915AlbPObsLin, P002D2_A916AlbPObs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A915AlbPObsLin ;
   private short Gx_err ;
   private long AV5AlbProcod ;
   private long A30AlbProCod ;
   private String AV6Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A916AlbPObs ;
   private GXBaseCollection<app.SdtObsalb_SDT>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P002D2_A396EmprCod ;
   private long[] P002D2_A30AlbProCod ;
   private byte[] P002D2_A915AlbPObsLin ;
   private String[] P002D2_A916AlbPObs ;
   private GXBaseCollection<app.SdtObsalb_SDT> Gxm2rootcol ;
   private app.SdtObsalb_SDT Gxm1obsalb_sdt ;
}

final  class obsalb_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002D2", "SELECT EmprCod, AlbProCod, AlbPObsLin, AlbPObs FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

