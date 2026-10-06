package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mant_erroresclientearticulodp extends GXProcedure
{
   public mant_erroresclientearticulodp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_erroresclientearticulodp.class ), "" );
   }

   public mant_erroresclientearticulodp( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT> executeUdp( GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> aP0 ,
                                                                                                  String aP1 ,
                                                                                                  int aP2 )
   {
      mant_erroresclientearticulodp.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> aP0 ,
                        String aP1 ,
                        int aP2 ,
                        GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> aP0 ,
                             String aP1 ,
                             int aP2 ,
                             GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT>[] aP3 )
   {
      mant_erroresclientearticulodp.this.AV5MAnt_ErroresSDTCollection = aP0;
      mant_erroresclientearticulodp.this.AV7EmprCod = aP1;
      mant_erroresclientearticulodp.this.AV6Clicod = aP2;
      mant_erroresclientearticulodp.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00512 */
      pr_default.execute(0, new Object[] {AV7EmprCod, Integer.valueOf(AV6Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14604MCliCod = P00512_A14604MCliCod[0] ;
         A14603MCliEmprCo = P00512_A14603MCliEmprCo[0] ;
         A14607MCliArtDsc = P00512_A14607MCliArtDsc[0] ;
         A14606MCliArtCod = P00512_A14606MCliArtCod[0] ;
         A14605MCliNom = P00512_A14605MCliNom[0] ;
         Gxm1mant_erroresclientearticulosdt = (app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT)new app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1mant_erroresclientearticulosdt, 0);
         Gxm1mant_erroresclientearticulosdt.setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod( A14603MCliEmprCo );
         Gxm1mant_erroresclientearticulosdt.setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod( A14604MCliCod );
         Gxm1mant_erroresclientearticulosdt.setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom( A14605MCliNom );
         Gxm1mant_erroresclientearticulosdt.setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod( A14606MCliArtCod );
         Gxm1mant_erroresclientearticulosdt.setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc( A14607MCliArtDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = mant_erroresclientearticulodp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT.class, "MAnt_ErroresClienteArticuloSDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00512_A14604MCliCod = new int[1] ;
      P00512_A14603MCliEmprCo = new String[] {""} ;
      P00512_A14607MCliArtDsc = new String[] {""} ;
      P00512_A14606MCliArtCod = new String[] {""} ;
      P00512_A14605MCliNom = new String[] {""} ;
      A14603MCliEmprCo = "" ;
      A14607MCliArtDsc = "" ;
      A14606MCliArtCod = "" ;
      A14605MCliNom = "" ;
      Gxm1mant_erroresclientearticulosdt = new app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_erroresclientearticulodp__default(),
         new Object[] {
             new Object[] {
            P00512_A14604MCliCod, P00512_A14603MCliEmprCo, P00512_A14607MCliArtDsc, P00512_A14606MCliArtCod, P00512_A14605MCliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6Clicod ;
   private int A14604MCliCod ;
   private String AV7EmprCod ;
   private String scmdbuf ;
   private String A14603MCliEmprCo ;
   private String A14606MCliArtCod ;
   private String A14607MCliArtDsc ;
   private String A14605MCliNom ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P00512_A14604MCliCod ;
   private String[] P00512_A14603MCliEmprCo ;
   private String[] P00512_A14607MCliArtDsc ;
   private String[] P00512_A14606MCliArtCod ;
   private String[] P00512_A14605MCliNom ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> AV5MAnt_ErroresSDTCollection ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT> Gxm2rootcol ;
   private app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT Gxm1mant_erroresclientearticulosdt ;
}

final  class mant_erroresclientearticulodp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00512", "SELECT DISTINCT MCliCod, MCliEmprCo, MCliArtDsc, MCliArtCod, MCliNom FROM MCli WHERE (MCliEmprCo = ?) AND (MCliCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
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

