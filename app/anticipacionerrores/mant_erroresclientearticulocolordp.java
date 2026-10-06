package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mant_erroresclientearticulocolordp extends GXProcedure
{
   public mant_erroresclientearticulocolordp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_erroresclientearticulocolordp.class ), "" );
   }

   public mant_erroresclientearticulocolordp( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT> executeUdp( GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> aP0 ,
                                                                                                       String aP1 ,
                                                                                                       int aP2 ,
                                                                                                       String aP3 )
   {
      mant_erroresclientearticulocolordp.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String aP3 ,
                        GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String aP3 ,
                             GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT>[] aP4 )
   {
      mant_erroresclientearticulocolordp.this.AV6MAnt_ErroresSDTCollection = aP0;
      mant_erroresclientearticulocolordp.this.AV8EmprCod = aP1;
      mant_erroresclientearticulocolordp.this.AV5Clicod = aP2;
      mant_erroresclientearticulocolordp.this.AV7ArtCod = aP3;
      mant_erroresclientearticulocolordp.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00502 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV5Clicod), AV7ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14606MCliArtCod = P00502_A14606MCliArtCod[0] ;
         A14604MCliCod = P00502_A14604MCliCod[0] ;
         A14603MCliEmprCo = P00502_A14603MCliEmprCo[0] ;
         A14609MCliColNom = P00502_A14609MCliColNom[0] ;
         A14608MCliColNum = P00502_A14608MCliColNum[0] ;
         A14607MCliArtDsc = P00502_A14607MCliArtDsc[0] ;
         A14605MCliNom = P00502_A14605MCliNom[0] ;
         Gxm1mant_erroresclientearticulocolorsdt = (app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT)new app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1mant_erroresclientearticulocolorsdt, 0);
         Gxm1mant_erroresclientearticulocolorsdt.setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod( A14603MCliEmprCo );
         Gxm1mant_erroresclientearticulocolorsdt.setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod( A14604MCliCod );
         Gxm1mant_erroresclientearticulocolorsdt.setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom( A14605MCliNom );
         Gxm1mant_erroresclientearticulocolorsdt.setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod( A14606MCliArtCod );
         Gxm1mant_erroresclientearticulocolorsdt.setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc( A14607MCliArtDsc );
         Gxm1mant_erroresclientearticulocolorsdt.setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum( A14608MCliColNum );
         Gxm1mant_erroresclientearticulocolorsdt.setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom( A14609MCliColNom );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = mant_erroresclientearticulocolordp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT.class, "MAnt_ErroresClienteArticuloColorSDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00502_A14606MCliArtCod = new String[] {""} ;
      P00502_A14604MCliCod = new int[1] ;
      P00502_A14603MCliEmprCo = new String[] {""} ;
      P00502_A14609MCliColNom = new String[] {""} ;
      P00502_A14608MCliColNum = new int[1] ;
      P00502_A14607MCliArtDsc = new String[] {""} ;
      P00502_A14605MCliNom = new String[] {""} ;
      A14606MCliArtCod = "" ;
      A14603MCliEmprCo = "" ;
      A14609MCliColNom = "" ;
      A14607MCliArtDsc = "" ;
      A14605MCliNom = "" ;
      Gxm1mant_erroresclientearticulocolorsdt = new app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_erroresclientearticulocolordp__default(),
         new Object[] {
             new Object[] {
            P00502_A14606MCliArtCod, P00502_A14604MCliCod, P00502_A14603MCliEmprCo, P00502_A14609MCliColNom, P00502_A14608MCliColNum, P00502_A14607MCliArtDsc, P00502_A14605MCliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV5Clicod ;
   private int A14604MCliCod ;
   private int A14608MCliColNum ;
   private String AV8EmprCod ;
   private String AV7ArtCod ;
   private String scmdbuf ;
   private String A14606MCliArtCod ;
   private String A14603MCliEmprCo ;
   private String A14609MCliColNom ;
   private String A14607MCliArtDsc ;
   private String A14605MCliNom ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00502_A14606MCliArtCod ;
   private int[] P00502_A14604MCliCod ;
   private String[] P00502_A14603MCliEmprCo ;
   private String[] P00502_A14609MCliColNom ;
   private int[] P00502_A14608MCliColNum ;
   private String[] P00502_A14607MCliArtDsc ;
   private String[] P00502_A14605MCliNom ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> AV6MAnt_ErroresSDTCollection ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT> Gxm2rootcol ;
   private app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT Gxm1mant_erroresclientearticulocolorsdt ;
}

final  class mant_erroresclientearticulocolordp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00502", "SELECT DISTINCT MCliArtCod, MCliCod, MCliEmprCo, MCliColNom, MCliColNum, MCliArtDsc, MCliNom FROM MCli WHERE (MCliEmprCo = ?) AND (MCliCod = ?) AND (MCliArtCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

