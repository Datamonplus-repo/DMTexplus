package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mant_erroresclientedp extends GXProcedure
{
   public mant_erroresclientedp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_erroresclientedp.class ), "" );
   }

   public mant_erroresclientedp( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT> executeUdp( String aP0 )
   {
      mant_erroresclientedp.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT>[] aP1 )
   {
      mant_erroresclientedp.this.AV8EmprCod = aP0;
      mant_erroresclientedp.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00522 */
      pr_default.execute(0, new Object[] {AV8EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14603MCliEmprCo = P00522_A14603MCliEmprCo[0] ;
         A14605MCliNom = P00522_A14605MCliNom[0] ;
         A14604MCliCod = P00522_A14604MCliCod[0] ;
         Gxm1mant_erroresclientesdt = (app.anticipacionerrores.SdtMAnt_ErroresClienteSDT)new app.anticipacionerrores.SdtMAnt_ErroresClienteSDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1mant_erroresclientesdt, 0);
         Gxm1mant_erroresclientesdt.setgxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod( A14603MCliEmprCo );
         Gxm1mant_erroresclientesdt.setgxTv_SdtMAnt_ErroresClienteSDT_Mantclicod( A14604MCliCod );
         Gxm1mant_erroresclientesdt.setgxTv_SdtMAnt_ErroresClienteSDT_Mantclinom( A14605MCliNom );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = mant_erroresclientedp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteSDT.class, "MAnt_ErroresClienteSDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00522_A14603MCliEmprCo = new String[] {""} ;
      P00522_A14605MCliNom = new String[] {""} ;
      P00522_A14604MCliCod = new int[1] ;
      A14603MCliEmprCo = "" ;
      A14605MCliNom = "" ;
      Gxm1mant_erroresclientesdt = new app.anticipacionerrores.SdtMAnt_ErroresClienteSDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_erroresclientedp__default(),
         new Object[] {
             new Object[] {
            P00522_A14603MCliEmprCo, P00522_A14605MCliNom, P00522_A14604MCliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A14604MCliCod ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A14603MCliEmprCo ;
   private String A14605MCliNom ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00522_A14603MCliEmprCo ;
   private String[] P00522_A14605MCliNom ;
   private int[] P00522_A14604MCliCod ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT> Gxm2rootcol ;
   private app.anticipacionerrores.SdtMAnt_ErroresClienteSDT Gxm1mant_erroresclientesdt ;
}

final  class mant_erroresclientedp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00522", "SELECT DISTINCT MCliEmprCo, MCliNom, MCliCod FROM MCli WHERE MCliEmprCo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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

