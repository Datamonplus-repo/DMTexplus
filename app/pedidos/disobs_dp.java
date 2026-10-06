package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disobs_dp extends GXProcedure
{
   public disobs_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disobs_dp.class ), "" );
   }

   public disobs_dp( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.pedidos.SdtDisObs_SDT> executeUdp( String aP0 ,
                                                                  int aP1 )
   {
      disobs_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.pedidos.SdtDisObs_SDT>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        GXBaseCollection<app.pedidos.SdtDisObs_SDT>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             GXBaseCollection<app.pedidos.SdtDisObs_SDT>[] aP2 )
   {
      disobs_dp.this.AV5EmprCod = aP0;
      disobs_dp.this.AV6DisCod = aP1;
      disobs_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00252 */
      pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV6DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00252_A396EmprCod[0] ;
         A361DisCod = P00252_A361DisCod[0] ;
         A376DisObsLin = P00252_A376DisObsLin[0] ;
         A377DisObsTxt = P00252_A377DisObsTxt[0] ;
         Gxm1disobs_sdt = (app.pedidos.SdtDisObs_SDT)new app.pedidos.SdtDisObs_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1disobs_sdt, 0);
         Gxm1disobs_sdt.setgxTv_SdtDisObs_SDT_Eliminar( false );
         Gxm1disobs_sdt.setgxTv_SdtDisObs_SDT_Emprcod( A396EmprCod );
         Gxm1disobs_sdt.setgxTv_SdtDisObs_SDT_Discod( A361DisCod );
         Gxm1disobs_sdt.setgxTv_SdtDisObs_SDT_Disobslin( A376DisObsLin );
         Gxm1disobs_sdt.setgxTv_SdtDisObs_SDT_Disobstxt( A377DisObsTxt );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = disobs_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.pedidos.SdtDisObs_SDT>(app.pedidos.SdtDisObs_SDT.class, "DisObs_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00252_A396EmprCod = new String[] {""} ;
      P00252_A361DisCod = new int[1] ;
      P00252_A376DisObsLin = new byte[1] ;
      P00252_A377DisObsTxt = new String[] {""} ;
      A396EmprCod = "" ;
      A377DisObsTxt = "" ;
      Gxm1disobs_sdt = new app.pedidos.SdtDisObs_SDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobs_dp__default(),
         new Object[] {
             new Object[] {
            P00252_A396EmprCod, P00252_A361DisCod, P00252_A376DisObsLin, P00252_A377DisObsTxt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV6DisCod ;
   private int A361DisCod ;
   private String AV5EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A377DisObsTxt ;
   private GXBaseCollection<app.pedidos.SdtDisObs_SDT>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00252_A396EmprCod ;
   private int[] P00252_A361DisCod ;
   private byte[] P00252_A376DisObsLin ;
   private String[] P00252_A377DisObsTxt ;
   private GXBaseCollection<app.pedidos.SdtDisObs_SDT> Gxm2rootcol ;
   private app.pedidos.SdtDisObs_SDT Gxm1disobs_sdt ;
}

final  class disobs_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00252", "SELECT EmprCod, DisCod, DisObsLin, DisObsTxt FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
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

