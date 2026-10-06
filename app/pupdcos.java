package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdcos extends GXProcedure
{
   public pupdcos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdcos.class ), "" );
   }

   public pupdcos( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 )
   {
      pupdcos.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pupdcos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdcos.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pupdcos.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pupdcos.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pupdcos.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pupdcos.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pupdcos.this.AV8ForCosForm = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pupdcos.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      pupdcos.this.A396EmprCod = GXv_char2[0] ;
      pupdcos.this.AV10EmprNom = GXv_char3[0] ;
      pupdcos.this.AV11UsurCod = GXv_char4[0] ;
      AV13ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV13ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV13ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV13ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV13ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso ...", ""));
      AV13ProgressIndicator.show();
      AV14CantidadRegistrosAProcesar = (short)(1) ;
      AV16CantidadRegistrosProcesados = (short)(1) ;
      AV12inc_obs = "" ;
      /* Using cursor P019H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4380ForCosForm = P019H2_A4380ForCosForm[0] ;
         n4380ForCosForm = P019H2_n4380ForCosForm[0] ;
         AV12inc_obs = httpContext.getMessage( "Formula actualizada, Cliente-Articulo-Color-Numero-Tc ", "") + GXutil.str( A252CliCod, 6, 0) + "-" + A494ForSer + "-" + A482ForColNom + "-" + GXutil.str( A483ForColNum, 6, 0) + "-" + GXutil.str( A831TipColCod, 2, 0) + GXutil.newLine( ) ;
         AV12inc_obs += httpContext.getMessage( "Calculo Coste Color= ", "") + GXutil.trim( GXutil.str( A4380ForCosForm, 11, 5)) + httpContext.getMessage( " se actualiza con ", "") + GXutil.trim( GXutil.str( AV8ForCosForm, 11, 5)) ;
         A4380ForCosForm = AV8ForCosForm ;
         n4380ForCosForm = false ;
         AV16CantidadRegistrosProcesados = (short)(AV16CantidadRegistrosProcesados+1) ;
         AV15Porcentaje = (short)((AV16CantidadRegistrosProcesados/ (double) (AV14CantidadRegistrosAProcesar))*100) ;
         AV13ProgressIndicator.setgxTv_SdtProgress_Value( AV15Porcentaje );
         AV13ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4-%5-%6-%7).", ""), GXutil.trim( GXutil.str( AV16CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV14CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), GXutil.trim( A494ForSer), GXutil.trim( A482ForColNom), GXutil.trim( GXutil.str( A483ForColNum, 6, 0)), GXutil.trim( GXutil.str( A831TipColCod, 2, 0)), "", ""));
         /* Using cursor P019H3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV12inc_obs, "") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV11UsurCod, AV9Station, AV12inc_obs, 99999999, (byte)(0), "") ;
      }
      AV13ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV13ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV13ProgressIndicator.hide();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdcos.this.A396EmprCod;
      this.aP1[0] = pupdcos.this.A252CliCod;
      this.aP2[0] = pupdcos.this.A494ForSer;
      this.aP3[0] = pupdcos.this.A482ForColNom;
      this.aP4[0] = pupdcos.this.A483ForColNum;
      this.aP5[0] = pupdcos.this.A831TipColCod;
      this.aP6[0] = pupdcos.this.AV8ForCosForm;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdcos");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV10EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV11UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV13ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV12inc_obs = "" ;
      scmdbuf = "" ;
      P019H2_A396EmprCod = new String[] {""} ;
      P019H2_A252CliCod = new int[1] ;
      P019H2_A494ForSer = new String[] {""} ;
      P019H2_A482ForColNom = new String[] {""} ;
      P019H2_A483ForColNum = new int[1] ;
      P019H2_A831TipColCod = new byte[1] ;
      P019H2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019H2_n4380ForCosForm = new boolean[] {false} ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      AV20Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdcos__default(),
         new Object[] {
             new Object[] {
            P019H2_A396EmprCod, P019H2_A252CliCod, P019H2_A494ForSer, P019H2_A482ForColNom, P019H2_A483ForColNum, P019H2_A831TipColCod, P019H2_A4380ForCosForm, P019H2_n4380ForCosForm
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PUPDCOS" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PUPDCOS" ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short AV14CantidadRegistrosAProcesar ;
   private short AV16CantidadRegistrosProcesados ;
   private short AV15Porcentaje ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV8ForCosForm ;
   private java.math.BigDecimal A4380ForCosForm ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV9Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV10EmprNom ;
   private String GXv_char3[] ;
   private String AV11UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String AV20Pgmname ;
   private boolean n4380ForCosForm ;
   private String AV12inc_obs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV13ProgressIndicator ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P019H2_A396EmprCod ;
   private int[] P019H2_A252CliCod ;
   private String[] P019H2_A494ForSer ;
   private String[] P019H2_A482ForColNom ;
   private int[] P019H2_A483ForColNum ;
   private byte[] P019H2_A831TipColCod ;
   private java.math.BigDecimal[] P019H2_A4380ForCosForm ;
   private boolean[] P019H2_n4380ForCosForm ;
}

final  class pupdcos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019H2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForCosForm FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P019H3", "UPDATE TXPCFORMU SET ForCosForm=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

